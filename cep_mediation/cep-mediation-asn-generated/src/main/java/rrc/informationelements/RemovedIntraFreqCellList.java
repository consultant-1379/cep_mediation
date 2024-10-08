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
 * Define the ASN1 Type RemovedIntraFreqCellList from ASN1 Module InformationElements.
 * @see Choice
 */

public class RemovedIntraFreqCellList extends Choice {
    
    /**
     * The default constructor.
     */
    public RemovedIntraFreqCellList()
    {
    }
    
    public static final  int  removeAllIntraFreqCells_chosen = 1;
    public static final  int  removeSomeIntraFreqCells_chosen = 2;
    public static final  int  removeNoIntraFreqCells_chosen = 3;
    
    // Methods for field "removeAllIntraFreqCells"
    public static RemovedIntraFreqCellList createRemovedIntraFreqCellListWithRemoveAllIntraFreqCells(Null removeAllIntraFreqCells)
    {
	RemovedIntraFreqCellList __object = new RemovedIntraFreqCellList();

	__object.setRemoveAllIntraFreqCells(removeAllIntraFreqCells);
	return __object;
    }
    
    public boolean hasRemoveAllIntraFreqCells()
    {
	return getChosenFlag() == removeAllIntraFreqCells_chosen;
    }
    
    public void setRemoveAllIntraFreqCells(Null removeAllIntraFreqCells)
    {
	setChosenValue(removeAllIntraFreqCells);
	setChosenFlag(removeAllIntraFreqCells_chosen);
    }
    
    
    // Methods for field "removeSomeIntraFreqCells"
    public static RemovedIntraFreqCellList createRemovedIntraFreqCellListWithRemoveSomeIntraFreqCells(RemoveSomeIntraFreqCells removeSomeIntraFreqCells)
    {
	RemovedIntraFreqCellList __object = new RemovedIntraFreqCellList();

	__object.setRemoveSomeIntraFreqCells(removeSomeIntraFreqCells);
	return __object;
    }
    
    public boolean hasRemoveSomeIntraFreqCells()
    {
	return getChosenFlag() == removeSomeIntraFreqCells_chosen;
    }
    
    public void setRemoveSomeIntraFreqCells(RemoveSomeIntraFreqCells removeSomeIntraFreqCells)
    {
	setChosenValue(removeSomeIntraFreqCells);
	setChosenFlag(removeSomeIntraFreqCells_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RemoveSomeIntraFreqCells from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class RemoveSomeIntraFreqCells extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public RemoveSomeIntraFreqCells()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public RemoveSomeIntraFreqCells(IntraFreqCellID[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(IntraFreqCellID element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(IntraFreqCellID element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized IntraFreqCellID get(int atIndex)
	{
	    return (IntraFreqCellID)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(IntraFreqCellID element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(IntraFreqCellID element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new IntraFreqCellID();
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
		"RemovedIntraFreqCellList$RemoveSomeIntraFreqCells"
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
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "IntraFreqCellID"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RemoveSomeIntraFreqCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RemoveSomeIntraFreqCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RemoveSomeIntraFreqCells

    // Methods for field "removeNoIntraFreqCells"
    public static RemovedIntraFreqCellList createRemovedIntraFreqCellListWithRemoveNoIntraFreqCells(Null removeNoIntraFreqCells)
    {
	RemovedIntraFreqCellList __object = new RemovedIntraFreqCellList();

	__object.setRemoveNoIntraFreqCells(removeNoIntraFreqCells);
	return __object;
    }
    
    public boolean hasRemoveNoIntraFreqCells()
    {
	return getChosenFlag() == removeNoIntraFreqCells_chosen;
    }
    
    public void setRemoveNoIntraFreqCells(Null removeNoIntraFreqCells)
    {
	setChosenValue(removeNoIntraFreqCells);
	setChosenFlag(removeNoIntraFreqCells_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case removeAllIntraFreqCells_chosen:
		return new Null();
	    case removeSomeIntraFreqCells_chosen:
		return new RemoveSomeIntraFreqCells();
	    case removeNoIntraFreqCells_chosen:
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "RemovedIntraFreqCellList"
	),
	new QName (
	    "InformationElements",
	    "RemovedIntraFreqCellList"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "removeAllIntraFreqCells",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RemovedIntraFreqCellList$RemoveSomeIntraFreqCells"
			)
		    ),
		    "removeSomeIntraFreqCells",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "removeNoIntraFreqCells",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemovedIntraFreqCellList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemovedIntraFreqCellList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemovedIntraFreqCellList
