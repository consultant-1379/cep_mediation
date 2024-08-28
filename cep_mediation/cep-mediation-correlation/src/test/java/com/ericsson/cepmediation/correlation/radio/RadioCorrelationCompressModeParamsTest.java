/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_ACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CMODE_DEACTIVATE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.utils.EventCreator;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * 
 * @author emicned
 *
 */
public class RadioCorrelationCompressModeParamsTest extends RadioCorrelationBase {

    private static final byte ULDL_TYPE = 1;

    private static final byte UL_TYPE = 2;

    private static final byte DL_TYPE = 0;

    private long sessionStart;

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        final Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 0);
        sessionStart = cal.getTimeInMillis();
    }

    @Test
    public void shouldInitCmCountersWithZero() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 10);
        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 20);
        sendEvent(GpehEventType.INTERNAL_FAILED_HSDSCH_CELL_CHANGE, sessionStart + 30);
        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_CNT() == 0);
        assertTrue(sess.getCM_DL_CNT() == 0);
        assertTrue(sess.getCM_UL_CNT() == 0);
        assertTrue(sess.getCM_ULDL_CNT() == 0);
    }

    @Test
    public void shouldIncrementCmCounters() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        sendEvent(GpehEventType.INTERNAL_CMODE_DEACTIVATE, sessionStart + 8);

        final INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                sessionStart + 10, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);
        correlationEngine.sendEvent(activateEvent);
        correlationEngine.sendEvent(activateEvent);

        activateEvent.setCM_TYPE(UL_TYPE);
        correlationEngine.sendEvent(activateEvent);
        correlationEngine.sendEvent(activateEvent);

        activateEvent.setCM_TYPE(ULDL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CMODE_DEACTIVATE, sessionStart + 12);
        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_CNT() == 6);
        assertTrue(sess.getCM_DL_CNT() == 3);
        assertTrue(sess.getCM_UL_CNT() == 2);
        assertTrue(sess.getCM_ULDL_CNT() == 1);
    }

    @Test
    public void shouldComputeCmDurationWhenActivateAndDeactivateWithinTheSession() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        final INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                sessionStart + 10, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, sessionStart + 11);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, sessionStart + 12);

        final INTERNAL_CMODE_DEACTIVATE deactivateEvent = (INTERNAL_CMODE_DEACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_DEACTIVATE,
                cellId, sessionStart + 10 + 30, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(deactivateEvent);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_DURATION() == 30);
    }

    @Test
    public void shouldComputeCmDurationWhenMultipleActivateAndDeactivatesWithinTheSession() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                sessionStart + 10, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, sessionStart + 11);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, sessionStart + 12);

        INTERNAL_CMODE_DEACTIVATE deactivateEvent = (INTERNAL_CMODE_DEACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_DEACTIVATE, cellId,
                sessionStart + 10 + 30, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(deactivateEvent);

        activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, sessionStart + 10 + 30 + 5, rncId,
                rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, sessionStart + 10 + 30 + 5 + 1);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, sessionStart + 10 + 30 + 5 + 2);

        deactivateEvent = (INTERNAL_CMODE_DEACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_DEACTIVATE, cellId, sessionStart + 10 + 30 + 5
                + 70, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(deactivateEvent);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_DURATION() == 100);
    }

    @Test
    public void shouldComputeCmDurationWhenOnlyActivateAndRrcConnectionComplete() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        final long activateTimestamp = sessionStart + 10;
        final INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                activateTimestamp, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, sessionStart + 11);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, sessionStart + 12);

        final long rrcReleaseTimestamp = sessionStart + 12000;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, rrcReleaseTimestamp);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_DURATION() == (rrcReleaseTimestamp - activateTimestamp));
    }

    @Test
    public void shouldComputeCmDurationWhenOnlyActivateSessionEnd() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        final long activateTimestamp = sessionStart + 10;
        final INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                activateTimestamp, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(GpehEventType.INTERNAL_CHANNEL_SWITCHING, sessionStart + 11);
        sendEvent(GpehEventType.RRC_MEASUREMENT_REPORT, sessionStart + 12);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_DURATION() == (sess.getSESSION_END() - activateTimestamp));
    }

    @Test
    public void shouldComputeCmDurationCarryOver() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        final long activateTimestamp = sessionStart + 10;
        final INTERNAL_CMODE_ACTIVATE activateEvent = (INTERNAL_CMODE_ACTIVATE) createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId,
                activateTimestamp, rncId, rncModuleId, ueContext);
        activateEvent.setCM_TYPE(DL_TYPE);
        correlationEngine.sendEvent(activateEvent);

        sendEvent(EventCreator.createRRCMeasurementReportEvent(sessionStart + 12));

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getCM_DURATION() == (sess.getSESSION_END() - activateTimestamp));

        final long cmStart = sess.getSESSION_END();

        final long cmDuration = 13000;
        sendEvent(GpehEventType.INTERNAL_CMODE_DEACTIVATE, cmStart + cmDuration);

        final long cmStart1 = cmStart + cmDuration + 10000;
        sendEvent(GpehEventType.INTERNAL_CMODE_ACTIVATE, cmStart1);
        final long cmDuration1 = 5000;
        sendEvent(GpehEventType.INTERNAL_CMODE_DEACTIVATE, cmStart1 + cmDuration1);
        // flush
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions1 = getSessionsCreated();
        assertThat(sessions1.size(), is(2));

        final GPEH_SESSION sess1 = sessions1.get(1);
        assertEquals(cmDuration + cmDuration1, sess1.getCM_DURATION());
    }

    private void flush() {
        // this last event will send the session to the update listener
        correlationEngine.sendEvent(new SessionEndEvent());
    }

    private void sendRabEstEvent(final long increment) {
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                increment, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF((byte) 4);
        correlationEngine.sendEvent(ire);
    }

    private void sendEvent(final GpehEventType eventType, final long startTime) {
        correlationEngine.sendEvent(createRadioEventsWithParams(eventType, cellId, startTime, rncId, rncModuleId, ueContext));
    }
}
