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
 * Define the ASN1 Type RAT from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RAT extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RAT()
    {
	super(cFirstNumber);
    }
    
    protected RAT(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RAT utra_FDD =
	new RAT(0);
    public static final RAT utra_TDD =
	new RAT(1);
    public static final RAT gsm =
	new RAT(2);
    public static final RAT cdma2000 =
	new RAT(3);
    private final static RAT cNamedNumbers[] = {
	 utra_FDD, 
	 utra_TDD, 
	 gsm, 
	 cdma2000
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
    
    public static RAT valueOf(long value)
    {
	return (RAT)utra_FDD.lookupValue(value);
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
	    "RAT"
	),
	new QName (
	    "InformationElements",
	    "RAT"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "utra-FDD",
		    0
		),
		new MemberListElement (
		    "utra-TDD",
		    1
		),
		new MemberListElement (
		    "gsm",
		    2
		),
		new MemberListElement (
		    "cdma2000",
		    3
		)
	    }
	),
	0,
	utra_FDD
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RAT object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RAT object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RAT
