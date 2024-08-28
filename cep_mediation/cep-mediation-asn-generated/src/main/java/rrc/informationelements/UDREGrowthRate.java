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
 * Define the ASN1 Type UDREGrowthRate from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UDREGrowthRate extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UDREGrowthRate()
    {
	super(cFirstNumber);
    }
    
    protected UDREGrowthRate(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UDREGrowthRate growth_1_5 =
	new UDREGrowthRate(0);
    public static final UDREGrowthRate growth_2 =
	new UDREGrowthRate(1);
    public static final UDREGrowthRate growth_4 =
	new UDREGrowthRate(2);
    public static final UDREGrowthRate growth_6 =
	new UDREGrowthRate(3);
    public static final UDREGrowthRate growth_8 =
	new UDREGrowthRate(4);
    public static final UDREGrowthRate growth_10 =
	new UDREGrowthRate(5);
    public static final UDREGrowthRate growth_12 =
	new UDREGrowthRate(6);
    public static final UDREGrowthRate growth_16 =
	new UDREGrowthRate(7);
    private final static UDREGrowthRate cNamedNumbers[] = {
	 growth_1_5, 
	 growth_2, 
	 growth_4, 
	 growth_6, 
	 growth_8, 
	 growth_10, 
	 growth_12, 
	 growth_16
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
    
    public static UDREGrowthRate valueOf(long value)
    {
	return (UDREGrowthRate)growth_1_5.lookupValue(value);
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
	    "UDREGrowthRate"
	),
	new QName (
	    "InformationElements",
	    "UDREGrowthRate"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "growth-1-5",
		    0
		),
		new MemberListElement (
		    "growth-2",
		    1
		),
		new MemberListElement (
		    "growth-4",
		    2
		),
		new MemberListElement (
		    "growth-6",
		    3
		),
		new MemberListElement (
		    "growth-8",
		    4
		),
		new MemberListElement (
		    "growth-10",
		    5
		),
		new MemberListElement (
		    "growth-12",
		    6
		),
		new MemberListElement (
		    "growth-16",
		    7
		)
	    }
	),
	0,
	growth_1_5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UDREGrowthRate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UDREGrowthRate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UDREGrowthRate
