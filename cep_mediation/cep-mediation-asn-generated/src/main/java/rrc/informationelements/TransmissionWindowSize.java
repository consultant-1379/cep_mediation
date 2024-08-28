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
 * Define the ASN1 Type TransmissionWindowSize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TransmissionWindowSize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TransmissionWindowSize()
    {
	super(cFirstNumber);
    }
    
    protected TransmissionWindowSize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TransmissionWindowSize tw1 =
	new TransmissionWindowSize(0);
    public static final TransmissionWindowSize tw8 =
	new TransmissionWindowSize(1);
    public static final TransmissionWindowSize tw16 =
	new TransmissionWindowSize(2);
    public static final TransmissionWindowSize tw32 =
	new TransmissionWindowSize(3);
    public static final TransmissionWindowSize tw64 =
	new TransmissionWindowSize(4);
    public static final TransmissionWindowSize tw128 =
	new TransmissionWindowSize(5);
    public static final TransmissionWindowSize tw256 =
	new TransmissionWindowSize(6);
    public static final TransmissionWindowSize tw512 =
	new TransmissionWindowSize(7);
    public static final TransmissionWindowSize tw768 =
	new TransmissionWindowSize(8);
    public static final TransmissionWindowSize tw1024 =
	new TransmissionWindowSize(9);
    public static final TransmissionWindowSize tw1536 =
	new TransmissionWindowSize(10);
    public static final TransmissionWindowSize tw2047 =
	new TransmissionWindowSize(11);
    public static final TransmissionWindowSize tw2560 =
	new TransmissionWindowSize(12);
    public static final TransmissionWindowSize tw3072 =
	new TransmissionWindowSize(13);
    public static final TransmissionWindowSize tw3584 =
	new TransmissionWindowSize(14);
    public static final TransmissionWindowSize tw4095 =
	new TransmissionWindowSize(15);
    private final static TransmissionWindowSize cNamedNumbers[] = {
	 tw1, 
	 tw8, 
	 tw16, 
	 tw32, 
	 tw64, 
	 tw128, 
	 tw256, 
	 tw512, 
	 tw768, 
	 tw1024, 
	 tw1536, 
	 tw2047, 
	 tw2560, 
	 tw3072, 
	 tw3584, 
	 tw4095
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
    
    public static TransmissionWindowSize valueOf(long value)
    {
	return (TransmissionWindowSize)tw1.lookupValue(value);
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
	    "TransmissionWindowSize"
	),
	new QName (
	    "InformationElements",
	    "TransmissionWindowSize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tw1",
		    0
		),
		new MemberListElement (
		    "tw8",
		    1
		),
		new MemberListElement (
		    "tw16",
		    2
		),
		new MemberListElement (
		    "tw32",
		    3
		),
		new MemberListElement (
		    "tw64",
		    4
		),
		new MemberListElement (
		    "tw128",
		    5
		),
		new MemberListElement (
		    "tw256",
		    6
		),
		new MemberListElement (
		    "tw512",
		    7
		),
		new MemberListElement (
		    "tw768",
		    8
		),
		new MemberListElement (
		    "tw1024",
		    9
		),
		new MemberListElement (
		    "tw1536",
		    10
		),
		new MemberListElement (
		    "tw2047",
		    11
		),
		new MemberListElement (
		    "tw2560",
		    12
		),
		new MemberListElement (
		    "tw3072",
		    13
		),
		new MemberListElement (
		    "tw3584",
		    14
		),
		new MemberListElement (
		    "tw4095",
		    15
		)
	    }
	),
	0,
	tw1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransmissionWindowSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransmissionWindowSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransmissionWindowSize
