package com.fyrecloud.amsler;

import com.fyrecloud.amsler.R;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

/**
 *
 * This class is part of the SQLiteExplorer and will enable the user to examine the list of 
 * available rows for a particular table.  The name of the table is communicated via the Intent
 * that activates this Activity.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 * 

 */
public class SQLiteExplorerRows extends AmslerActivity {

	/**
	 * This object is generally useful as we need to create, open, and delete 
	 * the SQLite database that this app uses.
	 */
	//private DBHelper dbHelper = new DBHelper(this);

	/**
	 * Callback 1 of 7 of the Activity lifecycle
	 * Lifecycle loop 1, "entire lifetime" from onCreate to onDestroy
	 * Setup all global state
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.sqlite_explorer_rows);

		// 1. Open the device SQLite database, creating it if necessary
		//dbHelper.open();

		// 2. Now setup the cursor adapter so that we can see the rows in the UI.
		Intent incomingIntent = getIntent();
		String table_name = incomingIntent.getStringExtra("com.fyrecloud.amsler.table_name");
		Cursor c = theController.dbHelper.getRows(table_name);
		final ListAdapter rowListAdapter = new SimpleCursorAdapter(
			this,
			R.layout.sqlite_explorer_rows_tile,
			c,
			new String[]{"_id","name"},
			new int[]{R.id.lblPrimaryKey, R.id.lblName}
		);
		ListView lv = ((ListView)findViewById(R.id.lvShowRows));
		lv.setAdapter(rowListAdapter);

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

}