package com.ericsson.cepmediation.correlation.radio;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_RELEASE;
import com.ericsson.cepmediation.correlation.RadioSession;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.support.Configurator;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.event.arr.ObjectArrayEventBean;

public class RadioCorrelationSessionStartMarkerTest extends RadioCorrelationBase {

    @Before
    public void warmUp() throws Exception {

        configure(Configurator.testInstance().getProperties().getProperty("default.epl.name"));

        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void shouldCreateSessionStartMarkerWhenConnectionSetUpFollowedByImsi() {
        ueContext = 1;
        rncModuleId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        rncId = 76;
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        int rrcCount = 0;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 300, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 200, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 300, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertTrue(sess.getTimestamp() == 1 || sess.getTimestamp() == (1 + FIVE_MINUTE));
            if (sess.getTimestamp() == 1) {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi1)));
            } else {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi2)));
            }
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void shouldCreateSessionStartMarkerWhenConnectionSetUpFollowedByMultipleImsis() {
        ueContext = 1;
        rncModuleId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        rncId = 76;
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        int rrcCount = 0;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 400, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 200, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 400, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertTrue(sess.getTimestamp() == 1 || sess.getTimestamp() == (1 + FIVE_MINUTE));
            if (sess.getTimestamp() == 1) {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi1)));
            } else {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi2)));
            }
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void shouldCreateSessionStartMarkerWhenMultipleConnectionSetUpFollowedByImsi() {
        ueContext = 1;
        rncModuleId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        rncId = 76;
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        int rrcCount = 0;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 1000, rncId, rncModuleId,
                ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 1100, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 1300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + 1000 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2 + 1000, rncId, rncModuleId,
                ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 1100, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 1300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + 1000 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertTrue(sess.getTimestamp() == timeStamp1 + 1000 || sess.getTimestamp() == (timeStamp2 + 1000));
            if (sess.getTimestamp() == timeStamp1 + 1000) {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi1)));
            } else {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi2)));
            }
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void shouldCreateSessionStartMarkerWhenMultipleConnectionSetUpFollowedByMultipleImsis() {
        ueContext = 1;
        rncModuleId = 1;
        final String imsi1 = "454061111111111";
        final String imsi2 = "454062222222222";
        rncId = 76;
        final short sourceConf = 1;
        final short targetConf = 25;
        final long timeStamp1 = 1;
        final long timeStamp2 = timeStamp1 + FIVE_MINUTE;
        int rrcCount = 0;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 1000, rncId, rncModuleId,
                ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 1100, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 1200, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 1300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 1400, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + 1000 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2 + 1000, rncId, rncModuleId,
                ueContext));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 1100, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 1200, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 1300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 1400, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + 1000 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertTrue(sess.getTimestamp() == timeStamp1 + 1000 || sess.getTimestamp() == (timeStamp2 + 1000));
            if (sess.getTimestamp() == timeStamp1 + 1000) {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi1)));
            } else {
                assertThat(sess.getIMSI(), is(Long.parseLong(imsi2)));
            }
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    //@Test
    public void shouldEnrichSessionWithRabEstablishment() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;

        final GpehBase connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp);

        final INTERNAL_IMSI imsi = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsi);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(rabEstablishment);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));

        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        final EventBean[] eventBeanArray = eventListBean.get(0);
        final RadioSession radioSession = (RadioSession) eventBeanArray[0].getUnderlying();
        System.out.println(radioSession.toString());
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldEnrichEventWithAfterImsiPattern() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;

        final GpehBase connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp);

        final INTERNAL_IMSI imsi = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsi);

        final INTERNAL_IMSI imsi2 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsi2);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(rabEstablishment);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment2 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(rabEstablishment2);

        final GpehBase connectionSetUp2 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp2);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment3 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(rabEstablishment3);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        System.out.println("imsi1 : " + imsi.getIMSI());
        System.out.println("imsi2 : " + imsi2.getIMSI());
        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        final EventBean[] eventBeanArray = eventListBean.get(0);
        final RadioSession radioSession = (RadioSession) eventBeanArray[0].getUnderlying();
        System.out.println(radioSession.toString());
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void bulkVolumeTest() {
        GpehBase connectionSetUp = null;

        ueContext = 1;
        rncModuleId = 1;
        rncId = 1;
        for (int i = 0; i < 100; i++) {
            connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, i, rncId, rncModuleId++, ueContext++);
            reset();
            correlationEngine.sendEvent(connectionSetUp);
        }
        ueContext = 1;
        rncModuleId = 1;
        for (int i = 0; i < 100; i++) {
            connectionSetUp = createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, i + i, rncId, rncModuleId++, ueContext++);
            reset();
            correlationEngine.sendEvent(connectionSetUp);
        }
        ueContext = 1;
        rncModuleId = 1;
        connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId++, ueContext++);
        reset();
        correlationEngine.sendEvent(connectionSetUp);
        ueContext = 1;
        rncModuleId = 1;
        for (int i = 0; i < 1000 * 1000; i++) {
            connectionSetUp = createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId, i, rncId, rncModuleId++, ueContext++);
            reset();
            correlationEngine.sendEvent(connectionSetUp);
        }
        ueContext = 1;
        rncModuleId = 1;
        rncId = 1;

    }

    private void reset() {
        if (rncModuleId == 100)
            rncModuleId = 1;
        if (ueContext == 100)
            ueContext = 1;
    }

    @Ignore
    public void rabTest() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;
        short targetConf = -1;
        final GpehBase connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, getTimestamp(), rncId, rncModuleId,
                ueContext);
        correlationEngine.sendEvent(connectionSetUp);

        rncModuleId = 1;
        final INTERNAL_IMSI imsi = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, getTimestamp(), rncId, rncModuleId,
                ueContext);
        imsi.setIMSI("111111");
        correlationEngine.sendEvent(imsi);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, getTimestamp(), rncId, rncModuleId, ueContext);
        rabEstablishment.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment);
        targetConf = 12;

        final byte a = -1;
        final byte b = 2;
        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment2 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, getTimestamp() + 11000, rncId, rncModuleId, ueContext);
        rabEstablishment2.setTARGET_CONF(targetConf);
        rabEstablishment2.setHS_DSCH_PHYSICAL_LAYER_CATEGORY(a);
        rabEstablishment2.setE_DCH_PHYSICAL_LAYER_CATEGORY(b);
        correlationEngine.sendEvent(rabEstablishment2);

        final short sourceConf = 66;
        targetConf = 100;
        final INTERNAL_RAB_RELEASE release = (INTERNAL_RAB_RELEASE) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_RELEASE, cellId,
                getTimestamp() + 32000, rncId, rncModuleId, ueContext);
        release.setSOURCE_CONF(sourceConf);
        release.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(release);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));

        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        EventBean[] eventBeanArray = null;
        if (eventListBean != null)
            eventBeanArray = eventListBean.get(0);
        GPEH_SESSION radioSession = null;
        for (int i = 0; i < eventBeanArray.length; i++) {
            radioSession = (GPEH_SESSION) eventBeanArray[i].getUnderlying();
            System.out.println(radioSession.getPS_RAB_ACTIVITY_END_TIME() + " start::: " + radioSession.getPS_RAB_ACTIVITY_START_TIME());
            System.out.println(radioSession.getDecodedString());
        }

    }

    //@Test
    public void shouldEnrichMiddleEventsAndAfterEventsInSeqeunce() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;
        final short targetConf = 11;
        final GpehBase connectionSetUp1 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp1);

        rncModuleId = 55;
        final GpehBase connectionSetUp55 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 555, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp55);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 111, rncId, rncModuleId, ueContext);
        rabEstablishment.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment);

        rncModuleId = 1;
        final INTERNAL_IMSI imsi1 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 112, rncId, rncModuleId, ueContext);
        imsi1.setIMSI("111111");
        correlationEngine.sendEvent(imsi1);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment2 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 113, rncId, rncModuleId, ueContext);
        rabEstablishment2.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment2);

        rncModuleId = 55;
        final INTERNAL_IMSI imsi55 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 55551, rncId, rncModuleId, ueContext);
        imsi55.setIMSI("55555555");
        correlationEngine.sendEvent(imsi55);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment55 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(
                GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId, 55552, rncId, rncModuleId, ueContext);
        rabEstablishment55.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment55);

        rncModuleId = 1;
        final INTERNAL_IMSI imsi2 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 114, rncId, rncModuleId, ueContext);
        imsi2.setIMSI("111111");
        correlationEngine.sendEvent(imsi2);

        rncModuleId = 55;
        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment3 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 115, rncId, rncModuleId, ueContext);
        rabEstablishment3.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment3);

        rncModuleId = 1;
        final GpehBase connectionSetUp2 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 2, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp2);

        rncModuleId = 55;
        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment4 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 221, rncId, rncModuleId, ueContext);
        rabEstablishment4.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment4);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment5 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 223, rncId, rncModuleId, ueContext);
        rabEstablishment5.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment5);

        rncModuleId = 1;
        final INTERNAL_IMSI imsi3 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 224, rncId, rncModuleId, ueContext);
        imsi3.setIMSI("222222");
        correlationEngine.sendEvent(imsi3);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment6 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 225, rncId, rncModuleId, ueContext);
        rabEstablishment6.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment6);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));

        //		List<EventBean[]>  eventListBean = enhancedEventListener.getNewDataList();
        //	    for (Iterator<EventBean[]> iterator = eventListBean.iterator(); iterator.hasNext();) {
        //			EventBean[] eventBeans = (EventBean[]) iterator.next();
        //			for (int i = 0; i < eventBeans.length; i++) {
        //				ObjectArrayEventBean objectArrayEventBean = (ObjectArrayEventBean) eventBeans[0];
        //				Object[] objectArray = objectArrayEventBean.getProperties();
        //				String imsi = objectArray[0].toString();
        //				GpehBase gpehBase = (GpehBase)((BeanEventBean)objectArray[1]).getUnderlying();
        //				System.out.println("imsi_" + imsi + "rncModuleId_" + gpehBase.getRNC_MODULE_ID() + "ue_"+ gpehBase.getUE_CONTEXT() 
        //						+ "timestamp_" + gpehBase.getTimestamp()
        //						+ "_eventType" + gpehBase.getType() + "_cellID" + gpehBase.getC_ID_1()
        //						+ "_rncId" + gpehBase.getRNC_ID_1()) ;
        //			}
        //			
        //		}

        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        EventBean[] eventBeanArray = null;
        if (eventListBean != null)
            eventBeanArray = eventListBean.get(0);
        GPEH_SESSION radioSession = null;
        for (int i = 0; i < eventBeanArray.length; i++) {
            radioSession = (GPEH_SESSION) eventBeanArray[i].getUnderlying();
            System.out.println(radioSession.getDecodedString());
        }
        //		Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());

    }

    //@Test
    public void shouldEnrichBetweenImsiAndConnectionSetUp() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;
        short targetConf = 11;
        final GpehBase connectionSetUp1 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp1);

        final INTERNAL_IMSI imsi1 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 111, rncId, rncModuleId, ueContext);
        imsi1.setIMSI("111111");
        correlationEngine.sendEvent(imsi1);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 1112, rncId, rncModuleId, ueContext);
        rabEstablishment.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment2 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 1113, rncId, rncModuleId, ueContext);
        targetConf = 12;
        rabEstablishment2.setTARGET_CONF(targetConf);
        correlationEngine.sendEvent(rabEstablishment2);
        //		
        //		GpehBase connectionSetUp2 = createRadioEventsWithParams(GpehEvent.RRC_RRC_CONNECTION_SETUP, cellId, 2, rncId, rncModuleId, ueContext);
        //		correlationEngine.sendEvent(connectionSetUp2);
        //		
        //		INTERNAL_IMSI imsi2 = (INTERNAL_IMSI)createRadioEventsWithParams(GpehEvent.INTERNAL_IMSI, cellId, 111, rncId, rncModuleId, ueContext);
        //		imsi2.setIMSI("222222");
        //		correlationEngine.sendEvent(imsi2);
        //		
        //		INTERNAL_RAB_ESTABLISHMENT rabEstablishment3 = (INTERNAL_RAB_ESTABLISHMENT)createRadioEventsWithParams(GpehEvent.INTERNAL_RAB_ESTABLISHMENT, cellId, 222, rncId, rncModuleId, ueContext);
        //		correlationEngine.sendEvent(rabEstablishment3);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));

        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        final EventBean[] eventBeanArray = eventListBean.get(0);
        GPEH_SESSION radioSession = null;
        for (int i = 0; i < eventBeanArray.length; i++) {
            radioSession = (GPEH_SESSION) eventBeanArray[i].getUnderlying();
            System.out.println(radioSession.getDecodedString());
        }
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldEnrichEventWithMiddlePattern() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;

        final GpehBase connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp);

        final INTERNAL_IMSI imsi = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        imsi.setIMSI("111111");
        correlationEngine.sendEvent(imsi);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        short conf = 11;
        rabEstablishment.setTARGET_CONF(conf);
        correlationEngine.sendEvent(rabEstablishment);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment2 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        conf = 12;
        rabEstablishment2.setTARGET_CONF(conf);
        correlationEngine.sendEvent(rabEstablishment2);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment3 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        conf = 13;
        rabEstablishment3.setTARGET_CONF(conf);
        correlationEngine.sendEvent(rabEstablishment3);

        final INTERNAL_IMSI imsi2 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        imsi2.setIMSI("222222");
        correlationEngine.sendEvent(imsi2);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment4 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        conf = 14;
        rabEstablishment4.setTARGET_CONF(conf);
        correlationEngine.sendEvent(rabEstablishment4);

        final GpehBase connectionSetUp2 = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp2);

        final INTERNAL_RAB_ESTABLISHMENT rabEstablishment5 = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT,
                cellId, 4, rncId, rncModuleId, ueContext);
        conf = 15;
        rabEstablishment5.setTARGET_CONF(conf);
        correlationEngine.sendEvent(rabEstablishment5);

        final INTERNAL_IMSI imsi3 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 2, rncId, rncModuleId, ueContext);
        imsi3.setIMSI("33333");
        correlationEngine.sendEvent(imsi3);

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        System.out.println("imsi1 : " + imsi.getIMSI());
        System.out.println("imsi2 : " + imsi2.getIMSI());
        final List<EventBean[]> eventListBean = sessionListener.getNewDataList();
        final EventBean[] eventBeanArray = eventListBean.get(0);
        GPEH_SESSION radioSession = null;
        for (int i = 0; i < eventBeanArray.length; i++) {
            radioSession = (GPEH_SESSION) eventBeanArray[i].getUnderlying();
            System.out.println(radioSession.getDecodedString());
        }
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldConsiderTheDifferentUEBetweenConnectionSetUpAndImsi() {
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;
        final GpehBase connectionSetUp = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(connectionSetUp);
        ueContext = 2;
        rncModuleId = 1;
        rncId = 76;
        final INTERNAL_IMSI imsi1 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsi1);
        ueContext = 1;
        rncModuleId = 1;
        rncId = 76;
        final INTERNAL_IMSI imsi2 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, 1, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(imsi2);
        System.out.println(imsi1.getIMSI());
        System.out.println(imsi2.getIMSI());
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldCreateSessionStartMarkerWhenConnectionSetUpAndImsiPairHasEventsBetween() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CALL_SETUP_FAIL, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 1, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldNotCreateSessionStartMarkerWhenConnectionSetUpFollowedByInternalImsiBelongsToADifferentRNC() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CALL_SETUP_FAIL, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, rncId, rncModuleId, ueContext));
        rncId = 2;
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 0, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldNotCreateSessionStartMarkerWhenConnectionSetUpFollowedByInternalImsiWhichHasSmallerTimestamp() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CALL_SETUP_FAIL, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, getTimestamp() - 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 0, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldNotCreateSessionStartMarkerWhenConnectionSetUpFollowedByInternalImsiWhichHasDifferentUE() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CALL_SETUP_FAIL, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, rncId, rncModuleId, ueContext));
        ueContext = 0;
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, getTimestamp() - 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 0, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldNotCreateSessionStartMarkerWhenConnectionSetUpFollowedByInternalImsiWhichHasADifferentRncModuleId() {
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CALL_SETUP_FAIL, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, rncId, rncModuleId, ueContext));
        rncModuleId = 0;
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, getTimestamp() + FIVE_MINUTE, rncId,
                rncModuleId, ueContext));
        Assert.assertEquals("numberOfSessionsCreated", 0, sessionListener.getNewDataList().size());
    }

    //@Test
    public void shouldSessionStartMarkerActualStartTimeMatchWithTheConnectionSetUpObjectsTimestamp() {
        final GpehBase gpehBase = createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, rncId, rncModuleId, ueContext);
        correlationEngine.sendEvent(gpehBase);
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, rncId, rncModuleId, ueContext));
        final List<EventBean[]> eventBean = sessionListener.getNewDataList();
        Assert.assertEquals("actualStartTime", gpehBase.getTimestamp(), ((ObjectArrayEventBean) eventBean.get(0)[0]).getProperties()[2]);
    }

}
