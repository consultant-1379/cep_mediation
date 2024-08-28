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
 * Define the ASN1 Type SysInfoType6_v770ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType6_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType6_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType6_v770ext_IEs(Tdd768SpecificInfo tdd768SpecificInfo, 
		    SCCPCH_SystemInformationList_HCR_VHCR_r7 sccpch_SystemInformationList)
    {
	setTdd768SpecificInfo(tdd768SpecificInfo);
	setSccpch_SystemInformationList(sccpch_SystemInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Tdd768SpecificInfo();
	mComponents[1] = new SCCPCH_SystemInformationList_HCR_VHCR_r7();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Tdd768SpecificInfo();
	    case 1:
		return new SCCPCH_SystemInformationList_HCR_VHCR_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd768SpecificInfo"
    public Tdd768SpecificInfo getTdd768SpecificInfo()
    {
	return (Tdd768SpecificInfo)mComponents[0];
    }
    
    public void setTdd768SpecificInfo(Tdd768SpecificInfo tdd768SpecificInfo)
    {
	mComponents[0] = tdd768SpecificInfo;
    }
    
    public boolean hasTdd768SpecificInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd768SpecificInfo()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd768SpecificInfo from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd768SpecificInfo extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd768SpecificInfo()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd768SpecificInfo(PUSCH_SysInfoList_SFN_VHCR pusch_SysInfoList_SFN, 
			PDSCH_SysInfoList_VHCR_r7 pdsch_SysInfoList_SFN, 
			PRACH_SystemInformationList_VHCR_r7 prach_SystemInformationList)
	{
	    setPusch_SysInfoList_SFN(pusch_SysInfoList_SFN);
	    setPdsch_SysInfoList_SFN(pdsch_SysInfoList_SFN);
	    setPrach_SystemInformationList(prach_SystemInformationList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PUSCH_SysInfoList_SFN_VHCR();
	    mComponents[1] = new PDSCH_SysInfoList_VHCR_r7();
	    mComponents[2] = new PRACH_SystemInformationList_VHCR_r7();
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
		    return new PUSCH_SysInfoList_SFN_VHCR();
		case 1:
		    return new PDSCH_SysInfoList_VHCR_r7();
		case 2:
		    return new PRACH_SystemInformationList_VHCR_r7();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pusch_SysInfoList_SFN"
	public PUSCH_SysInfoList_SFN_VHCR getPusch_SysInfoList_SFN()
	{
	    return (PUSCH_SysInfoList_SFN_VHCR)mComponents[0];
	}
	
	public void setPusch_SysInfoList_SFN(PUSCH_SysInfoList_SFN_VHCR pusch_SysInfoList_SFN)
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
	public PDSCH_SysInfoList_VHCR_r7 getPdsch_SysInfoList_SFN()
	{
	    return (PDSCH_SysInfoList_VHCR_r7)mComponents[1];
	}
	
	public void setPdsch_SysInfoList_SFN(PDSCH_SysInfoList_VHCR_r7 pdsch_SysInfoList_SFN)
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
	
	
	// Methods for field "prach_SystemInformationList"
	public PRACH_SystemInformationList_VHCR_r7 getPrach_SystemInformationList()
	{
	    return (PRACH_SystemInformationList_VHCR_r7)mComponents[2];
	}
	
	public void setPrach_SystemInformationList(PRACH_SystemInformationList_VHCR_r7 prach_SystemInformationList)
	{
	    mComponents[2] = prach_SystemInformationList;
	}
	
	public boolean hasPrach_SystemInformationList()
	{
	    return componentIsPresent(2);
	}
	
	public void deletePrach_SystemInformationList()
	{
	    setComponentAbsent(2);
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
		"SysInfoType6_v770ext_IEs$Tdd768SpecificInfo"
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
				    "PUSCH_SysInfoList_SFN_VHCR"
				),
				new QName (
				    "InformationElements",
				    "PUSCH-SysInfoList-SFN-VHCR"
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
					"PUSCH_SysInfoList_SFN_VHCR$Sequence_"
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
				    "PDSCH_SysInfoList_VHCR_r7"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-SysInfoList-VHCR-r7"
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
					"PDSCH_SysInfo_VHCR_r7"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PRACH_SystemInformationList_VHCR_r7"
				),
				new QName (
				    "InformationElements",
				    "PRACH-SystemInformationList-VHCR-r7"
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
					"PRACH_SystemInformation_VHCR_r7"
				    )
				)
			    )
			),
			"prach-SystemInformationList",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2)
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd768SpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd768SpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd768SpecificInfo

    // Methods for field "sccpch_SystemInformationList"
    public SCCPCH_SystemInformationList_HCR_VHCR_r7 getSccpch_SystemInformationList()
    {
	return (SCCPCH_SystemInformationList_HCR_VHCR_r7)mComponents[1];
    }
    
    public void setSccpch_SystemInformationList(SCCPCH_SystemInformationList_HCR_VHCR_r7 sccpch_SystemInformationList)
    {
	mComponents[1] = sccpch_SystemInformationList;
    }
    
    public boolean hasSccpch_SystemInformationList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSccpch_SystemInformationList()
    {
	setComponentAbsent(1);
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
	    "SysInfoType6_v770ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType6-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType6_v770ext_IEs$Tdd768SpecificInfo"
			)
		    ),
		    "tdd768SpecificInfo",
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
				"SCCPCH_SystemInformationList_HCR_VHCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"SCCPCH-SystemInformationList-HCR-VHCR-r7"
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
				    "SCCPCH_SystemInformation_HCR_VHCR_r7"
				)
			    )
			)
		    ),
		    "sccpch-SystemInformationList",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType6_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType6_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType6_v770ext_IEs
