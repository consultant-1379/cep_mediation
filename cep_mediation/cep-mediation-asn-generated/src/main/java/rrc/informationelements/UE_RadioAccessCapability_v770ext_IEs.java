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
 * Define the ASN1 Type UE_RadioAccessCapability_v770ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v770ext_IEs(PDCP_Capability_v770ext pdcp_Capability, 
		    RLC_Capability_v770ext rlc_Capability, 
		    RF_Capability_v770ext rf_Capability, 
		    PhysicalChannelCapability_v770ext physicalChannelCapability, 
		    MultiModeRAT_Capability_v770ext multiModeRAT_Capability, 
		    UE_PositioningCapability_v770ext ue_PositioningCapability, 
		    Mac_ehsSupport mac_ehsSupport, 
		    UE_SpecificCapabilityInformation_LCRTDD ue_specificCapabilityInformation)
    {
	setPdcp_Capability(pdcp_Capability);
	setRlc_Capability(rlc_Capability);
	setRf_Capability(rf_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability(multiModeRAT_Capability);
	setUe_PositioningCapability(ue_PositioningCapability);
	setMac_ehsSupport(mac_ehsSupport);
	setUe_specificCapabilityInformation(ue_specificCapabilityInformation);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v770ext_IEs(RLC_Capability_v770ext rlc_Capability, 
		    PhysicalChannelCapability_v770ext physicalChannelCapability, 
		    MultiModeRAT_Capability_v770ext multiModeRAT_Capability, 
		    UE_PositioningCapability_v770ext ue_PositioningCapability)
    {
	setRlc_Capability(rlc_Capability);
	setPhysicalChannelCapability(physicalChannelCapability);
	setMultiModeRAT_Capability(multiModeRAT_Capability);
	setUe_PositioningCapability(ue_PositioningCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDCP_Capability_v770ext();
	mComponents[1] = new RLC_Capability_v770ext();
	mComponents[2] = new RF_Capability_v770ext();
	mComponents[3] = new PhysicalChannelCapability_v770ext();
	mComponents[4] = new MultiModeRAT_Capability_v770ext();
	mComponents[5] = new UE_PositioningCapability_v770ext();
	mComponents[6] = Mac_ehsSupport._true;
	mComponents[7] = UE_SpecificCapabilityInformation_LCRTDD.nF;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PDCP_Capability_v770ext();
	    case 1:
		return new RLC_Capability_v770ext();
	    case 2:
		return new RF_Capability_v770ext();
	    case 3:
		return new PhysicalChannelCapability_v770ext();
	    case 4:
		return new MultiModeRAT_Capability_v770ext();
	    case 5:
		return new UE_PositioningCapability_v770ext();
	    case 6:
		return Mac_ehsSupport._true;
	    case 7:
		return UE_SpecificCapabilityInformation_LCRTDD.nF;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdcp_Capability"
    public PDCP_Capability_v770ext getPdcp_Capability()
    {
	return (PDCP_Capability_v770ext)mComponents[0];
    }
    
    public void setPdcp_Capability(PDCP_Capability_v770ext pdcp_Capability)
    {
	mComponents[0] = pdcp_Capability;
    }
    
    public boolean hasPdcp_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deletePdcp_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rlc_Capability"
    public RLC_Capability_v770ext getRlc_Capability()
    {
	return (RLC_Capability_v770ext)mComponents[1];
    }
    
    public void setRlc_Capability(RLC_Capability_v770ext rlc_Capability)
    {
	mComponents[1] = rlc_Capability;
    }
    
    
    // Methods for field "rf_Capability"
    public RF_Capability_v770ext getRf_Capability()
    {
	return (RF_Capability_v770ext)mComponents[2];
    }
    
    public void setRf_Capability(RF_Capability_v770ext rf_Capability)
    {
	mComponents[2] = rf_Capability;
    }
    
    public boolean hasRf_Capability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRf_Capability()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability_v770ext getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_v770ext)mComponents[3];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_v770ext physicalChannelCapability)
    {
	mComponents[3] = physicalChannelCapability;
    }
    
    
    // Methods for field "multiModeRAT_Capability"
    public MultiModeRAT_Capability_v770ext getMultiModeRAT_Capability()
    {
	return (MultiModeRAT_Capability_v770ext)mComponents[4];
    }
    
    public void setMultiModeRAT_Capability(MultiModeRAT_Capability_v770ext multiModeRAT_Capability)
    {
	mComponents[4] = multiModeRAT_Capability;
    }
    
    
    // Methods for field "ue_PositioningCapability"
    public UE_PositioningCapability_v770ext getUe_PositioningCapability()
    {
	return (UE_PositioningCapability_v770ext)mComponents[5];
    }
    
    public void setUe_PositioningCapability(UE_PositioningCapability_v770ext ue_PositioningCapability)
    {
	mComponents[5] = ue_PositioningCapability;
    }
    
    
    // Methods for field "mac_ehsSupport"
    public Mac_ehsSupport getMac_ehsSupport()
    {
	return (Mac_ehsSupport)mComponents[6];
    }
    
    public void setMac_ehsSupport(Mac_ehsSupport mac_ehsSupport)
    {
	mComponents[6] = mac_ehsSupport;
    }
    
    public boolean hasMac_ehsSupport()
    {
	return componentIsPresent(6);
    }
    
    public void deleteMac_ehsSupport()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_ehsSupport from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_ehsSupport extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_ehsSupport()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_ehsSupport(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_ehsSupport _true =
	    new Mac_ehsSupport(0);
	private final static Mac_ehsSupport cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static Mac_ehsSupport valueOf(long value)
	{
	    return (Mac_ehsSupport)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v770ext_IEs$Mac_ehsSupport"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mac_ehsSupport object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_ehsSupport object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_ehsSupport

    // Methods for field "ue_specificCapabilityInformation"
    public UE_SpecificCapabilityInformation_LCRTDD getUe_specificCapabilityInformation()
    {
	return (UE_SpecificCapabilityInformation_LCRTDD)mComponents[7];
    }
    
    public void setUe_specificCapabilityInformation(UE_SpecificCapabilityInformation_LCRTDD ue_specificCapabilityInformation)
    {
	mComponents[7] = ue_specificCapabilityInformation;
    }
    
    public boolean hasUe_specificCapabilityInformation()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUe_specificCapabilityInformation()
    {
	setComponentAbsent(7);
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
	    "UE_RadioAccessCapability_v770ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v770ext-IEs"
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
				"PDCP_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability",
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
				"RLC_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_v770ext"
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
				"RF_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"RF-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RF_Capability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "rf-Capability",
		    2,
		    3,
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
				"PhysicalChannelCapability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v770ext"
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
				"MultiModeRAT_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"MultiModeRAT-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MultiModeRAT_Capability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "multiModeRAT-Capability",
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
				"UE_PositioningCapability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-PositioningCapability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_PositioningCapability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_PositioningCapability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-PositioningCapability",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v770ext_IEs$Mac_ehsSupport"
			)
		    ),
		    "mac-ehsSupport",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_SpecificCapabilityInformation_LCRTDD"
			    ),
			    new QName (
				"InformationElements",
				"UE-SpecificCapabilityInformation-LCRTDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nF",
					0
				    ),
				    new MemberListElement (
					"nFMc-TriRx-UniTx",
					1
				    ),
				    new MemberListElement (
					"nFMc-TriRx-TriTx",
					2
				    ),
				    new MemberListElement (
					"nFMc-HexRx-UniTx",
					3
				    ),
				    new MemberListElement (
					"nFMc-HexRx-TriTx",
					4
				    ),
				    new MemberListElement (
					"nFMc-HexRx-HexTx",
					5
				    ),
				    new MemberListElement (
					"nFMc-TwoRx-UniTx",
					6
				    ),
				    new MemberListElement (
					"nFMc-TwoRx-TwoTx",
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
			    UE_SpecificCapabilityInformation_LCRTDD.nF
			)
		    ),
		    "ue-specificCapabilityInformation",
		    7,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v770ext_IEs
