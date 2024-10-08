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
 * Define the ASN1 Type MaxSimultaneousTransChsUL from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxSimultaneousTransChsUL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxSimultaneousTransChsUL()
    {
	super(cFirstNumber);
    }
    
    protected MaxSimultaneousTransChsUL(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxSimultaneousTransChsUL dummy =
	new MaxSimultaneousTransChsUL(0);
    public static final MaxSimultaneousTransChsUL e4 =
	new MaxSimultaneousTransChsUL(1);
    public static final MaxSimultaneousTransChsUL e8 =
	new MaxSimultaneousTransChsUL(2);
    public static final MaxSimultaneousTransChsUL e16 =
	new MaxSimultaneousTransChsUL(3);
    public static final MaxSimultaneousTransChsUL e32 =
	new MaxSimultaneousTransChsUL(4);
    private final static MaxSimultaneousTransChsUL cNamedNumbers[] = {
	 dummy, 
	 e4, 
	 e8, 
	 e16, 
	 e32
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
    
    public static MaxSimultaneousTransChsUL valueOf(long value)
    {
	return (MaxSimultaneousTransChsUL)dummy.lookupValue(value);
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
	    "MaxSimultaneousTransChsUL"
	),
	new QName (
	    "InformationElements",
	    "MaxSimultaneousTransChsUL"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dummy",
		    0
		),
		new MemberListElement (
		    "e4",
		    1
		),
		new MemberListElement (
		    "e8",
		    2
		),
		new MemberListElement (
		    "e16",
		    3
		),
		new MemberListElement (
		    "e32",
		    4
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxSimultaneousTransChsUL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxSimultaneousTransChsUL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxSimultaneousTransChsUL
