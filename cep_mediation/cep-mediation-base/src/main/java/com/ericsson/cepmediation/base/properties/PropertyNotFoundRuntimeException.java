/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.properties;

/**
 * Exception to indicate a property not found
 * 
 * Exception defined as RuntimeException for now to avoid having to handle the exception, exception only created
 * to improve debugging when a property is missing
 * 
 * @author eemecoy
 *
 */
public class PropertyNotFoundRuntimeException extends RuntimeException {

    public PropertyNotFoundRuntimeException(final String message) {
        super(message);
    }

}
