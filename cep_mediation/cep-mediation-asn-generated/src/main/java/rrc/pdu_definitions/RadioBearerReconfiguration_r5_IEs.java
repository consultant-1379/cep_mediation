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
 * Define the ASN1 Type RadioBearerReconfiguration_r5_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerReconfiguration_r5_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerReconfiguration_r5_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerReconfiguration_r5_IEs(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.CN_InformationInfo cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_ChannelRequirement_r5 ul_ChannelRequirement, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo, 
		    rrc.informationelements.DL_HSPDSCH_Information dl_HSPDSCH_Information, 
		    rrc.informationelements.DL_CommonInformation_r5 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r5 dl_InformationPerRL_List)
    {
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setActivationTime(activationTime);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setNew_DSCH_RNTI(new_DSCH_RNTI);
	setNew_H_RNTI(new_H_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setCn_InformationInfo(cn_InformationInfo);
	setUra_Identity(ura_Identity);
	setSpecificationMode(specificationMode);
	setFrequencyInfo(frequencyInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_ChannelRequirement(ul_ChannelRequirement);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
	setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
    }
    
    /**
     * Construct with required components.
     */
    public RadioBearerReconfiguration_r5_IEs(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    SpecificationMode specificationMode, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	setRrc_StateIndicator(rrc_StateIndicator);
	setSpecificationMode(specificationMode);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
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
	mComponents[7] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[8] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	mComponents[9] = new rrc.informationelements.CN_InformationInfo();
	mComponents[10] = new rrc.informationelements.URA_Identity();
	mComponents[11] = new SpecificationMode();
	mComponents[12] = new rrc.informationelements.FrequencyInfo();
	mComponents[13] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[14] = new rrc.informationelements.UL_ChannelRequirement_r5();
	mComponents[15] = new ModeSpecificPhysChInfo();
	mComponents[16] = new rrc.informationelements.DL_HSPDSCH_Information();
	mComponents[17] = new rrc.informationelements.DL_CommonInformation_r5();
	mComponents[18] = new rrc.informationelements.DL_InformationPerRL_List_r5();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[19];
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
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 8:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	    case 9:
		return new rrc.informationelements.CN_InformationInfo();
	    case 10:
		return new rrc.informationelements.URA_Identity();
	    case 11:
		return new SpecificationMode();
	    case 12:
		return new rrc.informationelements.FrequencyInfo();
	    case 13:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 14:
		return new rrc.informationelements.UL_ChannelRequirement_r5();
	    case 15:
		return new ModeSpecificPhysChInfo();
	    case 16:
		return new rrc.informationelements.DL_HSPDSCH_Information();
	    case 17:
		return new rrc.informationelements.DL_CommonInformation_r5();
	    case 18:
		return new rrc.informationelements.DL_InformationPerRL_List_r5();
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
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[7];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[7] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient)mComponents[8];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff)
    {
	mComponents[8] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo)mComponents[9];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo cn_InformationInfo)
    {
	mComponents[9] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(9);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[10];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[10] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(10);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[11];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[11] = specificationMode;
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
	public static final  int  preconfiguration_chosen = 2;
	
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
	    public Complete(rrc.informationelements.RAB_InformationReconfigList rab_InformationReconfigList, 
			    rrc.informationelements.RB_InformationReconfigList_r5 rb_InformationReconfigList, 
			    rrc.informationelements.RB_InformationAffectedList_r5 rb_InformationAffectedList, 
			    rrc.informationelements.RB_PDCPContextRelocationList rb_PDCPContextRelocationList, 
			    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
			    rrc.informationelements.UL_DeletedTransChInfoList ul_deletedTransChInfoList, 
			    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
			    Dummy dummy, 
			    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
			    rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList, 
			    rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList)
	    {
		setRab_InformationReconfigList(rab_InformationReconfigList);
		setRb_InformationReconfigList(rb_InformationReconfigList);
		setRb_InformationAffectedList(rb_InformationAffectedList);
		setRb_PDCPContextRelocationList(rb_PDCPContextRelocationList);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_deletedTransChInfoList(ul_deletedTransChInfoList);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDummy(dummy);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_DeletedTransChInfoList(dl_DeletedTransChInfoList);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.RAB_InformationReconfigList();
		mComponents[1] = new rrc.informationelements.RB_InformationReconfigList_r5();
		mComponents[2] = new rrc.informationelements.RB_InformationAffectedList_r5();
		mComponents[3] = new rrc.informationelements.RB_PDCPContextRelocationList();
		mComponents[4] = new rrc.informationelements.UL_CommonTransChInfo_r4();
		mComponents[5] = new rrc.informationelements.UL_DeletedTransChInfoList();
		mComponents[6] = new rrc.informationelements.UL_AddReconfTransChInfoList();
		mComponents[7] = new Dummy();
		mComponents[8] = new rrc.informationelements.DL_CommonTransChInfo_r4();
		mComponents[9] = new rrc.informationelements.DL_DeletedTransChInfoList_r5();
		mComponents[10] = new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[11];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.RAB_InformationReconfigList();
		    case 1:
			return new rrc.informationelements.RB_InformationReconfigList_r5();
		    case 2:
			return new rrc.informationelements.RB_InformationAffectedList_r5();
		    case 3:
			return new rrc.informationelements.RB_PDCPContextRelocationList();
		    case 4:
			return new rrc.informationelements.UL_CommonTransChInfo_r4();
		    case 5:
			return new rrc.informationelements.UL_DeletedTransChInfoList();
		    case 6:
			return new rrc.informationelements.UL_AddReconfTransChInfoList();
		    case 7:
			return new Dummy();
		    case 8:
			return new rrc.informationelements.DL_CommonTransChInfo_r4();
		    case 9:
			return new rrc.informationelements.DL_DeletedTransChInfoList_r5();
		    case 10:
			return new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rab_InformationReconfigList"
	    public rrc.informationelements.RAB_InformationReconfigList getRab_InformationReconfigList()
	    {
		return (rrc.informationelements.RAB_InformationReconfigList)mComponents[0];
	    }
	    
	    public void setRab_InformationReconfigList(rrc.informationelements.RAB_InformationReconfigList rab_InformationReconfigList)
	    {
		mComponents[0] = rab_InformationReconfigList;
	    }
	    
	    public boolean hasRab_InformationReconfigList()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteRab_InformationReconfigList()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "rb_InformationReconfigList"
	    public rrc.informationelements.RB_InformationReconfigList_r5 getRb_InformationReconfigList()
	    {
		return (rrc.informationelements.RB_InformationReconfigList_r5)mComponents[1];
	    }
	    
	    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList_r5 rb_InformationReconfigList)
	    {
		mComponents[1] = rb_InformationReconfigList;
	    }
	    
	    public boolean hasRb_InformationReconfigList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRb_InformationReconfigList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "rb_InformationAffectedList"
	    public rrc.informationelements.RB_InformationAffectedList_r5 getRb_InformationAffectedList()
	    {
		return (rrc.informationelements.RB_InformationAffectedList_r5)mComponents[2];
	    }
	    
	    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList_r5 rb_InformationAffectedList)
	    {
		mComponents[2] = rb_InformationAffectedList;
	    }
	    
	    public boolean hasRb_InformationAffectedList()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteRb_InformationAffectedList()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rb_PDCPContextRelocationList"
	    public rrc.informationelements.RB_PDCPContextRelocationList getRb_PDCPContextRelocationList()
	    {
		return (rrc.informationelements.RB_PDCPContextRelocationList)mComponents[3];
	    }
	    
	    public void setRb_PDCPContextRelocationList(rrc.informationelements.RB_PDCPContextRelocationList rb_PDCPContextRelocationList)
	    {
		mComponents[3] = rb_PDCPContextRelocationList;
	    }
	    
	    public boolean hasRb_PDCPContextRelocationList()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRb_PDCPContextRelocationList()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "ul_CommonTransChInfo"
	    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
	    {
		return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[4];
	    }
	    
	    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
	    {
		mComponents[4] = ul_CommonTransChInfo;
	    }
	    
	    public boolean hasUl_CommonTransChInfo()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteUl_CommonTransChInfo()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "ul_deletedTransChInfoList"
	    public rrc.informationelements.UL_DeletedTransChInfoList getUl_deletedTransChInfoList()
	    {
		return (rrc.informationelements.UL_DeletedTransChInfoList)mComponents[5];
	    }
	    
	    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList ul_deletedTransChInfoList)
	    {
		mComponents[5] = ul_deletedTransChInfoList;
	    }
	    
	    public boolean hasUl_deletedTransChInfoList()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteUl_deletedTransChInfoList()
	    {
		setComponentAbsent(5);
	    }
	    
	    
	    // Methods for field "ul_AddReconfTransChInfoList"
	    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[6];
	    }
	    
	    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList)
	    {
		mComponents[6] = ul_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasUl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(6);
	    }
	    
	    public void deleteUl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(6);
	    }
	    
	    
	    // Methods for field "dummy"
	    public Dummy getDummy()
	    {
		return (Dummy)mComponents[7];
	    }
	    
	    public void setDummy(Dummy dummy)
	    {
		mComponents[7] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(7);
	    }
	    
	    public void deleteDummy()
	    {
		setComponentAbsent(7);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Dummy from ASN1 Module PDU_definitions.
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
		 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete$Dummy$Fdd"
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
			    (short)0x8007
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete$Dummy"
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
					"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete$Dummy$Fdd"
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
		return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[8];
	    }
	    
	    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
	    {
		mComponents[8] = dl_CommonTransChInfo;
	    }
	    
	    public boolean hasDl_CommonTransChInfo()
	    {
		return componentIsPresent(8);
	    }
	    
	    public void deleteDl_CommonTransChInfo()
	    {
		setComponentAbsent(8);
	    }
	    
	    
	    // Methods for field "dl_DeletedTransChInfoList"
	    public rrc.informationelements.DL_DeletedTransChInfoList_r5 getDl_DeletedTransChInfoList()
	    {
		return (rrc.informationelements.DL_DeletedTransChInfoList_r5)mComponents[9];
	    }
	    
	    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList)
	    {
		mComponents[9] = dl_DeletedTransChInfoList;
	    }
	    
	    public boolean hasDl_DeletedTransChInfoList()
	    {
		return componentIsPresent(9);
	    }
	    
	    public void deleteDl_DeletedTransChInfoList()
	    {
		setComponentAbsent(9);
	    }
	    
	    
	    // Methods for field "dl_AddReconfTransChInfoList"
	    public rrc.informationelements.DL_AddReconfTransChInfoList_r5 getDl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.DL_AddReconfTransChInfoList_r5)mComponents[10];
	    }
	    
	    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList)
	    {
		mComponents[10] = dl_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasDl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(10);
	    }
	    
	    public void deleteDl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(10);
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
		    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete"
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
					"RB_InformationReconfigList_r5"
				    ),
				    new QName (
					"InformationElements",
					"RB-InformationReconfigList-r5"
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
					    "RB_InformationReconfig_r5"
					)
				    )
				)
			    ),
			    "rb-InformationReconfigList",
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
					"RB_InformationAffectedList_r5"
				    ),
				    new QName (
					"InformationElements",
					"RB-InformationAffectedList-r5"
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
					    "RB_InformationAffected_r5"
					)
				    )
				)
			    ),
			    "rb-InformationAffectedList",
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
					"RB_PDCPContextRelocationList"
				    ),
				    new QName (
					"InformationElements",
					"RB-PDCPContextRelocationList"
				    ),
				    12314,
				    new SizeConstraint (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(1), 
						new com.oss.asn1.INTEGER(27),
						0
					    )
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(27)
				    ),
				    new TypeInfoRef (
					new QName (
					    "rrc.informationelements",
					    "RB_PDCPContextRelocation"
					)
				    )
				)
			    ),
			    "rb-PDCPContextRelocationList",
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
					"rrc.informationelements",
					"UL_DeletedTransChInfoList"
				    ),
				    new QName (
					"InformationElements",
					"UL-DeletedTransChInfoList"
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
					    "UL_TransportChannelIdentity"
					)
				    )
				)
			    ),
			    "ul-deletedTransChInfoList",
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
			    "ul-AddReconfTransChInfoList",
			    6,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete$Dummy"
				)
			    ),
			    "dummy",
			    7,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8008
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
			    9,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ContainerInfo (
				    new Tags (
					new short[] {
					    (short)0x800a
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
			    10,
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
				new TagDecoderElement((short)0x800a, 10)
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
				new TagDecoderElement((short)0x800a, 10)
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
				new TagDecoderElement((short)0x800a, 10)
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
				new TagDecoderElement((short)0x800a, 10)
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
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5),
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800a, 10)
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

	// Methods for field "preconfiguration"
	public static SpecificationMode createSpecificationModeWithPreconfiguration(Preconfiguration preconfiguration)
	{
	    SpecificationMode __object = new SpecificationMode();

	    __object.setPreconfiguration(preconfiguration);
	    return __object;
	}
	
	public boolean hasPreconfiguration()
	{
	    return getChosenFlag() == preconfiguration_chosen;
	}
	
	public void setPreconfiguration(Preconfiguration preconfiguration)
	{
	    setChosenValue(preconfiguration);
	    setChosenFlag(preconfiguration_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Preconfiguration from ASN1 Module PDU_definitions.
	 * @see Sequence
	 */
	public static class Preconfiguration extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Preconfiguration()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Preconfiguration(PreConfigMode preConfigMode)
	    {
		setPreConfigMode(preConfigMode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PreConfigMode();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new PreConfigMode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "preConfigMode"
	    public PreConfigMode getPreConfigMode()
	    {
		return (PreConfigMode)mComponents[0];
	    }
	    
	    public void setPreConfigMode(PreConfigMode preConfigMode)
	    {
		mComponents[0] = preConfigMode;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type PreConfigMode from ASN1 Module PDU_definitions.
	     * @see Choice
	     */
	    public static class PreConfigMode extends Choice {
		
		/**
		 * The default constructor.
		 */
		public PreConfigMode()
		{
		}
		
		public static final  int  predefinedConfigIdentity_chosen = 1;
		public static final  int  defaultConfig_chosen = 2;
		
		// Methods for field "predefinedConfigIdentity"
		public static PreConfigMode createPreConfigModeWithPredefinedConfigIdentity(long predefinedConfigIdentity)
		{
		    return createPreConfigModeWithPredefinedConfigIdentity(new rrc.informationelements.PredefinedConfigIdentity(predefinedConfigIdentity));
		}
		
		public static PreConfigMode createPreConfigModeWithPredefinedConfigIdentity(rrc.informationelements.PredefinedConfigIdentity predefinedConfigIdentity)
		{
		    PreConfigMode __object = new PreConfigMode();

		    __object.setPredefinedConfigIdentity(predefinedConfigIdentity);
		    return __object;
		}
		
		public boolean hasPredefinedConfigIdentity()
		{
		    return getChosenFlag() == predefinedConfigIdentity_chosen;
		}
		
		public void setPredefinedConfigIdentity(long predefinedConfigIdentity)
		{
		    setPredefinedConfigIdentity(new rrc.informationelements.PredefinedConfigIdentity(predefinedConfigIdentity));
		}
		
		public void setPredefinedConfigIdentity(rrc.informationelements.PredefinedConfigIdentity predefinedConfigIdentity)
		{
		    setChosenValue(predefinedConfigIdentity);
		    setChosenFlag(predefinedConfigIdentity_chosen);
		}
		
		
		// Methods for field "defaultConfig"
		public static PreConfigMode createPreConfigModeWithDefaultConfig(DefaultConfig defaultConfig)
		{
		    PreConfigMode __object = new PreConfigMode();

		    __object.setDefaultConfig(defaultConfig);
		    return __object;
		}
		
		public boolean hasDefaultConfig()
		{
		    return getChosenFlag() == defaultConfig_chosen;
		}
		
		public void setDefaultConfig(DefaultConfig defaultConfig)
		{
		    setChosenValue(defaultConfig);
		    setChosenFlag(defaultConfig_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type DefaultConfig from ASN1 Module PDU_definitions.
		 * @see Sequence
		 */
		public static class DefaultConfig extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public DefaultConfig()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public DefaultConfig(rrc.informationelements.DefaultConfigMode defaultConfigMode, 
				    rrc.informationelements.DefaultConfigIdentity_r5 defaultConfigIdentity)
		    {
			setDefaultConfigMode(defaultConfigMode);
			setDefaultConfigIdentity(defaultConfigIdentity);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = rrc.informationelements.DefaultConfigMode.fdd;
			mComponents[1] = new rrc.informationelements.DefaultConfigIdentity_r5();
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
				return rrc.informationelements.DefaultConfigMode.fdd;
			    case 1:
				return new rrc.informationelements.DefaultConfigIdentity_r5();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "defaultConfigMode"
		    public rrc.informationelements.DefaultConfigMode getDefaultConfigMode()
		    {
			return (rrc.informationelements.DefaultConfigMode)mComponents[0];
		    }
		    
		    public void setDefaultConfigMode(rrc.informationelements.DefaultConfigMode defaultConfigMode)
		    {
			mComponents[0] = defaultConfigMode;
		    }
		    
		    
		    // Methods for field "defaultConfigIdentity"
		    public rrc.informationelements.DefaultConfigIdentity_r5 getDefaultConfigIdentity()
		    {
			return (rrc.informationelements.DefaultConfigIdentity_r5)mComponents[1];
		    }
		    
		    public void setDefaultConfigIdentity(rrc.informationelements.DefaultConfigIdentity_r5 defaultConfigIdentity)
		    {
			mComponents[1] = defaultConfigIdentity;
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
			    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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
					new EnumeratedInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
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
				    0,
				    2,
				    null
				),
				new SequenceFieldInfo (
				    new TypeInfoRef (
					new IntegerInfo (
					    new Tags (
						new short[] {
						    (short)0x8001
						}
					    ),
					    new QName (
						"rrc.informationelements",
						"DefaultConfigIdentity_r5"
					    ),
					    new QName (
						"InformationElements",
						"DefaultConfigIdentity-r5"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new rrc.informationelements.DefaultConfigIdentity_r5(0), 
						    new rrc.informationelements.DefaultConfigIdentity_r5(13),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(0),
						new java.lang.Long(13)
					    ),
					    null
					)
				    ),
				    "defaultConfigIdentity",
				    1,
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
				)
			    }
			),
			0
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' DefaultConfig object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' DefaultConfig object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for DefaultConfig

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case predefinedConfigIdentity_chosen:
			    return new rrc.informationelements.PredefinedConfigIdentity();
			case defaultConfig_chosen:
			    return new DefaultConfig();
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
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
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
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "PredefinedConfigIdentity"
					),
					new QName (
					    "InformationElements",
					    "PredefinedConfigIdentity"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new rrc.informationelements.PredefinedConfigIdentity(0), 
						new rrc.informationelements.PredefinedConfigIdentity(15),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(15)
					),
					null
				    )
				),
				"predefinedConfigIdentity",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
				    )
				),
				"defaultConfig",
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
		 * Get the type descriptor (TypeInfo) of 'this' PreConfigMode object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' PreConfigMode object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for PreConfigMode

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
		    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration"
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
				new QName (
				    "rrc.pdu_definitions",
				    "RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
				)
			    ),
			    "preConfigMode",
			    0,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Preconfiguration object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Preconfiguration object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Preconfiguration

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case complete_chosen:
		    return new Complete();
		case preconfiguration_chosen:
		    return new Preconfiguration();
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
		    (short)0x800b
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfiguration_r5_IEs$SpecificationMode"
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
				"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Complete"
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
				"RadioBearerReconfiguration_r5_IEs$SpecificationMode$Preconfiguration"
			    )
			),
			"preconfiguration",
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
	return (rrc.informationelements.FrequencyInfo)mComponents[12];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[12] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(12);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[13];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[13] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(13);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "ul_ChannelRequirement"
    public rrc.informationelements.UL_ChannelRequirement_r5 getUl_ChannelRequirement()
    {
	return (rrc.informationelements.UL_ChannelRequirement_r5)mComponents[14];
    }
    
    public void setUl_ChannelRequirement(rrc.informationelements.UL_ChannelRequirement_r5 ul_ChannelRequirement)
    {
	mComponents[14] = ul_ChannelRequirement;
    }
    
    public boolean hasUl_ChannelRequirement()
    {
	return componentIsPresent(14);
    }
    
    public void deleteUl_ChannelRequirement()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "modeSpecificPhysChInfo"
    public ModeSpecificPhysChInfo getModeSpecificPhysChInfo()
    {
	return (ModeSpecificPhysChInfo)mComponents[15];
    }
    
    public void setModeSpecificPhysChInfo(ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	mComponents[15] = modeSpecificPhysChInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificPhysChInfo from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class ModeSpecificPhysChInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificPhysChInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificPhysChInfo createModeSpecificPhysChInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificPhysChInfo __object = new ModeSpecificPhysChInfo();

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
	 * Define the ASN1 Type Fdd from ASN1 Module PDU_definitions.
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
	    public Fdd(rrc.informationelements.DL_PDSCH_Information dummy)
	    {
		setDummy(dummy);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.DL_PDSCH_Information();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[1];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.DL_PDSCH_Information();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy"
	    public rrc.informationelements.DL_PDSCH_Information getDummy()
	    {
		return (rrc.informationelements.DL_PDSCH_Information)mComponents[0];
	    }
	    
	    public void setDummy(rrc.informationelements.DL_PDSCH_Information dummy)
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
		    "RadioBearerReconfiguration_r5_IEs$ModeSpecificPhysChInfo$Fdd"
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
					"DL_PDSCH_Information"
				    ),
				    new QName (
					"InformationElements",
					"DL-PDSCH-Information"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_PDSCH_Information"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_PDSCH_Information"
					)
				    ),
				    0
				)
			    ),
			    "dummy",
			    0,
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
	public static ModeSpecificPhysChInfo createModeSpecificPhysChInfoWithTdd(Null tdd)
	{
	    ModeSpecificPhysChInfo __object = new ModeSpecificPhysChInfo();

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
		    (short)0x800f
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfiguration_r5_IEs$ModeSpecificPhysChInfo"
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
				"RadioBearerReconfiguration_r5_IEs$ModeSpecificPhysChInfo$Fdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificPhysChInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificPhysChInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificPhysChInfo

    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information)mComponents[16];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information dl_HSPDSCH_Information)
    {
	mComponents[16] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(16);
    }
    
    public void deleteDl_HSPDSCH_Information()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r5 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r5)mComponents[17];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r5 dl_CommonInformation)
    {
	mComponents[17] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(17);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r5 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r5)mComponents[18];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r5 dl_InformationPerRL_List)
    {
	mComponents[18] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(18);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(18);
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
	    "RadioBearerReconfiguration_r5_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerReconfiguration-r5-IEs"
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				"CN_InformationInfo"
			    ),
			    new QName (
				"InformationElements",
				"CN-InformationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CN_InformationInfo"
				)
			    ),
			    0
			)
		    ),
		    "cn-InformationInfo",
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
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_r5_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
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
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_ChannelRequirement_r5"
			    ),
			    new QName (
				"InformationElements",
				"UL-ChannelRequirement-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_ChannelRequirement_r5"
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
		    "ul-ChannelRequirement",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_r5_IEs$ModeSpecificPhysChInfo"
			)
		    ),
		    "modeSpecificPhysChInfo",
		    15,
		    2,
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
				"DL_HSPDSCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information"
				)
			    ),
			    0
			)
		    ),
		    "dl-HSPDSCH-Information",
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
				"DL_CommonInformation_r5"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r5"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
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
				"DL_InformationPerRL_List_r5"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-r5"
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
				    "DL_InformationPerRL_r5"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    18,
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
			new TagDecoderElement((short)0x8007, 7)
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
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_r5_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_r5_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerReconfiguration_r5_IEs
