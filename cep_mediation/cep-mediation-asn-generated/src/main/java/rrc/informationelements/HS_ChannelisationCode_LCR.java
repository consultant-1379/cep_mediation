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
 * Define the ASN1 Type HS_ChannelisationCode_LCR from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HS_ChannelisationCode_LCR extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HS_ChannelisationCode_LCR()
    {
	super(cFirstNumber);
    }
    
    protected HS_ChannelisationCode_LCR(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HS_ChannelisationCode_LCR cc16_1 =
	new HS_ChannelisationCode_LCR(0);
    public static final HS_ChannelisationCode_LCR cc16_2 =
	new HS_ChannelisationCode_LCR(1);
    public static final HS_ChannelisationCode_LCR cc16_3 =
	new HS_ChannelisationCode_LCR(2);
    public static final HS_ChannelisationCode_LCR cc16_4 =
	new HS_ChannelisationCode_LCR(3);
    public static final HS_ChannelisationCode_LCR cc16_5 =
	new HS_ChannelisationCode_LCR(4);
    public static final HS_ChannelisationCode_LCR cc16_6 =
	new HS_ChannelisationCode_LCR(5);
    public static final HS_ChannelisationCode_LCR cc16_7 =
	new HS_ChannelisationCode_LCR(6);
    public static final HS_ChannelisationCode_LCR cc16_8 =
	new HS_ChannelisationCode_LCR(7);
    public static final HS_ChannelisationCode_LCR cc16_9 =
	new HS_ChannelisationCode_LCR(8);
    public static final HS_ChannelisationCode_LCR cc16_10 =
	new HS_ChannelisationCode_LCR(9);
    public static final HS_ChannelisationCode_LCR cc16_11 =
	new HS_ChannelisationCode_LCR(10);
    public static final HS_ChannelisationCode_LCR cc16_12 =
	new HS_ChannelisationCode_LCR(11);
    public static final HS_ChannelisationCode_LCR cc16_13 =
	new HS_ChannelisationCode_LCR(12);
    public static final HS_ChannelisationCode_LCR cc16_14 =
	new HS_ChannelisationCode_LCR(13);
    public static final HS_ChannelisationCode_LCR cc16_15 =
	new HS_ChannelisationCode_LCR(14);
    public static final HS_ChannelisationCode_LCR cc16_16 =
	new HS_ChannelisationCode_LCR(15);
    private final static HS_ChannelisationCode_LCR cNamedNumbers[] = {
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
    
    public static HS_ChannelisationCode_LCR valueOf(long value)
    {
	return (HS_ChannelisationCode_LCR)cc16_1.lookupValue(value);
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
	    "HS_ChannelisationCode_LCR"
	),
	new QName (
	    "InformationElements",
	    "HS-ChannelisationCode-LCR"
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
     * Get the type descriptor (TypeInfo) of 'this' HS_ChannelisationCode_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_ChannelisationCode_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_ChannelisationCode_LCR
