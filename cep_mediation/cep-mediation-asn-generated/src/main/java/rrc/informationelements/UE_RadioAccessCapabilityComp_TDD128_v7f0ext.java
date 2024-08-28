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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp_TDD128_v7f0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp_TDD128_v7f0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp_TDD128_v7f0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp_TDD128_v7f0ext(HSDSCH_physical_layer_category hSDSCH_physical_layer_category, 
		    MultiCarrier_HSDSCH_physical_layer_category multiCarrier_physical_layer_category, 
		    INTEGER tdd_edch_PhysicalLayerCategory, 
		    DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig, 
		    SupportForCSVoiceoverHSPA supportForCSVoiceoverHSPA, 
		    TotalRLC_AM_BufferSize_r5_ext totalRLC_AM_BufferSize)
    {
	setHSDSCH_physical_layer_category(hSDSCH_physical_layer_category);
	setMultiCarrier_physical_layer_category(multiCarrier_physical_layer_category);
	setTdd_edch_PhysicalLayerCategory(tdd_edch_PhysicalLayerCategory);
	setDl_CapabilityWithSimultaneousHS_DSCHConfig(dl_CapabilityWithSimultaneousHS_DSCHConfig);
	setSupportForCSVoiceoverHSPA(supportForCSVoiceoverHSPA);
	setTotalRLC_AM_BufferSize(totalRLC_AM_BufferSize);
    }
    
    /**
     * Construct with components.
     */
    public UE_RadioAccessCapabilityComp_TDD128_v7f0ext(HSDSCH_physical_layer_category hSDSCH_physical_layer_category, 
		    MultiCarrier_HSDSCH_physical_layer_category multiCarrier_physical_layer_category, 
		    long tdd_edch_PhysicalLayerCategory, 
		    DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig, 
		    SupportForCSVoiceoverHSPA supportForCSVoiceoverHSPA, 
		    TotalRLC_AM_BufferSize_r5_ext totalRLC_AM_BufferSize)
    {
	this(hSDSCH_physical_layer_category, 
	     multiCarrier_physical_layer_category, 
	     new INTEGER(tdd_edch_PhysicalLayerCategory), 
	     dl_CapabilityWithSimultaneousHS_DSCHConfig, 
	     supportForCSVoiceoverHSPA, totalRLC_AM_BufferSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category();
	mComponents[1] = new MultiCarrier_HSDSCH_physical_layer_category();
	mComponents[2] = new INTEGER();
	mComponents[3] = DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	mComponents[4] = SupportForCSVoiceoverHSPA._true;
	mComponents[5] = TotalRLC_AM_BufferSize_r5_ext.kb200;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HSDSCH_physical_layer_category();
	    case 1:
		return new MultiCarrier_HSDSCH_physical_layer_category();
	    case 2:
		return new INTEGER();
	    case 3:
		return DL_CapabilityWithSimultaneousHS_DSCHConfig.kbps32;
	    case 4:
		return SupportForCSVoiceoverHSPA._true;
	    case 5:
		return TotalRLC_AM_BufferSize_r5_ext.kb200;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hSDSCH_physical_layer_category"
    public HSDSCH_physical_layer_category getHSDSCH_physical_layer_category()
    {
	return (HSDSCH_physical_layer_category)mComponents[0];
    }
    
    public void setHSDSCH_physical_layer_category(HSDSCH_physical_layer_category hSDSCH_physical_layer_category)
    {
	mComponents[0] = hSDSCH_physical_layer_category;
    }
    
    public boolean hasHSDSCH_physical_layer_category()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHSDSCH_physical_layer_category()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "multiCarrier_physical_layer_category"
    public MultiCarrier_HSDSCH_physical_layer_category getMultiCarrier_physical_layer_category()
    {
	return (MultiCarrier_HSDSCH_physical_layer_category)mComponents[1];
    }
    
    public void setMultiCarrier_physical_layer_category(MultiCarrier_HSDSCH_physical_layer_category multiCarrier_physical_layer_category)
    {
	mComponents[1] = multiCarrier_physical_layer_category;
    }
    
    public boolean hasMultiCarrier_physical_layer_category()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMultiCarrier_physical_layer_category()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tdd_edch_PhysicalLayerCategory"
    public long getTdd_edch_PhysicalLayerCategory()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTdd_edch_PhysicalLayerCategory(long tdd_edch_PhysicalLayerCategory)
    {
	setTdd_edch_PhysicalLayerCategory(new INTEGER(tdd_edch_PhysicalLayerCategory));
    }
    
    public void setTdd_edch_PhysicalLayerCategory(INTEGER tdd_edch_PhysicalLayerCategory)
    {
	mComponents[2] = tdd_edch_PhysicalLayerCategory;
    }
    
    public boolean hasTdd_edch_PhysicalLayerCategory()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd_edch_PhysicalLayerCategory()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dl_CapabilityWithSimultaneousHS_DSCHConfig"
    public DL_CapabilityWithSimultaneousHS_DSCHConfig getDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return (DL_CapabilityWithSimultaneousHS_DSCHConfig)mComponents[3];
    }
    
    public void setDl_CapabilityWithSimultaneousHS_DSCHConfig(DL_CapabilityWithSimultaneousHS_DSCHConfig dl_CapabilityWithSimultaneousHS_DSCHConfig)
    {
	mComponents[3] = dl_CapabilityWithSimultaneousHS_DSCHConfig;
    }
    
    public boolean hasDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDl_CapabilityWithSimultaneousHS_DSCHConfig()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "supportForCSVoiceoverHSPA"
    public SupportForCSVoiceoverHSPA getSupportForCSVoiceoverHSPA()
    {
	return (SupportForCSVoiceoverHSPA)mComponents[4];
    }
    
    public void setSupportForCSVoiceoverHSPA(SupportForCSVoiceoverHSPA supportForCSVoiceoverHSPA)
    {
	mComponents[4] = supportForCSVoiceoverHSPA;
    }
    
    public boolean hasSupportForCSVoiceoverHSPA()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSupportForCSVoiceoverHSPA()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForCSVoiceoverHSPA from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportForCSVoiceoverHSPA extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForCSVoiceoverHSPA()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForCSVoiceoverHSPA(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForCSVoiceoverHSPA _true =
	    new SupportForCSVoiceoverHSPA(0);
	private final static SupportForCSVoiceoverHSPA cNamedNumbers[] = {
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
	
	public static SupportForCSVoiceoverHSPA valueOf(long value)
	{
	    return (SupportForCSVoiceoverHSPA)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp_TDD128_v7f0ext$SupportForCSVoiceoverHSPA"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForCSVoiceoverHSPA object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForCSVoiceoverHSPA object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForCSVoiceoverHSPA

    // Methods for field "totalRLC_AM_BufferSize"
    public TotalRLC_AM_BufferSize_r5_ext getTotalRLC_AM_BufferSize()
    {
	return (TotalRLC_AM_BufferSize_r5_ext)mComponents[5];
    }
    
    public void setTotalRLC_AM_BufferSize(TotalRLC_AM_BufferSize_r5_ext totalRLC_AM_BufferSize)
    {
	mComponents[5] = totalRLC_AM_BufferSize;
    }
    
    public boolean hasTotalRLC_AM_BufferSize()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTotalRLC_AM_BufferSize()
    {
	setComponentAbsent(5);
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
	    "UE_RadioAccessCapabilityComp_TDD128_v7f0ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp-TDD128-v7f0ext"
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
		    "hSDSCH-physical-layer-category",
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
				"MultiCarrier_HSDSCH_physical_layer_category"
			    ),
			    new QName (
				"InformationElements",
				"MultiCarrier-HSDSCH-physical-layer-category"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MultiCarrier_HSDSCH_physical_layer_category(1), 
				    new MultiCarrier_HSDSCH_physical_layer_category(64),
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
		    "multiCarrier-physical-layer-category",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "tdd-edch-PhysicalLayerCategory",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp_TDD128_v7f0ext$SupportForCSVoiceoverHSPA"
			)
		    ),
		    "supportForCSVoiceoverHSPA",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TotalRLC_AM_BufferSize_r5_ext"
			    ),
			    new QName (
				"InformationElements",
				"TotalRLC-AM-BufferSize-r5-ext"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"kb200",
					0
				    ),
				    new MemberListElement (
					"kb300",
					1
				    ),
				    new MemberListElement (
					"kb400",
					2
				    ),
				    new MemberListElement (
					"kb750",
					3
				    )
				}
			    ),
			    0,
			    TotalRLC_AM_BufferSize_r5_ext.kb200
			)
		    ),
		    "totalRLC-AM-BufferSize",
		    5,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp_TDD128_v7f0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp_TDD128_v7f0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp_TDD128_v7f0ext
