package com.fyrecloud.mysql;

import android.util.Log;

/**
 * @author Thomas Radloff
 *
 * A LogEventPacket
 */
public class LogEventPacket extends ResponseOKPacket {

	/**
	 * Log event types
	 */
	public final static int UNKNOWN_EVENT= 0;
	//START_EVENT_V3= 1,
	public final static int QUERY_EVENT= 2;
	//public final static int STOP_EVENT= 3;
	//ROTATE_EVENT= 4,
	public final static int INTVAR_EVENT = 5;
	//LOAD_EVENT= 6,
	//SLAVE_EVENT= 7,
	//CREATE_FILE_EVENT= 8,
	//APPEND_BLOCK_EVENT= 9,
	//EXEC_LOAD_EVENT= 10,
	//DELETE_FILE_EVENT= 11,
	//NEW_LOAD_EVENT= 12,
	//RAND_EVENT= 13,
	//USER_VAR_EVENT= 14,
	public static final int FORMAT_DESCRIPTION_EVENT = 15;
	//XID_EVENT= 16,
	//BEGIN_LOAD_QUERY_EVENT= 17,
	//EXECUTE_LOAD_QUERY_EVENT= 18,
	//TABLE_MAP_EVENT = 19,
	//PRE_GA_WRITE_ROWS_EVENT = 20,
	//PRE_GA_UPDATE_ROWS_EVENT = 21,
	//PRE_GA_DELETE_ROWS_EVENT = 22,
	//WRITE_ROWS_EVENT = 23,
	//UPDATE_ROWS_EVENT = 24,
	//DELETE_ROWS_EVENT = 25,
	//INCIDENT_EVENT= 26,

	public byte[] logEventRemainingBytes;
	/**
	 * Common header region
	 */
	public byte[] timestamp = new byte[4];    // 4 bytes, unsigned, unix time when query started
	public byte[] event_type = new byte[1];   // 1 byte, unsigned, log event type
	public byte[] server_id = new byte[4];    // 4 bytes, unsigned, id of the server that created this event

	/**
	 * 4 byte unsigned integer
	 * The total size of this event, in bytes.  In other words, this
	 * is the sum of the sizes of Common-Header, Post-Header, and Body.
	 */
	public byte[] total_size = new byte[4];

	/**
	 * 4 byte unsigned integer
	 * The position of the next event in the master binary log, in
	 *   bytes from the beginning of the file.  In a binlog that is not a
	 *   relay log, this is just the position of the next event, in bytes
	 *   from the beginning of the file.  In a relay log, this is
	 *   the position of the next event in the master's binlog.
	 */
	public byte[] master_position_raw = new byte[4];
	public long master_position;

	/**
	 * 2 byte bitfield
	 * See Log_event::flags.
	 *
	 */
	public byte[] flags = new byte[2];

	// The above fields should total 19 bytes.

	/**
	 * Post header region.
	 */

	public LogEventPacket(ResponseOKPacket sourcePacket) {
		super(sourcePacket);
		decodeCommonHeader();
	}

	//public LogEventPacket() {}
	//public LogEventPacket(ResponseOKPacket rop) {
	//super(rop.frameLength, rop.frameNumber);
	//decode(rop.rawPacket);
	//}
	public void decodeCommonHeader() {

		int idx = 0;

		// Common header
		System.arraycopy(remainingBytes, idx, timestamp, 0, timestamp.length);
		idx+=4;

		System.arraycopy(remainingBytes, idx, event_type, 0, event_type.length);
		idx+=1;

		System.arraycopy(remainingBytes, idx, server_id, 0, server_id.length);
		idx+=4;

		System.arraycopy(remainingBytes, idx, total_size, 0, total_size.length);
		idx+=4;

		// TODO:
		//System.arraycopy(remainingBytes, idx, master_position, 0, master_position_rsaw.length);
		master_position = MySQLPacket.decodeLong(remainingBytes, idx); idx+=4;

		System.arraycopy(remainingBytes, idx, flags, 0, flags.length);
		idx+=2;

		// sb 19 bytes
		Log.i("MySQL","finish LogEventPacket.decodeCommonHeader");

		// Now determine remainingLogEventBytes
		int len = remainingBytes.length - idx;
		logEventRemainingBytes = new byte[len];
		System.arraycopy(remainingBytes, idx, logEventRemainingBytes, 0, len);
		//remainingBytes = newRemainingBytes;
	}

	/**
	 * Given a source packet, determine which particular subclass of LogEventPacket
	 * the packet should be and return an object of that type.
	 */
	public static LogEventPacket logEventFactory(ResponseOKPacket sourcePacket) {

		LogEventPacket logEventPacket = new LogEventPacket(sourcePacket);

		int e = logEventPacket.event_type[0];
		if ( e == LogEventPacket.QUERY_EVENT) {
			logEventPacket = new QueryLogEventPacket(logEventPacket);
		} else if ( e == LogEventPacket.INTVAR_EVENT) { // type 5
			Log.i("MySQL","found INTVAR_EVENT type="+logEventPacket.event_type[0]);
		} else if ( e == LogEventPacket.FORMAT_DESCRIPTION_EVENT) { // type 0x0f;
			Log.i("MySQL","found FORMAT_DESCRIPTION_EVENT type="+logEventPacket.event_type[0]);
		} else {
			Log.i("MySQL","found unknown type="+logEventPacket.event_type[0]);
		}
		return logEventPacket;

	}

}