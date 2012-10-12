package com.fyrecloud.mysql;

import android.util.Log;


/**
 * @author Thomas Radloff
 *
 */
public class ResponseOKPacket extends MySQLPacket {
	//public byte field_count;	// always 0
	//public byte[] affected_rows;
	//public byte[] insert_id;
	//public int server_status;
	//public int warning_count;
	//public byte[] message;

	//public ResponseOKPacket() {}
	//ublic ResponseOKPacket(int frameLength, int frameNumber) {
	//super(frameLength, frameNumber);
	//}

	public ResponseOKPacket(MySQLPacket sourcePacket) {
		super(sourcePacket);
		decode();
	}

	public ResponseOKPacket() {}

	/**
	 * Given a source packet, determine which particular subclass of ResponseOKPacket
	 * the packet should be and return an object of that type.
	 */
	public static ResponseOKPacket responseOKFactory(MySQLPacket sourcePacket) {

		ResponseOKPacket p = new ResponseOKPacket(sourcePacket);

		// The only ResponseOK we expect is a LogEvent, so get that
		//p = LogEventPacket.logEventFactory(p);
		//if (sourcePacket.packetType == 0) {
		// OK Packet
		//p = new ResponseOKPacket(sourcePacket);
		//p = ResponseOKPacket.factory(sourcePacket);
		//} else if (sourcePacket.packetType == 0xfe) {
		// EOF Packet
		//p = new EOFPacket(sourcePacket);
		//} else if (sourcePacket.packetType == 0xff) {
		// Error Packet
		//p = new ErrorPacket(frameLength, frameNumber);
		//int i = 5/0;
		//} else {
		// Assume this is the handshake packet
		//p = new HandshakeInitPacket(sourcePacket);
		//}

		return p;
	}

	private void decode() {
		// At this time we do not further decode response ok
		Log.i("MySQL","finish ResponseOKPacket.decode");

	}

	//public void decode(ChannelBuffer buf, int remainingFrameLength) {
	//int readerIdxStart = buf.readerIndex();
	/// n bytes.  The remainder of the message
	//int readerIdxStop = buf.readerIndex();
	//int len = frameLength - (readerIdxStop - readerIdxStart);
	//int len = remainingFrameLength;
	//rawPacket = new byte[len];
	//buf.readBytes(rawPacket);
	//Log.i("MySQL","finish ResponseOKPacket.decode");
	//}
}