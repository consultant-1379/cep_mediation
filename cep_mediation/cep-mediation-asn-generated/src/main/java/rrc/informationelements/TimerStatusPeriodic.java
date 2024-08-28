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
 * Define the ASN1 Type TimerStatusPeriodic from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerStatusPeriodic extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerStatusPeriodic()
    {
	super(cFirstNumber);
    }
    
    protected TimerStatusPeriodic(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerStatusPeriodic tsp100 =
	new TimerStatusPeriodic(0);
    public static final TimerStatusPeriodic tsp200 =
	new TimerStatusPeriodic(1);
    public static final TimerStatusPeriodic tsp300 =
	new TimerStatusPeriodic(2);
    public static final TimerStatusPeriodic tsp400 =
	new TimerStatusPeriodic(3);
    public static final TimerStatusPeriodic tsp500 =
	new TimerStatusPeriodic(4);
    public static final TimerStatusPeriodic tsp750 =
	new TimerStatusPeriodic(5);
    public static final TimerStatusPeriodic tsp1000 =
	new TimerStatusPeriodic(6);
    public static final TimerStatusPeriodic tsp2000 =
	new TimerStatusPeriodic(7);
    private final static TimerStatusPeriodic cNamedNumbers[] = {
	 tsp100, 
	 tsp200, 
	 tsp300, 
	 tsp400, 
	 tsp500, 
	 tsp750, 
	 tsp1000, 
	 tsp2000
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
    
    public static TimerStatusPeriodic valueOf(long value)
    {
	return (TimerStatusPeriodic)tsp100.lookupValue(value);
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
	    "TimerStatusPeriodic"
	),
	new QName (
	    "InformationElements",
	    "TimerStatusPeriodic"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tsp100",
		    0
		),
		new MemberListElement (
		    "tsp200",
		    1
		),
		new MemberListElement (
		    "tsp300",
		    2
		),
		new MemberListElement (
		    "tsp400",
		    3
		),
		new MemberListElement (
		    "tsp500",
		    4
		),
		new MemberListElement (
		    "tsp750",
		    5
		),
		new MemberListElement (
		    "tsp1000",
		    6
		),
		new MemberListElement (
		    "tsp2000",
		    7
		)
	    }
	),
	0,
	tsp100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerStatusPeriodic object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerStatusPeriodic object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerStatusPeriodic
