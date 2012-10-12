package com.fyrecloud.amsler;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * This class is generally useful for creating, opening, versioning, and deleting an
 * an SQLite database.  Any Android Activity that wishes to perform these operations on
 * an SQLite database will be very happy to have an instance of this class to work with.
 * 
 * Objects of this type are created by calling the ctor. No need for any factories.
 * 
 * This class requires an Android Context.  Any Android code that has one, not merely Activities,
 * can use this class.
 * 
 * The SQLite db can be examined from the command line thus:
 * adb -s 000000000000 shell
 *  sqlite3 data/data/com.fyrecloud.amsler/databases/amsler
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 */
public class DBHelper extends SQLiteOpenHelper {

	/**
	 * Even dogs need names.
	 */
	private static final String DATABASE_NAME = "amsler";

	/**
	 * Android SQLite provides a method of versioning the db schema.  We must
	 * have this defined in order to keep the super ctor happy.  However, this
	 * app does versioning via replication and will not use this feature.
	 */
	private static final int DATABASE_VERSION = 1;

	/**
	 * The super ctor and the delete database method need this context.
	 */
	private Context context;

	/**
	 * This is the actual database object
	 */
	private SQLiteDatabase database;

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.context = context;
	}

	/**
	 * This method is called when the db is created and is required in order
	 * to sublcass from SQLiteOpenHelper.
	 * 
	 * This would be a good place for to create and populate tables.  However, this
	 * app does all of this via replication elsewhere.  We need this method but we do
	 * not use it.
	 */
	@Override
	public void onCreate(SQLiteDatabase database) {
		Log.i("amsler","DBHelper.onCreate");
	}

	/**
	 * This method is called when the db schema is upgraded and is required in order
	 * to subclass from SQLiteOpenHelper.
	 * 
	 * This app deals with upgrades via replication elsewhere.  We need this method but we
	 * do not use it.
	 */
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {}

	/**
	 * Open open a read/write database.  Create it if necessary.
	 * @throws SQLException
	 */
	public void open() throws SQLException {
		Log.i("amsler","DBHelper.open");
		database = getWritableDatabase();
	}

	public void deleteDatabase() {
		Log.i("amsler","DBHelper.deleteDatabase");
		context.deleteDatabase(DATABASE_NAME);
	}

	public SQLiteDatabase getDatabase() {return database;}

	/**
	 * @return a Cursor on the collection of tables for this database.
	 */
	public Cursor getTables() {
		return database.rawQuery("select name as _id from sqlite_master where type='table'", null);
	}

	/**
	 * @return a Cursor on the collection of row for a given table
	 * 
	 */
	public Cursor getRows(String table_name) {
		return database.rawQuery("select *, id as _id from "+table_name, null);
	}
}