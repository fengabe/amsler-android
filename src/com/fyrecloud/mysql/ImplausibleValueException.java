package com.fyrecloud.mysql;

/**
 * Thrown when decoding a packet and any field is found that has an "implausible" value.
 *
 * @author Thomas Radloff
 *
 */
public class ImplausibleValueException extends Exception {

	/**
	 * Without this warnings will squeal.
	 */
	private static final long serialVersionUID = 1L;

}