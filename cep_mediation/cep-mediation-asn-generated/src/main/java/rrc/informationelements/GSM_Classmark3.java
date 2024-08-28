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
 * Define the ASN1 Type GSM_Classmark3 from ASN1 Module InformationElements.
 * @see OctetString
 */

public class GSM_Classmark3 extends OctetString {
    
    /**
     * The default constructor.
     */
    public GSM_Classmark3()
    {
    }
    
    /**
     * Construct from a byte[] type.
     * @param value the byte[] to set this object to.
     */
    
    public GSM_Classmark3(byte[] value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final VectorInfo c_typeinfo = new VectorInfo (
	new Tags (
	    new short[] {
		0x0004
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "GSM_Classmark3"
	),
	new QName (
	    "InformationElements",
	    "GSM-Classmark3"
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
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GSM_Classmark3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GSM_Classmark3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GSM_Classmark3
