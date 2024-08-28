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
 * Define the ASN1 Type EventIDInterFreq from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EventIDInterFreq extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EventIDInterFreq()
    {
	super(cFirstNumber);
    }
    
    protected EventIDInterFreq(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EventIDInterFreq e2a =
	new EventIDInterFreq(0);
    public static final EventIDInterFreq e2b =
	new EventIDInterFreq(1);
    public static final EventIDInterFreq e2c =
	new EventIDInterFreq(2);
    public static final EventIDInterFreq e2d =
	new EventIDInterFreq(3);
    public static final EventIDInterFreq e2e =
	new EventIDInterFreq(4);
    public static final EventIDInterFreq e2f =
	new EventIDInterFreq(5);
    public static final EventIDInterFreq spare2 =
	new EventIDInterFreq(6);
    public static final EventIDInterFreq spare1 =
	new EventIDInterFreq(7);
    private final static EventIDInterFreq cNamedNumbers[] = {
	 e2a, 
	 e2b, 
	 e2c, 
	 e2d, 
	 e2e, 
	 e2f, 
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
    
    public static EventIDInterFreq valueOf(long value)
    {
	return (EventIDInterFreq)e2a.lookupValue(value);
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
	    "EventIDInterFreq"
	),
	new QName (
	    "InformationElements",
	    "EventIDInterFreq"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e2a",
		    0
		),
		new MemberListElement (
		    "e2b",
		    1
		),
		new MemberListElement (
		    "e2c",
		    2
		),
		new MemberListElement (
		    "e2d",
		    3
		),
		new MemberListElement (
		    "e2e",
		    4
		),
		new MemberListElement (
		    "e2f",
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
	e2a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventIDInterFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventIDInterFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventIDInterFreq
