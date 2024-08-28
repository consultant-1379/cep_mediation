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
 * Define the ASN1 Type MeasurementType_r10 from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasurementType_r10 extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasurementType_r10()
    {
    }
    
    public static final  int  intraFrequencyMeasurement_chosen = 1;
    public static final  int  interFrequencyMeasurement_chosen = 2;
    public static final  int  interRATMeasurement_chosen = 3;
    public static final  int  up_Measurement_chosen = 4;
    public static final  int  trafficVolumeMeasurement_chosen = 5;
    public static final  int  qualityMeasurement_chosen = 6;
    public static final  int  ue_InternalMeasurement_chosen = 7;
    public static final  int  csgProximityDetection_chosen = 8;
    
    // Methods for field "intraFrequencyMeasurement"
    public static MeasurementType_r10 createMeasurementType_r10WithIntraFrequencyMeasurement(IntraFrequencyMeasurement_r10 intraFrequencyMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setIntraFrequencyMeasurement(intraFrequencyMeasurement);
	return __object;
    }
    
    public boolean hasIntraFrequencyMeasurement()
    {
	return getChosenFlag() == intraFrequencyMeasurement_chosen;
    }
    
    public void setIntraFrequencyMeasurement(IntraFrequencyMeasurement_r10 intraFrequencyMeasurement)
    {
	setChosenValue(intraFrequencyMeasurement);
	setChosenFlag(intraFrequencyMeasurement_chosen);
    }
    
    
    // Methods for field "interFrequencyMeasurement"
    public static MeasurementType_r10 createMeasurementType_r10WithInterFrequencyMeasurement(InterFrequencyMeasurement_r10 interFrequencyMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setInterFrequencyMeasurement(interFrequencyMeasurement);
	return __object;
    }
    
    public boolean hasInterFrequencyMeasurement()
    {
	return getChosenFlag() == interFrequencyMeasurement_chosen;
    }
    
    public void setInterFrequencyMeasurement(InterFrequencyMeasurement_r10 interFrequencyMeasurement)
    {
	setChosenValue(interFrequencyMeasurement);
	setChosenFlag(interFrequencyMeasurement_chosen);
    }
    
    
    // Methods for field "interRATMeasurement"
    public static MeasurementType_r10 createMeasurementType_r10WithInterRATMeasurement(InterRATMeasurement_r9 interRATMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setInterRATMeasurement(interRATMeasurement);
	return __object;
    }
    
    public boolean hasInterRATMeasurement()
    {
	return getChosenFlag() == interRATMeasurement_chosen;
    }
    
    public void setInterRATMeasurement(InterRATMeasurement_r9 interRATMeasurement)
    {
	setChosenValue(interRATMeasurement);
	setChosenFlag(interRATMeasurement_chosen);
    }
    
    
    // Methods for field "up_Measurement"
    public static MeasurementType_r10 createMeasurementType_r10WithUp_Measurement(UE_Positioning_Measurement_r10 up_Measurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setUp_Measurement(up_Measurement);
	return __object;
    }
    
    public boolean hasUp_Measurement()
    {
	return getChosenFlag() == up_Measurement_chosen;
    }
    
    public void setUp_Measurement(UE_Positioning_Measurement_r10 up_Measurement)
    {
	setChosenValue(up_Measurement);
	setChosenFlag(up_Measurement_chosen);
    }
    
    
    // Methods for field "trafficVolumeMeasurement"
    public static MeasurementType_r10 createMeasurementType_r10WithTrafficVolumeMeasurement(TrafficVolumeMeasurement trafficVolumeMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

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
    public static MeasurementType_r10 createMeasurementType_r10WithQualityMeasurement(QualityMeasurement qualityMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

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
    public static MeasurementType_r10 createMeasurementType_r10WithUe_InternalMeasurement(UE_InternalMeasurement_r4 ue_InternalMeasurement)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setUe_InternalMeasurement(ue_InternalMeasurement);
	return __object;
    }
    
    public boolean hasUe_InternalMeasurement()
    {
	return getChosenFlag() == ue_InternalMeasurement_chosen;
    }
    
    public void setUe_InternalMeasurement(UE_InternalMeasurement_r4 ue_InternalMeasurement)
    {
	setChosenValue(ue_InternalMeasurement);
	setChosenFlag(ue_InternalMeasurement_chosen);
    }
    
    
    // Methods for field "csgProximityDetection"
    public static MeasurementType_r10 createMeasurementType_r10WithCsgProximityDetection(CSGProximityDetection csgProximityDetection)
    {
	MeasurementType_r10 __object = new MeasurementType_r10();

	__object.setCsgProximityDetection(csgProximityDetection);
	return __object;
    }
    
    public boolean hasCsgProximityDetection()
    {
	return getChosenFlag() == csgProximityDetection_chosen;
    }
    
    public void setCsgProximityDetection(CSGProximityDetection csgProximityDetection)
    {
	setChosenValue(csgProximityDetection);
	setChosenFlag(csgProximityDetection_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFrequencyMeasurement_chosen:
		return new IntraFrequencyMeasurement_r10();
	    case interFrequencyMeasurement_chosen:
		return new InterFrequencyMeasurement_r10();
	    case interRATMeasurement_chosen:
		return new InterRATMeasurement_r9();
	    case up_Measurement_chosen:
		return new UE_Positioning_Measurement_r10();
	    case trafficVolumeMeasurement_chosen:
		return new TrafficVolumeMeasurement();
	    case qualityMeasurement_chosen:
		return new QualityMeasurement();
	    case ue_InternalMeasurement_chosen:
		return new UE_InternalMeasurement_r4();
	    case csgProximityDetection_chosen:
		return new CSGProximityDetection();
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
	    "MeasurementType_r10"
	),
	new QName (
	    "InformationElements",
	    "MeasurementType-r10"
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
				"IntraFrequencyMeasurement_r10"
			    ),
			    new QName (
				"InformationElements",
				"IntraFrequencyMeasurement-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFrequencyMeasurement_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFrequencyMeasurement_r10"
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
				"InterFrequencyMeasurement_r10"
			    ),
			    new QName (
				"InformationElements",
				"InterFrequencyMeasurement-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFrequencyMeasurement_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFrequencyMeasurement_r10"
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
				"InterRATMeasurement_r9"
			    ),
			    new QName (
				"InformationElements",
				"InterRATMeasurement-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasurement_r9"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasurement_r9"
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
				"UE_Positioning_Measurement_r10"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Measurement-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement_r10"
				)
			    ),
			    0
			)
		    ),
		    "up-Measurement",
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
				"UE_InternalMeasurement_r4"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalMeasurement-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasurement_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasurement_r4"
				)
			    ),
			    0
			)
		    ),
		    "ue-InternalMeasurement",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CSGProximityDetection"
			    ),
			    new QName (
				"InformationElements",
				"CSGProximityDetection"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CSGProximityDetection"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CSGProximityDetection"
				)
			    ),
			    0
			)
		    ),
		    "csgProximityDetection",
		    7,
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
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementType_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementType_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementType_r10
