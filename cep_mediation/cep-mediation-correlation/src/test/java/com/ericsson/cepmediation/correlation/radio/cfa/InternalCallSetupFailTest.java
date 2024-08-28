/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.cfa;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalCallSetupFailTest extends RadioCorrelationBase {
	
	private static final String callSetupFailWindowName = "CallSetupFailEnrichedWindow";
	
	private static final String incompleteCallSetupFailWindowName = "CallSetupFailUnenrichedWindow";
	
	private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/cfa.epl");
        sessionListener = new SupportUpdateListener();
        addStatementAndListener(Statements.CALL_SETUP_FAIL_ENRICHMENT, sessionListener);
        listenToStatements(Statements.INCOMPLETE_CALL_SETUP_FAIL_ENRICHMENT);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_CALL_SETUP_FAIL_ON_SETUP);
        listenToStatements(Statements.CLEANUP_INCOMPLETE_CALL_SETUP_FAIL_ON_RELEASE);
        listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_CALL_SETUP_FAIL);
        listenToStatements(Statements.FLUSH_INCOMPLETE_CALL_SETUP_FAIL);
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeInternalCallSetupFail() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailAfterImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleInternalCallSetupFail() throws Exception {
    	processFile("cfa/callSetupFail/multipleCallSetupFailsAfterImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterInternalCallSetupFail() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailBeforeImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfInternalCallSetupFail() throws Exception {
    	processFile("cfa/callSetupFail/imsiInMiddleOfCallSetupFails.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
        	assertThat(event.getIMSI(), is(454063302941012l));
        }
    }
    
    @Test
    public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailWithReleaseWithoutImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteCallSetupFailWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));
        
        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(callSetupFailWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }
    
    @Test
    public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailWithAnotherSetupWithoutImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteCallSetupFailWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));
        
        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(callSetupFailWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }
    
    @Test
    public void testMultipleImsis() throws Exception {
    	processFile("cfa/callSetupFail/multipleCallSetupFailsWithMultipleImsis.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(4));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteCallSetupFailWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(1));
        
        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(callSetupFailWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }
    
    @Test
    public void areRabAttributesHandledCorrectly() throws Exception {
    	processFile("cfa/callSetupFail/multipleCallSetupFailsWithRabValuesSet.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(6));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
            if (event.getBase().getUE_CONTEXT() == 1) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)1));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)25));
                assertThat(event.getPS_ERR_CNT(), is((byte)1));
                assertThat(event.getCS_ERR_CNT(), is((byte)0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)0));
            } else if (event.getBase().getUE_CONTEXT() == 2) {
            	assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)1));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)1));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)1));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)123));
                assertThat(event.getPS_ERR_CNT(), is((byte)1));
                assertThat(event.getCS_ERR_CNT(), is((byte)1));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)1));
            } else if (event.getBase().getUE_CONTEXT() == 3) {
            	assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)1));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)2));
                assertThat(event.getPS_ERR_CNT(), is((byte)0));
                assertThat(event.getCS_ERR_CNT(), is((byte)1));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)0));
            } else if (event.getBase().getUE_CONTEXT() == 4) {
            	assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)2));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)62));
                assertThat(event.getPS_ERR_CNT(), is((byte)1));
                assertThat(event.getCS_ERR_CNT(), is((byte)0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)0));
            } else if (event.getBase().getUE_CONTEXT() == 5) {
            	assertThat(event.getPS_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getCS_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getFAILED_RAB_TYPE(), is(DefaultValues.DEFAULT_SHORT_VALUE));
                assertThat(event.getPS_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getCS_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getMULTI_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
            } else if (event.getBase().getUE_CONTEXT() == 6) {
            	assertThat(event.getPS_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getCS_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getFAILED_RAB_TYPE(), is(DefaultValues.DEFAULT_SHORT_VALUE));
                assertThat(event.getPS_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getCS_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
                assertThat(event.getMULTI_ERR_CNT(), is(DefaultValues.DEFAULT_BYTE_VALUE));
            }

        }
    }
    
    @Test
    public void isRoamingSetToTrue() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailForRoamingImsi.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));
        
        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
        	assertThat(event.getIMSI(), is(111013302941012l));
        	assertTrue(event.getROAMING());
        }

    }
    
    @Test
    public void testSourceConfAndWantedConfWithSameValues() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailWithSameSourceConfAndWantedConf.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
            if (event.getBase().getUE_CONTEXT() == 1) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)-1));
                assertThat(event.getPS_ERR_CNT(), is((byte)0));
                assertThat(event.getCS_ERR_CNT(), is((byte)0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)0));
            } 
        }
    }
    
    @Test
    public void testWantedConfWithNullValue() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailWithWantedConfEqualToNull.txt");
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (INTERNAL_CALL_SETUP_FAIL_ENRICHED event : events) {
            if (event.getBase().getUE_CONTEXT() == 1) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short)-1));
                assertThat(event.getPS_ERR_CNT(), is((byte)0));
                assertThat(event.getCS_ERR_CNT(), is((byte)0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte)0));
            } 
        }
    }
    
    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("cfa/callSetupFail/callSetupFailForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteCallSetupFailWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));
        
        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(callSetupFailWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }
    
    @Test
    public void testTimeout() throws Exception {
    	processFile("cfa/callSetupFail/multipleCallSetupFailsTimeout.txt");
        
    	Thread.sleep(5000);
    	
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = getCallSetupFailEnrichedEventsCreated();
        assertThat(events.size(), is(10));

        List<? extends Object> callSetupFailsUnenriched = getElementsInWindow(incompleteCallSetupFailWindowName);
        assertThat(callSetupFailsUnenriched.size(), is(0));
        
        List<? extends Object> allSetUpFailsEnriched = getElementsInWindow(callSetupFailWindowName);
        assertThat(allSetUpFailsEnriched.size(), is(0));
    }
    
    protected List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> getCallSetupFailEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_CALL_SETUP_FAIL_ENRICHED> events = new ArrayList<INTERNAL_CALL_SETUP_FAIL_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_CALL_SETUP_FAIL_ENRICHED) {
                    final INTERNAL_CALL_SETUP_FAIL_ENRICHED event = (INTERNAL_CALL_SETUP_FAIL_ENRICHED) eventBean.getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }
    
}