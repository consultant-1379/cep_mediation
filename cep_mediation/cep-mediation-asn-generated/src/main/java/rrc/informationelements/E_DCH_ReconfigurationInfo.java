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
 * Define the ASN1 Type E_DCH_ReconfigurationInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_ReconfigurationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_ReconfigurationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_ReconfigurationInfo(E_DCH_RL_InfoNewServingCell e_DCH_RL_InfoNewServingCell, 
		    E_DCH_RL_InfoOtherCellList e_DCH_RL_InfoOtherCellList)
    {
	setE_DCH_RL_InfoNewServingCell(e_DCH_RL_InfoNewServingCell);
	setE_DCH_RL_InfoOtherCellList(e_DCH_RL_InfoOtherCellList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_DCH_RL_InfoNewServingCell();
	mComponents[1] = new E_DCH_RL_InfoOtherCellList();
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
		return new E_DCH_RL_InfoNewServingCell();
	    case 1:
		return new E_DCH_RL_InfoOtherCellList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_DCH_RL_InfoNewServingCell"
    public E_DCH_RL_InfoNewServingCell getE_DCH_RL_InfoNewServingCell()
    {
	return (E_DCH_RL_InfoNewServingCell)mComponents[0];
    }
    
    public void setE_DCH_RL_InfoNewServingCell(E_DCH_RL_InfoNewServingCell e_DCH_RL_InfoNewServingCell)
    {
	mComponents[0] = e_DCH_RL_InfoNewServingCell;
    }
    
    public boolean hasE_DCH_RL_InfoNewServingCell()
    {
	return componentIsPresent(0);
    }
    
    public void deleteE_DCH_RL_InfoNewServingCell()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "e_DCH_RL_InfoOtherCellList"
    public E_DCH_RL_InfoOtherCellList getE_DCH_RL_InfoOtherCellList()
    {
	return (E_DCH_RL_InfoOtherCellList)mComponents[1];
    }
    
    public void setE_DCH_RL_InfoOtherCellList(E_DCH_RL_InfoOtherCellList e_DCH_RL_InfoOtherCellList)
    {
	mComponents[1] = e_DCH_RL_InfoOtherCellList;
    }
    
    public boolean hasE_DCH_RL_InfoOtherCellList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_DCH_RL_InfoOtherCellList()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type E_DCH_RL_InfoOtherCellList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class E_DCH_RL_InfoOtherCellList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public E_DCH_RL_InfoOtherCellList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public E_DCH_RL_InfoOtherCellList(E_DCH_RL_InfoOtherCell[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(E_DCH_RL_InfoOtherCell element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(E_DCH_RL_InfoOtherCell element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized E_DCH_RL_InfoOtherCell get(int atIndex)
	{
	    return (E_DCH_RL_InfoOtherCell)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(E_DCH_RL_InfoOtherCell element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(E_DCH_RL_InfoOtherCell element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new E_DCH_RL_InfoOtherCell();
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
		"E_DCH_ReconfigurationInfo$E_DCH_RL_InfoOtherCellList"
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
		    "E_DCH_RL_InfoOtherCell"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoOtherCellList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoOtherCellList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_DCH_RL_InfoOtherCellList

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
	    "E_DCH_ReconfigurationInfo"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-ReconfigurationInfo"
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
				"E_DCH_RL_InfoNewServingCell"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-RL-InfoNewServingCell"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoNewServingCell"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DCH_RL_InfoNewServingCell"
				)
			    ),
			    0
			)
		    ),
		    "e-DCH-RL-InfoNewServingCell",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_ReconfigurationInfo$E_DCH_RL_InfoOtherCellList"
			)
		    ),
		    "e-DCH-RL-InfoOtherCellList",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_ReconfigurationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_ReconfigurationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_ReconfigurationInfo
