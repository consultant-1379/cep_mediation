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
 * Define the ASN1 Type RadioBearerSetup_r9_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerSetup_r9_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerSetup_r9_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerSetup_r9_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.SR_VCC_Info sr_vcc_Info, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    BOOLEAN supportForChangeOfUE_Capability, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationSetupList, 
		    rrc.informationelements.RAB_InformationSetupList_r8 rab_InformationSetupList, 
		    rrc.informationelements.RAB_InformationReconfigList_r8 rab_InformationReconfigList, 
		    rrc.informationelements.RB_InformationReconfigList_r8 rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList_r8 rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo, 
		    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_AddReconfTransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList_r7 dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo, 
		    rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo, 
		    rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info, 
		    rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo, 
		    rrc.informationelements.MIMO_Parameters_r9 mimoParameters, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
		    rrc.informationelements.UL_EDCH_Information_r9 ul_EDCH_Information, 
		    rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD, 
		    rrc.informationelements.DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information, 
		    rrc.informationelements.DL_CommonInformation_r8 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r8 dl_InformationPerRL_List, 
		    rrc.informationelements.DL_SecondaryCellInfoFDD_r9 dl_SecondaryCellInfoFDD, 
		    rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 controlChannelDRXInfo_TDD128, 
		    rrc.informationelements.SPS_Information_TDD128_r8 sps_Information_TDD128, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo, 
		    rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128)
    {
	setIntegrityProtectionModeInfo(integrityProtectionModeInfo);
	setCipheringModeInfo(cipheringModeInfo);
	setSr_vcc_Info(sr_vcc_Info);
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
	setSupportForChangeOfUE_Capability(supportForChangeOfUE_Capability);
	setCn_InformationInfo(cn_InformationInfo);
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
	setFrequencyInfo(frequencyInfo);
	setMulti_frequencyInfo(multi_frequencyInfo);
	setDtx_drx_TimingInfo(dtx_drx_TimingInfo);
	setDtx_drx_Info(dtx_drx_Info);
	setHs_scch_LessInfo(hs_scch_LessInfo);
	setMimoParameters(mimoParameters);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_DPCH_Info(ul_DPCH_Info);
	setUl_EDCH_Information(ul_EDCH_Information);
	setUl_SecondaryCellInfoFDD(ul_SecondaryCellInfoFDD);
	setDl_HSPDSCH_Information(dl_HSPDSCH_Information);
	setDl_CommonInformation(dl_CommonInformation);
	setDl_InformationPerRL_List(dl_InformationPerRL_List);
	setDl_SecondaryCellInfoFDD(dl_SecondaryCellInfoFDD);
	setControlChannelDRXInfo_TDD128(controlChannelDRXInfo_TDD128);
	setSps_Information_TDD128(sps_Information_TDD128);
	setMbms_PL_ServiceRestrictInfo(mbms_PL_ServiceRestrictInfo);
	setCellDCHMeasOccasionInfo_TDD128(cellDCHMeasOccasionInfo_TDD128);
    }
    
    /**
     * Construct with components.
     */
    public RadioBearerSetup_r9_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.SR_VCC_Info sr_vcc_Info, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    boolean supportForChangeOfUE_Capability, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationSetupList, 
		    rrc.informationelements.RAB_InformationSetupList_r8 rab_InformationSetupList, 
		    rrc.informationelements.RAB_InformationReconfigList_r8 rab_InformationReconfigList, 
		    rrc.informationelements.RB_InformationReconfigList_r8 rb_InformationReconfigList, 
		    rrc.informationelements.RB_InformationAffectedList_r8 rb_InformationAffectedList, 
		    rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo, 
		    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
		    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
		    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
		    rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_AddReconfTransChInfoList, 
		    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
		    rrc.informationelements.DL_DeletedTransChInfoList_r7 dl_DeletedTransChInfoList, 
		    rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_AddReconfTransChInfoList, 
		    rrc.informationelements.FrequencyInfo frequencyInfo, 
		    rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo, 
		    rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo, 
		    rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info, 
		    rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo, 
		    rrc.informationelements.MIMO_Parameters_r9 mimoParameters, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info, 
		    rrc.informationelements.UL_EDCH_Information_r9 ul_EDCH_Information, 
		    rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD, 
		    rrc.informationelements.DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information, 
		    rrc.informationelements.DL_CommonInformation_r8 dl_CommonInformation, 
		    rrc.informationelements.DL_InformationPerRL_List_r8 dl_InformationPerRL_List, 
		    rrc.informationelements.DL_SecondaryCellInfoFDD_r9 dl_SecondaryCellInfoFDD, 
		    rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 controlChannelDRXInfo_TDD128, 
		    rrc.informationelements.SPS_Information_TDD128_r8 sps_Information_TDD128, 
		    rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo, 
		    rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128)
    {
	this(integrityProtectionModeInfo, cipheringModeInfo, sr_vcc_Info, 
	     activationTime, new_U_RNTI, new_C_RNTI, new_DSCH_RNTI, 
	     new_H_RNTI, newPrimary_E_RNTI, newSecondary_E_RNTI, 
	     rrc_StateIndicator, utran_DRX_CycleLengthCoeff, ura_Identity, 
	     new BOOLEAN(supportForChangeOfUE_Capability), 
	     cn_InformationInfo, srb_InformationSetupList, 
	     rab_InformationSetupList, rab_InformationReconfigList, 
	     rb_InformationReconfigList, rb_InformationAffectedList, 
	     dl_CounterSynchronisationInfo, pdcp_ROHC_TargetMode, 
	     ul_CommonTransChInfo, ul_deletedTransChInfoList, 
	     ul_AddReconfTransChInfoList, dl_CommonTransChInfo, 
	     dl_DeletedTransChInfoList, dl_AddReconfTransChInfoList, 
	     frequencyInfo, multi_frequencyInfo, dtx_drx_TimingInfo, 
	     dtx_drx_Info, hs_scch_LessInfo, mimoParameters, 
	     maxAllowedUL_TX_Power, ul_DPCH_Info, ul_EDCH_Information, 
	     ul_SecondaryCellInfoFDD, dl_HSPDSCH_Information, 
	     dl_CommonInformation, dl_InformationPerRL_List, 
	     dl_SecondaryCellInfoFDD, controlChannelDRXInfo_TDD128, 
	     sps_Information_TDD128, mbms_PL_ServiceRestrictInfo, 
	     cellDCHMeasOccasionInfo_TDD128);
    }
    
    /**
     * Construct with required components.
     */
    public RadioBearerSetup_r9_IEs(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	setRrc_StateIndicator(rrc_StateIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	mComponents[1] = new rrc.informationelements.CipheringModeInfo_r7();
	mComponents[2] = new rrc.informationelements.SR_VCC_Info();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = new rrc.informationelements.U_RNTI();
	mComponents[5] = new rrc.informationelements.C_RNTI();
	mComponents[6] = new rrc.informationelements.DSCH_RNTI();
	mComponents[7] = new rrc.informationelements.H_RNTI();
	mComponents[8] = new rrc.informationelements.E_RNTI();
	mComponents[9] = new rrc.informationelements.E_RNTI();
	mComponents[10] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[11] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7();
	mComponents[12] = new rrc.informationelements.URA_Identity();
	mComponents[13] = new BOOLEAN();
	mComponents[14] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[15] = new rrc.informationelements.SRB_InformationSetupList_r8();
	mComponents[16] = new rrc.informationelements.RAB_InformationSetupList_r8();
	mComponents[17] = new rrc.informationelements.RAB_InformationReconfigList_r8();
	mComponents[18] = new rrc.informationelements.RB_InformationReconfigList_r8();
	mComponents[19] = new rrc.informationelements.RB_InformationAffectedList_r8();
	mComponents[20] = new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
	mComponents[21] = rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	mComponents[22] = new rrc.informationelements.UL_CommonTransChInfo_r4();
	mComponents[23] = new rrc.informationelements.UL_DeletedTransChInfoList_r6();
	mComponents[24] = new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
	mComponents[25] = new rrc.informationelements.DL_CommonTransChInfo_r4();
	mComponents[26] = new rrc.informationelements.DL_DeletedTransChInfoList_r7();
	mComponents[27] = new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
	mComponents[28] = new rrc.informationelements.FrequencyInfo();
	mComponents[29] = new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
	mComponents[30] = new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	mComponents[31] = new rrc.informationelements.DTX_DRX_Info_r7();
	mComponents[32] = new rrc.informationelements.HS_SCCH_LessInfo_r7();
	mComponents[33] = new rrc.informationelements.MIMO_Parameters_r9();
	mComponents[34] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[35] = new rrc.informationelements.UL_DPCH_Info_r7();
	mComponents[36] = new rrc.informationelements.UL_EDCH_Information_r9();
	mComponents[37] = new rrc.informationelements.UL_SecondaryCellInfoFDD();
	mComponents[38] = new rrc.informationelements.DL_HSPDSCH_Information_r9();
	mComponents[39] = new rrc.informationelements.DL_CommonInformation_r8();
	mComponents[40] = new rrc.informationelements.DL_InformationPerRL_List_r8();
	mComponents[41] = new rrc.informationelements.DL_SecondaryCellInfoFDD_r9();
	mComponents[42] = new rrc.informationelements.ControlChannelDRXInfo_TDD128_r8();
	mComponents[43] = new rrc.informationelements.SPS_Information_TDD128_r8();
	mComponents[44] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	mComponents[45] = new rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9();
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
		return new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	    case 1:
		return new rrc.informationelements.CipheringModeInfo_r7();
	    case 2:
		return new rrc.informationelements.SR_VCC_Info();
	    case 3:
		return new rrc.informationelements.ActivationTime();
	    case 4:
		return new rrc.informationelements.U_RNTI();
	    case 5:
		return new rrc.informationelements.C_RNTI();
	    case 6:
		return new rrc.informationelements.DSCH_RNTI();
	    case 7:
		return new rrc.informationelements.H_RNTI();
	    case 8:
		return new rrc.informationelements.E_RNTI();
	    case 9:
		return new rrc.informationelements.E_RNTI();
	    case 10:
		return rrc.informationelements.RRC_StateIndicator.cell_DCH;
	    case 11:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7();
	    case 12:
		return new rrc.informationelements.URA_Identity();
	    case 13:
		return new BOOLEAN();
	    case 14:
		return new rrc.informationelements.CN_InformationInfo_r6();
	    case 15:
		return new rrc.informationelements.SRB_InformationSetupList_r8();
	    case 16:
		return new rrc.informationelements.RAB_InformationSetupList_r8();
	    case 17:
		return new rrc.informationelements.RAB_InformationReconfigList_r8();
	    case 18:
		return new rrc.informationelements.RB_InformationReconfigList_r8();
	    case 19:
		return new rrc.informationelements.RB_InformationAffectedList_r8();
	    case 20:
		return new rrc.informationelements.DL_CounterSynchronisationInfo_r5();
	    case 21:
		return rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
	    case 22:
		return new rrc.informationelements.UL_CommonTransChInfo_r4();
	    case 23:
		return new rrc.informationelements.UL_DeletedTransChInfoList_r6();
	    case 24:
		return new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
	    case 25:
		return new rrc.informationelements.DL_CommonTransChInfo_r4();
	    case 26:
		return new rrc.informationelements.DL_DeletedTransChInfoList_r7();
	    case 27:
		return new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
	    case 28:
		return new rrc.informationelements.FrequencyInfo();
	    case 29:
		return new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
	    case 30:
		return new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	    case 31:
		return new rrc.informationelements.DTX_DRX_Info_r7();
	    case 32:
		return new rrc.informationelements.HS_SCCH_LessInfo_r7();
	    case 33:
		return new rrc.informationelements.MIMO_Parameters_r9();
	    case 34:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 35:
		return new rrc.informationelements.UL_DPCH_Info_r7();
	    case 36:
		return new rrc.informationelements.UL_EDCH_Information_r9();
	    case 37:
		return new rrc.informationelements.UL_SecondaryCellInfoFDD();
	    case 38:
		return new rrc.informationelements.DL_HSPDSCH_Information_r9();
	    case 39:
		return new rrc.informationelements.DL_CommonInformation_r8();
	    case 40:
		return new rrc.informationelements.DL_InformationPerRL_List_r8();
	    case 41:
		return new rrc.informationelements.DL_SecondaryCellInfoFDD_r9();
	    case 42:
		return new rrc.informationelements.ControlChannelDRXInfo_TDD128_r8();
	    case 43:
		return new rrc.informationelements.SPS_Information_TDD128_r8();
	    case 44:
		return rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	    case 45:
		return new rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "integrityProtectionModeInfo"
    public rrc.informationelements.IntegrityProtectionModeInfo_r7 getIntegrityProtectionModeInfo()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo_r7)mComponents[0];
    }
    
    public void setIntegrityProtectionModeInfo(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo)
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
    public rrc.informationelements.CipheringModeInfo_r7 getCipheringModeInfo()
    {
	return (rrc.informationelements.CipheringModeInfo_r7)mComponents[1];
    }
    
    public void setCipheringModeInfo(rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo)
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
    
    
    // Methods for field "sr_vcc_Info"
    public rrc.informationelements.SR_VCC_Info getSr_vcc_Info()
    {
	return (rrc.informationelements.SR_VCC_Info)mComponents[2];
    }
    
    public void setSr_vcc_Info(rrc.informationelements.SR_VCC_Info sr_vcc_Info)
    {
	mComponents[2] = sr_vcc_Info;
    }
    
    public boolean hasSr_vcc_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSr_vcc_Info()
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
    
    
    // Methods for field "new_DSCH_RNTI"
    public rrc.informationelements.DSCH_RNTI getNew_DSCH_RNTI()
    {
	return (rrc.informationelements.DSCH_RNTI)mComponents[6];
    }
    
    public void setNew_DSCH_RNTI(rrc.informationelements.DSCH_RNTI new_DSCH_RNTI)
    {
	mComponents[6] = new_DSCH_RNTI;
    }
    
    public boolean hasNew_DSCH_RNTI()
    {
	return componentIsPresent(6);
    }
    
    public void deleteNew_DSCH_RNTI()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "new_H_RNTI"
    public rrc.informationelements.H_RNTI getNew_H_RNTI()
    {
	return (rrc.informationelements.H_RNTI)mComponents[7];
    }
    
    public void setNew_H_RNTI(rrc.informationelements.H_RNTI new_H_RNTI)
    {
	mComponents[7] = new_H_RNTI;
    }
    
    public boolean hasNew_H_RNTI()
    {
	return componentIsPresent(7);
    }
    
    public void deleteNew_H_RNTI()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewPrimary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[8];
    }
    
    public void setNewPrimary_E_RNTI(rrc.informationelements.E_RNTI newPrimary_E_RNTI)
    {
	mComponents[8] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(8);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "newSecondary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewSecondary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[9];
    }
    
    public void setNewSecondary_E_RNTI(rrc.informationelements.E_RNTI newSecondary_E_RNTI)
    {
	mComponents[9] = newSecondary_E_RNTI;
    }
    
    public boolean hasNewSecondary_E_RNTI()
    {
	return componentIsPresent(9);
    }
    
    public void deleteNewSecondary_E_RNTI()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "rrc_StateIndicator"
    public rrc.informationelements.RRC_StateIndicator getRrc_StateIndicator()
    {
	return (rrc.informationelements.RRC_StateIndicator)mComponents[10];
    }
    
    public void setRrc_StateIndicator(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator)
    {
	mComponents[10] = rrc_StateIndicator;
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7)mComponents[11];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff)
    {
	mComponents[11] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "ura_Identity"
    public rrc.informationelements.URA_Identity getUra_Identity()
    {
	return (rrc.informationelements.URA_Identity)mComponents[12];
    }
    
    public void setUra_Identity(rrc.informationelements.URA_Identity ura_Identity)
    {
	mComponents[12] = ura_Identity;
    }
    
    public boolean hasUra_Identity()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUra_Identity()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "supportForChangeOfUE_Capability"
    public boolean getSupportForChangeOfUE_Capability()
    {
	return ((BOOLEAN)mComponents[13]).booleanValue();
    }
    
    public void setSupportForChangeOfUE_Capability(boolean supportForChangeOfUE_Capability)
    {
	setSupportForChangeOfUE_Capability(new BOOLEAN(supportForChangeOfUE_Capability));
    }
    
    public void setSupportForChangeOfUE_Capability(BOOLEAN supportForChangeOfUE_Capability)
    {
	mComponents[13] = supportForChangeOfUE_Capability;
    }
    
    public boolean hasSupportForChangeOfUE_Capability()
    {
	return componentIsPresent(13);
    }
    
    public void deleteSupportForChangeOfUE_Capability()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo_r6 getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo_r6)mComponents[14];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo)
    {
	mComponents[14] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(14);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "srb_InformationSetupList"
    public rrc.informationelements.SRB_InformationSetupList_r8 getSrb_InformationSetupList()
    {
	return (rrc.informationelements.SRB_InformationSetupList_r8)mComponents[15];
    }
    
    public void setSrb_InformationSetupList(rrc.informationelements.SRB_InformationSetupList_r8 srb_InformationSetupList)
    {
	mComponents[15] = srb_InformationSetupList;
    }
    
    public boolean hasSrb_InformationSetupList()
    {
	return componentIsPresent(15);
    }
    
    public void deleteSrb_InformationSetupList()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "rab_InformationSetupList"
    public rrc.informationelements.RAB_InformationSetupList_r8 getRab_InformationSetupList()
    {
	return (rrc.informationelements.RAB_InformationSetupList_r8)mComponents[16];
    }
    
    public void setRab_InformationSetupList(rrc.informationelements.RAB_InformationSetupList_r8 rab_InformationSetupList)
    {
	mComponents[16] = rab_InformationSetupList;
    }
    
    public boolean hasRab_InformationSetupList()
    {
	return componentIsPresent(16);
    }
    
    public void deleteRab_InformationSetupList()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "rab_InformationReconfigList"
    public rrc.informationelements.RAB_InformationReconfigList_r8 getRab_InformationReconfigList()
    {
	return (rrc.informationelements.RAB_InformationReconfigList_r8)mComponents[17];
    }
    
    public void setRab_InformationReconfigList(rrc.informationelements.RAB_InformationReconfigList_r8 rab_InformationReconfigList)
    {
	mComponents[17] = rab_InformationReconfigList;
    }
    
    public boolean hasRab_InformationReconfigList()
    {
	return componentIsPresent(17);
    }
    
    public void deleteRab_InformationReconfigList()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "rb_InformationReconfigList"
    public rrc.informationelements.RB_InformationReconfigList_r8 getRb_InformationReconfigList()
    {
	return (rrc.informationelements.RB_InformationReconfigList_r8)mComponents[18];
    }
    
    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList_r8 rb_InformationReconfigList)
    {
	mComponents[18] = rb_InformationReconfigList;
    }
    
    public boolean hasRb_InformationReconfigList()
    {
	return componentIsPresent(18);
    }
    
    public void deleteRb_InformationReconfigList()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "rb_InformationAffectedList"
    public rrc.informationelements.RB_InformationAffectedList_r8 getRb_InformationAffectedList()
    {
	return (rrc.informationelements.RB_InformationAffectedList_r8)mComponents[19];
    }
    
    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList_r8 rb_InformationAffectedList)
    {
	mComponents[19] = rb_InformationAffectedList;
    }
    
    public boolean hasRb_InformationAffectedList()
    {
	return componentIsPresent(19);
    }
    
    public void deleteRb_InformationAffectedList()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "dl_CounterSynchronisationInfo"
    public rrc.informationelements.DL_CounterSynchronisationInfo_r5 getDl_CounterSynchronisationInfo()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo_r5)mComponents[20];
    }
    
    public void setDl_CounterSynchronisationInfo(rrc.informationelements.DL_CounterSynchronisationInfo_r5 dl_CounterSynchronisationInfo)
    {
	mComponents[20] = dl_CounterSynchronisationInfo;
    }
    
    public boolean hasDl_CounterSynchronisationInfo()
    {
	return componentIsPresent(20);
    }
    
    public void deleteDl_CounterSynchronisationInfo()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "pdcp_ROHC_TargetMode"
    public rrc.informationelements.PDCP_ROHC_TargetMode getPdcp_ROHC_TargetMode()
    {
	return (rrc.informationelements.PDCP_ROHC_TargetMode)mComponents[21];
    }
    
    public void setPdcp_ROHC_TargetMode(rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode)
    {
	mComponents[21] = pdcp_ROHC_TargetMode;
    }
    
    public boolean hasPdcp_ROHC_TargetMode()
    {
	return componentIsPresent(21);
    }
    
    public void deletePdcp_ROHC_TargetMode()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
    {
	return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[22];
    }
    
    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
    {
	mComponents[22] = ul_CommonTransChInfo;
    }
    
    public boolean hasUl_CommonTransChInfo()
    {
	return componentIsPresent(22);
    }
    
    public void deleteUl_CommonTransChInfo()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "ul_deletedTransChInfoList"
    public rrc.informationelements.UL_DeletedTransChInfoList_r6 getUl_deletedTransChInfoList()
    {
	return (rrc.informationelements.UL_DeletedTransChInfoList_r6)mComponents[23];
    }
    
    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList)
    {
	mComponents[23] = ul_deletedTransChInfoList;
    }
    
    public boolean hasUl_deletedTransChInfoList()
    {
	return componentIsPresent(23);
    }
    
    public void deleteUl_deletedTransChInfoList()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "ul_AddReconfTransChInfoList"
    public rrc.informationelements.UL_AddReconfTransChInfoList_r8 getUl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.UL_AddReconfTransChInfoList_r8)mComponents[24];
    }
    
    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_AddReconfTransChInfoList)
    {
	mComponents[24] = ul_AddReconfTransChInfoList;
    }
    
    public boolean hasUl_AddReconfTransChInfoList()
    {
	return componentIsPresent(24);
    }
    
    public void deleteUl_AddReconfTransChInfoList()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "dl_CommonTransChInfo"
    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
    {
	return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[25];
    }
    
    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
    {
	mComponents[25] = dl_CommonTransChInfo;
    }
    
    public boolean hasDl_CommonTransChInfo()
    {
	return componentIsPresent(25);
    }
    
    public void deleteDl_CommonTransChInfo()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "dl_DeletedTransChInfoList"
    public rrc.informationelements.DL_DeletedTransChInfoList_r7 getDl_DeletedTransChInfoList()
    {
	return (rrc.informationelements.DL_DeletedTransChInfoList_r7)mComponents[26];
    }
    
    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList_r7 dl_DeletedTransChInfoList)
    {
	mComponents[26] = dl_DeletedTransChInfoList;
    }
    
    public boolean hasDl_DeletedTransChInfoList()
    {
	return componentIsPresent(26);
    }
    
    public void deleteDl_DeletedTransChInfoList()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "dl_AddReconfTransChInfoList"
    public rrc.informationelements.DL_AddReconfTransChInfoList_r9 getDl_AddReconfTransChInfoList()
    {
	return (rrc.informationelements.DL_AddReconfTransChInfoList_r9)mComponents[27];
    }
    
    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_AddReconfTransChInfoList)
    {
	mComponents[27] = dl_AddReconfTransChInfoList;
    }
    
    public boolean hasDl_AddReconfTransChInfoList()
    {
	return componentIsPresent(27);
    }
    
    public void deleteDl_AddReconfTransChInfoList()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "frequencyInfo"
    public rrc.informationelements.FrequencyInfo getFrequencyInfo()
    {
	return (rrc.informationelements.FrequencyInfo)mComponents[28];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[28] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(28);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(28);
    }
    
    
    // Methods for field "multi_frequencyInfo"
    public rrc.informationelements.Multi_frequencyInfo_LCR_r7 getMulti_frequencyInfo()
    {
	return (rrc.informationelements.Multi_frequencyInfo_LCR_r7)mComponents[29];
    }
    
    public void setMulti_frequencyInfo(rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
    {
	mComponents[29] = multi_frequencyInfo;
    }
    
    public boolean hasMulti_frequencyInfo()
    {
	return componentIsPresent(29);
    }
    
    public void deleteMulti_frequencyInfo()
    {
	setComponentAbsent(29);
    }
    
    
    // Methods for field "dtx_drx_TimingInfo"
    public rrc.informationelements.DTX_DRX_TimingInfo_r7 getDtx_drx_TimingInfo()
    {
	return (rrc.informationelements.DTX_DRX_TimingInfo_r7)mComponents[30];
    }
    
    public void setDtx_drx_TimingInfo(rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo)
    {
	mComponents[30] = dtx_drx_TimingInfo;
    }
    
    public boolean hasDtx_drx_TimingInfo()
    {
	return componentIsPresent(30);
    }
    
    public void deleteDtx_drx_TimingInfo()
    {
	setComponentAbsent(30);
    }
    
    
    // Methods for field "dtx_drx_Info"
    public rrc.informationelements.DTX_DRX_Info_r7 getDtx_drx_Info()
    {
	return (rrc.informationelements.DTX_DRX_Info_r7)mComponents[31];
    }
    
    public void setDtx_drx_Info(rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info)
    {
	mComponents[31] = dtx_drx_Info;
    }
    
    public boolean hasDtx_drx_Info()
    {
	return componentIsPresent(31);
    }
    
    public void deleteDtx_drx_Info()
    {
	setComponentAbsent(31);
    }
    
    
    // Methods for field "hs_scch_LessInfo"
    public rrc.informationelements.HS_SCCH_LessInfo_r7 getHs_scch_LessInfo()
    {
	return (rrc.informationelements.HS_SCCH_LessInfo_r7)mComponents[32];
    }
    
    public void setHs_scch_LessInfo(rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo)
    {
	mComponents[32] = hs_scch_LessInfo;
    }
    
    public boolean hasHs_scch_LessInfo()
    {
	return componentIsPresent(32);
    }
    
    public void deleteHs_scch_LessInfo()
    {
	setComponentAbsent(32);
    }
    
    
    // Methods for field "mimoParameters"
    public rrc.informationelements.MIMO_Parameters_r9 getMimoParameters()
    {
	return (rrc.informationelements.MIMO_Parameters_r9)mComponents[33];
    }
    
    public void setMimoParameters(rrc.informationelements.MIMO_Parameters_r9 mimoParameters)
    {
	mComponents[33] = mimoParameters;
    }
    
    public boolean hasMimoParameters()
    {
	return componentIsPresent(33);
    }
    
    public void deleteMimoParameters()
    {
	setComponentAbsent(33);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[34];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[34] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(34);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(34);
    }
    
    
    // Methods for field "ul_DPCH_Info"
    public rrc.informationelements.UL_DPCH_Info_r7 getUl_DPCH_Info()
    {
	return (rrc.informationelements.UL_DPCH_Info_r7)mComponents[35];
    }
    
    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info)
    {
	mComponents[35] = ul_DPCH_Info;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return componentIsPresent(35);
    }
    
    public void deleteUl_DPCH_Info()
    {
	setComponentAbsent(35);
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public rrc.informationelements.UL_EDCH_Information_r9 getUl_EDCH_Information()
    {
	return (rrc.informationelements.UL_EDCH_Information_r9)mComponents[36];
    }
    
    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_r9 ul_EDCH_Information)
    {
	mComponents[36] = ul_EDCH_Information;
    }
    
    public boolean hasUl_EDCH_Information()
    {
	return componentIsPresent(36);
    }
    
    public void deleteUl_EDCH_Information()
    {
	setComponentAbsent(36);
    }
    
    
    // Methods for field "ul_SecondaryCellInfoFDD"
    public rrc.informationelements.UL_SecondaryCellInfoFDD getUl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.UL_SecondaryCellInfoFDD)mComponents[37];
    }
    
    public void setUl_SecondaryCellInfoFDD(rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD)
    {
	mComponents[37] = ul_SecondaryCellInfoFDD;
    }
    
    public boolean hasUl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(37);
    }
    
    public void deleteUl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(37);
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information_r9 getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information_r9)mComponents[38];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information)
    {
	mComponents[38] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(38);
    }
    
    public void deleteDl_HSPDSCH_Information()
    {
	setComponentAbsent(38);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r8 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r8)mComponents[39];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r8 dl_CommonInformation)
    {
	mComponents[39] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(39);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(39);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r8 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r8)mComponents[40];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r8 dl_InformationPerRL_List)
    {
	mComponents[40] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(40);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(40);
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD"
    public rrc.informationelements.DL_SecondaryCellInfoFDD_r9 getDl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.DL_SecondaryCellInfoFDD_r9)mComponents[41];
    }
    
    public void setDl_SecondaryCellInfoFDD(rrc.informationelements.DL_SecondaryCellInfoFDD_r9 dl_SecondaryCellInfoFDD)
    {
	mComponents[41] = dl_SecondaryCellInfoFDD;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(41);
    }
    
    public void deleteDl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(41);
    }
    
    
    // Methods for field "controlChannelDRXInfo_TDD128"
    public rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 getControlChannelDRXInfo_TDD128()
    {
	return (rrc.informationelements.ControlChannelDRXInfo_TDD128_r8)mComponents[42];
    }
    
    public void setControlChannelDRXInfo_TDD128(rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 controlChannelDRXInfo_TDD128)
    {
	mComponents[42] = controlChannelDRXInfo_TDD128;
    }
    
    public boolean hasControlChannelDRXInfo_TDD128()
    {
	return componentIsPresent(42);
    }
    
    public void deleteControlChannelDRXInfo_TDD128()
    {
	setComponentAbsent(42);
    }
    
    
    // Methods for field "sps_Information_TDD128"
    public rrc.informationelements.SPS_Information_TDD128_r8 getSps_Information_TDD128()
    {
	return (rrc.informationelements.SPS_Information_TDD128_r8)mComponents[43];
    }
    
    public void setSps_Information_TDD128(rrc.informationelements.SPS_Information_TDD128_r8 sps_Information_TDD128)
    {
	mComponents[43] = sps_Information_TDD128;
    }
    
    public boolean hasSps_Information_TDD128()
    {
	return componentIsPresent(43);
    }
    
    public void deleteSps_Information_TDD128()
    {
	setComponentAbsent(43);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[44];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[44] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(44);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(44);
    }
    
    
    // Methods for field "cellDCHMeasOccasionInfo_TDD128"
    public rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 getCellDCHMeasOccasionInfo_TDD128()
    {
	return (rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9)mComponents[45];
    }
    
    public void setCellDCHMeasOccasionInfo_TDD128(rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128)
    {
	mComponents[45] = cellDCHMeasOccasionInfo_TDD128;
    }
    
    public boolean hasCellDCHMeasOccasionInfo_TDD128()
    {
	return componentIsPresent(45);
    }
    
    public void deleteCellDCHMeasOccasionInfo_TDD128()
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
	    "rrc.pdu_definitions",
	    "RadioBearerSetup_r9_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerSetup-r9-IEs"
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
				"IntegrityProtectionModeInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"IntegrityProtectionModeInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntegrityProtectionModeInfo_r7"
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
				"CipheringModeInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"CipheringModeInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CipheringModeInfo_r7"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SR_VCC_Info"
			    ),
			    new QName (
				"InformationElements",
				"SR-VCC-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SR_VCC_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SR_VCC_Info"
				)
			    ),
			    0
			)
		    ),
		    "sr-vcc-Info",
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
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "newPrimary-E-RNTI",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
				"UTRAN_DRX_CycleLengthCoefficient_r7"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-DRX-CycleLengthCoefficient-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTRAN_DRX_CycleLengthCoefficient_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTRAN_DRX_CycleLengthCoefficient_r7"
				)
			    ),
			    0
			)
		    ),
		    "utran-DRX-CycleLengthCoeff",
		    11,
		    3,
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
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    13,
		    3,
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
		    "srb-InformationSetupList",
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
		    "rab-InformationSetupList",
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
				"RAB_InformationReconfigList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RAB-InformationReconfigList-r8"
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
				    "RAB_InformationReconfig_r8"
				)
			    )
			)
		    ),
		    "rab-InformationReconfigList",
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
				"RB_InformationReconfigList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationReconfigList-r8"
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
				    "RB_InformationReconfig_r8"
				)
			    )
			)
		    ),
		    "rb-InformationReconfigList",
		    18,
		    3,
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
				"RB_InformationAffectedList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RB-InformationAffectedList-r8"
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
				    "RB_InformationAffected_r8"
				)
			    )
			)
		    ),
		    "rb-InformationAffectedList",
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
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
		    "ul-AddReconfTransChInfoList",
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
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
				"rrc.informationelements",
				"DL_DeletedTransChInfoList_r7"
			    ),
			    new QName (
				"InformationElements",
				"DL-DeletedTransChInfoList-r7"
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
				    "DL_TransportChannelIdentity_r7"
				)
			    )
			)
		    ),
		    "dl-DeletedTransChInfoList",
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
		    "dl-AddReconfTransChInfoList",
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
				"DTX_DRX_TimingInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"DTX-DRX-TimingInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_TimingInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_TimingInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "dtx-drx-TimingInfo",
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
				"DTX_DRX_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"DTX-DRX-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DTX_DRX_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "dtx-drx-Info",
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
				"HS_SCCH_LessInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-LessInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_LessInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_LessInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-LessInfo",
		    32,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8021
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MIMO_Parameters_r9"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-Parameters-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r9"
				)
			    ),
			    0
			)
		    ),
		    "mimoParameters",
		    33,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8022
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
		    34,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8023
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
		    35,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8024
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_EDCH_Information_r9"
			    ),
			    new QName (
				"InformationElements",
				"UL-EDCH-Information-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_EDCH_Information_r9"
				)
			    ),
			    0
			)
		    ),
		    "ul-EDCH-Information",
		    36,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8025
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_SecondaryCellInfoFDD"
			    ),
			    new QName (
				"InformationElements",
				"UL-SecondaryCellInfoFDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_SecondaryCellInfoFDD"
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
		    "ul-SecondaryCellInfoFDD",
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
				"rrc.informationelements",
				"DL_HSPDSCH_Information_r9"
			    ),
			    new QName (
				"InformationElements",
				"DL-HSPDSCH-Information-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_HSPDSCH_Information_r9"
				)
			    ),
			    0
			)
		    ),
		    "dl-HSPDSCH-Information",
		    38,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8027
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_CommonInformation_r8"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonInformation-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonInformation_r8"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonInformation",
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
				"rrc.informationelements",
				"DL_InformationPerRL_List_r8"
			    ),
			    new QName (
				"InformationElements",
				"DL-InformationPerRL-List-r8"
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
				    "DL_InformationPerRL_r8"
				)
			    )
			)
		    ),
		    "dl-InformationPerRL-List",
		    40,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8029
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_SecondaryCellInfoFDD_r9"
			    ),
			    new QName (
				"InformationElements",
				"DL-SecondaryCellInfoFDD-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r9"
				)
			    ),
			    0
			)
		    ),
		    "dl-SecondaryCellInfoFDD",
		    41,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802a
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ControlChannelDRXInfo_TDD128_r8"
			    ),
			    new QName (
				"InformationElements",
				"ControlChannelDRXInfo-TDD128-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ControlChannelDRXInfo_TDD128_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ControlChannelDRXInfo_TDD128_r8"
				)
			    ),
			    0
			)
		    ),
		    "controlChannelDRXInfo-TDD128",
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
				"SPS_Information_TDD128_r8"
			    ),
			    new QName (
				"InformationElements",
				"SPS-Information-TDD128-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SPS_Information_TDD128_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SPS_Information_TDD128_r8"
				)
			    ),
			    0
			)
		    ),
		    "sps-Information-TDD128",
		    43,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x802c
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
				"CellDCHMeasOccasionInfo_TDD128_r9"
			    ),
			    new QName (
				"InformationElements",
				"CellDCHMeasOccasionInfo-TDD128-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellDCHMeasOccasionInfo_TDD128_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CellDCHMeasOccasionInfo_TDD128_r9"
				)
			    ),
			    0
			)
		    ),
		    "cellDCHMeasOccasionInfo-TDD128",
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
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
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
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
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
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
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
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
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
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
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
			new TagDecoderElement((short)0x801d, 29),
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
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerSetup_r9_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerSetup_r9_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerSetup_r9_IEs
