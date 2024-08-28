package com.ericsson.cepmediation.loading.exception;

import com.ericsson.cepmediation.base.util.ErrorCode;

public class ParsingFailedException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 7871973161979576521L;

    private final ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public ParsingFailedException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
