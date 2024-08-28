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

package com.ericsson.cepmediation.correlation.radio.handover;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.DefaultValues;
import com.ericsson.cepmediation.correlation.radio.RadioCorrelationBase;
import com.ericsson.cepmediation.correlation.radio.utils.Statements;
import com.ericsson.cepmediation.test.tools.calculators.*;
import com.espertech.esper.client.scopetest.SupportUpdateListener;

public class RadioCorrelationHandoverFailureTest extends RadioCorrelationBase {
    @Before
    public void setupListeners() throws Exception {
        configureEsper("esper/raw_events_base.epl", "esper/session_browser.epl");
        sessionListener = new SupportUpdateListener();
        addStatementAndListener(Statements.HANDOVER_ENRICHMENT, sessionListener);
    }

    @Test
    public void shouldSetDefaultFloatValueForEcno() throws Exception {
        processFile("handover/defaultFloatForEcno.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);
        assertThat(enrichedHho.getECNO_CELL_1(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
        assertThat(enrichedHho.getECNO_CELL_2(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
        assertThat(enrichedHho.getECNO_CELL_3(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
        assertThat(enrichedHho.getECNO_CELL_4(), is(DefaultValues.DEFAULT_FLOAT_VALUE));
    }

    @Test
    public void shouldStoreHandoverReceivedBeforeImsiEvent() throws Exception {
        processFile("handover/handoverBeforeImsi.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));
    }

    @Test
    public void shouldStoreHandoverReceivedAfterImsiEvent() throws Exception {
        processFile("handover/handoverAfterImsi.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));
    }

    @Test
    public void shouldStoreMutipleHandovers() throws Exception {
        processFile("handover/multipleHandovers.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(12));
    }

    @Test
    public void shouldStoreHandoverWhenImsiAfterSessionEnd() throws Exception {
        processFile("handover/imsiAfterSessionEndHandovers.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(3));
    }

    @Test
    public void shouldMapRscpLowerBoundaryValues() throws Exception {
        processFile("handover/mapRscpLowerBoundaryValues.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);

        validateRscpValues(enrichedHho, -6, -5, -4, 0);

    }

    @Test
    public void shouldMapRscpUpperBoundaryValues() throws Exception {
        processFile("handover/mapRscpUpperBoundaryValues.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);

        validateRscpValues(enrichedHho, 90, 91, 92, 0);

    }

    @Test
    public void shouldMapRscpInBetweenValues() throws Exception {
        processFile("handover/mapRscpValues.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);

        validateRscpValues(enrichedHho, -1, 0, 1, 30);

    }

    private void validateRscpValues(final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho, int rscp_cell_1, int rscp_cell_2, int rscp_cell_3,
                                    int rscp_cell_4) {
        final byte rscp1 = (byte) rscp_cell_1;
        final byte rscp2 = (byte) rscp_cell_2;
        final byte rscp3 = (byte) rscp_cell_3;
        final byte rscp4 = (byte) rscp_cell_4;

        if (rscp1 < -5)
            assertThat(enrichedHho.getRSCP_CELL_1(), is(Integer.MIN_VALUE));
        else
            assertThat(enrichedHho.getRSCP_CELL_1(), is(RscpMappingForTest.getMappedRscp(rscp1)));
        assertThat(enrichedHho.getRSCP_CELL_2(), is(RscpMappingForTest.getMappedRscp(rscp2)));
        assertThat(enrichedHho.getRSCP_CELL_3(), is(RscpMappingForTest.getMappedRscp(rscp3)));
        assertThat(enrichedHho.getRSCP_CELL_4(), is(RscpMappingForTest.getMappedRscp(rscp4)));
    }

    @Test
    public void shouldMapEcnoValues() throws Exception {
        processFile("handover/mapEcnoValues.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(1));

        final byte ecno1 = (byte) 8;
        final byte ecno2 = (byte) 0;
        final byte ecno4 = (byte) 91;
        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);
        assertThat(enrichedHho.getECNO_CELL_1(), is(EcnoMappingForTest.getMappedEcno(ecno1)));
        assertThat(enrichedHho.getECNO_CELL_2(), is(EcnoMappingForTest.getMappedEcno(ecno2)));
        assertThat(enrichedHho.getECNO_CELL_3(), is(DefaultValues.DEFAULT_FLOAT_VALUE));// ecno is negative
        assertThat(enrichedHho.getECNO_CELL_4(), is(EcnoMappingForTest.getMappedEcno(ecno4)));
    }

    @Test
    public void shouldMapTargetCellEcnoAndRscp() throws Exception {
        processFile("handover/mapTargetCellEcnoAndRscp.txt");

        final List<INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED> handovers = getHandovers();
        assertThat(handovers.size(), is(2));

        final int rssi = 63;
        final int rscp = 14;
        final int ecno = 63;
        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho = handovers.get(0);
        assertThat(enrichedHho.getTARGET_CELL_RSSI(), is(RssiMappingForTest.getMappedRssi(rssi)));
        assertThat(enrichedHho.getTARGET_CELL_RSCP(), is(Integer.MIN_VALUE));
        assertThat(enrichedHho.getTARGET_CELL_ECNO(), is(DefaultValues.DEFAULT_FLOAT_VALUE));

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED enrichedHho2 = handovers.get(1);
        assertThat(enrichedHho2.getTARGET_CELL_RSSI(), is((byte) -1));
        assertThat(enrichedHho2.getTARGET_CELL_RSCP(), is(RscpMappingForTest.getMappedRscp(rscp)));
        assertThat(enrichedHho2.getTARGET_CELL_ECNO(), is(EcnoMappingForTest.getMappedEcno(ecno)));
    }
}