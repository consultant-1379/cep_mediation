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
 * Define the ASN1 Type MaxReportedCellsOnRACH from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxReportedCellsOnRACH extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxReportedCellsOnRACH()
    {
	super(cFirstNumber);
    }
    
    protected MaxReportedCellsOnRACH(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxReportedCellsOnRACH noReport =
	new MaxReportedCellsOnRACH(0);
    public static final MaxReportedCellsOnRACH currentCell =
	new MaxReportedCellsOnRACH(1);
    public static final MaxReportedCellsOnRACH currentAnd_1_BestNeighbour =
	new MaxReportedCellsOnRACH(2);
    public static final MaxReportedCellsOnRACH currentAnd_2_BestNeighbour =
	new MaxReportedCellsOnRACH(3);
    public static final MaxReportedCellsOnRACH currentAnd_3_BestNeighbour =
	new MaxReportedCellsOnRACH(4);
    public static final MaxReportedCellsOnRACH currentAnd_4_BestNeighbour =
	new MaxReportedCellsOnRACH(5);
    public static final MaxReportedCellsOnRACH currentAnd_5_BestNeighbour =
	new MaxReportedCellsOnRACH(6);
    public static final MaxReportedCellsOnRACH currentAnd_6_BestNeighbour =
	new MaxReportedCellsOnRACH(7);
    private final static MaxReportedCellsOnRACH cNamedNumbers[] = {
	 noReport, 
	 currentCell, 
	 currentAnd_1_BestNeighbour, 
	 currentAnd_2_BestNeighbour, 
	 currentAnd_3_BestNeighbour, 
	 currentAnd_4_BestNeighbour, 
	 currentAnd_5_BestNeighbour, 
	 currentAnd_6_BestNeighbour
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
    
    public static MaxReportedCellsOnRACH valueOf(long value)
    {
	return (MaxReportedCellsOnRACH)noReport.lookupValue(value);
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
	    "MaxReportedCellsOnRACH"
	),
	new QName (
	    "InformationElements",
	    "MaxReportedCellsOnRACH"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noReport",
		    0
		),
		new MemberListElement (
		    "currentCell",
		    1
		),
		new MemberListElement (
		    "currentAnd-1-BestNeighbour",
		    2
		),
		new MemberListElement (
		    "currentAnd-2-BestNeighbour",
		    3
		),
		new MemberListElement (
		    "currentAnd-3-BestNeighbour",
		    4
		),
		new MemberListElement (
		    "currentAnd-4-BestNeighbour",
		    5
		),
		new MemberListElement (
		    "currentAnd-5-BestNeighbour",
		    6
		),
		new MemberListElement (
		    "currentAnd-6-BestNeighbour",
		    7
		)
	    }
	),
	0,
	noReport
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxReportedCellsOnRACH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxReportedCellsOnRACH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxReportedCellsOnRACH
