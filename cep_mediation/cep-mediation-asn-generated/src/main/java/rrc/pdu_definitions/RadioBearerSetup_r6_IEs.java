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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RadioBearerSetup_r6_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerSetup_r6_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerSetup_r6_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerSetup_r6_IEs(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_DPCH_Info_r6 ul_DPCH_Info, 
		    rrc.informationelements.UL_EDCH_Information_r6 ul_EDCH_Information, 
		    rrc.informationelements.DL_HSPDSCH_Information_r6 dl_HSPDSCH_Information, 
		    rrc.informationelements.DL_CommonInformation_r6 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r6 dl_InformationPerRL_List, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setActivationTime(activationTime);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setNew_DSCH_RNTI(new_DSCH_RNTI);
	setNew_H_RNTI(new_H_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setUra_Identity(ura_Identity);
	setCn_InformationInfo(cn_InformationInfo);
	setSpecificationMode(specificationMode);
	setFrequencyInfo(frequencyInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_DPCH_Info(ul_DPCH_Info);
	setUl_EDCH_Information(ul_EDCH_Information);
	setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
	setMbms_PL_ServiceRestrictInfo(mbms_PL_ServiceRestrictInfo);
    }
    
    /**
     * Construct with required components.
     */
    public RadioBearerSetup_r6_IEs(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    SpecificationMode specificationMode)
    {
	setRrc_StateIndicator(rrc_StateIndicator);
	setSpecificationMode(specificationMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.IntegrityProtectionModeInfo();
	mComponents[1] = new rrc.informationelements.CipheringModeInfo();
	mComponents[2] = new rrc.informationelements.ActivationTime();
	mComponents[3] = new rrc.informationelements.U_RNTI();
	mComponents[4] = new rrc.informationelements.C_RNTI();
	mComponents[5] = new rrc.informationelements.DSCH_RNTI();
	mComponents[6] = new rrc.informationelements.H_RNTI();
	mComponents[7] = new rrc.informationelements.E_RNTI();
	mComponents[8] = new rrc.informationelements.E_RNTI();
	mComponents[9] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[10] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	mComponents[11] = new rrc.informationelements.URA_Identity();
	mComponents[12] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[13] = new SpecificationMode();
	mComponents[14] = new rrc.informationelements.FrequencyInfo();
	mComponents[15] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[16] = new rrc.informationelements.UL_DPCH_Info_r6();
	mComponents[17] = new rrc.informationelements.UL_EDCH_Information_r6();
	mComponents[18] = new rrc.informationelements.DL_HSPDSCH_Information_r6();
	mComponents[19] = new rrc.informationelements.DL_CommonInformation_r6();
	mComponents[20] = new rrc.informationelements.DL_InformationPerRL_List_r6();
	mComponents[21] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[22];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.IntegrityProtectionModeInfo();
	    case 1:
		return new rrc.informationelements.CipheringModeInfo();
	    case 2:
		return new rrc.informationelements.ActivationTime();
	    case 3:
		return new rrc.informationelements.U_RNTI();
	    case 4:
		return new rrc.informationelements.C_RNTI();
	    case 5:
		return new rrc.informationelements.DSCH_RNTI();
	    case 6:
		return new rrc.informationelements.H_RNTI();
	    case 7:
		return new rrc.informationelements.E_RNTI();
	    case 8:
		return new rrc.informationelements.E_RNTI();
	    case 9:
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 10:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	    case 11:
		return new rrc.informationelements.URA_Identity();
	    case 12:
		return new rrc.informationelements.CN_InformationInfo_r6();
	    case 13:
		return new SpecificationMode();
	    case 14:
		return new rrc.informationelements.FrequencyInfo();
	    case 15:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 16:
		return new rrc.informationelements.UL_DPCH_Info_r6();
	    case 17:
		return new rrc.informationelements.UL_EDCH_Information_r6();
	    case 18:
		return new rrc.informationelements.DL_HSPDSCH_Information_r6();
	    case 19:
		return new rrc.informationelements.DL_CommonInformation_r6();
	    case 20:
		return new rrc.informationelements.DL_InformationPerRL_List_r6();
	    case 21:
		return rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo)mComponents[0];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo)
    {
	mComponents[0] = integrityProtectionModeInfo;
    }
    
    public boolean hasIntegrityProtectionModeInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntegrityProtectionModeInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "cipheringModeInfo"
    public rrc.informationelements.CipheringModeInfo getCipheringModeInfo()
    {
	return (rrc.informationelements.CipheringModeInfo)mComponents[1];
    }
    
    public void setCipheringModeInfo(rrc.informationelements.CipheringModeInfo cipheringModeInfo)
    {
	mComponents[1] = cipheringModeInfo;
    }
    
    public boolean hasCipheringModeInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCipheringModeInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[2];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[2] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[3];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI new_U_RNTI)
    {
	mComponents[3] = new_U_RNTI;
    }
    
    public boolean hasNew_U_RNTI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNew_U_RNTI()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "new_C_RNTI"
    public rrc.informationelements.C_RNTI getNew_C_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[4];
    }
    
    public void setNew_C_RNTI(rrc.informationelements.C_RNTI new_C_RNTI)
    {
	mComponents[4] = new_C_RNTI;
    }
    
    public boolean hasNew_C_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNew_C_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "new_DSCH_RNTI"
    public rrc.informationelements.DSCH_RNTI getNew_DSCH_RNTI()
    {
	return (rrc.informationelements.DSCH_RNTI)mComponents[5];
    }
    
    public void setNew_DSCH_RNTI(rrc.informationelements.DSCH_RNTI new_DSCH_RNTI)
    {
	mComponents[5] = new_DSCH_RNTI;
    }
    
    public boolean hasNew_DSCH_RNTI()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNew_DSCH_RNTI()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "new_H_RNTI"
    public rrc.informationelements.H_RNTI getNew_H_RNTI()
    {
	return (rrc.informationelements.H_RNTI)mComponents[6];
    }
    
    public void setNew_H_RNTI(rrc.informationelements.H_RNTI new_H_RNTI)
    {
	mComponents[6] = new_H_RNTI;
    }
    
    public boolean hasNew_H_RNTI()
    {
	return componentIsPresent(6);
    }
    
    public void deleteNew_H_RNTI()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewPrimary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[7];
    }
    
    public void setNewPrimary_E_RNTI(rrc.informationelements.E_RNTI newPrimary_E_RNTI)
    {
	mComponents[7] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(7);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "newSecondary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewSecondary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[8];
    }
    
    public void setNewSecondary_E_RNTI(rrc.informationelements.E_RNTI newSecondary_E_RNTI)
    {
	mComponents[8] = newSecondary_E_RNTI;
    }
    
    public boolean hasNewSecondary_E_RNTI()
    {
	return componentIsPresent(8);
    }
    
    public void deleteNewSecondary_E_RNTI()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[9];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[9] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient)mComponents[10];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff)
    {
	mComponents[10] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(10);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[11];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[11] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo_r6 getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo_r6)mComponents[12];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo)
    {
	mComponents[12] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(12);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[13];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[13] = specificationMode;
    }
    
    
    
    /**
     * Define the ASN1 Type SpecificationMode from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class SpecificationMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SpecificationMode()
	{
	}
	
	public static final  int  complete_chosen = 1;
	public static final  int  dummy_chosen = 2;
	
	// Methods for field "complete"
	public static SpecificationMode createSpecificationModeWithComplete(Complete complete)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setComplete(complete);
	    return __object;
	}
	
	public boolean hasComplete()
	{
	    return getChosenFlag() == complete_chosen;
	}
	
	public void setComplete(Complete complete)
	{
	    setChosenValue(complete);
	    setChosenFlag(complete_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Complete from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Complete extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Complete()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Complete(rrc.informationelements.SRB_InformationSetupList_r6 srb_InformationSetupList, 
			    rrc.informationelements.RAB_InformationSetupList_r6 rab_InformationSetupList, 
			    rrc.informationelements.RAB_InformationReconfigList rab_InformationReconfigList, 
			    rrc.informationelements.RB_InformationReconfigList_r6 rb_InformationReconfigList, 
			    rrc.informationelements.RB_InformationAffectedList_r6 rb_InformationAffectedList, 
			    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo, 
			    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
			    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
			    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
			    rrc.informationelements.UL_AddReconfTransChInfoList_r6 ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
			    rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList, 
			    rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList)
	    {
		setSrb_InformationSetupList(srb_InformationSetupList);
		setRab_InformationSetupList(rab_InformationSetupList);
		setRab_InformationReconfigList(rab_InformationReconfigList);
		setRb_InformationReconfigList(rb_InformationReconfigList);
		setRb_InformationAffectedList(rb_InformationAffectedList);
		setDl_CounterSynchronisationInfo(dl_CounterSynchronisationInfo);
		setPdcp_ROHC_TargetMode(pdcp_ROHC_TargetMode);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_deletedTransChInfoList(ul_deletedTransChInfoList);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_DeletedTransChInfoList(dl_DeletedTransChInfoList);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.SRB_InformationSetupList_r6();
		mComponents[1] = new rrc.informationelements.RAB_InformationSetupList_r6();
		mComponents[2] = new rrc.informationelements.RAB_InformationReconfigList();
		mComponents[3] = new rrc.informationelements.RB_InformationReconfigList_r6();
		mComponents[4] = new rrc.informationelements.RB_InformationAffectedList_r6();
		mComponents[5] = new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
		mComponents[6] = rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
		mComponents[7] = new rrc.informationelements.UL_CommonTransChInfo_r4();
		mComponents[8] = new rrc.informationelements.UL_DeletedTransChInfoList_r6();
		mComponents[9] = new rrc.informationelements.UL_AddReconfTransChInfoList_r6();
		mComponents[10] = new rrc.informationelements.DL_CommonTransChInfo_r4();
		mComponents[11] = new rrc.informationelements.DL_DeletedTransChInfoList_r5();
		mComponents[12] = new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[13];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.SRB_InformationSetupList_r6();
		    case 1:
			return new rrc.informationelements.RAB_InformationSetupList_r6();
		    case 2:
			return new rrc.informationelements.RAB_InformationReconfigList();
		    case 3:
			return new rrc.informationelements.RB_InformationReconfigList_r6();
		    case 4:
			return new rrc.informationelements.RB_InformationAffectedList_r6();
		    case 5:
			return new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
		    case 6:
			return rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
		    case 7:
			return new rrc.informationelements.UL_CommonTransChInfo_r4();
		    case 8:
			return new rrc.informationelements.UL_DeletedTransChInfoList_r6();
		    case 9:
			return new rrc.informationelements.UL_AddReconfTransChInfoList_r6();
		    case 10:
			return new rrc.informationelements.DL_CommonTransChInfo_r4();
		    case 11:
			return new rrc.informationelements.DL_DeletedTransChInfoList_r5();
		    case 12:
			return new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "srb_InformationSetupList"
	    public rrc.informationelements.SRB_InformationSetupList_r6 getSrb_InformationSetupList()
	    {
		return (rrc.informationelements.SRB_InformationSetupList_r6)mComponents[0];
	    }
	    
	    public void setSrb_InformationSetupList(rrc.informationelements.SRB_InformationSetupList_r6 srb_InformationSetupList)
	    {
		mComponents[0] = srb_InformationSetupList;
	    }
	    
	    public boolean hasSrb_InformationSetupList()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSrb_InformationSetupList()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "rab_InformationSetupList"
	    public rrc.informationelements.RAB_InformationSetupList_r6 getRab_InformationSetupList()
	    {
		return (rrc.informationelements.RAB_InformationSetupList_r6)mComponents[1];
	    }
	    
	    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList_r6 rab_InformationSetupList)
	    {
		mComponents[1] = rab_InformationSetupList;
	    }
	    
	    public boolean hasRab_InformationSetupList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRab_InformationSetupList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "rab_InformationReconfigList"
	    public rrc.informationelements.RAB_InformationReconfigList getRab_InformationReconfigList()
	    {
		return (rrc.informationelements.RAB_InformationReconfigList)mComponents[2];
	    }
	    
	    public void setRab_InformationReconfigList(rrc.informationelements.RAB_InformationReconfigList rab_InformationReconfigList)
	    {
		mComponents[2] = rab_InformationReconfigList;
	    }
	    
	    public boolean hasRab_InformationReconfigList()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteRab_InformationReconfigList()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rb_InformationReconfigList"
	    public rrc.informationelements.RB_InformationReconfigList_r6 getRb_InformationReconfigList()
	    {
		return (rrc.informationelements.RB_InformationReconfigList_r6)mComponents[3];
	    }
	    
	    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList_r6 rb_InformationReconfigList)
	    {
		mComponents[3] = rb_InformationReconfigList;
	    }
	    
	    public boolean hasRb_InformationReconfigList()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRb_InformationReconfigList()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "rb_InformationAffectedList"
	    public rrc.informationelements.RB_InformationAffectedList_r6 getRb_InformationAffectedList()
	    {
		return (rrc.informationelements.RB_InformationAffectedList_r6)mComponents[4];
	    }
	    
	    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList_r6 rb_InformationAffectedList)
	    {
		mComponents[4] = rb_InformationAffectedList;
	    }
	    
	    public boolean hasRb_InformationAffectedList()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteRb_InformationAffectedList()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "dl_CounterSynchronisationInfo"
	    public rrc.informationelements.DL_CounterSynchronisationInfo_r5 getDl_CounterSynchronisationInfo()
	    {
		return (rrc.informationelements.DL_CounterSynchronisationInfo_r5)mComponents[5];
	    }
	    
	    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
	    {
		mComponents[5] = dl_CounterSynchronisationInfo;
	    }
	    
	    public boolean hasDl_CounterSynchronisationInfo()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteDl_CounterSynchronisationInfo()
	    {
		setComponentAbsent(5);
	    }
	    
	    
	    // Methods for field "pdcp_ROHC_TargetMode"
	    public rrc.informationelements.PDCP_ROHC_TargetMode getPdcp_ROHC_TargetMode()
	    {
		return (rrc.informationelements.PDCP_ROHC_TargetMode)mComponents[6];
	    }
	    
	    public void setPdcp_ROHC_TargetMode(rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode)
	    {
		mComponents[6] = pdcp_ROHC_TargetMode;
	    }
	    
	    public boolean hasPdcp_ROHC_TargetMode()
	    {
		return componentIsPresent(6);
	    }
	    
	    public void deletePdcp_ROHC_TargetMode()
	    {
		setComponentAbsent(6);
	    }
	    
	    
	    // Methods for field "ul_CommonTransChInfo"
	    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
	    {
		return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[7];
	    }
	    
	    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
	    {
		mComponents[7] = ul_CommonTransChInfo;
	    }
	    
	    public boolean hasUl_CommonTransChInfo()
	    {
		return componentIsPresent(7);
	    }
	    
	    public void deleteUl_CommonTransChInfo()
	    {
		setComponentAbsent(7);
	    }
	    
	    
	    // Methods for field "ul_deletedTransChInfoList"
	    public rrc.informationelements.UL_DeletedTransChInfoList_r6 getUl_deletedTransChInfoList()
	    {
		return (rrc.informationelements.UL_DeletedTransChInfoList_r6)mComponents[8];
	    }
	    
	    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList)
	    {
		mComponents[8] = ul_deletedTransChInfoList;
	    }
	    
	    public boolean hasUl_deletedTransChInfoList()
	    {
		return componentIsPresent(8);
	    }
	    
	    public void deleteUl_deletedTransChInfoList()
	    {
		setComponentAbsent(8);
	    }
	    
	    
	    // Methods for field "ul_AddReconfTransChInfoList"
	    public rrc.informationelements.UL_AddReconfTransChInfoList_r6 getUl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.UL_AddReconfTransChInfoList_r6)mComponents[9];
	    }
	    
	    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r6 ul_AddReconfTransChInfoList)
	    {
		mComponents[9] = ul_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasUl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(9);
	    }
	    
	    public void deleteUl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(9);
	    }
	    
	    
	    // Methods for field "dl_CommonTransChInfo"
	    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
	    {
		return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[10];
	    }
	    
	    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
	    {
		mComponents[10] = dl_CommonTransChInfo;
	    }
	    
	    public boolean hasDl_CommonTransChInfo()
	    {
		return componentIsPresent(10);
	    }
	    
	    public void deleteDl_CommonTransChInfo()
	    {
		setComponentAbsent(10);
	    }
	    
	    
	    // Methods for field "dl_DeletedTransChInfoList"
	    public rrc.informationelements.DL_DeletedTransChInfoList_r5 getDl_DeletedTransChInfoList()
	    {
		return (rrc.informationelements.DL_DeletedTransChInfoList_r5)mComponents[11];
	    }
	    
	    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList)
	    {
		mComponents[11] = dl_DeletedTransChInfoList;
	    }
	    
	    public boolean hasDl_DeletedTransChInfoList()
	    {
		return componentIsPresent(11);
	    }
	    
	    public void deleteDl_DeletedTransChInfoList()
	    {
		setComponentAbsent(11);
	    }
	    
	    
	    // Methods for field "dl_AddReconfTransChInfoList"
	    public rrc.informationelements.DL_AddReconfTransChInfoList_r5 getDl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.DL_AddReconfTransChInfoList_r5)mComponents[12];
	    }
	    
	    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList)
	    {
		mComponents[12] = dl_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasDl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(12);
	    }
	    
	    public void deleteDl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(12);
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
		    "rrc.pdu_definitions",
		    "RadioBearerSetup_r6_IEs$SpecificationMode$Complete"
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
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SRB_InformationSetupList_r6"
				    ),
				    new QName (
					"InformationElements",
					"SRB-InformationSetupList-r6"
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
					    "SRB_InformationSetup_r6"
					)
				    )
				)
			    ),
			    "srb-InformationSetupList",
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
					"RAB_InformationSetupList_r6"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationSetupList-r6"
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
					    "RAB_InformationSetup_r6"
					)
				    )
				)
			    ),
			    "rab-InformationSetupList",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RAB_InformationReconfigList"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationReconfigList"
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
					    "RAB_InformationReconfig"
					)
				    )
				)
			    ),
			    "rab-InformationReconfigList",
			    2,
			    3,
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
					"rrc.informationelements",
					"RB_InformationReconfigList_r6"
				    ),
				    new QName (
					"InformationElements",
					"RB-InformationReconfigList-r6"
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
					    "RB_InformationReconfig_r6"
					)
				    )
				)
			    ),
			    "rb-InformationReconfigList",
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
					"rrc.informationelements",
					"RB_InformationAffectedList_r6"
				    ),
				    new QName (
					"InformationElements",
					"RB-InformationAffectedList-r6"
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
					    "RB_InformationAffected_r6"
					)
				    )
				)
			    ),
			    "rb-InformationAffectedList",
			    4,
			    3,
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
					"rrc.informationelements",
					"DL_CounterSynchronisationInfo_r5"
				    ),
				    new QName (
					"InformationElements",
					"DL-CounterSynchronisationInfo-r5"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CounterSynchronisationInfo_r5"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CounterSynchronisationInfo_r5"
					)
				    ),
				    0
				)
			    ),
			    "dl-CounterSynchronisationInfo",
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
			    6,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8007
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
			    7,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x8008
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_DeletedTransChInfoList_r6"
				    ),
				    new QName (
					"InformationElements",
					"UL-DeletedTransChInfoList-r6"
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
					    "UL_TransportChannelIdentity_r6"
					)
				    )
				)
			    ),
			    "ul-deletedTransChInfoList",
			    8,
			    3,
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
					"rrc.informationelements",
					"UL_AddReconfTransChInfoList_r6"
				    ),
				    new QName (
					"InformationElements",
					"UL-AddReconfTransChInfoList-r6"
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
					    "UL_AddReconfTransChInformation_r6"
					)
				    )
				)
			    ),
			    "ul-AddReconfTransChInfoList",
			    9,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x800a
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
			    10,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x800b
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_DeletedTransChInfoList_r5"
				    ),
				    new QName (
					"InformationElements",
					"DL-DeletedTransChInfoList-r5"
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
					    "DL_TransportChannelIdentity_r5"
					)
				    )
				)
			    ),
			    "dl-DeletedTransChInfoList",
			    11,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x800c
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_AddReconfTransChInfoList_r5"
				    ),
				    new QName (
					"InformationElements",
					"DL-AddReconfTransChInfoList-r5"
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
					    "DL_AddReconfTransChInformation_r5"
					)
				    )
				)
			    ),
			    "dl-AddReconfTransChInfoList",
			    12,
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
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
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
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
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
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800b, 11),
				new TagDecoderElement((short)0x800c, 12)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800c, 12)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Complete object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Complete

	// Methods for field "dummy"
	public static SpecificationMode createSpecificationModeWithDummy(Dummy dummy)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setDummy(dummy);
	    return __object;
	}
	
	public boolean hasDummy()
	{
	    return getChosenFlag() == dummy_chosen;
	}
	
	public void setDummy(Dummy dummy)
	{
	    setChosenValue(dummy);
	    setChosenFlag(dummy_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Dummy from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Dummy extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Dummy()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Dummy(rrc.informationelements.RAB_Info_r6 rab_Info, 
			    rrc.informationelements.DefaultConfigMode defaultConfigMode, 
			    rrc.informationelements.DefaultConfigIdentity_r6 defaultConfigIdentity, 
			    rrc.informationelements.RB_InformationChangedList_r6 rb_InformationChangedList, 
			    rrc.informationelements.PowerOffsetInfoShort powerOffsetInfoShort)
	    {
		setRab_Info(rab_Info);
		setDefaultConfigMode(defaultConfigMode);
		setDefaultConfigIdentity(defaultConfigIdentity);
		setRb_InformationChangedList(rb_InformationChangedList);
		setPowerOffsetInfoShort(powerOffsetInfoShort);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Dummy(rrc.informationelements.RAB_Info_r6 rab_Info, 
			    rrc.informationelements.DefaultConfigMode defaultConfigMode, 
			    rrc.informationelements.DefaultConfigIdentity_r6 defaultConfigIdentity, 
			    rrc.informationelements.PowerOffsetInfoShort powerOffsetInfoShort)
	    {
		setRab_Info(rab_Info);
		setDefaultConfigMode(defaultConfigMode);
		setDefaultConfigIdentity(defaultConfigIdentity);
		setPowerOffsetInfoShort(powerOffsetInfoShort);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.RAB_Info_r6();
		mComponents[1] = rrc.informationelements.DefaultConfigMode.fdd;
		mComponents[2] = new rrc.informationelements.DefaultConfigIdentity_r6();
		mComponents[3] = new rrc.informationelements.RB_InformationChangedList_r6();
		mComponents[4] = new rrc.informationelements.PowerOffsetInfoShort();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[5];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.RAB_Info_r6();
		    case 1:
			return rrc.informationelements.DefaultConfigMode.fdd;
		    case 2:
			return new rrc.informationelements.DefaultConfigIdentity_r6();
		    case 3:
			return new rrc.informationelements.RB_InformationChangedList_r6();
		    case 4:
			return new rrc.informationelements.PowerOffsetInfoShort();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rab_Info"
	    public rrc.informationelements.RAB_Info_r6 getRab_Info()
	    {
		return (rrc.informationelements.RAB_Info_r6)mComponents[0];
	    }
	    
	    public void setRab_Info(rrc.informationelements.RAB_Info_r6 rab_Info)
	    {
		mComponents[0] = rab_Info;
	    }
	    
	    
	    // Methods for field "defaultConfigMode"
	    public rrc.informationelements.DefaultConfigMode getDefaultConfigMode()
	    {
		return (rrc.informationelements.DefaultConfigMode)mComponents[1];
	    }
	    
	    public void setDefaultConfigMode(rrc.informationelements.DefaultConfigMode defaultConfigMode)
	    {
		mComponents[1] = defaultConfigMode;
	    }
	    
	    
	    // Methods for field "defaultConfigIdentity"
	    public rrc.informationelements.DefaultConfigIdentity_r6 getDefaultConfigIdentity()
	    {
		return (rrc.informationelements.DefaultConfigIdentity_r6)mComponents[2];
	    }
	    
	    public void setDefaultConfigIdentity(rrc.informationelements.DefaultConfigIdentity_r6 defaultConfigIdentity)
	    {
		mComponents[2] = defaultConfigIdentity;
	    }
	    
	    
	    // Methods for field "rb_InformationChangedList"
	    public rrc.informationelements.RB_InformationChangedList_r6 getRb_InformationChangedList()
	    {
		return (rrc.informationelements.RB_InformationChangedList_r6)mComponents[3];
	    }
	    
	    public void setRb_InformationChangedList(rrc.informationelements.RB_InformationChangedList_r6 rb_InformationChangedList)
	    {
		mComponents[3] = rb_InformationChangedList;
	    }
	    
	    public boolean hasRb_InformationChangedList()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRb_InformationChangedList()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "powerOffsetInfoShort"
	    public rrc.informationelements.PowerOffsetInfoShort getPowerOffsetInfoShort()
	    {
		return (rrc.informationelements.PowerOffsetInfoShort)mComponents[4];
	    }
	    
	    public void setPowerOffsetInfoShort(rrc.informationelements.PowerOffsetInfoShort powerOffsetInfoShort)
	    {
		mComponents[4] = powerOffsetInfoShort;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.pdu_definitions",
		    "RadioBearerSetup_r6_IEs$SpecificationMode$Dummy"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"RAB_Info_r6"
				    ),
				    new QName (
					"InformationElements",
					"RAB-Info-r6"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_r6"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_r6"
					)
				    ),
				    0
				)
			    ),
			    "rab-Info",
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
					"rrc.informationelements",
					"DefaultConfigMode"
				    ),
				    new QName (
					"InformationElements",
					"DefaultConfigMode"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"fdd",
						0
					    ),
					    new MemberListElement (
						"tdd",
						1
					    )
					}
				    ),
				    0,
				    rrc.informationelements.DefaultConfigMode.fdd
				)
			    ),
			    "defaultConfigMode",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DefaultConfigIdentity_r6"
				    ),
				    new QName (
					"InformationElements",
					"DefaultConfigIdentity-r6"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.DefaultConfigIdentity_r6(0), 
					    new rrc.informationelements.DefaultConfigIdentity_r6(31),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(31)
				    ),
				    null
				)
			    ),
			    "defaultConfigIdentity",
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
					"rrc.informationelements",
					"RB_InformationChangedList_r6"
				    ),
				    new QName (
					"InformationElements",
					"RB-InformationChangedList-r6"
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
					    "RB_InformationChanged_r6"
					)
				    )
				)
			    ),
			    "rb-InformationChangedList",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PowerOffsetInfoShort"
				    ),
				    new QName (
					"InformationElements",
					"PowerOffsetInfoShort"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PowerOffsetInfoShort"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PowerOffsetInfoShort"
					)
				    ),
				    0
				)
			    ),
			    "powerOffsetInfoShort",
			    4,
			    2,
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
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4)
			    }
			)
		    }
		),
		0
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

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case complete_chosen:
		    return new Complete();
		case dummy_chosen:
		    return new Dummy();
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
		    (short)0x800d
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerSetup_r6_IEs$SpecificationMode"
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
				"rrc.pdu_definitions",
				"RadioBearerSetup_r6_IEs$SpecificationMode$Complete"
			    )
			),
			"complete",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"RadioBearerSetup_r6_IEs$SpecificationMode$Dummy"
			    )
			),
			"dummy",
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
	 * Get the type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SpecificationMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SpecificationMode

    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[14];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[14] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(14);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[15];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[15] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(15);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "ul_DPCH_Info"
    public rrc.informationelements.UL_DPCH_Info_r6 getUl_DPCH_Info()
    {
	return (rrc.informationelements.UL_DPCH_Info_r6)mComponents[16];
    }
    
    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r6 ul_DPCH_Info)
    {
	mComponents[16] = ul_DPCH_Info;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return componentIsPresent(16);
    }
    
    public void deleteUl_DPCH_Info()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public rrc.informationelements.UL_EDCH_Information_r6 getUl_EDCH_Information()
    {
	return (rrc.informationelements.UL_EDCH_Information_r6)mComponents[17];
    }
    
    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_r6 ul_EDCH_Information)
    {
	mComponents[17] = ul_EDCH_Information;
    }
    
    public boolean hasUl_EDCH_Information()
    {
	return componentIsPresent(17);
    }
    
    public void deleteUl_EDCH_Information()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information_r6 getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information_r6)mComponents[18];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r6 dl_HSPDSCH_Information)
    {
	mComponents[18] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(18);
    }
    
    public void deleteDl_HSPDSCH_Information()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r6 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r6)mComponents[19];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r6 dl_CommonInformation)
    {
	mComponents[19] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(19);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r6 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r6)mComponents[20];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r6 dl_InformationPerRL_List)
    {
	mComponents[20] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(20);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[21];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[21] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(21);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(21);
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
	    "rrc.pdu_definitions",
	    "RadioBearerSetup_r6_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerSetup-r6-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntegrityProtectionModeInfo"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionModeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo"
				)
			    ),
			    0
			)
		    ),
		    "integrityProtectionModeInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CipheringModeInfo"
			    ),
			    new QName (
				"InformationElements",
				"CipheringModeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo"
				)
			    ),
			    0
			)
		    ),
		    "cipheringModeInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTime",
		    2,
		    3,
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
		    "new-U-RNTI",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "new-C-RNTI",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DSCH_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"DSCH-RNTI"
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
		    "new-DSCH-RNTI",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"H_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"H-RNTI"
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
		    "new-H-RNTI",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
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
		    "newPrimary-E-RNTI",
		    7,
		    3,
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
				"rrc.informationelements",
				"E_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"E-RNTI"
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
		    "newSecondary-E-RNTI",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_StateIndicator"
			    ),
			    new QName (
				"InformationElements",
				"RRC-StateIndicator"
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
			    rrc.informationelements.RRC_StateIndicator.cell_DCH
			)
		    ),
		    "rrc-StateIndicator",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UTRAN_DRX_CycleLengthCoefficient"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-DRX-CycleLengthCoefficient"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient(3), 
				    new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "utran-DRX-CycleLengthCoeff",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    11,
		    3,
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
				"rrc.informationelements",
				"CN_InformationInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"CN-InformationInfo-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo_r6"
				)
			    ),
			    0
			)
		    ),
		    "cn-InformationInfo",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerSetup_r6_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxAllowedUL_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"MaxAllowedUL-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxAllowedUL_TX_Power(-50), 
				    new rrc.informationelements.MaxAllowedUL_TX_Power(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "maxAllowedUL-TX-Power",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DPCH_Info_r6"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-Info-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_Info_r6"
				)
			    ),
			    0
			)
		    ),
		    "ul-DPCH-Info",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_EDCH_Information_r6"
			    ),
			    new QName (
				"InformationElements",
				"UL-EDCH-Information-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r6"
				)
			    ),
			    0
			)
		    ),
		    "ul-EDCH-Information",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_HSPDSCH_Information_r6"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r6"
				)
			    ),
			    0
			)
		    ),
		    "dl-HSPDSCH-Information",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonInformation_r6"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r6"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
		    19,
		    3,
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
				"DL_InformationPerRL_List_r6"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-r6"
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
				    "DL_InformationPerRL_r6"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_PL_ServiceRestrictInfo_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-PL-ServiceRestrictInfo-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"true",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true
			)
		    ),
		    "mbms-PL-ServiceRestrictInfo",
		    21,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
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
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
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
			new TagDecoderElement((short)0x8015, 21)
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
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerSetup_r6_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerSetup_r6_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerSetup_r6_IEs
