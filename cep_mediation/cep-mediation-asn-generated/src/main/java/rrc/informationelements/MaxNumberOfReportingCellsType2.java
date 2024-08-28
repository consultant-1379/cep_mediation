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
 * Define the ASN1 Type MaxNumberOfReportingCellsType2 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNumberOfReportingCellsType2 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNumberOfReportingCellsType2()
    {
	super(cFirstNumber);
    }
    
    protected MaxNumberOfReportingCellsType2(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNumberOfReportingCellsType2 e1 =
	new MaxNumberOfReportingCellsType2(0);
    public static final MaxNumberOfReportingCellsType2 e2 =
	new MaxNumberOfReportingCellsType2(1);
    public static final MaxNumberOfReportingCellsType2 e3 =
	new MaxNumberOfReportingCellsType2(2);
    public static final MaxNumberOfReportingCellsType2 e4 =
	new MaxNumberOfReportingCellsType2(3);
    public static final MaxNumberOfReportingCellsType2 e5 =
	new MaxNumberOfReportingCellsType2(4);
    public static final MaxNumberOfReportingCellsType2 e6 =
	new MaxNumberOfReportingCellsType2(5);
    public static final MaxNumberOfReportingCellsType2 e7 =
	new MaxNumberOfReportingCellsType2(6);
    public static final MaxNumberOfReportingCellsType2 e8 =
	new MaxNumberOfReportingCellsType2(7);
    public static final MaxNumberOfReportingCellsType2 e9 =
	new MaxNumberOfReportingCellsType2(8);
    public static final MaxNumberOfReportingCellsType2 e10 =
	new MaxNumberOfReportingCellsType2(9);
    public static final MaxNumberOfReportingCellsType2 e11 =
	new MaxNumberOfReportingCellsType2(10);
    public static final MaxNumberOfReportingCellsType2 e12 =
	new MaxNumberOfReportingCellsType2(11);
    private final static MaxNumberOfReportingCellsType2 cNamedNumbers[] = {
	 e1, 
	 e2, 
	 e3, 
	 e4, 
	 e5, 
	 e6, 
	 e7, 
	 e8, 
	 e9, 
	 e10, 
	 e11, 
	 e12
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
    
    public static MaxNumberOfReportingCellsType2 valueOf(long value)
    {
	return (MaxNumberOfReportingCellsType2)e1.lookupValue(value);
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
	    "MaxNumberOfReportingCellsType2"
	),
	new QName (
	    "InformationElements",
	    "MaxNumberOfReportingCellsType2"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e1",
		    0
		),
		new MemberListElement (
		    "e2",
		    1
		),
		new MemberListElement (
		    "e3",
		    2
		),
		new MemberListElement (
		    "e4",
		    3
		),
		new MemberListElement (
		    "e5",
		    4
		),
		new MemberListElement (
		    "e6",
		    5
		),
		new MemberListElement (
		    "e7",
		    6
		),
		new MemberListElement (
		    "e8",
		    7
		),
		new MemberListElement (
		    "e9",
		    8
		),
		new MemberListElement (
		    "e10",
		    9
		),
		new MemberListElement (
		    "e11",
		    10
		),
		new MemberListElement (
		    "e12",
		    11
		)
	    }
	),
	0,
	e1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNumberOfReportingCellsType2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNumberOfReportingCellsType2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNumberOfReportingCellsType2
