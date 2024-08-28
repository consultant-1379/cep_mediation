package com.ericsson.cepmediation.correlation.beans;

/**
 * @author evelziv
 */
public final class NotYetImplementedException extends RuntimeException {
	
	private static final long serialVersionUID = -4891794801549728386L;

	public NotYetImplementedException() {
	}

	public NotYetImplementedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public NotYetImplementedException(final String message) {
		super(message);
	}

	public NotYetImplementedException(final Throwable cause) {
		super(cause);
	}
}
