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
 * Define the ASN1 Type ReleaseCause from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReleaseCause extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReleaseCause()
    {
	super(cFirstNumber);
    }
    
    protected ReleaseCause(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReleaseCause normalEvent =
	new ReleaseCause(0);
    public static final ReleaseCause unspecified =
	new ReleaseCause(1);
    public static final ReleaseCause pre_emptiveRelease =
	new ReleaseCause(2);
    public static final ReleaseCause congestion =
	new ReleaseCause(3);
    public static final ReleaseCause re_establishmentReject =
	new ReleaseCause(4);
    public static final ReleaseCause directedsignallingconnectionre_establishment =
	new ReleaseCause(5);
    public static final ReleaseCause userInactivity =
	new ReleaseCause(6);
    public static final ReleaseCause spare =
	new ReleaseCause(7);
    private final static ReleaseCause cNamedNumbers[] = {
	 normalEvent, 
	 unspecified, 
	 pre_emptiveRelease, 
	 congestion, 
	 re_establishmentReject, 
	 directedsignallingconnectionre_establishment, 
	 userInactivity, 
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
    
    public static ReleaseCause valueOf(long value)
    {
	return (ReleaseCause)normalEvent.lookupValue(value);
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
	    "ReleaseCause"
	),
	new QName (
	    "InformationElements",
	    "ReleaseCause"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "normalEvent",
		    0
		),
		new MemberListElement (
		    "unspecified",
		    1
		),
		new MemberListElement (
		    "pre-emptiveRelease",
		    2
		),
		new MemberListElement (
		    "congestion",
		    3
		),
		new MemberListElement (
		    "re-establishmentReject",
		    4
		),
		new MemberListElement (
		    "directedsignallingconnectionre-establishment",
		    5
		),
		new MemberListElement (
		    "userInactivity",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	normalEvent
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReleaseCause object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReleaseCause object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReleaseCause
