/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.server.monitoring.startupstatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.ericsson.cepmediation.base.status.StartStopStatusUpdate;
import com.ericsson.cepmediation.base.status.StartStopStatusUpdateHelper;
import com.ericsson.cepmediation.base.util.constants.SystemExitCode;

/**
 * @author eemecoy
 *
 */
public class CheckStartupStatus implements Observer {

    public void checkStartupStatus(File logFile) throws FileNotFoundException, MissingPropertyException {
        final LogFileMonitor logFileMonitor = new LogFileMonitor(logFile);
        logFileMonitor.addObserver(this);
        logFileMonitor.startLogFileMonitoring();
    }

    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(final Observable o, final Object changedObject) {
        final List<String> logEntries = (List<String>) changedObject;
        final List<String> events = extractStartupEventsFromLogs(logEntries);
        printEventsToConsole(events);
        final SystemExitCode systemExitCode = checkForAppplicationStartupCompletionEvent(events);
        if (shouldActOnSystemExitCode(systemExitCode)) {
            System.exit(systemExitCode.getValue());
        }

    }

    private boolean shouldActOnSystemExitCode(final SystemExitCode systemExitCode) {
        return systemExitCode == SystemExitCode.SYSTEM_EXIT_CODE_OK
                || systemExitCode == SystemExitCode.SYSTEM_EXIT_CODE_NOK;
    }

    SystemExitCode checkForAppplicationStartupCompletionEvent(final List<String> logMessages) {
        final List<StartStopStatusUpdate> events = convertLogMessagesToEvents(logMessages);
        if (eventsContainsCompletedSuccessfulEvent(events)) {
            return SystemExitCode.SYSTEM_EXIT_CODE_OK;
        } else if (eventsContainCouldNotStartEvent(events)) {
            return SystemExitCode.SYSTEM_EXIT_CODE_NOK;
        }
        return SystemExitCode.NOT_APPLICABLE;

    }

    private boolean eventsContainCouldNotStartEvent(final List<StartStopStatusUpdate> events) {
        return lookForEventWithSystemExitCodeOf(SystemExitCode.SYSTEM_EXIT_CODE_NOK, events);
    }

    private List<StartStopStatusUpdate> convertLogMessagesToEvents(final List<String> logMessages) {
        final List<StartStopStatusUpdate> events = new ArrayList<StartStopStatusUpdate>();
        for (final String logMessage : logMessages) {
            events.add(StartStopStatusUpdateHelper.convertLogMessageToStatusUpdate(logMessage));
        }
        return events;
    }

    private boolean eventsContainsCompletedSuccessfulEvent(final List<StartStopStatusUpdate> events) {
        return lookForEventWithSystemExitCodeOf(SystemExitCode.SYSTEM_EXIT_CODE_OK, events);
    }

    private boolean lookForEventWithSystemExitCodeOf(final SystemExitCode systemExitCodeToFind,
            final List<StartStopStatusUpdate> events) {
        for (final StartStopStatusUpdate statusUpdate : events) {
            if (statusUpdate.getSystemExitCode() == systemExitCodeToFind) {
                return true;
            }
        }
        return false;
    }

    private void printEventsToConsole(final List<String> events) {
        for (final String event : events) {
            System.out.println(event);
        }

    }

    private List<String> extractStartupEventsFromLogs(final List<String> logEntries) {
        final List<String> events = new ArrayList<String>();
        for (final String logEntry : logEntries) {
            events.add(extractMessageFromLineInLogFile(logEntry));
        }
        return events;
    }

    String extractMessageFromLineInLogFile(final String logEntry) {
        final int startIndex = logEntry.indexOf(": ") + 2;
        return logEntry.substring(startIndex);
    }

}
