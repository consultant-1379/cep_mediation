/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.base.util.constants.SystemExitCode;

/**
 * @author eemecoy
 *
 */
public class CheckStartupStatusTest {

    private CheckStartupStatus checkStartupStatus;

    @Before
    public void setup() {
        checkStartupStatus = new CheckStartupStatus();
    }

    @Test
    public void testExitCodeisNAForEventWeShouldIgnore() {
        final List<String> events = new ArrayList<String>();
        events.add("Configuration information for local host found");
        final SystemExitCode exitCode = checkStartupStatus.checkForAppplicationStartupCompletionEvent(events);
        assertEquals(SystemExitCode.NOT_APPLICABLE, exitCode);
    }

    @Test
    public void testExitCodeisNOKForFailedStartup() {
        final List<String> events = new ArrayList<String>();
        events.add("No configuration information for local host found in configuration file");
        final SystemExitCode exitCode = checkStartupStatus.checkForAppplicationStartupCompletionEvent(events);
        assertEquals(SystemExitCode.SYSTEM_EXIT_CODE_NOK, exitCode);
    }

    @Test
    public void testExitCodeisOKForSuccessfulStartup() {
        final List<String> events = new ArrayList<String>();
        events.add("Successfully started application");
        final SystemExitCode exitCode = checkStartupStatus.checkForAppplicationStartupCompletionEvent(events);
        assertEquals(SystemExitCode.SYSTEM_EXIT_CODE_OK, exitCode);
    }

    @Test
    public void testExtractMessageFromLineInLogFile() {
        final String message = "Successfully loaded system configuration";
        final String logEntry = "2012-06-14 14:30:34,373 [main] INFO  com.ericsson.cepmediation.server.management.status.startupstatus.SystemMonitor - Status Update: "
                + message;
        assertEquals(message, checkStartupStatus.extractMessageFromLineInLogFile(logEntry));
    }

}
