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
 * Define the ASN1 Type ActiveSetUpdate_r8_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ActiveSetUpdate_r8_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate_r8_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ActiveSetUpdate_r8_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI newU_RNTI, 
		    rrc.informationelements.H_RNTI newH_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.DTX_DRX_TimingInfo_r7 dtx_drx_TimingInfo, 
		    rrc.informationelements.DTX_DRX_Info_r7 dtx_drx_Info, 
		    rrc.informationelements.HS_SCCH_LessInfo_r7 hs_scch_LessInfo, 
		    rrc.informationelements.MIMO_Parameters_r8 mimoParameters, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.RL_AdditionInformationList_r8 rl_AdditionInformationList, 
		    rrc.informationelements.ServingCellChangeParameters servingCellChangeParameters, 
		    rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList, 
		    rrc.informationelements.TX_DiversityMode tx_DiversityMode, 
		    rrc.informationelements.DPC_Mode dpc_Mode, 
		    rrc.informationelements.Serving_HSDSCH_CellInformation_r8 serving_HSDSCH_CellInformation, 
		    rrc.informationelements.E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo, 
		    rrc.informationelements.UL_16QAM_Config ul_16QAM_Config, 
		    rrc.informationelements.E_DCH_RL_InfoSameServingCell e_dch_ReconfInfoSameCell, 
		    rrc.informationelements.E_TFC_Boost_Info_r7 e_TFC_Boost_Info, 
		    rrc.informationelements.E_DPDCH_PowerInterpolation e_DPDCH_PowerInterpolation, 
		    rrc.informationelements.DL_SecondaryCellInfoFDD dl_SecondaryCellInfoFDD)
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
	setRl_AdditionInformationList(rl_AdditionInformationList);
	setServingCellChangeParameters(servingCellChangeParameters);
	setRl_RemovalInformationList(rl_RemovalInformationList);
	setTx_DiversityMode(tx_DiversityMode);
	setDpc_Mode(dpc_Mode);
	setServing_HSDSCH_CellInformation(serving_HSDSCH_CellInformation);
	setE_dch_ReconfigurationInfo(e_dch_ReconfigurationInfo);
	setUl_16QAM_Config(ul_16QAM_Config);
	setE_dch_ReconfInfoSameCell(e_dch_ReconfInfoSameCell);
	setE_TFC_Boost_Info(e_TFC_Boost_Info);
	setE_DPDCH_PowerInterpolation(e_DPDCH_PowerInterpolation);
	setDl_SecondaryCellInfoFDD(dl_SecondaryCellInfoFDD);
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
	mComponents[9] = new rrc.informationelements.MIMO_Parameters_r8();
	mComponents[10] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[11] = new rrc.informationelements.RL_AdditionInformationList_r8();
	mComponents[12] = new rrc.informationelements.ServingCellChangeParameters();
	mComponents[13] = new rrc.informationelements.RL_RemovalInformationList();
	mComponents[14] = rrc.informationelements.TX_DiversityMode.noDiversity;
	mComponents[15] = rrc.informationelements.DPC_Mode.singleTPC;
	mComponents[16] = new rrc.informationelements.Serving_HSDSCH_CellInformation_r8();
	mComponents[17] = new rrc.informationelements.E_DCH_ReconfigurationInfo_r7();
	mComponents[18] = new rrc.informationelements.UL_16QAM_Config();
	mComponents[19] = new rrc.informationelements.E_DCH_RL_InfoSameServingCell();
	mComponents[20] = new rrc.informationelements.E_TFC_Boost_Info_r7();
	mComponents[21] = new rrc.informationelements.E_DPDCH_PowerInterpolation();
	mComponents[22] = new rrc.informationelements.DL_SecondaryCellInfoFDD();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[23];
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
		return new rrc.informationelements.MIMO_Parameters_r8();
	    case 10:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 11:
		return new rrc.informationelements.RL_AdditionInformationList_r8();
	    case 12:
		return new rrc.informationelements.ServingCellChangeParameters();
	    case 13:
		return new rrc.informationelements.RL_RemovalInformationList();
	    case 14:
		return rrc.informationelements.TX_DiversityMode.noDiversity;
	    case 15:
		return rrc.informationelements.DPC_Mode.singleTPC;
	    case 16:
		return new rrc.informationelements.Serving_HSDSCH_CellInformation_r8();
	    case 17:
		return new rrc.informationelements.E_DCH_ReconfigurationInfo_r7();
	    case 18:
		return new rrc.informationelements.UL_16QAM_Config();
	    case 19:
		return new rrc.informationelements.E_DCH_RL_InfoSameServingCell();
	    case 20:
		return new rrc.informationelements.E_TFC_Boost_Info_r7();
	    case 21:
		return new rrc.informationelements.E_DPDCH_PowerInterpolation();
	    case 22:
		return new rrc.informationelements.DL_SecondaryCellInfoFDD();
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
    public rrc.informationelements.MIMO_Parameters_r8 getMimoParameters()
    {
	return (rrc.informationelements.MIMO_Parameters_r8)mComponents[9];
    }
    
    public void setMimoParameters(rrc.informationelements.MIMO_Parameters_r8 mimoParameters)
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
    
    
    // Methods for field "rl_AdditionInformationList"
    public rrc.informationelements.RL_AdditionInformationList_r8 getRl_AdditionInformationList()
    {
	return (rrc.informationelements.RL_AdditionInformationList_r8)mComponents[11];
    }
    
    public void setRl_AdditionInformationList(rrc.informationelements.RL_AdditionInformationList_r8 rl_AdditionInformationList)
    {
	mComponents[11] = rl_AdditionInformationList;
    }
    
    public boolean hasRl_AdditionInformationList()
    {
	return componentIsPresent(11);
    }
    
    public void deleteRl_AdditionInformationList()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "servingCellChangeParameters"
    public rrc.informationelements.ServingCellChangeParameters getServingCellChangeParameters()
    {
	return (rrc.informationelements.ServingCellChangeParameters)mComponents[12];
    }
    
    public void setServingCellChangeParameters(rrc.informationelements.ServingCellChangeParameters servingCellChangeParameters)
    {
	mComponents[12] = servingCellChangeParameters;
    }
    
    public boolean hasServingCellChangeParameters()
    {
	return componentIsPresent(12);
    }
    
    public void deleteServingCellChangeParameters()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "rl_RemovalInformationList"
    public rrc.informationelements.RL_RemovalInformationList getRl_RemovalInformationList()
    {
	return (rrc.informationelements.RL_RemovalInformationList)mComponents[13];
    }
    
    public void setRl_RemovalInformationList(rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList)
    {
	mComponents[13] = rl_RemovalInformationList;
    }
    
    public boolean hasRl_RemovalInformationList()
    {
	return componentIsPresent(13);
    }
    
    public void deleteRl_RemovalInformationList()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "tx_DiversityMode"
    public rrc.informationelements.TX_DiversityMode getTx_DiversityMode()
    {
	return (rrc.informationelements.TX_DiversityMode)mComponents[14];
    }
    
    public void setTx_DiversityMode(rrc.informationelements.TX_DiversityMode tx_DiversityMode)
    {
	mComponents[14] = tx_DiversityMode;
    }
    
    public boolean hasTx_DiversityMode()
    {
	return componentIsPresent(14);
    }
    
    public void deleteTx_DiversityMode()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "dpc_Mode"
    public rrc.informationelements.DPC_Mode getDpc_Mode()
    {
	return (rrc.informationelements.DPC_Mode)mComponents[15];
    }
    
    public void setDpc_Mode(rrc.informationelements.DPC_Mode dpc_Mode)
    {
	mComponents[15] = dpc_Mode;
    }
    
    public boolean hasDpc_Mode()
    {
	return componentIsPresent(15);
    }
    
    public void deleteDpc_Mode()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "serving_HSDSCH_CellInformation"
    public rrc.informationelements.Serving_HSDSCH_CellInformation_r8 getServing_HSDSCH_CellInformation()
    {
	return (rrc.informationelements.Serving_HSDSCH_CellInformation_r8)mComponents[16];
    }
    
    public void setServing_HSDSCH_CellInformation(rrc.informationelements.Serving_HSDSCH_CellInformation_r8 serving_HSDSCH_CellInformation)
    {
	mComponents[16] = serving_HSDSCH_CellInformation;
    }
    
    public boolean hasServing_HSDSCH_CellInformation()
    {
	return componentIsPresent(16);
    }
    
    public void deleteServing_HSDSCH_CellInformation()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "e_dch_ReconfigurationInfo"
    public rrc.informationelements.E_DCH_ReconfigurationInfo_r7 getE_dch_ReconfigurationInfo()
    {
	return (rrc.informationelements.E_DCH_ReconfigurationInfo_r7)mComponents[17];
    }
    
    public void setE_dch_ReconfigurationInfo(rrc.informationelements.E_DCH_ReconfigurationInfo_r7 e_dch_ReconfigurationInfo)
    {
	mComponents[17] = e_dch_ReconfigurationInfo;
    }
    
    public boolean hasE_dch_ReconfigurationInfo()
    {
	return componentIsPresent(17);
    }
    
    public void deleteE_dch_ReconfigurationInfo()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "ul_16QAM_Config"
    public rrc.informationelements.UL_16QAM_Config getUl_16QAM_Config()
    {
	return (rrc.informationelements.UL_16QAM_Config)mComponents[18];
    }
    
    public void setUl_16QAM_Config(rrc.informationelements.UL_16QAM_Config ul_16QAM_Config)
    {
	mComponents[18] = ul_16QAM_Config;
    }
    
    public boolean hasUl_16QAM_Config()
    {
	return componentIsPresent(18);
    }
    
    public void deleteUl_16QAM_Config()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "e_dch_ReconfInfoSameCell"
    public rrc.informationelements.E_DCH_RL_InfoSameServingCell getE_dch_ReconfInfoSameCell()
    {
	return (rrc.informationelements.E_DCH_RL_InfoSameServingCell)mComponents[19];
    }
    
    public void setE_dch_ReconfInfoSameCell(rrc.informationelements.E_DCH_RL_InfoSameServingCell e_dch_ReconfInfoSameCell)
    {
	mComponents[19] = e_dch_ReconfInfoSameCell;
    }
    
    public boolean hasE_dch_ReconfInfoSameCell()
    {
	return componentIsPresent(19);
    }
    
    public void deleteE_dch_ReconfInfoSameCell()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "e_TFC_Boost_Info"
    public rrc.informationelements.E_TFC_Boost_Info_r7 getE_TFC_Boost_Info()
    {
	return (rrc.informationelements.E_TFC_Boost_Info_r7)mComponents[20];
    }
    
    public void setE_TFC_Boost_Info(rrc.informationelements.E_TFC_Boost_Info_r7 e_TFC_Boost_Info)
    {
	mComponents[20] = e_TFC_Boost_Info;
    }
    
    public boolean hasE_TFC_Boost_Info()
    {
	return componentIsPresent(20);
    }
    
    public void deleteE_TFC_Boost_Info()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "e_DPDCH_PowerInterpolation"
    public rrc.informationelements.E_DPDCH_PowerInterpolation getE_DPDCH_PowerInterpolation()
    {
	return (rrc.informationelements.E_DPDCH_PowerInterpolation)mComponents[21];
    }
    
    public void setE_DPDCH_PowerInterpolation(rrc.informationelements.E_DPDCH_PowerInterpolation e_DPDCH_PowerInterpolation)
    {
	mComponents[21] = e_DPDCH_PowerInterpolation;
    }
    
    public boolean hasE_DPDCH_PowerInterpolation()
    {
	return componentIsPresent(21);
    }
    
    public void deleteE_DPDCH_PowerInterpolation()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "dl_SecondaryCellInfoFDD"
    public rrc.informationelements.DL_SecondaryCellInfoFDD getDl_SecondaryCellInfoFDD()
    {
	return (rrc.informationelements.DL_SecondaryCellInfoFDD)mComponents[22];
    }
    
    public void setDl_SecondaryCellInfoFDD(rrc.informationelements.DL_SecondaryCellInfoFDD dl_SecondaryCellInfoFDD)
    {
	mComponents[22] = dl_SecondaryCellInfoFDD;
    }
    
    public boolean hasDl_SecondaryCellInfoFDD()
    {
	return componentIsPresent(22);
    }
    
    public void deleteDl_SecondaryCellInfoFDD()
    {
	setComponentAbsent(22);
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
	    "ActiveSetUpdate_r8_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate-r8-IEs"
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
				"MIMO_Parameters_r8"
			    ),
			    new QName (
				"InformationElements",
				"MIMO-Parameters-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MIMO_Parameters_r8"
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
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RL_AdditionInformationList_r8"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList-r8"
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
				    "RL_AdditionInformation_r8"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList",
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
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
				"Serving_HSDSCH_CellInformation_r8"
			    ),
			    new QName (
				"InformationElements",
				"Serving-HSDSCH-CellInformation-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation_r8"
				)
			    ),
			    0
			)
		    ),
		    "serving-HSDSCH-CellInformation",
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
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
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
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_SecondaryCellInfoFDD"
			    ),
			    new QName (
				"InformationElements",
				"DL-SecondaryCellInfoFDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_SecondaryCellInfoFDD"
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
		    "dl-SecondaryCellInfoFDD",
		    22,
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
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
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r8_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r8_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate_r8_IEs
