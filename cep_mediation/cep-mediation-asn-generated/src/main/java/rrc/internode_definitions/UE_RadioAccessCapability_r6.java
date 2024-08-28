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
 * Define the ASN1 Type UE_RadioAccessCapability_r6 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class UE_RadioAccessCapability_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_r6(rrc.informationelements.AccessStratumReleaseIndicator accessStratumReleaseIndicator, 
		    rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig, 
		    PDCP_Capability_r6 pdcp_Capability, 
		    RLC_Capability_r5 rlc_Capability, 
		    rrc.informationelements.TransportChannelCapability transportChannelCapability, 
		    RF_Capability_r4 rf_Capability, 
		    PhysicalChannelCapability_r5 physicalChannelCapability, 
		    UE_MultiModeRAT_Capability_r5 ue_MultiModeRAT_Capability, 
		    rrc.informationelements.SecurityCapability securityCapability, 
		    UE_Positioning_Capability_r4 ue_positioning_Capability, 
		    MeasurementCapability_r4 measurementCapability)
    {
	setAccessStratumReleaseIndicator(accessStratumReleaseIndicator);
	setDl_CapabilityWithSimultaneousHS_DSCHConfig(dl_CapabilityWithSimultaneousHS_DSCHConfig);
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
    public UE_RadioAccessCapability_r6(rrc.informationelements.AccessStratumReleaseIndicator accessStratumReleaseIndicator, 
		    PDCP_Capability_r6 pdcp_Capability, 
		    RLC_Capability_r5 rlc_Capability, 
		    rrc.informationelements.TransportChannelCapability transportChannelCapability, 
		    RF_Capability_r4 rf_Capability, 
		    PhysicalChannelCapability_r5 physicalChannelCapability, 
		    UE_MultiModeRAT_Capability_r5 ue_MultiModeRAT_Capability, 
		    rrc.informationelements.SecurityCapability securityCapability, 
		    UE_Positioning_Capability_r4 ue_positioning_Capability)
    {
	setAccessStratumReleaseIndicator(accessStratumReleaseIndicator);
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
	mComponents[0] = rrc.informationelements.AccessStratumReleaseIndicator.rel_4;
	mComponents[1] = rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	mComponents[2] = new PDCP_Capability_r6();
	mComponents[3] = new RLC_Capability_r5();
	mComponents[4] = new rrc.informationelements.TransportChannelCapability();
	mComponents[5] = new RF_Capability_r4();
	mComponents[6] = new PhysicalChannelCapability_r5();
	mComponents[7] = new UE_MultiModeRAT_Capability_r5();
	mComponents[8] = new rrc.informationelements.SecurityCapability();
	mComponents[9] = new UE_Positioning_Capability_r4();
	mComponents[10] = new MeasurementCapability_r4();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return rrc.informationelements.AccessStratumReleaseIndicator.rel_4;
	    case 1:
		return rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	    case 2:
		return new PDCP_Capability_r6();
	    case 3:
		return new RLC_Capability_r5();
	    case 4:
		return new rrc.informationelements.TransportChannelCapability();
	    case 5:
		return new RF_Capability_r4();
	    case 6:
		return new PhysicalChannelCapability_r5();
	    case 7:
		return new UE_MultiModeRAT_Capability_r5();
	    case 8:
		return new rrc.informationelements.SecurityCapability();
	    case 9:
		return new UE_Positioning_Capability_r4();
	    case 10:
		return new MeasurementCapability_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accessStratumReleaseIndicator"
    public rrc.informationelements.AccessStratumReleaseIndicator getAccessStratumReleaseIndicator()
    {
	return (rrc.informationelements.AccessStratumReleaseIndicator)mComponents[0];
    }
    
    public void setAccessStratumReleaseIndicator(rrc.informationelements.AccessStratumReleaseIndicator accessStratumReleaseIndicator)
    {
	mComponents[0] = accessStratumReleaseIndicator;
    }
    
    
    // Methods for field "dl_CapabilityWithSimultaneousHS_DSCHConfig"
    public rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig getDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return (rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig)mComponents[1];
    }
    
    public void setDl_CapabilityWithSimultaneousHS_DSCHConfig(rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig)
    {
	mComponents[1] = dl_CapabilityWithSimultaneousHS_DSCHConfig;
    }
    
    public boolean hasDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "pdcp_Capability"
    public PDCP_Capability_r6 getPdcp_Capability()
    {
	return (PDCP_Capability_r6)mComponents[2];
    }
    
    public void setPdcp_Capability(PDCP_Capability_r6 pdcp_Capability)
    {
	mComponents[2] = pdcp_Capability;
    }
    
    
    // Methods for field "rlc_Capability"
    public RLC_Capability_r5 getRlc_Capability()
    {
	return (RLC_Capability_r5)mComponents[3];
    }
    
    public void setRlc_Capability(RLC_Capability_r5 rlc_Capability)
    {
	mComponents[3] = rlc_Capability;
    }
    
    
    // Methods for field "transportChannelCapability"
    public rrc.informationelements.TransportChannelCapability getTransportChannelCapability()
    {
	return (rrc.informationelements.TransportChannelCapability)mComponents[4];
    }
    
    public void setTransportChannelCapability(rrc.informationelements.TransportChannelCapability transportChannelCapability)
    {
	mComponents[4] = transportChannelCapability;
    }
    
    
    // Methods for field "rf_Capability"
    public RF_Capability_r4 getRf_Capability()
    {
	return (RF_Capability_r4)mComponents[5];
    }
    
    public void setRf_Capability(RF_Capability_r4 rf_Capability)
    {
	mComponents[5] = rf_Capability;
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability_r5 getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_r5)mComponents[6];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_r5 physicalChannelCapability)
    {
	mComponents[6] = physicalChannelCapability;
    }
    
    
    // Methods for field "ue_MultiModeRAT_Capability"
    public UE_MultiModeRAT_Capability_r5 getUe_MultiModeRAT_Capability()
    {
	return (UE_MultiModeRAT_Capability_r5)mComponents[7];
    }
    
    public void setUe_MultiModeRAT_Capability(UE_MultiModeRAT_Capability_r5 ue_MultiModeRAT_Capability)
    {
	mComponents[7] = ue_MultiModeRAT_Capability;
    }
    
    
    // Methods for field "securityCapability"
    public rrc.informationelements.SecurityCapability getSecurityCapability()
    {
	return (rrc.informationelements.SecurityCapability)mComponents[8];
    }
    
    public void setSecurityCapability(rrc.informationelements.SecurityCapability securityCapability)
    {
	mComponents[8] = securityCapability;
    }
    
    
    // Methods for field "ue_positioning_Capability"
    public UE_Positioning_Capability_r4 getUe_positioning_Capability()
    {
	return (UE_Positioning_Capability_r4)mComponents[9];
    }
    
    public void setUe_positioning_Capability(UE_Positioning_Capability_r4 ue_positioning_Capability)
    {
	mComponents[9] = ue_positioning_Capability;
    }
    
    
    // Methods for field "measurementCapability"
    public MeasurementCapability_r4 getMeasurementCapability()
    {
	return (MeasurementCapability_r4)mComponents[10];
    }
    
    public void setMeasurementCapability(MeasurementCapability_r4 measurementCapability)
    {
	mComponents[10] = measurementCapability;
    }
    
    public boolean hasMeasurementCapability()
    {
	return componentIsPresent(10);
    }
    
    public void deleteMeasurementCapability()
    {
	setComponentAbsent(10);
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
	    "UE_RadioAccessCapability_r6"
	),
	new QName (
	    "Internode-definitions",
	    "UE-RadioAccessCapability-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AccessStratumReleaseIndicator"
			    ),
			    new QName (
				"InformationElements",
				"AccessStratumReleaseIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rel-4",
					0
				    ),
				    new MemberListElement (
					"rel-5",
					1
				    ),
				    new MemberListElement (
					"rel-6",
					2
				    ),
				    new MemberListElement (
					"rel-7",
					3
				    ),
				    new MemberListElement (
					"rel-8",
					4
				    ),
				    new MemberListElement (
					"rel-9",
					5
				    ),
				    new MemberListElement (
					"rel-10",
					6
				    ),
				    new MemberListElement (
					"spare9",
					7
				    ),
				    new MemberListElement (
					"spare8",
					8
				    ),
				    new MemberListElement (
					"spare7",
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
			    rrc.informationelements.AccessStratumReleaseIndicator.rel_4
			)
		    ),
		    "accessStratumReleaseIndicator",
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
				"DL_CapabilityWithSimultaneousHS_DSCHConfig"
			    ),
			    new QName (
				"InformationElements",
				"DL-CapabilityWithSimultaneousHS-DSCHConfig"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"kbps32",
					0
				    ),
				    new MemberListElement (
					"kbps64",
					1
				    ),
				    new MemberListElement (
					"kbps128",
					2
				    ),
				    new MemberListElement (
					"kbps384",
					3
				    )
				}
			    ),
			    0,
			    rrc.informationelements.DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32
			)
		    ),
		    "dl-CapabilityWithSimultaneousHS-DSCHConfig",
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
				"rrc.internode_definitions",
				"PDCP_Capability_r6"
			    ),
			    new QName (
				"Internode-definitions",
				"PDCP-Capability-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "PDCP_Capability_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "PDCP_Capability_r6"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability",
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
				"rrc.internode_definitions",
				"RLC_Capability_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"RLC-Capability-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "RLC_Capability_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "RLC_Capability_r5"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Capability",
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
				"rrc.internode_definitions",
				"RF_Capability_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"RF-Capability-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "RF_Capability_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "RF_Capability_r4"
				)
			    ),
			    0
			)
		    ),
		    "rf-Capability",
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
				"rrc.internode_definitions",
				"PhysicalChannelCapability_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"PhysicalChannelCapability-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "PhysicalChannelCapability_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "PhysicalChannelCapability_r5"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelCapability",
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
				"rrc.internode_definitions",
				"UE_MultiModeRAT_Capability_r5"
			    ),
			    new QName (
				"Internode-definitions",
				"UE-MultiModeRAT-Capability-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_MultiModeRAT_Capability_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_MultiModeRAT_Capability_r5"
				)
			    ),
			    0
			)
		    ),
		    "ue-MultiModeRAT-Capability",
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
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"UE_Positioning_Capability_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"UE-Positioning-Capability-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_Positioning_Capability_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "UE_Positioning_Capability_r4"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Capability",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"rrc.internode_definitions",
				"MeasurementCapability_r4"
			    ),
			    new QName (
				"Internode-definitions",
				"MeasurementCapability-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "MeasurementCapability_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.internode_definitions",
				    "MeasurementCapability_r4"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability",
		    10,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_r6
