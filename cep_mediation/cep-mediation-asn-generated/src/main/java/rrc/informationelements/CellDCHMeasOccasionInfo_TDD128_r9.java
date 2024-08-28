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
 * Define the ASN1 Type CellDCHMeasOccasionInfo_TDD128_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellDCHMeasOccasionInfo_TDD128_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellDCHMeasOccasionInfo_TDD128_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellDCHMeasOccasionInfo_TDD128_r9(CellDCHMeasOccasionSequenceList cellDCHMeasOccasionSequenceList)
    {
	setCellDCHMeasOccasionSequenceList(cellDCHMeasOccasionSequenceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CellDCHMeasOccasionSequenceList();
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
		return new CellDCHMeasOccasionSequenceList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellDCHMeasOccasionSequenceList"
    public CellDCHMeasOccasionSequenceList getCellDCHMeasOccasionSequenceList()
    {
	return (CellDCHMeasOccasionSequenceList)mComponents[0];
    }
    
    public void setCellDCHMeasOccasionSequenceList(CellDCHMeasOccasionSequenceList cellDCHMeasOccasionSequenceList)
    {
	mComponents[0] = cellDCHMeasOccasionSequenceList;
    }
    
    
    
    /**
     * Define the ASN1 Type CellDCHMeasOccasionSequenceList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class CellDCHMeasOccasionSequenceList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public CellDCHMeasOccasionSequenceList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public CellDCHMeasOccasionSequenceList(CellDCHMeasOccasionPattern_LCR[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CellDCHMeasOccasionPattern_LCR element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CellDCHMeasOccasionPattern_LCR element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CellDCHMeasOccasionPattern_LCR get(int atIndex)
	{
	    return (CellDCHMeasOccasionPattern_LCR)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CellDCHMeasOccasionPattern_LCR element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CellDCHMeasOccasionPattern_LCR element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CellDCHMeasOccasionPattern_LCR();
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
		"CellDCHMeasOccasionInfo_TDD128_r9$CellDCHMeasOccasionSequenceList"
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
			new com.oss.asn1.INTEGER(5),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(5)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "CellDCHMeasOccasionPattern_LCR"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionSequenceList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionSequenceList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CellDCHMeasOccasionSequenceList

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
	    "CellDCHMeasOccasionInfo_TDD128_r9"
	),
	new QName (
	    "InformationElements",
	    "CellDCHMeasOccasionInfo-TDD128-r9"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellDCHMeasOccasionInfo_TDD128_r9$CellDCHMeasOccasionSequenceList"
			)
		    ),
		    "cellDCHMeasOccasionSequenceList",
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
     * Get the type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionInfo_TDD128_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionInfo_TDD128_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellDCHMeasOccasionInfo_TDD128_r9
