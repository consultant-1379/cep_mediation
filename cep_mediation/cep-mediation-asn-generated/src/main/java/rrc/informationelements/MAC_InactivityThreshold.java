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
 * Define the ASN1 Type MAC_InactivityThreshold from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MAC_InactivityThreshold extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MAC_InactivityThreshold()
    {
	super(cFirstNumber);
    }
    
    protected MAC_InactivityThreshold(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MAC_InactivityThreshold e_dch_tti_1 =
	new MAC_InactivityThreshold(0);
    public static final MAC_InactivityThreshold e_dch_tti_2 =
	new MAC_InactivityThreshold(1);
    public static final MAC_InactivityThreshold e_dch_tti_4 =
	new MAC_InactivityThreshold(2);
    public static final MAC_InactivityThreshold e_dch_tti_8 =
	new MAC_InactivityThreshold(3);
    public static final MAC_InactivityThreshold e_dch_tti_16 =
	new MAC_InactivityThreshold(4);
    public static final MAC_InactivityThreshold e_dch_tti_32 =
	new MAC_InactivityThreshold(5);
    public static final MAC_InactivityThreshold e_dch_tti_64 =
	new MAC_InactivityThreshold(6);
    public static final MAC_InactivityThreshold e_dch_tti_128 =
	new MAC_InactivityThreshold(7);
    public static final MAC_InactivityThreshold e_dch_tti_256 =
	new MAC_InactivityThreshold(8);
    public static final MAC_InactivityThreshold e_dch_tti_512 =
	new MAC_InactivityThreshold(9);
    public static final MAC_InactivityThreshold e_dch_tti_Infinity =
	new MAC_InactivityThreshold(10);
    public static final MAC_InactivityThreshold spare5 =
	new MAC_InactivityThreshold(11);
    public static final MAC_InactivityThreshold spare4 =
	new MAC_InactivityThreshold(12);
    public static final MAC_InactivityThreshold spare3 =
	new MAC_InactivityThreshold(13);
    public static final MAC_InactivityThreshold spare2 =
	new MAC_InactivityThreshold(14);
    public static final MAC_InactivityThreshold spare1 =
	new MAC_InactivityThreshold(15);
    private final static MAC_InactivityThreshold cNamedNumbers[] = {
	 e_dch_tti_1, 
	 e_dch_tti_2, 
	 e_dch_tti_4, 
	 e_dch_tti_8, 
	 e_dch_tti_16, 
	 e_dch_tti_32, 
	 e_dch_tti_64, 
	 e_dch_tti_128, 
	 e_dch_tti_256, 
	 e_dch_tti_512, 
	 e_dch_tti_Infinity, 
	 spare5, 
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
    
    public static MAC_InactivityThreshold valueOf(long value)
    {
	return (MAC_InactivityThreshold)e_dch_tti_1.lookupValue(value);
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
	    "MAC_InactivityThreshold"
	),
	new QName (
	    "InformationElements",
	    "MAC-InactivityThreshold"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e-dch-tti-1",
		    0
		),
		new MemberListElement (
		    "e-dch-tti-2",
		    1
		),
		new MemberListElement (
		    "e-dch-tti-4",
		    2
		),
		new MemberListElement (
		    "e-dch-tti-8",
		    3
		),
		new MemberListElement (
		    "e-dch-tti-16",
		    4
		),
		new MemberListElement (
		    "e-dch-tti-32",
		    5
		),
		new MemberListElement (
		    "e-dch-tti-64",
		    6
		),
		new MemberListElement (
		    "e-dch-tti-128",
		    7
		),
		new MemberListElement (
		    "e-dch-tti-256",
		    8
		),
		new MemberListElement (
		    "e-dch-tti-512",
		    9
		),
		new MemberListElement (
		    "e-dch-tti-Infinity",
		    10
		),
		new MemberListElement (
		    "spare5",
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
	e_dch_tti_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MAC_InactivityThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_InactivityThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_InactivityThreshold
