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
 * Define the ASN1 Type RRCConnectionReject_r3_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionReject_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionReject_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionReject_r3_IEs(rrc.informationelements.InitialUE_Identity initialUE_Identity, 
		    rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.RejectionCause rejectionCause, 
		    rrc.informationelements.WaitTime waitTime, 
		    rrc.informationelements.RedirectionInfo redirectionInfo)
    {
	setInitialUE_Identity(initialUE_Identity);
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setRejectionCause(rejectionCause);
	setWaitTime(waitTime);
	setRedirectionInfo(redirectionInfo);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionReject_r3_IEs(rrc.informationelements.InitialUE_Identity initialUE_Identity, 
		    rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier, 
		    rrc.informationelements.RejectionCause rejectionCause, 
		    rrc.informationelements.WaitTime waitTime)
    {
	setInitialUE_Identity(initialUE_Identity);
	setRrc_TransactionIdentifier(rrc_TransactionIdentifier);
	setRejectionCause(rejectionCause);
	setWaitTime(waitTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InitialUE_Identity();
	mComponents[1] = new rrc.informationelements.RRC_TransactionIdentifier();
	mComponents[2] = rrc.informationelements.RejectionCause.congestion;
	mComponents[3] = new rrc.informationelements.WaitTime();
	mComponents[4] = new rrc.informationelements.RedirectionInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.InitialUE_Identity();
	    case 1:
		return new rrc.informationelements.RRC_TransactionIdentifier();
	    case 2:
		return rrc.informationelements.RejectionCause.congestion;
	    case 3:
		return new rrc.informationelements.WaitTime();
	    case 4:
		return new rrc.informationelements.RedirectionInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "initialUE_Identity"
    public rrc.informationelements.InitialUE_Identity getInitialUE_Identity()
    {
	return (rrc.informationelements.InitialUE_Identity)mComponents[0];
    }
    
    public void setInitialUE_Identity(rrc.informationelements.InitialUE_Identity initialUE_Identity)
    {
	mComponents[0] = initialUE_Identity;
    }
    
    
    // Methods for field "rrc_TransactionIdentifier"
    public rrc.informationelements.RRC_TransactionIdentifier getRrc_TransactionIdentifier()
    {
	return (rrc.informationelements.RRC_TransactionIdentifier)mComponents[1];
    }
    
    public void setRrc_TransactionIdentifier(rrc.informationelements.RRC_TransactionIdentifier rrc_TransactionIdentifier)
    {
	mComponents[1] = rrc_TransactionIdentifier;
    }
    
    
    // Methods for field "rejectionCause"
    public rrc.informationelements.RejectionCause getRejectionCause()
    {
	return (rrc.informationelements.RejectionCause)mComponents[2];
    }
    
    public void setRejectionCause(rrc.informationelements.RejectionCause rejectionCause)
    {
	mComponents[2] = rejectionCause;
    }
    
    
    // Methods for field "waitTime"
    public rrc.informationelements.WaitTime getWaitTime()
    {
	return (rrc.informationelements.WaitTime)mComponents[3];
    }
    
    public void setWaitTime(rrc.informationelements.WaitTime waitTime)
    {
	mComponents[3] = waitTime;
    }
    
    
    // Methods for field "redirectionInfo"
    public rrc.informationelements.RedirectionInfo getRedirectionInfo()
    {
	return (rrc.informationelements.RedirectionInfo)mComponents[4];
    }
    
    public void setRedirectionInfo(rrc.informationelements.RedirectionInfo redirectionInfo)
    {
	mComponents[4] = redirectionInfo;
    }
    
    public boolean hasRedirectionInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRedirectionInfo()
    {
	setComponentAbsent(4);
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
	    "RRCConnectionReject_r3_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionReject-r3-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InitialUE_Identity"
			    ),
			    new QName (
				"InformationElements",
				"InitialUE-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InitialUE_Identity"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "initialUE-Identity",
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
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RejectionCause"
			    ),
			    new QName (
				"InformationElements",
				"RejectionCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"congestion",
					0
				    ),
				    new MemberListElement (
					"unspecified",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.RejectionCause.congestion
			)
		    ),
		    "rejectionCause",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"WaitTime"
			    ),
			    new QName (
				"InformationElements",
				"WaitTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.WaitTime(0), 
				    new rrc.informationelements.WaitTime(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "waitTime",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RedirectionInfo"
			    ),
			    new QName (
				"InformationElements",
				"RedirectionInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RedirectionInfo"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "redirectionInfo",
		    4,
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionReject_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionReject_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionReject_r3_IEs
