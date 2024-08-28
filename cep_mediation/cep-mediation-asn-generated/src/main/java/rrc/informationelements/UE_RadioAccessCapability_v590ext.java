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
 * Define the ASN1 Type UE_RadioAccessCapability_v590ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v590ext(DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig, 
		    PDCP_Capability_r5_ext pdcp_Capability_r5_ext, 
		    RLC_Capability_r5_ext rlc_Capability_r5_ext, 
		    PhysicalChannelCapability_hspdsch_r5 physicalChannelCapability, 
		    MultiModeRAT_Capability_v590ext multiModeRAT_Capability_v590ext)
    {
	setDl_CapabilityWithSimultaneousHS_DSCHConfig(dl_CapabilityWithSimultaneousHS_DSCHConfig);
	setPdcp_Capability_r5_ext(pdcp_Capability_r5_ext);
	setRlc_Capability_r5_ext(rlc_Capability_r5_ext);
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability_v590ext(multiModeRAT_Capability_v590ext);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v590ext(PDCP_Capability_r5_ext pdcp_Capability_r5_ext, 
		    RLC_Capability_r5_ext rlc_Capability_r5_ext, 
		    PhysicalChannelCapability_hspdsch_r5 physicalChannelCapability, 
		    MultiModeRAT_Capability_v590ext multiModeRAT_Capability_v590ext)
    {
	setPdcp_Capability_r5_ext(pdcp_Capability_r5_ext);
	setRlc_Capability_r5_ext(rlc_Capability_r5_ext);
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability_v590ext(multiModeRAT_Capability_v590ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	mComponents[1] = new PDCP_Capability_r5_ext();
	mComponents[2] = new RLC_Capability_r5_ext();
	mComponents[3] = new PhysicalChannelCapability_hspdsch_r5();
	mComponents[4] = new MultiModeRAT_Capability_v590ext();
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
		return DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	    case 1:
		return new PDCP_Capability_r5_ext();
	    case 2:
		return new RLC_Capability_r5_ext();
	    case 3:
		return new PhysicalChannelCapability_hspdsch_r5();
	    case 4:
		return new MultiModeRAT_Capability_v590ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_CapabilityWithSimultaneousHS_DSCHConfig"
    public DL_CapabilityWithSimultaneousHS_DSCHConfig getDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return (DL_CapabilityWithSimultaneousHS_DSCHConfig)mComponents[0];
    }
    
    public void setDl_CapabilityWithSimultaneousHS_DSCHConfig(DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig)
    {
	mComponents[0] = dl_CapabilityWithSimultaneousHS_DSCHConfig;
    }
    
    public boolean hasDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pdcp_Capability_r5_ext"
    public PDCP_Capability_r5_ext getPdcp_Capability_r5_ext()
    {
	return (PDCP_Capability_r5_ext)mComponents[1];
    }
    
    public void setPdcp_Capability_r5_ext(PDCP_Capability_r5_ext pdcp_Capability_r5_ext)
    {
	mComponents[1] = pdcp_Capability_r5_ext;
    }
    
    
    // Methods for field "rlc_Capability_r5_ext"
    public RLC_Capability_r5_ext getRlc_Capability_r5_ext()
    {
	return (RLC_Capability_r5_ext)mComponents[2];
    }
    
    public void setRlc_Capability_r5_ext(RLC_Capability_r5_ext rlc_Capability_r5_ext)
    {
	mComponents[2] = rlc_Capability_r5_ext;
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability_hspdsch_r5 getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_hspdsch_r5)mComponents[3];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_hspdsch_r5 physicalChannelCapability)
    {
	mComponents[3] = physicalChannelCapability;
    }
    
    
    // Methods for field "multiModeRAT_Capability_v590ext"
    public MultiModeRAT_Capability_v590ext getMultiModeRAT_Capability_v590ext()
    {
	return (MultiModeRAT_Capability_v590ext)mComponents[4];
    }
    
    public void setMultiModeRAT_Capability_v590ext(MultiModeRAT_Capability_v590ext multiModeRAT_Capability_v590ext)
    {
	mComponents[4] = multiModeRAT_Capability_v590ext;
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
	    "UE_RadioAccessCapability_v590ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v590ext"
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
			    DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32
			)
		    ),
		    "dl-CapabilityWithSimultaneousHS-DSCHConfig",
		    0,
		    3,
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
				"PDCP_Capability_r5_ext"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Capability-r5-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_r5_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_r5_ext"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability-r5-ext",
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
				"RLC_Capability_r5_ext"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Capability-r5-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_r5_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_r5_ext"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Capability-r5-ext",
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
				"PhysicalChannelCapability_hspdsch_r5"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-hspdsch-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_hspdsch_r5"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_hspdsch_r5"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelCapability",
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
				"MultiModeRAT_Capability_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"MultiModeRAT-Capability-v590ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v590ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v590ext"
				)
			    ),
			    0
			)
		    ),
		    "multiModeRAT-Capability-v590ext",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v590ext
