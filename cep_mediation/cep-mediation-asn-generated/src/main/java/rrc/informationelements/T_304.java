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
 * Define the ASN1 Type T_304 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_304 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_304()
    {
	super(cFirstNumber);
    }
    
    protected T_304(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_304 ms100 =
	new T_304(0);
    public static final T_304 ms200 =
	new T_304(1);
    public static final T_304 ms400 =
	new T_304(2);
    public static final T_304 ms1000 =
	new T_304(3);
    public static final T_304 ms2000 =
	new T_304(4);
    public static final T_304 spare3 =
	new T_304(5);
    public static final T_304 spare2 =
	new T_304(6);
    public static final T_304 spare1 =
	new T_304(7);
    private final static T_304 cNamedNumbers[] = {
	 ms100, 
	 ms200, 
	 ms400, 
	 ms1000, 
	 ms2000, 
	 spare3, 
	 spare2, 
	 spare1
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
    
    public static T_304 valueOf(long value)
    {
	return (T_304)ms100.lookupValue(value);
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
	    "T_304"
	),
	new QName (
	    "InformationElements",
	    "T-304"
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
		    "ms1000",
		    3
		),
		new MemberListElement (
		    "ms2000",
		    4
		),
		new MemberListElement (
		    "spare3",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	ms100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_304 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_304 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_304
