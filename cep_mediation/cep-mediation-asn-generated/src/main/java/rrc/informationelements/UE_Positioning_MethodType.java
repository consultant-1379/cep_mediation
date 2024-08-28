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
 * Define the ASN1 Type UE_Positioning_MethodType from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_Positioning_MethodType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_Positioning_MethodType()
    {
	super(cFirstNumber);
    }
    
    protected UE_Positioning_MethodType(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_Positioning_MethodType ue_Assisted =
	new UE_Positioning_MethodType(0);
    public static final UE_Positioning_MethodType ue_Based =
	new UE_Positioning_MethodType(1);
    public static final UE_Positioning_MethodType ue_BasedPreferred =
	new UE_Positioning_MethodType(2);
    public static final UE_Positioning_MethodType ue_AssistedPreferred =
	new UE_Positioning_MethodType(3);
    private final static UE_Positioning_MethodType cNamedNumbers[] = {
	 ue_Assisted, 
	 ue_Based, 
	 ue_BasedPreferred, 
	 ue_AssistedPreferred
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
    
    public static UE_Positioning_MethodType valueOf(long value)
    {
	return (UE_Positioning_MethodType)ue_Assisted.lookupValue(value);
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
	    "UE_Positioning_MethodType"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MethodType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ue-Assisted",
		    0
		),
		new MemberListElement (
		    "ue-Based",
		    1
		),
		new MemberListElement (
		    "ue-BasedPreferred",
		    2
		),
		new MemberListElement (
		    "ue-AssistedPreferred",
		    3
		)
	    }
	),
	0,
	ue_Assisted
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MethodType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MethodType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MethodType
