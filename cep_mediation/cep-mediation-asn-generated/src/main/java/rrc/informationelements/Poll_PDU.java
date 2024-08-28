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
 * Define the ASN1 Type Poll_PDU from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Poll_PDU extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Poll_PDU()
    {
	super(cFirstNumber);
    }
    
    protected Poll_PDU(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Poll_PDU pdu1 =
	new Poll_PDU(0);
    public static final Poll_PDU pdu2 =
	new Poll_PDU(1);
    public static final Poll_PDU pdu4 =
	new Poll_PDU(2);
    public static final Poll_PDU pdu8 =
	new Poll_PDU(3);
    public static final Poll_PDU pdu16 =
	new Poll_PDU(4);
    public static final Poll_PDU pdu32 =
	new Poll_PDU(5);
    public static final Poll_PDU pdu64 =
	new Poll_PDU(6);
    public static final Poll_PDU pdu128 =
	new Poll_PDU(7);
    private final static Poll_PDU cNamedNumbers[] = {
	 pdu1, 
	 pdu2, 
	 pdu4, 
	 pdu8, 
	 pdu16, 
	 pdu32, 
	 pdu64, 
	 pdu128
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
    
    public static Poll_PDU valueOf(long value)
    {
	return (Poll_PDU)pdu1.lookupValue(value);
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
	    "Poll_PDU"
	),
	new QName (
	    "InformationElements",
	    "Poll-PDU"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pdu1",
		    0
		),
		new MemberListElement (
		    "pdu2",
		    1
		),
		new MemberListElement (
		    "pdu4",
		    2
		),
		new MemberListElement (
		    "pdu8",
		    3
		),
		new MemberListElement (
		    "pdu16",
		    4
		),
		new MemberListElement (
		    "pdu32",
		    5
		),
		new MemberListElement (
		    "pdu64",
		    6
		),
		new MemberListElement (
		    "pdu128",
		    7
		)
	    }
	),
	0,
	pdu1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Poll_PDU object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Poll_PDU object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Poll_PDU
