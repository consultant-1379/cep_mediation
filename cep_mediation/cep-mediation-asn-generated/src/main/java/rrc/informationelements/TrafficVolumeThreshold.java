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
 * Define the ASN1 Type TrafficVolumeThreshold from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TrafficVolumeThreshold extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TrafficVolumeThreshold()
    {
	super(cFirstNumber);
    }
    
    protected TrafficVolumeThreshold(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TrafficVolumeThreshold th8 =
	new TrafficVolumeThreshold(0);
    public static final TrafficVolumeThreshold th16 =
	new TrafficVolumeThreshold(1);
    public static final TrafficVolumeThreshold th32 =
	new TrafficVolumeThreshold(2);
    public static final TrafficVolumeThreshold th64 =
	new TrafficVolumeThreshold(3);
    public static final TrafficVolumeThreshold th128 =
	new TrafficVolumeThreshold(4);
    public static final TrafficVolumeThreshold th256 =
	new TrafficVolumeThreshold(5);
    public static final TrafficVolumeThreshold th512 =
	new TrafficVolumeThreshold(6);
    public static final TrafficVolumeThreshold th1024 =
	new TrafficVolumeThreshold(7);
    public static final TrafficVolumeThreshold th2k =
	new TrafficVolumeThreshold(8);
    public static final TrafficVolumeThreshold th3k =
	new TrafficVolumeThreshold(9);
    public static final TrafficVolumeThreshold th4k =
	new TrafficVolumeThreshold(10);
    public static final TrafficVolumeThreshold th6k =
	new TrafficVolumeThreshold(11);
    public static final TrafficVolumeThreshold th8k =
	new TrafficVolumeThreshold(12);
    public static final TrafficVolumeThreshold th12k =
	new TrafficVolumeThreshold(13);
    public static final TrafficVolumeThreshold th16k =
	new TrafficVolumeThreshold(14);
    public static final TrafficVolumeThreshold th24k =
	new TrafficVolumeThreshold(15);
    public static final TrafficVolumeThreshold th32k =
	new TrafficVolumeThreshold(16);
    public static final TrafficVolumeThreshold th48k =
	new TrafficVolumeThreshold(17);
    public static final TrafficVolumeThreshold th64k =
	new TrafficVolumeThreshold(18);
    public static final TrafficVolumeThreshold th96k =
	new TrafficVolumeThreshold(19);
    public static final TrafficVolumeThreshold th128k =
	new TrafficVolumeThreshold(20);
    public static final TrafficVolumeThreshold th192k =
	new TrafficVolumeThreshold(21);
    public static final TrafficVolumeThreshold th256k =
	new TrafficVolumeThreshold(22);
    public static final TrafficVolumeThreshold th384k =
	new TrafficVolumeThreshold(23);
    public static final TrafficVolumeThreshold th512k =
	new TrafficVolumeThreshold(24);
    public static final TrafficVolumeThreshold th768k =
	new TrafficVolumeThreshold(25);
    private final static TrafficVolumeThreshold cNamedNumbers[] = {
	 th8, 
	 th16, 
	 th32, 
	 th64, 
	 th128, 
	 th256, 
	 th512, 
	 th1024, 
	 th2k, 
	 th3k, 
	 th4k, 
	 th6k, 
	 th8k, 
	 th12k, 
	 th16k, 
	 th24k, 
	 th32k, 
	 th48k, 
	 th64k, 
	 th96k, 
	 th128k, 
	 th192k, 
	 th256k, 
	 th384k, 
	 th512k, 
	 th768k
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
    
    public static TrafficVolumeThreshold valueOf(long value)
    {
	return (TrafficVolumeThreshold)th8.lookupValue(value);
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
	    "TrafficVolumeThreshold"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeThreshold"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "th8",
		    0
		),
		new MemberListElement (
		    "th16",
		    1
		),
		new MemberListElement (
		    "th32",
		    2
		),
		new MemberListElement (
		    "th64",
		    3
		),
		new MemberListElement (
		    "th128",
		    4
		),
		new MemberListElement (
		    "th256",
		    5
		),
		new MemberListElement (
		    "th512",
		    6
		),
		new MemberListElement (
		    "th1024",
		    7
		),
		new MemberListElement (
		    "th2k",
		    8
		),
		new MemberListElement (
		    "th3k",
		    9
		),
		new MemberListElement (
		    "th4k",
		    10
		),
		new MemberListElement (
		    "th6k",
		    11
		),
		new MemberListElement (
		    "th8k",
		    12
		),
		new MemberListElement (
		    "th12k",
		    13
		),
		new MemberListElement (
		    "th16k",
		    14
		),
		new MemberListElement (
		    "th24k",
		    15
		),
		new MemberListElement (
		    "th32k",
		    16
		),
		new MemberListElement (
		    "th48k",
		    17
		),
		new MemberListElement (
		    "th64k",
		    18
		),
		new MemberListElement (
		    "th96k",
		    19
		),
		new MemberListElement (
		    "th128k",
		    20
		),
		new MemberListElement (
		    "th192k",
		    21
		),
		new MemberListElement (
		    "th256k",
		    22
		),
		new MemberListElement (
		    "th384k",
		    23
		),
		new MemberListElement (
		    "th512k",
		    24
		),
		new MemberListElement (
		    "th768k",
		    25
		)
	    }
	),
	0,
	th8
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeThreshold
