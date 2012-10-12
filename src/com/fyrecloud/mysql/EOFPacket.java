package com.fyrecloud.mysql;

import android.util.Log;

/**
 * A short packet only has a single 0xfe byte as the message.
 * 
 * @author Thomas Radloff
 *
 */
public class EOFPacket extends MySQLPacket {

	/**
	 * It's useful to have a no arg ctor so that we can instantiate first
	 * and fill in the blanks later.
	 */
	public EOFPacket() {}

	public EOFPacket(MySQLPacket sourcePacket) {
		super(sourcePacket);
		decode();
	}

	private void decode() {
		// Nothing more to decode!
		Log.i("MySQL","finish EOFPacket.decode");
	}

}