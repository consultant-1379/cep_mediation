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
 * Define the ASN1 Type MBMS_AccessProbabilityFactor from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MBMS_AccessProbabilityFactor extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MBMS_AccessProbabilityFactor()
    {
	super(cFirstNumber);
    }
    
    protected MBMS_AccessProbabilityFactor(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MBMS_AccessProbabilityFactor apf0 =
	new MBMS_AccessProbabilityFactor(0);
    public static final MBMS_AccessProbabilityFactor apf32 =
	new MBMS_AccessProbabilityFactor(1);
    public static final MBMS_AccessProbabilityFactor apf64 =
	new MBMS_AccessProbabilityFactor(2);
    public static final MBMS_AccessProbabilityFactor apf96 =
	new MBMS_AccessProbabilityFactor(3);
    public static final MBMS_AccessProbabilityFactor apf128 =
	new MBMS_AccessProbabilityFactor(4);
    public static final MBMS_AccessProbabilityFactor apf160 =
	new MBMS_AccessProbabilityFactor(5);
    public static final MBMS_AccessProbabilityFactor apf192 =
	new MBMS_AccessProbabilityFactor(6);
    public static final MBMS_AccessProbabilityFactor apf224 =
	new MBMS_AccessProbabilityFactor(7);
    public static final MBMS_AccessProbabilityFactor apf256 =
	new MBMS_AccessProbabilityFactor(8);
    public static final MBMS_AccessProbabilityFactor apf288 =
	new MBMS_AccessProbabilityFactor(9);
    public static final MBMS_AccessProbabilityFactor apf320 =
	new MBMS_AccessProbabilityFactor(10);
    public static final MBMS_AccessProbabilityFactor apf352 =
	new MBMS_AccessProbabilityFactor(11);
    public static final MBMS_AccessProbabilityFactor apf384 =
	new MBMS_AccessProbabilityFactor(12);
    public static final MBMS_AccessProbabilityFactor apf416 =
	new MBMS_AccessProbabilityFactor(13);
    public static final MBMS_AccessProbabilityFactor apf448 =
	new MBMS_AccessProbabilityFactor(14);
    public static final MBMS_AccessProbabilityFactor apf480 =
	new MBMS_AccessProbabilityFactor(15);
    public static final MBMS_AccessProbabilityFactor apf512 =
	new MBMS_AccessProbabilityFactor(16);
    public static final MBMS_AccessProbabilityFactor apf544 =
	new MBMS_AccessProbabilityFactor(17);
    public static final MBMS_AccessProbabilityFactor apf576 =
	new MBMS_AccessProbabilityFactor(18);
    public static final MBMS_AccessProbabilityFactor apf608 =
	new MBMS_AccessProbabilityFactor(19);
    public static final MBMS_AccessProbabilityFactor apf640 =
	new MBMS_AccessProbabilityFactor(20);
    public static final MBMS_AccessProbabilityFactor apf672 =
	new MBMS_AccessProbabilityFactor(21);
    public static final MBMS_AccessProbabilityFactor apf704 =
	new MBMS_AccessProbabilityFactor(22);
    public static final MBMS_AccessProbabilityFactor apf736 =
	new MBMS_AccessProbabilityFactor(23);
    public static final MBMS_AccessProbabilityFactor apf768 =
	new MBMS_AccessProbabilityFactor(24);
    public static final MBMS_AccessProbabilityFactor apf800 =
	new MBMS_AccessProbabilityFactor(25);
    public static final MBMS_AccessProbabilityFactor apf832 =
	new MBMS_AccessProbabilityFactor(26);
    public static final MBMS_AccessProbabilityFactor apf864 =
	new MBMS_AccessProbabilityFactor(27);
    public static final MBMS_AccessProbabilityFactor apf896 =
	new MBMS_AccessProbabilityFactor(28);
    public static final MBMS_AccessProbabilityFactor apf928 =
	new MBMS_AccessProbabilityFactor(29);
    public static final MBMS_AccessProbabilityFactor apf960 =
	new MBMS_AccessProbabilityFactor(30);
    public static final MBMS_AccessProbabilityFactor apf1000 =
	new MBMS_AccessProbabilityFactor(31);
    private final static MBMS_AccessProbabilityFactor cNamedNumbers[] = {
	 apf0, 
	 apf32, 
	 apf64, 
	 apf96, 
	 apf128, 
	 apf160, 
	 apf192, 
	 apf224, 
	 apf256, 
	 apf288, 
	 apf320, 
	 apf352, 
	 apf384, 
	 apf416, 
	 apf448, 
	 apf480, 
	 apf512, 
	 apf544, 
	 apf576, 
	 apf608, 
	 apf640, 
	 apf672, 
	 apf704, 
	 apf736, 
	 apf768, 
	 apf800, 
	 apf832, 
	 apf864, 
	 apf896, 
	 apf928, 
	 apf960, 
	 apf1000
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
    
    public static MBMS_AccessProbabilityFactor valueOf(long value)
    {
	return (MBMS_AccessProbabilityFactor)apf0.lookupValue(value);
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
	    "MBMS_AccessProbabilityFactor"
	),
	new QName (
	    "InformationElements",
	    "MBMS-AccessProbabilityFactor"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "apf0",
		    0
		),
		new MemberListElement (
		    "apf32",
		    1
		),
		new MemberListElement (
		    "apf64",
		    2
		),
		new MemberListElement (
		    "apf96",
		    3
		),
		new MemberListElement (
		    "apf128",
		    4
		),
		new MemberListElement (
		    "apf160",
		    5
		),
		new MemberListElement (
		    "apf192",
		    6
		),
		new MemberListElement (
		    "apf224",
		    7
		),
		new MemberListElement (
		    "apf256",
		    8
		),
		new MemberListElement (
		    "apf288",
		    9
		),
		new MemberListElement (
		    "apf320",
		    10
		),
		new MemberListElement (
		    "apf352",
		    11
		),
		new MemberListElement (
		    "apf384",
		    12
		),
		new MemberListElement (
		    "apf416",
		    13
		),
		new MemberListElement (
		    "apf448",
		    14
		),
		new MemberListElement (
		    "apf480",
		    15
		),
		new MemberListElement (
		    "apf512",
		    16
		),
		new MemberListElement (
		    "apf544",
		    17
		),
		new MemberListElement (
		    "apf576",
		    18
		),
		new MemberListElement (
		    "apf608",
		    19
		),
		new MemberListElement (
		    "apf640",
		    20
		),
		new MemberListElement (
		    "apf672",
		    21
		),
		new MemberListElement (
		    "apf704",
		    22
		),
		new MemberListElement (
		    "apf736",
		    23
		),
		new MemberListElement (
		    "apf768",
		    24
		),
		new MemberListElement (
		    "apf800",
		    25
		),
		new MemberListElement (
		    "apf832",
		    26
		),
		new MemberListElement (
		    "apf864",
		    27
		),
		new MemberListElement (
		    "apf896",
		    28
		),
		new MemberListElement (
		    "apf928",
		    29
		),
		new MemberListElement (
		    "apf960",
		    30
		),
		new MemberListElement (
		    "apf1000",
		    31
		)
	    }
	),
	0,
	apf0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MBMS_AccessProbabilityFactor object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_AccessProbabilityFactor object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_AccessProbabilityFactor
