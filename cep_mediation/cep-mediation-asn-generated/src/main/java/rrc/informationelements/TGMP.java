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
 * Define the ASN1 Type TGMP from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TGMP extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TGMP()
    {
	super(cFirstNumber);
    }
    
    protected TGMP(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TGMP tdd_Measurement =
	new TGMP(0);
    public static final TGMP fdd_Measurement =
	new TGMP(1);
    public static final TGMP gsm_CarrierRSSIMeasurement =
	new TGMP(2);
    public static final TGMP gsm_initialBSICIdentification =
	new TGMP(3);
    public static final TGMP gsmBSICReconfirmation =
	new TGMP(4);
    public static final TGMP multi_carrier =
	new TGMP(5);
    private final static TGMP cNamedNumbers[] = {
	 tdd_Measurement, 
	 fdd_Measurement, 
	 gsm_CarrierRSSIMeasurement, 
	 gsm_initialBSICIdentification, 
	 gsmBSICReconfirmation, 
	 multi_carrier
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
    
    public static TGMP valueOf(long value)
    {
	return (TGMP)tdd_Measurement.lookupValue(value);
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
	    "TGMP"
	),
	new QName (
	    "InformationElements",
	    "TGMP"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tdd-Measurement",
		    0
		),
		new MemberListElement (
		    "fdd-Measurement",
		    1
		),
		new MemberListElement (
		    "gsm-CarrierRSSIMeasurement",
		    2
		),
		new MemberListElement (
		    "gsm-initialBSICIdentification",
		    3
		),
		new MemberListElement (
		    "gsmBSICReconfirmation",
		    4
		),
		new MemberListElement (
		    "multi-carrier",
		    5
		)
	    }
	),
	0,
	tdd_Measurement
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TGMP object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TGMP object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TGMP
