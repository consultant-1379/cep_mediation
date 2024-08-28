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
 * Define the ASN1 Type ThresholdSFN_SFN_Change from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ThresholdSFN_SFN_Change extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ThresholdSFN_SFN_Change()
    {
	super(cFirstNumber);
    }
    
    protected ThresholdSFN_SFN_Change(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ThresholdSFN_SFN_Change c0_25 =
	new ThresholdSFN_SFN_Change(0);
    public static final ThresholdSFN_SFN_Change c0_5 =
	new ThresholdSFN_SFN_Change(1);
    public static final ThresholdSFN_SFN_Change c1 =
	new ThresholdSFN_SFN_Change(2);
    public static final ThresholdSFN_SFN_Change c2 =
	new ThresholdSFN_SFN_Change(3);
    public static final ThresholdSFN_SFN_Change c3 =
	new ThresholdSFN_SFN_Change(4);
    public static final ThresholdSFN_SFN_Change c4 =
	new ThresholdSFN_SFN_Change(5);
    public static final ThresholdSFN_SFN_Change c5 =
	new ThresholdSFN_SFN_Change(6);
    public static final ThresholdSFN_SFN_Change c10 =
	new ThresholdSFN_SFN_Change(7);
    public static final ThresholdSFN_SFN_Change c20 =
	new ThresholdSFN_SFN_Change(8);
    public static final ThresholdSFN_SFN_Change c50 =
	new ThresholdSFN_SFN_Change(9);
    public static final ThresholdSFN_SFN_Change c100 =
	new ThresholdSFN_SFN_Change(10);
    public static final ThresholdSFN_SFN_Change c200 =
	new ThresholdSFN_SFN_Change(11);
    public static final ThresholdSFN_SFN_Change c500 =
	new ThresholdSFN_SFN_Change(12);
    public static final ThresholdSFN_SFN_Change c1000 =
	new ThresholdSFN_SFN_Change(13);
    public static final ThresholdSFN_SFN_Change c2000 =
	new ThresholdSFN_SFN_Change(14);
    public static final ThresholdSFN_SFN_Change c5000 =
	new ThresholdSFN_SFN_Change(15);
    private final static ThresholdSFN_SFN_Change cNamedNumbers[] = {
	 c0_25, 
	 c0_5, 
	 c1, 
	 c2, 
	 c3, 
	 c4, 
	 c5, 
	 c10, 
	 c20, 
	 c50, 
	 c100, 
	 c200, 
	 c500, 
	 c1000, 
	 c2000, 
	 c5000
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
    
    public static ThresholdSFN_SFN_Change valueOf(long value)
    {
	return (ThresholdSFN_SFN_Change)c0_25.lookupValue(value);
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
	    "ThresholdSFN_SFN_Change"
	),
	new QName (
	    "InformationElements",
	    "ThresholdSFN-SFN-Change"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "c0-25",
		    0
		),
		new MemberListElement (
		    "c0-5",
		    1
		),
		new MemberListElement (
		    "c1",
		    2
		),
		new MemberListElement (
		    "c2",
		    3
		),
		new MemberListElement (
		    "c3",
		    4
		),
		new MemberListElement (
		    "c4",
		    5
		),
		new MemberListElement (
		    "c5",
		    6
		),
		new MemberListElement (
		    "c10",
		    7
		),
		new MemberListElement (
		    "c20",
		    8
		),
		new MemberListElement (
		    "c50",
		    9
		),
		new MemberListElement (
		    "c100",
		    10
		),
		new MemberListElement (
		    "c200",
		    11
		),
		new MemberListElement (
		    "c500",
		    12
		),
		new MemberListElement (
		    "c1000",
		    13
		),
		new MemberListElement (
		    "c2000",
		    14
		),
		new MemberListElement (
		    "c5000",
		    15
		)
	    }
	),
	0,
	c0_25
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ThresholdSFN_SFN_Change object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ThresholdSFN_SFN_Change object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ThresholdSFN_SFN_Change
