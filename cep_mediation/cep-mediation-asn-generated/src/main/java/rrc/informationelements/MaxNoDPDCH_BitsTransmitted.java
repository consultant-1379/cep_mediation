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
 * Define the ASN1 Type MaxNoDPDCH_BitsTransmitted from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNoDPDCH_BitsTransmitted extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNoDPDCH_BitsTransmitted()
    {
	super(cFirstNumber);
    }
    
    protected MaxNoDPDCH_BitsTransmitted(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNoDPDCH_BitsTransmitted b600 =
	new MaxNoDPDCH_BitsTransmitted(0);
    public static final MaxNoDPDCH_BitsTransmitted b1200 =
	new MaxNoDPDCH_BitsTransmitted(1);
    public static final MaxNoDPDCH_BitsTransmitted b2400 =
	new MaxNoDPDCH_BitsTransmitted(2);
    public static final MaxNoDPDCH_BitsTransmitted b4800 =
	new MaxNoDPDCH_BitsTransmitted(3);
    public static final MaxNoDPDCH_BitsTransmitted b9600 =
	new MaxNoDPDCH_BitsTransmitted(4);
    public static final MaxNoDPDCH_BitsTransmitted b19200 =
	new MaxNoDPDCH_BitsTransmitted(5);
    public static final MaxNoDPDCH_BitsTransmitted b28800 =
	new MaxNoDPDCH_BitsTransmitted(6);
    public static final MaxNoDPDCH_BitsTransmitted b38400 =
	new MaxNoDPDCH_BitsTransmitted(7);
    public static final MaxNoDPDCH_BitsTransmitted b48000 =
	new MaxNoDPDCH_BitsTransmitted(8);
    public static final MaxNoDPDCH_BitsTransmitted b57600 =
	new MaxNoDPDCH_BitsTransmitted(9);
    private final static MaxNoDPDCH_BitsTransmitted cNamedNumbers[] = {
	 b600, 
	 b1200, 
	 b2400, 
	 b4800, 
	 b9600, 
	 b19200, 
	 b28800, 
	 b38400, 
	 b48000, 
	 b57600
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
    
    public static MaxNoDPDCH_BitsTransmitted valueOf(long value)
    {
	return (MaxNoDPDCH_BitsTransmitted)b600.lookupValue(value);
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
	    "MaxNoDPDCH_BitsTransmitted"
	),
	new QName (
	    "InformationElements",
	    "MaxNoDPDCH-BitsTransmitted"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "b600",
		    0
		),
		new MemberListElement (
		    "b1200",
		    1
		),
		new MemberListElement (
		    "b2400",
		    2
		),
		new MemberListElement (
		    "b4800",
		    3
		),
		new MemberListElement (
		    "b9600",
		    4
		),
		new MemberListElement (
		    "b19200",
		    5
		),
		new MemberListElement (
		    "b28800",
		    6
		),
		new MemberListElement (
		    "b38400",
		    7
		),
		new MemberListElement (
		    "b48000",
		    8
		),
		new MemberListElement (
		    "b57600",
		    9
		)
	    }
	),
	0,
	b600
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNoDPDCH_BitsTransmitted object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNoDPDCH_BitsTransmitted object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNoDPDCH_BitsTransmitted
