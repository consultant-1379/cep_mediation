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
 * Define the ASN1 Type Frequency_Band from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Frequency_Band extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Frequency_Band()
    {
	super(cFirstNumber);
    }
    
    protected Frequency_Band(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Frequency_Band dcs1800BandUsed =
	new Frequency_Band(0);
    public static final Frequency_Band pcs1900BandUsed =
	new Frequency_Band(1);
    private final static Frequency_Band cNamedNumbers[] = {
	 dcs1800BandUsed, 
	 pcs1900BandUsed
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
    
    public static Frequency_Band valueOf(long value)
    {
	return (Frequency_Band)dcs1800BandUsed.lookupValue(value);
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
	    "Frequency_Band"
	),
	new QName (
	    "InformationElements",
	    "Frequency-Band"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dcs1800BandUsed",
		    0
		),
		new MemberListElement (
		    "pcs1900BandUsed",
		    1
		)
	    }
	),
	0,
	dcs1800BandUsed
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Frequency_Band object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Frequency_Band object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Frequency_Band
