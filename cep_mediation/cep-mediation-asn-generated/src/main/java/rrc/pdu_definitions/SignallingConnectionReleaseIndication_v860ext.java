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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type SignallingConnectionReleaseIndication_v860ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class SignallingConnectionReleaseIndication_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignallingConnectionReleaseIndication_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignallingConnectionReleaseIndication_v860ext(SignallingConnectionReleaseIndicationCause signallingConnectionReleaseIndicationCause)
    {
	setSignallingConnectionReleaseIndicationCause(signallingConnectionReleaseIndicationCause);
    }
    
    public void initComponents()
    {
	mComponents[0] = SignallingConnectionReleaseIndicationCause.uERequestedPSDataSessionEnd;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SignallingConnectionReleaseIndicationCause.uERequestedPSDataSessionEnd;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "signallingConnectionReleaseIndicationCause"
    public SignallingConnectionReleaseIndicationCause getSignallingConnectionReleaseIndicationCause()
    {
	return (SignallingConnectionReleaseIndicationCause)mComponents[0];
    }
    
    public void setSignallingConnectionReleaseIndicationCause(SignallingConnectionReleaseIndicationCause signallingConnectionReleaseIndicationCause)
    {
	mComponents[0] = signallingConnectionReleaseIndicationCause;
    }
    
    
    
    /**
     * Define the ASN1 Type SignallingConnectionReleaseIndicationCause from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SignallingConnectionReleaseIndicationCause extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SignallingConnectionReleaseIndicationCause()
	{
	    super(cFirstNumber);
	}
	
	protected SignallingConnectionReleaseIndicationCause(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SignallingConnectionReleaseIndicationCause uERequestedPSDataSessionEnd =
	    new SignallingConnectionReleaseIndicationCause(0);
	public static final SignallingConnectionReleaseIndicationCause anyOtherCause =
	    new SignallingConnectionReleaseIndicationCause(1);
	private final static SignallingConnectionReleaseIndicationCause cNamedNumbers[] = {
	     uERequestedPSDataSessionEnd, 
	     anyOtherCause
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
	
	public static SignallingConnectionReleaseIndicationCause valueOf(long value)
	{
	    return (SignallingConnectionReleaseIndicationCause)uERequestedPSDataSessionEnd.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"SignallingConnectionReleaseIndication_v860ext$SignallingConnectionReleaseIndicationCause"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"uERequestedPSDataSessionEnd",
			0
		    ),
		    new MemberListElement (
			"anyOtherCause",
			1
		    )
		}
	    ),
	    0,
	    uERequestedPSDataSessionEnd
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndicationCause object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndicationCause object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SignallingConnectionReleaseIndicationCause

    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "SignallingConnectionReleaseIndication_v860ext"
	),
	new QName (
	    "PDU-definitions",
	    "SignallingConnectionReleaseIndication-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "SignallingConnectionReleaseIndication_v860ext$SignallingConnectionReleaseIndicationCause"
			)
		    ),
		    "signallingConnectionReleaseIndicationCause",
		    0,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndication_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignallingConnectionReleaseIndication_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignallingConnectionReleaseIndication_v860ext
