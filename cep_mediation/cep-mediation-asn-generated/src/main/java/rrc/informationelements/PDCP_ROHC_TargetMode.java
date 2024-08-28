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
 * Define the ASN1 Type PDCP_ROHC_TargetMode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PDCP_ROHC_TargetMode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PDCP_ROHC_TargetMode()
    {
	super(cFirstNumber);
    }
    
    protected PDCP_ROHC_TargetMode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PDCP_ROHC_TargetMode o_Mode =
	new PDCP_ROHC_TargetMode(0);
    public static final PDCP_ROHC_TargetMode r_Mode =
	new PDCP_ROHC_TargetMode(1);
    private final static PDCP_ROHC_TargetMode cNamedNumbers[] = {
	 o_Mode, 
	 r_Mode
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
    
    public static PDCP_ROHC_TargetMode valueOf(long value)
    {
	return (PDCP_ROHC_TargetMode)o_Mode.lookupValue(value);
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
	    "PDCP_ROHC_TargetMode"
	),
	new QName (
	    "InformationElements",
	    "PDCP-ROHC-TargetMode"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "o-Mode",
		    0
		),
		new MemberListElement (
		    "r-Mode",
		    1
		)
	    }
	),
	0,
	o_Mode
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDCP_ROHC_TargetMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_ROHC_TargetMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_ROHC_TargetMode
