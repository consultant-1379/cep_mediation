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

package com.ericsson.cepmediation.correlation.radio.utils;

public interface Statements {

    String SESSION_ENRICHMENT = "Session-Enrichment";

    String HANDOVER_ENRICHMENT = "Handover-Enrichment";

    String VISITED_CELLS_ENRICHMENT = "Visited-Cells-Enrichment";

    String SOHO_ENRICHMENT = "Soho-Enrichment";
    
    String CALL_SETUP_FAIL_ENRICHMENT = "CallSetupFail-Enrichment";
    
    String INCOMPLETE_CALL_SETUP_FAIL_ENRICHMENT = "IncompleteCallSetupFail-Enrichment";
    
    String SYSTEM_RELEASE_ENRICHMENT = "SystemRelease-Enrichment";
    
    String CLEANUP_INCOMPLETE_CALL_SETUP_FAIL_ON_SETUP = "Cleanup-IncompleteCallSetupFail-On-Connection-Setup";
    
    String CLEANUP_INCOMPLETE_CALL_SETUP_FAIL_ON_RELEASE = "Cleanup-IncompleteCallSetupFail-On-Connection-Release";
    
    String CLEANUP_EXPIRED_INCOMPLETE_CALL_SETUP_FAIL = "Cleanup-Expired-IncompleteCallSetupFail";
    
    String RRC_UPLINK_DIRECT_TRANSFER_ENRICHMENT = "RrcUplinkDirectTransfer-Enrichment";
    
    String INCOMPLETE_RRC_UPLINK_DIRECT_TRANSFER_ENRICHMENT = "IncompleteRrcUplinkDirectTransfer-Enrichment";
    
    String SOFT_HANDOVER_EXEC_FAIL_ENRICHMENT = "SoftHandoverExecFail-Enrichment";
    
    String INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ENRICHMENT = "IncompleteSoftHandoverExecFail-Enrichment";
    
    String CLEANUP_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ON_SETUP = "Cleanup-IncompleteSoftHandoverExecFail-On-Connection-Setup";
    
    String CLEANUP_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL_ON_RELEASE = "Cleanup-IncompleteSoftHandoverExecFail-On-Connection-Release";
    
    String CLEANUP_EXPIRED_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL = "Cleanup-Expired-IncompleteSoftHandoverExecFail";
    
    String OUT_HARD_IFHO_ENRICHMENT = "OutHardIfho-Enrichment";
    
    String INCOMPLETE_OUT_HARD_IFHO_ENRICHMENT = "IncompleteOutHardIfho-Enrichment";
    
    String CLEANUP_INCOMPLETE_OUT_HARD_IFHO_ON_SETUP = "Cleanup-IncompleteOutHardIfho-On-Connection-Setup";
    
    String CLEANUP_INCOMPLETE_OUT_HARD_IFHO_ON_RELEASE = "Cleanup-IncompleteOutHardIfho-On-Connection-Release";
    
    String CLEANUP_EXPIRED_INCOMPLETE_OUT_HARD_IFHO = "Cleanup-Expired-IncompleteOutHardIfho";
    
    String OUT_HARD_IRAT_ENRICHMENT = "OutHardIrat-Enrichment";
    
    String INCOMPLETE_OUT_HARD_IRAT_ENRICHMENT = "IncompleteOutHardIrat-Enrichment";
    
    String CLEANUP_INCOMPLETE_OUT_HARD_IRAT_ON_SETUP = "Cleanup-IncompleteOutHardIrat-On-Connection-Setup";
    
    String CLEANUP_INCOMPLETE_OUT_HARD_IRAT_ON_RELEASE = "Cleanup-IncompleteOutHardIrat-On-Connection-Release";
    
    String CLEANUP_EXPIRED_INCOMPLETE_OUT_HARD_IRAT = "Cleanup-Expired-IncompleteOutHardIrat";
    
    String FAILED_HSDSCH_CELL_CHANGE_ENRICHMENT = "FailedHsdschCellChange-Enrichment";

    String INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ENRICHMENT = "IncompleteFailedHsdschCellChange-Enrichment";

    String CLEANUP_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ON_SETUP = "Cleanup-IncompleteFailedHsdschCellChange-On-Connection-Setup";

