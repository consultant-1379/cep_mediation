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
 * Define the ASN1 Type CRC_Size from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class CRC_Size extends Enumerated {
    
    /**
     * The default constructor.
     */
    private CRC_Size()
    {
	super(cFirstNumber);
    }
    
    protected CRC_Size(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final CRC_Size crc0 =
	new CRC_Size(0);
    public static final CRC_Size crc8 =
	new CRC_Size(1);
    public static final CRC_Size crc12 =
	new CRC_Size(2);
    public static final CRC_Size crc16 =
	new CRC_Size(3);
    public static final CRC_Size crc24 =
	new CRC_Size(4);
    private final static CRC_Size cNamedNumbers[] = {
	 crc0, 
	 crc8, 
	 crc12, 
	 crc16, 
	 crc24
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
    
    public static CRC_Size valueOf(long value)
    {
	return (CRC_Size)crc0.lookupValue(value);
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
	    "CRC_Size"
	),
	new QName (
	    "InformationElements",
	    "CRC-Size"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "crc0",
		    0
		),
		new MemberListElement (
		    "crc8",
		    1
		),
		new MemberListElement (
		    "crc12",
		    2
		),
		new MemberListElement (
		    "crc16",
		    3
		),
		new MemberListElement (
		    "crc24",
		    4
		)
	    }
	),
	0,
	crc0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CRC_Size object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CRC_Size object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CRC_Size
