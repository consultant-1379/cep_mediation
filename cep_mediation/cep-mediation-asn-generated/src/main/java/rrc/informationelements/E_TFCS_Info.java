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
 * Define the ASN1 Type E_TFCS_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_TFCS_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_TFCS_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_TFCS_Info(Reference_Beta_QPSK_List reference_Beta_QPSK_List, 
		    Reference_Beta_16QAM_List reference_Beta_16QAM_List)
    {
	setReference_Beta_QPSK_List(reference_Beta_QPSK_List);
	setReference_Beta_16QAM_List(reference_Beta_16QAM_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Reference_Beta_QPSK_List();
	mComponents[1] = new Reference_Beta_16QAM_List();
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
		return new Reference_Beta_QPSK_List();
	    case 1:
		return new Reference_Beta_16QAM_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "reference_Beta_QPSK_List"
    public Reference_Beta_QPSK_List getReference_Beta_QPSK_List()
    {
	return (Reference_Beta_QPSK_List)mComponents[0];
    }
    
    public void setReference_Beta_QPSK_List(Reference_Beta_QPSK_List reference_Beta_QPSK_List)
    {
	mComponents[0] = reference_Beta_QPSK_List;
    }
    
    
    
    /**
     * Define the ASN1 Type Reference_Beta_QPSK_List from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Reference_Beta_QPSK_List extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Reference_Beta_QPSK_List()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Reference_Beta_QPSK_List(Reference_Beta_QPSK[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Reference_Beta_QPSK element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Reference_Beta_QPSK element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Reference_Beta_QPSK get(int atIndex)
	{
	    return (Reference_Beta_QPSK)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Reference_Beta_QPSK element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Reference_Beta_QPSK element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Reference_Beta_QPSK();
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
		"E_TFCS_Info$Reference_Beta_QPSK_List"
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
		    "Reference_Beta_QPSK"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Reference_Beta_QPSK_List object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Reference_Beta_QPSK_List object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Reference_Beta_QPSK_List

    // Methods for field "reference_Beta_16QAM_List"
    public Reference_Beta_16QAM_List getReference_Beta_16QAM_List()
    {
	return (Reference_Beta_16QAM_List)mComponents[1];
    }
    
    public void setReference_Beta_16QAM_List(Reference_Beta_16QAM_List reference_Beta_16QAM_List)
    {
	mComponents[1] = reference_Beta_16QAM_List;
    }
    
    
    
    /**
     * Define the ASN1 Type Reference_Beta_16QAM_List from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Reference_Beta_16QAM_List extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Reference_Beta_16QAM_List()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Reference_Beta_16QAM_List(Reference_Beta_16QAM[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Reference_Beta_16QAM element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Reference_Beta_16QAM element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Reference_Beta_16QAM get(int atIndex)
	{
	    return (Reference_Beta_16QAM)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Reference_Beta_16QAM element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Reference_Beta_16QAM element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Reference_Beta_16QAM();
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
		"E_TFCS_Info$Reference_Beta_16QAM_List"
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
		    "Reference_Beta_16QAM"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Reference_Beta_16QAM_List object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Reference_Beta_16QAM_List object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Reference_Beta_16QAM_List

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
	    "E_TFCS_Info"
	),
	new QName (
	    "InformationElements",
	    "E-TFCS-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_TFCS_Info$Reference_Beta_QPSK_List"
			)
		    ),
		    "reference-Beta-QPSK-List",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_TFCS_Info$Reference_Beta_16QAM_List"
			)
		    ),
		    "reference-Beta-16QAM-List",
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
     * Get the type descriptor (TypeInfo) of 'this' E_TFCS_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_TFCS_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_TFCS_Info
