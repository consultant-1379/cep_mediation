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
 * Define the ASN1 Type DL_Reception_Window_Size_r6 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class DL_Reception_Window_Size_r6 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DL_Reception_Window_Size_r6()
    {
	super(cFirstNumber);
    }
    
    protected DL_Reception_Window_Size_r6(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final DL_Reception_Window_Size_r6 size32 =
	new DL_Reception_Window_Size_r6(0);
    public static final DL_Reception_Window_Size_r6 size48 =
	new DL_Reception_Window_Size_r6(1);
    public static final DL_Reception_Window_Size_r6 size64 =
	new DL_Reception_Window_Size_r6(2);
    public static final DL_Reception_Window_Size_r6 size80 =
	new DL_Reception_Window_Size_r6(3);
    public static final DL_Reception_Window_Size_r6 size96 =
	new DL_Reception_Window_Size_r6(4);
    public static final DL_Reception_Window_Size_r6 size112 =
	new DL_Reception_Window_Size_r6(5);
    private final static DL_Reception_Window_Size_r6 cNamedNumbers[] = {
	 size32, 
	 size48, 
	 size64, 
	 size80, 
	 size96, 
	 size112
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
    
    public static DL_Reception_Window_Size_r6 valueOf(long value)
    {
	return (DL_Reception_Window_Size_r6)size32.lookupValue(value);
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
	    "DL_Reception_Window_Size_r6"
	),
	new QName (
	    "InformationElements",
	    "DL-Reception-Window-Size-r6"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "size32",
		    0
		),
		new MemberListElement (
		    "size48",
		    1
		),
		new MemberListElement (
		    "size64",
		    2
		),
		new MemberListElement (
		    "size80",
		    3
		),
		new MemberListElement (
		    "size96",
		    4
		),
		new MemberListElement (
		    "size112",
		    5
		)
	    }
	),
	0,
	size32
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_Reception_Window_Size_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_Reception_Window_Size_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_Reception_Window_Size_r6
