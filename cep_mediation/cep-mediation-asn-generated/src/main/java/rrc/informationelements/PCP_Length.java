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
 * Define the ASN1 Type PCP_Length from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PCP_Length extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PCP_Length()
    {
	super(cFirstNumber);
    }
    
    protected PCP_Length(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PCP_Length as0 =
	new PCP_Length(0);
    public static final PCP_Length as8 =
	new PCP_Length(1);
    private final static PCP_Length cNamedNumbers[] = {
	 as0, 
	 as8
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
    
    public static PCP_Length valueOf(long value)
    {
	return (PCP_Length)as0.lookupValue(value);
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
	    "PCP_Length"
	),
	new QName (
	    "InformationElements",
	    "PCP-Length"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "as0",
		    0
		),
		new MemberListElement (
		    "as8",
		    1
		)
	    }
	),
	0,
	as0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PCP_Length object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PCP_Length object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PCP_Length
