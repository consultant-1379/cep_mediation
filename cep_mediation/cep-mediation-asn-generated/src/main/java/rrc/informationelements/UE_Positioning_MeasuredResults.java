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
 * Define the ASN1 Type UE_Positioning_MeasuredResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_MeasuredResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_MeasuredResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_MeasuredResults(UE_Positioning_OTDOA_Measurement ue_positioning_OTDOA_Measurement, 
		    UE_Positioning_PositionEstimateInfo ue_positioning_PositionEstimateInfo, 
		    UE_Positioning_GPS_MeasurementResults ue_positioning_GPS_Measurement, 
		    UE_Positioning_Error ue_positioning_Error)
    {
	setUe_positioning_OTDOA_Measurement(ue_positioning_OTDOA_Measurement);
	setUe_positioning_PositionEstimateInfo(ue_positioning_PositionEstimateInfo);
	setUe_positioning_GPS_Measurement(ue_positioning_GPS_Measurement);
	setUe_positioning_Error(ue_positioning_Error);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_OTDOA_Measurement();
	mComponents[1] = new UE_Positioning_PositionEstimateInfo();
	mComponents[2] = new UE_Positioning_GPS_MeasurementResults();
	mComponents[3] = new UE_Positioning_Error();
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
		return new UE_Positioning_OTDOA_Measurement();
	    case 1:
		return new UE_Positioning_PositionEstimateInfo();
	    case 2:
		return new UE_Positioning_GPS_MeasurementResults();
	    case 3:
		return new UE_Positioning_Error();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_OTDOA_Measurement"
    public UE_Positioning_OTDOA_Measurement getUe_positioning_OTDOA_Measurement()
    {
	return (UE_Positioning_OTDOA_Measurement)mComponents[0];
    }
    
    public void setUe_positioning_OTDOA_Measurement(UE_Positioning_OTDOA_Measurement ue_positioning_OTDOA_Measurement)
    {
	mComponents[0] = ue_positioning_OTDOA_Measurement;
    }
    
    public boolean hasUe_positioning_OTDOA_Measurement()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_OTDOA_Measurement()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_PositionEstimateInfo"
    public UE_Positioning_PositionEstimateInfo getUe_positioning_PositionEstimateInfo()
    {
	return (UE_Positioning_PositionEstimateInfo)mComponents[1];
    }
    
    public void setUe_positioning_PositionEstimateInfo(UE_Positioning_PositionEstimateInfo ue_positioning_PositionEstimateInfo)
    {
	mComponents[1] = ue_positioning_PositionEstimateInfo;
    }
    
    public boolean hasUe_positioning_PositionEstimateInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_PositionEstimateInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GPS_Measurement"
    public UE_Positioning_GPS_MeasurementResults getUe_positioning_GPS_Measurement()
    {
	return (UE_Positioning_GPS_MeasurementResults)mComponents[2];
    }
    
    public void setUe_positioning_GPS_Measurement(UE_Positioning_GPS_MeasurementResults ue_positioning_GPS_Measurement)
    {
	mComponents[2] = ue_positioning_GPS_Measurement;
    }
    
    public boolean hasUe_positioning_GPS_Measurement()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GPS_Measurement()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_positioning_Error"
    public UE_Positioning_Error getUe_positioning_Error()
    {
	return (UE_Positioning_Error)mComponents[3];
    }
    
    public void setUe_positioning_Error(UE_Positioning_Error ue_positioning_Error)
    {
	mComponents[3] = ue_positioning_Error;
    }
    
    public boolean hasUe_positioning_Error()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_Error()
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
	    "UE_Positioning_MeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MeasuredResults"
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
				"UE_Positioning_OTDOA_Measurement"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-Measurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_Measurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_Measurement"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-Measurement",
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
				"UE_Positioning_PositionEstimateInfo"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-PositionEstimateInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_PositionEstimateInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_PositionEstimateInfo"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-PositionEstimateInfo",
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
				"UE_Positioning_GPS_MeasurementResults"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-MeasurementResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_MeasurementResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_MeasurementResults"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-Measurement",
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
				"UE_Positioning_Error"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Error"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Error"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Error"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Error",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MeasuredResults
