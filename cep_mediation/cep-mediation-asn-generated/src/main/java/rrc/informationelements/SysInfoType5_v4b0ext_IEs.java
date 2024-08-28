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
 * Define the ASN1 Type SysInfoType5_v4b0ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v4b0ext_IEs(PNBSCH_Allocation_r4 pNBSCH_Allocation_r4, 
		    OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD, 
		    PRACH_SystemInformationList_LCR_r4 prach_SystemInformationList_LCR_r4, 
		    Tdd128SpecificInfo tdd128SpecificInfo, 
		    RadioFrequencyBandFDD frequencyBandIndicator)
    {
	setPNBSCH_Allocation_r4(pNBSCH_Allocation_r4);
	setOpenLoopPowerControl_IPDL_TDD(openLoopPowerControl_IPDL_TDD);
	setPrach_SystemInformationList_LCR_r4(prach_SystemInformationList_LCR_r4);
	setTdd128SpecificInfo(tdd128SpecificInfo);
	setFrequencyBandIndicator(frequencyBandIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PNBSCH_Allocation_r4();
	mComponents[1] = new OpenLoopPowerControl_IPDL_TDD_r4();
	mComponents[2] = new PRACH_SystemInformationList_LCR_r4();
	mComponents[3] = new Tdd128SpecificInfo();
	mComponents[4] = RadioFrequencyBandFDD.fdd2100;
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
		return new PNBSCH_Allocation_r4();
	    case 1:
		return new OpenLoopPowerControl_IPDL_TDD_r4();
	    case 2:
		return new PRACH_SystemInformationList_LCR_r4();
	    case 3:
		return new Tdd128SpecificInfo();
	    case 4:
		return RadioFrequencyBandFDD.fdd2100;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pNBSCH_Allocation_r4"
    public PNBSCH_Allocation_r4 getPNBSCH_Allocation_r4()
    {
	return (PNBSCH_Allocation_r4)mComponents[0];
    }
    
    public void setPNBSCH_Allocation_r4(PNBSCH_Allocation_r4 pNBSCH_Allocation_r4)
    {
	mComponents[0] = pNBSCH_Allocation_r4;
    }
    
    public boolean hasPNBSCH_Allocation_r4()
    {
	return componentIsPresent(0);
    }
    
    public void deletePNBSCH_Allocation_r4()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "openLoopPowerControl_IPDL_TDD"
    public OpenLoopPowerControl_IPDL_TDD_r4 getOpenLoopPowerControl_IPDL_TDD()
    {
	return (OpenLoopPowerControl_IPDL_TDD_r4)mComponents[1];
    }
    
    public void setOpenLoopPowerControl_IPDL_TDD(OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD)
    {
	mComponents[1] = openLoopPowerControl_IPDL_TDD;
    }
    
    public boolean hasOpenLoopPowerControl_IPDL_TDD()
    {
	return componentIsPresent(1);
    }
    
    public void deleteOpenLoopPowerControl_IPDL_TDD()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "prach_SystemInformationList_LCR_r4"
    public PRACH_SystemInformationList_LCR_r4 getPrach_SystemInformationList_LCR_r4()
    {
	return (PRACH_SystemInformationList_LCR_r4)mComponents[2];
    }
    
    public void setPrach_SystemInformationList_LCR_r4(PRACH_SystemInformationList_LCR_r4 prach_SystemInformationList_LCR_r4)
    {
	mComponents[2] = prach_SystemInformationList_LCR_r4;
    }
    
    public boolean hasPrach_SystemInformationList_LCR_r4()
    {
	return componentIsPresent(2);
    }
    
    public void deletePrach_SystemInformationList_LCR_r4()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "tdd128SpecificInfo"
    public Tdd128SpecificInfo getTdd128SpecificInfo()
    {
	return (Tdd128SpecificInfo)mComponents[3];
    }
    
    public void setTdd128SpecificInfo(Tdd128SpecificInfo tdd128SpecificInfo)
    {
	mComponents[3] = tdd128SpecificInfo;
    }
    
    public boolean hasTdd128SpecificInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTdd128SpecificInfo()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128SpecificInfo from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd128SpecificInfo extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd128SpecificInfo()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd128SpecificInfo(PUSCH_SysInfoList_SFN_LCR_r4 pusch_SysInfoList_SFN, 
			PDSCH_SysInfoList_SFN_LCR_r4 pdsch_SysInfoList_SFN, 
			PrimaryCCPCH_Info_LCR_r4_ext pCCPCH_LCR_Extensions, 
			SCCPCH_SystemInformationList_LCR_r4_ext sCCPCH_LCR_ExtensionsList)
	{
	    setPusch_SysInfoList_SFN(pusch_SysInfoList_SFN);
	    setPdsch_SysInfoList_SFN(pdsch_SysInfoList_SFN);
	    setPCCPCH_LCR_Extensions(pCCPCH_LCR_Extensions);
	    setSCCPCH_LCR_ExtensionsList(sCCPCH_LCR_ExtensionsList);
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd128SpecificInfo(SCCPCH_SystemInformationList_LCR_r4_ext sCCPCH_LCR_ExtensionsList)
	{
	    setSCCPCH_LCR_ExtensionsList(sCCPCH_LCR_ExtensionsList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PUSCH_SysInfoList_SFN_LCR_r4();
	    mComponents[1] = new PDSCH_SysInfoList_SFN_LCR_r4();
	    mComponents[2] = new PrimaryCCPCH_Info_LCR_r4_ext();
	    mComponents[3] = new SCCPCH_SystemInformationList_LCR_r4_ext();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[4];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new PUSCH_SysInfoList_SFN_LCR_r4();
		case 1:
		    return new PDSCH_SysInfoList_SFN_LCR_r4();
		case 2:
		    return new PrimaryCCPCH_Info_LCR_r4_ext();
		case 3:
		    return new SCCPCH_SystemInformationList_LCR_r4_ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pusch_SysInfoList_SFN"
	public PUSCH_SysInfoList_SFN_LCR_r4 getPusch_SysInfoList_SFN()
	{
	    return (PUSCH_SysInfoList_SFN_LCR_r4)mComponents[0];
	}
	
	public void setPusch_SysInfoList_SFN(PUSCH_SysInfoList_SFN_LCR_r4 pusch_SysInfoList_SFN)
	{
	    mComponents[0] = pusch_SysInfoList_SFN;
	}
	
	public boolean hasPusch_SysInfoList_SFN()
	{
	    return componentIsPresent(0);
	}
	
	public void deletePusch_SysInfoList_SFN()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "pdsch_SysInfoList_SFN"
	public PDSCH_SysInfoList_SFN_LCR_r4 getPdsch_SysInfoList_SFN()
	{
	    return (PDSCH_SysInfoList_SFN_LCR_r4)mComponents[1];
	}
	
	public void setPdsch_SysInfoList_SFN(PDSCH_SysInfoList_SFN_LCR_r4 pdsch_SysInfoList_SFN)
	{
	    mComponents[1] = pdsch_SysInfoList_SFN;
	}
	
	public boolean hasPdsch_SysInfoList_SFN()
	{
	    return componentIsPresent(1);
	}
	
	public void deletePdsch_SysInfoList_SFN()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "pCCPCH_LCR_Extensions"
	public PrimaryCCPCH_Info_LCR_r4_ext getPCCPCH_LCR_Extensions()
	{
	    return (PrimaryCCPCH_Info_LCR_r4_ext)mComponents[2];
	}
	
	public void setPCCPCH_LCR_Extensions(PrimaryCCPCH_Info_LCR_r4_ext pCCPCH_LCR_Extensions)
	{
	    mComponents[2] = pCCPCH_LCR_Extensions;
	}
	
	public boolean hasPCCPCH_LCR_Extensions()
	{
	    return componentIsPresent(2);
	}
	
	public void deletePCCPCH_LCR_Extensions()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "sCCPCH_LCR_ExtensionsList"
	public SCCPCH_SystemInformationList_LCR_r4_ext getSCCPCH_LCR_ExtensionsList()
	{
	    return (SCCPCH_SystemInformationList_LCR_r4_ext)mComponents[3];
	}
	
	public void setSCCPCH_LCR_ExtensionsList(SCCPCH_SystemInformationList_LCR_r4_ext sCCPCH_LCR_ExtensionsList)
	{
	    mComponents[3] = sCCPCH_LCR_ExtensionsList;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType5_v4b0ext_IEs$Tdd128SpecificInfo"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PUSCH_SysInfoList_SFN_LCR_r4"
				),
				new QName (
				    "InformationElements",
				    "PUSCH-SysInfoList-SFN-LCR-r4"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"PUSCH_SysInfoList_SFN_LCR_r4$Sequence_"
				    )
				)
			    )
			),
			"pusch-SysInfoList-SFN",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PDSCH_SysInfoList_SFN_LCR_r4"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-SysInfoList-SFN-LCR-r4"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"PDSCH_SysInfoList_SFN_LCR_r4$Sequence_"
				    )
				)
			    )
			),
			"pdsch-SysInfoList-SFN",
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
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info_LCR_r4_ext"
				),
				new QName (
				    "InformationElements",
				    "PrimaryCCPCH-Info-LCR-r4-ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_Info_LCR_r4_ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"PrimaryCCPCH_Info_LCR_r4_ext"
				    )
				),
				0
			    )
			),
			"pCCPCH-LCR-Extensions",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "SCCPCH_SystemInformationList_LCR_r4_ext"
				),
				new QName (
				    "InformationElements",
				    "SCCPCH-SystemInformationList-LCR-r4-ext"
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
					"SCCPCH_SystemInformation_LCR_r4_ext"
				    )
				)
			    )
			),
			"sCCPCH-LCR-ExtensionsList",
			3,
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
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128SpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128SpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128SpecificInfo

    // Methods for field "frequencyBandIndicator"
    public RadioFrequencyBandFDD getFrequencyBandIndicator()
    {
	return (RadioFrequencyBandFDD)mComponents[4];
    }
    
    public void setFrequencyBandIndicator(RadioFrequencyBandFDD frequencyBandIndicator)
    {
	mComponents[4] = frequencyBandIndicator;
    }
    
    public boolean hasFrequencyBandIndicator()
    {
	return componentIsPresent(4);
    }
    
    public void deleteFrequencyBandIndicator()
    {
	setComponentAbsent(4);
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
	    "SysInfoType5_v4b0ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v4b0ext-IEs"
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
				"PNBSCH_Allocation_r4"
			    ),
			    new QName (
				"InformationElements",
				"PNBSCH-Allocation-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PNBSCH_Allocation_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PNBSCH_Allocation_r4"
				)
			    ),
			    0
			)
		    ),
		    "pNBSCH-Allocation-r4",
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
				"OpenLoopPowerControl_IPDL_TDD_r4"
			    ),
			    new QName (
				"InformationElements",
				"OpenLoopPowerControl-IPDL-TDD-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "OpenLoopPowerControl_IPDL_TDD_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "OpenLoopPowerControl_IPDL_TDD_r4"
				)
			    ),
			    0
			)
		    ),
		    "openLoopPowerControl-IPDL-TDD",
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
				"PRACH_SystemInformationList_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"PRACH-SystemInformationList-LCR-r4"
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
				    "PRACH_SystemInformation_LCR_r4"
				)
			    )
			)
		    ),
		    "prach-SystemInformationList-LCR-r4",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v4b0ext_IEs$Tdd128SpecificInfo"
			)
		    ),
		    "tdd128SpecificInfo",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RadioFrequencyBandFDD"
			    ),
			    new QName (
				"InformationElements",
				"RadioFrequencyBandFDD"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"fdd2100",
					0
				    ),
				    new MemberListElement (
					"fdd1900",
					1
				    ),
				    new MemberListElement (
					"fdd1800",
					2
				    ),
				    new MemberListElement (
					"bandVI",
					3
				    ),
				    new MemberListElement (
					"bandIV",
					4
				    ),
				    new MemberListElement (
					"bandV",
					5
				    ),
				    new MemberListElement (
					"bandVII",
					6
				    ),
				    new MemberListElement (
					"extension-indicator",
					7
				    )
				}
			    ),
			    0,
			    RadioFrequencyBandFDD.fdd2100
			)
		    ),
		    "frequencyBandIndicator",
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v4b0ext_IEs
