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
 * Define the ASN1 Type TimeslotInfoList_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class TimeslotInfoList_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public TimeslotInfoList_r4()
    {
    }
    
    public static final  int  tdd384_chosen = 1;
    public static final  int  tdd128_chosen = 2;
    
    // Methods for field "tdd384"
    public static TimeslotInfoList_r4 createTimeslotInfoList_r4WithTdd384(Tdd384 tdd384)
    {
	TimeslotInfoList_r4 __object = new TimeslotInfoList_r4();

	__object.setTdd384(tdd384);
	return __object;
    }
    
    public boolean hasTdd384()
    {
	return getChosenFlag() == tdd384_chosen;
    }
    
    public void setTdd384(Tdd384 tdd384)
    {
	setChosenValue(tdd384);
	setChosenFlag(tdd384_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Tdd384 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Tdd384()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tdd384(TimeslotInfo[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TimeslotInfo element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TimeslotInfo element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TimeslotInfo get(int atIndex)
	{
	    return (TimeslotInfo)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TimeslotInfo element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TimeslotInfo element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TimeslotInfo();
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
		"TimeslotInfoList_r4$Tdd384"
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
			new com.oss.asn1.INTEGER(14),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(14)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TimeslotInfo"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384

    // Methods for field "tdd128"
    public static TimeslotInfoList_r4 createTimeslotInfoList_r4WithTdd128(Tdd128 tdd128)
    {
	TimeslotInfoList_r4 __object = new TimeslotInfoList_r4();

	__object.setTdd128(tdd128);
	return __object;
    }
    
    public boolean hasTdd128()
    {
	return getChosenFlag() == tdd128_chosen;
    }
    
    public void setTdd128(Tdd128 tdd128)
    {
	setChosenValue(tdd128);
	setChosenFlag(tdd128_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Tdd128 extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Tdd128()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tdd128(TimeslotInfo_LCR_r4[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TimeslotInfo_LCR_r4 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TimeslotInfo_LCR_r4 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TimeslotInfo_LCR_r4 get(int atIndex)
	{
	    return (TimeslotInfo_LCR_r4)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TimeslotInfo_LCR_r4 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TimeslotInfo_LCR_r4 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TimeslotInfo_LCR_r4();
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
		"TimeslotInfoList_r4$Tdd128"
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
			new com.oss.asn1.INTEGER(6),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(6)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TimeslotInfo_LCR_r4"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case tdd384_chosen:
		return new Tdd384();
	    case tdd128_chosen:
		return new Tdd128();
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
	    "TimeslotInfoList_r4"
	),
	new QName (
	    "InformationElements",
	    "TimeslotInfoList-r4"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TimeslotInfoList_r4$Tdd384"
			)
		    ),
		    "tdd384",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TimeslotInfoList_r4$Tdd128"
			)
		    ),
		    "tdd128",
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
     * Get the type descriptor (TypeInfo) of 'this' TimeslotInfoList_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeslotInfoList_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeslotInfoList_r4
