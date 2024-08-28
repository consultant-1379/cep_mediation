/*------------------------------------------------------------------------------
*******************************************************************************
* COPYRIGHT Ericsson 2013
*
* The copyright to the computer program(s) herein is the property of
* Ericsson Inc. The programs may be used and/or copied only with written
* permission from Ericsson Inc. or in accordance with the terms and
* conditions stipulated in the agreement/contract under which the
* program(s) have been supplied.
*******************************************************************************
*----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.radio.cfa;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalCallReestablishmentTest extends RadioCorrelationBase {

	private static final String reestablishEnrichWindowName = "ReestablishEnrichWindow";

	private static final String incompleteReestablishUnenrichWindowName = "ReestablishUnenrichWindow";

	private static final int sleepTime = 2000;

	@Before
	public void setupListeners() throws Exception {
		configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/cfa.epl");
		sessionListener = new SupportUpdateListener();
		addStatementAndListener(Statements.REESTABLISH_ENRICHMENT,sessionListener);
		listenToStatements(Statements.CLEANUP_INCOMPLETE_REESTABLISH_ON_CONNECTION_SETUP);
		listenToStatements(Statements.CLEANUP_INCOMPLETE_REESTABLISH_ON_CONNECTION_RELEASE);
		listenToStatements(Statements.CLEANUP_EXPIRED_INCOMPLETE_REESTABLISH);
		listenToStatements(Statements.FLUSH_INCOMPLETE_REESTABLISH);
		listenToStatements(Statements.IMSI_ARRIVES_AFTER_REESTABLISH);
		listenToStatements(Statements.REESTABLISH_CAPTURING);

	}

	@Test
	public void isImsiSetWhenInternalImsiArrivesBeforeInternalCallReestablishment() throws Exception {
		processFile("cfa/callReestablishment/callReestablishment.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			assertThat(event.getIMSI(), is(454063302941012l));
		}
	}

	@Test
	public void isImsiSetWhenInternalImsiArrivesBeforeMultipleInternalCallReestablishment() throws Exception {
		processFile("cfa/callReestablishment/multipleCallReestablishmentAfterImsi.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(5));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			assertThat(event.getIMSI(), is(454063302941012l));
		}
	}

	@Test
	public void isImsiSetWhenInternalImsiArrivesAfterInternalCallReestablishment() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentBeforeImsi.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			assertThat(event.getIMSI(), is(454063302941012l));
		}
	}

	@Test
	public void isImsiSetWhenInternalImsiArrivesInMiddleOfInternalCallReestablishment() throws Exception {
		processFile("cfa/callReestablishment/imsiInMiddleOfCallReestablishment.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(2));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			assertThat(event.getIMSI(), is(454063302941012l));
		}
	}

	@Test
	public void isEventProducedWhenReleaseWithoutImsi() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentWithReleaseWithoutImsi.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		List<? extends Object> reestablishUnenriched = getElementsInWindow(incompleteReestablishUnenrichWindowName);
		assertThat(reestablishUnenriched.size(), is(0));

		List<? extends Object> callReestablishEnriched = getElementsInWindow(reestablishEnrichWindowName);
		assertThat(callReestablishEnriched.size(), is(0));
	}

	@Test
	public void isEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentWithAnotherSetupWithoutImsi.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		List<? extends Object> reestablishUnenriched = getElementsInWindow(incompleteReestablishUnenrichWindowName);
		assertThat(reestablishUnenriched.size(), is(0));

		List<? extends Object> callReestablishEnriched = getElementsInWindow(reestablishEnrichWindowName);
		assertThat(callReestablishEnriched.size(), is(0));
	}

	@Test
	public void testMultipleImsis() throws Exception {
		processFile("cfa/callReestablishment/multipleCallReestablishmentWithMultipleImsis.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(4));

		List<? extends Object> reestablishsUnenriched = getElementsInWindow(incompleteReestablishUnenrichWindowName);
		assertThat(reestablishsUnenriched.size(), is(1));

		List<? extends Object> callReestablishEnriched = getElementsInWindow(reestablishEnrichWindowName);
		assertThat(callReestablishEnriched.size(), is(0));
	}

	@Test
	public void areRabAttributesHandledCorrectly() throws Exception {
		processFile("cfa/callReestablishment/multipleCallReestablishmentWithRabValuesSet.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(4));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			if (event.getBase().getUE_CONTEXT() == 1) {
				validateValues(event,1,0,0,25,1,0,0);
			} else if (event.getBase().getUE_CONTEXT() == 2) {
				validateValues(event,1,1,1,123,1,1,1);
			} else if (event.getBase().getUE_CONTEXT() == 3) {
				validateValues(event,0,1,0,2,0,1,0);
			} else if (event.getBase().getUE_CONTEXT() == 4) {
				validateValues(event,2,0,0,62,1,0,0);
			} 

		}
	}

	@Test
	public void isRoamingSetToTrue() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentForRoamingImsi.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			assertThat(event.getIMSI(), is(111013302941012l));
			assertTrue(event.getROAMING());
		}

	}

	@Test
	public void testSourceConfAndWantedConfWithSameValues() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentWithSameSourceConfAndWantedConf.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			if (event.getBase().getUE_CONTEXT() == 1) {
				validateValues(event,0,0,0,-1,0,0,0);
			} 
		}
	}

	@Test
	public void testWantedConfWithNullValue() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentWithWantedConfEqualToNull.txt");
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		for (INTERNAL_CALL_REESTABLISHMENT_ENRICHED event : events) {
			if (event.getBase().getUE_CONTEXT() == 1) {
				validateValues(event,0,0,0,-1,0,0,0);
			} 
		}
	}

	@Test
	public void isEventProducedOnFlush() throws Exception {
		processFile("cfa/callReestablishment/callReestablishmentForFlush.txt");
		sendFlush();
		Thread.sleep(sleepTime);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(1));

		List<? extends Object> callReestablishmentsUnenriched = getElementsInWindow(incompleteReestablishUnenrichWindowName);
		assertThat(callReestablishmentsUnenriched.size(), is(0));

		List<? extends Object> callReestablishEnriched = getElementsInWindow(reestablishEnrichWindowName);
		assertThat(callReestablishEnriched.size(), is(0));
	}

	@Test
	public void testTimeout() throws Exception {
		processFile("cfa/callReestablishment/multipleCallReestablishmentTimeout.txt");
		Thread.sleep(5000);

		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = getReestablishmentEnrichedEventsCreated();
		assertThat(events.size(), is(10));

		List<? extends Object> callReestablishmentsUnenriched = getElementsInWindow(incompleteReestablishUnenrichWindowName);
		assertThat(callReestablishmentsUnenriched.size(), is(0));

		List<? extends Object> callReestablishEnriched = getElementsInWindow(reestablishEnrichWindowName);
		assertThat(callReestablishEnriched.size(), is(0));
	}

	private void validateValues(final INTERNAL_CALL_REESTABLISHMENT_ENRICHED event,final int psRabFailCnt, final int csRabFailCnt, final int multiRabFailCnt, final int failedRabType, final int psErrCnt, final int csErrCnt, final int multiErrCnt ){
		assertThat(event.getPS_RAB_FAIL_CNT(), is((byte)psRabFailCnt));
		assertThat(event.getCS_RAB_FAIL_CNT(), is((byte)csRabFailCnt));
		assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte)multiRabFailCnt));
		assertThat(event.getFAILED_RAB_TYPE(), is((short)failedRabType));
		assertThat(event.getPS_ERR_CNT(), is((byte)psErrCnt));
		assertThat(event.getCS_ERR_CNT(), is((byte)csErrCnt));
		assertThat(event.getMULTI_ERR_CNT(), is((byte)multiErrCnt));		
	}

	protected List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> getReestablishmentEnrichedEventsCreated() {
		final List<EventBean[]> eventList = sessionListener.getNewDataList();
		final List<INTERNAL_CALL_REESTABLISHMENT_ENRICHED> events = new ArrayList<INTERNAL_CALL_REESTABLISHMENT_ENRICHED>();

		for (final EventBean[] eventBeans : eventList) {
			for (final EventBean eventBean : eventBeans) {
				if (eventBean.getUnderlying() instanceof INTERNAL_CALL_REESTABLISHMENT_ENRICHED) {
					final INTERNAL_CALL_REESTABLISHMENT_ENRICHED event = (INTERNAL_CALL_REESTABLISHMENT_ENRICHED) eventBean.getUnderlying();
					events.add(event);
				}
			}
		}
		return events;
	}
}

