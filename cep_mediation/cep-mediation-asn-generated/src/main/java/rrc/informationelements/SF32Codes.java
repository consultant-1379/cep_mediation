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
 * Define the ASN1 Type SF32Codes from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SF32Codes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SF32Codes()
    {
	super(cFirstNumber);
    }
    
    protected SF32Codes(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SF32Codes cc32_1 =
	new SF32Codes(0);
    public static final SF32Codes cc32_2 =
	new SF32Codes(1);
    public static final SF32Codes cc32_3 =
	new SF32Codes(2);
    public static final SF32Codes cc32_4 =
	new SF32Codes(3);
    public static final SF32Codes cc32_5 =
	new SF32Codes(4);
    public static final SF32Codes cc32_6 =
	new SF32Codes(5);
    public static final SF32Codes cc32_7 =
	new SF32Codes(6);
    public static final SF32Codes cc32_8 =
	new SF32Codes(7);
    public static final SF32Codes cc32_9 =
	new SF32Codes(8);
    public static final SF32Codes cc32_10 =
	new SF32Codes(9);
    public static final SF32Codes cc32_11 =
	new SF32Codes(10);
    public static final SF32Codes cc32_12 =
	new SF32Codes(11);
    public static final SF32Codes cc32_13 =
	new SF32Codes(12);
    public static final SF32Codes cc32_14 =
	new SF32Codes(13);
    public static final SF32Codes cc32_15 =
	new SF32Codes(14);
    public static final SF32Codes cc32_16 =
	new SF32Codes(15);
    private final static SF32Codes cNamedNumbers[] = {
	 cc32_1, 
	 cc32_2, 
	 cc32_3, 
	 cc32_4, 
	 cc32_5, 
	 cc32_6, 
	 cc32_7, 
	 cc32_8, 
	 cc32_9, 
	 cc32_10, 
	 cc32_11, 
	 cc32_12, 
	 cc32_13, 
	 cc32_14, 
	 cc32_15, 
	 cc32_16
    };
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    public static SF32Codes valueOf(long value)
    {
	return (SF32Codes)cc32_1.lookupValue(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SF32Codes"
	),
	new QName (
	    "InformationElements",
	    "SF32Codes"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cc32-1",
		    0
		),
		new MemberListElement (
		    "cc32-2",
		    1
		),
		new MemberListElement (
		    "cc32-3",
		    2
		),
		new MemberListElement (
		    "cc32-4",
		    3
		),
		new MemberListElement (
		    "cc32-5",
		    4
		),
		new MemberListElement (
		    "cc32-6",
		    5
		),
		new MemberListElement (
		    "cc32-7",
		    6
		),
		new MemberListElement (
		    "cc32-8",
		    7
		),
		new MemberListElement (
		    "cc32-9",
		    8
		),
		new MemberListElement (
		    "cc32-10",
		    9
		),
		new MemberListElement (
		    "cc32-11",
		    10
		),
		new MemberListElement (
		    "cc32-12",
		    11
		),
		new MemberListElement (
		    "cc32-13",
		    12
		),
		new MemberListElement (
		    "cc32-14",
		    13
		),
		new MemberListElement (
		    "cc32-15",
		    14
		),
		new MemberListElement (
		    "cc32-16",
		    15
		)
	    }
	),
	0,
	cc32_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SF32Codes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF32Codes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF32Codes
