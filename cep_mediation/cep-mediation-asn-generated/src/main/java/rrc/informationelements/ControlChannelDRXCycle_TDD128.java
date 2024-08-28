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
 * Define the ASN1 Type ControlChannelDRXCycle_TDD128 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ControlChannelDRXCycle_TDD128 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ControlChannelDRXCycle_TDD128()
    {
	super(cFirstNumber);
    }
    
    protected ControlChannelDRXCycle_TDD128(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ControlChannelDRXCycle_TDD128 sub_frames_1 =
	new ControlChannelDRXCycle_TDD128(0);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_2 =
	new ControlChannelDRXCycle_TDD128(1);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_4 =
	new ControlChannelDRXCycle_TDD128(2);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_8 =
	new ControlChannelDRXCycle_TDD128(3);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_16 =
	new ControlChannelDRXCycle_TDD128(4);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_32 =
	new ControlChannelDRXCycle_TDD128(5);
    public static final ControlChannelDRXCycle_TDD128 sub_frames_64 =
	new ControlChannelDRXCycle_TDD128(6);
    public static final ControlChannelDRXCycle_TDD128 spare1 =
	new ControlChannelDRXCycle_TDD128(7);
    private final static ControlChannelDRXCycle_TDD128 cNamedNumbers[] = {
	 sub_frames_1, 
	 sub_frames_2, 
	 sub_frames_4, 
	 sub_frames_8, 
	 sub_frames_16, 
	 sub_frames_32, 
	 sub_frames_64, 
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
    
    public static ControlChannelDRXCycle_TDD128 valueOf(long value)
    {
	return (ControlChannelDRXCycle_TDD128)sub_frames_1.lookupValue(value);
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
	    "ControlChannelDRXCycle_TDD128"
	),
	new QName (
	    "InformationElements",
	    "ControlChannelDRXCycle-TDD128"
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
		    "spare1",
		    7
		)
	    }
	),
	0,
	sub_frames_1
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ControlChannelDRXCycle_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ControlChannelDRXCycle_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ControlChannelDRXCycle_TDD128
