/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.test.tools.tooloutputconverters;

import java.util.List;

import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.test.tools.ExpectedEventCounter;

/**
 * @author eemecoy
 *
 */
public class EventCounterForToolOutput {
    private void calculateEventCounterForInput(final String inputFile) throws Exception {
        final List<ApEventBean> events = new ToolOutputToEventTransformer().transformToolOutputToEvents(inputFile);
        final int expectedEventCount = new ExpectedEventCounter().calculateExpectedEventCount(events);
        System.out.println("Expected event count: " + expectedEventCount);
    }

    public static void main(final String[] args) throws Exception {
        final String inputFile = "C:\\Users\\eemecoy\\Documents\\CEA\\bugs\\event count wrong\\usecase2\\events for first session with updated tool.txt";
        new EventCounterForToolOutput().calculateEventCounterForInput(inputFile);
    }
}
