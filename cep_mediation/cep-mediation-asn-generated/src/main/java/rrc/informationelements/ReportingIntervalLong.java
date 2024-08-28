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
 * Define the ASN1 Type ReportingIntervalLong from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReportingIntervalLong extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReportingIntervalLong()
    {
	super(cFirstNumber);
    }
    
    protected ReportingIntervalLong(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReportingIntervalLong ril0 =
	new ReportingIntervalLong(0);
    public static final ReportingIntervalLong ril0_25 =
	new ReportingIntervalLong(1);
    public static final ReportingIntervalLong ril0_5 =
	new ReportingIntervalLong(2);
    public static final ReportingIntervalLong ril1 =
	new ReportingIntervalLong(3);
    public static final ReportingIntervalLong ril2 =
	new ReportingIntervalLong(4);
    public static final ReportingIntervalLong ril3 =
	new ReportingIntervalLong(5);
    public static final ReportingIntervalLong ril4 =
	new ReportingIntervalLong(6);
    public static final ReportingIntervalLong ril6 =
	new ReportingIntervalLong(7);
    public static final ReportingIntervalLong ril8 =
	new ReportingIntervalLong(8);
    public static final ReportingIntervalLong ril12 =
	new ReportingIntervalLong(9);
    public static final ReportingIntervalLong ril16 =
	new ReportingIntervalLong(10);
    public static final ReportingIntervalLong ril20 =
	new ReportingIntervalLong(11);
    public static final ReportingIntervalLong ril24 =
	new ReportingIntervalLong(12);
    public static final ReportingIntervalLong ril28 =
	new ReportingIntervalLong(13);
    public static final ReportingIntervalLong ril32 =
	new ReportingIntervalLong(14);
    public static final ReportingIntervalLong ril64 =
	new ReportingIntervalLong(15);
    private final static ReportingIntervalLong cNamedNumbers[] = {
	 ril0, 
	 ril0_25, 
	 ril0_5, 
	 ril1, 
	 ril2, 
	 ril3, 
	 ril4, 
	 ril6, 
	 ril8, 
	 ril12, 
	 ril16, 
	 ril20, 
	 ril24, 
	 ril28, 
	 ril32, 
	 ril64
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
    
    public static ReportingIntervalLong valueOf(long value)
    {
	return (ReportingIntervalLong)ril0.lookupValue(value);
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
	    "ReportingIntervalLong"
	),
	new QName (
	    "InformationElements",
	    "ReportingIntervalLong"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ril0",
		    0
		),
		new MemberListElement (
		    "ril0-25",
		    1
		),
		new MemberListElement (
		    "ril0-5",
		    2
		),
		new MemberListElement (
		    "ril1",
		    3
		),
		new MemberListElement (
		    "ril2",
		    4
		),
		new MemberListElement (
		    "ril3",
		    5
		),
		new MemberListElement (
		    "ril4",
		    6
		),
		new MemberListElement (
		    "ril6",
		    7
		),
		new MemberListElement (
		    "ril8",
		    8
		),
		new MemberListElement (
		    "ril12",
		    9
		),
		new MemberListElement (
		    "ril16",
		    10
		),
		new MemberListElement (
		    "ril20",
		    11
		),
		new MemberListElement (
		    "ril24",
		    12
		),
		new MemberListElement (
		    "ril28",
		    13
		),
		new MemberListElement (
		    "ril32",
		    14
		),
		new MemberListElement (
		    "ril64",
		    15
		)
	    }
	),
	0,
	ril0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportingIntervalLong object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportingIntervalLong object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportingIntervalLong
