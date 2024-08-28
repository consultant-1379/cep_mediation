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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SRNC_RelocationInfo_r4_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_r4_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_r4_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_r4_IEs(rrc.informationelements.RB_Identity rb_IdentityForHOMessage, 
		    StateOfRRC stateOfRRC, 
		    StateOfRRC_Procedure stateOfRRC_Procedure, 
		    CipheringStatusList_r4 cipheringStatusList, 
		    rrc.informationelements.CN_DomainIdentity latestConfiguredCN_Domain, 
		    CalculationTimeForCiphering calculationTimeForCiphering, 
		    COUNT_C_List count_C_List, 
		    CipheringInfoPerRB_List_r4 cipheringInfoPerRB_List, 
		    IntegrityProtectionStatus integrityProtectionStatus, 
		    SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo, 
		    ImplementationSpecificParams implementationSpecificParams, 
		    rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.C_RNTI c_RNTI, 
		    UE_RadioAccessCapability_r4 ue_RadioAccessCapability, 
		    rrc.informationelements.UE_RadioAccessCapabBandFDDList ue_RadioAccessCapability_ext, 
		    UE_Positioning_LastKnownPos ue_Positioning_LastKnownPos, 
		    rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle, 
		    rrc.informationelements.UESpecificBehaviourInformation1interRAT uESpecificBehaviourInformation1interRAT, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.CN_DomainInformationListFull cn_DomainInformationList, 
		    OngoingMeasRepList_r4 ongoingMeasRepList, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList srb_InformationList, 
		    rrc.informationelements.RAB_InformationSetupList_r4 rab_InformationList, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_TransChInfoList, 
		    Dummy dummy, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r4 dl_TransChInfoList, 
		    rrc.pdu_definitions.MeasurementReport measurementReport, 
		    rrc.informationelements.FailureCauseWithProtErr failureCause)
    {
	setRb_IdentityForHOMessage(rb_IdentityForHOMessage);
	setStateOfRRC(stateOfRRC);
	setStateOfRRC_Procedure(stateOfRRC_Procedure);
	setCipheringStatusList(cipheringStatusList);
	setLatestConfiguredCN_Domain(latestConfiguredCN_Domain);
	setCalculationTimeForCiphering(calculationTimeForCiphering);
	setCount_C_List(count_C_List);
	setCipheringInfoPerRB_List(cipheringInfoPerRB_List);
	setIntegrityProtectionStatus(integrityProtectionStatus);
	setSrb_SpecificIntegrityProtInfo(srb_SpecificIntegrityProtInfo);
	setImplementationSpecificParams(implementationSpecificParams);
	setU_RNTI(u_RNTI);
	setC_RNTI(c_RNTI);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setUe_RadioAccessCapability_ext(ue_RadioAccessCapability_ext);
	setUe_Positioning_LastKnownPos(ue_Positioning_LastKnownPos);
	setUESpecificBehaviourInformation1idle(uESpecificBehaviourInformation1idle);
	setUESpecificBehaviourInformation1interRAT(uESpecificBehaviourInformation1interRAT);
	setUe_RATSpecificCapability(ue_RATSpecificCapability);
	setUra_Identity(ura_Identity);
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setCn_DomainInformationList(cn_DomainInformationList);
	setOngoingMeasRepList(ongoingMeasRepList);
	setPredefinedConfigStatusList(predefinedConfigStatusList);
	setSrb_InformationList(srb_InformationList);
	setRab_InformationList(rab_InformationList);
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_TransChInfoList(ul_TransChInfoList);
	setDummy(dummy);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_TransChInfoList(dl_TransChInfoList);
	setMeasurementReport(measurementReport);
	setFailureCause(failureCause);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_r4_IEs(StateOfRRC stateOfRRC, 
		    StateOfRRC_Procedure stateOfRRC_Procedure, 
		    CipheringStatusList_r4 cipheringStatusList, 
		    rrc.informationelements.CN_DomainIdentity latestConfiguredCN_Domain, 
		    IntegrityProtectionStatus integrityProtectionStatus, 
		    SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo, 
		    rrc.informationelements.U_RNTI u_RNTI, 
		    UE_RadioAccessCapability_r4 ue_RadioAccessCapability, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList srb_InformationList)
    {
	setStateOfRRC(stateOfRRC);
	setStateOfRRC_Procedure(stateOfRRC_Procedure);
	setCipheringStatusList(cipheringStatusList);
	setLatestConfiguredCN_Domain(latestConfiguredCN_Domain);
	setIntegrityProtectionStatus(integrityProtectionStatus);
	setSrb_SpecificIntegrityProtInfo(srb_SpecificIntegrityProtInfo);
	setU_RNTI(u_RNTI);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setPredefinedConfigStatusList(predefinedConfigStatusList);
	setSrb_InformationList(srb_InformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RB_Identity();
	mComponents[1] = StateOfRRC.cell_DCH;
	mComponents[2] = StateOfRRC_Procedure.awaitNoRRC_Message;
	mComponents[3] = new CipheringStatusList_r4();
	mComponents[4] = rrc.informationelements.CN_DomainIdentity.cs_domain;
	mComponents[5] = new CalculationTimeForCiphering();
	mComponents[6] = new COUNT_C_List();
	mComponents[7] = new CipheringInfoPerRB_List_r4();
	mComponents[8] = IntegrityProtectionStatus.started;
	mComponents[9] = new SRB_SpecificIntegrityProtInfoList();
	mComponents[10] = new ImplementationSpecificParams();
	mComponents[11] = new rrc.informationelements.U_RNTI();
	mComponents[12] = new rrc.informationelements.C_RNTI();
	mComponents[13] = new UE_RadioAccessCapability_r4();
	mComponents[14] = new rrc.informationelements.UE_RadioAccessCapabBandFDDList();
	mComponents[15] = new UE_Positioning_LastKnownPos();
	mComponents[16] = new rrc.informationelements.UESpecificBehaviourInformation1idle();
	mComponents[17] = new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
	mComponents[18] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[19] = new rrc.informationelements.URA_Identity();
	mComponents[20] = new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	mComponents[21] = new rrc.informationelements.CN_DomainInformationListFull();
	mComponents[22] = new OngoingMeasRepList_r4();
	mComponents[23] = new rrc.informationelements.PredefinedConfigStatusList();
	mComponents[24] = new rrc.informationelements.SRB_InformationSetupList();
	mComponents[25] = new rrc.informationelements.RAB_InformationSetupList_r4();
	mComponents[26] = new rrc.informationelements.UL_CommonTransChInfo_r4();
	mComponents[27] = new rrc.informationelements.UL_AddReconfTransChInfoList();
	mComponents[28] = new Dummy();
	mComponents[29] = new rrc.informationelements.DL_CommonTransChInfo_r4();
	mComponents[30] = new rrc.informationelements.DL_AddReconfTransChInfoList_r4();
	mComponents[31] = new rrc.pdu_definitions.MeasurementReport();
	mComponents[32] = new rrc.informationelements.FailureCauseWithProtErr();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[33];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RB_Identity();
	    case 1:
		return StateOfRRC.cell_DCH;
	    case 2:
		return StateOfRRC_Procedure.awaitNoRRC_Message;
	    case 3:
		return new CipheringStatusList_r4();
	    case 4:
		return rrc.informationelements.CN_DomainIdentity.cs_domain;
	    case 5:
		return new CalculationTimeForCiphering();
	    case 6:
		return new COUNT_C_List();
	    case 7:
		return new CipheringInfoPerRB_List_r4();
	    case 8:
		return IntegrityProtectionStatus.started;
	    case 9:
		return new SRB_SpecificIntegrityProtInfoList();
	    case 10:
		return new ImplementationSpecificParams();
	    case 11:
		return new rrc.informationelements.U_RNTI();
	    case 12:
		return new rrc.informationelements.C_RNTI();
	    case 13:
		return new UE_RadioAccessCapability_r4();
	    case 14:
		return new rrc.informationelements.UE_RadioAccessCapabBandFDDList();
	    case 15:
		return new UE_Positioning_LastKnownPos();
	    case 16:
		return new rrc.informationelements.UESpecificBehaviourInformation1idle();
	    case 17:
		return new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
	    case 18:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 19:
		return new rrc.informationelements.URA_Identity();
	    case 20:
		return new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	    case 21:
		return new rrc.informationelements.CN_DomainInformationListFull();
	    case 22:
		return new OngoingMeasRepList_r4();
	    case 23:
		return new rrc.informationelements.PredefinedConfigStatusList();
	    case 24:
		return new rrc.informationelements.SRB_InformationSetupList();
	    case 25:
		return new rrc.informationelements.RAB_InformationSetupList_r4();
	    case 26:
		return new rrc.informationelements.UL_CommonTransChInfo_r4();
	    case 27:
		return new rrc.informationelements.UL_AddReconfTransChInfoList();
	    case 28:
		return new Dummy();
	    case 29:
		return new rrc.informationelements.DL_CommonTransChInfo_r4();
	    case 30:
		return new rrc.informationelements.DL_AddReconfTransChInfoList_r4();
	    case 31:
		return new rrc.pdu_definitions.MeasurementReport();
	    case 32:
		return new rrc.informationelements.FailureCauseWithProtErr();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rb_IdentityForHOMessage"
    public rrc.informationelements.RB_Identity getRb_IdentityForHOMessage()
    {
	return (rrc.informationelements.RB_Identity)mComponents[0];
    }
    
    public void setRb_IdentityForHOMessage(rrc.informationelements.RB_Identity rb_IdentityForHOMessage)
    {
	mComponents[0] = rb_IdentityForHOMessage;
    }
    
    public boolean hasRb_IdentityForHOMessage()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRb_IdentityForHOMessage()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "stateOfRRC"
    public StateOfRRC getStateOfRRC()
    {
	return (StateOfRRC)mComponents[1];
    }
    
    public void setStateOfRRC(StateOfRRC stateOfRRC)
    {
	mComponents[1] = stateOfRRC;
    }
    
    
    // Methods for field "stateOfRRC_Procedure"
    public StateOfRRC_Procedure getStateOfRRC_Procedure()
    {
	return (StateOfRRC_Procedure)mComponents[2];
    }
    
    public void setStateOfRRC_Procedure(StateOfRRC_Procedure stateOfRRC_Procedure)
    {
	mComponents[2] = stateOfRRC_Procedure;
    }
    
    
    // Methods for field "cipheringStatusList"
    public CipheringStatusList_r4 getCipheringStatusList()
    {
	return (CipheringStatusList_r4)mComponents[3];
    }
    
    public void setCipheringStatusList(CipheringStatusList_r4 cipheringStatusList)
    {
	mComponents[3] = cipheringStatusList;
    }
    
    
    // Methods for field "latestConfiguredCN_Domain"
    public rrc.informationelements.CN_DomainIdentity getLatestConfiguredCN_Domain()
    {
	return (rrc.informationelements.CN_DomainIdentity)mComponents[4];
    }
    
    public void setLatestConfiguredCN_Domain(rrc.informationelements.CN_DomainIdentity latestConfiguredCN_Domain)
    {
	mComponents[4] = latestConfiguredCN_Domain;
    }
    
    
    // Methods for field "calculationTimeForCiphering"
    public CalculationTimeForCiphering getCalculationTimeForCiphering()
    {
	return (CalculationTimeForCiphering)mComponents[5];
    }
    
    public void setCalculationTimeForCiphering(CalculationTimeForCiphering calculationTimeForCiphering)
    {
	mComponents[5] = calculationTimeForCiphering;
    }
    
    public boolean hasCalculationTimeForCiphering()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCalculationTimeForCiphering()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "count_C_List"
    public COUNT_C_List getCount_C_List()
    {
	return (COUNT_C_List)mComponents[6];
    }
    
    public void setCount_C_List(COUNT_C_List count_C_List)
    {
	mComponents[6] = count_C_List;
    }
    
    public boolean hasCount_C_List()
    {
	return componentIsPresent(6);
    }
    
    public void deleteCount_C_List()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "cipheringInfoPerRB_List"
    public CipheringInfoPerRB_List_r4 getCipheringInfoPerRB_List()
    {
	return (CipheringInfoPerRB_List_r4)mComponents[7];
    }
    
    public void setCipheringInfoPerRB_List(CipheringInfoPerRB_List_r4 cipheringInfoPerRB_List)
    {
	mComponents[7] = cipheringInfoPerRB_List;
    }
    
    public boolean hasCipheringInfoPerRB_List()
    {
	return componentIsPresent(7);
    }
    
    public void deleteCipheringInfoPerRB_List()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "integrityProtectionStatus"
    public IntegrityProtectionStatus getIntegrityProtectionStatus()
    {
	return (IntegrityProtectionStatus)mComponents[8];
    }
    
    public void setIntegrityProtectionStatus(IntegrityProtectionStatus integrityProtectionStatus)
    {
	mComponents[8] = integrityProtectionStatus;
    }
    
    
    // Methods for field "srb_SpecificIntegrityProtInfo"
    public SRB_SpecificIntegrityProtInfoList getSrb_SpecificIntegrityProtInfo()
    {
	return (SRB_SpecificIntegrityProtInfoList)mComponents[9];
    }
    
    public void setSrb_SpecificIntegrityProtInfo(SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo)
    {
	mComponents[9] = srb_SpecificIntegrityProtInfo;
    }
    
    
    // Methods for field "implementationSpecificParams"
    public ImplementationSpecificParams getImplementationSpecificParams()
    {
	return (ImplementationSpecificParams)mComponents[10];
    }
    
    public void setImplementationSpecificParams(ImplementationSpecificParams implementationSpecificParams)
    {
	mComponents[10] = implementationSpecificParams;
    }
    
    public boolean hasImplementationSpecificParams()
    {
	return componentIsPresent(10);
    }
    
    public void deleteImplementationSpecificParams()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "u_RNTI"
    public rrc.informationelements.U_RNTI getU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[11];
    }
    
    public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
    {
	mComponents[11] = u_RNTI;
    }
    
    
    // Methods for field "c_RNTI"
    public rrc.informationelements.C_RNTI getC_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[12];
    }
    
    public void setC_RNTI(rrc.informationelements.C_RNTI c_RNTI)
    {
	mComponents[12] = c_RNTI;
    }
    
    public boolean hasC_RNTI()
    {
	return componentIsPresent(12);
    }
    
    public void deleteC_RNTI()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "ue_RadioAccessCapability"
    public UE_RadioAccessCapability_r4 getUe_RadioAccessCapability()
    {
	return (UE_RadioAccessCapability_r4)mComponents[13];
    }
    
    public void setUe_RadioAccessCapability(UE_RadioAccessCapability_r4 ue_RadioAccessCapability)
    {
	mComponents[13] = ue_RadioAccessCapability;
    }
    
    
    // Methods for field "ue_RadioAccessCapability_ext"
    public rrc.informationelements.UE_RadioAccessCapabBandFDDList getUe_RadioAccessCapability_ext()
    {
	return (rrc.informationelements.UE_RadioAccessCapabBandFDDList)mComponents[14];
    }
    
    public void setUe_RadioAccessCapability_ext(rrc.informationelements.UE_RadioAccessCapabBandFDDList ue_RadioAccessCapability_ext)
    {
	mComponents[14] = ue_RadioAccessCapability_ext;
    }
    
    public boolean hasUe_RadioAccessCapability_ext()
    {
	return componentIsPresent(14);
    }
    
    public void deleteUe_RadioAccessCapability_ext()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "ue_Positioning_LastKnownPos"
    public UE_Positioning_LastKnownPos getUe_Positioning_LastKnownPos()
    {
	return (UE_Positioning_LastKnownPos)mComponents[15];
    }
    
    public void setUe_Positioning_LastKnownPos(UE_Positioning_LastKnownPos ue_Positioning_LastKnownPos)
    {
	mComponents[15] = ue_Positioning_LastKnownPos;
    }
    
    public boolean hasUe_Positioning_LastKnownPos()
    {
	return componentIsPresent(15);
    }
    
    public void deleteUe_Positioning_LastKnownPos()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "uESpecificBehaviourInformation1idle"
    public rrc.informationelements.UESpecificBehaviourInformation1idle getUESpecificBehaviourInformation1idle()
    {
	return (rrc.informationelements.UESpecificBehaviourInformation1idle)mComponents[16];
    }
    
    public void setUESpecificBehaviourInformation1idle(rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle)
    {
	mComponents[16] = uESpecificBehaviourInformation1idle;
    }
    
    public boolean hasUESpecificBehaviourInformation1idle()
    {
	return componentIsPresent(16);
    }
    
    public void deleteUESpecificBehaviourInformation1idle()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "uESpecificBehaviourInformation1interRAT"
    public rrc.informationelements.UESpecificBehaviourInformation1interRAT getUESpecificBehaviourInformation1interRAT()
    {
	return (rrc.informationelements.UESpecificBehaviourInformation1interRAT)mComponents[17];
    }
    
    public void setUESpecificBehaviourInformation1interRAT(rrc.informationelements.UESpecificBehaviourInformation1interRAT uESpecificBehaviourInformation1interRAT)
    {
	mComponents[17] = uESpecificBehaviourInformation1interRAT;
    }
    
    public boolean hasUESpecificBehaviourInformation1interRAT()
    {
	return componentIsPresent(17);
    }
    
    public void deleteUESpecificBehaviourInformation1interRAT()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "ue_RATSpecificCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getUe_RATSpecificCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[18];
    }
    
    public void setUe_RATSpecificCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability)
    {
	mComponents[18] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(18);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[19];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[19] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(19);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "cn_CommonGSM_MAP_NAS_SysInfo"
    public rrc.informationelements.NAS_SystemInformationGSM_MAP getCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return (rrc.informationelements.NAS_SystemInformationGSM_MAP)mComponents[20];
    }
    
    public void setCn_CommonGSM_MAP_NAS_SysInfo(rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo)
    {
	mComponents[20] = cn_CommonGSM_MAP_NAS_SysInfo;
    }
    
    
    // Methods for field "cn_DomainInformationList"
    public rrc.informationelements.CN_DomainInformationListFull getCn_DomainInformationList()
    {
	return (rrc.informationelements.CN_DomainInformationListFull)mComponents[21];
    }
    
    public void setCn_DomainInformationList(rrc.informationelements.CN_DomainInformationListFull cn_DomainInformationList)
    {
	mComponents[21] = cn_DomainInformationList;
    }
    
    public boolean hasCn_DomainInformationList()
    {
	return componentIsPresent(21);
    }
    
    public void deleteCn_DomainInformationList()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ongoingMeasRepList"
    public OngoingMeasRepList_r4 getOngoingMeasRepList()
    {
	return (OngoingMeasRepList_r4)mComponents[22];
    }
    
    public void setOngoingMeasRepList(OngoingMeasRepList_r4 ongoingMeasRepList)
    {
	mComponents[22] = ongoingMeasRepList;
    }
    
    public boolean hasOngoingMeasRepList()
    {
	return componentIsPresent(22);
    }
    
    public void deleteOngoingMeasRepList()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "predefinedConfigStatusList"
    public rrc.informationelements.PredefinedConfigStatusList getPredefinedConfigStatusList()
    {
	return (rrc.informationelements.PredefinedConfigStatusList)mComponents[23];
    }
    
    public void setPredefinedConfigStatusList(rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList)
    {
	mComponents[23] = predefinedConfigStatusList;
    }
    
    
    // Methods for field "srb_InformationList"
    public rrc.informationelements.SRB_InformationSetupList getSrb_InformationList()
    {
	return (rrc.informationelements.SRB_InformationSetupList)mComponents[24];
    }
    
    public void setSrb_InformationList(rrc.informationelements.SRB_InformationSetupList srb_InformationList)
    {
	mComponents[24] = srb_InformationList;
    }
    
    
    // Methods for field "rab_InformationList"
    public rrc.informationelements.RAB_InformationSetupList_r4 getRab_InformationList()
    {
	return (rrc.informationelements.RAB_InformationSetupList_r4)mComponents[25];
    }
    
    public void setRab_InformationList(rrc.informationelements.RAB_InformationSetupList_r4 rab_InformationList)
    {
	mComponents[25] = rab_InformationList;
    }
    
    public boolean hasRab_InformationList()
    {
	return componentIsPresent(25);
    }
    
    public void deleteRab_InformationList()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[26];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
    {
	mComponents[26] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(26);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "ul_TransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_TransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[27];
    }
    
    public void setUl_TransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_TransChInfoList)
    {
	mComponents[27] = ul_TransChInfoList;
    }
    
    public boolean hasUl_TransChInfoList()
    {
	return componentIsPresent(27);
    }
    
    public void deleteUl_TransChInfoList()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "dummy"
    public Dummy getDummy()
    {
	return (Dummy)mComponents[28];
    }
    
    public void setDummy(Dummy dummy)
    {
	mComponents[28] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(28);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(28);
    }
    
    
    
    /**
     * Define the ASN1 Type Dummy from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Dummy extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dummy()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static Dummy createDummyWithFdd(Fdd fdd)
	{
	    Dummy __object = new Dummy();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(rrc.informationelements.CPCH_SetID dummy1, 
			    rrc.informationelements.DRAC_StaticInformationList dummy2)
	    {
		setDummy1(dummy1);
		setDummy2(dummy2);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.CPCH_SetID();
		mComponents[1] = new rrc.informationelements.DRAC_StaticInformationList();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.CPCH_SetID();
		    case 1:
			return new rrc.informationelements.DRAC_StaticInformationList();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy1"
	    public rrc.informationelements.CPCH_SetID getDummy1()
	    {
		return (rrc.informationelements.CPCH_SetID)mComponents[0];
	    }
	    
	    public void setDummy1(rrc.informationelements.CPCH_SetID dummy1)
	    {
		mComponents[0] = dummy1;
	    }
	    
	    public boolean hasDummy1()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDummy1()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "dummy2"
	    public rrc.informationelements.DRAC_StaticInformationList getDummy2()
	    {
		return (rrc.informationelements.DRAC_StaticInformationList)mComponents[1];
	    }
	    
	    public void setDummy2(rrc.informationelements.DRAC_StaticInformationList dummy2)
	    {
		mComponents[1] = dummy2;
	    }
	    
	    public boolean hasDummy2()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDummy2()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.internode_definitions",
		    "SRNC_RelocationInfo_r4_IEs$Dummy$Fdd"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CPCH_SetID"
				    ),
				    new QName (
					"InformationElements",
					"CPCH-SetID"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.CPCH_SetID(1), 
					    new rrc.informationelements.CPCH_SetID(16),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(16)
				    ),
				    null
				)
			    ),
			    "dummy1",
			    0,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DRAC_StaticInformationList"
				    ),
				    new QName (
					"InformationElements",
					"DRAC-StaticInformationList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(32),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(32)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "DRAC_StaticInformation"
					)
				    )
				)
			    ),
			    "dummy2",
			    1,
			    3,
			    null
			)
		    }
		),
		0,
		new TagDecoders (
		    new TagDecoder[] {
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static Dummy createDummyWithTdd(Null tdd)
	{
	    Dummy __object = new Dummy();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Null tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
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
		new short[] {
		    (short)0x801c
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r4_IEs$Dummy"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"SRNC_RelocationInfo_r4_IEs$Dummy$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"tdd",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dummy

    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[29];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
    {
	mComponents[29] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(29);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(29);
    }
    
    
    // Methods for field "dl_TransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList_r4 getDl_TransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList_r4)mComponents[30];
    }
    
    public void setDl_TransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r4 dl_TransChInfoList)
    {
	mComponents[30] = dl_TransChInfoList;
    }
    
    public boolean hasDl_TransChInfoList()
    {
	return componentIsPresent(30);
    }
    
    public void deleteDl_TransChInfoList()
    {
	setComponentAbsent(30);
    }
    
    
    // Methods for field "measurementReport"
    public rrc.pdu_definitions.MeasurementReport getMeasurementReport()
    {
	return (rrc.pdu_definitions.MeasurementReport)mComponents[31];
    }
    
    public void setMeasurementReport(rrc.pdu_definitions.MeasurementReport measurementReport)
    {
	mComponents[31] = measurementReport;
    }
    
    public boolean hasMeasurementReport()
    {
	return componentIsPresent(31);
    }
    
    public void deleteMeasurementReport()
    {
	setComponentAbsent(31);
    }
    
    
    // Methods for field "failureCause"
    public rrc.informationelements.FailureCauseWithProtErr getFailureCause()
    {
	return (rrc.informationelements.FailureCauseWithProtErr)mComponents[32];
    }
    
    public void setFailureCause(rrc.informationelements.FailureCauseWithProtErr failureCause)
    {
	mComponents[32] = failureCause;
    }
    
    public boolean hasFailureCause()
    {
	return componentIsPresent(32);
    }
    
    public void deleteFailureCause()
    {
	setComponentAbsent(32);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.internode_definitions",
	    "SRNC_RelocationInfo_r4_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-r4-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RB_Identity(1), 
				    new rrc.informationelements.RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "rb-IdentityForHOMessage",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"StateOfRRC"
			    ),
			    new QName (
				"Internode-definitions",
				"StateOfRRC"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cell-DCH",
					0
				    ),
				    new MemberListElement (
					"cell-FACH",
					1
				    ),
				    new MemberListElement (
					"cell-PCH",
					2
				    ),
				    new MemberListElement (
					"ura-PCH",
					3
				    )
				}
			    ),
			    0,
			    StateOfRRC.cell_DCH
			)
		    ),
		    "stateOfRRC",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"StateOfRRC_Procedure"
			    ),
			    new QName (
				"Internode-definitions",
				"StateOfRRC-Procedure"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"awaitNoRRC-Message",
					0
				    ),
				    new MemberListElement (
					"awaitRB-ReleaseComplete",
					1
				    ),
				    new MemberListElement (
					"awaitRB-SetupComplete",
					2
				    ),
				    new MemberListElement (
					"awaitRB-ReconfigurationComplete",
					3
				    ),
				    new MemberListElement (
					"awaitTransportCH-ReconfigurationComplete",
					4
				    ),
				    new MemberListElement (
					"awaitPhysicalCH-ReconfigurationComplete",
					5
				    ),
				    new MemberListElement (
					"awaitActiveSetUpdateComplete",
					6
				    ),
				    new MemberListElement (
					"awaitHandoverComplete",
					7
				    ),
				    new MemberListElement (
					"sendCellUpdateConfirm",
					8
				    ),
				    new MemberListElement (
					"sendUraUpdateConfirm",
					9
				    ),
				    new MemberListElement (
					"dummy",
					10
				    ),
				    new MemberListElement (
					"otherStates",
					11
				    )
				}
			    ),
			    0,
			    StateOfRRC_Procedure.awaitNoRRC_Message
			)
		    ),
		    "stateOfRRC-Procedure",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"CipheringStatusList_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringStatusList-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "CipheringStatusCNdomain_r4"
				)
			    )
			)
		    ),
		    "cipheringStatusList",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainIdentity"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainIdentity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"cs-domain",
					0
				    ),
				    new MemberListElement (
					"ps-domain",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CN_DomainIdentity.cs_domain
			)
		    ),
		    "latestConfiguredCN-Domain",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"CalculationTimeForCiphering"
			    ),
			    new QName (
				"Internode-definitions",
				"CalculationTimeForCiphering"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "CalculationTimeForCiphering"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "CalculationTimeForCiphering"
				)
			    ),
			    0
			)
		    ),
		    "calculationTimeForCiphering",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"COUNT_C_List"
			    ),
			    new QName (
				"Internode-definitions",
				"COUNT-C-List"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "COUNT_CSingle"
				)
			    )
			)
		    ),
		    "count-C-List",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"CipheringInfoPerRB_List_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringInfoPerRB-List-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "CipheringInfoPerRB_r4"
				)
			    )
			)
		    ),
		    "cipheringInfoPerRB-List",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"IntegrityProtectionStatus"
			    ),
			    new QName (
				"Internode-definitions",
				"IntegrityProtectionStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"started",
					0
				    ),
				    new MemberListElement (
					"notStarted",
					1
				    )
				}
			    ),
			    0,
			    IntegrityProtectionStatus.started
			)
		    ),
		    "integrityProtectionStatus",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"SRB_SpecificIntegrityProtInfoList"
			    ),
			    new QName (
				"Internode-definitions",
				"SRB-SpecificIntegrityProtInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(4), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "SRB_SpecificIntegrityProtInfo"
				)
			    )
			)
		    ),
		    "srb-SpecificIntegrityProtInfo",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"ImplementationSpecificParams"
			    ),
			    new QName (
				"Internode-definitions",
				"ImplementationSpecificParams"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(512),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "implementationSpecificParams",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"U_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI"
				)
			    ),
			    0
			)
		    ),
		    "u-RNTI",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"C_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"C-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "c-RNTI",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"UE_RadioAccessCapability_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"UE-RadioAccessCapability-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_RadioAccessCapability_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_RadioAccessCapability_r4"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_RadioAccessCapabBandFDDList"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandFDDList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapabBandFDD"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapability-ext",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"UE_Positioning_LastKnownPos"
			    ),
			    new QName (
				"Internode-definitions",
				"UE-Positioning-LastKnownPos"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_Positioning_LastKnownPos"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_Positioning_LastKnownPos"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-LastKnownPos",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    new QName (
				"InformationElements",
				"UESpecificBehaviourInformation1idle"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(4)
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "uESpecificBehaviourInformation1idle",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UESpecificBehaviourInformation1interRAT"
			    ),
			    new QName (
				"InformationElements",
				"UESpecificBehaviourInformation1interRAT"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "uESpecificBehaviourInformation1interRAT",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRAT_UE_RadioAccessCapabilityList"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapabilityList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "InterRAT_UE_RadioAccessCapability"
				)
			    )
			)
		    ),
		    "ue-RATSpecificCapability",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"URA_Identity"
			    ),
			    new QName (
				"InformationElements",
				"URA-Identity"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "ura-Identity",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NAS_SystemInformationGSM_MAP"
			    ),
			    new QName (
				"InformationElements",
				"NAS-SystemInformationGSM-MAP"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    )
			)
		    ),
		    "cn-CommonGSM-MAP-NAS-SysInfo",
		    20,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainInformationListFull"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainInformationListFull"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CN_DomainInformationFull"
				)
			    )
			)
		    ),
		    "cn-DomainInformationList",
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"OngoingMeasRepList_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"OngoingMeasRepList-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.internode_definitions",
				    "OngoingMeasRep_r4"
				)
			    )
			)
		    ),
		    "ongoingMeasRepList",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PredefinedConfigStatusList"
			    ),
			    new QName (
				"InformationElements",
				"PredefinedConfigStatusList"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PredefinedConfigStatusInfo"
				)
			    )
			)
		    ),
		    "predefinedConfigStatusList",
		    23,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SRB_InformationSetupList"
			    ),
			    new QName (
				"InformationElements",
				"SRB-InformationSetupList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SRB_InformationSetup"
				)
			    )
			)
		    ),
		    "srb-InformationList",
		    24,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAB_InformationSetupList_r4"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_InformationSetup_r4"
				)
			    )
			)
		    ),
		    "rab-InformationList",
		    25,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_CommonTransChInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"UL-CommonTransChInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "ul-CommonTransChInfo",
		    26,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"UL-AddReconfTransChInfoList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "ul-TransChInfoList",
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r4_IEs$Dummy"
			)
		    ),
		    "dummy",
		    28,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonTransChInfo_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonTransChInfo-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo_r4"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonTransChInfo",
		    29,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_AddReconfTransChInfoList_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList-r4"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "DL_AddReconfTransChInformation_r4"
				)
			    )
			)
		    ),
		    "dl-TransChInfoList",
		    30,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
		    31,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8020
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FailureCauseWithProtErr"
			    ),
			    new QName (
				"InformationElements",
				"FailureCauseWithProtErr"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FailureCauseWithProtErr"
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
		    "failureCause",
		    32,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8020, 32)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r4_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r4_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_r4_IEs
