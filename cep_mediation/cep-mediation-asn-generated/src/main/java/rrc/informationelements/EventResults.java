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
 * Define the ASN1 Type EventResults from ASN1 Module InformationElements.
 * @see Choice
 */

public class EventResults extends Choice {
    
    /**
     * The default constructor.
     */
    public EventResults()
    {
    }
    
    public static final  int  intraFreqEventResults_chosen = 1;
    public static final  int  interFreqEventResults_chosen = 2;
    public static final  int  interRATEventResults_chosen = 3;
    public static final  int  trafficVolumeEventResults_chosen = 4;
    public static final  int  qualityEventResults_chosen = 5;
    public static final  int  ue_InternalEventResults_chosen = 6;
    public static final  int  ue_positioning_MeasurementEventResults_chosen = 7;
    public static final  int  spare_chosen = 8;
    
    // Methods for field "intraFreqEventResults"
    public static EventResults createEventResultsWithIntraFreqEventResults(IntraFreqEventResults intraFreqEventResults)
    {
	EventResults __object = new EventResults();

	__object.setIntraFreqEventResults(intraFreqEventResults);
	return __object;
    }
    
    public boolean hasIntraFreqEventResults()
    {
	return getChosenFlag() == intraFreqEventResults_chosen;
    }
    
    public void setIntraFreqEventResults(IntraFreqEventResults intraFreqEventResults)
    {
	setChosenValue(intraFreqEventResults);
	setChosenFlag(intraFreqEventResults_chosen);
    }
    
    
    // Methods for field "interFreqEventResults"
    public static EventResults createEventResultsWithInterFreqEventResults(InterFreqEventResults interFreqEventResults)
    {
	EventResults __object = new EventResults();

	__object.setInterFreqEventResults(interFreqEventResults);
	return __object;
    }
    
    public boolean hasInterFreqEventResults()
    {
	return getChosenFlag() == interFreqEventResults_chosen;
    }
    
    public void setInterFreqEventResults(InterFreqEventResults interFreqEventResults)
    {
	setChosenValue(interFreqEventResults);
	setChosenFlag(interFreqEventResults_chosen);
    }
    
    
    // Methods for field "interRATEventResults"
    public static EventResults createEventResultsWithInterRATEventResults(InterRATEventResults interRATEventResults)
    {
	EventResults __object = new EventResults();

	__object.setInterRATEventResults(interRATEventResults);
	return __object;
    }
    
    public boolean hasInterRATEventResults()
    {
	return getChosenFlag() == interRATEventResults_chosen;
    }
    
    public void setInterRATEventResults(InterRATEventResults interRATEventResults)
    {
	setChosenValue(interRATEventResults);
	setChosenFlag(interRATEventResults_chosen);
    }
    
    
    // Methods for field "trafficVolumeEventResults"
    public static EventResults createEventResultsWithTrafficVolumeEventResults(TrafficVolumeEventResults trafficVolumeEventResults)
    {
	EventResults __object = new EventResults();

	__object.setTrafficVolumeEventResults(trafficVolumeEventResults);
	return __object;
    }
    
    public boolean hasTrafficVolumeEventResults()
    {
	return getChosenFlag() == trafficVolumeEventResults_chosen;
    }
    
    public void setTrafficVolumeEventResults(TrafficVolumeEventResults trafficVolumeEventResults)
    {
	setChosenValue(trafficVolumeEventResults);
	setChosenFlag(trafficVolumeEventResults_chosen);
    }
    
    
    // Methods for field "qualityEventResults"
    public static EventResults createEventResultsWithQualityEventResults(QualityEventResults qualityEventResults)
    {
	EventResults __object = new EventResults();

	__object.setQualityEventResults(qualityEventResults);
	return __object;
    }
    
    public boolean hasQualityEventResults()
    {
	return getChosenFlag() == qualityEventResults_chosen;
    }
    
    public void setQualityEventResults(QualityEventResults qualityEventResults)
    {
	setChosenValue(qualityEventResults);
	setChosenFlag(qualityEventResults_chosen);
    }
    
    
    // Methods for field "ue_InternalEventResults"
    public static EventResults createEventResultsWithUe_InternalEventResults(UE_InternalEventResults ue_InternalEventResults)
    {
	EventResults __object = new EventResults();

	__object.setUe_InternalEventResults(ue_InternalEventResults);
	return __object;
    }
    
    public boolean hasUe_InternalEventResults()
    {
	return getChosenFlag() == ue_InternalEventResults_chosen;
    }
    
    public void setUe_InternalEventResults(UE_InternalEventResults ue_InternalEventResults)
    {
	setChosenValue(ue_InternalEventResults);
	setChosenFlag(ue_InternalEventResults_chosen);
    }
    
    
    // Methods for field "ue_positioning_MeasurementEventResults"
    public static EventResults createEventResultsWithUe_positioning_MeasurementEventResults(UE_Positioning_MeasurementEventResults ue_positioning_MeasurementEventResults)
    {
	EventResults __object = new EventResults();

	__object.setUe_positioning_MeasurementEventResults(ue_positioning_MeasurementEventResults);
	return __object;
    }
    
    public boolean hasUe_positioning_MeasurementEventResults()
    {
	return getChosenFlag() == ue_positioning_MeasurementEventResults_chosen;
    }
    
    public void setUe_positioning_MeasurementEventResults(UE_Positioning_MeasurementEventResults ue_positioning_MeasurementEventResults)
    {
	setChosenValue(ue_positioning_MeasurementEventResults);
	setChosenFlag(ue_positioning_MeasurementEventResults_chosen);
    }
    
    
    // Methods for field "spare"
    public static EventResults createEventResultsWithSpare(Null spare)
    {
	EventResults __object = new EventResults();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFreqEventResults_chosen:
		return new IntraFreqEventResults();
	    case interFreqEventResults_chosen:
		return new InterFreqEventResults();
	    case interRATEventResults_chosen:
		return new InterRATEventResults();
	    case trafficVolumeEventResults_chosen:
		return new TrafficVolumeEventResults();
	    case qualityEventResults_chosen:
		return new QualityEventResults();
	    case ue_InternalEventResults_chosen:
		return new UE_InternalEventResults();
	    case ue_positioning_MeasurementEventResults_chosen:
		return new UE_Positioning_MeasurementEventResults();
	    case spare_chosen:
		return new Null();
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
	    "EventResults"
	),
	new QName (
	    "InformationElements",
	    "EventResults"
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
				"IntraFreqEventResults"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEventResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEventResults"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqEventResults",
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
				"InterFreqEventResults"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqEventResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqEventResults"
				)
			    ),
			    0
			)
		    ),
		    "interFreqEventResults",
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
				"InterRATEventResults"
			    ),
			    new QName (
				"InformationElements",
				"InterRATEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATEventResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "InterRATEventResults"
				)
			    ),
			    0
			)
		    ),
		    "interRATEventResults",
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
				"TrafficVolumeEventResults"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeEventResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TrafficVolumeEventResults"
				)
			    ),
			    0
			)
		    ),
		    "trafficVolumeEventResults",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"QualityEventResults"
			    ),
			    new QName (
				"InformationElements",
				"QualityEventResults"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TransportChannelIdentity"
				)
			    )
			)
		    ),
		    "qualityEventResults",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_InternalEventResults"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalEventResults"
				)
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
			)
		    ),
		    "ue-InternalEventResults",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_MeasurementEventResults"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MeasurementEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasurementEventResults"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "ue-positioning-MeasurementEventResults",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare",
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
     * Get the type descriptor (TypeInfo) of 'this' EventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventResults
