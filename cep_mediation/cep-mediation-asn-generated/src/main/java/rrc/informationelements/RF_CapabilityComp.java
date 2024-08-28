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
 * Define the ASN1 Type RF_CapabilityComp from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RF_CapabilityComp extends Sequence {
    
    /**
     * The default constructor.
     */
    public RF_CapabilityComp()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RF_CapabilityComp(Fdd fdd, 
		    Tdd384_RF_Capability tdd384_RF_Capability, 
		    Tdd128_RF_Capability tdd128_RF_Capability)
    {
	setFdd(fdd);
	setTdd384_RF_Capability(tdd384_RF_Capability);
	setTdd128_RF_Capability(tdd128_RF_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Fdd();
	mComponents[1] = new Tdd384_RF_Capability();
	mComponents[2] = new Tdd128_RF_Capability();
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
		return new Fdd();
	    case 1:
		return new Tdd384_RF_Capability();
	    case 2:
		return new Tdd128_RF_Capability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fdd"
    public Fdd getFdd()
    {
	return (Fdd)mComponents[0];
    }
    
    public void setFdd(Fdd fdd)
    {
	mComponents[0] = fdd;
    }
    
    
    
    /**
     * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Fdd extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Fdd()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static Fdd createFddWithNotSupported(Null notSupported)
	{
	    Fdd __object = new Fdd();

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
	public static Fdd createFddWithSupported(RF_CapabBandListFDDComp supported)
	{
	    Fdd __object = new Fdd();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(RF_CapabBandListFDDComp supported)
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
		    return new RF_CapabBandListFDDComp();
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
		"RF_CapabilityComp$Fdd"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "RF_CapabBandListFDDComp"
				),
				new QName (
				    "InformationElements",
				    "RF-CapabBandListFDDComp"
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
					"RF_CapabBandFDDComp"
				    )
				)
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

    // Methods for field "tdd384_RF_Capability"
    public Tdd384_RF_Capability getTdd384_RF_Capability()
    {
	return (Tdd384_RF_Capability)mComponents[1];
    }
    
    public void setTdd384_RF_Capability(Tdd384_RF_Capability tdd384_RF_Capability)
    {
	mComponents[1] = tdd384_RF_Capability;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_RF_Capability from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd384_RF_Capability extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_RF_Capability()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static Tdd384_RF_Capability createTdd384_RF_CapabilityWithNotSupported(Null notSupported)
	{
	    Tdd384_RF_Capability __object = new Tdd384_RF_Capability();

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
	public static Tdd384_RF_Capability createTdd384_RF_CapabilityWithSupported(RadioFrequencyBandTDDList supported)
	{
	    Tdd384_RF_Capability __object = new Tdd384_RF_Capability();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(RadioFrequencyBandTDDList supported)
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
		    return RadioFrequencyBandTDDList.a;
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
		"RF_CapabilityComp$Tdd384_RF_Capability"
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
				    "RadioFrequencyBandTDDList"
				),
				new QName (
				    "InformationElements",
				    "RadioFrequencyBandTDDList"
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
					    "ab",
					    3
					),
					new MemberListElement (
					    "ac",
					    4
					),
					new MemberListElement (
					    "bc",
					    5
					),
					new MemberListElement (
					    "abc",
					    6
					),
					new MemberListElement (
					    "spare",
					    7
					)
				    }
				),
				0,
				RadioFrequencyBandTDDList.a
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_RF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_RF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_RF_Capability

    // Methods for field "tdd128_RF_Capability"
    public Tdd128_RF_Capability getTdd128_RF_Capability()
    {
	return (Tdd128_RF_Capability)mComponents[2];
    }
    
    public void setTdd128_RF_Capability(Tdd128_RF_Capability tdd128_RF_Capability)
    {
	mComponents[2] = tdd128_RF_Capability;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_RF_Capability from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd128_RF_Capability extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_RF_Capability()
	{
	}
	
	public static final  int  notSupported_chosen = 1;
	public static final  int  supported_chosen = 2;
	
	// Methods for field "notSupported"
	public static Tdd128_RF_Capability createTdd128_RF_CapabilityWithNotSupported(Null notSupported)
	{
	    Tdd128_RF_Capability __object = new Tdd128_RF_Capability();

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
	public static Tdd128_RF_Capability createTdd128_RF_CapabilityWithSupported(RadioFrequencyBandTDDList supported)
	{
	    Tdd128_RF_Capability __object = new Tdd128_RF_Capability();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(RadioFrequencyBandTDDList supported)
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
		    return RadioFrequencyBandTDDList.a;
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
		"RF_CapabilityComp$Tdd128_RF_Capability"
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
				    "RadioFrequencyBandTDDList"
				),
				new QName (
				    "InformationElements",
				    "RadioFrequencyBandTDDList"
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
					    "ab",
					    3
					),
					new MemberListElement (
					    "ac",
					    4
					),
					new MemberListElement (
					    "bc",
					    5
					),
					new MemberListElement (
					    "abc",
					    6
					),
					new MemberListElement (
					    "spare",
					    7
					)
				    }
				),
				0,
				RadioFrequencyBandTDDList.a
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_RF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_RF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_RF_Capability

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
	    "RF_CapabilityComp"
	),
	new QName (
	    "InformationElements",
	    "RF-CapabilityComp"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_CapabilityComp$Fdd"
			)
		    ),
		    "fdd",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_CapabilityComp$Tdd384_RF_Capability"
			)
		    ),
		    "tdd384-RF-Capability",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_CapabilityComp$Tdd128_RF_Capability"
			)
		    ),
		    "tdd128-RF-Capability",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RF_CapabilityComp object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RF_CapabilityComp object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RF_CapabilityComp
