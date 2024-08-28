/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.hfa;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class SoftHandoverExecutionFailTest extends RadioCorrelationBase {

    private static final String SofthandoverFailEnrichedWindowName = "SoftHandoverFailEnrichedWindow";

    private static final String incompleteSoftHandoverFailEnrichedWindowName = "SoftHandoverFailUnenrichedWindow";

    private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/hfa.epl");
        sessionListener = new SupportUpdateListener();
        listenToStatements(Statements.SOFT_HANDOVER_EXEC_FAIL_ENRICHMENT);
        listenToStatements(Statements.INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL);
        listenToStatements(Statements.FLUSH_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL);
    }


    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeSoftHandoverExecFail() throws Exception {

        processFile("hfa/softHandoverExecFail/softHandoverExecFailAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleSoftHandoverExecFail() throws Exception {
        processFile("hfa/softHandoverExecFail/multipleSoftHandoverExecFailAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterSoftHandoverExecFail() throws Exception {
        processFile("hfa/softHandoverExecFail/softHandoverExecFailBeforeImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfSoftHandoverExecFail() throws Exception {
        processFile("hfa/softHandoverExecFail/imsiInMiddleOfSoftHandoverExecFails.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
        processFile("hfa/softHandoverExecFail/softHandoverExecFailWithReleaseWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteSoftHandoverFailEnrichedWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(SofthandoverFailEnrichedWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
        processFile("hfa/softHandoverExecFail/softHandoverExecFailWithAnotherSetupWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteSoftHandoverFailEnrichedWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(SofthandoverFailEnrichedWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void testMultipleImsis() throws Exception {
        processFile("hfa/softHandoverExecFail/multipleSoftHandoverExecFailsWithMultipleImsis.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(4));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteSoftHandoverFailEnrichedWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(1));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(SofthandoverFailEnrichedWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isRoamingSetToTrue() throws Exception {
        processFile("hfa/softHandoverExecFail/softHandoverExecFailForRoamingImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(111013302941012l));
            assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("hfa/softHandoverExecFail/softHandoverExecFailForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> softHandoverExecFailsUnenriched = getElementsInWindow(incompleteSoftHandoverFailEnrichedWindowName);
        assertThat(softHandoverExecFailsUnenriched.size(), is(0));
        
        List<? extends Object> softHandoverExecFailsEnriched = getElementsInWindow(SofthandoverFailEnrichedWindowName);
        assertThat(softHandoverExecFailsEnriched.size(), is(0));
    }

    @Test
    public void testTimeout() throws Exception {
        processFile("hfa/softHandoverExecFail/multipleSoftHandoverExecFailsTimeout.txt");

        Thread.sleep(5000);

        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = getSoftHandoverExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(10));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteSoftHandoverFailEnrichedWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(SofthandoverFailEnrichedWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    protected List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> getSoftHandoverExecFailEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED> events = new ArrayList<INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) {
                    final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event = (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }
}