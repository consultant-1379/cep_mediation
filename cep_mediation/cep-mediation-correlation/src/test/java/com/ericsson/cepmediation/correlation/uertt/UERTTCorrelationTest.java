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

package com.ericsson.cepmediation.correlation.uertt;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.RRC_MEASUREMENT_REPORT_ENRICHED;

public class UERTTCorrelationTest extends UERTTCorrelationBaseTest {

    private static final int sleepTime = 2000;
    private static final String RNC_MEASUREMENT_REPORT_ENRICHED_WINDOW = "RrcMeasurementReportEnrichedWindow";
    private static final String NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED_WINDOW = "NbapRadioLinkSetupRequestEnrichedWindow";
    private static final String RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED_WINDOW = "RanapRabAssignmentRequestEnrichedWindow";
    private static final String RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED_WINDOW = "RnsapCommonTransportChannelResourcesReleaseRequestEnrichedWindow";

    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/uertt_raw_events_base.epl","esper/uertt_rrc.epl", "esper/uertt_nbap.epl","esper/uertt_ranap.epl","esper/uertt_rnsap.epl");
        fiveMinuteSessionListener = (UERTTUpdateListener) (Class
                .forName("com.ericsson.cepmediation.correlation.uertt.UERTTUpdateListener")
                .newInstance());
        addStatementAndListener("Imsi-Map-Flush", fiveMinuteSessionListener);

        listenToStatements("Flush-IncompleteRrcMeasurementReport");
        listenToStatements("RrcMeasurementReport-Capturing");
        listenToStatements("Imsi-Arrives-After-RrcMeasurementReport");

        listenToStatements("Flush-IncompleteNbapRadioLinkSetupRequest");
        listenToStatements("NbapRadioLinkSetupRequest-Capturing");
        listenToStatements("Imsi-Arrives-After-NbapRadioLinkSetupRequest");

        listenToStatements("Flush-IncompleteRanapRabAssignmentRequest");
        listenToStatements("RanapRabAssignmentRequest-Capturing");
        listenToStatements("Imsi-Arrives-After-RanapRabAssignmentRequest");

        listenToStatements("Flush-IncompleteRnsapCommonTransportChannelResourcesReleaseRequest");
        listenToStatements("RnsapCommonTransportChannelResourcesReleaseRequest-Capturing");
        listenToStatements("Imsi-Arrives-After-RnsapCommonTransportChannelResourcesReleaseRequest");

    }

    @Test
    public void isImsiSetRrcMeasurementReport() throws Exception {
        processFile("uertt/rrcEvents.txt");
        Thread.sleep(sleepTime);
        final List<RRC_MEASUREMENT_REPORT_ENRICHED> events = getRRCEnrichedEventsCreated();
        assertThat(events.size(), is(2));

        for (RRC_MEASUREMENT_REPORT_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063307052466l));
        }
    }

    protected List<RRC_MEASUREMENT_REPORT_ENRICHED> getRRCEnrichedEventsCreated() {
        try {
            final List<RRC_MEASUREMENT_REPORT_ENRICHED> events = new ArrayList<RRC_MEASUREMENT_REPORT_ENRICHED>();
            List lst = getElementsInWindow(RNC_MEASUREMENT_REPORT_ENRICHED_WINDOW);
            for (Object object : lst) {
                if (object instanceof RRC_MEASUREMENT_REPORT_ENRICHED) {
                    final RRC_MEASUREMENT_REPORT_ENRICHED event = (RRC_MEASUREMENT_REPORT_ENRICHED) object;
                    events.add(event);
                }
            }
            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void isImsiSetNBAP_RADIO_LINK_SETUP_REQUEST() throws Exception {
        processFile("uertt/nbapEvents.txt");
        Thread.sleep(sleepTime);
        final List<NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED> events = getNBAPEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063307052466l));
        }
    }

    protected List<NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED> getNBAPEnrichedEventsCreated() {
        try {
            final List<NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED> events = new ArrayList<NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED>();
            List lst = getElementsInWindow(NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED_WINDOW);
            for (Object object : lst) {
                if (object instanceof NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED) {
                    final NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED event = (NBAP_RADIO_LINK_SETUP_REQUEST_ENRICHED) object;
                    events.add(event);
                }
            }
            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void isImsiSetRANAP_RAB_ASSIGNMENT_REQUEST() throws Exception {
        processFile("uertt/ranapEvents.txt");
        Thread.sleep(sleepTime);
        final List<RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED> events = getRANAPEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063307052466l));
        }
    }

    protected List<RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED> getRANAPEnrichedEventsCreated() {
        try {
            final List<RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED> events = new ArrayList<RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED>();
            List lst = getElementsInWindow(RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED_WINDOW);
            for (Object object : lst) {
                if (object instanceof RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED) {
                    final RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED event = (RANAP_RAB_ASSIGNMENT_REQUEST_ENRICHED) object;
                    events.add(event);
                }
            }
            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void isImsiSetRNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST()
            throws Exception {
        processFile("uertt/rnsapEvents.txt");
        Thread.sleep(sleepTime);
        final List<RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED> events = getRNSAPEnrichedEventsCreated();
        assertThat(events.size(), is(1));

        for (RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED event : events) {
            assertThat(event.getIMSI(), is(454063307052466l));
        }
    }

    protected List<RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED> getRNSAPEnrichedEventsCreated() {
        try {
            final List<RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED> events = new ArrayList<RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED>();
            List lst = getElementsInWindow(RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED_WINDOW);
            for (Object object : lst) {
                if (object instanceof RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED) {
                    final RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED event = (RNSAP_COMMON_TRANSPORT_CHANNEL_RESOURCES_RELEASE_REQUEST_ENRICHED) object;
                    events.add(event);
                }
            }
            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