    String CLEANUP_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE_ON_RELEASE = "Cleanup-IncompleteFailedHsdschCellChange-On-Connection-Release";

    String CLEANUP_EXPIRED_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE = "Cleanup-Expired-IncompleteFailedHsdschCellChange";

    String HSDSCH_NO_CELL_SELECTED_ENRICHMENT = "HsdschNoCellSelected-Enrichment";

    String INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ENRICHMENT = "IncompleteHsdschNoCellSelected-Enrichment";

    String CLEANUP_INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ON_SETUP = "Cleanup-IncompleteHsdschNoCellSelected-On-Connection-Setup";

    String CLEANUP_INCOMPLETE_HSDSCH_NO_CELL_SELECTED_ON_RELEASE = "Cleanup-IncompleteHsdschNoCellSelected-On-Connection-Release";

    String CLEANUP_EXPIRED_INCOMPLETE_HSDSCH_NO_CELL_SELECTED = "Cleanup-Expired-IncompleteHsdschNoCellSelected";

    String IFHO_EXEC_FAIL_ENRICHMENT = "IfhoExecFail-Enrichment";

    String INCOMPLETE_IFHO_EXEC_FAIL_ENRICHMENT = "IncompleteIfhoExecFail-Enrichment";

    String CLEANUP_INCOMPLETE_IFHO_EXEC_FAIL_ON_SETUP = "Cleanup-IncompleteIfhoExecFail-On-Connection-Setup";

    String CLEANUP_INCOMPLETE_IFHO_EXEC_FAIL_ON_RELEASE = "Cleanup-IncompleteIfhoExecFail-On-Connection-Release";

    String CLEANUP_EXPIRED_INCOMPLETE_IFHO_EXEC_FAIL = "Cleanup-Expired-IncompleteIfhoExecFail";
    
    String FLUSH_INCOMPLETE_CALL_SETUP_FAIL = "Flush-IncompleteCallSetupFail";
    
    String FLUSH_INCOMPLETE_SOFT_HANDOVER_EXEC_FAIL = "Flush-IncompleteSoftHandoverExecFail";
    
    String FLUSH_INCOMPLETE_OUT_HARD_IFHO = "Flush-IncompleteOutHardIfho";
    
    String FLUSH_INCOMPLETE_OUT_HARD_IRAT = "Flush-IncompleteOutHardIrat";
    
    String FLUSH_INCOMPLETE_FAILED_HSDSCH_CELL_CHANGE = "Flush-IncompleteFailedHsdschCellChange";
    
    String FLUSH_INCOMPLETE_HSDSCH_NO_CELL_SELECTED = "Flush-IncompleteHsdschNoCellSelected";
    
    String FLUSH_INCOMPLETE_IFHO_EXEC_FAIL = "Flush-IncompleteIfhoExecFail";
    
    String CLEANUP_RABESTABLISHMENT_WINDOW = "Cleanup-RABEstablishment-Window";
    
    String AGGREGATE_RAB_TO_RNC_RESULTS = "Aggregate-RAB-To-RNC-Results";
    
    String AGGREGATE_RAB_TO_CELL_RESULTS = "Aggregate-RAB-To-Cell-Results";
    
    String FLUSH_INCOMPLETE_REESTABLISH = "Flush-IncompleteReestablish";

    String REESTABLISH_CAPTURING = "Reestablish-Capturing";

    String REESTABLISH_ENRICHMENT = "Reestablish-Enrichment";

    String IMSI_ARRIVES_AFTER_REESTABLISH= "Imsi-Arrives-After-Reestablish";

    String INCOMPLETE_REESTABLISH_ENRICHMENT = "IncompleteReestablish-Enrichment";

    String CLEANUP_INCOMPLETE_REESTABLISH_ON_CONNECTION_SETUP = "Cleanup-IncompleteReestablish-On-Connection-Setup";

    String CLEANUP_INCOMPLETE_REESTABLISH_ON_CONNECTION_RELEASE = "Cleanup-IncompleteReestablish-On-Connection-Release";

    String CLEANUP_EXPIRED_INCOMPLETE_REESTABLISH = "Cleanup-Expired-IncompleteReestablish";
    
}
