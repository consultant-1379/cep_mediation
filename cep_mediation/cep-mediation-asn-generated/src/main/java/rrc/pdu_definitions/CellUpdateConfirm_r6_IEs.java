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
 * Define the ASN1 Type CellUpdateConfirm_r6_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class CellUpdateConfirm_r6_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellUpdateConfirm_r6_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellUpdateConfirm_r6_IEs(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
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
		    BOOLEAN rlc_Re_establishIndicatorRb2_3or4, 
		    BOOLEAN rlc_Re_establishIndicatorRb5orAbove, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList, 
		    rrc.informationelements.RB_InformationReconfigList_r6 rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList_r6 rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo, 
		    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList_r6 ul_AddReconfTransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList, 
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
	setRlc_Re_establishIndicatorRb2_3or4(rlc_Re_establishIndicatorRb2_3or4);
	setRlc_Re_establishIndicatorRb5orAbove(rlc_Re_establishIndicatorRb5orAbove);
	setCn_InformationInfo(cn_InformationInfo);
	setUra_Identity(ura_Identity);
	setRb_InformationReleaseList(rb_InformationReleaseList);
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
     * Construct with components.
     */
    public CellUpdateConfirm_r6_IEs(rrc.informationelements.IntegrityProtectionModeInfo integrityProtectionModeInfo, 
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
		    boolean rlc_Re_establishIndicatorRb2_3or4, 
		    boolean rlc_Re_establishIndicatorRb5orAbove, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList, 
		    rrc.informationelements.RB_InformationReconfigList_r6 rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList_r6 rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo, 
		    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList_r6 ul_AddReconfTransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_DPCH_Info_r6 ul_DPCH_Info, 
		    rrc.informationelements.UL_EDCH_Information_r6 ul_EDCH_Information, 
		    rrc.informationelements.DL_HSPDSCH_Information_r6 dl_HSPDSCH_Information, 
		    rrc.informationelements.DL_CommonInformation_r6 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r6 dl_InformationPerRL_List, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	this(integrityProtectionModeInfo, cipheringModeInfo, 
	     activationTime, new_U_RNTI, new_C_RNTI, new_DSCH_RNTI, 
	     new_H_RNTI, newPrimary_E_RNTI, newSecondary_E_RNTI, 
	     rrc_StateIndicator, utran_DRX_CycleLengthCoeff, 
	     new BOOLEAN(rlc_Re_establishIndicatorRb2_3or4), 
	     new BOOLEAN(rlc_Re_establishIndicatorRb5orAbove), 
	     cn_InformationInfo, ura_Identity, rb_InformationReleaseList, 
	     rb_InformationReconfigList, rb_InformationAffectedList, 
	     dl_CounterSynchronisationInfo, pdcp_ROHC_TargetMode, 
	     ul_CommonTransChInfo, ul_deletedTransChInfoList, 
	     ul_AddReconfTransChInfoList, dl_CommonTransChInfo, 
	     dl_DeletedTransChInfoList, dl_AddReconfTransChInfoList, 
	     frequencyInfo, maxAllowedUL_TX_Power, ul_DPCH_Info, 
	     ul_EDCH_Information, dl_HSPDSCH_Information, 
	     dl_CommonInformation, dl_InformationPerRL_List, 
	     mbms_PL_ServiceRestrictInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CellUpdateConfirm_r6_IEs(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    boolean rlc_Re_establishIndicatorRb2_3or4, 
		    boolean rlc_Re_establishIndicatorRb5orAbove)
    {
	setRrc_StateIndicator(rrc_StateIndicator);
	setRlc_Re_establishIndicatorRb2_3or4(rlc_Re_establishIndicatorRb2_3or4);
	setRlc_Re_establishIndicatorRb5orAbove(rlc_Re_establishIndicatorRb5orAbove);
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
	mComponents[11] = new BOOLEAN();
	mComponents[12] = new BOOLEAN();
	mComponents[13] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[14] = new rrc.informationelements.URA_Identity();
	mComponents[15] = new rrc.informationelements.RB_InformationReleaseList();
	mComponents[16] = new rrc.informationelements.RB_InformationReconfigList_r6();
	mComponents[17] = new rrc.informationelements.RB_InformationAffectedList_r6();
	mComponents[18] = new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
	mComponents[19] = rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	mComponents[20] = new rrc.informationelements.UL_CommonTransChInfo_r4();
	mComponents[21] = new rrc.informationelements.UL_DeletedTransChInfoList_r6();
	mComponents[22] = new rrc.informationelements.UL_AddReconfTransChInfoList_r6();
	mComponents[23] = new rrc.informationelements.DL_CommonTransChInfo_r4();
	mComponents[24] = new rrc.informationelements.DL_DeletedTransChInfoList_r5();
	mComponents[25] = new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
	mComponents[26] = new rrc.informationelements.FrequencyInfo();
	mComponents[27] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[28] = new rrc.informationelements.UL_DPCH_Info_r6();
	mComponents[29] = new rrc.informationelements.UL_EDCH_Information_r6();
	mComponents[30] = new rrc.informationelements.DL_HSPDSCH_Information_r6();
	mComponents[31] = new rrc.informationelements.DL_CommonInformation_r6();
	mComponents[32] = new rrc.informationelements.DL_InformationPerRL_List_r6();
	mComponents[33] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[34];
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
		return new BOOLEAN();
	    case 12:
		return new BOOLEAN();
	    case 13:
		return new rrc.informationelements.CN_InformationInfo_r6();
	    case 14:
		return new rrc.informationelements.URA_Identity();
	    case 15:
		return new rrc.informationelements.RB_InformationReleaseList();
	    case 16:
		return new rrc.informationelements.RB_InformationReconfigList_r6();
	    case 17:
		return new rrc.informationelements.RB_InformationAffectedList_r6();
	    case 18:
		return new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
	    case 19:
		return rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	    case 20:
		return new rrc.informationelements.UL_CommonTransChInfo_r4();
	    case 21:
		return new rrc.informationelements.UL_DeletedTransChInfoList_r6();
	    case 22:
		return new rrc.informationelements.UL_AddReconfTransChInfoList_r6();
	    case 23:
		return new rrc.informationelements.DL_CommonTransChInfo_r4();
	    case 24:
		return new rrc.informationelements.DL_DeletedTransChInfoList_r5();
	    case 25:
		return new rrc.informationelements.DL_AddReconfTransChInfoList_r5();
	    case 26:
		return new rrc.informationelements.FrequencyInfo();
	    case 27:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 28:
		return new rrc.informationelements.UL_DPCH_Info_r6();
	    case 29:
		return new rrc.informationelements.UL_EDCH_Information_r6();
	    case 30:
		return new rrc.informationelements.DL_HSPDSCH_Information_r6();
	    case 31:
		return new rrc.informationelements.DL_CommonInformation_r6();
	    case 32:
		return new rrc.informationelements.DL_InformationPerRL_List_r6();
	    case 33:
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
    
    
    // Methods for field "rlc_Re_establishIndicatorRb2_3or4"
    public boolean getRlc_Re_establishIndicatorRb2_3or4()
    {
	return ((BOOLEAN)mComponents[11]).booleanValue();
    }
    
    public void setRlc_Re_establishIndicatorRb2_3or4(boolean rlc_Re_establishIndicatorRb2_3or4)
    {
	setRlc_Re_establishIndicatorRb2_3or4(new BOOLEAN(rlc_Re_establishIndicatorRb2_3or4));
    }
    
    public void setRlc_Re_establishIndicatorRb2_3or4(BOOLEAN rlc_Re_establishIndicatorRb2_3or4)
    {
	mComponents[11] = rlc_Re_establishIndicatorRb2_3or4;
    }
    
    
    // Methods for field "rlc_Re_establishIndicatorRb5orAbove"
    public boolean getRlc_Re_establishIndicatorRb5orAbove()
    {
	return ((BOOLEAN)mComponents[12]).booleanValue();
    }
    
    public void setRlc_Re_establishIndicatorRb5orAbove(boolean rlc_Re_establishIndicatorRb5orAbove)
    {
	setRlc_Re_establishIndicatorRb5orAbove(new BOOLEAN(rlc_Re_establishIndicatorRb5orAbove));
    }
    
    public void setRlc_Re_establishIndicatorRb5orAbove(BOOLEAN rlc_Re_establishIndicatorRb5orAbove)
    {
	mComponents[12] = rlc_Re_establishIndicatorRb5orAbove;
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo_r6 getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo_r6)mComponents[13];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo)
    {
	mComponents[13] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(13);
    }
    
    public void deleteCn_InformationInfo()
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
    
    
    // Methods for field "rb_InformationReleaseList"
    public rrc.informationelements.RB_InformationReleaseList getRb_InformationReleaseList()
    {
	return (rrc.informationelements.RB_InformationReleaseList)mComponents[15];
    }
    
    public void setRb_InformationReleaseList(rrc.informationelements.RB_InformationReleaseList rb_InformationReleaseList)
    {
	mComponents[15] = rb_InformationReleaseList;
    }
    
    public boolean hasRb_InformationReleaseList()
    {
	return componentIsPresent(15);
    }
    
    public void deleteRb_InformationReleaseList()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "rb_InformationReconfigList"
    public rrc.informationelements.RB_InformationReconfigList_r6 getRb_InformationReconfigList()
    {
	return (rrc.informationelements.RB_InformationReconfigList_r6)mComponents[16];
    }
    
    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList_r6 rb_InformationReconfigList)
    {
	mComponents[16] = rb_InformationReconfigList;
    }
    
    public boolean hasRb_InformationReconfigList()
    {
	return componentIsPresent(16);
    }
    
    public void deleteRb_InformationReconfigList()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "rb_InformationAffectedList"
    public rrc.informationelements.RB_InformationAffectedList_r6 getRb_InformationAffectedList()
    {
	return (rrc.informationelements.RB_InformationAffectedList_r6)mComponents[17];
    }
    
    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList_r6 rb_InformationAffectedList)
    {
	mComponents[17] = rb_InformationAffectedList;
    }
    
    public boolean hasRb_InformationAffectedList()
    {
	return componentIsPresent(17);
    }
    
    public void deleteRb_InformationAffectedList()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "dl_CounterSynchronisationInfo"
    public rrc.informationelements.DL_CounterSynchronisationInfo_r5 getDl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo_r5)mComponents[18];
    }
    
    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
    {
	mComponents[18] = dl_CounterSynchronisationInfo;
    }
    
    public boolean hasDl_CounterSynchronisationInfo()
    {
	return componentIsPresent(18);
    }
    
    public void deleteDl_CounterSynchronisationInfo()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "pdcp_ROHC_TargetMode"
    public rrc.informationelements.PDCP_ROHC_TargetMode getPdcp_ROHC_TargetMode()
    {
	return (rrc.informationelements.PDCP_ROHC_TargetMode)mComponents[19];
    }
    
    public void setPdcp_ROHC_TargetMode(rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode)
    {
	mComponents[19] = pdcp_ROHC_TargetMode;
    }
    
    public boolean hasPdcp_ROHC_TargetMode()
    {
	return componentIsPresent(19);
    }
    
    public void deletePdcp_ROHC_TargetMode()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[20];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
    {
	mComponents[20] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(20);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "ul_deletedTransChInfoList"
    public rrc.informationelements.UL_DeletedTransChInfoList_r6 getUl_deletedTransChInfoList()
    {
	return (rrc.informationelements.UL_DeletedTransChInfoList_r6)mComponents[21];
    }
    
    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList)
    {
	mComponents[21] = ul_deletedTransChInfoList;
    }
    
    public boolean hasUl_deletedTransChInfoList()
    {
	return componentIsPresent(21);
    }
    
    public void deleteUl_deletedTransChInfoList()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ul_AddReconfTransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList_r6 getUl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList_r6)mComponents[22];
    }
    
    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r6 ul_AddReconfTransChInfoList)
    {
	mComponents[22] = ul_AddReconfTransChInfoList;
    }
    
    public boolean hasUl_AddReconfTransChInfoList()
    {
	return componentIsPresent(22);
    }
    
    public void deleteUl_AddReconfTransChInfoList()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[23];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
    {
	mComponents[23] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(23);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "dl_DeletedTransChInfoList"
    public rrc.informationelements.DL_DeletedTransChInfoList_r5 getDl_DeletedTransChInfoList()
    {
	return (rrc.informationelements.DL_DeletedTransChInfoList_r5)mComponents[24];
    }
    
    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList_r5 dl_DeletedTransChInfoList)
    {
	mComponents[24] = dl_DeletedTransChInfoList;
    }
    
    public boolean hasDl_DeletedTransChInfoList()
    {
	return componentIsPresent(24);
    }
    
    public void deleteDl_DeletedTransChInfoList()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "dl_AddReconfTransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList_r5 getDl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList_r5)mComponents[25];
    }
    
    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r5 dl_AddReconfTransChInfoList)
    {
	mComponents[25] = dl_AddReconfTransChInfoList;
    }
    
    public boolean hasDl_AddReconfTransChInfoList()
    {
	return componentIsPresent(25);
    }
    
    public void deleteDl_AddReconfTransChInfoList()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[26];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[26] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(26);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[27];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[27] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(27);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "ul_DPCH_Info"
    public rrc.informationelements.UL_DPCH_Info_r6 getUl_DPCH_Info()
    {
	return (rrc.informationelements.UL_DPCH_Info_r6)mComponents[28];
    }
    
    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r6 ul_DPCH_Info)
    {
	mComponents[28] = ul_DPCH_Info;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return componentIsPresent(28);
    }
    
    public void deleteUl_DPCH_Info()
    {
	setComponentAbsent(28);
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public rrc.informationelements.UL_EDCH_Information_r6 getUl_EDCH_Information()
    {
	return (rrc.informationelements.UL_EDCH_Information_r6)mComponents[29];
    }
    
    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_r6 ul_EDCH_Information)
    {
	mComponents[29] = ul_EDCH_Information;
    }
    
    public boolean hasUl_EDCH_Information()
    {
	return componentIsPresent(29);
    }
    
    public void deleteUl_EDCH_Information()
    {
	setComponentAbsent(29);
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information_r6 getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information_r6)mComponents[30];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r6 dl_HSPDSCH_Information)
    {
	mComponents[30] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(30);
    }
    
    public void deleteDl_HSPDSCH_Information()
    {
	setComponentAbsent(30);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r6 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r6)mComponents[31];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r6 dl_CommonInformation)
    {
	mComponents[31] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(31);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(31);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r6 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r6)mComponents[32];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r6 dl_InformationPerRL_List)
    {
	mComponents[32] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(32);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(32);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[33];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[33] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(33);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(33);
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
	    "CellUpdateConfirm_r6_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "CellUpdateConfirm-r6-IEs"
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    12,
		    2,
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
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    15,
		    3,
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
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
		    19,
		    3,
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
		    23,
		    3,
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
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
		    29,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
		    31,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8020
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
		    32,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8021
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
		    33,
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
			new TagDecoderElement((short)0x800c, 12)
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
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
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
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801e, 30),
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8021, 33)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r6_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellUpdateConfirm_r6_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellUpdateConfirm_r6_IEs
