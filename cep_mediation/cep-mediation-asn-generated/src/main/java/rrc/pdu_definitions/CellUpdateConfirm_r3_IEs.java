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
 * Define the ASN1 Type CellUpdateConfirm_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdateConfirm_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdateConfirm_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    BOOLEAN rlc_Re_establishIndicatorRb2_3or4, 
		    BOOLEAN rlc_Re_establishIndicatorRb5orAbove, 
		    rrc.informationelements.CN_InformationInfo cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList, 
		    rrc.informationelements.RB_InformationReconfigList rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo dl_CounterSynchronisationInfo, 
		    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
		    ModeSpecificTransChInfo modeSpecificTransChInfo, 
		    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_ChannelRequirement ul_ChannelRequirement, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo, 
		    rrc.informationelements.DL_CommonInformation dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setActivationTime(activationTime);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setRlc_Re_establishIndicatorRb2_3or4(rlc_Re_establishIndicatorRb2_3or4);
	setRlc_Re_establishIndicatorRb5orAbove(rlc_Re_establishIndicatorRb5orAbove);
	setCn_InformationInfo(cn_InformationInfo);
	setUra_Identity(ura_Identity);
	setRb_InformationReleaseList(rb_InformationReleaseList);
	setRb_InformationReconfigList(rb_InformationReconfigList);
	setRb_InformationAffectedList(rb_InformationAffectedList);
	setDl_CounterSynchronisationInfo(dl_CounterSynchronisationInfo);
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_deletedTransChInfoList(ul_deletedTransChInfoList);
	setUl_AddReconfTransChInfoList(ul_AddReconfTransChInfoList);
	setModeSpecificTransChInfo(modeSpecificTransChInfo);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_DeletedTransChInfoList(dl_DeletedTransChInfoList);
	setDl_AddReconfTransChInfoList(dl_AddReconfTransChInfoList);
	setFrequencyInfo(frequencyInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_ChannelRequirement(ul_ChannelRequirement);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
    }
    
    /**
     * Construct with components.
     */
    public CellUpdateConfirm_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff, 
		    boolean rlc_Re_establishIndicatorRb2_3or4, 
		    boolean rlc_Re_establishIndicatorRb5orAbove, 
		    rrc.informationelements.CN_InformationInfo cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList, 
		    rrc.informationelements.RB_InformationReconfigList rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo dl_CounterSynchronisationInfo, 
		    rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList, 
		    ModeSpecificTransChInfo modeSpecificTransChInfo, 
		    rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_ChannelRequirement ul_ChannelRequirement, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo, 
		    rrc.informationelements.DL_CommonInformation dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
    {
	this(rrc_TransactionIdentifier, integrityProtectionModeInfo, 
	     cipheringModeInfo, activationTime, new_U_RNTI, new_C_RNTI, 
	     rrc_StateIndicator, utran_DRX_CycleLengthCoeff, 
	     new BOOLEAN(rlc_Re_establishIndicatorRb2_3or4), 
	     new BOOLEAN(rlc_Re_establishIndicatorRb5orAbove), 
	     cn_InformationInfo, ura_Identity, rb_InformationReleaseList, 
	     rb_InformationReconfigList, rb_InformationAffectedList, 
	     dl_CounterSynchronisationInfo, ul_CommonTransChInfo, 
	     ul_deletedTransChInfoList, ul_AddReconfTransChInfoList, 
	     modeSpecificTransChInfo, dl_CommonTransChInfo, 
	     dl_DeletedTransChInfoList, dl_AddReconfTransChInfoList, 
	     frequencyInfo, maxAllowedUL_TX_Power, ul_ChannelRequirement, 
	     modeSpecificPhysChInfo, dl_CommonInformation, 
	     dl_InformationPerRL_List);
    }
    
    /**
     * Construct with required components.
     */
    public CellUpdateConfirm_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    boolean rlc_Re_establishIndicatorRb2_3or4, 
		    boolean rlc_Re_establishIndicatorRb5orAbove, 
		    ModeSpecificTransChInfo modeSpecificTransChInfo, 
		    ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setRrc_StateIndicator(rrc_StateIndicator);
	setRlc_Re_establishIndicatorRb2_3or4(rlc_Re_establishIndicatorRb2_3or4);
	setRlc_Re_establishIndicatorRb5orAbove(rlc_Re_establishIndicatorRb5orAbove);
	setModeSpecificTransChInfo(modeSpecificTransChInfo);
	setModeSpecificPhysChInfo(modeSpecificPhysChInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.IntegrityProtectionModeInfo();
	mComponents[2] = new rrc.informationelements.CipheringModeInfo();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = new rrc.informationelements.U_RNTI();
	mComponents[5] = new rrc.informationelements.C_RNTI();
	mComponents[6] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[7] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	mComponents[8] = new BOOLEAN();
	mComponents[9] = new BOOLEAN();
	mComponents[10] = new rrc.informationelements.CN_InformationInfo();
	mComponents[11] = new rrc.informationelements.URA_Identity();
	mComponents[12] = new rrc.informationelements.RB_InformationReleaseList();
	mComponents[13] = new rrc.informationelements.RB_InformationReconfigList();
	mComponents[14] = new rrc.informationelements.RB_InformationAffectedList();
	mComponents[15] = new rrc.informationelements.DL_CounterSynchronisationInfo();
	mComponents[16] = new rrc.informationelements.UL_CommonTransChInfo();
	mComponents[17] = new rrc.informationelements.UL_DeletedTransChInfoList();
	mComponents[18] = new rrc.informationelements.UL_AddReconfTransChInfoList();
	mComponents[19] = new ModeSpecificTransChInfo();
	mComponents[20] = new rrc.informationelements.DL_CommonTransChInfo();
	mComponents[21] = new rrc.informationelements.DL_DeletedTransChInfoList();
	mComponents[22] = new rrc.informationelements.DL_AddReconfTransChInfoList();
	mComponents[23] = new rrc.informationelements.FrequencyInfo();
	mComponents[24] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[25] = new rrc.informationelements.UL_ChannelRequirement();
	mComponents[26] = new ModeSpecificPhysChInfo();
	mComponents[27] = new rrc.informationelements.DL_CommonInformation();
	mComponents[28] = new rrc.informationelements.DL_InformationPerRL_List();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[29];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.IntegrityProtectionModeInfo();
	    case 2:
		return new rrc.informationelements.CipheringModeInfo();
	    case 3:
		return new rrc.informationelements.ActivationTime();
	    case 4:
		return new rrc.informationelements.U_RNTI();
	    case 5:
		return new rrc.informationelements.C_RNTI();
	    case 6:
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 7:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient();
	    case 8:
		return new BOOLEAN();
	    case 9:
		return new BOOLEAN();
	    case 10:
		return new rrc.informationelements.CN_InformationInfo();
	    case 11:
		return new rrc.informationelements.URA_Identity();
	    case 12:
		return new rrc.informationelements.RB_InformationReleaseList();
	    case 13:
		return new rrc.informationelements.RB_InformationReconfigList();
	    case 14:
		return new rrc.informationelements.RB_InformationAffectedList();
	    case 15:
		return new rrc.informationelements.DL_CounterSynchronisationInfo();
	    case 16:
		return new rrc.informationelements.UL_CommonTransChInfo();
	    case 17:
		return new rrc.informationelements.UL_DeletedTransChInfoList();
	    case 18:
		return new rrc.informationelements.UL_AddReconfTransChInfoList();
	    case 19:
		return new ModeSpecificTransChInfo();
	    case 20:
		return new rrc.informationelements.DL_CommonTransChInfo();
	    case 21:
		return new rrc.informationelements.DL_DeletedTransChInfoList();
	    case 22:
		return new rrc.informationelements.DL_AddReconfTransChInfoList();
	    case 23:
		return new rrc.informationelements.FrequencyInfo();
	    case 24:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 25:
		return new rrc.informationelements.UL_ChannelRequirement();
	    case 26:
		return new ModeSpecificPhysChInfo();
	    case 27:
		return new rrc.informationelements.DL_CommonInformation();
	    case 28:
		return new rrc.informationelements.DL_InformationPerRL_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo)mComponents[1];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo)
    {
	mComponents[1] = integrityProtectionModeInfo;
    }
    
    public boolean hasIntegrityProtectionModeInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntegrityProtectionModeInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "cipheringModeInfo"
    public rrc.informationelements.CipheringModeInfo getCipheringModeInfo()
    {
	return (rrc.informationelements.CipheringModeInfo)mComponents[2];
    }
    
    public void setCipheringModeInfo(rrc.informationelements.CipheringModeInfo cipheringModeInfo)
    {
	mComponents[2] = cipheringModeInfo;
    }
    
    public boolean hasCipheringModeInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCipheringModeInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[3];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[3] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "new_U_RNTI"
    public rrc.informationelements.U_RNTI getNew_U_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[4];
    }
    
    public void setNew_U_RNTI(rrc.informationelements.U_RNTI new_U_RNTI)
    {
	mComponents[4] = new_U_RNTI;
    }
    
    public boolean hasNew_U_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNew_U_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "new_C_RNTI"
    public rrc.informationelements.C_RNTI getNew_C_RNTI()
    {
	return (rrc.informationelements.C_RNTI)mComponents[5];
    }
    
    public void setNew_C_RNTI(rrc.informationelements.C_RNTI new_C_RNTI)
    {
	mComponents[5] = new_C_RNTI;
    }
    
    public boolean hasNew_C_RNTI()
    {
	return componentIsPresent(5);
    }
    
    public void deleteNew_C_RNTI()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[6];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[6] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient)mComponents[7];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient utran_DRX_CycleLengthCoeff)
    {
	mComponents[7] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "rlc_Re_establishIndicatorRb2_3or4"
    public boolean getRlc_Re_establishIndicatorRb2_3or4()
    {
	return ((BOOLEAN)mComponents[8]).booleanValue();
    }
    
    public void setRlc_Re_establishIndicatorRb2_3or4(boolean rlc_Re_establishIndicatorRb2_3or4)
    {
	setRlc_Re_establishIndicatorRb2_3or4(new BOOLEAN(rlc_Re_establishIndicatorRb2_3or4));
    }
    
    public void setRlc_Re_establishIndicatorRb2_3or4(BOOLEAN rlc_Re_establishIndicatorRb2_3or4)
    {
	mComponents[8] = rlc_Re_establishIndicatorRb2_3or4;
    }
    
    
    // Methods for field "rlc_Re_establishIndicatorRb5orAbove"
    public boolean getRlc_Re_establishIndicatorRb5orAbove()
    {
	return ((BOOLEAN)mComponents[9]).booleanValue();
    }
    
    public void setRlc_Re_establishIndicatorRb5orAbove(boolean rlc_Re_establishIndicatorRb5orAbove)
    {
	setRlc_Re_establishIndicatorRb5orAbove(new BOOLEAN(rlc_Re_establishIndicatorRb5orAbove));
    }
    
    public void setRlc_Re_establishIndicatorRb5orAbove(BOOLEAN rlc_Re_establishIndicatorRb5orAbove)
    {
	mComponents[9] = rlc_Re_establishIndicatorRb5orAbove;
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo)mComponents[10];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo cn_InformationInfo)
    {
	mComponents[10] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(10);
    }
    
    public void deleteCn_InformationInfo()
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
    
    
    // Methods for field "rb_InformationReleaseList"
    public rrc.informationelements.RB_InformationReleaseList getRb_InformationReleaseList()
    {
	return (rrc.informationelements.RB_InformationReleaseList)mComponents[12];
    }
    
    public void setRb_InformationReleaseList(rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList)
    {
	mComponents[12] = rb_InformationReleaseList;
    }
    
    public boolean hasRb_InformationReleaseList()
    {
	return componentIsPresent(12);
    }
    
    public void deleteRb_InformationReleaseList()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "rb_InformationReconfigList"
    public rrc.informationelements.RB_InformationReconfigList getRb_InformationReconfigList()
    {
	return (rrc.informationelements.RB_InformationReconfigList)mComponents[13];
    }
    
    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList rb_InformationReconfigList)
    {
	mComponents[13] = rb_InformationReconfigList;
    }
    
    public boolean hasRb_InformationReconfigList()
    {
	return componentIsPresent(13);
    }
    
    public void deleteRb_InformationReconfigList()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "rb_InformationAffectedList"
    public rrc.informationelements.RB_InformationAffectedList getRb_InformationAffectedList()
    {
	return (rrc.informationelements.RB_InformationAffectedList)mComponents[14];
    }
    
    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList rb_InformationAffectedList)
    {
	mComponents[14] = rb_InformationAffectedList;
    }
    
    public boolean hasRb_InformationAffectedList()
    {
	return componentIsPresent(14);
    }
    
    public void deleteRb_InformationAffectedList()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "dl_CounterSynchronisationInfo"
    public rrc.informationelements.DL_CounterSynchronisationInfo getDl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo)mComponents[15];
    }
    
    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo dl_CounterSynchronisationInfo)
    {
	mComponents[15] = dl_CounterSynchronisationInfo;
    }
    
    public boolean hasDl_CounterSynchronisationInfo()
    {
	return componentIsPresent(15);
    }
    
    public void deleteDl_CounterSynchronisationInfo()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo)mComponents[16];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo ul_CommonTransChInfo)
    {
	mComponents[16] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(16);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "ul_deletedTransChInfoList"
    public rrc.informationelements.UL_DeletedTransChInfoList getUl_deletedTransChInfoList()
    {
	return (rrc.informationelements.UL_DeletedTransChInfoList)mComponents[17];
    }
    
    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList ul_deletedTransChInfoList)
    {
	mComponents[17] = ul_deletedTransChInfoList;
    }
    
    public boolean hasUl_deletedTransChInfoList()
    {
	return componentIsPresent(17);
    }
    
    public void deleteUl_deletedTransChInfoList()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "ul_AddReconfTransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList getUl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList)mComponents[18];
    }
    
    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList ul_AddReconfTransChInfoList)
    {
	mComponents[18] = ul_AddReconfTransChInfoList;
    }
    
    public boolean hasUl_AddReconfTransChInfoList()
    {
	return componentIsPresent(18);
    }
    
    public void deleteUl_AddReconfTransChInfoList()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "modeSpecificTransChInfo"
    public ModeSpecificTransChInfo getModeSpecificTransChInfo()
    {
	return (ModeSpecificTransChInfo)mComponents[19];
    }
    
    public void setModeSpecificTransChInfo(ModeSpecificTransChInfo modeSpecificTransChInfo)
    {
	mComponents[19] = modeSpecificTransChInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificTransChInfo from ASN1 Module PDU_definitions.
     * @see Choice
     */
    public static class ModeSpecificTransChInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificTransChInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificTransChInfo createModeSpecificTransChInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificTransChInfo __object = new ModeSpecificTransChInfo();

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
		    "rrc.pdu_definitions",
		    "CellUpdateConfirm_r3_IEs$ModeSpecificTransChInfo$Fdd"
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
	public static ModeSpecificTransChInfo createModeSpecificTransChInfoWithTdd(Null tdd)
	{
	    ModeSpecificTransChInfo __object = new ModeSpecificTransChInfo();

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
		    (short)0x8013
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdateConfirm_r3_IEs$ModeSpecificTransChInfo"
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
				"CellUpdateConfirm_r3_IEs$ModeSpecificTransChInfo$Fdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificTransChInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificTransChInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificTransChInfo

    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo)mComponents[20];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo dl_CommonTransChInfo)
    {
	mComponents[20] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(20);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "dl_DeletedTransChInfoList"
    public rrc.informationelements.DL_DeletedTransChInfoList getDl_DeletedTransChInfoList()
    {
	return (rrc.informationelements.DL_DeletedTransChInfoList)mComponents[21];
    }
    
    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList dl_DeletedTransChInfoList)
    {
	mComponents[21] = dl_DeletedTransChInfoList;
    }
    
    public boolean hasDl_DeletedTransChInfoList()
    {
	return componentIsPresent(21);
    }
    
    public void deleteDl_DeletedTransChInfoList()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "dl_AddReconfTransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList getDl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList)mComponents[22];
    }
    
    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList dl_AddReconfTransChInfoList)
    {
	mComponents[22] = dl_AddReconfTransChInfoList;
    }
    
    public boolean hasDl_AddReconfTransChInfoList()
    {
	return componentIsPresent(22);
    }
    
    public void deleteDl_AddReconfTransChInfoList()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[23];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[23] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(23);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[24];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[24] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(24);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "ul_ChannelRequirement"
    public rrc.informationelements.UL_ChannelRequirement getUl_ChannelRequirement()
    {
	return (rrc.informationelements.UL_ChannelRequirement)mComponents[25];
    }
    
    public void setUl_ChannelRequirement(rrc.informationelements.UL_ChannelRequirement ul_ChannelRequirement)
    {
	mComponents[25] = ul_ChannelRequirement;
    }
    
    public boolean hasUl_ChannelRequirement()
    {
	return componentIsPresent(25);
    }
    
    public void deleteUl_ChannelRequirement()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "modeSpecificPhysChInfo"
    public ModeSpecificPhysChInfo getModeSpecificPhysChInfo()
    {
	return (ModeSpecificPhysChInfo)mComponents[26];
    }
    
    public void setModeSpecificPhysChInfo(ModeSpecificPhysChInfo modeSpecificPhysChInfo)
    {
	mComponents[26] = modeSpecificPhysChInfo;
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
		    "CellUpdateConfirm_r3_IEs$ModeSpecificPhysChInfo$Fdd"
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
		    (short)0x801a
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"CellUpdateConfirm_r3_IEs$ModeSpecificPhysChInfo"
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
				"CellUpdateConfirm_r3_IEs$ModeSpecificPhysChInfo$Fdd"
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

    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation)mComponents[27];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation dl_CommonInformation)
    {
	mComponents[27] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(27);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List)mComponents[28];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List dl_InformationPerRL_List)
    {
	mComponents[28] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(28);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(28);
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
	    "CellUpdateConfirm_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-r3-IEs"
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
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
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
		    "rrc-TransactionIdentifier",
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
		    2,
		    3,
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
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "rlc-Re-establishIndicatorRb2-3or4",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "rlc-Re-establishIndicatorRb5orAbove",
		    9,
		    2,
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
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_InformationReleaseList"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationReleaseList"
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
				    "RB_Identity"
				)
			    )
			)
		    ),
		    "rb-InformationReleaseList",
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
				"RB_InformationReconfigList"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationReconfigList"
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
				    "RB_InformationReconfig"
				)
			    )
			)
		    ),
		    "rb-InformationReconfigList",
		    13,
		    3,
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
				"RB_InformationAffectedList"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationAffectedList"
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
				    "RB_InformationAffected"
				)
			    )
			)
		    ),
		    "rb-InformationAffectedList",
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
				"rrc.informationelements",
				"DL_CounterSynchronisationInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-CounterSynchronisationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CounterSynchronisationInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-CounterSynchronisationInfo",
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
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_r3_IEs$ModeSpecificTransChInfo"
			)
		    ),
		    "modeSpecificTransChInfo",
		    19,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
		    20,
		    3,
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
				"DL_DeletedTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"DL-DeletedTransChInfoList"
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
				    "DL_TransportChannelIdentity"
				)
			    )
			)
		    ),
		    "dl-DeletedTransChInfoList",
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
		    "dl-AddReconfTransChInfoList",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
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
		    23,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_ChannelRequirement"
			    ),
			    new QName (
				"InformationElements",
				"UL-ChannelRequirement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_ChannelRequirement"
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
		    25,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "CellUpdateConfirm_r3_IEs$ModeSpecificPhysChInfo"
			)
		    ),
		    "modeSpecificPhysChInfo",
		    26,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonInformation"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
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
				"DL_InformationPerRL_List"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List"
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
				    "DL_InformationPerRL"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    28,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19)
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
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_r3_IEs
