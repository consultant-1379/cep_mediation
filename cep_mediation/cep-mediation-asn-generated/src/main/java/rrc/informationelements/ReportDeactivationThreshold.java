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
 * Define the ASN1 Type ReportDeactivationThreshold from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReportDeactivationThreshold extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReportDeactivationThreshold()
    {
	super(cFirstNumber);
    }
    
    protected ReportDeactivationThreshold(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReportDeactivationThreshold notApplicable =
	new ReportDeactivationThreshold(0);
    public static final ReportDeactivationThreshold t1 =
	new ReportDeactivationThreshold(1);
    public static final ReportDeactivationThreshold t2 =
	new ReportDeactivationThreshold(2);
    public static final ReportDeactivationThreshold t3 =
	new ReportDeactivationThreshold(3);
    public static final ReportDeactivationThreshold t4 =
	new ReportDeactivationThreshold(4);
    public static final ReportDeactivationThreshold t5 =
	new ReportDeactivationThreshold(5);
    public static final ReportDeactivationThreshold t6 =
	new ReportDeactivationThreshold(6);
    public static final ReportDeactivationThreshold t7 =
	new ReportDeactivationThreshold(7);
    private final static ReportDeactivationThreshold cNamedNumbers[] = {
	 notApplicable, 
	 t1, 
	 t2, 
	 t3, 
	 t4, 
	 t5, 
	 t6, 
	 t7
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
    
    public static ReportDeactivationThreshold valueOf(long value)
    {
	return (ReportDeactivationThreshold)notApplicable.lookupValue(value);
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
	    "ReportDeactivationThreshold"
	),
	new QName (
	    "InformationElements",
	    "ReportDeactivationThreshold"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "notApplicable",
		    0
		),
		new MemberListElement (
		    "t1",
		    1
		),
		new MemberListElement (
		    "t2",
		    2
		),
		new MemberListElement (
		    "t3",
		    3
		),
		new MemberListElement (
		    "t4",
		    4
		),
		new MemberListElement (
		    "t5",
		    5
		),
		new MemberListElement (
		    "t6",
		    6
		),
		new MemberListElement (
		    "t7",
		    7
		)
	    }
	),
	0,
	notApplicable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportDeactivationThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportDeactivationThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportDeactivationThreshold
