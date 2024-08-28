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
 * Define the ASN1 Type TDD768_PICH_CCode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TDD768_PICH_CCode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TDD768_PICH_CCode()
    {
	super(cFirstNumber);
    }
    
    protected TDD768_PICH_CCode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TDD768_PICH_CCode cc32_1 =
	new TDD768_PICH_CCode(0);
    public static final TDD768_PICH_CCode cc32_2 =
	new TDD768_PICH_CCode(1);
    public static final TDD768_PICH_CCode cc32_3 =
	new TDD768_PICH_CCode(2);
    public static final TDD768_PICH_CCode cc32_4 =
	new TDD768_PICH_CCode(3);
    public static final TDD768_PICH_CCode cc32_5 =
	new TDD768_PICH_CCode(4);
    public static final TDD768_PICH_CCode cc32_6 =
	new TDD768_PICH_CCode(5);
    public static final TDD768_PICH_CCode cc32_7 =
	new TDD768_PICH_CCode(6);
    public static final TDD768_PICH_CCode cc32_8 =
	new TDD768_PICH_CCode(7);
    public static final TDD768_PICH_CCode cc32_9 =
	new TDD768_PICH_CCode(8);
    public static final TDD768_PICH_CCode cc32_10 =
	new TDD768_PICH_CCode(9);
    public static final TDD768_PICH_CCode cc32_11 =
	new TDD768_PICH_CCode(10);
    public static final TDD768_PICH_CCode cc32_12 =
	new TDD768_PICH_CCode(11);
    public static final TDD768_PICH_CCode cc32_13 =
	new TDD768_PICH_CCode(12);
    public static final TDD768_PICH_CCode cc32_14 =
	new TDD768_PICH_CCode(13);
    public static final TDD768_PICH_CCode cc32_15 =
	new TDD768_PICH_CCode(14);
    public static final TDD768_PICH_CCode cc32_16 =
	new TDD768_PICH_CCode(15);
    public static final TDD768_PICH_CCode cc32_17 =
	new TDD768_PICH_CCode(16);
    public static final TDD768_PICH_CCode cc32_18 =
	new TDD768_PICH_CCode(17);
    public static final TDD768_PICH_CCode cc32_19 =
	new TDD768_PICH_CCode(18);
    public static final TDD768_PICH_CCode cc32_20 =
	new TDD768_PICH_CCode(19);
    public static final TDD768_PICH_CCode cc32_21 =
	new TDD768_PICH_CCode(20);
    public static final TDD768_PICH_CCode cc32_22 =
	new TDD768_PICH_CCode(21);
    public static final TDD768_PICH_CCode cc32_23 =
	new TDD768_PICH_CCode(22);
    public static final TDD768_PICH_CCode cc32_24 =
	new TDD768_PICH_CCode(23);
    public static final TDD768_PICH_CCode cc32_25 =
	new TDD768_PICH_CCode(24);
    public static final TDD768_PICH_CCode cc32_26 =
	new TDD768_PICH_CCode(25);
    public static final TDD768_PICH_CCode cc32_27 =
	new TDD768_PICH_CCode(26);
    public static final TDD768_PICH_CCode cc32_28 =
	new TDD768_PICH_CCode(27);
    public static final TDD768_PICH_CCode cc32_29 =
	new TDD768_PICH_CCode(28);
    public static final TDD768_PICH_CCode cc32_30 =
	new TDD768_PICH_CCode(29);
    public static final TDD768_PICH_CCode cc32_31 =
	new TDD768_PICH_CCode(30);
    public static final TDD768_PICH_CCode cc32_32 =
	new TDD768_PICH_CCode(31);
    private final static TDD768_PICH_CCode cNamedNumbers[] = {
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
	 cc32_16, 
	 cc32_17, 
	 cc32_18, 
	 cc32_19, 
	 cc32_20, 
	 cc32_21, 
	 cc32_22, 
	 cc32_23, 
	 cc32_24, 
	 cc32_25, 
	 cc32_26, 
	 cc32_27, 
	 cc32_28, 
	 cc32_29, 
	 cc32_30, 
	 cc32_31, 
	 cc32_32
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
    
    public static TDD768_PICH_CCode valueOf(long value)
    {
	return (TDD768_PICH_CCode)cc32_1.lookupValue(value);
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
	    "TDD768_PICH_CCode"
	),
	new QName (
	    "InformationElements",
	    "TDD768-PICH-CCode"
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
		),
		new MemberListElement (
		    "cc32-17",
		    16
		),
		new MemberListElement (
		    "cc32-18",
		    17
		),
		new MemberListElement (
		    "cc32-19",
		    18
		),
		new MemberListElement (
		    "cc32-20",
		    19
		),
		new MemberListElement (
		    "cc32-21",
		    20
		),
		new MemberListElement (
		    "cc32-22",
		    21
		),
		new MemberListElement (
		    "cc32-23",
		    22
		),
		new MemberListElement (
		    "cc32-24",
		    23
		),
		new MemberListElement (
		    "cc32-25",
		    24
		),
		new MemberListElement (
		    "cc32-26",
		    25
		),
		new MemberListElement (
		    "cc32-27",
		    26
		),
		new MemberListElement (
		    "cc32-28",
		    27
		),
		new MemberListElement (
		    "cc32-29",
		    28
		),
		new MemberListElement (
		    "cc32-30",
		    29
		),
		new MemberListElement (
		    "cc32-31",
		    30
		),
		new MemberListElement (
		    "cc32-32",
		    31
		)
	    }
	),
	0,
	cc32_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TDD768_PICH_CCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TDD768_PICH_CCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TDD768_PICH_CCode
