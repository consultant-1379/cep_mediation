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
 * Define the ASN1 Type UL_TS_ChannelisationCodeList_VHCR from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class UL_TS_ChannelisationCodeList_VHCR extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public UL_TS_ChannelisationCodeList_VHCR()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public UL_TS_ChannelisationCodeList_VHCR(UL_TS_ChannelisationCode_VHCR[] elements)
    {
	super(elements);
    }
    
    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(UL_TS_ChannelisationCode_VHCR element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(UL_TS_ChannelisationCode_VHCR element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized UL_TS_ChannelisationCode_VHCR get(int atIndex)
    {
	return (UL_TS_ChannelisationCode_VHCR)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(UL_TS_ChannelisationCode_VHCR element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(UL_TS_ChannelisationCode_VHCR element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return UL_TS_ChannelisationCode_VHCR.cc1_1;
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
	    "UL_TS_ChannelisationCodeList_VHCR"
	),
	new QName (
	    "InformationElements",
	    "UL-TS-ChannelisationCodeList-VHCR"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(2),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(2)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"UL_TS_ChannelisationCode_VHCR"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCodeList_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCodeList_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TS_ChannelisationCodeList_VHCR
