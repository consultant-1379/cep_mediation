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
 * Define the ASN1 Type TimeToTrigger from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimeToTrigger extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimeToTrigger()
    {
	super(cFirstNumber);
    }
    
    protected TimeToTrigger(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimeToTrigger ttt0 =
	new TimeToTrigger(0);
    public static final TimeToTrigger ttt10 =
	new TimeToTrigger(1);
    public static final TimeToTrigger ttt20 =
	new TimeToTrigger(2);
    public static final TimeToTrigger ttt40 =
	new TimeToTrigger(3);
    public static final TimeToTrigger ttt60 =
	new TimeToTrigger(4);
    public static final TimeToTrigger ttt80 =
	new TimeToTrigger(5);
    public static final TimeToTrigger ttt100 =
	new TimeToTrigger(6);
    public static final TimeToTrigger ttt120 =
	new TimeToTrigger(7);
    public static final TimeToTrigger ttt160 =
	new TimeToTrigger(8);
    public static final TimeToTrigger ttt200 =
	new TimeToTrigger(9);
    public static final TimeToTrigger ttt240 =
	new TimeToTrigger(10);
    public static final TimeToTrigger tt320 =
	new TimeToTrigger(11);
    public static final TimeToTrigger ttt640 =
	new TimeToTrigger(12);
    public static final TimeToTrigger ttt1280 =
	new TimeToTrigger(13);
    public static final TimeToTrigger ttt2560 =
	new TimeToTrigger(14);
    public static final TimeToTrigger ttt5000 =
	new TimeToTrigger(15);
    private final static TimeToTrigger cNamedNumbers[] = {
	 ttt0, 
	 ttt10, 
	 ttt20, 
	 ttt40, 
	 ttt60, 
	 ttt80, 
	 ttt100, 
	 ttt120, 
	 ttt160, 
	 ttt200, 
	 ttt240, 
	 tt320, 
	 ttt640, 
	 ttt1280, 
	 ttt2560, 
	 ttt5000
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
    
    public static TimeToTrigger valueOf(long value)
    {
	return (TimeToTrigger)ttt0.lookupValue(value);
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
	    "TimeToTrigger"
	),
	new QName (
	    "InformationElements",
	    "TimeToTrigger"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ttt0",
		    0
		),
		new MemberListElement (
		    "ttt10",
		    1
		),
		new MemberListElement (
		    "ttt20",
		    2
		),
		new MemberListElement (
		    "ttt40",
		    3
		),
		new MemberListElement (
		    "ttt60",
		    4
		),
		new MemberListElement (
		    "ttt80",
		    5
		),
		new MemberListElement (
		    "ttt100",
		    6
		),
		new MemberListElement (
		    "ttt120",
		    7
		),
		new MemberListElement (
		    "ttt160",
		    8
		),
		new MemberListElement (
		    "ttt200",
		    9
		),
		new MemberListElement (
		    "ttt240",
		    10
		),
		new MemberListElement (
		    "tt320",
		    11
		),
		new MemberListElement (
		    "ttt640",
		    12
		),
		new MemberListElement (
		    "ttt1280",
		    13
		),
		new MemberListElement (
		    "ttt2560",
		    14
		),
		new MemberListElement (
		    "ttt5000",
		    15
		)
	    }
	),
	0,
	ttt0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimeToTrigger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeToTrigger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeToTrigger
