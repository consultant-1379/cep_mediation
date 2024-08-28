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
 * Define the ASN1 Type TimerOSD_r6 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TimerOSD_r6 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimerOSD_r6()
    {
	super(cFirstNumber);
    }
    
    protected TimerOSD_r6(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TimerOSD_r6 ms40 =
	new TimerOSD_r6(0);
    public static final TimerOSD_r6 ms80 =
	new TimerOSD_r6(1);
    public static final TimerOSD_r6 ms120 =
	new TimerOSD_r6(2);
    public static final TimerOSD_r6 ms160 =
	new TimerOSD_r6(3);
    public static final TimerOSD_r6 ms240 =
	new TimerOSD_r6(4);
    public static final TimerOSD_r6 ms320 =
	new TimerOSD_r6(5);
    public static final TimerOSD_r6 ms480 =
	new TimerOSD_r6(6);
    public static final TimerOSD_r6 ms640 =
	new TimerOSD_r6(7);
    public static final TimerOSD_r6 ms960 =
	new TimerOSD_r6(8);
    public static final TimerOSD_r6 ms1280 =
	new TimerOSD_r6(9);
    public static final TimerOSD_r6 ms1920 =
	new TimerOSD_r6(10);
    public static final TimerOSD_r6 ms2560 =
	new TimerOSD_r6(11);
    public static final TimerOSD_r6 ms3840 =
	new TimerOSD_r6(12);
    public static final TimerOSD_r6 ms5120 =
	new TimerOSD_r6(13);
    private final static TimerOSD_r6 cNamedNumbers[] = {
	 ms40, 
	 ms80, 
	 ms120, 
	 ms160, 
	 ms240, 
	 ms320, 
	 ms480, 
	 ms640, 
	 ms960, 
	 ms1280, 
	 ms1920, 
	 ms2560, 
	 ms3840, 
	 ms5120
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
    
    public static TimerOSD_r6 valueOf(long value)
    {
	return (TimerOSD_r6)ms40.lookupValue(value);
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
	    "TimerOSD_r6"
	),
	new QName (
	    "InformationElements",
	    "TimerOSD-r6"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms40",
		    0
		),
		new MemberListElement (
		    "ms80",
		    1
		),
		new MemberListElement (
		    "ms120",
		    2
		),
		new MemberListElement (
		    "ms160",
		    3
		),
		new MemberListElement (
		    "ms240",
		    4
		),
		new MemberListElement (
		    "ms320",
		    5
		),
		new MemberListElement (
		    "ms480",
		    6
		),
		new MemberListElement (
		    "ms640",
		    7
		),
		new MemberListElement (
		    "ms960",
		    8
		),
		new MemberListElement (
		    "ms1280",
		    9
		),
		new MemberListElement (
		    "ms1920",
		    10
		),
		new MemberListElement (
		    "ms2560",
		    11
		),
		new MemberListElement (
		    "ms3840",
		    12
		),
		new MemberListElement (
		    "ms5120",
		    13
		)
	    }
	),
	0,
	ms40
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimerOSD_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimerOSD_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimerOSD_r6
