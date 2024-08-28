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
 * Define the ASN1 Type RadioFrequencyBandTDD_r10 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandTDD_r10 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandTDD_r10()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandTDD_r10(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandTDD_r10 a =
	new RadioFrequencyBandTDD_r10(0);
    public static final RadioFrequencyBandTDD_r10 b =
	new RadioFrequencyBandTDD_r10(1);
    public static final RadioFrequencyBandTDD_r10 c =
	new RadioFrequencyBandTDD_r10(2);
    public static final RadioFrequencyBandTDD_r10 d =
	new RadioFrequencyBandTDD_r10(3);
    public static final RadioFrequencyBandTDD_r10 e =
	new RadioFrequencyBandTDD_r10(4);
    public static final RadioFrequencyBandTDD_r10 f =
	new RadioFrequencyBandTDD_r10(5);
    public static final RadioFrequencyBandTDD_r10 spare2 =
	new RadioFrequencyBandTDD_r10(6);
    public static final RadioFrequencyBandTDD_r10 spare1 =
	new RadioFrequencyBandTDD_r10(7);
    private final static RadioFrequencyBandTDD_r10 cNamedNumbers[] = {
	 a, 
	 b, 
	 c, 
	 d, 
	 e, 
	 f, 
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
    
    public static RadioFrequencyBandTDD_r10 valueOf(long value)
    {
	return (RadioFrequencyBandTDD_r10)a.lookupValue(value);
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
	    "RadioFrequencyBandTDD_r10"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandTDD-r10"
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
		    "e",
		    4
		),
		new MemberListElement (
		    "f",
		    5
		),
		new MemberListElement (
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	a
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDD_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDD_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandTDD_r10
