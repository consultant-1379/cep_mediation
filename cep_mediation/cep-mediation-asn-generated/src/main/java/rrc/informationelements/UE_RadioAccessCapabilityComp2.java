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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp2(FddPhysicalChannelCapab_hspdsch_edch fddPhysicalChannelCapab_hspdsch_edch)
    {
	setFddPhysicalChannelCapab_hspdsch_edch(fddPhysicalChannelCapab_hspdsch_edch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddPhysicalChannelCapab_hspdsch_edch();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new FddPhysicalChannelCapab_hspdsch_edch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fddPhysicalChannelCapab_hspdsch_edch"
    public FddPhysicalChannelCapab_hspdsch_edch getFddPhysicalChannelCapab_hspdsch_edch()
    {
	return (FddPhysicalChannelCapab_hspdsch_edch)mComponents[0];
    }
    
    public void setFddPhysicalChannelCapab_hspdsch_edch(FddPhysicalChannelCapab_hspdsch_edch fddPhysicalChannelCapab_hspdsch_edch)
    {
	mComponents[0] = fddPhysicalChannelCapab_hspdsch_edch;
    }
    
    public boolean hasFddPhysicalChannelCapab_hspdsch_edch()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFddPhysicalChannelCapab_hspdsch_edch()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type FddPhysicalChannelCapab_hspdsch_edch from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FddPhysicalChannelCapab_hspdsch_edch extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FddPhysicalChannelCapab_hspdsch_edch()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FddPhysicalChannelCapab_hspdsch_edch(DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig, 
			HSDSCH_physical_layer_category physicalChannelCapabComp_hspdsch_r6, 
			PhysicalChannelCapability_edch_r6 physicalChannelCapability_edch_r6)
	{
	    setDl_CapabilityWithSimultaneousHS_DSCHConfig(dl_CapabilityWithSimultaneousHS_DSCHConfig);
	    setPhysicalChannelCapabComp_hspdsch_r6(physicalChannelCapabComp_hspdsch_r6);
	    setPhysicalChannelCapability_edch_r6(physicalChannelCapability_edch_r6);
	}
	
	/**
	 * Construct with required components.
	 */
	public FddPhysicalChannelCapab_hspdsch_edch(HSDSCH_physical_layer_category physicalChannelCapabComp_hspdsch_r6, 
			PhysicalChannelCapability_edch_r6 physicalChannelCapability_edch_r6)
	{
	    setPhysicalChannelCapabComp_hspdsch_r6(physicalChannelCapabComp_hspdsch_r6);
	    setPhysicalChannelCapability_edch_r6(physicalChannelCapability_edch_r6);
	}
	
	public void initComponents()
	{
	    mComponents[0] = DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	    mComponents[1] = new HSDSCH_physical_layer_category();
	    mComponents[2] = new PhysicalChannelCapability_edch_r6();
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
		    return DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
		case 1:
		    return new HSDSCH_physical_layer_category();
		case 2:
		    return new PhysicalChannelCapability_edch_r6();
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
	
	
	// Methods for field "physicalChannelCapabComp_hspdsch_r6"
	public HSDSCH_physical_layer_category getPhysicalChannelCapabComp_hspdsch_r6()
	{
	    return (HSDSCH_physical_layer_category)mComponents[1];
	}
	
	public void setPhysicalChannelCapabComp_hspdsch_r6(HSDSCH_physical_layer_category physicalChannelCapabComp_hspdsch_r6)
	{
	    mComponents[1] = physicalChannelCapabComp_hspdsch_r6;
	}
	
	
	// Methods for field "physicalChannelCapability_edch_r6"
	public PhysicalChannelCapability_edch_r6 getPhysicalChannelCapability_edch_r6()
	{
	    return (PhysicalChannelCapability_edch_r6)mComponents[2];
	}
	
	public void setPhysicalChannelCapability_edch_r6(PhysicalChannelCapability_edch_r6 physicalChannelCapability_edch_r6)
	{
	    mComponents[2] = physicalChannelCapability_edch_r6;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2$FddPhysicalChannelCapab_hspdsch_edch"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "HSDSCH_physical_layer_category"
				),
				new QName (
				    "InformationElements",
				    "HSDSCH-physical-layer-category"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new HSDSCH_physical_layer_category(1), 
					new HSDSCH_physical_layer_category(64),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(64)
				),
				null
			    )
			),
			"physicalChannelCapabComp-hspdsch-r6",
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
				    "PhysicalChannelCapability_edch_r6"
				),
				new QName (
				    "InformationElements",
				    "PhysicalChannelCapability-edch-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PhysicalChannelCapability_edch_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PhysicalChannelCapability_edch_r6"
				    )
				),
				0
			    )
			),
			"physicalChannelCapability-edch-r6",
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' FddPhysicalChannelCapab_hspdsch_edch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FddPhysicalChannelCapab_hspdsch_edch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FddPhysicalChannelCapab_hspdsch_edch

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
	    "UE_RadioAccessCapabilityComp2"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp2"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2$FddPhysicalChannelCapab_hspdsch_edch"
			)
		    ),
		    "fddPhysicalChannelCapab-hspdsch-edch",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp2
