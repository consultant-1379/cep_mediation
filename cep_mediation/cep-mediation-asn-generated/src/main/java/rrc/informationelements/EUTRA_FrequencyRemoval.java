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
 * Define the ASN1 Type EUTRA_FrequencyRemoval from ASN1 Module InformationElements.
 * @see Choice
 */

public class EUTRA_FrequencyRemoval extends Choice {
    
    /**
     * The default constructor.
     */
    public EUTRA_FrequencyRemoval()
    {
    }
    
    public static final  int  removeAllFrequencies_chosen = 1;
    public static final  int  removeSomeFrequencies_chosen = 2;
    public static final  int  removeNoFrequencies_chosen = 3;
    
    // Methods for field "removeAllFrequencies"
    public static EUTRA_FrequencyRemoval createEUTRA_FrequencyRemovalWithRemoveAllFrequencies(Null removeAllFrequencies)
    {
	EUTRA_FrequencyRemoval __object = new EUTRA_FrequencyRemoval();

	__object.setRemoveAllFrequencies(removeAllFrequencies);
	return __object;
    }
    
    public boolean hasRemoveAllFrequencies()
    {
	return getChosenFlag() == removeAllFrequencies_chosen;
    }
    
    public void setRemoveAllFrequencies(Null removeAllFrequencies)
    {
	setChosenValue(removeAllFrequencies);
	setChosenFlag(removeAllFrequencies_chosen);
    }
    
    
    // Methods for field "removeSomeFrequencies"
    public static EUTRA_FrequencyRemoval createEUTRA_FrequencyRemovalWithRemoveSomeFrequencies(RemoveSomeFrequencies removeSomeFrequencies)
    {
	EUTRA_FrequencyRemoval __object = new EUTRA_FrequencyRemoval();

	__object.setRemoveSomeFrequencies(removeSomeFrequencies);
	return __object;
    }
    
    public boolean hasRemoveSomeFrequencies()
    {
	return getChosenFlag() == removeSomeFrequencies_chosen;
    }
    
    public void setRemoveSomeFrequencies(RemoveSomeFrequencies removeSomeFrequencies)
    {
	setChosenValue(removeSomeFrequencies);
	setChosenFlag(removeSomeFrequencies_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type RemoveSomeFrequencies from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class RemoveSomeFrequencies extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public RemoveSomeFrequencies()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public RemoveSomeFrequencies(EARFCN[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(EARFCN element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(EARFCN element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized EARFCN get(int atIndex)
	{
	    return (EARFCN)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(EARFCN element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(EARFCN element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new EARFCN();
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
		"EUTRA_FrequencyRemoval$RemoveSomeFrequencies"
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
		    "EARFCN"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RemoveSomeFrequencies object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RemoveSomeFrequencies object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RemoveSomeFrequencies

    // Methods for field "removeNoFrequencies"
    public static EUTRA_FrequencyRemoval createEUTRA_FrequencyRemovalWithRemoveNoFrequencies(Null removeNoFrequencies)
    {
	EUTRA_FrequencyRemoval __object = new EUTRA_FrequencyRemoval();

	__object.setRemoveNoFrequencies(removeNoFrequencies);
	return __object;
    }
    
    public boolean hasRemoveNoFrequencies()
    {
	return getChosenFlag() == removeNoFrequencies_chosen;
    }
    
    public void setRemoveNoFrequencies(Null removeNoFrequencies)
    {
	setChosenValue(removeNoFrequencies);
	setChosenFlag(removeNoFrequencies_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case removeAllFrequencies_chosen:
		return new Null();
	    case removeSomeFrequencies_chosen:
		return new RemoveSomeFrequencies();
	    case removeNoFrequencies_chosen:
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
	    "EUTRA_FrequencyRemoval"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-FrequencyRemoval"
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
		    "removeAllFrequencies",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "EUTRA_FrequencyRemoval$RemoveSomeFrequencies"
			)
		    ),
		    "removeSomeFrequencies",
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
		    "removeNoFrequencies",
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_FrequencyRemoval object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_FrequencyRemoval object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_FrequencyRemoval
