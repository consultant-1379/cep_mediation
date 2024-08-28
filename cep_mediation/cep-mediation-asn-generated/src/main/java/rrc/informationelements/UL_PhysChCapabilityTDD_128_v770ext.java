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
 * Define the ASN1 Type UL_PhysChCapabilityTDD_128_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityTDD_128_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityTDD_128_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityTDD_128_v770ext(MaxPhysChPerTimeslot_LCR_r7 maxPhysChPerTimeslot, 
		    Tdd128_edch tdd128_edch)
    {
	setMaxPhysChPerTimeslot(maxPhysChPerTimeslot);
	setTdd128_edch(tdd128_edch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxPhysChPerTimeslot_LCR_r7();
	mComponents[1] = new Tdd128_edch();
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
		return new MaxPhysChPerTimeslot_LCR_r7();
	    case 1:
		return new Tdd128_edch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxPhysChPerTimeslot"
    public MaxPhysChPerTimeslot_LCR_r7 getMaxPhysChPerTimeslot()
    {
	return (MaxPhysChPerTimeslot_LCR_r7)mComponents[0];
    }
    
    public void setMaxPhysChPerTimeslot(MaxPhysChPerTimeslot_LCR_r7 maxPhysChPerTimeslot)
    {
	mComponents[0] = maxPhysChPerTimeslot;
    }
    
    
    // Methods for field "tdd128_edch"
    public Tdd128_edch getTdd128_edch()
    {
	return (Tdd128_edch)mComponents[1];
    }
    
    public void setTdd128_edch(Tdd128_edch tdd128_edch)
    {
	mComponents[1] = tdd128_edch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_edch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd128_edch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_edch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd128_edch createTdd128_edchWithSupported(Supported supported)
	{
	    Tdd128_edch __object = new Tdd128_edch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(Supported supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Supported from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Supported extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Supported()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Supported(INTEGER tdd_edch_PhysicalLayerCategory)
	    {
		setTdd_edch_PhysicalLayerCategory(tdd_edch_PhysicalLayerCategory);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Supported(long tdd_edch_PhysicalLayerCategory)
	    {
		this(new INTEGER(tdd_edch_PhysicalLayerCategory));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
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
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tdd_edch_PhysicalLayerCategory"
	    public long getTdd_edch_PhysicalLayerCategory()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setTdd_edch_PhysicalLayerCategory(long tdd_edch_PhysicalLayerCategory)
	    {
		setTdd_edch_PhysicalLayerCategory(new INTEGER(tdd_edch_PhysicalLayerCategory));
	    }
	    
	    public void setTdd_edch_PhysicalLayerCategory(INTEGER tdd_edch_PhysicalLayerCategory)
	    {
		mComponents[0] = tdd_edch_PhysicalLayerCategory;
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
		    "UL_PhysChCapabilityTDD_128_v770ext$Tdd128_edch$Supported"
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
					    new com.oss.asn1.INTEGER(6),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(6)
				    ),
				    null
				)
			    ),
			    "tdd-edch-PhysicalLayerCategory",
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
	     * Get the type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Supported

	// Methods for field "unsupported"
	public static Tdd128_edch createTdd128_edchWithUnsupported(Null unsupported)
	{
	    Tdd128_edch __object = new Tdd128_edch();

	    __object.setUnsupported(unsupported);
	    return __object;
	}
	
	public boolean hasUnsupported()
	{
	    return getChosenFlag() == unsupported_chosen;
	}
	
	public void setUnsupported(Null unsupported)
	{
	    setChosenValue(unsupported);
	    setChosenFlag(unsupported_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case supported_chosen:
		    return new Supported();
		case unsupported_chosen:
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_PhysChCapabilityTDD_128_v770ext$Tdd128_edch"
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
				"UL_PhysChCapabilityTDD_128_v770ext$Tdd128_edch$Supported"
			    )
			),
			"supported",
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
			"unsupported",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_edch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_edch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_edch

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
	    "UL_PhysChCapabilityTDD_128_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityTDD-128-v770ext"
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
				"MaxPhysChPerTimeslot_LCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTimeslot-LCR-r7"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerTimeslot_LCR_r7(1), 
				    new MaxPhysChPerTimeslot_LCR_r7(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerTimeslot",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_PhysChCapabilityTDD_128_v770ext$Tdd128_edch"
			)
		    ),
		    "tdd128-edch",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityTDD_128_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityTDD_128_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityTDD_128_v770ext
