/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.management.util;

/**
 * Exception indicating that an RMI service could not be found in the RMI server
 * @author eemecoy
 *
 */
public class CouldNotConnectToRMIServiceException extends Exception {

    /**
     * @param message
     * 
     */
    public CouldNotConnectToRMIServiceException(final String message) {
        super(message);
    }

}
