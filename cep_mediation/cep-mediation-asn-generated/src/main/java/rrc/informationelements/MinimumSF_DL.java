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
 * Define the ASN1 Type MinimumSF_DL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MinimumSF_DL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MinimumSF_DL()
    {
	super(cFirstNumber);
    }
    
    protected MinimumSF_DL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MinimumSF_DL sf1 =
	new MinimumSF_DL(0);
    public static final MinimumSF_DL sf16 =
	new MinimumSF_DL(1);
    private final static MinimumSF_DL cNamedNumbers[] = {
	 sf1, 
	 sf16
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
    
    public static MinimumSF_DL valueOf(long value)
    {
	return (MinimumSF_DL)sf1.lookupValue(value);
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
	    "MinimumSF_DL"
	),
	new QName (
	    "InformationElements",
	    "MinimumSF-DL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sf1",
		    0
		),
		new MemberListElement (
		    "sf16",
		    1
		)
	    }
	),
	0,
	sf1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MinimumSF_DL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MinimumSF_DL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MinimumSF_DL
