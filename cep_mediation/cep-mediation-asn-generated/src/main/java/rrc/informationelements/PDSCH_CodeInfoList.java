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
 * Define the ASN1 Type PDSCH_CodeInfoList from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class PDSCH_CodeInfoList extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public PDSCH_CodeInfoList()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public PDSCH_CodeInfoList(PDSCH_CodeInfo[] elements)
    {
	super(elements);
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(PDSCH_CodeInfo element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(PDSCH_CodeInfo element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized PDSCH_CodeInfo get(int atIndex)
    {
	return (PDSCH_CodeInfo)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(PDSCH_CodeInfo element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(PDSCH_CodeInfo element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new PDSCH_CodeInfo();
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
	    "PDSCH_CodeInfoList"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-CodeInfoList"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(512),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(512)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"PDSCH_CodeInfo"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_CodeInfoList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_CodeInfoList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_CodeInfoList
