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
 * Define the ASN1 Type MAC_hs_WindowSize from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MAC_hs_WindowSize extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MAC_hs_WindowSize()
    {
	super(cFirstNumber);
    }
    
    protected MAC_hs_WindowSize(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MAC_hs_WindowSize mws4 =
	new MAC_hs_WindowSize(0);
    public static final MAC_hs_WindowSize mws6 =
	new MAC_hs_WindowSize(1);
    public static final MAC_hs_WindowSize mws8 =
	new MAC_hs_WindowSize(2);
    public static final MAC_hs_WindowSize mws12 =
	new MAC_hs_WindowSize(3);
    public static final MAC_hs_WindowSize mws16 =
	new MAC_hs_WindowSize(4);
    public static final MAC_hs_WindowSize mws24 =
	new MAC_hs_WindowSize(5);
    public static final MAC_hs_WindowSize mws32 =
	new MAC_hs_WindowSize(6);
    private final static MAC_hs_WindowSize cNamedNumbers[] = {
	 mws4, 
	 mws6, 
	 mws8, 
	 mws12, 
	 mws16, 
	 mws24, 
	 mws32
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
    
    public static MAC_hs_WindowSize valueOf(long value)
    {
	return (MAC_hs_WindowSize)mws4.lookupValue(value);
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
	    "MAC_hs_WindowSize"
	),
	new QName (
	    "InformationElements",
	    "MAC-hs-WindowSize"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mws4",
		    0
		),
		new MemberListElement (
		    "mws6",
		    1
		),
		new MemberListElement (
		    "mws8",
		    2
		),
		new MemberListElement (
		    "mws12",
		    3
		),
		new MemberListElement (
		    "mws16",
		    4
		),
		new MemberListElement (
		    "mws24",
		    5
		),
		new MemberListElement (
		    "mws32",
		    6
		)
	    }
	),
	0,
	mws4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MAC_hs_WindowSize object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_hs_WindowSize object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_hs_WindowSize
