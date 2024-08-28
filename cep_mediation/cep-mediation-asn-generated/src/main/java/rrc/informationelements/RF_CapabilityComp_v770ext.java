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
 * Define the ASN1 Type RF_CapabilityComp_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RF_CapabilityComp_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public RF_CapabilityComp_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RF_CapabilityComp_v770ext(RadioFrequencyBandTDDList_r7 tdd384_RF_Capability, 
		    Tdd768_RF_Capability tdd768_RF_Capability, 
		    RadioFrequencyBandTDDList_r7 tdd128_RF_Capability)
    {
	setTdd384_RF_Capability(tdd384_RF_Capability);
	setTdd768_RF_Capability(tdd768_RF_Capability);
	setTdd128_RF_Capability(tdd128_RF_Capability);
    }
    
    /**
     * Construct with required components.
     */
    public RF_CapabilityComp_v770ext(Tdd768_RF_Capability tdd768_RF_Capability)
    {
	setTdd768_RF_Capability(tdd768_RF_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = RadioFrequencyBandTDDList_r7.a;
	mComponents[1] = new Tdd768_RF_Capability();
	mComponents[2] = RadioFrequencyBandTDDList_r7.a;
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
		return RadioFrequencyBandTDDList_r7.a;
	    case 1:
		return new Tdd768_RF_Capability();
	    case 2:
		return RadioFrequencyBandTDDList_r7.a;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd384_RF_Capability"
    public RadioFrequencyBandTDDList_r7 getTdd384_RF_Capability()
    {
	return (RadioFrequencyBandTDDList_r7)mComponents[0];
    }
    
    public void setTdd384_RF_Capability(RadioFrequencyBandTDDList_r7 tdd384_RF_Capability)
    {
	mComponents[0] = tdd384_RF_Capability;
    }
    
    public boolean hasTdd384_RF_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd384_RF_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "tdd768_RF_Capability"
    public Tdd768_RF_Capability getTdd768_RF_Capability()
    {
	return (Tdd768_RF_Capability)mComponents[1];
    }
    
    public void setTdd768_RF_Capability(Tdd768_RF_Capability tdd768_RF_Capability)
    {
	mComponents[1] = tdd768_RF_Capability;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd768_RF_Capability from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd768_RF_Capability extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd768_RF_Capability()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static Tdd768_RF_Capability createTdd768_RF_CapabilityWithNotSupported(Null notSupported)
	{
	    Tdd768_RF_Capability __object = new Tdd768_RF_Capability();

	    __object.setNotSupported(notSupported);
	    return __object;
	}
	
	public boolean hasNotSupported()
	{
	    return getChosenFlag() == notSupported_chosen;
	}
	
	public void setNotSupported(Null notSupported)
	{
	    setChosenValue(notSupported);
	    setChosenFlag(notSupported_chosen);
	}
	
	
	// Methods for field "supported"
	public static Tdd768_RF_Capability createTdd768_RF_CapabilityWithSupported(RadioFrequencyBandTDDList_r7 supported)
	{
	    Tdd768_RF_Capability __object = new Tdd768_RF_Capability();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(RadioFrequencyBandTDDList_r7 supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case notSupported_chosen:
		    return new Null();
		case supported_chosen:
		    return RadioFrequencyBandTDDList_r7.a;
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"RF_CapabilityComp_v770ext$Tdd768_RF_Capability"
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
			"notSupported",
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
				    "RadioFrequencyBandTDDList_r7"
				),
				new QName (
				    "InformationElements",
				    "RadioFrequencyBandTDDList-r7"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "a",
					    0
					),
					new MemberListElement (
					    "b",
					    1
					),
					new MemberListElement (
					    "c",
					    2
					),
					new MemberListElement (
					    "d",
					    3
					),
					new MemberListElement (
					    "ab",
					    4
					),
					new MemberListElement (
					    "ac",
					    5
					),
					new MemberListElement (
					    "ad",
					    6
					),
					new MemberListElement (
					    "bc",
					    7
					),
					new MemberListElement (
					    "bd",
					    8
					),
					new MemberListElement (
					    "cd",
					    9
					),
					new MemberListElement (
					    "abc",
					    10
					),
					new MemberListElement (
					    "abd",
					    11
					),
					new MemberListElement (
					    "acd",
					    12
					),
					new MemberListElement (
					    "bcd",
					    13
					),
					new MemberListElement (
					    "abcd",
					    14
					),
					new MemberListElement (
					    "notabcd",
					    15
					)
				    }
				),
				0,
				RadioFrequencyBandTDDList_r7.a
			    )
			),
			"supported",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd768_RF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd768_RF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd768_RF_Capability

    // Methods for field "tdd128_RF_Capability"
    public RadioFrequencyBandTDDList_r7 getTdd128_RF_Capability()
    {
	return (RadioFrequencyBandTDDList_r7)mComponents[2];
    }
    
    public void setTdd128_RF_Capability(RadioFrequencyBandTDDList_r7 tdd128_RF_Capability)
    {
	mComponents[2] = tdd128_RF_Capability;
    }
    
    public boolean hasTdd128_RF_Capability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd128_RF_Capability()
    {
	setComponentAbsent(2);
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
	    "RF_CapabilityComp_v770ext"
	),
	new QName (
	    "InformationElements",
	    "RF-CapabilityComp-v770ext"
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
				"RadioFrequencyBandTDDList_r7"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDList-r7"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"a",
					0
				    ),
				    new MemberListElement (
					"b",
					1
				    ),
				    new MemberListElement (
					"c",
					2
				    ),
				    new MemberListElement (
					"d",
					3
				    ),
				    new MemberListElement (
					"ab",
					4
				    ),
				    new MemberListElement (
					"ac",
					5
				    ),
				    new MemberListElement (
					"ad",
					6
				    ),
				    new MemberListElement (
					"bc",
					7
				    ),
				    new MemberListElement (
					"bd",
					8
				    ),
				    new MemberListElement (
					"cd",
					9
				    ),
				    new MemberListElement (
					"abc",
					10
				    ),
				    new MemberListElement (
					"abd",
					11
				    ),
				    new MemberListElement (
					"acd",
					12
				    ),
				    new MemberListElement (
					"bcd",
					13
				    ),
				    new MemberListElement (
					"abcd",
					14
				    ),
				    new MemberListElement (
					"notabcd",
					15
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandTDDList_r7.a
			)
		    ),
		    "tdd384-RF-Capability",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_CapabilityComp_v770ext$Tdd768_RF_Capability"
			)
		    ),
		    "tdd768-RF-Capability",
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
				"RadioFrequencyBandTDDList_r7"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandTDDList-r7"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"a",
					0
				    ),
				    new MemberListElement (
					"b",
					1
				    ),
				    new MemberListElement (
					"c",
					2
				    ),
				    new MemberListElement (
					"d",
					3
				    ),
				    new MemberListElement (
					"ab",
					4
				    ),
				    new MemberListElement (
					"ac",
					5
				    ),
				    new MemberListElement (
					"ad",
					6
				    ),
				    new MemberListElement (
					"bc",
					7
				    ),
				    new MemberListElement (
					"bd",
					8
				    ),
				    new MemberListElement (
					"cd",
					9
				    ),
				    new MemberListElement (
					"abc",
					10
				    ),
				    new MemberListElement (
					"abd",
					11
				    ),
				    new MemberListElement (
					"acd",
					12
				    ),
				    new MemberListElement (
					"bcd",
					13
				    ),
				    new MemberListElement (
					"abcd",
					14
				    ),
				    new MemberListElement (
					"notabcd",
					15
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandTDDList_r7.a
			)
		    ),
		    "tdd128-RF-Capability",
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RF_CapabilityComp_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RF_CapabilityComp_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RF_CapabilityComp_v770ext
