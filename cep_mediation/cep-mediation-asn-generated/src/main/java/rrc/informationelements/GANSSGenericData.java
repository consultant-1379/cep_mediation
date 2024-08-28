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
 * Define the ASN1 Type GANSSGenericData from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSGenericData extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSGenericData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSGenericData(INTEGER ganssId, 
		    GANSSTimeModelsList ganssTimeModelsList, 
		    UE_Positioning_DGANSSCorrections uePositioningDGANSSCorrections, 
		    UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel, 
		    UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity, 
		    UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo uePositioningGANSSReferenceMeasurementInfo, 
		    UE_Positioning_GANSS_Almanac uePositioningGANSSAlmanac, 
		    UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel)
    {
	setGanssId(ganssId);
	setGanssTimeModelsList(ganssTimeModelsList);
	setUePositioningDGANSSCorrections(uePositioningDGANSSCorrections);
	setUePositioningGANSSNavigationModel(uePositioningGANSSNavigationModel);
	setUePositioningGANSSRealTimeIntegrity(uePositioningGANSSRealTimeIntegrity);
	setUePositioningGANSSDataBitAssistance(uePositioningGANSSDataBitAssistance);
	setUePositioningGANSSReferenceMeasurementInfo(uePositioningGANSSReferenceMeasurementInfo);
	setUePositioningGANSSAlmanac(uePositioningGANSSAlmanac);
	setUePositioningGANSSUTCModel(uePositioningGANSSUTCModel);
    }
    
    /**
     * Construct with components.
     */
    public GANSSGenericData(long ganssId, 
		    GANSSTimeModelsList ganssTimeModelsList, 
		    UE_Positioning_DGANSSCorrections uePositioningDGANSSCorrections, 
		    UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel, 
		    UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity, 
		    UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo uePositioningGANSSReferenceMeasurementInfo, 
		    UE_Positioning_GANSS_Almanac uePositioningGANSSAlmanac, 
		    UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel)
    {
	this(new INTEGER(ganssId), ganssTimeModelsList, 
	     uePositioningDGANSSCorrections, 
	     uePositioningGANSSNavigationModel, 
	     uePositioningGANSSRealTimeIntegrity, 
	     uePositioningGANSSDataBitAssistance, 
	     uePositioningGANSSReferenceMeasurementInfo, 
	     uePositioningGANSSAlmanac, uePositioningGANSSUTCModel);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new GANSSTimeModelsList();
	mComponents[2] = new UE_Positioning_DGANSSCorrections();
	mComponents[3] = new UE_Positioning_GANSS_NavigationModel();
	mComponents[4] = new UE_Positioning_GANSS_RealTimeIntegrity();
	mComponents[5] = new UE_Positioning_GANSS_Data_Bit_Assistance();
	mComponents[6] = new UE_Positioning_GANSS_ReferenceMeasurementInfo();
	mComponents[7] = new UE_Positioning_GANSS_Almanac();
	mComponents[8] = new UE_Positioning_GANSS_UTCModel();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new GANSSTimeModelsList();
	    case 2:
		return new UE_Positioning_DGANSSCorrections();
	    case 3:
		return new UE_Positioning_GANSS_NavigationModel();
	    case 4:
		return new UE_Positioning_GANSS_RealTimeIntegrity();
	    case 5:
		return new UE_Positioning_GANSS_Data_Bit_Assistance();
	    case 6:
		return new UE_Positioning_GANSS_ReferenceMeasurementInfo();
	    case 7:
		return new UE_Positioning_GANSS_Almanac();
	    case 8:
		return new UE_Positioning_GANSS_UTCModel();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssId"
    public long getGanssId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssId(long ganssId)
    {
	setGanssId(new INTEGER(ganssId));
    }
    
    public void setGanssId(INTEGER ganssId)
    {
	mComponents[0] = ganssId;
    }
    
    public boolean hasGanssId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganssTimeModelsList"
    public GANSSTimeModelsList getGanssTimeModelsList()
    {
	return (GANSSTimeModelsList)mComponents[1];
    }
    
    public void setGanssTimeModelsList(GANSSTimeModelsList ganssTimeModelsList)
    {
	mComponents[1] = ganssTimeModelsList;
    }
    
    public boolean hasGanssTimeModelsList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGanssTimeModelsList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "uePositioningDGANSSCorrections"
    public UE_Positioning_DGANSSCorrections getUePositioningDGANSSCorrections()
    {
	return (UE_Positioning_DGANSSCorrections)mComponents[2];
    }
    
    public void setUePositioningDGANSSCorrections(UE_Positioning_DGANSSCorrections uePositioningDGANSSCorrections)
    {
	mComponents[2] = uePositioningDGANSSCorrections;
    }
    
    public boolean hasUePositioningDGANSSCorrections()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUePositioningDGANSSCorrections()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "uePositioningGANSSNavigationModel"
    public UE_Positioning_GANSS_NavigationModel getUePositioningGANSSNavigationModel()
    {
	return (UE_Positioning_GANSS_NavigationModel)mComponents[3];
    }
    
    public void setUePositioningGANSSNavigationModel(UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel)
    {
	mComponents[3] = uePositioningGANSSNavigationModel;
    }
    
    public boolean hasUePositioningGANSSNavigationModel()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUePositioningGANSSNavigationModel()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "uePositioningGANSSRealTimeIntegrity"
    public UE_Positioning_GANSS_RealTimeIntegrity getUePositioningGANSSRealTimeIntegrity()
    {
	return (UE_Positioning_GANSS_RealTimeIntegrity)mComponents[4];
    }
    
    public void setUePositioningGANSSRealTimeIntegrity(UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity)
    {
	mComponents[4] = uePositioningGANSSRealTimeIntegrity;
    }
    
    public boolean hasUePositioningGANSSRealTimeIntegrity()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUePositioningGANSSRealTimeIntegrity()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "uePositioningGANSSDataBitAssistance"
    public UE_Positioning_GANSS_Data_Bit_Assistance getUePositioningGANSSDataBitAssistance()
    {
	return (UE_Positioning_GANSS_Data_Bit_Assistance)mComponents[5];
    }
    
    public void setUePositioningGANSSDataBitAssistance(UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance)
    {
	mComponents[5] = uePositioningGANSSDataBitAssistance;
    }
    
    public boolean hasUePositioningGANSSDataBitAssistance()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUePositioningGANSSDataBitAssistance()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "uePositioningGANSSReferenceMeasurementInfo"
    public UE_Positioning_GANSS_ReferenceMeasurementInfo getUePositioningGANSSReferenceMeasurementInfo()
    {
	return (UE_Positioning_GANSS_ReferenceMeasurementInfo)mComponents[6];
    }
    
    public void setUePositioningGANSSReferenceMeasurementInfo(UE_Positioning_GANSS_ReferenceMeasurementInfo uePositioningGANSSReferenceMeasurementInfo)
    {
	mComponents[6] = uePositioningGANSSReferenceMeasurementInfo;
    }
    
    public boolean hasUePositioningGANSSReferenceMeasurementInfo()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUePositioningGANSSReferenceMeasurementInfo()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "uePositioningGANSSAlmanac"
    public UE_Positioning_GANSS_Almanac getUePositioningGANSSAlmanac()
    {
	return (UE_Positioning_GANSS_Almanac)mComponents[7];
    }
    
    public void setUePositioningGANSSAlmanac(UE_Positioning_GANSS_Almanac uePositioningGANSSAlmanac)
    {
	mComponents[7] = uePositioningGANSSAlmanac;
    }
    
    public boolean hasUePositioningGANSSAlmanac()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUePositioningGANSSAlmanac()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "uePositioningGANSSUTCModel"
    public UE_Positioning_GANSS_UTCModel getUePositioningGANSSUTCModel()
    {
	return (UE_Positioning_GANSS_UTCModel)mComponents[8];
    }
    
    public void setUePositioningGANSSUTCModel(UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel)
    {
	mComponents[8] = uePositioningGANSSUTCModel;
    }
    
    public boolean hasUePositioningGANSSUTCModel()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUePositioningGANSSUTCModel()
    {
	setComponentAbsent(8);
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
	    "GANSSGenericData"
	),
	new QName (
	    "InformationElements",
	    "GANSSGenericData"
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "ganssId",
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
				"GANSSTimeModelsList"
			    ),
			    new QName (
				"InformationElements",
				"GANSSTimeModelsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(7),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(7)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_TimeModel"
				)
			    )
			)
		    ),
		    "ganssTimeModelsList",
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
				"UE_Positioning_DGANSSCorrections"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-DGANSSCorrections"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningDGANSSCorrections",
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
				"UE_Positioning_GANSS_NavigationModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-NavigationModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_NavigationModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_NavigationModel"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSNavigationModel",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_RealTimeIntegrity"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-RealTimeIntegrity"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_RealTimeIntegrity$Sequence_"
				)
			    )
			)
		    ),
		    "uePositioningGANSSRealTimeIntegrity",
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
				"UE_Positioning_GANSS_Data_Bit_Assistance"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Data-Bit-Assistance"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Data_Bit_Assistance"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Data_Bit_Assistance"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSDataBitAssistance",
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
				"UE_Positioning_GANSS_ReferenceMeasurementInfo"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceMeasurementInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSReferenceMeasurementInfo",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_Almanac"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Almanac"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAlmanac",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_UTCModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-UTCModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_UTCModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_UTCModel"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSUTCModel",
		    8,
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
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSGenericData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSGenericData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSGenericData
