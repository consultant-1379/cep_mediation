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
 * Define the ASN1 Type ProtocolErrorCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ProtocolErrorCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ProtocolErrorCause()
    {
	super(cFirstNumber);
    }
    
    protected ProtocolErrorCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ProtocolErrorCause asn1_ViolationOrEncodingError =
	new ProtocolErrorCause(0);
    public static final ProtocolErrorCause messageTypeNonexistent =
	new ProtocolErrorCause(1);
    public static final ProtocolErrorCause messageNotCompatibleWithReceiverState =
	new ProtocolErrorCause(2);
    public static final ProtocolErrorCause ie_ValueNotComprehended =
	new ProtocolErrorCause(3);
    public static final ProtocolErrorCause informationElementMissing =
	new ProtocolErrorCause(4);
    public static final ProtocolErrorCause messageExtensionNotComprehended =
	new ProtocolErrorCause(5);
    public static final ProtocolErrorCause spare2 =
	new ProtocolErrorCause(6);
    public static final ProtocolErrorCause spare1 =
	new ProtocolErrorCause(7);
    private final static ProtocolErrorCause cNamedNumbers[] = {
	 asn1_ViolationOrEncodingError, 
	 messageTypeNonexistent, 
	 messageNotCompatibleWithReceiverState, 
	 ie_ValueNotComprehended, 
	 informationElementMissing, 
	 messageExtensionNotComprehended, 
	 spare2, 
	 spare1
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
    
    public static ProtocolErrorCause valueOf(long value)
    {
	return (ProtocolErrorCause)asn1_ViolationOrEncodingError.lookupValue(value);
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
	    "ProtocolErrorCause"
	),
	new QName (
	    "InformationElements",
	    "ProtocolErrorCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "asn1-ViolationOrEncodingError",
		    0
		),
		new MemberListElement (
		    "messageTypeNonexistent",
		    1
		),
		new MemberListElement (
		    "messageNotCompatibleWithReceiverState",
		    2
		),
		new MemberListElement (
		    "ie-ValueNotComprehended",
		    3
		),
		new MemberListElement (
		    "informationElementMissing",
		    4
		),
		new MemberListElement (
		    "messageExtensionNotComprehended",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	asn1_ViolationOrEncodingError
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ProtocolErrorCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProtocolErrorCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProtocolErrorCause
