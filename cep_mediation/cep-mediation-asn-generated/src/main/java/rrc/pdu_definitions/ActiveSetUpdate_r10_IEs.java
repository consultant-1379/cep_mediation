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
 * Define the ASN1 Type ActiveSetUpdate_r10_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ActiveSetUpdate_r10_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate_r10_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ActiveSetUpdate_r10_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI newU_RNTI, 
		    rrc.informationelements.H_RNTI newH_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo, 
		    rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info, 
		    rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo, 
		    rrc.informationelements.MIMO_Parameters_r9 mimoParameters, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD, 
		    rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency e_dch_ReconfigurationInfo_SecULFrequency, 
		    rrc.informationelements.RL_AdditionInformationList_r10 rl_AdditionInformationList, 
		    rrc.informationelements.RL_AdditionInformationList_SecULFreq rl_AdditionInformationList_SecULFreq, 
		    rrc.informationelements.ServingCellChangeParameters servingCellChangeParameters, 
		    rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList, 
		    rrc.informationelements.RL_RemovalInformationList_SecULFreq rl_RemovalInformationList_SecULFreq, 
		    rrc.informationelements.TX_DiversityMode tx_DiversityMode, 
		    rrc.informationelements.DPC_Mode dpc_Mode, 
		    rrc.informationelements.Serving_HSDSCH_CellInformation_r9 serving_HSDSCH_CellInformation, 
		    rrc.informationelements.E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo, 
		    rrc.informationelements.UL_16QAM_Config ul_16QAM_Config, 
		    rrc.informationelements.E_DCH_RL_InfoSameServingCell e_dch_ReconfInfoSameCell, 
		    rrc.informationelements.E_TFC_Boost_Info_r7 e_TFC_Boost_Info, 
		    rrc.informationelements.E_DPDCH_PowerInterpolation e_DPDCH_PowerInterpolation, 
		    rrc.informationelements.DL_SecondaryCellInfoFDD_r10 dl_SecondaryCellInfoFDD, 
		    rrc.informationelements.AdditionalDLSecCellInfoListFDD additionalDLSecCellInfoListFDD)
    {
	setActivationTime(activationTime);
	setNewU_RNTI(newU_RNTI);
	setNewH_RNTI(newH_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setCn_InformationInfo(cn_InformationInfo);
	setDtx_drx_TimingInfo(dtx_drx_TimingInfo);
	setDtx_drx_Info(dtx_drx_Info);
	setHs_scch_LessInfo(hs_scch_LessInfo);
	setMimoParameters(mimoParameters);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setUl_SecondaryCellInfoFDD(ul_SecondaryCellInfoFDD);
	setE_dch_ReconfigurationInfo_SecULFrequency(e_dch_ReconfigurationInfo_SecULFrequency);
	setRl_AdditionInformationList(rl_AdditionInformationList);
	setRl_AdditionInformationList_SecULFreq(rl_AdditionInformationList_SecULFreq);
	setServingCellChangeParameters(servingCellChangeParameters);
	setRl_RemovalInformationList(rl_RemovalInformationList);
	setRl_RemovalInformationList_SecULFreq(rl_RemovalInformationList_SecULFreq);
	setTx_DiversityMode(tx_DiversityMode);
	setDpc_Mode(dpc_Mode);
	setServing_HSDSCH_CellInformation(serving_HSDSCH_CellInformation);
	setE_dch_ReconfigurationInfo(e_dch_ReconfigurationInfo);
	setUl_16QAM_Config(ul_16QAM_Config);
	setE_dch_ReconfInfoSameCell(e_dch_ReconfInfoSameCell);
	setE_TFC_Boost_Info(e_TFC_Boost_Info);
	setE_DPDCH_PowerInterpolation(e_DPDCH_PowerInterpolation);
	setDl_SecondaryCellInfoFDD(dl_SecondaryCellInfoFDD);
	setAdditionalDLSecCellInfoListFDD(additionalDLSecCellInfoListFDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = new rrc.informationelements.U_RNTI();
	mComponents[2] = new rrc.informationelements.H_RNTI();
	mComponents[3] = new rrc.informationelements.E_RNTI();
	mComponents[4] = new rrc.informationelements.E_RNTI();
	mComponents[5] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[6] = new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	mComponents[7] = new rrc.informationelements.DTX_DRX_Info_r7();
	mComponents[8] = new rrc.informationelements.HS_SCCH_LessInfo_r7();
	mComponents[9] = new rrc.informationelements.MIMO_Parameters_r9();
	mComponents[10] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[11] = new rrc.informationelements.UL_SecondaryCellInfoFDD();
	mComponents[12] = new rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency();
	mComponents[13] = new rrc.informationelements.RL_AdditionInformationList_r10();
	mComponents[14] = new rrc.informationelements.RL_AdditionInformationList_SecULFreq();
	mComponents[15] = new rrc.informationelements.ServingCellChangeParameters();
	mComponents[16] = new rrc.informationelements.RL_RemovalInformationList();
	mComponents[17] = new rrc.informationelements.RL_RemovalInformationList_SecULFreq();
	mComponents[18] = rrc.informationelements.TX_DiversityMode.noDiversity;
	mComponents[19] = rrc.informationelements.DPC_Mode.singleTPC;
	mComponents[20] = new rrc.informationelements.Serving_HSDSCH_CellInformation_r9();
	mComponents[21] = new rrc.informationelements.E_DCH_ReconfigurationInfo_r7();
	mComponents[22] = new rrc.informationelements.UL_16QAM_Config();
	mComponents[23] = new rrc.informationelements.E_DCH_RL_InfoSameServingCell();
	mComponents[24] = new rrc.informationelements.E_TFC_Boost_Info_r7();
	mComponents[25] = new rrc.informationelements.E_DPDCH_PowerInterpolation();
	mComponents[26] = new rrc.informationelements.DL_SecondaryCellInfoFDD_r10();
	mComponents[27] = new rrc.informationelements.AdditionalDLSecCellInfoListFDD();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[28];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.ActivationTime();
	    case 1:
		return new rrc.informationelements.U_RNTI();
	    case 2:
		return new rrc.informationelements.H_RNTI();
	    case 3:
		return new rrc.informationelements.E_RNTI();
	    case 4:
		return new rrc.informationelements.E_RNTI();
	    case 5:
		return new rrc.informationelements.CN_InformationInfo_r6();
	    case 6:
		return new rrc.informationelements.DTX_DRX_TimingInfo_r7();
	    case 7:
		return new rrc.informationelements.DTX_DRX_Info_r7();
	    case 8:
		return new rrc.informationelements.HS_SCCH_LessInfo_r7();
	    case 9:
		return new rrc.informationelements.MIMO_Parameters_r9();
	    case 10:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 11:
		return new rrc.informationelements.UL_SecondaryCellInfoFDD();
	    case 12:
		return new rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency();
	    case 13:
		return new rrc.informationelements.RL_AdditionInformationList_r10();
	    case 14:
		return new rrc.informationelements.RL_AdditionInformationList_SecULFreq();
	    case 15:
		return new rrc.informationelements.ServingCellChangeParameters();
	    case 16:
		return new rrc.informationelements.RL_RemovalInformationList();
	    case 17:
		return new rrc.informationelements.RL_RemovalInformationList_SecULFreq();
	    case 18:
		return rrc.informationelements.TX_DiversityMode.noDiversity;
	    case 19:
		return rrc.informationelements.DPC_Mode.singleTPC;
	    case 20:
		return new rrc.informationelements.Serving_HSDSCH_CellInformation_r9();
	    case 21:
		return new rrc.informationelements.E_DCH_ReconfigurationInfo_r7();
	    case 22:
		return new rrc.informationelements.UL_16QAM_Config();
	    case 23:
		return new rrc.informationelements.E_DCH_RL_InfoSameServingCell();
	    case 24:
		return new rrc.informationelements.E_TFC_Boost_Info_r7();
	    case 25:
		return new rrc.informationelements.E_DPDCH_PowerInterpolation();
	    case 26:
		return new rrc.informationelements.DL_SecondaryCellInfoFDD_r10();
	    case 27:
		return new rrc.informationelements.AdditionalDLSecCellInfoListFDD();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[0];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[0] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "newU_RNTI"
    public rrc.informationelements.U_RNTI getNewU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[1];
    }
    
    public void setNewU_RNTI(rrc.informationelements.U_RNTI newU_RNTI)
    {
	mComponents[1] = newU_RNTI;
    }
    
    public boolean hasNewU_RNTI()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNewU_RNTI()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "newH_RNTI"
    public rrc.informationelements.H_RNTI getNewH_RNTI()
    {
	return (rrc.informationelements.H_RNTI)mComponents[2];
    }
    
    public void setNewH_RNTI(rrc.informationelements.H_RNTI newH_RNTI)
    {
	mComponents[2] = newH_RNTI;
    }
    
    public boolean hasNewH_RNTI()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNewH_RNTI()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "newPrimary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewPrimary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[3];
    }
    
    public void setNewPrimary_E_RNTI(rrc.informationelements.E_RNTI newPrimary_E_RNTI)
    {
	mComponents[3] = newPrimary_E_RNTI;
    }
    
    public boolean hasNewPrimary_E_RNTI()
    {
	return componentIsPresent(3);
    }
    
    public void deleteNewPrimary_E_RNTI()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "newSecondary_E_RNTI"
    public rrc.informationelements.E_RNTI getNewSecondary_E_RNTI()
    {
	return (rrc.informationelements.E_RNTI)mComponents[4];
    }
    
    public void setNewSecondary_E_RNTI(rrc.informationelements.E_RNTI newSecondary_E_RNTI)
    {
	mComponents[4] = newSecondary_E_RNTI;
    }
    
    public boolean hasNewSecondary_E_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNewSecondary_E_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo_r6 getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo_r6)mComponents[5];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo)
    {
	mComponents[5] = cn_InformationInfo;
    }
    
    public boolean hasCn_InformationInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCn_InformationInfo()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "dtx_drx_TimingInfo"
    public rrc.informationelements.DTX_DRX_TimingInfo_r7 getDtx_drx_TimingInfo()
    {
	return (rrc.informationelements.DTX_DRX_TimingInfo_r7)mComponents[6];
    }
    
    public void setDtx_drx_TimingInfo(rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo)
    {
	mComponents[6] = dtx_drx_TimingInfo;
    }
    
    public boolean hasDtx_drx_TimingInfo()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDtx_drx_TimingInfo()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "dtx_drx_Info"
    public rrc.informationelements.DTX_DRX_Info_r7 getDtx_drx_Info()
    {
	return (rrc.informationelements.DTX_DRX_Info_r7)mComponents[7];
    }
    
    public void setDtx_drx_Info(rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info)
    {
	mComponents[7] = dtx_drx_Info;
    }
    
    public boolean hasDtx_drx_Info()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDtx_drx_Info()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "hs_scch_LessInfo"
    public rrc.informationelements.HS_SCCH_LessInfo_r7 getHs_scch_LessInfo()
    {
	return (rrc.informationelements.HS_SCCH_LessInfo_r7)mComponents[8];
    }
    
    public void setHs_scch_LessInfo(rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo)
    {
	mComponents[8] = hs_scch_LessInfo;
    }
    
    public boolean hasHs_scch_LessInfo()
    {
	return componentIsPresent(8);
    }
    
    public void deleteHs_scch_LessInfo()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "mimoParameters"
    public rrc.informationelements.MIMO_Parameters_r9 getMimoParameters()
    {
	return (rrc.informationelements.MIMO_Parameters_r9)mComponents[9];
    }
    
    public void setMimoParameters(rrc.informationelements.MIMO_Parameters_r9 mimoParameters)
    {
	mComponents[9] = mimoParameters;
    }
    
    public boolean hasMimoParameters()
    {
	return componentIsPresent(9);
    }
    
    public void deleteMimoParameters()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[10];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[10] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(10);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "ul_SecondaryCellInfoFDD"
    public rrc.informationelements.UL_SecondaryCellInfoFDD getUl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.UL_SecondaryCellInfoFDD)mComponents[11];
    }
    
    public void setUl_SecondaryCellInfoFDD(rrc.informationelements.UL_SecondaryCellInfoFDD ul_SecondaryCellInfoFDD)
    {
	mComponents[11] = ul_SecondaryCellInfoFDD;
    }
    
    public boolean hasUl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "e_dch_ReconfigurationInfo_SecULFrequency"
    public rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency getE_dch_ReconfigurationInfo_SecULFrequency()
    {
	return (rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency)mComponents[12];
    }
    
    public void setE_dch_ReconfigurationInfo_SecULFrequency(rrc.informationelements.E_DCH_ReconfigurationInfo_SecULFrequency e_dch_ReconfigurationInfo_SecULFrequency)
    {
	mComponents[12] = e_dch_ReconfigurationInfo_SecULFrequency;
    }
    
    public boolean hasE_dch_ReconfigurationInfo_SecULFrequency()
    {
	return componentIsPresent(12);
    }
    
    public void deleteE_dch_ReconfigurationInfo_SecULFrequency()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "rl_AdditionInformationList"
    public rrc.informationelements.RL_AdditionInformationList_r10 getRl_AdditionInformationList()
    {
	return (rrc.informationelements.RL_AdditionInformationList_r10)mComponents[13];
    }
    
    public void setRl_AdditionInformationList(rrc.informationelements.RL_AdditionInformationList_r10 rl_AdditionInformationList)
    {
	mComponents[13] = rl_AdditionInformationList;
    }
    
    public boolean hasRl_AdditionInformationList()
    {
	return componentIsPresent(13);
    }
    
    public void deleteRl_AdditionInformationList()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "rl_AdditionInformationList_SecULFreq"
    public rrc.informationelements.RL_AdditionInformationList_SecULFreq getRl_AdditionInformationList_SecULFreq()
    {
	return (rrc.informationelements.RL_AdditionInformationList_SecULFreq)mComponents[14];
    }
    
    public void setRl_AdditionInformationList_SecULFreq(rrc.informationelements.RL_AdditionInformationList_SecULFreq rl_AdditionInformationList_SecULFreq)
    {
	mComponents[14] = rl_AdditionInformationList_SecULFreq;
    }
    
    public boolean hasRl_AdditionInformationList_SecULFreq()
    {
	return componentIsPresent(14);
    }
    
    public void deleteRl_AdditionInformationList_SecULFreq()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "servingCellChangeParameters"
    public rrc.informationelements.ServingCellChangeParameters getServingCellChangeParameters()
    {
	return (rrc.informationelements.ServingCellChangeParameters)mComponents[15];
    }
    
    public void setServingCellChangeParameters(rrc.informationelements.ServingCellChangeParameters servingCellChangeParameters)
    {
	mComponents[15] = servingCellChangeParameters;
    }
    
    public boolean hasServingCellChangeParameters()
    {
	return componentIsPresent(15);
    }
    
    public void deleteServingCellChangeParameters()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "rl_RemovalInformationList"
    public rrc.informationelements.RL_RemovalInformationList getRl_RemovalInformationList()
    {
	return (rrc.informationelements.RL_RemovalInformationList)mComponents[16];
    }
    
    public void setRl_RemovalInformationList(rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList)
    {
	mComponents[16] = rl_RemovalInformationList;
    }
    
    public boolean hasRl_RemovalInformationList()
    {
	return componentIsPresent(16);
    }
    
    public void deleteRl_RemovalInformationList()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "rl_RemovalInformationList_SecULFreq"
    public rrc.informationelements.RL_RemovalInformationList_SecULFreq getRl_RemovalInformationList_SecULFreq()
    {
	return (rrc.informationelements.RL_RemovalInformationList_SecULFreq)mComponents[17];
    }
    
    public void setRl_RemovalInformationList_SecULFreq(rrc.informationelements.RL_RemovalInformationList_SecULFreq rl_RemovalInformationList_SecULFreq)
    {
	mComponents[17] = rl_RemovalInformationList_SecULFreq;
    }
    
    public boolean hasRl_RemovalInformationList_SecULFreq()
    {
	return componentIsPresent(17);
    }
    
    public void deleteRl_RemovalInformationList_SecULFreq()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "tx_DiversityMode"
    public rrc.informationelements.TX_DiversityMode getTx_DiversityMode()
    {
	return (rrc.informationelements.TX_DiversityMode)mComponents[18];
    }
    
    public void setTx_DiversityMode(rrc.informationelements.TX_DiversityMode tx_DiversityMode)
    {
	mComponents[18] = tx_DiversityMode;
    }
    
    public boolean hasTx_DiversityMode()
    {
	return componentIsPresent(18);
    }
    
    public void deleteTx_DiversityMode()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "dpc_Mode"
    public rrc.informationelements.DPC_Mode getDpc_Mode()
    {
	return (rrc.informationelements.DPC_Mode)mComponents[19];
    }
    
    public void setDpc_Mode(rrc.informationelements.DPC_Mode dpc_Mode)
    {
	mComponents[19] = dpc_Mode;
    }
    
    public boolean hasDpc_Mode()
    {
	return componentIsPresent(19);
    }
    
    public void deleteDpc_Mode()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "serving_HSDSCH_CellInformation"
    public rrc.informationelements.Serving_HSDSCH_CellInformation_r9 getServing_HSDSCH_CellInformation()
    {
	return (rrc.informationelements.Serving_HSDSCH_CellInformation_r9)mComponents[20];
    }
    
    public void setServing_HSDSCH_CellInformation(rrc.informationelements.Serving_HSDSCH_CellInformation_r9 serving_HSDSCH_CellInformation)
    {
	mComponents[20] = serving_HSDSCH_CellInformation;
    }
    
    public boolean hasServing_HSDSCH_CellInformation()
    {
	return componentIsPresent(20);
    }
    
    public void deleteServing_HSDSCH_CellInformation()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "e_dch_ReconfigurationInfo"
    public rrc.informationelements.E_DCH_ReconfigurationInfo_r7 getE_dch_ReconfigurationInfo()
    {
	return (rrc.informationelements.E_DCH_ReconfigurationInfo_r7)mComponents[21];
    }
    
    public void setE_dch_ReconfigurationInfo(rrc.informationelements.E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo)
    {
	mComponents[21] = e_dch_ReconfigurationInfo;
    }
    
    public boolean hasE_dch_ReconfigurationInfo()
    {
	return componentIsPresent(21);
    }
    
    public void deleteE_dch_ReconfigurationInfo()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "ul_16QAM_Config"
    public rrc.informationelements.UL_16QAM_Config getUl_16QAM_Config()
    {
	return (rrc.informationelements.UL_16QAM_Config)mComponents[22];
    }
    
    public void setUl_16QAM_Config(rrc.informationelements.UL_16QAM_Config ul_16QAM_Config)
    {
	mComponents[22] = ul_16QAM_Config;
    }
    
    public boolean hasUl_16QAM_Config()
    {
	return componentIsPresent(22);
    }
    
    public void deleteUl_16QAM_Config()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "e_dch_ReconfInfoSameCell"
    public rrc.informationelements.E_DCH_RL_InfoSameServingCell getE_dch_ReconfInfoSameCell()
    {
	return (rrc.informationelements.E_DCH_RL_InfoSameServingCell)mComponents[23];
    }
    
    public void setE_dch_ReconfInfoSameCell(rrc.informationelements.E_DCH_RL_InfoSameServingCell e_dch_ReconfInfoSameCell)
    {
	mComponents[23] = e_dch_ReconfInfoSameCell;
    }
    
    public boolean hasE_dch_ReconfInfoSameCell()
    {
	return componentIsPresent(23);
    }
    
    public void deleteE_dch_ReconfInfoSameCell()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "e_TFC_Boost_Info"
    public rrc.informationelements.E_TFC_Boost_Info_r7 getE_TFC_Boost_Info()
    {
	return (rrc.informationelements.E_TFC_Boost_Info_r7)mComponents[24];
    }
    
    public void setE_TFC_Boost_Info(rrc.informationelements.E_TFC_Boost_Info_r7 e_TFC_Boost_Info)
    {
	mComponents[24] = e_TFC_Boost_Info;
    }
    
    public boolean hasE_TFC_Boost_Info()
    {
	return componentIsPresent(24);
    }
    
    public void deleteE_TFC_Boost_Info()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "e_DPDCH_PowerInterpolation"
    public rrc.informationelements.E_DPDCH_PowerInterpolation getE_DPDCH_PowerInterpolation()
    {
	return (rrc.informationelements.E_DPDCH_PowerInterpolation)mComponents[25];
    }
    
    public void setE_DPDCH_PowerInterpolation(rrc.informationelements.E_DPDCH_PowerInterpolation e_DPDCH_PowerInterpolation)
    {
	mComponents[25] = e_DPDCH_PowerInterpolation;
    }
    
    public boolean hasE_DPDCH_PowerInterpolation()
    {
	return componentIsPresent(25);
    }
    
    public void deleteE_DPDCH_PowerInterpolation()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD"
    public rrc.informationelements.DL_SecondaryCellInfoFDD_r10 getDl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.DL_SecondaryCellInfoFDD_r10)mComponents[26];
    }
    
    public void setDl_SecondaryCellInfoFDD(rrc.informationelements.DL_SecondaryCellInfoFDD_r10 dl_SecondaryCellInfoFDD)
    {
	mComponents[26] = dl_SecondaryCellInfoFDD;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(26);
    }
    
    public void deleteDl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "additionalDLSecCellInfoListFDD"
    public rrc.informationelements.AdditionalDLSecCellInfoListFDD getAdditionalDLSecCellInfoListFDD()
    {
	return (rrc.informationelements.AdditionalDLSecCellInfoListFDD)mComponents[27];
    }
    
    public void setAdditionalDLSecCellInfoListFDD(rrc.informationelements.AdditionalDLSecCellInfoListFDD additionalDLSecCellInfoListFDD)
    {
	mComponents[27] = additionalDLSecCellInfoListFDD;
    }
    
    public boolean hasAdditionalDLSecCellInfoListFDD()
    {
	return componentIsPresent(27);
    }
    
    public void deleteAdditionalDLSecCellInfoListFDD()
    {
	setComponentAbsent(27);
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
	    "ActiveSetUpdate_r10_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate-r10-IEs"
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
		    "newU-RNTI",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "newH-RNTI",
		    2,
		    3,
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
		    "newSecondary-E-RNTI",
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
		    9,
		    3,
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
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
				"E_DCH_ReconfigurationInfo_SecULFrequency"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-ReconfigurationInfo-SecULFrequency"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_SecULFrequency"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_SecULFrequency"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-ReconfigurationInfo-SecULFrequency",
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
				"RL_AdditionInformationList_r10"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList-r10"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(7)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RL_AdditionInformation_r10"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList",
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
				"RL_AdditionInformationList_SecULFreq"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList-SecULFreq"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "RL_AdditionInformation_SecULFreq"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList-SecULFreq",
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
				"ServingCellChangeParameters"
			    ),
			    new QName (
				"InformationElements",
				"ServingCellChangeParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ServingCellChangeParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ServingCellChangeParameters"
				)
			    ),
			    0
			)
		    ),
		    "servingCellChangeParameters",
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
				"RL_RemovalInformationList"
			    ),
			    new QName (
				"InformationElements",
				"RL-RemovalInformationList"
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
				    "PrimaryCPICH_Info"
				)
			    )
			)
		    ),
		    "rl-RemovalInformationList",
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
				"RL_RemovalInformationList_SecULFreq"
			    ),
			    new QName (
				"InformationElements",
				"RL-RemovalInformationList-SecULFreq"
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
				    "PrimaryCPICH_Info"
				)
			    )
			)
		    ),
		    "rl-RemovalInformationList-SecULFreq",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TX_DiversityMode"
			    ),
			    new QName (
				"InformationElements",
				"TX-DiversityMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"noDiversity",
					0
				    ),
				    new MemberListElement (
					"sttd",
					1
				    ),
				    new MemberListElement (
					"closedLoopMode1",
					2
				    ),
				    new MemberListElement (
					"dummy",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.TX_DiversityMode.noDiversity
			)
		    ),
		    "tx-DiversityMode",
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
				"DPC_Mode"
			    ),
			    new QName (
				"InformationElements",
				"DPC-Mode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"singleTPC",
					0
				    ),
				    new MemberListElement (
					"tpcTripletInSoft",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.DPC_Mode.singleTPC
			)
		    ),
		    "dpc-Mode",
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
				"Serving_HSDSCH_CellInformation_r9"
			    ),
			    new QName (
				"InformationElements",
				"Serving-HSDSCH-CellInformation-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r9"
				)
			    ),
			    0
			)
		    ),
		    "serving-HSDSCH-CellInformation",
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
				"E_DCH_ReconfigurationInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-ReconfigurationInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-ReconfigurationInfo",
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
				"UL_16QAM_Config"
			    ),
			    new QName (
				"InformationElements",
				"UL-16QAM-Config"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_16QAM_Config"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_16QAM_Config"
				)
			    ),
			    0
			)
		    ),
		    "ul-16QAM-Config",
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
				"E_DCH_RL_InfoSameServingCell"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-RL-InfoSameServingCell"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoSameServingCell"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoSameServingCell"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-ReconfInfoSameCell",
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
				"E_TFC_Boost_Info_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-TFC-Boost-Info-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_TFC_Boost_Info_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_TFC_Boost_Info_r7"
				)
			    ),
			    0
			)
		    ),
		    "e-TFC-Boost-Info",
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_PowerInterpolation"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-PowerInterpolation"
			    ),
			    12314,
			    null
			)
		    ),
		    "e-DPDCH-PowerInterpolation",
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
				"DL_SecondaryCellInfoFDD_r10"
			    ),
			    new QName (
				"InformationElements",
				"DL-SecondaryCellInfoFDD-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD_r10"
				)
			    ),
			    0
			)
		    ),
		    "dl-SecondaryCellInfoFDD",
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
				"AdditionalDLSecCellInfoListFDD"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalDLSecCellInfoListFDD"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(2)
				)
			    ),
			    new Bounds (
				new java.lang.Long(2),
				new java.lang.Long(2)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AdditionalDLSecCellInfoFDD"
				)
			    )
			)
		    ),
		    "additionalDLSecCellInfoListFDD",
		    27,
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
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
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
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
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
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
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r10_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r10_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate_r10_IEs
