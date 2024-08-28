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
 * Define the ASN1 Type Feedback_cycle_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Feedback_cycle_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Feedback_cycle_r7()
    {
	super(cFirstNumber);
    }
    
    protected Feedback_cycle_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Feedback_cycle_r7 fc0 =
	new Feedback_cycle_r7(0);
    public static final Feedback_cycle_r7 fc2 =
	new Feedback_cycle_r7(1);
    public static final Feedback_cycle_r7 fc4 =
	new Feedback_cycle_r7(2);
    public static final Feedback_cycle_r7 fc8 =
	new Feedback_cycle_r7(3);
    public static final Feedback_cycle_r7 fc10 =
	new Feedback_cycle_r7(4);
    public static final Feedback_cycle_r7 fc20 =
	new Feedback_cycle_r7(5);
    public static final Feedback_cycle_r7 fc40 =
	new Feedback_cycle_r7(6);
    public static final Feedback_cycle_r7 fc80 =
	new Feedback_cycle_r7(7);
    public static final Feedback_cycle_r7 fc160 =
	new Feedback_cycle_r7(8);
    public static final Feedback_cycle_r7 fc16 =
	new Feedback_cycle_r7(9);
    public static final Feedback_cycle_r7 fc32 =
	new Feedback_cycle_r7(10);
    public static final Feedback_cycle_r7 fc64 =
	new Feedback_cycle_r7(11);
    public static final Feedback_cycle_r7 spare4 =
	new Feedback_cycle_r7(12);
    public static final Feedback_cycle_r7 spare3 =
	new Feedback_cycle_r7(13);
    public static final Feedback_cycle_r7 spare2 =
	new Feedback_cycle_r7(14);
    public static final Feedback_cycle_r7 spare1 =
	new Feedback_cycle_r7(15);
    private final static Feedback_cycle_r7 cNamedNumbers[] = {
	 fc0, 
	 fc2, 
	 fc4, 
	 fc8, 
	 fc10, 
	 fc20, 
	 fc40, 
	 fc80, 
	 fc160, 
	 fc16, 
	 fc32, 
	 fc64, 
	 spare4, 
	 spare3, 
	 spare2, 
	 spare1
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
    
    public static Feedback_cycle_r7 valueOf(long value)
    {
	return (Feedback_cycle_r7)fc0.lookupValue(value);
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
	    "Feedback_cycle_r7"
	),
	new QName (
	    "InformationElements",
	    "Feedback-cycle-r7"
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
		),
		new MemberListElement (
		    "fc16",
		    9
		),
		new MemberListElement (
		    "fc32",
		    10
		),
		new MemberListElement (
		    "fc64",
		    11
		),
		new MemberListElement (
		    "spare4",
		    12
		),
		new MemberListElement (
		    "spare3",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	fc0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Feedback_cycle_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Feedback_cycle_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Feedback_cycle_r7
