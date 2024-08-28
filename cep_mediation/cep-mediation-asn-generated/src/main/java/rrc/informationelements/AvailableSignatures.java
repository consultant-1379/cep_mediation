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
 * Define the ASN1 Type AvailableSignatures from ASN1 Module InformationElements.
 * @see BitString
 */

public class AvailableSignatures extends BitString {
    
    /**
     * The default constructor.
     */
    public AvailableSignatures()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public AvailableSignatures(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public AvailableSignatures(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    public static final int signature15 = 0;
    public static final int signature14 = 1;
    public static final int signature13 = 2;
    public static final int signature12 = 3;
    public static final int signature11 = 4;
    public static final int signature10 = 5;
    public static final int signature9 = 6;
    public static final int signature8 = 7;
    public static final int signature7 = 8;
    public static final int signature6 = 9;
    public static final int signature5 = 10;
    public static final int signature4 = 11;
    public static final int signature3 = 12;
    public static final int signature2 = 13;
    public static final int signature1 = 14;
    public static final int signature0 = 15;
    
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
	    "AvailableSignatures"
	),
	new QName (
	    "InformationElements",
	    "AvailableSignatures"
	),
	12314,
	new SizeConstraint (
	    new SingleValueConstraint (
		new com.oss.asn1.INTEGER(16)
	    )
	),
	new Bounds (
	    new java.lang.Long(16),
	    new java.lang.Long(16)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "signature15",
		    0
		),
		new MemberListElement (
		    "signature14",
		    1
		),
		new MemberListElement (
		    "signature13",
		    2
		),
		new MemberListElement (
		    "signature12",
		    3
		),
		new MemberListElement (
		    "signature11",
		    4
		),
		new MemberListElement (
		    "signature10",
		    5
		),
		new MemberListElement (
		    "signature9",
		    6
		),
		new MemberListElement (
		    "signature8",
		    7
		),
		new MemberListElement (
		    "signature7",
		    8
		),
		new MemberListElement (
		    "signature6",
		    9
		),
		new MemberListElement (
		    "signature5",
		    10
		),
		new MemberListElement (
		    "signature4",
		    11
		),
		new MemberListElement (
		    "signature3",
		    12
		),
		new MemberListElement (
		    "signature2",
		    13
		),
		new MemberListElement (
		    "signature1",
		    14
		),
		new MemberListElement (
		    "signature0",
		    15
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AvailableSignatures object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AvailableSignatures object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AvailableSignatures
