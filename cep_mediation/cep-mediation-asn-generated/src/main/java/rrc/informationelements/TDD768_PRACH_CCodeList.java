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
 * Define the ASN1 Type TDD768_PRACH_CCodeList from ASN1 Module InformationElements.
 * @see Choice
 */

public class TDD768_PRACH_CCodeList extends Choice {
    
    /**
     * The default constructor.
     */
    public TDD768_PRACH_CCodeList()
    {
    }
    
    public static final  int  sf32_chosen = 1;
    public static final  int  sf16_chosen = 2;
    
    // Methods for field "sf32"
    public static TDD768_PRACH_CCodeList createTDD768_PRACH_CCodeListWithSf32(Sf32 sf32)
    {
	TDD768_PRACH_CCodeList __object = new TDD768_PRACH_CCodeList();

	__object.setSf32(sf32);
	return __object;
    }
    
    public boolean hasSf32()
    {
	return getChosenFlag() == sf32_chosen;
    }
    
    public void setSf32(Sf32 sf32)
    {
	setChosenValue(sf32);
	setChosenFlag(sf32_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Sf32 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Sf32 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Sf32()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Sf32(TDD768_PRACH_CCode32[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TDD768_PRACH_CCode32 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TDD768_PRACH_CCode32 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TDD768_PRACH_CCode32 get(int atIndex)
	{
	    return (TDD768_PRACH_CCode32)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TDD768_PRACH_CCode32 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TDD768_PRACH_CCode32 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return TDD768_PRACH_CCode32.cc32_1;
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"TDD768_PRACH_CCodeList$Sf32"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(16),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(16)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TDD768_PRACH_CCode32"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sf32 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sf32 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sf32

    // Methods for field "sf16"
    public static TDD768_PRACH_CCodeList createTDD768_PRACH_CCodeListWithSf16(Sf16 sf16)
    {
	TDD768_PRACH_CCodeList __object = new TDD768_PRACH_CCodeList();

	__object.setSf16(sf16);
	return __object;
    }
    
    public boolean hasSf16()
    {
	return getChosenFlag() == sf16_chosen;
    }
    
    public void setSf16(Sf16 sf16)
    {
	setChosenValue(sf16);
	setChosenFlag(sf16_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Sf16 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Sf16 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Sf16()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Sf16(TDD768_PRACH_CCode16[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TDD768_PRACH_CCode16 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TDD768_PRACH_CCode16 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TDD768_PRACH_CCode16 get(int atIndex)
	{
	    return (TDD768_PRACH_CCode16)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TDD768_PRACH_CCode16 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TDD768_PRACH_CCode16 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return TDD768_PRACH_CCode16.cc16_1;
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"TDD768_PRACH_CCodeList$Sf16"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(16),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(16)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TDD768_PRACH_CCode16"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sf16 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sf16 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sf16

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sf32_chosen:
		return new Sf32();
	    case sf16_chosen:
		return new Sf16();
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
	    "TDD768_PRACH_CCodeList"
	),
	new QName (
	    "InformationElements",
	    "TDD768-PRACH-CCodeList"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TDD768_PRACH_CCodeList$Sf32"
			)
		    ),
		    "sf32",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TDD768_PRACH_CCodeList$Sf16"
			)
		    ),
		    "sf16",
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
     * Get the type descriptor (TypeInfo) of 'this' TDD768_PRACH_CCodeList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TDD768_PRACH_CCodeList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TDD768_PRACH_CCodeList
