/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class InternalSystemReleaseTest extends RadioCorrelationBase {

    private static final String CFA_SYSTEM_RELEASE_URA_PCH_TXT_FILE = "cfa/systemRelease/URA_PCH_systemRelease.txt";
    private static final String CFA_SYSTEM_RELEASE_WHITELIST_TXT_FILE = "cfa/systemRelease/systemReleaseWhitelist.txt";
    private static final String CFA_SYSTEM_RELEASE_TXT_FILE = "cfa/systemRelease/systemRelease.txt";
    private static final String CFA_EPL = "esper/cfa.epl";
    private static final String CFA_HFA_COMMON_EPL = "esper/cfa_hfa_common.epl";
    private static final String RAW_EVENTS_BASE_EPL = "esper/raw_events_base.epl";
    private static final int sleepTime = 2000;

    @Before
    public void setupListeners() throws Exception {
        configureEsper(RAW_EVENTS_BASE_EPL, CFA_HFA_COMMON_EPL, CFA_EPL);
        sessionListener = new SupportUpdateListener();
        addStatementAndListener(Statements.SYSTEM_RELEASE_ENRICHMENT, sessionListener);
    }

    @Test
    public void testSystemReleaseEventsAreHandledCorrectly() throws Exception {

        processFile(CFA_SYSTEM_RELEASE_TXT_FILE);
        Thread.sleep(sleepTime);

        final List<INTERNAL_SYSTEM_RELEASE_ENRICHED> events = getSystemReleaseEnrichedEventsCreated();
        assertThat(events.size(), is(6));

        for (INTERNAL_SYSTEM_RELEASE_ENRICHED event : events) {
            if (event.getBase().getUE_CONTEXT() == 5) {
                assertThat(event.getIMSI(), is(454063302941011l));
                assertThat(event.getIMSI_MCC(), is("454"));
                assertThat(event.getIMSI_MNC(), is("06"));
            } else if (event.getBase().getUE_CONTEXT() == 6) {
                assertThat(event.getIMSI(), is(454063302941012l));
            } else if (event.getBase().getUE_CONTEXT() == 7) {
                assertThat(event.getIMSI(), is(454063302941013l));
            } else if (event.getBase().getUE_CONTEXT() == 8) {
                assertThat(event.getIMSI(), is(DefaultValues.DEFAULT_LONG_VALUE));
                assertNull(event.getIMSI_MCC());
                assertNull(event.getIMSI_MNC());
            } else if (event.getBase().getUE_CONTEXT() == 20) {
                assertThat(event.getIMSI(), is(111013302941011l));
                assertTrue(event.getROAMING());
            } else {
                assertThat(event.getIMSI(), is(DefaultValues.DEFAULT_LONG_VALUE));
            }

        }
    }

    @Test
    public void areWhitelistEntriesIgnoredForInternalSystemRelease() throws Exception {
        processFile(CFA_SYSTEM_RELEASE_WHITELIST_TXT_FILE);

        Thread.sleep(sleepTime);// To allow for unenriched events to be output also

        final List<INTERNAL_SYSTEM_RELEASE_ENRICHED> events = getSystemReleaseEnrichedEventsCreated();
        assertThat(events.size(), is(0));

    }

    @Test
    public void areURAPCHEntriesIgnoredForInternalSystemRelease() throws Exception {
        processFile(CFA_SYSTEM_RELEASE_URA_PCH_TXT_FILE);

        Thread.sleep(sleepTime);

        final List<INTERNAL_SYSTEM_RELEASE_ENRICHED> events = getSystemReleaseEnrichedEventsCreated();
        assertThat(events.size(), is(0));

    }

    @Test
    public void areRabAttributesHandledCorrectly() throws Exception {

        processFile(CFA_SYSTEM_RELEASE_TXT_FILE);
        Thread.sleep(sleepTime);

        final List<INTERNAL_SYSTEM_RELEASE_ENRICHED> events = getSystemReleaseEnrichedEventsCreated();
        assertThat(events.size(), is(6));

        for (INTERNAL_SYSTEM_RELEASE_ENRICHED event : events) {
            if (event.getBase().getUE_CONTEXT() == 5) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte) 1));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short) 25));
                assertThat(event.getPS_ERR_CNT(), is((byte) 1));
                assertThat(event.getCS_ERR_CNT(), is((byte) 0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte) 0));
            } else if (event.getBase().getUE_CONTEXT() == 6) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte) 1));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte) 1));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte) 1));
                assertThat(event.getFAILED_RAB_TYPE(), is((short) 123));
                assertThat(event.getPS_ERR_CNT(), is((byte) 1));
                assertThat(event.getCS_ERR_CNT(), is((byte) 1));
                assertThat(event.getMULTI_ERR_CNT(), is((byte) 1));
            } else if (event.getBase().getUE_CONTEXT() == 7) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte) 1));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short) 2));
                assertThat(event.getPS_ERR_CNT(), is((byte) 0));
                assertThat(event.getCS_ERR_CNT(), is((byte) 1));
                assertThat(event.getMULTI_ERR_CNT(), is((byte) 0));
            } else if (event.getBase().getUE_CONTEXT() == 8) {
                assertThat(event.getPS_RAB_FAIL_CNT(), is((byte) 2));
                assertThat(event.getCS_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getMULTI_RAB_FAIL_CNT(), is((byte) 0));
                assertThat(event.getFAILED_RAB_TYPE(), is((short) 62));
                assertThat(event.getPS_ERR_CNT(), is((byte) 1));
                assertThat(event.getCS_ERR_CNT(), is((byte) 0));
                assertThat(event.getMULTI_ERR_CNT(), is((byte) 0));
            }

        }
    }

    protected List<INTERNAL_SYSTEM_RELEASE_ENRICHED> getSystemReleaseEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<INTERNAL_SYSTEM_RELEASE_ENRICHED> events = new ArrayList<INTERNAL_SYSTEM_RELEASE_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof INTERNAL_SYSTEM_RELEASE_ENRICHED) {
                    final INTERNAL_SYSTEM_RELEASE_ENRICHED event = (INTERNAL_SYSTEM_RELEASE_ENRICHED) eventBean.getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

}