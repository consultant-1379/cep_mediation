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
 * Define the ASN1 Type T_Barred from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_Barred extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_Barred()
    {
	super(cFirstNumber);
    }
    
    protected T_Barred(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_Barred s10 =
	new T_Barred(0);
    public static final T_Barred s20 =
	new T_Barred(1);
    public static final T_Barred s40 =
	new T_Barred(2);
    public static final T_Barred s80 =
	new T_Barred(3);
    public static final T_Barred s160 =
	new T_Barred(4);
    public static final T_Barred s320 =
	new T_Barred(5);
    public static final T_Barred s640 =
	new T_Barred(6);
    public static final T_Barred s1280 =
	new T_Barred(7);
    private final static T_Barred cNamedNumbers[] = {
	 s10, 
	 s20, 
	 s40, 
	 s80, 
	 s160, 
	 s320, 
	 s640, 
	 s1280
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
    
    public static T_Barred valueOf(long value)
    {
	return (T_Barred)s10.lookupValue(value);
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
	    "T_Barred"
	),
	new QName (
	    "InformationElements",
	    "T-Barred"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s10",
		    0
		),
		new MemberListElement (
		    "s20",
		    1
		),
		new MemberListElement (
		    "s40",
		    2
		),
		new MemberListElement (
		    "s80",
		    3
		),
		new MemberListElement (
		    "s160",
		    4
		),
		new MemberListElement (
		    "s320",
		    5
		),
		new MemberListElement (
		    "s640",
		    6
		),
		new MemberListElement (
		    "s1280",
		    7
		)
	    }
	),
	0,
	s10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_Barred object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_Barred object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_Barred
