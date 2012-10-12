package com.fyrecloud.mysql;

/**
 * A short packet only has a single 0xfe byte as the message.
 * 
 * @author Thomas Radloff
 *
 */
public class ErrorPacket extends MySQLPacket {

	public int errno;			// little endian
	public byte sql_state_marker;	// always "#"
	public byte[] sql_state;	// always 5 bytes

	/**
	 * The entire remainder of a packet is a text message.  No /0 termination.
	 */
	public byte[] message;

	//public ErrorPacket(int frameLength, int frameNumber) {
	//super(frameLength, frameNumber);
	//}

	//@Override
	//public void decode(ChannelBuffer buf, int remainingFrameLength) {
	//int readerIdxStart = buf.readerIndex();
	// 2 bytes
	//errno = buf.readChar();
	// 1 byte
	//sql_state_marker = buf.readByte();
	// 5 bytes
	//sql_state = new byte[5];
	//buf.readBytes(sql_state);
	// The remainder of the message
	//int readerIdxStop = buf.readerIndex();
	//int len = frameLength - (readerIdxStop - readerIdxStart);
	//message = new byte[len];
	//buf.readBytes(message);
	// ensure that the readIndex should = the end
	//int x = buf.readableBytes();
	//if (x != 0) return null;
	//String m = new String(message);
	//Log.i("MySQL","finish ErrorPacket.decode m="+m);
	//}
}