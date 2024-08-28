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
 * Define the ASN1 Type MeasuredResults_LCR_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasuredResults_LCR_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasuredResults_LCR_r4()
    {
    }
    
    public static final  int  intraFreqMeasuredResultsList_chosen = 1;
    public static final  int  interFreqMeasuredResultsList_chosen = 2;
    public static final  int  interRATMeasuredResultsList_chosen = 3;
    public static final  int  trafficVolumeMeasuredResultsList_chosen = 4;
    public static final  int  qualityMeasuredResults_chosen = 5;
    public static final  int  ue_InternalMeasuredResults_chosen = 6;
    public static final  int  ue_positioniing_MeasuredResults_chosen = 7;
    public static final  int  spare_chosen = 8;
    
    // Methods for field "intraFreqMeasuredResultsList"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithIntraFreqMeasuredResultsList(IntraFreqMeasuredResultsList intraFreqMeasuredResultsList)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setIntraFreqMeasuredResultsList(intraFreqMeasuredResultsList);
	return __object;
    }
    
    public boolean hasIntraFreqMeasuredResultsList()
    {
	return getChosenFlag() == intraFreqMeasuredResultsList_chosen;
    }
    
    public void setIntraFreqMeasuredResultsList(IntraFreqMeasuredResultsList intraFreqMeasuredResultsList)
    {
	setChosenValue(intraFreqMeasuredResultsList);
	setChosenFlag(intraFreqMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "interFreqMeasuredResultsList"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithInterFreqMeasuredResultsList(InterFreqMeasuredResultsList interFreqMeasuredResultsList)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setInterFreqMeasuredResultsList(interFreqMeasuredResultsList);
	return __object;
    }
    
    public boolean hasInterFreqMeasuredResultsList()
    {
	return getChosenFlag() == interFreqMeasuredResultsList_chosen;
    }
    
    public void setInterFreqMeasuredResultsList(InterFreqMeasuredResultsList interFreqMeasuredResultsList)
    {
	setChosenValue(interFreqMeasuredResultsList);
	setChosenFlag(interFreqMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "interRATMeasuredResultsList"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithInterRATMeasuredResultsList(InterRATMeasuredResultsList interRATMeasuredResultsList)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setInterRATMeasuredResultsList(interRATMeasuredResultsList);
	return __object;
    }
    
    public boolean hasInterRATMeasuredResultsList()
    {
	return getChosenFlag() == interRATMeasuredResultsList_chosen;
    }
    
    public void setInterRATMeasuredResultsList(InterRATMeasuredResultsList interRATMeasuredResultsList)
    {
	setChosenValue(interRATMeasuredResultsList);
	setChosenFlag(interRATMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "trafficVolumeMeasuredResultsList"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithTrafficVolumeMeasuredResultsList(TrafficVolumeMeasuredResultsList trafficVolumeMeasuredResultsList)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setTrafficVolumeMeasuredResultsList(trafficVolumeMeasuredResultsList);
	return __object;
    }
    
    public boolean hasTrafficVolumeMeasuredResultsList()
    {
	return getChosenFlag() == trafficVolumeMeasuredResultsList_chosen;
    }
    
    public void setTrafficVolumeMeasuredResultsList(TrafficVolumeMeasuredResultsList trafficVolumeMeasuredResultsList)
    {
	setChosenValue(trafficVolumeMeasuredResultsList);
	setChosenFlag(trafficVolumeMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "qualityMeasuredResults"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithQualityMeasuredResults(QualityMeasuredResults qualityMeasuredResults)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setQualityMeasuredResults(qualityMeasuredResults);
	return __object;
    }
    
    public boolean hasQualityMeasuredResults()
    {
	return getChosenFlag() == qualityMeasuredResults_chosen;
    }
    
    public void setQualityMeasuredResults(QualityMeasuredResults qualityMeasuredResults)
    {
	setChosenValue(qualityMeasuredResults);
	setChosenFlag(qualityMeasuredResults_chosen);
    }
    
    
    // Methods for field "ue_InternalMeasuredResults"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithUe_InternalMeasuredResults(UE_InternalMeasuredResults_LCR_r4 ue_InternalMeasuredResults)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setUe_InternalMeasuredResults(ue_InternalMeasuredResults);
	return __object;
    }
    
    public boolean hasUe_InternalMeasuredResults()
    {
	return getChosenFlag() == ue_InternalMeasuredResults_chosen;
    }
    
    public void setUe_InternalMeasuredResults(UE_InternalMeasuredResults_LCR_r4 ue_InternalMeasuredResults)
    {
	setChosenValue(ue_InternalMeasuredResults);
	setChosenFlag(ue_InternalMeasuredResults_chosen);
    }
    
    
    // Methods for field "ue_positioniing_MeasuredResults"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithUe_positioniing_MeasuredResults(UE_Positioning_MeasuredResults ue_positioniing_MeasuredResults)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

	__object.setUe_positioniing_MeasuredResults(ue_positioniing_MeasuredResults);
	return __object;
    }
    
    public boolean hasUe_positioniing_MeasuredResults()
    {
	return getChosenFlag() == ue_positioniing_MeasuredResults_chosen;
    }
    
    public void setUe_positioniing_MeasuredResults(UE_Positioning_MeasuredResults ue_positioniing_MeasuredResults)
    {
	setChosenValue(ue_positioniing_MeasuredResults);
	setChosenFlag(ue_positioniing_MeasuredResults_chosen);
    }
    
    
    // Methods for field "spare"
    public static MeasuredResults_LCR_r4 createMeasuredResults_LCR_r4WithSpare(Null spare)
    {
	MeasuredResults_LCR_r4 __object = new MeasuredResults_LCR_r4();

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
	    case intraFreqMeasuredResultsList_chosen:
		return new IntraFreqMeasuredResultsList();
	    case interFreqMeasuredResultsList_chosen:
		return new InterFreqMeasuredResultsList();
	    case interRATMeasuredResultsList_chosen:
		return new InterRATMeasuredResultsList();
	    case trafficVolumeMeasuredResultsList_chosen:
		return new TrafficVolumeMeasuredResultsList();
	    case qualityMeasuredResults_chosen:
		return new QualityMeasuredResults();
	    case ue_InternalMeasuredResults_chosen:
		return new UE_InternalMeasuredResults_LCR_r4();
	    case ue_positioniing_MeasuredResults_chosen:
		return new UE_Positioning_MeasuredResults();
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
	    "MeasuredResults_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResults-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqMeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqMeasuredResultsList"
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
				    "CellMeasuredResults"
				)
			    )
			)
		    ),
		    "intraFreqMeasuredResultsList",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterFreqMeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqMeasuredResultsList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqMeasuredResults"
				)
			    )
			)
		    ),
		    "interFreqMeasuredResultsList",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"InterRATMeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"InterRATMeasuredResultsList"
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
				new QName (
				    "rrc.informationelements",
				    "InterRATMeasuredResults"
				)
			    )
			)
		    ),
		    "interRATMeasuredResultsList",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TrafficVolumeMeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeMeasuredResultsList"
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
				    "TrafficVolumeMeasuredResults"
				)
			    )
			)
		    ),
		    "trafficVolumeMeasuredResultsList",
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
				"QualityMeasuredResults"
			    ),
			    new QName (
				"InformationElements",
				"QualityMeasuredResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "QualityMeasuredResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "QualityMeasuredResults"
				)
			    ),
			    0
			)
		    ),
		    "qualityMeasuredResults",
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
				"UE_InternalMeasuredResults_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalMeasuredResults-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasuredResults_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasuredResults_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "ue-InternalMeasuredResults",
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
				"UE_Positioning_MeasuredResults"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MeasuredResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasuredResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasuredResults"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioniing-MeasuredResults",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResults_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResults_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResults_LCR_r4
