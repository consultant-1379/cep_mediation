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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type InterRATHandoverInfoWithInterRATCapabilities_r3_IEs from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfoWithInterRATCapabilities_r3_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_r3_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_r3_IEs(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability, 
		    OctetString interRATHandoverInfo)
    {
	setUe_RATSpecificCapability(ue_RATSpecificCapability);
	setInterRATHandoverInfo(interRATHandoverInfo);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATHandoverInfoWithInterRATCapabilities_r3_IEs(OctetString interRATHandoverInfo)
    {
	setInterRATHandoverInfo(interRATHandoverInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	mComponents[1] = new OctetString();
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
		return new rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList();
	    case 1:
		return new OctetString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RATSpecificCapability"
    public rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList getUe_RATSpecificCapability()
    {
	return (rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList)mComponents[0];
    }
    
    public void setUe_RATSpecificCapability(rrc.informationelements.InterRAT_UE_RadioAccessCapabilityList ue_RATSpecificCapability)
    {
	mComponents[0] = ue_RATSpecificCapability;
    }
    
    public boolean hasUe_RATSpecificCapability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RATSpecificCapability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "interRATHandoverInfo"
    public OctetString getInterRATHandoverInfo()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setInterRATHandoverInfo(OctetString interRATHandoverInfo)
    {
	mComponents[1] = interRATHandoverInfo;
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
	    "rrc.internode_definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities_r3_IEs"
	),
	new QName (
	    "Internode-definitions",
	    "InterRATHandoverInfoWithInterRATCapabilities-r3-IEs"
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
				"InterRAT_UE_RadioAccessCapabilityList"
			    ),
			    new QName (
				"InformationElements",
				"InterRAT-UE-RadioAccessCapabilityList"
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
				    "InterRAT_UE_RadioAccessCapability"
				)
			    )
			)
		    ),
		    "ue-RATSpecificCapability",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    )
			)
		    ),
		    "interRATHandoverInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_r3_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfoWithInterRATCapabilities_r3_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfoWithInterRATCapabilities_r3_IEs
