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
 * Define the ASN1 Type SSDT_UL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SSDT_UL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SSDT_UL()
    {
	super(cFirstNumber);
    }
    
    protected SSDT_UL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SSDT_UL ul =
	new SSDT_UL(0);
    public static final SSDT_UL ul_AndDL =
	new SSDT_UL(1);
    private final static SSDT_UL cNamedNumbers[] = {
	 ul, 
	 ul_AndDL
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
    
    public static SSDT_UL valueOf(long value)
    {
	return (SSDT_UL)ul.lookupValue(value);
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
	    "SSDT_UL"
	),
	new QName (
	    "InformationElements",
	    "SSDT-UL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ul",
		    0
		),
		new MemberListElement (
		    "ul-AndDL",
		    1
		)
	    }
	),
	0,
	ul
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SSDT_UL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SSDT_UL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SSDT_UL
