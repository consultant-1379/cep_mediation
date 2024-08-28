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
 * Define the ASN1 Type UE_Positioning_Measurement_v390ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_Measurement_v390ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Measurement_v390ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Measurement_v390ext(UE_Positioning_ReportingQuantity_v390ext ue_positioning_ReportingQuantity_v390ext, 
		    MeasurementValidity measurementValidity, 
		    UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	setUe_positioning_ReportingQuantity_v390ext(ue_positioning_ReportingQuantity_v390ext);
	setMeasurementValidity(measurementValidity);
	setUe_positioning_OTDOA_AssistanceData_UEB(ue_positioning_OTDOA_AssistanceData_UEB);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_ReportingQuantity_v390ext();
	mComponents[1] = new MeasurementValidity();
	mComponents[2] = new UE_Positioning_OTDOA_AssistanceData_UEB();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UE_Positioning_ReportingQuantity_v390ext();
	    case 1:
		return new MeasurementValidity();
	    case 2:
		return new UE_Positioning_OTDOA_AssistanceData_UEB();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_ReportingQuantity_v390ext"
    public UE_Positioning_ReportingQuantity_v390ext getUe_positioning_ReportingQuantity_v390ext()
    {
	return (UE_Positioning_ReportingQuantity_v390ext)mComponents[0];
    }
    
    public void setUe_positioning_ReportingQuantity_v390ext(UE_Positioning_ReportingQuantity_v390ext ue_positioning_ReportingQuantity_v390ext)
    {
	mComponents[0] = ue_positioning_ReportingQuantity_v390ext;
    }
    
    public boolean hasUe_positioning_ReportingQuantity_v390ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_ReportingQuantity_v390ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[1];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[1] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData_UEB"
    public UE_Positioning_OTDOA_AssistanceData_UEB getUe_positioning_OTDOA_AssistanceData_UEB()
    {
	return (UE_Positioning_OTDOA_AssistanceData_UEB)mComponents[2];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData_UEB(UE_Positioning_OTDOA_AssistanceData_UEB ue_positioning_OTDOA_AssistanceData_UEB)
    {
	mComponents[2] = ue_positioning_OTDOA_AssistanceData_UEB;
    }
    
    public boolean hasUe_positioning_OTDOA_AssistanceData_UEB()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_OTDOA_AssistanceData_UEB()
    {
	setComponentAbsent(2);
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
	    "rrc.informationelements",
	    "UE_Positioning_Measurement_v390ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-Measurement-v390ext"
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
				"UE_Positioning_ReportingQuantity_v390ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ReportingQuantity-v390ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity_v390ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity_v390ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-ReportingQuantity-v390ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementValidity"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementValidity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementValidity"
				)
			    ),
			    0
			)
		    ),
		    "measurementValidity",
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
				"UE_Positioning_OTDOA_AssistanceData_UEB"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData-UEB"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData_UEB"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData-UEB",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement_v390ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement_v390ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Measurement_v390ext
