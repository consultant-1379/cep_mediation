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
 * Define the ASN1 Type ChannelReqParamsForUCSM from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ChannelReqParamsForUCSM extends Sequence {
    
    /**
     * The default constructor.
     */
    public ChannelReqParamsForUCSM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ChannelReqParamsForUCSM(AvailableAP_SignatureList availableAP_SignatureList, 
		    AvailableAP_SubchannelList availableAP_SubchannelList)
    {
	setAvailableAP_SignatureList(availableAP_SignatureList);
	setAvailableAP_SubchannelList(availableAP_SubchannelList);
    }
    
    /**
     * Construct with required components.
     */
    public ChannelReqParamsForUCSM(AvailableAP_SignatureList availableAP_SignatureList)
    {
	setAvailableAP_SignatureList(availableAP_SignatureList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AvailableAP_SignatureList();
	mComponents[1] = new AvailableAP_SubchannelList();
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
		return new AvailableAP_SignatureList();
	    case 1:
		return new AvailableAP_SubchannelList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "availableAP_SignatureList"
    public AvailableAP_SignatureList getAvailableAP_SignatureList()
    {
	return (AvailableAP_SignatureList)mComponents[0];
    }
    
    public void setAvailableAP_SignatureList(AvailableAP_SignatureList availableAP_SignatureList)
    {
	mComponents[0] = availableAP_SignatureList;
    }
    
    
    // Methods for field "availableAP_SubchannelList"
    public AvailableAP_SubchannelList getAvailableAP_SubchannelList()
    {
	return (AvailableAP_SubchannelList)mComponents[1];
    }
    
    public void setAvailableAP_SubchannelList(AvailableAP_SubchannelList availableAP_SubchannelList)
    {
	mComponents[1] = availableAP_SubchannelList;
    }
    
    public boolean hasAvailableAP_SubchannelList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAvailableAP_SubchannelList()
    {
	setComponentAbsent(1);
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
	    "ChannelReqParamsForUCSM"
	),
	new QName (
	    "InformationElements",
	    "ChannelReqParamsForUCSM"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AvailableAP_SignatureList"
			    ),
			    new QName (
				"InformationElements",
				"AvailableAP-SignatureList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AP_Signature"
				)
			    )
			)
		    ),
		    "availableAP-SignatureList",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AvailableAP_SubchannelList"
			    ),
			    new QName (
				"InformationElements",
				"AvailableAP-SubchannelList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(12),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(12)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AP_Subchannel"
				)
			    )
			)
		    ),
		    "availableAP-SubchannelList",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ChannelReqParamsForUCSM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ChannelReqParamsForUCSM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ChannelReqParamsForUCSM
