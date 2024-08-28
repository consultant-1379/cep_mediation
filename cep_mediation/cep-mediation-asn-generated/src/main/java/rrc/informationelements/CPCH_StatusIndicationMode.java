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
 * Define the ASN1 Type CPCH_StatusIndicationMode from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CPCH_StatusIndicationMode extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CPCH_StatusIndicationMode()
    {
	super(cFirstNumber);
    }
    
    protected CPCH_StatusIndicationMode(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CPCH_StatusIndicationMode pa_mode =
	new CPCH_StatusIndicationMode(0);
    public static final CPCH_StatusIndicationMode pamsf_mode =
	new CPCH_StatusIndicationMode(1);
    private final static CPCH_StatusIndicationMode cNamedNumbers[] = {
	 pa_mode, 
	 pamsf_mode
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
    
    public static CPCH_StatusIndicationMode valueOf(long value)
    {
	return (CPCH_StatusIndicationMode)pa_mode.lookupValue(value);
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
	    "CPCH_StatusIndicationMode"
	),
	new QName (
	    "InformationElements",
	    "CPCH-StatusIndicationMode"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pa-mode",
		    0
		),
		new MemberListElement (
		    "pamsf-mode",
		    1
		)
	    }
	),
	0,
	pa_mode
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CPCH_StatusIndicationMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CPCH_StatusIndicationMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CPCH_StatusIndicationMode
