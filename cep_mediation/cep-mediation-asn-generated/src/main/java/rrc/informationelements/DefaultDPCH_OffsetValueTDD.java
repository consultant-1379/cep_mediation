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
 * Define the ASN1 Type DefaultDPCH_OffsetValueTDD from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class DefaultDPCH_OffsetValueTDD extends INTEGER {
    
    /**
     * The default constructor.
     */
    public DefaultDPCH_OffsetValueTDD()
    {
    }
    
    public DefaultDPCH_OffsetValueTDD(short value)
    {
	super(value);
    }
    
    public DefaultDPCH_OffsetValueTDD(int value)
    {
	super(value);
    }
    
    public DefaultDPCH_OffsetValueTDD(long value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final IntegerInfo c_typeinfo = new IntegerInfo (
	new Tags (
	    new short[] {
		0x0002
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "DefaultDPCH_OffsetValueTDD"
	),
	new QName (
	    "InformationElements",
	    "DefaultDPCH-OffsetValueTDD"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new DefaultDPCH_OffsetValueTDD(0), 
		new DefaultDPCH_OffsetValueTDD(7),
		0
	    )
	),
	new Bounds (
	    new java.lang.Long(0),
	    new java.lang.Long(7)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DefaultDPCH_OffsetValueTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DefaultDPCH_OffsetValueTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DefaultDPCH_OffsetValueTDD
