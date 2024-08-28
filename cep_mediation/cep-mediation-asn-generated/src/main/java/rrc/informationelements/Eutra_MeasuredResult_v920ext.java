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
 * Define the ASN1 Type Eutra_MeasuredResult_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Eutra_MeasuredResult_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public Eutra_MeasuredResult_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Eutra_MeasuredResult_v920ext(MeasuredEUTRACells_v920ext measuredEUTRACells_v920ext)
    {
	setMeasuredEUTRACells_v920ext(measuredEUTRACells_v920ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MeasuredEUTRACells_v920ext();
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
		return new MeasuredEUTRACells_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measuredEUTRACells_v920ext"
    public MeasuredEUTRACells_v920ext getMeasuredEUTRACells_v920ext()
    {
	return (MeasuredEUTRACells_v920ext)mComponents[0];
    }
    
    public void setMeasuredEUTRACells_v920ext(MeasuredEUTRACells_v920ext measuredEUTRACells_v920ext)
    {
	mComponents[0] = measuredEUTRACells_v920ext;
    }
    
    
    
    /**
     * Define the ASN1 Type MeasuredEUTRACells_v920ext from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class MeasuredEUTRACells_v920ext extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public MeasuredEUTRACells_v920ext()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public MeasuredEUTRACells_v920ext(EUTRA_MeasuredCells_v920ext[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(EUTRA_MeasuredCells_v920ext element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(EUTRA_MeasuredCells_v920ext element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized EUTRA_MeasuredCells_v920ext get(int atIndex)
	{
	    return (EUTRA_MeasuredCells_v920ext)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(EUTRA_MeasuredCells_v920ext element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(EUTRA_MeasuredCells_v920ext element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new EUTRA_MeasuredCells_v920ext();
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
		"Eutra_MeasuredResult_v920ext$MeasuredEUTRACells_v920ext"
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
		    "EUTRA_MeasuredCells_v920ext"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MeasuredEUTRACells_v920ext object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MeasuredEUTRACells_v920ext object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MeasuredEUTRACells_v920ext

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
	    "Eutra_MeasuredResult_v920ext"
	),
	new QName (
	    "InformationElements",
	    "Eutra-MeasuredResult-v920ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Eutra_MeasuredResult_v920ext$MeasuredEUTRACells_v920ext"
			)
		    ),
		    "measuredEUTRACells-v920ext",
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
     * Get the type descriptor (TypeInfo) of 'this' Eutra_MeasuredResult_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Eutra_MeasuredResult_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Eutra_MeasuredResult_v920ext
