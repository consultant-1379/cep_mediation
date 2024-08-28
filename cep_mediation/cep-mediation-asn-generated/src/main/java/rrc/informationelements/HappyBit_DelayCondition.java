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
 * Define the ASN1 Type HappyBit_DelayCondition from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HappyBit_DelayCondition extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HappyBit_DelayCondition()
    {
	super(cFirstNumber);
    }
    
    protected HappyBit_DelayCondition(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HappyBit_DelayCondition ms2 =
	new HappyBit_DelayCondition(0);
    public static final HappyBit_DelayCondition ms10 =
	new HappyBit_DelayCondition(1);
    public static final HappyBit_DelayCondition ms20 =
	new HappyBit_DelayCondition(2);
    public static final HappyBit_DelayCondition ms50 =
	new HappyBit_DelayCondition(3);
    public static final HappyBit_DelayCondition ms100 =
	new HappyBit_DelayCondition(4);
    public static final HappyBit_DelayCondition ms200 =
	new HappyBit_DelayCondition(5);
    public static final HappyBit_DelayCondition ms500 =
	new HappyBit_DelayCondition(6);
    public static final HappyBit_DelayCondition ms1000 =
	new HappyBit_DelayCondition(7);
    private final static HappyBit_DelayCondition cNamedNumbers[] = {
	 ms2, 
	 ms10, 
	 ms20, 
	 ms50, 
	 ms100, 
	 ms200, 
	 ms500, 
	 ms1000
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
    
    public static HappyBit_DelayCondition valueOf(long value)
    {
	return (HappyBit_DelayCondition)ms2.lookupValue(value);
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
	    "HappyBit_DelayCondition"
	),
	new QName (
	    "InformationElements",
	    "HappyBit-DelayCondition"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ms2",
		    0
		),
		new MemberListElement (
		    "ms10",
		    1
		),
		new MemberListElement (
		    "ms20",
		    2
		),
		new MemberListElement (
		    "ms50",
		    3
		),
		new MemberListElement (
		    "ms100",
		    4
		),
		new MemberListElement (
		    "ms200",
		    5
		),
		new MemberListElement (
		    "ms500",
		    6
		),
		new MemberListElement (
		    "ms1000",
		    7
		)
	    }
	),
	0,
	ms2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HappyBit_DelayCondition object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HappyBit_DelayCondition object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HappyBit_DelayCondition
