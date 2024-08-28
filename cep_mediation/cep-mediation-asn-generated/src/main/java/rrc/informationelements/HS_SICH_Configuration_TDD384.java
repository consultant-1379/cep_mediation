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
 * Define the ASN1 Type HS_SICH_Configuration_TDD384 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SICH_Configuration_TDD384 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SICH_Configuration_TDD384()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SICH_Configuration_TDD384(TimeslotNumber timeslotNumber, 
		    DL_TS_ChannelisationCode channelisationCode, 
		    MidambleAllocationMode midambleAllocationMode, 
		    MidambleConfigurationBurstType1and3 midambleconfiguration)
    {
	setTimeslotNumber(timeslotNumber);
	setChannelisationCode(channelisationCode);
	setMidambleAllocationMode(midambleAllocationMode);
	setMidambleconfiguration(midambleconfiguration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber();
	mComponents[1] = DL_TS_ChannelisationCode.cc16_1;
	mComponents[2] = new MidambleAllocationMode();
	mComponents[3] = MidambleConfigurationBurstType1and3.ms4;
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
		return new TimeslotNumber();
	    case 1:
		return DL_TS_ChannelisationCode.cc16_1;
	    case 2:
		return new MidambleAllocationMode();
	    case 3:
		return MidambleConfigurationBurstType1and3.ms4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber getTimeslotNumber()
    {
	return (TimeslotNumber)mComponents[0];
    }
    
    public void setTimeslotNumber(TimeslotNumber timeslotNumber)
    {
	mComponents[0] = timeslotNumber;
    }
    
    
    // Methods for field "channelisationCode"
    public DL_TS_ChannelisationCode getChannelisationCode()
    {
	return (DL_TS_ChannelisationCode)mComponents[1];
    }
    
    public void setChannelisationCode(DL_TS_ChannelisationCode channelisationCode)
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
		    "HS_SICH_Configuration_TDD384$MidambleAllocationMode$UeSpecificMidamble"
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
		"HS_SICH_Configuration_TDD384$MidambleAllocationMode"
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
				"HS_SICH_Configuration_TDD384$MidambleAllocationMode$UeSpecificMidamble"
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

    // Methods for field "midambleconfiguration"
    public MidambleConfigurationBurstType1and3 getMidambleconfiguration()
    {
	return (MidambleConfigurationBurstType1and3)mComponents[3];
    }
    
    public void setMidambleconfiguration(MidambleConfigurationBurstType1and3 midambleconfiguration)
    {
	mComponents[3] = midambleconfiguration;
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
	    "HS_SICH_Configuration_TDD384"
	),
	new QName (
	    "InformationElements",
	    "HS-SICH-Configuration-TDD384"
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
				"TimeslotNumber"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber(0), 
				    new TimeslotNumber(14),
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
		    "channelisationCode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SICH_Configuration_TDD384$MidambleAllocationMode"
			)
		    ),
		    "midambleAllocationMode",
		    2,
		    2,
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
				"MidambleConfigurationBurstType1and3"
			    ),
			    new QName (
				"InformationElements",
				"MidambleConfigurationBurstType1and3"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms4",
					0
				    ),
				    new MemberListElement (
					"ms8",
					1
				    ),
				    new MemberListElement (
					"ms16",
					2
				    )
				}
			    ),
			    0,
			    MidambleConfigurationBurstType1and3.ms4
			)
		    ),
		    "midambleconfiguration",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SICH_Configuration_TDD384 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SICH_Configuration_TDD384 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SICH_Configuration_TDD384
