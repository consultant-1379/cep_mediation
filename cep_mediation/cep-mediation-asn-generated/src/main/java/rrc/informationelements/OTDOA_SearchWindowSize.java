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
 * Define the ASN1 Type OTDOA_SearchWindowSize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class OTDOA_SearchWindowSize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private OTDOA_SearchWindowSize()
    {
	super(cFirstNumber);
    }
    
    protected OTDOA_SearchWindowSize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final OTDOA_SearchWindowSize c20 =
	new OTDOA_SearchWindowSize(0);
    public static final OTDOA_SearchWindowSize c40 =
	new OTDOA_SearchWindowSize(1);
    public static final OTDOA_SearchWindowSize c80 =
	new OTDOA_SearchWindowSize(2);
    public static final OTDOA_SearchWindowSize c160 =
	new OTDOA_SearchWindowSize(3);
    public static final OTDOA_SearchWindowSize c320 =
	new OTDOA_SearchWindowSize(4);
    public static final OTDOA_SearchWindowSize c640 =
	new OTDOA_SearchWindowSize(5);
    public static final OTDOA_SearchWindowSize c1280 =
	new OTDOA_SearchWindowSize(6);
    public static final OTDOA_SearchWindowSize moreThan1280 =
	new OTDOA_SearchWindowSize(7);
    private final static OTDOA_SearchWindowSize cNamedNumbers[] = {
	 c20, 
	 c40, 
	 c80, 
	 c160, 
	 c320, 
	 c640, 
	 c1280, 
	 moreThan1280
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
    
    public static OTDOA_SearchWindowSize valueOf(long value)
    {
	return (OTDOA_SearchWindowSize)c20.lookupValue(value);
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
	    "OTDOA_SearchWindowSize"
	),
	new QName (
	    "InformationElements",
	    "OTDOA-SearchWindowSize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "c20",
		    0
		),
		new MemberListElement (
		    "c40",
		    1
		),
		new MemberListElement (
		    "c80",
		    2
		),
		new MemberListElement (
		    "c160",
		    3
		),
		new MemberListElement (
		    "c320",
		    4
		),
		new MemberListElement (
		    "c640",
		    5
		),
		new MemberListElement (
		    "c1280",
		    6
		),
		new MemberListElement (
		    "moreThan1280",
		    7
		)
	    }
	),
	0,
	c20
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' OTDOA_SearchWindowSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OTDOA_SearchWindowSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OTDOA_SearchWindowSize
