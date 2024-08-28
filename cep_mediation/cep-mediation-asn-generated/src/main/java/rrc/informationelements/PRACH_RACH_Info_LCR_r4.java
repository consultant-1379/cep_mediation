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
 * Define the ASN1 Type PRACH_RACH_Info_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PRACH_RACH_Info_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PRACH_RACH_Info_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PRACH_RACH_Info_LCR_r4(SYNC_UL_Info_r4 sync_UL_Info, 
		    Prach_DefinitionList prach_DefinitionList)
    {
	setSync_UL_Info(sync_UL_Info);
	setPrach_DefinitionList(prach_DefinitionList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SYNC_UL_Info_r4();
	mComponents[1] = new Prach_DefinitionList();
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
		return new SYNC_UL_Info_r4();
	    case 1:
		return new Prach_DefinitionList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sync_UL_Info"
    public SYNC_UL_Info_r4 getSync_UL_Info()
    {
	return (SYNC_UL_Info_r4)mComponents[0];
    }
    
    public void setSync_UL_Info(SYNC_UL_Info_r4 sync_UL_Info)
    {
	mComponents[0] = sync_UL_Info;
    }
    
    
    // Methods for field "prach_DefinitionList"
    public Prach_DefinitionList getPrach_DefinitionList()
    {
	return (Prach_DefinitionList)mComponents[1];
    }
    
    public void setPrach_DefinitionList(Prach_DefinitionList prach_DefinitionList)
    {
	mComponents[1] = prach_DefinitionList;
    }
    
    
    
    /**
     * Define the ASN1 Type Prach_DefinitionList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Prach_DefinitionList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Prach_DefinitionList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Prach_DefinitionList(PRACH_Definition_LCR_r4[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PRACH_Definition_LCR_r4 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PRACH_Definition_LCR_r4 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PRACH_Definition_LCR_r4 get(int atIndex)
	{
	    return (PRACH_Definition_LCR_r4)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PRACH_Definition_LCR_r4 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PRACH_Definition_LCR_r4 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PRACH_Definition_LCR_r4();
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
		"PRACH_RACH_Info_LCR_r4$Prach_DefinitionList"
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
		    "PRACH_Definition_LCR_r4"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Prach_DefinitionList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Prach_DefinitionList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Prach_DefinitionList

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
	    "PRACH_RACH_Info_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PRACH-RACH-Info-LCR-r4"
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
				"SYNC_UL_Info_r4"
			    ),
			    new QName (
				"InformationElements",
				"SYNC-UL-Info-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SYNC_UL_Info_r4"
				)
			    ),
			    0
			)
		    ),
		    "sync-UL-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PRACH_RACH_Info_LCR_r4$Prach_DefinitionList"
			)
		    ),
		    "prach-DefinitionList",
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
     * Get the type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PRACH_RACH_Info_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PRACH_RACH_Info_LCR_r4
