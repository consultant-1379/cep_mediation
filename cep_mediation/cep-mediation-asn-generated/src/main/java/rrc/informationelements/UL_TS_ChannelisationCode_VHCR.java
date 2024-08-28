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
 * Define the ASN1 Type UL_TS_ChannelisationCode_VHCR from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UL_TS_ChannelisationCode_VHCR extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UL_TS_ChannelisationCode_VHCR()
    {
	super(cFirstNumber);
    }
    
    protected UL_TS_ChannelisationCode_VHCR(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UL_TS_ChannelisationCode_VHCR cc1_1 =
	new UL_TS_ChannelisationCode_VHCR(0);
    public static final UL_TS_ChannelisationCode_VHCR cc2_1 =
	new UL_TS_ChannelisationCode_VHCR(1);
    public static final UL_TS_ChannelisationCode_VHCR cc2_2 =
	new UL_TS_ChannelisationCode_VHCR(2);
    public static final UL_TS_ChannelisationCode_VHCR cc4_1 =
	new UL_TS_ChannelisationCode_VHCR(3);
    public static final UL_TS_ChannelisationCode_VHCR cc4_2 =
	new UL_TS_ChannelisationCode_VHCR(4);
    public static final UL_TS_ChannelisationCode_VHCR cc4_3 =
	new UL_TS_ChannelisationCode_VHCR(5);
    public static final UL_TS_ChannelisationCode_VHCR cc4_4 =
	new UL_TS_ChannelisationCode_VHCR(6);
    public static final UL_TS_ChannelisationCode_VHCR cc8_1 =
	new UL_TS_ChannelisationCode_VHCR(7);
    public static final UL_TS_ChannelisationCode_VHCR cc8_2 =
	new UL_TS_ChannelisationCode_VHCR(8);
    public static final UL_TS_ChannelisationCode_VHCR cc8_3 =
	new UL_TS_ChannelisationCode_VHCR(9);
    public static final UL_TS_ChannelisationCode_VHCR cc8_4 =
	new UL_TS_ChannelisationCode_VHCR(10);
    public static final UL_TS_ChannelisationCode_VHCR cc8_5 =
	new UL_TS_ChannelisationCode_VHCR(11);
    public static final UL_TS_ChannelisationCode_VHCR cc8_6 =
	new UL_TS_ChannelisationCode_VHCR(12);
    public static final UL_TS_ChannelisationCode_VHCR cc8_7 =
	new UL_TS_ChannelisationCode_VHCR(13);
    public static final UL_TS_ChannelisationCode_VHCR cc8_8 =
	new UL_TS_ChannelisationCode_VHCR(14);
    public static final UL_TS_ChannelisationCode_VHCR cc16_1 =
	new UL_TS_ChannelisationCode_VHCR(15);
    public static final UL_TS_ChannelisationCode_VHCR cc16_2 =
	new UL_TS_ChannelisationCode_VHCR(16);
    public static final UL_TS_ChannelisationCode_VHCR cc16_3 =
	new UL_TS_ChannelisationCode_VHCR(17);
    public static final UL_TS_ChannelisationCode_VHCR cc16_4 =
	new UL_TS_ChannelisationCode_VHCR(18);
    public static final UL_TS_ChannelisationCode_VHCR cc16_5 =
	new UL_TS_ChannelisationCode_VHCR(19);
    public static final UL_TS_ChannelisationCode_VHCR cc16_6 =
	new UL_TS_ChannelisationCode_VHCR(20);
    public static final UL_TS_ChannelisationCode_VHCR cc16_7 =
	new UL_TS_ChannelisationCode_VHCR(21);
    public static final UL_TS_ChannelisationCode_VHCR cc16_8 =
	new UL_TS_ChannelisationCode_VHCR(22);
    public static final UL_TS_ChannelisationCode_VHCR cc16_9 =
	new UL_TS_ChannelisationCode_VHCR(23);
    public static final UL_TS_ChannelisationCode_VHCR cc16_10 =
	new UL_TS_ChannelisationCode_VHCR(24);
    public static final UL_TS_ChannelisationCode_VHCR cc16_11 =
	new UL_TS_ChannelisationCode_VHCR(25);
    public static final UL_TS_ChannelisationCode_VHCR cc16_12 =
	new UL_TS_ChannelisationCode_VHCR(26);
    public static final UL_TS_ChannelisationCode_VHCR cc16_13 =
	new UL_TS_ChannelisationCode_VHCR(27);
    public static final UL_TS_ChannelisationCode_VHCR cc16_14 =
	new UL_TS_ChannelisationCode_VHCR(28);
    public static final UL_TS_ChannelisationCode_VHCR cc16_15 =
	new UL_TS_ChannelisationCode_VHCR(29);
    public static final UL_TS_ChannelisationCode_VHCR cc16_16 =
	new UL_TS_ChannelisationCode_VHCR(30);
    public static final UL_TS_ChannelisationCode_VHCR cc32_1 =
	new UL_TS_ChannelisationCode_VHCR(31);
    public static final UL_TS_ChannelisationCode_VHCR cc32_2 =
	new UL_TS_ChannelisationCode_VHCR(32);
    public static final UL_TS_ChannelisationCode_VHCR cc32_3 =
	new UL_TS_ChannelisationCode_VHCR(33);
    public static final UL_TS_ChannelisationCode_VHCR cc32_4 =
	new UL_TS_ChannelisationCode_VHCR(34);
    public static final UL_TS_ChannelisationCode_VHCR cc32_5 =
	new UL_TS_ChannelisationCode_VHCR(35);
    public static final UL_TS_ChannelisationCode_VHCR cc32_6 =
	new UL_TS_ChannelisationCode_VHCR(36);
    public static final UL_TS_ChannelisationCode_VHCR cc32_7 =
	new UL_TS_ChannelisationCode_VHCR(37);
    public static final UL_TS_ChannelisationCode_VHCR cc32_8 =
	new UL_TS_ChannelisationCode_VHCR(38);
    public static final UL_TS_ChannelisationCode_VHCR cc32_9 =
	new UL_TS_ChannelisationCode_VHCR(39);
    public static final UL_TS_ChannelisationCode_VHCR cc32_10 =
	new UL_TS_ChannelisationCode_VHCR(40);
    public static final UL_TS_ChannelisationCode_VHCR cc32_11 =
	new UL_TS_ChannelisationCode_VHCR(41);
    public static final UL_TS_ChannelisationCode_VHCR cc32_12 =
	new UL_TS_ChannelisationCode_VHCR(42);
    public static final UL_TS_ChannelisationCode_VHCR cc32_13 =
	new UL_TS_ChannelisationCode_VHCR(43);
    public static final UL_TS_ChannelisationCode_VHCR cc32_14 =
	new UL_TS_ChannelisationCode_VHCR(44);
    public static final UL_TS_ChannelisationCode_VHCR cc32_15 =
	new UL_TS_ChannelisationCode_VHCR(45);
    public static final UL_TS_ChannelisationCode_VHCR cc32_16 =
	new UL_TS_ChannelisationCode_VHCR(46);
    public static final UL_TS_ChannelisationCode_VHCR cc32_17 =
	new UL_TS_ChannelisationCode_VHCR(47);
    public static final UL_TS_ChannelisationCode_VHCR cc32_18 =
	new UL_TS_ChannelisationCode_VHCR(48);
    public static final UL_TS_ChannelisationCode_VHCR cc32_19 =
	new UL_TS_ChannelisationCode_VHCR(49);
    public static final UL_TS_ChannelisationCode_VHCR cc32_20 =
	new UL_TS_ChannelisationCode_VHCR(50);
    public static final UL_TS_ChannelisationCode_VHCR cc32_21 =
	new UL_TS_ChannelisationCode_VHCR(51);
    public static final UL_TS_ChannelisationCode_VHCR cc32_22 =
	new UL_TS_ChannelisationCode_VHCR(52);
    public static final UL_TS_ChannelisationCode_VHCR cc32_23 =
	new UL_TS_ChannelisationCode_VHCR(53);
    public static final UL_TS_ChannelisationCode_VHCR cc32_24 =
	new UL_TS_ChannelisationCode_VHCR(54);
    public static final UL_TS_ChannelisationCode_VHCR cc32_25 =
	new UL_TS_ChannelisationCode_VHCR(55);
    public static final UL_TS_ChannelisationCode_VHCR cc32_26 =
	new UL_TS_ChannelisationCode_VHCR(56);
    public static final UL_TS_ChannelisationCode_VHCR cc32_27 =
	new UL_TS_ChannelisationCode_VHCR(57);
    public static final UL_TS_ChannelisationCode_VHCR cc32_28 =
	new UL_TS_ChannelisationCode_VHCR(58);
    public static final UL_TS_ChannelisationCode_VHCR cc32_29 =
	new UL_TS_ChannelisationCode_VHCR(59);
    public static final UL_TS_ChannelisationCode_VHCR cc32_30 =
	new UL_TS_ChannelisationCode_VHCR(60);
    public static final UL_TS_ChannelisationCode_VHCR cc32_31 =
	new UL_TS_ChannelisationCode_VHCR(61);
    public static final UL_TS_ChannelisationCode_VHCR cc32_32 =
	new UL_TS_ChannelisationCode_VHCR(62);
    private final static UL_TS_ChannelisationCode_VHCR cNamedNumbers[] = {
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
	 cc16_16, 
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
    
    public static UL_TS_ChannelisationCode_VHCR valueOf(long value)
    {
	return (UL_TS_ChannelisationCode_VHCR)cc1_1.lookupValue(value);
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
	    "UL_TS_ChannelisationCode_VHCR"
	),
	new QName (
	    "InformationElements",
	    "UL-TS-ChannelisationCode-VHCR"
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
		),
		new MemberListElement (
		    "cc32-1",
		    31
		),
		new MemberListElement (
		    "cc32-2",
		    32
		),
		new MemberListElement (
		    "cc32-3",
		    33
		),
		new MemberListElement (
		    "cc32-4",
		    34
		),
		new MemberListElement (
		    "cc32-5",
		    35
		),
		new MemberListElement (
		    "cc32-6",
		    36
		),
		new MemberListElement (
		    "cc32-7",
		    37
		),
		new MemberListElement (
		    "cc32-8",
		    38
		),
		new MemberListElement (
		    "cc32-9",
		    39
		),
		new MemberListElement (
		    "cc32-10",
		    40
		),
		new MemberListElement (
		    "cc32-11",
		    41
		),
		new MemberListElement (
		    "cc32-12",
		    42
		),
		new MemberListElement (
		    "cc32-13",
		    43
		),
		new MemberListElement (
		    "cc32-14",
		    44
		),
		new MemberListElement (
		    "cc32-15",
		    45
		),
		new MemberListElement (
		    "cc32-16",
		    46
		),
		new MemberListElement (
		    "cc32-17",
		    47
		),
		new MemberListElement (
		    "cc32-18",
		    48
		),
		new MemberListElement (
		    "cc32-19",
		    49
		),
		new MemberListElement (
		    "cc32-20",
		    50
		),
		new MemberListElement (
		    "cc32-21",
		    51
		),
		new MemberListElement (
		    "cc32-22",
		    52
		),
		new MemberListElement (
		    "cc32-23",
		    53
		),
		new MemberListElement (
		    "cc32-24",
		    54
		),
		new MemberListElement (
		    "cc32-25",
		    55
		),
		new MemberListElement (
		    "cc32-26",
		    56
		),
		new MemberListElement (
		    "cc32-27",
		    57
		),
		new MemberListElement (
		    "cc32-28",
		    58
		),
		new MemberListElement (
		    "cc32-29",
		    59
		),
		new MemberListElement (
		    "cc32-30",
		    60
		),
		new MemberListElement (
		    "cc32-31",
		    61
		),
		new MemberListElement (
		    "cc32-32",
		    62
		)
	    }
	),
	0,
	cc1_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCode_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TS_ChannelisationCode_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TS_ChannelisationCode_VHCR
