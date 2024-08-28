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
 * Define the ASN1 Type Feedback_cycle from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Feedback_cycle extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Feedback_cycle()
    {
	super(cFirstNumber);
    }
    
    protected Feedback_cycle(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Feedback_cycle fc0 =
	new Feedback_cycle(0);
    public static final Feedback_cycle fc2 =
	new Feedback_cycle(1);
    public static final Feedback_cycle fc4 =
	new Feedback_cycle(2);
    public static final Feedback_cycle fc8 =
	new Feedback_cycle(3);
    public static final Feedback_cycle fc10 =
	new Feedback_cycle(4);
    public static final Feedback_cycle fc20 =
	new Feedback_cycle(5);
    public static final Feedback_cycle fc40 =
	new Feedback_cycle(6);
    public static final Feedback_cycle fc80 =
	new Feedback_cycle(7);
    public static final Feedback_cycle fc160 =
	new Feedback_cycle(8);
    private final static Feedback_cycle cNamedNumbers[] = {
	 fc0, 
	 fc2, 
	 fc4, 
	 fc8, 
	 fc10, 
	 fc20, 
	 fc40, 
	 fc80, 
	 fc160
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
    
    public static Feedback_cycle valueOf(long value)
    {
	return (Feedback_cycle)fc0.lookupValue(value);
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
	    "Feedback_cycle"
	),
	new QName (
	    "InformationElements",
	    "Feedback-cycle"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "fc0",
		    0
		),
		new MemberListElement (
		    "fc2",
		    1
		),
		new MemberListElement (
		    "fc4",
		    2
		),
		new MemberListElement (
		    "fc8",
		    3
		),
		new MemberListElement (
		    "fc10",
		    4
		),
		new MemberListElement (
		    "fc20",
		    5
		),
		new MemberListElement (
		    "fc40",
		    6
		),
		new MemberListElement (
		    "fc80",
		    7
		),
		new MemberListElement (
		    "fc160",
		    8
		)
	    }
	),
	0,
	fc0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Feedback_cycle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Feedback_cycle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Feedback_cycle
