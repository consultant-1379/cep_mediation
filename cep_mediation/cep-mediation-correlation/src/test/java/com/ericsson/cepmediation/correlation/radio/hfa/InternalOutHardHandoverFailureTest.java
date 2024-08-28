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

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalOutHardHandoverFailureTest extends RadioCorrelationBase {
	
	private static final String outHardIfhoWindowName = "OutHardIfhoEnrichedWindow";
	
	private static final String incompleteOutHardIfhoWindowName = "OutHardIfhoUnenrichedWindow";
	
	private static final String outHardIratWindowName = "OutHardIratEnrichedWindow";
	
	private static final String incompleteOutHardIratWindowName = "OutHardIratUnenrichedWindow";
	
	private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/hfa.epl");
        sessionListener = new SupportUpdateListener();
        listenToStatements(Statements.OUT_HARD_IFHO_ENRICHMENT);
        listenToStatements(Statements.INCOMPLETE_OUT_HARD_IFHO_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_OUT_HARD_IFHO_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_OUT_HARD_IFHO_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_OUT_HARD_IFHO);
        listenToStatements(Statements.FLUSH_INCOMPLETE_OUT_HARD_IFHO);
        
        // IRAT Statements
        listenToStatements(Statements.OUT_HARD_IRAT_ENRICHMENT);
        listenToStatements(Statements.INCOMPLETE_OUT_HARD_IRAT_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_OUT_HARD_IRAT_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_OUT_HARD_IRAT_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_OUT_HARD_IRAT);
        listenToStatements(Statements.FLUSH_INCOMPLETE_OUT_HARD_IRAT);
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeInternalOutHardHandoverFailure() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureAfterImsi.txt");
    	Thread.sleep(sleepTime);
    	
        // IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event : eventsIfho) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event : eventsIrat) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleInternalOutHardHandoverFailure() throws Exception {
    	processFile("hfa/outHardHandoverFailure/multipleOutHardHandoverFailuresAfterImsi.txt");
    	Thread.sleep(sleepTime);
        
    	// IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(5));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event : eventsIfho) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(5));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event : eventsIrat) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterInternalOutHardHandoverFailure() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureBeforeImsi.txt");
    	Thread.sleep(sleepTime);
        
    	// IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event : eventsIfho) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event : eventsIrat) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
        
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfInternalOutHardHandoverFailure() throws Exception {
    	processFile("hfa/outHardHandoverFailure/imsiInMiddleOfOutHardHandoverFailures.txt");
    	Thread.sleep(sleepTime);
        
    	// IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(5));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event : eventsIfho) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(5));

        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event : eventsIrat) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureWithReleaseWithoutImsi.txt");
    	Thread.sleep(sleepTime);
        
        // IFHO
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));

        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(0));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));

        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(0));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));
    }
    
    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureWithAnotherSetupWithoutImsi.txt");
    	Thread.sleep(sleepTime);
        
    	// IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));

        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(0));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));

        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(0));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));
    }
    
    @Test
    public void testMultipleImsis() throws Exception {
    	processFile("hfa/outHardHandoverFailure/multipleOutHardHandoverFailuresWithMultipleImsis.txt");
    	Thread.sleep(sleepTime);
        
        // IFHO
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(4));

        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(1));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(4));

        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(1));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));
    }
    
    @Test
    public void isRoamingSetToTrue() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureForRoamingImsi.txt");
    	Thread.sleep(sleepTime);
        
        // IFHO
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));
        
        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event : eventsIfho) {
        	assertThat(event.getIMSI(), is(111013302941012l));
        	assertTrue(event.getROAMING());
        }
        
        // IRAT
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));
        
        for (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event : eventsIrat) {
        	assertThat(event.getIMSI(), is(111013302941012l));
        	assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void areWhitelistEntriesIgnoredForInternalOutHardHandoverFailure() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureWhitelist.txt");
    	
    	Thread.sleep(5000); // To allow for unenriched events to be output also
    	
        // IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(0));
        
        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(0));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(0));
        
        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(0));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));

    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("hfa/outHardHandoverFailure/outHardHandoverFailureForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
    	// IFHO
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(1));

        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(0));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(1));

        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(0));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));
    }
    
    @Test
    public void testTimeout() throws Exception {
    	processFile("hfa/outHardHandoverFailure/multipleOutHardHandoverFailuresTimeout.txt");
        
    	Thread.sleep(5000);
    	
        // IFHO
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> eventsIfho = getOutHardIfhoEnrichedEventsCreated();
        assertThat(eventsIfho.size(), is(10));

        List<? extends Object> outHardIfhosUnenriched = getElementsInWindow(incompleteOutHardIfhoWindowName);
        assertThat(outHardIfhosUnenriched.size(), is(0));
        
        List<? extends Object> outHardIfhosEnriched = getElementsInWindow(outHardIfhoWindowName);
        assertThat(outHardIfhosEnriched.size(), is(0));
        
        // IRAT
    	final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> eventsIrat = getOutHardIratEnrichedEventsCreated();
        assertThat(eventsIrat.size(), is(10));

        List<? extends Object> outHardIratsUnenriched = getElementsInWindow(incompleteOutHardIratWindowName);
        assertThat(outHardIratsUnenriched.size(), is(0));
        
        List<? extends Object> outHardIratsEnriched = getElementsInWindow(outHardIratWindowName);
        assertThat(outHardIratsEnriched.size(), is(0));
    }
    
    protected List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> getOutHardIfhoEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED> events = new ArrayList<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) {
                    final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) eventBean.getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }
    
    protected List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> getOutHardIratEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED> events = new ArrayList<INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) {
                    final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) eventBean.getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }
    
}