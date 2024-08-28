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
 * Define the ASN1 Type RadioFrequencyBandTDDList from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandTDDList extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandTDDList()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandTDDList(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandTDDList a =
	new RadioFrequencyBandTDDList(0);
    public static final RadioFrequencyBandTDDList b =
	new RadioFrequencyBandTDDList(1);
    public static final RadioFrequencyBandTDDList c =
	new RadioFrequencyBandTDDList(2);
    public static final RadioFrequencyBandTDDList ab =
	new RadioFrequencyBandTDDList(3);
    public static final RadioFrequencyBandTDDList ac =
	new RadioFrequencyBandTDDList(4);
    public static final RadioFrequencyBandTDDList bc =
	new RadioFrequencyBandTDDList(5);
    public static final RadioFrequencyBandTDDList abc =
	new RadioFrequencyBandTDDList(6);
    public static final RadioFrequencyBandTDDList spare =
	new RadioFrequencyBandTDDList(7);
    private final static RadioFrequencyBandTDDList cNamedNumbers[] = {
	 a, 
	 b, 
	 c, 
	 ab, 
	 ac, 
	 bc, 
	 abc, 
	 spare
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
    
    public static RadioFrequencyBandTDDList valueOf(long value)
    {
	return (RadioFrequencyBandTDDList)a.lookupValue(value);
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
	    "RadioFrequencyBandTDDList"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandTDDList"
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
		    "ab",
		    3
		),
		new MemberListElement (
		    "ac",
		    4
		),
		new MemberListElement (
		    "bc",
		    5
		),
		new MemberListElement (
		    "abc",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandTDDList
