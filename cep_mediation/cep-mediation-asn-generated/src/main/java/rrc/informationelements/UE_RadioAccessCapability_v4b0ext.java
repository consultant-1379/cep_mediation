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
 * Define the ASN1 Type UE_RadioAccessCapability_v4b0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v4b0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v4b0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v4b0ext(PDCP_Capability_r4_ext pdcp_Capability_r4_ext, 
		    Tdd_CapabilityExt tdd_CapabilityExt, 
		    AccessStratumReleaseIndicator accessStratumReleaseIndicator)
    {
	setPdcp_Capability_r4_ext(pdcp_Capability_r4_ext);
	setTdd_CapabilityExt(tdd_CapabilityExt);
	setAccessStratumReleaseIndicator(accessStratumReleaseIndicator);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v4b0ext(PDCP_Capability_r4_ext pdcp_Capability_r4_ext)
    {
	setPdcp_Capability_r4_ext(pdcp_Capability_r4_ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PDCP_Capability_r4_ext();
	mComponents[1] = new Tdd_CapabilityExt();
	mComponents[2] = AccessStratumReleaseIndicator.rel_4;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PDCP_Capability_r4_ext();
	    case 1:
		return new Tdd_CapabilityExt();
	    case 2:
		return AccessStratumReleaseIndicator.rel_4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdcp_Capability_r4_ext"
    public PDCP_Capability_r4_ext getPdcp_Capability_r4_ext()
    {
	return (PDCP_Capability_r4_ext)mComponents[0];
    }
    
    public void setPdcp_Capability_r4_ext(PDCP_Capability_r4_ext pdcp_Capability_r4_ext)
    {
	mComponents[0] = pdcp_Capability_r4_ext;
    }
    
    
    // Methods for field "tdd_CapabilityExt"
    public Tdd_CapabilityExt getTdd_CapabilityExt()
    {
	return (Tdd_CapabilityExt)mComponents[1];
    }
    
    public void setTdd_CapabilityExt(Tdd_CapabilityExt tdd_CapabilityExt)
    {
	mComponents[1] = tdd_CapabilityExt;
    }
    
    public boolean hasTdd_CapabilityExt()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd_CapabilityExt()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd_CapabilityExt from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd_CapabilityExt extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd_CapabilityExt()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd_CapabilityExt(RF_Capability_r4_ext rf_Capability, 
			PhysicalChannelCapability_LCR_r4 physicalChannelCapability_LCR, 
			MeasurementCapability_r4_ext measurementCapability_r4_ext)
	{
	    setRf_Capability(rf_Capability);
	    setPhysicalChannelCapability_LCR(physicalChannelCapability_LCR);
	    setMeasurementCapability_r4_ext(measurementCapability_r4_ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new RF_Capability_r4_ext();
	    mComponents[1] = new PhysicalChannelCapability_LCR_r4();
	    mComponents[2] = new MeasurementCapability_r4_ext();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[3];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new RF_Capability_r4_ext();
		case 1:
		    return new PhysicalChannelCapability_LCR_r4();
		case 2:
		    return new MeasurementCapability_r4_ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "rf_Capability"
	public RF_Capability_r4_ext getRf_Capability()
	{
	    return (RF_Capability_r4_ext)mComponents[0];
	}
	
	public void setRf_Capability(RF_Capability_r4_ext rf_Capability)
	{
	    mComponents[0] = rf_Capability;
	}
	
	
	// Methods for field "physicalChannelCapability_LCR"
	public PhysicalChannelCapability_LCR_r4 getPhysicalChannelCapability_LCR()
	{
	    return (PhysicalChannelCapability_LCR_r4)mComponents[1];
	}
	
	public void setPhysicalChannelCapability_LCR(PhysicalChannelCapability_LCR_r4 physicalChannelCapability_LCR)
	{
	    mComponents[1] = physicalChannelCapability_LCR;
	}
	
	
	// Methods for field "measurementCapability_r4_ext"
	public MeasurementCapability_r4_ext getMeasurementCapability_r4_ext()
	{
	    return (MeasurementCapability_r4_ext)mComponents[2];
	}
	
	public void setMeasurementCapability_r4_ext(MeasurementCapability_r4_ext measurementCapability_r4_ext)
	{
	    mComponents[2] = measurementCapability_r4_ext;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v4b0ext$Tdd_CapabilityExt"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "RF_Capability_r4_ext"
				),
				new QName (
				    "InformationElements",
				    "RF-Capability-r4-ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"RF_Capability_r4_ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"RF_Capability_r4_ext"
				    )
				),
				0
			    )
			),
			"rf-Capability",
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
				    "PhysicalChannelCapability_LCR_r4"
				),
				new QName (
				    "InformationElements",
				    "PhysicalChannelCapability-LCR-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PhysicalChannelCapability_LCR_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PhysicalChannelCapability_LCR_r4"
				    )
				),
				0
			    )
			),
			"physicalChannelCapability-LCR",
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
				    "MeasurementCapability_r4_ext"
				),
				new QName (
				    "InformationElements",
				    "MeasurementCapability-r4-ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MeasurementCapability_r4_ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MeasurementCapability_r4_ext"
				    )
				),
				0
			    )
			),
			"measurementCapability-r4-ext",
			2,
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
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tdd_CapabilityExt object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd_CapabilityExt object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd_CapabilityExt

    // Methods for field "accessStratumReleaseIndicator"
    public AccessStratumReleaseIndicator getAccessStratumReleaseIndicator()
    {
	return (AccessStratumReleaseIndicator)mComponents[2];
    }
    
    public void setAccessStratumReleaseIndicator(AccessStratumReleaseIndicator accessStratumReleaseIndicator)
    {
	mComponents[2] = accessStratumReleaseIndicator;
    }
    
    public boolean hasAccessStratumReleaseIndicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAccessStratumReleaseIndicator()
    {
	setComponentAbsent(2);
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
	    "UE_RadioAccessCapability_v4b0ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v4b0ext"
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
				"PDCP_Capability_r4_ext"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Capability-r4-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_r4_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_r4_ext"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability-r4-ext",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v4b0ext$Tdd_CapabilityExt"
			)
		    ),
		    "tdd-CapabilityExt",
		    1,
		    3,
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
			    AccessStratumReleaseIndicator.rel_4
			)
		    ),
		    "accessStratumReleaseIndicator",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v4b0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v4b0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v4b0ext
