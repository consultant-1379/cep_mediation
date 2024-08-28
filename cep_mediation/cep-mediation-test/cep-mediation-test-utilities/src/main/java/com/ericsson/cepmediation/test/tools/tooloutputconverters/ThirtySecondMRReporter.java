/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.apeventbeans.Asn1Message;
import com.ericsson.cepmediation.test.util.tracer.EventTracer;

/**
 * @author eemecoy
 *
 */
public class ThirtySecondMRReporter {

    private static final long THIRTY_SECONDS = 30 * 1000;

    private void calculateMeaurementReportsForThirtySecondsPriorToCallDrops(final String inputFile) throws Exception {
        final List<ApEventBean> allEvents = new ToolOutputToEventTransformer().transformToolOutputToEvents(inputFile);
        final List<ApEventBean> callDrops = findCallDrops(allEvents);
        traceCallDrops(callDrops);
        System.out.println();
        traceMeasurementReportsWithinThirtySecondsOf(callDrops, allEvents);
    }

    private void traceCallDrops(final List<ApEventBean> callDrops) throws Exception {
        System.out.println("Call drop events found: ");
        for (final ApEventBean callDrop : callDrops) {
            EventTracer.traceApEventBean(callDrop);
        }
    }

    private void traceMeasurementReportsWithinThirtySecondsOf(final List<ApEventBean> callDrops, final List<ApEventBean> allEvents) throws Exception {
        int numberAsn1MessagesToReport = 0;
        for (final ApEventBean event : allEvents) {
            if (event instanceof RRC_MEASUREMENT_REPORT) {
                if (eventInThirtySecondsPriorToCallDrop(event, callDrops)) {
                    EventTracer.traceApEventBean(event);
                    for (final Asn1Message asn1Message : event.getAsn1MessageList()) {
                        numberAsn1MessagesToReport++;
                        EventTracer.traceAsn1Message(asn1Message);
                    }
                }
            }
        }

        System.out.println("Number of asn1 messages that should be reported is " + numberAsn1MessagesToReport);
    }

    private boolean eventInThirtySecondsPriorToCallDrop(final ApEventBean measurementReport, final List<ApEventBean> callDrops) {
        for (final ApEventBean callDropEvent : callDrops) {
            if (measurementReportIsBeforeCallDropEvent(measurementReport, callDropEvent)) {
                final long callDropTimestamp = callDropEvent.getTimestamp();
                final long measurementReportTimestamp = measurementReport.getTimestamp();
                final long difference = callDropTimestamp - measurementReportTimestamp;
                return difference < THIRTY_SECONDS;
            }
        }
        return false;
    }

    private boolean measurementReportIsBeforeCallDropEvent(final ApEventBean measurementReport, final ApEventBean callDropEvent) {
        final long measurementReportTimestamp = measurementReport.getTimestamp();
        final long callDropTimestamp = callDropEvent.getTimestamp();
        return callDropTimestamp > measurementReportTimestamp;
    }

    private List<ApEventBean> findCallDrops(final List<ApEventBean> events) {
        final List<ApEventBean> callDrops = new ArrayList<ApEventBean>();
        for (final ApEventBean event : events) {
            if (event instanceof INTERNAL_SYSTEM_RELEASE) {
                callDrops.add(event);
            }
        }
        return callDrops;
    }

    public static void main(final String[] args) throws Exception {
        final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\decoded_rop_files\\A20120516\\1645-1700\\454061101343047_sessions.txt";
        new ThirtySecondMRReporter().calculateMeaurementReportsForThirtySecondsPriorToCallDrops(inputFile);
    }

}
