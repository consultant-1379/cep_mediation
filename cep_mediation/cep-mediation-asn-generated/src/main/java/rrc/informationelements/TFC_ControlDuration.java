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
 * Define the ASN1 Type TFC_ControlDuration from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TFC_ControlDuration extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TFC_ControlDuration()
    {
	super(cFirstNumber);
    }
    
    protected TFC_ControlDuration(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TFC_ControlDuration tfc_cd1 =
	new TFC_ControlDuration(0);
    public static final TFC_ControlDuration tfc_cd2 =
	new TFC_ControlDuration(1);
    public static final TFC_ControlDuration tfc_cd4 =
	new TFC_ControlDuration(2);
    public static final TFC_ControlDuration tfc_cd8 =
	new TFC_ControlDuration(3);
    public static final TFC_ControlDuration tfc_cd16 =
	new TFC_ControlDuration(4);
    public static final TFC_ControlDuration tfc_cd24 =
	new TFC_ControlDuration(5);
    public static final TFC_ControlDuration tfc_cd32 =
	new TFC_ControlDuration(6);
    public static final TFC_ControlDuration tfc_cd48 =
	new TFC_ControlDuration(7);
    public static final TFC_ControlDuration tfc_cd64 =
	new TFC_ControlDuration(8);
    public static final TFC_ControlDuration tfc_cd128 =
	new TFC_ControlDuration(9);
    public static final TFC_ControlDuration tfc_cd192 =
	new TFC_ControlDuration(10);
    public static final TFC_ControlDuration tfc_cd256 =
	new TFC_ControlDuration(11);
    public static final TFC_ControlDuration tfc_cd512 =
	new TFC_ControlDuration(12);
    private final static TFC_ControlDuration cNamedNumbers[] = {
	 tfc_cd1, 
	 tfc_cd2, 
	 tfc_cd4, 
	 tfc_cd8, 
	 tfc_cd16, 
	 tfc_cd24, 
	 tfc_cd32, 
	 tfc_cd48, 
	 tfc_cd64, 
	 tfc_cd128, 
	 tfc_cd192, 
	 tfc_cd256, 
	 tfc_cd512
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
    
    public static TFC_ControlDuration valueOf(long value)
    {
	return (TFC_ControlDuration)tfc_cd1.lookupValue(value);
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
	    "TFC_ControlDuration"
	),
	new QName (
	    "InformationElements",
	    "TFC-ControlDuration"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tfc-cd1",
		    0
		),
		new MemberListElement (
		    "tfc-cd2",
		    1
		),
		new MemberListElement (
		    "tfc-cd4",
		    2
		),
		new MemberListElement (
		    "tfc-cd8",
		    3
		),
		new MemberListElement (
		    "tfc-cd16",
		    4
		),
		new MemberListElement (
		    "tfc-cd24",
		    5
		),
		new MemberListElement (
		    "tfc-cd32",
		    6
		),
		new MemberListElement (
		    "tfc-cd48",
		    7
		),
		new MemberListElement (
		    "tfc-cd64",
		    8
		),
		new MemberListElement (
		    "tfc-cd128",
		    9
		),
		new MemberListElement (
		    "tfc-cd192",
		    10
		),
		new MemberListElement (
		    "tfc-cd256",
		    11
		),
		new MemberListElement (
		    "tfc-cd512",
		    12
		)
	    }
	),
	0,
	tfc_cd1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TFC_ControlDuration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFC_ControlDuration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFC_ControlDuration
