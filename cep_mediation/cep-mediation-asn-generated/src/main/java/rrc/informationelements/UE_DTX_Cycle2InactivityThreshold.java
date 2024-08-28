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
 * Define the ASN1 Type UE_DTX_Cycle2InactivityThreshold from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_DTX_Cycle2InactivityThreshold extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_DTX_Cycle2InactivityThreshold()
    {
	super(cFirstNumber);
    }
    
    protected UE_DTX_Cycle2InactivityThreshold(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_1 =
	new UE_DTX_Cycle2InactivityThreshold(0);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_4 =
	new UE_DTX_Cycle2InactivityThreshold(1);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_8 =
	new UE_DTX_Cycle2InactivityThreshold(2);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_16 =
	new UE_DTX_Cycle2InactivityThreshold(3);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_32 =
	new UE_DTX_Cycle2InactivityThreshold(4);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_64 =
	new UE_DTX_Cycle2InactivityThreshold(5);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_128 =
	new UE_DTX_Cycle2InactivityThreshold(6);
    public static final UE_DTX_Cycle2InactivityThreshold e_dch_tti_256 =
	new UE_DTX_Cycle2InactivityThreshold(7);
    public static final UE_DTX_Cycle2InactivityThreshold spare8 =
	new UE_DTX_Cycle2InactivityThreshold(8);
    public static final UE_DTX_Cycle2InactivityThreshold spare7 =
	new UE_DTX_Cycle2InactivityThreshold(9);
    public static final UE_DTX_Cycle2InactivityThreshold spare6 =
	new UE_DTX_Cycle2InactivityThreshold(10);
    public static final UE_DTX_Cycle2InactivityThreshold spare5 =
	new UE_DTX_Cycle2InactivityThreshold(11);
    public static final UE_DTX_Cycle2InactivityThreshold spare4 =
	new UE_DTX_Cycle2InactivityThreshold(12);
    public static final UE_DTX_Cycle2InactivityThreshold spare3 =
	new UE_DTX_Cycle2InactivityThreshold(13);
    public static final UE_DTX_Cycle2InactivityThreshold spare2 =
	new UE_DTX_Cycle2InactivityThreshold(14);
    public static final UE_DTX_Cycle2InactivityThreshold spare1 =
	new UE_DTX_Cycle2InactivityThreshold(15);
    private final static UE_DTX_Cycle2InactivityThreshold cNamedNumbers[] = {
	 e_dch_tti_1, 
	 e_dch_tti_4, 
	 e_dch_tti_8, 
	 e_dch_tti_16, 
	 e_dch_tti_32, 
	 e_dch_tti_64, 
	 e_dch_tti_128, 
	 e_dch_tti_256, 
	 spare8, 
	 spare7, 
	 spare6, 
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
    
    public static UE_DTX_Cycle2InactivityThreshold valueOf(long value)
    {
	return (UE_DTX_Cycle2InactivityThreshold)e_dch_tti_1.lookupValue(value);
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
	    "UE_DTX_Cycle2InactivityThreshold"
	),
	new QName (
	    "InformationElements",
	    "UE-DTX-Cycle2InactivityThreshold"
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
		    "e-dch-tti-4",
		    1
		),
		new MemberListElement (
		    "e-dch-tti-8",
		    2
		),
		new MemberListElement (
		    "e-dch-tti-16",
		    3
		),
		new MemberListElement (
		    "e-dch-tti-32",
		    4
		),
		new MemberListElement (
		    "e-dch-tti-64",
		    5
		),
		new MemberListElement (
		    "e-dch-tti-128",
		    6
		),
		new MemberListElement (
		    "e-dch-tti-256",
		    7
		),
		new MemberListElement (
		    "spare8",
		    8
		),
		new MemberListElement (
		    "spare7",
		    9
		),
		new MemberListElement (
		    "spare6",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_DTX_Cycle2InactivityThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_DTX_Cycle2InactivityThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_DTX_Cycle2InactivityThreshold
