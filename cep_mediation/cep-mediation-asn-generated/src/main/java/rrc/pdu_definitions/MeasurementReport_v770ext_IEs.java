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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MeasurementReport_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementReport_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReport_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReport_v770ext_IEs(rrc.informationelements.MeasuredResults_v770ext measuredResults, 
		    rrc.informationelements.MeasuredResultsList_v770xet additionalMeasuredResults, 
		    rrc.informationelements.EventResults_v770ext eventResults, 
		    rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext ue_Positioning_OTDOA_MeasuredResults)
    {
	setMeasuredResults(measuredResults);
	setAdditionalMeasuredResults(additionalMeasuredResults);
	setEventResults(eventResults);
	setUe_Positioning_OTDOA_MeasuredResults(ue_Positioning_OTDOA_MeasuredResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasuredResults_v770ext();
	mComponents[1] = new rrc.informationelements.MeasuredResultsList_v770xet();
	mComponents[2] = new rrc.informationelements.EventResults_v770ext();
	mComponents[3] = new rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext();
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
		return new rrc.informationelements.MeasuredResults_v770ext();
	    case 1:
		return new rrc.informationelements.MeasuredResultsList_v770xet();
	    case 2:
		return new rrc.informationelements.EventResults_v770ext();
	    case 3:
		return new rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measuredResults"
    public rrc.informationelements.MeasuredResults_v770ext getMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResults_v770ext)mComponents[0];
    }
    
    public void setMeasuredResults(rrc.informationelements.MeasuredResults_v770ext measuredResults)
    {
	mComponents[0] = measuredResults;
    }
    
    public boolean hasMeasuredResults()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMeasuredResults()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "additionalMeasuredResults"
    public rrc.informationelements.MeasuredResultsList_v770xet getAdditionalMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResultsList_v770xet)mComponents[1];
    }
    
    public void setAdditionalMeasuredResults(rrc.informationelements.MeasuredResultsList_v770xet additionalMeasuredResults)
    {
	mComponents[1] = additionalMeasuredResults;
    }
    
    public boolean hasAdditionalMeasuredResults()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAdditionalMeasuredResults()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "eventResults"
    public rrc.informationelements.EventResults_v770ext getEventResults()
    {
	return (rrc.informationelements.EventResults_v770ext)mComponents[2];
    }
    
    public void setEventResults(rrc.informationelements.EventResults_v770ext eventResults)
    {
	mComponents[2] = eventResults;
    }
    
    public boolean hasEventResults()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEventResults()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_Positioning_OTDOA_MeasuredResults"
    public rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext getUe_Positioning_OTDOA_MeasuredResults()
    {
	return (rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext)mComponents[3];
    }
    
    public void setUe_Positioning_OTDOA_MeasuredResults(rrc.informationelements.UE_Positioning_OTDOA_MeasuredResultsTDD_ext ue_Positioning_OTDOA_MeasuredResults)
    {
	mComponents[3] = ue_Positioning_OTDOA_MeasuredResults;
    }
    
    public boolean hasUe_Positioning_OTDOA_MeasuredResults()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_Positioning_OTDOA_MeasuredResults()
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
	    "rrc.pdu_definitions",
	    "MeasurementReport_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementReport-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResults_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResults-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults_v770ext"
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
		    "measuredResults",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsList_v770xet"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsList-v770xet"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsList_v770xet$Sequence_"
				)
			    )
			)
		    ),
		    "additionalMeasuredResults",
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
				"EventResults_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"EventResults-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EventResults_v770ext"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0)
				}
			    )
			)
		    ),
		    "eventResults",
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
				"UE_Positioning_OTDOA_MeasuredResultsTDD_ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-MeasuredResultsTDD-ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_MeasuredResultsTDD_ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_MeasuredResultsTDD_ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-OTDOA-MeasuredResults",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReport_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReport_v770ext_IEs
