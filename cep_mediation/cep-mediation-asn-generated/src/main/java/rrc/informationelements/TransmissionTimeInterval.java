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
 * Define the ASN1 Type TransmissionTimeInterval from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TransmissionTimeInterval extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TransmissionTimeInterval()
    {
	super(cFirstNumber);
    }
    
    protected TransmissionTimeInterval(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TransmissionTimeInterval tti10 =
	new TransmissionTimeInterval(0);
    public static final TransmissionTimeInterval tti20 =
	new TransmissionTimeInterval(1);
    public static final TransmissionTimeInterval tti40 =
	new TransmissionTimeInterval(2);
    public static final TransmissionTimeInterval tti80 =
	new TransmissionTimeInterval(3);
    private final static TransmissionTimeInterval cNamedNumbers[] = {
	 tti10, 
	 tti20, 
	 tti40, 
	 tti80
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
    
    public static TransmissionTimeInterval valueOf(long value)
    {
	return (TransmissionTimeInterval)tti10.lookupValue(value);
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
	    "TransmissionTimeInterval"
	),
	new QName (
	    "InformationElements",
	    "TransmissionTimeInterval"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tti10",
		    0
		),
		new MemberListElement (
		    "tti20",
		    1
		),
		new MemberListElement (
		    "tti40",
		    2
		),
		new MemberListElement (
		    "tti80",
		    3
		)
	    }
	),
	0,
	tti10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransmissionTimeInterval object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransmissionTimeInterval object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransmissionTimeInterval
