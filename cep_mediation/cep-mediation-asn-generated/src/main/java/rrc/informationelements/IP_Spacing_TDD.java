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
 * Define the ASN1 Type IP_Spacing_TDD from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IP_Spacing_TDD extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IP_Spacing_TDD()
    {
	super(cFirstNumber);
    }
    
    protected IP_Spacing_TDD(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IP_Spacing_TDD e30 =
	new IP_Spacing_TDD(0);
    public static final IP_Spacing_TDD e40 =
	new IP_Spacing_TDD(1);
    public static final IP_Spacing_TDD e50 =
	new IP_Spacing_TDD(2);
    public static final IP_Spacing_TDD e70 =
	new IP_Spacing_TDD(3);
    public static final IP_Spacing_TDD e100 =
	new IP_Spacing_TDD(4);
    private final static IP_Spacing_TDD cNamedNumbers[] = {
	 e30, 
	 e40, 
	 e50, 
	 e70, 
	 e100
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
    
    public static IP_Spacing_TDD valueOf(long value)
    {
	return (IP_Spacing_TDD)e30.lookupValue(value);
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
	    "IP_Spacing_TDD"
	),
	new QName (
	    "InformationElements",
	    "IP-Spacing-TDD"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e30",
		    0
		),
		new MemberListElement (
		    "e40",
		    1
		),
		new MemberListElement (
		    "e50",
		    2
		),
		new MemberListElement (
		    "e70",
		    3
		),
		new MemberListElement (
		    "e100",
		    4
		)
	    }
	),
	0,
	e30
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IP_Spacing_TDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IP_Spacing_TDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IP_Spacing_TDD
