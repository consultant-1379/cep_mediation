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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type TotalRLC_AM_BufferSize_r5 from ASN1 Module Internode_definitions.
 * @see Enumerated
 */

public final class TotalRLC_AM_BufferSize_r5 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TotalRLC_AM_BufferSize_r5()
    {
	super(cFirstNumber);
    }
    
    protected TotalRLC_AM_BufferSize_r5(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TotalRLC_AM_BufferSize_r5 kb10 =
	new TotalRLC_AM_BufferSize_r5(0);
    public static final TotalRLC_AM_BufferSize_r5 kb50 =
	new TotalRLC_AM_BufferSize_r5(1);
    public static final TotalRLC_AM_BufferSize_r5 kb100 =
	new TotalRLC_AM_BufferSize_r5(2);
    public static final TotalRLC_AM_BufferSize_r5 kb150 =
	new TotalRLC_AM_BufferSize_r5(3);
    public static final TotalRLC_AM_BufferSize_r5 kb200 =
	new TotalRLC_AM_BufferSize_r5(4);
    public static final TotalRLC_AM_BufferSize_r5 kb300 =
	new TotalRLC_AM_BufferSize_r5(5);
    public static final TotalRLC_AM_BufferSize_r5 kb400 =
	new TotalRLC_AM_BufferSize_r5(6);
    public static final TotalRLC_AM_BufferSize_r5 kb500 =
	new TotalRLC_AM_BufferSize_r5(7);
    public static final TotalRLC_AM_BufferSize_r5 kb750 =
	new TotalRLC_AM_BufferSize_r5(8);
    public static final TotalRLC_AM_BufferSize_r5 kb1000 =
	new TotalRLC_AM_BufferSize_r5(9);
    private final static TotalRLC_AM_BufferSize_r5 cNamedNumbers[] = {
	 kb10, 
	 kb50, 
	 kb100, 
	 kb150, 
	 kb200, 
	 kb300, 
	 kb400, 
	 kb500, 
	 kb750, 
	 kb1000
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
    
    public static TotalRLC_AM_BufferSize_r5 valueOf(long value)
    {
	return (TotalRLC_AM_BufferSize_r5)kb10.lookupValue(value);
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
	    "rrc.internode_definitions",
	    "TotalRLC_AM_BufferSize_r5"
	),
	new QName (
	    "Internode-definitions",
	    "TotalRLC-AM-BufferSize-r5"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "kb10",
		    0
		),
		new MemberListElement (
		    "kb50",
		    1
		),
		new MemberListElement (
		    "kb100",
		    2
		),
		new MemberListElement (
		    "kb150",
		    3
		),
		new MemberListElement (
		    "kb200",
		    4
		),
		new MemberListElement (
		    "kb300",
		    5
		),
		new MemberListElement (
		    "kb400",
		    6
		),
		new MemberListElement (
		    "kb500",
		    7
		),
		new MemberListElement (
		    "kb750",
		    8
		),
		new MemberListElement (
		    "kb1000",
		    9
		)
	    }
	),
	0,
	kb10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TotalRLC_AM_BufferSize_r5
