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
 * Define the ASN1 Type TimerMRW from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerMRW extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerMRW()
    {
	super(cFirstNumber);
    }
    
    protected TimerMRW(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerMRW te50 =
	new TimerMRW(0);
    public static final TimerMRW te60 =
	new TimerMRW(1);
    public static final TimerMRW te70 =
	new TimerMRW(2);
    public static final TimerMRW te80 =
	new TimerMRW(3);
    public static final TimerMRW te90 =
	new TimerMRW(4);
    public static final TimerMRW te100 =
	new TimerMRW(5);
    public static final TimerMRW te120 =
	new TimerMRW(6);
    public static final TimerMRW te140 =
	new TimerMRW(7);
    public static final TimerMRW te160 =
	new TimerMRW(8);
    public static final TimerMRW te180 =
	new TimerMRW(9);
    public static final TimerMRW te200 =
	new TimerMRW(10);
    public static final TimerMRW te300 =
	new TimerMRW(11);
    public static final TimerMRW te400 =
	new TimerMRW(12);
    public static final TimerMRW te500 =
	new TimerMRW(13);
    public static final TimerMRW te700 =
	new TimerMRW(14);
    public static final TimerMRW te900 =
	new TimerMRW(15);
    private final static TimerMRW cNamedNumbers[] = {
	 te50, 
	 te60, 
	 te70, 
	 te80, 
	 te90, 
	 te100, 
	 te120, 
	 te140, 
	 te160, 
	 te180, 
	 te200, 
	 te300, 
	 te400, 
	 te500, 
	 te700, 
	 te900
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
    
    public static TimerMRW valueOf(long value)
    {
	return (TimerMRW)te50.lookupValue(value);
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
	    "TimerMRW"
	),
	new QName (
	    "InformationElements",
	    "TimerMRW"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "te50",
		    0
		),
		new MemberListElement (
		    "te60",
		    1
		),
		new MemberListElement (
		    "te70",
		    2
		),
		new MemberListElement (
		    "te80",
		    3
		),
		new MemberListElement (
		    "te90",
		    4
		),
		new MemberListElement (
		    "te100",
		    5
		),
		new MemberListElement (
		    "te120",
		    6
		),
		new MemberListElement (
		    "te140",
		    7
		),
		new MemberListElement (
		    "te160",
		    8
		),
		new MemberListElement (
		    "te180",
		    9
		),
		new MemberListElement (
		    "te200",
		    10
		),
		new MemberListElement (
		    "te300",
		    11
		),
		new MemberListElement (
		    "te400",
		    12
		),
		new MemberListElement (
		    "te500",
		    13
		),
		new MemberListElement (
		    "te700",
		    14
		),
		new MemberListElement (
		    "te900",
		    15
		)
	    }
	),
	0,
	te50
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerMRW object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerMRW object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerMRW
