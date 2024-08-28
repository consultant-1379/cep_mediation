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
 * Define the ASN1 Type UE_Positioning_MeasurementEventResults from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_Positioning_MeasurementEventResults extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_MeasurementEventResults()
    {
    }
    
    public static final  int  event7a_chosen = 1;
    public static final  int  event7b_chosen = 2;
    public static final  int  event7c_chosen = 3;
    public static final  int  additionalOrReplacedPosMeasEvent_chosen = 4;
    
    // Methods for field "event7a"
    public static UE_Positioning_MeasurementEventResults createUE_Positioning_MeasurementEventResultsWithEvent7a(UE_Positioning_PositionEstimateInfo event7a)
    {
	UE_Positioning_MeasurementEventResults __object = new UE_Positioning_MeasurementEventResults();

	__object.setEvent7a(event7a);
	return __object;
    }
    
    public boolean hasEvent7a()
    {
	return getChosenFlag() == event7a_chosen;
    }
    
    public void setEvent7a(UE_Positioning_PositionEstimateInfo event7a)
    {
	setChosenValue(event7a);
	setChosenFlag(event7a_chosen);
    }
    
    
    // Methods for field "event7b"
    public static UE_Positioning_MeasurementEventResults createUE_Positioning_MeasurementEventResultsWithEvent7b(UE_Positioning_OTDOA_Measurement event7b)
    {
	UE_Positioning_MeasurementEventResults __object = new UE_Positioning_MeasurementEventResults();

	__object.setEvent7b(event7b);
	return __object;
    }
    
    public boolean hasEvent7b()
    {
	return getChosenFlag() == event7b_chosen;
    }
    
    public void setEvent7b(UE_Positioning_OTDOA_Measurement event7b)
    {
	setChosenValue(event7b);
	setChosenFlag(event7b_chosen);
    }
    
    
    // Methods for field "event7c"
    public static UE_Positioning_MeasurementEventResults createUE_Positioning_MeasurementEventResultsWithEvent7c(UE_Positioning_GPS_MeasurementResults event7c)
    {
	UE_Positioning_MeasurementEventResults __object = new UE_Positioning_MeasurementEventResults();

	__object.setEvent7c(event7c);
	return __object;
    }
    
    public boolean hasEvent7c()
    {
	return getChosenFlag() == event7c_chosen;
    }
    
    public void setEvent7c(UE_Positioning_GPS_MeasurementResults event7c)
    {
	setChosenValue(event7c);
	setChosenFlag(event7c_chosen);
    }
    
    
    // Methods for field "additionalOrReplacedPosMeasEvent"
    public static UE_Positioning_MeasurementEventResults createUE_Positioning_MeasurementEventResultsWithAdditionalOrReplacedPosMeasEvent(Null additionalOrReplacedPosMeasEvent)
    {
	UE_Positioning_MeasurementEventResults __object = new UE_Positioning_MeasurementEventResults();

	__object.setAdditionalOrReplacedPosMeasEvent(additionalOrReplacedPosMeasEvent);
	return __object;
    }
    
    public boolean hasAdditionalOrReplacedPosMeasEvent()
    {
	return getChosenFlag() == additionalOrReplacedPosMeasEvent_chosen;
    }
    
    public void setAdditionalOrReplacedPosMeasEvent(Null additionalOrReplacedPosMeasEvent)
    {
	setChosenValue(additionalOrReplacedPosMeasEvent);
	setChosenFlag(additionalOrReplacedPosMeasEvent_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case event7a_chosen:
		return new UE_Positioning_PositionEstimateInfo();
	    case event7b_chosen:
		return new UE_Positioning_OTDOA_Measurement();
	    case event7c_chosen:
		return new UE_Positioning_GPS_MeasurementResults();
	    case additionalOrReplacedPosMeasEvent_chosen:
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
	    "UE_Positioning_MeasurementEventResults"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MeasurementEventResults"
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
		    "event7a",
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
		    "event7b",
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
		    "event7c",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "additionalOrReplacedPosMeasEvent",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementEventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementEventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MeasurementEventResults
