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
 * Define the ASN1 Type TDD_PICH_CCode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TDD_PICH_CCode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TDD_PICH_CCode()
    {
	super(cFirstNumber);
    }
    
    protected TDD_PICH_CCode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TDD_PICH_CCode cc16_1 =
	new TDD_PICH_CCode(0);
    public static final TDD_PICH_CCode cc16_2 =
	new TDD_PICH_CCode(1);
    public static final TDD_PICH_CCode cc16_3 =
	new TDD_PICH_CCode(2);
    public static final TDD_PICH_CCode cc16_4 =
	new TDD_PICH_CCode(3);
    public static final TDD_PICH_CCode cc16_5 =
	new TDD_PICH_CCode(4);
    public static final TDD_PICH_CCode cc16_6 =
	new TDD_PICH_CCode(5);
    public static final TDD_PICH_CCode cc16_7 =
	new TDD_PICH_CCode(6);
    public static final TDD_PICH_CCode cc16_8 =
	new TDD_PICH_CCode(7);
    public static final TDD_PICH_CCode cc16_9 =
	new TDD_PICH_CCode(8);
    public static final TDD_PICH_CCode cc16_10 =
	new TDD_PICH_CCode(9);
    public static final TDD_PICH_CCode cc16_11 =
	new TDD_PICH_CCode(10);
    public static final TDD_PICH_CCode cc16_12 =
	new TDD_PICH_CCode(11);
    public static final TDD_PICH_CCode cc16_13 =
	new TDD_PICH_CCode(12);
    public static final TDD_PICH_CCode cc16_14 =
	new TDD_PICH_CCode(13);
    public static final TDD_PICH_CCode cc16_15 =
	new TDD_PICH_CCode(14);
    public static final TDD_PICH_CCode cc16_16 =
	new TDD_PICH_CCode(15);
    private final static TDD_PICH_CCode cNamedNumbers[] = {
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
    
    public static TDD_PICH_CCode valueOf(long value)
    {
	return (TDD_PICH_CCode)cc16_1.lookupValue(value);
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
	    "TDD_PICH_CCode"
	),
	new QName (
	    "InformationElements",
	    "TDD-PICH-CCode"
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
     * Get the type descriptor (TypeInfo) of 'this' TDD_PICH_CCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TDD_PICH_CCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TDD_PICH_CCode
