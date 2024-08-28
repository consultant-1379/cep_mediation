/*************************************************************/
/* Copyright (C) 2012 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: LM Ericsson Ltd, Athlone, Ireland - License 11536 for Solaris x86 */
/* Abstract syntax: class-definitions */
/* ASN.1 Java project: rrc.Rrc */
/* Created: Wed Feb 15 12:27:03 2012 */
/* ASN.1 Compiler for Java version: 4.1 */
/* ASN.1 compiler options and file names specified:
 * -output rrc -uper -root constants.asn ie-definitions.asn internode.asn
 * pdu-definitions.asn class-definitions.asn
 */


package rrc.class_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UL_DCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class UL_DCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DCCH_MessageType()
    {
    }
    
    public static final  int  activeSetUpdateComplete_chosen = 1;
    public static final  int  activeSetUpdateFailure_chosen = 2;
    public static final  int  cellChangeOrderFromUTRANFailure_chosen = 3;
    public static final  int  counterCheckResponse_chosen = 4;
    public static final  int  handoverToUTRANComplete_chosen = 5;
    public static final  int  initialDirectTransfer_chosen = 6;
    public static final  int  handoverFromUTRANFailure_chosen = 7;
    public static final  int  measurementControlFailure_chosen = 8;
    public static final  int  measurementReport_chosen = 9;
    public static final  int  physicalChannelReconfigurationComplete_chosen = 10;
    public static final  int  physicalChannelReconfigurationFailure_chosen = 11;
    public static final  int  radioBearerReconfigurationComplete_chosen = 12;
    public static final  int  radioBearerReconfigurationFailure_chosen = 13;
    public static final  int  radioBearerReleaseComplete_chosen = 14;
    public static final  int  radioBearerReleaseFailure_chosen = 15;
    public static final  int  radioBearerSetupComplete_chosen = 16;
    public static final  int  radioBearerSetupFailure_chosen = 17;
    public static final  int  rrcConnectionReleaseComplete_chosen = 18;
    public static final  int  rrcConnectionSetupComplete_chosen = 19;
    public static final  int  rrcStatus_chosen = 20;
    public static final  int  securityModeComplete_chosen = 21;
    public static final  int  securityModeFailure_chosen = 22;
    public static final  int  signallingConnectionReleaseIndication_chosen = 23;
    public static final  int  transportChannelReconfigurationComplete_chosen = 24;
    public static final  int  transportChannelReconfigurationFailure_chosen = 25;
    public static final  int  transportFormatCombinationControlFailure_chosen = 26;
    public static final  int  ueCapabilityInformation_chosen = 27;
    public static final  int  uplinkDirectTransfer_chosen = 28;
    public static final  int  utranMobilityInformationConfirm_chosen = 29;
    public static final  int  utranMobilityInformationFailure_chosen = 30;
    public static final  int  mbmsModificationRequest_chosen = 31;
    public static final  int  ul_DCCH_MessageType_ext_chosen = 32;
    
    // Methods for field "activeSetUpdateComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithActiveSetUpdateComplete(rrc.pdu_definitions.ActiveSetUpdateComplete activeSetUpdateComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setActiveSetUpdateComplete(activeSetUpdateComplete);
	return __object;
    }
    
    public boolean hasActiveSetUpdateComplete()
    {
	return getChosenFlag() == activeSetUpdateComplete_chosen;
    }
    
    public void setActiveSetUpdateComplete(rrc.pdu_definitions.ActiveSetUpdateComplete activeSetUpdateComplete)
    {
	setChosenValue(activeSetUpdateComplete);
	setChosenFlag(activeSetUpdateComplete_chosen);
    }
    
    
    // Methods for field "activeSetUpdateFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithActiveSetUpdateFailure(rrc.pdu_definitions.ActiveSetUpdateFailure activeSetUpdateFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setActiveSetUpdateFailure(activeSetUpdateFailure);
	return __object;
    }
    
    public boolean hasActiveSetUpdateFailure()
    {
	return getChosenFlag() == activeSetUpdateFailure_chosen;
    }
    
    public void setActiveSetUpdateFailure(rrc.pdu_definitions.ActiveSetUpdateFailure activeSetUpdateFailure)
    {
	setChosenValue(activeSetUpdateFailure);
	setChosenFlag(activeSetUpdateFailure_chosen);
    }
    
    
    // Methods for field "cellChangeOrderFromUTRANFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithCellChangeOrderFromUTRANFailure(rrc.pdu_definitions.CellChangeOrderFromUTRANFailure cellChangeOrderFromUTRANFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setCellChangeOrderFromUTRANFailure(cellChangeOrderFromUTRANFailure);
	return __object;
    }
    
    public boolean hasCellChangeOrderFromUTRANFailure()
    {
	return getChosenFlag() == cellChangeOrderFromUTRANFailure_chosen;
    }
    
    public void setCellChangeOrderFromUTRANFailure(rrc.pdu_definitions.CellChangeOrderFromUTRANFailure cellChangeOrderFromUTRANFailure)
    {
	setChosenValue(cellChangeOrderFromUTRANFailure);
	setChosenFlag(cellChangeOrderFromUTRANFailure_chosen);
    }
    
    
    // Methods for field "counterCheckResponse"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithCounterCheckResponse(rrc.pdu_definitions.CounterCheckResponse counterCheckResponse)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setCounterCheckResponse(counterCheckResponse);
	return __object;
    }
    
    public boolean hasCounterCheckResponse()
    {
	return getChosenFlag() == counterCheckResponse_chosen;
    }
    
    public void setCounterCheckResponse(rrc.pdu_definitions.CounterCheckResponse counterCheckResponse)
    {
	setChosenValue(counterCheckResponse);
	setChosenFlag(counterCheckResponse_chosen);
    }
    
    
    // Methods for field "handoverToUTRANComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithHandoverToUTRANComplete(rrc.pdu_definitions.HandoverToUTRANComplete handoverToUTRANComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setHandoverToUTRANComplete(handoverToUTRANComplete);
	return __object;
    }
    
    public boolean hasHandoverToUTRANComplete()
    {
	return getChosenFlag() == handoverToUTRANComplete_chosen;
    }
    
    public void setHandoverToUTRANComplete(rrc.pdu_definitions.HandoverToUTRANComplete handoverToUTRANComplete)
    {
	setChosenValue(handoverToUTRANComplete);
	setChosenFlag(handoverToUTRANComplete_chosen);
    }
    
    
    // Methods for field "initialDirectTransfer"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithInitialDirectTransfer(rrc.pdu_definitions.InitialDirectTransfer initialDirectTransfer)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setInitialDirectTransfer(initialDirectTransfer);
	return __object;
    }
    
    public boolean hasInitialDirectTransfer()
    {
	return getChosenFlag() == initialDirectTransfer_chosen;
    }
    
    public void setInitialDirectTransfer(rrc.pdu_definitions.InitialDirectTransfer initialDirectTransfer)
    {
	setChosenValue(initialDirectTransfer);
	setChosenFlag(initialDirectTransfer_chosen);
    }
    
    
    // Methods for field "handoverFromUTRANFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithHandoverFromUTRANFailure(rrc.pdu_definitions.HandoverFromUTRANFailure handoverFromUTRANFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setHandoverFromUTRANFailure(handoverFromUTRANFailure);
	return __object;
    }
    
    public boolean hasHandoverFromUTRANFailure()
    {
	return getChosenFlag() == handoverFromUTRANFailure_chosen;
    }
    
    public void setHandoverFromUTRANFailure(rrc.pdu_definitions.HandoverFromUTRANFailure handoverFromUTRANFailure)
    {
	setChosenValue(handoverFromUTRANFailure);
	setChosenFlag(handoverFromUTRANFailure_chosen);
    }
    
    
    // Methods for field "measurementControlFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithMeasurementControlFailure(rrc.pdu_definitions.MeasurementControlFailure measurementControlFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setMeasurementControlFailure(measurementControlFailure);
	return __object;
    }
    
    public boolean hasMeasurementControlFailure()
    {
	return getChosenFlag() == measurementControlFailure_chosen;
    }
    
    public void setMeasurementControlFailure(rrc.pdu_definitions.MeasurementControlFailure measurementControlFailure)
    {
	setChosenValue(measurementControlFailure);
	setChosenFlag(measurementControlFailure_chosen);
    }
    
    
    // Methods for field "measurementReport"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithMeasurementReport(rrc.pdu_definitions.MeasurementReport measurementReport)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setMeasurementReport(measurementReport);
	return __object;
    }
    
    public boolean hasMeasurementReport()
    {
	return getChosenFlag() == measurementReport_chosen;
    }
    
    public void setMeasurementReport(rrc.pdu_definitions.MeasurementReport measurementReport)
    {
	setChosenValue(measurementReport);
	setChosenFlag(measurementReport_chosen);
    }
    
    
    // Methods for field "physicalChannelReconfigurationComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithPhysicalChannelReconfigurationComplete(rrc.pdu_definitions.PhysicalChannelReconfigurationComplete physicalChannelReconfigurationComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setPhysicalChannelReconfigurationComplete(physicalChannelReconfigurationComplete);
	return __object;
    }
    
    public boolean hasPhysicalChannelReconfigurationComplete()
    {
	return getChosenFlag() == physicalChannelReconfigurationComplete_chosen;
    }
    
    public void setPhysicalChannelReconfigurationComplete(rrc.pdu_definitions.PhysicalChannelReconfigurationComplete physicalChannelReconfigurationComplete)
    {
	setChosenValue(physicalChannelReconfigurationComplete);
	setChosenFlag(physicalChannelReconfigurationComplete_chosen);
    }
    
    
    // Methods for field "physicalChannelReconfigurationFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithPhysicalChannelReconfigurationFailure(rrc.pdu_definitions.PhysicalChannelReconfigurationFailure physicalChannelReconfigurationFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setPhysicalChannelReconfigurationFailure(physicalChannelReconfigurationFailure);
	return __object;
    }
    
    public boolean hasPhysicalChannelReconfigurationFailure()
    {
	return getChosenFlag() == physicalChannelReconfigurationFailure_chosen;
    }
    
    public void setPhysicalChannelReconfigurationFailure(rrc.pdu_definitions.PhysicalChannelReconfigurationFailure physicalChannelReconfigurationFailure)
    {
	setChosenValue(physicalChannelReconfigurationFailure);
	setChosenFlag(physicalChannelReconfigurationFailure_chosen);
    }
    
    
    // Methods for field "radioBearerReconfigurationComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerReconfigurationComplete(rrc.pdu_definitions.RadioBearerReconfigurationComplete radioBearerReconfigurationComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerReconfigurationComplete(radioBearerReconfigurationComplete);
	return __object;
    }
    
    public boolean hasRadioBearerReconfigurationComplete()
    {
	return getChosenFlag() == radioBearerReconfigurationComplete_chosen;
    }
    
    public void setRadioBearerReconfigurationComplete(rrc.pdu_definitions.RadioBearerReconfigurationComplete radioBearerReconfigurationComplete)
    {
	setChosenValue(radioBearerReconfigurationComplete);
	setChosenFlag(radioBearerReconfigurationComplete_chosen);
    }
    
    
    // Methods for field "radioBearerReconfigurationFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerReconfigurationFailure(rrc.pdu_definitions.RadioBearerReconfigurationFailure radioBearerReconfigurationFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerReconfigurationFailure(radioBearerReconfigurationFailure);
	return __object;
    }
    
    public boolean hasRadioBearerReconfigurationFailure()
    {
	return getChosenFlag() == radioBearerReconfigurationFailure_chosen;
    }
    
    public void setRadioBearerReconfigurationFailure(rrc.pdu_definitions.RadioBearerReconfigurationFailure radioBearerReconfigurationFailure)
    {
	setChosenValue(radioBearerReconfigurationFailure);
	setChosenFlag(radioBearerReconfigurationFailure_chosen);
    }
    
    
    // Methods for field "radioBearerReleaseComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerReleaseComplete(rrc.pdu_definitions.RadioBearerReleaseComplete radioBearerReleaseComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerReleaseComplete(radioBearerReleaseComplete);
	return __object;
    }
    
    public boolean hasRadioBearerReleaseComplete()
    {
	return getChosenFlag() == radioBearerReleaseComplete_chosen;
    }
    
    public void setRadioBearerReleaseComplete(rrc.pdu_definitions.RadioBearerReleaseComplete radioBearerReleaseComplete)
    {
	setChosenValue(radioBearerReleaseComplete);
	setChosenFlag(radioBearerReleaseComplete_chosen);
    }
    
    
    // Methods for field "radioBearerReleaseFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerReleaseFailure(rrc.pdu_definitions.RadioBearerReleaseFailure radioBearerReleaseFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerReleaseFailure(radioBearerReleaseFailure);
	return __object;
    }
    
    public boolean hasRadioBearerReleaseFailure()
    {
	return getChosenFlag() == radioBearerReleaseFailure_chosen;
    }
    
    public void setRadioBearerReleaseFailure(rrc.pdu_definitions.RadioBearerReleaseFailure radioBearerReleaseFailure)
    {
	setChosenValue(radioBearerReleaseFailure);
	setChosenFlag(radioBearerReleaseFailure_chosen);
    }
    
    
    // Methods for field "radioBearerSetupComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerSetupComplete(rrc.pdu_definitions.RadioBearerSetupComplete radioBearerSetupComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerSetupComplete(radioBearerSetupComplete);
	return __object;
    }
    
    public boolean hasRadioBearerSetupComplete()
    {
	return getChosenFlag() == radioBearerSetupComplete_chosen;
    }
    
    public void setRadioBearerSetupComplete(rrc.pdu_definitions.RadioBearerSetupComplete radioBearerSetupComplete)
    {
	setChosenValue(radioBearerSetupComplete);
	setChosenFlag(radioBearerSetupComplete_chosen);
    }
    
    
    // Methods for field "radioBearerSetupFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRadioBearerSetupFailure(rrc.pdu_definitions.RadioBearerSetupFailure radioBearerSetupFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRadioBearerSetupFailure(radioBearerSetupFailure);
	return __object;
    }
    
    public boolean hasRadioBearerSetupFailure()
    {
	return getChosenFlag() == radioBearerSetupFailure_chosen;
    }
    
    public void setRadioBearerSetupFailure(rrc.pdu_definitions.RadioBearerSetupFailure radioBearerSetupFailure)
    {
	setChosenValue(radioBearerSetupFailure);
	setChosenFlag(radioBearerSetupFailure_chosen);
    }
    
    
    // Methods for field "rrcConnectionReleaseComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRrcConnectionReleaseComplete(rrc.pdu_definitions.RRCConnectionReleaseComplete rrcConnectionReleaseComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRrcConnectionReleaseComplete(rrcConnectionReleaseComplete);
	return __object;
    }
    
    public boolean hasRrcConnectionReleaseComplete()
    {
	return getChosenFlag() == rrcConnectionReleaseComplete_chosen;
    }
    
    public void setRrcConnectionReleaseComplete(rrc.pdu_definitions.RRCConnectionReleaseComplete rrcConnectionReleaseComplete)
    {
	setChosenValue(rrcConnectionReleaseComplete);
	setChosenFlag(rrcConnectionReleaseComplete_chosen);
    }
    
    
    // Methods for field "rrcConnectionSetupComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRrcConnectionSetupComplete(rrc.pdu_definitions.RRCConnectionSetupComplete rrcConnectionSetupComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRrcConnectionSetupComplete(rrcConnectionSetupComplete);
	return __object;
    }
    
    public boolean hasRrcConnectionSetupComplete()
    {
	return getChosenFlag() == rrcConnectionSetupComplete_chosen;
    }
    
    public void setRrcConnectionSetupComplete(rrc.pdu_definitions.RRCConnectionSetupComplete rrcConnectionSetupComplete)
    {
	setChosenValue(rrcConnectionSetupComplete);
	setChosenFlag(rrcConnectionSetupComplete_chosen);
    }
    
    
    // Methods for field "rrcStatus"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithRrcStatus(rrc.pdu_definitions.RRCStatus rrcStatus)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setRrcStatus(rrcStatus);
	return __object;
    }
    
    public boolean hasRrcStatus()
    {
	return getChosenFlag() == rrcStatus_chosen;
    }
    
    public void setRrcStatus(rrc.pdu_definitions.RRCStatus rrcStatus)
    {
	setChosenValue(rrcStatus);
	setChosenFlag(rrcStatus_chosen);
    }
    
    
    // Methods for field "securityModeComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithSecurityModeComplete(rrc.pdu_definitions.SecurityModeComplete securityModeComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setSecurityModeComplete(securityModeComplete);
	return __object;
    }
    
    public boolean hasSecurityModeComplete()
    {
	return getChosenFlag() == securityModeComplete_chosen;
    }
    
    public void setSecurityModeComplete(rrc.pdu_definitions.SecurityModeComplete securityModeComplete)
    {
	setChosenValue(securityModeComplete);
	setChosenFlag(securityModeComplete_chosen);
    }
    
    
    // Methods for field "securityModeFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithSecurityModeFailure(rrc.pdu_definitions.SecurityModeFailure securityModeFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setSecurityModeFailure(securityModeFailure);
	return __object;
    }
    
    public boolean hasSecurityModeFailure()
    {
	return getChosenFlag() == securityModeFailure_chosen;
    }
    
    public void setSecurityModeFailure(rrc.pdu_definitions.SecurityModeFailure securityModeFailure)
    {
	setChosenValue(securityModeFailure);
	setChosenFlag(securityModeFailure_chosen);
    }
    
    
    // Methods for field "signallingConnectionReleaseIndication"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithSignallingConnectionReleaseIndication(rrc.pdu_definitions.SignallingConnectionReleaseIndication signallingConnectionReleaseIndication)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setSignallingConnectionReleaseIndication(signallingConnectionReleaseIndication);
	return __object;
    }
    
    public boolean hasSignallingConnectionReleaseIndication()
    {
	return getChosenFlag() == signallingConnectionReleaseIndication_chosen;
    }
    
    public void setSignallingConnectionReleaseIndication(rrc.pdu_definitions.SignallingConnectionReleaseIndication signallingConnectionReleaseIndication)
    {
	setChosenValue(signallingConnectionReleaseIndication);
	setChosenFlag(signallingConnectionReleaseIndication_chosen);
    }
    
    
    // Methods for field "transportChannelReconfigurationComplete"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithTransportChannelReconfigurationComplete(rrc.pdu_definitions.TransportChannelReconfigurationComplete transportChannelReconfigurationComplete)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setTransportChannelReconfigurationComplete(transportChannelReconfigurationComplete);
	return __object;
    }
    
    public boolean hasTransportChannelReconfigurationComplete()
    {
	return getChosenFlag() == transportChannelReconfigurationComplete_chosen;
    }
    
    public void setTransportChannelReconfigurationComplete(rrc.pdu_definitions.TransportChannelReconfigurationComplete transportChannelReconfigurationComplete)
    {
	setChosenValue(transportChannelReconfigurationComplete);
	setChosenFlag(transportChannelReconfigurationComplete_chosen);
    }
    
    
    // Methods for field "transportChannelReconfigurationFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithTransportChannelReconfigurationFailure(rrc.pdu_definitions.TransportChannelReconfigurationFailure transportChannelReconfigurationFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setTransportChannelReconfigurationFailure(transportChannelReconfigurationFailure);
	return __object;
    }
    
    public boolean hasTransportChannelReconfigurationFailure()
    {
	return getChosenFlag() == transportChannelReconfigurationFailure_chosen;
    }
    
    public void setTransportChannelReconfigurationFailure(rrc.pdu_definitions.TransportChannelReconfigurationFailure transportChannelReconfigurationFailure)
    {
	setChosenValue(transportChannelReconfigurationFailure);
	setChosenFlag(transportChannelReconfigurationFailure_chosen);
    }
    
    
    // Methods for field "transportFormatCombinationControlFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithTransportFormatCombinationControlFailure(rrc.pdu_definitions.TransportFormatCombinationControlFailure transportFormatCombinationControlFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setTransportFormatCombinationControlFailure(transportFormatCombinationControlFailure);
	return __object;
    }
    
    public boolean hasTransportFormatCombinationControlFailure()
    {
	return getChosenFlag() == transportFormatCombinationControlFailure_chosen;
    }
    
    public void setTransportFormatCombinationControlFailure(rrc.pdu_definitions.TransportFormatCombinationControlFailure transportFormatCombinationControlFailure)
    {
	setChosenValue(transportFormatCombinationControlFailure);
	setChosenFlag(transportFormatCombinationControlFailure_chosen);
    }
    
    
    // Methods for field "ueCapabilityInformation"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithUeCapabilityInformation(rrc.pdu_definitions.UECapabilityInformation ueCapabilityInformation)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setUeCapabilityInformation(ueCapabilityInformation);
	return __object;
    }
    
    public boolean hasUeCapabilityInformation()
    {
	return getChosenFlag() == ueCapabilityInformation_chosen;
    }
    
    public void setUeCapabilityInformation(rrc.pdu_definitions.UECapabilityInformation ueCapabilityInformation)
    {
	setChosenValue(ueCapabilityInformation);
	setChosenFlag(ueCapabilityInformation_chosen);
    }
    
    
    // Methods for field "uplinkDirectTransfer"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithUplinkDirectTransfer(rrc.pdu_definitions.UplinkDirectTransfer uplinkDirectTransfer)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setUplinkDirectTransfer(uplinkDirectTransfer);
	return __object;
    }
    
    public boolean hasUplinkDirectTransfer()
    {
	return getChosenFlag() == uplinkDirectTransfer_chosen;
    }
    
    public void setUplinkDirectTransfer(rrc.pdu_definitions.UplinkDirectTransfer uplinkDirectTransfer)
    {
	setChosenValue(uplinkDirectTransfer);
	setChosenFlag(uplinkDirectTransfer_chosen);
    }
    
    
    // Methods for field "utranMobilityInformationConfirm"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithUtranMobilityInformationConfirm(rrc.pdu_definitions.UTRANMobilityInformationConfirm utranMobilityInformationConfirm)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setUtranMobilityInformationConfirm(utranMobilityInformationConfirm);
	return __object;
    }
    
    public boolean hasUtranMobilityInformationConfirm()
    {
	return getChosenFlag() == utranMobilityInformationConfirm_chosen;
    }
    
    public void setUtranMobilityInformationConfirm(rrc.pdu_definitions.UTRANMobilityInformationConfirm utranMobilityInformationConfirm)
    {
	setChosenValue(utranMobilityInformationConfirm);
	setChosenFlag(utranMobilityInformationConfirm_chosen);
    }
    
    
    // Methods for field "utranMobilityInformationFailure"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithUtranMobilityInformationFailure(rrc.pdu_definitions.UTRANMobilityInformationFailure utranMobilityInformationFailure)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setUtranMobilityInformationFailure(utranMobilityInformationFailure);
	return __object;
    }
    
    public boolean hasUtranMobilityInformationFailure()
    {
	return getChosenFlag() == utranMobilityInformationFailure_chosen;
    }
    
    public void setUtranMobilityInformationFailure(rrc.pdu_definitions.UTRANMobilityInformationFailure utranMobilityInformationFailure)
    {
	setChosenValue(utranMobilityInformationFailure);
	setChosenFlag(utranMobilityInformationFailure_chosen);
    }
    
    
    // Methods for field "mbmsModificationRequest"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithMbmsModificationRequest(rrc.pdu_definitions.MBMSModificationRequest mbmsModificationRequest)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setMbmsModificationRequest(mbmsModificationRequest);
	return __object;
    }
    
    public boolean hasMbmsModificationRequest()
    {
	return getChosenFlag() == mbmsModificationRequest_chosen;
    }
    
    public void setMbmsModificationRequest(rrc.pdu_definitions.MBMSModificationRequest mbmsModificationRequest)
    {
	setChosenValue(mbmsModificationRequest);
	setChosenFlag(mbmsModificationRequest_chosen);
    }
    
    
    // Methods for field "ul_DCCH_MessageType_ext"
    public static UL_DCCH_MessageType createUL_DCCH_MessageTypeWithUl_DCCH_MessageType_ext(UL_DCCH_MessageType_ext ul_DCCH_MessageType_ext)
    {
	UL_DCCH_MessageType __object = new UL_DCCH_MessageType();

	__object.setUl_DCCH_MessageType_ext(ul_DCCH_MessageType_ext);
	return __object;
    }
    
    public boolean hasUl_DCCH_MessageType_ext()
    {
	return getChosenFlag() == ul_DCCH_MessageType_ext_chosen;
    }
    
    public void setUl_DCCH_MessageType_ext(UL_DCCH_MessageType_ext ul_DCCH_MessageType_ext)
    {
	setChosenValue(ul_DCCH_MessageType_ext);
	setChosenFlag(ul_DCCH_MessageType_ext_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case activeSetUpdateComplete_chosen:
		return new rrc.pdu_definitions.ActiveSetUpdateComplete();
	    case activeSetUpdateFailure_chosen:
		return new rrc.pdu_definitions.ActiveSetUpdateFailure();
	    case cellChangeOrderFromUTRANFailure_chosen:
		return new rrc.pdu_definitions.CellChangeOrderFromUTRANFailure();
	    case counterCheckResponse_chosen:
		return new rrc.pdu_definitions.CounterCheckResponse();
	    case handoverToUTRANComplete_chosen:
		return new rrc.pdu_definitions.HandoverToUTRANComplete();
	    case initialDirectTransfer_chosen:
		return new rrc.pdu_definitions.InitialDirectTransfer();
	    case handoverFromUTRANFailure_chosen:
		return new rrc.pdu_definitions.HandoverFromUTRANFailure();
	    case measurementControlFailure_chosen:
		return new rrc.pdu_definitions.MeasurementControlFailure();
	    case measurementReport_chosen:
		return new rrc.pdu_definitions.MeasurementReport();
	    case physicalChannelReconfigurationComplete_chosen:
		return new rrc.pdu_definitions.PhysicalChannelReconfigurationComplete();
	    case physicalChannelReconfigurationFailure_chosen:
		return new rrc.pdu_definitions.PhysicalChannelReconfigurationFailure();
	    case radioBearerReconfigurationComplete_chosen:
		return new rrc.pdu_definitions.RadioBearerReconfigurationComplete();
	    case radioBearerReconfigurationFailure_chosen:
		return new rrc.pdu_definitions.RadioBearerReconfigurationFailure();
	    case radioBearerReleaseComplete_chosen:
		return new rrc.pdu_definitions.RadioBearerReleaseComplete();
	    case radioBearerReleaseFailure_chosen:
		return new rrc.pdu_definitions.RadioBearerReleaseFailure();
	    case radioBearerSetupComplete_chosen:
		return new rrc.pdu_definitions.RadioBearerSetupComplete();
	    case radioBearerSetupFailure_chosen:
		return new rrc.pdu_definitions.RadioBearerSetupFailure();
	    case rrcConnectionReleaseComplete_chosen:
		return new rrc.pdu_definitions.RRCConnectionReleaseComplete();
	    case rrcConnectionSetupComplete_chosen:
		return new rrc.pdu_definitions.RRCConnectionSetupComplete();
	    case rrcStatus_chosen:
		return new rrc.pdu_definitions.RRCStatus();
	    case securityModeComplete_chosen:
		return new rrc.pdu_definitions.SecurityModeComplete();
	    case securityModeFailure_chosen:
		return new rrc.pdu_definitions.SecurityModeFailure();
	    case signallingConnectionReleaseIndication_chosen:
		return new rrc.pdu_definitions.SignallingConnectionReleaseIndication();
	    case transportChannelReconfigurationComplete_chosen:
		return new rrc.pdu_definitions.TransportChannelReconfigurationComplete();
	    case transportChannelReconfigurationFailure_chosen:
		return new rrc.pdu_definitions.TransportChannelReconfigurationFailure();
	    case transportFormatCombinationControlFailure_chosen:
		return new rrc.pdu_definitions.TransportFormatCombinationControlFailure();
	    case ueCapabilityInformation_chosen:
		return new rrc.pdu_definitions.UECapabilityInformation();
	    case uplinkDirectTransfer_chosen:
		return new rrc.pdu_definitions.UplinkDirectTransfer();
	    case utranMobilityInformationConfirm_chosen:
		return new rrc.pdu_definitions.UTRANMobilityInformationConfirm();
	    case utranMobilityInformationFailure_chosen:
		return new rrc.pdu_definitions.UTRANMobilityInformationFailure();
	    case mbmsModificationRequest_chosen:
		return new rrc.pdu_definitions.MBMSModificationRequest();
	    case ul_DCCH_MessageType_ext_chosen:
		return new UL_DCCH_MessageType_ext();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.class_definitions",
	    "UL_DCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "UL-DCCH-MessageType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdateComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"ActiveSetUpdateComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdateComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdateComplete"
				)
			    ),
			    0
			)
		    ),
		    "activeSetUpdateComplete",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdateFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"ActiveSetUpdateFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdateFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdateFailure"
				)
			    ),
			    0
			)
		    ),
		    "activeSetUpdateFailure",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellChangeOrderFromUTRANFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"CellChangeOrderFromUTRANFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellChangeOrderFromUTRANFailure"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "cellChangeOrderFromUTRANFailure",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CounterCheckResponse"
			    ),
			    new QName (
				"PDU-definitions",
				"CounterCheckResponse"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CounterCheckResponse"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CounterCheckResponse"
				)
			    ),
			    0
			)
		    ),
		    "counterCheckResponse",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverToUTRANComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANComplete"
				)
			    ),
			    0
			)
		    ),
		    "handoverToUTRANComplete",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"InitialDirectTransfer"
			    ),
			    new QName (
				"PDU-definitions",
				"InitialDirectTransfer"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InitialDirectTransfer"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "InitialDirectTransfer"
				)
			    ),
			    0
			)
		    ),
		    "initialDirectTransfer",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverFromUTRANFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANFailure"
				)
			    ),
			    0
			)
		    ),
		    "handoverFromUTRANFailure",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MeasurementControlFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"MeasurementControlFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementControlFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementControlFailure"
				)
			    ),
			    0
			)
		    ),
		    "measurementControlFailure",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MeasurementReport"
			    ),
			    new QName (
				"PDU-definitions",
				"MeasurementReport"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementReport"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementReport"
				)
			    ),
			    0
			)
		    ),
		    "measurementReport",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfigurationComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"PhysicalChannelReconfigurationComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfigurationComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfigurationComplete"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelReconfigurationComplete",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfigurationFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"PhysicalChannelReconfigurationFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfigurationFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfigurationFailure"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelReconfigurationFailure",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReconfigurationComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReconfigurationComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfigurationComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfigurationComplete"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerReconfigurationComplete",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReconfigurationFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReconfigurationFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfigurationFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfigurationFailure"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerReconfigurationFailure",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReleaseComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReleaseComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReleaseComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReleaseComplete"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerReleaseComplete",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReleaseFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReleaseFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReleaseFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReleaseFailure"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerReleaseFailure",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerSetupComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerSetupComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetupComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetupComplete"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerSetupComplete",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerSetupFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerSetupFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetupFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetupFailure"
				)
			    ),
			    0
			)
		    ),
		    "radioBearerSetupFailure",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionReleaseComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionReleaseComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionReleaseComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionReleaseComplete"
				)
			    ),
			    0
			)
		    ),
		    "rrcConnectionReleaseComplete",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionSetupComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionSetupComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionSetupComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionSetupComplete"
				)
			    ),
			    0
			)
		    ),
		    "rrcConnectionSetupComplete",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCStatus"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCStatus"
				)
			    ),
			    0
			)
		    ),
		    "rrcStatus",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"SecurityModeComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"SecurityModeComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SecurityModeComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SecurityModeComplete"
				)
			    ),
			    0
			)
		    ),
		    "securityModeComplete",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"SecurityModeFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"SecurityModeFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SecurityModeFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SecurityModeFailure"
				)
			    ),
			    0
			)
		    ),
		    "securityModeFailure",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"SignallingConnectionReleaseIndication"
			    ),
			    new QName (
				"PDU-definitions",
				"SignallingConnectionReleaseIndication"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SignallingConnectionReleaseIndication"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SignallingConnectionReleaseIndication"
				)
			    ),
			    0
			)
		    ),
		    "signallingConnectionReleaseIndication",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"TransportChannelReconfigurationComplete"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportChannelReconfigurationComplete"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfigurationComplete"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfigurationComplete"
				)
			    ),
			    0
			)
		    ),
		    "transportChannelReconfigurationComplete",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"TransportChannelReconfigurationFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportChannelReconfigurationFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfigurationFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfigurationFailure"
				)
			    ),
			    0
			)
		    ),
		    "transportChannelReconfigurationFailure",
		    24,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"TransportFormatCombinationControlFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportFormatCombinationControlFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportFormatCombinationControlFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportFormatCombinationControlFailure"
				)
			    ),
			    0
			)
		    ),
		    "transportFormatCombinationControlFailure",
		    25,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"UECapabilityInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformation"
				)
			    ),
			    0
			)
		    ),
		    "ueCapabilityInformation",
		    26,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UplinkDirectTransfer"
			    ),
			    new QName (
				"PDU-definitions",
				"UplinkDirectTransfer"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkDirectTransfer"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkDirectTransfer"
				)
			    ),
			    0
			)
		    ),
		    "uplinkDirectTransfer",
		    27,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UTRANMobilityInformationConfirm"
			    ),
			    new QName (
				"PDU-definitions",
				"UTRANMobilityInformationConfirm"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformationConfirm"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformationConfirm"
				)
			    ),
			    0
			)
		    ),
		    "utranMobilityInformationConfirm",
		    28,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UTRANMobilityInformationFailure"
			    ),
			    new QName (
				"PDU-definitions",
				"UTRANMobilityInformationFailure"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformationFailure"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformationFailure"
				)
			    ),
			    0
			)
		    ),
		    "utranMobilityInformationFailure",
		    29,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MBMSModificationRequest"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSModificationRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModificationRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModificationRequest"
				)
			    ),
			    0
			)
		    ),
		    "mbmsModificationRequest",
		    30,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
				}
			    ),
			    new QName (
				"rrc.class_definitions",
				"UL_DCCH_MessageType_ext"
			    ),
			    new QName (
				"Class-definitions",
				"UL-DCCH-MessageType-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.class_definitions",
				    "UL_DCCH_MessageType_ext"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15)
				}
			    )
			)
		    ),
		    "ul-DCCH-MessageType-ext",
		    31,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8),
		new TagDecoderElement((short)0x8009, 9),
		new TagDecoderElement((short)0x800a, 10),
		new TagDecoderElement((short)0x800b, 11),
		new TagDecoderElement((short)0x800c, 12),
		new TagDecoderElement((short)0x800d, 13),
		new TagDecoderElement((short)0x800e, 14),
		new TagDecoderElement((short)0x800f, 15),
		new TagDecoderElement((short)0x8010, 16),
		new TagDecoderElement((short)0x8011, 17),
		new TagDecoderElement((short)0x8012, 18),
		new TagDecoderElement((short)0x8013, 19),
		new TagDecoderElement((short)0x8014, 20),
		new TagDecoderElement((short)0x8015, 21),
		new TagDecoderElement((short)0x8016, 22),
		new TagDecoderElement((short)0x8017, 23),
		new TagDecoderElement((short)0x8018, 24),
		new TagDecoderElement((short)0x8019, 25),
		new TagDecoderElement((short)0x801a, 26),
		new TagDecoderElement((short)0x801b, 27),
		new TagDecoderElement((short)0x801c, 28),
		new TagDecoderElement((short)0x801d, 29),
		new TagDecoderElement((short)0x801e, 30),
		new TagDecoderElement((short)0x801f, 31)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DCCH_MessageType
