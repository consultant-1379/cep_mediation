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
 * Define the ASN1 Type SFN_SFN_OTD_Type from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SFN_SFN_OTD_Type extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SFN_SFN_OTD_Type()
    {
	super(cFirstNumber);
    }
    
    protected SFN_SFN_OTD_Type(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SFN_SFN_OTD_Type noReport =
	new SFN_SFN_OTD_Type(0);
    public static final SFN_SFN_OTD_Type type1 =
	new SFN_SFN_OTD_Type(1);
    public static final SFN_SFN_OTD_Type type2 =
	new SFN_SFN_OTD_Type(2);
    private final static SFN_SFN_OTD_Type cNamedNumbers[] = {
	 noReport, 
	 type1, 
	 type2
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
    
    public static SFN_SFN_OTD_Type valueOf(long value)
    {
	return (SFN_SFN_OTD_Type)noReport.lookupValue(value);
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
	    "SFN_SFN_OTD_Type"
	),
	new QName (
	    "InformationElements",
	    "SFN-SFN-OTD-Type"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "noReport",
		    0
		),
		new MemberListElement (
		    "type1",
		    1
		),
		new MemberListElement (
		    "type2",
		    2
		)
	    }
	),
	0,
	noReport
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SFN_SFN_OTD_Type object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SFN_SFN_OTD_Type object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SFN_SFN_OTD_Type
