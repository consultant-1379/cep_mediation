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
 * Define the ASN1 Type ReceivingWindowSize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReceivingWindowSize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReceivingWindowSize()
    {
	super(cFirstNumber);
    }
    
    protected ReceivingWindowSize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReceivingWindowSize rw1 =
	new ReceivingWindowSize(0);
    public static final ReceivingWindowSize rw8 =
	new ReceivingWindowSize(1);
    public static final ReceivingWindowSize rw16 =
	new ReceivingWindowSize(2);
    public static final ReceivingWindowSize rw32 =
	new ReceivingWindowSize(3);
    public static final ReceivingWindowSize rw64 =
	new ReceivingWindowSize(4);
    public static final ReceivingWindowSize rw128 =
	new ReceivingWindowSize(5);
    public static final ReceivingWindowSize rw256 =
	new ReceivingWindowSize(6);
    public static final ReceivingWindowSize rw512 =
	new ReceivingWindowSize(7);
    public static final ReceivingWindowSize rw768 =
	new ReceivingWindowSize(8);
    public static final ReceivingWindowSize rw1024 =
	new ReceivingWindowSize(9);
    public static final ReceivingWindowSize rw1536 =
	new ReceivingWindowSize(10);
    public static final ReceivingWindowSize rw2047 =
	new ReceivingWindowSize(11);
    public static final ReceivingWindowSize rw2560 =
	new ReceivingWindowSize(12);
    public static final ReceivingWindowSize rw3072 =
	new ReceivingWindowSize(13);
    public static final ReceivingWindowSize rw3584 =
	new ReceivingWindowSize(14);
    public static final ReceivingWindowSize rw4095 =
	new ReceivingWindowSize(15);
    private final static ReceivingWindowSize cNamedNumbers[] = {
	 rw1, 
	 rw8, 
	 rw16, 
	 rw32, 
	 rw64, 
	 rw128, 
	 rw256, 
	 rw512, 
	 rw768, 
	 rw1024, 
	 rw1536, 
	 rw2047, 
	 rw2560, 
	 rw3072, 
	 rw3584, 
	 rw4095
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
    
    public static ReceivingWindowSize valueOf(long value)
    {
	return (ReceivingWindowSize)rw1.lookupValue(value);
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
	    "ReceivingWindowSize"
	),
	new QName (
	    "InformationElements",
	    "ReceivingWindowSize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "rw1",
		    0
		),
		new MemberListElement (
		    "rw8",
		    1
		),
		new MemberListElement (
		    "rw16",
		    2
		),
		new MemberListElement (
		    "rw32",
		    3
		),
		new MemberListElement (
		    "rw64",
		    4
		),
		new MemberListElement (
		    "rw128",
		    5
		),
		new MemberListElement (
		    "rw256",
		    6
		),
		new MemberListElement (
		    "rw512",
		    7
		),
		new MemberListElement (
		    "rw768",
		    8
		),
		new MemberListElement (
		    "rw1024",
		    9
		),
		new MemberListElement (
		    "rw1536",
		    10
		),
		new MemberListElement (
		    "rw2047",
		    11
		),
		new MemberListElement (
		    "rw2560",
		    12
		),
		new MemberListElement (
		    "rw3072",
		    13
		),
		new MemberListElement (
		    "rw3584",
		    14
		),
		new MemberListElement (
		    "rw4095",
		    15
		)
	    }
	),
	0,
	rw1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReceivingWindowSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReceivingWindowSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReceivingWindowSize
