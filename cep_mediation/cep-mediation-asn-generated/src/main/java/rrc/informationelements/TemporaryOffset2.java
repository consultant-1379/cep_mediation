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
 * Define the ASN1 Type TemporaryOffset2 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class TemporaryOffset2 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TemporaryOffset2()
    {
	super(cFirstNumber);
    }
    
    protected TemporaryOffset2(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final TemporaryOffset2 to2 =
	new TemporaryOffset2(0);
    public static final TemporaryOffset2 to3 =
	new TemporaryOffset2(1);
    public static final TemporaryOffset2 to4 =
	new TemporaryOffset2(2);
    public static final TemporaryOffset2 to6 =
	new TemporaryOffset2(3);
    public static final TemporaryOffset2 to8 =
	new TemporaryOffset2(4);
    public static final TemporaryOffset2 to10 =
	new TemporaryOffset2(5);
    public static final TemporaryOffset2 to12 =
	new TemporaryOffset2(6);
    public static final TemporaryOffset2 infinite =
	new TemporaryOffset2(7);
    private final static TemporaryOffset2 cNamedNumbers[] = {
	 to2, 
	 to3, 
	 to4, 
	 to6, 
	 to8, 
	 to10, 
	 to12, 
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
    
    public static TemporaryOffset2 valueOf(long value)
    {
	return (TemporaryOffset2)to2.lookupValue(value);
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
	    "TemporaryOffset2"
	),
	new QName (
	    "InformationElements",
	    "TemporaryOffset2"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "to2",
		    0
		),
		new MemberListElement (
		    "to3",
		    1
		),
		new MemberListElement (
		    "to4",
		    2
		),
		new MemberListElement (
		    "to6",
		    3
		),
		new MemberListElement (
		    "to8",
		    4
		),
		new MemberListElement (
		    "to10",
		    5
		),
		new MemberListElement (
		    "to12",
		    6
		),
		new MemberListElement (
		    "infinite",
		    7
		)
	    }
	),
	0,
	to2
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TemporaryOffset2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TemporaryOffset2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TemporaryOffset2
