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
 * Define the ASN1 Type UE_DTX_Cycle2_2ms from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_DTX_Cycle2_2ms extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_DTX_Cycle2_2ms()
    {
	super(cFirstNumber);
    }
    
    protected UE_DTX_Cycle2_2ms(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_DTX_Cycle2_2ms sub_frames_4 =
	new UE_DTX_Cycle2_2ms(0);
    public static final UE_DTX_Cycle2_2ms sub_frames_5 =
	new UE_DTX_Cycle2_2ms(1);
    public static final UE_DTX_Cycle2_2ms sub_frames_8 =
	new UE_DTX_Cycle2_2ms(2);
    public static final UE_DTX_Cycle2_2ms sub_frames_10 =
	new UE_DTX_Cycle2_2ms(3);
    public static final UE_DTX_Cycle2_2ms sub_frames_16 =
	new UE_DTX_Cycle2_2ms(4);
    public static final UE_DTX_Cycle2_2ms sub_frames_20 =
	new UE_DTX_Cycle2_2ms(5);
    public static final UE_DTX_Cycle2_2ms sub_frames_32 =
	new UE_DTX_Cycle2_2ms(6);
    public static final UE_DTX_Cycle2_2ms sub_frames_40 =
	new UE_DTX_Cycle2_2ms(7);
    public static final UE_DTX_Cycle2_2ms sub_frames_64 =
	new UE_DTX_Cycle2_2ms(8);
    public static final UE_DTX_Cycle2_2ms sub_frames_80 =
	new UE_DTX_Cycle2_2ms(9);
    public static final UE_DTX_Cycle2_2ms sub_frames_128 =
	new UE_DTX_Cycle2_2ms(10);
    public static final UE_DTX_Cycle2_2ms sub_frames_160 =
	new UE_DTX_Cycle2_2ms(11);
    public static final UE_DTX_Cycle2_2ms spare4 =
	new UE_DTX_Cycle2_2ms(12);
    public static final UE_DTX_Cycle2_2ms spare3 =
	new UE_DTX_Cycle2_2ms(13);
    public static final UE_DTX_Cycle2_2ms spare2 =
	new UE_DTX_Cycle2_2ms(14);
    public static final UE_DTX_Cycle2_2ms spare1 =
	new UE_DTX_Cycle2_2ms(15);
    private final static UE_DTX_Cycle2_2ms cNamedNumbers[] = {
	 sub_frames_4, 
	 sub_frames_5, 
	 sub_frames_8, 
	 sub_frames_10, 
	 sub_frames_16, 
	 sub_frames_20, 
	 sub_frames_32, 
	 sub_frames_40, 
	 sub_frames_64, 
	 sub_frames_80, 
	 sub_frames_128, 
	 sub_frames_160, 
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
    
    public static UE_DTX_Cycle2_2ms valueOf(long value)
    {
	return (UE_DTX_Cycle2_2ms)sub_frames_4.lookupValue(value);
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
	    "UE_DTX_Cycle2_2ms"
	),
	new QName (
	    "InformationElements",
	    "UE-DTX-Cycle2-2ms"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "sub-frames-4",
		    0
		),
		new MemberListElement (
		    "sub-frames-5",
		    1
		),
		new MemberListElement (
		    "sub-frames-8",
		    2
		),
		new MemberListElement (
		    "sub-frames-10",
		    3
		),
		new MemberListElement (
		    "sub-frames-16",
		    4
		),
		new MemberListElement (
		    "sub-frames-20",
		    5
		),
		new MemberListElement (
		    "sub-frames-32",
		    6
		),
		new MemberListElement (
		    "sub-frames-40",
		    7
		),
		new MemberListElement (
		    "sub-frames-64",
		    8
		),
		new MemberListElement (
		    "sub-frames-80",
		    9
		),
		new MemberListElement (
		    "sub-frames-128",
		    10
		),
		new MemberListElement (
		    "sub-frames-160",
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
	sub_frames_4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_DTX_Cycle2_2ms object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_DTX_Cycle2_2ms object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_DTX_Cycle2_2ms
