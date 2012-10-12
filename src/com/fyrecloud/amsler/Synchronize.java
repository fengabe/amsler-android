package com.fyrecloud.amsler;

import java.util.Vector;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ListView;

/**
 *
 * This class is the Activity that manages and monitors the actual
 * synchronization.
 * 
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 */
public class Synchronize extends AmslerActivity {

	/**
	 * This is the adapter that connects the data structure
	 * of replication events to the UI
	 */
	private ReplicationEventsAdapter rea;

	/**
	 * This Activity will use this Synchronizer in order to deal with
	 * the master server.
	 */
	private Synchronizer synchronizer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.synchronize);

		// 1. Notify the controller of my existence so that I
		//    may receive notification of replication events
		theController.synchronizeActivity = this;

		// 2. Setup the Replication Event monitor
		ListView lvInteractions = (ListView) findViewById(R.id.lvReplicationEvents);
		rea = new ReplicationEventsAdapter(this);
		theController.replicationEvents = new Vector<LogEntry>();
		rea.DI(theController.replicationEvents);
		lvInteractions.setAdapter(rea);


		// 3. Create the Synchronizer object.
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		synchronizer = new Synchronizer(
			theController,
			prefs.getString(getString(R.string.pref_host_key),       "host not found"),
			prefs.getString(getString(R.string.pref_mysql_port_key), "port not found")
		);
		synchronizer.init();
		synchronizer.start();

		// TODO: get rid of this
		// 2. Now hook the start/stop sync button
		//((Button)findViewById(R.id.btnStartStopSynchronization)).setOnClickListener(
			//new View.OnClickListener() {
				//public void onClick(View view){

					// 1. Toggle the state of synchronizing

					// 1.1 Get the present state
					//SharedPreferences prefs = Synchronize.this.getSharedPreferences("com.fyrecloud.amsler", Activity.MODE_PRIVATE);
					//String synchronizing_pref_key = Synchronize.this.getString(R.string.synchronizing_pref_key);
					//boolean syncState = prefs.getBoolean(synchronizing_pref_key, false);

					// 1.2 If synchronization is off, then turn it on, else
					// turn it off.
					//if (syncState) {
						// Presently synchronizing so turn it off
						//synchronizer.stop();
					//} else {
						// Presently not synchronizing so turn it on
						//synchronizer.start();
					//}

					// 1.3 Now update to the reverse state
					//SharedPreferences.Editor editor = prefs.edit();
					//editor.putBoolean(synchronizing_pref_key, !syncState);
					//editor.commit();

					// 1.3 Now update the button label using the new syncState
					//setStartStopSynchronizationLabel();
				//}
			//}
		//);
	}

	// TODO: Deal with the lifecycle!
	/**
	 * Callback 2 of 7 of the Activity lifecycle
	 * Lifecycle loop 2, "visible lifetime" from onStart to onStop
	 */
	//@Override
	//protected void onStart() {
	//super.onStart();
	//setUIContent();
	//setStartStopSynchronizationLabel();
	//}

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
	//protected void onDestroy() {super.onDestroy();}

	/**
	 * Callback 7 of 7 of the Activity lifecycle
	 */
	//@Override
	//protected void onRestart() {super.onRestart();}

	/**
	 * Define what updating this view means
	 */
	public void invalidateView(final LogEntry s) {
		runOnUiThread(
			new Runnable() {
				public void run() {
					theController.replicationEvents.add(s);
					rea.notifyDataSetChanged();
					ListView lvInteractions = (ListView) findViewById(R.id.lvReplicationEvents);
					lvInteractions.setSelection(rea.getCount()-1);
				}
			}
		);
	}
}