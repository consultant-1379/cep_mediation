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
 * Define the ASN1 Type MaxNoPhysChBitsReceived from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxNoPhysChBitsReceived extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxNoPhysChBitsReceived()
    {
	super(cFirstNumber);
    }
    
    protected MaxNoPhysChBitsReceived(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxNoPhysChBitsReceived dummy =
	new MaxNoPhysChBitsReceived(0);
    public static final MaxNoPhysChBitsReceived b1200 =
	new MaxNoPhysChBitsReceived(1);
    public static final MaxNoPhysChBitsReceived b2400 =
	new MaxNoPhysChBitsReceived(2);
    public static final MaxNoPhysChBitsReceived b3600 =
	new MaxNoPhysChBitsReceived(3);
    public static final MaxNoPhysChBitsReceived b4800 =
	new MaxNoPhysChBitsReceived(4);
    public static final MaxNoPhysChBitsReceived b7200 =
	new MaxNoPhysChBitsReceived(5);
    public static final MaxNoPhysChBitsReceived b9600 =
	new MaxNoPhysChBitsReceived(6);
    public static final MaxNoPhysChBitsReceived b14400 =
	new MaxNoPhysChBitsReceived(7);
    public static final MaxNoPhysChBitsReceived b19200 =
	new MaxNoPhysChBitsReceived(8);
    public static final MaxNoPhysChBitsReceived b28800 =
	new MaxNoPhysChBitsReceived(9);
    public static final MaxNoPhysChBitsReceived b38400 =
	new MaxNoPhysChBitsReceived(10);
    public static final MaxNoPhysChBitsReceived b48000 =
	new MaxNoPhysChBitsReceived(11);
    public static final MaxNoPhysChBitsReceived b57600 =
	new MaxNoPhysChBitsReceived(12);
    public static final MaxNoPhysChBitsReceived b67200 =
	new MaxNoPhysChBitsReceived(13);
    public static final MaxNoPhysChBitsReceived b76800 =
	new MaxNoPhysChBitsReceived(14);
    private final static MaxNoPhysChBitsReceived cNamedNumbers[] = {
	 dummy, 
	 b1200, 
	 b2400, 
	 b3600, 
	 b4800, 
	 b7200, 
	 b9600, 
	 b14400, 
	 b19200, 
	 b28800, 
	 b38400, 
	 b48000, 
	 b57600, 
	 b67200, 
	 b76800
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
    
    public static MaxNoPhysChBitsReceived valueOf(long value)
    {
	return (MaxNoPhysChBitsReceived)dummy.lookupValue(value);
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
	    "MaxNoPhysChBitsReceived"
	),
	new QName (
	    "InformationElements",
	    "MaxNoPhysChBitsReceived"
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
		    "b1200",
		    1
		),
		new MemberListElement (
		    "b2400",
		    2
		),
		new MemberListElement (
		    "b3600",
		    3
		),
		new MemberListElement (
		    "b4800",
		    4
		),
		new MemberListElement (
		    "b7200",
		    5
		),
		new MemberListElement (
		    "b9600",
		    6
		),
		new MemberListElement (
		    "b14400",
		    7
		),
		new MemberListElement (
		    "b19200",
		    8
		),
		new MemberListElement (
		    "b28800",
		    9
		),
		new MemberListElement (
		    "b38400",
		    10
		),
		new MemberListElement (
		    "b48000",
		    11
		),
		new MemberListElement (
		    "b57600",
		    12
		),
		new MemberListElement (
		    "b67200",
		    13
		),
		new MemberListElement (
		    "b76800",
		    14
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxNoPhysChBitsReceived object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxNoPhysChBitsReceived object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxNoPhysChBitsReceived
