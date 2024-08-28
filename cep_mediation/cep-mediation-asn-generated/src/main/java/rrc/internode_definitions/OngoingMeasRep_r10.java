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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type OngoingMeasRep_r10 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class OngoingMeasRep_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public OngoingMeasRep_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OngoingMeasRep_r10(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    MeasurementCommandWithType_r10 measurementCommandWithType, 
		    rrc.informationelements.MeasurementReportingMode measurementReportingMode, 
		    rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementID_List)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommandWithType(measurementCommandWithType);
	setMeasurementReportingMode(measurementReportingMode);
	setAdditionalMeasurementID_List(additionalMeasurementID_List);
    }
    
    /**
     * Construct with required components.
     */
    public OngoingMeasRep_r10(rrc.informationelements.MeasurementIdentity measurementIdentity, 
		    MeasurementCommandWithType_r10 measurementCommandWithType)
    {
	setMeasurementIdentity(measurementIdentity);
	setMeasurementCommandWithType(measurementCommandWithType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MeasurementIdentity();
	mComponents[1] = new MeasurementCommandWithType_r10();
	mComponents[2] = new rrc.informationelements.MeasurementReportingMode();
	mComponents[3] = new rrc.informationelements.AdditionalMeasurementID_List();
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
		return new rrc.informationelements.MeasurementIdentity();
	    case 1:
		return new MeasurementCommandWithType_r10();
	    case 2:
		return new rrc.informationelements.MeasurementReportingMode();
	    case 3:
		return new rrc.informationelements.AdditionalMeasurementID_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementIdentity"
    public rrc.informationelements.MeasurementIdentity getMeasurementIdentity()
    {
	return (rrc.informationelements.MeasurementIdentity)mComponents[0];
    }
    
    public void setMeasurementIdentity(rrc.informationelements.MeasurementIdentity measurementIdentity)
    {
	mComponents[0] = measurementIdentity;
    }
    
    
    // Methods for field "measurementCommandWithType"
    public MeasurementCommandWithType_r10 getMeasurementCommandWithType()
    {
	return (MeasurementCommandWithType_r10)mComponents[1];
    }
    
    public void setMeasurementCommandWithType(MeasurementCommandWithType_r10 measurementCommandWithType)
    {
	mComponents[1] = measurementCommandWithType;
    }
    
    
    // Methods for field "measurementReportingMode"
    public rrc.informationelements.MeasurementReportingMode getMeasurementReportingMode()
    {
	return (rrc.informationelements.MeasurementReportingMode)mComponents[2];
    }
    
    public void setMeasurementReportingMode(rrc.informationelements.MeasurementReportingMode measurementReportingMode)
    {
	mComponents[2] = measurementReportingMode;
    }
    
    public boolean hasMeasurementReportingMode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasurementReportingMode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "additionalMeasurementID_List"
    public rrc.informationelements.AdditionalMeasurementID_List getAdditionalMeasurementID_List()
    {
	return (rrc.informationelements.AdditionalMeasurementID_List)mComponents[3];
    }
    
    public void setAdditionalMeasurementID_List(rrc.informationelements.AdditionalMeasurementID_List additionalMeasurementID_List)
    {
	mComponents[3] = additionalMeasurementID_List;
    }
    
    public boolean hasAdditionalMeasurementID_List()
    {
	return componentIsPresent(3);
    }
    
    public void deleteAdditionalMeasurementID_List()
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
	    "rrc.internode_definitions",
	    "OngoingMeasRep_r10"
	),
	new QName (
	    "Internode-definitions",
	    "OngoingMeasRep-r10"
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
				"MeasurementIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MeasurementIdentity(1), 
				    new rrc.informationelements.MeasurementIdentity(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "measurementIdentity",
		    0,
		    2,
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
				"rrc.internode_definitions",
				"MeasurementCommandWithType_r10"
			    ),
			    new QName (
				"Internode-definitions",
				"MeasurementCommandWithType-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.internode_definitions",
				    "MeasurementCommandWithType_r10"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "measurementCommandWithType",
		    1,
		    2,
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
				"MeasurementReportingMode"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementReportingMode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementReportingMode"
				)
			    ),
			    0
			)
		    ),
		    "measurementReportingMode",
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
				"AdditionalMeasurementID_List"
			    ),
			    new QName (
				"InformationElements",
				"AdditionalMeasurementID-List"
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
				    "MeasurementIdentity"
				)
			    )
			)
		    ),
		    "additionalMeasurementID-List",
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' OngoingMeasRep_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OngoingMeasRep_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OngoingMeasRep_r10
