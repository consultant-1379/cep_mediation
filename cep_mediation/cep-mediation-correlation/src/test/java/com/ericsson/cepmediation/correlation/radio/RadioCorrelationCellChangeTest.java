/**
 * -----------------------------------------------------------------------
 *     Copyright (C) 2012 LM Ericsson Limited.  All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.ericsson.cepmediation.correlation.radio;

import static com.ericsson.cepmediation.correlation.Constants.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IMSI;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_RAB_ESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.enrichment.SessionEndEvent;
import com.ericsson.cepmediation.test.common.GpehEventType;
import com.ericsson.cepmediation.test.tools.calculators.EcnoMappingForTest;
import com.ericsson.cepmediation.test.tools.calculators.RscpMappingForTest;
import com.espertech.esper.client.EventBean;

/**
 * 
 * @author emicned
 *
 */
public class RadioCorrelationCellChangeTest extends RadioCorrelationBase {
    private long sessionStart;

    @Before
    public void setup() throws Exception {
        configure("esper/rc.epl");
        rncId = 308;
        rncModuleId = (byte) 309;
        ueContext = 1;
        cellId = 1;
        addStatementAndListener("CellChange-Enrichment", sessionListener);

        final Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 0);
        sessionStart = cal.getTimeInMillis();
    }

    @Test
    public void unsetEcnoValuesSetToFloatMinValue() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE hho = (INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) createRadioEventsWithParams(
                GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, cellId, sessionStart + 2, rncId, rncModuleId, ueContext);
        hho.setCPICH_EC_NO_SOURCE_CELL((byte) -1);
        hho.setCPICH_EC_NO_TARGET_CELL((byte) -1);
        correlationEngine.sendEvent(hho);

        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 3);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> handovers = getCellChanges();
        assertThat(handovers.size(), is(1));

        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED enrichedHho = handovers.get(0);
        assertThat(enrichedHho.getSOURCE_CELL_ECNO(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
        assertThat(enrichedHho.getTARGET_CELL_ECNO(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
    }

    @Test
    public void shouldStoreCellChangeReceivedBeforeImsiEvent() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 2);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 3);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> cc = getCellChanges();
        assertThat(cc.size(), is(1));
    }

    @Test
    public void shouldStoreCellChangesReceivedAfterImsiEvent() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 3);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> cc = getCellChanges();
        assertThat(cc.size(), is(1));
    }

    @Test
    public void shouldStoreMutipleCellChanges() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        final INTERNAL_IMSI imsi1 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, sessionStart + 2, rncId, rncModuleId,
                ueContext);
        correlationEngine.sendEvent(imsi1);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 8);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        sessionStart += FIVE_MINUTE;
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        final INTERNAL_IMSI imsi2 = (INTERNAL_IMSI) createRadioEventsWithParams(GpehEventType.INTERNAL_IMSI, cellId, sessionStart + 2, rncId, rncModuleId,
                ueContext);
        correlationEngine.sendEvent(imsi2);
        sendEvent(GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, sessionStart + 2);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(2));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> cc = getCellChanges();
        assertThat(cc.size(), is(3));
        assertThat(cc.get(0).getIMSI(), is(Long.parseLong(imsi1.getIMSI())));
        assertThat(cc.get(1).getIMSI(), is(Long.parseLong(imsi1.getIMSI())));
        assertThat(cc.get(2).getIMSI(), is(Long.parseLong(imsi2.getIMSI())));
    }

    @Test
    public void shouldMapRscpValues() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE cc = (INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) createRadioEventsWithParams(
                GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, cellId, sessionStart + 2, rncId, rncModuleId, ueContext);
        final byte rscp1 = (byte) 8;
        cc.setCPICH_RSCP_SOURCE_CELL(rscp1);
        final byte rscp2 = (byte) 0;
        cc.setCPICH_RSCP_TARGET_CELL(rscp2);
        correlationEngine.sendEvent(cc);
        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 3);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> ccs = getCellChanges();
        assertThat(ccs.size(), is(1));

        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED enrichedCc = ccs.get(0);
        assertThat(enrichedCc.getSOURCE_CELL_RSCP(), is(RscpMappingForTest.getMappedRscp(rscp1)));
        assertThat(enrichedCc.getTARGET_CELL_RSCP(), is(RscpMappingForTest.getMappedRscp(rscp2)));
    }

    @Test
    public void shouldMapEcnoValues() {
        sendEvent(GpehEventType.RRC_RRC_CONNECTION_SETUP, sessionStart + 1);
        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE hho = (INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE) createRadioEventsWithParams(
                GpehEventType.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE, cellId, sessionStart + 2, rncId, rncModuleId, ueContext);
        final byte ecno = (byte) 8;
        hho.setCPICH_EC_NO_SOURCE_CELL(ecno);
        final byte ecno2 = (byte) 0;
        hho.setCPICH_EC_NO_TARGET_CELL(ecno2);
        correlationEngine.sendEvent(hho);

        sendEvent(GpehEventType.INTERNAL_IMSI, sessionStart + 3);
        sendRabEstEvent(sessionStart + 5);
        sendEvent(GpehEventType.RRC_UPLINK_DIRECT_TRANSFER, sessionStart + 7);
        sendEvent(GpehEventType.INTERNAL_SOFT_HANDOVER_EXECUTION, sessionStart + 9);

        sendEvent(GpehEventType.RRC_RRC_CONNECTION_RELEASE_COMPLETE, sessionStart + 130);
        correlationEngine.sendEvent(new SessionEndEvent(sessionStart + FIVE_MINUTE));

        final List<GPEH_SESSION> sessions = getSessionsCreated();
        assertThat(sessions.size(), is(1));

        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> handovers = getCellChanges();
        assertThat(handovers.size(), is(1));

        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED enrichedHho = handovers.get(0);
        assertThat(enrichedHho.getSOURCE_CELL_ECNO(), is(EcnoMappingForTest.getMappedEcno(ecno)));
        assertThat(enrichedHho.getTARGET_CELL_ECNO(), is(EcnoMappingForTest.getMappedEcno(ecno2)));
    }

    private void sendRabEstEvent(final long increment) {
        final INTERNAL_RAB_ESTABLISHMENT ire = (INTERNAL_RAB_ESTABLISHMENT) createRadioEventsWithParams(GpehEventType.INTERNAL_RAB_ESTABLISHMENT, cellId,
                increment, rncId, rncModuleId, ueContext);
        ire.setTARGET_CONF(FACH_RACH);
        ire.setSOURCE_CONF((short) 1);
        final byte hsCat = 1;
        final byte eulCat = 2;
        ire.setHS_DSCH_PHYSICAL_LAYER_CATEGORY(hsCat);
        ire.setE_DCH_PHYSICAL_LAYER_CATEGORY(eulCat);
        correlationEngine.sendEvent(ire);
    }

    private void sendEvent(final GpehEventType eventType, final long startTime) {
        correlationEngine.sendEvent(createRadioEventsWithParams(eventType, cellId, startTime, rncId, rncModuleId, ueContext));
    }

    private List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> getCellChanges() {
        final List<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED> sessions = new ArrayList<INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED>();
        final List<EventBean[]> output = sessionListener.getNewDataList();
        for (final EventBean[] eventBeans : output) {
            for (final EventBean eventBean : eventBeans) {
                final Object underlyingObject = eventBean.getUnderlying();
                if (underlyingObject instanceof INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED) {
                    sessions.add((INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED) underlyingObject);
                }
            }
        }

        return sessions;
    }
}
