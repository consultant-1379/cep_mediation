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
 * Define the ASN1 Type MBMS_NI_CountPerFrame from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_NI_CountPerFrame extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_NI_CountPerFrame()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_NI_CountPerFrame(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_NI_CountPerFrame ni18 =
	new MBMS_NI_CountPerFrame(0);
    public static final MBMS_NI_CountPerFrame ni36 =
	new MBMS_NI_CountPerFrame(1);
    public static final MBMS_NI_CountPerFrame ni72 =
	new MBMS_NI_CountPerFrame(2);
    public static final MBMS_NI_CountPerFrame ni144 =
	new MBMS_NI_CountPerFrame(3);
    private final static MBMS_NI_CountPerFrame cNamedNumbers[] = {
	 ni18, 
	 ni36, 
	 ni72, 
	 ni144
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
    
    public static MBMS_NI_CountPerFrame valueOf(long value)
    {
	return (MBMS_NI_CountPerFrame)ni18.lookupValue(value);
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
	    "MBMS_NI_CountPerFrame"
	),
	new QName (
	    "InformationElements",
	    "MBMS-NI-CountPerFrame"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ni18",
		    0
		),
		new MemberListElement (
		    "ni36",
		    1
		),
		new MemberListElement (
		    "ni72",
		    2
		),
		new MemberListElement (
		    "ni144",
		    3
		)
	    }
	),
	0,
	ni18
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_NI_CountPerFrame object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_NI_CountPerFrame object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_NI_CountPerFrame
