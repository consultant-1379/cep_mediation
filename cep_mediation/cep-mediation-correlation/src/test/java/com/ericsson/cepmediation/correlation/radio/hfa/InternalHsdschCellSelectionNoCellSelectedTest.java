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

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalHsdschCellSelectionNoCellSelectedTest extends RadioCorrelationBase {

    private static final String HsdschNoCellSelectedEnrichedWindow = "HsdschNoCellSelectedEnrichedWindow";

    private static final String HsdschNoCellSelectedUnenrichedWindow = "HsdschNoCellSelectedUnenrichedWindow";

    private static final int sleepTime = 2000;
    
    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/hfa.epl");
        sessionListener = new SupportUpdateListener();
        listenToStatements(Statements.HSDSCH_NO_CELL_SELECTED_ENRICHMENT);
        listenToStatements(Statements.INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_HSDSCH_NO_CELL_SELECTED);
        listenToStatements(Statements.FLUSH_INCOMPLETE_HSDSCH_NO_CELL_SELECTED);
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeHsdschNoCellSelected() throws Exception {

        processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleHsdschNoCellSelected() throws Exception {
        processFile("hfa/HsdschNoCellSelected/multipleHsdschNoCellSelectedAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterHsdschNoCellSelected() throws Exception {
        processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedBeforeImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfHsdschNoCellSelected() throws Exception {
        processFile("hfa/HsdschNoCellSelected/imsiInMiddleOfHsdschNoCellSelecteds.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
        processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedWithReleaseWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(HsdschNoCellSelectedUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(HsdschNoCellSelectedEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
        processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedWithAnotherSetupWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(HsdschNoCellSelectedUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(HsdschNoCellSelectedEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void testMultipleImsis() throws Exception {
        processFile("hfa/HsdschNoCellSelected/multipleHsdschNoCellSelectedsWithMultipleImsis.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(4));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(HsdschNoCellSelectedUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(1));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(HsdschNoCellSelectedEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    @Test
    public void isRoamingSetToTrue() throws Exception {
        processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedForRoamingImsi.txt");
        Thread.sleep(sleepTime);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(111013302941012l));
            assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("hfa/HsdschNoCellSelected/HsdschNoCellSelectedForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> hsdschsNoCellSelectedUnenriched = getElementsInWindow(HsdschNoCellSelectedUnenrichedWindow);
        assertThat(hsdschsNoCellSelectedUnenriched.size(), is(0));
        
        List<? extends Object> hsdschsNoCellSelectedEnriched = getElementsInWindow(HsdschNoCellSelectedEnrichedWindow);
        assertThat(hsdschsNoCellSelectedEnriched.size(), is(0));
    }

    @Test
    public void testTimeout() throws Exception {
        processFile("hfa/HsdschNoCellSelected/multipleHsdschNoCellSelectedsTimeout.txt");

        Thread.sleep(5000);

        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = getHsdschNoCellSelectedEnrichedEventsCreated();
        assertThat(events.size(), is(10));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(HsdschNoCellSelectedUnenrichedWindow);
        assertThat(callSetupFailsUnenriched.size(), is(0));

        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(HsdschNoCellSelectedEnrichedWindow);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }

    protected List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> getHsdschNoCellSelectedEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED> events = new ArrayList<INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) {
                    final INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event = (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) eventBean
                            .getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

}