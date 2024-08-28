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
 * Define the ASN1 Type MBMS_NeighbouringCellSCCPCH_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_NeighbouringCellSCCPCH_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_NeighbouringCellSCCPCH_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_NeighbouringCellSCCPCH_r6(MBMS_CommonPhyChIdentity secondaryCCPCH_Info, 
		    MBMS_SCCPCHPwrOffsetDiff secondaryCCPCHPwrOffsetDiff, 
		    Layer1Combining layer1Combining, 
		    MBMS_L23Configuration mbms_L23Configuration)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setSecondaryCCPCHPwrOffsetDiff(secondaryCCPCHPwrOffsetDiff);
	setLayer1Combining(layer1Combining);
	setMbms_L23Configuration(mbms_L23Configuration);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_NeighbouringCellSCCPCH_r6(MBMS_CommonPhyChIdentity secondaryCCPCH_Info, 
		    MBMS_L23Configuration mbms_L23Configuration)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setMbms_L23Configuration(mbms_L23Configuration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_CommonPhyChIdentity();
	mComponents[1] = MBMS_SCCPCHPwrOffsetDiff.mcpo_minus6;
	mComponents[2] = new Layer1Combining();
	mComponents[3] = new MBMS_L23Configuration();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MBMS_CommonPhyChIdentity();
	    case 1:
		return MBMS_SCCPCHPwrOffsetDiff.mcpo_minus6;
	    case 2:
		return new Layer1Combining();
	    case 3:
		return new MBMS_L23Configuration();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCCPCH_Info"
    public MBMS_CommonPhyChIdentity getSecondaryCCPCH_Info()
    {
	return (MBMS_CommonPhyChIdentity)mComponents[0];
    }
    
    public void setSecondaryCCPCH_Info(MBMS_CommonPhyChIdentity secondaryCCPCH_Info)
    {
	mComponents[0] = secondaryCCPCH_Info;
    }
    
    
    // Methods for field "secondaryCCPCHPwrOffsetDiff"
    public MBMS_SCCPCHPwrOffsetDiff getSecondaryCCPCHPwrOffsetDiff()
    {
	return (MBMS_SCCPCHPwrOffsetDiff)mComponents[1];
    }
    
    public void setSecondaryCCPCHPwrOffsetDiff(MBMS_SCCPCHPwrOffsetDiff secondaryCCPCHPwrOffsetDiff)
    {
	mComponents[1] = secondaryCCPCHPwrOffsetDiff;
    }
    
    public boolean hasSecondaryCCPCHPwrOffsetDiff()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSecondaryCCPCHPwrOffsetDiff()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "layer1Combining"
    public Layer1Combining getLayer1Combining()
    {
	return (Layer1Combining)mComponents[2];
    }
    
    public void setLayer1Combining(Layer1Combining layer1Combining)
    {
	mComponents[2] = layer1Combining;
    }
    
    public boolean hasLayer1Combining()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLayer1Combining()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Layer1Combining from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Layer1Combining extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Layer1Combining()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static Layer1Combining createLayer1CombiningWithFdd(Fdd fdd)
	{
	    Layer1Combining __object = new Layer1Combining();

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
	    public Fdd(MBMS_SoftComb_TimingOffset softComb_TimingOffset, 
			    MBMS_L1CombiningTransmTimeDiff mbms_L1CombiningTransmTimeDiff, 
			    MBMS_L1CombiningSchedule mbms_L1CombiningSchedule)
	    {
		setSoftComb_TimingOffset(softComb_TimingOffset);
		setMbms_L1CombiningTransmTimeDiff(mbms_L1CombiningTransmTimeDiff);
		setMbms_L1CombiningSchedule(mbms_L1CombiningSchedule);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(MBMS_SoftComb_TimingOffset softComb_TimingOffset, 
			    MBMS_L1CombiningTransmTimeDiff mbms_L1CombiningTransmTimeDiff)
	    {
		setSoftComb_TimingOffset(softComb_TimingOffset);
		setMbms_L1CombiningTransmTimeDiff(mbms_L1CombiningTransmTimeDiff);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = MBMS_SoftComb_TimingOffset.ms0;
		mComponents[1] = new MBMS_L1CombiningTransmTimeDiff();
		mComponents[2] = new MBMS_L1CombiningSchedule();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[3];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return MBMS_SoftComb_TimingOffset.ms0;
		    case 1:
			return new MBMS_L1CombiningTransmTimeDiff();
		    case 2:
			return new MBMS_L1CombiningSchedule();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "softComb_TimingOffset"
	    public MBMS_SoftComb_TimingOffset getSoftComb_TimingOffset()
	    {
		return (MBMS_SoftComb_TimingOffset)mComponents[0];
	    }
	    
	    public void setSoftComb_TimingOffset(MBMS_SoftComb_TimingOffset softComb_TimingOffset)
	    {
		mComponents[0] = softComb_TimingOffset;
	    }
	    
	    
	    // Methods for field "mbms_L1CombiningTransmTimeDiff"
	    public MBMS_L1CombiningTransmTimeDiff getMbms_L1CombiningTransmTimeDiff()
	    {
		return (MBMS_L1CombiningTransmTimeDiff)mComponents[1];
	    }
	    
	    public void setMbms_L1CombiningTransmTimeDiff(MBMS_L1CombiningTransmTimeDiff mbms_L1CombiningTransmTimeDiff)
	    {
		mComponents[1] = mbms_L1CombiningTransmTimeDiff;
	    }
	    
	    
	    // Methods for field "mbms_L1CombiningSchedule"
	    public MBMS_L1CombiningSchedule getMbms_L1CombiningSchedule()
	    {
		return (MBMS_L1CombiningSchedule)mComponents[2];
	    }
	    
	    public void setMbms_L1CombiningSchedule(MBMS_L1CombiningSchedule mbms_L1CombiningSchedule)
	    {
		mComponents[2] = mbms_L1CombiningSchedule;
	    }
	    
	    public boolean hasMbms_L1CombiningSchedule()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteMbms_L1CombiningSchedule()
	    {
		setComponentAbsent(2);
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
		    "MBMS_NeighbouringCellSCCPCH_r6$Layer1Combining$Fdd"
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
					"MBMS_SoftComb_TimingOffset"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-SoftComb-TimingOffset"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ms0",
						0
					    ),
					    new MemberListElement (
						"ms10",
						1
					    ),
					    new MemberListElement (
						"ms20",
						2
					    ),
					    new MemberListElement (
						"ms40",
						3
					    )
					}
				    ),
				    0,
				    MBMS_SoftComb_TimingOffset.ms0
				)
			    ),
			    "softComb-TimingOffset",
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
					"MBMS_L1CombiningTransmTimeDiff"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-L1CombiningTransmTimeDiff"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new MBMS_L1CombiningTransmTimeDiff(0), 
					    new MBMS_L1CombiningTransmTimeDiff(3),
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
			    "mbms-L1CombiningTransmTimeDiff",
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
					"MBMS_L1CombiningSchedule"
				    ),
				    new QName (
					"InformationElements",
					"MBMS-L1CombiningSchedule"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "MBMS_L1CombiningSchedule"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2),
					    new TagDecoderElement((short)0x8003, 3),
					    new TagDecoderElement((short)0x8004, 4),
					    new TagDecoderElement((short)0x8005, 5)
					}
				    )
				)
			    ),
			    "mbms-L1CombiningSchedule",
			    2,
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
				new TagDecoderElement((short)0x8001, 1)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2)
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
	public static Layer1Combining createLayer1CombiningWithTdd(Null tdd)
	{
	    Layer1Combining __object = new Layer1Combining();

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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBMS_NeighbouringCellSCCPCH_r6$Layer1Combining"
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
				"MBMS_NeighbouringCellSCCPCH_r6$Layer1Combining$Fdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' Layer1Combining object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Layer1Combining object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Layer1Combining

    // Methods for field "mbms_L23Configuration"
    public MBMS_L23Configuration getMbms_L23Configuration()
    {
	return (MBMS_L23Configuration)mComponents[3];
    }
    
    public void setMbms_L23Configuration(MBMS_L23Configuration mbms_L23Configuration)
    {
	mComponents[3] = mbms_L23Configuration;
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
	    "MBMS_NeighbouringCellSCCPCH_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-NeighbouringCellSCCPCH-r6"
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
				"MBMS_CommonPhyChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonPhyChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonPhyChIdentity(1), 
				    new MBMS_CommonPhyChIdentity(32),
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
		    "secondaryCCPCH-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MBMS_SCCPCHPwrOffsetDiff"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SCCPCHPwrOffsetDiff"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mcpo-minus6",
					0
				    ),
				    new MemberListElement (
					"mcpo-minus3",
					1
				    ),
				    new MemberListElement (
					"mcpo-plus3",
					2
				    ),
				    new MemberListElement (
					"mcpo-plus6",
					3
				    )
				}
			    ),
			    0,
			    MBMS_SCCPCHPwrOffsetDiff.mcpo_minus6
			)
		    ),
		    "secondaryCCPCHPwrOffsetDiff",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_NeighbouringCellSCCPCH_r6$Layer1Combining"
			)
		    ),
		    "layer1Combining",
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
				"MBMS_L23Configuration"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-L23Configuration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_L23Configuration"
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
		    "mbms-L23Configuration",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_NeighbouringCellSCCPCH_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_NeighbouringCellSCCPCH_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_NeighbouringCellSCCPCH_r6
