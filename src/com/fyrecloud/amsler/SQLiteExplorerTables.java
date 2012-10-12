package com.fyrecloud.amsler;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

/**
 *
 * This class is the main Activity for the SQLiteExplorer and is the starting point
 * for the user to examine the list of available tables and click through to further
 * for the tables.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class SQLiteExplorerTables extends AmslerActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.sqlite_explorer_tables);

		// 1. Now setup the cursor adapter so that we can see the tables
		//    In the UI.
		Cursor c = theController.dbHelper.getTables();
		final ListAdapter tableListAdapter = new SimpleCursorAdapter(this,R.layout.sqlite_explorer_tables_tile,c,new String[]{"_id"},new int[]{R.id.lblTableName});
		ListView lv = ((ListView)findViewById(R.id.lvShowTables));
		lv.setAdapter(tableListAdapter);

		// 2. When the user clicks on a particular table in the list,
		//    launch the SQLiteExplorerRows activity
		lv.setOnItemClickListener(
			new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

					SQLiteCursor c = (SQLiteCursor) tableListAdapter.getItem(position);
					c.moveToPosition(position);
					String table_name = c.getString(0);

					// Now proceed to the rows
					Intent myIntent = new Intent();
					myIntent.setClassName("com.fyrecloud.amsler", "com.fyrecloud.amsler.SQLiteExplorerRows");
					myIntent.setAction(Intent.ACTION_MAIN);
					myIntent.putExtra("com.fyrecloud.amsler.table_name",table_name);
					startActivity(myIntent);

				}
			}
		);

	}

	// TODO: Deal with the lifecycle!
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