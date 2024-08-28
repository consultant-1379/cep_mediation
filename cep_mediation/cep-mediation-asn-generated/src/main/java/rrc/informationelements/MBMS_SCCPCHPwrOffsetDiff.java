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
 * Define the ASN1 Type MBMS_SCCPCHPwrOffsetDiff from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_SCCPCHPwrOffsetDiff extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_SCCPCHPwrOffsetDiff()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_SCCPCHPwrOffsetDiff(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_SCCPCHPwrOffsetDiff mcpo_minus6 =
	new MBMS_SCCPCHPwrOffsetDiff(0);
    public static final MBMS_SCCPCHPwrOffsetDiff mcpo_minus3 =
	new MBMS_SCCPCHPwrOffsetDiff(1);
    public static final MBMS_SCCPCHPwrOffsetDiff mcpo_plus3 =
	new MBMS_SCCPCHPwrOffsetDiff(2);
    public static final MBMS_SCCPCHPwrOffsetDiff mcpo_plus6 =
	new MBMS_SCCPCHPwrOffsetDiff(3);
    private final static MBMS_SCCPCHPwrOffsetDiff cNamedNumbers[] = {
	 mcpo_minus6, 
	 mcpo_minus3, 
	 mcpo_plus3, 
	 mcpo_plus6
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
    
    public static MBMS_SCCPCHPwrOffsetDiff valueOf(long value)
    {
	return (MBMS_SCCPCHPwrOffsetDiff)mcpo_minus6.lookupValue(value);
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
	    "MBMS_SCCPCHPwrOffsetDiff"
	),
	new QName (
	    "InformationElements",
	    "MBMS-SCCPCHPwrOffsetDiff"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mcpo-minus6",
		    0
		),
		new MemberListElement (
		    "mcpo-minus3",
		    1
		),
		new MemberListElement (
		    "mcpo-plus3",
		    2
		),
		new MemberListElement (
		    "mcpo-plus6",
		    3
		)
	    }
	),
	0,
	mcpo_minus6
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_SCCPCHPwrOffsetDiff object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_SCCPCHPwrOffsetDiff object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_SCCPCHPwrOffsetDiff
