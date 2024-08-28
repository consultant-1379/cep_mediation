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
 * Define the ASN1 Type PCPICH_UsageForChannelEst from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PCPICH_UsageForChannelEst extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PCPICH_UsageForChannelEst()
    {
	super(cFirstNumber);
    }
    
    protected PCPICH_UsageForChannelEst(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PCPICH_UsageForChannelEst mayBeUsed =
	new PCPICH_UsageForChannelEst(0);
    public static final PCPICH_UsageForChannelEst shallNotBeUsed =
	new PCPICH_UsageForChannelEst(1);
    private final static PCPICH_UsageForChannelEst cNamedNumbers[] = {
	 mayBeUsed, 
	 shallNotBeUsed
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
    
    public static PCPICH_UsageForChannelEst valueOf(long value)
    {
	return (PCPICH_UsageForChannelEst)mayBeUsed.lookupValue(value);
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
	    "PCPICH_UsageForChannelEst"
	),
	new QName (
	    "InformationElements",
	    "PCPICH-UsageForChannelEst"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mayBeUsed",
		    0
		),
		new MemberListElement (
		    "shallNotBeUsed",
		    1
		)
	    }
	),
	0,
	mayBeUsed
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PCPICH_UsageForChannelEst object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PCPICH_UsageForChannelEst object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PCPICH_UsageForChannelEst
