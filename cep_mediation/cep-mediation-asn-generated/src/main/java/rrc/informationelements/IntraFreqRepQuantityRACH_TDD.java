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
 * Define the ASN1 Type IntraFreqRepQuantityRACH_TDD from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IntraFreqRepQuantityRACH_TDD extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IntraFreqRepQuantityRACH_TDD()
    {
	super(cFirstNumber);
    }
    
    protected IntraFreqRepQuantityRACH_TDD(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IntraFreqRepQuantityRACH_TDD timeslotISCP =
	new IntraFreqRepQuantityRACH_TDD(0);
    public static final IntraFreqRepQuantityRACH_TDD primaryCCPCH_RSCP =
	new IntraFreqRepQuantityRACH_TDD(1);
    public static final IntraFreqRepQuantityRACH_TDD noReport =
	new IntraFreqRepQuantityRACH_TDD(2);
    private final static IntraFreqRepQuantityRACH_TDD cNamedNumbers[] = {
	 timeslotISCP, 
	 primaryCCPCH_RSCP, 
	 noReport
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
    
    public static IntraFreqRepQuantityRACH_TDD valueOf(long value)
    {
	return (IntraFreqRepQuantityRACH_TDD)timeslotISCP.lookupValue(value);
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
	    "IntraFreqRepQuantityRACH_TDD"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqRepQuantityRACH-TDD"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "timeslotISCP",
		    0
		),
		new MemberListElement (
		    "primaryCCPCH-RSCP",
		    1
		),
		new MemberListElement (
		    "noReport",
		    2
		)
	    }
	),
	0,
	timeslotISCP
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqRepQuantityRACH_TDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqRepQuantityRACH_TDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqRepQuantityRACH_TDD
