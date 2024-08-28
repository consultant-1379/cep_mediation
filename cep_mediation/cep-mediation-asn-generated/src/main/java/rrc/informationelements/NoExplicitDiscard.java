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
 * Define the ASN1 Type NoExplicitDiscard from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class NoExplicitDiscard extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NoExplicitDiscard()
    {
	super(cFirstNumber);
    }
    
    protected NoExplicitDiscard(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final NoExplicitDiscard dt10 =
	new NoExplicitDiscard(0);
    public static final NoExplicitDiscard dt20 =
	new NoExplicitDiscard(1);
    public static final NoExplicitDiscard dt30 =
	new NoExplicitDiscard(2);
    public static final NoExplicitDiscard dt40 =
	new NoExplicitDiscard(3);
    public static final NoExplicitDiscard dt50 =
	new NoExplicitDiscard(4);
    public static final NoExplicitDiscard dt60 =
	new NoExplicitDiscard(5);
    public static final NoExplicitDiscard dt70 =
	new NoExplicitDiscard(6);
    public static final NoExplicitDiscard dt80 =
	new NoExplicitDiscard(7);
    public static final NoExplicitDiscard dt90 =
	new NoExplicitDiscard(8);
    public static final NoExplicitDiscard dt100 =
	new NoExplicitDiscard(9);
    private final static NoExplicitDiscard cNamedNumbers[] = {
	 dt10, 
	 dt20, 
	 dt30, 
	 dt40, 
	 dt50, 
	 dt60, 
	 dt70, 
	 dt80, 
	 dt90, 
	 dt100
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
    
    public static NoExplicitDiscard valueOf(long value)
    {
	return (NoExplicitDiscard)dt10.lookupValue(value);
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
	    "NoExplicitDiscard"
	),
	new QName (
	    "InformationElements",
	    "NoExplicitDiscard"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dt10",
		    0
		),
		new MemberListElement (
		    "dt20",
		    1
		),
		new MemberListElement (
		    "dt30",
		    2
		),
		new MemberListElement (
		    "dt40",
		    3
		),
		new MemberListElement (
		    "dt50",
		    4
		),
		new MemberListElement (
		    "dt60",
		    5
		),
		new MemberListElement (
		    "dt70",
		    6
		),
		new MemberListElement (
		    "dt80",
		    7
		),
		new MemberListElement (
		    "dt90",
		    8
		),
		new MemberListElement (
		    "dt100",
		    9
		)
	    }
	),
	0,
	dt10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NoExplicitDiscard object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NoExplicitDiscard object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NoExplicitDiscard
