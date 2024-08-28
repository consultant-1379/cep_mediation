/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.base.status;

import com.ericsson.cepmediation.base.util.constants.SystemExitCode;

/**
 * @author eemecoy
 *
 */
public enum StartStopStatusUpdate {
    FAILED_TO_LOAD_SYSTEM_CONFIGURATION(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    NO_CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND_IN_CONFIGURATION_FILE(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    SUCCESSFULLY_LOADED_SYSTEM_CONFIGURATION(SystemExitCode.NOT_APPLICABLE),

    CONFIGURATION_INFORMATION_FOR_LOCAL_HOST_FOUND(SystemExitCode.NOT_APPLICABLE),

    INCORRECT_USAGE(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    FAILED_TO_START_STOP_SLAVE(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    SUCCESSFULLY_STARTED_STOPPED_SLAVE(SystemExitCode.NOT_APPLICABLE),

    SUCCESSFULLY_STARTED_APPLICATION(SystemExitCode.SYSTEM_EXIT_CODE_OK),

    FAILED_TO_START_APPLICATION(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    SUCCESSFULLY_STOPPED_APPLICATION(SystemExitCode.SYSTEM_EXIT_CODE_OK),

    FAILED_TO_VERIFY_LICENCE(SystemExitCode.SYSTEM_EXIT_CODE_NOK),
    
    FAILED_TO_VALIDATE_THE_CONFIGURATION_INFORMATION(SystemExitCode.SYSTEM_EXIT_CODE_NOK),

    FAILED_TO_SUCCESSFULLY_STOP_APPLICATION(SystemExitCode.SYSTEM_EXIT_CODE_NOK);

    private SystemExitCode exitCode;

    StartStopStatusUpdate(final SystemExitCode associatedSystemExitCode) {
        this.exitCode = associatedSystemExitCode;
    }

    public SystemExitCode getSystemExitCode() {
        return exitCode;
    }
}
