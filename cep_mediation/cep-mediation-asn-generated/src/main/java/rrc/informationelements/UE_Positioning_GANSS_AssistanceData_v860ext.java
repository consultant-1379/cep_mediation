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
 * Define the ASN1 Type UE_Positioning_GANSS_AssistanceData_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_AssistanceData_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_AssistanceData_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_AssistanceData_v860ext(UE_Positioning_GANSS_AddIonoModel uePositioningGanssAddIonoModel, 
		    UE_Positioning_GANSS_EarthOrientPara uePositioningGanssEarthOrientationPara, 
		    GANSSGenericDataList_v860ext ganssGenericDataList)
    {
	setUePositioningGanssAddIonoModel(uePositioningGanssAddIonoModel);
	setUePositioningGanssEarthOrientationPara(uePositioningGanssEarthOrientationPara);
	setGanssGenericDataList(ganssGenericDataList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GANSS_AddIonoModel();
	mComponents[1] = new UE_Positioning_GANSS_EarthOrientPara();
	mComponents[2] = new GANSSGenericDataList_v860ext();
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
		return new UE_Positioning_GANSS_AddIonoModel();
	    case 1:
		return new UE_Positioning_GANSS_EarthOrientPara();
	    case 2:
		return new GANSSGenericDataList_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "uePositioningGanssAddIonoModel"
    public UE_Positioning_GANSS_AddIonoModel getUePositioningGanssAddIonoModel()
    {
	return (UE_Positioning_GANSS_AddIonoModel)mComponents[0];
    }
    
    public void setUePositioningGanssAddIonoModel(UE_Positioning_GANSS_AddIonoModel uePositioningGanssAddIonoModel)
    {
	mComponents[0] = uePositioningGanssAddIonoModel;
    }
    
    public boolean hasUePositioningGanssAddIonoModel()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUePositioningGanssAddIonoModel()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "uePositioningGanssEarthOrientationPara"
    public UE_Positioning_GANSS_EarthOrientPara getUePositioningGanssEarthOrientationPara()
    {
	return (UE_Positioning_GANSS_EarthOrientPara)mComponents[1];
    }
    
    public void setUePositioningGanssEarthOrientationPara(UE_Positioning_GANSS_EarthOrientPara uePositioningGanssEarthOrientationPara)
    {
	mComponents[1] = uePositioningGanssEarthOrientationPara;
    }
    
    public boolean hasUePositioningGanssEarthOrientationPara()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUePositioningGanssEarthOrientationPara()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ganssGenericDataList"
    public GANSSGenericDataList_v860ext getGanssGenericDataList()
    {
	return (GANSSGenericDataList_v860ext)mComponents[2];
    }
    
    public void setGanssGenericDataList(GANSSGenericDataList_v860ext ganssGenericDataList)
    {
	mComponents[2] = ganssGenericDataList;
    }
    
    public boolean hasGanssGenericDataList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssGenericDataList()
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
	    "UE_Positioning_GANSS_AssistanceData_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-AssistanceData-v860ext"
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
				"UE_Positioning_GANSS_AddIonoModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddIonoModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddIonoModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddIonoModel"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGanssAddIonoModel",
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
				"UE_Positioning_GANSS_EarthOrientPara"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-EarthOrientPara"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_EarthOrientPara"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_EarthOrientPara"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGanssEarthOrientationPara",
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
				"GANSSGenericDataList_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"GANSSGenericDataList-v860ext"
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
				    "GANSSGenericData_v860ext"
				)
			    )
			)
		    ),
		    "ganssGenericDataList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AssistanceData_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_AssistanceData_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_AssistanceData_v860ext
