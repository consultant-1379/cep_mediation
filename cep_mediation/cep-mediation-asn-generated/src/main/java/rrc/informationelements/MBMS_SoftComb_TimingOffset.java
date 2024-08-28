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
 * Define the ASN1 Type MBMS_SoftComb_TimingOffset from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_SoftComb_TimingOffset extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_SoftComb_TimingOffset()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_SoftComb_TimingOffset(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_SoftComb_TimingOffset ms0 =
	new MBMS_SoftComb_TimingOffset(0);
    public static final MBMS_SoftComb_TimingOffset ms10 =
	new MBMS_SoftComb_TimingOffset(1);
    public static final MBMS_SoftComb_TimingOffset ms20 =
	new MBMS_SoftComb_TimingOffset(2);
    public static final MBMS_SoftComb_TimingOffset ms40 =
	new MBMS_SoftComb_TimingOffset(3);
    private final static MBMS_SoftComb_TimingOffset cNamedNumbers[] = {
	 ms0, 
	 ms10, 
	 ms20, 
	 ms40
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
    
    public static MBMS_SoftComb_TimingOffset valueOf(long value)
    {
	return (MBMS_SoftComb_TimingOffset)ms0.lookupValue(value);
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
	    "MBMS_SoftComb_TimingOffset"
	),
	new QName (
	    "InformationElements",
	    "MBMS-SoftComb-TimingOffset"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms0",
		    0
		),
		new MemberListElement (
		    "ms10",
		    1
		),
		new MemberListElement (
		    "ms20",
		    2
		),
		new MemberListElement (
		    "ms40",
		    3
		)
	    }
	),
	0,
	ms0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_SoftComb_TimingOffset object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_SoftComb_TimingOffset object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_SoftComb_TimingOffset
