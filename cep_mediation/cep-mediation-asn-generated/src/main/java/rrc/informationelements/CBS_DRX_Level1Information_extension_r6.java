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
 * Define the ASN1 Type CBS_DRX_Level1Information_extension_r6 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CBS_DRX_Level1Information_extension_r6 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CBS_DRX_Level1Information_extension_r6()
    {
	super(cFirstNumber);
    }
    
    protected CBS_DRX_Level1Information_extension_r6(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CBS_DRX_Level1Information_extension_r6 p8 =
	new CBS_DRX_Level1Information_extension_r6(0);
    public static final CBS_DRX_Level1Information_extension_r6 p16 =
	new CBS_DRX_Level1Information_extension_r6(1);
    public static final CBS_DRX_Level1Information_extension_r6 p32 =
	new CBS_DRX_Level1Information_extension_r6(2);
    public static final CBS_DRX_Level1Information_extension_r6 p64 =
	new CBS_DRX_Level1Information_extension_r6(3);
    public static final CBS_DRX_Level1Information_extension_r6 p128 =
	new CBS_DRX_Level1Information_extension_r6(4);
    public static final CBS_DRX_Level1Information_extension_r6 p256 =
	new CBS_DRX_Level1Information_extension_r6(5);
    private final static CBS_DRX_Level1Information_extension_r6 cNamedNumbers[] = {
	 p8, 
	 p16, 
	 p32, 
	 p64, 
	 p128, 
	 p256
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
    
    public static CBS_DRX_Level1Information_extension_r6 valueOf(long value)
    {
	return (CBS_DRX_Level1Information_extension_r6)p8.lookupValue(value);
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
	    "CBS_DRX_Level1Information_extension_r6"
	),
	new QName (
	    "InformationElements",
	    "CBS-DRX-Level1Information-extension-r6"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "p8",
		    0
		),
		new MemberListElement (
		    "p16",
		    1
		),
		new MemberListElement (
		    "p32",
		    2
		),
		new MemberListElement (
		    "p64",
		    3
		),
		new MemberListElement (
		    "p128",
		    4
		),
		new MemberListElement (
		    "p256",
		    5
		)
	    }
	),
	0,
	p8
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CBS_DRX_Level1Information_extension_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CBS_DRX_Level1Information_extension_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CBS_DRX_Level1Information_extension_r6
