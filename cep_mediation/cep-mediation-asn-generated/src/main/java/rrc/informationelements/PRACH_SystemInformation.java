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
 * Define the ASN1 Type PRACH_SystemInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_SystemInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_SystemInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_SystemInformation(PRACH_RACH_Info prach_RACH_Info, 
		    TransportChannelIdentity transportChannelIdentity, 
		    TransportFormatSet rach_TransportFormatSet, 
		    TFCS rach_TFCS, PRACH_Partitioning prach_Partitioning, 
		    PersistenceScalingFactorList persistenceScalingFactorList, 
		    AC_To_ASC_MappingTable ac_To_ASC_MappingTable, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setPrach_RACH_Info(prach_RACH_Info);
	setTransportChannelIdentity(transportChannelIdentity);
	setRach_TransportFormatSet(rach_TransportFormatSet);
	setRach_TFCS(rach_TFCS);
	setPrach_Partitioning(prach_Partitioning);
	setPersistenceScalingFactorList(persistenceScalingFactorList);
	setAc_To_ASC_MappingTable(ac_To_ASC_MappingTable);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public PRACH_SystemInformation(PRACH_RACH_Info prach_RACH_Info, 
		    TransportChannelIdentity transportChannelIdentity, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setPrach_RACH_Info(prach_RACH_Info);
	setTransportChannelIdentity(transportChannelIdentity);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PRACH_RACH_Info();
	mComponents[1] = new TransportChannelIdentity();
	mComponents[2] = new TransportFormatSet();
	mComponents[3] = new TFCS();
	mComponents[4] = new PRACH_Partitioning();
	mComponents[5] = new PersistenceScalingFactorList();
	mComponents[6] = new AC_To_ASC_MappingTable();
	mComponents[7] = new ModeSpecificInfo();
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
		return new PRACH_RACH_Info();
	    case 1:
		return new TransportChannelIdentity();
	    case 2:
		return new TransportFormatSet();
	    case 3:
		return new TFCS();
	    case 4:
		return new PRACH_Partitioning();
	    case 5:
		return new PersistenceScalingFactorList();
	    case 6:
		return new AC_To_ASC_MappingTable();
	    case 7:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "prach_RACH_Info"
    public PRACH_RACH_Info getPrach_RACH_Info()
    {
	return (PRACH_RACH_Info)mComponents[0];
    }
    
    public void setPrach_RACH_Info(PRACH_RACH_Info prach_RACH_Info)
    {
	mComponents[0] = prach_RACH_Info;
    }
    
    
    // Methods for field "transportChannelIdentity"
    public TransportChannelIdentity getTransportChannelIdentity()
    {
	return (TransportChannelIdentity)mComponents[1];
    }
    
    public void setTransportChannelIdentity(TransportChannelIdentity transportChannelIdentity)
    {
	mComponents[1] = transportChannelIdentity;
    }
    
    
    // Methods for field "rach_TransportFormatSet"
    public TransportFormatSet getRach_TransportFormatSet()
    {
	return (TransportFormatSet)mComponents[2];
    }
    
    public void setRach_TransportFormatSet(TransportFormatSet rach_TransportFormatSet)
    {
	mComponents[2] = rach_TransportFormatSet;
    }
    
    public boolean hasRach_TransportFormatSet()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRach_TransportFormatSet()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "rach_TFCS"
    public TFCS getRach_TFCS()
    {
	return (TFCS)mComponents[3];
    }
    
    public void setRach_TFCS(TFCS rach_TFCS)
    {
	mComponents[3] = rach_TFCS;
    }
    
    public boolean hasRach_TFCS()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRach_TFCS()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "prach_Partitioning"
    public PRACH_Partitioning getPrach_Partitioning()
    {
	return (PRACH_Partitioning)mComponents[4];
    }
    
    public void setPrach_Partitioning(PRACH_Partitioning prach_Partitioning)
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
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[7];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[7] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
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
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
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
	    public Fdd(PrimaryCPICH_TX_Power primaryCPICH_TX_Power, 
			    ConstantValue constantValue, 
			    PRACH_PowerOffset prach_PowerOffset, 
			    RACH_TransmissionParameters rach_TransmissionParameters, 
			    AICH_Info aich_Info)
	    {
		setPrimaryCPICH_TX_Power(primaryCPICH_TX_Power);
		setConstantValue(constantValue);
		setPrach_PowerOffset(prach_PowerOffset);
		setRach_TransmissionParameters(rach_TransmissionParameters);
		setAich_Info(aich_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_TX_Power();
		mComponents[1] = new ConstantValue();
		mComponents[2] = new PRACH_PowerOffset();
		mComponents[3] = new RACH_TransmissionParameters();
		mComponents[4] = new AICH_Info();
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
			return new PrimaryCPICH_TX_Power();
		    case 1:
			return new ConstantValue();
		    case 2:
			return new PRACH_PowerOffset();
		    case 3:
			return new RACH_TransmissionParameters();
		    case 4:
			return new AICH_Info();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "primaryCPICH_TX_Power"
	    public PrimaryCPICH_TX_Power getPrimaryCPICH_TX_Power()
	    {
		return (PrimaryCPICH_TX_Power)mComponents[0];
	    }
	    
	    public void setPrimaryCPICH_TX_Power(PrimaryCPICH_TX_Power primaryCPICH_TX_Power)
	    {
		mComponents[0] = primaryCPICH_TX_Power;
	    }
	    
	    public boolean hasPrimaryCPICH_TX_Power()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deletePrimaryCPICH_TX_Power()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "constantValue"
	    public ConstantValue getConstantValue()
	    {
		return (ConstantValue)mComponents[1];
	    }
	    
	    public void setConstantValue(ConstantValue constantValue)
	    {
		mComponents[1] = constantValue;
	    }
	    
	    public boolean hasConstantValue()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteConstantValue()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "prach_PowerOffset"
	    public PRACH_PowerOffset getPrach_PowerOffset()
	    {
		return (PRACH_PowerOffset)mComponents[2];
	    }
	    
	    public void setPrach_PowerOffset(PRACH_PowerOffset prach_PowerOffset)
	    {
		mComponents[2] = prach_PowerOffset;
	    }
	    
	    public boolean hasPrach_PowerOffset()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePrach_PowerOffset()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "rach_TransmissionParameters"
	    public RACH_TransmissionParameters getRach_TransmissionParameters()
	    {
		return (RACH_TransmissionParameters)mComponents[3];
	    }
	    
	    public void setRach_TransmissionParameters(RACH_TransmissionParameters rach_TransmissionParameters)
	    {
		mComponents[3] = rach_TransmissionParameters;
	    }
	    
	    public boolean hasRach_TransmissionParameters()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteRach_TransmissionParameters()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "aich_Info"
	    public AICH_Info getAich_Info()
	    {
		return (AICH_Info)mComponents[4];
	    }
	    
	    public void setAich_Info(AICH_Info aich_Info)
	    {
		mComponents[4] = aich_Info;
	    }
	    
	    public boolean hasAich_Info()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteAich_Info()
	    {
		setComponentAbsent(4);
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
		    "rrc.informationelements",
		    "PRACH_SystemInformation$ModeSpecificInfo$Fdd"
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
			    0,
			    3,
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
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4)
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Null tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PRACH_SystemInformation$ModeSpecificInfo"
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
				"rrc.informationelements",
				"PRACH_SystemInformation$ModeSpecificInfo$Fdd"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "PRACH_SystemInformation"
	),
	new QName (
	    "InformationElements",
	    "PRACH-SystemInformation"
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
				"PRACH_RACH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-RACH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_RACH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_RACH_Info"
				)
			    ),
			    0
			)
		    ),
		    "prach-RACH-Info",
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
				"TransportChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TransportChannelIdentity(1), 
				    new TransportChannelIdentity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "transportChannelIdentity",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransportFormatSet"
			    ),
			    new QName (
				"InformationElements",
				"TransportFormatSet"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportFormatSet"
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
		    "rach-TransportFormatSet",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
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
		    "rach-TFCS",
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
				"PRACH_Partitioning"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-Partitioning"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PRACH_Partitioning"
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
			new QName (
			    "rrc.informationelements",
			    "PRACH_SystemInformation$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_SystemInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_SystemInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_SystemInformation
