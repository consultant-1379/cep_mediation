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
 * Define the ASN1 Type MaxHcContextSpace from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MaxHcContextSpace extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MaxHcContextSpace()
    {
	super(cFirstNumber);
    }
    
    protected MaxHcContextSpace(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MaxHcContextSpace dummy =
	new MaxHcContextSpace(0);
    public static final MaxHcContextSpace by1024 =
	new MaxHcContextSpace(1);
    public static final MaxHcContextSpace by2048 =
	new MaxHcContextSpace(2);
    public static final MaxHcContextSpace by4096 =
	new MaxHcContextSpace(3);
    public static final MaxHcContextSpace by8192 =
	new MaxHcContextSpace(4);
    private final static MaxHcContextSpace cNamedNumbers[] = {
	 dummy, 
	 by1024, 
	 by2048, 
	 by4096, 
	 by8192
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
    
    public static MaxHcContextSpace valueOf(long value)
    {
	return (MaxHcContextSpace)dummy.lookupValue(value);
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
	    "MaxHcContextSpace"
	),
	new QName (
	    "InformationElements",
	    "MaxHcContextSpace"
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
		    "by1024",
		    1
		),
		new MemberListElement (
		    "by2048",
		    2
		),
		new MemberListElement (
		    "by4096",
		    3
		),
		new MemberListElement (
		    "by8192",
		    4
		)
	    }
	),
	0,
	dummy
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MaxHcContextSpace object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxHcContextSpace object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxHcContextSpace
