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
 * Define the ASN1 Type IP_Spacing from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class IP_Spacing extends Enumerated {
    
    /**
     * The default constructor.
     */
    private IP_Spacing()
    {
	super(cFirstNumber);
    }
    
    protected IP_Spacing(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final IP_Spacing e5 =
	new IP_Spacing(0);
    public static final IP_Spacing e7 =
	new IP_Spacing(1);
    public static final IP_Spacing e10 =
	new IP_Spacing(2);
    public static final IP_Spacing e15 =
	new IP_Spacing(3);
    public static final IP_Spacing e20 =
	new IP_Spacing(4);
    public static final IP_Spacing e30 =
	new IP_Spacing(5);
    public static final IP_Spacing e40 =
	new IP_Spacing(6);
    public static final IP_Spacing e50 =
	new IP_Spacing(7);
    private final static IP_Spacing cNamedNumbers[] = {
	 e5, 
	 e7, 
	 e10, 
	 e15, 
	 e20, 
	 e30, 
	 e40, 
	 e50
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
    
    public static IP_Spacing valueOf(long value)
    {
	return (IP_Spacing)e5.lookupValue(value);
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
	    "IP_Spacing"
	),
	new QName (
	    "InformationElements",
	    "IP-Spacing"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "e5",
		    0
		),
		new MemberListElement (
		    "e7",
		    1
		),
		new MemberListElement (
		    "e10",
		    2
		),
		new MemberListElement (
		    "e15",
		    3
		),
		new MemberListElement (
		    "e20",
		    4
		),
		new MemberListElement (
		    "e30",
		    5
		),
		new MemberListElement (
		    "e40",
		    6
		),
		new MemberListElement (
		    "e50",
		    7
		)
	    }
	),
	0,
	e5
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IP_Spacing object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IP_Spacing object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IP_Spacing
