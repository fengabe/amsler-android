package com.fyrecloud.mysql;

import android.util.Log;

/**
 * @author Thomas Radloff
 *
 * This class and its subclasses model the various types of packets that a
 * MySQL server will send to the client.
 * 
 * A client that communicates with a MySQL server will make an initial assumption
 * that the incoming packets are indeed MySQL.  It will attempt to interpret the 
 * packets accordingly.
 * 
 * Assuming a packet is MySQL, there's no way to determine which subclass a packet is
 * w/o decoding some of it.  There are at least three levels of this refinement.
 *
 * The first level is the assumption that a packet is a MySQLPacket.  Assuming
 * so, we can decode frameLength, frameNumber, packetType, and remainingBytes
 * from this packet.
 * 
 *  The second level works with the prior determine packetType and the remainingBytes.
 *  Given the packetType, we can classify a packet as EOFPacket, ErrorPacket,
 *  HandshakeInitPacket, or ResponseOKPacket.
 *  
 *  The third level repeats this process by decoding more of the remainingBytes
 *  in order to find additional packetType information.  See the other classes 
 *  for details on this.
 *  
 *  This class also provides some convenience methods for decoding byte[]
 *  into unsigned integers.
 * 
 */
public class MySQLPacket {

	/**
	 * Every packet has a 3 byte frameLength.  This is the length of the information
	 * _after_ frameLength and frameNumber.  An unsigned 3 byte number can fit into a signed int.
	 */
	public int frameLength;

	/**
	 * Every packet has a one byte, unsigned frameNumber.  Here we use a signed int to accommodate that.
	 */
	public int frameNumber;

	/**
	 * Every packet has an initial packetType byte.  
	 * 
	 * 0x00 = ResponseOKPacket
	 * 0xfe = EOFPacket
	 * 0xff = ErrorPacket
	 * Anything else indicates that the packet is a HandshakeInitPacket.
	 */
	public int packetType;

	/**
	 * These are the remaining bytes of the packet that have not been decoded.
	 * We feed these to the subclasses.
	 */
	public byte[] remainingBytes;

	/**
	 * It's useful to have a no arg ctor so that we can instantiate first
	 * and fill in the blanks later.
	 */
	public MySQLPacket() {}

	/**
	 * It's also useful to have this copy ctor.
	 */
	public MySQLPacket(MySQLPacket sourcePacket) {
		this.frameLength = sourcePacket.frameLength;
		this.frameNumber = sourcePacket.frameNumber;
		this.packetType  = sourcePacket.packetType;

		// Now make actual copy of remainingBytes
		this.remainingBytes = new byte[sourcePacket.remainingBytes.length];
		System.arraycopy(sourcePacket.remainingBytes, 0, this.remainingBytes, 0, sourcePacket.remainingBytes.length);
		//this.remainingBytes = sourcePacket.remainingBytes;
	}

	/**
	 * Given a source packet, determine which particular subclass of MySQLPacket the packet should be
	 * and return an object of that type.
	 */
	public static MySQLPacket factory(MySQLPacket sourcePacket) {

		// TODO: Clean this method up.
		//MySQLPacket p= null ;

		if (sourcePacket.packetType == 0) {
			// OK Packet
			//p = new ResponseOKPacket(sourcePacket);
			ResponseOKPacket p = ResponseOKPacket.responseOKFactory(sourcePacket);
			return p;
		} else if (sourcePacket.packetType == 0xfe) {
			// EOF Packet
			EOFPacket p = new EOFPacket(sourcePacket);
			return p;
		} else if (sourcePacket.packetType == 0xff) {
			// Error Packet
			//p = new ErrorPacket(frameLength, frameNumber);
			//int i = 5/0;
			String s = new String(sourcePacket.remainingBytes);
			Log.i("amsler",s);
			return new MySQLPacket();
		} else {
			// Assume this is the handshake packet
			HandshakeInitPacket p = new HandshakeInitPacket(sourcePacket);
			return p;
		}

	}

	/**
	 * @param b  Given a byte array that's at least 4 bytes long, interpret
	 * the bytes as unsigned and in little-endian order and calculate a long
	 * integer value from them
	 * @param idx 4 bytes starting at zero based idx
	 * 
	 * @return The long int.  Recall that Java does not support unsigned integers
	 * and so we have to fake it by using the next larger int.
	 */
	public static long decodeLong(byte[] b, int idx) {
		
		// TODO: Ensure b is at least 4 bytes.  Else throw an exception.
		// Throw an uncaught exception and see if we can handle it
		long retVal = 0;
		for (int i = 0; i < 4; i++)
			retVal += (b[i+idx] & 0xff) << (8 * i);
		return retVal;
	}
}