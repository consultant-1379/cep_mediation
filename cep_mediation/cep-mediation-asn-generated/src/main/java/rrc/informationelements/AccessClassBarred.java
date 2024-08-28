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
 * Define the ASN1 Type AccessClassBarred from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class AccessClassBarred extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AccessClassBarred()
    {
	super(cFirstNumber);
    }
    
    protected AccessClassBarred(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final AccessClassBarred barred =
	new AccessClassBarred(0);
    public static final AccessClassBarred notBarred =
	new AccessClassBarred(1);
    private final static AccessClassBarred cNamedNumbers[] = {
	 barred, 
	 notBarred
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
    
    public static AccessClassBarred valueOf(long value)
    {
	return (AccessClassBarred)barred.lookupValue(value);
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
	    "AccessClassBarred"
	),
	new QName (
	    "InformationElements",
	    "AccessClassBarred"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "barred",
		    0
		),
		new MemberListElement (
		    "notBarred",
		    1
		)
	    }
	),
	0,
	barred
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AccessClassBarred object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccessClassBarred object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccessClassBarred
