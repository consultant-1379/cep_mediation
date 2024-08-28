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
 * Define the ASN1 Type EnablingDelay from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class EnablingDelay extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EnablingDelay()
    {
	super(cFirstNumber);
    }
    
    protected EnablingDelay(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final EnablingDelay radio_frames_0 =
	new EnablingDelay(0);
    public static final EnablingDelay radio_frames_1 =
	new EnablingDelay(1);
    public static final EnablingDelay radio_frames_2 =
	new EnablingDelay(2);
    public static final EnablingDelay radio_frames_4 =
	new EnablingDelay(3);
    public static final EnablingDelay radio_frames_8 =
	new EnablingDelay(4);
    public static final EnablingDelay radio_frames_16 =
	new EnablingDelay(5);
    public static final EnablingDelay radio_frames_32 =
	new EnablingDelay(6);
    public static final EnablingDelay radio_frames_64 =
	new EnablingDelay(7);
    public static final EnablingDelay radio_frames_128 =
	new EnablingDelay(8);
    public static final EnablingDelay spare7 =
	new EnablingDelay(9);
    public static final EnablingDelay spare6 =
	new EnablingDelay(10);
    public static final EnablingDelay spare5 =
	new EnablingDelay(11);
    public static final EnablingDelay spare4 =
	new EnablingDelay(12);
    public static final EnablingDelay spare3 =
	new EnablingDelay(13);
    public static final EnablingDelay spare2 =
	new EnablingDelay(14);
    public static final EnablingDelay spare1 =
	new EnablingDelay(15);
    private final static EnablingDelay cNamedNumbers[] = {
	 radio_frames_0, 
	 radio_frames_1, 
	 radio_frames_2, 
	 radio_frames_4, 
	 radio_frames_8, 
	 radio_frames_16, 
	 radio_frames_32, 
	 radio_frames_64, 
	 radio_frames_128, 
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
    
    public static EnablingDelay valueOf(long value)
    {
	return (EnablingDelay)radio_frames_0.lookupValue(value);
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
	    "EnablingDelay"
	),
	new QName (
	    "InformationElements",
	    "EnablingDelay"
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
		    "spare7",
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
		    "spare1",
		    15
		)
	    }
	),
	0,
	radio_frames_0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EnablingDelay object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EnablingDelay object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EnablingDelay
