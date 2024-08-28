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
 * Define the ASN1 Type UL_TS_ChannelisationCode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UL_TS_ChannelisationCode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UL_TS_ChannelisationCode()
    {
	super(cFirstNumber);
    }
    
    protected UL_TS_ChannelisationCode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UL_TS_ChannelisationCode cc1_1 =
	new UL_TS_ChannelisationCode(0);
    public static final UL_TS_ChannelisationCode cc2_1 =
	new UL_TS_ChannelisationCode(1);
    public static final UL_TS_ChannelisationCode cc2_2 =
	new UL_TS_ChannelisationCode(2);
    public static final UL_TS_ChannelisationCode cc4_1 =
	new UL_TS_ChannelisationCode(3);
    public static final UL_TS_ChannelisationCode cc4_2 =
	new UL_TS_ChannelisationCode(4);
    public static final UL_TS_ChannelisationCode cc4_3 =
	new UL_TS_ChannelisationCode(5);
    public static final UL_TS_ChannelisationCode cc4_4 =
	new UL_TS_ChannelisationCode(6);
    public static final UL_TS_ChannelisationCode cc8_1 =
	new UL_TS_ChannelisationCode(7);
    public static final UL_TS_ChannelisationCode cc8_2 =
	new UL_TS_ChannelisationCode(8);
    public static final UL_TS_ChannelisationCode cc8_3 =
	new UL_TS_ChannelisationCode(9);
    public static final UL_TS_ChannelisationCode cc8_4 =
	new UL_TS_ChannelisationCode(10);
    public static final UL_TS_ChannelisationCode cc8_5 =
	new UL_TS_ChannelisationCode(11);
    public static final UL_TS_ChannelisationCode cc8_6 =
	new UL_TS_ChannelisationCode(12);
    public static final UL_TS_ChannelisationCode cc8_7 =
	new UL_TS_ChannelisationCode(13);
    public static final UL_TS_ChannelisationCode cc8_8 =
	new UL_TS_ChannelisationCode(14);
    public static final UL_TS_ChannelisationCode cc16_1 =
	new UL_TS_ChannelisationCode(15);
    public static final UL_TS_ChannelisationCode cc16_2 =
	new UL_TS_ChannelisationCode(16);
    public static final UL_TS_ChannelisationCode cc16_3 =
	new UL_TS_ChannelisationCode(17);
    public static final UL_TS_ChannelisationCode cc16_4 =
	new UL_TS_ChannelisationCode(18);
    public static final UL_TS_ChannelisationCode cc16_5 =
	new UL_TS_ChannelisationCode(19);
    public static final UL_TS_ChannelisationCode cc16_6 =
	new UL_TS_ChannelisationCode(20);
    public static final UL_TS_ChannelisationCode cc16_7 =
	new UL_TS_ChannelisationCode(21);
    public static final UL_TS_ChannelisationCode cc16_8 =
	new UL_TS_ChannelisationCode(22);
    public static final UL_TS_ChannelisationCode cc16_9 =
	new UL_TS_ChannelisationCode(23);
    public static final UL_TS_ChannelisationCode cc16_10 =
	new UL_TS_ChannelisationCode(24);
    public static final UL_TS_ChannelisationCode cc16_11 =
	new UL_TS_ChannelisationCode(25);
    public static final UL_TS_ChannelisationCode cc16_12 =
	new UL_TS_ChannelisationCode(26);
    public static final UL_TS_ChannelisationCode cc16_13 =
	new UL_TS_ChannelisationCode(27);
    public static final UL_TS_ChannelisationCode cc16_14 =
	new UL_TS_ChannelisationCode(28);
    public static final UL_TS_ChannelisationCode cc16_15 =
	new UL_TS_ChannelisationCode(29);
    public static final UL_TS_ChannelisationCode cc16_16 =
	new UL_TS_ChannelisationCode(30);
    private final static UL_TS_ChannelisationCode cNamedNumbers[] = {
	 cc1_1, 
	 cc2_1, 
	 cc2_2, 
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
    
    public static UL_TS_ChannelisationCode valueOf(long value)
    {
	return (UL_TS_ChannelisationCode)cc1_1.lookupValue(value);
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
	    "UL_TS_ChannelisationCode"
	),
	new QName (
	    "InformationElements",
	    "UL-TS-ChannelisationCode"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cc1-1",
		    0
		),
		new MemberListElement (
		    "cc2-1",
		    1
		),
		new MemberListElement (
		    "cc2-2",
		    2
		),
		new MemberListElement (
		    "cc4-1",
		    3
		),
		new MemberListElement (
		    "cc4-2",
		    4
		),
		new MemberListElement (
		    "cc4-3",
		    5
		),
		new MemberListElement (
		    "cc4-4",
		    6
		),
		new MemberListElement (
		    "cc8-1",
		    7
		),
		new MemberListElement (
		    "cc8-2",
		    8
		),
		new MemberListElement (
		    "cc8-3",
		    9
		),
		new MemberListElement (
		    "cc8-4",
		    10
		),
		new MemberListElement (
		    "cc8-5",
		    11
		),
		new MemberListElement (
		    "cc8-6",
		    12
		),
		new MemberListElement (
		    "cc8-7",
		    13
		),
		new MemberListElement (
		    "cc8-8",
		    14
		),
		new MemberListElement (
		    "cc16-1",
		    15
		),
		new MemberListElement (
		    "cc16-2",
		    16
		),
		new MemberListElement (
		    "cc16-3",
		    17
		),
		new MemberListElement (
		    "cc16-4",
		    18
		),
		new MemberListElement (
		    "cc16-5",
		    19
		),
		new MemberListElement (
		    "cc16-6",
		    20
		),
		new MemberListElement (
		    "cc16-7",
		    21
		),
		new MemberListElement (
		    "cc16-8",
		    22
		),
		new MemberListElement (
		    "cc16-9",
		    23
		),
		new MemberListElement (
		    "cc16-10",
		    24
		),
		new MemberListElement (
		    "cc16-11",
		    25
		),
		new MemberListElement (
		    "cc16-12",
		    26
		),
		new MemberListElement (
		    "cc16-13",
		    27
		),
		new MemberListElement (
		    "cc16-14",
		    28
		),
		new MemberListElement (
		    "cc16-15",
		    29
		),
		new MemberListElement (
		    "cc16-16",
		    30
		)
	    }
	),
	0,
	cc1_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TS_ChannelisationCode
