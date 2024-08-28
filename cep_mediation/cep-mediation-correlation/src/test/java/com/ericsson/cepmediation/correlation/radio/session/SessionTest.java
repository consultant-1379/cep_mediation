/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio.session;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.enrichment.Partial;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.util.tracers.EnhancedGpehSessionTracer;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.common.RadioUser;
import com.ericsson.cepmediation.test.util.tracer.SessionTracer;

/**
 * @author eemecoy
 *
 */
public class SessionTest extends RadioCorrelationBase {

    private static final long IMSI_1 = 123456;

    private static final long IMSI_2 = 999999;

    protected RadioUser radioUserForIMSI1;

    private RadioUser radioUserForIMSI2SameCombo;

    protected RadioUser radioUserForIMSI1DifferentCombo1;

    private RadioUser radioUserForIMSI1DifferentCombo2;
    
    private static final String windowName = "RadioSessionWindow";

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        rncId = 1;
        cellId = 1;
        setUpRadioUsers();
    }

    private void setUpRadioUsers() {
        radioUserForIMSI1 = new RadioUser();
        radioUserForIMSI1.setUeContextForUser((short) 1);
        radioUserForIMSI1.setRncModuleIdForUser((byte) 1);
        radioUserForIMSI1.setImsi(IMSI_1);

        radioUserForIMSI2SameCombo = new RadioUser();
        radioUserForIMSI2SameCombo.setUeContextForUser((short) 1);
        radioUserForIMSI2SameCombo.setRncModuleIdForUser((byte) 1);
        radioUserForIMSI2SameCombo.setImsi(IMSI_2);

        radioUserForIMSI1DifferentCombo1 = new RadioUser();
        radioUserForIMSI1DifferentCombo1.setUeContextForUser((short) 2);
        radioUserForIMSI1DifferentCombo1.setRncModuleIdForUser((byte) 2);
        radioUserForIMSI1DifferentCombo1.setImsi(IMSI_1);

        radioUserForIMSI1DifferentCombo2 = new RadioUser();
        radioUserForIMSI1DifferentCombo2.setUeContextForUser((short) 3);
        radioUserForIMSI1DifferentCombo2.setRncModuleIdForUser((byte) 3);
        radioUserForIMSI1DifferentCombo2.setImsi(IMSI_1);
    }

    public void verifyNoSessionsCreated(String assertionMessage) {
        assertThat(assertionMessage, getSessionsCreated().size(), is(0));
    }

    private void tracePartialWindows() {
        List<? extends Object> elements = getElementsInWindow("partial");
        for (Object object : elements) {
            EnhancedGpehSessionTracer.traceSession((Partial) object);
        }

    }

    @Test
    public void testRRCDurationIsCorrectForSessionWithoutRABEventFollowedBySessionCarriedOverIntoNextROP() {
        System.out.println("First session (incomplete, no IMSI event):");
        long startTimeForFirstSession = 0;
        createSession(radioUserForIMSI1, startTimeForFirstSession, GpehEventType.RRC_RRC_CONNECTION_SETUP, GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        flush(startTimeForFirstSession + FIVE_MINUTE);
        verifyNoSessionsCreated("No internal imsi event, no sessions should have been created");

        System.out.println("\nSecond session (incomplete, no RAB establishment event):");
        long startTimeForSecondSession = startTimeForFirstSession + FIVE_MINUTE;
        createSession(radioUserForIMSI1DifferentCombo1, startTimeForSecondSession, GpehEventType.RRC_RRC_CONNECTION_SETUP, GpehEventType.INTERNAL_IMSI,
                GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        flush(startTimeForSecondSession + FIVE_MINUTE);
        verifyNoSessionsCreated("No rab establishment event, no sessions should have been created");
        tracePartialWindows();

        System.out.println("\nThird session (has IMSI and RAB establishment event but does not complete before ROP end):");
        long startTimeForThirdSession = startTimeForSecondSession + FIVE_MINUTE;
        long endTimeForThirdSession = startTimeForThirdSession + FIVE_MINUTE;
        createSession(radioUserForIMSI1, startTimeForThirdSession, GpehEventType.RRC_RRC_CONNECTION_SETUP, GpehEventType.INTERNAL_IMSI,
                GpehEventType.INTERNAL_RAB_ESTABLISHMENT);
        flush(endTimeForThirdSession);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        int expectedRRCDuration = (int) (endTimeForThirdSession - startTimeForThirdSession);
        assertThat(session.getRRC_DURATION(), is(expectedRRCDuration));
    }

    @Test
    public void testPSRabCountGreaterThanZeroWithAllEventsForUeContextRncModuleIdPair() {
        long chosenIMSI = 454061105038251L;
        long otherIMSI = 454063302712323L;

        long startTime = 0;
        RadioUser radioUser1 = new RadioUser();
        radioUser1.setUeContextForUser((short) 2923);
        radioUser1.setRncModuleIdForUser((byte) 22);
        radioUser1.setImsi(otherIMSI);
        System.out.println("First session, not for this IMSI but with same rnc module/ue context pair: " + radioUser1);
        createBasicSession(radioUser1, startTime);

        RadioUser radioUser2 = new RadioUser();
        radioUser2.setUeContextForUser((short) 4060);
        radioUser2.setRncModuleIdForUser((byte) 19);
        radioUser2.setImsi(chosenIMSI);
        System.out.println("\nSecond session, for " + radioUser2);
        createBasicSession(radioUser2, startTime + 10);

        RadioUser radioUser3 = new RadioUser();
        radioUser3.setUeContextForUser((short) 627);
        radioUser3.setRncModuleIdForUser((byte) 28);
        radioUser3.setImsi(chosenIMSI);
        System.out.println("\nThird session, for " + radioUser3);
        createBasicSession(radioUser3, startTime + 20);

        RadioUser radioUser4 = new RadioUser();
        radioUser4.setUeContextForUser((short) 4103);
        radioUser4.setRncModuleIdForUser((byte) 28);
        radioUser4.setImsi(chosenIMSI);
        System.out.println("\nFourth session, crosses session boundary, for " + radioUser4);
        long startTimeForLastSession = startTime + 30;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForLastSession, radioUser4);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTimeForLastSession + 2, radioUser4);
        sendEvent(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, startTimeForLastSession + 2, radioUser4);
        flush(startTimeForLastSession + 40);

        List<GPEH_SESSION> sessions = getSessionsCreated();
        SessionTracer.traceSessions(sessions);
        assertThat(sessions.size(), is(2));

        GPEH_SESSION sessionForChosenIMSI = getSessionFor(chosenIMSI, sessions);
        assertThat(sessionForChosenIMSI.getPS_RAB_ESTABLISH_CNT(), is((short) 3));

        GPEH_SESSION sessionForOtherIMSI = getSessionFor(otherIMSI, sessions);
        assertThat(sessionForOtherIMSI.getPS_RAB_ESTABLISH_CNT(), is((short) 1));

    }

    @Test
    public void testPSRabCountGreaterThanZero() {
        long startTime = 0;
        System.out.println("First session");
        //SOURCE_CONF=1,TARGET_CONF=25
        createBasicSession(radioUserForIMSI1, startTime);
        System.out.println("\nSecond session");
        //SOURCE_CONF=1,TARGET_CONF=25
        createBasicSession(radioUserForIMSI1DifferentCombo1, startTime + 10);
        System.out.println("\nThird session crosses session boundary: ");
        long startTimeForThirdSession = startTime + 20;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, startTimeForThirdSession, radioUserForIMSI1DifferentCombo2);
        sendEvent(GpehEventType.INTERNAL_IMSI, startTimeForThirdSession + 2, radioUserForIMSI1DifferentCombo2);
        sendEvent(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, startTimeForThirdSession + 2, radioUserForIMSI1DifferentCombo2);
        flush(startTimeForThirdSession + 3);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        SessionTracer.traceSession(session);
        assertThat(session.getPS_RAB_ESTABLISH_CNT(), is((short) 3));

    }

    @Test
    public void testPsRabEndTimeCorrectForTwoSessions() {
        long startTime = 0;
        System.out.println("First (complete) session:");
        createBasicSession(radioUserForIMSI1, startTime);
        System.out.println();
        System.out.println("Second session without a RAB establishment event");
        createBasicSession(radioUserForIMSI1DifferentCombo1, startTime + 100);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat("PS_RAB_ACTIVITY_START_TIME should be the time of the connection release complete event in the second session",
                session.getPS_RAB_ACTIVITY_START_TIME(), is(2L));
        assertThat("PS_RAB_ACTIVITY_END_TIME should be the time of the connection release complete event in the second session",
                session.getPS_RAB_ACTIVITY_END_TIME(), is(103L));
        assertThat(session.getPS_RAB_DURATION(), is(2));
        assertThat(session.getPS_RAB_ESTABLISH_CNT(), is((short) 2));
    }

    @Test
    public void testPsRabEndTimeCorrectWhenLastSessionHasNoRabEstEvent() {
        long startTime = 0;
        System.out.println("First (complete) session:");
        createBasicSession(radioUserForIMSI1, startTime);
        System.out.println();
        System.out.println("Second session without a RAB establishment event");
        createSession(radioUserForIMSI1DifferentCombo1, startTime + 100, GpehEventType.RRC_RRC_CONNECTION_SETUP, GpehEventType.INTERNAL_IMSI,
                GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(
                "getPS_RAB_ACTIVITY_END_TIME should be the time of the connection release complete event in the first session, no rab event in the second session",
                session.getPS_RAB_ACTIVITY_END_TIME(), is(3L));
    }

    @Test
    public void testSameIMSIDifferentUeContextAndRncModuleId_NoReleaseEvent_AfterFirstSession() {
        long startTime = 0;
        createSessionWithoutReleaseEvent(radioUserForIMSI1, startTime);
        createBasicSession(radioUserForIMSI1DifferentCombo1, startTime + 10);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getIMSI(), is(IMSI_1));
        assertThat(session.getEVENT_CNT(), is(5));
        assertThat(session.getRRC_DURATION(), is(3));
    }

    @Test
    public void testSameIMSISameUeContextAndRncModuleId_TwoConnections_NoReleaseEvent_AfterFirstSession() {
        long startTimeForFirstConnection = 0;
        createSessionWithoutReleaseEvent(radioUserForIMSI1, startTimeForFirstConnection);
        long startTimeForSecondConnection = startTimeForFirstConnection + 10;
        createBasicSession(radioUserForIMSI1, startTimeForSecondConnection);
        flush(startTimeForFirstConnection + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getEVENT_CNT(), is(5));
    }

    @Test
    public void testSameIMSISameUeContextAndRncModuleId_OneConnection_NoReleaseEvent_AfterFirstSession() {
        long startTime = 0;
        createSessionWithoutReleaseEvent(radioUserForIMSI1, startTime);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getEVENT_CNT(), is(2));
    }

    @Test
    public void testDifferentIMSIsSameUeContextAndRncModuleId_NoReleaseEvent_AfterFirstSession() {
        long startTimeForImsi1 = 0;
        createSessionWithoutReleaseEvent(radioUserForIMSI1, startTimeForImsi1);
        long startTimeForImsi2 = startTimeForImsi1 + 60;
        createBasicSession(radioUserForIMSI2SameCombo, startTimeForImsi2);
        flush(startTimeForImsi1 + FIVE_MINUTE);

        List<GPEH_SESSION> sessions = getSessionsCreated();
        SessionTracer.traceSessions(sessions);
        assertThat(sessions.size(), is(2));
        GPEH_SESSION sessionForImsi1 = getSessionFor(IMSI_1, sessions);
        assertThat(sessionForImsi1.getEVENT_CNT(), is(2));
        GPEH_SESSION sessionForImsi2 = getSessionFor(IMSI_2, sessions);
        assertThat(sessionForImsi2.getEVENT_CNT(), is(3));
    }

    @Test
    public void testSameIMSIDifferentUeContextAndRncModuleId() {
        long startTime = 0;
        createBasicSession(radioUserForIMSI1, startTime);
        createBasicSession(radioUserForIMSI1DifferentCombo1, startTime + 10);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getIMSI(), is(IMSI_1));
        assertThat(session.getEVENT_CNT(), is(6));
    }

    @Test
    public void testSameIMSISameUeContextAndRncModuleId_TwoConnections() {
        long startTimeForFirstConnection = 0;
        createBasicSession(radioUserForIMSI1, startTimeForFirstConnection);
        long startTimeForSecondConnection = startTimeForFirstConnection + 10;
        createBasicSession(radioUserForIMSI1, startTimeForSecondConnection);
        flush(startTimeForFirstConnection + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getEVENT_CNT(), is(6));
    }

    @Test
    public void testSameIMSISameUeContextAndRncModuleId_OneConnection() {
        long startTime = 0;
        createBasicSession(radioUserForIMSI1, startTime);
        flush(startTime + FIVE_MINUTE);
        GPEH_SESSION session = getSingleGpehSessionCreated();
        assertThat(session.getEVENT_CNT(), is(3));
    }

    @Test
    public void testDifferentIMSIsSameUeContextAndRncModuleId() {
        long startTimeForImsi1 = 0;
        createBasicSession(radioUserForIMSI1, startTimeForImsi1);
        long startTimeForImsi2 = startTimeForImsi1 + 60;
        createBasicSession(radioUserForIMSI2SameCombo, startTimeForImsi2);
        flush(startTimeForImsi1 + FIVE_MINUTE);

        List<GPEH_SESSION> sessions = getSessionsCreated();
        SessionTracer.traceSessions(sessions);
        assertThat(sessions.size(), is(2));
        GPEH_SESSION sessionForImsi1 = getSessionFor(IMSI_1, sessions);
        assertThat(sessionForImsi1.getEVENT_CNT(), is(3));
        GPEH_SESSION sessionForImsi2 = getSessionFor(IMSI_2, sessions);
        assertThat(sessionForImsi2.getEVENT_CNT(), is(3));
    }

    private GPEH_SESSION getSessionFor(long imsi, List<GPEH_SESSION> sessions) {
        for (GPEH_SESSION session : sessions) {
            if (session.getIMSI() == imsi) {
                return session;
            }
        }
        fail("No session returned for IMSI " + imsi);
        return null;
    }

    protected void flush(long timestamp) {
        correlationEngine.sendEvent(new SessionEndEvent(timestamp));
        traceSessionWindows(windowName);
        tracePartialWindows();
    }

}
