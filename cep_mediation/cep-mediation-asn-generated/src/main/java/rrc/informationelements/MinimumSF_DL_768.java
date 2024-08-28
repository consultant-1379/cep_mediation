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
 * Define the ASN1 Type MinimumSF_DL_768 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MinimumSF_DL_768 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MinimumSF_DL_768()
    {
	super(cFirstNumber);
    }
    
    protected MinimumSF_DL_768(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MinimumSF_DL_768 sf1 =
	new MinimumSF_DL_768(0);
    public static final MinimumSF_DL_768 sf32 =
	new MinimumSF_DL_768(1);
    private final static MinimumSF_DL_768 cNamedNumbers[] = {
	 sf1, 
	 sf32
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
    
    public static MinimumSF_DL_768 valueOf(long value)
    {
	return (MinimumSF_DL_768)sf1.lookupValue(value);
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
	    "MinimumSF_DL_768"
	),
	new QName (
	    "InformationElements",
	    "MinimumSF-DL-768"
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
		    "sf32",
		    1
		)
	    }
	),
	0,
	sf1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MinimumSF_DL_768 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MinimumSF_DL_768 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MinimumSF_DL_768
