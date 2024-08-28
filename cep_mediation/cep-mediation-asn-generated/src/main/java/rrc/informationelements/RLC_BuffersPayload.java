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
 * Define the ASN1 Type RLC_BuffersPayload from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class RLC_BuffersPayload extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RLC_BuffersPayload()
    {
	super(cFirstNumber);
    }
    
    protected RLC_BuffersPayload(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final RLC_BuffersPayload pl0 =
	new RLC_BuffersPayload(0);
    public static final RLC_BuffersPayload pl4 =
	new RLC_BuffersPayload(1);
    public static final RLC_BuffersPayload pl8 =
	new RLC_BuffersPayload(2);
    public static final RLC_BuffersPayload pl16 =
	new RLC_BuffersPayload(3);
    public static final RLC_BuffersPayload pl32 =
	new RLC_BuffersPayload(4);
    public static final RLC_BuffersPayload pl64 =
	new RLC_BuffersPayload(5);
    public static final RLC_BuffersPayload pl128 =
	new RLC_BuffersPayload(6);
    public static final RLC_BuffersPayload pl256 =
	new RLC_BuffersPayload(7);
    public static final RLC_BuffersPayload pl512 =
	new RLC_BuffersPayload(8);
    public static final RLC_BuffersPayload pl1024 =
	new RLC_BuffersPayload(9);
    public static final RLC_BuffersPayload pl2k =
	new RLC_BuffersPayload(10);
    public static final RLC_BuffersPayload pl4k =
	new RLC_BuffersPayload(11);
    public static final RLC_BuffersPayload pl8k =
	new RLC_BuffersPayload(12);
    public static final RLC_BuffersPayload pl16k =
	new RLC_BuffersPayload(13);
    public static final RLC_BuffersPayload pl32k =
	new RLC_BuffersPayload(14);
    public static final RLC_BuffersPayload pl64k =
	new RLC_BuffersPayload(15);
    public static final RLC_BuffersPayload pl128k =
	new RLC_BuffersPayload(16);
    public static final RLC_BuffersPayload pl256k =
	new RLC_BuffersPayload(17);
    public static final RLC_BuffersPayload pl512k =
	new RLC_BuffersPayload(18);
    public static final RLC_BuffersPayload pl1024k =
	new RLC_BuffersPayload(19);
    public static final RLC_BuffersPayload spare12 =
	new RLC_BuffersPayload(20);
    public static final RLC_BuffersPayload spare11 =
	new RLC_BuffersPayload(21);
    public static final RLC_BuffersPayload spare10 =
	new RLC_BuffersPayload(22);
    public static final RLC_BuffersPayload spare9 =
	new RLC_BuffersPayload(23);
    public static final RLC_BuffersPayload spare8 =
	new RLC_BuffersPayload(24);
    public static final RLC_BuffersPayload spare7 =
	new RLC_BuffersPayload(25);
    public static final RLC_BuffersPayload spare6 =
	new RLC_BuffersPayload(26);
    public static final RLC_BuffersPayload spare5 =
	new RLC_BuffersPayload(27);
    public static final RLC_BuffersPayload spare4 =
	new RLC_BuffersPayload(28);
    public static final RLC_BuffersPayload spare3 =
	new RLC_BuffersPayload(29);
    public static final RLC_BuffersPayload spare2 =
	new RLC_BuffersPayload(30);
    public static final RLC_BuffersPayload spare1 =
	new RLC_BuffersPayload(31);
    private final static RLC_BuffersPayload cNamedNumbers[] = {
	 pl0, 
	 pl4, 
	 pl8, 
	 pl16, 
	 pl32, 
	 pl64, 
	 pl128, 
	 pl256, 
	 pl512, 
	 pl1024, 
	 pl2k, 
	 pl4k, 
	 pl8k, 
	 pl16k, 
	 pl32k, 
	 pl64k, 
	 pl128k, 
	 pl256k, 
	 pl512k, 
	 pl1024k, 
	 spare12, 
	 spare11, 
	 spare10, 
	 spare9, 
	 spare8, 
	 spare7, 
	 spare6, 
	 spare5, 
	 spare4, 
	 spare3, 
	 spare2, 
	 spare1
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
    
    public static RLC_BuffersPayload valueOf(long value)
    {
	return (RLC_BuffersPayload)pl0.lookupValue(value);
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
	    "RLC_BuffersPayload"
	),
	new QName (
	    "InformationElements",
	    "RLC-BuffersPayload"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pl0",
		    0
		),
		new MemberListElement (
		    "pl4",
		    1
		),
		new MemberListElement (
		    "pl8",
		    2
		),
		new MemberListElement (
		    "pl16",
		    3
		),
		new MemberListElement (
		    "pl32",
		    4
		),
		new MemberListElement (
		    "pl64",
		    5
		),
		new MemberListElement (
		    "pl128",
		    6
		),
		new MemberListElement (
		    "pl256",
		    7
		),
		new MemberListElement (
		    "pl512",
		    8
		),
		new MemberListElement (
		    "pl1024",
		    9
		),
		new MemberListElement (
		    "pl2k",
		    10
		),
		new MemberListElement (
		    "pl4k",
		    11
		),
		new MemberListElement (
		    "pl8k",
		    12
		),
		new MemberListElement (
		    "pl16k",
		    13
		),
		new MemberListElement (
		    "pl32k",
		    14
		),
		new MemberListElement (
		    "pl64k",
		    15
		),
		new MemberListElement (
		    "pl128k",
		    16
		),
		new MemberListElement (
		    "pl256k",
		    17
		),
		new MemberListElement (
		    "pl512k",
		    18
		),
		new MemberListElement (
		    "pl1024k",
		    19
		),
		new MemberListElement (
		    "spare12",
		    20
		),
		new MemberListElement (
		    "spare11",
		    21
		),
		new MemberListElement (
		    "spare10",
		    22
		),
		new MemberListElement (
		    "spare9",
		    23
		),
		new MemberListElement (
		    "spare8",
		    24
		),
		new MemberListElement (
		    "spare7",
		    25
		),
		new MemberListElement (
		    "spare6",
		    26
		),
		new MemberListElement (
		    "spare5",
		    27
		),
		new MemberListElement (
		    "spare4",
		    28
		),
		new MemberListElement (
		    "spare3",
		    29
		),
		new MemberListElement (
		    "spare2",
		    30
		),
		new MemberListElement (
		    "spare1",
		    31
		)
	    }
	),
	0,
	pl0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RLC_BuffersPayload object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_BuffersPayload object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_BuffersPayload
