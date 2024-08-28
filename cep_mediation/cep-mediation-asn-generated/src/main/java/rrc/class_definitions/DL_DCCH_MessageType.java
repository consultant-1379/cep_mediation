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
 * Define the ASN1 Type DL_DCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class DL_DCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_DCCH_MessageType()
    {
    }
    
    public static final  int  activeSetUpdate_chosen = 1;
    public static final  int  assistanceDataDelivery_chosen = 2;
    public static final  int  cellChangeOrderFromUTRAN_chosen = 3;
    public static final  int  cellUpdateConfirm_chosen = 4;
    public static final  int  counterCheck_chosen = 5;
    public static final  int  downlinkDirectTransfer_chosen = 6;
    public static final  int  handoverFromUTRANCommand_GSM_chosen = 7;
    public static final  int  handoverFromUTRANCommand_CDMA2000_chosen = 8;
    public static final  int  measurementControl_chosen = 9;
    public static final  int  pagingType2_chosen = 10;
    public static final  int  physicalChannelReconfiguration_chosen = 11;
    public static final  int  physicalSharedChannelAllocation_chosen = 12;
    public static final  int  radioBearerReconfiguration_chosen = 13;
    public static final  int  radioBearerRelease_chosen = 14;
    public static final  int  radioBearerSetup_chosen = 15;
    public static final  int  rrcConnectionRelease_chosen = 16;
    public static final  int  securityModeCommand_chosen = 17;
    public static final  int  signallingConnectionRelease_chosen = 18;
    public static final  int  transportChannelReconfiguration_chosen = 19;
    public static final  int  transportFormatCombinationControl_chosen = 20;
    public static final  int  ueCapabilityEnquiry_chosen = 21;
    public static final  int  ueCapabilityInformationConfirm_chosen = 22;
    public static final  int  uplinkPhysicalChannelControl_chosen = 23;
    public static final  int  uraUpdateConfirm_chosen = 24;
    public static final  int  utranMobilityInformation_chosen = 25;
    public static final  int  handoverFromUTRANCommand_GERANIu_chosen = 26;
    public static final  int  mbmsModifiedServicesInformation_chosen = 27;
    public static final  int  etwsPrimaryNotificationWithSecurity_chosen = 28;
    public static final  int  handoverFromUTRANCommand_EUTRA_chosen = 29;
    public static final  int  ueInformationRequest_chosen = 30;
    public static final  int  loggingMeasurementConfiguration_chosen = 31;
    public static final  int  spare1_chosen = 32;
    
    // Methods for field "activeSetUpdate"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithActiveSetUpdate(rrc.pdu_definitions.ActiveSetUpdate activeSetUpdate)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setActiveSetUpdate(activeSetUpdate);
	return __object;
    }
    
    public boolean hasActiveSetUpdate()
    {
	return getChosenFlag() == activeSetUpdate_chosen;
    }
    
    public void setActiveSetUpdate(rrc.pdu_definitions.ActiveSetUpdate activeSetUpdate)
    {
	setChosenValue(activeSetUpdate);
	setChosenFlag(activeSetUpdate_chosen);
    }
    
    
    // Methods for field "assistanceDataDelivery"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithAssistanceDataDelivery(rrc.pdu_definitions.AssistanceDataDelivery assistanceDataDelivery)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setAssistanceDataDelivery(assistanceDataDelivery);
	return __object;
    }
    
    public boolean hasAssistanceDataDelivery()
    {
	return getChosenFlag() == assistanceDataDelivery_chosen;
    }
    
    public void setAssistanceDataDelivery(rrc.pdu_definitions.AssistanceDataDelivery assistanceDataDelivery)
    {
	setChosenValue(assistanceDataDelivery);
	setChosenFlag(assistanceDataDelivery_chosen);
    }
    
    
    // Methods for field "cellChangeOrderFromUTRAN"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithCellChangeOrderFromUTRAN(rrc.pdu_definitions.CellChangeOrderFromUTRAN cellChangeOrderFromUTRAN)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setCellChangeOrderFromUTRAN(cellChangeOrderFromUTRAN);
	return __object;
    }
    
    public boolean hasCellChangeOrderFromUTRAN()
    {
	return getChosenFlag() == cellChangeOrderFromUTRAN_chosen;
    }
    
    public void setCellChangeOrderFromUTRAN(rrc.pdu_definitions.CellChangeOrderFromUTRAN cellChangeOrderFromUTRAN)
    {
	setChosenValue(cellChangeOrderFromUTRAN);
	setChosenFlag(cellChangeOrderFromUTRAN_chosen);
    }
    
    
    // Methods for field "cellUpdateConfirm"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithCellUpdateConfirm(rrc.pdu_definitions.CellUpdateConfirm cellUpdateConfirm)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setCellUpdateConfirm(cellUpdateConfirm);
	return __object;
    }
    
    public boolean hasCellUpdateConfirm()
    {
	return getChosenFlag() == cellUpdateConfirm_chosen;
    }
    
    public void setCellUpdateConfirm(rrc.pdu_definitions.CellUpdateConfirm cellUpdateConfirm)
    {
	setChosenValue(cellUpdateConfirm);
	setChosenFlag(cellUpdateConfirm_chosen);
    }
    
    
    // Methods for field "counterCheck"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithCounterCheck(rrc.pdu_definitions.CounterCheck counterCheck)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setCounterCheck(counterCheck);
	return __object;
    }
    
    public boolean hasCounterCheck()
    {
	return getChosenFlag() == counterCheck_chosen;
    }
    
    public void setCounterCheck(rrc.pdu_definitions.CounterCheck counterCheck)
    {
	setChosenValue(counterCheck);
	setChosenFlag(counterCheck_chosen);
    }
    
    
    // Methods for field "downlinkDirectTransfer"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithDownlinkDirectTransfer(rrc.pdu_definitions.DownlinkDirectTransfer downlinkDirectTransfer)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setDownlinkDirectTransfer(downlinkDirectTransfer);
	return __object;
    }
    
    public boolean hasDownlinkDirectTransfer()
    {
	return getChosenFlag() == downlinkDirectTransfer_chosen;
    }
    
    public void setDownlinkDirectTransfer(rrc.pdu_definitions.DownlinkDirectTransfer downlinkDirectTransfer)
    {
	setChosenValue(downlinkDirectTransfer);
	setChosenFlag(downlinkDirectTransfer_chosen);
    }
    
    
    // Methods for field "handoverFromUTRANCommand_GSM"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithHandoverFromUTRANCommand_GSM(rrc.pdu_definitions.HandoverFromUTRANCommand_GSM handoverFromUTRANCommand_GSM)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setHandoverFromUTRANCommand_GSM(handoverFromUTRANCommand_GSM);
	return __object;
    }
    
    public boolean hasHandoverFromUTRANCommand_GSM()
    {
	return getChosenFlag() == handoverFromUTRANCommand_GSM_chosen;
    }
    
    public void setHandoverFromUTRANCommand_GSM(rrc.pdu_definitions.HandoverFromUTRANCommand_GSM handoverFromUTRANCommand_GSM)
    {
	setChosenValue(handoverFromUTRANCommand_GSM);
	setChosenFlag(handoverFromUTRANCommand_GSM_chosen);
    }
    
    
    // Methods for field "handoverFromUTRANCommand_CDMA2000"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithHandoverFromUTRANCommand_CDMA2000(rrc.pdu_definitions.HandoverFromUTRANCommand_CDMA2000 handoverFromUTRANCommand_CDMA2000)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setHandoverFromUTRANCommand_CDMA2000(handoverFromUTRANCommand_CDMA2000);
	return __object;
    }
    
    public boolean hasHandoverFromUTRANCommand_CDMA2000()
    {
	return getChosenFlag() == handoverFromUTRANCommand_CDMA2000_chosen;
    }
    
    public void setHandoverFromUTRANCommand_CDMA2000(rrc.pdu_definitions.HandoverFromUTRANCommand_CDMA2000 handoverFromUTRANCommand_CDMA2000)
    {
	setChosenValue(handoverFromUTRANCommand_CDMA2000);
	setChosenFlag(handoverFromUTRANCommand_CDMA2000_chosen);
    }
    
    
    // Methods for field "measurementControl"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithMeasurementControl(rrc.pdu_definitions.MeasurementControl measurementControl)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setMeasurementControl(measurementControl);
	return __object;
    }
    
    public boolean hasMeasurementControl()
    {
	return getChosenFlag() == measurementControl_chosen;
    }
    
    public void setMeasurementControl(rrc.pdu_definitions.MeasurementControl measurementControl)
    {
	setChosenValue(measurementControl);
	setChosenFlag(measurementControl_chosen);
    }
    
    
    // Methods for field "pagingType2"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithPagingType2(rrc.pdu_definitions.PagingType2 pagingType2)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setPagingType2(pagingType2);
	return __object;
    }
    
    public boolean hasPagingType2()
    {
	return getChosenFlag() == pagingType2_chosen;
    }
    
    public void setPagingType2(rrc.pdu_definitions.PagingType2 pagingType2)
    {
	setChosenValue(pagingType2);
	setChosenFlag(pagingType2_chosen);
    }
    
    
    // Methods for field "physicalChannelReconfiguration"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithPhysicalChannelReconfiguration(rrc.pdu_definitions.PhysicalChannelReconfiguration physicalChannelReconfiguration)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setPhysicalChannelReconfiguration(physicalChannelReconfiguration);
	return __object;
    }
    
    public boolean hasPhysicalChannelReconfiguration()
    {
	return getChosenFlag() == physicalChannelReconfiguration_chosen;
    }
    
    public void setPhysicalChannelReconfiguration(rrc.pdu_definitions.PhysicalChannelReconfiguration physicalChannelReconfiguration)
    {
	setChosenValue(physicalChannelReconfiguration);
	setChosenFlag(physicalChannelReconfiguration_chosen);
    }
    
    
    // Methods for field "physicalSharedChannelAllocation"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithPhysicalSharedChannelAllocation(rrc.pdu_definitions.PhysicalSharedChannelAllocation physicalSharedChannelAllocation)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setPhysicalSharedChannelAllocation(physicalSharedChannelAllocation);
	return __object;
    }
    
    public boolean hasPhysicalSharedChannelAllocation()
    {
	return getChosenFlag() == physicalSharedChannelAllocation_chosen;
    }
    
    public void setPhysicalSharedChannelAllocation(rrc.pdu_definitions.PhysicalSharedChannelAllocation physicalSharedChannelAllocation)
    {
	setChosenValue(physicalSharedChannelAllocation);
	setChosenFlag(physicalSharedChannelAllocation_chosen);
    }
    
    
    // Methods for field "radioBearerReconfiguration"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithRadioBearerReconfiguration(rrc.pdu_definitions.RadioBearerReconfiguration radioBearerReconfiguration)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setRadioBearerReconfiguration(radioBearerReconfiguration);
	return __object;
    }
    
    public boolean hasRadioBearerReconfiguration()
    {
	return getChosenFlag() == radioBearerReconfiguration_chosen;
    }
    
    public void setRadioBearerReconfiguration(rrc.pdu_definitions.RadioBearerReconfiguration radioBearerReconfiguration)
    {
	setChosenValue(radioBearerReconfiguration);
	setChosenFlag(radioBearerReconfiguration_chosen);
    }
    
    
    // Methods for field "radioBearerRelease"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithRadioBearerRelease(rrc.pdu_definitions.RadioBearerRelease radioBearerRelease)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setRadioBearerRelease(radioBearerRelease);
	return __object;
    }
    
    public boolean hasRadioBearerRelease()
    {
	return getChosenFlag() == radioBearerRelease_chosen;
    }
    
    public void setRadioBearerRelease(rrc.pdu_definitions.RadioBearerRelease radioBearerRelease)
    {
	setChosenValue(radioBearerRelease);
	setChosenFlag(radioBearerRelease_chosen);
    }
    
    
    // Methods for field "radioBearerSetup"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithRadioBearerSetup(rrc.pdu_definitions.RadioBearerSetup radioBearerSetup)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setRadioBearerSetup(radioBearerSetup);
	return __object;
    }
    
    public boolean hasRadioBearerSetup()
    {
	return getChosenFlag() == radioBearerSetup_chosen;
    }
    
    public void setRadioBearerSetup(rrc.pdu_definitions.RadioBearerSetup radioBearerSetup)
    {
	setChosenValue(radioBearerSetup);
	setChosenFlag(radioBearerSetup_chosen);
    }
    
    
    // Methods for field "rrcConnectionRelease"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithRrcConnectionRelease(rrc.pdu_definitions.RRCConnectionRelease rrcConnectionRelease)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setRrcConnectionRelease(rrcConnectionRelease);
	return __object;
    }
    
    public boolean hasRrcConnectionRelease()
    {
	return getChosenFlag() == rrcConnectionRelease_chosen;
    }
    
    public void setRrcConnectionRelease(rrc.pdu_definitions.RRCConnectionRelease rrcConnectionRelease)
    {
	setChosenValue(rrcConnectionRelease);
	setChosenFlag(rrcConnectionRelease_chosen);
    }
    
    
    // Methods for field "securityModeCommand"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithSecurityModeCommand(rrc.pdu_definitions.SecurityModeCommand securityModeCommand)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setSecurityModeCommand(securityModeCommand);
	return __object;
    }
    
    public boolean hasSecurityModeCommand()
    {
	return getChosenFlag() == securityModeCommand_chosen;
    }
    
    public void setSecurityModeCommand(rrc.pdu_definitions.SecurityModeCommand securityModeCommand)
    {
	setChosenValue(securityModeCommand);
	setChosenFlag(securityModeCommand_chosen);
    }
    
    
    // Methods for field "signallingConnectionRelease"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithSignallingConnectionRelease(rrc.pdu_definitions.SignallingConnectionRelease signallingConnectionRelease)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setSignallingConnectionRelease(signallingConnectionRelease);
	return __object;
    }
    
    public boolean hasSignallingConnectionRelease()
    {
	return getChosenFlag() == signallingConnectionRelease_chosen;
    }
    
    public void setSignallingConnectionRelease(rrc.pdu_definitions.SignallingConnectionRelease signallingConnectionRelease)
    {
	setChosenValue(signallingConnectionRelease);
	setChosenFlag(signallingConnectionRelease_chosen);
    }
    
    
    // Methods for field "transportChannelReconfiguration"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithTransportChannelReconfiguration(rrc.pdu_definitions.TransportChannelReconfiguration transportChannelReconfiguration)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setTransportChannelReconfiguration(transportChannelReconfiguration);
	return __object;
    }
    
    public boolean hasTransportChannelReconfiguration()
    {
	return getChosenFlag() == transportChannelReconfiguration_chosen;
    }
    
    public void setTransportChannelReconfiguration(rrc.pdu_definitions.TransportChannelReconfiguration transportChannelReconfiguration)
    {
	setChosenValue(transportChannelReconfiguration);
	setChosenFlag(transportChannelReconfiguration_chosen);
    }
    
    
    // Methods for field "transportFormatCombinationControl"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithTransportFormatCombinationControl(rrc.pdu_definitions.TransportFormatCombinationControl transportFormatCombinationControl)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setTransportFormatCombinationControl(transportFormatCombinationControl);
	return __object;
    }
    
    public boolean hasTransportFormatCombinationControl()
    {
	return getChosenFlag() == transportFormatCombinationControl_chosen;
    }
    
    public void setTransportFormatCombinationControl(rrc.pdu_definitions.TransportFormatCombinationControl transportFormatCombinationControl)
    {
	setChosenValue(transportFormatCombinationControl);
	setChosenFlag(transportFormatCombinationControl_chosen);
    }
    
    
    // Methods for field "ueCapabilityEnquiry"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUeCapabilityEnquiry(rrc.pdu_definitions.UECapabilityEnquiry ueCapabilityEnquiry)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUeCapabilityEnquiry(ueCapabilityEnquiry);
	return __object;
    }
    
    public boolean hasUeCapabilityEnquiry()
    {
	return getChosenFlag() == ueCapabilityEnquiry_chosen;
    }
    
    public void setUeCapabilityEnquiry(rrc.pdu_definitions.UECapabilityEnquiry ueCapabilityEnquiry)
    {
	setChosenValue(ueCapabilityEnquiry);
	setChosenFlag(ueCapabilityEnquiry_chosen);
    }
    
    
    // Methods for field "ueCapabilityInformationConfirm"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUeCapabilityInformationConfirm(rrc.pdu_definitions.UECapabilityInformationConfirm ueCapabilityInformationConfirm)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUeCapabilityInformationConfirm(ueCapabilityInformationConfirm);
	return __object;
    }
    
    public boolean hasUeCapabilityInformationConfirm()
    {
	return getChosenFlag() == ueCapabilityInformationConfirm_chosen;
    }
    
    public void setUeCapabilityInformationConfirm(rrc.pdu_definitions.UECapabilityInformationConfirm ueCapabilityInformationConfirm)
    {
	setChosenValue(ueCapabilityInformationConfirm);
	setChosenFlag(ueCapabilityInformationConfirm_chosen);
    }
    
    
    // Methods for field "uplinkPhysicalChannelControl"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUplinkPhysicalChannelControl(rrc.pdu_definitions.UplinkPhysicalChannelControl uplinkPhysicalChannelControl)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUplinkPhysicalChannelControl(uplinkPhysicalChannelControl);
	return __object;
    }
    
    public boolean hasUplinkPhysicalChannelControl()
    {
	return getChosenFlag() == uplinkPhysicalChannelControl_chosen;
    }
    
    public void setUplinkPhysicalChannelControl(rrc.pdu_definitions.UplinkPhysicalChannelControl uplinkPhysicalChannelControl)
    {
	setChosenValue(uplinkPhysicalChannelControl);
	setChosenFlag(uplinkPhysicalChannelControl_chosen);
    }
    
    
    // Methods for field "uraUpdateConfirm"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUraUpdateConfirm(rrc.pdu_definitions.URAUpdateConfirm uraUpdateConfirm)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUraUpdateConfirm(uraUpdateConfirm);
	return __object;
    }
    
    public boolean hasUraUpdateConfirm()
    {
	return getChosenFlag() == uraUpdateConfirm_chosen;
    }
    
    public void setUraUpdateConfirm(rrc.pdu_definitions.URAUpdateConfirm uraUpdateConfirm)
    {
	setChosenValue(uraUpdateConfirm);
	setChosenFlag(uraUpdateConfirm_chosen);
    }
    
    
    // Methods for field "utranMobilityInformation"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUtranMobilityInformation(rrc.pdu_definitions.UTRANMobilityInformation utranMobilityInformation)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUtranMobilityInformation(utranMobilityInformation);
	return __object;
    }
    
    public boolean hasUtranMobilityInformation()
    {
	return getChosenFlag() == utranMobilityInformation_chosen;
    }
    
    public void setUtranMobilityInformation(rrc.pdu_definitions.UTRANMobilityInformation utranMobilityInformation)
    {
	setChosenValue(utranMobilityInformation);
	setChosenFlag(utranMobilityInformation_chosen);
    }
    
    
    // Methods for field "handoverFromUTRANCommand_GERANIu"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithHandoverFromUTRANCommand_GERANIu(rrc.pdu_definitions.HandoverFromUTRANCommand_GERANIu handoverFromUTRANCommand_GERANIu)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setHandoverFromUTRANCommand_GERANIu(handoverFromUTRANCommand_GERANIu);
	return __object;
    }
    
    public boolean hasHandoverFromUTRANCommand_GERANIu()
    {
	return getChosenFlag() == handoverFromUTRANCommand_GERANIu_chosen;
    }
    
    public void setHandoverFromUTRANCommand_GERANIu(rrc.pdu_definitions.HandoverFromUTRANCommand_GERANIu handoverFromUTRANCommand_GERANIu)
    {
	setChosenValue(handoverFromUTRANCommand_GERANIu);
	setChosenFlag(handoverFromUTRANCommand_GERANIu_chosen);
    }
    
    
    // Methods for field "mbmsModifiedServicesInformation"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithMbmsModifiedServicesInformation(rrc.pdu_definitions.MBMSModifiedServicesInformation mbmsModifiedServicesInformation)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setMbmsModifiedServicesInformation(mbmsModifiedServicesInformation);
	return __object;
    }
    
    public boolean hasMbmsModifiedServicesInformation()
    {
	return getChosenFlag() == mbmsModifiedServicesInformation_chosen;
    }
    
    public void setMbmsModifiedServicesInformation(rrc.pdu_definitions.MBMSModifiedServicesInformation mbmsModifiedServicesInformation)
    {
	setChosenValue(mbmsModifiedServicesInformation);
	setChosenFlag(mbmsModifiedServicesInformation_chosen);
    }
    
    
    // Methods for field "etwsPrimaryNotificationWithSecurity"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithEtwsPrimaryNotificationWithSecurity(rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity etwsPrimaryNotificationWithSecurity)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setEtwsPrimaryNotificationWithSecurity(etwsPrimaryNotificationWithSecurity);
	return __object;
    }
    
    public boolean hasEtwsPrimaryNotificationWithSecurity()
    {
	return getChosenFlag() == etwsPrimaryNotificationWithSecurity_chosen;
    }
    
    public void setEtwsPrimaryNotificationWithSecurity(rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity etwsPrimaryNotificationWithSecurity)
    {
	setChosenValue(etwsPrimaryNotificationWithSecurity);
	setChosenFlag(etwsPrimaryNotificationWithSecurity_chosen);
    }
    
    
    // Methods for field "handoverFromUTRANCommand_EUTRA"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithHandoverFromUTRANCommand_EUTRA(rrc.pdu_definitions.HandoverFromUTRANCommand_EUTRA handoverFromUTRANCommand_EUTRA)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setHandoverFromUTRANCommand_EUTRA(handoverFromUTRANCommand_EUTRA);
	return __object;
    }
    
    public boolean hasHandoverFromUTRANCommand_EUTRA()
    {
	return getChosenFlag() == handoverFromUTRANCommand_EUTRA_chosen;
    }
    
    public void setHandoverFromUTRANCommand_EUTRA(rrc.pdu_definitions.HandoverFromUTRANCommand_EUTRA handoverFromUTRANCommand_EUTRA)
    {
	setChosenValue(handoverFromUTRANCommand_EUTRA);
	setChosenFlag(handoverFromUTRANCommand_EUTRA_chosen);
    }
    
    
    // Methods for field "ueInformationRequest"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithUeInformationRequest(rrc.pdu_definitions.UEInformationRequest ueInformationRequest)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setUeInformationRequest(ueInformationRequest);
	return __object;
    }
    
    public boolean hasUeInformationRequest()
    {
	return getChosenFlag() == ueInformationRequest_chosen;
    }
    
    public void setUeInformationRequest(rrc.pdu_definitions.UEInformationRequest ueInformationRequest)
    {
	setChosenValue(ueInformationRequest);
	setChosenFlag(ueInformationRequest_chosen);
    }
    
    
    // Methods for field "loggingMeasurementConfiguration"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithLoggingMeasurementConfiguration(rrc.pdu_definitions.LoggingMeasurementConfiguration loggingMeasurementConfiguration)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setLoggingMeasurementConfiguration(loggingMeasurementConfiguration);
	return __object;
    }
    
    public boolean hasLoggingMeasurementConfiguration()
    {
	return getChosenFlag() == loggingMeasurementConfiguration_chosen;
    }
    
    public void setLoggingMeasurementConfiguration(rrc.pdu_definitions.LoggingMeasurementConfiguration loggingMeasurementConfiguration)
    {
	setChosenValue(loggingMeasurementConfiguration);
	setChosenFlag(loggingMeasurementConfiguration_chosen);
    }
    
    
    // Methods for field "spare1"
    public static DL_DCCH_MessageType createDL_DCCH_MessageTypeWithSpare1(Null spare1)
    {
	DL_DCCH_MessageType __object = new DL_DCCH_MessageType();

	__object.setSpare1(spare1);
	return __object;
    }
    
    public boolean hasSpare1()
    {
	return getChosenFlag() == spare1_chosen;
    }
    
    public void setSpare1(Null spare1)
    {
	setChosenValue(spare1);
	setChosenFlag(spare1_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case activeSetUpdate_chosen:
		return new rrc.pdu_definitions.ActiveSetUpdate();
	    case assistanceDataDelivery_chosen:
		return new rrc.pdu_definitions.AssistanceDataDelivery();
	    case cellChangeOrderFromUTRAN_chosen:
		return new rrc.pdu_definitions.CellChangeOrderFromUTRAN();
	    case cellUpdateConfirm_chosen:
		return new rrc.pdu_definitions.CellUpdateConfirm();
	    case counterCheck_chosen:
		return new rrc.pdu_definitions.CounterCheck();
	    case downlinkDirectTransfer_chosen:
		return new rrc.pdu_definitions.DownlinkDirectTransfer();
	    case handoverFromUTRANCommand_GSM_chosen:
		return new rrc.pdu_definitions.HandoverFromUTRANCommand_GSM();
	    case handoverFromUTRANCommand_CDMA2000_chosen:
		return new rrc.pdu_definitions.HandoverFromUTRANCommand_CDMA2000();
	    case measurementControl_chosen:
		return new rrc.pdu_definitions.MeasurementControl();
	    case pagingType2_chosen:
		return new rrc.pdu_definitions.PagingType2();
	    case physicalChannelReconfiguration_chosen:
		return new rrc.pdu_definitions.PhysicalChannelReconfiguration();
	    case physicalSharedChannelAllocation_chosen:
		return new rrc.pdu_definitions.PhysicalSharedChannelAllocation();
	    case radioBearerReconfiguration_chosen:
		return new rrc.pdu_definitions.RadioBearerReconfiguration();
	    case radioBearerRelease_chosen:
		return new rrc.pdu_definitions.RadioBearerRelease();
	    case radioBearerSetup_chosen:
		return new rrc.pdu_definitions.RadioBearerSetup();
	    case rrcConnectionRelease_chosen:
		return new rrc.pdu_definitions.RRCConnectionRelease();
	    case securityModeCommand_chosen:
		return new rrc.pdu_definitions.SecurityModeCommand();
	    case signallingConnectionRelease_chosen:
		return new rrc.pdu_definitions.SignallingConnectionRelease();
	    case transportChannelReconfiguration_chosen:
		return new rrc.pdu_definitions.TransportChannelReconfiguration();
	    case transportFormatCombinationControl_chosen:
		return new rrc.pdu_definitions.TransportFormatCombinationControl();
	    case ueCapabilityEnquiry_chosen:
		return new rrc.pdu_definitions.UECapabilityEnquiry();
	    case ueCapabilityInformationConfirm_chosen:
		return new rrc.pdu_definitions.UECapabilityInformationConfirm();
	    case uplinkPhysicalChannelControl_chosen:
		return new rrc.pdu_definitions.UplinkPhysicalChannelControl();
	    case uraUpdateConfirm_chosen:
		return new rrc.pdu_definitions.URAUpdateConfirm();
	    case utranMobilityInformation_chosen:
		return new rrc.pdu_definitions.UTRANMobilityInformation();
	    case handoverFromUTRANCommand_GERANIu_chosen:
		return new rrc.pdu_definitions.HandoverFromUTRANCommand_GERANIu();
	    case mbmsModifiedServicesInformation_chosen:
		return new rrc.pdu_definitions.MBMSModifiedServicesInformation();
	    case etwsPrimaryNotificationWithSecurity_chosen:
		return new rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity();
	    case handoverFromUTRANCommand_EUTRA_chosen:
		return new rrc.pdu_definitions.HandoverFromUTRANCommand_EUTRA();
	    case ueInformationRequest_chosen:
		return new rrc.pdu_definitions.UEInformationRequest();
	    case loggingMeasurementConfiguration_chosen:
		return new rrc.pdu_definitions.LoggingMeasurementConfiguration();
	    case spare1_chosen:
		return new Null();
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
	    "DL_DCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "DL-DCCH-MessageType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"ActiveSetUpdate"
			    ),
			    new QName (
				"PDU-definitions",
				"ActiveSetUpdate"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ActiveSetUpdate"
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
		    "activeSetUpdate",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"AssistanceDataDelivery"
			    ),
			    new QName (
				"PDU-definitions",
				"AssistanceDataDelivery"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "AssistanceDataDelivery"
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
		    "assistanceDataDelivery",
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
				"CellChangeOrderFromUTRAN"
			    ),
			    new QName (
				"PDU-definitions",
				"CellChangeOrderFromUTRAN"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellChangeOrderFromUTRAN"
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
		    "cellChangeOrderFromUTRAN",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm"
			    ),
			    new QName (
				"PDU-definitions",
				"CellUpdateConfirm"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm"
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
		    "cellUpdateConfirm",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CounterCheck"
			    ),
			    new QName (
				"PDU-definitions",
				"CounterCheck"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CounterCheck"
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
		    "counterCheck",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"DownlinkDirectTransfer"
			    ),
			    new QName (
				"PDU-definitions",
				"DownlinkDirectTransfer"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "DownlinkDirectTransfer"
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
		    "downlinkDirectTransfer",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_GSM"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverFromUTRANCommand-GSM"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GSM"
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
		    "handoverFromUTRANCommand-GSM",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"HandoverFromUTRANCommand_CDMA2000"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverFromUTRANCommand-CDMA2000"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_CDMA2000"
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
		    "handoverFromUTRANCommand-CDMA2000",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MeasurementControl"
			    ),
			    new QName (
				"PDU-definitions",
				"MeasurementControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MeasurementControl"
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
		    "measurementControl",
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
				"PagingType2"
			    ),
			    new QName (
				"PDU-definitions",
				"PagingType2"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PagingType2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PagingType2"
				)
			    ),
			    0
			)
		    ),
		    "pagingType2",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalChannelReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"PhysicalChannelReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalChannelReconfiguration"
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
		    "physicalChannelReconfiguration",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"PhysicalSharedChannelAllocation"
			    ),
			    new QName (
				"PDU-definitions",
				"PhysicalSharedChannelAllocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PhysicalSharedChannelAllocation"
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
		    "physicalSharedChannelAllocation",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfiguration"
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
		    "radioBearerReconfiguration",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerRelease"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerRelease"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerRelease"
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
		    "radioBearerRelease",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerSetup"
			    ),
			    new QName (
				"PDU-definitions",
				"RadioBearerSetup"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerSetup"
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
		    "radioBearerSetup",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionRelease"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionRelease"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRelease"
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
		    "rrcConnectionRelease",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"SecurityModeCommand"
			    ),
			    new QName (
				"PDU-definitions",
				"SecurityModeCommand"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SecurityModeCommand"
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
		    "securityModeCommand",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"SignallingConnectionRelease"
			    ),
			    new QName (
				"PDU-definitions",
				"SignallingConnectionRelease"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SignallingConnectionRelease"
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
		    "signallingConnectionRelease",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"TransportChannelReconfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportChannelReconfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportChannelReconfiguration"
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
		    "transportChannelReconfiguration",
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
				"TransportFormatCombinationControl"
			    ),
			    new QName (
				"PDU-definitions",
				"TransportFormatCombinationControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportFormatCombinationControl"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "TransportFormatCombinationControl"
				)
			    ),
			    0
			)
		    ),
		    "transportFormatCombinationControl",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityEnquiry"
			    ),
			    new QName (
				"PDU-definitions",
				"UECapabilityEnquiry"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityEnquiry"
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
		    "ueCapabilityEnquiry",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UECapabilityInformationConfirm"
			    ),
			    new QName (
				"PDU-definitions",
				"UECapabilityInformationConfirm"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UECapabilityInformationConfirm"
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
		    "ueCapabilityInformationConfirm",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UplinkPhysicalChannelControl"
			    ),
			    new QName (
				"PDU-definitions",
				"UplinkPhysicalChannelControl"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkPhysicalChannelControl"
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
		    "uplinkPhysicalChannelControl",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"URAUpdateConfirm"
			    ),
			    new QName (
				"PDU-definitions",
				"URAUpdateConfirm"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdateConfirm"
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
		    "uraUpdateConfirm",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"UTRANMobilityInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"UTRANMobilityInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UTRANMobilityInformation"
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
		    "utranMobilityInformation",
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
				"HandoverFromUTRANCommand_GERANIu"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverFromUTRANCommand-GERANIu"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GERANIu"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_GERANIu"
				)
			    ),
			    0
			)
		    ),
		    "handoverFromUTRANCommand-GERANIu",
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
				"MBMSModifiedServicesInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSModifiedServicesInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModifiedServicesInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModifiedServicesInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsModifiedServicesInformation",
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
				"ETWSPrimaryNotificationWithSecurity"
			    ),
			    new QName (
				"PDU-definitions",
				"ETWSPrimaryNotificationWithSecurity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ETWSPrimaryNotificationWithSecurity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ETWSPrimaryNotificationWithSecurity"
				)
			    ),
			    0
			)
		    ),
		    "etwsPrimaryNotificationWithSecurity",
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
				"HandoverFromUTRANCommand_EUTRA"
			    ),
			    new QName (
				"PDU-definitions",
				"HandoverFromUTRANCommand-EUTRA"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_EUTRA"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverFromUTRANCommand_EUTRA"
				)
			    ),
			    0
			)
		    ),
		    "handoverFromUTRANCommand-EUTRA",
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
				"UEInformationRequest"
			    ),
			    new QName (
				"PDU-definitions",
				"UEInformationRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UEInformationRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UEInformationRequest"
				)
			    ),
			    0
			)
		    ),
		    "ueInformationRequest",
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
				"LoggingMeasurementConfiguration"
			    ),
			    new QName (
				"PDU-definitions",
				"LoggingMeasurementConfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "LoggingMeasurementConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "LoggingMeasurementConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "loggingMeasurementConfiguration",
		    30,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare1",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_DCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_DCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_DCCH_MessageType
