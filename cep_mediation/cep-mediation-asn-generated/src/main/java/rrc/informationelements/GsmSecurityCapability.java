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
 * Define the ASN1 Type GsmSecurityCapability from ASN1 Module InformationElements.
 * @see BitString
 */

public class GsmSecurityCapability extends BitString {
    
    /**
     * The default constructor.
     */
    public GsmSecurityCapability()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public GsmSecurityCapability(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public GsmSecurityCapability(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    public static final int a5_7 = 0;
    public static final int a5_6 = 1;
    public static final int a5_5 = 2;
    public static final int a5_4 = 3;
    public static final int a5_3 = 4;
    public static final int a5_2 = 5;
    public static final int a5_1 = 6;
    
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
	    "GsmSecurityCapability"
	),
	new QName (
	    "InformationElements",
	    "GsmSecurityCapability"
	),
	12314,
	new SizeConstraint (
	    new SingleValueConstraint (
		new com.oss.asn1.INTEGER(7)
	    )
	),
	new Bounds (
	    new java.lang.Long(7),
	    new java.lang.Long(7)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "a5-7",
		    0
		),
		new MemberListElement (
		    "a5-6",
		    1
		),
		new MemberListElement (
		    "a5-5",
		    2
		),
		new MemberListElement (
		    "a5-4",
		    3
		),
		new MemberListElement (
		    "a5-3",
		    4
		),
		new MemberListElement (
		    "a5-2",
		    5
		),
		new MemberListElement (
		    "a5-1",
		    6
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GsmSecurityCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GsmSecurityCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GsmSecurityCapability
