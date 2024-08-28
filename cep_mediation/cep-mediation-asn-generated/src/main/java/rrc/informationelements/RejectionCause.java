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
 * Define the ASN1 Type RejectionCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RejectionCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RejectionCause()
    {
	super(cFirstNumber);
    }
    
    protected RejectionCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RejectionCause congestion =
	new RejectionCause(0);
    public static final RejectionCause unspecified =
	new RejectionCause(1);
    private final static RejectionCause cNamedNumbers[] = {
	 congestion, 
	 unspecified
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
    
    public static RejectionCause valueOf(long value)
    {
	return (RejectionCause)congestion.lookupValue(value);
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
	    "RejectionCause"
	),
	new QName (
	    "InformationElements",
	    "RejectionCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "congestion",
		    0
		),
		new MemberListElement (
		    "unspecified",
		    1
		)
	    }
	),
	0,
	congestion
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RejectionCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RejectionCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RejectionCause
