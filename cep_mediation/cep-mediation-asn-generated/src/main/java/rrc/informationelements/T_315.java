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
 * Define the ASN1 Type T_315 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_315 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_315()
    {
	super(cFirstNumber);
    }
    
    protected T_315(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_315 s0 =
	new T_315(0);
    public static final T_315 s10 =
	new T_315(1);
    public static final T_315 s30 =
	new T_315(2);
    public static final T_315 s60 =
	new T_315(3);
    public static final T_315 s180 =
	new T_315(4);
    public static final T_315 s600 =
	new T_315(5);
    public static final T_315 s1200 =
	new T_315(6);
    public static final T_315 s1800 =
	new T_315(7);
    private final static T_315 cNamedNumbers[] = {
	 s0, 
	 s10, 
	 s30, 
	 s60, 
	 s180, 
	 s600, 
	 s1200, 
	 s1800
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
    
    public static T_315 valueOf(long value)
    {
	return (T_315)s0.lookupValue(value);
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
	    "T_315"
	),
	new QName (
	    "InformationElements",
	    "T-315"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s0",
		    0
		),
		new MemberListElement (
		    "s10",
		    1
		),
		new MemberListElement (
		    "s30",
		    2
		),
		new MemberListElement (
		    "s60",
		    3
		),
		new MemberListElement (
		    "s180",
		    4
		),
		new MemberListElement (
		    "s600",
		    5
		),
		new MemberListElement (
		    "s1200",
		    6
		),
		new MemberListElement (
		    "s1800",
		    7
		)
	    }
	),
	0,
	s0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_315 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_315 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_315
