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
 * Define the ASN1 Type MultiplePLMN_List_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiplePLMN_List_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiplePLMN_List_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiplePLMN_List_r6(BOOLEAN mibPLMN_Identity, 
		    MultiplePLMNs multiplePLMNs)
    {
	setMibPLMN_Identity(mibPLMN_Identity);
	setMultiplePLMNs(multiplePLMNs);
    }
    
    /**
     * Construct with components.
     */
    public MultiplePLMN_List_r6(boolean mibPLMN_Identity, 
		    MultiplePLMNs multiplePLMNs)
    {
	this(new BOOLEAN(mibPLMN_Identity), multiplePLMNs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new MultiplePLMNs();
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
		return new MultiplePLMNs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mibPLMN_Identity"
    public boolean getMibPLMN_Identity()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setMibPLMN_Identity(boolean mibPLMN_Identity)
    {
	setMibPLMN_Identity(new BOOLEAN(mibPLMN_Identity));
    }
    
    public void setMibPLMN_Identity(BOOLEAN mibPLMN_Identity)
    {
	mComponents[0] = mibPLMN_Identity;
    }
    
    
    // Methods for field "multiplePLMNs"
    public MultiplePLMNs getMultiplePLMNs()
    {
	return (MultiplePLMNs)mComponents[1];
    }
    
    public void setMultiplePLMNs(MultiplePLMNs multiplePLMNs)
    {
	mComponents[1] = multiplePLMNs;
    }
    
    
    
    /**
     * Define the ASN1 Type MultiplePLMNs from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class MultiplePLMNs extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public MultiplePLMNs()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public MultiplePLMNs(PLMN_IdentityWithOptionalMCC_r6[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PLMN_IdentityWithOptionalMCC_r6 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PLMN_IdentityWithOptionalMCC_r6 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PLMN_IdentityWithOptionalMCC_r6 get(int atIndex)
	{
	    return (PLMN_IdentityWithOptionalMCC_r6)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PLMN_IdentityWithOptionalMCC_r6 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PLMN_IdentityWithOptionalMCC_r6 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PLMN_IdentityWithOptionalMCC_r6();
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
		"MultiplePLMN_List_r6$MultiplePLMNs"
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
		    "PLMN_IdentityWithOptionalMCC_r6"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MultiplePLMNs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MultiplePLMNs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MultiplePLMNs

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
	    "MultiplePLMN_List_r6"
	),
	new QName (
	    "InformationElements",
	    "MultiplePLMN-List-r6"
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
		    "mibPLMN-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiplePLMN_List_r6$MultiplePLMNs"
			)
		    ),
		    "multiplePLMNs",
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
     * Get the type descriptor (TypeInfo) of 'this' MultiplePLMN_List_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiplePLMN_List_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiplePLMN_List_r6
