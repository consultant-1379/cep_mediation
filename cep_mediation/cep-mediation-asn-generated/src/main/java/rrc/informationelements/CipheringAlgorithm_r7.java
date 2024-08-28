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
 * Define the ASN1 Type CipheringAlgorithm_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CipheringAlgorithm_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CipheringAlgorithm_r7()
    {
	super(cFirstNumber);
    }
    
    protected CipheringAlgorithm_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CipheringAlgorithm_r7 uea0 =
	new CipheringAlgorithm_r7(0);
    public static final CipheringAlgorithm_r7 uea1 =
	new CipheringAlgorithm_r7(1);
    public static final CipheringAlgorithm_r7 uea2 =
	new CipheringAlgorithm_r7(2);
    private final static CipheringAlgorithm_r7 cNamedNumbers[] = {
	 uea0, 
	 uea1, 
	 uea2
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
    
    public static CipheringAlgorithm_r7 valueOf(long value)
    {
	return (CipheringAlgorithm_r7)uea0.lookupValue(value);
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
	    "CipheringAlgorithm_r7"
	),
	new QName (
	    "InformationElements",
	    "CipheringAlgorithm-r7"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "uea0",
		    0
		),
		new MemberListElement (
		    "uea1",
		    1
		),
		new MemberListElement (
		    "uea2",
		    2
		)
	    }
	),
	0,
	uea0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CipheringAlgorithm_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CipheringAlgorithm_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CipheringAlgorithm_r7
