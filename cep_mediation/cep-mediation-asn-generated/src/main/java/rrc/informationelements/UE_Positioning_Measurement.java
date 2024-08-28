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
 * Define the ASN1 Type UE_Positioning_Measurement from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_Measurement extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_Measurement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_Measurement(UE_Positioning_ReportingQuantity ue_positioning_ReportingQuantity, 
		    UE_Positioning_ReportCriteria reportCriteria, 
		    UE_Positioning_OTDOA_AssistanceData ue_positioning_OTDOA_AssistanceData, 
		    UE_Positioning_GPS_AssistanceData ue_positioning_GPS_AssistanceData)
    {
	setUe_positioning_ReportingQuantity(ue_positioning_ReportingQuantity);
	setReportCriteria(reportCriteria);
	setUe_positioning_OTDOA_AssistanceData(ue_positioning_OTDOA_AssistanceData);
	setUe_positioning_GPS_AssistanceData(ue_positioning_GPS_AssistanceData);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_Measurement(UE_Positioning_ReportingQuantity ue_positioning_ReportingQuantity, 
		    UE_Positioning_ReportCriteria reportCriteria)
    {
	setUe_positioning_ReportingQuantity(ue_positioning_ReportingQuantity);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_ReportingQuantity();
	mComponents[1] = new UE_Positioning_ReportCriteria();
	mComponents[2] = new UE_Positioning_OTDOA_AssistanceData();
	mComponents[3] = new UE_Positioning_GPS_AssistanceData();
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
		return new UE_Positioning_ReportingQuantity();
	    case 1:
		return new UE_Positioning_ReportCriteria();
	    case 2:
		return new UE_Positioning_OTDOA_AssistanceData();
	    case 3:
		return new UE_Positioning_GPS_AssistanceData();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_ReportingQuantity"
    public UE_Positioning_ReportingQuantity getUe_positioning_ReportingQuantity()
    {
	return (UE_Positioning_ReportingQuantity)mComponents[0];
    }
    
    public void setUe_positioning_ReportingQuantity(UE_Positioning_ReportingQuantity ue_positioning_ReportingQuantity)
    {
	mComponents[0] = ue_positioning_ReportingQuantity;
    }
    
    
    // Methods for field "reportCriteria"
    public UE_Positioning_ReportCriteria getReportCriteria()
    {
	return (UE_Positioning_ReportCriteria)mComponents[1];
    }
    
    public void setReportCriteria(UE_Positioning_ReportCriteria reportCriteria)
    {
	mComponents[1] = reportCriteria;
    }
    
    
    // Methods for field "ue_positioning_OTDOA_AssistanceData"
    public UE_Positioning_OTDOA_AssistanceData getUe_positioning_OTDOA_AssistanceData()
    {
	return (UE_Positioning_OTDOA_AssistanceData)mComponents[2];
    }
    
    public void setUe_positioning_OTDOA_AssistanceData(UE_Positioning_OTDOA_AssistanceData ue_positioning_OTDOA_AssistanceData)
    {
	mComponents[2] = ue_positioning_OTDOA_AssistanceData;
    }
    
    public boolean hasUe_positioning_OTDOA_AssistanceData()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_OTDOA_AssistanceData()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_positioning_GPS_AssistanceData"
    public UE_Positioning_GPS_AssistanceData getUe_positioning_GPS_AssistanceData()
    {
	return (UE_Positioning_GPS_AssistanceData)mComponents[3];
    }
    
    public void setUe_positioning_GPS_AssistanceData(UE_Positioning_GPS_AssistanceData ue_positioning_GPS_AssistanceData)
    {
	mComponents[3] = ue_positioning_GPS_AssistanceData;
    }
    
    public boolean hasUe_positioning_GPS_AssistanceData()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_GPS_AssistanceData()
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
	    "rrc.informationelements",
	    "UE_Positioning_Measurement"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-Measurement"
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
				"UE_Positioning_ReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-ReportingQuantity",
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
				"rrc.informationelements",
				"UE_Positioning_ReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-ReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_ReportCriteria"
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
		    "reportCriteria",
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
				"UE_Positioning_OTDOA_AssistanceData"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-OTDOA-AssistanceData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_OTDOA_AssistanceData"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-OTDOA-AssistanceData",
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
				"UE_Positioning_GPS_AssistanceData"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-AssistanceData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_AssistanceData"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-AssistanceData",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_Measurement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_Measurement
