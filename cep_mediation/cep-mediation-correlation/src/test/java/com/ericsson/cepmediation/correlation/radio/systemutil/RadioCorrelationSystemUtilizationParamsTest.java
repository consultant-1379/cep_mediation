package com.ericsson.cepmediation.correlation.radio.systemutil;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.util.EsperConfigurationForTest;
import com.ericsson.cepmediation.test.common.GpehEventType;

public class RadioCorrelationSystemUtilizationParamsTest extends RadioCorrelationBase {

    @Before
    public void warmUp() throws Exception {

        configure("esper/rc.epl");
        EsperConfigurationForTest.setPrioritized(false);
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void testParametersAreInitialised() {

        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final GPEH_SESSION sess = sessions.get(0);
        assertThat(sess.getHSDSCH_USERS_TOTAL(), is(0));
        assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(0));
        assertThat(sess.getUL_INTERFERENCE_TOTAL(), is(0f));
        assertThat(sess.getUL_INTERFERENCE_SAMPLES(), is(0));
        assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is(0));
        assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(0));
        assertThat(sess.getCM_USER_TOTAL(), is(0));
        assertThat(sess.getCM_USER_SAMPLES(), is(0));

    }

    @Test
    public void testAverageHsUsers() {

        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final int cellId3 = 3;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final String imsi3 = "454063333333333";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short hsUser1 = 1;
        final short hsUser2 = 2;
        final short hsUser3 = 3;

        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        setUpRrcRabSession(cellId2, imsi2, timeStamp, sourceConf, targetConf, ueContexts[2], rncModuleId);
        setUpRrcRabSession(cellId1, imsi3, timeStamp, sourceConf, targetConf, ueContexts[3], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUser1, ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 1000, rncId, rncModuleId, hsUser1, ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 1000, rncId, rncModuleId, hsUser3, ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUser1, ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 2000, rncId, rncModuleId, hsUser2, ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 2000, rncId, rncModuleId, hsUser3, ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUser1, ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 3000, rncId, rncModuleId, hsUser3, ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 3000, rncId, rncModuleId, hsUser3, ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));
        for (final GPEH_SESSION session : sessions) {
            if (session.getIMSI() == Long.parseLong(imsi1)) {
                assertThat("HSDSCH_USERS_AVG is incorrect", session.getHSDSCH_USERS_AVG(), is(hsUser1));
                assertThat(session.getHSDSCH_USERS_TOTAL(), is(hsUser1 * 3));
                assertThat(session.getHSDSCH_USERS_SAMPLES(), is(3));
            } else if (session.getIMSI() == Long.parseLong(imsi2)) {
                assertThat(session.getHSDSCH_USERS_AVG(), is((short) Math.round((hsUser1 + hsUser2 + hsUser3) / 3.0)));
                assertThat(session.getHSDSCH_USERS_TOTAL(), is(hsUser1 + hsUser2 + hsUser3));
                assertThat(session.getHSDSCH_USERS_SAMPLES(), is(3));
            } else {
                assertThat(session.getHSDSCH_USERS_AVG(), is(hsUser1));
                assertThat(session.getHSDSCH_USERS_TOTAL(), is(hsUser1 * 3));
                assertThat(session.getHSDSCH_USERS_SAMPLES(), is(3));
            }

        }
    }

    @Test
    public void testAverageHsUsersRoundedUp() {

        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 10, 11, 11, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[2], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));
        for (final GPEH_SESSION sess : sessions) {
            final int total = hsUsers[1] + hsUsers[2] + hsUsers[3];
            final short average = (short) (Math.round(total / 3.0));
            assertThat(sess.getHSDSCH_USERS_AVG(), is(average));
            assertThat(sess.getHSDSCH_USERS_TOTAL(), is(total));
            assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(3));

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testAverageUlInterference() {
        ueContext = 1;
        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final int cellId3 = 3;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final String imsi3 = "454063333333333";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 3, 4, 5 };
        final short[] ulInterference = { 0, 100, 200, 300, 400, 500 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        final float[] ulInterferenceMappedValue = new float[6];
        final float[] ulInterferenceCalculatedValue = new float[6];
        for (int i = 0; i < ulInterference.length; i++) {
            ulInterferenceMappedValue[i] = (float) (-112.1 + 0.1 * ulInterference[i]);
            ulInterferenceCalculatedValue[i] = (float) Math.pow(10, ulInterferenceMappedValue[i] / 10);
        }

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        setUpRrcRabSession(cellId2, imsi2, timeStamp, sourceConf, targetConf, ueContexts[2], rncModuleId);
        setUpRrcRabSession(cellId1, imsi3, timeStamp, sourceConf, targetConf, ueContexts[3], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 1000, rncId, rncModuleId, hsUsers[2], ulInterference[1],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 1000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 2000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 2000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 3000, rncId, rncModuleId, hsUsers[2], ulInterference[3],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));
        for (final GPEH_SESSION sess : sessions) {
            if (sess.getIMSI() == Long.parseLong(imsi1)) {
                final float total = (ulInterferenceCalculatedValue[1] * 3);
                final float average = (float) (Math.round((10 * Math.log10(total / 3)) * 10.0) / 10.0);
                assertThat(sess.getUL_INTERFERENCE_AVG(), is(average));
                assertThat(sess.getUL_INTERFERENCE_TOTAL(), is(total));
                assertThat(sess.getUL_INTERFERENCE_SAMPLES(), is(3));
            } else if (sess.getIMSI() == Long.parseLong(imsi2)) {
                final float total = ulInterferenceCalculatedValue[1] + ulInterferenceCalculatedValue[2] + ulInterferenceCalculatedValue[3];
                final float average = (float) (Math.round((10 * Math.log10(total / 3)) * 10.0) / 10.0);
                assertThat(sess.getUL_INTERFERENCE_AVG(), is(average));
                assertThat((float) (Math.round(sess.getUL_INTERFERENCE_TOTAL() * 10.0) / 10.0), is((float) ((Math.round(total * 10.0)) / 10.0)));
                assertThat(sess.getUL_INTERFERENCE_SAMPLES(), is(3));
            } else {
                final float total = (ulInterferenceCalculatedValue[1] * 3);
                final float average = (float) (Math.round((10 * Math.log10(total / 3)) * 10.0) / 10.0);
                assertThat(sess.getUL_INTERFERENCE_AVG(), is(average));
                assertThat(sess.getUL_INTERFERENCE_TOTAL(), is(total));
                assertThat(sess.getUL_INTERFERENCE_SAMPLES(), is(3));
            }

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testdlNonHsPower() {
        ueContext = 1;
        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final int cellId3 = 3;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final String imsi3 = "454063333333333";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 3, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 4, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        setUpRrcRabSession(cellId2, imsi2, timeStamp, sourceConf, targetConf, ueContexts[2], rncModuleId);
        setUpRrcRabSession(cellId1, imsi3, timeStamp, sourceConf, targetConf, ueContexts[3], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 1000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[1], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 1000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 2000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 2000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 3000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[3], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));
        for (final GPEH_SESSION sess : sessions) {
            if (sess.getIMSI() == Long.parseLong(imsi1)) {
                assertThat(sess.getDL_NON_HS_TX_POWER_AVG(), is((int) dlNonHsPower[1]));
                assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is(dlNonHsPower[1] * 3));
                assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(3));
            } else if (sess.getIMSI() == Long.parseLong(imsi2)) {
                assertThat(sess.getDL_NON_HS_TX_POWER_AVG(), is((int) Math.round(((dlNonHsPower[1] + dlNonHsPower[2] + dlNonHsPower[3]) / 3.0))));
                assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is((dlNonHsPower[1] + dlNonHsPower[2] + dlNonHsPower[3])));
                assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(3));
            } else {
                assertThat(sess.getDL_NON_HS_TX_POWER_AVG(), is((int) dlNonHsPower[1]));
                assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is(dlNonHsPower[1] * 3));
                assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(3));
            }

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testdlNonHsPowerOver2RrcConnectionsOnDifferentCells() {
        ueContext = 1;
        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final String imsi1 = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 3, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 16, 24, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = 1;

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 4000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        closeRrcSession(cellId, timeStamp + 5000, ueContext, rncModuleId);

        setUpRrcRabSession(cellId2, imsi1, timeStamp + 100000, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 101000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[2], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 102000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[2], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 103000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[2], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 104000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[2], cmUsers[1]));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));
        for (final GPEH_SESSION sess : sessions) {
            assertThat(sess.getDL_NON_HS_TX_POWER_AVG(), is((int) Math.round(((dlNonHsPower[1] + dlNonHsPower[2]) / 2.0))));
            assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is((dlNonHsPower[1] + dlNonHsPower[2]) * 4));
            assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(8));

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testAverageCmUsers() {
        ueContext = 1;
        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final int cellId3 = 3;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final String imsi3 = "454063333333333";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 3, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 4, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        setUpRrcRabSession(cellId2, imsi2, timeStamp, sourceConf, targetConf, ueContexts[2], rncModuleId);
        setUpRrcRabSession(cellId1, imsi3, timeStamp, sourceConf, targetConf, ueContexts[3], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 1000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 1000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 2000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 2000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 3000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[3]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));
        for (final GPEH_SESSION sess : sessions) {
            if (sess.getIMSI() == Long.parseLong(imsi1)) {
                assertThat(sess.getCM_USER_CNT(), is((int) cmUsers[1]));
                assertThat(sess.getCM_USER_TOTAL(), is(cmUsers[1] * 3));
                assertThat(sess.getCM_USER_SAMPLES(), is(3));
            } else if (sess.getIMSI() == Long.parseLong(imsi2)) {
                assertThat(sess.getCM_USER_CNT(), is((int) Math.round(((cmUsers[1] + cmUsers[2] + cmUsers[3]) / 3.0))));
                assertThat(sess.getCM_USER_TOTAL(), is(cmUsers[1] + cmUsers[2] + cmUsers[3]));
                assertThat(sess.getCM_USER_SAMPLES(), is(3));
            } else {
                assertThat(sess.getCM_USER_CNT(), is((int) cmUsers[1]));
                assertThat(sess.getCM_USER_TOTAL(), is(cmUsers[1] * 3));
                assertThat(sess.getCM_USER_SAMPLES(), is(3));
            }

        }
    }

    @Test
    public void testAverageHsUsersAndRrcConnectionReleased() {
        ueContext = 1;
        rncModuleId = 1;
        final int cellId1 = 1;
        final int cellId2 = 2;
        final int cellId3 = 3;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        final String imsi3 = "454063333333333";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 4, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        setUpRrcRabSession(cellId2, imsi2, timeStamp, sourceConf, targetConf, ueContexts[2], rncModuleId);
        setUpRrcRabSession(cellId1, imsi3, timeStamp, sourceConf, targetConf, ueContexts[3], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 1000, rncId, rncModuleId, hsUsers[1], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 1000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 2000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 2000, rncId, rncModuleId, hsUsers[2], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 2000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        closeRrcSession(cellId2, timeStamp + 2500, ueContexts[2], rncModuleId);

        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + 3000, rncId, rncModuleId, hsUsers[1], ulInterference[1],
                dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId2, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[2],
                dlNonHsPower[2], cmUsers[2]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId3, timeStamp + 3000, rncId, rncModuleId, hsUsers[3], ulInterference[3],
                dlNonHsPower[3], cmUsers[3]));

        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(3));
        for (final GPEH_SESSION sess : sessions) {
            if (sess.getIMSI() == Long.parseLong(imsi1)) {
                assertThat(sess.getHSDSCH_USERS_AVG(), is(hsUsers[1]));
                assertThat(sess.getHSDSCH_USERS_TOTAL(), is(hsUsers[1] * 3));
                assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(3));
            } else if (sess.getIMSI() == Long.parseLong(imsi2)) {
                assertThat(sess.getHSDSCH_USERS_AVG(), is((short) (Math.round((hsUsers[1] + hsUsers[2]) / 2.0))));
                assertThat(sess.getHSDSCH_USERS_TOTAL(), is(hsUsers[1] + hsUsers[2]));
                assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(2));
            } else {
                assertThat(sess.getHSDSCH_USERS_AVG(), is(hsUsers[1]));
                assertThat(sess.getHSDSCH_USERS_TOTAL(), is(hsUsers[1] * 3));
                assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(3));
            }

            //            System.out.println(sess.getDecodedString());
        }
    }

    @Test
    public void testParametersAreInitialisedAfterCarryOver() {

        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, cellId, timeStamp + FIVE_MINUTE + 100, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + 2 * FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess = sessions.get(1);
        assertThat(sess.getHSDSCH_USERS_TOTAL(), is(0));
        assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(0));
        assertThat(sess.getUL_INTERFERENCE_TOTAL(), is(0f));
        assertThat(sess.getUL_INTERFERENCE_SAMPLES(), is(0));
        assertThat(sess.getDL_NON_HS_TX_POWER_TOTAL(), is(0));
        assertThat(sess.getDL_NON_HS_TX_POWER_SAMPLES(), is(0));
        assertThat(sess.getCM_USER_TOTAL(), is(0));
        assertThat(sess.getCM_USER_SAMPLES(), is(0));
    }

    @Test
    public void testAverageHsUsersAfterCarryOver() {

        rncModuleId = 1;
        final int cellId1 = 1;
        final String imsi1 = "454061111111111";
        final short[] ueContexts = { 0, 1, 2, 3, 4, 5 };
        final short sourceConf = 1;
        final short targetConf = 25;
        final short[] hsUsers = { 0, 1, 2, 3, 4, 5 };
        final short[] ulInterference = { 0, 1, 2, 3, 4, 5 };
        final short[] dlNonHsPower = { 0, 1, 2, 3, 4, 5 };
        final byte[] cmUsers = { 0, 1, 2, 3, 4, 5 };
        final long timeStamp = getTimestamp();

        setUpRrcRabSession(cellId1, imsi1, timeStamp, sourceConf, targetConf, ueContexts[1], rncModuleId);
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + FIVE_MINUTE));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, cellId, timeStamp + FIVE_MINUTE + 100, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + FIVE_MINUTE + 1000, rncId, rncModuleId, hsUsers[1],
                ulInterference[1], dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + FIVE_MINUTE + 2000, rncId, rncModuleId, hsUsers[2],
                ulInterference[1], dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(createInterSysUtilEventsWithParams(cellId1, timeStamp + FIVE_MINUTE + 3000, rncId, rncModuleId, hsUsers[3],
                ulInterference[1], dlNonHsPower[1], cmUsers[1]));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp + 2 * FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final GPEH_SESSION sess = sessions.get(1);
        assertThat(sess.getHSDSCH_USERS_AVG(), is((short) Math.round(((hsUsers[1] + hsUsers[2] + hsUsers[3]) / 3.0))));
        assertThat(sess.getHSDSCH_USERS_TOTAL(), is(hsUsers[1] + hsUsers[2] + hsUsers[3]));
        assertThat(sess.getHSDSCH_USERS_SAMPLES(), is(3));

        //        System.out.println(sess.getDecodedString());
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