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


package rrc.informationelements;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type PRACH_PreambleForEnhancedUplink from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_PreambleForEnhancedUplink extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_PreambleForEnhancedUplink()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_PreambleForEnhancedUplink(AvailableSignatures availableSignatures, 
		    BOOLEAN e_ai_Indication, 
		    PreambleScramblingCodeWordNumber preambleScramblingCodeWordNumber, 
		    AvailableSubChannelNumbers availableSubChannelNumbers, 
		    PRACH_Partitioning_r7 prach_Partitioning, 
		    PersistenceScalingFactorList persistenceScalingFactorList, 
		    AC_To_ASC_MappingTable ac_To_ASC_MappingTable, 
		    PrimaryCPICH_TX_Power primaryCPICH_TX_Power, 
		    ConstantValue constantValue, 
		    PRACH_PowerOffset prach_PowerOffset, 
		    RACH_TransmissionParameters rach_TransmissionParameters, 
		    AICH_Info aich_Info, INTEGER powerOffsetPp_e)
    {
	setAvailableSignatures(availableSignatures);
	setE_ai_Indication(e_ai_Indication);
	setPreambleScramblingCodeWordNumber(preambleScramblingCodeWordNumber);
	setAvailableSubChannelNumbers(availableSubChannelNumbers);
	setPrach_Partitioning(prach_Partitioning);
	setPersistenceScalingFactorList(persistenceScalingFactorList);
	setAc_To_ASC_MappingTable(ac_To_ASC_MappingTable);
	setPrimaryCPICH_TX_Power(primaryCPICH_TX_Power);
	setConstantValue(constantValue);
	setPrach_PowerOffset(prach_PowerOffset);
	setRach_TransmissionParameters(rach_TransmissionParameters);
	setAich_Info(aich_Info);
	setPowerOffsetPp_e(powerOffsetPp_e);
    }
    
    /**
     * Construct with components.
     */
    public PRACH_PreambleForEnhancedUplink(AvailableSignatures availableSignatures, 
		    boolean e_ai_Indication, 
		    PreambleScramblingCodeWordNumber preambleScramblingCodeWordNumber, 
		    AvailableSubChannelNumbers availableSubChannelNumbers, 
		    PRACH_Partitioning_r7 prach_Partitioning, 
		    PersistenceScalingFactorList persistenceScalingFactorList, 
		    AC_To_ASC_MappingTable ac_To_ASC_MappingTable, 
		    PrimaryCPICH_TX_Power primaryCPICH_TX_Power, 
		    ConstantValue constantValue, 
		    PRACH_PowerOffset prach_PowerOffset, 
		    RACH_TransmissionParameters rach_TransmissionParameters, 
		    AICH_Info aich_Info, long powerOffsetPp_e)
    {
	this(availableSignatures, new BOOLEAN(e_ai_Indication), 
	     preambleScramblingCodeWordNumber, availableSubChannelNumbers, 
	     prach_Partitioning, persistenceScalingFactorList, 
	     ac_To_ASC_MappingTable, primaryCPICH_TX_Power, constantValue, 
	     prach_PowerOffset, rach_TransmissionParameters, aich_Info, 
	     new INTEGER(powerOffsetPp_e));
    }
    
    /**
     * Construct with required components.
     */
    public PRACH_PreambleForEnhancedUplink(boolean e_ai_Indication, 
		    long powerOffsetPp_e)
    {
	setE_ai_Indication(e_ai_Indication);
	setPowerOffsetPp_e(powerOffsetPp_e);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AvailableSignatures();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new PreambleScramblingCodeWordNumber();
	mComponents[3] = new AvailableSubChannelNumbers();
	mComponents[4] = new PRACH_Partitioning_r7();
	mComponents[5] = new PersistenceScalingFactorList();
	mComponents[6] = new AC_To_ASC_MappingTable();
	mComponents[7] = new PrimaryCPICH_TX_Power();
	mComponents[8] = new ConstantValue();
	mComponents[9] = new PRACH_PowerOffset();
	mComponents[10] = new RACH_TransmissionParameters();
	mComponents[11] = new AICH_Info();
	mComponents[12] = new INTEGER();
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
		return new AvailableSignatures();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new PreambleScramblingCodeWordNumber();
	    case 3:
		return new AvailableSubChannelNumbers();
	    case 4:
		return new PRACH_Partitioning_r7();
	    case 5:
		return new PersistenceScalingFactorList();
	    case 6:
		return new AC_To_ASC_MappingTable();
	    case 7:
		return new PrimaryCPICH_TX_Power();
	    case 8:
		return new ConstantValue();
	    case 9:
		return new PRACH_PowerOffset();
	    case 10:
		return new RACH_TransmissionParameters();
	    case 11:
		return new AICH_Info();
	    case 12:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "availableSignatures"
    public AvailableSignatures getAvailableSignatures()
    {
	return (AvailableSignatures)mComponents[0];
    }
    
    public void setAvailableSignatures(AvailableSignatures availableSignatures)
    {
	mComponents[0] = availableSignatures;
    }
    
    public boolean hasAvailableSignatures()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAvailableSignatures()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "e_ai_Indication"
    public boolean getE_ai_Indication()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setE_ai_Indication(boolean e_ai_Indication)
    {
	setE_ai_Indication(new BOOLEAN(e_ai_Indication));
    }
    
    public void setE_ai_Indication(BOOLEAN e_ai_Indication)
    {
	mComponents[1] = e_ai_Indication;
    }
    
    
    // Methods for field "preambleScramblingCodeWordNumber"
    public PreambleScramblingCodeWordNumber getPreambleScramblingCodeWordNumber()
    {
	return (PreambleScramblingCodeWordNumber)mComponents[2];
    }
    
    public void setPreambleScramblingCodeWordNumber(PreambleScramblingCodeWordNumber preambleScramblingCodeWordNumber)
    {
	mComponents[2] = preambleScramblingCodeWordNumber;
    }
    
    public boolean hasPreambleScramblingCodeWordNumber()
    {
	return componentIsPresent(2);
    }
    
    public void deletePreambleScramblingCodeWordNumber()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "availableSubChannelNumbers"
    public AvailableSubChannelNumbers getAvailableSubChannelNumbers()
    {
	return (AvailableSubChannelNumbers)mComponents[3];
    }
    
    public void setAvailableSubChannelNumbers(AvailableSubChannelNumbers availableSubChannelNumbers)
    {
	mComponents[3] = availableSubChannelNumbers;
    }
    
    public boolean hasAvailableSubChannelNumbers()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAvailableSubChannelNumbers()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "prach_Partitioning"
    public PRACH_Partitioning_r7 getPrach_Partitioning()
    {
	return (PRACH_Partitioning_r7)mComponents[4];
    }
    
    public void setPrach_Partitioning(PRACH_Partitioning_r7 prach_Partitioning)
    {
	mComponents[4] = prach_Partitioning;
    }
    
    public boolean hasPrach_Partitioning()
    {
	return componentIsPresent(4);
    }
    
    public void deletePrach_Partitioning()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "persistenceScalingFactorList"
    public PersistenceScalingFactorList getPersistenceScalingFactorList()
    {
	return (PersistenceScalingFactorList)mComponents[5];
    }
    
    public void setPersistenceScalingFactorList(PersistenceScalingFactorList persistenceScalingFactorList)
    {
	mComponents[5] = persistenceScalingFactorList;
    }
    
    public boolean hasPersistenceScalingFactorList()
    {
	return componentIsPresent(5);
    }
    
    public void deletePersistenceScalingFactorList()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "ac_To_ASC_MappingTable"
    public AC_To_ASC_MappingTable getAc_To_ASC_MappingTable()
    {
	return (AC_To_ASC_MappingTable)mComponents[6];
    }
    
    public void setAc_To_ASC_MappingTable(AC_To_ASC_MappingTable ac_To_ASC_MappingTable)
    {
	mComponents[6] = ac_To_ASC_MappingTable;
    }
    
    public boolean hasAc_To_ASC_MappingTable()
    {
	return componentIsPresent(6);
    }
    
    public void deleteAc_To_ASC_MappingTable()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "primaryCPICH_TX_Power"
    public PrimaryCPICH_TX_Power getPrimaryCPICH_TX_Power()
    {
	return (PrimaryCPICH_TX_Power)mComponents[7];
    }
    
    public void setPrimaryCPICH_TX_Power(PrimaryCPICH_TX_Power primaryCPICH_TX_Power)
    {
	mComponents[7] = primaryCPICH_TX_Power;
    }
    
    public boolean hasPrimaryCPICH_TX_Power()
    {
	return componentIsPresent(7);
    }
    
    public void deletePrimaryCPICH_TX_Power()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "constantValue"
    public ConstantValue getConstantValue()
    {
	return (ConstantValue)mComponents[8];
    }
    
    public void setConstantValue(ConstantValue constantValue)
    {
	mComponents[8] = constantValue;
    }
    
    public boolean hasConstantValue()
    {
	return componentIsPresent(8);
    }
    
    public void deleteConstantValue()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "prach_PowerOffset"
    public PRACH_PowerOffset getPrach_PowerOffset()
    {
	return (PRACH_PowerOffset)mComponents[9];
    }
    
    public void setPrach_PowerOffset(PRACH_PowerOffset prach_PowerOffset)
    {
	mComponents[9] = prach_PowerOffset;
    }
    
    public boolean hasPrach_PowerOffset()
    {
	return componentIsPresent(9);
    }
    
    public void deletePrach_PowerOffset()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "rach_TransmissionParameters"
    public RACH_TransmissionParameters getRach_TransmissionParameters()
    {
	return (RACH_TransmissionParameters)mComponents[10];
    }
    
    public void setRach_TransmissionParameters(RACH_TransmissionParameters rach_TransmissionParameters)
    {
	mComponents[10] = rach_TransmissionParameters;
    }
    
    public boolean hasRach_TransmissionParameters()
    {
	return componentIsPresent(10);
    }
    
    public void deleteRach_TransmissionParameters()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "aich_Info"
    public AICH_Info getAich_Info()
    {
	return (AICH_Info)mComponents[11];
    }
    
    public void setAich_Info(AICH_Info aich_Info)
    {
	mComponents[11] = aich_Info;
    }
    
    public boolean hasAich_Info()
    {
	return componentIsPresent(11);
    }
    
    public void deleteAich_Info()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "powerOffsetPp_e"
    public long getPowerOffsetPp_e()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setPowerOffsetPp_e(long powerOffsetPp_e)
    {
	setPowerOffsetPp_e(new INTEGER(powerOffsetPp_e));
    }
    
    public void setPowerOffsetPp_e(INTEGER powerOffsetPp_e)
    {
	mComponents[12] = powerOffsetPp_e;
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
	    "rrc.informationelements",
	    "PRACH_PreambleForEnhancedUplink"
	),
	new QName (
	    "InformationElements",
	    "PRACH-PreambleForEnhancedUplink"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AvailableSignatures"
			    ),
			    new QName (
				"InformationElements",
				"AvailableSignatures"
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
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"signature15",
					0
				    ),
				    new MemberListElement (
					"signature14",
					1
				    ),
				    new MemberListElement (
					"signature13",
					2
				    ),
				    new MemberListElement (
					"signature12",
					3
				    ),
				    new MemberListElement (
					"signature11",
					4
				    ),
				    new MemberListElement (
					"signature10",
					5
				    ),
				    new MemberListElement (
					"signature9",
					6
				    ),
				    new MemberListElement (
					"signature8",
					7
				    ),
				    new MemberListElement (
					"signature7",
					8
				    ),
				    new MemberListElement (
					"signature6",
					9
				    ),
				    new MemberListElement (
					"signature5",
					10
				    ),
				    new MemberListElement (
					"signature4",
					11
				    ),
				    new MemberListElement (
					"signature3",
					12
				    ),
				    new MemberListElement (
					"signature2",
					13
				    ),
				    new MemberListElement (
					"signature1",
					14
				    ),
				    new MemberListElement (
					"signature0",
					15
				    )
				}
			    )
			)
		    ),
		    "availableSignatures",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "e-ai-Indication",
		    1,
		    2,
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
				"PreambleScramblingCodeWordNumber"
			    ),
			    new QName (
				"InformationElements",
				"PreambleScramblingCodeWordNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PreambleScramblingCodeWordNumber(0), 
				    new PreambleScramblingCodeWordNumber(15),
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
		    "preambleScramblingCodeWordNumber",
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
				"AvailableSubChannelNumbers"
			    ),
			    new QName (
				"InformationElements",
				"AvailableSubChannelNumbers"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(12)
				)
			    ),
			    new Bounds (
				new java.lang.Long(12),
				new java.lang.Long(12)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"subCh11",
					0
				    ),
				    new MemberListElement (
					"subCh10",
					1
				    ),
				    new MemberListElement (
					"subCh9",
					2
				    ),
				    new MemberListElement (
					"subCh8",
					3
				    ),
				    new MemberListElement (
					"subCh7",
					4
				    ),
				    new MemberListElement (
					"subCh6",
					5
				    ),
				    new MemberListElement (
					"subCh5",
					6
				    ),
				    new MemberListElement (
					"subCh4",
					7
				    ),
				    new MemberListElement (
					"subCh3",
					8
				    ),
				    new MemberListElement (
					"subCh2",
					9
				    ),
				    new MemberListElement (
					"subCh1",
					10
				    ),
				    new MemberListElement (
					"subCh0",
					11
				    )
				}
			    )
			)
		    ),
		    "availableSubChannelNumbers",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PRACH_Partitioning_r7"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-Partitioning-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_Partitioning_r7"
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
		    "prach-Partitioning",
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
				"PersistenceScalingFactorList"
			    ),
			    new QName (
				"InformationElements",
				"PersistenceScalingFactorList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(6),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PersistenceScalingFactor"
				)
			    )
			)
		    ),
		    "persistenceScalingFactorList",
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
				"AC_To_ASC_MappingTable"
			    ),
			    new QName (
				"InformationElements",
				"AC-To-ASC-MappingTable"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AC_To_ASC_Mapping"
				)
			    )
			)
		    ),
		    "ac-To-ASC-MappingTable",
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
				"PrimaryCPICH_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PrimaryCPICH_TX_Power(-10), 
				    new PrimaryCPICH_TX_Power(50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-10),
				new java.lang.Long(50)
			    ),
			    null
			)
		    ),
		    "primaryCPICH-TX-Power",
		    7,
		    3,
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
				"ConstantValue"
			    ),
			    new QName (
				"InformationElements",
				"ConstantValue"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ConstantValue(-35), 
				    new ConstantValue(-10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-35),
				new java.lang.Long(-10)
			    ),
			    null
			)
		    ),
		    "constantValue",
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
				"PRACH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-PowerOffset"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_PowerOffset"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_PowerOffset"
				)
			    ),
			    0
			)
		    ),
		    "prach-PowerOffset",
		    9,
		    3,
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
				"RACH_TransmissionParameters"
			    ),
			    new QName (
				"InformationElements",
				"RACH-TransmissionParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RACH_TransmissionParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RACH_TransmissionParameters"
				)
			    ),
			    0
			)
		    ),
		    "rach-TransmissionParameters",
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
				"AICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"AICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "aich-Info",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(-5), 
				    new com.oss.asn1.INTEGER(10),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-5),
				new java.lang.Long(10)
			    ),
			    null
			)
		    ),
		    "powerOffsetPp-e",
		    12,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_PreambleForEnhancedUplink object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_PreambleForEnhancedUplink object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_PreambleForEnhancedUplink
