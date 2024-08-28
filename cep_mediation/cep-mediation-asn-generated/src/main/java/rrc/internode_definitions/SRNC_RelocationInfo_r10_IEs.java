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
 * Define the ASN1 Type SRNC_RelocationInfo_r10_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_r10_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_r10_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_r10_IEs(rrc.informationelements.RB_Identity rb_IdentityForHOMessage, 
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
		    UE_RadioAccessCapability_r6 ue_RadioAccessCapability, 
		    rrc.informationelements.UE_RadioAccessCapabBandFDDList ue_RadioAccessCapability_ext, 
		    UE_Positioning_LastKnownPos ue_Positioning_LastKnownPos, 
		    rrc.informationelements.UESpecificBehaviourInformation1idle uESpecificBehaviourInformation1idle, 
		    rrc.informationelements.UESpecificBehaviourInformation1interRAT uESpecificBehaviourInformation1interRAT, 
		    UeCapabilityContainer ueCapabilityContainer, 
		    UeCapabilityContainer_RSC ueCapabilityContainer_RSC, 
		    UeCapabilityContainer_UCI ueCapabilityContainer_UCI, 
		    InterRAT_UE_RadioAccessCapabilityList_r5 ue_RATSpecificCapability, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.T_305 srns_t_305, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.CN_DomainInformationListFull cn_DomainInformationList, 
		    OngoingMeasRepList_r10 ongoingMeasRepList, 
		    rrc.informationelements.InterRATCellInfoIndication interRATCellInfoIndication, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationList, 
		    rrc.informationelements.RAB_InformationSetupList_r8 rab_InformationList, 
		    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_TransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_TransChInfoList, 
		    TPC_CombinationInfoList tpc_CombinationInfoList, 
		    E_RGCH_CombinationInfoList e_RGCH_CombinationInfoList, 
		    StoredCompressedModeInfo_r8 storedCompressedModeInfo, 
		    TPC_CombinationInfoList_r9 secondary_tpc_CombinationInfoList, 
		    E_RGCH_CombinationInfoList_r9 secondary_e_RGCH_CombinationInfoList, 
		    MeasurementReport measurementReport, 
		    rrc.informationelements.FailureCauseWithProtErr failureCause, 
		    rrc.informationelements.UE_HistoryInformation ue_HistoryInformation, 
		    rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation, 
		    rrc.informationelements.MBMS_SelectedServiceInfo mbmsSelectedServiceInfo)
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
	setUeCapabilityContainer(ueCapabilityContainer);
	setUeCapabilityContainer_RSC(ueCapabilityContainer_RSC);
	setUeCapabilityContainer_UCI(ueCapabilityContainer_UCI);
	setUe_RATSpecificCapability(ue_RATSpecificCapability);
	setUra_Identity(ura_Identity);
	setSrns_t_305(srns_t_305);
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setCn_DomainInformationList(cn_DomainInformationList);
	setOngoingMeasRepList(ongoingMeasRepList);
	setInterRATCellInfoIndication(interRATCellInfoIndication);
	setPredefinedConfigStatusList(predefinedConfigStatusList);
	setSrb_InformationList(srb_InformationList);
	setRab_InformationList(rab_InformationList);
	setPdcp_ROHC_TargetMode(pdcp_ROHC_TargetMode);
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_TransChInfoList(ul_TransChInfoList);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_TransChInfoList(dl_TransChInfoList);
	setTpc_CombinationInfoList(tpc_CombinationInfoList);
	setE_RGCH_CombinationInfoList(e_RGCH_CombinationInfoList);
	setStoredCompressedModeInfo(storedCompressedModeInfo);
	setSecondary_tpc_CombinationInfoList(secondary_tpc_CombinationInfoList);
	setSecondary_e_RGCH_CombinationInfoList(secondary_e_RGCH_CombinationInfoList);
	setMeasurementReport(measurementReport);
	setFailureCause(failureCause);
	setUe_HistoryInformation(ue_HistoryInformation);
	setMbms_JoinedInformation(mbms_JoinedInformation);
	setMbmsSelectedServiceInfo(mbmsSelectedServiceInfo);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_r10_IEs(StateOfRRC stateOfRRC, 
		    StateOfRRC_Procedure stateOfRRC_Procedure, 
		    CipheringStatusList_r4 cipheringStatusList, 
		    rrc.informationelements.CN_DomainIdentity latestConfiguredCN_Domain, 
		    IntegrityProtectionStatus integrityProtectionStatus, 
		    rrc.informationelements.U_RNTI u_RNTI, 
		    UE_RadioAccessCapability_r6 ue_RadioAccessCapability, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationList)
    {
	setStateOfRRC(stateOfRRC);
	setStateOfRRC_Procedure(stateOfRRC_Procedure);
	setCipheringStatusList(cipheringStatusList);
	setLatestConfiguredCN_Domain(latestConfiguredCN_Domain);
	setIntegrityProtectionStatus(integrityProtectionStatus);
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
	mComponents[13] = new UE_RadioAccessCapability_r6();
	mComponents[14] = new rrc.informationelements.UE_RadioAccessCapabBandFDDList();
	mComponents[15] = new UE_Positioning_LastKnownPos();
	mComponents[16] = new rrc.informationelements.UESpecificBehaviourInformation1idle();
	mComponents[17] = new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
	mComponents[18] = new UeCapabilityContainer();
	mComponents[19] = new UeCapabilityContainer_RSC();
	mComponents[20] = new UeCapabilityContainer_UCI();
	mComponents[21] = new InterRAT_UE_RadioAccessCapabilityList_r5();
	mComponents[22] = new rrc.informationelements.URA_Identity();
	mComponents[23] = rrc.informationelements.T_305.noUpdate;
	mComponents[24] = new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	mComponents[25] = new rrc.informationelements.CN_DomainInformationListFull();
	mComponents[26] = new OngoingMeasRepList_r10();
	mComponents[27] = new rrc.informationelements.InterRATCellInfoIndication();
	mComponents[28] = new rrc.informationelements.PredefinedConfigStatusList();
	mComponents[29] = new rrc.informationelements.SRB_InformationSetupList_r8();
	mComponents[30] = new rrc.informationelements.RAB_InformationSetupList_r8();
	mComponents[31] = rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	mComponents[32] = new rrc.informationelements.UL_CommonTransChInfo_r4();
	mComponents[33] = new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
	mComponents[34] = new rrc.informationelements.DL_CommonTransChInfo_r4();
	mComponents[35] = new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
	mComponents[36] = new TPC_CombinationInfoList();
	mComponents[37] = new E_RGCH_CombinationInfoList();
	mComponents[38] = new StoredCompressedModeInfo_r8();
	mComponents[39] = new TPC_CombinationInfoList_r9();
	mComponents[40] = new E_RGCH_CombinationInfoList_r9();
	mComponents[41] = new MeasurementReport();
	mComponents[42] = new rrc.informationelements.FailureCauseWithProtErr();
	mComponents[43] = new rrc.informationelements.UE_HistoryInformation();
	mComponents[44] = new rrc.informationelements.MBMS_JoinedInformation_r6();
	mComponents[45] = new rrc.informationelements.MBMS_SelectedServiceInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[46];
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
		return new UE_RadioAccessCapability_r6();
	    case 14:
		return new rrc.informationelements.UE_RadioAccessCapabBandFDDList();
	    case 15:
		return new UE_Positioning_LastKnownPos();
	    case 16:
		return new rrc.informationelements.UESpecificBehaviourInformation1idle();
	    case 17:
		return new rrc.informationelements.UESpecificBehaviourInformation1interRAT();
	    case 18:
		return new UeCapabilityContainer();
	    case 19:
		return new UeCapabilityContainer_RSC();
	    case 20:
		return new UeCapabilityContainer_UCI();
	    case 21:
		return new InterRAT_UE_RadioAccessCapabilityList_r5();
	    case 22:
		return new rrc.informationelements.URA_Identity();
	    case 23:
		return rrc.informationelements.T_305.noUpdate;
	    case 24:
		return new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	    case 25:
		return new rrc.informationelements.CN_DomainInformationListFull();
	    case 26:
		return new OngoingMeasRepList_r10();
	    case 27:
		return new rrc.informationelements.InterRATCellInfoIndication();
	    case 28:
		return new rrc.informationelements.PredefinedConfigStatusList();
	    case 29:
		return new rrc.informationelements.SRB_InformationSetupList_r8();
	    case 30:
		return new rrc.informationelements.RAB_InformationSetupList_r8();
	    case 31:
		return rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	    case 32:
		return new rrc.informationelements.UL_CommonTransChInfo_r4();
	    case 33:
		return new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
	    case 34:
		return new rrc.informationelements.DL_CommonTransChInfo_r4();
	    case 35:
		return new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
	    case 36:
		return new TPC_CombinationInfoList();
	    case 37:
		return new E_RGCH_CombinationInfoList();
	    case 38:
		return new StoredCompressedModeInfo_r8();
	    case 39:
		return new TPC_CombinationInfoList_r9();
	    case 40:
		return new E_RGCH_CombinationInfoList_r9();
	    case 41:
		return new MeasurementReport();
	    case 42:
		return new rrc.informationelements.FailureCauseWithProtErr();
	    case 43:
		return new rrc.informationelements.UE_HistoryInformation();
	    case 44:
		return new rrc.informationelements.MBMS_JoinedInformation_r6();
	    case 45:
		return new rrc.informationelements.MBMS_SelectedServiceInfo();
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
    
    public boolean hasSrb_SpecificIntegrityProtInfo()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSrb_SpecificIntegrityProtInfo()
    {
	setComponentAbsent(9);
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
    public UE_RadioAccessCapability_r6 getUe_RadioAccessCapability()
    {
	return (UE_RadioAccessCapability_r6)mComponents[13];
    }
    
    public void setUe_RadioAccessCapability(UE_RadioAccessCapability_r6 ue_RadioAccessCapability)
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
    
    
    // Methods for field "ueCapabilityContainer"
    public UeCapabilityContainer getUeCapabilityContainer()
    {
	return (UeCapabilityContainer)mComponents[18];
    }
    
    public void setUeCapabilityContainer(UeCapabilityContainer ueCapabilityContainer)
    {
	mComponents[18] = ueCapabilityContainer;
    }
    
    public boolean hasUeCapabilityContainer()
    {
	return componentIsPresent(18);
    }
    
    public void deleteUeCapabilityContainer()
    {
	setComponentAbsent(18);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer(rrc.informationelements.UE_CapabilityContainer_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.UE_CapabilityContainer_IEs getContainedValue()
	{
	    return (rrc.informationelements.UE_CapabilityContainer_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.UE_CapabilityContainer_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8012
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "UE_CapabilityContainer_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer

    // Methods for field "ueCapabilityContainer_RSC"
    public UeCapabilityContainer_RSC getUeCapabilityContainer_RSC()
    {
	return (UeCapabilityContainer_RSC)mComponents[19];
    }
    
    public void setUeCapabilityContainer_RSC(UeCapabilityContainer_RSC ueCapabilityContainer_RSC)
    {
	mComponents[19] = ueCapabilityContainer_RSC;
    }
    
    public boolean hasUeCapabilityContainer_RSC()
    {
	return componentIsPresent(19);
    }
    
    public void deleteUeCapabilityContainer_RSC()
    {
	setComponentAbsent(19);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer_RSC from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer_RSC extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer_RSC()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer_RSC(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer_RSC(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer_RSC(rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs getContainedValue()
	{
	    return (rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.pdu_definitions.RRCConnectionSetupComplete_r3_add_ext_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8013
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer_RSC"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.pdu_definitions",
		    "RRCConnectionSetupComplete_r3_add_ext_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer_RSC object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer_RSC object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer_RSC

    // Methods for field "ueCapabilityContainer_UCI"
    public UeCapabilityContainer_UCI getUeCapabilityContainer_UCI()
    {
	return (UeCapabilityContainer_UCI)mComponents[20];
    }
    
    public void setUeCapabilityContainer_UCI(UeCapabilityContainer_UCI ueCapabilityContainer_UCI)
    {
	mComponents[20] = ueCapabilityContainer_UCI;
    }
    
    public boolean hasUeCapabilityContainer_UCI()
    {
	return componentIsPresent(20);
    }
    
    public void deleteUeCapabilityContainer_UCI()
    {
	setComponentAbsent(20);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer_UCI from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer_UCI extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer_UCI()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer_UCI(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer_UCI(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer_UCI(rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs getContainedValue()
	{
	    return (rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.pdu_definitions.UECapabilityInformation_r3_add_ext_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8014
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer_UCI"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.pdu_definitions",
		    "UECapabilityInformation_r3_add_ext_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer_UCI object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer_UCI object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer_UCI

    // Methods for field "ue_RATSpecificCapability"
    public InterRAT_UE_RadioAccessCapabilityList_r5 getUe_RATSpecificCapability()
    {
	return (InterRAT_UE_RadioAccessCapabilityList_r5)mComponents[21];
    }
    
    public void setUe_RATSpecificCapability(InterRAT_UE_RadioAccessCapabilityList_r5 ue_RATSpecificCapability)
    {
	mComponents[21] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(21);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[22];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[22] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(22);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "srns_t_305"
    public rrc.informationelements.T_305 getSrns_t_305()
    {
	return (rrc.informationelements.T_305)mComponents[23];
    }
    
    public void setSrns_t_305(rrc.informationelements.T_305 srns_t_305)
    {
	mComponents[23] = srns_t_305;
    }
    
    public boolean hasSrns_t_305()
    {
	return componentIsPresent(23);
    }
    
    public void deleteSrns_t_305()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "cn_CommonGSM_MAP_NAS_SysInfo"
    public rrc.informationelements.NAS_SystemInformationGSM_MAP getCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return (rrc.informationelements.NAS_SystemInformationGSM_MAP)mComponents[24];
    }
    
    public void setCn_CommonGSM_MAP_NAS_SysInfo(rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo)
    {
	mComponents[24] = cn_CommonGSM_MAP_NAS_SysInfo;
    }
    
    
    // Methods for field "cn_DomainInformationList"
    public rrc.informationelements.CN_DomainInformationListFull getCn_DomainInformationList()
    {
	return (rrc.informationelements.CN_DomainInformationListFull)mComponents[25];
    }
    
    public void setCn_DomainInformationList(rrc.informationelements.CN_DomainInformationListFull cn_DomainInformationList)
    {
	mComponents[25] = cn_DomainInformationList;
    }
    
    public boolean hasCn_DomainInformationList()
    {
	return componentIsPresent(25);
    }
    
    public void deleteCn_DomainInformationList()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "ongoingMeasRepList"
    public OngoingMeasRepList_r10 getOngoingMeasRepList()
    {
	return (OngoingMeasRepList_r10)mComponents[26];
    }
    
    public void setOngoingMeasRepList(OngoingMeasRepList_r10 ongoingMeasRepList)
    {
	mComponents[26] = ongoingMeasRepList;
    }
    
    public boolean hasOngoingMeasRepList()
    {
	return componentIsPresent(26);
    }
    
    public void deleteOngoingMeasRepList()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "interRATCellInfoIndication"
    public rrc.informationelements.InterRATCellInfoIndication getInterRATCellInfoIndication()
    {
	return (rrc.informationelements.InterRATCellInfoIndication)mComponents[27];
    }
    
    public void setInterRATCellInfoIndication(rrc.informationelements.InterRATCellInfoIndication interRATCellInfoIndication)
    {
	mComponents[27] = interRATCellInfoIndication;
    }
    
    public boolean hasInterRATCellInfoIndication()
    {
	return componentIsPresent(27);
    }
    
    public void deleteInterRATCellInfoIndication()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "predefinedConfigStatusList"
    public rrc.informationelements.PredefinedConfigStatusList getPredefinedConfigStatusList()
    {
	return (rrc.informationelements.PredefinedConfigStatusList)mComponents[28];
    }
    
    public void setPredefinedConfigStatusList(rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList)
    {
	mComponents[28] = predefinedConfigStatusList;
    }
    
    
    // Methods for field "srb_InformationList"
    public rrc.informationelements.SRB_InformationSetupList_r8 getSrb_InformationList()
    {
	return (rrc.informationelements.SRB_InformationSetupList_r8)mComponents[29];
    }
    
    public void setSrb_InformationList(rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationList)
    {
	mComponents[29] = srb_InformationList;
    }
    
    
    // Methods for field "rab_InformationList"
    public rrc.informationelements.RAB_InformationSetupList_r8 getRab_InformationList()
    {
	return (rrc.informationelements.RAB_InformationSetupList_r8)mComponents[30];
    }
    
    public void setRab_InformationList(rrc.informationelements.RAB_InformationSetupList_r8 rab_InformationList)
    {
	mComponents[30] = rab_InformationList;
    }
    
    public boolean hasRab_InformationList()
    {
	return componentIsPresent(30);
    }
    
    public void deleteRab_InformationList()
    {
	setComponentAbsent(30);
    }
    
    
    // Methods for field "pdcp_ROHC_TargetMode"
    public rrc.informationelements.PDCP_ROHC_TargetMode getPdcp_ROHC_TargetMode()
    {
	return (rrc.informationelements.PDCP_ROHC_TargetMode)mComponents[31];
    }
    
    public void setPdcp_ROHC_TargetMode(rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode)
    {
	mComponents[31] = pdcp_ROHC_TargetMode;
    }
    
    public boolean hasPdcp_ROHC_TargetMode()
    {
	return componentIsPresent(31);
    }
    
    public void deletePdcp_ROHC_TargetMode()
    {
	setComponentAbsent(31);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[32];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
    {
	mComponents[32] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(32);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(32);
    }
    
    
    // Methods for field "ul_TransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList_r8 getUl_TransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList_r8)mComponents[33];
    }
    
    public void setUl_TransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_TransChInfoList)
    {
	mComponents[33] = ul_TransChInfoList;
    }
    
    public boolean hasUl_TransChInfoList()
    {
	return componentIsPresent(33);
    }
    
    public void deleteUl_TransChInfoList()
    {
	setComponentAbsent(33);
    }
    
    
    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[34];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
    {
	mComponents[34] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(34);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(34);
    }
    
    
    // Methods for field "dl_TransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList_r9 getDl_TransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList_r9)mComponents[35];
    }
    
    public void setDl_TransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_TransChInfoList)
    {
	mComponents[35] = dl_TransChInfoList;
    }
    
    public boolean hasDl_TransChInfoList()
    {
	return componentIsPresent(35);
    }
    
    public void deleteDl_TransChInfoList()
    {
	setComponentAbsent(35);
    }
    
    
    // Methods for field "tpc_CombinationInfoList"
    public TPC_CombinationInfoList getTpc_CombinationInfoList()
    {
	return (TPC_CombinationInfoList)mComponents[36];
    }
    
    public void setTpc_CombinationInfoList(TPC_CombinationInfoList tpc_CombinationInfoList)
    {
	mComponents[36] = tpc_CombinationInfoList;
    }
    
    public boolean hasTpc_CombinationInfoList()
    {
	return componentIsPresent(36);
    }
    
    public void deleteTpc_CombinationInfoList()
    {
	setComponentAbsent(36);
    }
    
    
    // Methods for field "e_RGCH_CombinationInfoList"
    public E_RGCH_CombinationInfoList getE_RGCH_CombinationInfoList()
    {
	return (E_RGCH_CombinationInfoList)mComponents[37];
    }
    
    public void setE_RGCH_CombinationInfoList(E_RGCH_CombinationInfoList e_RGCH_CombinationInfoList)
    {
	mComponents[37] = e_RGCH_CombinationInfoList;
    }
    
    public boolean hasE_RGCH_CombinationInfoList()
    {
	return componentIsPresent(37);
    }
    
    public void deleteE_RGCH_CombinationInfoList()
    {
	setComponentAbsent(37);
    }
    
    
    // Methods for field "storedCompressedModeInfo"
    public StoredCompressedModeInfo_r8 getStoredCompressedModeInfo()
    {
	return (StoredCompressedModeInfo_r8)mComponents[38];
    }
    
    public void setStoredCompressedModeInfo(StoredCompressedModeInfo_r8 storedCompressedModeInfo)
    {
	mComponents[38] = storedCompressedModeInfo;
    }
    
    public boolean hasStoredCompressedModeInfo()
    {
	return componentIsPresent(38);
    }
    
    public void deleteStoredCompressedModeInfo()
    {
	setComponentAbsent(38);
    }
    
    
    // Methods for field "secondary_tpc_CombinationInfoList"
    public TPC_CombinationInfoList_r9 getSecondary_tpc_CombinationInfoList()
    {
	return (TPC_CombinationInfoList_r9)mComponents[39];
    }
    
    public void setSecondary_tpc_CombinationInfoList(TPC_CombinationInfoList_r9 secondary_tpc_CombinationInfoList)
    {
	mComponents[39] = secondary_tpc_CombinationInfoList;
    }
    
    public boolean hasSecondary_tpc_CombinationInfoList()
    {
	return componentIsPresent(39);
    }
    
    public void deleteSecondary_tpc_CombinationInfoList()
    {
	setComponentAbsent(39);
    }
    
    
    // Methods for field "secondary_e_RGCH_CombinationInfoList"
    public E_RGCH_CombinationInfoList_r9 getSecondary_e_RGCH_CombinationInfoList()
    {
	return (E_RGCH_CombinationInfoList_r9)mComponents[40];
    }
    
    public void setSecondary_e_RGCH_CombinationInfoList(E_RGCH_CombinationInfoList_r9 secondary_e_RGCH_CombinationInfoList)
    {
	mComponents[40] = secondary_e_RGCH_CombinationInfoList;
    }
    
    public boolean hasSecondary_e_RGCH_CombinationInfoList()
    {
	return componentIsPresent(40);
    }
    
    public void deleteSecondary_e_RGCH_CombinationInfoList()
    {
	setComponentAbsent(40);
    }
    
    
    // Methods for field "measurementReport"
    public MeasurementReport getMeasurementReport()
    {
	return (MeasurementReport)mComponents[41];
    }
    
    public void setMeasurementReport(MeasurementReport measurementReport)
    {
	mComponents[41] = measurementReport;
    }
    
    public boolean hasMeasurementReport()
    {
	return componentIsPresent(41);
    }
    
    public void deleteMeasurementReport()
    {
	setComponentAbsent(41);
    }
    
    
    
    /**
     * Define the ASN1 Type MeasurementReport from ASN1 Module Internode_definitions.
     * @see ContainingBitString
     */
    public static class MeasurementReport extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public MeasurementReport()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public MeasurementReport(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public MeasurementReport(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public MeasurementReport(rrc.pdu_definitions.MeasurementReport decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.pdu_definitions.MeasurementReport getContainedValue()
	{
	    return (rrc.pdu_definitions.MeasurementReport)getDecodedValue();
	}
	
	public void setContainedValue(rrc.pdu_definitions.MeasurementReport value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8029
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r10_IEs$MeasurementReport"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.pdu_definitions",
		    "MeasurementReport"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MeasurementReport object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MeasurementReport

    // Methods for field "failureCause"
    public rrc.informationelements.FailureCauseWithProtErr getFailureCause()
    {
	return (rrc.informationelements.FailureCauseWithProtErr)mComponents[42];
    }
    
    public void setFailureCause(rrc.informationelements.FailureCauseWithProtErr failureCause)
    {
	mComponents[42] = failureCause;
    }
    
    public boolean hasFailureCause()
    {
	return componentIsPresent(42);
    }
    
    public void deleteFailureCause()
    {
	setComponentAbsent(42);
    }
    
    
    // Methods for field "ue_HistoryInformation"
    public rrc.informationelements.UE_HistoryInformation getUe_HistoryInformation()
    {
	return (rrc.informationelements.UE_HistoryInformation)mComponents[43];
    }
    
    public void setUe_HistoryInformation(rrc.informationelements.UE_HistoryInformation ue_HistoryInformation)
    {
	mComponents[43] = ue_HistoryInformation;
    }
    
    public boolean hasUe_HistoryInformation()
    {
	return componentIsPresent(43);
    }
    
    public void deleteUe_HistoryInformation()
    {
	setComponentAbsent(43);
    }
    
    
    // Methods for field "mbms_JoinedInformation"
    public rrc.informationelements.MBMS_JoinedInformation_r6 getMbms_JoinedInformation()
    {
	return (rrc.informationelements.MBMS_JoinedInformation_r6)mComponents[44];
    }
    
    public void setMbms_JoinedInformation(rrc.informationelements.MBMS_JoinedInformation_r6 mbms_JoinedInformation)
    {
	mComponents[44] = mbms_JoinedInformation;
    }
    
    public boolean hasMbms_JoinedInformation()
    {
	return componentIsPresent(44);
    }
    
    public void deleteMbms_JoinedInformation()
    {
	setComponentAbsent(44);
    }
    
    
    // Methods for field "mbmsSelectedServiceInfo"
    public rrc.informationelements.MBMS_SelectedServiceInfo getMbmsSelectedServiceInfo()
    {
	return (rrc.informationelements.MBMS_SelectedServiceInfo)mComponents[45];
    }
    
    public void setMbmsSelectedServiceInfo(rrc.informationelements.MBMS_SelectedServiceInfo mbmsSelectedServiceInfo)
    {
	mComponents[45] = mbmsSelectedServiceInfo;
    }
    
    public boolean hasMbmsSelectedServiceInfo()
    {
	return componentIsPresent(45);
    }
    
    public void deleteMbmsSelectedServiceInfo()
    {
	setComponentAbsent(45);
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
	    "SRNC_RelocationInfo_r10_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-r10-IEs"
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
		    3,
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
				"UE_RadioAccessCapability_r6"
			    ),
			    new QName (
				"Internode-definitions",
				"UE-RadioAccessCapability-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_RadioAccessCapability_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_RadioAccessCapability_r6"
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
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer"
			)
		    ),
		    "ueCapabilityContainer",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer_RSC"
			)
		    ),
		    "ueCapabilityContainer-RSC",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r10_IEs$UeCapabilityContainer_UCI"
			)
		    ),
		    "ueCapabilityContainer-UCI",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"InterRAT_UE_RadioAccessCapabilityList_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"InterRAT-UE-RadioAccessCapabilityList-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "InterRAT_UE_RadioAccessCapabilityList_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "InterRAT_UE_RadioAccessCapabilityList_r5"
				)
			    ),
			    0
			)
		    ),
		    "ue-RATSpecificCapability",
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"T_305"
			    ),
			    new QName (
				"InformationElements",
				"T-305"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noUpdate",
					0
				    ),
				    new MemberListElement (
					"m5",
					1
				    ),
				    new MemberListElement (
					"m10",
					2
				    ),
				    new MemberListElement (
					"m30",
					3
				    ),
				    new MemberListElement (
					"m60",
					4
				    ),
				    new MemberListElement (
					"m120",
					5
				    ),
				    new MemberListElement (
					"m360",
					6
				    ),
				    new MemberListElement (
					"m720",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.T_305.noUpdate
			)
		    ),
		    "srns-t-305",
		    23,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
		    25,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"OngoingMeasRepList_r10"
			    ),
			    new QName (
				"Internode-definitions",
				"OngoingMeasRepList-r10"
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
				    "OngoingMeasRep_r10"
				)
			    )
			)
		    ),
		    "ongoingMeasRepList",
		    26,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATCellInfoIndication"
			    ),
			    new QName (
				"InformationElements",
				"InterRATCellInfoIndication"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.InterRATCellInfoIndication(0), 
				    new rrc.informationelements.InterRATCellInfoIndication(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "interRATCellInfoIndication",
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
		    28,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SRB_InformationSetupList_r8"
			    ),
			    new QName (
				"InformationElements",
				"SRB-InformationSetupList-r8"
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
				    "SRB_InformationSetup_r8"
				)
			    )
			)
		    ),
		    "srb-InformationList",
		    29,
		    2,
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
				"RAB_InformationSetupList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList-r8"
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
				    "RAB_InformationSetup_r8"
				)
			    )
			)
		    ),
		    "rab-InformationList",
		    30,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDCP_ROHC_TargetMode"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-ROHC-TargetMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"o-Mode",
					0
				    ),
				    new MemberListElement (
					"r-Mode",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode
			)
		    ),
		    "pdcp-ROHC-TargetMode",
		    31,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8020
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
		    32,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8021
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_AddReconfTransChInfoList_r8"
			    ),
			    new QName (
				"InformationElements",
				"UL-AddReconfTransChInfoList-r8"
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
				    "UL_AddReconfTransChInformation_r8"
				)
			    )
			)
		    ),
		    "ul-TransChInfoList",
		    33,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8022
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
		    34,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8023
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_AddReconfTransChInfoList_r9"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList-r9"
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
				    "DL_AddReconfTransChInformation_r9"
				)
			    )
			)
		    ),
		    "dl-TransChInfoList",
		    35,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8024
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"TPC_CombinationInfoList"
			    ),
			    new QName (
				"Internode-definitions",
				"TPC-CombinationInfoList"
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
				    "rrc.internode_definitions",
				    "TPC_Combination_Info"
				)
			    )
			)
		    ),
		    "tpc-CombinationInfoList",
		    36,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8025
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"E_RGCH_CombinationInfoList"
			    ),
			    new QName (
				"Internode-definitions",
				"E-RGCH-CombinationInfoList"
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
				    "E_RGCH_Combination_Info"
				)
			    )
			)
		    ),
		    "e-RGCH-CombinationInfoList",
		    37,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8026
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"StoredCompressedModeInfo_r8"
			    ),
			    new QName (
				"Internode-definitions",
				"StoredCompressedModeInfo-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "StoredCompressedModeInfo_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "StoredCompressedModeInfo_r8"
				)
			    ),
			    0
			)
		    ),
		    "storedCompressedModeInfo",
		    38,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8027
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"TPC_CombinationInfoList_r9"
			    ),
			    new QName (
				"Internode-definitions",
				"TPC-CombinationInfoList-r9"
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
				    "TPC_Combination_Info_r9"
				)
			    )
			)
		    ),
		    "secondary-tpc-CombinationInfoList",
		    39,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8028
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"E_RGCH_CombinationInfoList_r9"
			    ),
			    new QName (
				"Internode-definitions",
				"E-RGCH-CombinationInfoList-r9"
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
				    "E_RGCH_Combination_Info_r9"
				)
			    )
			)
		    ),
		    "secondary-e-RGCH-CombinationInfoList",
		    40,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r10_IEs$MeasurementReport"
			)
		    ),
		    "measurementReport",
		    41,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x802a
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
		    42,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_HistoryInformation"
			    ),
			    new QName (
				"InformationElements",
				"UE-HistoryInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_HistoryInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_HistoryInformation"
				)
			    ),
			    0
			)
		    ),
		    "ue-HistoryInformation",
		    43,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_JoinedInformation_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-JoinedInformation-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_JoinedInformation_r6"
				)
			    ),
			    0
			)
		    ),
		    "mbms-JoinedInformation",
		    44,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802d
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_SelectedServiceInfo"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SelectedServiceInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_SelectedServiceInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_SelectedServiceInfo"
				)
			    ),
			    0
			)
		    ),
		    "mbmsSelectedServiceInfo",
		    45,
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
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
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
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24)
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
			new TagDecoderElement((short)0x801c, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 28)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801d, 29)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8024, 36),
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8025, 37),
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8026, 38),
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8027, 39),
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8028, 40),
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8029, 41),
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x802a, 42),
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x802b, 43),
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x802c, 44),
			new TagDecoderElement((short)0x802d, 45)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x802d, 45)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r10_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r10_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_r10_IEs
