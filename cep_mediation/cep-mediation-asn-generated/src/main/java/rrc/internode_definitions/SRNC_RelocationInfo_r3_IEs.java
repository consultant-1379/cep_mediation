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
 * Define the ASN1 Type SRNC_RelocationInfo_r3_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class SRNC_RelocationInfo_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SRNC_RelocationInfo_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SRNC_RelocationInfo_r3_IEs(StateOfRRC stateOfRRC, 
		    StateOfRRC_Procedure stateOfRRC_Procedure, 
		    CipheringStatus cipheringStatus, 
		    CalculationTimeForCiphering calculationTimeForCiphering, 
		    CipheringInfoPerRB_List cipheringInfoPerRB_List, 
		    COUNT_C_List count_C_List, 
		    IntegrityProtectionStatus integrityProtectionStatus, 
		    SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo, 
		    ImplementationSpecificParams implementationSpecificParams, 
		    rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.C_RNTI c_RNTI, 
		    rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability, 
		    UE_Positioning_LastKnownPos ue_Positioning_LastKnownPos, 
		    rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.CN_DomainInformationList cn_DomainInformationList, 
		    OngoingMeasRepList ongoingMeasRepList, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList srb_InformationList, 
		    rrc.informationelements.RAB_InformationSetupList rab_InformationList, 
		    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_TransChInfoList, 
		    ModeSpecificInfo modeSpecificInfo, 
		    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
		    rrc.informationelements.DL_AddReconfTransChInfoList dl_TransChInfoList, 
		    rrc.pdu_definitions.MeasurementReport measurementReport)
    {
	setStateOfRRC(stateOfRRC);
	setStateOfRRC_Procedure(stateOfRRC_Procedure);
	setCipheringStatus(cipheringStatus);
	setCalculationTimeForCiphering(calculationTimeForCiphering);
	setCipheringInfoPerRB_List(cipheringInfoPerRB_List);
	setCount_C_List(count_C_List);
	setIntegrityProtectionStatus(integrityProtectionStatus);
	setSrb_SpecificIntegrityProtInfo(srb_SpecificIntegrityProtInfo);
	setImplementationSpecificParams(implementationSpecificParams);
	setU_RNTI(u_RNTI);
	setC_RNTI(c_RNTI);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setUe_Positioning_LastKnownPos(ue_Positioning_LastKnownPos);
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
	setModeSpecificInfo(modeSpecificInfo);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_TransChInfoList(dl_TransChInfoList);
	setMeasurementReport(measurementReport);
    }
    
    /**
     * Construct with required components.
     */
    public SRNC_RelocationInfo_r3_IEs(StateOfRRC stateOfRRC, 
		    StateOfRRC_Procedure stateOfRRC_Procedure, 
		    CipheringStatus cipheringStatus, 
		    IntegrityProtectionStatus integrityProtectionStatus, 
		    SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo, 
		    rrc.informationelements.U_RNTI u_RNTI, 
		    rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability, 
		    rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo, 
		    rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList, 
		    rrc.informationelements.SRB_InformationSetupList srb_InformationList, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setStateOfRRC(stateOfRRC);
	setStateOfRRC_Procedure(stateOfRRC_Procedure);
	setCipheringStatus(cipheringStatus);
	setIntegrityProtectionStatus(integrityProtectionStatus);
	setSrb_SpecificIntegrityProtInfo(srb_SpecificIntegrityProtInfo);
	setU_RNTI(u_RNTI);
	setUe_RadioAccessCapability(ue_RadioAccessCapability);
	setCn_CommonGSM_MAP_NAS_SysInfo(cn_CommonGSM_MAP_NAS_SysInfo);
	setPredefinedConfigStatusList(predefinedConfigStatusList);
	setSrb_InformationList(srb_InformationList);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = StateOfRRC.cell_DCH;
	mComponents[1] = StateOfRRC_Procedure.awaitNoRRC_Message;
	mComponents[2] = CipheringStatus.started;
	mComponents[3] = new CalculationTimeForCiphering();
	mComponents[4] = new CipheringInfoPerRB_List();
	mComponents[5] = new COUNT_C_List();
	mComponents[6] = IntegrityProtectionStatus.started;
	mComponents[7] = new SRB_SpecificIntegrityProtInfoList();
	mComponents[8] = new ImplementationSpecificParams();
	mComponents[9] = new rrc.informationelements.U_RNTI();
	mComponents[10] = new rrc.informationelements.C_RNTI();
	mComponents[11] = new rrc.informationelements.UE_RadioAccessCapability();
	mComponents[12] = new UE_Positioning_LastKnownPos();
	mComponents[13] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[14] = new rrc.informationelements.URA_Identity();
	mComponents[15] = new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	mComponents[16] = new rrc.informationelements.CN_DomainInformationList();
	mComponents[17] = new OngoingMeasRepList();
	mComponents[18] = new rrc.informationelements.PredefinedConfigStatusList();
	mComponents[19] = new rrc.informationelements.SRB_InformationSetupList();
	mComponents[20] = new rrc.informationelements.RAB_InformationSetupList();
	mComponents[21] = new rrc.informationelements.UL_CommonTransChInfo();
	mComponents[22] = new rrc.informationelements.UL_AddReconfTransChInfoList();
	mComponents[23] = new ModeSpecificInfo();
	mComponents[24] = new rrc.informationelements.DL_CommonTransChInfo();
	mComponents[25] = new rrc.informationelements.DL_AddReconfTransChInfoList();
	mComponents[26] = new rrc.pdu_definitions.MeasurementReport();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[27];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return StateOfRRC.cell_DCH;
	    case 1:
		return StateOfRRC_Procedure.awaitNoRRC_Message;
	    case 2:
		return CipheringStatus.started;
	    case 3:
		return new CalculationTimeForCiphering();
	    case 4:
		return new CipheringInfoPerRB_List();
	    case 5:
		return new COUNT_C_List();
	    case 6:
		return IntegrityProtectionStatus.started;
	    case 7:
		return new SRB_SpecificIntegrityProtInfoList();
	    case 8:
		return new ImplementationSpecificParams();
	    case 9:
		return new rrc.informationelements.U_RNTI();
	    case 10:
		return new rrc.informationelements.C_RNTI();
	    case 11:
		return new rrc.informationelements.UE_RadioAccessCapability();
	    case 12:
		return new UE_Positioning_LastKnownPos();
	    case 13:
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 14:
		return new rrc.informationelements.URA_Identity();
	    case 15:
		return new rrc.informationelements.NAS_SystemInformationGSM_MAP();
	    case 16:
		return new rrc.informationelements.CN_DomainInformationList();
	    case 17:
		return new OngoingMeasRepList();
	    case 18:
		return new rrc.informationelements.PredefinedConfigStatusList();
	    case 19:
		return new rrc.informationelements.SRB_InformationSetupList();
	    case 20:
		return new rrc.informationelements.RAB_InformationSetupList();
	    case 21:
		return new rrc.informationelements.UL_CommonTransChInfo();
	    case 22:
		return new rrc.informationelements.UL_AddReconfTransChInfoList();
	    case 23:
		return new ModeSpecificInfo();
	    case 24:
		return new rrc.informationelements.DL_CommonTransChInfo();
	    case 25:
		return new rrc.informationelements.DL_AddReconfTransChInfoList();
	    case 26:
		return new rrc.pdu_definitions.MeasurementReport();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "stateOfRRC"
    public StateOfRRC getStateOfRRC()
    {
	return (StateOfRRC)mComponents[0];
    }
    
    public void setStateOfRRC(StateOfRRC stateOfRRC)
    {
	mComponents[0] = stateOfRRC;
    }
    
    
    // Methods for field "stateOfRRC_Procedure"
    public StateOfRRC_Procedure getStateOfRRC_Procedure()
    {
	return (StateOfRRC_Procedure)mComponents[1];
    }
    
    public void setStateOfRRC_Procedure(StateOfRRC_Procedure stateOfRRC_Procedure)
    {
	mComponents[1] = stateOfRRC_Procedure;
    }
    
    
    // Methods for field "cipheringStatus"
    public CipheringStatus getCipheringStatus()
    {
	return (CipheringStatus)mComponents[2];
    }
    
    public void setCipheringStatus(CipheringStatus cipheringStatus)
    {
	mComponents[2] = cipheringStatus;
    }
    
    
    // Methods for field "calculationTimeForCiphering"
    public CalculationTimeForCiphering getCalculationTimeForCiphering()
    {
	return (CalculationTimeForCiphering)mComponents[3];
    }
    
    public void setCalculationTimeForCiphering(CalculationTimeForCiphering calculationTimeForCiphering)
    {
	mComponents[3] = calculationTimeForCiphering;
    }
    
    public boolean hasCalculationTimeForCiphering()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCalculationTimeForCiphering()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "cipheringInfoPerRB_List"
    public CipheringInfoPerRB_List getCipheringInfoPerRB_List()
    {
	return (CipheringInfoPerRB_List)mComponents[4];
    }
    
    public void setCipheringInfoPerRB_List(CipheringInfoPerRB_List cipheringInfoPerRB_List)
    {
	mComponents[4] = cipheringInfoPerRB_List;
    }
    
    public boolean hasCipheringInfoPerRB_List()
    {
	return componentIsPresent(4);
    }
    
    public void deleteCipheringInfoPerRB_List()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "count_C_List"
    public COUNT_C_List getCount_C_List()
    {
	return (COUNT_C_List)mComponents[5];
    }
    
    public void setCount_C_List(COUNT_C_List count_C_List)
    {
	mComponents[5] = count_C_List;
    }
    
    public boolean hasCount_C_List()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCount_C_List()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "integrityProtectionStatus"
    public IntegrityProtectionStatus getIntegrityProtectionStatus()
    {
	return (IntegrityProtectionStatus)mComponents[6];
    }
    
    public void setIntegrityProtectionStatus(IntegrityProtectionStatus integrityProtectionStatus)
    {
	mComponents[6] = integrityProtectionStatus;
    }
    
    
    // Methods for field "srb_SpecificIntegrityProtInfo"
    public SRB_SpecificIntegrityProtInfoList getSrb_SpecificIntegrityProtInfo()
    {
	return (SRB_SpecificIntegrityProtInfoList)mComponents[7];
    }
    
    public void setSrb_SpecificIntegrityProtInfo(SRB_SpecificIntegrityProtInfoList srb_SpecificIntegrityProtInfo)
    {
	mComponents[7] = srb_SpecificIntegrityProtInfo;
    }
    
    
    // Methods for field "implementationSpecificParams"
    public ImplementationSpecificParams getImplementationSpecificParams()
    {
	return (ImplementationSpecificParams)mComponents[8];
    }
    
    public void setImplementationSpecificParams(ImplementationSpecificParams implementationSpecificParams)
    {
	mComponents[8] = implementationSpecificParams;
    }
    
    public boolean hasImplementationSpecificParams()
    {
	return componentIsPresent(8);
    }
    
    public void deleteImplementationSpecificParams()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "u_RNTI"
    public rrc.informationelements.U_RNTI getU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[9];
    }
    
    public void setU_RNTI(rrc.informationelements.U_RNTI u_RNTI)
    {
	mComponents[9] = u_RNTI;
    }
    
    
    // Methods for field "c_RNTI"
    public rrc.informationelements.C_RNTI getC_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[10];
    }
    
    public void setC_RNTI(rrc.informationelements.C_RNTI c_RNTI)
    {
	mComponents[10] = c_RNTI;
    }
    
    public boolean hasC_RNTI()
    {
	return componentIsPresent(10);
    }
    
    public void deleteC_RNTI()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "ue_RadioAccessCapability"
    public rrc.informationelements.UE_RadioAccessCapability getUe_RadioAccessCapability()
    {
	return (rrc.informationelements.UE_RadioAccessCapability)mComponents[11];
    }
    
    public void setUe_RadioAccessCapability(rrc.informationelements.UE_RadioAccessCapability ue_RadioAccessCapability)
    {
	mComponents[11] = ue_RadioAccessCapability;
    }
    
    
    // Methods for field "ue_Positioning_LastKnownPos"
    public UE_Positioning_LastKnownPos getUe_Positioning_LastKnownPos()
    {
	return (UE_Positioning_LastKnownPos)mComponents[12];
    }
    
    public void setUe_Positioning_LastKnownPos(UE_Positioning_LastKnownPos ue_Positioning_LastKnownPos)
    {
	mComponents[12] = ue_Positioning_LastKnownPos;
    }
    
    public boolean hasUe_Positioning_LastKnownPos()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUe_Positioning_LastKnownPos()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "ue_RATSpecificCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getUe_RATSpecificCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[13];
    }
    
    public void setUe_RATSpecificCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability)
    {
	mComponents[13] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(13);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[14];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[14] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(14);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "cn_CommonGSM_MAP_NAS_SysInfo"
    public rrc.informationelements.NAS_SystemInformationGSM_MAP getCn_CommonGSM_MAP_NAS_SysInfo()
    {
	return (rrc.informationelements.NAS_SystemInformationGSM_MAP)mComponents[15];
    }
    
    public void setCn_CommonGSM_MAP_NAS_SysInfo(rrc.informationelements.NAS_SystemInformationGSM_MAP cn_CommonGSM_MAP_NAS_SysInfo)
    {
	mComponents[15] = cn_CommonGSM_MAP_NAS_SysInfo;
    }
    
    
    // Methods for field "cn_DomainInformationList"
    public rrc.informationelements.CN_DomainInformationList getCn_DomainInformationList()
    {
	return (rrc.informationelements.CN_DomainInformationList)mComponents[16];
    }
    
    public void setCn_DomainInformationList(rrc.informationelements.CN_DomainInformationList cn_DomainInformationList)
    {
	mComponents[16] = cn_DomainInformationList;
    }
    
    public boolean hasCn_DomainInformationList()
    {
	return componentIsPresent(16);
    }
    
    public void deleteCn_DomainInformationList()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "ongoingMeasRepList"
    public OngoingMeasRepList getOngoingMeasRepList()
    {
	return (OngoingMeasRepList)mComponents[17];
    }
    
    public void setOngoingMeasRepList(OngoingMeasRepList ongoingMeasRepList)
    {
	mComponents[17] = ongoingMeasRepList;
    }
    
    public boolean hasOngoingMeasRepList()
    {
	return componentIsPresent(17);
    }
    
    public void deleteOngoingMeasRepList()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "predefinedConfigStatusList"
    public rrc.informationelements.PredefinedConfigStatusList getPredefinedConfigStatusList()
    {
	return (rrc.informationelements.PredefinedConfigStatusList)mComponents[18];
    }
    
    public void setPredefinedConfigStatusList(rrc.informationelements.PredefinedConfigStatusList predefinedConfigStatusList)
    {
	mComponents[18] = predefinedConfigStatusList;
    }
    
    
    // Methods for field "srb_InformationList"
    public rrc.informationelements.SRB_InformationSetupList getSrb_InformationList()
    {
	return (rrc.informationelements.SRB_InformationSetupList)mComponents[19];
    }
    
    public void setSrb_InformationList(rrc.informationelements.SRB_InformationSetupList srb_InformationList)
    {
	mComponents[19] = srb_InformationList;
    }
    
    
    // Methods for field "rab_InformationList"
    public rrc.informationelements.RAB_InformationSetupList getRab_InformationList()
    {
	return (rrc.informationelements.RAB_InformationSetupList)mComponents[20];
    }
    
    public void setRab_InformationList(rrc.informationelements.RAB_InformationSetupList rab_InformationList)
    {
	mComponents[20] = rab_InformationList;
    }
    
    public boolean hasRab_InformationList()
    {
	return componentIsPresent(20);
    }
    
    public void deleteRab_InformationList()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo)mComponents[21];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo)
    {
	mComponents[21] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(21);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ul_TransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_TransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[22];
    }
    
    public void setUl_TransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_TransChInfoList)
    {
	mComponents[22] = ul_TransChInfoList;
    }
    
    public boolean hasUl_TransChInfoList()
    {
	return componentIsPresent(22);
    }
    
    public void deleteUl_TransChInfoList()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[23];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[23] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Fdd(rrc.informationelements.CPCH_SetID dummy, 
			    rrc.informationelements.DRAC_StaticInformationList dummy2)
	    {
		setDummy(dummy);
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
	    
	    
	    // Methods for field "dummy"
	    public rrc.informationelements.CPCH_SetID getDummy()
	    {
		return (rrc.informationelements.CPCH_SetID)mComponents[0];
	    }
	    
	    public void setDummy(rrc.informationelements.CPCH_SetID dummy)
	    {
		mComponents[0] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDummy()
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
		    "SRNC_RelocationInfo_r3_IEs$ModeSpecificInfo$Fdd"
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
			    "dummy",
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Null tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
		    (short)0x8017
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"SRNC_RelocationInfo_r3_IEs$ModeSpecificInfo"
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
				"SRNC_RelocationInfo_r3_IEs$ModeSpecificInfo$Fdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo)mComponents[24];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo)
    {
	mComponents[24] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(24);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "dl_TransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList getDl_TransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList)mComponents[25];
    }
    
    public void setDl_TransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList dl_TransChInfoList)
    {
	mComponents[25] = dl_TransChInfoList;
    }
    
    public boolean hasDl_TransChInfoList()
    {
	return componentIsPresent(25);
    }
    
    public void deleteDl_TransChInfoList()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "measurementReport"
    public rrc.pdu_definitions.MeasurementReport getMeasurementReport()
    {
	return (rrc.pdu_definitions.MeasurementReport)mComponents[26];
    }
    
    public void setMeasurementReport(rrc.pdu_definitions.MeasurementReport measurementReport)
    {
	mComponents[26] = measurementReport;
    }
    
    public boolean hasMeasurementReport()
    {
	return componentIsPresent(26);
    }
    
    public void deleteMeasurementReport()
    {
	setComponentAbsent(26);
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
	    "SRNC_RelocationInfo_r3_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "SRNC-RelocationInfo-r3-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    0,
		    2,
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
				"CipheringStatus"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringStatus"
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
			    CipheringStatus.started
			)
		    ),
		    "cipheringStatus",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"CipheringInfoPerRB_List"
			    ),
			    new QName (
				"Internode-definitions",
				"CipheringInfoPerRB-List"
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
				    "CipheringInfoPerRB"
				)
			    )
			)
		    ),
		    "cipheringInfoPerRB-List",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    6,
		    2,
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
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
				"UE_RadioAccessCapability"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_RadioAccessCapability"
				)
			    ),
			    0
			)
		    ),
		    "ue-RadioAccessCapability",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CN_DomainInformationList"
			    ),
			    new QName (
				"InformationElements",
				"CN-DomainInformationList"
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
				    "CN_DomainInformation"
				)
			    )
			)
		    ),
		    "cn-DomainInformationList",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"OngoingMeasRepList"
			    ),
			    new QName (
				"Internode-definitions",
				"OngoingMeasRepList"
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
				    "OngoingMeasRep"
				)
			    )
			)
		    ),
		    "ongoingMeasRepList",
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
		    18,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
		    19,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAB_InformationSetupList"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationSetupList"
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
				    "RAB_InformationSetup"
				)
			    )
			)
		    ),
		    "rab-InformationList",
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
				"rrc.informationelements",
				"UL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"UL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "ul-CommonTransChInfo",
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
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "SRNC_RelocationInfo_r3_IEs$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    23,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonTransChInfo",
		    24,
		    3,
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
				"DL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList"
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
				    "DL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "dl-TransChInfoList",
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
		    26,
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
			new TagDecoderElement((short)0x8000, 0)
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
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
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_RelocationInfo_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_RelocationInfo_r3_IEs
