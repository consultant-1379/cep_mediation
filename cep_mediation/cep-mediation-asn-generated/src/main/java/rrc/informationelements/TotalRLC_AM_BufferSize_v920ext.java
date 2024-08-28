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
 * Define the ASN1 Type TotalRLC_AM_BufferSize_v920ext from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TotalRLC_AM_BufferSize_v920ext extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TotalRLC_AM_BufferSize_v920ext()
    {
	super(cFirstNumber);
    }
    
    protected TotalRLC_AM_BufferSize_v920ext(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TotalRLC_AM_BufferSize_v920ext kb1150 =
	new TotalRLC_AM_BufferSize_v920ext(0);
    public static final TotalRLC_AM_BufferSize_v920ext kb1250 =
	new TotalRLC_AM_BufferSize_v920ext(1);
    private final static TotalRLC_AM_BufferSize_v920ext cNamedNumbers[] = {
	 kb1150, 
	 kb1250
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
    
    public static TotalRLC_AM_BufferSize_v920ext valueOf(long value)
    {
	return (TotalRLC_AM_BufferSize_v920ext)kb1150.lookupValue(value);
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
	    "TotalRLC_AM_BufferSize_v920ext"
	),
	new QName (
	    "InformationElements",
	    "TotalRLC-AM-BufferSize-v920ext"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "kb1150",
		    0
		),
		new MemberListElement (
		    "kb1250",
		    1
		)
	    }
	),
	0,
	kb1150
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TotalRLC_AM_BufferSize_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TotalRLC_AM_BufferSize_v920ext
