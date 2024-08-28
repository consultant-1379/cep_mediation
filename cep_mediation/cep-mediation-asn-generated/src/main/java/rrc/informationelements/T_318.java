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
 * Define the ASN1 Type T_318 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_318 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_318()
    {
	super(cFirstNumber);
    }
    
    protected T_318(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_318 ms250 =
	new T_318(0);
    public static final T_318 ms500 =
	new T_318(1);
    public static final T_318 ms750 =
	new T_318(2);
    public static final T_318 ms1000 =
	new T_318(3);
    public static final T_318 ms1250 =
	new T_318(4);
    public static final T_318 ms1500 =
	new T_318(5);
    public static final T_318 ms1750 =
	new T_318(6);
    public static final T_318 ms2000 =
	new T_318(7);
    public static final T_318 ms3000 =
	new T_318(8);
    public static final T_318 ms4000 =
	new T_318(9);
    public static final T_318 ms6000 =
	new T_318(10);
    public static final T_318 ms8000 =
	new T_318(11);
    public static final T_318 ms10000 =
	new T_318(12);
    public static final T_318 ms12000 =
	new T_318(13);
    public static final T_318 ms16000 =
	new T_318(14);
    private final static T_318 cNamedNumbers[] = {
	 ms250, 
	 ms500, 
	 ms750, 
	 ms1000, 
	 ms1250, 
	 ms1500, 
	 ms1750, 
	 ms2000, 
	 ms3000, 
	 ms4000, 
	 ms6000, 
	 ms8000, 
	 ms10000, 
	 ms12000, 
	 ms16000
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
    
    public static T_318 valueOf(long value)
    {
	return (T_318)ms250.lookupValue(value);
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
	    "T_318"
	),
	new QName (
	    "InformationElements",
	    "T-318"
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
		),
		new MemberListElement (
		    "ms3000",
		    8
		),
		new MemberListElement (
		    "ms4000",
		    9
		),
		new MemberListElement (
		    "ms6000",
		    10
		),
		new MemberListElement (
		    "ms8000",
		    11
		),
		new MemberListElement (
		    "ms10000",
		    12
		),
		new MemberListElement (
		    "ms12000",
		    13
		),
		new MemberListElement (
		    "ms16000",
		    14
		)
	    }
	),
	0,
	ms250
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_318 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_318 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_318
