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
 * Define the ASN1 Type SCCPCH_ChannelisationCode_VHCR from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SCCPCH_ChannelisationCode_VHCR extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SCCPCH_ChannelisationCode_VHCR()
    {
	super(cFirstNumber);
    }
    
    protected SCCPCH_ChannelisationCode_VHCR(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SCCPCH_ChannelisationCode_VHCR cc32_1 =
	new SCCPCH_ChannelisationCode_VHCR(0);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_2 =
	new SCCPCH_ChannelisationCode_VHCR(1);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_3 =
	new SCCPCH_ChannelisationCode_VHCR(2);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_4 =
	new SCCPCH_ChannelisationCode_VHCR(3);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_5 =
	new SCCPCH_ChannelisationCode_VHCR(4);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_6 =
	new SCCPCH_ChannelisationCode_VHCR(5);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_7 =
	new SCCPCH_ChannelisationCode_VHCR(6);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_8 =
	new SCCPCH_ChannelisationCode_VHCR(7);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_9 =
	new SCCPCH_ChannelisationCode_VHCR(8);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_10 =
	new SCCPCH_ChannelisationCode_VHCR(9);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_11 =
	new SCCPCH_ChannelisationCode_VHCR(10);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_12 =
	new SCCPCH_ChannelisationCode_VHCR(11);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_13 =
	new SCCPCH_ChannelisationCode_VHCR(12);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_14 =
	new SCCPCH_ChannelisationCode_VHCR(13);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_15 =
	new SCCPCH_ChannelisationCode_VHCR(14);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_16 =
	new SCCPCH_ChannelisationCode_VHCR(15);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_17 =
	new SCCPCH_ChannelisationCode_VHCR(16);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_18 =
	new SCCPCH_ChannelisationCode_VHCR(17);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_19 =
	new SCCPCH_ChannelisationCode_VHCR(18);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_20 =
	new SCCPCH_ChannelisationCode_VHCR(19);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_21 =
	new SCCPCH_ChannelisationCode_VHCR(20);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_22 =
	new SCCPCH_ChannelisationCode_VHCR(21);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_23 =
	new SCCPCH_ChannelisationCode_VHCR(22);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_24 =
	new SCCPCH_ChannelisationCode_VHCR(23);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_25 =
	new SCCPCH_ChannelisationCode_VHCR(24);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_26 =
	new SCCPCH_ChannelisationCode_VHCR(25);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_27 =
	new SCCPCH_ChannelisationCode_VHCR(26);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_28 =
	new SCCPCH_ChannelisationCode_VHCR(27);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_29 =
	new SCCPCH_ChannelisationCode_VHCR(28);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_30 =
	new SCCPCH_ChannelisationCode_VHCR(29);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_31 =
	new SCCPCH_ChannelisationCode_VHCR(30);
    public static final SCCPCH_ChannelisationCode_VHCR cc32_32 =
	new SCCPCH_ChannelisationCode_VHCR(31);
    private final static SCCPCH_ChannelisationCode_VHCR cNamedNumbers[] = {
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
    
    public static SCCPCH_ChannelisationCode_VHCR valueOf(long value)
    {
	return (SCCPCH_ChannelisationCode_VHCR)cc32_1.lookupValue(value);
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
	    "SCCPCH_ChannelisationCode_VHCR"
	),
	new QName (
	    "InformationElements",
	    "SCCPCH-ChannelisationCode-VHCR"
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
     * Get the type descriptor (TypeInfo) of 'this' SCCPCH_ChannelisationCode_VHCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SCCPCH_ChannelisationCode_VHCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SCCPCH_ChannelisationCode_VHCR
