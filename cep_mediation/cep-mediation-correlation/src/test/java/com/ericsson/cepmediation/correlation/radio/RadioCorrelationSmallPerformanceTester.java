/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

/**
 * Test to measure performance with a smaller number of events (designed for machines that don't have
 * capability to process entire ROPs worth of events)
 * 
 * @author eemecoy
 *
 */
public class RadioCorrelationSmallPerformanceTester extends RadioCorrelationPerformanceTesterBase {

    @Before
    public void setUp() throws Exception {
        createData();
        configureEsper("esper/XsecondsRRCCorrelation.epl");
        addStatementAndListener("Session-Enrichment", sessionListener = new SupportUpdateListener());
    }

    @Test
    public void testEvents() {

        sendRealEventsToEsper();

        final List<GPEH_SESSION> sessionsCreated = getSessionsCreated();
        assertFalse(sessionsCreated.isEmpty());
        System.out.println("Number of sessions created " + sessionsCreated.size());

    }

}
