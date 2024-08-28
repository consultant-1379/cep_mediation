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
 * Define the ASN1 Type ReceivedMessageType from ASN1 Module InformationElements.
 * @see Enumerated
 */

public final class ReceivedMessageType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ReceivedMessageType()
    {
	super(cFirstNumber);
    }
    
    protected ReceivedMessageType(long value)
    {
	super(value);
    }
    
    // Named list definitions.
    public static final ReceivedMessageType activeSetUpdate =
	new ReceivedMessageType(0);
    public static final ReceivedMessageType cellChangeOrderFromUTRAN =
	new ReceivedMessageType(1);
    public static final ReceivedMessageType cellUpdateConfirm =
	new ReceivedMessageType(2);
    public static final ReceivedMessageType counterCheck =
	new ReceivedMessageType(3);
    public static final ReceivedMessageType downlinkDirectTransfer =
	new ReceivedMessageType(4);
    public static final ReceivedMessageType interRATHandoverCommand =
	new ReceivedMessageType(5);
    public static final ReceivedMessageType measurementControl =
	new ReceivedMessageType(6);
    public static final ReceivedMessageType pagingType2 =
	new ReceivedMessageType(7);
    public static final ReceivedMessageType physicalChannelReconfiguration =
	new ReceivedMessageType(8);
    public static final ReceivedMessageType physicalSharedChannelAllocation =
	new ReceivedMessageType(9);
    public static final ReceivedMessageType radioBearerReconfiguration =
	new ReceivedMessageType(10);
    public static final ReceivedMessageType radioBearerRelease =
	new ReceivedMessageType(11);
    public static final ReceivedMessageType radioBearerSetup =
	new ReceivedMessageType(12);
    public static final ReceivedMessageType rrcConnectionRelease =
	new ReceivedMessageType(13);
    public static final ReceivedMessageType rrcConnectionReject =
	new ReceivedMessageType(14);
    public static final ReceivedMessageType rrcConnectionSetup =
	new ReceivedMessageType(15);
    public static final ReceivedMessageType securityModeCommand =
	new ReceivedMessageType(16);
    public static final ReceivedMessageType signallingConnectionRelease =
	new ReceivedMessageType(17);
    public static final ReceivedMessageType transportChannelReconfiguration =
	new ReceivedMessageType(18);
    public static final ReceivedMessageType transportFormatCombinationControl =
	new ReceivedMessageType(19);
    public static final ReceivedMessageType ueCapabilityEnquiry =
	new ReceivedMessageType(20);
    public static final ReceivedMessageType ueCapabilityInformationConfirm =
	new ReceivedMessageType(21);
    public static final ReceivedMessageType uplinkPhysicalChannelControl =
	new ReceivedMessageType(22);
    public static final ReceivedMessageType uraUpdateConfirm =
	new ReceivedMessageType(23);
    public static final ReceivedMessageType utranMobilityInformation =
	new ReceivedMessageType(24);
    public static final ReceivedMessageType assistanceDataDelivery =
	new ReceivedMessageType(25);
    public static final ReceivedMessageType spare6 =
	new ReceivedMessageType(26);
    public static final ReceivedMessageType spare5 =
	new ReceivedMessageType(27);
    public static final ReceivedMessageType spare4 =
	new ReceivedMessageType(28);
    public static final ReceivedMessageType spare3 =
	new ReceivedMessageType(29);
    public static final ReceivedMessageType spare2 =
	new ReceivedMessageType(30);
    public static final ReceivedMessageType spare1 =
	new ReceivedMessageType(31);
    private final static ReceivedMessageType cNamedNumbers[] = {
	 activeSetUpdate, 
	 cellChangeOrderFromUTRAN, 
	 cellUpdateConfirm, 
	 counterCheck, 
	 downlinkDirectTransfer, 
	 interRATHandoverCommand, 
	 measurementControl, 
	 pagingType2, 
	 physicalChannelReconfiguration, 
	 physicalSharedChannelAllocation, 
	 radioBearerReconfiguration, 
	 radioBearerRelease, 
	 radioBearerSetup, 
	 rrcConnectionRelease, 
	 rrcConnectionReject, 
	 rrcConnectionSetup, 
	 securityModeCommand, 
	 signallingConnectionRelease, 
	 transportChannelReconfiguration, 
	 transportFormatCombinationControl, 
	 ueCapabilityEnquiry, 
	 ueCapabilityInformationConfirm, 
	 uplinkPhysicalChannelControl, 
	 uraUpdateConfirm, 
	 utranMobilityInformation, 
	 assistanceDataDelivery, 
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
    
    public static ReceivedMessageType valueOf(long value)
    {
	return (ReceivedMessageType)activeSetUpdate.lookupValue(value);
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
	    "ReceivedMessageType"
	),
	new QName (
	    "InformationElements",
	    "ReceivedMessageType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "activeSetUpdate",
		    0
		),
		new MemberListElement (
		    "cellChangeOrderFromUTRAN",
		    1
		),
		new MemberListElement (
		    "cellUpdateConfirm",
		    2
		),
		new MemberListElement (
		    "counterCheck",
		    3
		),
		new MemberListElement (
		    "downlinkDirectTransfer",
		    4
		),
		new MemberListElement (
		    "interRATHandoverCommand",
		    5
		),
		new MemberListElement (
		    "measurementControl",
		    6
		),
		new MemberListElement (
		    "pagingType2",
		    7
		),
		new MemberListElement (
		    "physicalChannelReconfiguration",
		    8
		),
		new MemberListElement (
		    "physicalSharedChannelAllocation",
		    9
		),
		new MemberListElement (
		    "radioBearerReconfiguration",
		    10
		),
		new MemberListElement (
		    "radioBearerRelease",
		    11
		),
		new MemberListElement (
		    "radioBearerSetup",
		    12
		),
		new MemberListElement (
		    "rrcConnectionRelease",
		    13
		),
		new MemberListElement (
		    "rrcConnectionReject",
		    14
		),
		new MemberListElement (
		    "rrcConnectionSetup",
		    15
		),
		new MemberListElement (
		    "securityModeCommand",
		    16
		),
		new MemberListElement (
		    "signallingConnectionRelease",
		    17
		),
		new MemberListElement (
		    "transportChannelReconfiguration",
		    18
		),
		new MemberListElement (
		    "transportFormatCombinationControl",
		    19
		),
		new MemberListElement (
		    "ueCapabilityEnquiry",
		    20
		),
		new MemberListElement (
		    "ueCapabilityInformationConfirm",
		    21
		),
		new MemberListElement (
		    "uplinkPhysicalChannelControl",
		    22
		),
		new MemberListElement (
		    "uraUpdateConfirm",
		    23
		),
		new MemberListElement (
		    "utranMobilityInformation",
		    24
		),
		new MemberListElement (
		    "assistanceDataDelivery",
		    25
		),
		new MemberListElement (
		    "spare6",
		    26
		),
		new MemberListElement (
		    "spare5",
		    27
		),
		new MemberListElement (
		    "spare4",
		    28
		),
		new MemberListElement (
		    "spare3",
		    29
		),
		new MemberListElement (
		    "spare2",
		    30
		),
		new MemberListElement (
		    "spare1",
		    31
		)
	    }
	),
	0,
	activeSetUpdate
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReceivedMessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReceivedMessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReceivedMessageType
