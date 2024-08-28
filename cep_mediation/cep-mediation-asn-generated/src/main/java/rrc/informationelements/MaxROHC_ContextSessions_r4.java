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
 * Define the ASN1 Type MaxROHC_ContextSessions_r4 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxROHC_ContextSessions_r4 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxROHC_ContextSessions_r4()
    {
	super(cFirstNumber);
    }
    
    protected MaxROHC_ContextSessions_r4(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxROHC_ContextSessions_r4 s2 =
	new MaxROHC_ContextSessions_r4(0);
    public static final MaxROHC_ContextSessions_r4 s4 =
	new MaxROHC_ContextSessions_r4(1);
    public static final MaxROHC_ContextSessions_r4 s8 =
	new MaxROHC_ContextSessions_r4(2);
    public static final MaxROHC_ContextSessions_r4 s12 =
	new MaxROHC_ContextSessions_r4(3);
    public static final MaxROHC_ContextSessions_r4 s16 =
	new MaxROHC_ContextSessions_r4(4);
    public static final MaxROHC_ContextSessions_r4 s24 =
	new MaxROHC_ContextSessions_r4(5);
    public static final MaxROHC_ContextSessions_r4 s32 =
	new MaxROHC_ContextSessions_r4(6);
    public static final MaxROHC_ContextSessions_r4 s48 =
	new MaxROHC_ContextSessions_r4(7);
    public static final MaxROHC_ContextSessions_r4 s64 =
	new MaxROHC_ContextSessions_r4(8);
    public static final MaxROHC_ContextSessions_r4 s128 =
	new MaxROHC_ContextSessions_r4(9);
    public static final MaxROHC_ContextSessions_r4 s256 =
	new MaxROHC_ContextSessions_r4(10);
    public static final MaxROHC_ContextSessions_r4 s512 =
	new MaxROHC_ContextSessions_r4(11);
    public static final MaxROHC_ContextSessions_r4 s1024 =
	new MaxROHC_ContextSessions_r4(12);
    public static final MaxROHC_ContextSessions_r4 s16384 =
	new MaxROHC_ContextSessions_r4(13);
    private final static MaxROHC_ContextSessions_r4 cNamedNumbers[] = {
	 s2, 
	 s4, 
	 s8, 
	 s12, 
	 s16, 
	 s24, 
	 s32, 
	 s48, 
	 s64, 
	 s128, 
	 s256, 
	 s512, 
	 s1024, 
	 s16384
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
    
    public static MaxROHC_ContextSessions_r4 valueOf(long value)
    {
	return (MaxROHC_ContextSessions_r4)s2.lookupValue(value);
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
	    "MaxROHC_ContextSessions_r4"
	),
	new QName (
	    "InformationElements",
	    "MaxROHC-ContextSessions-r4"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s2",
		    0
		),
		new MemberListElement (
		    "s4",
		    1
		),
		new MemberListElement (
		    "s8",
		    2
		),
		new MemberListElement (
		    "s12",
		    3
		),
		new MemberListElement (
		    "s16",
		    4
		),
		new MemberListElement (
		    "s24",
		    5
		),
		new MemberListElement (
		    "s32",
		    6
		),
		new MemberListElement (
		    "s48",
		    7
		),
		new MemberListElement (
		    "s64",
		    8
		),
		new MemberListElement (
		    "s128",
		    9
		),
		new MemberListElement (
		    "s256",
		    10
		),
		new MemberListElement (
		    "s512",
		    11
		),
		new MemberListElement (
		    "s1024",
		    12
		),
		new MemberListElement (
		    "s16384",
		    13
		)
	    }
	),
	0,
	s2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxROHC_ContextSessions_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxROHC_ContextSessions_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxROHC_ContextSessions_r4
