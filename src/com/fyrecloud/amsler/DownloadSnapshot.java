package com.fyrecloud.amsler;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Vector;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ListView;

/**
 *
 * This class is the activity that will download the beginning
 * snapshot.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class DownloadSnapshot extends AmslerActivity {

	/**
	 * This object is generally useful as we need to create, open, and delete 
	 * the SQLite database that this app uses.
	 */
	//private DBHelper dbHelper = new DBHelper(this);

	/**
	 * This is the adapter that connects the data structure
	 * of replication events to the UI
	 */
	ReplicationEventsAdapter rea;

	/**
	 * Callback 1 of 7 of the Activity lifecycle
	 * Lifecycle loop 1, "entire lifetime" from onCreate to onDestroy
	 * Setup all global state
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.download_snapshot);

		// 1. Open the sqlite db, creating it if necessary
		//dbHelper.open();

		// 2. Setup the Replication Event monitor
		ListView lvInteractions = (ListView) findViewById(R.id.lvDownloadSnapshotStatus);
		rea = new ReplicationEventsAdapter(this);
		theController.replicationEvents = new Vector<LogEntry>();
		rea.DI(theController.replicationEvents);
		lvInteractions.setAdapter(rea);

		// 3. Now start reading the snapshot
		download_snapshot();

	}

	/**
	 * Callback 2 of 7 of the Activity lifecycle
	 * Lifecycle loop 2, "visible lifetime" from onStart to onStop
	 */
	//@Override
	//protected void onStart() {super.onStart();}

	/**
	 * Callback 3 of 7 of the Activity lifecycle
	 * Lifecycle loop 3, "foreground lifetime" from onResume to onPause
	 * Activity state now = active aka running
	 */
	//@Override
	//protected void onResume() {super.onResume();}

	/**
	 * Callback 4 of 7 of the Activity lifecycle
	 * Lifecycle loop 3, "foreground lifetime" from onResume to onPause
	 * commit unsaved changes to persistent data,
	 * Activity state now = paused
	 */
	//@Override
	//protected void onPause() {super.onPause();}

	/**
	 * Callback 5 of 7 of the Activity lifecycle
	 * Lifecycle loop 2, "visible lifetime" from onStart to onStop
	 * Activity state now = stopped
	 */
	//@Override
	//protected void onStop() {super.onStop();}

	/**
	 * Callback 6 of 7 of the Activity lifecycle
	 * Lifecycle loop 1, "entire lifetime" from onCreate to onDestroy
	 * Release any resources
	 */
	//@Override
	//protected void onDestroy() {
		//super.onDestroy();
		//dbHelper.close();
	//}

	/**
	 * Callback 7 of 7 of the Activity lifecycle
	 */
	//@Override
	//protected void onRestart() {super.onRestart();}

	private void download_snapshot() {

		new AsyncTask<Void, LogEntry, Void>() {

			protected Void doInBackground(Void... v) {

				// 1. First get the SQLite database to work on
				SQLiteDatabase database = theController.dbHelper.getDatabase();

				// 2. Now read and parse the snapshot and execute the appropriate SQLite commands
				try {
					// 2.1 Open a stream on the URL that contains the snapshot
					SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
					String snapShotURL = prefs.getString(getString(R.string.pref_snapshot_url_key), "");
					publishProgress(
						new LogEntry(
							"Connecting to "+snapShotURL,
							LogEntry.MYSQL
						)
					);

					URL snapShotRequestURL = new URL(snapShotURL);
					URLConnection snapShotConnection = snapShotRequestURL.openConnection();
					InputStream response = snapShotConnection.getInputStream();
					CharStream snapShotCharStream = new ANTLRInputStream(response);

					// 2.2 Lex and parse
					MySQLConnectLexer lex = new MySQLConnectLexer(snapShotCharStream);
					CommonTokenStream tokens = new CommonTokenStream(lex);
					MySQLConnectParser parser = new MySQLConnectParser(tokens);
					MySQLConnectParser.script_return r = parser.script();

					// 2.3 Now iterate through the tree and execute each SQLite command
					Tree t = (Tree)r.tree;
					int cnt1 = t.getChildCount();
					for (int i = 0; i < cnt1; i++) {

						Tree mySQLCommandTree = t.getChild(i);
						int mySQLCommandNodeCnt = mySQLCommandTree.getChildCount();
						publishProgress(
							new LogEntry(
								i+":"+mySQLCommandTree.toStringTree(),
								LogEntry.MYSQL
							)
						);

						// If the command has child nodes, then it's an SQL command.
						if (mySQLCommandNodeCnt>0) {

							Vector<String> sqlites = theController.translateSQL(mySQLCommandTree);
							// Now iterator over all SQLite commands, if any,
							// and execute them against the sqlite db
							Iterator<String> is = sqlites.iterator();
							while(is.hasNext()) {
								String s = is.next();
								database.execSQL(s);
								publishProgress(new LogEntry(s, LogEntry.SQLITE) );
							}

						}

					} // for i

				} catch(Exception e) {
					System.out.println("exception");
				}

				// Finished! Set the preference to say so
				AmslerApplication theController = (AmslerApplication)getApplication();
				theController.setBooleanPreference(getString(R.string.pref_is_snapshot_downloaded_key), true);

				return null;

			}

			protected void onProgressUpdate(LogEntry... progress) {
				theController.replicationEvents.add(progress[0]);
				rea.notifyDataSetChanged();
			}

			protected void onPostExecute(Void v) {}

		}.execute();

	}

	/**
	 * @param Tree t1 Given a tree representing an SQL statement,
	 * build a String containing the same SQL expression.
	 * @return String the above built SQL expression.
	 */
/*	private String build_sqlite_stmt(Tree t1) {
		StringBuilder sb = new StringBuilder();
		sb.append(t1.toString()+" ");
		int cnt = t1.getChildCount();
		for (int i = 0; i < cnt; i++) { 
			Tree t2 = t1.getChild(i);
			sb.append(t2.toString()+" ");
		}

		return sb.toString();
	}*/

}