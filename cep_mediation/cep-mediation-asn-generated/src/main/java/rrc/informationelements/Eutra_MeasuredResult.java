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
 * Define the ASN1 Type Eutra_MeasuredResult from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Eutra_MeasuredResult extends Sequence {
    
    /**
     * The default constructor.
     */
    public Eutra_MeasuredResult()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Eutra_MeasuredResult(EARFCN earfcn, 
		    MeasuredEUTRACells measuredEUTRACells)
    {
	setEarfcn(earfcn);
	setMeasuredEUTRACells(measuredEUTRACells);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EARFCN();
	mComponents[1] = new MeasuredEUTRACells();
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
		return new EARFCN();
	    case 1:
		return new MeasuredEUTRACells();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "earfcn"
    public EARFCN getEarfcn()
    {
	return (EARFCN)mComponents[0];
    }
    
    public void setEarfcn(EARFCN earfcn)
    {
	mComponents[0] = earfcn;
    }
    
    
    // Methods for field "measuredEUTRACells"
    public MeasuredEUTRACells getMeasuredEUTRACells()
    {
	return (MeasuredEUTRACells)mComponents[1];
    }
    
    public void setMeasuredEUTRACells(MeasuredEUTRACells measuredEUTRACells)
    {
	mComponents[1] = measuredEUTRACells;
    }
    
    
    
    /**
     * Define the ASN1 Type MeasuredEUTRACells from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class MeasuredEUTRACells extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public MeasuredEUTRACells()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public MeasuredEUTRACells(EUTRA_MeasuredCells[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(EUTRA_MeasuredCells element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(EUTRA_MeasuredCells element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized EUTRA_MeasuredCells get(int atIndex)
	{
	    return (EUTRA_MeasuredCells)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(EUTRA_MeasuredCells element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(EUTRA_MeasuredCells element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new EUTRA_MeasuredCells();
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
		"Eutra_MeasuredResult$MeasuredEUTRACells"
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
		    "EUTRA_MeasuredCells"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MeasuredEUTRACells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MeasuredEUTRACells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MeasuredEUTRACells

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
	    "Eutra_MeasuredResult"
	),
	new QName (
	    "InformationElements",
	    "Eutra-MeasuredResult"
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
				"EARFCN"
			    ),
			    new QName (
				"InformationElements",
				"EARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new EARFCN(0), 
				    new EARFCN(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "earfcn",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Eutra_MeasuredResult$MeasuredEUTRACells"
			)
		    ),
		    "measuredEUTRACells",
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
     * Get the type descriptor (TypeInfo) of 'this' Eutra_MeasuredResult object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Eutra_MeasuredResult object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Eutra_MeasuredResult
