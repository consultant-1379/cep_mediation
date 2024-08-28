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
 * Define the ASN1 Type MeasurementReport_v860ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementReport_v860ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReport_v860ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReport_v860ext_IEs(rrc.informationelements.ActivationTime activationTime, 
		    rrc.informationelements.MeasuredResults_v860ext measuredResults, 
		    rrc.informationelements.MeasuredResultsList_v860ext additionalMeasuredResults, 
		    rrc.informationelements.EventResults_v860ext eventResults, 
		    rrc.informationelements.EUTRA_MeasuredResults eutra_MeasuredResults, 
		    rrc.informationelements.EUTRA_EventResults eutra_EventResults)
    {
	setActivationTime(activationTime);
	setMeasuredResults(measuredResults);
	setAdditionalMeasuredResults(additionalMeasuredResults);
	setEventResults(eventResults);
	setEutra_MeasuredResults(eutra_MeasuredResults);
	setEutra_EventResults(eutra_EventResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ActivationTime();
	mComponents[1] = new rrc.informationelements.MeasuredResults_v860ext();
	mComponents[2] = new rrc.informationelements.MeasuredResultsList_v860ext();
	mComponents[3] = new rrc.informationelements.EventResults_v860ext();
	mComponents[4] = new rrc.informationelements.EUTRA_MeasuredResults();
	mComponents[5] = new rrc.informationelements.EUTRA_EventResults();
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
		return new rrc.informationelements.ActivationTime();
	    case 1:
		return new rrc.informationelements.MeasuredResults_v860ext();
	    case 2:
		return new rrc.informationelements.MeasuredResultsList_v860ext();
	    case 3:
		return new rrc.informationelements.EventResults_v860ext();
	    case 4:
		return new rrc.informationelements.EUTRA_MeasuredResults();
	    case 5:
		return new rrc.informationelements.EUTRA_EventResults();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "activationTime"
    public rrc.informationelements.ActivationTime getActivationTime()
    {
	return (rrc.informationelements.ActivationTime)mComponents[0];
    }
    
    public void setActivationTime(rrc.informationelements.ActivationTime activationTime)
    {
	mComponents[0] = activationTime;
    }
    
    public boolean hasActivationTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteActivationTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measuredResults"
    public rrc.informationelements.MeasuredResults_v860ext getMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResults_v860ext)mComponents[1];
    }
    
    public void setMeasuredResults(rrc.informationelements.MeasuredResults_v860ext measuredResults)
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
    
    
    // Methods for field "additionalMeasuredResults"
    public rrc.informationelements.MeasuredResultsList_v860ext getAdditionalMeasuredResults()
    {
	return (rrc.informationelements.MeasuredResultsList_v860ext)mComponents[2];
    }
    
    public void setAdditionalMeasuredResults(rrc.informationelements.MeasuredResultsList_v860ext additionalMeasuredResults)
    {
	mComponents[2] = additionalMeasuredResults;
    }
    
    public boolean hasAdditionalMeasuredResults()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAdditionalMeasuredResults()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "eventResults"
    public rrc.informationelements.EventResults_v860ext getEventResults()
    {
	return (rrc.informationelements.EventResults_v860ext)mComponents[3];
    }
    
    public void setEventResults(rrc.informationelements.EventResults_v860ext eventResults)
    {
	mComponents[3] = eventResults;
    }
    
    public boolean hasEventResults()
    {
	return componentIsPresent(3);
    }
    
    public void deleteEventResults()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "eutra_MeasuredResults"
    public rrc.informationelements.EUTRA_MeasuredResults getEutra_MeasuredResults()
    {
	return (rrc.informationelements.EUTRA_MeasuredResults)mComponents[4];
    }
    
    public void setEutra_MeasuredResults(rrc.informationelements.EUTRA_MeasuredResults eutra_MeasuredResults)
    {
	mComponents[4] = eutra_MeasuredResults;
    }
    
    public boolean hasEutra_MeasuredResults()
    {
	return componentIsPresent(4);
    }
    
    public void deleteEutra_MeasuredResults()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "eutra_EventResults"
    public rrc.informationelements.EUTRA_EventResults getEutra_EventResults()
    {
	return (rrc.informationelements.EUTRA_EventResults)mComponents[5];
    }
    
    public void setEutra_EventResults(rrc.informationelements.EUTRA_EventResults eutra_EventResults)
    {
	mComponents[5] = eutra_EventResults;
    }
    
    public boolean hasEutra_EventResults()
    {
	return componentIsPresent(5);
    }
    
    public void deleteEutra_EventResults()
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
	    "rrc.pdu_definitions",
	    "MeasurementReport_v860ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementReport-v860ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ActivationTime"
			    ),
			    new QName (
				"InformationElements",
				"ActivationTime"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.ActivationTime(0), 
				    new rrc.informationelements.ActivationTime(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "activationTime",
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
				"MeasuredResults_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResults-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasuredResults_v860ext"
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
		    "measuredResults",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasuredResultsList_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"MeasuredResultsList-v860ext"
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
				    "MeasuredResultsList_v860ext$Sequence_"
				)
			    )
			)
		    ),
		    "additionalMeasuredResults",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EventResults_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"EventResults-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EventResults_v860ext"
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
				"EUTRA_MeasuredResults"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-MeasuredResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_MeasuredResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_MeasuredResults"
				)
			    ),
			    0
			)
		    ),
		    "eutra-MeasuredResults",
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
				"EUTRA_EventResults"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-EventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_EventResults"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_EventResults"
				)
			    ),
			    0
			)
		    ),
		    "eutra-EventResults",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReport_v860ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReport_v860ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReport_v860ext_IEs
