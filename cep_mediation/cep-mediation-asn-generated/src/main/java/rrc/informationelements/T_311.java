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
 * Define the ASN1 Type T_311 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_311 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_311()
    {
	super(cFirstNumber);
    }
    
    protected T_311(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_311 ms250 =
	new T_311(0);
    public static final T_311 ms500 =
	new T_311(1);
    public static final T_311 ms750 =
	new T_311(2);
    public static final T_311 ms1000 =
	new T_311(3);
    public static final T_311 ms1250 =
	new T_311(4);
    public static final T_311 ms1500 =
	new T_311(5);
    public static final T_311 ms1750 =
	new T_311(6);
    public static final T_311 ms2000 =
	new T_311(7);
    private final static T_311 cNamedNumbers[] = {
	 ms250, 
	 ms500, 
	 ms750, 
	 ms1000, 
	 ms1250, 
	 ms1500, 
	 ms1750, 
	 ms2000
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
    
    public static T_311 valueOf(long value)
    {
	return (T_311)ms250.lookupValue(value);
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
	    "T_311"
	),
	new QName (
	    "InformationElements",
	    "T-311"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms250",
		    0
		),
		new MemberListElement (
		    "ms500",
		    1
		),
		new MemberListElement (
		    "ms750",
		    2
		),
		new MemberListElement (
		    "ms1000",
		    3
		),
		new MemberListElement (
		    "ms1250",
		    4
		),
		new MemberListElement (
		    "ms1500",
		    5
		),
		new MemberListElement (
		    "ms1750",
		    6
		),
		new MemberListElement (
		    "ms2000",
		    7
		)
	    }
	),
	0,
	ms250
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_311 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_311 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_311
