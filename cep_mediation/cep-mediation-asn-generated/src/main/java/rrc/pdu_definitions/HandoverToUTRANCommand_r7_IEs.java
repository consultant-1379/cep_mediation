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
 * Define the ASN1 Type HandoverToUTRANCommand_r7_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverToUTRANCommand_r7_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverToUTRANCommand_r7_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverToUTRANCommand_r7_IEs(rrc.informationelements.U_RNTI_Short new_U_RNTI, 
		    rrc.informationelements.CipheringAlgorithm_r7 cipheringAlgorithm, 
		    BOOLEAN supportForChangeOfUE_Capability, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setNew_U_RNTI(new_U_RNTI);
	setCipheringAlgorithm(cipheringAlgorithm);
	setSupportForChangeOfUE_Capability(supportForChangeOfUE_Capability);
	setNew_H_RNTI(new_H_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setSpecificationMode(specificationMode);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    /**
     * Construct with components.
     */
    public HandoverToUTRANCommand_r7_IEs(rrc.informationelements.U_RNTI_Short new_U_RNTI, 
		    rrc.informationelements.CipheringAlgorithm_r7 cipheringAlgorithm, 
		    boolean supportForChangeOfUE_Capability, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	this(new_U_RNTI, cipheringAlgorithm, 
	     new BOOLEAN(supportForChangeOfUE_Capability), new_H_RNTI, 
	     newPrimary_E_RNTI, newSecondary_E_RNTI, specificationMode, 
	     maxAllowedUL_TX_Power);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverToUTRANCommand_r7_IEs(rrc.informationelements.U_RNTI_Short new_U_RNTI, 
		    boolean supportForChangeOfUE_Capability, 
		    SpecificationMode specificationMode, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	setNew_U_RNTI(new_U_RNTI);
	setSupportForChangeOfUE_Capability(supportForChangeOfUE_Capability);
	setSpecificationMode(specificationMode);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.U_RNTI_Short();
	mComponents[1] = rrc.informationelements.CipheringAlgorithm_r7.uea0;
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new rrc.informationelements.H_RNTI();
	mComponents[4] = new rrc.informationelements.E_RNTI();
	mComponents[5] = new rrc.informationelements.E_RNTI();
	mComponents[6] = new SpecificationMode();
	mComponents[7] = new rrc.informationelements.MaxAllowedUL_TX_Power();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.U_RNTI_Short();
	    case 1:
		return rrc.informationelements.CipheringAlgorithm_r7.uea0;
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new rrc.informationelements.H_RNTI();
	    case 4:
		return new rrc.informationelements.E_RNTI();
	    case 5:
		return new rrc.informationelements.E_RNTI();
	    case 6:
		return new SpecificationMode();
	    case 7:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI_Short getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI_Short)mComponents[0];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI_Short new_U_RNTI)
    {
	mComponents[0] = new_U_RNTI;
    }
    
    
    // Methods for field "cipheringAlgorithm"
    public rrc.informationelements.CipheringAlgorithm_r7 getCipheringAlgorithm()
    {
	return (rrc.informationelements.CipheringAlgorithm_r7)mComponents[1];
    }
    
    public void setCipheringAlgorithm(rrc.informationelements.CipheringAlgorithm_r7 cipheringAlgorithm)
    {
	mComponents[1] = cipheringAlgorithm;
    }
    
    public boolean hasCipheringAlgorithm()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCipheringAlgorithm()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "supportForChangeOfUE_Capability"
    public boolean getSupportForChangeOfUE_Capability()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setSupportForChangeOfUE_Capability(boolean supportForChangeOfUE_Capability)
    {
	setSupportForChangeOfUE_Capability(new BOOLEAN(supportForChangeOfUE_Capability));
    }
    
    public void setSupportForChangeOfUE_Capability(BOOLEAN supportForChangeOfUE_Capability)
    {
	mComponents[2] = supportForChangeOfUE_Capability;
    }
    
    
    // Methods for field "new_H_RNTI"
    public rrc.informationelements.H_RNTI getNew_H_RNTI()
    {
	return (rrc.informationelements.H_RNTI)mComponents[3];
    }
    
    public void setNew_H_RNTI(rrc.informationelements.H_RNTI new_H_RNTI)
    {
	mComponents[3] = new_H_RNTI;
    }
    
    public boolean hasNew_H_RNTI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNew_H_RNTI()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewPrimary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[4];
    }
    
    public void setNewPrimary_E_RNTI(rrc.informationelements.E_RNTI newPrimary_E_RNTI)
    {
	mComponents[4] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "newSecondary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewSecondary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[5];
    }
    
    public void setNewSecondary_E_RNTI(rrc.informationelements.E_RNTI newSecondary_E_RNTI)
    {
	mComponents[5] = newSecondary_E_RNTI;
    }
    
    public boolean hasNewSecondary_E_RNTI()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNewSecondary_E_RNTI()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[6];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[6] = specificationMode;
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
	    public Complete(rrc.informationelements.SRB_InformationSetupList_r7 srb_InformationSetupList, 
			    rrc.informationelements.RAB_InformationSetupList_r7 rab_InformationSetupList, 
			    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
			    rrc.informationelements.UL_AddReconfTransChInfoList_r7 ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
			    rrc.informationelements.DL_AddReconfTransChInfoList_r7 dl_AddReconfTransChInfoList, 
			    rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
			    rrc.informationelements.UL_EDCH_Information_r7 ul_EDCH_Information, 
			    rrc.informationelements.DL_HSPDSCH_Information_r7 dl_HSPDSCH_Information, 
			    rrc.informationelements.DL_CommonInformation_r7 dl_CommonInformation, 
			    rrc.informationelements.DL_InformationPerRL_List_r7 dl_InformationPerRL_List, 
			    rrc.informationelements.FrequencyInfo frequencyInfo, 
			    rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
	    {
		setSrb_InformationSetupList(srb_InformationSetupList);
		setRab_InformationSetupList(rab_InformationSetupList);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
		setUl_DPCH_Info(ul_DPCH_Info);
		setUl_EDCH_Information(ul_EDCH_Information);
		setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
		setDl_CommonInformation(dl_CommonInformation);
		setDl_InformationPerRL_List(dl_InformationPerRL_List);
		setFrequencyInfo(frequencyInfo);
		setMulti_frequencyInfo(multi_frequencyInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Complete(rrc.informationelements.SRB_InformationSetupList_r7 srb_InformationSetupList, 
			    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
			    rrc.informationelements.UL_AddReconfTransChInfoList_r7 ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
			    rrc.informationelements.DL_AddReconfTransChInfoList_r7 dl_AddReconfTransChInfoList, 
			    rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
			    rrc.informationelements.DL_CommonInformation_r7 dl_CommonInformation, 
			    rrc.informationelements.DL_InformationPerRL_List_r7 dl_InformationPerRL_List, 
			    rrc.informationelements.FrequencyInfo frequencyInfo)
	    {
		setSrb_InformationSetupList(srb_InformationSetupList);
		setUl_CommonTransChInfo(ul_CommonTransChInfo);
		setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
		setDl_CommonTransChInfo(dl_CommonTransChInfo);
		setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
		setUl_DPCH_Info(ul_DPCH_Info);
		setDl_CommonInformation(dl_CommonInformation);
		setDl_InformationPerRL_List(dl_InformationPerRL_List);
		setFrequencyInfo(frequencyInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.SRB_InformationSetupList_r7();
		mComponents[1] = new rrc.informationelements.RAB_InformationSetupList_r7();
		mComponents[2] = new rrc.informationelements.UL_CommonTransChInfo_r4();
		mComponents[3] = new rrc.informationelements.UL_AddReconfTransChInfoList_r7();
		mComponents[4] = new rrc.informationelements.DL_CommonTransChInfo_r4();
		mComponents[5] = new rrc.informationelements.DL_AddReconfTransChInfoList_r7();
		mComponents[6] = new rrc.informationelements.UL_DPCH_Info_r7();
		mComponents[7] = new rrc.informationelements.UL_EDCH_Information_r7();
		mComponents[8] = new rrc.informationelements.DL_HSPDSCH_Information_r7();
		mComponents[9] = new rrc.informationelements.DL_CommonInformation_r7();
		mComponents[10] = new rrc.informationelements.DL_InformationPerRL_List_r7();
		mComponents[11] = new rrc.informationelements.FrequencyInfo();
		mComponents[12] = new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
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
			return new rrc.informationelements.SRB_InformationSetupList_r7();
		    case 1:
			return new rrc.informationelements.RAB_InformationSetupList_r7();
		    case 2:
			return new rrc.informationelements.UL_CommonTransChInfo_r4();
		    case 3:
			return new rrc.informationelements.UL_AddReconfTransChInfoList_r7();
		    case 4:
			return new rrc.informationelements.DL_CommonTransChInfo_r4();
		    case 5:
			return new rrc.informationelements.DL_AddReconfTransChInfoList_r7();
		    case 6:
			return new rrc.informationelements.UL_DPCH_Info_r7();
		    case 7:
			return new rrc.informationelements.UL_EDCH_Information_r7();
		    case 8:
			return new rrc.informationelements.DL_HSPDSCH_Information_r7();
		    case 9:
			return new rrc.informationelements.DL_CommonInformation_r7();
		    case 10:
			return new rrc.informationelements.DL_InformationPerRL_List_r7();
		    case 11:
			return new rrc.informationelements.FrequencyInfo();
		    case 12:
			return new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "srb_InformationSetupList"
	    public rrc.informationelements.SRB_InformationSetupList_r7 getSrb_InformationSetupList()
	    {
		return (rrc.informationelements.SRB_InformationSetupList_r7)mComponents[0];
	    }
	    
	    public void setSrb_InformationSetupList(rrc.informationelements.SRB_InformationSetupList_r7 srb_InformationSetupList)
	    {
		mComponents[0] = srb_InformationSetupList;
	    }
	    
	    
	    // Methods for field "rab_InformationSetupList"
	    public rrc.informationelements.RAB_InformationSetupList_r7 getRab_InformationSetupList()
	    {
		return (rrc.informationelements.RAB_InformationSetupList_r7)mComponents[1];
	    }
	    
	    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList_r7 rab_InformationSetupList)
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
	    
	    
	    // Methods for field "ul_CommonTransChInfo"
	    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
	    {
		return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[2];
	    }
	    
	    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
	    {
		mComponents[2] = ul_CommonTransChInfo;
	    }
	    
	    
	    // Methods for field "ul_AddReconfTransChInfoList"
	    public rrc.informationelements.UL_AddReconfTransChInfoList_r7 getUl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.UL_AddReconfTransChInfoList_r7)mComponents[3];
	    }
	    
	    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r7 ul_AddReconfTransChInfoList)
	    {
		mComponents[3] = ul_AddReconfTransChInfoList;
	    }
	    
	    
	    // Methods for field "dl_CommonTransChInfo"
	    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
	    {
		return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[4];
	    }
	    
	    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
	    {
		mComponents[4] = dl_CommonTransChInfo;
	    }
	    
	    
	    // Methods for field "dl_AddReconfTransChInfoList"
	    public rrc.informationelements.DL_AddReconfTransChInfoList_r7 getDl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.DL_AddReconfTransChInfoList_r7)mComponents[5];
	    }
	    
	    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r7 dl_AddReconfTransChInfoList)
	    {
		mComponents[5] = dl_AddReconfTransChInfoList;
	    }
	    
	    
	    // Methods for field "ul_DPCH_Info"
	    public rrc.informationelements.UL_DPCH_Info_r7 getUl_DPCH_Info()
	    {
		return (rrc.informationelements.UL_DPCH_Info_r7)mComponents[6];
	    }
	    
	    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info)
	    {
		mComponents[6] = ul_DPCH_Info;
	    }
	    
	    
	    // Methods for field "ul_EDCH_Information"
	    public rrc.informationelements.UL_EDCH_Information_r7 getUl_EDCH_Information()
	    {
		return (rrc.informationelements.UL_EDCH_Information_r7)mComponents[7];
	    }
	    
	    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_r7 ul_EDCH_Information)
	    {
		mComponents[7] = ul_EDCH_Information;
	    }
	    
	    public boolean hasUl_EDCH_Information()
	    {
		return componentIsPresent(7);
	    }
	    
	    public void deleteUl_EDCH_Information()
	    {
		setComponentAbsent(7);
	    }
	    
	    
	    // Methods for field "dl_HSPDSCH_Information"
	    public rrc.informationelements.DL_HSPDSCH_Information_r7 getDl_HSPDSCH_Information()
	    {
		return (rrc.informationelements.DL_HSPDSCH_Information_r7)mComponents[8];
	    }
	    
	    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r7 dl_HSPDSCH_Information)
	    {
		mComponents[8] = dl_HSPDSCH_Information;
	    }
	    
	    public boolean hasDl_HSPDSCH_Information()
	    {
		return componentIsPresent(8);
	    }
	    
	    public void deleteDl_HSPDSCH_Information()
	    {
		setComponentAbsent(8);
	    }
	    
	    
	    // Methods for field "dl_CommonInformation"
	    public rrc.informationelements.DL_CommonInformation_r7 getDl_CommonInformation()
	    {
		return (rrc.informationelements.DL_CommonInformation_r7)mComponents[9];
	    }
	    
	    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r7 dl_CommonInformation)
	    {
		mComponents[9] = dl_CommonInformation;
	    }
	    
	    
	    // Methods for field "dl_InformationPerRL_List"
	    public rrc.informationelements.DL_InformationPerRL_List_r7 getDl_InformationPerRL_List()
	    {
		return (rrc.informationelements.DL_InformationPerRL_List_r7)mComponents[10];
	    }
	    
	    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r7 dl_InformationPerRL_List)
	    {
		mComponents[10] = dl_InformationPerRL_List;
	    }
	    
	    
	    // Methods for field "frequencyInfo"
	    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
	    {
		return (rrc.informationelements.FrequencyInfo)mComponents[11];
	    }
	    
	    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
	    {
		mComponents[11] = frequencyInfo;
	    }
	    
	    
	    // Methods for field "multi_frequencyInfo"
	    public rrc.informationelements.Multi_frequencyInfo_LCR_r7 getMulti_frequencyInfo()
	    {
		return (rrc.informationelements.Multi_frequencyInfo_LCR_r7)mComponents[12];
	    }
	    
	    public void setMulti_frequencyInfo(rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
	    {
		mComponents[12] = multi_frequencyInfo;
	    }
	    
	    public boolean hasMulti_frequencyInfo()
	    {
		return componentIsPresent(12);
	    }
	    
	    public void deleteMulti_frequencyInfo()
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
		    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Complete"
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
					"SRB_InformationSetupList_r7"
				    ),
				    new QName (
					"InformationElements",
					"SRB-InformationSetupList-r7"
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
					    "SRB_InformationSetup_r7"
					)
				    )
				)
			    ),
			    "srb-InformationSetupList",
			    0,
			    2,
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
					"RAB_InformationSetupList_r7"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationSetupList-r7"
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
					    "RAB_InformationSetup_r7"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
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
					"UL_AddReconfTransChInfoList_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-AddReconfTransChInfoList-r7"
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
					    "UL_AddReconfTransChInformation_r7"
					)
				    )
				)
			    ),
			    "ul-AddReconfTransChInfoList",
			    3,
			    2,
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
			    4,
			    2,
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
					"DL_AddReconfTransChInfoList_r7"
				    ),
				    new QName (
					"InformationElements",
					"DL-AddReconfTransChInfoList-r7"
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
					    "DL_AddReconfTransChInformation_r7"
					)
				    )
				)
			    ),
			    "dl-AddReconfTransChInfoList",
			    5,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8006
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_DPCH_Info_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-DPCH-Info-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_DPCH_Info_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_DPCH_Info_r7"
					)
				    ),
				    0
				)
			    ),
			    "ul-DPCH-Info",
			    6,
			    2,
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
					"UL_EDCH_Information_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-EDCH-Information-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_EDCH_Information_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UL_EDCH_Information_r7"
					)
				    ),
				    0
				)
			    ),
			    "ul-EDCH-Information",
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
					"DL_HSPDSCH_Information_r7"
				    ),
				    new QName (
					"InformationElements",
					"DL-HSPDSCH-Information-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_HSPDSCH_Information_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_HSPDSCH_Information_r7"
					)
				    ),
				    0
				)
			    ),
			    "dl-HSPDSCH-Information",
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
					"DL_CommonInformation_r7"
				    ),
				    new QName (
					"InformationElements",
					"DL-CommonInformation-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonInformation_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_CommonInformation_r7"
					)
				    ),
				    0
				)
			    ),
			    "dl-CommonInformation",
			    9,
			    2,
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
					"DL_InformationPerRL_List_r7"
				    ),
				    new QName (
					"InformationElements",
					"DL-InformationPerRL-List-r7"
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
					    "DL_InformationPerRL_r7"
					)
				    )
				)
			    ),
			    "dl-InformationPerRL-List",
			    10,
			    2,
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
					"Multi_frequencyInfo_LCR_r7"
				    ),
				    new QName (
					"InformationElements",
					"Multi-frequencyInfo-LCR-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "Multi_frequencyInfo_LCR_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "Multi_frequencyInfo_LCR_r7"
					)
				    ),
				    0
				)
			    ),
			    "multi-frequencyInfo",
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
				new TagDecoderElement((short)0x8000, 0)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
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
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8006, 6)
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
				new TagDecoderElement((short)0x800a, 10)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x800b, 11)
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
	    public Preconfiguration(PreConfigMode preConfigMode, 
			    rrc.informationelements.RAB_Info_Post rab_Info, 
			    ModeSpecificInfo modeSpecificInfo)
	    {
		setPreConfigMode(preConfigMode);
		setRab_Info(rab_Info);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Preconfiguration(PreConfigMode preConfigMode, 
			    ModeSpecificInfo modeSpecificInfo)
	    {
		setPreConfigMode(preConfigMode);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PreConfigMode();
		mComponents[1] = new rrc.informationelements.RAB_Info_Post();
		mComponents[2] = new ModeSpecificInfo();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[3];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new PreConfigMode();
		    case 1:
			return new rrc.informationelements.RAB_Info_Post();
		    case 2:
			return new ModeSpecificInfo();
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
				    rrc.informationelements.DefaultConfigIdentity_r6 defaultConfigIdentity)
		    {
			setDefaultConfigMode(defaultConfigMode);
			setDefaultConfigIdentity(defaultConfigIdentity);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = rrc.informationelements.DefaultConfigMode.fdd;
			mComponents[1] = new rrc.informationelements.DefaultConfigIdentity_r6();
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
				return new rrc.informationelements.DefaultConfigIdentity_r6();
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
		    public rrc.informationelements.DefaultConfigIdentity_r6 getDefaultConfigIdentity()
		    {
			return (rrc.informationelements.DefaultConfigIdentity_r6)mComponents[1];
		    }
		    
		    public void setDefaultConfigIdentity(rrc.informationelements.DefaultConfigIdentity_r6 defaultConfigIdentity)
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
			    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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
			"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
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
					"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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

	    // Methods for field "rab_Info"
	    public rrc.informationelements.RAB_Info_Post getRab_Info()
	    {
		return (rrc.informationelements.RAB_Info_Post)mComponents[1];
	    }
	    
	    public void setRab_Info(rrc.informationelements.RAB_Info_Post rab_Info)
	    {
		mComponents[1] = rab_Info;
	    }
	    
	    public boolean hasRab_Info()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRab_Info()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "modeSpecificInfo"
	    public ModeSpecificInfo getModeSpecificInfo()
	    {
		return (ModeSpecificInfo)mComponents[2];
	    }
	    
	    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
	    {
		mComponents[2] = modeSpecificInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module PDU_definitions.
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
		    public Fdd(rrc.informationelements.UL_DPCH_InfoPostFDD ul_DPCH_Info, 
				    rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost, 
				    rrc.informationelements.DL_InformationPerRL_ListPostFDD dl_InformationPerRL_List, 
				    rrc.informationelements.FrequencyInfoFDD frequencyInfo)
		    {
			setUl_DPCH_Info(ul_DPCH_Info);
			setDl_CommonInformationPost(dl_CommonInformationPost);
			setDl_InformationPerRL_List(dl_InformationPerRL_List);
			setFrequencyInfo(frequencyInfo);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new rrc.informationelements.UL_DPCH_InfoPostFDD();
			mComponents[1] = new rrc.informationelements.DL_CommonInformationPost();
			mComponents[2] = new rrc.informationelements.DL_InformationPerRL_ListPostFDD();
			mComponents[3] = new rrc.informationelements.FrequencyInfoFDD();
		    }
		    
		    // Instance initializer
		    {
			mComponents = new AbstractData[4];
		    }
		    
		    // Method to create a specific component instance
		    public AbstractData createInstance(int index)
		    {
			switch (index) {
			    case 0:
				return new rrc.informationelements.UL_DPCH_InfoPostFDD();
			    case 1:
				return new rrc.informationelements.DL_CommonInformationPost();
			    case 2:
				return new rrc.informationelements.DL_InformationPerRL_ListPostFDD();
			    case 3:
				return new rrc.informationelements.FrequencyInfoFDD();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "ul_DPCH_Info"
		    public rrc.informationelements.UL_DPCH_InfoPostFDD getUl_DPCH_Info()
		    {
			return (rrc.informationelements.UL_DPCH_InfoPostFDD)mComponents[0];
		    }
		    
		    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_InfoPostFDD ul_DPCH_Info)
		    {
			mComponents[0] = ul_DPCH_Info;
		    }
		    
		    
		    // Methods for field "dl_CommonInformationPost"
		    public rrc.informationelements.DL_CommonInformationPost getDl_CommonInformationPost()
		    {
			return (rrc.informationelements.DL_CommonInformationPost)mComponents[1];
		    }
		    
		    public void setDl_CommonInformationPost(rrc.informationelements.DL_CommonInformationPost dl_CommonInformationPost)
		    {
			mComponents[1] = dl_CommonInformationPost;
		    }
		    
		    
		    // Methods for field "dl_InformationPerRL_List"
		    public rrc.informationelements.DL_InformationPerRL_ListPostFDD getDl_InformationPerRL_List()
		    {
			return (rrc.informationelements.DL_InformationPerRL_ListPostFDD)mComponents[2];
		    }
		    
		    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_ListPostFDD dl_InformationPerRL_List)
		    {
			mComponents[2] = dl_InformationPerRL_List;
		    }
		    
		    
		    // Methods for field "frequencyInfo"
		    public rrc.informationelements.FrequencyInfoFDD getFrequencyInfo()
		    {
			return (rrc.informationelements.FrequencyInfoFDD)mComponents[3];
		    }
		    
		    public void setFrequencyInfo(rrc.informationelements.FrequencyInfoFDD frequencyInfo)
		    {
			mComponents[3] = frequencyInfo;
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
			    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Fdd"
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
						"UL_DPCH_InfoPostFDD"
					    ),
					    new QName (
						"InformationElements",
						"UL-DPCH-InfoPostFDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostFDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "UL_DPCH_InfoPostFDD"
						)
					    ),
					    0
					)
				    ),
				    "ul-DPCH-Info",
				    0,
				    2,
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
						"DL_CommonInformationPost"
					    ),
					    new QName (
						"InformationElements",
						"DL-CommonInformationPost"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "DL_CommonInformationPost"
						)
					    ),
					    0
					)
				    ),
				    "dl-CommonInformationPost",
				    1,
				    2,
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
						"DL_InformationPerRL_ListPostFDD"
					    ),
					    new QName (
						"InformationElements",
						"DL-InformationPerRL-ListPostFDD"
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
						    "DL_InformationPerRL_PostFDD"
						)
					    )
					)
				    ),
				    "dl-InformationPerRL-List",
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
						"rrc.informationelements",
						"FrequencyInfoFDD"
					    ),
					    new QName (
						"InformationElements",
						"FrequencyInfoFDD"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoFDD"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoFDD"
						)
					    ),
					    0
					)
				    ),
				    "frequencyInfo",
				    3,
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
					new TagDecoderElement((short)0x8003, 3)
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
		public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
		{
		    ModeSpecificInfo __object = new ModeSpecificInfo();

		    __object.setTdd(tdd);
		    return __object;
		}
		
		public boolean hasTdd()
		{
		    return getChosenFlag() == tdd_chosen;
		}
		
		public void setTdd(Tdd tdd)
		{
		    setChosenValue(tdd);
		    setChosenFlag(tdd_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Tdd from ASN1 Module PDU_definitions.
		 * @see Choice
		 */
		public static class Tdd extends Choice {
		    
		    /**
		     * The default constructor.
		     */
		    public Tdd()
		    {
		    }
		    
		    public static final  int  tdd384_chosen = 1;
		    public static final  int  tdd128_chosen = 2;
		    public static final  int  tdd768_chosen = 3;
		    
		    // Methods for field "tdd384"
		    public static Tdd createTddWithTdd384(Tdd384 tdd384)
		    {
			Tdd __object = new Tdd();

			__object.setTdd384(tdd384);
			return __object;
		    }
		    
		    public boolean hasTdd384()
		    {
			return getChosenFlag() == tdd384_chosen;
		    }
		    
		    public void setTdd384(Tdd384 tdd384)
		    {
			setChosenValue(tdd384);
			setChosenFlag(tdd384_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type Tdd384 from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class Tdd384 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public Tdd384()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public Tdd384(rrc.informationelements.UL_DPCH_InfoPostTDD ul_DPCH_Info, 
					rrc.informationelements.DL_InformationPerRL_PostTDD dl_InformationPerRL, 
					rrc.informationelements.FrequencyInfoTDD frequencyInfo, 
					rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    setUl_DPCH_Info(ul_DPCH_Info);
			    setDl_InformationPerRL(dl_InformationPerRL);
			    setFrequencyInfo(frequencyInfo);
			    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new rrc.informationelements.UL_DPCH_InfoPostTDD();
			    mComponents[1] = new rrc.informationelements.DL_InformationPerRL_PostTDD();
			    mComponents[2] = new rrc.informationelements.FrequencyInfoTDD();
			    mComponents[3] = new rrc.informationelements.PrimaryCCPCH_TX_Power();
			}
			
			// Instance initializer
			{
			    mComponents = new AbstractData[4];
			}
			
			// Method to create a specific component instance
			public AbstractData createInstance(int index)
			{
			    switch (index) {
				case 0:
				    return new rrc.informationelements.UL_DPCH_InfoPostTDD();
				case 1:
				    return new rrc.informationelements.DL_InformationPerRL_PostTDD();
				case 2:
				    return new rrc.informationelements.FrequencyInfoTDD();
				case 3:
				    return new rrc.informationelements.PrimaryCCPCH_TX_Power();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ul_DPCH_Info"
			public rrc.informationelements.UL_DPCH_InfoPostTDD getUl_DPCH_Info()
			{
			    return (rrc.informationelements.UL_DPCH_InfoPostTDD)mComponents[0];
			}
			
			public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_InfoPostTDD ul_DPCH_Info)
			{
			    mComponents[0] = ul_DPCH_Info;
			}
			
			
			// Methods for field "dl_InformationPerRL"
			public rrc.informationelements.DL_InformationPerRL_PostTDD getDl_InformationPerRL()
			{
			    return (rrc.informationelements.DL_InformationPerRL_PostTDD)mComponents[1];
			}
			
			public void setDl_InformationPerRL(rrc.informationelements.DL_InformationPerRL_PostTDD dl_InformationPerRL)
			{
			    mComponents[1] = dl_InformationPerRL;
			}
			
			
			// Methods for field "frequencyInfo"
			public rrc.informationelements.FrequencyInfoTDD getFrequencyInfo()
			{
			    return (rrc.informationelements.FrequencyInfoTDD)mComponents[2];
			}
			
			public void setFrequencyInfo(rrc.informationelements.FrequencyInfoTDD frequencyInfo)
			{
			    mComponents[2] = frequencyInfo;
			}
			
			
			// Methods for field "primaryCCPCH_TX_Power"
			public rrc.informationelements.PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
			{
			    return (rrc.informationelements.PrimaryCCPCH_TX_Power)mComponents[3];
			}
			
			public void setPrimaryCCPCH_TX_Power(rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    mComponents[3] = primaryCCPCH_TX_Power;
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
				"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd384"
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
						    "UL_DPCH_InfoPostTDD"
						),
						new QName (
						    "InformationElements",
						    "UL-DPCH-InfoPostTDD"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_InfoPostTDD"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_InfoPostTDD"
						    )
						),
						0
					    )
					),
					"ul-DPCH-Info",
					0,
					2,
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
						    "DL_InformationPerRL_PostTDD"
						),
						new QName (
						    "InformationElements",
						    "DL-InformationPerRL-PostTDD"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"DL_InformationPerRL_PostTDD"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"DL_InformationPerRL_PostTDD"
						    )
						),
						0
					    )
					),
					"dl-InformationPerRL",
					1,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new SequenceInfo (
						new Tags (
						    new short[] {
							(short)0x8002
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoTDD"
						),
						new QName (
						    "InformationElements",
						    "FrequencyInfoTDD"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0
					    )
					),
					"frequencyInfo",
					2,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new IntegerInfo (
						new Tags (
						    new short[] {
							(short)0x8003
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "PrimaryCCPCH_TX_Power"
						),
						new QName (
						    "InformationElements",
						    "PrimaryCCPCH-TX-Power"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new rrc.informationelements.PrimaryCCPCH_TX_Power(6), 
							new rrc.informationelements.PrimaryCCPCH_TX_Power(43),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(6),
						    new java.lang.Long(43)
						),
						null
					    )
					),
					"primaryCCPCH-TX-Power",
					3,
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
					    new TagDecoderElement((short)0x8003, 3)
					}
				    )
				}
			    ),
			    0
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for Tdd384

		    // Methods for field "tdd128"
		    public static Tdd createTddWithTdd128(Tdd128 tdd128)
		    {
			Tdd __object = new Tdd();

			__object.setTdd128(tdd128);
			return __object;
		    }
		    
		    public boolean hasTdd128()
		    {
			return getChosenFlag() == tdd128_chosen;
		    }
		    
		    public void setTdd128(Tdd128 tdd128)
		    {
			setChosenValue(tdd128);
			setChosenFlag(tdd128_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type Tdd128 from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class Tdd128 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public Tdd128()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public Tdd128(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
					rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4 dl_InformationPerRL, 
					rrc.informationelements.FrequencyInfoTDD frequencyInfo, 
					rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power, 
					rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
			{
			    setUl_DPCH_Info(ul_DPCH_Info);
			    setDl_InformationPerRL(dl_InformationPerRL);
			    setFrequencyInfo(frequencyInfo);
			    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
			    setMulti_frequencyInfo(multi_frequencyInfo);
			}
			
			/**
			 * Construct with required components.
			 */
			public Tdd128(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
					rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4 dl_InformationPerRL, 
					rrc.informationelements.FrequencyInfoTDD frequencyInfo, 
					rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    setUl_DPCH_Info(ul_DPCH_Info);
			    setDl_InformationPerRL(dl_InformationPerRL);
			    setFrequencyInfo(frequencyInfo);
			    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new rrc.informationelements.UL_DPCH_Info_r7();
			    mComponents[1] = new rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4();
			    mComponents[2] = new rrc.informationelements.FrequencyInfoTDD();
			    mComponents[3] = new rrc.informationelements.PrimaryCCPCH_TX_Power();
			    mComponents[4] = new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
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
				    return new rrc.informationelements.UL_DPCH_Info_r7();
				case 1:
				    return new rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4();
				case 2:
				    return new rrc.informationelements.FrequencyInfoTDD();
				case 3:
				    return new rrc.informationelements.PrimaryCCPCH_TX_Power();
				case 4:
				    return new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ul_DPCH_Info"
			public rrc.informationelements.UL_DPCH_Info_r7 getUl_DPCH_Info()
			{
			    return (rrc.informationelements.UL_DPCH_Info_r7)mComponents[0];
			}
			
			public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info)
			{
			    mComponents[0] = ul_DPCH_Info;
			}
			
			
			// Methods for field "dl_InformationPerRL"
			public rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4 getDl_InformationPerRL()
			{
			    return (rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4)mComponents[1];
			}
			
			public void setDl_InformationPerRL(rrc.informationelements.DL_InformationPerRL_PostTDD_LCR_r4 dl_InformationPerRL)
			{
			    mComponents[1] = dl_InformationPerRL;
			}
			
			
			// Methods for field "frequencyInfo"
			public rrc.informationelements.FrequencyInfoTDD getFrequencyInfo()
			{
			    return (rrc.informationelements.FrequencyInfoTDD)mComponents[2];
			}
			
			public void setFrequencyInfo(rrc.informationelements.FrequencyInfoTDD frequencyInfo)
			{
			    mComponents[2] = frequencyInfo;
			}
			
			
			// Methods for field "primaryCCPCH_TX_Power"
			public rrc.informationelements.PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
			{
			    return (rrc.informationelements.PrimaryCCPCH_TX_Power)mComponents[3];
			}
			
			public void setPrimaryCCPCH_TX_Power(rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    mComponents[3] = primaryCCPCH_TX_Power;
			}
			
			
			// Methods for field "multi_frequencyInfo"
			public rrc.informationelements.Multi_frequencyInfo_LCR_r7 getMulti_frequencyInfo()
			{
			    return (rrc.informationelements.Multi_frequencyInfo_LCR_r7)mComponents[4];
			}
			
			public void setMulti_frequencyInfo(rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
			{
			    mComponents[4] = multi_frequencyInfo;
			}
			
			public boolean hasMulti_frequencyInfo()
			{
			    return componentIsPresent(4);
			}
			
			public void deleteMulti_frequencyInfo()
			{
			    setComponentAbsent(4);
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
				"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd128"
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
						    "UL_DPCH_Info_r7"
						),
						new QName (
						    "InformationElements",
						    "UL-DPCH-Info-r7"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_Info_r7"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_Info_r7"
						    )
						),
						0
					    )
					),
					"ul-DPCH-Info",
					0,
					2,
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
						    "DL_InformationPerRL_PostTDD_LCR_r4"
						),
						new QName (
						    "InformationElements",
						    "DL-InformationPerRL-PostTDD-LCR-r4"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"DL_InformationPerRL_PostTDD_LCR_r4"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"DL_InformationPerRL_PostTDD_LCR_r4"
						    )
						),
						0
					    )
					),
					"dl-InformationPerRL",
					1,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new SequenceInfo (
						new Tags (
						    new short[] {
							(short)0x8002
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoTDD"
						),
						new QName (
						    "InformationElements",
						    "FrequencyInfoTDD"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0
					    )
					),
					"frequencyInfo",
					2,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new IntegerInfo (
						new Tags (
						    new short[] {
							(short)0x8003
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "PrimaryCCPCH_TX_Power"
						),
						new QName (
						    "InformationElements",
						    "PrimaryCCPCH-TX-Power"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new rrc.informationelements.PrimaryCCPCH_TX_Power(6), 
							new rrc.informationelements.PrimaryCCPCH_TX_Power(43),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(6),
						    new java.lang.Long(43)
						),
						null
					    )
					),
					"primaryCCPCH-TX-Power",
					3,
					2,
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
						    "Multi_frequencyInfo_LCR_r7"
						),
						new QName (
						    "InformationElements",
						    "Multi-frequencyInfo-LCR-r7"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"Multi_frequencyInfo_LCR_r7"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"Multi_frequencyInfo_LCR_r7"
						    )
						),
						0
					    )
					),
					"multi-frequencyInfo",
					4,
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
					    new TagDecoderElement((short)0x8003, 3)
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
			 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for Tdd128

		    // Methods for field "tdd768"
		    public static Tdd createTddWithTdd768(Tdd768 tdd768)
		    {
			Tdd __object = new Tdd();

			__object.setTdd768(tdd768);
			return __object;
		    }
		    
		    public boolean hasTdd768()
		    {
			return getChosenFlag() == tdd768_chosen;
		    }
		    
		    public void setTdd768(Tdd768 tdd768)
		    {
			setChosenValue(tdd768);
			setChosenFlag(tdd768_chosen);
		    }
		    
		    
		    
		    /**
		     * Define the ASN1 Type Tdd768 from ASN1 Module PDU_definitions.
		     * @see Sequence
		     */
		    public static class Tdd768 extends Sequence {
			
			/**
			 * The default constructor.
			 */
			public Tdd768()
			{
			}
			
			/**
			 * Construct with AbstractData components.
			 */
			public Tdd768(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
					rrc.informationelements.DL_InformationPerRL_List_r7 dl_InformationPerRL, 
					rrc.informationelements.FrequencyInfoTDD frequencyInfo, 
					rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    setUl_DPCH_Info(ul_DPCH_Info);
			    setDl_InformationPerRL(dl_InformationPerRL);
			    setFrequencyInfo(frequencyInfo);
			    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new rrc.informationelements.UL_DPCH_Info_r7();
			    mComponents[1] = new rrc.informationelements.DL_InformationPerRL_List_r7();
			    mComponents[2] = new rrc.informationelements.FrequencyInfoTDD();
			    mComponents[3] = new rrc.informationelements.PrimaryCCPCH_TX_Power();
			}
			
			// Instance initializer
			{
			    mComponents = new AbstractData[4];
			}
			
			// Method to create a specific component instance
			public AbstractData createInstance(int index)
			{
			    switch (index) {
				case 0:
				    return new rrc.informationelements.UL_DPCH_Info_r7();
				case 1:
				    return new rrc.informationelements.DL_InformationPerRL_List_r7();
				case 2:
				    return new rrc.informationelements.FrequencyInfoTDD();
				case 3:
				    return new rrc.informationelements.PrimaryCCPCH_TX_Power();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "ul_DPCH_Info"
			public rrc.informationelements.UL_DPCH_Info_r7 getUl_DPCH_Info()
			{
			    return (rrc.informationelements.UL_DPCH_Info_r7)mComponents[0];
			}
			
			public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info)
			{
			    mComponents[0] = ul_DPCH_Info;
			}
			
			
			// Methods for field "dl_InformationPerRL"
			public rrc.informationelements.DL_InformationPerRL_List_r7 getDl_InformationPerRL()
			{
			    return (rrc.informationelements.DL_InformationPerRL_List_r7)mComponents[1];
			}
			
			public void setDl_InformationPerRL(rrc.informationelements.DL_InformationPerRL_List_r7 dl_InformationPerRL)
			{
			    mComponents[1] = dl_InformationPerRL;
			}
			
			
			// Methods for field "frequencyInfo"
			public rrc.informationelements.FrequencyInfoTDD getFrequencyInfo()
			{
			    return (rrc.informationelements.FrequencyInfoTDD)mComponents[2];
			}
			
			public void setFrequencyInfo(rrc.informationelements.FrequencyInfoTDD frequencyInfo)
			{
			    mComponents[2] = frequencyInfo;
			}
			
			
			// Methods for field "primaryCCPCH_TX_Power"
			public rrc.informationelements.PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
			{
			    return (rrc.informationelements.PrimaryCCPCH_TX_Power)mComponents[3];
			}
			
			public void setPrimaryCCPCH_TX_Power(rrc.informationelements.PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
			{
			    mComponents[3] = primaryCCPCH_TX_Power;
			}
			
			
			/**
			 * Initialize the type descriptor.
			 */
			private static final SequenceInfo c_typeinfo = new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd768"
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
						    "UL_DPCH_Info_r7"
						),
						new QName (
						    "InformationElements",
						    "UL-DPCH-Info-r7"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_Info_r7"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"UL_DPCH_Info_r7"
						    )
						),
						0
					    )
					),
					"ul-DPCH-Info",
					0,
					2,
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
						    "DL_InformationPerRL_List_r7"
						),
						new QName (
						    "InformationElements",
						    "DL-InformationPerRL-List-r7"
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
							"DL_InformationPerRL_r7"
						    )
						)
					    )
					),
					"dl-InformationPerRL",
					1,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new SequenceInfo (
						new Tags (
						    new short[] {
							(short)0x8002
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "FrequencyInfoTDD"
						),
						new QName (
						    "InformationElements",
						    "FrequencyInfoTDD"
						),
						12314,
						null,
						new FieldsRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0,
						new TagDecodersRef (
						    new QName (
							"rrc.informationelements",
							"FrequencyInfoTDD"
						    )
						),
						0
					    )
					),
					"frequencyInfo",
					2,
					2,
					null
				    ),
				    new SequenceFieldInfo (
					new TypeInfoRef (
					    new IntegerInfo (
						new Tags (
						    new short[] {
							(short)0x8003
						    }
						),
						new QName (
						    "rrc.informationelements",
						    "PrimaryCCPCH_TX_Power"
						),
						new QName (
						    "InformationElements",
						    "PrimaryCCPCH-TX-Power"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new rrc.informationelements.PrimaryCCPCH_TX_Power(6), 
							new rrc.informationelements.PrimaryCCPCH_TX_Power(43),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(6),
						    new java.lang.Long(43)
						),
						null
					    )
					),
					"primaryCCPCH-TX-Power",
					3,
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
					    new TagDecoderElement((short)0x8003, 3)
					}
				    )
				}
			    ),
			    0
			);
			
			/**
			 * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
			 */
			public TypeInfo getTypeInfo()
			{
			    return c_typeinfo;
			}
			
			/**
			 * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
			 */
			public static TypeInfo getStaticTypeInfo()
			{
			    return c_typeinfo;
			}
			
		    } // End class definition for Tdd768

		    // Method to create a specific choice instance
		    public AbstractData createInstance(int chosen)
		    {
			switch (chosen) {
			    case tdd384_chosen:
				return new Tdd384();
			    case tdd128_chosen:
				return new Tdd128();
			    case tdd768_chosen:
				return new Tdd768();
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd"
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
					    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd384"
					)
				    ),
				    "tdd384",
				    0,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd128"
					)
				    ),
				    "tdd128",
				    1,
				    2
				),
				new FieldInfo (
				    new TypeInfoRef (
					new QName (
					    "rrc.pdu_definitions",
					    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd$Tdd768"
					)
				    ),
				    "tdd768",
				    2,
				    2
				)
			    }
			),
			0,
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
			    }
			)
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tdd

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case fdd_chosen:
			    return new Fdd();
			case tdd_chosen:
			    return new Tdd();
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
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.pdu_definitions",
			"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo"
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
					"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Fdd"
				    )
				),
				"fdd",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.pdu_definitions",
					"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo$Tdd"
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
		    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration"
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
				    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
				)
			    ),
			    "preConfigMode",
			    0,
			    2,
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
					"RAB_Info_Post"
				    ),
				    new QName (
					"InformationElements",
					"RAB-Info-Post"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_Post"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "RAB_Info_Post"
					)
				    ),
				    0
				)
			    ),
			    "rab-Info",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration$ModeSpecificInfo"
				)
			    ),
			    "modeSpecificInfo",
			    2,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2)
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"HandoverToUTRANCommand_r7_IEs$SpecificationMode"
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
				"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Complete"
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
				"HandoverToUTRANCommand_r7_IEs$SpecificationMode$Preconfiguration"
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

    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[7];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[7] = maxAllowedUL_TX_Power;
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
	    "HandoverToUTRANCommand_r7_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverToUTRANCommand-r7-IEs"
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
				"U_RNTI_Short"
			    ),
			    new QName (
				"InformationElements",
				"U-RNTI-Short"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI_Short"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "U_RNTI_Short"
				)
			    ),
			    0
			)
		    ),
		    "new-U-RNTI",
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
				"CipheringAlgorithm_r7"
			    ),
			    new QName (
				"InformationElements",
				"CipheringAlgorithm-r7"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"uea0",
					0
				    ),
				    new MemberListElement (
					"uea1",
					1
				    ),
				    new MemberListElement (
					"uea2",
					2
				    )
				}
			    ),
			    0,
			    rrc.informationelements.CipheringAlgorithm_r7.uea0
			)
		    ),
		    "cipheringAlgorithm",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportForChangeOfUE-Capability",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "HandoverToUTRANCommand_r7_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    7,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_r7_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverToUTRANCommand_r7_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverToUTRANCommand_r7_IEs
