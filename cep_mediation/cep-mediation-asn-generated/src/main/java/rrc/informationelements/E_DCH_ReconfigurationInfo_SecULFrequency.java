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
 * Define the ASN1 Type E_DCH_ReconfigurationInfo_SecULFrequency from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_ReconfigurationInfo_SecULFrequency extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_ReconfigurationInfo_SecULFrequency()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_ReconfigurationInfo_SecULFrequency(E_DCH_RL_InfoNewSecServingCell e_DCH_RL_InfoNewSecServingCell, 
		    E_DCH_RL_InfoOtherCellList_SecULFreq e_DCH_RL_InfoOtherCellList_SecULFreq)
    {
	setE_DCH_RL_InfoNewSecServingCell(e_DCH_RL_InfoNewSecServingCell);
	setE_DCH_RL_InfoOtherCellList_SecULFreq(e_DCH_RL_InfoOtherCellList_SecULFreq);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DCH_RL_InfoNewSecServingCell();
	mComponents[1] = new E_DCH_RL_InfoOtherCellList_SecULFreq();
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
		return new E_DCH_RL_InfoNewSecServingCell();
	    case 1:
		return new E_DCH_RL_InfoOtherCellList_SecULFreq();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_DCH_RL_InfoNewSecServingCell"
    public E_DCH_RL_InfoNewSecServingCell getE_DCH_RL_InfoNewSecServingCell()
    {
	return (E_DCH_RL_InfoNewSecServingCell)mComponents[0];
    }
    
    public void setE_DCH_RL_InfoNewSecServingCell(E_DCH_RL_InfoNewSecServingCell e_DCH_RL_InfoNewSecServingCell)
    {
	mComponents[0] = e_DCH_RL_InfoNewSecServingCell;
    }
    
    public boolean hasE_DCH_RL_InfoNewSecServingCell()
    {
	return componentIsPresent(0);
    }
    
    public void deleteE_DCH_RL_InfoNewSecServingCell()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "e_DCH_RL_InfoOtherCellList_SecULFreq"
    public E_DCH_RL_InfoOtherCellList_SecULFreq getE_DCH_RL_InfoOtherCellList_SecULFreq()
    {
	return (E_DCH_RL_InfoOtherCellList_SecULFreq)mComponents[1];
    }
    
    public void setE_DCH_RL_InfoOtherCellList_SecULFreq(E_DCH_RL_InfoOtherCellList_SecULFreq e_DCH_RL_InfoOtherCellList_SecULFreq)
    {
	mComponents[1] = e_DCH_RL_InfoOtherCellList_SecULFreq;
    }
    
    public boolean hasE_DCH_RL_InfoOtherCellList_SecULFreq()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_DCH_RL_InfoOtherCellList_SecULFreq()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type E_DCH_RL_InfoOtherCellList_SecULFreq from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class E_DCH_RL_InfoOtherCellList_SecULFreq extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public E_DCH_RL_InfoOtherCellList_SecULFreq()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public E_DCH_RL_InfoOtherCellList_SecULFreq(E_DCH_RL_InfoOtherCell_SecULFreq[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(E_DCH_RL_InfoOtherCell_SecULFreq element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(E_DCH_RL_InfoOtherCell_SecULFreq element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized E_DCH_RL_InfoOtherCell_SecULFreq get(int atIndex)
	{
	    return (E_DCH_RL_InfoOtherCell_SecULFreq)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(E_DCH_RL_InfoOtherCell_SecULFreq element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(E_DCH_RL_InfoOtherCell_SecULFreq element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new E_DCH_RL_InfoOtherCell_SecULFreq();
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
		"E_DCH_ReconfigurationInfo_SecULFrequency$E_DCH_RL_InfoOtherCellList_SecULFreq"
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
		    "E_DCH_RL_InfoOtherCell_SecULFreq"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoOtherCellList_SecULFreq object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoOtherCellList_SecULFreq object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_DCH_RL_InfoOtherCellList_SecULFreq

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
	    "E_DCH_ReconfigurationInfo_SecULFrequency"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-ReconfigurationInfo-SecULFrequency"
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
				"E_DCH_RL_InfoNewSecServingCell"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-RL-InfoNewSecServingCell"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoNewSecServingCell"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoNewSecServingCell"
				)
			    ),
			    0
			)
		    ),
		    "e-DCH-RL-InfoNewSecServingCell",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_ReconfigurationInfo_SecULFrequency$E_DCH_RL_InfoOtherCellList_SecULFreq"
			)
		    ),
		    "e-DCH-RL-InfoOtherCellList-SecULFreq",
		    1,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_ReconfigurationInfo_SecULFrequency object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_ReconfigurationInfo_SecULFrequency object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_ReconfigurationInfo_SecULFrequency
