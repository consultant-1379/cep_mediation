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
 * Define the ASN1 Type UE_Positioning_ErrorCause_r7 from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class UE_Positioning_ErrorCause_r7 extends Enumerated {
    
    /**
     * The default constructor.
     */
    private UE_Positioning_ErrorCause_r7()
    {
	super(cFirstNumber);
    }
    
    protected UE_Positioning_ErrorCause_r7(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final UE_Positioning_ErrorCause_r7 notEnoughOTDOA_Cells =
	new UE_Positioning_ErrorCause_r7(0);
    public static final UE_Positioning_ErrorCause_r7 notEnoughGPS_Satellites =
	new UE_Positioning_ErrorCause_r7(1);
    public static final UE_Positioning_ErrorCause_r7 assistanceDataMissing =
	new UE_Positioning_ErrorCause_r7(2);
    public static final UE_Positioning_ErrorCause_r7 notAccomplishedGPS_TimingOfCellFrames =
	new UE_Positioning_ErrorCause_r7(3);
    public static final UE_Positioning_ErrorCause_r7 undefinedError =
	new UE_Positioning_ErrorCause_r7(4);
    public static final UE_Positioning_ErrorCause_r7 requestDeniedByUser =
	new UE_Positioning_ErrorCause_r7(5);
    public static final UE_Positioning_ErrorCause_r7 notProcessedAndTimeout =
	new UE_Positioning_ErrorCause_r7(6);
    public static final UE_Positioning_ErrorCause_r7 referenceCellNotServingCell =
	new UE_Positioning_ErrorCause_r7(7);
    public static final UE_Positioning_ErrorCause_r7 notEnoughGANSS_Satellites =
	new UE_Positioning_ErrorCause_r7(8);
    public static final UE_Positioning_ErrorCause_r7 notAccomplishedGANSS_TimingOfCellFrames =
	new UE_Positioning_ErrorCause_r7(9);
    public static final UE_Positioning_ErrorCause_r7 spare6 =
	new UE_Positioning_ErrorCause_r7(10);
    public static final UE_Positioning_ErrorCause_r7 spare5 =
	new UE_Positioning_ErrorCause_r7(11);
    public static final UE_Positioning_ErrorCause_r7 spare4 =
	new UE_Positioning_ErrorCause_r7(12);
    public static final UE_Positioning_ErrorCause_r7 spare3 =
	new UE_Positioning_ErrorCause_r7(13);
    public static final UE_Positioning_ErrorCause_r7 spare2 =
	new UE_Positioning_ErrorCause_r7(14);
    public static final UE_Positioning_ErrorCause_r7 spare1 =
	new UE_Positioning_ErrorCause_r7(15);
    private final static UE_Positioning_ErrorCause_r7 cNamedNumbers[] = {
	 notEnoughOTDOA_Cells, 
	 notEnoughGPS_Satellites, 
	 assistanceDataMissing, 
	 notAccomplishedGPS_TimingOfCellFrames, 
	 undefinedError, 
	 requestDeniedByUser, 
	 notProcessedAndTimeout, 
	 referenceCellNotServingCell, 
	 notEnoughGANSS_Satellites, 
	 notAccomplishedGANSS_TimingOfCellFrames, 
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
    
    public static UE_Positioning_ErrorCause_r7 valueOf(long value)
    {
	return (UE_Positioning_ErrorCause_r7)notEnoughOTDOA_Cells.lookupValue(value);
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
	    "UE_Positioning_ErrorCause_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-ErrorCause-r7"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "notEnoughOTDOA-Cells",
		    0
		),
		new MemberListElement (
		    "notEnoughGPS-Satellites",
		    1
		),
		new MemberListElement (
		    "assistanceDataMissing",
		    2
		),
		new MemberListElement (
		    "notAccomplishedGPS-TimingOfCellFrames",
		    3
		),
		new MemberListElement (
		    "undefinedError",
		    4
		),
		new MemberListElement (
		    "requestDeniedByUser",
		    5
		),
		new MemberListElement (
		    "notProcessedAndTimeout",
		    6
		),
		new MemberListElement (
		    "referenceCellNotServingCell",
		    7
		),
		new MemberListElement (
		    "notEnoughGANSS-Satellites",
		    8
		),
		new MemberListElement (
		    "notAccomplishedGANSS-TimingOfCellFrames",
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
	notEnoughOTDOA_Cells
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_ErrorCause_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_ErrorCause_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_ErrorCause_r7
