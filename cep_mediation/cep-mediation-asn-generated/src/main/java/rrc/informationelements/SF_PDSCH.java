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
 * Define the ASN1 Type SF_PDSCH from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SF_PDSCH extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SF_PDSCH()
    {
	super(cFirstNumber);
    }
    
    protected SF_PDSCH(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SF_PDSCH sfp4 =
	new SF_PDSCH(0);
    public static final SF_PDSCH sfp8 =
	new SF_PDSCH(1);
    public static final SF_PDSCH sfp16 =
	new SF_PDSCH(2);
    public static final SF_PDSCH sfp32 =
	new SF_PDSCH(3);
    public static final SF_PDSCH sfp64 =
	new SF_PDSCH(4);
    public static final SF_PDSCH sfp128 =
	new SF_PDSCH(5);
    public static final SF_PDSCH sfp256 =
	new SF_PDSCH(6);
    private final static SF_PDSCH cNamedNumbers[] = {
	 sfp4, 
	 sfp8, 
	 sfp16, 
	 sfp32, 
	 sfp64, 
	 sfp128, 
	 sfp256
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
    
    public static SF_PDSCH valueOf(long value)
    {
	return (SF_PDSCH)sfp4.lookupValue(value);
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
	    "SF_PDSCH"
	),
	new QName (
	    "InformationElements",
	    "SF-PDSCH"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sfp4",
		    0
		),
		new MemberListElement (
		    "sfp8",
		    1
		),
		new MemberListElement (
		    "sfp16",
		    2
		),
		new MemberListElement (
		    "sfp32",
		    3
		),
		new MemberListElement (
		    "sfp64",
		    4
		),
		new MemberListElement (
		    "sfp128",
		    5
		),
		new MemberListElement (
		    "sfp256",
		    6
		)
	    }
	),
	0,
	sfp4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SF_PDSCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF_PDSCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF_PDSCH
