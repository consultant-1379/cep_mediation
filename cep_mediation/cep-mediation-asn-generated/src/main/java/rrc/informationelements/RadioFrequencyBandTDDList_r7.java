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
 * Define the ASN1 Type RadioFrequencyBandTDDList_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandTDDList_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandTDDList_r7()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandTDDList_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandTDDList_r7 a =
	new RadioFrequencyBandTDDList_r7(0);
    public static final RadioFrequencyBandTDDList_r7 b =
	new RadioFrequencyBandTDDList_r7(1);
    public static final RadioFrequencyBandTDDList_r7 c =
	new RadioFrequencyBandTDDList_r7(2);
    public static final RadioFrequencyBandTDDList_r7 d =
	new RadioFrequencyBandTDDList_r7(3);
    public static final RadioFrequencyBandTDDList_r7 ab =
	new RadioFrequencyBandTDDList_r7(4);
    public static final RadioFrequencyBandTDDList_r7 ac =
	new RadioFrequencyBandTDDList_r7(5);
    public static final RadioFrequencyBandTDDList_r7 ad =
	new RadioFrequencyBandTDDList_r7(6);
    public static final RadioFrequencyBandTDDList_r7 bc =
	new RadioFrequencyBandTDDList_r7(7);
    public static final RadioFrequencyBandTDDList_r7 bd =
	new RadioFrequencyBandTDDList_r7(8);
    public static final RadioFrequencyBandTDDList_r7 cd =
	new RadioFrequencyBandTDDList_r7(9);
    public static final RadioFrequencyBandTDDList_r7 abc =
	new RadioFrequencyBandTDDList_r7(10);
    public static final RadioFrequencyBandTDDList_r7 abd =
	new RadioFrequencyBandTDDList_r7(11);
    public static final RadioFrequencyBandTDDList_r7 acd =
	new RadioFrequencyBandTDDList_r7(12);
    public static final RadioFrequencyBandTDDList_r7 bcd =
	new RadioFrequencyBandTDDList_r7(13);
    public static final RadioFrequencyBandTDDList_r7 abcd =
	new RadioFrequencyBandTDDList_r7(14);
    public static final RadioFrequencyBandTDDList_r7 notabcd =
	new RadioFrequencyBandTDDList_r7(15);
    private final static RadioFrequencyBandTDDList_r7 cNamedNumbers[] = {
	 a, 
	 b, 
	 c, 
	 d, 
	 ab, 
	 ac, 
	 ad, 
	 bc, 
	 bd, 
	 cd, 
	 abc, 
	 abd, 
	 acd, 
	 bcd, 
	 abcd, 
	 notabcd
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
    
    public static RadioFrequencyBandTDDList_r7 valueOf(long value)
    {
	return (RadioFrequencyBandTDDList_r7)a.lookupValue(value);
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
	    "RadioFrequencyBandTDDList_r7"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandTDDList-r7"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "a",
		    0
		),
		new MemberListElement (
		    "b",
		    1
		),
		new MemberListElement (
		    "c",
		    2
		),
		new MemberListElement (
		    "d",
		    3
		),
		new MemberListElement (
		    "ab",
		    4
		),
		new MemberListElement (
		    "ac",
		    5
		),
		new MemberListElement (
		    "ad",
		    6
		),
		new MemberListElement (
		    "bc",
		    7
		),
		new MemberListElement (
		    "bd",
		    8
		),
		new MemberListElement (
		    "cd",
		    9
		),
		new MemberListElement (
		    "abc",
		    10
		),
		new MemberListElement (
		    "abd",
		    11
		),
		new MemberListElement (
		    "acd",
		    12
		),
		new MemberListElement (
		    "bcd",
		    13
		),
		new MemberListElement (
		    "abcd",
		    14
		),
		new MemberListElement (
		    "notabcd",
		    15
		)
	    }
	),
	0,
	a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDList_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDList_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandTDDList_r7
