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
 * Define the ASN1 Type Treset_ResetTimer from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class Treset_ResetTimer extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Treset_ResetTimer()
    {
	super(cFirstNumber);
    }
    
    protected Treset_ResetTimer(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final Treset_ResetTimer rt1 =
	new Treset_ResetTimer(0);
    public static final Treset_ResetTimer rt2 =
	new Treset_ResetTimer(1);
    public static final Treset_ResetTimer rt3 =
	new Treset_ResetTimer(2);
    public static final Treset_ResetTimer rt4 =
	new Treset_ResetTimer(3);
    private final static Treset_ResetTimer cNamedNumbers[] = {
	 rt1, 
	 rt2, 
	 rt3, 
	 rt4
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
    
    public static Treset_ResetTimer valueOf(long value)
    {
	return (Treset_ResetTimer)rt1.lookupValue(value);
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
	    "Treset_ResetTimer"
	),
	new QName (
	    "InformationElements",
	    "Treset-ResetTimer"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "rt1",
		    0
		),
		new MemberListElement (
		    "rt2",
		    1
		),
		new MemberListElement (
		    "rt3",
		    2
		),
		new MemberListElement (
		    "rt4",
		    3
		)
	    }
	),
	0,
	rt1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Treset_ResetTimer object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Treset_ResetTimer object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Treset_ResetTimer
