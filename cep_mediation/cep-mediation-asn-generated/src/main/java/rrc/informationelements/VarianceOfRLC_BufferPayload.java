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
 * Define the ASN1 Type VarianceOfRLC_BufferPayload from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class VarianceOfRLC_BufferPayload extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VarianceOfRLC_BufferPayload()
    {
	super(cFirstNumber);
    }
    
    protected VarianceOfRLC_BufferPayload(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final VarianceOfRLC_BufferPayload plv0 =
	new VarianceOfRLC_BufferPayload(0);
    public static final VarianceOfRLC_BufferPayload plv4 =
	new VarianceOfRLC_BufferPayload(1);
    public static final VarianceOfRLC_BufferPayload plv8 =
	new VarianceOfRLC_BufferPayload(2);
    public static final VarianceOfRLC_BufferPayload plv16 =
	new VarianceOfRLC_BufferPayload(3);
    public static final VarianceOfRLC_BufferPayload plv32 =
	new VarianceOfRLC_BufferPayload(4);
    public static final VarianceOfRLC_BufferPayload plv64 =
	new VarianceOfRLC_BufferPayload(5);
    public static final VarianceOfRLC_BufferPayload plv128 =
	new VarianceOfRLC_BufferPayload(6);
    public static final VarianceOfRLC_BufferPayload plv256 =
	new VarianceOfRLC_BufferPayload(7);
    public static final VarianceOfRLC_BufferPayload plv512 =
	new VarianceOfRLC_BufferPayload(8);
    public static final VarianceOfRLC_BufferPayload plv1024 =
	new VarianceOfRLC_BufferPayload(9);
    public static final VarianceOfRLC_BufferPayload plv2k =
	new VarianceOfRLC_BufferPayload(10);
    public static final VarianceOfRLC_BufferPayload plv4k =
	new VarianceOfRLC_BufferPayload(11);
    public static final VarianceOfRLC_BufferPayload plv8k =
	new VarianceOfRLC_BufferPayload(12);
    public static final VarianceOfRLC_BufferPayload plv16k =
	new VarianceOfRLC_BufferPayload(13);
    public static final VarianceOfRLC_BufferPayload spare2 =
	new VarianceOfRLC_BufferPayload(14);
    public static final VarianceOfRLC_BufferPayload spare1 =
	new VarianceOfRLC_BufferPayload(15);
    private final static VarianceOfRLC_BufferPayload cNamedNumbers[] = {
	 plv0, 
	 plv4, 
	 plv8, 
	 plv16, 
	 plv32, 
	 plv64, 
	 plv128, 
	 plv256, 
	 plv512, 
	 plv1024, 
	 plv2k, 
	 plv4k, 
	 plv8k, 
	 plv16k, 
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
    
    public static VarianceOfRLC_BufferPayload valueOf(long value)
    {
	return (VarianceOfRLC_BufferPayload)plv0.lookupValue(value);
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
	    "VarianceOfRLC_BufferPayload"
	),
	new QName (
	    "InformationElements",
	    "VarianceOfRLC-BufferPayload"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "plv0",
		    0
		),
		new MemberListElement (
		    "plv4",
		    1
		),
		new MemberListElement (
		    "plv8",
		    2
		),
		new MemberListElement (
		    "plv16",
		    3
		),
		new MemberListElement (
		    "plv32",
		    4
		),
		new MemberListElement (
		    "plv64",
		    5
		),
		new MemberListElement (
		    "plv128",
		    6
		),
		new MemberListElement (
		    "plv256",
		    7
		),
		new MemberListElement (
		    "plv512",
		    8
		),
		new MemberListElement (
		    "plv1024",
		    9
		),
		new MemberListElement (
		    "plv2k",
		    10
		),
		new MemberListElement (
		    "plv4k",
		    11
		),
		new MemberListElement (
		    "plv8k",
		    12
		),
		new MemberListElement (
		    "plv16k",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "spare1",
		    15
		)
	    }
	),
	0,
	plv0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VarianceOfRLC_BufferPayload object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VarianceOfRLC_BufferPayload object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VarianceOfRLC_BufferPayload
