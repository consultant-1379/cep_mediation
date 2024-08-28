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
 * Define the ASN1 Type SF16Codes from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SF16Codes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SF16Codes()
    {
	super(cFirstNumber);
    }
    
    protected SF16Codes(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SF16Codes cc16_1 =
	new SF16Codes(0);
    public static final SF16Codes cc16_2 =
	new SF16Codes(1);
    public static final SF16Codes cc16_3 =
	new SF16Codes(2);
    public static final SF16Codes cc16_4 =
	new SF16Codes(3);
    public static final SF16Codes cc16_5 =
	new SF16Codes(4);
    public static final SF16Codes cc16_6 =
	new SF16Codes(5);
    public static final SF16Codes cc16_7 =
	new SF16Codes(6);
    public static final SF16Codes cc16_8 =
	new SF16Codes(7);
    private final static SF16Codes cNamedNumbers[] = {
	 cc16_1, 
	 cc16_2, 
	 cc16_3, 
	 cc16_4, 
	 cc16_5, 
	 cc16_6, 
	 cc16_7, 
	 cc16_8
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
    
    public static SF16Codes valueOf(long value)
    {
	return (SF16Codes)cc16_1.lookupValue(value);
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
	    "SF16Codes"
	),
	new QName (
	    "InformationElements",
	    "SF16Codes"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cc16-1",
		    0
		),
		new MemberListElement (
		    "cc16-2",
		    1
		),
		new MemberListElement (
		    "cc16-3",
		    2
		),
		new MemberListElement (
		    "cc16-4",
		    3
		),
		new MemberListElement (
		    "cc16-5",
		    4
		),
		new MemberListElement (
		    "cc16-6",
		    5
		),
		new MemberListElement (
		    "cc16-7",
		    6
		),
		new MemberListElement (
		    "cc16-8",
		    7
		)
	    }
	),
	0,
	cc16_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SF16Codes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF16Codes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF16Codes
