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
 * Define the ASN1 Type Sync_UL_Codes_Bitmap from ASN1 Module InformationElements.
 * @see BitString
 */

public class Sync_UL_Codes_Bitmap extends BitString {
    
    /**
     * The default constructor.
     */
    public Sync_UL_Codes_Bitmap()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public Sync_UL_Codes_Bitmap(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public Sync_UL_Codes_Bitmap(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    public static final int code7 = 0;
    public static final int code6 = 1;
    public static final int code5 = 2;
    public static final int code4 = 3;
    public static final int code3 = 4;
    public static final int code2 = 5;
    public static final int code1 = 6;
    public static final int code0 = 7;
    
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
	    "Sync_UL_Codes_Bitmap"
	),
	new QName (
	    "InformationElements",
	    "Sync-UL-Codes-Bitmap"
	),
	12314,
	new SizeConstraint (
	    new SingleValueConstraint (
		new com.oss.asn1.INTEGER(8)
	    )
	),
	new Bounds (
	    new java.lang.Long(8),
	    new java.lang.Long(8)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "code7",
		    0
		),
		new MemberListElement (
		    "code6",
		    1
		),
		new MemberListElement (
		    "code5",
		    2
		),
		new MemberListElement (
		    "code4",
		    3
		),
		new MemberListElement (
		    "code3",
		    4
		),
		new MemberListElement (
		    "code2",
		    5
		),
		new MemberListElement (
		    "code1",
		    6
		),
		new MemberListElement (
		    "code0",
		    7
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Sync_UL_Codes_Bitmap object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Sync_UL_Codes_Bitmap object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Sync_UL_Codes_Bitmap
