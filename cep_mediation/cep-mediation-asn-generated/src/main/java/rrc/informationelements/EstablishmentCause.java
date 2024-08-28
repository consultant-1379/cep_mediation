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
 * Define the ASN1 Type EstablishmentCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EstablishmentCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EstablishmentCause()
    {
	super(cFirstNumber);
    }
    
    protected EstablishmentCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EstablishmentCause originatingConversationalCall =
	new EstablishmentCause(0);
    public static final EstablishmentCause originatingStreamingCall =
	new EstablishmentCause(1);
    public static final EstablishmentCause originatingInteractiveCall =
	new EstablishmentCause(2);
    public static final EstablishmentCause originatingBackgroundCall =
	new EstablishmentCause(3);
    public static final EstablishmentCause originatingSubscribedTrafficCall =
	new EstablishmentCause(4);
    public static final EstablishmentCause terminatingConversationalCall =
	new EstablishmentCause(5);
    public static final EstablishmentCause terminatingStreamingCall =
	new EstablishmentCause(6);
    public static final EstablishmentCause terminatingInteractiveCall =
	new EstablishmentCause(7);
    public static final EstablishmentCause terminatingBackgroundCall =
	new EstablishmentCause(8);
    public static final EstablishmentCause emergencyCall =
	new EstablishmentCause(9);
    public static final EstablishmentCause interRAT_CellReselection =
	new EstablishmentCause(10);
    public static final EstablishmentCause interRAT_CellChangeOrder =
	new EstablishmentCause(11);
    public static final EstablishmentCause registration =
	new EstablishmentCause(12);
    public static final EstablishmentCause detach =
	new EstablishmentCause(13);
    public static final EstablishmentCause originatingHighPrioritySignalling =
	new EstablishmentCause(14);
    public static final EstablishmentCause originatingLowPrioritySignalling =
	new EstablishmentCause(15);
    public static final EstablishmentCause callRe_establishment =
	new EstablishmentCause(16);
    public static final EstablishmentCause terminatingHighPrioritySignalling =
	new EstablishmentCause(17);
    public static final EstablishmentCause terminatingLowPrioritySignalling =
	new EstablishmentCause(18);
    public static final EstablishmentCause terminatingCauseUnknown =
	new EstablishmentCause(19);
    public static final EstablishmentCause mbms_Reception =
	new EstablishmentCause(20);
    public static final EstablishmentCause mbms_PTP_RB_Request =
	new EstablishmentCause(21);
    public static final EstablishmentCause delayTolerantAccess =
	new EstablishmentCause(22);
    public static final EstablishmentCause spare9 =
	new EstablishmentCause(23);
    public static final EstablishmentCause spare8 =
	new EstablishmentCause(24);
    public static final EstablishmentCause spare7 =
	new EstablishmentCause(25);
    public static final EstablishmentCause spare6 =
	new EstablishmentCause(26);
    public static final EstablishmentCause spare5 =
	new EstablishmentCause(27);
    public static final EstablishmentCause spare4 =
	new EstablishmentCause(28);
    public static final EstablishmentCause spare3 =
	new EstablishmentCause(29);
    public static final EstablishmentCause spare2 =
	new EstablishmentCause(30);
    public static final EstablishmentCause spare1 =
	new EstablishmentCause(31);
    private final static EstablishmentCause cNamedNumbers[] = {
	 originatingConversationalCall, 
	 originatingStreamingCall, 
	 originatingInteractiveCall, 
	 originatingBackgroundCall, 
	 originatingSubscribedTrafficCall, 
	 terminatingConversationalCall, 
	 terminatingStreamingCall, 
	 terminatingInteractiveCall, 
	 terminatingBackgroundCall, 
	 emergencyCall, 
	 interRAT_CellReselection, 
	 interRAT_CellChangeOrder, 
	 registration, 
	 detach, 
	 originatingHighPrioritySignalling, 
	 originatingLowPrioritySignalling, 
	 callRe_establishment, 
	 terminatingHighPrioritySignalling, 
	 terminatingLowPrioritySignalling, 
	 terminatingCauseUnknown, 
	 mbms_Reception, 
	 mbms_PTP_RB_Request, 
	 delayTolerantAccess, 
	 spare9, 
	 spare8, 
	 spare7, 
	 spare6, 
	 spare5, 
	 spare4, 
	 spare3, 
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
    
    public static EstablishmentCause valueOf(long value)
    {
	return (EstablishmentCause)originatingConversationalCall.lookupValue(value);
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
	    "EstablishmentCause"
	),
	new QName (
	    "InformationElements",
	    "EstablishmentCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "originatingConversationalCall",
		    0
		),
		new MemberListElement (
		    "originatingStreamingCall",
		    1
		),
		new MemberListElement (
		    "originatingInteractiveCall",
		    2
		),
		new MemberListElement (
		    "originatingBackgroundCall",
		    3
		),
		new MemberListElement (
		    "originatingSubscribedTrafficCall",
		    4
		),
		new MemberListElement (
		    "terminatingConversationalCall",
		    5
		),
		new MemberListElement (
		    "terminatingStreamingCall",
		    6
		),
		new MemberListElement (
		    "terminatingInteractiveCall",
		    7
		),
		new MemberListElement (
		    "terminatingBackgroundCall",
		    8
		),
		new MemberListElement (
		    "emergencyCall",
		    9
		),
		new MemberListElement (
		    "interRAT-CellReselection",
		    10
		),
		new MemberListElement (
		    "interRAT-CellChangeOrder",
		    11
		),
		new MemberListElement (
		    "registration",
		    12
		),
		new MemberListElement (
		    "detach",
		    13
		),
		new MemberListElement (
		    "originatingHighPrioritySignalling",
		    14
		),
		new MemberListElement (
		    "originatingLowPrioritySignalling",
		    15
		),
		new MemberListElement (
		    "callRe-establishment",
		    16
		),
		new MemberListElement (
		    "terminatingHighPrioritySignalling",
		    17
		),
		new MemberListElement (
		    "terminatingLowPrioritySignalling",
		    18
		),
		new MemberListElement (
		    "terminatingCauseUnknown",
		    19
		),
		new MemberListElement (
		    "mbms-Reception",
		    20
		),
		new MemberListElement (
		    "mbms-PTP-RB-Request",
		    21
		),
		new MemberListElement (
		    "delayTolerantAccess",
		    22
		),
		new MemberListElement (
		    "spare9",
		    23
		),
		new MemberListElement (
		    "spare8",
		    24
		),
		new MemberListElement (
		    "spare7",
		    25
		),
		new MemberListElement (
		    "spare6",
		    26
		),
		new MemberListElement (
		    "spare5",
		    27
		),
		new MemberListElement (
		    "spare4",
		    28
		),
		new MemberListElement (
		    "spare3",
		    29
		),
		new MemberListElement (
		    "spare2",
		    30
		),
		new MemberListElement (
		    "spare1",
		    31
		)
	    }
	),
	0,
	originatingConversationalCall
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EstablishmentCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EstablishmentCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EstablishmentCause
