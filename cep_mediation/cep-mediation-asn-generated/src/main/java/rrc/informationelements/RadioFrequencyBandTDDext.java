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
 * Define the ASN1 Type RadioFrequencyBandTDDext from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RadioFrequencyBandTDDext extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RadioFrequencyBandTDDext()
    {
	super(cFirstNumber);
    }
    
    protected RadioFrequencyBandTDDext(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RadioFrequencyBandTDDext e =
	new RadioFrequencyBandTDDext(0);
    public static final RadioFrequencyBandTDDext f =
	new RadioFrequencyBandTDDext(1);
    public static final RadioFrequencyBandTDDext g =
	new RadioFrequencyBandTDDext(2);
    public static final RadioFrequencyBandTDDext h =
	new RadioFrequencyBandTDDext(3);
    public static final RadioFrequencyBandTDDext i =
	new RadioFrequencyBandTDDext(4);
    public static final RadioFrequencyBandTDDext j =
	new RadioFrequencyBandTDDext(5);
    public static final RadioFrequencyBandTDDext k =
	new RadioFrequencyBandTDDext(6);
    public static final RadioFrequencyBandTDDext l =
	new RadioFrequencyBandTDDext(7);
    public static final RadioFrequencyBandTDDext m =
	new RadioFrequencyBandTDDext(8);
    public static final RadioFrequencyBandTDDext n =
	new RadioFrequencyBandTDDext(9);
    public static final RadioFrequencyBandTDDext o =
	new RadioFrequencyBandTDDext(10);
    public static final RadioFrequencyBandTDDext p =
	new RadioFrequencyBandTDDext(11);
    public static final RadioFrequencyBandTDDext spare4 =
	new RadioFrequencyBandTDDext(12);
    public static final RadioFrequencyBandTDDext spare3 =
	new RadioFrequencyBandTDDext(13);
    public static final RadioFrequencyBandTDDext spare2 =
	new RadioFrequencyBandTDDext(14);
    public static final RadioFrequencyBandTDDext spare1 =
	new RadioFrequencyBandTDDext(15);
    private final static RadioFrequencyBandTDDext cNamedNumbers[] = {
	 e, 
	 f, 
	 g, 
	 h, 
	 i, 
	 j, 
	 k, 
	 l, 
	 m, 
	 n, 
	 o, 
	 p, 
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
    
    public static RadioFrequencyBandTDDext valueOf(long value)
    {
	return (RadioFrequencyBandTDDext)e.lookupValue(value);
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
	    "RadioFrequencyBandTDDext"
	),
	new QName (
	    "InformationElements",
	    "RadioFrequencyBandTDDext"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e",
		    0
		),
		new MemberListElement (
		    "f",
		    1
		),
		new MemberListElement (
		    "g",
		    2
		),
		new MemberListElement (
		    "h",
		    3
		),
		new MemberListElement (
		    "i",
		    4
		),
		new MemberListElement (
		    "j",
		    5
		),
		new MemberListElement (
		    "k",
		    6
		),
		new MemberListElement (
		    "l",
		    7
		),
		new MemberListElement (
		    "m",
		    8
		),
		new MemberListElement (
		    "n",
		    9
		),
		new MemberListElement (
		    "o",
		    10
		),
		new MemberListElement (
		    "p",
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
	e
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RadioFrequencyBandTDDext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RadioFrequencyBandTDDext
