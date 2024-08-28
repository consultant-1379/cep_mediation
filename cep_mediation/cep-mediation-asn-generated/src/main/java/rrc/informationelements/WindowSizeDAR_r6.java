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
 * Define the ASN1 Type WindowSizeDAR_r6 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class WindowSizeDAR_r6 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private WindowSizeDAR_r6()
    {
	super(cFirstNumber);
    }
    
    protected WindowSizeDAR_r6(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final WindowSizeDAR_r6 ws4 =
	new WindowSizeDAR_r6(0);
    public static final WindowSizeDAR_r6 ws8 =
	new WindowSizeDAR_r6(1);
    public static final WindowSizeDAR_r6 ws16 =
	new WindowSizeDAR_r6(2);
    public static final WindowSizeDAR_r6 ws32 =
	new WindowSizeDAR_r6(3);
    public static final WindowSizeDAR_r6 ws40 =
	new WindowSizeDAR_r6(4);
    public static final WindowSizeDAR_r6 ws48 =
	new WindowSizeDAR_r6(5);
    public static final WindowSizeDAR_r6 ws56 =
	new WindowSizeDAR_r6(6);
    public static final WindowSizeDAR_r6 ws64 =
	new WindowSizeDAR_r6(7);
    private final static WindowSizeDAR_r6 cNamedNumbers[] = {
	 ws4, 
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
    
    public static WindowSizeDAR_r6 valueOf(long value)
    {
	return (WindowSizeDAR_r6)ws4.lookupValue(value);
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
	    "WindowSizeDAR_r6"
	),
	new QName (
	    "InformationElements",
	    "WindowSizeDAR-r6"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "ws4",
		    0
		),
		new MemberListElement (
		    "ws8",
		    1
		),
		new MemberListElement (
		    "ws16",
		    2
		),
		new MemberListElement (
		    "ws32",
		    3
		),
		new MemberListElement (
		    "ws40",
		    4
		),
		new MemberListElement (
		    "ws48",
		    5
		),
		new MemberListElement (
		    "ws56",
		    6
		),
		new MemberListElement (
		    "ws64",
		    7
		)
	    }
	),
	0,
	ws4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' WindowSizeDAR_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' WindowSizeDAR_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for WindowSizeDAR_r6
