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
 * Define the ASN1 Type UE_DRX_Cycle from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_DRX_Cycle extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_DRX_Cycle()
    {
	super(cFirstNumber);
    }
    
    protected UE_DRX_Cycle(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_DRX_Cycle sub_frames_4 =
	new UE_DRX_Cycle(0);
    public static final UE_DRX_Cycle sub_frames_5 =
	new UE_DRX_Cycle(1);
    public static final UE_DRX_Cycle sub_frames_8 =
	new UE_DRX_Cycle(2);
    public static final UE_DRX_Cycle sub_frames_10 =
	new UE_DRX_Cycle(3);
    public static final UE_DRX_Cycle sub_frames_16 =
	new UE_DRX_Cycle(4);
    public static final UE_DRX_Cycle sub_frames_20 =
	new UE_DRX_Cycle(5);
    public static final UE_DRX_Cycle spare2 =
	new UE_DRX_Cycle(6);
    public static final UE_DRX_Cycle spare1 =
	new UE_DRX_Cycle(7);
    private final static UE_DRX_Cycle cNamedNumbers[] = {
	 sub_frames_4, 
	 sub_frames_5, 
	 sub_frames_8, 
	 sub_frames_10, 
	 sub_frames_16, 
	 sub_frames_20, 
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
    
    public static UE_DRX_Cycle valueOf(long value)
    {
	return (UE_DRX_Cycle)sub_frames_4.lookupValue(value);
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
	    "UE_DRX_Cycle"
	),
	new QName (
	    "InformationElements",
	    "UE-DRX-Cycle"
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
		    "spare2",
		    6
		),
		new MemberListElement (
		    "spare1",
		    7
		)
	    }
	),
	0,
	sub_frames_4
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_DRX_Cycle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_DRX_Cycle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_DRX_Cycle
