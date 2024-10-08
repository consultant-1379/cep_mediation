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
 * Define the ASN1 Type MultipathIndicator from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MultipathIndicator extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MultipathIndicator()
    {
	super(cFirstNumber);
    }
    
    protected MultipathIndicator(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MultipathIndicator nm =
	new MultipathIndicator(0);
    public static final MultipathIndicator low =
	new MultipathIndicator(1);
    public static final MultipathIndicator medium =
	new MultipathIndicator(2);
    public static final MultipathIndicator high =
	new MultipathIndicator(3);
    private final static MultipathIndicator cNamedNumbers[] = {
	 nm, 
	 low, 
	 medium, 
	 high
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
    
    public static MultipathIndicator valueOf(long value)
    {
	return (MultipathIndicator)nm.lookupValue(value);
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
	    "MultipathIndicator"
	),
	new QName (
	    "InformationElements",
	    "MultipathIndicator"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "nm",
		    0
		),
		new MemberListElement (
		    "low",
		    1
		),
		new MemberListElement (
		    "medium",
		    2
		),
		new MemberListElement (
		    "high",
		    3
		)
	    }
	),
	0,
	nm
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MultipathIndicator object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultipathIndicator object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultipathIndicator
