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

import java.util.List;

import com.ericsson.cepmediation.apeventbeans.correlation.EE_RRC_MEASUREMENT;
import com.ericsson.cepmediation.apeventbeans.correlation.GPEH_SESSION;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_CELL_AGGR;
import com.ericsson.cepmediation.apeventbeans.correlation.RAB_ESTABLISH_RNC_AGGR;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_REESTABLISHMENT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_CALL_SETUP_FAIL_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED;
import com.ericsson.cepmediation.apeventbeans.gpeh.INTERNAL_SYSTEM_RELEASE_ENRICHED;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;
import com.ericsson.cepmediation.base.database.entity.HashId;
import com.ericsson.cepmediation.correlation.enrichment.EnhancedVisitedCell;
import com.ericsson.cepmediation.correlation.lookup.LookupService;
import com.ericsson.cepmediation.correlation.lookup.impl.DefaultLookupService;

/**
 *
 * TODO: this class should either go to forwarder module or be re-implemented in
 * the epl.
 *
 */
public class EventEnricher {

    private static final int CID_INVALID_VALUE = 16777215;

    private static final int IRAT_CELL_CHANGE = 12;

    private static final int IRAT_HANDOVER_TO_GSM = 7;

    public void enrich(final ApEventBean event) {
        if (event instanceof GPEH_SESSION) {
            final GPEH_SESSION gpehSession = (GPEH_SESSION) event;
            if (gpehSession.getIMSI() != -1) {
                enrichHashIds(gpehSession);
            }
        } else if (event instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED) {
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED hardHandoverFailure = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED) event;
            enrichHashIds(hardHandoverFailure);
        } else if (event instanceof INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED) {
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED cellChange = (INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED) event;
            enrichHashIds(cellChange);
        } else if (event instanceof EE_RRC_MEASUREMENT) {
            final EE_RRC_MEASUREMENT measurementEvent = (EE_RRC_MEASUREMENT) event;
            enrichHashIds(measurementEvent);
        } else if (event instanceof EnhancedVisitedCell) {
            final EnhancedVisitedCell visitedCell = (EnhancedVisitedCell) event;
            enrichHashIds(visitedCell);
        } else if (event instanceof INTERNAL_CALL_SETUP_FAIL_ENRICHED) {
            final INTERNAL_CALL_SETUP_FAIL_ENRICHED callSetupFail = (INTERNAL_CALL_SETUP_FAIL_ENRICHED) event;
            enrichHashIds(callSetupFail);
        } else if (event instanceof INTERNAL_SYSTEM_RELEASE_ENRICHED) {
            final INTERNAL_SYSTEM_RELEASE_ENRICHED systemRelease = (INTERNAL_SYSTEM_RELEASE_ENRICHED) event;
            enrichHashIds(systemRelease);
        } else if (event instanceof INTERNAL_CALL_REESTABLISHMENT_ENRICHED) {
            final INTERNAL_CALL_REESTABLISHMENT_ENRICHED callReestablishment = (INTERNAL_CALL_REESTABLISHMENT_ENRICHED) event;
            enrichHashIds(callReestablishment);
        } else if (event instanceof INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) {
            final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED softHandoverExecFail = (INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED) event;
            enrichHashIds(softHandoverExecFail);
        } else if (event instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) {
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED hardHandoverIfhoFailure = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED) event;
            enrichHashIds(hardHandoverIfhoFailure);
        } else if (event instanceof INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) {
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED hardHandoverIratFailure = (INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED) event;
            enrichHashIds(hardHandoverIratFailure);
        } else if (event instanceof INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) {
            final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED failedHsdschCellChange = (INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED) event;
            enrichHashIds(failedHsdschCellChange);
        } else if (event instanceof INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) {
            final INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED hsdschNoCellSelected = (INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED) event;
            enrichHashIds(hsdschNoCellSelected);
        } else if (event instanceof INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) {
            final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED hsdschNoCellSelected = (INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED) event;
            enrichHashIds(hsdschNoCellSelected);
        } else if (event instanceof RAB_ESTABLISH_RNC_AGGR) {
            final RAB_ESTABLISH_RNC_AGGR rabRncAggregation = (RAB_ESTABLISH_RNC_AGGR) event;
            enrichHashIds(rabRncAggregation);
        } else if (event instanceof RAB_ESTABLISH_CELL_AGGR) {
            final RAB_ESTABLISH_CELL_AGGR rabCellAggregation = (RAB_ESTABLISH_CELL_AGGR) event;
            enrichHashIds(rabCellAggregation);
        }

    }

    private void enrichHashIds(final EnhancedVisitedCell visitedCell) {
        final int cId = visitedCell.getC_ID();
        final short rncId = visitedCell.getRNC_ID();
        final HashId hashId = get3GManagedHashId(cId, rncId);
        if (hashId != null) {
            visitedCell.setHIER3_ID_1(hashId.getHier3Id());
            visitedCell.setHIER3_CELL_ID_1(hashId.getHier3cellId());
        }
    }

    public void enrichHashIds(final EE_RRC_MEASUREMENT measurementEvent) {
        setHashIdsForServingCell(measurementEvent);
        setHashIdsForCell2(measurementEvent);
        setHashIdsForCell3(measurementEvent);
        setHashIdsForCell4(measurementEvent);
    }

    private void setHashIdsForServingCell(
            final EE_RRC_MEASUREMENT measurementEvent) {
        final int cellId = measurementEvent.getC_ID_1();
        final short rncId = measurementEvent.getRNC_ID_1();
        final HashId hashId = get3GManagedHashId(cellId, rncId);
        if (hashId != null) {
            measurementEvent.setHIER3_ID_1(hashId.getHier3Id());
            measurementEvent.setHIER321_ID_1(hashId.getHier321Id());
            measurementEvent.setHIER3_CELL_ID_1(hashId.getHier3cellId());
            measurementEvent.setCELL_ID_1(hashId.getCellId());
        }
    }

    private void setHashIdsForCell2(final EE_RRC_MEASUREMENT measurementEvent) {
        final int cellId = measurementEvent.getC_ID_2();
        final short rncId = measurementEvent.getRNC_ID_2();
        final HashId hashId = get3GManagedHashId(cellId, rncId);
        if (hashId != null) {
            measurementEvent.setHIER3_ID_2(hashId.getHier3Id());
            measurementEvent.setHIER321_ID_2(hashId.getHier321Id());
            measurementEvent.setHIER3_CELL_ID_2(hashId.getHier3cellId());
            measurementEvent.setCELL_ID_2(hashId.getCellId());
        }
    }

    private void setHashIdsForCell3(final EE_RRC_MEASUREMENT measurementEvent) {
        final int cellId = measurementEvent.getC_ID_3();
        final short rncId = measurementEvent.getRNC_ID_3();
        final HashId hashId = get3GManagedHashId(cellId, rncId);
        if (hashId != null) {
            measurementEvent.setHIER3_ID_3(hashId.getHier3Id());
            measurementEvent.setHIER321_ID_3(hashId.getHier321Id());
            measurementEvent.setHIER3_CELL_ID_3(hashId.getHier3cellId());
            measurementEvent.setCELL_ID_3(hashId.getCellId());
        }
    }

    private void setHashIdsForCell4(final EE_RRC_MEASUREMENT measurementEvent) {
        final int cellId = measurementEvent.getC_ID_4();
        final short rncId = measurementEvent.getRNC_ID_4();
        final HashId hashId = get3GManagedHashId(cellId, rncId);
        if (hashId != null) {
            measurementEvent.setHIER3_ID_4(hashId.getHier3Id());
            measurementEvent.setHIER321_ID_4(hashId.getHier321Id());
            measurementEvent.setHIER3_CELL_ID_4(hashId.getHier3cellId());
            measurementEvent.setCELL_ID_4(hashId.getCellId());
        }
    }

    public void enrichHashIds(final GPEH_SESSION data) {
        final int startCellId = data.getSTART_C_ID();
        final short startRnc = data.getSTART_RNC();
        final HashId startHashId = get3GManagedHashId(startCellId, startRnc);
        if (startHashId != null) {
            data.setSTART_HIER3_ID(startHashId.getHier3Id());
            data.setSTART_HIER3_CELL_ID(startHashId.getHier3cellId());
            data.setSTART_HIER321_ID(startHashId.getHier321Id());
            data.setSTART_CELL_ID(startHashId.getCellId());
        }

        final int endCellId = data.getEND_C_ID();
        final short endRnc = data.getEND_RNC();
        final HashId endHashId = get3GManagedHashId(endCellId, endRnc);
        if (endHashId != null) {
            data.setEND_HIER3_ID(endHashId.getHier3Id());
            data.setEND_HIER3_CELL_ID(endHashId.getHier3cellId());
            data.setEND_HIER321_ID(endHashId.getHier321Id());
            data.setEND_CELL_ID(endHashId.getCellId());
        }
    }

    public void enrichHashIds(final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        // do we need special handling for: IRAT_HANDOVER_FROM_GSM ?
        setHashId1IntHHOFailure(data);

        setHashId2IntHHOFailure(data);

        setHashId3IntHHOFailure(data);

        setHashId4IntHHOFailure(data);

        // To determine correctly the target hash ids, we should take into
        // account two things:
        // 1. We might deal with handover to unmanaged network
        // 2. We might deal with handover to 2G network
        final int procedureIndicator = data.getBase().getPROCEDURE_INDICATOR();
        if (isHandoverTo2G(procedureIndicator)) {
            getTargetHashIdForHO2G(data);
        } else {
            final int plmnId = data.getBase().getHHO_TARGET_ID_1();
            final int lac = data.getBase().getHHO_TARGET_ID_2();
            final int cId = data.getBase().getHHO_TARGET_ID_3();
            final int rncId = data.getBase().getHHO_TARGET_ID_4();

            if (isCIdValid(cId)) {
                // first try matching without RNC_ID
                HashId targetHashId = getHashIdWithoutRncId(lac, plmnId, cId,
                        (byte) 1);

                // then try the 3G managed tables
                if (targetHashId == null && rncId > -1) {
                    targetHashId = get3GManagedHashId(cId, rncId);
                }

                if (targetHashId != null) {
                    data.setTHIER3_ID(targetHashId.getHier3Id());
                    data.setTHIER321_ID(targetHashId.getHier321Id());
                    data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
                }
            }
        }
    }

    private void getTargetHashIdForHO2G(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        final int cId = data.getBase().getHHO_TARGET_ID_3();
        if (isCIdValid(cId)) {
            final int plmnId = data.getBase().getHHO_TARGET_ID_1();
            final int lac = data.getBase().getHHO_TARGET_ID_2();
            final HashId targetHashId = getHashIdWithoutRncId(lac, plmnId, cId,
                    (byte) 0);
            if (targetHashId != null) {
                data.setTHIER3_ID(targetHashId.getHier3Id());
                data.setTHIER321_ID(targetHashId.getHier321Id());
            }
        }
    }

    private void setHashId4IntHHOFailure(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        final int cId4 = data.getBase().getC_ID_4();
        final short rncId4 = data.getBase().getRNC_ID_4();
        final HashId hashId4 = get3GManagedHashId(cId4, rncId4);
        if (hashId4 != null) {
            data.setHIER3_ID_4(hashId4.getHier3Id());
            data.setHIER3_CELL_ID_4(hashId4.getHier3cellId());
            data.setHIER321_ID_4(hashId4.getHier321Id());
            data.setCELL_ID_4(hashId4.getCellId());
        }
    }

    private void setHashId3IntHHOFailure(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        final int cId3 = data.getBase().getC_ID_3();
        final short rncId3 = data.getBase().getRNC_ID_3();
        final HashId hashId3 = get3GManagedHashId(cId3, rncId3);
        if (hashId3 != null) {
            data.setHIER3_ID_3(hashId3.getHier3Id());
            data.setHIER3_CELL_ID_3(hashId3.getHier3cellId());
            data.setHIER321_ID_3(hashId3.getHier321Id());
            data.setCELL_ID_3(hashId3.getCellId());
        }
    }

    private void setHashId2IntHHOFailure(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        final int cId2 = data.getBase().getC_ID_2();
        final short rncId2 = data.getBase().getRNC_ID_2();
        final HashId hashId2 = get3GManagedHashId(cId2, rncId2);
        if (hashId2 != null) {
            data.setHIER3_ID_2(hashId2.getHier3Id());
            data.setHIER3_CELL_ID_2(hashId2.getHier3cellId());
            data.setHIER321_ID_2(hashId2.getHier321Id());
            data.setCELL_ID_2(hashId2.getCellId());
        }
    }

    private void setHashId1IntHHOFailure(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setCELL_ID_1(hashId1.getCellId());
        }
    }

    public void enrichHashIds(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED data) {
        setHashId1SuccHSDSCHCellChange(data);

        setHashId2SuccHSDSCHCellChange(data);

        setHashId3SuccHSDSCHCellChange(data);

        setHashId4SuccHSDSCHCellChange(data);

        final int targetCell = data.getBase().getC_ID_TARGET();
        final short targetRnc = data.getBase().getRNC_ID_TARGET();
        final HashId targetHashId = get3GManagedHashId(targetCell, targetRnc);
        if (targetHashId != null) {
            data.setTHIER3_ID(targetHashId.getHier3Id());
            data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            data.setTHIER321_ID(targetHashId.getHier321Id());
        }
    }

    private void setHashId4SuccHSDSCHCellChange(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED data) {
        final int cId4 = data.getBase().getC_ID_4();
        final short rncId4 = data.getBase().getRNC_ID_4();
        final HashId hashId4 = get3GManagedHashId(cId4, rncId4);
        if (hashId4 != null) {
            data.setHIER3_ID_4(hashId4.getHier3Id());
            data.setHIER3_CELL_ID_4(hashId4.getHier3cellId());
            data.setHIER321_ID_4(hashId4.getHier321Id());
            data.setCELL_ID_4(hashId4.getCellId());
        }
    }

    private void setHashId3SuccHSDSCHCellChange(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED data) {
        final int cId3 = data.getBase().getC_ID_3();
        final short rncId3 = data.getBase().getRNC_ID_3();
        final HashId hashId3 = get3GManagedHashId(cId3, rncId3);
        if (hashId3 != null) {
            data.setHIER3_ID_3(hashId3.getHier3Id());
            data.setHIER3_CELL_ID_3(hashId3.getHier3cellId());
            data.setHIER321_ID_3(hashId3.getHier321Id());
            data.setCELL_ID_3(hashId3.getCellId());
        }
    }

    private void setHashId2SuccHSDSCHCellChange(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED data) {
        final int cId2 = data.getBase().getC_ID_2();
        final short rncId2 = data.getBase().getRNC_ID_2();
        final HashId hashId2 = get3GManagedHashId(cId2, rncId2);
        if (hashId2 != null) {
            data.setHIER3_ID_2(hashId2.getHier3Id());
            data.setHIER3_CELL_ID_2(hashId2.getHier3cellId());
            data.setHIER321_ID_2(hashId2.getHier321Id());
            data.setCELL_ID_2(hashId2.getCellId());
        }
    }

    private void setHashId1SuccHSDSCHCellChange(
            final INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setCELL_ID_1(hashId1.getCellId());
        }
    }

    public void enrichHashIds(final INTERNAL_CALL_SETUP_FAIL_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
    }

    public void enrichHashIds(final INTERNAL_SYSTEM_RELEASE_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
    }

    public void enrichHashIds(final INTERNAL_CALL_REESTABLISHMENT_ENRICHED data) {
        // C_ID_CU and RNC_ID_CU is used to get cId1 and rncId1
        // since these parameters are introduced for Re-establishment event
        final int cId1 = data.getBase().getC_ID_CU();
        final short rncId1 = data.getBase().getRNC_ID_CU();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
    }

    public void enrichHashIds(
            final INTERNAL_SOFT_HANDOVER_EXECUTION_ENRICHED data) {
        Short rncId1 = data.getBase().getRNC_ID_1();
        if(rncId1==-1){
            rncId1 = getDefaultLookupService().getRncId(data.getBase().getSubNetwork());
            if(rncId1!=null && rncId1!=-1){
                data.getBase().setRNC_ID_1(rncId1);
            }
        }
        final int cId1 = data.getBase().getC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID(hashId1.getHier3Id());
            data.setHIER3_CELL_ID(hashId1.getHier3cellId());
            data.setHIER321_ID(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
        final int targetCell = data.getBase().getC_ID_EVALUATED();
        final short targetRnc = data.getBase().getRNC_ID_EVALUATED();
        final HashId targetHashId = get3GManagedHashId(targetCell, targetRnc);
        if (targetHashId != null) {
            data.setTHIER3_ID(targetHashId.getHier3Id());
            data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            data.setTHIER321_ID(targetHashId.getHier321Id());
        }

    }

    public void enrichHashIds(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IFHO_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }

        final int plmnId = data.getBase().getHHO_TARGET_ID_1();
        final int lac = data.getBase().getHHO_TARGET_ID_2();
        final int cId = data.getBase().getHHO_TARGET_ID_3();
        final int rncId = data.getBase().getHHO_TARGET_ID_4();

        if (isCIdValid(cId)) {
            // first try matching without RNC_ID
            HashId targetHashId = getHashIdWithoutRncId(lac, plmnId, cId,
                    (byte) 1);

            // then try the 3G managed tables
            if (targetHashId == null && rncId > -1) {
                targetHashId = get3GManagedHashId(cId, rncId);
            }

            if (targetHashId != null) {
                data.setTHIER3_ID(targetHashId.getHier3Id());
                data.setTHIER321_ID(targetHashId.getHier321Id());
                data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            }
        }

    }

    public void enrichHashIds(
            final INTERNAL_OUT_HARD_HANDOVER_FAILURE_IRAT_ENRICHED data) {
        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID_1(hashId1.getHier3Id());
            data.setHIER3_CELL_ID_1(hashId1.getHier3cellId());
            data.setHIER321_ID_1(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }

        final int cId = data.getBase().getHHO_TARGET_ID_3();
        if (isCIdValid(cId)) {
            final int plmnId = data.getBase().getHHO_TARGET_ID_1();
            final int lac = data.getBase().getHHO_TARGET_ID_2();
            final HashId targetHashId = getHashIdWithoutRncId(lac, plmnId, cId,
                    (byte) 0);
            if (targetHashId != null) {
                data.setTHIER3_ID(targetHashId.getHier3Id());
                data.setTHIER321_ID(targetHashId.getHier321Id());
            }
        }
    }

    public void enrichHashIds(
            final INTERNAL_FAILED_HSDSCH_CELL_CHANGE_ENRICHED data) {

        final int cId1 = data.getBase().getC_ID_1();
        final short rncId1 = data.getBase().getRNC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID(hashId1.getHier3Id());
            data.setHIER3_CELL_ID(hashId1.getHier3cellId());
            data.setHIER321_ID(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
        final int targetCell = data.getBase().getC_ID_TARGET();
        final short targetRnc = data.getBase().getRNC_ID_TARGET();
        final HashId targetHashId = get3GManagedHashId(targetCell, targetRnc);
        if (targetHashId != null) {
            data.setTHIER3_ID(targetHashId.getHier3Id());
            data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            data.setTHIER321_ID(targetHashId.getHier321Id());
        }

    }

    public void enrichHashIds(
        final INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED_ENRICHED data) {
        Short rncId1 = data.getBase().getRNC_ID_1();
        if(rncId1==-1){
             rncId1 = getDefaultLookupService().getRncId(data.getBase().getSubNetwork());
             if(rncId1!=null && rncId1!=-1){
                 data.getBase().setRNC_ID_1(rncId1);
             }
        }
        final int cId1 = data.getBase().getC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        if (hashId1 != null) {
            data.setHIER3_ID(hashId1.getHier3Id());
            data.setHIER3_CELL_ID(hashId1.getHier3cellId());
            data.setHIER321_ID(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
        final int targetCell = data.getBase().getC_ID_TARGET();
        final short targetRnc = data.getBase().getRNC_ID_TARGET();
        final HashId targetHashId = get3GManagedHashId(targetCell, targetRnc);
        if (targetHashId != null) {
            data.setTHIER3_ID(targetHashId.getHier3Id());
            data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            data.setTHIER321_ID(targetHashId.getHier321Id());
        }
    }

    private void enrichHashIds(
            final INTERNAL_IFHO_EXECUTION_ACTIVE_ENRICHED data) {
        Short rncId1 = data.getBase().getRNC_ID_1();
        if(rncId1==-1){
             rncId1 = getDefaultLookupService().getRncId(data.getBase().getSubNetwork());
             if(rncId1!=null && rncId1!=-1){
                 data.getBase().setRNC_ID_1(rncId1);
             }
        }
        final int cId1 = data.getBase().getC_ID_1();
        final HashId hashId1 = get3GManagedHashId(cId1, rncId1);
        data.setRNC_ID_NU_FREQ_INT(data.getBase().getRNC_ID_NU_FREQ());

        if (hashId1 != null) {
            data.setHIER3_ID(hashId1.getHier3Id());
            data.setHIER3_CELL_ID(hashId1.getHier3cellId());
            data.setHIER321_ID(hashId1.getHier321Id());
            data.setLAC(hashId1.getLac());
            data.setRAC(hashId1.getRac());
        }
        final int targetCell = data.getBase().getC_ID_NU_FREQ();
        final short targetRnc = data.getBase().getRNC_ID_NU_FREQ();
        final HashId targetHashId = get3GManagedHashId(targetCell, targetRnc);
        if (targetHashId != null) {
            data.setTHIER3_ID(targetHashId.getHier3Id());
            data.setTHIER3_CELL_ID(targetHashId.getHier3cellId());
            data.setTHIER321_ID(targetHashId.getHier321Id());
        }

    }

    private void enrichHashIds(final RAB_ESTABLISH_RNC_AGGR data) {
        final short rncId = data.getRNC_ID();
        final Long rncHashId = getRncHashId(rncId);

        if (rncHashId != null) {
            data.setHIER3_ID(rncHashId.longValue());
        }
    }

    private void enrichHashIds(final RAB_ESTABLISH_CELL_AGGR data) {
        final int cId = data.getC_ID();
        final short rncId = data.getRNC_ID();
        final HashId hashId = get3GManagedHashId(cId, rncId);
        if (hashId != null) {
            data.setHIER3_ID(hashId.getHier3Id());
            data.setHIER3_CELL_ID(hashId.getHier3cellId());
        }
    }

    /*
     * This method checks the topology for a cell with a matching Plmn Id, Lac
     * and Cell Id (cid) and returns the HashId object containing the hashId of
     * the controller (BSC) (Hier3_Id) and hashId of the cell (Hier321_Id)
     */
    private HashId getHashIdWithoutRncId(final int lac, final int plmnId,
            final int cId, final byte rat) {
        if (!(plmnId > 0 || lac > 0)) {
            return null;
        }

        final List<HashId> ids = getDefaultLookupService().getHashId(cId,
                (short) -1);
        if (ids != null && !(ids.isEmpty())) {
            for (final HashId id : ids) {
                // First check if the reported Plmn Id matches the Plmn Id in
                // topology
                // The RNC can only report a Plmn Id with a value less than
                // 65535. It has been
                // decided that if a Plmn Id is greater than 65535, then the
                // Plmn Id value is
                // not checked. See Jira EQEV-5203 for more details.
                // This check is again introduced as a part of network evolution
                // activity for W14B full support
                if (id.getPlmnId() == null) {
                    continue;
                }
                if (plmnId != id.getPlmnId()) {
                    continue;
                }
                if (lac > 0 && lac != id.getLac()) {
                    continue;
                }

                if (rat >= 0 && rat != id.getRat()) {

                    continue;
                }

                return id;
            }
        }

        return null;
    }

    private HashId get3GManagedHashId(final int cId, final short rncId) {
        if (isCIdValid(cId) && rncId > -1) {
            final List<HashId> ids = getDefaultLookupService().getHashId(cId,
                    rncId);
            // we expect only one matching
            return ids != null ? ids.get(0) : null;
        }

        return null;
    }

    private HashId get3GManagedHashId(final int cId, final int rncId) {
        if (isCIdValid(cId) && rncId > -1) {
            final List<HashId> ids = getDefaultLookupService().getHashId(cId,
                    rncId);
            // we expect only one matching
            return ids != null ? ids.get(0) : null;
        }

        return null;
    }

    private Long getRncHashId(final short rncId) {
        if (rncId > -1) {
            return getDefaultLookupService().getRncHashId(rncId);
        }

        return null;
    }

    LookupService getDefaultLookupService() {
        return DefaultLookupService.getInstance();
    }

    private boolean isHandoverTo2G(final int procedureIndicator) {
        return procedureIndicator == IRAT_HANDOVER_TO_GSM
                || procedureIndicator == IRAT_CELL_CHANGE;
    }

    private boolean isCIdValid(final int cId) {
        return cId > -1 && cId != CID_INVALID_VALUE;
    }
}
