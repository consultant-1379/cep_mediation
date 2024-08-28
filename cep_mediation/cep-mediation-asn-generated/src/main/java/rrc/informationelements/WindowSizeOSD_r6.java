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
 * Define the ASN1 Type WindowSizeOSD_r6 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class WindowSizeOSD_r6 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private WindowSizeOSD_r6()
    {
	super(cFirstNumber);
    }
    
    protected WindowSizeOSD_r6(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final WindowSizeOSD_r6 ws8 =
	new WindowSizeOSD_r6(0);
    public static final WindowSizeOSD_r6 ws16 =
	new WindowSizeOSD_r6(1);
    public static final WindowSizeOSD_r6 ws32 =
	new WindowSizeOSD_r6(2);
    public static final WindowSizeOSD_r6 ws40 =
	new WindowSizeOSD_r6(3);
    public static final WindowSizeOSD_r6 ws48 =
	new WindowSizeOSD_r6(4);
    public static final WindowSizeOSD_r6 ws56 =
	new WindowSizeOSD_r6(5);
    public static final WindowSizeOSD_r6 ws64 =
	new WindowSizeOSD_r6(6);
    private final static WindowSizeOSD_r6 cNamedNumbers[] = {
	 ws8, 
	 ws16, 
	 ws32, 
	 ws40, 
	 ws48, 
	 ws56, 
	 ws64
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
    
    public static WindowSizeOSD_r6 valueOf(long value)
    {
	return (WindowSizeOSD_r6)ws8.lookupValue(value);
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
	    "WindowSizeOSD_r6"
	),
	new QName (
	    "InformationElements",
	    "WindowSizeOSD-r6"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ws8",
		    0
		),
		new MemberListElement (
		    "ws16",
		    1
		),
		new MemberListElement (
		    "ws32",
		    2
		),
		new MemberListElement (
		    "ws40",
		    3
		),
		new MemberListElement (
		    "ws48",
		    4
		),
		new MemberListElement (
		    "ws56",
		    5
		),
		new MemberListElement (
		    "ws64",
		    6
		)
	    }
	),
	0,
	ws8
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' WindowSizeOSD_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' WindowSizeOSD_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for WindowSizeOSD_r6
