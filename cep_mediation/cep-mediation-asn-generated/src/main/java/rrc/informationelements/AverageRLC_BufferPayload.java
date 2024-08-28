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
 * Define the ASN1 Type AverageRLC_BufferPayload from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class AverageRLC_BufferPayload extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AverageRLC_BufferPayload()
    {
	super(cFirstNumber);
    }
    
    protected AverageRLC_BufferPayload(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final AverageRLC_BufferPayload pla0 =
	new AverageRLC_BufferPayload(0);
    public static final AverageRLC_BufferPayload pla4 =
	new AverageRLC_BufferPayload(1);
    public static final AverageRLC_BufferPayload pla8 =
	new AverageRLC_BufferPayload(2);
    public static final AverageRLC_BufferPayload pla16 =
	new AverageRLC_BufferPayload(3);
    public static final AverageRLC_BufferPayload pla32 =
	new AverageRLC_BufferPayload(4);
    public static final AverageRLC_BufferPayload pla64 =
	new AverageRLC_BufferPayload(5);
    public static final AverageRLC_BufferPayload pla128 =
	new AverageRLC_BufferPayload(6);
    public static final AverageRLC_BufferPayload pla256 =
	new AverageRLC_BufferPayload(7);
    public static final AverageRLC_BufferPayload pla512 =
	new AverageRLC_BufferPayload(8);
    public static final AverageRLC_BufferPayload pla1024 =
	new AverageRLC_BufferPayload(9);
    public static final AverageRLC_BufferPayload pla2k =
	new AverageRLC_BufferPayload(10);
    public static final AverageRLC_BufferPayload pla4k =
	new AverageRLC_BufferPayload(11);
    public static final AverageRLC_BufferPayload pla8k =
	new AverageRLC_BufferPayload(12);
    public static final AverageRLC_BufferPayload pla16k =
	new AverageRLC_BufferPayload(13);
    public static final AverageRLC_BufferPayload pla32k =
	new AverageRLC_BufferPayload(14);
    public static final AverageRLC_BufferPayload pla64k =
	new AverageRLC_BufferPayload(15);
    public static final AverageRLC_BufferPayload pla128k =
	new AverageRLC_BufferPayload(16);
    public static final AverageRLC_BufferPayload pla256k =
	new AverageRLC_BufferPayload(17);
    public static final AverageRLC_BufferPayload pla512k =
	new AverageRLC_BufferPayload(18);
    public static final AverageRLC_BufferPayload pla1024k =
	new AverageRLC_BufferPayload(19);
    public static final AverageRLC_BufferPayload spare12 =
	new AverageRLC_BufferPayload(20);
    public static final AverageRLC_BufferPayload spare11 =
	new AverageRLC_BufferPayload(21);
    public static final AverageRLC_BufferPayload spare10 =
	new AverageRLC_BufferPayload(22);
    public static final AverageRLC_BufferPayload spare9 =
	new AverageRLC_BufferPayload(23);
    public static final AverageRLC_BufferPayload spare8 =
	new AverageRLC_BufferPayload(24);
    public static final AverageRLC_BufferPayload spare7 =
	new AverageRLC_BufferPayload(25);
    public static final AverageRLC_BufferPayload spare6 =
	new AverageRLC_BufferPayload(26);
    public static final AverageRLC_BufferPayload spare5 =
	new AverageRLC_BufferPayload(27);
    public static final AverageRLC_BufferPayload spare4 =
	new AverageRLC_BufferPayload(28);
    public static final AverageRLC_BufferPayload spare3 =
	new AverageRLC_BufferPayload(29);
    public static final AverageRLC_BufferPayload spare2 =
	new AverageRLC_BufferPayload(30);
    public static final AverageRLC_BufferPayload spare1 =
	new AverageRLC_BufferPayload(31);
    private final static AverageRLC_BufferPayload cNamedNumbers[] = {
	 pla0, 
	 pla4, 
	 pla8, 
	 pla16, 
	 pla32, 
	 pla64, 
	 pla128, 
	 pla256, 
	 pla512, 
	 pla1024, 
	 pla2k, 
	 pla4k, 
	 pla8k, 
	 pla16k, 
	 pla32k, 
	 pla64k, 
	 pla128k, 
	 pla256k, 
	 pla512k, 
	 pla1024k, 
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
    
    public static AverageRLC_BufferPayload valueOf(long value)
    {
	return (AverageRLC_BufferPayload)pla0.lookupValue(value);
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
	    "AverageRLC_BufferPayload"
	),
	new QName (
	    "InformationElements",
	    "AverageRLC-BufferPayload"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "pla0",
		    0
		),
		new MemberListElement (
		    "pla4",
		    1
		),
		new MemberListElement (
		    "pla8",
		    2
		),
		new MemberListElement (
		    "pla16",
		    3
		),
		new MemberListElement (
		    "pla32",
		    4
		),
		new MemberListElement (
		    "pla64",
		    5
		),
		new MemberListElement (
		    "pla128",
		    6
		),
		new MemberListElement (
		    "pla256",
		    7
		),
		new MemberListElement (
		    "pla512",
		    8
		),
		new MemberListElement (
		    "pla1024",
		    9
		),
		new MemberListElement (
		    "pla2k",
		    10
		),
		new MemberListElement (
		    "pla4k",
		    11
		),
		new MemberListElement (
		    "pla8k",
		    12
		),
		new MemberListElement (
		    "pla16k",
		    13
		),
		new MemberListElement (
		    "pla32k",
		    14
		),
		new MemberListElement (
		    "pla64k",
		    15
		),
		new MemberListElement (
		    "pla128k",
		    16
		),
		new MemberListElement (
		    "pla256k",
		    17
		),
		new MemberListElement (
		    "pla512k",
		    18
		),
		new MemberListElement (
		    "pla1024k",
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
	pla0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AverageRLC_BufferPayload object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AverageRLC_BufferPayload object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AverageRLC_BufferPayload
