package com.ericsson.cepmediation.loading.events;

/**
 * This exception is thrown when an unpacking error occurs
 * @author eeilfn
 *
 */
public class UnpackException extends Exception {
	private static final long serialVersionUID = -8395339524458418840L;

	/**
	 * Constructor, save the error tyope and the message
	 * @param message
	 */
	public UnpackException(final String message) {
		super(message);
	}
}