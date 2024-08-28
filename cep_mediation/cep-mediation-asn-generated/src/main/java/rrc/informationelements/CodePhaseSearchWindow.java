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
 * Define the ASN1 Type CodePhaseSearchWindow from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CodePhaseSearchWindow extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CodePhaseSearchWindow()
    {
	super(cFirstNumber);
    }
    
    protected CodePhaseSearchWindow(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CodePhaseSearchWindow w1023 =
	new CodePhaseSearchWindow(0);
    public static final CodePhaseSearchWindow w1 =
	new CodePhaseSearchWindow(1);
    public static final CodePhaseSearchWindow w2 =
	new CodePhaseSearchWindow(2);
    public static final CodePhaseSearchWindow w3 =
	new CodePhaseSearchWindow(3);
    public static final CodePhaseSearchWindow w4 =
	new CodePhaseSearchWindow(4);
    public static final CodePhaseSearchWindow w6 =
	new CodePhaseSearchWindow(5);
    public static final CodePhaseSearchWindow w8 =
	new CodePhaseSearchWindow(6);
    public static final CodePhaseSearchWindow w12 =
	new CodePhaseSearchWindow(7);
    public static final CodePhaseSearchWindow w16 =
	new CodePhaseSearchWindow(8);
    public static final CodePhaseSearchWindow w24 =
	new CodePhaseSearchWindow(9);
    public static final CodePhaseSearchWindow w32 =
	new CodePhaseSearchWindow(10);
    public static final CodePhaseSearchWindow w48 =
	new CodePhaseSearchWindow(11);
    public static final CodePhaseSearchWindow w64 =
	new CodePhaseSearchWindow(12);
    public static final CodePhaseSearchWindow w96 =
	new CodePhaseSearchWindow(13);
    public static final CodePhaseSearchWindow w128 =
	new CodePhaseSearchWindow(14);
    public static final CodePhaseSearchWindow w192 =
	new CodePhaseSearchWindow(15);
    private final static CodePhaseSearchWindow cNamedNumbers[] = {
	 w1023, 
	 w1, 
	 w2, 
	 w3, 
	 w4, 
	 w6, 
	 w8, 
	 w12, 
	 w16, 
	 w24, 
	 w32, 
	 w48, 
	 w64, 
	 w96, 
	 w128, 
	 w192
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
    
    public static CodePhaseSearchWindow valueOf(long value)
    {
	return (CodePhaseSearchWindow)w1023.lookupValue(value);
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
	    "CodePhaseSearchWindow"
	),
	new QName (
	    "InformationElements",
	    "CodePhaseSearchWindow"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "w1023",
		    0
		),
		new MemberListElement (
		    "w1",
		    1
		),
		new MemberListElement (
		    "w2",
		    2
		),
		new MemberListElement (
		    "w3",
		    3
		),
		new MemberListElement (
		    "w4",
		    4
		),
		new MemberListElement (
		    "w6",
		    5
		),
		new MemberListElement (
		    "w8",
		    6
		),
		new MemberListElement (
		    "w12",
		    7
		),
		new MemberListElement (
		    "w16",
		    8
		),
		new MemberListElement (
		    "w24",
		    9
		),
		new MemberListElement (
		    "w32",
		    10
		),
		new MemberListElement (
		    "w48",
		    11
		),
		new MemberListElement (
		    "w64",
		    12
		),
		new MemberListElement (
		    "w96",
		    13
		),
		new MemberListElement (
		    "w128",
		    14
		),
		new MemberListElement (
		    "w192",
		    15
		)
	    }
	),
	0,
	w1023
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CodePhaseSearchWindow object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CodePhaseSearchWindow object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CodePhaseSearchWindow
