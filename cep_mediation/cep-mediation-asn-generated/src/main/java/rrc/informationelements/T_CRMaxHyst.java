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
 * Define the ASN1 Type T_CRMaxHyst from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class T_CRMaxHyst extends Enumerated {
    
    /**
     * The default constructor.
     */
    private T_CRMaxHyst()
    {
	super(cFirstNumber);
    }
    
    protected T_CRMaxHyst(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final T_CRMaxHyst notUsed =
	new T_CRMaxHyst(0);
    public static final T_CRMaxHyst t10 =
	new T_CRMaxHyst(1);
    public static final T_CRMaxHyst t20 =
	new T_CRMaxHyst(2);
    public static final T_CRMaxHyst t30 =
	new T_CRMaxHyst(3);
    public static final T_CRMaxHyst t40 =
	new T_CRMaxHyst(4);
    public static final T_CRMaxHyst t50 =
	new T_CRMaxHyst(5);
    public static final T_CRMaxHyst t60 =
	new T_CRMaxHyst(6);
    public static final T_CRMaxHyst t70 =
	new T_CRMaxHyst(7);
    private final static T_CRMaxHyst cNamedNumbers[] = {
	 notUsed, 
	 t10, 
	 t20, 
	 t30, 
	 t40, 
	 t50, 
	 t60, 
	 t70
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
    
    public static T_CRMaxHyst valueOf(long value)
    {
	return (T_CRMaxHyst)notUsed.lookupValue(value);
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
	    "T_CRMaxHyst"
	),
	new QName (
	    "InformationElements",
	    "T-CRMaxHyst"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "notUsed",
		    0
		),
		new MemberListElement (
		    "t10",
		    1
		),
		new MemberListElement (
		    "t20",
		    2
		),
		new MemberListElement (
		    "t30",
		    3
		),
		new MemberListElement (
		    "t40",
		    4
		),
		new MemberListElement (
		    "t50",
		    5
		),
		new MemberListElement (
		    "t60",
		    6
		),
		new MemberListElement (
		    "t70",
		    7
		)
	    }
	),
	0,
	notUsed
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' T_CRMaxHyst object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' T_CRMaxHyst object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for T_CRMaxHyst
