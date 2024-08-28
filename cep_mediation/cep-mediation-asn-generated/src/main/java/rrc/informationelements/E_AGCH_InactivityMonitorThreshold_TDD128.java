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
 * Define the ASN1 Type E_AGCH_InactivityMonitorThreshold_TDD128 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class E_AGCH_InactivityMonitorThreshold_TDD128 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private E_AGCH_InactivityMonitorThreshold_TDD128()
    {
	super(cFirstNumber);
    }
    
    protected E_AGCH_InactivityMonitorThreshold_TDD128(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_0 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(0);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_1 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(1);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_2 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(2);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_4 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(3);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_8 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(4);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_16 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(5);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_32 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(6);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_64 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(7);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_128 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(8);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_256 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(9);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 radio_frames_512 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(10);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 spare5 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(11);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 spare4 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(12);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 spare3 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(13);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 spare2 =
	new E_AGCH_InactivityMonitorThreshold_TDD128(14);
    public static final E_AGCH_InactivityMonitorThreshold_TDD128 infinity =
	new E_AGCH_InactivityMonitorThreshold_TDD128(15);
    private final static E_AGCH_InactivityMonitorThreshold_TDD128 cNamedNumbers[] = {
	 radio_frames_0, 
	 radio_frames_1, 
	 radio_frames_2, 
	 radio_frames_4, 
	 radio_frames_8, 
	 radio_frames_16, 
	 radio_frames_32, 
	 radio_frames_64, 
	 radio_frames_128, 
	 radio_frames_256, 
	 radio_frames_512, 
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
    
    public static E_AGCH_InactivityMonitorThreshold_TDD128 valueOf(long value)
    {
	return (E_AGCH_InactivityMonitorThreshold_TDD128)radio_frames_0.lookupValue(value);
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
	    "E_AGCH_InactivityMonitorThreshold_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-AGCH-InactivityMonitorThreshold-TDD128"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "radio-frames-0",
		    0
		),
		new MemberListElement (
		    "radio-frames-1",
		    1
		),
		new MemberListElement (
		    "radio-frames-2",
		    2
		),
		new MemberListElement (
		    "radio-frames-4",
		    3
		),
		new MemberListElement (
		    "radio-frames-8",
		    4
		),
		new MemberListElement (
		    "radio-frames-16",
		    5
		),
		new MemberListElement (
		    "radio-frames-32",
		    6
		),
		new MemberListElement (
		    "radio-frames-64",
		    7
		),
		new MemberListElement (
		    "radio-frames-128",
		    8
		),
		new MemberListElement (
		    "radio-frames-256",
		    9
		),
		new MemberListElement (
		    "radio-frames-512",
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
	radio_frames_0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_AGCH_InactivityMonitorThreshold_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_AGCH_InactivityMonitorThreshold_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_AGCH_InactivityMonitorThreshold_TDD128
