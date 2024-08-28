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
 * Define the ASN1 Type MBMS_NI_CountPerFrame_IMB384 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_NI_CountPerFrame_IMB384 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_NI_CountPerFrame_IMB384()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_NI_CountPerFrame_IMB384(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_NI_CountPerFrame_IMB384 ni16 =
	new MBMS_NI_CountPerFrame_IMB384(0);
    public static final MBMS_NI_CountPerFrame_IMB384 ni32 =
	new MBMS_NI_CountPerFrame_IMB384(1);
    public static final MBMS_NI_CountPerFrame_IMB384 ni64 =
	new MBMS_NI_CountPerFrame_IMB384(2);
    public static final MBMS_NI_CountPerFrame_IMB384 ni128 =
	new MBMS_NI_CountPerFrame_IMB384(3);
    private final static MBMS_NI_CountPerFrame_IMB384 cNamedNumbers[] = {
	 ni16, 
	 ni32, 
	 ni64, 
	 ni128
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
    
    public static MBMS_NI_CountPerFrame_IMB384 valueOf(long value)
    {
	return (MBMS_NI_CountPerFrame_IMB384)ni16.lookupValue(value);
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
	    "MBMS_NI_CountPerFrame_IMB384"
	),
	new QName (
	    "InformationElements",
	    "MBMS-NI-CountPerFrame-IMB384"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ni16",
		    0
		),
		new MemberListElement (
		    "ni32",
		    1
		),
		new MemberListElement (
		    "ni64",
		    2
		),
		new MemberListElement (
		    "ni128",
		    3
		)
	    }
	),
	0,
	ni16
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_NI_CountPerFrame_IMB384 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_NI_CountPerFrame_IMB384 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_NI_CountPerFrame_IMB384
