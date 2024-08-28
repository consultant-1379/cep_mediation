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
 * Define the ASN1 Type RemovedInterFreqCellList from ASN1 Module InformationElements.
 * @see Choice
 */

public class RemovedInterFreqCellList extends Choice {
    
    /**
     * The default constructor.
     */
    public RemovedInterFreqCellList()
    {
    }
    
    public static final  int  removeAllInterFreqCells_chosen = 1;
    public static final  int  removeSomeInterFreqCells_chosen = 2;
    public static final  int  removeNoInterFreqCells_chosen = 3;
    
    // Methods for field "removeAllInterFreqCells"
    public static RemovedInterFreqCellList createRemovedInterFreqCellListWithRemoveAllInterFreqCells(Null removeAllInterFreqCells)
    {
	RemovedInterFreqCellList __object = new RemovedInterFreqCellList();

	__object.setRemoveAllInterFreqCells(removeAllInterFreqCells);
	return __object;
    }
    
    public boolean hasRemoveAllInterFreqCells()
    {
	return getChosenFlag() == removeAllInterFreqCells_chosen;
    }
    
    public void setRemoveAllInterFreqCells(Null removeAllInterFreqCells)
    {
	setChosenValue(removeAllInterFreqCells);
	setChosenFlag(removeAllInterFreqCells_chosen);
    }
    
    
    // Methods for field "removeSomeInterFreqCells"
    public static RemovedInterFreqCellList createRemovedInterFreqCellListWithRemoveSomeInterFreqCells(RemoveSomeInterFreqCells removeSomeInterFreqCells)
    {
	RemovedInterFreqCellList __object = new RemovedInterFreqCellList();

	__object.setRemoveSomeInterFreqCells(removeSomeInterFreqCells);
	return __object;
    }
    
    public boolean hasRemoveSomeInterFreqCells()
    {
	return getChosenFlag() == removeSomeInterFreqCells_chosen;
    }
    
    public void setRemoveSomeInterFreqCells(RemoveSomeInterFreqCells removeSomeInterFreqCells)
    {
	setChosenValue(removeSomeInterFreqCells);
	setChosenFlag(removeSomeInterFreqCells_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RemoveSomeInterFreqCells from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class RemoveSomeInterFreqCells extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public RemoveSomeInterFreqCells()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public RemoveSomeInterFreqCells(InterFreqCellID[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(InterFreqCellID element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(InterFreqCellID element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized InterFreqCellID get(int atIndex)
	{
	    return (InterFreqCellID)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(InterFreqCellID element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(InterFreqCellID element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new InterFreqCellID();
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
		"RemovedInterFreqCellList$RemoveSomeInterFreqCells"
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
		    "InterFreqCellID"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RemoveSomeInterFreqCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RemoveSomeInterFreqCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RemoveSomeInterFreqCells

    // Methods for field "removeNoInterFreqCells"
    public static RemovedInterFreqCellList createRemovedInterFreqCellListWithRemoveNoInterFreqCells(Null removeNoInterFreqCells)
    {
	RemovedInterFreqCellList __object = new RemovedInterFreqCellList();

	__object.setRemoveNoInterFreqCells(removeNoInterFreqCells);
	return __object;
    }
    
    public boolean hasRemoveNoInterFreqCells()
    {
	return getChosenFlag() == removeNoInterFreqCells_chosen;
    }
    
    public void setRemoveNoInterFreqCells(Null removeNoInterFreqCells)
    {
	setChosenValue(removeNoInterFreqCells);
	setChosenFlag(removeNoInterFreqCells_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case removeAllInterFreqCells_chosen:
		return new Null();
	    case removeSomeInterFreqCells_chosen:
		return new RemoveSomeInterFreqCells();
	    case removeNoInterFreqCells_chosen:
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
	    "RemovedInterFreqCellList"
	),
	new QName (
	    "InformationElements",
	    "RemovedInterFreqCellList"
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
		    "removeAllInterFreqCells",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RemovedInterFreqCellList$RemoveSomeInterFreqCells"
			)
		    ),
		    "removeSomeInterFreqCells",
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
		    "removeNoInterFreqCells",
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
     * Get the type descriptor (TypeInfo) of 'this' RemovedInterFreqCellList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemovedInterFreqCellList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemovedInterFreqCellList
