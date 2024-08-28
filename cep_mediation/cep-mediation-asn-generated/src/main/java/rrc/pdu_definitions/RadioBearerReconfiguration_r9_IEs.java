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
 * Define the ASN1 Type RadioBearerReconfiguration_r9_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RadioBearerReconfiguration_r9_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RadioBearerReconfiguration_r9_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RadioBearerReconfiguration_r9_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.DelayRestrictionFlag delayRestrictionFlag, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    BOOLEAN supportForChangeOfUE_Capability, 
		    ResponseToChangeOfUE_Capability responseToChangeOfUE_Capability, 
		    rrc.informationelements.DefaultConfigForCellFACH defaultConfigForCellFACH, 
		    SpecificationMode specificationMode, 
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
	setActivationTime(activationTime);
	setDelayRestrictionFlag(delayRestrictionFlag);
	setNew_U_RNTI(new_U_RNTI);
	setNew_C_RNTI(new_C_RNTI);
	setNew_DSCH_RNTI(new_DSCH_RNTI);
	setNew_H_RNTI(new_H_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setRrc_StateIndicator(rrc_StateIndicator);
	setUeMobilityStateIndicator(ueMobilityStateIndicator);
	setUtran_DRX_CycleLengthCoeff(utran_DRX_CycleLengthCoeff);
	setCn_InformationInfo(cn_InformationInfo);
	setUra_Identity(ura_Identity);
	setSupportForChangeOfUE_Capability(supportForChangeOfUE_Capability);
	setResponseToChangeOfUE_Capability(responseToChangeOfUE_Capability);
	setDefaultConfigForCellFACH(defaultConfigForCellFACH);
	setSpecificationMode(specificationMode);
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
    public RadioBearerReconfiguration_r9_IEs(rrc.informationelements.IntegrityProtectionModeInfo_r7 integrityProtectionModeInfo, 
		    rrc.informationelements.CipheringModeInfo_r7 cipheringModeInfo, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.DelayRestrictionFlag delayRestrictionFlag, 
		    rrc.informationelements.U_RNTI new_U_RNTI, 
		    rrc.informationelements.C_RNTI new_C_RNTI, 
		    rrc.informationelements.DSCH_RNTI new_DSCH_RNTI, 
		    rrc.informationelements.H_RNTI new_H_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator, 
		    rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.URA_Identity ura_Identity, 
		    boolean supportForChangeOfUE_Capability, 
		    ResponseToChangeOfUE_Capability responseToChangeOfUE_Capability, 
		    rrc.informationelements.DefaultConfigForCellFACH defaultConfigForCellFACH, 
		    SpecificationMode specificationMode, 
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
	this(integrityProtectionModeInfo, cipheringModeInfo, 
	     activationTime, delayRestrictionFlag, new_U_RNTI, new_C_RNTI, 
	     new_DSCH_RNTI, new_H_RNTI, newPrimary_E_RNTI, 
	     newSecondary_E_RNTI, rrc_StateIndicator, 
	     ueMobilityStateIndicator, utran_DRX_CycleLengthCoeff, 
	     cn_InformationInfo, ura_Identity, 
	     new BOOLEAN(supportForChangeOfUE_Capability), 
	     responseToChangeOfUE_Capability, defaultConfigForCellFACH, 
	     specificationMode, frequencyInfo, multi_frequencyInfo, 
	     dtx_drx_TimingInfo, dtx_drx_Info, hs_scch_LessInfo, 
	     mimoParameters, maxAllowedUL_TX_Power, ul_DPCH_Info, 
	     ul_EDCH_Information, ul_SecondaryCellInfoFDD, 
	     dl_HSPDSCH_Information, dl_CommonInformation, 
	     dl_InformationPerRL_List, dl_SecondaryCellInfoFDD, 
	     controlChannelDRXInfo_TDD128, sps_Information_TDD128, 
	     mbms_PL_ServiceRestrictInfo, cellDCHMeasOccasionInfo_TDD128);
    }
    
    /**
     * Construct with required components.
     */
    public RadioBearerReconfiguration_r9_IEs(rrc.informationelements.RRC_StateIndicator rrc_StateIndicator, 
		    SpecificationMode specificationMode)
    {
	setRrc_StateIndicator(rrc_StateIndicator);
	setSpecificationMode(specificationMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.IntegrityProtectionModeInfo_r7();
	mComponents[1] = new rrc.informationelements.CipheringModeInfo_r7();
	mComponents[2] = new rrc.informationelements.ActivationTime();
	mComponents[3] = rrc.informationelements.DelayRestrictionFlag._true;
	mComponents[4] = new rrc.informationelements.U_RNTI();
	mComponents[5] = new rrc.informationelements.C_RNTI();
	mComponents[6] = new rrc.informationelements.DSCH_RNTI();
	mComponents[7] = new rrc.informationelements.H_RNTI();
	mComponents[8] = new rrc.informationelements.E_RNTI();
	mComponents[9] = new rrc.informationelements.E_RNTI();
	mComponents[10] = rrc.informationelements.RRC_StateIndicator.cell_DCH;
	mComponents[11] = rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	mComponents[12] = new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7();
	mComponents[13] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[14] = new rrc.informationelements.URA_Identity();
	mComponents[15] = new BOOLEAN();
	mComponents[16] = ResponseToChangeOfUE_Capability._true;
	mComponents[17] = new rrc.informationelements.DefaultConfigForCellFACH();
	mComponents[18] = new SpecificationMode();
	mComponents[19] = new rrc.informationelements.FrequencyInfo();
	mComponents[20] = new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
	mComponents[21] = new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	mComponents[22] = new rrc.informationelements.DTX_DRX_Info_r7();
	mComponents[23] = new rrc.informationelements.HS_SCCH_LessInfo_r7();
	mComponents[24] = new rrc.informationelements.MIMO_Parameters_r9();
	mComponents[25] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[26] = new rrc.informationelements.UL_DPCH_Info_r7();
	mComponents[27] = new rrc.informationelements.UL_EDCH_Information_r9();
	mComponents[28] = new rrc.informationelements.UL_SecondaryCellInfoFDD();
	mComponents[29] = new rrc.informationelements.DL_HSPDSCH_Information_r9();
	mComponents[30] = new rrc.informationelements.DL_CommonInformation_r8();
	mComponents[31] = new rrc.informationelements.DL_InformationPerRL_List_r8();
	mComponents[32] = new rrc.informationelements.DL_SecondaryCellInfoFDD_r9();
	mComponents[33] = new rrc.informationelements.ControlChannelDRXInfo_TDD128_r8();
	mComponents[34] = new rrc.informationelements.SPS_Information_TDD128_r8();
	mComponents[35] = rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	mComponents[36] = new rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[37];
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
		return new rrc.informationelements.ActivationTime();
	    case 3:
		return rrc.informationelements.DelayRestrictionFlag._true;
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
		return rrc.informationelements.High_MobilityDetected.high_MobilityDetected;
	    case 12:
		return new rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7();
	    case 13:
		return new rrc.informationelements.CN_InformationInfo_r6();
	    case 14:
		return new rrc.informationelements.URA_Identity();
	    case 15:
		return new BOOLEAN();
	    case 16:
		return ResponseToChangeOfUE_Capability._true;
	    case 17:
		return new rrc.informationelements.DefaultConfigForCellFACH();
	    case 18:
		return new SpecificationMode();
	    case 19:
		return new rrc.informationelements.FrequencyInfo();
	    case 20:
		return new rrc.informationelements.Multi_frequencyInfo_LCR_r7();
	    case 21:
		return new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	    case 22:
		return new rrc.informationelements.DTX_DRX_Info_r7();
	    case 23:
		return new rrc.informationelements.HS_SCCH_LessInfo_r7();
	    case 24:
		return new rrc.informationelements.MIMO_Parameters_r9();
	    case 25:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 26:
		return new rrc.informationelements.UL_DPCH_Info_r7();
	    case 27:
		return new rrc.informationelements.UL_EDCH_Information_r9();
	    case 28:
		return new rrc.informationelements.UL_SecondaryCellInfoFDD();
	    case 29:
		return new rrc.informationelements.DL_HSPDSCH_Information_r9();
	    case 30:
		return new rrc.informationelements.DL_CommonInformation_r8();
	    case 31:
		return new rrc.informationelements.DL_InformationPerRL_List_r8();
	    case 32:
		return new rrc.informationelements.DL_SecondaryCellInfoFDD_r9();
	    case 33:
		return new rrc.informationelements.ControlChannelDRXInfo_TDD128_r8();
	    case 34:
		return new rrc.informationelements.SPS_Information_TDD128_r8();
	    case 35:
		return rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6._true;
	    case 36:
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
    
    
    // Methods for field "delayRestrictionFlag"
    public rrc.informationelements.DelayRestrictionFlag getDelayRestrictionFlag()
    {
	return (rrc.informationelements.DelayRestrictionFlag)mComponents[3];
    }
    
    public void setDelayRestrictionFlag(rrc.informationelements.DelayRestrictionFlag delayRestrictionFlag)
    {
	mComponents[3] = delayRestrictionFlag;
    }
    
    public boolean hasDelayRestrictionFlag()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDelayRestrictionFlag()
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
    
    
    // Methods for field "ueMobilityStateIndicator"
    public rrc.informationelements.High_MobilityDetected getUeMobilityStateIndicator()
    {
	return (rrc.informationelements.High_MobilityDetected)mComponents[11];
    }
    
    public void setUeMobilityStateIndicator(rrc.informationelements.High_MobilityDetected ueMobilityStateIndicator)
    {
	mComponents[11] = ueMobilityStateIndicator;
    }
    
    public boolean hasUeMobilityStateIndicator()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUeMobilityStateIndicator()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "utran_DRX_CycleLengthCoeff"
    public rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 getUtran_DRX_CycleLengthCoeff()
    {
	return (rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7)mComponents[12];
    }
    
    public void setUtran_DRX_CycleLengthCoeff(rrc.informationelements.UTRAN_DRX_CycleLengthCoefficient_r7 utran_DRX_CycleLengthCoeff)
    {
	mComponents[12] = utran_DRX_CycleLengthCoeff;
    }
    
    public boolean hasUtran_DRX_CycleLengthCoeff()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUtran_DRX_CycleLengthCoeff()
    {
	setComponentAbsent(12);
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
    
    
    // Methods for field "supportForChangeOfUE_Capability"
    public boolean getSupportForChangeOfUE_Capability()
    {
	return ((BOOLEAN)mComponents[15]).booleanValue();
    }
    
    public void setSupportForChangeOfUE_Capability(boolean supportForChangeOfUE_Capability)
    {
	setSupportForChangeOfUE_Capability(new BOOLEAN(supportForChangeOfUE_Capability));
    }
    
    public void setSupportForChangeOfUE_Capability(BOOLEAN supportForChangeOfUE_Capability)
    {
	mComponents[15] = supportForChangeOfUE_Capability;
    }
    
    public boolean hasSupportForChangeOfUE_Capability()
    {
	return componentIsPresent(15);
    }
    
    public void deleteSupportForChangeOfUE_Capability()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "responseToChangeOfUE_Capability"
    public ResponseToChangeOfUE_Capability getResponseToChangeOfUE_Capability()
    {
	return (ResponseToChangeOfUE_Capability)mComponents[16];
    }
    
    public void setResponseToChangeOfUE_Capability(ResponseToChangeOfUE_Capability responseToChangeOfUE_Capability)
    {
	mComponents[16] = responseToChangeOfUE_Capability;
    }
    
    public boolean hasResponseToChangeOfUE_Capability()
    {
	return componentIsPresent(16);
    }
    
    public void deleteResponseToChangeOfUE_Capability()
    {
	setComponentAbsent(16);
    }
    
    
    
    /**
     * Define the ASN1 Type ResponseToChangeOfUE_Capability from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class ResponseToChangeOfUE_Capability extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ResponseToChangeOfUE_Capability()
	{
	    super(cFirstNumber);
	}
	
	protected ResponseToChangeOfUE_Capability(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final ResponseToChangeOfUE_Capability _true =
	    new ResponseToChangeOfUE_Capability(0);
	private final static ResponseToChangeOfUE_Capability cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static ResponseToChangeOfUE_Capability valueOf(long value)
	{
	    return (ResponseToChangeOfUE_Capability)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8010
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfiguration_r9_IEs$ResponseToChangeOfUE_Capability"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
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
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ResponseToChangeOfUE_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ResponseToChangeOfUE_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ResponseToChangeOfUE_Capability

    // Methods for field "defaultConfigForCellFACH"
    public rrc.informationelements.DefaultConfigForCellFACH getDefaultConfigForCellFACH()
    {
	return (rrc.informationelements.DefaultConfigForCellFACH)mComponents[17];
    }
    
    public void setDefaultConfigForCellFACH(rrc.informationelements.DefaultConfigForCellFACH defaultConfigForCellFACH)
    {
	mComponents[17] = defaultConfigForCellFACH;
    }
    
    public boolean hasDefaultConfigForCellFACH()
    {
	return componentIsPresent(17);
    }
    
    public void deleteDefaultConfigForCellFACH()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "specificationMode"
    public SpecificationMode getSpecificationMode()
    {
	return (SpecificationMode)mComponents[18];
    }
    
    public void setSpecificationMode(SpecificationMode specificationMode)
    {
	mComponents[18] = specificationMode;
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
	    public Complete(rrc.informationelements.RAB_InformationReconfigList_r8 rab_InformationReconfigList, 
			    rrc.informationelements.RAB_InformationMBMSPtpList rab_InformationMBMSPtpList, 
			    rrc.informationelements.RB_InformationReconfigList_r8 rb_InformationReconfigList, 
			    rrc.informationelements.RB_InformationAffectedList_r8 rb_InformationAffectedList, 
			    rrc.informationelements.RB_PDCPContextRelocationList rb_PDCPContextRelocationList, 
			    rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode, 
			    rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo, 
			    rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList, 
			    rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_AddReconfTransChInfoList, 
			    rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo, 
			    rrc.informationelements.DL_DeletedTransChInfoList_r7 dl_DeletedTransChInfoList, 
			    rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_AddReconfTransChInfoList)
	    {
		setRab_InformationReconfigList(rab_InformationReconfigList);
		setRab_InformationMBMSPtpList(rab_InformationMBMSPtpList);
		setRb_InformationReconfigList(rb_InformationReconfigList);
		setRb_InformationAffectedList(rb_InformationAffectedList);
		setRb_PDCPContextRelocationList(rb_PDCPContextRelocationList);
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
		mComponents[0] = new rrc.informationelements.RAB_InformationReconfigList_r8();
		mComponents[1] = new rrc.informationelements.RAB_InformationMBMSPtpList();
		mComponents[2] = new rrc.informationelements.RB_InformationReconfigList_r8();
		mComponents[3] = new rrc.informationelements.RB_InformationAffectedList_r8();
		mComponents[4] = new rrc.informationelements.RB_PDCPContextRelocationList();
		mComponents[5] = rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
		mComponents[6] = new rrc.informationelements.UL_CommonTransChInfo_r4();
		mComponents[7] = new rrc.informationelements.UL_DeletedTransChInfoList_r6();
		mComponents[8] = new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
		mComponents[9] = new rrc.informationelements.DL_CommonTransChInfo_r4();
		mComponents[10] = new rrc.informationelements.DL_DeletedTransChInfoList_r7();
		mComponents[11] = new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[12];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.RAB_InformationReconfigList_r8();
		    case 1:
			return new rrc.informationelements.RAB_InformationMBMSPtpList();
		    case 2:
			return new rrc.informationelements.RB_InformationReconfigList_r8();
		    case 3:
			return new rrc.informationelements.RB_InformationAffectedList_r8();
		    case 4:
			return new rrc.informationelements.RB_PDCPContextRelocationList();
		    case 5:
			return rrc.informationelements.PDCP_ROHC_TargetMode.o_Mode;
		    case 6:
			return new rrc.informationelements.UL_CommonTransChInfo_r4();
		    case 7:
			return new rrc.informationelements.UL_DeletedTransChInfoList_r6();
		    case 8:
			return new rrc.informationelements.UL_AddReconfTransChInfoList_r8();
		    case 9:
			return new rrc.informationelements.DL_CommonTransChInfo_r4();
		    case 10:
			return new rrc.informationelements.DL_DeletedTransChInfoList_r7();
		    case 11:
			return new rrc.informationelements.DL_AddReconfTransChInfoList_r9();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "rab_InformationReconfigList"
	    public rrc.informationelements.RAB_InformationReconfigList_r8 getRab_InformationReconfigList()
	    {
		return (rrc.informationelements.RAB_InformationReconfigList_r8)mComponents[0];
	    }
	    
	    public void setRab_InformationReconfigList(rrc.informationelements.RAB_InformationReconfigList_r8 rab_InformationReconfigList)
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
	    
	    
	    // Methods for field "rab_InformationMBMSPtpList"
	    public rrc.informationelements.RAB_InformationMBMSPtpList getRab_InformationMBMSPtpList()
	    {
		return (rrc.informationelements.RAB_InformationMBMSPtpList)mComponents[1];
	    }
	    
	    public void setRab_InformationMBMSPtpList(rrc.informationelements.RAB_InformationMBMSPtpList rab_InformationMBMSPtpList)
	    {
		mComponents[1] = rab_InformationMBMSPtpList;
	    }
	    
	    public boolean hasRab_InformationMBMSPtpList()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteRab_InformationMBMSPtpList()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "rb_InformationReconfigList"
	    public rrc.informationelements.RB_InformationReconfigList_r8 getRb_InformationReconfigList()
	    {
		return (rrc.informationelements.RB_InformationReconfigList_r8)mComponents[2];
	    }
	    
	    public void setRb_InformationReconfigList(rrc.informationelements.RB_InformationReconfigList_r8 rb_InformationReconfigList)
	    {
		mComponents[2] = rb_InformationReconfigList;
	    }
	    
	    public boolean hasRb_InformationReconfigList()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteRb_InformationReconfigList()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rb_InformationAffectedList"
	    public rrc.informationelements.RB_InformationAffectedList_r8 getRb_InformationAffectedList()
	    {
		return (rrc.informationelements.RB_InformationAffectedList_r8)mComponents[3];
	    }
	    
	    public void setRb_InformationAffectedList(rrc.informationelements.RB_InformationAffectedList_r8 rb_InformationAffectedList)
	    {
		mComponents[3] = rb_InformationAffectedList;
	    }
	    
	    public boolean hasRb_InformationAffectedList()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRb_InformationAffectedList()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "rb_PDCPContextRelocationList"
	    public rrc.informationelements.RB_PDCPContextRelocationList getRb_PDCPContextRelocationList()
	    {
		return (rrc.informationelements.RB_PDCPContextRelocationList)mComponents[4];
	    }
	    
	    public void setRb_PDCPContextRelocationList(rrc.informationelements.RB_PDCPContextRelocationList rb_PDCPContextRelocationList)
	    {
		mComponents[4] = rb_PDCPContextRelocationList;
	    }
	    
	    public boolean hasRb_PDCPContextRelocationList()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteRb_PDCPContextRelocationList()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "pdcp_ROHC_TargetMode"
	    public rrc.informationelements.PDCP_ROHC_TargetMode getPdcp_ROHC_TargetMode()
	    {
		return (rrc.informationelements.PDCP_ROHC_TargetMode)mComponents[5];
	    }
	    
	    public void setPdcp_ROHC_TargetMode(rrc.informationelements.PDCP_ROHC_TargetMode pdcp_ROHC_TargetMode)
	    {
		mComponents[5] = pdcp_ROHC_TargetMode;
	    }
	    
	    public boolean hasPdcp_ROHC_TargetMode()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deletePdcp_ROHC_TargetMode()
	    {
		setComponentAbsent(5);
	    }
	    
	    
	    // Methods for field "ul_CommonTransChInfo"
	    public rrc.informationelements.UL_CommonTransChInfo_r4 getUl_CommonTransChInfo()
	    {
		return (rrc.informationelements.UL_CommonTransChInfo_r4)mComponents[6];
	    }
	    
	    public void setUl_CommonTransChInfo(rrc.informationelements.UL_CommonTransChInfo_r4 ul_CommonTransChInfo)
	    {
		mComponents[6] = ul_CommonTransChInfo;
	    }
	    
	    public boolean hasUl_CommonTransChInfo()
	    {
		return componentIsPresent(6);
	    }
	    
	    public void deleteUl_CommonTransChInfo()
	    {
		setComponentAbsent(6);
	    }
	    
	    
	    // Methods for field "ul_deletedTransChInfoList"
	    public rrc.informationelements.UL_DeletedTransChInfoList_r6 getUl_deletedTransChInfoList()
	    {
		return (rrc.informationelements.UL_DeletedTransChInfoList_r6)mComponents[7];
	    }
	    
	    public void setUl_deletedTransChInfoList(rrc.informationelements.UL_DeletedTransChInfoList_r6 ul_deletedTransChInfoList)
	    {
		mComponents[7] = ul_deletedTransChInfoList;
	    }
	    
	    public boolean hasUl_deletedTransChInfoList()
	    {
		return componentIsPresent(7);
	    }
	    
	    public void deleteUl_deletedTransChInfoList()
	    {
		setComponentAbsent(7);
	    }
	    
	    
	    // Methods for field "ul_AddReconfTransChInfoList"
	    public rrc.informationelements.UL_AddReconfTransChInfoList_r8 getUl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.UL_AddReconfTransChInfoList_r8)mComponents[8];
	    }
	    
	    public void setUl_AddReconfTransChInfoList(rrc.informationelements.UL_AddReconfTransChInfoList_r8 ul_AddReconfTransChInfoList)
	    {
		mComponents[8] = ul_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasUl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(8);
	    }
	    
	    public void deleteUl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(8);
	    }
	    
	    
	    // Methods for field "dl_CommonTransChInfo"
	    public rrc.informationelements.DL_CommonTransChInfo_r4 getDl_CommonTransChInfo()
	    {
		return (rrc.informationelements.DL_CommonTransChInfo_r4)mComponents[9];
	    }
	    
	    public void setDl_CommonTransChInfo(rrc.informationelements.DL_CommonTransChInfo_r4 dl_CommonTransChInfo)
	    {
		mComponents[9] = dl_CommonTransChInfo;
	    }
	    
	    public boolean hasDl_CommonTransChInfo()
	    {
		return componentIsPresent(9);
	    }
	    
	    public void deleteDl_CommonTransChInfo()
	    {
		setComponentAbsent(9);
	    }
	    
	    
	    // Methods for field "dl_DeletedTransChInfoList"
	    public rrc.informationelements.DL_DeletedTransChInfoList_r7 getDl_DeletedTransChInfoList()
	    {
		return (rrc.informationelements.DL_DeletedTransChInfoList_r7)mComponents[10];
	    }
	    
	    public void setDl_DeletedTransChInfoList(rrc.informationelements.DL_DeletedTransChInfoList_r7 dl_DeletedTransChInfoList)
	    {
		mComponents[10] = dl_DeletedTransChInfoList;
	    }
	    
	    public boolean hasDl_DeletedTransChInfoList()
	    {
		return componentIsPresent(10);
	    }
	    
	    public void deleteDl_DeletedTransChInfoList()
	    {
		setComponentAbsent(10);
	    }
	    
	    
	    // Methods for field "dl_AddReconfTransChInfoList"
	    public rrc.informationelements.DL_AddReconfTransChInfoList_r9 getDl_AddReconfTransChInfoList()
	    {
		return (rrc.informationelements.DL_AddReconfTransChInfoList_r9)mComponents[11];
	    }
	    
	    public void setDl_AddReconfTransChInfoList(rrc.informationelements.DL_AddReconfTransChInfoList_r9 dl_AddReconfTransChInfoList)
	    {
		mComponents[11] = dl_AddReconfTransChInfoList;
	    }
	    
	    public boolean hasDl_AddReconfTransChInfoList()
	    {
		return componentIsPresent(11);
	    }
	    
	    public void deleteDl_AddReconfTransChInfoList()
	    {
		setComponentAbsent(11);
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
		    "RadioBearerReconfiguration_r9_IEs$SpecificationMode$Complete"
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
					"RAB_InformationMBMSPtpList"
				    ),
				    new QName (
					"InformationElements",
					"RAB-InformationMBMSPtpList"
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
					    "RAB_InformationMBMSPtp"
					)
				    )
				)
			    ),
			    "rab-InformationMBMSPtpList",
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
			    4,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
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
			    5,
			    3,
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
			    11,
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
				new TagDecoderElement((short)0x800b, 11)
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
				new TagDecoderElement((short)0x800b, 11)
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
				new TagDecoderElement((short)0x800b, 11)
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
				new TagDecoderElement((short)0x800b, 11)
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
				new TagDecoderElement((short)0x800b, 11)
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
				new TagDecoderElement((short)0x800b, 11)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8006, 6),
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8007, 7),
				new TagDecoderElement((short)0x8008, 8),
				new TagDecoderElement((short)0x8009, 9),
				new TagDecoderElement((short)0x800a, 10),
				new TagDecoderElement((short)0x800b, 11)
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
			    "RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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
			"RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
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
					"RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration$PreConfigMode$DefaultConfig"
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
		    "RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration"
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
				    "RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration$PreConfigMode"
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
		    (short)0x8012
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RadioBearerReconfiguration_r9_IEs$SpecificationMode"
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
				"RadioBearerReconfiguration_r9_IEs$SpecificationMode$Complete"
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
				"RadioBearerReconfiguration_r9_IEs$SpecificationMode$Preconfiguration"
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
	return (rrc.informationelements.FrequencyInfo)mComponents[19];
    }
    
    public void setFrequencyInfo(rrc.informationelements.FrequencyInfo frequencyInfo)
    {
	mComponents[19] = frequencyInfo;
    }
    
    public boolean hasFrequencyInfo()
    {
	return componentIsPresent(19);
    }
    
    public void deleteFrequencyInfo()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "multi_frequencyInfo"
    public rrc.informationelements.Multi_frequencyInfo_LCR_r7 getMulti_frequencyInfo()
    {
	return (rrc.informationelements.Multi_frequencyInfo_LCR_r7)mComponents[20];
    }
    
    public void setMulti_frequencyInfo(rrc.informationelements.Multi_frequencyInfo_LCR_r7 multi_frequencyInfo)
    {
	mComponents[20] = multi_frequencyInfo;
    }
    
    public boolean hasMulti_frequencyInfo()
    {
	return componentIsPresent(20);
    }
    
    public void deleteMulti_frequencyInfo()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "dtx_drx_TimingInfo"
    public rrc.informationelements.DTX_DRX_TimingInfo_r7 getDtx_drx_TimingInfo()
    {
	return (rrc.informationelements.DTX_DRX_TimingInfo_r7)mComponents[21];
    }
    
    public void setDtx_drx_TimingInfo(rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo)
    {
	mComponents[21] = dtx_drx_TimingInfo;
    }
    
    public boolean hasDtx_drx_TimingInfo()
    {
	return componentIsPresent(21);
    }
    
    public void deleteDtx_drx_TimingInfo()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "dtx_drx_Info"
    public rrc.informationelements.DTX_DRX_Info_r7 getDtx_drx_Info()
    {
	return (rrc.informationelements.DTX_DRX_Info_r7)mComponents[22];
    }
    
    public void setDtx_drx_Info(rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info)
    {
	mComponents[22] = dtx_drx_Info;
    }
    
    public boolean hasDtx_drx_Info()
    {
	return componentIsPresent(22);
    }
    
    public void deleteDtx_drx_Info()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "hs_scch_LessInfo"
    public rrc.informationelements.HS_SCCH_LessInfo_r7 getHs_scch_LessInfo()
    {
	return (rrc.informationelements.HS_SCCH_LessInfo_r7)mComponents[23];
    }
    
    public void setHs_scch_LessInfo(rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo)
    {
	mComponents[23] = hs_scch_LessInfo;
    }
    
    public boolean hasHs_scch_LessInfo()
    {
	return componentIsPresent(23);
    }
    
    public void deleteHs_scch_LessInfo()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "mimoParameters"
    public rrc.informationelements.MIMO_Parameters_r9 getMimoParameters()
    {
	return (rrc.informationelements.MIMO_Parameters_r9)mComponents[24];
    }
    
    public void setMimoParameters(rrc.informationelements.MIMO_Parameters_r9 mimoParameters)
    {
	mComponents[24] = mimoParameters;
    }
    
    public boolean hasMimoParameters()
    {
	return componentIsPresent(24);
    }
    
    public void deleteMimoParameters()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[25];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[25] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(25);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "ul_DPCH_Info"
    public rrc.informationelements.UL_DPCH_Info_r7 getUl_DPCH_Info()
    {
	return (rrc.informationelements.UL_DPCH_Info_r7)mComponents[26];
    }
    
    public void setUl_DPCH_Info(rrc.informationelements.UL_DPCH_Info_r7 ul_DPCH_Info)
    {
	mComponents[26] = ul_DPCH_Info;
    }
    
    public boolean hasUl_DPCH_Info()
    {
	return componentIsPresent(26);
    }
    
    public void deleteUl_DPCH_Info()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "ul_EDCH_Information"
    public rrc.informationelements.UL_EDCH_Information_r9 getUl_EDCH_Information()
    {
	return (rrc.informationelements.UL_EDCH_Information_r9)mComponents[27];
    }
    
    public void setUl_EDCH_Information(rrc.informationelements.UL_EDCH_Information_r9 ul_EDCH_Information)
    {
	mComponents[27] = ul_EDCH_Information;
    }
    
    public boolean hasUl_EDCH_Information()
    {
	return componentIsPresent(27);
    }
    
    public void deleteUl_EDCH_Information()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "ul_SecondaryCellInfoFDD"
    public rrc.informationelements.UL_SecondaryCellInfoFDD getUl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.UL_SecondaryCellInfoFDD)mComponents[28];
    }
    
    public void setUl_SecondaryCellInfoFDD(rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD)
    {
	mComponents[28] = ul_SecondaryCellInfoFDD;
    }
    
    public boolean hasUl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(28);
    }
    
    public void deleteUl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(28);
    }
    
    
    // Methods for field "dl_HSPDSCH_Information"
    public rrc.informationelements.DL_HSPDSCH_Information_r9 getDl_HSPDSCH_Information()
    {
	return (rrc.informationelements.DL_HSPDSCH_Information_r9)mComponents[29];
    }
    
    public void setDl_HSPDSCH_Information(rrc.informationelements.DL_HSPDSCH_Information_r9 dl_HSPDSCH_Information)
    {
	mComponents[29] = dl_HSPDSCH_Information;
    }
    
    public boolean hasDl_HSPDSCH_Information()
    {
	return componentIsPresent(29);
    }
    
    public void deleteDl_HSPDSCH_Information()
    {
	setComponentAbsent(29);
    }
    
    
    // Methods for field "dl_CommonInformation"
    public rrc.informationelements.DL_CommonInformation_r8 getDl_CommonInformation()
    {
	return (rrc.informationelements.DL_CommonInformation_r8)mComponents[30];
    }
    
    public void setDl_CommonInformation(rrc.informationelements.DL_CommonInformation_r8 dl_CommonInformation)
    {
	mComponents[30] = dl_CommonInformation;
    }
    
    public boolean hasDl_CommonInformation()
    {
	return componentIsPresent(30);
    }
    
    public void deleteDl_CommonInformation()
    {
	setComponentAbsent(30);
    }
    
    
    // Methods for field "dl_InformationPerRL_List"
    public rrc.informationelements.DL_InformationPerRL_List_r8 getDl_InformationPerRL_List()
    {
	return (rrc.informationelements.DL_InformationPerRL_List_r8)mComponents[31];
    }
    
    public void setDl_InformationPerRL_List(rrc.informationelements.DL_InformationPerRL_List_r8 dl_InformationPerRL_List)
    {
	mComponents[31] = dl_InformationPerRL_List;
    }
    
    public boolean hasDl_InformationPerRL_List()
    {
	return componentIsPresent(31);
    }
    
    public void deleteDl_InformationPerRL_List()
    {
	setComponentAbsent(31);
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD"
    public rrc.informationelements.DL_SecondaryCellInfoFDD_r9 getDl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.DL_SecondaryCellInfoFDD_r9)mComponents[32];
    }
    
    public void setDl_SecondaryCellInfoFDD(rrc.informationelements.DL_SecondaryCellInfoFDD_r9 dl_SecondaryCellInfoFDD)
    {
	mComponents[32] = dl_SecondaryCellInfoFDD;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(32);
    }
    
    public void deleteDl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(32);
    }
    
    
    // Methods for field "controlChannelDRXInfo_TDD128"
    public rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 getControlChannelDRXInfo_TDD128()
    {
	return (rrc.informationelements.ControlChannelDRXInfo_TDD128_r8)mComponents[33];
    }
    
    public void setControlChannelDRXInfo_TDD128(rrc.informationelements.ControlChannelDRXInfo_TDD128_r8 controlChannelDRXInfo_TDD128)
    {
	mComponents[33] = controlChannelDRXInfo_TDD128;
    }
    
    public boolean hasControlChannelDRXInfo_TDD128()
    {
	return componentIsPresent(33);
    }
    
    public void deleteControlChannelDRXInfo_TDD128()
    {
	setComponentAbsent(33);
    }
    
    
    // Methods for field "sps_Information_TDD128"
    public rrc.informationelements.SPS_Information_TDD128_r8 getSps_Information_TDD128()
    {
	return (rrc.informationelements.SPS_Information_TDD128_r8)mComponents[34];
    }
    
    public void setSps_Information_TDD128(rrc.informationelements.SPS_Information_TDD128_r8 sps_Information_TDD128)
    {
	mComponents[34] = sps_Information_TDD128;
    }
    
    public boolean hasSps_Information_TDD128()
    {
	return componentIsPresent(34);
    }
    
    public void deleteSps_Information_TDD128()
    {
	setComponentAbsent(34);
    }
    
    
    // Methods for field "mbms_PL_ServiceRestrictInfo"
    public rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 getMbms_PL_ServiceRestrictInfo()
    {
	return (rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6)mComponents[35];
    }
    
    public void setMbms_PL_ServiceRestrictInfo(rrc.informationelements.MBMS_PL_ServiceRestrictInfo_r6 mbms_PL_ServiceRestrictInfo)
    {
	mComponents[35] = mbms_PL_ServiceRestrictInfo;
    }
    
    public boolean hasMbms_PL_ServiceRestrictInfo()
    {
	return componentIsPresent(35);
    }
    
    public void deleteMbms_PL_ServiceRestrictInfo()
    {
	setComponentAbsent(35);
    }
    
    
    // Methods for field "cellDCHMeasOccasionInfo_TDD128"
    public rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 getCellDCHMeasOccasionInfo_TDD128()
    {
	return (rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9)mComponents[36];
    }
    
    public void setCellDCHMeasOccasionInfo_TDD128(rrc.informationelements.CellDCHMeasOccasionInfo_TDD128_r9 cellDCHMeasOccasionInfo_TDD128)
    {
	mComponents[36] = cellDCHMeasOccasionInfo_TDD128;
    }
    
    public boolean hasCellDCHMeasOccasionInfo_TDD128()
    {
	return componentIsPresent(36);
    }
    
    public void deleteCellDCHMeasOccasionInfo_TDD128()
    {
	setComponentAbsent(36);
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
	    "RadioBearerReconfiguration_r9_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RadioBearerReconfiguration-r9-IEs"
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DelayRestrictionFlag"
			    ),
			    new QName (
				"InformationElements",
				"DelayRestrictionFlag"
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
			    rrc.informationelements.DelayRestrictionFlag._true
			)
		    ),
		    "delayRestrictionFlag",
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"High_MobilityDetected"
			    ),
			    new QName (
				"InformationElements",
				"High-MobilityDetected"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"high-MobilityDetected",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.High_MobilityDetected.high_MobilityDetected
			)
		    ),
		    "ueMobilityStateIndicator",
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_r9_IEs$ResponseToChangeOfUE_Capability"
			)
		    ),
		    "responseToChangeOfUE-Capability",
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
				"DefaultConfigForCellFACH"
			    ),
			    new QName (
				"InformationElements",
				"DefaultConfigForCellFACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DefaultConfigForCellFACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DefaultConfigForCellFACH"
				)
			    ),
			    0
			)
		    ),
		    "defaultConfigForCellFACH",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RadioBearerReconfiguration_r9_IEs$SpecificationMode"
			)
		    ),
		    "specificationMode",
		    18,
		    2,
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
		    23,
		    3,
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
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
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
		    26,
		    3,
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
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
		    30,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
		    34,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8023
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
		    36,
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
			new TagDecoderElement((short)0x8012, 18)
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
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
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
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801f, 31),
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8020, 32),
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8021, 33),
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8022, 34),
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8023, 35),
			new TagDecoderElement((short)0x8024, 36)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8024, 36)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_r9_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioBearerReconfiguration_r9_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioBearerReconfiguration_r9_IEs
