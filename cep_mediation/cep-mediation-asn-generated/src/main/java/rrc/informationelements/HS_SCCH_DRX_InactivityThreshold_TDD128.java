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
 * Define the ASN1 Type HS_SCCH_DRX_InactivityThreshold_TDD128 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class HS_SCCH_DRX_InactivityThreshold_TDD128 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private HS_SCCH_DRX_InactivityThreshold_TDD128()
    {
	super(cFirstNumber);
    }
    
    protected HS_SCCH_DRX_InactivityThreshold_TDD128(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_1 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(0);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_2 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(1);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_4 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(2);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_8 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(3);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_16 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(4);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_32 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(5);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_64 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(6);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_128 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(7);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_256 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(8);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 sub_frames_512 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(9);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 spare6 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(10);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 spare5 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(11);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 spare4 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(12);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 spare3 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(13);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 spare2 =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(14);
    public static final HS_SCCH_DRX_InactivityThreshold_TDD128 infinity =
	new HS_SCCH_DRX_InactivityThreshold_TDD128(15);
    private final static HS_SCCH_DRX_InactivityThreshold_TDD128 cNamedNumbers[] = {
	 sub_frames_1, 
	 sub_frames_2, 
	 sub_frames_4, 
	 sub_frames_8, 
	 sub_frames_16, 
	 sub_frames_32, 
	 sub_frames_64, 
	 sub_frames_128, 
	 sub_frames_256, 
	 sub_frames_512, 
	 spare6, 
	 spare5, 
	 spare4, 
	 spare3, 
	 spare2, 
	 infinity
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
    
    public static HS_SCCH_DRX_InactivityThreshold_TDD128 valueOf(long value)
    {
	return (HS_SCCH_DRX_InactivityThreshold_TDD128)sub_frames_1.lookupValue(value);
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
	    "HS_SCCH_DRX_InactivityThreshold_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-DRX-InactivityThreshold-TDD128"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sub-frames-1",
		    0
		),
		new MemberListElement (
		    "sub-frames-2",
		    1
		),
		new MemberListElement (
		    "sub-frames-4",
		    2
		),
		new MemberListElement (
		    "sub-frames-8",
		    3
		),
		new MemberListElement (
		    "sub-frames-16",
		    4
		),
		new MemberListElement (
		    "sub-frames-32",
		    5
		),
		new MemberListElement (
		    "sub-frames-64",
		    6
		),
		new MemberListElement (
		    "sub-frames-128",
		    7
		),
		new MemberListElement (
		    "sub-frames-256",
		    8
		),
		new MemberListElement (
		    "sub-frames-512",
		    9
		),
		new MemberListElement (
		    "spare6",
		    10
		),
		new MemberListElement (
		    "spare5",
		    11
		),
		new MemberListElement (
		    "spare4",
		    12
		),
		new MemberListElement (
		    "spare3",
		    13
		),
		new MemberListElement (
		    "spare2",
		    14
		),
		new MemberListElement (
		    "infinity",
		    15
		)
	    }
	),
	0,
	sub_frames_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_DRX_InactivityThreshold_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_DRX_InactivityThreshold_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_DRX_InactivityThreshold_TDD128
