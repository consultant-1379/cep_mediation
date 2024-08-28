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
 * Define the ASN1 Type SFN_SFN_Drift from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class SFN_SFN_Drift extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SFN_SFN_Drift()
    {
	super(cFirstNumber);
    }
    
    protected SFN_SFN_Drift(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final SFN_SFN_Drift sfnsfndrift0 =
	new SFN_SFN_Drift(0);
    public static final SFN_SFN_Drift sfnsfndrift1 =
	new SFN_SFN_Drift(1);
    public static final SFN_SFN_Drift sfnsfndrift2 =
	new SFN_SFN_Drift(2);
    public static final SFN_SFN_Drift sfnsfndrift3 =
	new SFN_SFN_Drift(3);
    public static final SFN_SFN_Drift sfnsfndrift4 =
	new SFN_SFN_Drift(4);
    public static final SFN_SFN_Drift sfnsfndrift5 =
	new SFN_SFN_Drift(5);
    public static final SFN_SFN_Drift sfnsfndrift8 =
	new SFN_SFN_Drift(6);
    public static final SFN_SFN_Drift sfnsfndrift10 =
	new SFN_SFN_Drift(7);
    public static final SFN_SFN_Drift sfnsfndrift15 =
	new SFN_SFN_Drift(8);
    public static final SFN_SFN_Drift sfnsfndrift25 =
	new SFN_SFN_Drift(9);
    public static final SFN_SFN_Drift sfnsfndrift35 =
	new SFN_SFN_Drift(10);
    public static final SFN_SFN_Drift sfnsfndrift50 =
	new SFN_SFN_Drift(11);
    public static final SFN_SFN_Drift sfnsfndrift65 =
	new SFN_SFN_Drift(12);
    public static final SFN_SFN_Drift sfnsfndrift80 =
	new SFN_SFN_Drift(13);
    public static final SFN_SFN_Drift sfnsfndrift100 =
	new SFN_SFN_Drift(14);
    public static final SFN_SFN_Drift sfnsfndrift_1 =
	new SFN_SFN_Drift(15);
    public static final SFN_SFN_Drift sfnsfndrift_2 =
	new SFN_SFN_Drift(16);
    public static final SFN_SFN_Drift sfnsfndrift_3 =
	new SFN_SFN_Drift(17);
    public static final SFN_SFN_Drift sfnsfndrift_4 =
	new SFN_SFN_Drift(18);
    public static final SFN_SFN_Drift sfnsfndrift_5 =
	new SFN_SFN_Drift(19);
    public static final SFN_SFN_Drift sfnsfndrift_8 =
	new SFN_SFN_Drift(20);
    public static final SFN_SFN_Drift sfnsfndrift_10 =
	new SFN_SFN_Drift(21);
    public static final SFN_SFN_Drift sfnsfndrift_15 =
	new SFN_SFN_Drift(22);
    public static final SFN_SFN_Drift sfnsfndrift_25 =
	new SFN_SFN_Drift(23);
    public static final SFN_SFN_Drift sfnsfndrift_35 =
	new SFN_SFN_Drift(24);
    public static final SFN_SFN_Drift sfnsfndrift_50 =
	new SFN_SFN_Drift(25);
    public static final SFN_SFN_Drift sfnsfndrift_65 =
	new SFN_SFN_Drift(26);
    public static final SFN_SFN_Drift sfnsfndrift_80 =
	new SFN_SFN_Drift(27);
    public static final SFN_SFN_Drift sfnsfndrift_100 =
	new SFN_SFN_Drift(28);
    private final static SFN_SFN_Drift cNamedNumbers[] = {
	 sfnsfndrift0, 
	 sfnsfndrift1, 
	 sfnsfndrift2, 
	 sfnsfndrift3, 
	 sfnsfndrift4, 
	 sfnsfndrift5, 
	 sfnsfndrift8, 
	 sfnsfndrift10, 
	 sfnsfndrift15, 
	 sfnsfndrift25, 
	 sfnsfndrift35, 
	 sfnsfndrift50, 
	 sfnsfndrift65, 
	 sfnsfndrift80, 
	 sfnsfndrift100, 
	 sfnsfndrift_1, 
	 sfnsfndrift_2, 
	 sfnsfndrift_3, 
	 sfnsfndrift_4, 
	 sfnsfndrift_5, 
	 sfnsfndrift_8, 
	 sfnsfndrift_10, 
	 sfnsfndrift_15, 
	 sfnsfndrift_25, 
	 sfnsfndrift_35, 
	 sfnsfndrift_50, 
	 sfnsfndrift_65, 
	 sfnsfndrift_80, 
	 sfnsfndrift_100
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
    
    public static SFN_SFN_Drift valueOf(long value)
    {
	return (SFN_SFN_Drift)sfnsfndrift0.lookupValue(value);
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
	    "SFN_SFN_Drift"
	),
	new QName (
	    "InformationElements",
	    "SFN-SFN-Drift"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sfnsfndrift0",
		    0
		),
		new MemberListElement (
		    "sfnsfndrift1",
		    1
		),
		new MemberListElement (
		    "sfnsfndrift2",
		    2
		),
		new MemberListElement (
		    "sfnsfndrift3",
		    3
		),
		new MemberListElement (
		    "sfnsfndrift4",
		    4
		),
		new MemberListElement (
		    "sfnsfndrift5",
		    5
		),
		new MemberListElement (
		    "sfnsfndrift8",
		    6
		),
		new MemberListElement (
		    "sfnsfndrift10",
		    7
		),
		new MemberListElement (
		    "sfnsfndrift15",
		    8
		),
		new MemberListElement (
		    "sfnsfndrift25",
		    9
		),
		new MemberListElement (
		    "sfnsfndrift35",
		    10
		),
		new MemberListElement (
		    "sfnsfndrift50",
		    11
		),
		new MemberListElement (
		    "sfnsfndrift65",
		    12
		),
		new MemberListElement (
		    "sfnsfndrift80",
		    13
		),
		new MemberListElement (
		    "sfnsfndrift100",
		    14
		),
		new MemberListElement (
		    "sfnsfndrift-1",
		    15
		),
		new MemberListElement (
		    "sfnsfndrift-2",
		    16
		),
		new MemberListElement (
		    "sfnsfndrift-3",
		    17
		),
		new MemberListElement (
		    "sfnsfndrift-4",
		    18
		),
		new MemberListElement (
		    "sfnsfndrift-5",
		    19
		),
		new MemberListElement (
		    "sfnsfndrift-8",
		    20
		),
		new MemberListElement (
		    "sfnsfndrift-10",
		    21
		),
		new MemberListElement (
		    "sfnsfndrift-15",
		    22
		),
		new MemberListElement (
		    "sfnsfndrift-25",
		    23
		),
		new MemberListElement (
		    "sfnsfndrift-35",
		    24
		),
		new MemberListElement (
		    "sfnsfndrift-50",
		    25
		),
		new MemberListElement (
		    "sfnsfndrift-65",
		    26
		),
		new MemberListElement (
		    "sfnsfndrift-80",
		    27
		),
		new MemberListElement (
		    "sfnsfndrift-100",
		    28
		)
	    }
	),
	0,
	sfnsfndrift0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SFN_SFN_Drift object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SFN_SFN_Drift object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SFN_SFN_Drift
