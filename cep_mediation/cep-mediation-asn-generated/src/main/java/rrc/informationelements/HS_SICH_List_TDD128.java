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
 * Define the ASN1 Type HS_SICH_List_TDD128 from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class HS_SICH_List_TDD128 extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public HS_SICH_List_TDD128()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public HS_SICH_List_TDD128(Choice_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Choice_ from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Choice_ extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Choice_()
	{
	}
	
	public static final  int  implicit_chosen = 1;
	public static final  int  explicit_chosen = 2;
	
	// Methods for field "implicit"
	public static Choice_ createChoice_WithImplicit(Implicit implicit)
	{
	    Choice_ __object = new Choice_();

	    __object.setImplicit(implicit);
	    return __object;
	}
	
	public boolean hasImplicit()
	{
	    return getChosenFlag() == implicit_chosen;
	}
	
	public void setImplicit(Implicit implicit)
	{
	    setChosenValue(implicit);
	    setChosenFlag(implicit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Implicit from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Implicit extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Implicit()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Implicit(INTEGER hS_SCCH_Index)
	    {
		setHS_SCCH_Index(hS_SCCH_Index);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Implicit(long hS_SCCH_Index)
	    {
		this(new INTEGER(hS_SCCH_Index));
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
	    
	    
	    // Methods for field "hS_SCCH_Index"
	    public long getHS_SCCH_Index()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setHS_SCCH_Index(long hS_SCCH_Index)
	    {
		setHS_SCCH_Index(new INTEGER(hS_SCCH_Index));
	    }
	    
	    public void setHS_SCCH_Index(INTEGER hS_SCCH_Index)
	    {
		mComponents[0] = hS_SCCH_Index;
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
		    "HS_SICH_List_TDD128$Choice_$Implicit"
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
			    "hS-SCCH-Index",
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
	     * Get the type descriptor (TypeInfo) of 'this' Implicit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Implicit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Implicit

	// Methods for field "explicit"
	public static Choice_ createChoice_WithExplicit(Explicit explicit)
	{
	    Choice_ __object = new Choice_();

	    __object.setExplicit(explicit);
	    return __object;
	}
	
	public boolean hasExplicit()
	{
	    return getChosenFlag() == explicit_chosen;
	}
	
	public void setExplicit(Explicit explicit)
	{
	    setChosenValue(explicit);
	    setChosenFlag(explicit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Explicit from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Explicit extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Explicit()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Explicit(HS_SICH_Configuration_TDD128_r6 hS_SICH_Info)
	    {
		setHS_SICH_Info(hS_SICH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_SICH_Configuration_TDD128_r6();
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
			return new HS_SICH_Configuration_TDD128_r6();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hS_SICH_Info"
	    public HS_SICH_Configuration_TDD128_r6 getHS_SICH_Info()
	    {
		return (HS_SICH_Configuration_TDD128_r6)mComponents[0];
	    }
	    
	    public void setHS_SICH_Info(HS_SICH_Configuration_TDD128_r6 hS_SICH_Info)
	    {
		mComponents[0] = hS_SICH_Info;
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
		    "HS_SICH_List_TDD128$Choice_$Explicit"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"HS_SICH_Configuration_TDD128_r6"
				    ),
				    new QName (
					"InformationElements",
					"HS-SICH-Configuration-TDD128-r6"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_SICH_Configuration_TDD128_r6"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_SICH_Configuration_TDD128_r6"
					)
				    ),
				    0
				)
			    ),
			    "hS-SICH-Info",
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
	     * Get the type descriptor (TypeInfo) of 'this' Explicit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Explicit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Explicit

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case implicit_chosen:
		    return new Implicit();
		case explicit_chosen:
		    return new Explicit();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		null
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SICH_List_TDD128$Choice_"
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
				"HS_SICH_List_TDD128$Choice_$Implicit"
			    )
			),
			"implicit",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_SICH_List_TDD128$Choice_$Explicit"
			    )
			),
			"explicit",
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
	 * Get the type descriptor (TypeInfo) of 'this' Choice_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Choice_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Choice_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Choice_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Choice_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Choice_ get(int atIndex)
    {
	return (Choice_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Choice_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Choice_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Choice_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "HS_SICH_List_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-SICH-List-TDD128"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(4),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(4)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"HS_SICH_List_TDD128$Choice_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SICH_List_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SICH_List_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SICH_List_TDD128
