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
 * Define the ASN1 Type MaxNoBits from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNoBits extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNoBits()
    {
	super(cFirstNumber);
    }
    
    protected MaxNoBits(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNoBits b640 =
	new MaxNoBits(0);
    public static final MaxNoBits b1280 =
	new MaxNoBits(1);
    public static final MaxNoBits b2560 =
	new MaxNoBits(2);
    public static final MaxNoBits b3840 =
	new MaxNoBits(3);
    public static final MaxNoBits b5120 =
	new MaxNoBits(4);
    public static final MaxNoBits b6400 =
	new MaxNoBits(5);
    public static final MaxNoBits b7680 =
	new MaxNoBits(6);
    public static final MaxNoBits b8960 =
	new MaxNoBits(7);
    public static final MaxNoBits b10240 =
	new MaxNoBits(8);
    public static final MaxNoBits b20480 =
	new MaxNoBits(9);
    public static final MaxNoBits b40960 =
	new MaxNoBits(10);
    public static final MaxNoBits b81920 =
	new MaxNoBits(11);
    public static final MaxNoBits b163840 =
	new MaxNoBits(12);
    private final static MaxNoBits cNamedNumbers[] = {
	 b640, 
	 b1280, 
	 b2560, 
	 b3840, 
	 b5120, 
	 b6400, 
	 b7680, 
	 b8960, 
	 b10240, 
	 b20480, 
	 b40960, 
	 b81920, 
	 b163840
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
    
    public static MaxNoBits valueOf(long value)
    {
	return (MaxNoBits)b640.lookupValue(value);
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
	    "MaxNoBits"
	),
	new QName (
	    "InformationElements",
	    "MaxNoBits"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "b640",
		    0
		),
		new MemberListElement (
		    "b1280",
		    1
		),
		new MemberListElement (
		    "b2560",
		    2
		),
		new MemberListElement (
		    "b3840",
		    3
		),
		new MemberListElement (
		    "b5120",
		    4
		),
		new MemberListElement (
		    "b6400",
		    5
		),
		new MemberListElement (
		    "b7680",
		    6
		),
		new MemberListElement (
		    "b8960",
		    7
		),
		new MemberListElement (
		    "b10240",
		    8
		),
		new MemberListElement (
		    "b20480",
		    9
		),
		new MemberListElement (
		    "b40960",
		    10
		),
		new MemberListElement (
		    "b81920",
		    11
		),
		new MemberListElement (
		    "b163840",
		    12
		)
	    }
	),
	0,
	b640
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNoBits object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNoBits object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNoBits
