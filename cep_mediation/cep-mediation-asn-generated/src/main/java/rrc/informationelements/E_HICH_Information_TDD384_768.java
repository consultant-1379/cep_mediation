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
 * Define the ASN1 Type E_HICH_Information_TDD384_768 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_HICH_Information_TDD384_768 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_HICH_Information_TDD384_768()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_HICH_Information_TDD384_768(INTEGER n_E_HICH, INTEGER tS_Number, 
		    ModeSpecificInfo modeSpecificInfo, Burst_Type burst_Type, 
		    Midamble_Allocation_Mode midamble_Allocation_Mode)
    {
	setN_E_HICH(n_E_HICH);
	setTS_Number(tS_Number);
	setModeSpecificInfo(modeSpecificInfo);
	setBurst_Type(burst_Type);
	setMidamble_Allocation_Mode(midamble_Allocation_Mode);
    }
    
    /**
     * Construct with components.
     */
    public E_HICH_Information_TDD384_768(long n_E_HICH, long tS_Number, 
		    ModeSpecificInfo modeSpecificInfo, Burst_Type burst_Type, 
		    Midamble_Allocation_Mode midamble_Allocation_Mode)
    {
	this(new INTEGER(n_E_HICH), new INTEGER(tS_Number), 
	     modeSpecificInfo, burst_Type, midamble_Allocation_Mode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new ModeSpecificInfo();
	mComponents[3] = Burst_Type.type1;
	mComponents[4] = Midamble_Allocation_Mode._default;
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new ModeSpecificInfo();
	    case 3:
		return Burst_Type.type1;
	    case 4:
		return Midamble_Allocation_Mode._default;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "n_E_HICH"
    public long getN_E_HICH()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setN_E_HICH(long n_E_HICH)
    {
	setN_E_HICH(new INTEGER(n_E_HICH));
    }
    
    public void setN_E_HICH(INTEGER n_E_HICH)
    {
	mComponents[0] = n_E_HICH;
    }
    
    
    // Methods for field "tS_Number"
    public long getTS_Number()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTS_Number(long tS_Number)
    {
	setTS_Number(new INTEGER(tS_Number));
    }
    
    public void setTS_Number(INTEGER tS_Number)
    {
	mComponents[1] = tS_Number;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
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
	
	public static final  int  tdd384_chosen = 1;
	public static final  int  tdd768_chosen = 2;
	
	// Methods for field "tdd384"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd384(DL_TS_ChannelisationCode tdd384)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd384(tdd384);
	    return __object;
	}
	
	public boolean hasTdd384()
	{
	    return getChosenFlag() == tdd384_chosen;
	}
	
	public void setTdd384(DL_TS_ChannelisationCode tdd384)
	{
	    setChosenValue(tdd384);
	    setChosenFlag(tdd384_chosen);
	}
	
	
	// Methods for field "tdd768"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd768(DL_TS_ChannelisationCode_VHCR tdd768)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd768(tdd768);
	    return __object;
	}
	
	public boolean hasTdd768()
	{
	    return getChosenFlag() == tdd768_chosen;
	}
	
	public void setTdd768(DL_TS_ChannelisationCode_VHCR tdd768)
	{
	    setChosenValue(tdd768);
	    setChosenFlag(tdd768_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd384_chosen:
		    return DL_TS_ChannelisationCode.cc16_1;
		case tdd768_chosen:
		    return DL_TS_ChannelisationCode_VHCR.cc32_1;
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
		"E_HICH_Information_TDD384_768$ModeSpecificInfo"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_TS_ChannelisationCode"
				),
				new QName (
				    "InformationElements",
				    "DL-TS-ChannelisationCode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc16-1",
					    0
					),
					new MemberListElement (
					    "cc16-2",
					    1
					),
					new MemberListElement (
					    "cc16-3",
					    2
					),
					new MemberListElement (
					    "cc16-4",
					    3
					),
					new MemberListElement (
					    "cc16-5",
					    4
					),
					new MemberListElement (
					    "cc16-6",
					    5
					),
					new MemberListElement (
					    "cc16-7",
					    6
					),
					new MemberListElement (
					    "cc16-8",
					    7
					),
					new MemberListElement (
					    "cc16-9",
					    8
					),
					new MemberListElement (
					    "cc16-10",
					    9
					),
					new MemberListElement (
					    "cc16-11",
					    10
					),
					new MemberListElement (
					    "cc16-12",
					    11
					),
					new MemberListElement (
					    "cc16-13",
					    12
					),
					new MemberListElement (
					    "cc16-14",
					    13
					),
					new MemberListElement (
					    "cc16-15",
					    14
					),
					new MemberListElement (
					    "cc16-16",
					    15
					)
				    }
				),
				0,
				DL_TS_ChannelisationCode.cc16_1
			    )
			),
			"tdd384",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_TS_ChannelisationCode_VHCR"
				),
				new QName (
				    "InformationElements",
				    "DL-TS-ChannelisationCode-VHCR"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc32-1",
					    0
					),
					new MemberListElement (
					    "cc32-2",
					    1
					),
					new MemberListElement (
					    "cc32-3",
					    2
					),
					new MemberListElement (
					    "cc32-4",
					    3
					),
					new MemberListElement (
					    "cc132-5",
					    4
					),
					new MemberListElement (
					    "cc32-6",
					    5
					),
					new MemberListElement (
					    "cc32-7",
					    6
					),
					new MemberListElement (
					    "cc32-8",
					    7
					),
					new MemberListElement (
					    "cc32-9",
					    8
					),
					new MemberListElement (
					    "cc32-10",
					    9
					),
					new MemberListElement (
					    "cc32-11",
					    10
					),
					new MemberListElement (
					    "cc32-12",
					    11
					),
					new MemberListElement (
					    "cc32-13",
					    12
					),
					new MemberListElement (
					    "cc32-14",
					    13
					),
					new MemberListElement (
					    "cc32-15",
					    14
					),
					new MemberListElement (
					    "cc32-16",
					    15
					),
					new MemberListElement (
					    "cc32-17",
					    16
					),
					new MemberListElement (
					    "cc32-18",
					    17
					),
					new MemberListElement (
					    "cc32-19",
					    18
					),
					new MemberListElement (
					    "cc32-20",
					    19
					),
					new MemberListElement (
					    "cc32-21",
					    20
					),
					new MemberListElement (
					    "cc32-22",
					    21
					),
					new MemberListElement (
					    "cc32-23",
					    22
					),
					new MemberListElement (
					    "cc32-24",
					    23
					),
					new MemberListElement (
					    "cc32-25",
					    24
					),
					new MemberListElement (
					    "cc32-26",
					    25
					),
					new MemberListElement (
					    "cc32-27",
					    26
					),
					new MemberListElement (
					    "cc32-28",
					    27
					),
					new MemberListElement (
					    "cc32-29",
					    28
					),
					new MemberListElement (
					    "cc32-30",
					    29
					),
					new MemberListElement (
					    "cc32-31",
					    30
					),
					new MemberListElement (
					    "cc32-32",
					    31
					)
				    }
				),
				0,
				DL_TS_ChannelisationCode_VHCR.cc32_1
			    )
			),
			"tdd768",
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

    // Methods for field "burst_Type"
    public Burst_Type getBurst_Type()
    {
	return (Burst_Type)mComponents[3];
    }
    
    public void setBurst_Type(Burst_Type burst_Type)
    {
	mComponents[3] = burst_Type;
    }
    
    
    
    /**
     * Define the ASN1 Type Burst_Type from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Burst_Type extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Burst_Type()
	{
	    super(cFirstNumber);
	}
	
	protected Burst_Type(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Burst_Type type1 =
	    new Burst_Type(0);
	public static final Burst_Type type2 =
	    new Burst_Type(1);
	private final static Burst_Type cNamedNumbers[] = {
	     type1, 
	     type2
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
	
	public static Burst_Type valueOf(long value)
	{
	    return (Burst_Type)type1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_HICH_Information_TDD384_768$Burst_Type"
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
			"type1",
			0
		    ),
		    new MemberListElement (
			"type2",
			1
		    )
		}
	    ),
	    0,
	    type1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Burst_Type object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Burst_Type object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Burst_Type

    // Methods for field "midamble_Allocation_Mode"
    public Midamble_Allocation_Mode getMidamble_Allocation_Mode()
    {
	return (Midamble_Allocation_Mode)mComponents[4];
    }
    
    public void setMidamble_Allocation_Mode(Midamble_Allocation_Mode midamble_Allocation_Mode)
    {
	mComponents[4] = midamble_Allocation_Mode;
    }
    
    
    
    /**
     * Define the ASN1 Type Midamble_Allocation_Mode from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Midamble_Allocation_Mode extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Midamble_Allocation_Mode()
	{
	    super(cFirstNumber);
	}
	
	protected Midamble_Allocation_Mode(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Midamble_Allocation_Mode _default =
	    new Midamble_Allocation_Mode(0);
	public static final Midamble_Allocation_Mode common =
	    new Midamble_Allocation_Mode(1);
	private final static Midamble_Allocation_Mode cNamedNumbers[] = {
	     _default, 
	     common
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
	
	public static Midamble_Allocation_Mode valueOf(long value)
	{
	    return (Midamble_Allocation_Mode)_default.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_HICH_Information_TDD384_768$Midamble_Allocation_Mode"
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
			"default",
			0
		    ),
		    new MemberListElement (
			"common",
			1
		    )
		}
	    ),
	    0,
	    _default
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Midamble_Allocation_Mode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Midamble_Allocation_Mode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Midamble_Allocation_Mode

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
	    "E_HICH_Information_TDD384_768"
	),
	new QName (
	    "InformationElements",
	    "E-HICH-Information-TDD384-768"
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
				    new com.oss.asn1.INTEGER(4), 
				    new com.oss.asn1.INTEGER(44),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(4),
				new java.lang.Long(44)
			    ),
			    null
			)
		    ),
		    "n-E-HICH",
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "tS-Number",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_HICH_Information_TDD384_768$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_HICH_Information_TDD384_768$Burst_Type"
			)
		    ),
		    "burst-Type",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_HICH_Information_TDD384_768$Midamble_Allocation_Mode"
			)
		    ),
		    "midamble-Allocation-Mode",
		    4,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' E_HICH_Information_TDD384_768 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Information_TDD384_768 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_HICH_Information_TDD384_768
