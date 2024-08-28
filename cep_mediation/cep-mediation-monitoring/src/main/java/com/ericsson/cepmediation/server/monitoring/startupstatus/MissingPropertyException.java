/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

/**
 * @author eemecoy
 *
 */
public class MissingPropertyException extends Exception {

    public MissingPropertyException(final String message) {
        super(message);
    }

}
