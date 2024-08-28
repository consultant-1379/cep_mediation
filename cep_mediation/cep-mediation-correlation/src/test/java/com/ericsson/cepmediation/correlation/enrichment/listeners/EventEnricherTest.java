/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.cepmediation.correlation.enrichment.listeners;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.correlation.lookup.LookupService;

public class EventEnricherTest {

    private EventEnricher eventEnricher;

    LookupService lookupService;

    private final short servingRncId = 3;

    private final int servingCellId = 4;

    private final short servingRncIdDU = 3;

    private final short servingCellIdDU = 4;

    private final long hier3IdForServingCell = 45;

    private final long hier321IdForServingCell = 78;

    private final long hier3cellIdForServingCell = 67;

    private final short rncId2 = 17;

    private final int cellId2 = 78;

    private final long hier3IdForCell2 = 4;

    private final long hier321IdForCell2 = 444;

    private final long hier3cellIdForCell2 = 99;

    private final short rncId3 = 1212;

    private final int cellId3 = 343;

    private final short rncId4 = 45;

    private final int cellId4 = 4545;

    private final long hier3IdForCell3 = 7979;

    private final long hier321IdForCell3 = 3434;

    private final long hier3cellIdForCell3 = 3435;

    private final long hier3IdForCell4 = 5656;

    private final long hier321IdForCell4 = 4545;

    private final long hier3cellIdForCell4 = 454545;

    private final String cellIdForServingCell = "a cell";

    private final String cellIdForCell2 = "another cell";

    private final String cellIdForCell3 = "yet another";

    private final String cellIdForCell4 = " and another";

    private final int hho_id_4 = 4999;

    private static final long HIER3_ID_FOR_CELL_IFHO_ACTIVE= -1;

    private static final long HIER321_ID_FOR_CELL_IFHO_ACTIVE = -1;

    private static final long HIER3_CELL_ID_FOR_CELL_IFHO_ACTIVE = -1;

    private static final short RNC_ID_NU_FREQ = 34;

    private final String SUBNETWORK = "ONRM_RootMo_R,MeContext=LTE01ERBS00001" ;

    private final int IMSI = 499934534;

    @Before
    public void setup() {
        lookupService = mock(LookupService.class);
        eventEnricher = new StubbedEventEnricher();
    }

    @Test
    public void testEERRCMeasurementEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final EE_RRC_MEASUREMENT event = new EE_RRC_MEASUREMENT();
        setTopologyFieldsOnEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnEvent(final EE_RRC_MEASUREMENT event) {
        event.setRNC_ID_1(servingRncId);
        event.setC_ID_1(servingCellId);
        event.setRNC_ID_2(rncId2);
        event.setC_ID_2(cellId2);
        event.setRNC_ID_3(rncId3);
        event.setC_ID_3(cellId3);
        event.setRNC_ID_4(rncId4);
        event.setC_ID_4(cellId4);
    }

