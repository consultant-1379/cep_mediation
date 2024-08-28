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
 * Define the ASN1 Type TDD_PRACH_CCode_LCR_r4 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TDD_PRACH_CCode_LCR_r4 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TDD_PRACH_CCode_LCR_r4()
    {
	super(cFirstNumber);
    }
    
    protected TDD_PRACH_CCode_LCR_r4(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TDD_PRACH_CCode_LCR_r4 cc4_1 =
	new TDD_PRACH_CCode_LCR_r4(0);
    public static final TDD_PRACH_CCode_LCR_r4 cc4_2 =
	new TDD_PRACH_CCode_LCR_r4(1);
    public static final TDD_PRACH_CCode_LCR_r4 cc4_3 =
	new TDD_PRACH_CCode_LCR_r4(2);
    public static final TDD_PRACH_CCode_LCR_r4 cc4_4 =
	new TDD_PRACH_CCode_LCR_r4(3);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_1 =
	new TDD_PRACH_CCode_LCR_r4(4);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_2 =
	new TDD_PRACH_CCode_LCR_r4(5);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_3 =
	new TDD_PRACH_CCode_LCR_r4(6);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_4 =
	new TDD_PRACH_CCode_LCR_r4(7);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_5 =
	new TDD_PRACH_CCode_LCR_r4(8);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_6 =
	new TDD_PRACH_CCode_LCR_r4(9);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_7 =
	new TDD_PRACH_CCode_LCR_r4(10);
    public static final TDD_PRACH_CCode_LCR_r4 cc8_8 =
	new TDD_PRACH_CCode_LCR_r4(11);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_1 =
	new TDD_PRACH_CCode_LCR_r4(12);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_2 =
	new TDD_PRACH_CCode_LCR_r4(13);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_3 =
	new TDD_PRACH_CCode_LCR_r4(14);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_4 =
	new TDD_PRACH_CCode_LCR_r4(15);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_5 =
	new TDD_PRACH_CCode_LCR_r4(16);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_6 =
	new TDD_PRACH_CCode_LCR_r4(17);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_7 =
	new TDD_PRACH_CCode_LCR_r4(18);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_8 =
	new TDD_PRACH_CCode_LCR_r4(19);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_9 =
	new TDD_PRACH_CCode_LCR_r4(20);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_10 =
	new TDD_PRACH_CCode_LCR_r4(21);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_11 =
	new TDD_PRACH_CCode_LCR_r4(22);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_12 =
	new TDD_PRACH_CCode_LCR_r4(23);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_13 =
	new TDD_PRACH_CCode_LCR_r4(24);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_14 =
	new TDD_PRACH_CCode_LCR_r4(25);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_15 =
	new TDD_PRACH_CCode_LCR_r4(26);
    public static final TDD_PRACH_CCode_LCR_r4 cc16_16 =
	new TDD_PRACH_CCode_LCR_r4(27);
    private final static TDD_PRACH_CCode_LCR_r4 cNamedNumbers[] = {
	 cc4_1, 
	 cc4_2, 
	 cc4_3, 
	 cc4_4, 
	 cc8_1, 
	 cc8_2, 
	 cc8_3, 
	 cc8_4, 
	 cc8_5, 
	 cc8_6, 
	 cc8_7, 
	 cc8_8, 
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
    
    public static TDD_PRACH_CCode_LCR_r4 valueOf(long value)
    {
	return (TDD_PRACH_CCode_LCR_r4)cc4_1.lookupValue(value);
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
	    "TDD_PRACH_CCode_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "TDD-PRACH-CCode-LCR-r4"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cc4-1",
		    0
		),
		new MemberListElement (
		    "cc4-2",
		    1
		),
		new MemberListElement (
		    "cc4-3",
		    2
		),
		new MemberListElement (
		    "cc4-4",
		    3
		),
		new MemberListElement (
		    "cc8-1",
		    4
		),
		new MemberListElement (
		    "cc8-2",
		    5
		),
		new MemberListElement (
		    "cc8-3",
		    6
		),
		new MemberListElement (
		    "cc8-4",
		    7
		),
		new MemberListElement (
		    "cc8-5",
		    8
		),
		new MemberListElement (
		    "cc8-6",
		    9
		),
		new MemberListElement (
		    "cc8-7",
		    10
		),
		new MemberListElement (
		    "cc8-8",
		    11
		),
		new MemberListElement (
		    "cc16-1",
		    12
		),
		new MemberListElement (
		    "cc16-2",
		    13
		),
		new MemberListElement (
		    "cc16-3",
		    14
		),
		new MemberListElement (
		    "cc16-4",
		    15
		),
		new MemberListElement (
		    "cc16-5",
		    16
		),
		new MemberListElement (
		    "cc16-6",
		    17
		),
		new MemberListElement (
		    "cc16-7",
		    18
		),
		new MemberListElement (
		    "cc16-8",
		    19
		),
		new MemberListElement (
		    "cc16-9",
		    20
		),
		new MemberListElement (
		    "cc16-10",
		    21
		),
		new MemberListElement (
		    "cc16-11",
		    22
		),
		new MemberListElement (
		    "cc16-12",
		    23
		),
		new MemberListElement (
		    "cc16-13",
		    24
		),
		new MemberListElement (
		    "cc16-14",
		    25
		),
		new MemberListElement (
		    "cc16-15",
		    26
		),
		new MemberListElement (
		    "cc16-16",
		    27
		)
	    }
	),
	0,
	cc4_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TDD_PRACH_CCode_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TDD_PRACH_CCode_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TDD_PRACH_CCode_LCR_r4
