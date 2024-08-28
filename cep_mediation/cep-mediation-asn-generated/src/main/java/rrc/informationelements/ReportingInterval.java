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
 * Define the ASN1 Type ReportingInterval from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReportingInterval extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReportingInterval()
    {
	super(cFirstNumber);
    }
    
    protected ReportingInterval(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReportingInterval noPeriodicalreporting =
	new ReportingInterval(0);
    public static final ReportingInterval ri0_25 =
	new ReportingInterval(1);
    public static final ReportingInterval ri0_5 =
	new ReportingInterval(2);
    public static final ReportingInterval ri1 =
	new ReportingInterval(3);
    public static final ReportingInterval ri2 =
	new ReportingInterval(4);
    public static final ReportingInterval ri4 =
	new ReportingInterval(5);
    public static final ReportingInterval ri8 =
	new ReportingInterval(6);
    public static final ReportingInterval ri16 =
	new ReportingInterval(7);
    private final static ReportingInterval cNamedNumbers[] = {
	 noPeriodicalreporting, 
	 ri0_25, 
	 ri0_5, 
	 ri1, 
	 ri2, 
	 ri4, 
	 ri8, 
	 ri16
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
    
    public static ReportingInterval valueOf(long value)
    {
	return (ReportingInterval)noPeriodicalreporting.lookupValue(value);
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
	    "ReportingInterval"
	),
	new QName (
	    "InformationElements",
	    "ReportingInterval"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noPeriodicalreporting",
		    0
		),
		new MemberListElement (
		    "ri0-25",
		    1
		),
		new MemberListElement (
		    "ri0-5",
		    2
		),
		new MemberListElement (
		    "ri1",
		    3
		),
		new MemberListElement (
		    "ri2",
		    4
		),
		new MemberListElement (
		    "ri4",
		    5
		),
		new MemberListElement (
		    "ri8",
		    6
		),
		new MemberListElement (
		    "ri16",
		    7
		)
	    }
	),
	0,
	noPeriodicalreporting
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportingInterval object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportingInterval object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportingInterval
