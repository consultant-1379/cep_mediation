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

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalFailedHsdschCellChangeTest extends RadioCorrelationBase {

    private static final String FailedHsdschCellChangeEnrichedWindow = "FailedHsdschCellChangeEnrichedWindow";

    private static final String FailedHsdschCellChangeUnenrichedWindow = "FailedHsdschCellChangeUnenrichedWindow";

    private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/hfa.epl");
        sessionListener = new SupportUpdateListener();
        addStatementAndListener(Statements.FAILED_HSDSCH_CELL_CHANGE_ENRICHMENT, sessionListener);
        listenToStatements(Statements.INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE);
        listenToStatements(Statements.FLUSH_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE);
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeFailedHsdschCellChange() throws Exception {

        processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleFailedHsdschCellChange() throws Exception {
        processFile("hfa/FailedHsdschCellChange/multipleFailedHsdschCellChangeAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterFailedHsdschCellChange() throws Exception {
        processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeBeforeImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfFailedHsdschCellChange() throws Exception {
        processFile("hfa/FailedHsdschCellChange/imsiInMiddleOfFailedHsdschCellChanges.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
        processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeWithReleaseWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(FailedHsdschCellChangeUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(FailedHsdschCellChangeEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
        processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeWithAnotherSetupWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(FailedHsdschCellChangeUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(FailedHsdschCellChangeEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void testMultipleImsis() throws Exception {
        processFile("hfa/FailedHsdschCellChange/multipleFailedHsdschCellChangesWithMultipleImsis.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(4));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(FailedHsdschCellChangeUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(1));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(FailedHsdschCellChangeEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isRoamingSetToTrue() throws Exception {
        processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeForRoamingImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(111013302941012l));
            assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("hfa/FailedHsdschCellChange/FailedHsdschCellChangeForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> failedHsdschCellChangesUnenriched = getElementsInWindow(FailedHsdschCellChangeUnenrichedWindow);
        assertThat(failedHsdschCellChangesUnenriched.size(), is(0));
        
        List<? extends Object> failedHsdschCellChangesEnriched = getElementsInWindow(FailedHsdschCellChangeEnrichedWindow);
        assertThat(failedHsdschCellChangesEnriched.size(), is(0));
    }

    @Test
    public void testTimeout() throws Exception {
        processFile("hfa/FailedHsdschCellChange/multipleFailedHsdschCellChangesTimeout.txt");

        Thread.sleep(5000);

        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = getFailedHsdschCellChangeEnrichedEventsCreated();
        assertThat(events.size(), is(10));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(FailedHsdschCellChangeUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(FailedHsdschCellChangeEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    protected List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> getFailedHsdschCellChangeEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED> events = new ArrayList<INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) {
                    final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event = (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

}