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
 * Define the ASN1 Type UE_DRX_Cycle_InactivityThreshold from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_DRX_Cycle_InactivityThreshold extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_DRX_Cycle_InactivityThreshold()
    {
	super(cFirstNumber);
    }
    
    protected UE_DRX_Cycle_InactivityThreshold(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_0 =
	new UE_DRX_Cycle_InactivityThreshold(0);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_1 =
	new UE_DRX_Cycle_InactivityThreshold(1);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_2 =
	new UE_DRX_Cycle_InactivityThreshold(2);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_4 =
	new UE_DRX_Cycle_InactivityThreshold(3);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_8 =
	new UE_DRX_Cycle_InactivityThreshold(4);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_16 =
	new UE_DRX_Cycle_InactivityThreshold(5);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_32 =
	new UE_DRX_Cycle_InactivityThreshold(6);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_64 =
	new UE_DRX_Cycle_InactivityThreshold(7);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_128 =
	new UE_DRX_Cycle_InactivityThreshold(8);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_256 =
	new UE_DRX_Cycle_InactivityThreshold(9);
    public static final UE_DRX_Cycle_InactivityThreshold sub_frames_512 =
	new UE_DRX_Cycle_InactivityThreshold(10);
    public static final UE_DRX_Cycle_InactivityThreshold spare5 =
	new UE_DRX_Cycle_InactivityThreshold(11);
    public static final UE_DRX_Cycle_InactivityThreshold spare4 =
	new UE_DRX_Cycle_InactivityThreshold(12);
    public static final UE_DRX_Cycle_InactivityThreshold spare3 =
	new UE_DRX_Cycle_InactivityThreshold(13);
    public static final UE_DRX_Cycle_InactivityThreshold spare2 =
	new UE_DRX_Cycle_InactivityThreshold(14);
    public static final UE_DRX_Cycle_InactivityThreshold spare1 =
	new UE_DRX_Cycle_InactivityThreshold(15);
    private final static UE_DRX_Cycle_InactivityThreshold cNamedNumbers[] = {
	 sub_frames_0, 
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
    
    public static UE_DRX_Cycle_InactivityThreshold valueOf(long value)
    {
	return (UE_DRX_Cycle_InactivityThreshold)sub_frames_0.lookupValue(value);
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
	    "UE_DRX_Cycle_InactivityThreshold"
	),
	new QName (
	    "InformationElements",
	    "UE-DRX-Cycle-InactivityThreshold"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sub-frames-0",
		    0
		),
		new MemberListElement (
		    "sub-frames-1",
		    1
		),
		new MemberListElement (
		    "sub-frames-2",
		    2
		),
		new MemberListElement (
		    "sub-frames-4",
		    3
		),
		new MemberListElement (
		    "sub-frames-8",
		    4
		),
		new MemberListElement (
		    "sub-frames-16",
		    5
		),
		new MemberListElement (
		    "sub-frames-32",
		    6
		),
		new MemberListElement (
		    "sub-frames-64",
		    7
		),
		new MemberListElement (
		    "sub-frames-128",
		    8
		),
		new MemberListElement (
		    "sub-frames-256",
		    9
		),
		new MemberListElement (
		    "sub-frames-512",
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
		    "spare1",
		    15
		)
	    }
	),
	0,
	sub_frames_0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_DRX_Cycle_InactivityThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_DRX_Cycle_InactivityThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_DRX_Cycle_InactivityThreshold
