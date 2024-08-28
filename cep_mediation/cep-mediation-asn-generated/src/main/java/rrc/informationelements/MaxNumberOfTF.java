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
 * Define the ASN1 Type MaxNumberOfTF from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNumberOfTF extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNumberOfTF()
    {
	super(cFirstNumber);
    }
    
    protected MaxNumberOfTF(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNumberOfTF tf32 =
	new MaxNumberOfTF(0);
    public static final MaxNumberOfTF tf64 =
	new MaxNumberOfTF(1);
    public static final MaxNumberOfTF tf128 =
	new MaxNumberOfTF(2);
    public static final MaxNumberOfTF tf256 =
	new MaxNumberOfTF(3);
    public static final MaxNumberOfTF tf512 =
	new MaxNumberOfTF(4);
    public static final MaxNumberOfTF tf1024 =
	new MaxNumberOfTF(5);
    private final static MaxNumberOfTF cNamedNumbers[] = {
	 tf32, 
	 tf64, 
	 tf128, 
	 tf256, 
	 tf512, 
	 tf1024
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
    
    public static MaxNumberOfTF valueOf(long value)
    {
	return (MaxNumberOfTF)tf32.lookupValue(value);
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
	    "MaxNumberOfTF"
	),
	new QName (
	    "InformationElements",
	    "MaxNumberOfTF"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tf32",
		    0
		),
		new MemberListElement (
		    "tf64",
		    1
		),
		new MemberListElement (
		    "tf128",
		    2
		),
		new MemberListElement (
		    "tf256",
		    3
		),
		new MemberListElement (
		    "tf512",
		    4
		),
		new MemberListElement (
		    "tf1024",
		    5
		)
	    }
	),
	0,
	tf32
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNumberOfTF object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNumberOfTF object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNumberOfTF
