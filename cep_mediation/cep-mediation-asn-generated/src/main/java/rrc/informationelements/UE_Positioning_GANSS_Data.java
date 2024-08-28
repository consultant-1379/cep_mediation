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
 * Define the ASN1 Type UE_Positioning_GANSS_Data from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_Data extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_Data()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_Data(UE_Positioning_CipherParameters ganssDataCipheringInfo, 
		    GANSSDecipheringKeys ganssDecipheringKeys, 
		    UE_Positioning_GANSS_ReferenceTime uePositioningGanssReferenceTime, 
		    ReferenceLocationGANSS uePositioningGanssReferencePosition, 
		    UE_Positioning_GANSS_IonosphericModel uePositioningGanssIonosphericModel, 
		    GANSSGenericDataList ganssGenericDataList)
    {
	setGanssDataCipheringInfo(ganssDataCipheringInfo);
	setGanssDecipheringKeys(ganssDecipheringKeys);
	setUePositioningGanssReferenceTime(uePositioningGanssReferenceTime);
	setUePositioningGanssReferencePosition(uePositioningGanssReferencePosition);
	setUePositioningGanssIonosphericModel(uePositioningGanssIonosphericModel);
	setGanssGenericDataList(ganssGenericDataList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_CipherParameters();
	mComponents[1] = new GANSSDecipheringKeys();
	mComponents[2] = new UE_Positioning_GANSS_ReferenceTime();
	mComponents[3] = new ReferenceLocationGANSS();
	mComponents[4] = new UE_Positioning_GANSS_IonosphericModel();
	mComponents[5] = new GANSSGenericDataList();
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
		return new UE_Positioning_CipherParameters();
	    case 1:
		return new GANSSDecipheringKeys();
	    case 2:
		return new UE_Positioning_GANSS_ReferenceTime();
	    case 3:
		return new ReferenceLocationGANSS();
	    case 4:
		return new UE_Positioning_GANSS_IonosphericModel();
	    case 5:
		return new GANSSGenericDataList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssDataCipheringInfo"
    public UE_Positioning_CipherParameters getGanssDataCipheringInfo()
    {
	return (UE_Positioning_CipherParameters)mComponents[0];
    }
    
    public void setGanssDataCipheringInfo(UE_Positioning_CipherParameters ganssDataCipheringInfo)
    {
	mComponents[0] = ganssDataCipheringInfo;
    }
    
    public boolean hasGanssDataCipheringInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssDataCipheringInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssDecipheringKeys"
    public GANSSDecipheringKeys getGanssDecipheringKeys()
    {
	return (GANSSDecipheringKeys)mComponents[1];
    }
    
    public void setGanssDecipheringKeys(GANSSDecipheringKeys ganssDecipheringKeys)
    {
	mComponents[1] = ganssDecipheringKeys;
    }
    
    public boolean hasGanssDecipheringKeys()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGanssDecipheringKeys()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "uePositioningGanssReferenceTime"
    public UE_Positioning_GANSS_ReferenceTime getUePositioningGanssReferenceTime()
    {
	return (UE_Positioning_GANSS_ReferenceTime)mComponents[2];
    }
    
    public void setUePositioningGanssReferenceTime(UE_Positioning_GANSS_ReferenceTime uePositioningGanssReferenceTime)
    {
	mComponents[2] = uePositioningGanssReferenceTime;
    }
    
    public boolean hasUePositioningGanssReferenceTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUePositioningGanssReferenceTime()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "uePositioningGanssReferencePosition"
    public ReferenceLocationGANSS getUePositioningGanssReferencePosition()
    {
	return (ReferenceLocationGANSS)mComponents[3];
    }
    
    public void setUePositioningGanssReferencePosition(ReferenceLocationGANSS uePositioningGanssReferencePosition)
    {
	mComponents[3] = uePositioningGanssReferencePosition;
    }
    
    public boolean hasUePositioningGanssReferencePosition()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUePositioningGanssReferencePosition()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "uePositioningGanssIonosphericModel"
    public UE_Positioning_GANSS_IonosphericModel getUePositioningGanssIonosphericModel()
    {
	return (UE_Positioning_GANSS_IonosphericModel)mComponents[4];
    }
    
    public void setUePositioningGanssIonosphericModel(UE_Positioning_GANSS_IonosphericModel uePositioningGanssIonosphericModel)
    {
	mComponents[4] = uePositioningGanssIonosphericModel;
    }
    
    public boolean hasUePositioningGanssIonosphericModel()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUePositioningGanssIonosphericModel()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ganssGenericDataList"
    public GANSSGenericDataList getGanssGenericDataList()
    {
	return (GANSSGenericDataList)mComponents[5];
    }
    
    public void setGanssGenericDataList(GANSSGenericDataList ganssGenericDataList)
    {
	mComponents[5] = ganssGenericDataList;
    }
    
    public boolean hasGanssGenericDataList()
    {
	return componentIsPresent(5);
    }
    
    public void deleteGanssGenericDataList()
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
	    "UE_Positioning_GANSS_Data"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-Data"
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
				"UE_Positioning_CipherParameters"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-CipherParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0
			)
		    ),
		    "ganssDataCipheringInfo",
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
				"GANSSDecipheringKeys"
			    ),
			    new QName (
				"InformationElements",
				"GANSSDecipheringKeys"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "GANSSDecipheringKeys"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "GANSSDecipheringKeys"
				)
			    ),
			    0
			)
		    ),
		    "ganssDecipheringKeys",
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
				"UE_Positioning_GANSS_ReferenceTime"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceTime"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceTime"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGanssReferenceTime",
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
				"ReferenceLocationGANSS"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceLocationGANSS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocationGANSS"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocationGANSS"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGanssReferencePosition",
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
				"UE_Positioning_GANSS_IonosphericModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-IonosphericModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_IonosphericModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_IonosphericModel"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGanssIonosphericModel",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GANSSGenericDataList"
			    ),
			    new QName (
				"InformationElements",
				"GANSSGenericDataList"
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
				    "GANSSGenericData"
				)
			    )
			)
		    ),
		    "ganssGenericDataList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Data object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_Data object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for UE_Positioning_GANSS_Data
