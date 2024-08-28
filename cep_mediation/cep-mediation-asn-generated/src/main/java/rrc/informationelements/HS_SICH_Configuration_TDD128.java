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
 * Define the ASN1 Type HS_SICH_Configuration_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SICH_Configuration_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SICH_Configuration_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SICH_Configuration_TDD128(TimeslotNumber_LCR_r4 timeslotNumber, 
		    HS_ChannelisationCode_LCR channelisationCode, 
		    MidambleAllocationMode midambleAllocationMode, 
		    INTEGER midambleConfiguration, 
		    INTEGER nack_ack_power_offset, INTEGER power_level_HSSICH, 
		    Tpc_step_size tpc_step_size)
    {
	setTimeslotNumber(timeslotNumber);
	setChannelisationCode(channelisationCode);
	setMidambleAllocationMode(midambleAllocationMode);
	setMidambleConfiguration(midambleConfiguration);
	setNack_ack_power_offset(nack_ack_power_offset);
	setPower_level_HSSICH(power_level_HSSICH);
	setTpc_step_size(tpc_step_size);
    }
    
    /**
     * Construct with components.
     */
    public HS_SICH_Configuration_TDD128(TimeslotNumber_LCR_r4 timeslotNumber, 
		    HS_ChannelisationCode_LCR channelisationCode, 
		    MidambleAllocationMode midambleAllocationMode, 
		    long midambleConfiguration, long nack_ack_power_offset, 
		    long power_level_HSSICH, Tpc_step_size tpc_step_size)
    {
	this(timeslotNumber, channelisationCode, midambleAllocationMode, 
	     new INTEGER(midambleConfiguration), 
	     new INTEGER(nack_ack_power_offset), 
	     new INTEGER(power_level_HSSICH), tpc_step_size);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber_LCR_r4();
	mComponents[1] = HS_ChannelisationCode_LCR.cc16_1;
	mComponents[2] = new MidambleAllocationMode();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = Tpc_step_size.s1;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TimeslotNumber_LCR_r4();
	    case 1:
		return HS_ChannelisationCode_LCR.cc16_1;
	    case 2:
		return new MidambleAllocationMode();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return Tpc_step_size.s1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber_LCR_r4 getTimeslotNumber()
    {
	return (TimeslotNumber_LCR_r4)mComponents[0];
    }
    
    public void setTimeslotNumber(TimeslotNumber_LCR_r4 timeslotNumber)
    {
	mComponents[0] = timeslotNumber;
    }
    
    
    // Methods for field "channelisationCode"
    public HS_ChannelisationCode_LCR getChannelisationCode()
    {
	return (HS_ChannelisationCode_LCR)mComponents[1];
    }
    
    public void setChannelisationCode(HS_ChannelisationCode_LCR channelisationCode)
    {
	mComponents[1] = channelisationCode;
    }
    
    
    // Methods for field "midambleAllocationMode"
    public MidambleAllocationMode getMidambleAllocationMode()
    {
	return (MidambleAllocationMode)mComponents[2];
    }
    
    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
    {
	mComponents[2] = midambleAllocationMode;
    }
    
    
    
    /**
     * Define the ASN1 Type MidambleAllocationMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class MidambleAllocationMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MidambleAllocationMode()
	{
	}
	
	public static final  int  defaultMidamble_chosen = 1;
	public static final  int  ueSpecificMidamble_chosen = 2;
	
	// Methods for field "defaultMidamble"
	public static MidambleAllocationMode createMidambleAllocationModeWithDefaultMidamble(Null defaultMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setDefaultMidamble(defaultMidamble);
	    return __object;
	}
	
	public boolean hasDefaultMidamble()
	{
	    return getChosenFlag() == defaultMidamble_chosen;
	}
	
	public void setDefaultMidamble(Null defaultMidamble)
	{
	    setChosenValue(defaultMidamble);
	    setChosenFlag(defaultMidamble_chosen);
	}
	
	
	// Methods for field "ueSpecificMidamble"
	public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(UeSpecificMidamble ueSpecificMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setUeSpecificMidamble(ueSpecificMidamble);
	    return __object;
	}
	
	public boolean hasUeSpecificMidamble()
	{
	    return getChosenFlag() == ueSpecificMidamble_chosen;
	}
	
	public void setUeSpecificMidamble(UeSpecificMidamble ueSpecificMidamble)
	{
	    setChosenValue(ueSpecificMidamble);
	    setChosenFlag(ueSpecificMidamble_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UeSpecificMidamble from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class UeSpecificMidamble extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public UeSpecificMidamble()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public UeSpecificMidamble(MidambleShiftLong midambleShift)
	    {
		setMidambleShift(midambleShift);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MidambleShiftLong();
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
			return new MidambleShiftLong();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "midambleShift"
	    public MidambleShiftLong getMidambleShift()
	    {
		return (MidambleShiftLong)mComponents[0];
	    }
	    
	    public void setMidambleShift(MidambleShiftLong midambleShift)
	    {
		mComponents[0] = midambleShift;
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
		    "rrc.informationelements",
		    "HS_SICH_Configuration_TDD128$MidambleAllocationMode$UeSpecificMidamble"
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
					"MidambleShiftLong"
				    ),
				    new QName (
					"InformationElements",
					"MidambleShiftLong"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new MidambleShiftLong(0), 
					    new MidambleShiftLong(15),
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
			    "midambleShift",
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
	     * Get the type descriptor (TypeInfo) of 'this' UeSpecificMidamble object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UeSpecificMidamble object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UeSpecificMidamble

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case defaultMidamble_chosen:
		    return new Null();
		case ueSpecificMidamble_chosen:
		    return new UeSpecificMidamble();
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
		"HS_SICH_Configuration_TDD128$MidambleAllocationMode"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"defaultMidamble",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_SICH_Configuration_TDD128$MidambleAllocationMode$UeSpecificMidamble"
			    )
			),
			"ueSpecificMidamble",
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
	 * Get the type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MidambleAllocationMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MidambleAllocationMode

    // Methods for field "midambleConfiguration"
    public long getMidambleConfiguration()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setMidambleConfiguration(long midambleConfiguration)
    {
	setMidambleConfiguration(new INTEGER(midambleConfiguration));
    }
    
    public void setMidambleConfiguration(INTEGER midambleConfiguration)
    {
	mComponents[3] = midambleConfiguration;
    }
    
    
    // Methods for field "nack_ack_power_offset"
    public long getNack_ack_power_offset()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setNack_ack_power_offset(long nack_ack_power_offset)
    {
	setNack_ack_power_offset(new INTEGER(nack_ack_power_offset));
    }
    
    public void setNack_ack_power_offset(INTEGER nack_ack_power_offset)
    {
	mComponents[4] = nack_ack_power_offset;
    }
    
    
    // Methods for field "power_level_HSSICH"
    public long getPower_level_HSSICH()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setPower_level_HSSICH(long power_level_HSSICH)
    {
	setPower_level_HSSICH(new INTEGER(power_level_HSSICH));
    }
    
    public void setPower_level_HSSICH(INTEGER power_level_HSSICH)
    {
	mComponents[5] = power_level_HSSICH;
    }
    
    
    // Methods for field "tpc_step_size"
    public Tpc_step_size getTpc_step_size()
    {
	return (Tpc_step_size)mComponents[6];
    }
    
    public void setTpc_step_size(Tpc_step_size tpc_step_size)
    {
	mComponents[6] = tpc_step_size;
    }
    
    
    
    /**
     * Define the ASN1 Type Tpc_step_size from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Tpc_step_size extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpc_step_size()
	{
	    super(cFirstNumber);
	}
	
	protected Tpc_step_size(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Tpc_step_size s1 =
	    new Tpc_step_size(0);
	public static final Tpc_step_size s2 =
	    new Tpc_step_size(1);
	public static final Tpc_step_size s3 =
	    new Tpc_step_size(2);
	public static final Tpc_step_size spare1 =
	    new Tpc_step_size(3);
	private final static Tpc_step_size cNamedNumbers[] = {
	     s1, 
	     s2, 
	     s3, 
	     spare1
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
	
	public static Tpc_step_size valueOf(long value)
	{
	    return (Tpc_step_size)s1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SICH_Configuration_TDD128$Tpc_step_size"
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
			"s1",
			0
		    ),
		    new MemberListElement (
			"s2",
			1
		    ),
		    new MemberListElement (
			"s3",
			2
		    ),
		    new MemberListElement (
			"spare1",
			3
		    )
		}
	    ),
	    0,
	    s1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tpc_step_size object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpc_step_size object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpc_step_size

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
	    "HS_SICH_Configuration_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-SICH-Configuration-TDD128"
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
				"TimeslotNumber_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber-LCR-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber_LCR_r4(0), 
				    new TimeslotNumber_LCR_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "timeslotNumber",
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
				"HS_ChannelisationCode_LCR"
			    ),
			    new QName (
				"InformationElements",
				"HS-ChannelisationCode-LCR"
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
			    HS_ChannelisationCode_LCR.cc16_1
			)
		    ),
		    "channelisationCode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SICH_Configuration_TDD128$MidambleAllocationMode"
			)
		    ),
		    "midambleAllocationMode",
		    2,
		    2,
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "midambleConfiguration",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(-7), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-7),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "nack-ack-power-offset",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(-120), 
				    new com.oss.asn1.INTEGER(-58),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-120),
				new java.lang.Long(-58)
			    ),
			    null
			)
		    ),
		    "power-level-HSSICH",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SICH_Configuration_TDD128$Tpc_step_size"
			)
		    ),
		    "tpc-step-size",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SICH_Configuration_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SICH_Configuration_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SICH_Configuration_TDD128
