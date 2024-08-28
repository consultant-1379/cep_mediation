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
 * Define the ASN1 Type MaxTransportBlocksDL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxTransportBlocksDL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxTransportBlocksDL()
    {
	super(cFirstNumber);
    }
    
    protected MaxTransportBlocksDL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxTransportBlocksDL tb4 =
	new MaxTransportBlocksDL(0);
    public static final MaxTransportBlocksDL tb8 =
	new MaxTransportBlocksDL(1);
    public static final MaxTransportBlocksDL tb16 =
	new MaxTransportBlocksDL(2);
    public static final MaxTransportBlocksDL tb32 =
	new MaxTransportBlocksDL(3);
    public static final MaxTransportBlocksDL tb48 =
	new MaxTransportBlocksDL(4);
    public static final MaxTransportBlocksDL tb64 =
	new MaxTransportBlocksDL(5);
    public static final MaxTransportBlocksDL tb96 =
	new MaxTransportBlocksDL(6);
    public static final MaxTransportBlocksDL tb128 =
	new MaxTransportBlocksDL(7);
    public static final MaxTransportBlocksDL tb256 =
	new MaxTransportBlocksDL(8);
    public static final MaxTransportBlocksDL tb512 =
	new MaxTransportBlocksDL(9);
    private final static MaxTransportBlocksDL cNamedNumbers[] = {
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
    
    public static MaxTransportBlocksDL valueOf(long value)
    {
	return (MaxTransportBlocksDL)tb4.lookupValue(value);
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
	    "MaxTransportBlocksDL"
	),
	new QName (
	    "InformationElements",
	    "MaxTransportBlocksDL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tb4",
		    0
		),
		new MemberListElement (
		    "tb8",
		    1
		),
		new MemberListElement (
		    "tb16",
		    2
		),
		new MemberListElement (
		    "tb32",
		    3
		),
		new MemberListElement (
		    "tb48",
		    4
		),
		new MemberListElement (
		    "tb64",
		    5
		),
		new MemberListElement (
		    "tb96",
		    6
		),
		new MemberListElement (
		    "tb128",
		    7
		),
		new MemberListElement (
		    "tb256",
		    8
		),
		new MemberListElement (
		    "tb512",
		    9
		)
	    }
	),
	0,
	tb4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxTransportBlocksDL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxTransportBlocksDL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxTransportBlocksDL
