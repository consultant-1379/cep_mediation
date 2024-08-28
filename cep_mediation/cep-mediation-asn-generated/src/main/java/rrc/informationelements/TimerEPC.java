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
 * Define the ASN1 Type TimerEPC from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerEPC extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerEPC()
    {
	super(cFirstNumber);
    }
    
    protected TimerEPC(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerEPC te50 =
	new TimerEPC(0);
    public static final TimerEPC te60 =
	new TimerEPC(1);
    public static final TimerEPC te70 =
	new TimerEPC(2);
    public static final TimerEPC te80 =
	new TimerEPC(3);
    public static final TimerEPC te90 =
	new TimerEPC(4);
    public static final TimerEPC te100 =
	new TimerEPC(5);
    public static final TimerEPC te120 =
	new TimerEPC(6);
    public static final TimerEPC te140 =
	new TimerEPC(7);
    public static final TimerEPC te160 =
	new TimerEPC(8);
    public static final TimerEPC te180 =
	new TimerEPC(9);
    public static final TimerEPC te200 =
	new TimerEPC(10);
    public static final TimerEPC te300 =
	new TimerEPC(11);
    public static final TimerEPC te400 =
	new TimerEPC(12);
    public static final TimerEPC te500 =
	new TimerEPC(13);
    public static final TimerEPC te700 =
	new TimerEPC(14);
    public static final TimerEPC te900 =
	new TimerEPC(15);
    private final static TimerEPC cNamedNumbers[] = {
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
    
    public static TimerEPC valueOf(long value)
    {
	return (TimerEPC)te50.lookupValue(value);
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
	    "TimerEPC"
	),
	new QName (
	    "InformationElements",
	    "TimerEPC"
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
     * Get the type descriptor (TypeInfo) of 'this' TimerEPC object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerEPC object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerEPC
