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
 * Define the ASN1 Type DedicatedDynamicTF_InfoList_DynamicTTI from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class DedicatedDynamicTF_InfoList_DynamicTTI extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public DedicatedDynamicTF_InfoList_DynamicTTI()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public DedicatedDynamicTF_InfoList_DynamicTTI(DedicatedDynamicTF_Info_DynamicTTI[] elements)
    {
	super(elements);
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(DedicatedDynamicTF_Info_DynamicTTI element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(DedicatedDynamicTF_Info_DynamicTTI element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized DedicatedDynamicTF_Info_DynamicTTI get(int atIndex)
    {
	return (DedicatedDynamicTF_Info_DynamicTTI)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(DedicatedDynamicTF_Info_DynamicTTI element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(DedicatedDynamicTF_Info_DynamicTTI element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new DedicatedDynamicTF_Info_DynamicTTI();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "DedicatedDynamicTF_InfoList_DynamicTTI"
	),
	new QName (
	    "InformationElements",
	    "DedicatedDynamicTF-InfoList-DynamicTTI"
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
		"DedicatedDynamicTF_Info_DynamicTTI"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DedicatedDynamicTF_InfoList_DynamicTTI object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DedicatedDynamicTF_InfoList_DynamicTTI object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DedicatedDynamicTF_InfoList_DynamicTTI
