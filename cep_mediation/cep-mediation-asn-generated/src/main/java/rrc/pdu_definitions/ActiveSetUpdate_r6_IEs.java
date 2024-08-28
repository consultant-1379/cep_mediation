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
 * Define the ASN1 Type ActiveSetUpdate_r6_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ActiveSetUpdate_r6_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate_r6_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ActiveSetUpdate_r6_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI newU_RNTI, 
		    rrc.informationelements.H_RNTI newH_RNTI, 
		    rrc.informationelements.E_RNTI newPrimary_E_RNTI, 
		    rrc.informationelements.E_RNTI newSecondary_E_RNTI, 
		    rrc.informationelements.CN_InformationInfo_r6 cn_InformationInfo, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.RL_AdditionInformationList_r6 rl_AdditionInformationList, 
		    rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList, 
		    rrc.informationelements.TX_DiversityMode tx_DiversityMode, 
		    rrc.informationelements.DPC_Mode dpc_Mode, 
		    rrc.informationelements.Serving_HSDSCH_CellInformation serving_HSDSCH_CellInformation, 
		    rrc.informationelements.E_DCH_ReconfigurationInfo e_dch_ReconfigurationInfo)
    {
	setActivationTime(activationTime);
	setNewU_RNTI(newU_RNTI);
	setNewH_RNTI(newH_RNTI);
	setNewPrimary_E_RNTI(newPrimary_E_RNTI);
	setNewSecondary_E_RNTI(newSecondary_E_RNTI);
	setCn_InformationInfo(cn_InformationInfo);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setRl_AdditionInformationList(rl_AdditionInformationList);
	setRl_RemovalInformationList(rl_RemovalInformationList);
	setTx_DiversityMode(tx_DiversityMode);
	setDpc_Mode(dpc_Mode);
	setServing_HSDSCH_CellInformation(serving_HSDSCH_CellInformation);
	setE_dch_ReconfigurationInfo(e_dch_ReconfigurationInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = new rrc.informationelements.U_RNTI();
	mComponents[2] = new rrc.informationelements.H_RNTI();
	mComponents[3] = new rrc.informationelements.E_RNTI();
	mComponents[4] = new rrc.informationelements.E_RNTI();
	mComponents[5] = new rrc.informationelements.CN_InformationInfo_r6();
	mComponents[6] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[7] = new rrc.informationelements.RL_AdditionInformationList_r6();
	mComponents[8] = new rrc.informationelements.RL_RemovalInformationList();
	mComponents[9] = rrc.informationelements.TX_DiversityMode.noDiversity;
	mComponents[10] = rrc.informationelements.DPC_Mode.singleTPC;
	mComponents[11] = new rrc.informationelements.Serving_HSDSCH_CellInformation();
	mComponents[12] = new rrc.informationelements.E_DCH_ReconfigurationInfo();
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
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 7:
		return new rrc.informationelements.RL_AdditionInformationList_r6();
	    case 8:
		return new rrc.informationelements.RL_RemovalInformationList();
	    case 9:
		return rrc.informationelements.TX_DiversityMode.noDiversity;
	    case 10:
		return rrc.informationelements.DPC_Mode.singleTPC;
	    case 11:
		return new rrc.informationelements.Serving_HSDSCH_CellInformation();
	    case 12:
		return new rrc.informationelements.E_DCH_ReconfigurationInfo();
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
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[6];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[6] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(6);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "rl_AdditionInformationList"
    public rrc.informationelements.RL_AdditionInformationList_r6 getRl_AdditionInformationList()
    {
	return (rrc.informationelements.RL_AdditionInformationList_r6)mComponents[7];
    }
    
    public void setRl_AdditionInformationList(rrc.informationelements.RL_AdditionInformationList_r6 rl_AdditionInformationList)
    {
	mComponents[7] = rl_AdditionInformationList;
    }
    
    public boolean hasRl_AdditionInformationList()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRl_AdditionInformationList()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "rl_RemovalInformationList"
    public rrc.informationelements.RL_RemovalInformationList getRl_RemovalInformationList()
    {
	return (rrc.informationelements.RL_RemovalInformationList)mComponents[8];
    }
    
    public void setRl_RemovalInformationList(rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList)
    {
	mComponents[8] = rl_RemovalInformationList;
    }
    
    public boolean hasRl_RemovalInformationList()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRl_RemovalInformationList()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "tx_DiversityMode"
    public rrc.informationelements.TX_DiversityMode getTx_DiversityMode()
    {
	return (rrc.informationelements.TX_DiversityMode)mComponents[9];
    }
    
    public void setTx_DiversityMode(rrc.informationelements.TX_DiversityMode tx_DiversityMode)
    {
	mComponents[9] = tx_DiversityMode;
    }
    
    public boolean hasTx_DiversityMode()
    {
	return componentIsPresent(9);
    }
    
    public void deleteTx_DiversityMode()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "dpc_Mode"
    public rrc.informationelements.DPC_Mode getDpc_Mode()
    {
	return (rrc.informationelements.DPC_Mode)mComponents[10];
    }
    
    public void setDpc_Mode(rrc.informationelements.DPC_Mode dpc_Mode)
    {
	mComponents[10] = dpc_Mode;
    }
    
    public boolean hasDpc_Mode()
    {
	return componentIsPresent(10);
    }
    
    public void deleteDpc_Mode()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "serving_HSDSCH_CellInformation"
    public rrc.informationelements.Serving_HSDSCH_CellInformation getServing_HSDSCH_CellInformation()
    {
	return (rrc.informationelements.Serving_HSDSCH_CellInformation)mComponents[11];
    }
    
    public void setServing_HSDSCH_CellInformation(rrc.informationelements.Serving_HSDSCH_CellInformation serving_HSDSCH_CellInformation)
    {
	mComponents[11] = serving_HSDSCH_CellInformation;
    }
    
    public boolean hasServing_HSDSCH_CellInformation()
    {
	return componentIsPresent(11);
    }
    
    public void deleteServing_HSDSCH_CellInformation()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "e_dch_ReconfigurationInfo"
    public rrc.informationelements.E_DCH_ReconfigurationInfo getE_dch_ReconfigurationInfo()
    {
	return (rrc.informationelements.E_DCH_ReconfigurationInfo)mComponents[12];
    }
    
    public void setE_dch_ReconfigurationInfo(rrc.informationelements.E_DCH_ReconfigurationInfo e_dch_ReconfigurationInfo)
    {
	mComponents[12] = e_dch_ReconfigurationInfo;
    }
    
    public boolean hasE_dch_ReconfigurationInfo()
    {
	return componentIsPresent(12);
    }
    
    public void deleteE_dch_ReconfigurationInfo()
    {
	setComponentAbsent(12);
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
	    "ActiveSetUpdate_r6_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate-r6-IEs"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				"RL_AdditionInformationList_r6"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList-r6"
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
				    "RL_AdditionInformation_r6"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList",
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
				"Serving_HSDSCH_CellInformation"
			    ),
			    new QName (
				"InformationElements",
				"Serving-HSDSCH-CellInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Serving_HSDSCH_CellInformation"
				)
			    ),
			    0
			)
		    ),
		    "serving-HSDSCH-CellInformation",
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
				"E_DCH_ReconfigurationInfo"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-ReconfigurationInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_ReconfigurationInfo"
				)
			    ),
			    0
			)
		    ),
		    "e-dch-ReconfigurationInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r6_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r6_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate_r6_IEs
