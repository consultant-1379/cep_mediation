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
 * Define the ASN1 Type ActiveSetUpdate_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ActiveSetUpdate_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public ActiveSetUpdate_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ActiveSetUpdate_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.IntegrityProtectionModeInfo dummy, 
		    rrc.informationelements.CipheringModeInfo dummy2, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.U_RNTI newU_RNTI, 
		    rrc.informationelements.CN_InformationInfo cn_InformationInfo, 
		    rrc.informationelements.DL_CounterSynchronisationInfo dummy3, 
		    rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    rrc.informationelements.RL_AdditionInformationList rl_AdditionInformationList, 
		    rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList, 
		    rrc.informationelements.TX_DiversityMode tx_DiversityMode, 
		    rrc.informationelements.SSDT_Information dummy4)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setDummy(dummy);
	setDummy2(dummy2);
	setActivationTime(activationTime);
	setNewU_RNTI(newU_RNTI);
	setCn_InformationInfo(cn_InformationInfo);
	setDummy3(dummy3);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setRl_AdditionInformationList(rl_AdditionInformationList);
	setRl_RemovalInformationList(rl_RemovalInformationList);
	setTx_DiversityMode(tx_DiversityMode);
	setDummy4(dummy4);
    }
    
    /**
     * Construct with required components.
     */
    public ActiveSetUpdate_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.IntegrityProtectionModeInfo();
	mComponents[2] = new rrc.informationelements.CipheringModeInfo();
	mComponents[3] = new rrc.informationelements.ActivationTime();
	mComponents[4] = new rrc.informationelements.U_RNTI();
	mComponents[5] = new rrc.informationelements.CN_InformationInfo();
	mComponents[6] = new rrc.informationelements.DL_CounterSynchronisationInfo();
	mComponents[7] = new rrc.informationelements.MaxAllowedUL_TX_Power();
	mComponents[8] = new rrc.informationelements.RL_AdditionInformationList();
	mComponents[9] = new rrc.informationelements.RL_RemovalInformationList();
	mComponents[10] = rrc.informationelements.TX_DiversityMode.noDiversity;
	mComponents[11] = new rrc.informationelements.SSDT_Information();
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
		return new rrc.informationelements.CN_InformationInfo();
	    case 6:
		return new rrc.informationelements.DL_CounterSynchronisationInfo();
	    case 7:
		return new rrc.informationelements.MaxAllowedUL_TX_Power();
	    case 8:
		return new rrc.informationelements.RL_AdditionInformationList();
	    case 9:
		return new rrc.informationelements.RL_RemovalInformationList();
	    case 10:
		return rrc.informationelements.TX_DiversityMode.noDiversity;
	    case 11:
		return new rrc.informationelements.SSDT_Information();
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
    
    
    // Methods for field "dummy"
    public rrc.informationelements.IntegrityProtectionModeInfo getDummy()
    {
	return (rrc.informationelements.IntegrityProtectionModeInfo)mComponents[1];
    }
    
    public void setDummy(rrc.informationelements.IntegrityProtectionModeInfo dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "dummy2"
    public rrc.informationelements.CipheringModeInfo getDummy2()
    {
	return (rrc.informationelements.CipheringModeInfo)mComponents[2];
    }
    
    public void setDummy2(rrc.informationelements.CipheringModeInfo dummy2)
    {
	mComponents[2] = dummy2;
    }
    
    public boolean hasDummy2()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDummy2()
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
    
    
    // Methods for field "newU_RNTI"
    public rrc.informationelements.U_RNTI getNewU_RNTI()
    {
	return (rrc.informationelements.U_RNTI)mComponents[4];
    }
    
    public void setNewU_RNTI(rrc.informationelements.U_RNTI newU_RNTI)
    {
	mComponents[4] = newU_RNTI;
    }
    
    public boolean hasNewU_RNTI()
    {
	return componentIsPresent(4);
    }
    
    public void deleteNewU_RNTI()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "cn_InformationInfo"
    public rrc.informationelements.CN_InformationInfo getCn_InformationInfo()
    {
	return (rrc.informationelements.CN_InformationInfo)mComponents[5];
    }
    
    public void setCn_InformationInfo(rrc.informationelements.CN_InformationInfo cn_InformationInfo)
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
    
    
    // Methods for field "dummy3"
    public rrc.informationelements.DL_CounterSynchronisationInfo getDummy3()
    {
	return (rrc.informationelements.DL_CounterSynchronisationInfo)mComponents[6];
    }
    
    public void setDummy3(rrc.informationelements.DL_CounterSynchronisationInfo dummy3)
    {
	mComponents[6] = dummy3;
    }
    
    public boolean hasDummy3()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDummy3()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public rrc.informationelements.MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (rrc.informationelements.MaxAllowedUL_TX_Power)mComponents[7];
    }
    
    public void setMaxAllowedUL_TX_Power(rrc.informationelements.MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[7] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(7);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "rl_AdditionInformationList"
    public rrc.informationelements.RL_AdditionInformationList getRl_AdditionInformationList()
    {
	return (rrc.informationelements.RL_AdditionInformationList)mComponents[8];
    }
    
    public void setRl_AdditionInformationList(rrc.informationelements.RL_AdditionInformationList rl_AdditionInformationList)
    {
	mComponents[8] = rl_AdditionInformationList;
    }
    
    public boolean hasRl_AdditionInformationList()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRl_AdditionInformationList()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "rl_RemovalInformationList"
    public rrc.informationelements.RL_RemovalInformationList getRl_RemovalInformationList()
    {
	return (rrc.informationelements.RL_RemovalInformationList)mComponents[9];
    }
    
    public void setRl_RemovalInformationList(rrc.informationelements.RL_RemovalInformationList rl_RemovalInformationList)
    {
	mComponents[9] = rl_RemovalInformationList;
    }
    
    public boolean hasRl_RemovalInformationList()
    {
	return componentIsPresent(9);
    }
    
    public void deleteRl_RemovalInformationList()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "tx_DiversityMode"
    public rrc.informationelements.TX_DiversityMode getTx_DiversityMode()
    {
	return (rrc.informationelements.TX_DiversityMode)mComponents[10];
    }
    
    public void setTx_DiversityMode(rrc.informationelements.TX_DiversityMode tx_DiversityMode)
    {
	mComponents[10] = tx_DiversityMode;
    }
    
    public boolean hasTx_DiversityMode()
    {
	return componentIsPresent(10);
    }
    
    public void deleteTx_DiversityMode()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "dummy4"
    public rrc.informationelements.SSDT_Information getDummy4()
    {
	return (rrc.informationelements.SSDT_Information)mComponents[11];
    }
    
    public void setDummy4(rrc.informationelements.SSDT_Information dummy4)
    {
	mComponents[11] = dummy4;
    }
    
    public boolean hasDummy4()
    {
	return componentIsPresent(11);
    }
    
    public void deleteDummy4()
    {
	setComponentAbsent(11);
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
	    "ActiveSetUpdate_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "ActiveSetUpdate-r3-IEs"
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
		    "dummy",
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
		    "dummy2",
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
		    "newU-RNTI",
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
		    "dummy3",
		    6,
		    3,
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
				"RL_AdditionInformationList"
			    ),
			    new QName (
				"InformationElements",
				"RL-AdditionInformationList"
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
				    "RL_AdditionInformation"
				)
			    )
			)
		    ),
		    "rl-AdditionInformationList",
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
				"SSDT_Information"
			    ),
			    new QName (
				"InformationElements",
				"SSDT-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SSDT_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SSDT_Information"
				)
			    ),
			    0
			)
		    ),
		    "dummy4",
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
     * Get the type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ActiveSetUpdate_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ActiveSetUpdate_r3_IEs
