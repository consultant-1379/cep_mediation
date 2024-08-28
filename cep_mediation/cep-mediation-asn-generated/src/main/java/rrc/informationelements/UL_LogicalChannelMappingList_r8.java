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
 * Define the ASN1 Type UL_LogicalChannelMappingList_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_LogicalChannelMappingList_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_LogicalChannelMappingList_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_LogicalChannelMappingList_r8(BOOLEAN rlc_LogicalChannelMappingIndicator, 
		    Ul_LogicalChannelMapping ul_LogicalChannelMapping)
    {
	setRlc_LogicalChannelMappingIndicator(rlc_LogicalChannelMappingIndicator);
	setUl_LogicalChannelMapping(ul_LogicalChannelMapping);
    }
    
    /**
     * Construct with components.
     */
    public UL_LogicalChannelMappingList_r8(boolean rlc_LogicalChannelMappingIndicator, 
		    Ul_LogicalChannelMapping ul_LogicalChannelMapping)
    {
	this(new BOOLEAN(rlc_LogicalChannelMappingIndicator), 
	     ul_LogicalChannelMapping);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new Ul_LogicalChannelMapping();
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
		return new BOOLEAN();
	    case 1:
		return new Ul_LogicalChannelMapping();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rlc_LogicalChannelMappingIndicator"
    public boolean getRlc_LogicalChannelMappingIndicator()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setRlc_LogicalChannelMappingIndicator(boolean rlc_LogicalChannelMappingIndicator)
    {
	setRlc_LogicalChannelMappingIndicator(new BOOLEAN(rlc_LogicalChannelMappingIndicator));
    }
    
    public void setRlc_LogicalChannelMappingIndicator(BOOLEAN rlc_LogicalChannelMappingIndicator)
    {
	mComponents[0] = rlc_LogicalChannelMappingIndicator;
    }
    
    
    // Methods for field "ul_LogicalChannelMapping"
    public Ul_LogicalChannelMapping getUl_LogicalChannelMapping()
    {
	return (Ul_LogicalChannelMapping)mComponents[1];
    }
    
    public void setUl_LogicalChannelMapping(Ul_LogicalChannelMapping ul_LogicalChannelMapping)
    {
	mComponents[1] = ul_LogicalChannelMapping;
    }
    
    
    
    /**
     * Define the ASN1 Type Ul_LogicalChannelMapping from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Ul_LogicalChannelMapping extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Ul_LogicalChannelMapping()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Ul_LogicalChannelMapping(UL_LogicalChannelMapping_r8[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(UL_LogicalChannelMapping_r8 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(UL_LogicalChannelMapping_r8 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized UL_LogicalChannelMapping_r8 get(int atIndex)
	{
	    return (UL_LogicalChannelMapping_r8)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(UL_LogicalChannelMapping_r8 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(UL_LogicalChannelMapping_r8 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new UL_LogicalChannelMapping_r8();
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
		"UL_LogicalChannelMappingList_r8$Ul_LogicalChannelMapping"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new SingleValueConstraint (
		    new com.oss.asn1.INTEGER(2)
		)
	    ),
	    new Bounds (
		new java.lang.Long(2),
		new java.lang.Long(2)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "UL_LogicalChannelMapping_r8"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Ul_LogicalChannelMapping object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ul_LogicalChannelMapping object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ul_LogicalChannelMapping

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
	    "UL_LogicalChannelMappingList_r8"
	),
	new QName (
	    "InformationElements",
	    "UL-LogicalChannelMappingList-r8"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "rlc-LogicalChannelMappingIndicator",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_LogicalChannelMappingList_r8$Ul_LogicalChannelMapping"
			)
		    ),
		    "ul-LogicalChannelMapping",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappingList_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_LogicalChannelMappingList_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_LogicalChannelMappingList_r8
