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
 * Define the ASN1 Type UE_RadioAccessCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability(PDCP_Capability pdcp_Capability, 
		    RLC_Capability rlc_Capability, 
		    TransportChannelCapability transportChannelCapability, 
		    RF_Capability rf_Capability, 
		    PhysicalChannelCapability physicalChannelCapability, 
		    UE_MultiModeRAT_Capability ue_MultiModeRAT_Capability, 
		    SecurityCapability securityCapability, 
		    UE_Positioning_Capability ue_positioning_Capability, 
		    MeasurementCapability measurementCapability)
    {
	setPdcp_Capability(pdcp_Capability);
	setRlc_Capability(rlc_Capability);
	setTransportChannelCapability(transportChannelCapability);
	setRf_Capability(rf_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setUe_MultiModeRAT_Capability(ue_MultiModeRAT_Capability);
	setSecurityCapability(securityCapability);
	setUe_positioning_Capability(ue_positioning_Capability);
	setMeasurementCapability(measurementCapability);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability(PDCP_Capability pdcp_Capability, 
		    RLC_Capability rlc_Capability, 
		    TransportChannelCapability transportChannelCapability, 
		    RF_Capability rf_Capability, 
		    PhysicalChannelCapability physicalChannelCapability, 
		    UE_MultiModeRAT_Capability ue_MultiModeRAT_Capability, 
		    SecurityCapability securityCapability, 
		    UE_Positioning_Capability ue_positioning_Capability)
    {
	setPdcp_Capability(pdcp_Capability);
	setRlc_Capability(rlc_Capability);
	setTransportChannelCapability(transportChannelCapability);
	setRf_Capability(rf_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setUe_MultiModeRAT_Capability(ue_MultiModeRAT_Capability);
	setSecurityCapability(securityCapability);
	setUe_positioning_Capability(ue_positioning_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDCP_Capability();
	mComponents[1] = new RLC_Capability();
	mComponents[2] = new TransportChannelCapability();
	mComponents[3] = new RF_Capability();
	mComponents[4] = new PhysicalChannelCapability();
	mComponents[5] = new UE_MultiModeRAT_Capability();
	mComponents[6] = new SecurityCapability();
	mComponents[7] = new UE_Positioning_Capability();
	mComponents[8] = new MeasurementCapability();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PDCP_Capability();
	    case 1:
		return new RLC_Capability();
	    case 2:
		return new TransportChannelCapability();
	    case 3:
		return new RF_Capability();
	    case 4:
		return new PhysicalChannelCapability();
	    case 5:
		return new UE_MultiModeRAT_Capability();
	    case 6:
		return new SecurityCapability();
	    case 7:
		return new UE_Positioning_Capability();
	    case 8:
		return new MeasurementCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdcp_Capability"
    public PDCP_Capability getPdcp_Capability()
    {
	return (PDCP_Capability)mComponents[0];
    }
    
    public void setPdcp_Capability(PDCP_Capability pdcp_Capability)
    {
	mComponents[0] = pdcp_Capability;
    }
    
    
    // Methods for field "rlc_Capability"
    public RLC_Capability getRlc_Capability()
    {
	return (RLC_Capability)mComponents[1];
    }
    
    public void setRlc_Capability(RLC_Capability rlc_Capability)
    {
	mComponents[1] = rlc_Capability;
    }
    
    
    // Methods for field "transportChannelCapability"
    public TransportChannelCapability getTransportChannelCapability()
    {
	return (TransportChannelCapability)mComponents[2];
    }
    
    public void setTransportChannelCapability(TransportChannelCapability transportChannelCapability)
    {
	mComponents[2] = transportChannelCapability;
    }
    
    
    // Methods for field "rf_Capability"
    public RF_Capability getRf_Capability()
    {
	return (RF_Capability)mComponents[3];
    }
    
    public void setRf_Capability(RF_Capability rf_Capability)
    {
	mComponents[3] = rf_Capability;
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability)mComponents[4];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability physicalChannelCapability)
    {
	mComponents[4] = physicalChannelCapability;
    }
    
    
    // Methods for field "ue_MultiModeRAT_Capability"
    public UE_MultiModeRAT_Capability getUe_MultiModeRAT_Capability()
    {
	return (UE_MultiModeRAT_Capability)mComponents[5];
    }
    
    public void setUe_MultiModeRAT_Capability(UE_MultiModeRAT_Capability ue_MultiModeRAT_Capability)
    {
	mComponents[5] = ue_MultiModeRAT_Capability;
    }
    
    
    // Methods for field "securityCapability"
    public SecurityCapability getSecurityCapability()
    {
	return (SecurityCapability)mComponents[6];
    }
    
    public void setSecurityCapability(SecurityCapability securityCapability)
    {
	mComponents[6] = securityCapability;
    }
    
    
    // Methods for field "ue_positioning_Capability"
    public UE_Positioning_Capability getUe_positioning_Capability()
    {
	return (UE_Positioning_Capability)mComponents[7];
    }
    
    public void setUe_positioning_Capability(UE_Positioning_Capability ue_positioning_Capability)
    {
	mComponents[7] = ue_positioning_Capability;
    }
    
    
    // Methods for field "measurementCapability"
    public MeasurementCapability getMeasurementCapability()
    {
	return (MeasurementCapability)mComponents[8];
    }
    
    public void setMeasurementCapability(MeasurementCapability measurementCapability)
    {
	mComponents[8] = measurementCapability;
    }
    
    public boolean hasMeasurementCapability()
    {
	return componentIsPresent(8);
    }
    
    public void deleteMeasurementCapability()
    {
	setComponentAbsent(8);
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
	    "UE_RadioAccessCapability"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDCP_Capability"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RLC_Capability"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Capability",
		    1,
		    2,
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
				"TransportChannelCapability"
			    ),
			    new QName (
				"InformationElements",
				"TransportChannelCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransportChannelCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TransportChannelCapability"
				)
			    ),
			    0
			)
		    ),
		    "transportChannelCapability",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RF_Capability"
			    ),
			    new QName (
				"InformationElements",
				"RF-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability"
				)
			    ),
			    0
			)
		    ),
		    "rf-Capability",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PhysicalChannelCapability"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelCapability",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_MultiModeRAT_Capability"
			    ),
			    new QName (
				"InformationElements",
				"UE-MultiModeRAT-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_MultiModeRAT_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_MultiModeRAT_Capability"
				)
			    ),
			    0
			)
		    ),
		    "ue-MultiModeRAT-Capability",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SecurityCapability"
			    ),
			    new QName (
				"InformationElements",
				"SecurityCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecurityCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecurityCapability"
				)
			    ),
			    0
			)
		    ),
		    "securityCapability",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_Capability"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Capability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Capability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Capability"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Capability",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementCapability"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability",
		    8,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability
