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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type HandoverFromUTRANCommand_CDMA2000_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class HandoverFromUTRANCommand_CDMA2000_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public HandoverFromUTRANCommand_CDMA2000_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HandoverFromUTRANCommand_CDMA2000_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.RAB_Info toHandoverRAB_Info, 
		    rrc.informationelements.CDMA2000_MessageList cdma2000_MessageList)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setActivationTime(activationTime);
	setToHandoverRAB_Info(toHandoverRAB_Info);
	setCdma2000_MessageList(cdma2000_MessageList);
    }
    
    /**
     * Construct with required components.
     */
    public HandoverFromUTRANCommand_CDMA2000_r3_IEs(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.CDMA2000_MessageList cdma2000_MessageList)
    {
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setCdma2000_MessageList(cdma2000_MessageList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[1] = new rrc.informationelements.ActivationTime();
	mComponents[2] = new rrc.informationelements.RAB_Info();
	mComponents[3] = new rrc.informationelements.CDMA2000_MessageList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 1:
		return new rrc.informationelements.ActivationTime();
	    case 2:
		return new rrc.informationelements.RAB_Info();
	    case 3:
		return new rrc.informationelements.CDMA2000_MessageList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[0];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[0] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[1];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[1] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "toHandoverRAB_Info"
    public rrc.informationelements.RAB_Info getToHandoverRAB_Info()
    {
	return (rrc.informationelements.RAB_Info)mComponents[2];
    }
    
    public void setToHandoverRAB_Info(rrc.informationelements.RAB_Info toHandoverRAB_Info)
    {
	mComponents[2] = toHandoverRAB_Info;
    }
    
    public boolean hasToHandoverRAB_Info()
    {
	return componentIsPresent(2);
    }
    
    public void deleteToHandoverRAB_Info()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "cdma2000_MessageList"
    public rrc.informationelements.CDMA2000_MessageList getCdma2000_MessageList()
    {
	return (rrc.informationelements.CDMA2000_MessageList)mComponents[3];
    }
    
    public void setCdma2000_MessageList(rrc.informationelements.CDMA2000_MessageList cdma2000_MessageList)
    {
	mComponents[3] = cdma2000_MessageList;
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
	    "rrc.pdu_definitions",
	    "HandoverFromUTRANCommand_CDMA2000_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "HandoverFromUTRANCommand-CDMA2000-r3-IEs"
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
				    new rrc.informationelements.RRC_TransactionIdentifier(0), 
				    new rrc.informationelements.RRC_TransactionIdentifier(3),
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTime",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RAB_Info"
			    ),
			    new QName (
				"InformationElements",
				"RAB-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RAB_Info"
				)
			    ),
			    0
			)
		    ),
		    "toHandoverRAB-Info",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CDMA2000_MessageList"
			    ),
			    new QName (
				"InformationElements",
				"CDMA2000-MessageList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CDMA2000_Message"
				)
			    )
			)
		    ),
		    "cdma2000-MessageList",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_CDMA2000_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HandoverFromUTRANCommand_CDMA2000_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HandoverFromUTRANCommand_CDMA2000_r3_IEs
