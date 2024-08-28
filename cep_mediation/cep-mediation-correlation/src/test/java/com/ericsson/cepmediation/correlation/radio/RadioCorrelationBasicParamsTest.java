package com.ericsson.cepmediation.correlation.radio;

import static com.ericsson.cepmediation.correlation.Constants.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.correlation.enrichment.EnhancedGpehSession;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.espertech.esper.client.EPOnDemandQueryResult;
import com.espertech.esper.client.EventBean;

public class RadioCorrelationBasicParamsTest extends RadioCorrelationBase {
	
	private static final String windowName = "RadioSessionWindow";

    @Before
    public void warmUp() throws Exception {
        configure("esper/rc.epl");
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void testImsimccAndImsiMncArePopulatedAtStart() throws Exception {
        ueContext = 1;
        rncModuleId = 1;
        final String imsi = "454061111111111";
        final short sourceConf = 1;
        final short targetConf = 25;
        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, getTimestamp(), rncId, rncModuleId, ueContext));
        sendEvent(createImsiEventsWithParams(cellId, getTimestamp() + 100, rncId, rncModuleId, ueContext, imsi));
        sendEvent(createRabEventsWithParams(cellId, getTimestamp() + 100, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(new SessionEndEvent(getTimestamp() + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertTrue(sessions.size() == 1);
        final GPEH_SESSION sess = sessions.get(0);
        assertTrue(sess.getIMSI_MCC().equals("454"));
        assertTrue(sess.getIMSI_MNC().equals("06"));
    }

    @Test
    public void testImsiMccAndImsiMncAfterCarryOver() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final byte reasonMobilityCoverage = 3;

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getIMSI_MCC(), is("454"));
            assertThat(sess.getIMSI_MNC(), is("06"));
        }
    }

