/**
 * (C) Copyright LM Ericsson System Expertise AT/LMI, 2011
 *
 * The copyright to the computer program(s) herein is the property of Ericsson
 * System Expertise EEI, Sweden. The program(s) may be used and/or copied only
 * with the written permission from Ericsson System Expertise AT/LMI or in
 * accordance with the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 *
 */
package com.ericsson.cepmediation.base.service;

import com.ericsson.cepmediation.base.util.ErrorCode;

/**
 * This class will be called, if the system failed to create a Service requested while 
 * starting server
 * @author eachsaj
 *
 */
public class ServiceException extends Exception {

    private final ErrorCode errorCode;

    /**Constructor for this class
     * @param message, a string type message
     * @param code, int error code
     */
    public ServiceException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * @return int type error code
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 962450840377954553L;

}
