package com.fyrecloud.amsler;

import com.fyrecloud.amsler.R;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;

/**
 * @author http://stackoverflow.com/questions/531427/how-do-i-display-the-current-value-of-an-android-preference-in-the-preference-su
 *
 * An ordinary PreferenceActivity will display the name of the various preferences
 * as well as a descriptive label.  However, it will not display any actual preference
 * value.  This class modifies that behavior so that the preference
 * value will be displayed instead of general descriptive text.
 */
public class Preferences extends PreferenceActivity implements OnSharedPreferenceChangeListener {

	/**
	 * Callback 1 of 7 of the Activity lifecycle
	 * Lifecycle loop 1, "entire lifetime" from onCreate to onDestroy
	 * Setup all global state
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		PreferenceManager.setDefaultValues(Preferences.this, R.xml.preferences, false);
		for(int i=0;i<getPreferenceScreen().getPreferenceCount();i++){
			initSummary(getPreferenceScreen().getPreference(i));
		}
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
	 * 
	 */
	@Override
	protected void onResume() {
		super.onResume();
		// Set up a listener whenever a key changes 
		getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
	}

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
	@Override
	protected void onStop() {
		super.onStop();
		// Unregister the listener whenever a key changes 
		getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this); 
	}

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
	 * Whenever a preference is changed, update whatever needs updating, such as the UI
	 */
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) { 
		updatePrefSummary(findPreference(key));
	}

	/**
	 * This method will initialize the preference summary using preference values.
	 * 
	 * @param p Which preference to initialize?  Given the preference we can determine the value.
	 */
	private void initSummary(Preference p){
		if (p instanceof PreferenceCategory){
			PreferenceCategory pCat = (PreferenceCategory)p;
			for(int i=0;i<pCat.getPreferenceCount();i++){
				initSummary(pCat.getPreference(i));
			}
		}else{
			updatePrefSummary(p);
		}
	}

	/**
	 * This method will update the preference summary using the new preference value.
	 * Given the preference we can determine the value.
	 * 
	 * @param p Which preference to update?
	 */
	private void updatePrefSummary(Preference p){
		if (p instanceof ListPreference) {
			ListPreference listPref = (ListPreference) p; 
			p.setSummary(listPref.getEntry()); 
		}
		if (p instanceof EditTextPreference) {
			EditTextPreference editTextPref = (EditTextPreference) p; 
			p.setSummary(editTextPref.getText()); 
		}
	}

}