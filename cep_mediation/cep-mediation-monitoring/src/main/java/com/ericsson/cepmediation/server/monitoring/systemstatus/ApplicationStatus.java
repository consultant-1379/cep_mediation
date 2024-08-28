/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.systemstatus;

import com.ericsson.cepmediation.base.util.constants.SystemExitCode;

/**
 * @author eemecoy
 *
 */
public abstract class ApplicationStatus {

    public static void main(final String[] args) {
        final SystemExitCode applicationStatusCode = new CheckApplicationStatus().checkApplicationStatus();
        System.exit(applicationStatusCode.getValue());
    }

}
