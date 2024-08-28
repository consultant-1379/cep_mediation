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
 * Define the ASN1 Type MinimumSpreadingFactor from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MinimumSpreadingFactor extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MinimumSpreadingFactor()
    {
	super(cFirstNumber);
    }
    
    protected MinimumSpreadingFactor(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MinimumSpreadingFactor sf4 =
	new MinimumSpreadingFactor(0);
    public static final MinimumSpreadingFactor sf8 =
	new MinimumSpreadingFactor(1);
    public static final MinimumSpreadingFactor sf16 =
	new MinimumSpreadingFactor(2);
    public static final MinimumSpreadingFactor sf32 =
	new MinimumSpreadingFactor(3);
    public static final MinimumSpreadingFactor sf64 =
	new MinimumSpreadingFactor(4);
    public static final MinimumSpreadingFactor sf128 =
	new MinimumSpreadingFactor(5);
    public static final MinimumSpreadingFactor sf256 =
	new MinimumSpreadingFactor(6);
    private final static MinimumSpreadingFactor cNamedNumbers[] = {
	 sf4, 
	 sf8, 
	 sf16, 
	 sf32, 
	 sf64, 
	 sf128, 
	 sf256
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
    
    public static MinimumSpreadingFactor valueOf(long value)
    {
	return (MinimumSpreadingFactor)sf4.lookupValue(value);
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
	    "MinimumSpreadingFactor"
	),
	new QName (
	    "InformationElements",
	    "MinimumSpreadingFactor"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sf4",
		    0
		),
		new MemberListElement (
		    "sf8",
		    1
		),
		new MemberListElement (
		    "sf16",
		    2
		),
		new MemberListElement (
		    "sf32",
		    3
		),
		new MemberListElement (
		    "sf64",
		    4
		),
		new MemberListElement (
		    "sf128",
		    5
		),
		new MemberListElement (
		    "sf256",
		    6
		)
	    }
	),
	0,
	sf4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MinimumSpreadingFactor object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MinimumSpreadingFactor object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MinimumSpreadingFactor
