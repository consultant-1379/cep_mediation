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
 * Define the ASN1 Type E_DPDCH_PeriodicyOfSchedInfo from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class E_DPDCH_PeriodicyOfSchedInfo extends Enumerated {
    
    /**
     * The default constructor.
     */
    private E_DPDCH_PeriodicyOfSchedInfo()
    {
	super(cFirstNumber);
    }
    
    protected E_DPDCH_PeriodicyOfSchedInfo(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final E_DPDCH_PeriodicyOfSchedInfo everyEDCHTTI =
	new E_DPDCH_PeriodicyOfSchedInfo(0);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms4 =
	new E_DPDCH_PeriodicyOfSchedInfo(1);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms10 =
	new E_DPDCH_PeriodicyOfSchedInfo(2);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms20 =
	new E_DPDCH_PeriodicyOfSchedInfo(3);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms50 =
	new E_DPDCH_PeriodicyOfSchedInfo(4);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms100 =
	new E_DPDCH_PeriodicyOfSchedInfo(5);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms200 =
	new E_DPDCH_PeriodicyOfSchedInfo(6);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms500 =
	new E_DPDCH_PeriodicyOfSchedInfo(7);
    public static final E_DPDCH_PeriodicyOfSchedInfo ms1000 =
	new E_DPDCH_PeriodicyOfSchedInfo(8);
    private final static E_DPDCH_PeriodicyOfSchedInfo cNamedNumbers[] = {
	 everyEDCHTTI, 
	 ms4, 
	 ms10, 
	 ms20, 
	 ms50, 
	 ms100, 
	 ms200, 
	 ms500, 
	 ms1000
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
    
    public static E_DPDCH_PeriodicyOfSchedInfo valueOf(long value)
    {
	return (E_DPDCH_PeriodicyOfSchedInfo)everyEDCHTTI.lookupValue(value);
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
	    "E_DPDCH_PeriodicyOfSchedInfo"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-PeriodicyOfSchedInfo"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "everyEDCHTTI",
		    0
		),
		new MemberListElement (
		    "ms4",
		    1
		),
		new MemberListElement (
		    "ms10",
		    2
		),
		new MemberListElement (
		    "ms20",
		    3
		),
		new MemberListElement (
		    "ms50",
		    4
		),
		new MemberListElement (
		    "ms100",
		    5
		),
		new MemberListElement (
		    "ms200",
		    6
		),
		new MemberListElement (
		    "ms500",
		    7
		),
		new MemberListElement (
		    "ms1000",
		    8
		)
	    }
	),
	0,
	everyEDCHTTI
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_PeriodicyOfSchedInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_PeriodicyOfSchedInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_PeriodicyOfSchedInfo
