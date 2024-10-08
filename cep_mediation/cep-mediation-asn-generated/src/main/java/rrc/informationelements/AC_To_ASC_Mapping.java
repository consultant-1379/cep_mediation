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
 * Define the ASN1 Type AC_To_ASC_Mapping from ASN1 Module InformationElements.
 * @see INTEGER
 */

public class AC_To_ASC_Mapping extends INTEGER {
    
    /**
     * The default constructor.
     */
    public AC_To_ASC_Mapping()
    {
    }
    
    public AC_To_ASC_Mapping(short value)
    {
	super(value);
    }
    
    public AC_To_ASC_Mapping(int value)
    {
	super(value);
    }
    
    public AC_To_ASC_Mapping(long value)
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
	    "AC_To_ASC_Mapping"
	),
	new QName (
	    "InformationElements",
	    "AC-To-ASC-Mapping"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new AC_To_ASC_Mapping(0), 
		new AC_To_ASC_Mapping(7),
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
     * Get the type descriptor (TypeInfo) of 'this' AC_To_ASC_Mapping object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AC_To_ASC_Mapping object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AC_To_ASC_Mapping
