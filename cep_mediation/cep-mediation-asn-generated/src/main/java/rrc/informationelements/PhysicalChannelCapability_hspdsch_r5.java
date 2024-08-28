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
 * Define the ASN1 Type PhysicalChannelCapability_hspdsch_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PhysicalChannelCapability_hspdsch_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapability_hspdsch_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapability_hspdsch_r5(Fdd_hspdsch fdd_hspdsch, 
		    Tdd384_hspdsch tdd384_hspdsch, 
		    Tdd128_hspdsch tdd128_hspdsch)
    {
	setFdd_hspdsch(fdd_hspdsch);
	setTdd384_hspdsch(tdd384_hspdsch);
	setTdd128_hspdsch(tdd128_hspdsch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Fdd_hspdsch();
	mComponents[1] = new Tdd384_hspdsch();
	mComponents[2] = new Tdd128_hspdsch();
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
		return new Fdd_hspdsch();
	    case 1:
		return new Tdd384_hspdsch();
	    case 2:
		return new Tdd128_hspdsch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fdd_hspdsch"
    public Fdd_hspdsch getFdd_hspdsch()
    {
	return (Fdd_hspdsch)mComponents[0];
    }
    
    public void setFdd_hspdsch(Fdd_hspdsch fdd_hspdsch)
    {
	mComponents[0] = fdd_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Fdd_hspdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Fdd_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Fdd_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Fdd_hspdsch createFdd_hspdschWithSupported(Supported supported)
	{
	    Fdd_hspdsch __object = new Fdd_hspdsch();

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
	    public Supported(HSDSCH_physical_layer_category hsdsch_physical_layer_category, 
			    BOOLEAN dummy, BOOLEAN dummy2)
	    {
		setHsdsch_physical_layer_category(hsdsch_physical_layer_category);
		setDummy(dummy);
		setDummy2(dummy2);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Supported(HSDSCH_physical_layer_category hsdsch_physical_layer_category, 
			    boolean dummy, boolean dummy2)
	    {
		this(hsdsch_physical_layer_category, new BOOLEAN(dummy), 
		     new BOOLEAN(dummy2));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HSDSCH_physical_layer_category();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new BOOLEAN();
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
			return new HSDSCH_physical_layer_category();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hsdsch_physical_layer_category"
	    public HSDSCH_physical_layer_category getHsdsch_physical_layer_category()
	    {
		return (HSDSCH_physical_layer_category)mComponents[0];
	    }
	    
	    public void setHsdsch_physical_layer_category(HSDSCH_physical_layer_category hsdsch_physical_layer_category)
	    {
		mComponents[0] = hsdsch_physical_layer_category;
	    }
	    
	    
	    // Methods for field "dummy"
	    public boolean getDummy()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setDummy(boolean dummy)
	    {
		setDummy(new BOOLEAN(dummy));
	    }
	    
	    public void setDummy(BOOLEAN dummy)
	    {
		mComponents[1] = dummy;
	    }
	    
	    
	    // Methods for field "dummy2"
	    public boolean getDummy2()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setDummy2(boolean dummy2)
	    {
		setDummy2(new BOOLEAN(dummy2));
	    }
	    
	    public void setDummy2(BOOLEAN dummy2)
	    {
		mComponents[2] = dummy2;
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
		    "PhysicalChannelCapability_hspdsch_r5$Fdd_hspdsch$Supported"
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
					"HSDSCH_physical_layer_category"
				    ),
				    new QName (
					"InformationElements",
					"HSDSCH-physical-layer-category"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new HSDSCH_physical_layer_category(1), 
					    new HSDSCH_physical_layer_category(64),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(64)
				    ),
				    null
				)
			    ),
			    "hsdsch-physical-layer-category",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "dummy",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "dummy2",
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
	public static Fdd_hspdsch createFdd_hspdschWithUnsupported(Null unsupported)
	{
	    Fdd_hspdsch __object = new Fdd_hspdsch();

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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PhysicalChannelCapability_hspdsch_r5$Fdd_hspdsch"
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
				"PhysicalChannelCapability_hspdsch_r5$Fdd_hspdsch$Supported"
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
	 * Get the type descriptor (TypeInfo) of 'this' Fdd_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Fdd_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Fdd_hspdsch

    // Methods for field "tdd384_hspdsch"
    public Tdd384_hspdsch getTdd384_hspdsch()
    {
	return (Tdd384_hspdsch)mComponents[1];
    }
    
    public void setTdd384_hspdsch(Tdd384_hspdsch tdd384_hspdsch)
    {
	mComponents[1] = tdd384_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_hspdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd384_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd384_hspdsch createTdd384_hspdschWithSupported(long supported)
	{
	    return createTdd384_hspdschWithSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public static Tdd384_hspdsch createTdd384_hspdschWithSupported(HSDSCH_physical_layer_category supported)
	{
	    Tdd384_hspdsch __object = new Tdd384_hspdsch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(long supported)
	{
	    setSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public void setSupported(HSDSCH_physical_layer_category supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Methods for field "unsupported"
	public static Tdd384_hspdsch createTdd384_hspdschWithUnsupported(Null unsupported)
	{
	    Tdd384_hspdsch __object = new Tdd384_hspdsch();

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
		    return new HSDSCH_physical_layer_category();
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
		"PhysicalChannelCapability_hspdsch_r5$Tdd384_hspdsch"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "HSDSCH_physical_layer_category"
				),
				new QName (
				    "InformationElements",
				    "HSDSCH-physical-layer-category"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new HSDSCH_physical_layer_category(1), 
					new HSDSCH_physical_layer_category(64),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(64)
				),
				null
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_hspdsch

    // Methods for field "tdd128_hspdsch"
    public Tdd128_hspdsch getTdd128_hspdsch()
    {
	return (Tdd128_hspdsch)mComponents[2];
    }
    
    public void setTdd128_hspdsch(Tdd128_hspdsch tdd128_hspdsch)
    {
	mComponents[2] = tdd128_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_hspdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd128_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd128_hspdsch createTdd128_hspdschWithSupported(long supported)
	{
	    return createTdd128_hspdschWithSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public static Tdd128_hspdsch createTdd128_hspdschWithSupported(HSDSCH_physical_layer_category supported)
	{
	    Tdd128_hspdsch __object = new Tdd128_hspdsch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(long supported)
	{
	    setSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public void setSupported(HSDSCH_physical_layer_category supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Methods for field "unsupported"
	public static Tdd128_hspdsch createTdd128_hspdschWithUnsupported(Null unsupported)
	{
	    Tdd128_hspdsch __object = new Tdd128_hspdsch();

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
		    return new HSDSCH_physical_layer_category();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PhysicalChannelCapability_hspdsch_r5$Tdd128_hspdsch"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "HSDSCH_physical_layer_category"
				),
				new QName (
				    "InformationElements",
				    "HSDSCH-physical-layer-category"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new HSDSCH_physical_layer_category(1), 
					new HSDSCH_physical_layer_category(64),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(64)
				),
				null
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_hspdsch

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
	    "PhysicalChannelCapability_hspdsch_r5"
	),
	new QName (
	    "InformationElements",
	    "PhysicalChannelCapability-hspdsch-r5"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_hspdsch_r5$Fdd_hspdsch"
			)
		    ),
		    "fdd-hspdsch",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_hspdsch_r5$Tdd384_hspdsch"
			)
		    ),
		    "tdd384-hspdsch",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_hspdsch_r5$Tdd128_hspdsch"
			)
		    ),
		    "tdd128-hspdsch",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_hspdsch_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_hspdsch_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapability_hspdsch_r5
