/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.util.constants;

/**
 * @author eemecoy
 *
 */
public enum SystemExitCode {

    SYSTEM_EXIT_CODE_OK(0),

    SYSTEM_EXIT_CODE_NOK(1),
    
    SYSTEM_EXIT_OUTPUT_DIR_ISSUES(3),

    //an event not relevant to exiting system
    NOT_APPLICABLE(-1);

    private int errorCode;

    SystemExitCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    public int getValue() {
        return errorCode;
    }
}
