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
 * Define the ASN1 Type InterFreqRepQuantityRACH_FDD from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class InterFreqRepQuantityRACH_FDD extends Enumerated {
    
    /**
     * The default constructor.
     */
    private InterFreqRepQuantityRACH_FDD()
    {
	super(cFirstNumber);
    }
    
    protected InterFreqRepQuantityRACH_FDD(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final InterFreqRepQuantityRACH_FDD cpich_EcN0 =
	new InterFreqRepQuantityRACH_FDD(0);
    public static final InterFreqRepQuantityRACH_FDD cpich_RSCP =
	new InterFreqRepQuantityRACH_FDD(1);
    private final static InterFreqRepQuantityRACH_FDD cNamedNumbers[] = {
	 cpich_EcN0, 
	 cpich_RSCP
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
    
    public static InterFreqRepQuantityRACH_FDD valueOf(long value)
    {
	return (InterFreqRepQuantityRACH_FDD)cpich_EcN0.lookupValue(value);
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
	    "InterFreqRepQuantityRACH_FDD"
	),
	new QName (
	    "InformationElements",
	    "InterFreqRepQuantityRACH-FDD"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cpich-EcN0",
		    0
		),
		new MemberListElement (
		    "cpich-RSCP",
		    1
		)
	    }
	),
	0,
	cpich_EcN0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' InterFreqRepQuantityRACH_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterFreqRepQuantityRACH_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterFreqRepQuantityRACH_FDD
