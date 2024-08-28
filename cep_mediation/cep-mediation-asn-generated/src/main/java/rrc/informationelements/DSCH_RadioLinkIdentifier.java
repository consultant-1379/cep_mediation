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
 * Define the ASN1 Type DSCH_RadioLinkIdentifier from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class DSCH_RadioLinkIdentifier extends INTEGER {
    
    /**
     * The default constructor.
     */
    public DSCH_RadioLinkIdentifier()
    {
    }
    
    public DSCH_RadioLinkIdentifier(short value)
    {
	super(value);
    }
    
    public DSCH_RadioLinkIdentifier(int value)
    {
	super(value);
    }
    
    public DSCH_RadioLinkIdentifier(long value)
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
	    "DSCH_RadioLinkIdentifier"
	),
	new QName (
	    "InformationElements",
	    "DSCH-RadioLinkIdentifier"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new DSCH_RadioLinkIdentifier(0), 
		new DSCH_RadioLinkIdentifier(511),
		0
	    )
	),
	new Bounds (
	    new java.lang.Long(0),
	    new java.lang.Long(511)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DSCH_RadioLinkIdentifier object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DSCH_RadioLinkIdentifier object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DSCH_RadioLinkIdentifier
