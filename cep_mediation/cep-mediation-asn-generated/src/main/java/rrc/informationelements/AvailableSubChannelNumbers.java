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
 * Define the ASN1 Type AvailableSubChannelNumbers from ASN1 Module InformationElements.
 * @see BitString
 */

public class AvailableSubChannelNumbers extends BitString {
    
    /**
     * The default constructor.
     */
    public AvailableSubChannelNumbers()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public AvailableSubChannelNumbers(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public AvailableSubChannelNumbers(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    public static final int subCh11 = 0;
    public static final int subCh10 = 1;
    public static final int subCh9 = 2;
    public static final int subCh8 = 3;
    public static final int subCh7 = 4;
    public static final int subCh6 = 5;
    public static final int subCh5 = 6;
    public static final int subCh4 = 7;
    public static final int subCh3 = 8;
    public static final int subCh2 = 9;
    public static final int subCh1 = 10;
    public static final int subCh0 = 11;
    
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
	    "AvailableSubChannelNumbers"
	),
	new QName (
	    "InformationElements",
	    "AvailableSubChannelNumbers"
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
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "subCh11",
		    0
		),
		new MemberListElement (
		    "subCh10",
		    1
		),
		new MemberListElement (
		    "subCh9",
		    2
		),
		new MemberListElement (
		    "subCh8",
		    3
		),
		new MemberListElement (
		    "subCh7",
		    4
		),
		new MemberListElement (
		    "subCh6",
		    5
		),
		new MemberListElement (
		    "subCh5",
		    6
		),
		new MemberListElement (
		    "subCh4",
		    7
		),
		new MemberListElement (
		    "subCh3",
		    8
		),
		new MemberListElement (
		    "subCh2",
		    9
		),
		new MemberListElement (
		    "subCh1",
		    10
		),
		new MemberListElement (
		    "subCh0",
		    11
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AvailableSubChannelNumbers object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AvailableSubChannelNumbers object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AvailableSubChannelNumbers
