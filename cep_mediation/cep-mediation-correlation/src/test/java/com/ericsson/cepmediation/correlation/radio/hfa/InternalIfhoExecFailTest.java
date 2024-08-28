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

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalIfhoExecFailTest extends RadioCorrelationBase {

    private static final String IfhoExecFailEnrichedWindow = "IfhoExecFailEnrichedWindow";

    private static final String IfhoExecFailUnenrichedWindow = "IfhoExecFailUnenrichedWindow";

    private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/hfa.epl");
        sessionListener = new SupportUpdateListener();
        
        listenToStatements(Statements.IFHO_EXEC_FAIL_ENRICHMENT);
        listenToStatements(Statements.INCOMPLETE_IFHO_EXEC_FAIL_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_IFHO_EXEC_FAIL_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_IFHO_EXEC_FAIL_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_IFHO_EXEC_FAIL);
        listenToStatements(Statements.FLUSH_INCOMPLETE_IFHO_EXEC_FAIL);
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeIfhoExecFail() throws Exception {

        processFile("hfa/IfhoExecFail/IfhoExecFailAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleIfhoExecFail() throws Exception {
        processFile("hfa/IfhoExecFail/multipleIfhoExecFailAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterIfhoExecFail() throws Exception {
        processFile("hfa/IfhoExecFail/IfhoExecFailBeforeImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfIfhoExecFail() throws Exception {
        processFile("hfa/IfhoExecFail/imsiInMiddleOfIfhoExecFails.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
        processFile("hfa/IfhoExecFail/IfhoExecFailWithReleaseWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(IfhoExecFailUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(IfhoExecFailEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
        processFile("hfa/IfhoExecFail/IfhoExecFailWithAnotherSetupWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(IfhoExecFailUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(IfhoExecFailEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void testMultipleImsis() throws Exception {
        processFile("hfa/IfhoExecFail/multipleIfhoExecFailsWithMultipleImsis.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(4));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(IfhoExecFailUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(1));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(IfhoExecFailEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isRoamingSetToTrue() throws Exception {
        processFile("hfa/IfhoExecFail/IfhoExecFailForRoamingImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(111013302941012l));
            assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("hfa/IfhoExecFail/IfhoExecFailForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> ifhoExecFailsUnenriched = getElementsInWindow(IfhoExecFailUnenrichedWindow);
        assertThat(ifhoExecFailsUnenriched.size(), is(0));
        
        List<? extends Object> ifhoExecFailsEnnriched = getElementsInWindow(IfhoExecFailEnrichedWindow);
        assertThat(ifhoExecFailsEnnriched.size(), is(0));
    }

    @Test
    public void testTimeout() throws Exception {
        processFile("hfa/IfhoExecFail/multipleIfhoExecFailsTimeout.txt");

        Thread.sleep(5000);

        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = getIfhoExecFailEnrichedEventsCreated();
        assertThat(events.size(), is(10));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(IfhoExecFailUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(IfhoExecFailEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    protected List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> getIfhoExecFailEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED> events = new ArrayList<INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) {
                    final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event = (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

}