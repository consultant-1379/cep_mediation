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
 * Define the ASN1 Type MultiModeCapability from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MultiModeCapability extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MultiModeCapability()
    {
	super(cFirstNumber);
    }
    
    protected MultiModeCapability(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MultiModeCapability tdd =
	new MultiModeCapability(0);
    public static final MultiModeCapability fdd =
	new MultiModeCapability(1);
    public static final MultiModeCapability fdd_tdd =
	new MultiModeCapability(2);
    private final static MultiModeCapability cNamedNumbers[] = {
	 tdd, 
	 fdd, 
	 fdd_tdd
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
    
    public static MultiModeCapability valueOf(long value)
    {
	return (MultiModeCapability)tdd.lookupValue(value);
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
	    "MultiModeCapability"
	),
	new QName (
	    "InformationElements",
	    "MultiModeCapability"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tdd",
		    0
		),
		new MemberListElement (
		    "fdd",
		    1
		),
		new MemberListElement (
		    "fdd-tdd",
		    2
		)
	    }
	),
	0,
	tdd
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MultiModeCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiModeCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiModeCapability
