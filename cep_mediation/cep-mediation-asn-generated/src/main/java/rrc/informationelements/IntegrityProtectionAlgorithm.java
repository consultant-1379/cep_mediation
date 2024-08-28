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
 * Define the ASN1 Type IntegrityProtectionAlgorithm from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IntegrityProtectionAlgorithm extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IntegrityProtectionAlgorithm()
    {
	super(cFirstNumber);
    }
    
    protected IntegrityProtectionAlgorithm(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IntegrityProtectionAlgorithm uia1 =
	new IntegrityProtectionAlgorithm(0);
    private final static IntegrityProtectionAlgorithm cNamedNumbers[] = {
	 uia1
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
    
    public static IntegrityProtectionAlgorithm valueOf(long value)
    {
	return (IntegrityProtectionAlgorithm)uia1.lookupValue(value);
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
	    "IntegrityProtectionAlgorithm"
	),
	new QName (
	    "InformationElements",
	    "IntegrityProtectionAlgorithm"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "uia1",
		    0
		)
	    }
	),
	0,
	uia1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithm object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithm object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtectionAlgorithm
