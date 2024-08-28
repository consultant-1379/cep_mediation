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
 * Define the ASN1 Type MAC_DTX_Cycle_2ms from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class MAC_DTX_Cycle_2ms extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MAC_DTX_Cycle_2ms()
    {
	super(cFirstNumber);
    }
    
    protected MAC_DTX_Cycle_2ms(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final MAC_DTX_Cycle_2ms sub_frames_1 =
	new MAC_DTX_Cycle_2ms(0);
    public static final MAC_DTX_Cycle_2ms sub_frames_4 =
	new MAC_DTX_Cycle_2ms(1);
    public static final MAC_DTX_Cycle_2ms sub_frames_5 =
	new MAC_DTX_Cycle_2ms(2);
    public static final MAC_DTX_Cycle_2ms sub_frames_8 =
	new MAC_DTX_Cycle_2ms(3);
    public static final MAC_DTX_Cycle_2ms sub_frames_10 =
	new MAC_DTX_Cycle_2ms(4);
    public static final MAC_DTX_Cycle_2ms sub_frames_16 =
	new MAC_DTX_Cycle_2ms(5);
    public static final MAC_DTX_Cycle_2ms sub_frames_20 =
	new MAC_DTX_Cycle_2ms(6);
    public static final MAC_DTX_Cycle_2ms spare1 =
	new MAC_DTX_Cycle_2ms(7);
    private final static MAC_DTX_Cycle_2ms cNamedNumbers[] = {
	 sub_frames_1, 
	 sub_frames_4, 
	 sub_frames_5, 
	 sub_frames_8, 
	 sub_frames_10, 
	 sub_frames_16, 
	 sub_frames_20, 
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
    
    public static MAC_DTX_Cycle_2ms valueOf(long value)
    {
	return (MAC_DTX_Cycle_2ms)sub_frames_1.lookupValue(value);
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
	    "MAC_DTX_Cycle_2ms"
	),
	new QName (
	    "InformationElements",
	    "MAC-DTX-Cycle-2ms"
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
		    "sub-frames-4",
		    1
		),
		new MemberListElement (
		    "sub-frames-5",
		    2
		),
		new MemberListElement (
		    "sub-frames-8",
		    3
		),
		new MemberListElement (
		    "sub-frames-10",
		    4
		),
		new MemberListElement (
		    "sub-frames-16",
		    5
		),
		new MemberListElement (
		    "sub-frames-20",
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
     * Get the type descriptor (TypeInfo) of 'this' MAC_DTX_Cycle_2ms object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_DTX_Cycle_2ms object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_DTX_Cycle_2ms
