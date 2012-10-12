package com.fyrecloud.mysql;

import android.util.Log;

/**
 * @author Thomas Radloff
 *
 */
public class HandshakeInitPacket extends MySQLPacket {
	//public int protocol_version;
	public byte[] server_version;                // /0 terminated string
	public byte[] scramble_buff1 = new byte[8];	 // wireshark = salt
	public byte[] scramble_buff2 = new byte[12]; // wireshark = salt.  2nd part of the salt

	public HandshakeInitPacket(MySQLPacket sourcePacket) {
		super(sourcePacket);
		decode();
	}

	private void decode() {

		int idx = 0; // index into remainingBytes to decode

		// 1. Server version.  Null-Terminated String
		int len = 0;
		while (remainingBytes[idx+len] != 0 && idx+len < remainingBytes.length) len++;
		server_version = new byte[len];
		System.arraycopy(remainingBytes, idx, server_version, 0, len);
		idx += (len + 1); // get the terminating zero

		idx += 4;	// skip thread_id

		// 2. First scramble buffer
		System.arraycopy(remainingBytes, idx, scramble_buff1, 0, scramble_buff1.length);
		idx += 8;

		// 3. Skip many fields
		idx += 1;  // 1 byte, always 0, throw this away
		idx += 2;  // 2 bytes, server_capabilities
		idx += 1;  // 1 byte, server_language
		idx += 2;  // 2 bytes server_status, server_status
		idx += 2;  // 2 bytes, always zero ?, server_capabilities2
		idx += 1;  // 1 byte, length_of_scramble, always zero ?
		idx += 10; // 10 bytes, filler, always 0

		// 4. Read the 2nd scramble buffer
		len = 0;
		while (remainingBytes[idx+len] != 0 && idx+len < remainingBytes.length) len++;
		scramble_buff2 = new byte[len];
		System.arraycopy(remainingBytes, idx, scramble_buff2, 0, len);
		idx += (len + 1); // get the terminating zero

		// idx sb = remainingBytes.length

		Log.i("MySQL","finish HandshakeInitPacket.decode");

	}
}