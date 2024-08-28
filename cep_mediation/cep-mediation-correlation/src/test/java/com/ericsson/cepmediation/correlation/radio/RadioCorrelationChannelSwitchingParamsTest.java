/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static com.ericsson.cepmediation.correlation.Constants.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CHANNEL_SWITCHING;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.test.common.GpehEventType;

/**
 * 
 * @author emicned
 *
 */
public class RadioCorrelationChannelSwitchingParamsTest extends RadioCorrelationBase {
    private static final byte REASON_OTHER = 6;

    private static final byte REASON_QUEUE = 2;

    private static final byte REASON_QOS_1 = 12;

    private static final byte REASON_QOS_2 = 13;

    private static final byte REASON_COVERAGE = 3;

    private static final byte REASON_CAPACITY = 0;

    private static final byte REASON_CAPACITY_UPSWITCH = 7;

    private static final byte REASON_UE_ACTIVITY = 5;

    private long sessionStart;

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        final Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 0);
        sessionStart = cal.getTimeInMillis();
    }

    @Test
    public void shouldInitChannelSwitchingCountersWithZero() {
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
        assertEquals(0, sess.getCS_REASON_OTHER());

        assertEquals(0, sess.getCS_REASON_QUEUE());
        assertEquals(0, sess.getCS_REASON_QOS_DCH());
        assertEquals(0, sess.getCS_REASON_MOBILITY_COVERAGE());
        assertEquals(0, sess.getCS_REASON_CAPACITY());
        assertEquals(0, sess.getCS_REASON_UE_ACTIVITY());
        assertEquals(0, sess.getCDS_SUCC_CNT());
        assertEquals(0, sess.getCUS_SUCC_CNT());
        assertEquals(0, sess.getACTIVITY_DURATION());
        assertEquals(0, sess.getHS_DURATION());
        assertEquals(0, sess.getEUL_DURATION());
    }

    @Test
    public void shouldIncrementChannelSwitchingCounters() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, sessionStart + 10, rncId, rncModuleId, ueContext);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_CAPACITY);
        switchEvent.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        switchEvent.setCHANNEL_SWITCH_REASON(REASON_CAPACITY_UPSWITCH);
        correlationEngine.sendEvent(switchEvent);
        switchEvent.setEXCEPTION_CLASS((short) 0);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_OTHER);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_COVERAGE);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_QOS_1);
        correlationEngine.sendEvent(switchEvent);
        switchEvent.setCHANNEL_SWITCH_REASON(REASON_QOS_2);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_QUEUE);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setCHANNEL_SWITCH_REASON(REASON_UE_ACTIVITY);
        correlationEngine.sendEvent(switchEvent);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(7, sess.getCS_REASON_CAPACITY());
        assertEquals(2, sess.getCUS_ATT_CNT());
        assertEquals(1, sess.getCUS_SUCC_CNT());
        assertEquals(6, sess.getCS_REASON_OTHER());
        assertEquals(4, sess.getCS_REASON_MOBILITY_COVERAGE());
        assertEquals(3, sess.getCS_REASON_QOS_DCH());
        assertEquals(2, sess.getCS_REASON_QUEUE());
        assertEquals(1, sess.getCS_REASON_UE_ACTIVITY());
    }

    @Test
    public void shouldComputeRatiosOneRrcSession() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        long dchDuration = 543;
        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, sessionStart + 10, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setTimestamp(sessionStart + 10 + dchDuration);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setTARGET_CONF(HS_EUL_RAB);
        switchEvent.setTimestamp(sessionStart + 10 + dchDuration + 77);
        correlationEngine.sendEvent(switchEvent);

        dchDuration += 9999;
        switchEvent.setTimestamp(sessionStart + 10 + dchDuration + 77);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setTARGET_CONF(NON_HS_NON_EUL_RAB);
        switchEvent.setTimestamp(sessionStart + 10 + dchDuration + 77 + 437);
        correlationEngine.sendEvent(switchEvent);

        dchDuration += 43;
        switchEvent.setTimestamp(sessionStart + 10 + dchDuration + 77 + 437);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(dchDuration, sess.getACTIVITY_DURATION());
        assertTrue(((float) dchDuration / sess.getRRC_DURATION()) - sess.getACTIVITY() == 0);
        assertTrue(1 - sess.getHS_RATIO() < 0.1);
        assertTrue(((float) 9999 / dchDuration) - sess.getEUL_RATIO() == 0);
    }

    @Test
    public void shouldComputeRatiosTwoRrcSessions() {

        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext1 = 1;
        final short ueContext2 = 2;
        final long timeStamp1 = 1;

        setUpRrcRabSession(cellId, imsi, timeStamp1, SRB, HS_EUL_RAB_1, ueContext1, rncModuleId);
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 1000, rncModuleId, ueContext1, HS_EUL_RAB_1, FACH_RACH)); // A 800, H 800, E 800
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 2000, rncModuleId, ueContext1, FACH_RACH, HS_EUL_RAB_1)); // A 800, H 800, E 800
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 3000, rncModuleId, ueContext1, HS_EUL_RAB_1, PS_384_384)); // A 1800, H 1800, E 1800
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 5000, rncModuleId, ueContext1, PS_384_384, FACH_RACH)); // A 3800, H 1800, E 1800
        closeRrcSession(cellId, timeStamp1 + 5000, ueContext1, rncModuleId); // RRC 5000

        setUpRrcRabSession(cellId, imsi, timeStamp1 + 10000, SRB, HS_EUL_RAB_1, ueContext2, rncModuleId);
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 20000, rncModuleId, ueContext2, HS_EUL_RAB_1, FACH_RACH)); // A 13600, H 11600, E 11600
        closeRrcSession(cellId, timeStamp1 + 50000, ueContext2, rncModuleId); // RRC 45000

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getACTIVITY_DURATION(), is(13600));
        assertThat(sess.getACTIVITY(), is((float) (13600 / 45000.0)));
        assertThat(sess.getHS_DURATION(), is(11600));
        assertThat(sess.getHS_RATIO(), is((float) (11600 / 13600.0)));
        assertThat(sess.getEUL_DURATION(), is(11600));
        assertThat(sess.getEUL_RATIO(), is((float) (11600 / 13600.0)));
    }

    @Test
    public void shouldComputeActivityDurationOneRrcSessionTerminatedByConnectionRelease() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);

        long dchDuration = 543;
        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, sessionStart + 10, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setTimestamp(sessionStart + 10 + dchDuration);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);

        switchEvent.setTARGET_CONF(HS_RAB);
        switchEvent.setTimestamp(sessionStart + 10 + dchDuration + 77);
        correlationEngine.sendEvent(switchEvent);

        dchDuration += 9999;
        final INTERNAL_SYSTEM_RELEASE sysRelease = (INTERNAL_SYSTEM_RELEASE) createRadioEventsWithParams(GpehEventType.INTERNAL_SYSTEM_RELEASE, cellId,
                sessionStart + 10 + dchDuration + 77, rncId, rncModuleId, ueContext);
        sysRelease.setTARGET_CONF(NON_PS_RAB);
        correlationEngine.sendEvent(sysRelease);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(((float) dchDuration / sess.getRRC_DURATION()) - sess.getACTIVITY() == 0);
    }

    @Test
    public void shouldComputeActivityDurationOneRrcSessionRabEstablishmentInHs() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);

        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                sessionStart + 12, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(ire);

        long dchDuration = 543;
        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, sessionStart + 12 + dchDuration, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(switchEvent);

        dchDuration += 998;
        switchEvent.setTimestamp(sessionStart + 12 + dchDuration);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);

        flush();

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);

        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(((float) dchDuration / sess.getRRC_DURATION()) - sess.getACTIVITY() < 0.1);
    }

    @Test
    public void shouldComputeActivityDurationCarryOver() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                sessionStart + 12, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(ire);

        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, sessionStart + 66666, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(HS_RAB);
        correlationEngine.sendEvent(switchEvent);

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertEquals(1, sessions.size());

        final GPEH_SESSION sess = sessions.get(0);
        final float dchDuration = sess.getSESSION_END() - (sessionStart + 66666);
        assertTrue((dchDuration / sess.getRRC_DURATION()) - sess.getACTIVITY() == 0);

        final long dchDuration1 = 1998;
        switchEvent.setTimestamp(sess.getSESSION_END() + dchDuration1);
        switchEvent.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions1 = getSessionsCreated();
        assertTrue(sessions1.size() == 2);

        final GPEH_SESSION sess1 = sessions1.get(1);
        assertTrue(((float) dchDuration1 / sess1.getRRC_DURATION()) - sess1.getACTIVITY() == 0);

    }

    @Test
    public void shouldComputeActivityWhenSwitchIndicatesPsRabReleasedBeforeCarryOverAndNewConnectionAfterCarryOver() {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId, imsi, timeStamp1, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 1000, rncModuleId, ueContext, HS_EUL_RAB_1, PS_CS_RAB));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp1 + 2000, rncModuleId, ueContext, PS_CS_RAB, CS_RAB));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        closeRrcSession(cellId, timeStamp2 + 1000, ueContext, rncModuleId); // rrc 1001
        setUpRrcRabSession(cellId, imsi, timeStamp2 + 150000, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);
        closeRrcSession(cellId, timeStamp2 + 150000 + 1000, ueContext, rncModuleId); // rrc 1000
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess1 = sessions.get(0);
        assertThat(sess1.getACTIVITY_DURATION(), is(1800));
        assertThat(Math.round(sess1.getACTIVITY() * 1000.0) / 1000.0, is(Math.round(1800.0 * 1000.0 / 300000.0) / 1000.0));
        assertThat(sess1.getACTIVITY_START(), is(-1l));

        final GPEH_SESSION sess2 = sessions.get(1);
        assertThat(sess2.getACTIVITY_DURATION(), is(800));
        assertThat(sess2.getACTIVITY(), is((float) (800.0 / 2001.0)));
        assertThat(sess2.getACTIVITY_START(), is(-1l));

    }

    @Test
    public void shouldComputePsRabDuration() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        final long rabStart = sessionStart + 12;
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                rabStart, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(ire);

        final int psRabDuration = 534645;
        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(NON_PS_RAB);

        correlationEngine.sendEvent(switchEvent);

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertEquals(1, sessions.size());

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(psRabDuration, sess.getPS_RAB_DURATION());
    }

    @Test
    public void shouldComputeEndRabWhenSwitchtoPsRab() {

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        final long rabStart = sessionStart + 12;
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                rabStart, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(ire);

        final int psRabDuration = 534645;
        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent.setTARGET_CONF(HS_EUL_RAB_1);

        correlationEngine.sendEvent(switchEvent);

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertEquals(1, sessions.size());

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(HS_EUL_RAB_1, sess.getEND_RAB());
    }

    @Test
    public void shouldComputeEndRabWhenSwitchtoIdle() {

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        final long rabStart = sessionStart + 12;
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                rabStart, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(ire);

        final int psRabDuration = 534645;
        final INTERNAL_CHANNEL_SWITCHING switchEvent1 = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent1.setSOURCE_CONF(FACH_RACH);
        switchEvent1.setTARGET_CONF(HS_EUL_RAB_1);
        correlationEngine.sendEvent(switchEvent1);

        final INTERNAL_CHANNEL_SWITCHING switchEvent2 = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent2.setSOURCE_CONF(HS_EUL_RAB_1);
        switchEvent2.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(switchEvent2);

        final INTERNAL_CHANNEL_SWITCHING switchEvent3 = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent3.setSOURCE_CONF(FACH_RACH);
        switchEvent3.setTARGET_CONF(IDLE);
        correlationEngine.sendEvent(switchEvent3);

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertEquals(1, sessions.size());

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(FACH_RACH, sess.getEND_RAB());
    }

    @Test
    public void shouldComputeEndRabWhenSwitchIndicatesPsRabReleased() {

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 2);
        final long rabStart = sessionStart + 12;
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                rabStart, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(CS_RAB);
        correlationEngine.sendEvent(ire);

        final int psRabDuration = 534645;
        final INTERNAL_RAB_ESTABLISHMENT interRabEstab = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, rabStart, rncId, rncModuleId, ueContext);
        interRabEstab.setSOURCE_CONF(CS_RAB);
        interRabEstab.setTARGET_CONF(PS_CS_RAB);
        correlationEngine.sendEvent(interRabEstab);

        final INTERNAL_CHANNEL_SWITCHING switchEvent = (INTERNAL_CHANNEL_SWITCHING) createRadioEventsWithParams(GpehEventType.INTERNAL_CHANNEL_SWITCHING,
                cellId, rabStart + psRabDuration, rncId, rncModuleId, ueContext);
        switchEvent.setSOURCE_CONF(PS_CS_RAB);
        switchEvent.setTARGET_CONF(CS_RAB);
        correlationEngine.sendEvent(switchEvent);

        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertEquals(1, sessions.size());

        final GPEH_SESSION sess = sessions.get(0);
        assertEquals(PS_CS_RAB, sess.getEND_RAB());
    }

    @Test
    public void shouldComputeActivityWhenPsRabfollowedByCsRabEstablishment() {

        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext = 1;
        final long timeStamp1 = 1;

        setUpRrcRabSession(cellId, imsi, timeStamp1, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 20000, rncId, rncModuleId, ueContext, HS_EUL_RAB_1, PS_CS_RAB));
        closeRrcSession(cellId, timeStamp1 + 30000, ueContext, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getACTIVITY_DURATION(), is(29800));
        assertThat(Math.round(sess.getACTIVITY() * 1000.0) / 1000.0, is(Math.round(29800.0 * 1000.0 / 30000.0) / 1000.0));
        assertThat(sess.getACTIVITY_START(), is(-1l));

    }

    private void flush() {
        // this last event will send the session to the update listener
        correlationEngine.sendEvent(new SessionEndEvent(Long.MAX_VALUE));
    }

    private void sendRabEstEvent(final long increment) {
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                increment, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        correlationEngine.sendEvent(ire);
    }

    private void sendEvent(final GpehEventType eventType, final long startTime) {
        correlationEngine.sendEvent(createRadioEventsWithParams(eventType, cellId, startTime, rncId, rncModuleId, ueContext));
    }

    private void setUpRrcRabSession(final int cellId, final String imsi, final long timestamp, final short sourceConf, final short targetConf,
            final short ueContext, final byte rncModuleId) {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timestamp, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timestamp + 100, rncId, rncModuleId, ueContext, imsi));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timestamp + 200, rncId, rncModuleId, ueContext, sourceConf, targetConf));
    }

    private void closeRrcSession(final int cellId, final long timeStamp, final short ueContext, final byte rncModuleId) {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp, rncId, rncModuleId,
                ueContext));

    }
}
