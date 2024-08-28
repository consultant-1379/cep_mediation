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
 * Define the ASN1 Type MaxMRW from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxMRW extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxMRW()
    {
	super(cFirstNumber);
    }
    
    protected MaxMRW(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxMRW mm1 =
	new MaxMRW(0);
    public static final MaxMRW mm4 =
	new MaxMRW(1);
    public static final MaxMRW mm6 =
	new MaxMRW(2);
    public static final MaxMRW mm8 =
	new MaxMRW(3);
    public static final MaxMRW mm12 =
	new MaxMRW(4);
    public static final MaxMRW mm16 =
	new MaxMRW(5);
    public static final MaxMRW mm24 =
	new MaxMRW(6);
    public static final MaxMRW mm32 =
	new MaxMRW(7);
    private final static MaxMRW cNamedNumbers[] = {
	 mm1, 
	 mm4, 
	 mm6, 
	 mm8, 
	 mm12, 
	 mm16, 
	 mm24, 
	 mm32
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
    
    public static MaxMRW valueOf(long value)
    {
	return (MaxMRW)mm1.lookupValue(value);
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
	    "MaxMRW"
	),
	new QName (
	    "InformationElements",
	    "MaxMRW"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mm1",
		    0
		),
		new MemberListElement (
		    "mm4",
		    1
		),
		new MemberListElement (
		    "mm6",
		    2
		),
		new MemberListElement (
		    "mm8",
		    3
		),
		new MemberListElement (
		    "mm12",
		    4
		),
		new MemberListElement (
		    "mm16",
		    5
		),
		new MemberListElement (
		    "mm24",
		    6
		),
		new MemberListElement (
		    "mm32",
		    7
		)
	    }
	),
	0,
	mm1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxMRW object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxMRW object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxMRW
