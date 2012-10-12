package com.fyrecloud.amsler;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import com.fyrecloud.mysql.MySQLPacket;

import android.util.Log;

/**
 * Complete MySQL packet recognition requires knowledge of the state of a communication session between
 * a client and a server.  This class is the first of two packet handling classes for dealing with 
 * this problem.  MySQLClientHandler is other class.
 * 
 * This class recognizes broad categories of MySQL packets, based purely on the format of
 * a packet, w/o regard to any session state.  It can for example, reliably determine that
 * a packet is an error or an OK response.  It can also determine packet lengths and frame numbers.
 * 
 * However, within a broad category, such as OK, there may be several different possibilities that
 * are impossible to differentiate between w/o knowledge of session state.  That's the job for
 * MySQLClientHandler.
 * 
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class MySQLFrameDecoder extends FrameDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {

		Log.i("MySQL","MySQLFrameDecode.decode");

		// 1. Make sure that at least three bytes of the packet length field have been received.
		int r = buf.readableBytes();
		if (r < 3) {
			// The length field was not received yet - return null.
			// This method will be invoked again when more packets are
			// received and appended to the buffer.
			return null;
		}

		// 2. Attempt to read the remainder of the packet.

		// 2.1 Mark the current buffer position before reading the length field
		// because the whole frame might not be in the buffer yet.
		// We will reset the buffer position to the marked position if
		// there's not enough bytes in the buffer.
		buf.markReaderIndex();

		// 2.2 Assuming we can, create a POJO for the packet.
		MySQLPacket packet = new MySQLPacket();

		// 2.3 Read the packet length field.
		packet.frameLength = buf.readMedium(); // 3 bytes

		// 2.4 Make sure that there are enough bytes in the buffer.
		if (buf.readableBytes() < packet.frameLength) {
			// The entire collection of bytes has not yet been received - return null.
			// This method will be invoked again when more packets are
			// received and appended to the buffer.
			// Reset to the marked position to read the length field again
			// next time.
			buf.resetReaderIndex();
			return null;
		}

		// 3. We now have the entire packet/frame in the buffer.  Decode it.

		// 3.1 Decode the frameNumber
		packet.frameNumber  = buf.readByte();
		if (packet.frameNumber < 0) packet.frameNumber+=256;

		// 3.2 Decode the frameType
		packet.packetType = buf.readByte();
		if (packet.packetType < 0) packet.packetType += 256;

		// 3.3 Read the remaining bytes into the packet.
		int len = packet.frameLength - 1; // already read one byte of packetType
		packet.remainingBytes = new byte[len];
		buf.readBytes(packet.remainingBytes);

		// 4. Now build the finalPacket based on the information in the original packet.
		//    finalPacket may be any type that descends from MySQLPacket.
		MySQLPacket finalPacket = MySQLPacket.factory(packet);

		return finalPacket;
	}


	// Commented out junk

	//private byte[] decode_length_coded_binary(ChannelBuffer buf) {
	//byte[] retval = new byte[]{};
	//int i = 250;
	//byte ib = (byte) i; // this works, b = -6 aka 250
	//int j = (int) ib;   // this does not work, new j = -6
	//byte b = buf.readByte();
	//int b1 = buf.readByte();
	//if (b1 < 0) b1 += 256;
	//if ( 0 <= b1 && b1 <= 250) {
	//retval = new byte[]{(byte)b1};
	//} else if ( b1 == 251) {
	//Log.i("MySQL","Warning: MySQL type fb found.");
	//} else if ( b1 == 252) {
	//retval = new byte[2];
	//buf.readBytes(retval);
	//} else if ( b1 == 253) {
	//retval = new byte[3];
	//buf.readBytes(retval);
	//} else if ( b1 == 254) {
	//retval = new byte[8];
	//buf.readBytes(retval);
	//} else if ( b1 == 255) {
	// Not documented.  Looks like the missing 32 size. Assume so.
	//retval = new byte[4];
	//buf.readBytes(retval);
	//} else {
	//i = 5/0;
	//}
	//return retval;
	//}

	//private ResponseOKPacket decodeResponseOKPacket(ChannelBuffer buf, int frameLength) {
	//ResponseOKPacket p = new ResponseOKPacket();
	//int readerIdxStart = buf.readerIndex();
	// 1 byte
	//p.field_count = buf.readByte();
	//if (p.field_count != 0) return null;	// sb 0x0
	//p.affected_rows = decode_length_coded_binary(buf);
	//p.insert_id = decode_length_coded_binary(buf);
	// 2 bytes
	//p.server_status = buf.readChar();
	// 2 bytes
	//p.warning_count = buf.readChar();
	// n bytes.  The remainder of the message
	//int readerIdxStop = buf.readerIndex();
	//int len = frameLength - (readerIdxStop - readerIdxStart);
	//p.message = new byte[len];
	//buf.readBytes(p.message);
	// ensure that the readIndex should = the end
	// maybe not!
	//int x = buf.readableBytes();
	//if (x != 0) return null;
	//Log.i("MySQL","finish MySQLFrameDecode.decodeResponseOKPacket msg="+p.message.toString());
	//return p;
	//}

}