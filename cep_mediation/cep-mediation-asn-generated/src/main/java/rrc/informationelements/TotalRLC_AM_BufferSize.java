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
 * Define the ASN1 Type TotalRLC_AM_BufferSize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TotalRLC_AM_BufferSize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TotalRLC_AM_BufferSize()
    {
	super(cFirstNumber);
    }
    
    protected TotalRLC_AM_BufferSize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TotalRLC_AM_BufferSize dummy =
	new TotalRLC_AM_BufferSize(0);
    public static final TotalRLC_AM_BufferSize kb10 =
	new TotalRLC_AM_BufferSize(1);
    public static final TotalRLC_AM_BufferSize kb50 =
	new TotalRLC_AM_BufferSize(2);
    public static final TotalRLC_AM_BufferSize kb100 =
	new TotalRLC_AM_BufferSize(3);
    public static final TotalRLC_AM_BufferSize kb150 =
	new TotalRLC_AM_BufferSize(4);
    public static final TotalRLC_AM_BufferSize kb500 =
	new TotalRLC_AM_BufferSize(5);
    public static final TotalRLC_AM_BufferSize kb1000 =
	new TotalRLC_AM_BufferSize(6);
    public static final TotalRLC_AM_BufferSize spare =
	new TotalRLC_AM_BufferSize(7);
    private final static TotalRLC_AM_BufferSize cNamedNumbers[] = {
	 dummy, 
	 kb10, 
	 kb50, 
	 kb100, 
	 kb150, 
	 kb500, 
	 kb1000, 
	 spare
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
    
    public static TotalRLC_AM_BufferSize valueOf(long value)
    {
	return (TotalRLC_AM_BufferSize)dummy.lookupValue(value);
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
	    "TotalRLC_AM_BufferSize"
	),
	new QName (
	    "InformationElements",
	    "TotalRLC-AM-BufferSize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dummy",
		    0
		),
		new MemberListElement (
		    "kb10",
		    1
		),
		new MemberListElement (
		    "kb50",
		    2
		),
		new MemberListElement (
		    "kb100",
		    3
		),
		new MemberListElement (
		    "kb150",
		    4
		),
		new MemberListElement (
		    "kb500",
		    5
		),
		new MemberListElement (
		    "kb1000",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TotalRLC_AM_BufferSize
