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
 * Define the ASN1 Type SF16Codes2 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SF16Codes2 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SF16Codes2()
    {
	super(cFirstNumber);
    }
    
    protected SF16Codes2(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SF16Codes2 cc16_1 =
	new SF16Codes2(0);
    public static final SF16Codes2 cc16_2 =
	new SF16Codes2(1);
    public static final SF16Codes2 cc16_3 =
	new SF16Codes2(2);
    public static final SF16Codes2 cc16_4 =
	new SF16Codes2(3);
    public static final SF16Codes2 cc16_5 =
	new SF16Codes2(4);
    public static final SF16Codes2 cc16_6 =
	new SF16Codes2(5);
    public static final SF16Codes2 cc16_7 =
	new SF16Codes2(6);
    public static final SF16Codes2 cc16_8 =
	new SF16Codes2(7);
    public static final SF16Codes2 cc16_9 =
	new SF16Codes2(8);
    public static final SF16Codes2 cc16_10 =
	new SF16Codes2(9);
    public static final SF16Codes2 cc16_11 =
	new SF16Codes2(10);
    public static final SF16Codes2 cc16_12 =
	new SF16Codes2(11);
    public static final SF16Codes2 cc16_13 =
	new SF16Codes2(12);
    public static final SF16Codes2 cc16_14 =
	new SF16Codes2(13);
    public static final SF16Codes2 cc16_15 =
	new SF16Codes2(14);
    public static final SF16Codes2 cc16_16 =
	new SF16Codes2(15);
    private final static SF16Codes2 cNamedNumbers[] = {
	 cc16_1, 
	 cc16_2, 
	 cc16_3, 
	 cc16_4, 
	 cc16_5, 
	 cc16_6, 
	 cc16_7, 
	 cc16_8, 
	 cc16_9, 
	 cc16_10, 
	 cc16_11, 
	 cc16_12, 
	 cc16_13, 
	 cc16_14, 
	 cc16_15, 
	 cc16_16
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
    
    public static SF16Codes2 valueOf(long value)
    {
	return (SF16Codes2)cc16_1.lookupValue(value);
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
	    "SF16Codes2"
	),
	new QName (
	    "InformationElements",
	    "SF16Codes2"
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
		),
		new MemberListElement (
		    "cc16-9",
		    8
		),
		new MemberListElement (
		    "cc16-10",
		    9
		),
		new MemberListElement (
		    "cc16-11",
		    10
		),
		new MemberListElement (
		    "cc16-12",
		    11
		),
		new MemberListElement (
		    "cc16-13",
		    12
		),
		new MemberListElement (
		    "cc16-14",
		    13
		),
		new MemberListElement (
		    "cc16-15",
		    14
		),
		new MemberListElement (
		    "cc16-16",
		    15
		)
	    }
	),
	0,
	cc16_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SF16Codes2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF16Codes2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF16Codes2
