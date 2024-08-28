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
 * Define the ASN1 Type SRNC_Identity from ASN1 Module InformationElements.
 * @see BitString
 */

public class SRNC_Identity extends BitString {
    
    /**
     * The default constructor.
     */
    public SRNC_Identity()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public SRNC_Identity(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public SRNC_Identity(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final BitStringInfo c_typeinfo = new BitStringInfo (
	new Tags (
	    new short[] {
		0x0003
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SRNC_Identity"
	),
	new QName (
	    "InformationElements",
	    "SRNC-Identity"
	),
	12314,
	new SizeConstraint (
	    new SingleValueConstraint (
		new com.oss.asn1.INTEGER(12)
	    )
	),
	new Bounds (
	    new java.lang.Long(12),
	    new java.lang.Long(12)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRNC_Identity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRNC_Identity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRNC_Identity
