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
 * Define the ASN1 Type GANSSGenericData_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GANSSGenericData_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public GANSSGenericData_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GANSSGenericData_r10(INTEGER ganssId, 
		    UE_Positioning_GANSS_SBAS_ID uePositiningGANSSsbasID, 
		    GANSSTimeModelsList_r10 ganssTimeModelsList, 
		    UE_Positioning_DGANSSCorrections_r9 uePositioningDGANSSCorrections, 
		    UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel, 
		    UE_Positioning_GANSS_AddNavigationModels uePositioningGANSSAddNavigationModels, 
		    UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity, 
		    UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 uePositioningGANSSReferenceMeasurementInfo, 
		    UE_Positioning_GANSS_Almanac_r10 uePositioningGANSSAlmanac, 
		    UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel, 
		    UE_Positioning_GANSS_AddUTCModels uePositioningGANSSAddUTCModels, 
		    UE_Positioning_GANSS_AuxiliaryInfo uePositioningGANSSAuxiliaryInfo)
    {
	setGanssId(ganssId);
	setUePositiningGANSSsbasID(uePositiningGANSSsbasID);
	setGanssTimeModelsList(ganssTimeModelsList);
	setUePositioningDGANSSCorrections(uePositioningDGANSSCorrections);
	setUePositioningGANSSNavigationModel(uePositioningGANSSNavigationModel);
	setUePositioningGANSSAddNavigationModels(uePositioningGANSSAddNavigationModels);
	setUePositioningGANSSRealTimeIntegrity(uePositioningGANSSRealTimeIntegrity);
	setUePositioningGANSSDataBitAssistance(uePositioningGANSSDataBitAssistance);
	setUePositioningGANSSReferenceMeasurementInfo(uePositioningGANSSReferenceMeasurementInfo);
	setUePositioningGANSSAlmanac(uePositioningGANSSAlmanac);
	setUePositioningGANSSUTCModel(uePositioningGANSSUTCModel);
	setUePositioningGANSSAddUTCModels(uePositioningGANSSAddUTCModels);
	setUePositioningGANSSAuxiliaryInfo(uePositioningGANSSAuxiliaryInfo);
    }
    
    /**
     * Construct with components.
     */
    public GANSSGenericData_r10(long ganssId, 
		    UE_Positioning_GANSS_SBAS_ID uePositiningGANSSsbasID, 
		    GANSSTimeModelsList_r10 ganssTimeModelsList, 
		    UE_Positioning_DGANSSCorrections_r9 uePositioningDGANSSCorrections, 
		    UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel, 
		    UE_Positioning_GANSS_AddNavigationModels uePositioningGANSSAddNavigationModels, 
		    UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity, 
		    UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance, 
		    UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 uePositioningGANSSReferenceMeasurementInfo, 
		    UE_Positioning_GANSS_Almanac_r10 uePositioningGANSSAlmanac, 
		    UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel, 
		    UE_Positioning_GANSS_AddUTCModels uePositioningGANSSAddUTCModels, 
		    UE_Positioning_GANSS_AuxiliaryInfo uePositioningGANSSAuxiliaryInfo)
    {
	this(new INTEGER(ganssId), uePositiningGANSSsbasID, 
	     ganssTimeModelsList, uePositioningDGANSSCorrections, 
	     uePositioningGANSSNavigationModel, 
	     uePositioningGANSSAddNavigationModels, 
	     uePositioningGANSSRealTimeIntegrity, 
	     uePositioningGANSSDataBitAssistance, 
	     uePositioningGANSSReferenceMeasurementInfo, 
	     uePositioningGANSSAlmanac, uePositioningGANSSUTCModel, 
	     uePositioningGANSSAddUTCModels, 
	     uePositioningGANSSAuxiliaryInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = UE_Positioning_GANSS_SBAS_ID.waas;
	mComponents[2] = new GANSSTimeModelsList_r10();
	mComponents[3] = new UE_Positioning_DGANSSCorrections_r9();
	mComponents[4] = new UE_Positioning_GANSS_NavigationModel();
	mComponents[5] = new UE_Positioning_GANSS_AddNavigationModels();
	mComponents[6] = new UE_Positioning_GANSS_RealTimeIntegrity();
	mComponents[7] = new UE_Positioning_GANSS_Data_Bit_Assistance();
	mComponents[8] = new UE_Positioning_GANSS_ReferenceMeasurementInfo_r10();
	mComponents[9] = new UE_Positioning_GANSS_Almanac_r10();
	mComponents[10] = new UE_Positioning_GANSS_UTCModel();
	mComponents[11] = new UE_Positioning_GANSS_AddUTCModels();
	mComponents[12] = new UE_Positioning_GANSS_AuxiliaryInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return UE_Positioning_GANSS_SBAS_ID.waas;
	    case 2:
		return new GANSSTimeModelsList_r10();
	    case 3:
		return new UE_Positioning_DGANSSCorrections_r9();
	    case 4:
		return new UE_Positioning_GANSS_NavigationModel();
	    case 5:
		return new UE_Positioning_GANSS_AddNavigationModels();
	    case 6:
		return new UE_Positioning_GANSS_RealTimeIntegrity();
	    case 7:
		return new UE_Positioning_GANSS_Data_Bit_Assistance();
	    case 8:
		return new UE_Positioning_GANSS_ReferenceMeasurementInfo_r10();
	    case 9:
		return new UE_Positioning_GANSS_Almanac_r10();
	    case 10:
		return new UE_Positioning_GANSS_UTCModel();
	    case 11:
		return new UE_Positioning_GANSS_AddUTCModels();
	    case 12:
		return new UE_Positioning_GANSS_AuxiliaryInfo();
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
    
    
    // Methods for field "uePositiningGANSSsbasID"
    public UE_Positioning_GANSS_SBAS_ID getUePositiningGANSSsbasID()
    {
	return (UE_Positioning_GANSS_SBAS_ID)mComponents[1];
    }
    
    public void setUePositiningGANSSsbasID(UE_Positioning_GANSS_SBAS_ID uePositiningGANSSsbasID)
    {
	mComponents[1] = uePositiningGANSSsbasID;
    }
    
    public boolean hasUePositiningGANSSsbasID()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUePositiningGANSSsbasID()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ganssTimeModelsList"
    public GANSSTimeModelsList_r10 getGanssTimeModelsList()
    {
	return (GANSSTimeModelsList_r10)mComponents[2];
    }
    
    public void setGanssTimeModelsList(GANSSTimeModelsList_r10 ganssTimeModelsList)
    {
	mComponents[2] = ganssTimeModelsList;
    }
    
    public boolean hasGanssTimeModelsList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssTimeModelsList()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "uePositioningDGANSSCorrections"
    public UE_Positioning_DGANSSCorrections_r9 getUePositioningDGANSSCorrections()
    {
	return (UE_Positioning_DGANSSCorrections_r9)mComponents[3];
    }
    
    public void setUePositioningDGANSSCorrections(UE_Positioning_DGANSSCorrections_r9 uePositioningDGANSSCorrections)
    {
	mComponents[3] = uePositioningDGANSSCorrections;
    }
    
    public boolean hasUePositioningDGANSSCorrections()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUePositioningDGANSSCorrections()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "uePositioningGANSSNavigationModel"
    public UE_Positioning_GANSS_NavigationModel getUePositioningGANSSNavigationModel()
    {
	return (UE_Positioning_GANSS_NavigationModel)mComponents[4];
    }
    
    public void setUePositioningGANSSNavigationModel(UE_Positioning_GANSS_NavigationModel uePositioningGANSSNavigationModel)
    {
	mComponents[4] = uePositioningGANSSNavigationModel;
    }
    
    public boolean hasUePositioningGANSSNavigationModel()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUePositioningGANSSNavigationModel()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "uePositioningGANSSAddNavigationModels"
    public UE_Positioning_GANSS_AddNavigationModels getUePositioningGANSSAddNavigationModels()
    {
	return (UE_Positioning_GANSS_AddNavigationModels)mComponents[5];
    }
    
    public void setUePositioningGANSSAddNavigationModels(UE_Positioning_GANSS_AddNavigationModels uePositioningGANSSAddNavigationModels)
    {
	mComponents[5] = uePositioningGANSSAddNavigationModels;
    }
    
    public boolean hasUePositioningGANSSAddNavigationModels()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUePositioningGANSSAddNavigationModels()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "uePositioningGANSSRealTimeIntegrity"
    public UE_Positioning_GANSS_RealTimeIntegrity getUePositioningGANSSRealTimeIntegrity()
    {
	return (UE_Positioning_GANSS_RealTimeIntegrity)mComponents[6];
    }
    
    public void setUePositioningGANSSRealTimeIntegrity(UE_Positioning_GANSS_RealTimeIntegrity uePositioningGANSSRealTimeIntegrity)
    {
	mComponents[6] = uePositioningGANSSRealTimeIntegrity;
    }
    
    public boolean hasUePositioningGANSSRealTimeIntegrity()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUePositioningGANSSRealTimeIntegrity()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "uePositioningGANSSDataBitAssistance"
    public UE_Positioning_GANSS_Data_Bit_Assistance getUePositioningGANSSDataBitAssistance()
    {
	return (UE_Positioning_GANSS_Data_Bit_Assistance)mComponents[7];
    }
    
    public void setUePositioningGANSSDataBitAssistance(UE_Positioning_GANSS_Data_Bit_Assistance uePositioningGANSSDataBitAssistance)
    {
	mComponents[7] = uePositioningGANSSDataBitAssistance;
    }
    
    public boolean hasUePositioningGANSSDataBitAssistance()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUePositioningGANSSDataBitAssistance()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "uePositioningGANSSReferenceMeasurementInfo"
    public UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 getUePositioningGANSSReferenceMeasurementInfo()
    {
	return (UE_Positioning_GANSS_ReferenceMeasurementInfo_r10)mComponents[8];
    }
    
    public void setUePositioningGANSSReferenceMeasurementInfo(UE_Positioning_GANSS_ReferenceMeasurementInfo_r10 uePositioningGANSSReferenceMeasurementInfo)
    {
	mComponents[8] = uePositioningGANSSReferenceMeasurementInfo;
    }
    
    public boolean hasUePositioningGANSSReferenceMeasurementInfo()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUePositioningGANSSReferenceMeasurementInfo()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "uePositioningGANSSAlmanac"
    public UE_Positioning_GANSS_Almanac_r10 getUePositioningGANSSAlmanac()
    {
	return (UE_Positioning_GANSS_Almanac_r10)mComponents[9];
    }
    
    public void setUePositioningGANSSAlmanac(UE_Positioning_GANSS_Almanac_r10 uePositioningGANSSAlmanac)
    {
	mComponents[9] = uePositioningGANSSAlmanac;
    }
    
    public boolean hasUePositioningGANSSAlmanac()
    {
	return componentIsPresent(9);
    }
    
    public void deleteUePositioningGANSSAlmanac()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "uePositioningGANSSUTCModel"
    public UE_Positioning_GANSS_UTCModel getUePositioningGANSSUTCModel()
    {
	return (UE_Positioning_GANSS_UTCModel)mComponents[10];
    }
    
    public void setUePositioningGANSSUTCModel(UE_Positioning_GANSS_UTCModel uePositioningGANSSUTCModel)
    {
	mComponents[10] = uePositioningGANSSUTCModel;
    }
    
    public boolean hasUePositioningGANSSUTCModel()
    {
	return componentIsPresent(10);
    }
    
    public void deleteUePositioningGANSSUTCModel()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "uePositioningGANSSAddUTCModels"
    public UE_Positioning_GANSS_AddUTCModels getUePositioningGANSSAddUTCModels()
    {
	return (UE_Positioning_GANSS_AddUTCModels)mComponents[11];
    }
    
    public void setUePositioningGANSSAddUTCModels(UE_Positioning_GANSS_AddUTCModels uePositioningGANSSAddUTCModels)
    {
	mComponents[11] = uePositioningGANSSAddUTCModels;
    }
    
    public boolean hasUePositioningGANSSAddUTCModels()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUePositioningGANSSAddUTCModels()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "uePositioningGANSSAuxiliaryInfo"
    public UE_Positioning_GANSS_AuxiliaryInfo getUePositioningGANSSAuxiliaryInfo()
    {
	return (UE_Positioning_GANSS_AuxiliaryInfo)mComponents[12];
    }
    
    public void setUePositioningGANSSAuxiliaryInfo(UE_Positioning_GANSS_AuxiliaryInfo uePositioningGANSSAuxiliaryInfo)
    {
	mComponents[12] = uePositioningGANSSAuxiliaryInfo;
    }
    
    public boolean hasUePositioningGANSSAuxiliaryInfo()
    {
	return componentIsPresent(12);
    }
    
    public void deleteUePositioningGANSSAuxiliaryInfo()
    {
	setComponentAbsent(12);
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
	    "GANSSGenericData_r10"
	),
	new QName (
	    "InformationElements",
	    "GANSSGenericData-r10"
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_SBAS_ID"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-SBAS-ID"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"waas",
					0
				    ),
				    new MemberListElement (
					"egnos",
					1
				    ),
				    new MemberListElement (
					"msas",
					2
				    ),
				    new MemberListElement (
					"gagan",
					3
				    ),
				    new MemberListElement (
					"spare4",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    UE_Positioning_GANSS_SBAS_ID.waas
			)
		    ),
		    "uePositiningGANSSsbasID",
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
				"GANSSTimeModelsList_r10"
			    ),
			    new QName (
				"InformationElements",
				"GANSSTimeModelsList-r10"
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
				    "UE_Positioning_GANSS_TimeModel_r10"
				)
			    )
			)
		    ),
		    "ganssTimeModelsList",
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
				"UE_Positioning_DGANSSCorrections_r9"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-DGANSSCorrections-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_DGANSSCorrections_r9"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningDGANSSCorrections",
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
				"UE_Positioning_GANSS_AddNavigationModels"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddNavigationModels"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddNavigationModels"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddNavigationModels"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAddNavigationModels",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				"UE_Positioning_GANSS_ReferenceMeasurementInfo_r10"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-ReferenceMeasurementInfo-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_ReferenceMeasurementInfo_r10"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSReferenceMeasurementInfo",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_Almanac_r10"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Almanac-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Almanac_r10"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAlmanac",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_AddUTCModels"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AddUTCModels"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddUTCModels"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AddUTCModels"
				)
			    ),
			    0
			)
		    ),
		    "uePositioningGANSSAddUTCModels",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_AuxiliaryInfo"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AuxiliaryInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AuxiliaryInfo"
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
		    "uePositioningGANSSAuxiliaryInfo",
		    12,
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSGenericData_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSGenericData_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSGenericData_r10
