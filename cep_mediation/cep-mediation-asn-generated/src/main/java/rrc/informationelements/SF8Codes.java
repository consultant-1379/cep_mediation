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
 * Define the ASN1 Type SF8Codes from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SF8Codes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SF8Codes()
    {
	super(cFirstNumber);
    }
    
    protected SF8Codes(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SF8Codes cc8_1 =
	new SF8Codes(0);
    public static final SF8Codes cc8_2 =
	new SF8Codes(1);
    public static final SF8Codes cc8_3 =
	new SF8Codes(2);
    public static final SF8Codes cc8_4 =
	new SF8Codes(3);
    public static final SF8Codes cc8_5 =
	new SF8Codes(4);
    public static final SF8Codes cc8_6 =
	new SF8Codes(5);
    public static final SF8Codes cc8_7 =
	new SF8Codes(6);
    public static final SF8Codes cc8_8 =
	new SF8Codes(7);
    private final static SF8Codes cNamedNumbers[] = {
	 cc8_1, 
	 cc8_2, 
	 cc8_3, 
	 cc8_4, 
	 cc8_5, 
	 cc8_6, 
	 cc8_7, 
	 cc8_8
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
    
    public static SF8Codes valueOf(long value)
    {
	return (SF8Codes)cc8_1.lookupValue(value);
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
	    "SF8Codes"
	),
	new QName (
	    "InformationElements",
	    "SF8Codes"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cc8-1",
		    0
		),
		new MemberListElement (
		    "cc8-2",
		    1
		),
		new MemberListElement (
		    "cc8-3",
		    2
		),
		new MemberListElement (
		    "cc8-4",
		    3
		),
		new MemberListElement (
		    "cc8-5",
		    4
		),
		new MemberListElement (
		    "cc8-6",
		    5
		),
		new MemberListElement (
		    "cc8-7",
		    6
		),
		new MemberListElement (
		    "cc8-8",
		    7
		)
	    }
	),
	0,
	cc8_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SF8Codes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF8Codes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF8Codes
