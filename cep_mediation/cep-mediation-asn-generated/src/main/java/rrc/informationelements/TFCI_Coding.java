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
 * Define the ASN1 Type TFCI_Coding from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TFCI_Coding extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TFCI_Coding()
    {
	super(cFirstNumber);
    }
    
    protected TFCI_Coding(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TFCI_Coding tfci_bits_4 =
	new TFCI_Coding(0);
    public static final TFCI_Coding tfci_bits_8 =
	new TFCI_Coding(1);
    public static final TFCI_Coding tfci_bits_16 =
	new TFCI_Coding(2);
    public static final TFCI_Coding tfci_bits_32 =
	new TFCI_Coding(3);
    private final static TFCI_Coding cNamedNumbers[] = {
	 tfci_bits_4, 
	 tfci_bits_8, 
	 tfci_bits_16, 
	 tfci_bits_32
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
    
    public static TFCI_Coding valueOf(long value)
    {
	return (TFCI_Coding)tfci_bits_4.lookupValue(value);
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
	    "TFCI_Coding"
	),
	new QName (
	    "InformationElements",
	    "TFCI-Coding"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tfci-bits-4",
		    0
		),
		new MemberListElement (
		    "tfci-bits-8",
		    1
		),
		new MemberListElement (
		    "tfci-bits-16",
		    2
		),
		new MemberListElement (
		    "tfci-bits-32",
		    3
		)
	    }
	),
	0,
	tfci_bits_4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TFCI_Coding object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCI_Coding object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCI_Coding
