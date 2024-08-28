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
 * Define the ASN1 Type MinReduced_E_DPDCH_GainFactor from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MinReduced_E_DPDCH_GainFactor extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MinReduced_E_DPDCH_GainFactor()
    {
	super(cFirstNumber);
    }
    
    protected MinReduced_E_DPDCH_GainFactor(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MinReduced_E_DPDCH_GainFactor m8_15 =
	new MinReduced_E_DPDCH_GainFactor(0);
    public static final MinReduced_E_DPDCH_GainFactor m11_15 =
	new MinReduced_E_DPDCH_GainFactor(1);
    public static final MinReduced_E_DPDCH_GainFactor m15_15 =
	new MinReduced_E_DPDCH_GainFactor(2);
    public static final MinReduced_E_DPDCH_GainFactor m21_15 =
	new MinReduced_E_DPDCH_GainFactor(3);
    public static final MinReduced_E_DPDCH_GainFactor m30_15 =
	new MinReduced_E_DPDCH_GainFactor(4);
    public static final MinReduced_E_DPDCH_GainFactor m42_15 =
	new MinReduced_E_DPDCH_GainFactor(5);
    public static final MinReduced_E_DPDCH_GainFactor m60_15 =
	new MinReduced_E_DPDCH_GainFactor(6);
    public static final MinReduced_E_DPDCH_GainFactor m84_15 =
	new MinReduced_E_DPDCH_GainFactor(7);
    private final static MinReduced_E_DPDCH_GainFactor cNamedNumbers[] = {
	 m8_15, 
	 m11_15, 
	 m15_15, 
	 m21_15, 
	 m30_15, 
	 m42_15, 
	 m60_15, 
	 m84_15
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
    
    public static MinReduced_E_DPDCH_GainFactor valueOf(long value)
    {
	return (MinReduced_E_DPDCH_GainFactor)m8_15.lookupValue(value);
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
	    "MinReduced_E_DPDCH_GainFactor"
	),
	new QName (
	    "InformationElements",
	    "MinReduced-E-DPDCH-GainFactor"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "m8-15",
		    0
		),
		new MemberListElement (
		    "m11-15",
		    1
		),
		new MemberListElement (
		    "m15-15",
		    2
		),
		new MemberListElement (
		    "m21-15",
		    3
		),
		new MemberListElement (
		    "m30-15",
		    4
		),
		new MemberListElement (
		    "m42-15",
		    5
		),
		new MemberListElement (
		    "m60-15",
		    6
		),
		new MemberListElement (
		    "m84-15",
		    7
		)
	    }
	),
	0,
	m8_15
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MinReduced_E_DPDCH_GainFactor object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MinReduced_E_DPDCH_GainFactor object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MinReduced_E_DPDCH_GainFactor
