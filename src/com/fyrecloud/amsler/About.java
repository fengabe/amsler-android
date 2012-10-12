package com.fyrecloud.amsler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *
 * This class is the about box.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class About extends Activity {

	/**
	 * Callback 1 of 7 of the Activity lifecycle
	 * Lifecycle loop 1, "entire lifetime" from onCreate to onDestroy
	 * Setup all global state
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);

		// 1. Hook the fyrecloud.com button
		((Button) findViewById(R.id.btnFyrecloud)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					String   url = "http://fyrecloud.com";
					Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse(url));
					try {
						startActivity(viewIntent);  
					} catch(Exception ignore) {
					}
				}
			}
		);

		// 2. Hook the send email button
		((Button)findViewById(R.id.btnSendEmail)).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view){
					Intent i = new Intent(Intent.ACTION_SEND);
					i.setType("text/plain");
					i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"fyreman@fyrecloud.com"});
					i.putExtra(Intent.EXTRA_SUBJECT, "Regarding Amsler");
					i.putExtra(Intent.EXTRA_TEXT   , "body of email");
					try {
						startActivity(Intent.createChooser(i, "Send mail..."));
					} catch (android.content.ActivityNotFoundException ex) {
						Toast.makeText(About.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
					}
				}
			}
		);

	}

}