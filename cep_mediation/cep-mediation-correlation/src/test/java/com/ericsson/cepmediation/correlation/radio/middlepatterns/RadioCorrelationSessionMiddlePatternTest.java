package com.ericsson.cepmediation.correlation.radio.middlepatterns;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.test.common.GpehEventType;

public class RadioCorrelationSessionMiddlePatternTest extends RadioCorrelationBase {

    @Before
    public void warmUp() throws Exception {

        configure("esper/rc.epl");
        rncId = 1;
        rncModuleId = 1;
        ueContext = 1;
        cellId = 1;
    }

    @Test
    public void testEnrichMiddleEventsBetweenConnectionSetUpAndImsi() {
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
        final byte reasonMobilityCoverage = 3;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 500, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 500, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertThat(sess.getCS_REASON_MOBILITY_COVERAGE(), is((short) 2));
            assertThat(sess.getCM_CNT(), is(0));
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void testEnrichMiddleEventsBetweenMultipleConnectionSetupFollowedByImsi() {
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
        final byte reasonMobilityCoverage = 3;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 150, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 500, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 150, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 200, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 500, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertThat(sess.getCS_REASON_MOBILITY_COVERAGE(), is((short) 2));
            assertThat(sess.getCM_CNT(), is(0));
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void testEnrichMiddleEventsBetweenEachConnectionSetupFollowedByImsi() {
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
        final byte reasonMobilityCoverage = 3;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 2, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 350, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 380, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 500, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 2, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 350, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 380, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 500, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertThat(sess.getCS_REASON_MOBILITY_COVERAGE(), is((short) 2));
            assertThat(sess.getCM_CNT(), is(0));
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

    @Test
    public void testEnrichMiddleEventsBetweenEachConnectionSetupFollowedByMultipleImsis() {
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
        final byte reasonMobilityCoverage = 3;
        final byte reasonCapacity = 7;

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp1 + 2, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp1 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp1 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 350, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 380, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 500, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 520, rncId, rncModuleId, ueContext, reasonCapacity));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp1 + 530, rncId, rncModuleId, ueContext, reasonCapacity));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp1 + 900, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp1 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp1 + FIVE_MINUTE));

        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 1, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.INTERNAL_CMODE_ACTIVATE, cellId, timeStamp2 + 2, rncId, rncModuleId, ueContext));
        correlationEngine
                .sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_SETUP, cellId, timeStamp2 + 100, rncId, rncModuleId, ueContext));
        correlationEngine.sendEvent(createRabEventsWithParams(cellId, timeStamp2 + 300, rncId, rncModuleId, ueContext, sourceConf, targetConf));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2 + 350, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2 + 380, rncId, rncModuleId, ueContext, reasonMobilityCoverage));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 500, rncId, rncModuleId, ueContext, imsi2));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2 + 520, rncId, rncModuleId, ueContext, reasonCapacity));
        correlationEngine.sendEvent(createChannelSwitchEventsWithParams(cellId, timeStamp2 + 530, rncId, rncModuleId, ueContext, reasonCapacity));
        correlationEngine.sendEvent(createImsiEventsWithParams(cellId, timeStamp2 + 900, rncId, rncModuleId, ueContext, imsi1));
        correlationEngine.sendEvent(createRadioEventsWithParams(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, cellId, timeStamp2 + 1500, rncId,
                rncModuleId, ueContext));
        correlationEngine.sendEvent(new SessionEndEvent(timeStamp2 + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        for (final GPEH_SESSION sess : sessions) {
            System.out.println(sess.getDecodedString());
            assertThat(sess.getCS_REASON_MOBILITY_COVERAGE(), is((short) 2));
            assertThat(sess.getCM_CNT(), is(0));
            assertThat(sess.getCS_REASON_CAPACITY(), is((short) 2));
            rrcCount = rrcCount + sess.getRRC_CONNECTION_CNT();
        }
        assertThat(rrcCount, is(2));

    }

}