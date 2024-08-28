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
 * Define the ASN1 Type Tutran_Ganss_DriftRate from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Tutran_Ganss_DriftRate extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Tutran_Ganss_DriftRate()
    {
	super(cFirstNumber);
    }
    
    protected Tutran_Ganss_DriftRate(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Tutran_Ganss_DriftRate ugdr0 =
	new Tutran_Ganss_DriftRate(0);
    public static final Tutran_Ganss_DriftRate ugdr1 =
	new Tutran_Ganss_DriftRate(1);
    public static final Tutran_Ganss_DriftRate ugdr2 =
	new Tutran_Ganss_DriftRate(2);
    public static final Tutran_Ganss_DriftRate ugdr5 =
	new Tutran_Ganss_DriftRate(3);
    public static final Tutran_Ganss_DriftRate ugdr10 =
	new Tutran_Ganss_DriftRate(4);
    public static final Tutran_Ganss_DriftRate ugdr15 =
	new Tutran_Ganss_DriftRate(5);
    public static final Tutran_Ganss_DriftRate ugdr25 =
	new Tutran_Ganss_DriftRate(6);
    public static final Tutran_Ganss_DriftRate ugdr50 =
	new Tutran_Ganss_DriftRate(7);
    public static final Tutran_Ganss_DriftRate ugdr_1 =
	new Tutran_Ganss_DriftRate(8);
    public static final Tutran_Ganss_DriftRate ugdr_2 =
	new Tutran_Ganss_DriftRate(9);
    public static final Tutran_Ganss_DriftRate ugdr_5 =
	new Tutran_Ganss_DriftRate(10);
    public static final Tutran_Ganss_DriftRate ugdr_10 =
	new Tutran_Ganss_DriftRate(11);
    public static final Tutran_Ganss_DriftRate ugdr_15 =
	new Tutran_Ganss_DriftRate(12);
    public static final Tutran_Ganss_DriftRate ugdr_25 =
	new Tutran_Ganss_DriftRate(13);
    public static final Tutran_Ganss_DriftRate ugdr_50 =
	new Tutran_Ganss_DriftRate(14);
    public static final Tutran_Ganss_DriftRate spare =
	new Tutran_Ganss_DriftRate(15);
    private final static Tutran_Ganss_DriftRate cNamedNumbers[] = {
	 ugdr0, 
	 ugdr1, 
	 ugdr2, 
	 ugdr5, 
	 ugdr10, 
	 ugdr15, 
	 ugdr25, 
	 ugdr50, 
	 ugdr_1, 
	 ugdr_2, 
	 ugdr_5, 
	 ugdr_10, 
	 ugdr_15, 
	 ugdr_25, 
	 ugdr_50, 
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
    
    public static Tutran_Ganss_DriftRate valueOf(long value)
    {
	return (Tutran_Ganss_DriftRate)ugdr0.lookupValue(value);
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
	    "Tutran_Ganss_DriftRate"
	),
	new QName (
	    "InformationElements",
	    "Tutran-Ganss-DriftRate"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ugdr0",
		    0
		),
		new MemberListElement (
		    "ugdr1",
		    1
		),
		new MemberListElement (
		    "ugdr2",
		    2
		),
		new MemberListElement (
		    "ugdr5",
		    3
		),
		new MemberListElement (
		    "ugdr10",
		    4
		),
		new MemberListElement (
		    "ugdr15",
		    5
		),
		new MemberListElement (
		    "ugdr25",
		    6
		),
		new MemberListElement (
		    "ugdr50",
		    7
		),
		new MemberListElement (
		    "ugdr-1",
		    8
		),
		new MemberListElement (
		    "ugdr-2",
		    9
		),
		new MemberListElement (
		    "ugdr-5",
		    10
		),
		new MemberListElement (
		    "ugdr-10",
		    11
		),
		new MemberListElement (
		    "ugdr-15",
		    12
		),
		new MemberListElement (
		    "ugdr-25",
		    13
		),
		new MemberListElement (
		    "ugdr-50",
		    14
		),
		new MemberListElement (
		    "spare",
		    15
		)
	    }
	),
	0,
	ugdr0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Tutran_Ganss_DriftRate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Tutran_Ganss_DriftRate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Tutran_Ganss_DriftRate
