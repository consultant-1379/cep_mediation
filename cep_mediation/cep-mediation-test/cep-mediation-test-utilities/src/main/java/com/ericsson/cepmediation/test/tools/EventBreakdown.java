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
package com.ericsson.cepmediation.test.tools;

import java.util.Collection;
import java.util.Iterator;

import com.ericsson.cepmediation.apeventbeans.gpeh.GpehBase;
import com.ericsson.cepmediation.base.apeventbeans.ApEventBean;

/**
 * @author eemecoy
 * 
 */
public class EventBreakdown {

    public String getDetailedEventReport(
            final Collection<ApEventBean> gpehParsedRowEvents) {

        /**
         * TERMINATION_AND_STARTUP_CONDITIONS_KEY_ONES
         * */
        double rrcConnectionSetUpCount = 0;// RRC_RRC_CONNECTION_SETUP
        double rrcConnectionReleaseCount = 0;// RRC_RRC_CONNECTION_RELEASE_COMPLETE
        double internalImsiCount = 0;// INTERNAL_IMSI_COUNT
        double internalRabEstablishmentCount = 0;// INTERNAL_RAB_ESTABLISHMENT
        double internalNormalReleaseCount = 0;// INTERNAL_NORMAL_RELEASE
        double internalRabReleaseCount = 0;// INTERNAL_RAB_RELEASE
        double internalSystemReleaseCount = 0;// INTERNAL_SYSTEM_RELEASE

        /**
         * MAIN_LOGIC
         * **/
        double rrcMeasurementReportCount = 0;// RRC_MEASUREMENT_REPORT
        double channelSwitchingCount = 0;// INTERNAL_CHANNEL_SWITCHING
        double internalSystemUtilizationCount = 0;// INTERNAL_SYSTEM_UTILIZATION

        /**
         * JUST Counters
         * **/
        double internalFailedHSDSCHCellChangeCount = 0;// INTERNAL_FAILED_HSDSCH_CELL_CHANGE
        double internalSuccessfulHSDSCHCellChangeCount = 0;// INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE
        double internalHSDSCHCellSelectionNoCellSelectedCount = 0;// INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED
        double internalOutHardHandoeverFailureCount = 0;// INTERNAL_OUT_HARD_HANDOVER_FAILURE
        double internalIFHOExecutionActiveCount = 0;// INTERNAL_IFHO_EXECUTION_ACTIVE
        double internalSoftHandoeverExecutionCount = 0;// INTERNAL_SOFT_HANDOVER_EXECUTION
        double internalCMODEActivateCount = 0;// INTERNAL_CMODE_ACTIVATE
        double internalCMODEDeactivateCount = 0;// INTERNAL_CMODE_DEACTIVATE
        double sohoDsMissingNeighbour = 0;
        double ranapIUReleaseCommand = 0;

        /**
         * NOT_USED_IN_SESSION_CALCULATION
         * **/
        double internalStartCongestionCount = 0;// INTERNAL_START_CONGESTION
        double internalStopCongestionCount = 0;// INTERNAL_STOP_CONGESTION
        double internalRecordingFaultCount = 0;// INTERNAL_RECORDING_FAULT
        double internalRacordingRecoveredCount = 0;// INTERNAL_RECORDING_RECOVERED
        double internalMPOverloadCount = 0;// INTERNAL_MP_OVERLOAD
        double internalCallSetupFailCount = 0;// INTERNAL_CALL_SETUP_FAIL
        double rrcUplinkDirectTransferCount = 0;// RRC_UPLINK_DIRECT_TRANSFER

        double ranapIUReleaseCount = 0;// RANAP_IU_RELEASE_COMMAND
        double eeMeasurementReportCount = 0;// EE_MEASUREMENT_REPORT
        double totalCount = 0;

        ApEventBean event = null;
        for (final Iterator<ApEventBean> iterator = gpehParsedRowEvents
                .iterator(); iterator.hasNext();) {
            event = iterator.next();
            final GpehBase gpehBase = (GpehBase) event;
            // printOutEvent(gpehBase);
            totalCount++;
            if (gpehBase.getType().equalsIgnoreCase("RRC_RRC_CONNECTION_SETUP")) {
                rrcConnectionSetUpCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "RRC_RRC_CONNECTION_RELEASE_COMPLETE")) {
                rrcConnectionReleaseCount++;
            } else if (gpehBase.getType().equalsIgnoreCase("INTERNAL_IMSI")) {
                internalImsiCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_RAB_ESTABLISHMENT")) {
                internalRabEstablishmentCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_NORMAL_RELEASE")) {
                internalNormalReleaseCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_RAB_RELEASE")) {
                internalRabReleaseCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_SYSTEM_RELEASE")) {
                internalSystemReleaseCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "RRC_MEASUREMENT_REPORT")) {
                rrcMeasurementReportCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_CHANNEL_SWITCHING")) {
                channelSwitchingCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_SYSTEM_UTILIZATION")) {
                internalSystemUtilizationCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_FAILED_HSDSCH_CELL_CHANGE")) {
                internalFailedHSDSCHCellChangeCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE")) {
                internalSuccessfulHSDSCHCellChangeCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED")) {
                internalHSDSCHCellSelectionNoCellSelectedCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_OUT_HARD_HANDOVER_FAILURE")) {
                internalOutHardHandoeverFailureCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_IFHO_EXECUTION_ACTIVE")) {
                internalIFHOExecutionActiveCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_SOFT_HANDOVER_EXECUTION")) {
                internalSoftHandoeverExecutionCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_CMODE_ACTIVATE")) {
                internalCMODEActivateCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_CMODE_DEACTIVATE")) {
                internalCMODEDeactivateCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_START_CONGESTION")) {
                internalStartCongestionCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_STOP_CONGESTION")) {
                internalStopCongestionCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_RECORDING_FAULT")) {
                internalRecordingFaultCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_RECORDING_RECOVERED")) {
                internalRacordingRecoveredCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_MP_OVERLOAD")) {
                internalMPOverloadCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_CALL_SETUP_FAIL")) {
                internalCallSetupFailCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "RRC_UPLINK_DIRECT_TRANSFER")) {
                rrcUplinkDirectTransferCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "RANAP_IU_RELEASE_COMMAND")) {
                ranapIUReleaseCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "EE_MEASUREMENT_REPORT")) {
                eeMeasurementReportCount++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "INTERNAL_SOHO_DS_MISSING_NEIGHBOUR")) {
                sohoDsMissingNeighbour++;
            } else if (gpehBase.getType().equalsIgnoreCase(
                    "RANAP_IU_RELEASE_COMMAND")) {
                ranapIUReleaseCommand++;
            }

        }

        final String detailedEventReport = "The number of RRC_RRC_CONNECTION_SETUP is : "
                + rrcConnectionSetUpCount
                + " ratio "
                + getRatio(rrcConnectionSetUpCount, totalCount)
                + " \n the number of RRC_RRC_CONNECTION_RELEASE_COMPLETE is : "
                + rrcConnectionReleaseCount
                + " ratio "
                + getRatio(rrcConnectionReleaseCount, totalCount)
                + " \n the number of INTERNAL_IMSI is : "
                + internalImsiCount
                + " ratio "
                + getRatio(internalImsiCount, totalCount)
                + " \n the number of INTERNAL_RAB_ESTABLISHMENT is : "
                + internalRabEstablishmentCount
                + " ratio "
                + getRatio(internalRabEstablishmentCount, totalCount)
                + " \n the number of INTERNAL_RAB_RELEASE is : "
                + internalNormalReleaseCount
                + " ratio "
                + getRatio(internalNormalReleaseCount, totalCount)
                + " \n the number of INTERNAL_NORMAL_RELEASE is : "
                + internalRabReleaseCount
                + " ratio "
                + getRatio(internalRabReleaseCount, totalCount)
                + " \n the number of INTERNAL_SYSTEM_RELEASE is : "
                + internalSystemReleaseCount
                + " ratio "
                + getRatio(internalSystemReleaseCount, totalCount)
                +

                " \n the number of RRC_MEASUREMENT_REPORT is : "
                + rrcMeasurementReportCount
                + " ratio "
                + getRatio(rrcMeasurementReportCount, totalCount)
                + " \n the number of INTERNAL_CHANNEL_SWITCHING is : "
                + channelSwitchingCount
                + " ratio "
                + getRatio(channelSwitchingCount, totalCount)
                + " \n the number of INTERNAL_SYSTEM_UTILIZATION is : "
                + internalSystemUtilizationCount
                + " ratio "
                + getRatio(internalSystemUtilizationCount, totalCount)
                +

                " \n the number of INTERNAL_FAILED_HSDSCH_CELL_CHANGE is : "
                + internalFailedHSDSCHCellChangeCount
                + " ratio "
                + getRatio(internalFailedHSDSCHCellChangeCount, totalCount)
                + " \n the number of INTERNAL_SUCCESSFUL_HSDSCH_CELL_CHANGE is : "
                + internalSuccessfulHSDSCHCellChangeCount
                + " ratio "
                + getRatio(internalSuccessfulHSDSCHCellChangeCount, totalCount)
                + " \n the number of INTERNAL_HSDSCH_CELL_SELECTION_NO_CELL_SELECTED is : "
                + internalHSDSCHCellSelectionNoCellSelectedCount
                + " ratio "
                + getRatio(internalHSDSCHCellSelectionNoCellSelectedCount,
                        totalCount)
                + " \n the number of INTERNAL_OUT_HARD_HANDOVER_FAILURE is : "
                + internalOutHardHandoeverFailureCount
                + " ratio "
                + getRatio(internalOutHardHandoeverFailureCount, totalCount)
                + " \n the number of INTERNAL_IFHO_EXECUTION_ACTIVE is : "
                + internalIFHOExecutionActiveCount
                + " ratio "
                + getRatio(internalIFHOExecutionActiveCount, totalCount)
                + " \n the number of INTERNAL_SOFT_HANDOVER_EXECUTION is : "
                + internalSoftHandoeverExecutionCount
                + " ratio "
                + getRatio(internalSoftHandoeverExecutionCount, totalCount)
                + " \n the number of INTERNAL_CMODE_ACTIVATE is : "
                + internalCMODEActivateCount
                + " ratio "
                + getRatio(internalCMODEActivateCount, totalCount)
                + " \n the number of INTERNAL_CMODE_DEACTIVATE is : "
                + internalCMODEDeactivateCount
                + " ratio "
                + getRatio(internalCMODEDeactivateCount, totalCount)
                +

                " \n the number of INTERNAL_START_CONGESTION is : "
                + internalStartCongestionCount
                + " ratio "
                + getRatio(internalStartCongestionCount, totalCount)
                + " \n the number of INTERNAL_STOP_CONGESTION is: "
                + internalStopCongestionCount
                + " ratio "
                + getRatio(internalStopCongestionCount, totalCount)
                + " \n the number of INTERNAL_RECORDING_FAULT is : "
                + internalRecordingFaultCount
                + " ratio "
                + getRatio(internalRecordingFaultCount, totalCount)
                + " \n the number of INTERNAL_RECORDING_RECOVERED is : "
                + internalRacordingRecoveredCount
                + " ratio "
                + getRatio(internalRacordingRecoveredCount, totalCount)
                + " \n the number of INTERNAL_MP_OVERLOAD is : "
                + internalMPOverloadCount
                + " ratio "
                + getRatio(internalMPOverloadCount, totalCount)
                + " \n the number of INTERNAL_CALL_SETUP_FAIL is :  "
                + internalCallSetupFailCount
                + " ratio "
                + getRatio(internalCallSetupFailCount, totalCount)
                + " \n the number of RRC_UPLINK_DIRECT_TRANSFER is : "
                + rrcUplinkDirectTransferCount
                + " ratio "
                + getRatio(rrcUplinkDirectTransferCount, totalCount)
                +

                " \n the number of RANAP_IU_RELEASE_COMMAND is : "
                + ranapIUReleaseCount
                + " ratio "
                + getRatio(ranapIUReleaseCount, totalCount)
                + " \n the number of EE_MEASUREMENT_REPORT is : "
                + eeMeasurementReportCount
                + " ratio "
                + getRatio(eeMeasurementReportCount, totalCount)
                + " \n the number of INTERNAL_SOHO_DS_MISSING_NEIGHBOUR is : "
                + sohoDsMissingNeighbour
                + " ratio "
                + getRatio(sohoDsMissingNeighbour, totalCount)
                + " \n the number of RANAP_IU_RELEASE_COMMAND is : "
                + ranapIUReleaseCommand
                + " ratio "
                + getRatio(ranapIUReleaseCommand, totalCount)
                + " \n the number of sum is : "
                + (ranapIUReleaseCount + rrcUplinkDirectTransferCount
                        + internalMPOverloadCount
                        + internalRacordingRecoveredCount
                        + internalRecordingFaultCount
                        + internalStopCongestionCount
                        + internalStartCongestionCount
                        + internalCMODEDeactivateCount
                        + internalCMODEActivateCount
                        + internalSoftHandoeverExecutionCount
                        + internalIFHOExecutionActiveCount
                        + internalOutHardHandoeverFailureCount
                        + internalHSDSCHCellSelectionNoCellSelectedCount
                        + internalSuccessfulHSDSCHCellChangeCount
                        + internalFailedHSDSCHCellChangeCount
                        + internalSystemUtilizationCount
                        + channelSwitchingCount + rrcMeasurementReportCount
                        + internalSystemReleaseCount + internalRabReleaseCount
                        + internalRabEstablishmentCount + internalImsiCount
                        + rrcConnectionReleaseCount + rrcConnectionSetUpCount
                        + eeMeasurementReportCount + sohoDsMissingNeighbour + ranapIUReleaseCommand)
                + " \n total count : " + totalCount;
        return detailedEventReport;
    }

    private double getRatio(final double counter, final double totalCount) {
        return (counter / totalCount) * 100;
    }

}
