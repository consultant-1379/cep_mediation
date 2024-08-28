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
 * Define the ASN1 Type UE_RadioAccessCapability_v920ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v920ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v920ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v920ext_IEs(UE_RadioAccessCapabBandCombList ue_RadioAccessCapabBandCombList, 
		    PhysicalChannelCapability_v920ext physicalChannelCapability, 
		    RLC_Capability_v920ext rlc_Capability, 
		    SupportOfenhancedTS0 supportOfenhancedTS0, 
		    MeasurementCapability_v920ext measurementCapability, 
		    CSG_ProximityIndicationCapability csgProximityIndicationCapability, 
		    NeighCellSI_AcquisitionCapability neighCellSI_AcquisitionCapability)
    {
	setUe_RadioAccessCapabBandCombList(ue_RadioAccessCapabBandCombList);
	setPhysicalChannelCapability(physicalChannelCapability);
	setRlc_Capability(rlc_Capability);
	setSupportOfenhancedTS0(supportOfenhancedTS0);
	setMeasurementCapability(measurementCapability);
	setCsgProximityIndicationCapability(csgProximityIndicationCapability);
	setNeighCellSI_AcquisitionCapability(neighCellSI_AcquisitionCapability);
    }
    
    /**
     * Construct with required components.
     */
    public UE_RadioAccessCapability_v920ext_IEs(PhysicalChannelCapability_v920ext physicalChannelCapability, 
		    RLC_Capability_v920ext rlc_Capability)
    {
	setPhysicalChannelCapability(physicalChannelCapability);
	setRlc_Capability(rlc_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_RadioAccessCapabBandCombList();
	mComponents[1] = new PhysicalChannelCapability_v920ext();
	mComponents[2] = new RLC_Capability_v920ext();
	mComponents[3] = SupportOfenhancedTS0._true;
	mComponents[4] = new MeasurementCapability_v920ext();
	mComponents[5] = new CSG_ProximityIndicationCapability();
	mComponents[6] = new NeighCellSI_AcquisitionCapability();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UE_RadioAccessCapabBandCombList();
	    case 1:
		return new PhysicalChannelCapability_v920ext();
	    case 2:
		return new RLC_Capability_v920ext();
	    case 3:
		return SupportOfenhancedTS0._true;
	    case 4:
		return new MeasurementCapability_v920ext();
	    case 5:
		return new CSG_ProximityIndicationCapability();
	    case 6:
		return new NeighCellSI_AcquisitionCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_RadioAccessCapabBandCombList"
    public UE_RadioAccessCapabBandCombList getUe_RadioAccessCapabBandCombList()
    {
	return (UE_RadioAccessCapabBandCombList)mComponents[0];
    }
    
    public void setUe_RadioAccessCapabBandCombList(UE_RadioAccessCapabBandCombList ue_RadioAccessCapabBandCombList)
    {
	mComponents[0] = ue_RadioAccessCapabBandCombList;
    }
    
    public boolean hasUe_RadioAccessCapabBandCombList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_RadioAccessCapabBandCombList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "physicalChannelCapability"
    public PhysicalChannelCapability_v920ext getPhysicalChannelCapability()
    {
	return (PhysicalChannelCapability_v920ext)mComponents[1];
    }
    
    public void setPhysicalChannelCapability(PhysicalChannelCapability_v920ext physicalChannelCapability)
    {
	mComponents[1] = physicalChannelCapability;
    }
    
    
    // Methods for field "rlc_Capability"
    public RLC_Capability_v920ext getRlc_Capability()
    {
	return (RLC_Capability_v920ext)mComponents[2];
    }
    
    public void setRlc_Capability(RLC_Capability_v920ext rlc_Capability)
    {
	mComponents[2] = rlc_Capability;
    }
    
    
    // Methods for field "supportOfenhancedTS0"
    public SupportOfenhancedTS0 getSupportOfenhancedTS0()
    {
	return (SupportOfenhancedTS0)mComponents[3];
    }
    
    public void setSupportOfenhancedTS0(SupportOfenhancedTS0 supportOfenhancedTS0)
    {
	mComponents[3] = supportOfenhancedTS0;
    }
    
    public boolean hasSupportOfenhancedTS0()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSupportOfenhancedTS0()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfenhancedTS0 from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfenhancedTS0 extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfenhancedTS0()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfenhancedTS0(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfenhancedTS0 _true =
	    new SupportOfenhancedTS0(0);
	private final static SupportOfenhancedTS0 cNamedNumbers[] = {
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
	
	public static SupportOfenhancedTS0 valueOf(long value)
	{
	    return (SupportOfenhancedTS0)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v920ext_IEs$SupportOfenhancedTS0"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfenhancedTS0 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfenhancedTS0 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfenhancedTS0

    // Methods for field "measurementCapability"
    public MeasurementCapability_v920ext getMeasurementCapability()
    {
	return (MeasurementCapability_v920ext)mComponents[4];
    }
    
    public void setMeasurementCapability(MeasurementCapability_v920ext measurementCapability)
    {
	mComponents[4] = measurementCapability;
    }
    
    public boolean hasMeasurementCapability()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMeasurementCapability()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "csgProximityIndicationCapability"
    public CSG_ProximityIndicationCapability getCsgProximityIndicationCapability()
    {
	return (CSG_ProximityIndicationCapability)mComponents[5];
    }
    
    public void setCsgProximityIndicationCapability(CSG_ProximityIndicationCapability csgProximityIndicationCapability)
    {
	mComponents[5] = csgProximityIndicationCapability;
    }
    
    public boolean hasCsgProximityIndicationCapability()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCsgProximityIndicationCapability()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "neighCellSI_AcquisitionCapability"
    public NeighCellSI_AcquisitionCapability getNeighCellSI_AcquisitionCapability()
    {
	return (NeighCellSI_AcquisitionCapability)mComponents[6];
    }
    
    public void setNeighCellSI_AcquisitionCapability(NeighCellSI_AcquisitionCapability neighCellSI_AcquisitionCapability)
    {
	mComponents[6] = neighCellSI_AcquisitionCapability;
    }
    
    public boolean hasNeighCellSI_AcquisitionCapability()
    {
	return componentIsPresent(6);
    }
    
    public void deleteNeighCellSI_AcquisitionCapability()
    {
	setComponentAbsent(6);
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
	    "UE_RadioAccessCapability_v920ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v920ext-IEs"
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
				"UE_RadioAccessCapabBandCombList"
			    ),
			    new QName (
				"InformationElements",
				"UE-RadioAccessCapabBandCombList"
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
				    "BandComb"
				)
			    )
			)
		    ),
		    "ue-RadioAccessCapabBandCombList",
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
				"PhysicalChannelCapability_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"PhysicalChannelCapability-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PhysicalChannelCapability_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "physicalChannelCapability",
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
				"RLC_Capability_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Capability-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Capability_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Capability",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v920ext_IEs$SupportOfenhancedTS0"
			)
		    ),
		    "supportOfenhancedTS0",
		    3,
		    3,
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
				"MeasurementCapability_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementCapability-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementCapability_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "measurementCapability",
		    4,
		    3,
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
				"CSG_ProximityIndicationCapability"
			    ),
			    new QName (
				"InformationElements",
				"CSG-ProximityIndicationCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CSG_ProximityIndicationCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CSG_ProximityIndicationCapability"
				)
			    ),
			    0
			)
		    ),
		    "csgProximityIndicationCapability",
		    5,
		    3,
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
				"NeighCellSI_AcquisitionCapability"
			    ),
			    new QName (
				"InformationElements",
				"NeighCellSI-AcquisitionCapability"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "NeighCellSI_AcquisitionCapability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "NeighCellSI_AcquisitionCapability"
				)
			    ),
			    0
			)
		    ),
		    "neighCellSI-AcquisitionCapability",
		    6,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v920ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v920ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v920ext_IEs
