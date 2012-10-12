package com.fyrecloud.amsler;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *
 * This class is the main Activity for this application and
 * is the starting point.  Its purpose is to provide a control
 * panel to demonstrate replication between a MySQL database
 * and an SQLite db on the device.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class Home extends AmslerActivity {

	/**
	 * This is the "controller" for the app.
	 */
	//AmslerApplication theController;

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
		super.onCreate(savedInstanceState, R.layout.home);

		theController = (AmslerApplication)getApplication();

		// 1. If there are any user-set preferences that have not been initialized
		//    to any value, initialize them to their defaults now.  The false param
		//    means to leave untouched any preference that already has a value.
		PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

		// 2. This will open the database, creating it if necessary
		//dbHelper.open();

		// 4. Now hook the buttons

		// 4.1 Hook the preference button
		((Button)findViewById(R.id.btnPreferences)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					startActivity(new Intent(Home.this, Preferences.class));
				}
			}
		);

		// 4.2 Hook the reset preferences button
		((Button)findViewById(R.id.btnResetPreferences)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){

					// 1. Reset the preferences back to the default values
					SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Home.this);
					sp.edit().clear().commit();
					PreferenceManager.setDefaultValues(Home.this, com.fyrecloud.amsler.R.xml.preferences, true);

					// 2. UI feedback
					Toast.makeText(Home.this, getString(R.string.preferences_reset), Toast.LENGTH_LONG).show();
					updateButtonState();
				}
			}
		);

		// 4.3 Hook the brainwipe button
		//     Brainwipe means to delete the SQLite database we already have
		//     and reopen and thus re-create a blank new database.
		//     Note: This will _note_ harm any other SQLite dbs that may or may not
		//     be on the device.
		((Button)findViewById(R.id.btnResetDatabase)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){

					// 1. Do the db
					theController.dbHelper.deleteDatabase();
					theController.dbHelper.open();
					theController.setBooleanPreference(getString(R.string.pref_is_fresh_install_key), false);
					theController.setBooleanPreference(getString(R.string.pref_is_sqlite_init_key), true);
					theController.setBooleanPreference(getString(R.string.pref_is_snapshot_downloaded_key), false);

					// 2. UI feedback
					Toast.makeText(Home.this, getString(R.string.brainwipe_complete), Toast.LENGTH_LONG).show();
					updateButtonState();
				}
			}
		);

		// 4.4 Hook the download snapshot button
		((Button)findViewById(R.id.btnDownloadSnapshot)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					startActivity(new Intent(Home.this, DownloadSnapshot.class));
					// When the user exits this activity, this activity and its buttons
					// will automatically update
				}
			}
		);

		// 4.5 Hook the start sync button
		((Button)findViewById(R.id.btnSynchronize)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					startActivity(new Intent(Home.this, Synchronize.class));
					// When the user exits this activity, this activity and its buttons
					// will automatically update
				}
			}
		);

		// 4.6 Hook the SQLiteExplorer button
		((Button)findViewById(R.id.btnSQLiteExplorer)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					startActivity(new Intent(Home.this, SQLiteExplorerTables.class));
				}
			}
		);

		// 4.7 Hook the about button
		((Button)findViewById(R.id.btnAbout)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					startActivity(new Intent(Home.this, About.class));
				}
			}
		);

		// 5. Now enable or disable various buttons based on the
		//    present application state.

		// 5.1 Set the download snapshot button state
		updateButtonState();

	}

	/**
	 * Various buttons may or may not be enabled, depending upon the state of the app
	 * Enable or disable them now.
	 */
	private void updateButtonState() {
		((Button)findViewById(R.id.btnDownloadSnapshot)).setEnabled(theController.isSnapshotButtonEnabled());
		((Button)findViewById(R.id.btnSynchronize)).setEnabled(theController.isStartSynchronizationButtonEnabled());
		((Button)findViewById(R.id.btnSQLiteExplorer)).setEnabled(theController.isSQLiteExplorerButtonEnabled());
	}

	/**
	 * Callback 2 of 7 of the Activity lifecycle
	 * Lifecycle loop 2, "visible lifetime" from onStart to onStop
	 */
	//@Override
	protected void onStart() {
		super.onStart();
		updateButtonState();
	}

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