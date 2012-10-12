package com.fyrecloud.amsler;

/**
*
* This class models a log entry for use by the snapshot download
* or the synchronizer.
*
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
*
*/

public class LogEntry {

	/**
	 * The log entry comes from MySQL
	 */
	public static final int MYSQL  = 0;

	/**
	 * The log entry comes from SQLite
	 */
	public static final int SQLITE = 1;

	/**
	 * A text message to display
	 */
	public String s;

	/**
	 * What type of log entry is this
	 */
	public int type;

	public LogEntry(String s, int type) {
		this.s    = s;
		this.type = type;
	}
}