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
 * Define the ASN1 Type UE_Positioning_MeasurementEventResults_v770ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_Positioning_MeasurementEventResults_v770ext extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_MeasurementEventResults_v770ext()
    {
    }
    
    public static final  int  event7a_chosen = 1;
    public static final  int  event7c_chosen = 2;
    public static final  int  event7d_chosen = 3;
    public static final  int  spare_chosen = 4;
    
    // Methods for field "event7a"
    public static UE_Positioning_MeasurementEventResults_v770ext createUE_Positioning_MeasurementEventResults_v770extWithEvent7a(UE_Positioning_PositionEstimateInfo_v770ext event7a)
    {
	UE_Positioning_MeasurementEventResults_v770ext __object = new UE_Positioning_MeasurementEventResults_v770ext();

	__object.setEvent7a(event7a);
	return __object;
    }
    
    public boolean hasEvent7a()
    {
	return getChosenFlag() == event7a_chosen;
    }
    
    public void setEvent7a(UE_Positioning_PositionEstimateInfo_v770ext event7a)
    {
	setChosenValue(event7a);
	setChosenFlag(event7a_chosen);
    }
    
    
    // Methods for field "event7c"
    public static UE_Positioning_MeasurementEventResults_v770ext createUE_Positioning_MeasurementEventResults_v770extWithEvent7c(UE_Positioning_GPS_MeasurementResults_v770ext event7c)
    {
	UE_Positioning_MeasurementEventResults_v770ext __object = new UE_Positioning_MeasurementEventResults_v770ext();

	__object.setEvent7c(event7c);
	return __object;
    }
    
    public boolean hasEvent7c()
    {
	return getChosenFlag() == event7c_chosen;
    }
    
    public void setEvent7c(UE_Positioning_GPS_MeasurementResults_v770ext event7c)
    {
	setChosenValue(event7c);
	setChosenFlag(event7c_chosen);
    }
    
    
    // Methods for field "event7d"
    public static UE_Positioning_MeasurementEventResults_v770ext createUE_Positioning_MeasurementEventResults_v770extWithEvent7d(UE_Positioning_GANSS_MeasuredResults event7d)
    {
	UE_Positioning_MeasurementEventResults_v770ext __object = new UE_Positioning_MeasurementEventResults_v770ext();

	__object.setEvent7d(event7d);
	return __object;
    }
    
    public boolean hasEvent7d()
    {
	return getChosenFlag() == event7d_chosen;
    }
    
    public void setEvent7d(UE_Positioning_GANSS_MeasuredResults event7d)
    {
	setChosenValue(event7d);
	setChosenFlag(event7d_chosen);
    }
    
    
    // Methods for field "spare"
    public static UE_Positioning_MeasurementEventResults_v770ext createUE_Positioning_MeasurementEventResults_v770extWithSpare(Null spare)
    {
	UE_Positioning_MeasurementEventResults_v770ext __object = new UE_Positioning_MeasurementEventResults_v770ext();

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
	    case event7a_chosen:
		return new UE_Positioning_PositionEstimateInfo_v770ext();
	    case event7c_chosen:
		return new UE_Positioning_GPS_MeasurementResults_v770ext();
	    case event7d_chosen:
		return new UE_Positioning_GANSS_MeasuredResults();
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
	    "UE_Positioning_MeasurementEventResults_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MeasurementEventResults-v770ext"
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
				"UE_Positioning_PositionEstimateInfo_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-PositionEstimateInfo-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_PositionEstimateInfo_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_PositionEstimateInfo_v770ext"
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
				"UE_Positioning_GPS_MeasurementResults_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-MeasurementResults-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_MeasurementResults_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_MeasurementResults_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "event7c",
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
				"UE_Positioning_GANSS_MeasuredResults"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-MeasuredResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_MeasuredResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_MeasuredResults"
				)
			    ),
			    0
			)
		    ),
		    "event7d",
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
		    "spare",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementEventResults_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MeasurementEventResults_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MeasurementEventResults_v770ext
