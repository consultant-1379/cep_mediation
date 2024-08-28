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
 * Define the ASN1 Type UE_Positioning_GPS_AssistanceData_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_AssistanceData_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_AssistanceData_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_AssistanceData_r7(UE_Positioning_GPS_ReferenceTime_r7 ue_positioning_GPS_ReferenceTime, 
		    ReferenceLocation ue_positioning_GPS_ReferenceLocation, 
		    UE_Positioning_GPS_DGPS_Corrections ue_positioning_GPS_DGPS_Corrections, 
		    UE_Positioning_GPS_NavigationModel ue_positioning_GPS_NavigationModel, 
		    UE_Positioning_GPS_IonosphericModel ue_positioning_GPS_IonosphericModel, 
		    UE_Positioning_GPS_UTC_Model ue_positioning_GPS_UTC_Model, 
		    UE_Positioning_GPS_Almanac ue_positioning_GPS_Almanac, 
		    UE_Positioning_GPS_AcquisitionAssistance_r7 ue_positioning_GPS_AcquisitionAssistance, 
		    BadSatList ue_positioning_GPS_Real_timeIntegrity)
    {
	setUe_positioning_GPS_ReferenceTime(ue_positioning_GPS_ReferenceTime);
	setUe_positioning_GPS_ReferenceLocation(ue_positioning_GPS_ReferenceLocation);
	setUe_positioning_GPS_DGPS_Corrections(ue_positioning_GPS_DGPS_Corrections);
	setUe_positioning_GPS_NavigationModel(ue_positioning_GPS_NavigationModel);
	setUe_positioning_GPS_IonosphericModel(ue_positioning_GPS_IonosphericModel);
	setUe_positioning_GPS_UTC_Model(ue_positioning_GPS_UTC_Model);
	setUe_positioning_GPS_Almanac(ue_positioning_GPS_Almanac);
	setUe_positioning_GPS_AcquisitionAssistance(ue_positioning_GPS_AcquisitionAssistance);
	setUe_positioning_GPS_Real_timeIntegrity(ue_positioning_GPS_Real_timeIntegrity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GPS_ReferenceTime_r7();
	mComponents[1] = new ReferenceLocation();
	mComponents[2] = new UE_Positioning_GPS_DGPS_Corrections();
	mComponents[3] = new UE_Positioning_GPS_NavigationModel();
	mComponents[4] = new UE_Positioning_GPS_IonosphericModel();
	mComponents[5] = new UE_Positioning_GPS_UTC_Model();
	mComponents[6] = new UE_Positioning_GPS_Almanac();
	mComponents[7] = new UE_Positioning_GPS_AcquisitionAssistance_r7();
	mComponents[8] = new BadSatList();
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
		return new UE_Positioning_GPS_ReferenceTime_r7();
	    case 1:
		return new ReferenceLocation();
	    case 2:
		return new UE_Positioning_GPS_DGPS_Corrections();
	    case 3:
		return new UE_Positioning_GPS_NavigationModel();
	    case 4:
		return new UE_Positioning_GPS_IonosphericModel();
	    case 5:
		return new UE_Positioning_GPS_UTC_Model();
	    case 6:
		return new UE_Positioning_GPS_Almanac();
	    case 7:
		return new UE_Positioning_GPS_AcquisitionAssistance_r7();
	    case 8:
		return new BadSatList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GPS_ReferenceTime"
    public UE_Positioning_GPS_ReferenceTime_r7 getUe_positioning_GPS_ReferenceTime()
    {
	return (UE_Positioning_GPS_ReferenceTime_r7)mComponents[0];
    }
    
    public void setUe_positioning_GPS_ReferenceTime(UE_Positioning_GPS_ReferenceTime_r7 ue_positioning_GPS_ReferenceTime)
    {
	mComponents[0] = ue_positioning_GPS_ReferenceTime;
    }
    
    public boolean hasUe_positioning_GPS_ReferenceTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GPS_ReferenceTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_GPS_ReferenceLocation"
    public ReferenceLocation getUe_positioning_GPS_ReferenceLocation()
    {
	return (ReferenceLocation)mComponents[1];
    }
    
    public void setUe_positioning_GPS_ReferenceLocation(ReferenceLocation ue_positioning_GPS_ReferenceLocation)
    {
	mComponents[1] = ue_positioning_GPS_ReferenceLocation;
    }
    
    public boolean hasUe_positioning_GPS_ReferenceLocation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GPS_ReferenceLocation()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GPS_DGPS_Corrections"
    public UE_Positioning_GPS_DGPS_Corrections getUe_positioning_GPS_DGPS_Corrections()
    {
	return (UE_Positioning_GPS_DGPS_Corrections)mComponents[2];
    }
    
    public void setUe_positioning_GPS_DGPS_Corrections(UE_Positioning_GPS_DGPS_Corrections ue_positioning_GPS_DGPS_Corrections)
    {
	mComponents[2] = ue_positioning_GPS_DGPS_Corrections;
    }
    
    public boolean hasUe_positioning_GPS_DGPS_Corrections()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GPS_DGPS_Corrections()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_positioning_GPS_NavigationModel"
    public UE_Positioning_GPS_NavigationModel getUe_positioning_GPS_NavigationModel()
    {
	return (UE_Positioning_GPS_NavigationModel)mComponents[3];
    }
    
    public void setUe_positioning_GPS_NavigationModel(UE_Positioning_GPS_NavigationModel ue_positioning_GPS_NavigationModel)
    {
	mComponents[3] = ue_positioning_GPS_NavigationModel;
    }
    
    public boolean hasUe_positioning_GPS_NavigationModel()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_GPS_NavigationModel()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ue_positioning_GPS_IonosphericModel"
    public UE_Positioning_GPS_IonosphericModel getUe_positioning_GPS_IonosphericModel()
    {
	return (UE_Positioning_GPS_IonosphericModel)mComponents[4];
    }
    
    public void setUe_positioning_GPS_IonosphericModel(UE_Positioning_GPS_IonosphericModel ue_positioning_GPS_IonosphericModel)
    {
	mComponents[4] = ue_positioning_GPS_IonosphericModel;
    }
    
    public boolean hasUe_positioning_GPS_IonosphericModel()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUe_positioning_GPS_IonosphericModel()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ue_positioning_GPS_UTC_Model"
    public UE_Positioning_GPS_UTC_Model getUe_positioning_GPS_UTC_Model()
    {
	return (UE_Positioning_GPS_UTC_Model)mComponents[5];
    }
    
    public void setUe_positioning_GPS_UTC_Model(UE_Positioning_GPS_UTC_Model ue_positioning_GPS_UTC_Model)
    {
	mComponents[5] = ue_positioning_GPS_UTC_Model;
    }
    
    public boolean hasUe_positioning_GPS_UTC_Model()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUe_positioning_GPS_UTC_Model()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "ue_positioning_GPS_Almanac"
    public UE_Positioning_GPS_Almanac getUe_positioning_GPS_Almanac()
    {
	return (UE_Positioning_GPS_Almanac)mComponents[6];
    }
    
    public void setUe_positioning_GPS_Almanac(UE_Positioning_GPS_Almanac ue_positioning_GPS_Almanac)
    {
	mComponents[6] = ue_positioning_GPS_Almanac;
    }
    
    public boolean hasUe_positioning_GPS_Almanac()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUe_positioning_GPS_Almanac()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "ue_positioning_GPS_AcquisitionAssistance"
    public UE_Positioning_GPS_AcquisitionAssistance_r7 getUe_positioning_GPS_AcquisitionAssistance()
    {
	return (UE_Positioning_GPS_AcquisitionAssistance_r7)mComponents[7];
    }
    
    public void setUe_positioning_GPS_AcquisitionAssistance(UE_Positioning_GPS_AcquisitionAssistance_r7 ue_positioning_GPS_AcquisitionAssistance)
    {
	mComponents[7] = ue_positioning_GPS_AcquisitionAssistance;
    }
    
    public boolean hasUe_positioning_GPS_AcquisitionAssistance()
    {
	return componentIsPresent(7);
    }
    
    public void deleteUe_positioning_GPS_AcquisitionAssistance()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "ue_positioning_GPS_Real_timeIntegrity"
    public BadSatList getUe_positioning_GPS_Real_timeIntegrity()
    {
	return (BadSatList)mComponents[8];
    }
    
    public void setUe_positioning_GPS_Real_timeIntegrity(BadSatList ue_positioning_GPS_Real_timeIntegrity)
    {
	mComponents[8] = ue_positioning_GPS_Real_timeIntegrity;
    }
    
    public boolean hasUe_positioning_GPS_Real_timeIntegrity()
    {
	return componentIsPresent(8);
    }
    
    public void deleteUe_positioning_GPS_Real_timeIntegrity()
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
	    "UE_Positioning_GPS_AssistanceData_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-AssistanceData-r7"
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
				"UE_Positioning_GPS_ReferenceTime_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTime-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_ReferenceTime_r7"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-ReferenceTime",
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
				"ReferenceLocation"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ReferenceLocation"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-ReferenceLocation",
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
				"UE_Positioning_GPS_DGPS_Corrections"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-DGPS-Corrections"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_DGPS_Corrections"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-DGPS-Corrections",
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
				"UE_Positioning_GPS_NavigationModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-NavigationModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_NavigationModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_NavigationModel"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-NavigationModel",
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
				"UE_Positioning_GPS_IonosphericModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-IonosphericModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-IonosphericModel",
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
				"UE_Positioning_GPS_UTC_Model"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-UTC-Model"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_UTC_Model"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_UTC_Model"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-UTC-Model",
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
				"UE_Positioning_GPS_Almanac"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-Almanac"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-Almanac",
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
				"UE_Positioning_GPS_AcquisitionAssistance_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AcquisitionAssistance-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AcquisitionAssistance_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AcquisitionAssistance_r7"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AcquisitionAssistance",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"BadSatList"
			    ),
			    new QName (
				"InformationElements",
				"BadSatList"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    0x0002
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    )
			)
		    ),
		    "ue-positioning-GPS-Real-timeIntegrity",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AssistanceData_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_AssistanceData_r7
