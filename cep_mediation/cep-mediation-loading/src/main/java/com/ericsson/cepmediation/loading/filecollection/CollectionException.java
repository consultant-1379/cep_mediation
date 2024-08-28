package com.ericsson.cepmediation.loading.filecollection;

import com.ericsson.cepmediation.base.util.ErrorCode;

/**
 *  
 * @author eeilfn
 *
 */
public class CollectionException extends Exception {
    private static final long serialVersionUID = 1L;

    public ErrorCode getErrorCode() {
        return ErrorCode.COLLECTION_EXCEPTION;
    }

    public CollectionException(final String message) {
        super(message);
    }

}
