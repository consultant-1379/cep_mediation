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
 * Define the ASN1 Type MeasurementReport_v920ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementReport_v920ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReport_v920ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReport_v920ext_IEs(rrc.informationelements.CSGProximityIndication cSGProximityIndication, 
		    rrc.informationelements.MeasuredResults_v920ext measuredResults, 
		    rrc.informationelements.MeasuredResultsOnSecUlFreq measuredResultsOnSecUlFreq, 
		    rrc.informationelements.MeasuredResultsList_v920ext additionalMeasuredResults, 
		    rrc.informationelements.MeasuredResultsListOnSecUlFreq additionalMeasuredResultsOnSecUlFreq, 
		    rrc.informationelements.EventResultsOnSecUlFreq eventResultsOnSecUlFreq, 
		    rrc.informationelements.EUTRA_MeasuredResults_v920ext eutra_MeasuredResults)
    {
	setCSGProximityIndication(cSGProximityIndication);
	setMeasuredResults(measuredResults);
	setMeasuredResultsOnSecUlFreq(measuredResultsOnSecUlFreq);
	setAdditionalMeasuredResults(additionalMeasuredResults);
	setAdditionalMeasuredResultsOnSecUlFreq(additionalMeasuredResultsOnSecUlFreq);
	setEventResultsOnSecUlFreq(eventResultsOnSecUlFreq);
	setEutra_MeasuredResults(eutra_MeasuredResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.CSGProximityIndication();
	mComponents[1] = new rrc.informationelements.MeasuredResults_v920ext();
	mComponents[2] = new rrc.informationelements.MeasuredResultsOnSecUlFreq();
	mComponents[3] = new rrc.informationelements.MeasuredResultsList_v920ext();
	mComponents[4] = new rrc.informationelements.MeasuredResultsListOnSecUlFreq();
	mComponents[5] = new rrc.informationelements.EventResultsOnSecUlFreq();
	mComponents[6] = new rrc.informationelements.EUTRA_MeasuredResults_v920ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.CSGProximityIndication();
	    case 1:
		return new rrc.informationelements.MeasuredResults_v920ext();
	    case 2:
		return new rrc.informationelements.MeasuredResultsOnSecUlFreq();
	    case 3:
		return new rrc.informationelements.MeasuredResultsList_v920ext();
	    case 4:
		return new rrc.informationelements.MeasuredResultsListOnSecUlFreq();
	    case 5:
		return new rrc.informationelements.EventResultsOnSecUlFreq();
	    case 6:
		return new rrc.informationelements.EUTRA_MeasuredResults_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cSGProximityIndication"
    public rrc.informationelements.CSGProximityIndication getCSGProximityIndication()
    {
	return (rrc.informationelements.CSGProximityIndication)mComponents[0];
    }
    
    public void setCSGProximityIndication(rrc.informationelements.CSGProximityIndication cSGProximityIndication)
    {
	mComponents[0] = cSGProximityIndication;
    }
    
    public boolean hasCSGProximityIndication()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCSGProximityIndication()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measuredResults"
    public rrc.informationelements.MeasuredResults_v920ext getMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResults_v920ext)mComponents[1];
    }
    
    public void setMeasuredResults(rrc.informationelements.MeasuredResults_v920ext measuredResults)
    {
	mComponents[1] = measuredResults;
    }
    
    public boolean hasMeasuredResults()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasuredResults()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "measuredResultsOnSecUlFreq"
    public rrc.informationelements.MeasuredResultsOnSecUlFreq getMeasuredResultsOnSecUlFreq()
    {
	return (rrc.informationelements.MeasuredResultsOnSecUlFreq)mComponents[2];
    }
    
    public void setMeasuredResultsOnSecUlFreq(rrc.informationelements.MeasuredResultsOnSecUlFreq measuredResultsOnSecUlFreq)
    {
	mComponents[2] = measuredResultsOnSecUlFreq;
    }
    
    public boolean hasMeasuredResultsOnSecUlFreq()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasuredResultsOnSecUlFreq()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalMeasuredResults"
    public rrc.informationelements.MeasuredResultsList_v920ext getAdditionalMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResultsList_v920ext)mComponents[3];
    }
    
    public void setAdditionalMeasuredResults(rrc.informationelements.MeasuredResultsList_v920ext additionalMeasuredResults)
    {
	mComponents[3] = additionalMeasuredResults;
    }
    
    public boolean hasAdditionalMeasuredResults()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalMeasuredResults()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "additionalMeasuredResultsOnSecUlFreq"
    public rrc.informationelements.MeasuredResultsListOnSecUlFreq getAdditionalMeasuredResultsOnSecUlFreq()
    {
	return (rrc.informationelements.MeasuredResultsListOnSecUlFreq)mComponents[4];
    }
    
    public void setAdditionalMeasuredResultsOnSecUlFreq(rrc.informationelements.MeasuredResultsListOnSecUlFreq additionalMeasuredResultsOnSecUlFreq)
    {
	mComponents[4] = additionalMeasuredResultsOnSecUlFreq;
    }
    
    public boolean hasAdditionalMeasuredResultsOnSecUlFreq()
    {
	return componentIsPresent(4);
    }
    
    public void deleteAdditionalMeasuredResultsOnSecUlFreq()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "eventResultsOnSecUlFreq"
    public rrc.informationelements.EventResultsOnSecUlFreq getEventResultsOnSecUlFreq()
    {
	return (rrc.informationelements.EventResultsOnSecUlFreq)mComponents[5];
    }
    
    public void setEventResultsOnSecUlFreq(rrc.informationelements.EventResultsOnSecUlFreq eventResultsOnSecUlFreq)
    {
	mComponents[5] = eventResultsOnSecUlFreq;
    }
    
    public boolean hasEventResultsOnSecUlFreq()
    {
	return componentIsPresent(5);
    }
    
    public void deleteEventResultsOnSecUlFreq()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "eutra_MeasuredResults"
    public rrc.informationelements.EUTRA_MeasuredResults_v920ext getEutra_MeasuredResults()
    {
	return (rrc.informationelements.EUTRA_MeasuredResults_v920ext)mComponents[6];
    }
    
    public void setEutra_MeasuredResults(rrc.informationelements.EUTRA_MeasuredResults_v920ext eutra_MeasuredResults)
    {
	mComponents[6] = eutra_MeasuredResults;
    }
    
    public boolean hasEutra_MeasuredResults()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEutra_MeasuredResults()
    {
	setComponentAbsent(6);
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
	    "MeasurementReport_v920ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementReport-v920ext-IEs"
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
				"CSGProximityIndication"
			    ),
			    new QName (
				"InformationElements",
				"CSGProximityIndication"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CSGProximityIndication"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CSGProximityIndication"
				)
			    ),
			    0
			)
		    ),
		    "cSGProximityIndication",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResults_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResults-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults_v920ext"
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
				"MeasuredResultsOnSecUlFreq"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsOnSecUlFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnSecUlFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResultsOnSecUlFreq"
				)
			    ),
			    0
			)
		    ),
		    "measuredResultsOnSecUlFreq",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsList-v920ext"
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
				    "MeasuredResults_v920ext"
				)
			    )
			)
		    ),
		    "additionalMeasuredResults",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsListOnSecUlFreq"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsListOnSecUlFreq"
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
				    "MeasuredResultsOnSecUlFreq"
				)
			    )
			)
		    ),
		    "additionalMeasuredResultsOnSecUlFreq",
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
				"EventResultsOnSecUlFreq"
			    ),
			    new QName (
				"InformationElements",
				"EventResultsOnSecUlFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EventResultsOnSecUlFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EventResultsOnSecUlFreq"
				)
			    ),
			    0
			)
		    ),
		    "eventResultsOnSecUlFreq",
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
				"EUTRA_MeasuredResults_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-MeasuredResults-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_MeasuredResults_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_MeasuredResults_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "eutra-MeasuredResults",
		    6,
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
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReport_v920ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport_v920ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReport_v920ext_IEs
