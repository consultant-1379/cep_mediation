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
 * Define the ASN1 Type T_301 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_301 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_301()
    {
	super(cFirstNumber);
    }
    
    protected T_301(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_301 ms100 =
	new T_301(0);
    public static final T_301 ms200 =
	new T_301(1);
    public static final T_301 ms400 =
	new T_301(2);
    public static final T_301 ms600 =
	new T_301(3);
    public static final T_301 ms800 =
	new T_301(4);
    public static final T_301 ms1000 =
	new T_301(5);
    public static final T_301 ms1200 =
	new T_301(6);
    public static final T_301 ms1400 =
	new T_301(7);
    public static final T_301 ms1600 =
	new T_301(8);
    public static final T_301 ms1800 =
	new T_301(9);
    public static final T_301 ms2000 =
	new T_301(10);
    public static final T_301 ms3000 =
	new T_301(11);
    public static final T_301 ms4000 =
	new T_301(12);
    public static final T_301 ms6000 =
	new T_301(13);
    public static final T_301 ms8000 =
	new T_301(14);
    public static final T_301 spare =
	new T_301(15);
    private final static T_301 cNamedNumbers[] = {
	 ms100, 
	 ms200, 
	 ms400, 
	 ms600, 
	 ms800, 
	 ms1000, 
	 ms1200, 
	 ms1400, 
	 ms1600, 
	 ms1800, 
	 ms2000, 
	 ms3000, 
	 ms4000, 
	 ms6000, 
	 ms8000, 
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
    
    public static T_301 valueOf(long value)
    {
	return (T_301)ms100.lookupValue(value);
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
	    "T_301"
	),
	new QName (
	    "InformationElements",
	    "T-301"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms100",
		    0
		),
		new MemberListElement (
		    "ms200",
		    1
		),
		new MemberListElement (
		    "ms400",
		    2
		),
		new MemberListElement (
		    "ms600",
		    3
		),
		new MemberListElement (
		    "ms800",
		    4
		),
		new MemberListElement (
		    "ms1000",
		    5
		),
		new MemberListElement (
		    "ms1200",
		    6
		),
		new MemberListElement (
		    "ms1400",
		    7
		),
		new MemberListElement (
		    "ms1600",
		    8
		),
		new MemberListElement (
		    "ms1800",
		    9
		),
		new MemberListElement (
		    "ms2000",
		    10
		),
		new MemberListElement (
		    "ms3000",
		    11
		),
		new MemberListElement (
		    "ms4000",
		    12
		),
		new MemberListElement (
		    "ms6000",
		    13
		),
		new MemberListElement (
		    "ms8000",
		    14
		),
		new MemberListElement (
		    "spare",
		    15
		)
	    }
	),
	0,
	ms100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_301 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_301 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_301
