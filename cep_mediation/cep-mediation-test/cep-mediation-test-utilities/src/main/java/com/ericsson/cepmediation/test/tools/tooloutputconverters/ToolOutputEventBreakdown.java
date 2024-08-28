/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.util.Collection;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.tools.EventBreakdown;
import com.ericsson.cepmediation.test.tools.ExpectedEventCounter;

/**
 * @author eemecoy
 *
 */
public class ToolOutputEventBreakdown {

    private final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\decoded_rop_files\\A20120516\\1645-1700\\454063302966293_sessions_erroneous_extra_session.txt";

    public void printOutEventBreakdown() throws Exception {
        final Collection<ApEventBean> events = new ToolOutputToEventTransformer().transformToolOutputToEvents(inputFile);
        final String detailedEventReport = new EventBreakdown().getDetailedEventReport(events);
        System.out.println(detailedEventReport);
        final int expectedEventCount = new ExpectedEventCounter().calculateExpectedEventCount(events);
        System.out.println("Event count should be " + expectedEventCount);
    }

    public static void main(final String[] args) throws Exception {
        new ToolOutputEventBreakdown().printOutEventBreakdown();
    }
}
