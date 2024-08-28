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
 * Define the ASN1 Type HS_DSCH_CommonSystemInformation_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_DSCH_CommonSystemInformation_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_DSCH_CommonSystemInformation_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_DSCH_CommonSystemInformation_TDD128(CommonRBMappingInfo ccch_MappingInfo, 
		    CommonRBMappingInfo srb1_MappingInfo, 
		    Common_MAC_ehs_ReorderingQueueList common_MAC_ehs_ReorderingQueueList, 
		    HS_SCCH_SystemInfo_TDD128 hs_scch_SystemInfo_tdd128, 
		    HARQ_Info harq_SystemInfo, 
		    HS_PDSCH_Midamble_Configuration_TDD128 hs_pdsch_MidambleConfiguration, 
		    Common_H_RNTI_information common_H_RNTI_information, 
		    H_RNTI bcchSpecific_H_RNTI)
    {
	setCcch_MappingInfo(ccch_MappingInfo);
	setSrb1_MappingInfo(srb1_MappingInfo);
	setCommon_MAC_ehs_ReorderingQueueList(common_MAC_ehs_ReorderingQueueList);
	setHs_scch_SystemInfo_tdd128(hs_scch_SystemInfo_tdd128);
	setHarq_SystemInfo(harq_SystemInfo);
	setHs_pdsch_MidambleConfiguration(hs_pdsch_MidambleConfiguration);
	setCommon_H_RNTI_information(common_H_RNTI_information);
	setBcchSpecific_H_RNTI(bcchSpecific_H_RNTI);
    }
    
    /**
     * Construct with required components.
     */
    public HS_DSCH_CommonSystemInformation_TDD128(CommonRBMappingInfo ccch_MappingInfo, 
		    Common_MAC_ehs_ReorderingQueueList common_MAC_ehs_ReorderingQueueList, 
		    HS_SCCH_SystemInfo_TDD128 hs_scch_SystemInfo_tdd128, 
		    HARQ_Info harq_SystemInfo, 
		    HS_PDSCH_Midamble_Configuration_TDD128 hs_pdsch_MidambleConfiguration, 
		    Common_H_RNTI_information common_H_RNTI_information, 
		    H_RNTI bcchSpecific_H_RNTI)
    {
	setCcch_MappingInfo(ccch_MappingInfo);
	setCommon_MAC_ehs_ReorderingQueueList(common_MAC_ehs_ReorderingQueueList);
	setHs_scch_SystemInfo_tdd128(hs_scch_SystemInfo_tdd128);
	setHarq_SystemInfo(harq_SystemInfo);
	setHs_pdsch_MidambleConfiguration(hs_pdsch_MidambleConfiguration);
	setCommon_H_RNTI_information(common_H_RNTI_information);
	setBcchSpecific_H_RNTI(bcchSpecific_H_RNTI);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CommonRBMappingInfo();
	mComponents[1] = new CommonRBMappingInfo();
	mComponents[2] = new Common_MAC_ehs_ReorderingQueueList();
	mComponents[3] = new HS_SCCH_SystemInfo_TDD128();
	mComponents[4] = new HARQ_Info();
	mComponents[5] = new HS_PDSCH_Midamble_Configuration_TDD128();
	mComponents[6] = new Common_H_RNTI_information();
	mComponents[7] = new H_RNTI();
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
		return new CommonRBMappingInfo();
	    case 1:
		return new CommonRBMappingInfo();
	    case 2:
		return new Common_MAC_ehs_ReorderingQueueList();
	    case 3:
		return new HS_SCCH_SystemInfo_TDD128();
	    case 4:
		return new HARQ_Info();
	    case 5:
		return new HS_PDSCH_Midamble_Configuration_TDD128();
	    case 6:
		return new Common_H_RNTI_information();
	    case 7:
		return new H_RNTI();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ccch_MappingInfo"
    public CommonRBMappingInfo getCcch_MappingInfo()
    {
	return (CommonRBMappingInfo)mComponents[0];
    }
    
    public void setCcch_MappingInfo(CommonRBMappingInfo ccch_MappingInfo)
    {
	mComponents[0] = ccch_MappingInfo;
    }
    
    
    // Methods for field "srb1_MappingInfo"
    public CommonRBMappingInfo getSrb1_MappingInfo()
    {
	return (CommonRBMappingInfo)mComponents[1];
    }
    
    public void setSrb1_MappingInfo(CommonRBMappingInfo srb1_MappingInfo)
    {
	mComponents[1] = srb1_MappingInfo;
    }
    
    public boolean hasSrb1_MappingInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSrb1_MappingInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "common_MAC_ehs_ReorderingQueueList"
    public Common_MAC_ehs_ReorderingQueueList getCommon_MAC_ehs_ReorderingQueueList()
    {
	return (Common_MAC_ehs_ReorderingQueueList)mComponents[2];
    }
    
    public void setCommon_MAC_ehs_ReorderingQueueList(Common_MAC_ehs_ReorderingQueueList common_MAC_ehs_ReorderingQueueList)
    {
	mComponents[2] = common_MAC_ehs_ReorderingQueueList;
    }
    
    
    // Methods for field "hs_scch_SystemInfo_tdd128"
    public HS_SCCH_SystemInfo_TDD128 getHs_scch_SystemInfo_tdd128()
    {
	return (HS_SCCH_SystemInfo_TDD128)mComponents[3];
    }
    
    public void setHs_scch_SystemInfo_tdd128(HS_SCCH_SystemInfo_TDD128 hs_scch_SystemInfo_tdd128)
    {
	mComponents[3] = hs_scch_SystemInfo_tdd128;
    }
    
    
    // Methods for field "harq_SystemInfo"
    public HARQ_Info getHarq_SystemInfo()
    {
	return (HARQ_Info)mComponents[4];
    }
    
    public void setHarq_SystemInfo(HARQ_Info harq_SystemInfo)
    {
	mComponents[4] = harq_SystemInfo;
    }
    
    
    // Methods for field "hs_pdsch_MidambleConfiguration"
    public HS_PDSCH_Midamble_Configuration_TDD128 getHs_pdsch_MidambleConfiguration()
    {
	return (HS_PDSCH_Midamble_Configuration_TDD128)mComponents[5];
    }
    
    public void setHs_pdsch_MidambleConfiguration(HS_PDSCH_Midamble_Configuration_TDD128 hs_pdsch_MidambleConfiguration)
    {
	mComponents[5] = hs_pdsch_MidambleConfiguration;
    }
    
    
    // Methods for field "common_H_RNTI_information"
    public Common_H_RNTI_information getCommon_H_RNTI_information()
    {
	return (Common_H_RNTI_information)mComponents[6];
    }
    
    public void setCommon_H_RNTI_information(Common_H_RNTI_information common_H_RNTI_information)
    {
	mComponents[6] = common_H_RNTI_information;
    }
    
    
    
    /**
     * Define the ASN1 Type Common_H_RNTI_information from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Common_H_RNTI_information extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Common_H_RNTI_information()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Common_H_RNTI_information(H_RNTI[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(H_RNTI element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(H_RNTI element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized H_RNTI get(int atIndex)
	{
	    return (H_RNTI)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(H_RNTI element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(H_RNTI element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new H_RNTI();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_DSCH_CommonSystemInformation_TDD128$Common_H_RNTI_information"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
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
		    "H_RNTI"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Common_H_RNTI_information object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Common_H_RNTI_information object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Common_H_RNTI_information

    // Methods for field "bcchSpecific_H_RNTI"
    public H_RNTI getBcchSpecific_H_RNTI()
    {
	return (H_RNTI)mComponents[7];
    }
    
    public void setBcchSpecific_H_RNTI(H_RNTI bcchSpecific_H_RNTI)
    {
	mComponents[7] = bcchSpecific_H_RNTI;
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
	    "HS_DSCH_CommonSystemInformation_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-CommonSystemInformation-TDD128"
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
				"CommonRBMappingInfo"
			    ),
			    new QName (
				"InformationElements",
				"CommonRBMappingInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonRBMappingInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonRBMappingInfo"
				)
			    ),
			    0
			)
		    ),
		    "ccch-MappingInfo",
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
				"CommonRBMappingInfo"
			    ),
			    new QName (
				"InformationElements",
				"CommonRBMappingInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonRBMappingInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonRBMappingInfo"
				)
			    ),
			    0
			)
		    ),
		    "srb1-MappingInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Common_MAC_ehs_ReorderingQueueList"
			    ),
			    new QName (
				"InformationElements",
				"Common-MAC-ehs-ReorderingQueueList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(2),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(2)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Common_MAC_ehs_ReorderingQueue"
				)
			    )
			)
		    ),
		    "common-MAC-ehs-ReorderingQueueList",
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
				"HS_SCCH_SystemInfo_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-SystemInfo-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_SystemInfo_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_SystemInfo_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-SystemInfo-tdd128",
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
				"HARQ_Info"
			    ),
			    new QName (
				"InformationElements",
				"HARQ-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info"
				)
			    ),
			    0
			)
		    ),
		    "harq-SystemInfo",
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
				"HS_PDSCH_Midamble_Configuration_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-PDSCH-Midamble-Configuration-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_PDSCH_Midamble_Configuration_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_PDSCH_Midamble_Configuration_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "hs-pdsch-MidambleConfiguration",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_CommonSystemInformation_TDD128$Common_H_RNTI_information"
			)
		    ),
		    "common-H-RNTI-information",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"H_RNTI"
			    ),
			    new QName (
				"InformationElements",
				"H-RNTI"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "bcchSpecific-H-RNTI",
		    7,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_CommonSystemInformation_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_CommonSystemInformation_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_CommonSystemInformation_TDD128
