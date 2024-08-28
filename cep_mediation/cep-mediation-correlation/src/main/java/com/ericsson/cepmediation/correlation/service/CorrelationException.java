package com.ericsson.cepmediation.correlation.service;

import com.ericsson.cepmediation.base.util.ErrorCode;

/**
 * This exception class represents any correlation related errors
 * @author eachsaj
 *
 */
public class CorrelationException extends Exception {

    private static final long serialVersionUID = 211538917558607318L;

    ErrorCode errorCode;

    public CorrelationException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
