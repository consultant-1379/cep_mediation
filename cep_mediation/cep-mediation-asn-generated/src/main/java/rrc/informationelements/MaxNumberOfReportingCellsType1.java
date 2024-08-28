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
 * Define the ASN1 Type MaxNumberOfReportingCellsType1 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNumberOfReportingCellsType1 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNumberOfReportingCellsType1()
    {
	super(cFirstNumber);
    }
    
    protected MaxNumberOfReportingCellsType1(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNumberOfReportingCellsType1 e1 =
	new MaxNumberOfReportingCellsType1(0);
    public static final MaxNumberOfReportingCellsType1 e2 =
	new MaxNumberOfReportingCellsType1(1);
    public static final MaxNumberOfReportingCellsType1 e3 =
	new MaxNumberOfReportingCellsType1(2);
    public static final MaxNumberOfReportingCellsType1 e4 =
	new MaxNumberOfReportingCellsType1(3);
    public static final MaxNumberOfReportingCellsType1 e5 =
	new MaxNumberOfReportingCellsType1(4);
    public static final MaxNumberOfReportingCellsType1 e6 =
	new MaxNumberOfReportingCellsType1(5);
    private final static MaxNumberOfReportingCellsType1 cNamedNumbers[] = {
	 e1, 
	 e2, 
	 e3, 
	 e4, 
	 e5, 
	 e6
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
    
    public static MaxNumberOfReportingCellsType1 valueOf(long value)
    {
	return (MaxNumberOfReportingCellsType1)e1.lookupValue(value);
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
	    "MaxNumberOfReportingCellsType1"
	),
	new QName (
	    "InformationElements",
	    "MaxNumberOfReportingCellsType1"
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
		)
	    }
	),
	0,
	e1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNumberOfReportingCellsType1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNumberOfReportingCellsType1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNumberOfReportingCellsType1
