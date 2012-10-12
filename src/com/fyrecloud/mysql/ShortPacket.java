package com.fyrecloud.mysql;
// not presently used
/**
 * A short packet only has a single 0xfe byte as the message.
 * 
 * @author Radloff
 *
 */
public class ShortPacket extends EOFPacket {

	public ShortPacket() {}
	//public ShortPacket(int frameLength, int frameNumber) {
	//super(frameLength, frameNumber);
	//}
}