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
 * Define the ASN1 Type E_HICH_Information_LCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_HICH_Information_LCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_HICH_Information_LCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_HICH_Information_LCR(INTEGER ei, 
		    TimeslotNumber_LCR_r4 timeslotNumber, 
		    HS_ChannelisationCode_LCR channelisation_Code, 
		    MidambleAllocationMode midambleAllocationMode, 
		    INTEGER midambleConfiguration)
    {
	setEi(ei);
	setTimeslotNumber(timeslotNumber);
	setChannelisation_Code(channelisation_Code);
	setMidambleAllocationMode(midambleAllocationMode);
	setMidambleConfiguration(midambleConfiguration);
    }
    
    /**
     * Construct with components.
     */
    public E_HICH_Information_LCR(long ei, 
		    TimeslotNumber_LCR_r4 timeslotNumber, 
		    HS_ChannelisationCode_LCR channelisation_Code, 
		    MidambleAllocationMode midambleAllocationMode, 
		    long midambleConfiguration)
    {
	this(new INTEGER(ei), timeslotNumber, channelisation_Code, 
	     midambleAllocationMode, new INTEGER(midambleConfiguration));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new TimeslotNumber_LCR_r4();
	mComponents[2] = HS_ChannelisationCode_LCR.cc16_1;
	mComponents[3] = new MidambleAllocationMode();
	mComponents[4] = new INTEGER();
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
		return new TimeslotNumber_LCR_r4();
	    case 2:
		return HS_ChannelisationCode_LCR.cc16_1;
	    case 3:
		return new MidambleAllocationMode();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ei"
    public long getEi()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setEi(long ei)
    {
	setEi(new INTEGER(ei));
    }
    
    public void setEi(INTEGER ei)
    {
	mComponents[0] = ei;
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber_LCR_r4 getTimeslotNumber()
    {
	return (TimeslotNumber_LCR_r4)mComponents[1];
    }
    
    public void setTimeslotNumber(TimeslotNumber_LCR_r4 timeslotNumber)
    {
	mComponents[1] = timeslotNumber;
    }
    
    
    // Methods for field "channelisation_Code"
    public HS_ChannelisationCode_LCR getChannelisation_Code()
    {
	return (HS_ChannelisationCode_LCR)mComponents[2];
    }
    
    public void setChannelisation_Code(HS_ChannelisationCode_LCR channelisation_Code)
    {
	mComponents[2] = channelisation_Code;
    }
    
    
    // Methods for field "midambleAllocationMode"
    public MidambleAllocationMode getMidambleAllocationMode()
    {
	return (MidambleAllocationMode)mComponents[3];
    }
    
    public void setMidambleAllocationMode(MidambleAllocationMode midambleAllocationMode)
    {
	mComponents[3] = midambleAllocationMode;
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
	public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(long ueSpecificMidamble)
	{
	    return createMidambleAllocationModeWithUeSpecificMidamble(new INTEGER(ueSpecificMidamble));
	}
	
	public static MidambleAllocationMode createMidambleAllocationModeWithUeSpecificMidamble(INTEGER ueSpecificMidamble)
	{
	    MidambleAllocationMode __object = new MidambleAllocationMode();

	    __object.setUeSpecificMidamble(ueSpecificMidamble);
	    return __object;
	}
	
	public boolean hasUeSpecificMidamble()
	{
	    return getChosenFlag() == ueSpecificMidamble_chosen;
	}
	
	public void setUeSpecificMidamble(long ueSpecificMidamble)
	{
	    setUeSpecificMidamble(new INTEGER(ueSpecificMidamble));
	}
	
	public void setUeSpecificMidamble(INTEGER ueSpecificMidamble)
	{
	    setChosenValue(ueSpecificMidamble);
	    setChosenFlag(ueSpecificMidamble_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case defaultMidamble_chosen:
		    return new Null();
		case ueSpecificMidamble_chosen:
		    return new INTEGER();
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_HICH_Information_LCR$MidambleAllocationMode"
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
					new com.oss.asn1.INTEGER(15),
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
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setMidambleConfiguration(long midambleConfiguration)
    {
	setMidambleConfiguration(new INTEGER(midambleConfiguration));
    }
    
    public void setMidambleConfiguration(INTEGER midambleConfiguration)
    {
	mComponents[4] = midambleConfiguration;
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
	    "E_HICH_Information_LCR"
	),
	new QName (
	    "InformationElements",
	    "E-HICH-Information-LCR"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(3),
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
		    "ei",
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
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "channelisation-Code",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_HICH_Information_LCR$MidambleAllocationMode"
			)
		    ),
		    "midambleAllocationMode",
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
     * Get the type descriptor (TypeInfo) of 'this' E_HICH_Information_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_HICH_Information_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_HICH_Information_LCR
