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
 * Define the ASN1 Type IntraFreqMeasQuantity_FDD_sib3 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IntraFreqMeasQuantity_FDD_sib3 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IntraFreqMeasQuantity_FDD_sib3()
    {
	super(cFirstNumber);
    }
    
    protected IntraFreqMeasQuantity_FDD_sib3(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IntraFreqMeasQuantity_FDD_sib3 cpich_Ec_N0 =
	new IntraFreqMeasQuantity_FDD_sib3(0);
    public static final IntraFreqMeasQuantity_FDD_sib3 cpich_RSCP =
	new IntraFreqMeasQuantity_FDD_sib3(1);
    private final static IntraFreqMeasQuantity_FDD_sib3 cNamedNumbers[] = {
	 cpich_Ec_N0, 
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
    
    public static IntraFreqMeasQuantity_FDD_sib3 valueOf(long value)
    {
	return (IntraFreqMeasQuantity_FDD_sib3)cpich_Ec_N0.lookupValue(value);
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
	    "IntraFreqMeasQuantity_FDD_sib3"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqMeasQuantity-FDD-sib3"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "cpich-Ec-N0",
		    0
		),
		new MemberListElement (
		    "cpich-RSCP",
		    1
		)
	    }
	),
	0,
	cpich_Ec_N0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity_FDD_sib3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity_FDD_sib3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqMeasQuantity_FDD_sib3
