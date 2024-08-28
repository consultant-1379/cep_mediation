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
 * Define the ASN1 Type UE_SpecificCapabilityInformation_LCRTDD from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_SpecificCapabilityInformation_LCRTDD extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_SpecificCapabilityInformation_LCRTDD()
    {
	super(cFirstNumber);
    }
    
    protected UE_SpecificCapabilityInformation_LCRTDD(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_SpecificCapabilityInformation_LCRTDD nF =
	new UE_SpecificCapabilityInformation_LCRTDD(0);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_TriRx_UniTx =
	new UE_SpecificCapabilityInformation_LCRTDD(1);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_TriRx_TriTx =
	new UE_SpecificCapabilityInformation_LCRTDD(2);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_HexRx_UniTx =
	new UE_SpecificCapabilityInformation_LCRTDD(3);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_HexRx_TriTx =
	new UE_SpecificCapabilityInformation_LCRTDD(4);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_HexRx_HexTx =
	new UE_SpecificCapabilityInformation_LCRTDD(5);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_TwoRx_UniTx =
	new UE_SpecificCapabilityInformation_LCRTDD(6);
    public static final UE_SpecificCapabilityInformation_LCRTDD nFMc_TwoRx_TwoTx =
	new UE_SpecificCapabilityInformation_LCRTDD(7);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare8 =
	new UE_SpecificCapabilityInformation_LCRTDD(8);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare7 =
	new UE_SpecificCapabilityInformation_LCRTDD(9);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare6 =
	new UE_SpecificCapabilityInformation_LCRTDD(10);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare5 =
	new UE_SpecificCapabilityInformation_LCRTDD(11);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare4 =
	new UE_SpecificCapabilityInformation_LCRTDD(12);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare3 =
	new UE_SpecificCapabilityInformation_LCRTDD(13);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare2 =
	new UE_SpecificCapabilityInformation_LCRTDD(14);
    public static final UE_SpecificCapabilityInformation_LCRTDD spare1 =
	new UE_SpecificCapabilityInformation_LCRTDD(15);
    private final static UE_SpecificCapabilityInformation_LCRTDD cNamedNumbers[] = {
	 nF, 
	 nFMc_TriRx_UniTx, 
	 nFMc_TriRx_TriTx, 
	 nFMc_HexRx_UniTx, 
	 nFMc_HexRx_TriTx, 
	 nFMc_HexRx_HexTx, 
	 nFMc_TwoRx_UniTx, 
	 nFMc_TwoRx_TwoTx, 
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
    
    public static UE_SpecificCapabilityInformation_LCRTDD valueOf(long value)
    {
	return (UE_SpecificCapabilityInformation_LCRTDD)nF.lookupValue(value);
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
	    "UE_SpecificCapabilityInformation_LCRTDD"
	),
	new QName (
	    "InformationElements",
	    "UE-SpecificCapabilityInformation-LCRTDD"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "nF",
		    0
		),
		new MemberListElement (
		    "nFMc-TriRx-UniTx",
		    1
		),
		new MemberListElement (
		    "nFMc-TriRx-TriTx",
		    2
		),
		new MemberListElement (
		    "nFMc-HexRx-UniTx",
		    3
		),
		new MemberListElement (
		    "nFMc-HexRx-TriTx",
		    4
		),
		new MemberListElement (
		    "nFMc-HexRx-HexTx",
		    5
		),
		new MemberListElement (
		    "nFMc-TwoRx-UniTx",
		    6
		),
		new MemberListElement (
		    "nFMc-TwoRx-TwoTx",
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
	nF
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_SpecificCapabilityInformation_LCRTDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_SpecificCapabilityInformation_LCRTDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_SpecificCapabilityInformation_LCRTDD
