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
 * Define the ASN1 Type TimerDiscard from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerDiscard extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerDiscard()
    {
	super(cFirstNumber);
    }
    
    protected TimerDiscard(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerDiscard td0_1 =
	new TimerDiscard(0);
    public static final TimerDiscard td0_25 =
	new TimerDiscard(1);
    public static final TimerDiscard td0_5 =
	new TimerDiscard(2);
    public static final TimerDiscard td0_75 =
	new TimerDiscard(3);
    public static final TimerDiscard td1 =
	new TimerDiscard(4);
    public static final TimerDiscard td1_25 =
	new TimerDiscard(5);
    public static final TimerDiscard td1_5 =
	new TimerDiscard(6);
    public static final TimerDiscard td1_75 =
	new TimerDiscard(7);
    public static final TimerDiscard td2 =
	new TimerDiscard(8);
    public static final TimerDiscard td2_5 =
	new TimerDiscard(9);
    public static final TimerDiscard td3 =
	new TimerDiscard(10);
    public static final TimerDiscard td3_5 =
	new TimerDiscard(11);
    public static final TimerDiscard td4 =
	new TimerDiscard(12);
    public static final TimerDiscard td4_5 =
	new TimerDiscard(13);
    public static final TimerDiscard td5 =
	new TimerDiscard(14);
    public static final TimerDiscard td7_5 =
	new TimerDiscard(15);
    private final static TimerDiscard cNamedNumbers[] = {
	 td0_1, 
	 td0_25, 
	 td0_5, 
	 td0_75, 
	 td1, 
	 td1_25, 
	 td1_5, 
	 td1_75, 
	 td2, 
	 td2_5, 
	 td3, 
	 td3_5, 
	 td4, 
	 td4_5, 
	 td5, 
	 td7_5
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
    
    public static TimerDiscard valueOf(long value)
    {
	return (TimerDiscard)td0_1.lookupValue(value);
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
	    "TimerDiscard"
	),
	new QName (
	    "InformationElements",
	    "TimerDiscard"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "td0-1",
		    0
		),
		new MemberListElement (
		    "td0-25",
		    1
		),
		new MemberListElement (
		    "td0-5",
		    2
		),
		new MemberListElement (
		    "td0-75",
		    3
		),
		new MemberListElement (
		    "td1",
		    4
		),
		new MemberListElement (
		    "td1-25",
		    5
		),
		new MemberListElement (
		    "td1-5",
		    6
		),
		new MemberListElement (
		    "td1-75",
		    7
		),
		new MemberListElement (
		    "td2",
		    8
		),
		new MemberListElement (
		    "td2-5",
		    9
		),
		new MemberListElement (
		    "td3",
		    10
		),
		new MemberListElement (
		    "td3-5",
		    11
		),
		new MemberListElement (
		    "td4",
		    12
		),
		new MemberListElement (
		    "td4-5",
		    13
		),
		new MemberListElement (
		    "td5",
		    14
		),
		new MemberListElement (
		    "td7-5",
		    15
		)
	    }
	),
	0,
	td0_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerDiscard object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerDiscard object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerDiscard
