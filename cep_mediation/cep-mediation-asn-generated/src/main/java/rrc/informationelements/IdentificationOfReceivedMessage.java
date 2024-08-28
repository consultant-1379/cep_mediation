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
 * Define the ASN1 Type IdentificationOfReceivedMessage from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IdentificationOfReceivedMessage extends Sequence {
    
    /**
     * The default constructor.
     */
    public IdentificationOfReceivedMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IdentificationOfReceivedMessage(RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    ReceivedMessageType receivedMessageType)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setReceivedMessageType(receivedMessageType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RRC_TransactionIdentifier();
	mComponents[1] = ReceivedMessageType.activeSetUpdate;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new RRC_TransactionIdentifier();
	    case 1:
		return ReceivedMessageType.activeSetUpdate;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "receivedMessageType"
    public ReceivedMessageType getReceivedMessageType()
    {
	return (ReceivedMessageType)mComponents[1];
    }
    
    public void setReceivedMessageType(ReceivedMessageType receivedMessageType)
    {
	mComponents[1] = receivedMessageType;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "IdentificationOfReceivedMessage"
	),
	new QName (
	    "InformationElements",
	    "IdentificationOfReceivedMessage"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RRC_TransactionIdentifier"
			    ),
			    new QName (
				"InformationElements",
				"RRC-TransactionIdentifier"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RRC_TransactionIdentifier(0), 
				    new RRC_TransactionIdentifier(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "rrc-TransactionIdentifier",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    ReceivedMessageType.activeSetUpdate
			)
		    ),
		    "receivedMessageType",
		    1,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IdentificationOfReceivedMessage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IdentificationOfReceivedMessage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IdentificationOfReceivedMessage
