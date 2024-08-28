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
 * Define the ASN1 Type TimerPollPeriodic from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerPollPeriodic extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerPollPeriodic()
    {
	super(cFirstNumber);
    }
    
    protected TimerPollPeriodic(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerPollPeriodic tper100 =
	new TimerPollPeriodic(0);
    public static final TimerPollPeriodic tper200 =
	new TimerPollPeriodic(1);
    public static final TimerPollPeriodic tper300 =
	new TimerPollPeriodic(2);
    public static final TimerPollPeriodic tper400 =
	new TimerPollPeriodic(3);
    public static final TimerPollPeriodic tper500 =
	new TimerPollPeriodic(4);
    public static final TimerPollPeriodic tper750 =
	new TimerPollPeriodic(5);
    public static final TimerPollPeriodic tper1000 =
	new TimerPollPeriodic(6);
    public static final TimerPollPeriodic tper2000 =
	new TimerPollPeriodic(7);
    private final static TimerPollPeriodic cNamedNumbers[] = {
	 tper100, 
	 tper200, 
	 tper300, 
	 tper400, 
	 tper500, 
	 tper750, 
	 tper1000, 
	 tper2000
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
    
    public static TimerPollPeriodic valueOf(long value)
    {
	return (TimerPollPeriodic)tper100.lookupValue(value);
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
	    "TimerPollPeriodic"
	),
	new QName (
	    "InformationElements",
	    "TimerPollPeriodic"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tper100",
		    0
		),
		new MemberListElement (
		    "tper200",
		    1
		),
		new MemberListElement (
		    "tper300",
		    2
		),
		new MemberListElement (
		    "tper400",
		    3
		),
		new MemberListElement (
		    "tper500",
		    4
		),
		new MemberListElement (
		    "tper750",
		    5
		),
		new MemberListElement (
		    "tper1000",
		    6
		),
		new MemberListElement (
		    "tper2000",
		    7
		)
	    }
	),
	0,
	tper100
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerPollPeriodic object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerPollPeriodic object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerPollPeriodic
