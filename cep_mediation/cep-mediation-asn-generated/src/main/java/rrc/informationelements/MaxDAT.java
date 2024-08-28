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
 * Define the ASN1 Type MaxDAT from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxDAT extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxDAT()
    {
	super(cFirstNumber);
    }
    
    protected MaxDAT(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxDAT dat1 =
	new MaxDAT(0);
    public static final MaxDAT dat2 =
	new MaxDAT(1);
    public static final MaxDAT dat3 =
	new MaxDAT(2);
    public static final MaxDAT dat4 =
	new MaxDAT(3);
    public static final MaxDAT dat5 =
	new MaxDAT(4);
    public static final MaxDAT dat6 =
	new MaxDAT(5);
    public static final MaxDAT dat7 =
	new MaxDAT(6);
    public static final MaxDAT dat8 =
	new MaxDAT(7);
    public static final MaxDAT dat9 =
	new MaxDAT(8);
    public static final MaxDAT dat10 =
	new MaxDAT(9);
    public static final MaxDAT dat15 =
	new MaxDAT(10);
    public static final MaxDAT dat20 =
	new MaxDAT(11);
    public static final MaxDAT dat25 =
	new MaxDAT(12);
    public static final MaxDAT dat30 =
	new MaxDAT(13);
    public static final MaxDAT dat35 =
	new MaxDAT(14);
    public static final MaxDAT dat40 =
	new MaxDAT(15);
    private final static MaxDAT cNamedNumbers[] = {
	 dat1, 
	 dat2, 
	 dat3, 
	 dat4, 
	 dat5, 
	 dat6, 
	 dat7, 
	 dat8, 
	 dat9, 
	 dat10, 
	 dat15, 
	 dat20, 
	 dat25, 
	 dat30, 
	 dat35, 
	 dat40
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
    
    public static MaxDAT valueOf(long value)
    {
	return (MaxDAT)dat1.lookupValue(value);
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
	    "MaxDAT"
	),
	new QName (
	    "InformationElements",
	    "MaxDAT"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dat1",
		    0
		),
		new MemberListElement (
		    "dat2",
		    1
		),
		new MemberListElement (
		    "dat3",
		    2
		),
		new MemberListElement (
		    "dat4",
		    3
		),
		new MemberListElement (
		    "dat5",
		    4
		),
		new MemberListElement (
		    "dat6",
		    5
		),
		new MemberListElement (
		    "dat7",
		    6
		),
		new MemberListElement (
		    "dat8",
		    7
		),
		new MemberListElement (
		    "dat9",
		    8
		),
		new MemberListElement (
		    "dat10",
		    9
		),
		new MemberListElement (
		    "dat15",
		    10
		),
		new MemberListElement (
		    "dat20",
		    11
		),
		new MemberListElement (
		    "dat25",
		    12
		),
		new MemberListElement (
		    "dat30",
		    13
		),
		new MemberListElement (
		    "dat35",
		    14
		),
		new MemberListElement (
		    "dat40",
		    15
		)
	    }
	),
	0,
	dat1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxDAT object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxDAT object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxDAT
