package com.fyrecloud.amsler;

import android.app.Activity;
import android.os.Bundle;

/**
 * Many of the activities in this application share common functionality.
 * Therefore they subclass from this superclass.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 */
public class AmslerActivity extends Activity {

	/**
	 * The application aka controller should be available to every subclass.
	 */
	protected AmslerApplication theController;

	/**
	 * Android will call the onCreate(Bundle) method for each of the subclasses.
	 * They will in term call this method.  Although similarly named, notice the 
	 * extra parameter.
	 * 
	 * @param savedInstanceState
	 * @param layoutResID - Which layout should the subclass use?
	 */
	protected void onCreate(Bundle savedInstanceState, int layoutResID) {
		super.onCreate(savedInstanceState);
		setContentView(layoutResID);

		theController = (AmslerApplication)getApplication();

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
	//protected void onDestroy() {super.onDestroy();}

	/**
	 * Callback 7 of 7 of the Activity lifecycle
	 */
	//@Override
	//protected void onRestart() {super.onRestart();}

}