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
 * Define the ASN1 Type MaxNumberOfTFC_UL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNumberOfTFC_UL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNumberOfTFC_UL()
    {
	super(cFirstNumber);
    }
    
    protected MaxNumberOfTFC_UL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNumberOfTFC_UL dummy1 =
	new MaxNumberOfTFC_UL(0);
    public static final MaxNumberOfTFC_UL dummy2 =
	new MaxNumberOfTFC_UL(1);
    public static final MaxNumberOfTFC_UL tfc16 =
	new MaxNumberOfTFC_UL(2);
    public static final MaxNumberOfTFC_UL tfc32 =
	new MaxNumberOfTFC_UL(3);
    public static final MaxNumberOfTFC_UL tfc48 =
	new MaxNumberOfTFC_UL(4);
    public static final MaxNumberOfTFC_UL tfc64 =
	new MaxNumberOfTFC_UL(5);
    public static final MaxNumberOfTFC_UL tfc96 =
	new MaxNumberOfTFC_UL(6);
    public static final MaxNumberOfTFC_UL tfc128 =
	new MaxNumberOfTFC_UL(7);
    public static final MaxNumberOfTFC_UL tfc256 =
	new MaxNumberOfTFC_UL(8);
    public static final MaxNumberOfTFC_UL tfc512 =
	new MaxNumberOfTFC_UL(9);
    public static final MaxNumberOfTFC_UL tfc1024 =
	new MaxNumberOfTFC_UL(10);
    private final static MaxNumberOfTFC_UL cNamedNumbers[] = {
	 dummy1, 
	 dummy2, 
	 tfc16, 
	 tfc32, 
	 tfc48, 
	 tfc64, 
	 tfc96, 
	 tfc128, 
	 tfc256, 
	 tfc512, 
	 tfc1024
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
    
    public static MaxNumberOfTFC_UL valueOf(long value)
    {
	return (MaxNumberOfTFC_UL)dummy1.lookupValue(value);
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
	    "MaxNumberOfTFC_UL"
	),
	new QName (
	    "InformationElements",
	    "MaxNumberOfTFC-UL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dummy1",
		    0
		),
		new MemberListElement (
		    "dummy2",
		    1
		),
		new MemberListElement (
		    "tfc16",
		    2
		),
		new MemberListElement (
		    "tfc32",
		    3
		),
		new MemberListElement (
		    "tfc48",
		    4
		),
		new MemberListElement (
		    "tfc64",
		    5
		),
		new MemberListElement (
		    "tfc96",
		    6
		),
		new MemberListElement (
		    "tfc128",
		    7
		),
		new MemberListElement (
		    "tfc256",
		    8
		),
		new MemberListElement (
		    "tfc512",
		    9
		),
		new MemberListElement (
		    "tfc1024",
		    10
		)
	    }
	),
	0,
	dummy1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNumberOfTFC_UL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNumberOfTFC_UL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNumberOfTFC_UL
