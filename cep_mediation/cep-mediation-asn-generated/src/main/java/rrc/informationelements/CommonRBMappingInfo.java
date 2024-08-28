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
 * Define the ASN1 Type CommonRBMappingInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CommonRBMappingInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommonRBMappingInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommonRBMappingInfo(LogicalChannelIdentity logicalChannelIdentity, 
		    MAC_ehs_QueueId mac_ehs_QueueId)
    {
	setLogicalChannelIdentity(logicalChannelIdentity);
	setMac_ehs_QueueId(mac_ehs_QueueId);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LogicalChannelIdentity();
	mComponents[1] = new MAC_ehs_QueueId();
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
		return new LogicalChannelIdentity();
	    case 1:
		return new MAC_ehs_QueueId();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "logicalChannelIdentity"
    public LogicalChannelIdentity getLogicalChannelIdentity()
    {
	return (LogicalChannelIdentity)mComponents[0];
    }
    
    public void setLogicalChannelIdentity(LogicalChannelIdentity logicalChannelIdentity)
    {
	mComponents[0] = logicalChannelIdentity;
    }
    
    
    // Methods for field "mac_ehs_QueueId"
    public MAC_ehs_QueueId getMac_ehs_QueueId()
    {
	return (MAC_ehs_QueueId)mComponents[1];
    }
    
    public void setMac_ehs_QueueId(MAC_ehs_QueueId mac_ehs_QueueId)
    {
	mComponents[1] = mac_ehs_QueueId;
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
	    "CommonRBMappingInfo"
	),
	new QName (
	    "InformationElements",
	    "CommonRBMappingInfo"
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
				"LogicalChannelIdentity"
			    ),
			    new QName (
				"InformationElements",
				"LogicalChannelIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LogicalChannelIdentity(1), 
				    new LogicalChannelIdentity(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "logicalChannelIdentity",
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
				"MAC_ehs_QueueId"
			    ),
			    new QName (
				"InformationElements",
				"MAC-ehs-QueueId"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MAC_ehs_QueueId(0), 
				    new MAC_ehs_QueueId(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "mac-ehs-QueueId",
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
     * Get the type descriptor (TypeInfo) of 'this' CommonRBMappingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommonRBMappingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommonRBMappingInfo
