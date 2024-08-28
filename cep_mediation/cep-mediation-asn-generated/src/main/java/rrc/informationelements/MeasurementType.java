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
 * Define the ASN1 Type MeasurementType from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasurementType extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasurementType()
    {
    }
    
    public static final  int  intraFrequencyMeasurement_chosen = 1;
    public static final  int  interFrequencyMeasurement_chosen = 2;
    public static final  int  interRATMeasurement_chosen = 3;
    public static final  int  ue_positioning_Measurement_chosen = 4;
    public static final  int  trafficVolumeMeasurement_chosen = 5;
    public static final  int  qualityMeasurement_chosen = 6;
    public static final  int  ue_InternalMeasurement_chosen = 7;
    
    // Methods for field "intraFrequencyMeasurement"
    public static MeasurementType createMeasurementTypeWithIntraFrequencyMeasurement(IntraFrequencyMeasurement intraFrequencyMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setIntraFrequencyMeasurement(intraFrequencyMeasurement);
	return __object;
    }
    
    public boolean hasIntraFrequencyMeasurement()
    {
	return getChosenFlag() == intraFrequencyMeasurement_chosen;
    }
    
    public void setIntraFrequencyMeasurement(IntraFrequencyMeasurement intraFrequencyMeasurement)
    {
	setChosenValue(intraFrequencyMeasurement);
	setChosenFlag(intraFrequencyMeasurement_chosen);
    }
    
    
    // Methods for field "interFrequencyMeasurement"
    public static MeasurementType createMeasurementTypeWithInterFrequencyMeasurement(InterFrequencyMeasurement interFrequencyMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setInterFrequencyMeasurement(interFrequencyMeasurement);
	return __object;
    }
    
    public boolean hasInterFrequencyMeasurement()
    {
	return getChosenFlag() == interFrequencyMeasurement_chosen;
    }
    
    public void setInterFrequencyMeasurement(InterFrequencyMeasurement interFrequencyMeasurement)
    {
	setChosenValue(interFrequencyMeasurement);
	setChosenFlag(interFrequencyMeasurement_chosen);
    }
    
    
    // Methods for field "interRATMeasurement"
    public static MeasurementType createMeasurementTypeWithInterRATMeasurement(InterRATMeasurement interRATMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setInterRATMeasurement(interRATMeasurement);
	return __object;
    }
    
    public boolean hasInterRATMeasurement()
    {
	return getChosenFlag() == interRATMeasurement_chosen;
    }
    
    public void setInterRATMeasurement(InterRATMeasurement interRATMeasurement)
    {
	setChosenValue(interRATMeasurement);
	setChosenFlag(interRATMeasurement_chosen);
    }
    
    
    // Methods for field "ue_positioning_Measurement"
    public static MeasurementType createMeasurementTypeWithUe_positioning_Measurement(UE_Positioning_Measurement ue_positioning_Measurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setUe_positioning_Measurement(ue_positioning_Measurement);
	return __object;
    }
    
    public boolean hasUe_positioning_Measurement()
    {
	return getChosenFlag() == ue_positioning_Measurement_chosen;
    }
    
    public void setUe_positioning_Measurement(UE_Positioning_Measurement ue_positioning_Measurement)
    {
	setChosenValue(ue_positioning_Measurement);
	setChosenFlag(ue_positioning_Measurement_chosen);
    }
    
    
    // Methods for field "trafficVolumeMeasurement"
    public static MeasurementType createMeasurementTypeWithTrafficVolumeMeasurement(TrafficVolumeMeasurement trafficVolumeMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setTrafficVolumeMeasurement(trafficVolumeMeasurement);
	return __object;
    }
    
    public boolean hasTrafficVolumeMeasurement()
    {
	return getChosenFlag() == trafficVolumeMeasurement_chosen;
    }
    
    public void setTrafficVolumeMeasurement(TrafficVolumeMeasurement trafficVolumeMeasurement)
    {
	setChosenValue(trafficVolumeMeasurement);
	setChosenFlag(trafficVolumeMeasurement_chosen);
    }
    
    
    // Methods for field "qualityMeasurement"
    public static MeasurementType createMeasurementTypeWithQualityMeasurement(QualityMeasurement qualityMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setQualityMeasurement(qualityMeasurement);
	return __object;
    }
    
    public boolean hasQualityMeasurement()
    {
	return getChosenFlag() == qualityMeasurement_chosen;
    }
    
    public void setQualityMeasurement(QualityMeasurement qualityMeasurement)
    {
	setChosenValue(qualityMeasurement);
	setChosenFlag(qualityMeasurement_chosen);
    }
    
    
    // Methods for field "ue_InternalMeasurement"
    public static MeasurementType createMeasurementTypeWithUe_InternalMeasurement(UE_InternalMeasurement ue_InternalMeasurement)
    {
	MeasurementType __object = new MeasurementType();

	__object.setUe_InternalMeasurement(ue_InternalMeasurement);
	return __object;
    }
    
    public boolean hasUe_InternalMeasurement()
    {
	return getChosenFlag() == ue_InternalMeasurement_chosen;
    }
    
    public void setUe_InternalMeasurement(UE_InternalMeasurement ue_InternalMeasurement)
    {
	setChosenValue(ue_InternalMeasurement);
	setChosenFlag(ue_InternalMeasurement_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFrequencyMeasurement_chosen:
		return new IntraFrequencyMeasurement();
	    case interFrequencyMeasurement_chosen:
		return new InterFrequencyMeasurement();
	    case interRATMeasurement_chosen:
		return new InterRATMeasurement();
	    case ue_positioning_Measurement_chosen:
		return new UE_Positioning_Measurement();
	    case trafficVolumeMeasurement_chosen:
		return new TrafficVolumeMeasurement();
	    case qualityMeasurement_chosen:
		return new QualityMeasurement();
	    case ue_InternalMeasurement_chosen:
		return new UE_InternalMeasurement();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "MeasurementType"
	),
	new QName (
	    "InformationElements",
	    "MeasurementType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFrequencyMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"IntraFrequencyMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFrequencyMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFrequencyMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "intraFrequencyMeasurement",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFrequencyMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"InterFrequencyMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFrequencyMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFrequencyMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "interFrequencyMeasurement",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"InterRATMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "interRATMeasurement",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_Measurement"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Measurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Measurement",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "trafficVolumeMeasurement",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"QualityMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"QualityMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "QualityMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "QualityMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "qualityMeasurement",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_InternalMeasurement"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalMeasurement"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasurement"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasurement"
				)
			    ),
			    0
			)
		    ),
		    "ue-InternalMeasurement",
		    6,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementType
