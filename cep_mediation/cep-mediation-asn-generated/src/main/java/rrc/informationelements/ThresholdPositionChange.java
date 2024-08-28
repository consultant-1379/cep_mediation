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
 * Define the ASN1 Type ThresholdPositionChange from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ThresholdPositionChange extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ThresholdPositionChange()
    {
	super(cFirstNumber);
    }
    
    protected ThresholdPositionChange(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ThresholdPositionChange pc10 =
	new ThresholdPositionChange(0);
    public static final ThresholdPositionChange pc20 =
	new ThresholdPositionChange(1);
    public static final ThresholdPositionChange pc30 =
	new ThresholdPositionChange(2);
    public static final ThresholdPositionChange pc40 =
	new ThresholdPositionChange(3);
    public static final ThresholdPositionChange pc50 =
	new ThresholdPositionChange(4);
    public static final ThresholdPositionChange pc100 =
	new ThresholdPositionChange(5);
    public static final ThresholdPositionChange pc200 =
	new ThresholdPositionChange(6);
    public static final ThresholdPositionChange pc300 =
	new ThresholdPositionChange(7);
    public static final ThresholdPositionChange pc500 =
	new ThresholdPositionChange(8);
    public static final ThresholdPositionChange pc1000 =
	new ThresholdPositionChange(9);
    public static final ThresholdPositionChange pc2000 =
	new ThresholdPositionChange(10);
    public static final ThresholdPositionChange pc5000 =
	new ThresholdPositionChange(11);
    public static final ThresholdPositionChange pc10000 =
	new ThresholdPositionChange(12);
    public static final ThresholdPositionChange pc20000 =
	new ThresholdPositionChange(13);
    public static final ThresholdPositionChange pc50000 =
	new ThresholdPositionChange(14);
    public static final ThresholdPositionChange pc100000 =
	new ThresholdPositionChange(15);
    private final static ThresholdPositionChange cNamedNumbers[] = {
	 pc10, 
	 pc20, 
	 pc30, 
	 pc40, 
	 pc50, 
	 pc100, 
	 pc200, 
	 pc300, 
	 pc500, 
	 pc1000, 
	 pc2000, 
	 pc5000, 
	 pc10000, 
	 pc20000, 
	 pc50000, 
	 pc100000
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
    
    public static ThresholdPositionChange valueOf(long value)
    {
	return (ThresholdPositionChange)pc10.lookupValue(value);
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
	    "ThresholdPositionChange"
	),
	new QName (
	    "InformationElements",
	    "ThresholdPositionChange"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pc10",
		    0
		),
		new MemberListElement (
		    "pc20",
		    1
		),
		new MemberListElement (
		    "pc30",
		    2
		),
		new MemberListElement (
		    "pc40",
		    3
		),
		new MemberListElement (
		    "pc50",
		    4
		),
		new MemberListElement (
		    "pc100",
		    5
		),
		new MemberListElement (
		    "pc200",
		    6
		),
		new MemberListElement (
		    "pc300",
		    7
		),
		new MemberListElement (
		    "pc500",
		    8
		),
		new MemberListElement (
		    "pc1000",
		    9
		),
		new MemberListElement (
		    "pc2000",
		    10
		),
		new MemberListElement (
		    "pc5000",
		    11
		),
		new MemberListElement (
		    "pc10000",
		    12
		),
		new MemberListElement (
		    "pc20000",
		    13
		),
		new MemberListElement (
		    "pc50000",
		    14
		),
		new MemberListElement (
		    "pc100000",
		    15
		)
	    }
	),
	0,
	pc10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ThresholdPositionChange object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ThresholdPositionChange object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ThresholdPositionChange