    @Test
    public void testRabActivityOnIsUnsetAtInternalSystemRelease() throws Exception {

        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short targetConfIdle = 0;
        final byte reasonMobilityCoverage = 3;

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);
        sendEvent(createSystemReleaseEventsWithParams(cellId, timeStamp1 + 250000 - 1, rncId, rncModuleId, ueContexts[1], sourceConf, targetConfIdle));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getRAB_ACTIVITY_ON(), is(false));
            assertThat(sess.getPS_RAB_ACTIVITY_END_TIME(), is(timeStamp1 + 250000 - 1));

            //    		System.out.println(sess.getDecodedString());
        }

    }

    @Test
    public void shouldComputeRrcDurationOneRrcSlice() throws Exception {
        final Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 0);
        final long sessionStart = cal.getTimeInMillis();

        final String imsi = "454061111111111";
        final short sourceConf = 1;
        final short targetConf = 25;

        setUpRrcRabSession(cellId, imsi, sessionStart, sourceConf, targetConf, ueContext, rncModuleId);

        final int duration = 21314;
        closeRrcSession(sourceConf, sessionStart + duration, ueContext, rncModuleId);

        // flush
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));
        assertThat(sessions.get(0).getRRC_DURATION(), is(duration));
    }

    @Test
    public void shouldComputeRrcDurationMultipleRrcSlices() throws Exception {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MINUTE, 0);
        final long sessionStart = calendar.getTimeInMillis();
        final String imsi = "454061111111111";

        setUpRrcRabSession(cellId, imsi, sessionStart, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);

        int duration = 21314;
        closeRrcSession(cellId, sessionStart + duration, ueContext, rncModuleId);
        traceSessionWindows(windowName);

        setUpRrcRabSession(cellId, imsi, sessionStart + duration + 1342, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);
        traceSessionWindows(windowName);
        duration += 64564;
        closeRrcSession(cellId, sessionStart + duration + 1342, ueContext, rncModuleId);

        // flush
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE + 1));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));
        assertThat(sessions.get(0).getRRC_DURATION(), is(duration));
    }

    @Test
    public void testHsAndEulCatAreNotOverWrittenWhenValuesAreNotSetInEvent() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short hsCat = 1; // Value defined in createRabEventsWithParams() method
        final short eulCat = 2; // Value defined in createRabEventsWithParams() method
        final byte emptyValue = -1;

        final long timeStamp1 = 1;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);

        final INTERNAL_RAB_ESTABLISHMENT interRabEstabEvent = createRabEventsWithParams(cellId, timeStamp1 + 1000, rncId, rncModuleId, ueContext, sourceConf,
                targetConf);
        interRabEstabEvent.setHS_DSCH_PHYSICAL_LAYER_CATEGORY(emptyValue);
        interRabEstabEvent.setE_DCH_PHYSICAL_LAYER_CATEGORY(emptyValue);
        sendEvent(interRabEstabEvent);

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getHSDPA_UE_CATEGORY(), is(hsCat));
            assertThat(sess.getEUL_UE_CATEGORY(), is(eulCat));

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testHsAndEulCatAfterCarryOver() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final byte reasonMobilityCoverage = 3;
        final short hsCat = 1; // Value defined in createRabEventsWithParams() method
        final short eulCat = 2; // Value defined in createRabEventsWithParams() method

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getHSDPA_UE_CATEGORY(), is(hsCat));
            assertThat(sess.getEUL_UE_CATEGORY(), is(eulCat));

            //            System.out.println(sess.getDecodedString());

        }
    }

    @Test
    public void testCarriedOverSessionIsNotCarriedOverIfNoEvents() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final byte reasonMobilityCoverage = 3;

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        final long timeStamp3 = timeStamp2 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp3 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

    }

    @Test
    public void testCarriedOverFlagIsFalseWhenNotCarriedOver() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final byte reasonMobilityCoverage = 3;

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);
        closeRrcSession(cellId1, timeStamp1 + 1000, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        setUpRrcRabSession(cellId1, imsi, timeStamp2, sourceConf, targetConf, ueContexts[1], rncModuleId);
        sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        closeRrcSession(cellId1, timeStamp1 + 1000, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getCARRIED_OVER(), is(false));
        }

    }

    @Test
    public void testCarriedOverFlagIsTrueWhenCarriedOver() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final byte reasonMobilityCoverage = 3;

        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        setUpRrcRabSession(cellId1, imsi, timeStamp2, sourceConf, targetConf, ueContexts[1], rncModuleId);
        sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        closeRrcSession(cellId1, timeStamp1 + 1000, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess = sessions.get(1);
        assertThat(sess.getCARRIED_OVER(), is(true));
    }

    @Test
    public void testPsRabActivityStartEndTime() throws Exception {
        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi = "454061111111111";
        final short ueContext = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        final long timeStamp3 = timeStamp2 + FIVE_MINUTE;

        setUpRrcRabSession(cellId1, imsi, timeStamp1, SRB, HS_EUL_RAB_1, ueContext, rncModuleId); // Start RAB = timeStamp1 + 200
        closeRrcSession(cellId1, timeStamp1 + 1000, ueContext, rncModuleId);
        setUpRrcRabSession(cellId1, imsi, timeStamp1 + 2000, SRB, HS_EUL_RAB_1, ueContext, rncModuleId);
        closeRrcSession(cellId1, timeStamp1 + 5000, ueContext, rncModuleId); // End RAB = timeStamp1 + 5000
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        setUpRrcRabSession(cellId1, imsi, timeStamp2, SRB, FACH_RACH, ueContext, rncModuleId); // Start RAB = timeStamp2 + 200 
        sendEvent(createChannelSwitchEventsWithParamsConf(cellId, timeStamp2, rncModuleId, ueContext, FACH_RACH, HS_EUL_RAB_1));
        // End RAB = timeStamp2 + FIVE_MINUTE - 1
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        // Start RAB = timeStamp3 - 1, End RAB = timeStamp3 + 2000
        sendEvent(createRabReleaseEventsWithParams(cellId1, timeStamp3 + 2000, rncId, rncModuleId, ueContext, HS_EUL_RAB_1, IDLE));
        closeRrcSession(cellId1, timeStamp3 + 2800, ueContext, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp3 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));

        final GPEH_SESSION sess1 = sessions.get(0);
        assertThat(sess1.getPS_RAB_ACTIVITY_START_TIME(), is(timeStamp1 + 200));
        assertThat(sess1.getPS_RAB_ACTIVITY_END_TIME(), is(timeStamp1 + 5000));

        final GPEH_SESSION sess2 = sessions.get(1);
        assertThat(sess2.getPS_RAB_ACTIVITY_START_TIME(), is(timeStamp2 + 200));
        assertThat(sess2.getPS_RAB_ACTIVITY_END_TIME(), is(timeStamp2 + FIVE_MINUTE - 1));

        final GPEH_SESSION sess3 = sessions.get(2);
        assertThat(sess3.getPS_RAB_ACTIVITY_START_TIME(), is(timeStamp3 - 1));
        assertThat(sess3.getPS_RAB_ACTIVITY_END_TIME(), is(timeStamp3 + 2000));

    }

    @Test
    public void testRrcStartsInOneSessionAndImsiArrivesInNextSession() throws Exception {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 299990, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext, imsi));
        sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 200, rncId, rncModuleId, ueContext, SRB, HS_EUL_RAB_1));
        closeRrcSession(cellId, timeStamp2 + 1000, ueContext, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getTimestamp(), is(timeStamp1 + 299990));
        assertThat(sess.getDATETIME_ID(), is(timeStamp2 - 1));
        assertThat(sess.getPS_RAB_ACTIVITY_START_TIME(), is(timeStamp2 + 200));

    }

    @Test
    public void testRrcStartsInOneSessionAndImsiArrivesTwoSessionsLater() throws Exception {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        final long timeStamp3 = timeStamp2 + FIVE_MINUTE;
        GPEH_SESSION[] remainingSessions;

        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 299990, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        // Check that session still exists
        remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(1));

        sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 200, rncId, rncModuleId, ueContext, SRB, HS_EUL_RAB_1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 1000, rncId, rncModuleId, ueContext));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 2000, rncId, rncModuleId, ueContext));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 3000, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        // Check that session still exists
        remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(1));

        sendEvent(createImsiEventsWithParams(cellId, timeStamp3 + 100, rncId, rncModuleId, ueContext, imsi));
        closeRrcSession(cellId, timeStamp3 + 1000, ueContext, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp3 + FIVE_MINUTE));

        // Get selected sessions
        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getTimestamp(), is(timeStamp1 + 299990));
        assertThat(sess.getDATETIME_ID(), is(timeStamp3 - 1));
        assertThat(sess.getPS_RAB_ACTIVITY_START_TIME(), is(timeStamp2 + 200));
        assertThat(sess.getCM_CNT(), is(3));

        //Check that no session still exists
        remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(0));

    }

    @Test
    public void testRrcWithoutImsiOrReleaseFollowedByRrc() throws Exception {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi = "454061111111111";
        final short ueContext1 = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 1000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 2000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 3000, rncId, rncModuleId, ueContext1));

        setUpRrcRabSession(cellId, imsi, timeStamp1 + 150000, SRB, HS_EUL_RAB_1, ueContext1, rncModuleId);
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 1000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 2000, rncId, rncModuleId, ueContext1));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getTimestamp(), is(timeStamp1 + 150000));
        assertThat(sess.getCM_CNT(), is(2));

        // Check that session is deleted
        final GPEH_SESSION[] remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(1));

    }

    @Test
    public void testRrcWithImsiButWithoutReleaseFollowedByRrc() throws Exception {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final short ueContext1 = 1;
        final long timeStamp1 = 1;

        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 1000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 2000, rncId, rncModuleId, ueContext1));
        sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 2500, rncId, rncModuleId, ueContext, imsi1));
        sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 2800, rncId, rncModuleId, ueContext, SRB, HS_EUL_RAB_1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 3000, rncId, rncModuleId, ueContext1));

        setUpRrcRabSession(cellId, imsi2, timeStamp1 + 150000, SRB, HS_EUL_RAB_1, ueContext1, rncModuleId);
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 151000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 152000, rncId, rncModuleId, ueContext1));
        closeRrcSession(cellId, timeStamp1 + 270000, ueContext1, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess1 = sessions.get(0);
        assertThat(sess1.getTimestamp(), is(timeStamp1));
        assertThat(sess1.getRRC_CONN_END(), is(timeStamp1 + 150000));
        assertThat(sess1.getRRC_DURATION(), is(150000));
        assertThat(sess1.getCM_CNT(), is(3));

        final GPEH_SESSION sess2 = sessions.get(1);
        assertThat(sess2.getTimestamp(), is(timeStamp1 + 150000));
        assertThat(sess2.getRRC_DURATION(), is(120000));
        assertThat(sess2.getCM_CNT(), is(2));

        // Check that sessions are deleted
        final GPEH_SESSION[] remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(0));

    }

    @Test
    public void testRrcWithImsiButWithoutReleaseFollowedByRrcInNextSession() throws Exception {
        rncModuleId = 1;
        final int cellId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final short ueContext1 = 1;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;

        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 10995, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 11000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 12000, rncId, rncModuleId, ueContext1));
        sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 12500, rncId, rncModuleId, ueContext, imsi1));
        sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 12800, rncId, rncModuleId, ueContext, SRB, HS_EUL_RAB_1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 13000, rncId, rncModuleId, ueContext1));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        setUpRrcRabSession(cellId, imsi2, timeStamp2, SRB, HS_EUL_RAB_1, ueContext1, rncModuleId);
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 1000, rncId, rncModuleId, ueContext1));
        sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 2000, rncId, rncModuleId, ueContext1));
        closeRrcSession(cellId, timeStamp2 + 120000, ueContext1, rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess1 = sessions.get(0);
        assertThat(sess1.getTimestamp(), is(timeStamp1 + 10995));
        assertThat(sess1.getRRC_CONN_END(), is(timeStamp1 + FIVE_MINUTE - 1));
        assertThat(sess1.getRRC_DURATION(), is(289004));
        assertThat(sess1.getCM_CNT(), is(3));

        final GPEH_SESSION sess2 = sessions.get(1);
        assertThat(sess2.getTimestamp(), is(timeStamp2));
        assertThat(sess2.getRRC_DURATION(), is(120000));
        assertThat(sess2.getCM_CNT(), is(2));

        // Check that sessions are deleted
        final GPEH_SESSION[] remainingSessions = getSessionsInWindow();
        assertThat(remainingSessions.length, is(0));

    }

    private void setUpRrcRabSession(final int cellId, final String imsi, final long timestamp, final short sourceConf, final short targetConf,
            final short ueContext, final byte rncModuleId) throws Exception {
        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timestamp, rncId, rncModuleId, ueContext));
        traceSessionWindows(windowName);
        sendEvent(createImsiEventsWithParams(cellId, timestamp + 100, rncId, rncModuleId, ueContext, imsi));
        sendEvent(createRabEventsWithParams(cellId, timestamp + 200, rncId, rncModuleId, ueContext, sourceConf, targetConf));
    }

    private void closeRrcSession(final int cellId, final long timeStamp, final short ueContext, final byte rncModuleId) throws Exception {
        sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp, rncId, rncModuleId, ueContext));

    }

    private GPEH_SESSION[] getSessionsInWindow() {
        final String onDemandQuery = "select * from RadioSessionWindow";
        final EPOnDemandQueryResult result = engine.getEPRuntime().executeQuery(onDemandQuery);
        final EventBean[] eventBeanObjects = result.getArray();

        final GPEH_SESSION[] sessions = new EnhancedGpehSession[eventBeanObjects.length];
        for (int i = 0; i < eventBeanObjects.length; i++) {
            sessions[i] = (GPEH_SESSION) eventBeanObjects[i].getUnderlying();
        }
        return sessions;
    }

}