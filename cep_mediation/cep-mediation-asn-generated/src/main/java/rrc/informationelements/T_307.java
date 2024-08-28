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
 * Define the ASN1 Type T_307 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_307 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_307()
    {
	super(cFirstNumber);
    }
    
    protected T_307(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_307 s5 =
	new T_307(0);
    public static final T_307 s10 =
	new T_307(1);
    public static final T_307 s15 =
	new T_307(2);
    public static final T_307 s20 =
	new T_307(3);
    public static final T_307 s30 =
	new T_307(4);
    public static final T_307 s40 =
	new T_307(5);
    public static final T_307 s50 =
	new T_307(6);
    public static final T_307 spare =
	new T_307(7);
    private final static T_307 cNamedNumbers[] = {
	 s5, 
	 s10, 
	 s15, 
	 s20, 
	 s30, 
	 s40, 
	 s50, 
	 spare
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
    
    public static T_307 valueOf(long value)
    {
	return (T_307)s5.lookupValue(value);
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
	    "T_307"
	),
	new QName (
	    "InformationElements",
	    "T-307"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "s5",
		    0
		),
		new MemberListElement (
		    "s10",
		    1
		),
		new MemberListElement (
		    "s15",
		    2
		),
		new MemberListElement (
		    "s20",
		    3
		),
		new MemberListElement (
		    "s30",
		    4
		),
		new MemberListElement (
		    "s40",
		    5
		),
		new MemberListElement (
		    "s50",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	s5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_307 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_307 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_307
