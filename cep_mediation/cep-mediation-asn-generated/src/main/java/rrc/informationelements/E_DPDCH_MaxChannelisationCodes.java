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
 * Define the ASN1 Type E_DPDCH_MaxChannelisationCodes from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class E_DPDCH_MaxChannelisationCodes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private E_DPDCH_MaxChannelisationCodes()
    {
	super(cFirstNumber);
    }
    
    protected E_DPDCH_MaxChannelisationCodes(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final E_DPDCH_MaxChannelisationCodes sf256 =
	new E_DPDCH_MaxChannelisationCodes(0);
    public static final E_DPDCH_MaxChannelisationCodes sf128 =
	new E_DPDCH_MaxChannelisationCodes(1);
    public static final E_DPDCH_MaxChannelisationCodes sf64 =
	new E_DPDCH_MaxChannelisationCodes(2);
    public static final E_DPDCH_MaxChannelisationCodes sf32 =
	new E_DPDCH_MaxChannelisationCodes(3);
    public static final E_DPDCH_MaxChannelisationCodes sf16 =
	new E_DPDCH_MaxChannelisationCodes(4);
    public static final E_DPDCH_MaxChannelisationCodes sf8 =
	new E_DPDCH_MaxChannelisationCodes(5);
    public static final E_DPDCH_MaxChannelisationCodes sf4 =
	new E_DPDCH_MaxChannelisationCodes(6);
    public static final E_DPDCH_MaxChannelisationCodes sf4x2 =
	new E_DPDCH_MaxChannelisationCodes(7);
    public static final E_DPDCH_MaxChannelisationCodes sf2x2 =
	new E_DPDCH_MaxChannelisationCodes(8);
    public static final E_DPDCH_MaxChannelisationCodes sf4x2_and_sf2x2 =
	new E_DPDCH_MaxChannelisationCodes(9);
    private final static E_DPDCH_MaxChannelisationCodes cNamedNumbers[] = {
	 sf256, 
	 sf128, 
	 sf64, 
	 sf32, 
	 sf16, 
	 sf8, 
	 sf4, 
	 sf4x2, 
	 sf2x2, 
	 sf4x2_and_sf2x2
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
    
    public static E_DPDCH_MaxChannelisationCodes valueOf(long value)
    {
	return (E_DPDCH_MaxChannelisationCodes)sf256.lookupValue(value);
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
	    "E_DPDCH_MaxChannelisationCodes"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-MaxChannelisationCodes"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sf256",
		    0
		),
		new MemberListElement (
		    "sf128",
		    1
		),
		new MemberListElement (
		    "sf64",
		    2
		),
		new MemberListElement (
		    "sf32",
		    3
		),
		new MemberListElement (
		    "sf16",
		    4
		),
		new MemberListElement (
		    "sf8",
		    5
		),
		new MemberListElement (
		    "sf4",
		    6
		),
		new MemberListElement (
		    "sf4x2",
		    7
		),
		new MemberListElement (
		    "sf2x2",
		    8
		),
		new MemberListElement (
		    "sf4x2-and-sf2x2",
		    9
		)
	    }
	),
	0,
	sf256
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_MaxChannelisationCodes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_MaxChannelisationCodes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_MaxChannelisationCodes
