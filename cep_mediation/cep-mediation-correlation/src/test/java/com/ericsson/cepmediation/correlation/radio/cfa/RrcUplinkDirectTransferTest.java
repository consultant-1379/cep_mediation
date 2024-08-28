/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.cfa;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_UPLINK_DIRECT_TRANSFER_ENRICHED;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class RrcUplinkDirectTransferTest extends RadioCorrelationBase {

    private static final String rrcUplinkDTEnrichedWindowName = "RrcUplinkDTEnrichedWindow";

    private static final String rrcUplinkDTUnenrichedWindowName = "RrcUplinkDTUnenrichedWindow";

    private static final int sleepTime = 2000;
    
    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/cfa_hfa_common.epl", "esper/cfa.epl");
        sessionListener = new SupportUpdateListener();
        addStatementAndListener(Statements.RRC_UPLINK_DIRECT_TRANSFER_ENRICHMENT, sessionListener);
        listenToStatements(Statements.INCOMPLETE_RRC_UPLINK_DIRECT_TRANSFER_ENRICHMENT);
    }


    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeRrcUplinkDirectTransfer() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransferAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesBeforeMultipleRrcUplinkDirectTransfer() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/multipleRrcUplinkDirectTransfersAfterImsi.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesAfterRrcUplinkDirectTransfer() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransferBeforeImsi.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void isImsiSetWhenInternalImsiArrivesInMiddleOfRrcUplinkDirectTransfer() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/imsiInMiddleOfRrcUplinkDirectTransfers.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(5));

        for (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063302941012l));
        }
    }

    @Test
    public void noEventProducedWhenReleaseWithoutImsi() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransferWithReleaseWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }

    @Test
    public void noEventProducedWhenAnotherSetupWithoutImsi() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransferWithAnotherSetupWithoutImsi.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }

    @Test
    public void testMultipleImsis() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/multipleRrcUplinkDirectTransfersWithMultipleImsis.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(3));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(1));

        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }

    @Test
    public void testEventsWithNoImeisv() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransfersWithAndWithoutImeisvValue.txt");
        Thread.sleep(sleepTime);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(3));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }

    @Test
    public void isEventProducedOnFlush() throws Exception {
    	processFile("cfa/rrcUplinkDirectTransfer/rrcUplinkDirectTransferForFlush.txt");
    	sendFlush();
    	Thread.sleep(sleepTime);
        
        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(0));
        
        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }
    
    @Test
    public void testTimeout() throws Exception {
        processFile("cfa/rrcUplinkDirectTransfer/multipleRrcUplinkDirectTransfersTimeout.txt");

        Thread.sleep(5000);

        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = getRrcUplinkDirectTransferEnrichedEventsCreated();
        assertThat(events.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersUnenriched = getElementsInWindow(rrcUplinkDTUnenrichedWindowName);
        assertThat(rrcUplinkDirectTransfersUnenriched.size(), is(0));

        List<? extends Object> rrcUplinkDirectTransfersEnriched = getElementsInWindow(rrcUplinkDTEnrichedWindowName);
        assertThat(rrcUplinkDirectTransfersEnriched.size(), is(0));
    }

    protected List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> getRrcUplinkDirectTransferEnrichedEventsCreated() {
        final List<EventBean[]> eventList = sessionListener.getNewDataList();
        final List<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED> events = new ArrayList<RRC_UPLINK_DIRECT_TRANSFER_ENRICHED>();
        for (final EventBean[] eventBeans : eventList) {
            for (final EventBean eventBean : eventBeans) {
                if (eventBean.getUnderlying() instanceof RRC_UPLINK_DIRECT_TRANSFER_ENRICHED) {
                    final RRC_UPLINK_DIRECT_TRANSFER_ENRICHED event = (RRC_UPLINK_DIRECT_TRANSFER_ENRICHED) eventBean.getUnderlying();
                    events.add(event);
                }

            }
        }
        return events;

    }

}