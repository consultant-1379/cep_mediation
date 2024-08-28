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
 * Define the ASN1 Type DL_TS_ChannelisationCodesShort_VHCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_TS_ChannelisationCodesShort_VHCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_TS_ChannelisationCodesShort_VHCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_TS_ChannelisationCodesShort_VHCR(CodesRepresentation codesRepresentation)
    {
	setCodesRepresentation(codesRepresentation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CodesRepresentation();
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
		return new CodesRepresentation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "codesRepresentation"
    public CodesRepresentation getCodesRepresentation()
    {
	return (CodesRepresentation)mComponents[0];
    }
    
    public void setCodesRepresentation(CodesRepresentation codesRepresentation)
    {
	mComponents[0] = codesRepresentation;
    }
    
    
    
    /**
     * Define the ASN1 Type CodesRepresentation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CodesRepresentation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CodesRepresentation()
	{
	}
	
	public static final  int  consecutive_chosen = 1;
	public static final  int  bitmap_chosen = 2;
	
	// Methods for field "consecutive"
	public static CodesRepresentation createCodesRepresentationWithConsecutive(Consecutive consecutive)
	{
	    CodesRepresentation __object = new CodesRepresentation();

	    __object.setConsecutive(consecutive);
	    return __object;
	}
	
	public boolean hasConsecutive()
	{
	    return getChosenFlag() == consecutive_chosen;
	}
	
	public void setConsecutive(Consecutive consecutive)
	{
	    setChosenValue(consecutive);
	    setChosenFlag(consecutive_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Consecutive from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Consecutive extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Consecutive()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Consecutive(DL_TS_ChannelisationCode_VHCR firstChannelisationCode, 
			    DL_TS_ChannelisationCode_VHCR lastChannelisationCode)
	    {
		setFirstChannelisationCode(firstChannelisationCode);
		setLastChannelisationCode(lastChannelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = DL_TS_ChannelisationCode_VHCR.cc32_1;
		mComponents[1] = DL_TS_ChannelisationCode_VHCR.cc32_1;
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return DL_TS_ChannelisationCode_VHCR.cc32_1;
		    case 1:
			return DL_TS_ChannelisationCode_VHCR.cc32_1;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "firstChannelisationCode"
	    public DL_TS_ChannelisationCode_VHCR getFirstChannelisationCode()
	    {
		return (DL_TS_ChannelisationCode_VHCR)mComponents[0];
	    }
	    
	    public void setFirstChannelisationCode(DL_TS_ChannelisationCode_VHCR firstChannelisationCode)
	    {
		mComponents[0] = firstChannelisationCode;
	    }
	    
	    
	    // Methods for field "lastChannelisationCode"
	    public DL_TS_ChannelisationCode_VHCR getLastChannelisationCode()
	    {
		return (DL_TS_ChannelisationCode_VHCR)mComponents[1];
	    }
	    
	    public void setLastChannelisationCode(DL_TS_ChannelisationCode_VHCR lastChannelisationCode)
	    {
		mComponents[1] = lastChannelisationCode;
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
		    "DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation$Consecutive"
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
			    "firstChannelisationCode",
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
			    "lastChannelisationCode",
			    1,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Consecutive object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Consecutive object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Consecutive

	// Methods for field "bitmap"
	public static CodesRepresentation createCodesRepresentationWithBitmap(Bitmap bitmap)
	{
	    CodesRepresentation __object = new CodesRepresentation();

	    __object.setBitmap(bitmap);
	    return __object;
	}
	
	public boolean hasBitmap()
	{
	    return getChosenFlag() == bitmap_chosen;
	}
	
	public void setBitmap(Bitmap bitmap)
	{
	    setChosenValue(bitmap);
	    setChosenFlag(bitmap_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Bitmap from ASN1 Module InformationElements.
	 * @see BitString
	 */
	public static class Bitmap extends BitString {
	    
	    /**
	     * The default constructor.
	     */
	    public Bitmap()
	    {
	    }
	    
	    /**
	     * Construct Bit String from a byte array.
	     * All bits considered significant.
	     * @param value the byte array to set this object to.
	     */
	    public Bitmap(byte[] value)
	    {
		super(value);
	    }
	    
	    
	    /**
	     * Construct Bit String from a byte array and significant bits.
	     * @param value the byte array to set this object to.
	     * @param sigBits the number of significant bits.
	     */
	    public Bitmap(byte[] value, int sigBits)
	    {
		super(value, sigBits);
	    }
	    
	    // Named list definitions.
	    public static final int chCode32_SF32 = 0;
	    public static final int chCode31_SF32 = 1;
	    public static final int chCode30_SF32 = 2;
	    public static final int chCode29_SF32 = 3;
	    public static final int chCode28_SF32 = 4;
	    public static final int chCode27_SF32 = 5;
	    public static final int chCode26_SF32 = 6;
	    public static final int chCode25_SF32 = 7;
	    public static final int chCode24_SF32 = 8;
	    public static final int chCode23_SF32 = 9;
	    public static final int chCode22_SF32 = 10;
	    public static final int chCode21_SF32 = 11;
	    public static final int chCode20_SF32 = 12;
	    public static final int chCode19_SF32 = 13;
	    public static final int chCode18_SF32 = 14;
	    public static final int chCode17_SF32 = 15;
	    public static final int chCode16_SF32 = 16;
	    public static final int chCode15_SF32 = 17;
	    public static final int chCode14_SF32 = 18;
	    public static final int chCode13_SF32 = 19;
	    public static final int chCode12_SF32 = 20;
	    public static final int chCode11_SF32 = 21;
	    public static final int chCode10_SF32 = 22;
	    public static final int chCode9_SF32 = 23;
	    public static final int chCode8_SF32 = 24;
	    public static final int chCode7_SF32 = 25;
	    public static final int chCode6_SF32 = 26;
	    public static final int chCode5_SF32 = 27;
	    public static final int chCode4_SF32 = 28;
	    public static final int chCode3_SF32 = 29;
	    public static final int chCode2_SF32 = 30;
	    public static final int chCode1_SF32 = 31;
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final BitStringInfo c_typeinfo = new BitStringInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation$Bitmap"
		),
		new QName (
		    "builtin",
		    "BIT STRING"
		),
		12314,
		new SizeConstraint (
		    new SingleValueConstraint (
			new com.oss.asn1.INTEGER(32)
		    )
		),
		new Bounds (
		    new java.lang.Long(32),
		    new java.lang.Long(32)
		),
		new MemberList (
		    new MemberListElement[] {
			new MemberListElement (
			    "chCode32-SF32",
			    0
			),
			new MemberListElement (
			    "chCode31-SF32",
			    1
			),
			new MemberListElement (
			    "chCode30-SF32",
			    2
			),
			new MemberListElement (
			    "chCode29-SF32",
			    3
			),
			new MemberListElement (
			    "chCode28-SF32",
			    4
			),
			new MemberListElement (
			    "chCode27-SF32",
			    5
			),
			new MemberListElement (
			    "chCode26-SF32",
			    6
			),
			new MemberListElement (
			    "chCode25-SF32",
			    7
			),
			new MemberListElement (
			    "chCode24-SF32",
			    8
			),
			new MemberListElement (
			    "chCode23-SF32",
			    9
			),
			new MemberListElement (
			    "chCode22-SF32",
			    10
			),
			new MemberListElement (
			    "chCode21-SF32",
			    11
			),
			new MemberListElement (
			    "chCode20-SF32",
			    12
			),
			new MemberListElement (
			    "chCode19-SF32",
			    13
			),
			new MemberListElement (
			    "chCode18-SF32",
			    14
			),
			new MemberListElement (
			    "chCode17-SF32",
			    15
			),
			new MemberListElement (
			    "chCode16-SF32",
			    16
			),
			new MemberListElement (
			    "chCode15-SF32",
			    17
			),
			new MemberListElement (
			    "chCode14-SF32",
			    18
			),
			new MemberListElement (
			    "chCode13-SF32",
			    19
			),
			new MemberListElement (
			    "chCode12-SF32",
			    20
			),
			new MemberListElement (
			    "chCode11-SF32",
			    21
			),
			new MemberListElement (
			    "chCode10-SF32",
			    22
			),
			new MemberListElement (
			    "chCode9-SF32",
			    23
			),
			new MemberListElement (
			    "chCode8-SF32",
			    24
			),
			new MemberListElement (
			    "chCode7-SF32",
			    25
			),
			new MemberListElement (
			    "chCode6-SF32",
			    26
			),
			new MemberListElement (
			    "chCode5-SF32",
			    27
			),
			new MemberListElement (
			    "chCode4-SF32",
			    28
			),
			new MemberListElement (
			    "chCode3-SF32",
			    29
			),
			new MemberListElement (
			    "chCode2-SF32",
			    30
			),
			new MemberListElement (
			    "chCode1-SF32",
			    31
			)
		    }
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Bitmap object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Bitmap object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Bitmap

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case consecutive_chosen:
		    return new Consecutive();
		case bitmap_chosen:
		    return new Bitmap();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation"
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
				"DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation$Consecutive"
			    )
			),
			"consecutive",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation$Bitmap"
			    )
			),
			"bitmap",
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
	 * Get the type descriptor (TypeInfo) of 'this' CodesRepresentation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CodesRepresentation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CodesRepresentation

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
	    "DL_TS_ChannelisationCodesShort_VHCR"
	),
	new QName (
	    "InformationElements",
	    "DL-TS-ChannelisationCodesShort-VHCR"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_TS_ChannelisationCodesShort_VHCR$CodesRepresentation"
			)
		    ),
		    "codesRepresentation",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_TS_ChannelisationCodesShort_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_TS_ChannelisationCodesShort_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_TS_ChannelisationCodesShort_VHCR
