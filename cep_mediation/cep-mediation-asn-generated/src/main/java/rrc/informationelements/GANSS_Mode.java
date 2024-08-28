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
 * Define the ASN1 Type GANSS_Mode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class GANSS_Mode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private GANSS_Mode()
    {
	super(cFirstNumber);
    }
    
    protected GANSS_Mode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final GANSS_Mode networkBased =
	new GANSS_Mode(0);
    public static final GANSS_Mode uEBased =
	new GANSS_Mode(1);
    public static final GANSS_Mode both =
	new GANSS_Mode(2);
    public static final GANSS_Mode none =
	new GANSS_Mode(3);
    private final static GANSS_Mode cNamedNumbers[] = {
	 networkBased, 
	 uEBased, 
	 both, 
	 none
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
    
    public static GANSS_Mode valueOf(long value)
    {
	return (GANSS_Mode)networkBased.lookupValue(value);
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
	    "GANSS_Mode"
	),
	new QName (
	    "InformationElements",
	    "GANSS-Mode"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "networkBased",
		    0
		),
		new MemberListElement (
		    "uEBased",
		    1
		),
		new MemberListElement (
		    "both",
		    2
		),
		new MemberListElement (
		    "none",
		    3
		)
	    }
	),
	0,
	networkBased
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSS_Mode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSS_Mode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSS_Mode
