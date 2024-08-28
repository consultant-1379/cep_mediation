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
 * Define the ASN1 Type MaxTransportBlocksUL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxTransportBlocksUL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxTransportBlocksUL()
    {
	super(cFirstNumber);
    }
    
    protected MaxTransportBlocksUL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxTransportBlocksUL dummy =
	new MaxTransportBlocksUL(0);
    public static final MaxTransportBlocksUL tb4 =
	new MaxTransportBlocksUL(1);
    public static final MaxTransportBlocksUL tb8 =
	new MaxTransportBlocksUL(2);
    public static final MaxTransportBlocksUL tb16 =
	new MaxTransportBlocksUL(3);
    public static final MaxTransportBlocksUL tb32 =
	new MaxTransportBlocksUL(4);
    public static final MaxTransportBlocksUL tb48 =
	new MaxTransportBlocksUL(5);
    public static final MaxTransportBlocksUL tb64 =
	new MaxTransportBlocksUL(6);
    public static final MaxTransportBlocksUL tb96 =
	new MaxTransportBlocksUL(7);
    public static final MaxTransportBlocksUL tb128 =
	new MaxTransportBlocksUL(8);
    public static final MaxTransportBlocksUL tb256 =
	new MaxTransportBlocksUL(9);
    public static final MaxTransportBlocksUL tb512 =
	new MaxTransportBlocksUL(10);
    private final static MaxTransportBlocksUL cNamedNumbers[] = {
	 dummy, 
	 tb4, 
	 tb8, 
	 tb16, 
	 tb32, 
	 tb48, 
	 tb64, 
	 tb96, 
	 tb128, 
	 tb256, 
	 tb512
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
    
    public static MaxTransportBlocksUL valueOf(long value)
    {
	return (MaxTransportBlocksUL)dummy.lookupValue(value);
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
	    "MaxTransportBlocksUL"
	),
	new QName (
	    "InformationElements",
	    "MaxTransportBlocksUL"
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
		    "tb4",
		    1
		),
		new MemberListElement (
		    "tb8",
		    2
		),
		new MemberListElement (
		    "tb16",
		    3
		),
		new MemberListElement (
		    "tb32",
		    4
		),
		new MemberListElement (
		    "tb48",
		    5
		),
		new MemberListElement (
		    "tb64",
		    6
		),
		new MemberListElement (
		    "tb96",
		    7
		),
		new MemberListElement (
		    "tb128",
		    8
		),
		new MemberListElement (
		    "tb256",
		    9
		),
		new MemberListElement (
		    "tb512",
		    10
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxTransportBlocksUL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxTransportBlocksUL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxTransportBlocksUL
