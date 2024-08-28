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
 * Define the ASN1 Type N_315_r5 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class N_315_r5 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private N_315_r5()
    {
	super(cFirstNumber);
    }
    
    protected N_315_r5(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final N_315_r5 s1 =
	new N_315_r5(0);
    public static final N_315_r5 s2 =
	new N_315_r5(1);
    public static final N_315_r5 s4 =
	new N_315_r5(2);
    public static final N_315_r5 s10 =
	new N_315_r5(3);
    public static final N_315_r5 s20 =
	new N_315_r5(4);
    public static final N_315_r5 s50 =
	new N_315_r5(5);
    public static final N_315_r5 s100 =
	new N_315_r5(6);
    public static final N_315_r5 s200 =
	new N_315_r5(7);
    public static final N_315_r5 s400 =
	new N_315_r5(8);
    public static final N_315_r5 s600 =
	new N_315_r5(9);
    public static final N_315_r5 s800 =
	new N_315_r5(10);
    public static final N_315_r5 s1000 =
	new N_315_r5(11);
    private final static N_315_r5 cNamedNumbers[] = {
	 s1, 
	 s2, 
	 s4, 
	 s10, 
	 s20, 
	 s50, 
	 s100, 
	 s200, 
	 s400, 
	 s600, 
	 s800, 
	 s1000
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
    
    public static N_315_r5 valueOf(long value)
    {
	return (N_315_r5)s1.lookupValue(value);
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
	    "N_315_r5"
	),
	new QName (
	    "InformationElements",
	    "N-315-r5"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s1",
		    0
		),
		new MemberListElement (
		    "s2",
		    1
		),
		new MemberListElement (
		    "s4",
		    2
		),
		new MemberListElement (
		    "s10",
		    3
		),
		new MemberListElement (
		    "s20",
		    4
		),
		new MemberListElement (
		    "s50",
		    5
		),
		new MemberListElement (
		    "s100",
		    6
		),
		new MemberListElement (
		    "s200",
		    7
		),
		new MemberListElement (
		    "s400",
		    8
		),
		new MemberListElement (
		    "s600",
		    9
		),
		new MemberListElement (
		    "s800",
		    10
		),
		new MemberListElement (
		    "s1000",
		    11
		)
	    }
	),
	0,
	s1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' N_315_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' N_315_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for N_315_r5
