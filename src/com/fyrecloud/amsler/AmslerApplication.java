package com.fyrecloud.amsler;

import java.util.Iterator;
import java.util.Vector;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import com.fyrecloud.mysql.LogEventPacket;
import com.fyrecloud.mysql.QueryLogEventPacket;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * This class will preserve useful application state as the user navigates
 * from Activity to Activity.  It will essentially serve as the "controller"
 * of the application, as in MVC.
 *
 * The buttons to view and reset the preferences, as well as the
 * About button can be invoked at any time w/o regards to any 
 * application state.  In addition, the local SQLite db can be
 * reset at any time, also w/o regard to any application state.
 * 
 * However, there is a core group of database functions that only
 * enabled according to application state, according to the following 
 * state chart:
 * 
 *                                Fresh   Init  Download
 *                               Install SQLite Snapshot
 * Initialize Device SQLite db     Y       Y      Y
 * Download Snapshot               N       Y      N
 * Start Synchronization           N       Y      Y
 * SQLite Explorer                 N       Y      N/A
 *
 * 1. As mentioned earlier, the device SQLite db may at any time
 *    be initialized.  This is the necessary starting point.
 *
 * 2. The initial snapshot can only be downloaded after the device
 *    SQLite db is initialized, but before synchronization starts.
 * 
 * 3. Synchronization can only happen after the snapshot has
 *    been downloaded.
 * 
 * 4. The SQLite Explorer cannot see anything until the device SQLite
 *    db has been initialized and is thus unavailable.  But afterwards
 *    the explorer is enabled.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class AmslerApplication extends Application {

	/**
	 * This object is generally useful as we need to create, open, and delete 
	 * the SQLite database that this app uses.
	 */
	public DBHelper dbHelper = new DBHelper(this);

	/**
	 * We will spend a lot of effort dealing with the "managed" preferences.
	 * These are the preferences that are managed using PreferenceActivity
	 */
	private SharedPreferences managedPrefs;

	/**
	 * This member will stor a log of incoming events. It is meant to 
	 * be shared between the DownloadSnapshot and Synchronize activities.
	 */
	public Vector<LogEntry> replicationEvents;

	/**
	 * Need this in order to inform it that there are new replication
	 * events and thus it needs to refresh its UI.
	 */
	public Synchronize synchronizeActivity;

	public void onCreate() {
		super.onCreate();

		// 1. Open the sqlite db, creating it if necessary
		dbHelper.open();

		managedPrefs  = PreferenceManager.getDefaultSharedPreferences(this);
	}

	/**
	 * @return int The log position 
	 */
	public int getLogPosition() {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

		//boolean b = prefs.getBoolean(getString(R.string.pref_is_fresh_install_key), false);
		String  s = prefs.getString(getString(R.string.pref_binlog_position_key), "");
		int i = new Integer(s).intValue();
		//String s = getString(R.string.pref_binlog_position_key);
		//Object o = prefs.getInt(s, 0);
		//prefs.getInt(key, defValue)
		//return prefs.getInt(getString(R.string.pref_binlog_position_key), 4);
		return i;
	}

	/**
	 * @return int The MySQL replication server id for the device 
	 */
	public int getServerID() {
		//SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		//return prefs.getInt(getString(R.string.pref_binlog_position_key), 4);
		return 100;
	}

	/**
	 * This method will deal with replication events as they arrive from
	 * the Master Server.
	 */
	public void handleReplicationEvent(LogEventPacket lep) {

		SharedPreferences.Editor editor = managedPrefs.edit();

		if ( ((int)lep.event_type[0]) == LogEventPacket.QUERY_EVENT) {

			// This is a QUERY_EVENT so process the query

			// 1. Determine what the mysql query is
			QueryLogEventPacket q = (QueryLogEventPacket)lep;
			String mySQLs = new String(q.query);

			// 2. Log this MySQL command
			this.synchronizeActivity.invalidateView(
				new LogEntry(mySQLs, LogEntry.MYSQL)
			);

			// 3. Now feed it to lex and parse and get the AST for the query
			CharStream mySQLcs = new ANTLRStringStream(mySQLs);

			try {
				MySQLConnectLexer lex = new MySQLConnectLexer(mySQLcs);
				CommonTokenStream tokens = new CommonTokenStream(lex);
				MySQLConnectParser parser = new MySQLConnectParser(tokens);
				MySQLConnectParser.script_return r = parser.script();

				// 4. Use this AST to obtain one or more SQLite commands
				//    that do the same thing.
				Vector<String> sqlites = this.translateSQL( (Tree) r.tree );

				// 5. Now iterator over all SQLite commands, if any,
				//    and execute them against the sqlite db
				Iterator<String> is = sqlites.iterator();
				while(is.hasNext()) {
					String s = is.next();
					dbHelper.getDatabase().execSQL(s);
					//this.replicationEvents.add(mySQLs);
					this.synchronizeActivity.invalidateView(
						new LogEntry(mySQLs, LogEntry.SQLITE)
					);
					//publishProgress(s);
				}
			} catch(Exception ignore) {
				System.out.println(ignore.getStackTrace());
			}

			// 5. Log the SQLite commands
			//this.replicationEvents.add(s);
			//this.synchronizeActivity.invalidateView(s);

		}

		// If sync is started and there are no new changes, then the software returns
		// a LogEventPacket of type 15 (FORMAT ???) with master_position == 0.  Interpret
		// this to mean no changes available and therefore do not write master_position = 0
		// to preferences
		if (lep.master_position > 0) {
			editor.putString(getString(R.string.pref_binlog_position_key), Long.toString(lep.master_position));
			editor.commit();
		}
	}

	// TODO: Finish this
	public boolean masterServerChannelIsTerminated() {
		return false;
	}

	/**
	 * Reset the Local preferences, the ones managed by the 
	 * Preferences activity,vto their default values.
	 */
	public void resetLocalPreferences() {

		// This clears the existing preferences
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		SharedPreferences.Editor editor = prefs.edit();
		editor.clear();
		editor.commit();

		// This enables setting them to their defaults
		PreferenceManager.setDefaultValues(this, R.xml.preferences, true);

	}

	/**
	 * Is the state of the application freshInstall?
	 */
	public boolean isFreshInstall() {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		return prefs.getBoolean(getString(R.string.pref_is_fresh_install_key), false);
	}

	/**
	 * Is the state of the application SQLite Initialized?
	 */
	public boolean isSQLiteInitialized() {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		return prefs.getBoolean(getString(R.string.pref_is_sqlite_init_key), false);
	}

	/**
	 * Has the snapshot been downloaded?
	 */
	public boolean isSnapshotDownloaded() {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		return prefs.getBoolean(getString(R.string.pref_is_snapshot_downloaded_key), false);
	}

	/**
	 * Set the value of the given boolean preference
	 * @param String p The preference key
	 * @param boolean b The new value of the preference
	 */
	public void setBooleanPreference(String p, boolean b) {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		SharedPreferences.Editor editor = prefs.edit();
		editor.putBoolean(p, b);
		editor.commit();
	}

	/**
	 * Should the snapshot button be enabled?
	 * @return boolean 
	 */
	public boolean isSnapshotButtonEnabled() {
		boolean b1 = isFreshInstall();
		boolean b2 = isSQLiteInitialized();
		boolean b3 = isSnapshotDownloaded();
		return ( !b1 && b2 && !b3);
	}

	/**
	 * Should the start synchronization button be enabled?
	 * @return boolean 
	 */
	public boolean isStartSynchronizationButtonEnabled() {
		boolean b1 = isFreshInstall();
		boolean b2 = isSQLiteInitialized();
		boolean b3 = isSnapshotDownloaded();
		return ( !b1 && b2 && b3);
	}

	/**
	 * Should the sqlite explorer button be enabled?
	 * @return boolean 
	 */
	public boolean isSQLiteExplorerButtonEnabled() {
		boolean b1 = isFreshInstall();
		boolean b2 = isSQLiteInitialized();
		//boolean b3 = isSnapshotDownloaded();
		return ( !b1 && b2);
	}

	/**
	 * Translate an AST containing one a single MySQL statement and
	 * return a collection of corresponding SQLite commands.  It's 
	 * necessary to be able to return a collection because a single MySQL
	 * INSERT command may insert more than one row per command, whereas
	 * SQLite can only insert one row per command.  Therefore we will 
	 * need to produce a collection of SQLite commands to do that.
	 * There are possibly other examples.
	 *
	 * @param Tree theTree The AST containing the single MySQL command
	 * as produced by the parser.  When processing the snapshot the parser
	 * will produce an AST that contains numerous subtrees for the various
	 * MySQL commands it uses.  Traversing this tree and picking out the
	 * individual subtrees is the responsibility of the caller of this method.
	 *
	 * @return Vector<String> SQLite SQL
	 */
	public Vector<String> translateSQL(Tree theTree) {

		Vector<String> retVal = new Vector<String>();

		try {

			//Tree t2 = t.getChild(i);
			Tree commandTree = theTree;
			int commandTreeNodeCnt = commandTree.getChildCount();
			//logger(i+":"+cnt2+":"+t2.toStringTree());

			// If this child is a tree, maybe it's an SQL statement
			// OR if we are expecting only a single command
			// then it _is_ an SQL statement
			//if (cnt2>0 || ! fMultiCommand) {

				String c1 = commandTree.toString();
				//String c2 = t2.toStringTree();
				// not needed for INSERT command

				if (c1.equals("CREATE")) {
					String c3 = build_sqlite_stmt(commandTree);
					c3 = c3.replace("int ( 11 )", "INTEGER");
					retVal.add(c3);
				} else if (c1.equals("DROP")) {
					//database.execSQL(c3);
					//System.out.println("DROP!");
					//publishProgress(c3);
					String c3 = build_sqlite_stmt(commandTree);
					retVal.add(c3);
				} else if (c1.equals("INSERT")) {

					// 1. An INSERT command from MySQL may have many value items
					//    in a row.  We need to emit one SQLite command per value item.
					StringBuilder insert_base = new StringBuilder();
					insert_base.append("INSERT INTO ");
					String table_name = commandTree.getChild(0).toString();
					insert_base.append(table_name);

					// 2. The command will have a list of values to insert
					//    It may optionally have a list of column names as well.
					//    If the command tree only has two nodes, then node(1)
					//    is the list of values.  If the tree has three nodes, 
					//    then node(1) and (2) are column_names and values.
					//    Each list should have the same number of elements.
					Tree columnNamesTree;
					String columnNamesString = "";

					Tree valueItemsTree;
					//String valueItemsString  = "";

					// Assume only 2 or 3 nodes
					if (commandTreeNodeCnt == 2) {
						valueItemsTree    = commandTree.getChild(1);
					} else {
						columnNamesTree   = commandTree.getChild(1);
						columnNamesString = " (" + buildListFromTree(columnNamesTree) + ") ";
						insert_base.append(columnNamesString);
						valueItemsTree    = commandTree.getChild(2);
					}

					insert_base.append(" VALUES ");

					// 3. Now iterate over all the value items and emit one insert stmt
					//    for each one
					int valueItemCnt = valueItemsTree.getChildCount();	// it has these expr_lists
					//System.out.println(i+":"+cnt3+":"+t3.toStringTree());
					// for each expr_list make one new insert
					for (int i3 = 0; i3 < valueItemCnt; i3++) {
						StringBuilder insert_tail = new StringBuilder();

						insert_tail.append(" ("+buildListFromTree(valueItemsTree.getChild(i3))+");");

						//insert_tail.append(" (");
						//Tree expr_list = valueItemsTree.getChild(i3);
						//int cntexpr = expr_list.getChildCount();
						//System.out.println(i3+":"+cntexpr+":"+expr_list.toStringTree());
						// Now loop through every expression item
						//for (int i4 = 0; i4 < cntexpr; i4++) {
						//Tree expr = expr_list.getChild(i4);
						//if (i4 > 0) insert_tail.append(", ");
						//insert_tail.append(expr.toString());
						//}
						//insert_tail.append(");");
						StringBuilder insert_complete = new StringBuilder();
						insert_complete.append(insert_base);
						insert_complete.append(insert_tail);
						//database.execSQL(insert_complete.toString());
						retVal.add(insert_complete.toString());
						//publishProgress(insert_complete.toString());
					} // for i3

				} // if c1 equals some sql stmt

			//} // cnt2 > 0

		} catch(Exception e) {
			System.out.println("exception");
		}

		// Empty means no SQL found
		return retVal;
	}

	/**
	 * @param Tree tree Given a tree containing a list of SQL elements
	 * such as a list of column names or values, iterate over the tree
	 * and build a list of the items.
	 * @return String the list of items.
	 */
	private String buildListFromTree(Tree tree) {
		StringBuilder retVal = new StringBuilder();

		int elementCount = tree.getChildCount();
		// Now iterate over every element
		for (int i = 0; i < elementCount; i++) {
			Tree expr = tree.getChild(i);
			if (i > 0) retVal.append(", ");
			retVal.append(expr.toString());
		}

		return retVal.toString();
	}

	/**
	 * @param Tree t1 Given a tree representing an SQL statement,
	 * build a String containing the same SQL expression.
	 * @return String the above built SQL expression.
	 */
	private String build_sqlite_stmt(Tree t1) {
		StringBuilder sb = new StringBuilder();
		sb.append(t1.toString()+" ");
		int cnt = t1.getChildCount();
		for (int i = 0; i < cnt; i++) { 
			Tree t2 = t1.getChild(i);
			sb.append(t2.toString()+" ");
		}

		return sb.toString();
	}

}