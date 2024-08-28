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
 * Define the ASN1 Type T_319 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_319 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_319()
    {
	super(cFirstNumber);
    }
    
    protected T_319(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_319 ms80 =
	new T_319(0);
    public static final T_319 ms160 =
	new T_319(1);
    public static final T_319 ms320 =
	new T_319(2);
    public static final T_319 ms640 =
	new T_319(3);
    public static final T_319 ms1280 =
	new T_319(4);
    public static final T_319 ms2560 =
	new T_319(5);
    public static final T_319 ms5120 =
	new T_319(6);
    private final static T_319 cNamedNumbers[] = {
	 ms80, 
	 ms160, 
	 ms320, 
	 ms640, 
	 ms1280, 
	 ms2560, 
	 ms5120
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
    
    public static T_319 valueOf(long value)
    {
	return (T_319)ms80.lookupValue(value);
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
	    "T_319"
	),
	new QName (
	    "InformationElements",
	    "T-319"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms80",
		    0
		),
		new MemberListElement (
		    "ms160",
		    1
		),
		new MemberListElement (
		    "ms320",
		    2
		),
		new MemberListElement (
		    "ms640",
		    3
		),
		new MemberListElement (
		    "ms1280",
		    4
		),
		new MemberListElement (
		    "ms2560",
		    5
		),
		new MemberListElement (
		    "ms5120",
		    6
		)
	    }
	),
	0,
	ms80
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_319 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_319 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_319
