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
 * Define the ASN1 Type UE_Positioning_Measurement_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_Measurement_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Measurement_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Measurement_r8(UE_Positioning_ReportingQuantity_r8 ue_positioning_ReportingQuantity, 
		    MeasurementValidity measurementValidity, 
		    UE_Positioning_ReportCriteria_r7 reportCriteria, 
		    UE_Positioning_OTDOA_AssistanceData_r7 ue_positioning_OTDOA_AssistanceData, 
		    UE_Positioning_GPS_AssistanceData_r7 ue_positioning_GPS_AssistanceData, 
		    UE_Positioning_GANSS_AssistanceData_r8 ue_positioning_GANSS_AssistanceData)
    {
	setUe_positioning_ReportingQuantity(ue_positioning_ReportingQuantity);
	setMeasurementValidity(measurementValidity);
	setReportCriteria(reportCriteria);
	setUe_positioning_OTDOA_AssistanceData(ue_positioning_OTDOA_AssistanceData);
	setUe_positioning_GPS_AssistanceData(ue_positioning_GPS_AssistanceData);
	setUe_positioning_GANSS_AssistanceData(ue_positioning_GANSS_AssistanceData);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_Measurement_r8(UE_Positioning_ReportingQuantity_r8 ue_positioning_ReportingQuantity, 
		    UE_Positioning_ReportCriteria_r7 reportCriteria)
    {
	setUe_positioning_ReportingQuantity(ue_positioning_ReportingQuantity);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_ReportingQuantity_r8();
	mComponents[1] = new MeasurementValidity();
	mComponents[2] = new UE_Positioning_ReportCriteria_r7();
	mComponents[3] = new UE_Positioning_OTDOA_AssistanceData_r7();
	mComponents[4] = new UE_Positioning_GPS_AssistanceData_r7();
	mComponents[5] = new UE_Positioning_GANSS_AssistanceData_r8();
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
		return new UE_Positioning_ReportingQuantity_r8();
	    case 1:
		return new MeasurementValidity();
	    case 2:
		return new UE_Positioning_ReportCriteria_r7();
	    case 3:
		return new UE_Positioning_OTDOA_AssistanceData_r7();
	    case 4:
		return new UE_Positioning_GPS_AssistanceData_r7();
	    case 5:
		return new UE_Positioning_GANSS_AssistanceData_r8();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_ReportingQuantity"
    public UE_Positioning_ReportingQuantity_r8 getUe_positioning_ReportingQuantity()
    {
	return (UE_Positioning_ReportingQuantity_r8)mComponents[0];
    }
    
    public void setUe_positioning_ReportingQuantity(UE_Positioning_ReportingQuantity_r8 ue_positioning_ReportingQuantity)
    {
	mComponents[0] = ue_positioning_ReportingQuantity;
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[1];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[1] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "reportCriteria"
    public UE_Positioning_ReportCriteria_r7 getReportCriteria()
    {
	return (UE_Positioning_ReportCriteria_r7)mComponents[2];
    }
    
    public void setReportCriteria(UE_Positioning_ReportCriteria_r7 reportCriteria)
    {
	mComponents[2] = reportCriteria;
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData"
    public UE_Positioning_OTDOA_AssistanceData_r7 getUe_positioning_OTDOA_AssistanceData()
    {
	return (UE_Positioning_OTDOA_AssistanceData_r7)mComponents[3];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData(UE_Positioning_OTDOA_AssistanceData_r7 ue_positioning_OTDOA_AssistanceData)
    {
	mComponents[3] = ue_positioning_OTDOA_AssistanceData;
    }
    
    public boolean hasUe_positioning_OTDOA_AssistanceData()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_OTDOA_AssistanceData()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ue_positioning_GPS_AssistanceData"
    public UE_Positioning_GPS_AssistanceData_r7 getUe_positioning_GPS_AssistanceData()
    {
	return (UE_Positioning_GPS_AssistanceData_r7)mComponents[4];
    }
    
    public void setUe_positioning_GPS_AssistanceData(UE_Positioning_GPS_AssistanceData_r7 ue_positioning_GPS_AssistanceData)
    {
	mComponents[4] = ue_positioning_GPS_AssistanceData;
    }
    
    public boolean hasUe_positioning_GPS_AssistanceData()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUe_positioning_GPS_AssistanceData()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "ue_positioning_GANSS_AssistanceData"
    public UE_Positioning_GANSS_AssistanceData_r8 getUe_positioning_GANSS_AssistanceData()
    {
	return (UE_Positioning_GANSS_AssistanceData_r8)mComponents[5];
    }
    
    public void setUe_positioning_GANSS_AssistanceData(UE_Positioning_GANSS_AssistanceData_r8 ue_positioning_GANSS_AssistanceData)
    {
	mComponents[5] = ue_positioning_GANSS_AssistanceData;
    }
    
    public boolean hasUe_positioning_GANSS_AssistanceData()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUe_positioning_GANSS_AssistanceData()
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
	    "UE_Positioning_Measurement_r8"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-Measurement-r8"
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
				"UE_Positioning_ReportingQuantity_r8"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ReportingQuantity-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity_r8"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-ReportingQuantity",
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
				"MeasurementValidity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementValidity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0
			)
		    ),
		    "measurementValidity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_ReportCriteria_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ReportCriteria-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportCriteria_r7"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "reportCriteria",
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
				"UE_Positioning_OTDOA_AssistanceData_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_r7"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData",
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
				"UE_Positioning_GPS_AssistanceData_r7"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AssistanceData-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData_r7"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AssistanceData",
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
				"UE_Positioning_GANSS_AssistanceData_r8"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-AssistanceData-r8"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData_r8"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_AssistanceData_r8"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-AssistanceData",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Measurement_r8
