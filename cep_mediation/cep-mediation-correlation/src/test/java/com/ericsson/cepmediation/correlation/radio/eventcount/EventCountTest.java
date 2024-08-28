/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.eventcount;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.tools.ExpectedEventCounter;

/**
 * @author EEMECOY
 *
 */
public class EventCountTest extends RadioCorrelationBase {

    private final List<GpehEventType> eventsInSession = new ArrayList<GpehEventType>();

    private final short ueContext1 = 6809;

    private final short ueContext2 = 5839;

    private final long imsi = 454064500549040L;

    @Before
    public void setup() throws Exception {
        rncId = 9;
        rncModuleId = 28;
        cellId = 3;
        configure("esper/rc.epl");
        System.currentTimeMillis();
    }

    @Test
    public void testEventCountIsCorrectForCarriedOverSession() throws Exception {
        setUpEventSequenceForCarriedOverSession();
        final GPEH_SESSION session = getSingleGpehSessionCreated();
        final int expectedEventCount = new ExpectedEventCounter().calculateExpectedEventCountForEventTypes(eventsInSession);
        assertThat(session.getEVENT_CNT(), is(expectedEventCount));

    }

    private void setUpEventSequenceForCarriedOverSession() throws ParseException {
        createAndSendEvent("2012-05-16 16:47:10.035", GpehEventType.RRC_RRC_CONNECTION_SETUP, ueContext1);
        createAndSendIMSIEvent("2012-05-16 16:47:10.628", ueContext1);
        createAndSendEvent("2012-05-16 16:47:10.676", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:11.288", GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, ueContext1);
        createAndSendEvent("2012-05-16 16:47:11.288", GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE, ueContext1);
        createAndSendEvent("2012-05-16 16:47:11.306", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:11.786", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:11.796", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:12.449", GpehEventType.INTERNAL_RAB_ESTABLISHMENT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:15.692", GpehEventType.INTERNAL_CHANNEL_SWITCHING, ueContext1);
        createAndSendEvent("2012-05-16 16:47:16.016", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:16.296", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:16.650", GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, ueContext1);
        createAndSendEvent("2012-05-16 16:47:17.016", GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, ueContext1);
        createAndSendEvent("2012-05-16 16:47:22.936", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext1);
        createAndSendEvent("2012-05-16 16:47:23.227", GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, ueContext1);
        createAndSendEvent("2012-05-16 16:47:27.281", GpehEventType.INTERNAL_CHANNEL_SWITCHING, ueContext1);
        createAndSendEvent("2012-05-16 16:48:20.602", GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, ueContext1);
        createAndSendEvent("2012-05-16 16:48:20.968", GpehEventType.INTERNAL_CHANNEL_SWITCHING, ueContext1);

        createAndSendEvent("2012-05-16 16:49:43.647", GpehEventType.RRC_RRC_CONNECTION_SETUP, ueContext2);
        createAndSendIMSIEvent("2012-05-16 16:49:44.247", ueContext2);
        createAndSendEvent("2012-05-16 16:49:44.290", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:45.019", GpehEventType.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED, ueContext2);
        createAndSendEvent("2012-05-16 16:49:45.019", GpehEventType.INTERNAL_OUT_HARD_HANDOVER_FAILURE, ueContext2);
        createAndSendEvent("2012-05-16 16:49:45.030", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:45.401", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:45.440", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:46.204", GpehEventType.INTERNAL_RAB_ESTABLISHMENT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:49.444", GpehEventType.INTERNAL_CHANNEL_SWITCHING, ueContext2);
        createAndSendEvent("2012-05-16 16:49:51.650", GpehEventType.RRC_MEASUREMENT_REPORT, ueContext2);
        createAndSendEvent("2012-05-16 16:49:52.204", GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, ueContext2);
        createAndSendEvent("2012-05-16 16:49:53.857", GpehEventType.INTERNAL_CHANNEL_SWITCHING, ueContext2);

        createAndSendEndEvent("2012-05-16 16:50:00.000");

    }

    private void createAndSendIMSIEvent(final String timestamp, final short ueContextForEvent) throws ParseException {
        final INTERNAL_IMSI imsiEvent = new INTERNAL_IMSI();
        imsiEvent.setTimestamp(getTimeFromTimestamp(timestamp));
        imsiEvent.setIMSI(Long.toString(imsi));
        imsiEvent.setUE_CONTEXT(ueContextForEvent);
        imsiEvent.setRNC_MODULE_ID(rncModuleId);
        sendEvent(imsiEvent);
    }

    private void createAndSendEndEvent(final String timestampInDateFormat) throws ParseException {
        final long timestamp = getTimeFromTimestamp(timestampInDateFormat);
        createAndSendEndEvent(timestamp);
    }

    private void createAndSendEndEvent(final long timestamp) {
        correlationEngine.sendEvent(new SessionEndEvent(timestamp));
    }

    private void createAndSendEvent(final String timestampAsString, final GpehEventType eventType, final short ueContextForEvent) throws ParseException {
        final long timestampAsLong = getTimeFromTimestamp(timestampAsString);
        createAndSendEvent(timestampAsLong, eventType, ueContextForEvent);
    }

    private long getTimeFromTimestamp(final String timestampAsString) throws ParseException {
        final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        final Date date = dateFormatter.parse(timestampAsString);
        return date.getTime();
    }

    private void createAndSendEvent(final long timestamp, final GpehEventType eventType, final short ueContextForEvent) {
        eventsInSession.add(eventType);
        final GpehBase event = createRadioEventsWithParams(eventType, cellId, timestamp, rncId, rncModuleId, ueContextForEvent);
        if (eventType == GpehEventType.INTERNAL_RAB_ESTABLISHMENT) {
            final INTERNAL_RAB_ESTABLISHMENT rabEvent = (INTERNAL_RAB_ESTABLISHMENT) event;
            rabEvent.setTARGET_CONF((short) 4);
        }
        sendEvent(event);

    }

}
