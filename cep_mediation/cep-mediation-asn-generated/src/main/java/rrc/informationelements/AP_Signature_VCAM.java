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
 * Define the ASN1 Type AP_Signature_VCAM from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AP_Signature_VCAM extends Sequence {
    
    /**
     * The default constructor.
     */
    public AP_Signature_VCAM()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AP_Signature_VCAM(AP_Signature ap_Signature, 
		    AvailableAP_SubchannelList availableAP_SubchannelList)
    {
	setAp_Signature(ap_Signature);
	setAvailableAP_SubchannelList(availableAP_SubchannelList);
    }
    
    /**
     * Construct with required components.
     */
    public AP_Signature_VCAM(AP_Signature ap_Signature)
    {
	setAp_Signature(ap_Signature);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AP_Signature();
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
		return new AP_Signature();
	    case 1:
		return new AvailableAP_SubchannelList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ap_Signature"
    public AP_Signature getAp_Signature()
    {
	return (AP_Signature)mComponents[0];
    }
    
    public void setAp_Signature(AP_Signature ap_Signature)
    {
	mComponents[0] = ap_Signature;
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
	    "AP_Signature_VCAM"
	),
	new QName (
	    "InformationElements",
	    "AP-Signature-VCAM"
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
				"AP_Signature"
			    ),
			    new QName (
				"InformationElements",
				"AP-Signature"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AP_Signature(0), 
				    new AP_Signature(15),
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
		    "ap-Signature",
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
     * Get the type descriptor (TypeInfo) of 'this' AP_Signature_VCAM object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AP_Signature_VCAM object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AP_Signature_VCAM
