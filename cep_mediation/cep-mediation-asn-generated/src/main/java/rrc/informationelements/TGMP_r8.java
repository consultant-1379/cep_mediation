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
 * Define the ASN1 Type TGMP_r8 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TGMP_r8 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TGMP_r8()
    {
	super(cFirstNumber);
    }
    
    protected TGMP_r8(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TGMP_r8 tdd_Measurement =
	new TGMP_r8(0);
    public static final TGMP_r8 fdd_Measurement =
	new TGMP_r8(1);
    public static final TGMP_r8 gsm_CarrierRSSIMeasurement =
	new TGMP_r8(2);
    public static final TGMP_r8 gsm_initialBSICIdentification =
	new TGMP_r8(3);
    public static final TGMP_r8 gsmBSICReconfirmation =
	new TGMP_r8(4);
    public static final TGMP_r8 multi_carrier =
	new TGMP_r8(5);
    public static final TGMP_r8 e_UTRA =
	new TGMP_r8(6);
    public static final TGMP_r8 spare =
	new TGMP_r8(7);
    private final static TGMP_r8 cNamedNumbers[] = {
	 tdd_Measurement, 
	 fdd_Measurement, 
	 gsm_CarrierRSSIMeasurement, 
	 gsm_initialBSICIdentification, 
	 gsmBSICReconfirmation, 
	 multi_carrier, 
	 e_UTRA, 
	 spare
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
    
    public static TGMP_r8 valueOf(long value)
    {
	return (TGMP_r8)tdd_Measurement.lookupValue(value);
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
	    "TGMP_r8"
	),
	new QName (
	    "InformationElements",
	    "TGMP-r8"
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
		),
		new MemberListElement (
		    "e-UTRA",
		    6
		),
		new MemberListElement (
		    "spare",
		    7
		)
	    }
	),
	0,
	tdd_Measurement
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TGMP_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TGMP_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TGMP_r8
