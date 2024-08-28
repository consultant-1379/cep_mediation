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
 * Define the ASN1 Type DL_CapabilityWithSimultaneousHS_DSCHConfig from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class DL_CapabilityWithSimultaneousHS_DSCHConfig extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DL_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	super(cFirstNumber);
    }
    
    protected DL_CapabilityWithSimultaneousHS_DSCHConfig(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final DL_CapabilityWithSimultaneousHS_DSCHConfig kbps32 =
	new DL_CapabilityWithSimultaneousHS_DSCHConfig(0);
    public static final DL_CapabilityWithSimultaneousHS_DSCHConfig kbps64 =
	new DL_CapabilityWithSimultaneousHS_DSCHConfig(1);
    public static final DL_CapabilityWithSimultaneousHS_DSCHConfig kbps128 =
	new DL_CapabilityWithSimultaneousHS_DSCHConfig(2);
    public static final DL_CapabilityWithSimultaneousHS_DSCHConfig kbps384 =
	new DL_CapabilityWithSimultaneousHS_DSCHConfig(3);
    private final static DL_CapabilityWithSimultaneousHS_DSCHConfig cNamedNumbers[] = {
	 kbps32, 
	 kbps64, 
	 kbps128, 
	 kbps384
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
    
    public static DL_CapabilityWithSimultaneousHS_DSCHConfig valueOf(long value)
    {
	return (DL_CapabilityWithSimultaneousHS_DSCHConfig)kbps32.lookupValue(value);
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
	    "DL_CapabilityWithSimultaneousHS_DSCHConfig"
	),
	new QName (
	    "InformationElements",
	    "DL-CapabilityWithSimultaneousHS-DSCHConfig"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "kbps32",
		    0
		),
		new MemberListElement (
		    "kbps64",
		    1
		),
		new MemberListElement (
		    "kbps128",
		    2
		),
		new MemberListElement (
		    "kbps384",
		    3
		)
	    }
	),
	0,
	kbps32
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_CapabilityWithSimultaneousHS_DSCHConfig object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CapabilityWithSimultaneousHS_DSCHConfig object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CapabilityWithSimultaneousHS_DSCHConfig