    private void checkHashingIdFieldsCorrectlyUpdated(
            final EE_RRC_MEASUREMENT event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));
        assertThat(event.getCELL_ID_1(), is(cellIdForServingCell));

        assertThat(event.getHIER3_ID_2(), is(hier3IdForCell2));
        assertThat(event.getHIER321_ID_2(), is(hier321IdForCell2));
        assertThat(event.getHIER3_CELL_ID_2(), is(hier3cellIdForCell2));
        assertThat(event.getCELL_ID_2(), is(cellIdForCell2));

        assertThat(event.getHIER3_ID_3(), is(hier3IdForCell3));
        assertThat(event.getHIER321_ID_3(), is(hier321IdForCell3));
        assertThat(event.getHIER3_CELL_ID_3(), is(hier3cellIdForCell3));
        assertThat(event.getCELL_ID_3(), is(cellIdForCell3));

        assertThat(event.getHIER3_ID_4(), is(hier3IdForCell4));
        assertThat(event.getHIER321_ID_4(), is(hier321IdForCell4));
        assertThat(event.getHIER3_CELL_ID_4(), is(hier3cellIdForCell4));
        assertThat(event.getCELL_ID_4(), is(cellIdForCell4));
    }

    private void setUpMockedHashIdsInLookupService() {
        final HashId hashIdForServingCell = new HashId(hier3IdForServingCell,
                hier321IdForServingCell, hier3cellIdForServingCell,
                cellIdForServingCell, null, 0, (byte) 1, (byte) 1);
        final List<HashId> servingCellList = new ArrayList<HashId>();
        servingCellList.add(hashIdForServingCell);
        when(lookupService.getHashId(servingCellId, servingRncId))
                .thenReturn(servingCellList);
        final HashId hashIdForCell2 = new HashId(hier3IdForCell2,
                hier321IdForCell2, hier3cellIdForCell2, cellIdForCell2, null,
                0, (byte) 1, (byte) 1);
        final List<HashId> cell2List = new ArrayList<HashId>();
        cell2List.add(hashIdForCell2);
        when(lookupService.getHashId(cellId2, rncId2)).thenReturn(cell2List);
        final HashId hashIdForCell3 = new HashId(hier3IdForCell3,
                hier321IdForCell3, hier3cellIdForCell3, cellIdForCell3, null,
                0, (byte) 1, (byte) 1);
        final List<HashId> cell3List = new ArrayList<HashId>();
        cell3List.add(hashIdForCell3);
        when(lookupService.getHashId(cellId3, rncId3)).thenReturn(cell3List);
        final HashId hashIdForCell4 = new HashId(hier3IdForCell4,
                hier321IdForCell4, hier3cellIdForCell4, cellIdForCell4, null,
                0, (byte) 1, (byte) 1);
        final List<HashId> cell4List = new ArrayList<HashId>();
        cell4List.add(hashIdForCell4);
        when(lookupService.getHashId(cellId4, rncId4)).thenReturn(cell4List);
        final HashId hashIdForhho4 = new HashId(hier3IdForCell4,
                hier321IdForCell4, hier3cellIdForCell4, cellIdForCell4, null,
                0, (byte) 1, (byte) 1);
        final List<HashId> ho4List = new ArrayList<HashId>();
        ho4List.add(hashIdForhho4);
        when(lookupService.getHashId(cellId2, hho_id_4)).thenReturn(ho4List);

        when(lookupService.getRncId(SUBNETWORK)).thenReturn(servingRncId);
    }

    class StubbedEventEnricher extends EventEnricher {
        @Override
        LookupService getDefaultLookupService() {
            return lookupService;
        }
    }

    @Test
    public void testHHOFailureEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED event = new INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED(
                new INTERNAL_OUT_HARD_HANDOVER_FAILURE());
        setTopologyFieldsOnHHOFailureEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsHHOCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnHHOFailureEvent(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_2(rncId2);
        event.getBase().setC_ID_2(cellId2);
        event.getBase().setRNC_ID_3(rncId3);
        event.getBase().setC_ID_3(cellId3);
        event.getBase().setRNC_ID_4(rncId4);
        event.getBase().setC_ID_4(cellId4);
        event.getBase().setHHO_TARGET_ID_3(cellId2);
        event.getBase().setHHO_TARGET_ID_4(hho_id_4);
    }

    private void checkHashingIdFieldsHHOCorrectlyUpdated(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));
        assertThat(event.getCELL_ID_1(), is(cellIdForServingCell));

        assertThat(event.getHIER3_ID_2(), is(hier3IdForCell2));
        assertThat(event.getHIER321_ID_2(), is(hier321IdForCell2));
        assertThat(event.getHIER3_CELL_ID_2(), is(hier3cellIdForCell2));
        assertThat(event.getCELL_ID_2(), is(cellIdForCell2));

        assertThat(event.getHIER3_ID_3(), is(hier3IdForCell3));
        assertThat(event.getHIER321_ID_3(), is(hier321IdForCell3));
        assertThat(event.getHIER3_CELL_ID_3(), is(hier3cellIdForCell3));
        assertThat(event.getCELL_ID_3(), is(cellIdForCell3));

        assertThat(event.getHIER3_ID_4(), is(hier3IdForCell4));
        assertThat(event.getHIER321_ID_4(), is(hier321IdForCell4));
        assertThat(event.getHIER3_CELL_ID_4(), is(hier3cellIdForCell4));
        assertThat(event.getCELL_ID_4(), is(cellIdForCell4));

        assertThat(event.getTHIER3_ID(), is(hier3IdForCell4));
        assertThat(event.getTHIER321_ID(), is(hier321IdForCell4));
        assertThat(event.getTHIER3_CELL_ID(), is(hier3cellIdForCell4));
    }

    @Test
    public void testHSDSCHFailureEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED event = new INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED(
                new INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE());
        setTopologyFieldsOnHSDSCHFailureEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsHSDSCHCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnHSDSCHFailureEvent(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_2(rncId2);
        event.getBase().setC_ID_2(cellId2);
        event.getBase().setRNC_ID_3(rncId3);
        event.getBase().setC_ID_3(cellId3);
        event.getBase().setRNC_ID_4(rncId4);
        event.getBase().setC_ID_4(cellId4);
    }

    private void checkHashingIdFieldsHSDSCHCorrectlyUpdated(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));
        assertThat(event.getCELL_ID_1(), is(cellIdForServingCell));

        assertThat(event.getHIER3_ID_2(), is(hier3IdForCell2));
        assertThat(event.getHIER321_ID_2(), is(hier321IdForCell2));
        assertThat(event.getHIER3_CELL_ID_2(), is(hier3cellIdForCell2));
        assertThat(event.getCELL_ID_2(), is(cellIdForCell2));

        assertThat(event.getHIER3_ID_3(), is(hier3IdForCell3));
        assertThat(event.getHIER321_ID_3(), is(hier321IdForCell3));
        assertThat(event.getHIER3_CELL_ID_3(), is(hier3cellIdForCell3));
        assertThat(event.getCELL_ID_3(), is(cellIdForCell3));

        assertThat(event.getHIER3_ID_4(), is(hier3IdForCell4));
        assertThat(event.getHIER321_ID_4(), is(hier321IdForCell4));
        assertThat(event.getHIER3_CELL_ID_4(), is(hier3cellIdForCell4));
        assertThat(event.getCELL_ID_4(), is(cellIdForCell4));
    }

    @Test
    public void testSOHOFailureEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event = new INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED(
                new INTERNAL_SOFT_HANDOVER_EXECUTION());
        setTopologyFieldsOnSOHOFailureEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsSOHOCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnSOHOFailureEvent(
            final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setC_ID_EVALUATED(cellId2);
        event.getBase().setRNC_ID_EVALUATED(rncId2);
    }

    private void checkHashingIdFieldsSOHOCorrectlyUpdated(
            final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event) {
        assertThat(event.getHIER3_ID(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID(), is(hier3cellIdForServingCell));

        assertThat(event.getTHIER3_ID(), is(hier3IdForCell2));
        assertThat(event.getTHIER321_ID(), is(hier321IdForCell2));
        assertThat(event.getTHIER3_CELL_ID(), is(hier3cellIdForCell2));
    }

    @Test
    public void testIFHOFailureEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event = new INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED(
                new INTERNAL_OUT_HARD_HANDOVER_FAILURE());
        setTopologyFieldsOnIFHOFailureEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsIFHOCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnIFHOFailureEvent(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setHHO_TARGET_ID_3(cellId2);
        event.getBase().setHHO_TARGET_ID_4(hho_id_4);
    }

    private void checkHashingIdFieldsIFHOCorrectlyUpdated(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));

        assertThat(event.getTHIER3_ID(), is(hier3IdForCell4));
        assertThat(event.getTHIER321_ID(), is(hier321IdForCell4));
        assertThat(event.getTHIER3_CELL_ID(), is(hier3cellIdForCell4));
    }

    @Test
    public void testIFHOExectionActiveEventEnrichedWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event = new INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED(
                new INTERNAL_IFHO_EXECUTION_ACTIVE());
        setTopologyFieldsOnIFHOActiveEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsIFHOActiveExecutionCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnIFHOActiveEvent(
            final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_NU_FREQ(RNC_ID_NU_FREQ);
    }

    private void checkHashingIdFieldsIFHOActiveExecutionCorrectlyUpdated(
            final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event) {
        assertThat(event.getTHIER3_ID(), is(HIER3_ID_FOR_CELL_IFHO_ACTIVE));
        assertThat(event.getTHIER321_ID(), is(HIER321_ID_FOR_CELL_IFHO_ACTIVE));
        assertThat(event.getTHIER3_CELL_ID(), is(HIER3_CELL_ID_FOR_CELL_IFHO_ACTIVE));
        assertThat(event.getRNC_ID_NU_FREQ_INT(), is((int)RNC_ID_NU_FREQ));
    }

    @Test
    public void testRncIdForINTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED(){
        setUpMockedHashIdsInLookupService();
        INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event = new INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED(
                new INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED());
        setTopologyFieldsOnINTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHEDEvent(event);
        eventEnricher.enrich(event);
        assertThat(event.getBase().getRNC_ID_1(),is(Short.valueOf(servingRncId)));
    }

    private void setTopologyFieldsOnINTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHEDEvent(
            final INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED event) {
        event.getBase().setSubNetwork(SUBNETWORK);
    }

    @Test
    public void testRncIdForINTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED(){
        setUpMockedHashIdsInLookupService();
        INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event = new INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED(
                new INTERNAL_IFHO_EXECUTION_ACTIVE());
        setTopologyFieldsOnINTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHEDEvent(event);
        eventEnricher.enrich(event);
        assertThat(event.getBase().getRNC_ID_1(),is(Short.valueOf(servingRncId)));
    }

    private void setTopologyFieldsOnINTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHEDEvent(
            final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED event) {
        event.getBase().setSubNetwork(SUBNETWORK);
    }

    @Test
    public void testRncIdForINTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED(){
        setUpMockedHashIdsInLookupService();
        INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event = new INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED(
                new INTERNAL_SOFT_HANDOVER_EXECUTION());
        setTopologyFieldsOnINTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHEDEvent(event);
        eventEnricher.enrich(event);
        assertThat(event.getBase().getRNC_ID_1(),is(Short.valueOf(servingRncId)));
    }

    private void setTopologyFieldsOnINTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHEDEvent(
            final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED event) {
        event.getBase().setSubNetwork(SUBNETWORK);
    }

    @Test
    public void testINTERNAL_CALL_SETUP_FAIL_ENRICHEDWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_CALL_SETUP_FAIL_ENRICHED event = new INTERNAL_CALL_SETUP_FAIL_ENRICHED(
                new INTERNAL_CALL_SETUP_FAIL());
        setTopologyFieldsOnINTERNAL_CALL_SETUP_FAIL_ENRICHEDEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsINTERNAL_CALL_SETUP_FAIL_ENRICHEDCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnINTERNAL_CALL_SETUP_FAIL_ENRICHEDEvent(
            final INTERNAL_CALL_SETUP_FAIL_ENRICHED event) {
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_2(rncId2);
        event.getBase().setC_ID_2(cellId2);
        event.getBase().setRNC_ID_3(rncId3);
        event.getBase().setC_ID_3(cellId3);
        event.getBase().setRNC_ID_4(rncId4);
        event.getBase().setC_ID_4(cellId4);
    }

    private void checkHashingIdFieldsINTERNAL_CALL_SETUP_FAIL_ENRICHEDCorrectlyUpdated(
            final INTERNAL_CALL_SETUP_FAIL_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));

    }


    @Test
    public void testINTERNAL_CALL_REESTABLISHMENT_ENRICHEDWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_CALL_REESTABLISHMENT_ENRICHED event = new INTERNAL_CALL_REESTABLISHMENT_ENRICHED(
                new INTERNAL_CALL_REESTABLISHMENT());
        setTopologyFieldsOnINTERNAL_CALL_REESTABLISHMENT_ENRICHEDEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsINTERNAL_CALL_REESTABLISHMENT_ENRICHEDCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnINTERNAL_CALL_REESTABLISHMENT_ENRICHEDEvent(
            final INTERNAL_CALL_REESTABLISHMENT_ENRICHED event) {
        event.getBase().setC_ID_CU(servingCellIdDU);
        event.getBase().setRNC_ID_CU(servingRncIdDU);
    }

    private void checkHashingIdFieldsINTERNAL_CALL_REESTABLISHMENT_ENRICHEDCorrectlyUpdated(
            final INTERNAL_CALL_REESTABLISHMENT_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));

    }

    @Test
    public void testINTERNAL_SYSTEM_RELEASE_ENRICHEDWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_SYSTEM_RELEASE_ENRICHED event = new INTERNAL_SYSTEM_RELEASE_ENRICHED(
                new INTERNAL_SYSTEM_RELEASE());
        setTopologyFieldsOnINTERNAL_SYSTEM_RELEASE_ENRICHEDEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsINTERNAL_SYSTEM_RELEASE_ENRICHEDCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnINTERNAL_SYSTEM_RELEASE_ENRICHEDEvent(
            final INTERNAL_SYSTEM_RELEASE_ENRICHED event) {
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_1(servingRncId);
    }

    private void checkHashingIdFieldsINTERNAL_SYSTEM_RELEASE_ENRICHEDCorrectlyUpdated(
            final INTERNAL_SYSTEM_RELEASE_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));

    }

    @Test
    public void testGPEH_SESSIONWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final GPEH_SESSION event = new GPEH_SESSION();
        setTopologyFieldsOnGPEH_SESSIONEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsGPEH_SESSIONCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnGPEH_SESSIONEvent(
            final GPEH_SESSION event) {
        event.setSTART_C_ID(servingCellId);
        event.setSTART_RNC(servingRncId);
        event.setEND_C_ID(servingCellId);
        event.setEND_RNC(servingRncId);
        event.setIMSI(IMSI);
    }

    private void checkHashingIdFieldsGPEH_SESSIONCorrectlyUpdated(
            final GPEH_SESSION event) {
        assertThat(event.getSTART_HIER3_ID(), is(hier3IdForServingCell));
        assertThat(event.getSTART_HIER321_ID(), is(hier321IdForServingCell));
        assertThat(event.getSTART_HIER3_CELL_ID(), is(hier3cellIdForServingCell));

    }

    @Test
    public void testINTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHEDWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event = new INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED(
                new INTERNAL_FAILED_HSDSCH_CELL_CHANGE());
        setTopologyFieldsOnINTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHEDEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsINTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHEDCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnINTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHEDEvent(
            final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event) {
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_1(servingRncId);
        event.getBase().setC_ID_TARGET(servingCellId);
        event.getBase().setRNC_ID_TARGET(servingRncId);
    }

    private void checkHashingIdFieldsINTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHEDCorrectlyUpdated(
            final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED event) {
        assertThat(event.getHIER3_ID(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID(), is(hier3cellIdForServingCell));

    }

    @Test
    public void testINTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHEDWithTopologyHashingIds() {
        setUpMockedHashIdsInLookupService();

        final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event = new INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED(
                new INTERNAL_OUT_HARD_HANDOVER_FAILURE());
        setTopologyFieldsOnINTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHEDEvent(event);

        eventEnricher.enrich(event);
        checkHashingIdFieldsINTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHEDCorrectlyUpdated(event);
    }

    private void setTopologyFieldsOnINTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHEDEvent(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event) {
        event.getBase().setC_ID_1(servingCellId);
        event.getBase().setRNC_ID_1(servingRncId);
    }

    private void checkHashingIdFieldsINTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHEDCorrectlyUpdated(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED event) {
        assertThat(event.getHIER3_ID_1(), is(hier3IdForServingCell));
        assertThat(event.getHIER321_ID_1(), is(hier321IdForServingCell));
        assertThat(event.getHIER3_CELL_ID_1(), is(hier3cellIdForServingCell));
    }

}