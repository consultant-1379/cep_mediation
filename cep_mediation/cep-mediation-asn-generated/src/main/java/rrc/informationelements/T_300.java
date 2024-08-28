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
 * Define the ASN1 Type T_300 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_300 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_300()
    {
	super(cFirstNumber);
    }
    
    protected T_300(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_300 ms100 =
	new T_300(0);
    public static final T_300 ms200 =
	new T_300(1);
    public static final T_300 ms400 =
	new T_300(2);
    public static final T_300 ms600 =
	new T_300(3);
    public static final T_300 ms800 =
	new T_300(4);
    public static final T_300 ms1000 =
	new T_300(5);
    public static final T_300 ms1200 =
	new T_300(6);
    public static final T_300 ms1400 =
	new T_300(7);
    public static final T_300 ms1600 =
	new T_300(8);
    public static final T_300 ms1800 =
	new T_300(9);
    public static final T_300 ms2000 =
	new T_300(10);
    public static final T_300 ms3000 =
	new T_300(11);
    public static final T_300 ms4000 =
	new T_300(12);
    public static final T_300 ms6000 =
	new T_300(13);
    public static final T_300 ms8000 =
	new T_300(14);
    private final static T_300 cNamedNumbers[] = {
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
	 ms8000
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
    
    public static T_300 valueOf(long value)
    {
	return (T_300)ms100.lookupValue(value);
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
	    "T_300"
	),
	new QName (
	    "InformationElements",
	    "T-300"
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
		)
	    }
	),
	0,
	ms100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_300 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_300 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_300
