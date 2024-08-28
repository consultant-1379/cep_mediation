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
 * Define the ASN1 Type PagingCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PagingCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PagingCause()
    {
	super(cFirstNumber);
    }
    
    protected PagingCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PagingCause terminatingConversationalCall =
	new PagingCause(0);
    public static final PagingCause terminatingStreamingCall =
	new PagingCause(1);
    public static final PagingCause terminatingInteractiveCall =
	new PagingCause(2);
    public static final PagingCause terminatingBackgroundCall =
	new PagingCause(3);
    public static final PagingCause terminatingHighPrioritySignalling =
	new PagingCause(4);
    public static final PagingCause terminatingLowPrioritySignalling =
	new PagingCause(5);
    public static final PagingCause terminatingCauseUnknown =
	new PagingCause(6);
    public static final PagingCause spare =
	new PagingCause(7);
    private final static PagingCause cNamedNumbers[] = {
	 terminatingConversationalCall, 
	 terminatingStreamingCall, 
	 terminatingInteractiveCall, 
	 terminatingBackgroundCall, 
	 terminatingHighPrioritySignalling, 
	 terminatingLowPrioritySignalling, 
	 terminatingCauseUnknown, 
	 spare
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
    
    public static PagingCause valueOf(long value)
    {
	return (PagingCause)terminatingConversationalCall.lookupValue(value);
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
	    "PagingCause"
	),
	new QName (
	    "InformationElements",
	    "PagingCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "terminatingConversationalCall",
		    0
		),
		new MemberListElement (
		    "terminatingStreamingCall",
		    1
		),
		new MemberListElement (
		    "terminatingInteractiveCall",
		    2
		),
		new MemberListElement (
		    "terminatingBackgroundCall",
		    3
		),
		new MemberListElement (
		    "terminatingHighPrioritySignalling",
		    4
		),
		new MemberListElement (
		    "terminatingLowPrioritySignalling",
		    5
		),
		new MemberListElement (
		    "terminatingCauseUnknown",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	terminatingConversationalCall
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PagingCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PagingCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PagingCause
