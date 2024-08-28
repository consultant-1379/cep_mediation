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
 * Define the ASN1 Type T1_ReleaseTimer from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T1_ReleaseTimer extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T1_ReleaseTimer()
    {
	super(cFirstNumber);
    }
    
    protected T1_ReleaseTimer(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T1_ReleaseTimer rt10 =
	new T1_ReleaseTimer(0);
    public static final T1_ReleaseTimer rt20 =
	new T1_ReleaseTimer(1);
    public static final T1_ReleaseTimer rt30 =
	new T1_ReleaseTimer(2);
    public static final T1_ReleaseTimer rt40 =
	new T1_ReleaseTimer(3);
    public static final T1_ReleaseTimer rt50 =
	new T1_ReleaseTimer(4);
    public static final T1_ReleaseTimer rt60 =
	new T1_ReleaseTimer(5);
    public static final T1_ReleaseTimer rt70 =
	new T1_ReleaseTimer(6);
    public static final T1_ReleaseTimer rt80 =
	new T1_ReleaseTimer(7);
    public static final T1_ReleaseTimer rt90 =
	new T1_ReleaseTimer(8);
    public static final T1_ReleaseTimer rt100 =
	new T1_ReleaseTimer(9);
    public static final T1_ReleaseTimer rt120 =
	new T1_ReleaseTimer(10);
    public static final T1_ReleaseTimer rt140 =
	new T1_ReleaseTimer(11);
    public static final T1_ReleaseTimer rt160 =
	new T1_ReleaseTimer(12);
    public static final T1_ReleaseTimer rt200 =
	new T1_ReleaseTimer(13);
    public static final T1_ReleaseTimer rt300 =
	new T1_ReleaseTimer(14);
    public static final T1_ReleaseTimer rt400 =
	new T1_ReleaseTimer(15);
    private final static T1_ReleaseTimer cNamedNumbers[] = {
	 rt10, 
	 rt20, 
	 rt30, 
	 rt40, 
	 rt50, 
	 rt60, 
	 rt70, 
	 rt80, 
	 rt90, 
	 rt100, 
	 rt120, 
	 rt140, 
	 rt160, 
	 rt200, 
	 rt300, 
	 rt400
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
    
    public static T1_ReleaseTimer valueOf(long value)
    {
	return (T1_ReleaseTimer)rt10.lookupValue(value);
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
	    "T1_ReleaseTimer"
	),
	new QName (
	    "InformationElements",
	    "T1-ReleaseTimer"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "rt10",
		    0
		),
		new MemberListElement (
		    "rt20",
		    1
		),
		new MemberListElement (
		    "rt30",
		    2
		),
		new MemberListElement (
		    "rt40",
		    3
		),
		new MemberListElement (
		    "rt50",
		    4
		),
		new MemberListElement (
		    "rt60",
		    5
		),
		new MemberListElement (
		    "rt70",
		    6
		),
		new MemberListElement (
		    "rt80",
		    7
		),
		new MemberListElement (
		    "rt90",
		    8
		),
		new MemberListElement (
		    "rt100",
		    9
		),
		new MemberListElement (
		    "rt120",
		    10
		),
		new MemberListElement (
		    "rt140",
		    11
		),
		new MemberListElement (
		    "rt160",
		    12
		),
		new MemberListElement (
		    "rt200",
		    13
		),
		new MemberListElement (
		    "rt300",
		    14
		),
		new MemberListElement (
		    "rt400",
		    15
		)
	    }
	),
	0,
	rt10
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T1_ReleaseTimer object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T1_ReleaseTimer object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T1_ReleaseTimer
