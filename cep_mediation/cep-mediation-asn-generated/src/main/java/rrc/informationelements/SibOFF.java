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
 * Define the ASN1 Type SibOFF from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SibOFF extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SibOFF()
    {
	super(cFirstNumber);
    }
    
    protected SibOFF(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SibOFF so2 =
	new SibOFF(0);
    public static final SibOFF so4 =
	new SibOFF(1);
    public static final SibOFF so6 =
	new SibOFF(2);
    public static final SibOFF so8 =
	new SibOFF(3);
    public static final SibOFF so10 =
	new SibOFF(4);
    public static final SibOFF so12 =
	new SibOFF(5);
    public static final SibOFF so14 =
	new SibOFF(6);
    public static final SibOFF so16 =
	new SibOFF(7);
    public static final SibOFF so18 =
	new SibOFF(8);
    public static final SibOFF so20 =
	new SibOFF(9);
    public static final SibOFF so22 =
	new SibOFF(10);
    public static final SibOFF so24 =
	new SibOFF(11);
    public static final SibOFF so26 =
	new SibOFF(12);
    public static final SibOFF so28 =
	new SibOFF(13);
    public static final SibOFF so30 =
	new SibOFF(14);
    public static final SibOFF so32 =
	new SibOFF(15);
    private final static SibOFF cNamedNumbers[] = {
	 so2, 
	 so4, 
	 so6, 
	 so8, 
	 so10, 
	 so12, 
	 so14, 
	 so16, 
	 so18, 
	 so20, 
	 so22, 
	 so24, 
	 so26, 
	 so28, 
	 so30, 
	 so32
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
    
    public static SibOFF valueOf(long value)
    {
	return (SibOFF)so2.lookupValue(value);
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
	    "SibOFF"
	),
	new QName (
	    "InformationElements",
	    "SibOFF"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "so2",
		    0
		),
		new MemberListElement (
		    "so4",
		    1
		),
		new MemberListElement (
		    "so6",
		    2
		),
		new MemberListElement (
		    "so8",
		    3
		),
		new MemberListElement (
		    "so10",
		    4
		),
		new MemberListElement (
		    "so12",
		    5
		),
		new MemberListElement (
		    "so14",
		    6
		),
		new MemberListElement (
		    "so16",
		    7
		),
		new MemberListElement (
		    "so18",
		    8
		),
		new MemberListElement (
		    "so20",
		    9
		),
		new MemberListElement (
		    "so22",
		    10
		),
		new MemberListElement (
		    "so24",
		    11
		),
		new MemberListElement (
		    "so26",
		    12
		),
		new MemberListElement (
		    "so28",
		    13
		),
		new MemberListElement (
		    "so30",
		    14
		),
		new MemberListElement (
		    "so32",
		    15
		)
	    }
	),
	0,
	so2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SibOFF object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SibOFF object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SibOFF
