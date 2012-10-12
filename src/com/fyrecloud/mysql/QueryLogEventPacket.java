package com.fyrecloud.mysql;

import android.util.Log;

/**
 * @author Thomas Radloff
 *
 */
public class QueryLogEventPacket extends LogEventPacket {

	/**
	 * Post-Header
	 * 1 byte integer
	 * The length of the name of the currently selected database.
	 */
	//byte[] db_len = new byte[1];
	int db_len;

	/**
	 * Post-Header
	 * 2 byte unsigned integer
	 * The length of the status_vars block of the Body, in bytes. See
	 * @ref query_log_event_status_vars.
	 */
	//byte[] status_vars_len = new byte[2];
	int status_vars_len;

	/**
	 * Body
	 * db_len + 1
	 * The currently selected database, as a null-terminated string.
	 * (The trailing zero is redundant since the length is already known;
	 * it is db_len from Post-Header.)
	 */
	byte[] db;

	/**
	 * Variable length string without trailing zero, extending to the
	 * end of the event (determined by the length field of the
	 * Common-Header)
	 */
	public byte[] query;

	//public QueryLogEventPacket() {}
	public QueryLogEventPacket(LogEventPacket sourcePacket) {
		super(sourcePacket);
		decodePostHeader();
		decodeBody();
	}

	public void decodePostHeader() {

		int idx = 0;
		byte[] buffer; // used to convert from byte[] to integers

		// Skip some fields
		idx += 4; // slave_proxy_id
		idx += 4; // exec_time

		// Decode db_len
		buffer = new byte[1];
		System.arraycopy(logEventRemainingBytes, idx, buffer, 0, buffer.length);
		db_len = 0;
		for (int i = 0; i < buffer.length; i++)
			db_len += (buffer[i] & 0xff) << (8 * i);
		idx += buffer.length; // status_vars_len The len of the status_vars block of the Body
		//idx += buffer.length; // db_len (len of currently selected database name)

		idx += 2; // error code

		// Decode status_vars_len
		buffer = new byte[2];
		System.arraycopy(logEventRemainingBytes, idx, buffer, 0, buffer.length);
		status_vars_len = 0;
		for (int i = 0; i < buffer.length; i++)
			status_vars_len += (buffer[i] & 0xff) << (8 * i);
		idx += buffer.length; // status_vars_len The len of the status_vars block of the Body

		// Now update remaining bytes
		int len = logEventRemainingBytes.length - idx;
		byte[] newRemainingBytes = new byte[len];
		System.arraycopy(logEventRemainingBytes, idx, newRemainingBytes, 0, len);
		logEventRemainingBytes = newRemainingBytes;

		Log.i("MySQL","finish QueryLogEventPacket.decodePostHeader");
	}
	public void decodeBody() {

		int idx = 0;

		// Zero or more status variables
		idx += status_vars_len;

		// Currently selected db as null terminated string
		idx += db_len;
		idx ++;	// skip the zero

		// The remainder is the query
		int len = logEventRemainingBytes.length - idx;
		query = new byte[len];
		System.arraycopy(logEventRemainingBytes, idx, query, 0, len);

		// Check that idx = len of remaining bytes

		String s = new String(query);
		Log.i("MySQL","finish QueryLogEventPacket.decodeBody q="+s);
	}

}