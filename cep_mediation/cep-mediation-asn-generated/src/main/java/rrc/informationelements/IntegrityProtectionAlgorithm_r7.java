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
 * Define the ASN1 Type IntegrityProtectionAlgorithm_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IntegrityProtectionAlgorithm_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IntegrityProtectionAlgorithm_r7()
    {
	super(cFirstNumber);
    }
    
    protected IntegrityProtectionAlgorithm_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IntegrityProtectionAlgorithm_r7 uia1 =
	new IntegrityProtectionAlgorithm_r7(0);
    public static final IntegrityProtectionAlgorithm_r7 uia2 =
	new IntegrityProtectionAlgorithm_r7(1);
    private final static IntegrityProtectionAlgorithm_r7 cNamedNumbers[] = {
	 uia1, 
	 uia2
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
    
    public static IntegrityProtectionAlgorithm_r7 valueOf(long value)
    {
	return (IntegrityProtectionAlgorithm_r7)uia1.lookupValue(value);
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
	    "IntegrityProtectionAlgorithm_r7"
	),
	new QName (
	    "InformationElements",
	    "IntegrityProtectionAlgorithm-r7"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "uia1",
		    0
		),
		new MemberListElement (
		    "uia2",
		    1
		)
	    }
	),
	0,
	uia1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithm_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntegrityProtectionAlgorithm_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntegrityProtectionAlgorithm_r7
