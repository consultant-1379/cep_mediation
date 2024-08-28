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
package com.ericsson.cepmediation.server.management;

import com.ericsson.cepmediation.base.util.ErrorCode;

/**
 * This exception raises on an admin operation failure 
 * @author eachsaj
 *
 */
public class AdminException extends Exception {

    private static final long serialVersionUID = 1L;

    private final ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**Excaption class representing any AdminServer side error
     * @param message, String message
     * @param errorCode, in error code
     */
    public AdminException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
