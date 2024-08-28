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
 * Define the ASN1 Type SpreadingFactor from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SpreadingFactor extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SpreadingFactor()
    {
	super(cFirstNumber);
    }
    
    protected SpreadingFactor(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SpreadingFactor sf4 =
	new SpreadingFactor(0);
    public static final SpreadingFactor sf8 =
	new SpreadingFactor(1);
    public static final SpreadingFactor sf16 =
	new SpreadingFactor(2);
    public static final SpreadingFactor sf32 =
	new SpreadingFactor(3);
    public static final SpreadingFactor sf64 =
	new SpreadingFactor(4);
    public static final SpreadingFactor sf128 =
	new SpreadingFactor(5);
    public static final SpreadingFactor sf256 =
	new SpreadingFactor(6);
    private final static SpreadingFactor cNamedNumbers[] = {
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
    
    public static SpreadingFactor valueOf(long value)
    {
	return (SpreadingFactor)sf4.lookupValue(value);
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
	    "SpreadingFactor"
	),
	new QName (
	    "InformationElements",
	    "SpreadingFactor"
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
     * Get the type descriptor (TypeInfo) of 'this' SpreadingFactor object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SpreadingFactor object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SpreadingFactor
