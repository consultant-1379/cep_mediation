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
 * Define the ASN1 Type PendingTimeAfterTrigger from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PendingTimeAfterTrigger extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PendingTimeAfterTrigger()
    {
	super(cFirstNumber);
    }
    
    protected PendingTimeAfterTrigger(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PendingTimeAfterTrigger ptat0_25 =
	new PendingTimeAfterTrigger(0);
    public static final PendingTimeAfterTrigger ptat0_5 =
	new PendingTimeAfterTrigger(1);
    public static final PendingTimeAfterTrigger ptat1 =
	new PendingTimeAfterTrigger(2);
    public static final PendingTimeAfterTrigger ptat2 =
	new PendingTimeAfterTrigger(3);
    public static final PendingTimeAfterTrigger ptat4 =
	new PendingTimeAfterTrigger(4);
    public static final PendingTimeAfterTrigger ptat8 =
	new PendingTimeAfterTrigger(5);
    public static final PendingTimeAfterTrigger ptat16 =
	new PendingTimeAfterTrigger(6);
    private final static PendingTimeAfterTrigger cNamedNumbers[] = {
	 ptat0_25, 
	 ptat0_5, 
	 ptat1, 
	 ptat2, 
	 ptat4, 
	 ptat8, 
	 ptat16
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
    
    public static PendingTimeAfterTrigger valueOf(long value)
    {
	return (PendingTimeAfterTrigger)ptat0_25.lookupValue(value);
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
	    "PendingTimeAfterTrigger"
	),
	new QName (
	    "InformationElements",
	    "PendingTimeAfterTrigger"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ptat0-25",
		    0
		),
		new MemberListElement (
		    "ptat0-5",
		    1
		),
		new MemberListElement (
		    "ptat1",
		    2
		),
		new MemberListElement (
		    "ptat2",
		    3
		),
		new MemberListElement (
		    "ptat4",
		    4
		),
		new MemberListElement (
		    "ptat8",
		    5
		),
		new MemberListElement (
		    "ptat16",
		    6
		)
	    }
	),
	0,
	ptat0_25
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PendingTimeAfterTrigger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PendingTimeAfterTrigger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PendingTimeAfterTrigger
