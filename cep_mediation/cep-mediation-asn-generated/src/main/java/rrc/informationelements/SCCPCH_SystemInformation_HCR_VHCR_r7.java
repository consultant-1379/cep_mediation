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
 * Define the ASN1 Type SCCPCH_SystemInformation_HCR_VHCR_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SCCPCH_SystemInformation_HCR_VHCR_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SCCPCH_SystemInformation_HCR_VHCR_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SCCPCH_SystemInformation_HCR_VHCR_r7(SecondaryCCPCH_Info_HCR_VHCR_r7 secondaryCCPCH_Info, 
		    TFCS tfcs, 
		    FACH_PCH_InformationList fach_PCH_InformationList, 
		    PICH_Info_HCR_VHCR_r7 pich_Info)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setTfcs(tfcs);
	setFach_PCH_InformationList(fach_PCH_InformationList);
	setPich_Info(pich_Info);
    }
    
    /**
     * Construct with required components.
     */
    public SCCPCH_SystemInformation_HCR_VHCR_r7(SecondaryCCPCH_Info_HCR_VHCR_r7 secondaryCCPCH_Info)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryCCPCH_Info_HCR_VHCR_r7();
	mComponents[1] = new TFCS();
	mComponents[2] = new FACH_PCH_InformationList();
	mComponents[3] = new PICH_Info_HCR_VHCR_r7();
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
		return new SecondaryCCPCH_Info_HCR_VHCR_r7();
	    case 1:
		return new TFCS();
	    case 2:
		return new FACH_PCH_InformationList();
	    case 3:
		return new PICH_Info_HCR_VHCR_r7();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondaryCCPCH_Info"
    public SecondaryCCPCH_Info_HCR_VHCR_r7 getSecondaryCCPCH_Info()
    {
	return (SecondaryCCPCH_Info_HCR_VHCR_r7)mComponents[0];
    }
    
    public void setSecondaryCCPCH_Info(SecondaryCCPCH_Info_HCR_VHCR_r7 secondaryCCPCH_Info)
    {
	mComponents[0] = secondaryCCPCH_Info;
    }
    
    
    // Methods for field "tfcs"
    public TFCS getTfcs()
    {
	return (TFCS)mComponents[1];
    }
    
    public void setTfcs(TFCS tfcs)
    {
	mComponents[1] = tfcs;
    }
    
    public boolean hasTfcs()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTfcs()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "fach_PCH_InformationList"
    public FACH_PCH_InformationList getFach_PCH_InformationList()
    {
	return (FACH_PCH_InformationList)mComponents[2];
    }
    
    public void setFach_PCH_InformationList(FACH_PCH_InformationList fach_PCH_InformationList)
    {
	mComponents[2] = fach_PCH_InformationList;
    }
    
    public boolean hasFach_PCH_InformationList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteFach_PCH_InformationList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "pich_Info"
    public PICH_Info_HCR_VHCR_r7 getPich_Info()
    {
	return (PICH_Info_HCR_VHCR_r7)mComponents[3];
    }
    
    public void setPich_Info(PICH_Info_HCR_VHCR_r7 pich_Info)
    {
	mComponents[3] = pich_Info;
    }
    
    public boolean hasPich_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deletePich_Info()
    {
	setComponentAbsent(3);
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
	    "SCCPCH_SystemInformation_HCR_VHCR_r7"
	),
	new QName (
	    "InformationElements",
	    "SCCPCH-SystemInformation-HCR-VHCR-r7"
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
				"SecondaryCCPCH_Info_HCR_VHCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCCPCH-Info-HCR-VHCR-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info_HCR_VHCR_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCCPCH_Info_HCR_VHCR_r7"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCCPCH-Info",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS"
			    ),
			    new QName (
				"InformationElements",
				"TFCS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "tfcs",
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
				"FACH_PCH_InformationList"
			    ),
			    new QName (
				"InformationElements",
				"FACH-PCH-InformationList"
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
				    "FACH_PCH_Information"
				)
			    )
			)
		    ),
		    "fach-PCH-InformationList",
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
				"PICH_Info_HCR_VHCR_r7"
			    ),
			    new QName (
				"InformationElements",
				"PICH-Info-HCR-VHCR-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_HCR_VHCR_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PICH_Info_HCR_VHCR_r7"
				)
			    ),
			    0
			)
		    ),
		    "pich-Info",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_HCR_VHCR_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SCCPCH_SystemInformation_HCR_VHCR_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SCCPCH_SystemInformation_HCR_VHCR_r7
