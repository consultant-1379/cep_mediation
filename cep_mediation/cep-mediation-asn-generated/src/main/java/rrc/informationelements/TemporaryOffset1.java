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
 * Define the ASN1 Type TemporaryOffset1 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TemporaryOffset1 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TemporaryOffset1()
    {
	super(cFirstNumber);
    }
    
    protected TemporaryOffset1(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TemporaryOffset1 to3 =
	new TemporaryOffset1(0);
    public static final TemporaryOffset1 to6 =
	new TemporaryOffset1(1);
    public static final TemporaryOffset1 to9 =
	new TemporaryOffset1(2);
    public static final TemporaryOffset1 to12 =
	new TemporaryOffset1(3);
    public static final TemporaryOffset1 to15 =
	new TemporaryOffset1(4);
    public static final TemporaryOffset1 to18 =
	new TemporaryOffset1(5);
    public static final TemporaryOffset1 to21 =
	new TemporaryOffset1(6);
    public static final TemporaryOffset1 infinite =
	new TemporaryOffset1(7);
    private final static TemporaryOffset1 cNamedNumbers[] = {
	 to3, 
	 to6, 
	 to9, 
	 to12, 
	 to15, 
	 to18, 
	 to21, 
	 infinite
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
    
    public static TemporaryOffset1 valueOf(long value)
    {
	return (TemporaryOffset1)to3.lookupValue(value);
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
	    "TemporaryOffset1"
	),
	new QName (
	    "InformationElements",
	    "TemporaryOffset1"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "to3",
		    0
		),
		new MemberListElement (
		    "to6",
		    1
		),
		new MemberListElement (
		    "to9",
		    2
		),
		new MemberListElement (
		    "to12",
		    3
		),
		new MemberListElement (
		    "to15",
		    4
		),
		new MemberListElement (
		    "to18",
		    5
		),
		new MemberListElement (
		    "to21",
		    6
		),
		new MemberListElement (
		    "infinite",
		    7
		)
	    }
	),
	0,
	to3
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TemporaryOffset1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TemporaryOffset1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TemporaryOffset1
