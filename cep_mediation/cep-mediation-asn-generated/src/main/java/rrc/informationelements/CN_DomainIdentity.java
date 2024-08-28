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
 * Define the ASN1 Type CN_DomainIdentity from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CN_DomainIdentity extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CN_DomainIdentity()
    {
	super(cFirstNumber);
    }
    
    protected CN_DomainIdentity(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CN_DomainIdentity cs_domain =
	new CN_DomainIdentity(0);
    public static final CN_DomainIdentity ps_domain =
	new CN_DomainIdentity(1);
    private final static CN_DomainIdentity cNamedNumbers[] = {
	 cs_domain, 
	 ps_domain
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
    
    public static CN_DomainIdentity valueOf(long value)
    {
	return (CN_DomainIdentity)cs_domain.lookupValue(value);
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
	    "CN_DomainIdentity"
	),
	new QName (
	    "InformationElements",
	    "CN-DomainIdentity"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cs-domain",
		    0
		),
		new MemberListElement (
		    "ps-domain",
		    1
		)
	    }
	),
	0,
	cs_domain
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CN_DomainIdentity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CN_DomainIdentity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CN_DomainIdentity
