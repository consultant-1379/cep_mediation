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
 * Define the ASN1 Type EventIDIntraFreq from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EventIDIntraFreq extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EventIDIntraFreq()
    {
	super(cFirstNumber);
    }
    
    protected EventIDIntraFreq(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EventIDIntraFreq e1a =
	new EventIDIntraFreq(0);
    public static final EventIDIntraFreq e1b =
	new EventIDIntraFreq(1);
    public static final EventIDIntraFreq e1c =
	new EventIDIntraFreq(2);
    public static final EventIDIntraFreq e1d =
	new EventIDIntraFreq(3);
    public static final EventIDIntraFreq e1e =
	new EventIDIntraFreq(4);
    public static final EventIDIntraFreq e1f =
	new EventIDIntraFreq(5);
    public static final EventIDIntraFreq e1g =
	new EventIDIntraFreq(6);
    public static final EventIDIntraFreq e1h =
	new EventIDIntraFreq(7);
    public static final EventIDIntraFreq e1i =
	new EventIDIntraFreq(8);
    public static final EventIDIntraFreq e1j =
	new EventIDIntraFreq(9);
    public static final EventIDIntraFreq spare6 =
	new EventIDIntraFreq(10);
    public static final EventIDIntraFreq spare5 =
	new EventIDIntraFreq(11);
    public static final EventIDIntraFreq spare4 =
	new EventIDIntraFreq(12);
    public static final EventIDIntraFreq spare3 =
	new EventIDIntraFreq(13);
    public static final EventIDIntraFreq spare2 =
	new EventIDIntraFreq(14);
    public static final EventIDIntraFreq spare1 =
	new EventIDIntraFreq(15);
    private final static EventIDIntraFreq cNamedNumbers[] = {
	 e1a, 
	 e1b, 
	 e1c, 
	 e1d, 
	 e1e, 
	 e1f, 
	 e1g, 
	 e1h, 
	 e1i, 
	 e1j, 
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
    
    public static EventIDIntraFreq valueOf(long value)
    {
	return (EventIDIntraFreq)e1a.lookupValue(value);
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
	    "EventIDIntraFreq"
	),
	new QName (
	    "InformationElements",
	    "EventIDIntraFreq"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e1a",
		    0
		),
		new MemberListElement (
		    "e1b",
		    1
		),
		new MemberListElement (
		    "e1c",
		    2
		),
		new MemberListElement (
		    "e1d",
		    3
		),
		new MemberListElement (
		    "e1e",
		    4
		),
		new MemberListElement (
		    "e1f",
		    5
		),
		new MemberListElement (
		    "e1g",
		    6
		),
		new MemberListElement (
		    "e1h",
		    7
		),
		new MemberListElement (
		    "e1i",
		    8
		),
		new MemberListElement (
		    "e1j",
		    9
		),
		new MemberListElement (
		    "spare6",
		    10
		),
		new MemberListElement (
		    "spare5",
		    11
		),
		new MemberListElement (
		    "spare4",
		    12
		),
		new MemberListElement (
		    "spare3",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	e1a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventIDIntraFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventIDIntraFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventIDIntraFreq
