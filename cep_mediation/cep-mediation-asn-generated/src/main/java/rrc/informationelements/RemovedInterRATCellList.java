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
 * Define the ASN1 Type RemovedInterRATCellList from ASN1 Module InformationElements.
 * @see Choice
 */

public class RemovedInterRATCellList extends Choice {
    
    /**
     * The default constructor.
     */
    public RemovedInterRATCellList()
    {
    }
    
    public static final  int  removeAllInterRATCells_chosen = 1;
    public static final  int  removeSomeInterRATCells_chosen = 2;
    public static final  int  removeNoInterRATCells_chosen = 3;
    
    // Methods for field "removeAllInterRATCells"
    public static RemovedInterRATCellList createRemovedInterRATCellListWithRemoveAllInterRATCells(Null removeAllInterRATCells)
    {
	RemovedInterRATCellList __object = new RemovedInterRATCellList();

	__object.setRemoveAllInterRATCells(removeAllInterRATCells);
	return __object;
    }
    
    public boolean hasRemoveAllInterRATCells()
    {
	return getChosenFlag() == removeAllInterRATCells_chosen;
    }
    
    public void setRemoveAllInterRATCells(Null removeAllInterRATCells)
    {
	setChosenValue(removeAllInterRATCells);
	setChosenFlag(removeAllInterRATCells_chosen);
    }
    
    
    // Methods for field "removeSomeInterRATCells"
    public static RemovedInterRATCellList createRemovedInterRATCellListWithRemoveSomeInterRATCells(RemoveSomeInterRATCells removeSomeInterRATCells)
    {
	RemovedInterRATCellList __object = new RemovedInterRATCellList();

	__object.setRemoveSomeInterRATCells(removeSomeInterRATCells);
	return __object;
    }
    
    public boolean hasRemoveSomeInterRATCells()
    {
	return getChosenFlag() == removeSomeInterRATCells_chosen;
    }
    
    public void setRemoveSomeInterRATCells(RemoveSomeInterRATCells removeSomeInterRATCells)
    {
	setChosenValue(removeSomeInterRATCells);
	setChosenFlag(removeSomeInterRATCells_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RemoveSomeInterRATCells from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class RemoveSomeInterRATCells extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public RemoveSomeInterRATCells()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public RemoveSomeInterRATCells(InterRATCellID[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(InterRATCellID element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(InterRATCellID element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized InterRATCellID get(int atIndex)
	{
	    return (InterRATCellID)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(InterRATCellID element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(InterRATCellID element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new InterRATCellID();
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
		"RemovedInterRATCellList$RemoveSomeInterRATCells"
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
		    "InterRATCellID"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RemoveSomeInterRATCells object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RemoveSomeInterRATCells object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RemoveSomeInterRATCells

    // Methods for field "removeNoInterRATCells"
    public static RemovedInterRATCellList createRemovedInterRATCellListWithRemoveNoInterRATCells(Null removeNoInterRATCells)
    {
	RemovedInterRATCellList __object = new RemovedInterRATCellList();

	__object.setRemoveNoInterRATCells(removeNoInterRATCells);
	return __object;
    }
    
    public boolean hasRemoveNoInterRATCells()
    {
	return getChosenFlag() == removeNoInterRATCells_chosen;
    }
    
    public void setRemoveNoInterRATCells(Null removeNoInterRATCells)
    {
	setChosenValue(removeNoInterRATCells);
	setChosenFlag(removeNoInterRATCells_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case removeAllInterRATCells_chosen:
		return new Null();
	    case removeSomeInterRATCells_chosen:
		return new RemoveSomeInterRATCells();
	    case removeNoInterRATCells_chosen:
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
	    "RemovedInterRATCellList"
	),
	new QName (
	    "InformationElements",
	    "RemovedInterRATCellList"
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
		    "removeAllInterRATCells",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RemovedInterRATCellList$RemoveSomeInterRATCells"
			)
		    ),
		    "removeSomeInterRATCells",
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
		    "removeNoInterRATCells",
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
     * Get the type descriptor (TypeInfo) of 'this' RemovedInterRATCellList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemovedInterRATCellList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemovedInterRATCellList
