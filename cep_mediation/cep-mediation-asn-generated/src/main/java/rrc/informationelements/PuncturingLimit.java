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
 * Define the ASN1 Type PuncturingLimit from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class PuncturingLimit extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PuncturingLimit()
    {
	super(cFirstNumber);
    }
    
    protected PuncturingLimit(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final PuncturingLimit pl0_40 =
	new PuncturingLimit(0);
    public static final PuncturingLimit pl0_44 =
	new PuncturingLimit(1);
    public static final PuncturingLimit pl0_48 =
	new PuncturingLimit(2);
    public static final PuncturingLimit pl0_52 =
	new PuncturingLimit(3);
    public static final PuncturingLimit pl0_56 =
	new PuncturingLimit(4);
    public static final PuncturingLimit pl0_60 =
	new PuncturingLimit(5);
    public static final PuncturingLimit pl0_64 =
	new PuncturingLimit(6);
    public static final PuncturingLimit pl0_68 =
	new PuncturingLimit(7);
    public static final PuncturingLimit pl0_72 =
	new PuncturingLimit(8);
    public static final PuncturingLimit pl0_76 =
	new PuncturingLimit(9);
    public static final PuncturingLimit pl0_80 =
	new PuncturingLimit(10);
    public static final PuncturingLimit pl0_84 =
	new PuncturingLimit(11);
    public static final PuncturingLimit pl0_88 =
	new PuncturingLimit(12);
    public static final PuncturingLimit pl0_92 =
	new PuncturingLimit(13);
    public static final PuncturingLimit pl0_96 =
	new PuncturingLimit(14);
    public static final PuncturingLimit pl1 =
	new PuncturingLimit(15);
    private final static PuncturingLimit cNamedNumbers[] = {
	 pl0_40, 
	 pl0_44, 
	 pl0_48, 
	 pl0_52, 
	 pl0_56, 
	 pl0_60, 
	 pl0_64, 
	 pl0_68, 
	 pl0_72, 
	 pl0_76, 
	 pl0_80, 
	 pl0_84, 
	 pl0_88, 
	 pl0_92, 
	 pl0_96, 
	 pl1
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
    
    public static PuncturingLimit valueOf(long value)
    {
	return (PuncturingLimit)pl0_40.lookupValue(value);
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
	    "PuncturingLimit"
	),
	new QName (
	    "InformationElements",
	    "PuncturingLimit"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pl0-40",
		    0
		),
		new MemberListElement (
		    "pl0-44",
		    1
		),
		new MemberListElement (
		    "pl0-48",
		    2
		),
		new MemberListElement (
		    "pl0-52",
		    3
		),
		new MemberListElement (
		    "pl0-56",
		    4
		),
		new MemberListElement (
		    "pl0-60",
		    5
		),
		new MemberListElement (
		    "pl0-64",
		    6
		),
		new MemberListElement (
		    "pl0-68",
		    7
		),
		new MemberListElement (
		    "pl0-72",
		    8
		),
		new MemberListElement (
		    "pl0-76",
		    9
		),
		new MemberListElement (
		    "pl0-80",
		    10
		),
		new MemberListElement (
		    "pl0-84",
		    11
		),
		new MemberListElement (
		    "pl0-88",
		    12
		),
		new MemberListElement (
		    "pl0-92",
		    13
		),
		new MemberListElement (
		    "pl0-96",
		    14
		),
		new MemberListElement (
		    "pl1",
		    15
		)
	    }
	),
	0,
	pl0_40
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PuncturingLimit object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PuncturingLimit object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PuncturingLimit
