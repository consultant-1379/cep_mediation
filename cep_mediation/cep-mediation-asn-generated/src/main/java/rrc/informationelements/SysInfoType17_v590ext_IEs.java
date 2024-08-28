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
 * Define the ASN1 Type SysInfoType17_v590ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType17_v590ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType17_v590ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType17_v590ext_IEs(Hcr_r5_SpecificInfo hcr_r5_SpecificInfo)
    {
	setHcr_r5_SpecificInfo(hcr_r5_SpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Hcr_r5_SpecificInfo();
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
		return new Hcr_r5_SpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hcr_r5_SpecificInfo"
    public Hcr_r5_SpecificInfo getHcr_r5_SpecificInfo()
    {
	return (Hcr_r5_SpecificInfo)mComponents[0];
    }
    
    public void setHcr_r5_SpecificInfo(Hcr_r5_SpecificInfo hcr_r5_SpecificInfo)
    {
	mComponents[0] = hcr_r5_SpecificInfo;
    }
    
    public boolean hasHcr_r5_SpecificInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHcr_r5_SpecificInfo()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Hcr_r5_SpecificInfo from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Hcr_r5_SpecificInfo extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Hcr_r5_SpecificInfo()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Hcr_r5_SpecificInfo(PUSCH_SysInfoList_HCR_r5 pusch_SysInfoList, 
			PDSCH_SysInfoList_HCR_r5 pdsch_SysInfoList)
	{
	    setPusch_SysInfoList(pusch_SysInfoList);
	    setPdsch_SysInfoList(pdsch_SysInfoList);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new PUSCH_SysInfoList_HCR_r5();
	    mComponents[1] = new PDSCH_SysInfoList_HCR_r5();
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
		    return new PUSCH_SysInfoList_HCR_r5();
		case 1:
		    return new PDSCH_SysInfoList_HCR_r5();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pusch_SysInfoList"
	public PUSCH_SysInfoList_HCR_r5 getPusch_SysInfoList()
	{
	    return (PUSCH_SysInfoList_HCR_r5)mComponents[0];
	}
	
	public void setPusch_SysInfoList(PUSCH_SysInfoList_HCR_r5 pusch_SysInfoList)
	{
	    mComponents[0] = pusch_SysInfoList;
	}
	
	public boolean hasPusch_SysInfoList()
	{
	    return componentIsPresent(0);
	}
	
	public void deletePusch_SysInfoList()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "pdsch_SysInfoList"
	public PDSCH_SysInfoList_HCR_r5 getPdsch_SysInfoList()
	{
	    return (PDSCH_SysInfoList_HCR_r5)mComponents[1];
	}
	
	public void setPdsch_SysInfoList(PDSCH_SysInfoList_HCR_r5 pdsch_SysInfoList)
	{
	    mComponents[1] = pdsch_SysInfoList;
	}
	
	public boolean hasPdsch_SysInfoList()
	{
	    return componentIsPresent(1);
	}
	
	public void deletePdsch_SysInfoList()
	{
	    setComponentAbsent(1);
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
		"SysInfoType17_v590ext_IEs$Hcr_r5_SpecificInfo"
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
				    "PUSCH_SysInfoList_HCR_r5"
				),
				new QName (
				    "InformationElements",
				    "PUSCH-SysInfoList-HCR-r5"
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
					"PUSCH_SysInfo_HCR_r5"
				    )
				)
			    )
			),
			"pusch-SysInfoList",
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
				    "PDSCH_SysInfoList_HCR_r5"
				),
				new QName (
				    "InformationElements",
				    "PDSCH-SysInfoList-HCR-r5"
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
					"PDSCH_SysInfo_HCR_r5"
				    )
				)
			    )
			),
			"pdsch-SysInfoList",
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
	 * Get the type descriptor (TypeInfo) of 'this' Hcr_r5_SpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Hcr_r5_SpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Hcr_r5_SpecificInfo

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
	    "SysInfoType17_v590ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType17-v590ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType17_v590ext_IEs$Hcr_r5_SpecificInfo"
			)
		    ),
		    "hcr-r5-SpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType17_v590ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType17_v590ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType17_v590ext_IEs
