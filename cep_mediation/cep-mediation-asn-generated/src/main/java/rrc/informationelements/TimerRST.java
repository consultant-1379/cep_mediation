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
 * Define the ASN1 Type TimerRST from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerRST extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerRST()
    {
	super(cFirstNumber);
    }
    
    protected TimerRST(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerRST tr50 =
	new TimerRST(0);
    public static final TimerRST tr100 =
	new TimerRST(1);
    public static final TimerRST tr150 =
	new TimerRST(2);
    public static final TimerRST tr200 =
	new TimerRST(3);
    public static final TimerRST tr250 =
	new TimerRST(4);
    public static final TimerRST tr300 =
	new TimerRST(5);
    public static final TimerRST tr350 =
	new TimerRST(6);
    public static final TimerRST tr400 =
	new TimerRST(7);
    public static final TimerRST tr450 =
	new TimerRST(8);
    public static final TimerRST tr500 =
	new TimerRST(9);
    public static final TimerRST tr550 =
	new TimerRST(10);
    public static final TimerRST tr600 =
	new TimerRST(11);
    public static final TimerRST tr700 =
	new TimerRST(12);
    public static final TimerRST tr800 =
	new TimerRST(13);
    public static final TimerRST tr900 =
	new TimerRST(14);
    public static final TimerRST tr1000 =
	new TimerRST(15);
    private final static TimerRST cNamedNumbers[] = {
	 tr50, 
	 tr100, 
	 tr150, 
	 tr200, 
	 tr250, 
	 tr300, 
	 tr350, 
	 tr400, 
	 tr450, 
	 tr500, 
	 tr550, 
	 tr600, 
	 tr700, 
	 tr800, 
	 tr900, 
	 tr1000
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
    
    public static TimerRST valueOf(long value)
    {
	return (TimerRST)tr50.lookupValue(value);
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
	    "TimerRST"
	),
	new QName (
	    "InformationElements",
	    "TimerRST"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tr50",
		    0
		),
		new MemberListElement (
		    "tr100",
		    1
		),
		new MemberListElement (
		    "tr150",
		    2
		),
		new MemberListElement (
		    "tr200",
		    3
		),
		new MemberListElement (
		    "tr250",
		    4
		),
		new MemberListElement (
		    "tr300",
		    5
		),
		new MemberListElement (
		    "tr350",
		    6
		),
		new MemberListElement (
		    "tr400",
		    7
		),
		new MemberListElement (
		    "tr450",
		    8
		),
		new MemberListElement (
		    "tr500",
		    9
		),
		new MemberListElement (
		    "tr550",
		    10
		),
		new MemberListElement (
		    "tr600",
		    11
		),
		new MemberListElement (
		    "tr700",
		    12
		),
		new MemberListElement (
		    "tr800",
		    13
		),
		new MemberListElement (
		    "tr900",
		    14
		),
		new MemberListElement (
		    "tr1000",
		    15
		)
	    }
	),
	0,
	tr50
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerRST object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerRST object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerRST
