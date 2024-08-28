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
 * Define the ASN1 Type TX_InterruptionAfterTrigger from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TX_InterruptionAfterTrigger extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TX_InterruptionAfterTrigger()
    {
	super(cFirstNumber);
    }
    
    protected TX_InterruptionAfterTrigger(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TX_InterruptionAfterTrigger txiat0_25 =
	new TX_InterruptionAfterTrigger(0);
    public static final TX_InterruptionAfterTrigger txiat0_5 =
	new TX_InterruptionAfterTrigger(1);
    public static final TX_InterruptionAfterTrigger txiat1 =
	new TX_InterruptionAfterTrigger(2);
    public static final TX_InterruptionAfterTrigger txiat2 =
	new TX_InterruptionAfterTrigger(3);
    public static final TX_InterruptionAfterTrigger txiat4 =
	new TX_InterruptionAfterTrigger(4);
    public static final TX_InterruptionAfterTrigger txiat8 =
	new TX_InterruptionAfterTrigger(5);
    public static final TX_InterruptionAfterTrigger txiat16 =
	new TX_InterruptionAfterTrigger(6);
    private final static TX_InterruptionAfterTrigger cNamedNumbers[] = {
	 txiat0_25, 
	 txiat0_5, 
	 txiat1, 
	 txiat2, 
	 txiat4, 
	 txiat8, 
	 txiat16
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
    
    public static TX_InterruptionAfterTrigger valueOf(long value)
    {
	return (TX_InterruptionAfterTrigger)txiat0_25.lookupValue(value);
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
	    "TX_InterruptionAfterTrigger"
	),
	new QName (
	    "InformationElements",
	    "TX-InterruptionAfterTrigger"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "txiat0-25",
		    0
		),
		new MemberListElement (
		    "txiat0-5",
		    1
		),
		new MemberListElement (
		    "txiat1",
		    2
		),
		new MemberListElement (
		    "txiat2",
		    3
		),
		new MemberListElement (
		    "txiat4",
		    4
		),
		new MemberListElement (
		    "txiat8",
		    5
		),
		new MemberListElement (
		    "txiat16",
		    6
		)
	    }
	),
	0,
	txiat0_25
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TX_InterruptionAfterTrigger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TX_InterruptionAfterTrigger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TX_InterruptionAfterTrigger
