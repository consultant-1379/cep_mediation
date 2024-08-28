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
 * Define the ASN1 Type TDD_PRACH_CCodeList from ASN1 Module InformationElements.
 * @see Choice
 */

public class TDD_PRACH_CCodeList extends Choice {
    
    /**
     * The default constructor.
     */
    public TDD_PRACH_CCodeList()
    {
    }
    
    public static final  int  sf8_chosen = 1;
    public static final  int  sf16_chosen = 2;
    
    // Methods for field "sf8"
    public static TDD_PRACH_CCodeList createTDD_PRACH_CCodeListWithSf8(Sf8 sf8)
    {
	TDD_PRACH_CCodeList __object = new TDD_PRACH_CCodeList();

	__object.setSf8(sf8);
	return __object;
    }
    
    public boolean hasSf8()
    {
	return getChosenFlag() == sf8_chosen;
    }
    
    public void setSf8(Sf8 sf8)
    {
	setChosenValue(sf8);
	setChosenFlag(sf8_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Sf8 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Sf8 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Sf8()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Sf8(TDD_PRACH_CCode8[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TDD_PRACH_CCode8 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TDD_PRACH_CCode8 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TDD_PRACH_CCode8 get(int atIndex)
	{
	    return (TDD_PRACH_CCode8)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TDD_PRACH_CCode8 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TDD_PRACH_CCode8 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return TDD_PRACH_CCode8.cc8_1;
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
		"TDD_PRACH_CCodeList$Sf8"
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
		    "TDD_PRACH_CCode8"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Sf8 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sf8 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sf8

    // Methods for field "sf16"
    public static TDD_PRACH_CCodeList createTDD_PRACH_CCodeListWithSf16(Sf16 sf16)
    {
	TDD_PRACH_CCodeList __object = new TDD_PRACH_CCodeList();

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
	public Sf16(TDD_PRACH_CCode16[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TDD_PRACH_CCode16 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TDD_PRACH_CCode16 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TDD_PRACH_CCode16 get(int atIndex)
	{
	    return (TDD_PRACH_CCode16)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TDD_PRACH_CCode16 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TDD_PRACH_CCode16 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return TDD_PRACH_CCode16.cc16_1;
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
		"TDD_PRACH_CCodeList$Sf16"
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
		    "TDD_PRACH_CCode16"
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
	    case sf8_chosen:
		return new Sf8();
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
	    "TDD_PRACH_CCodeList"
	),
	new QName (
	    "InformationElements",
	    "TDD-PRACH-CCodeList"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TDD_PRACH_CCodeList$Sf8"
			)
		    ),
		    "sf8",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TDD_PRACH_CCodeList$Sf16"
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
     * Get the type descriptor (TypeInfo) of 'this' TDD_PRACH_CCodeList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TDD_PRACH_CCodeList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TDD_PRACH_CCodeList
