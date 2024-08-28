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
 * Define the ASN1 Type IntraFrequencyMeasurement from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFrequencyMeasurement extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFrequencyMeasurement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFrequencyMeasurement(IntraFreqCellInfoList intraFreqCellInfoList, 
		    IntraFreqMeasQuantity intraFreqMeasQuantity, 
		    IntraFreqReportingQuantity intraFreqReportingQuantity, 
		    MeasurementValidity measurementValidity, 
		    IntraFreqReportCriteria reportCriteria)
    {
	setIntraFreqCellInfoList(intraFreqCellInfoList);
	setIntraFreqMeasQuantity(intraFreqMeasQuantity);
	setIntraFreqReportingQuantity(intraFreqReportingQuantity);
	setMeasurementValidity(measurementValidity);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqCellInfoList();
	mComponents[1] = new IntraFreqMeasQuantity();
	mComponents[2] = new IntraFreqReportingQuantity();
	mComponents[3] = new MeasurementValidity();
	mComponents[4] = new IntraFreqReportCriteria();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new IntraFreqCellInfoList();
	    case 1:
		return new IntraFreqMeasQuantity();
	    case 2:
		return new IntraFreqReportingQuantity();
	    case 3:
		return new MeasurementValidity();
	    case 4:
		return new IntraFreqReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqCellInfoList"
    public IntraFreqCellInfoList getIntraFreqCellInfoList()
    {
	return (IntraFreqCellInfoList)mComponents[0];
    }
    
    public void setIntraFreqCellInfoList(IntraFreqCellInfoList intraFreqCellInfoList)
    {
	mComponents[0] = intraFreqCellInfoList;
    }
    
    public boolean hasIntraFreqCellInfoList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIntraFreqCellInfoList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "intraFreqMeasQuantity"
    public IntraFreqMeasQuantity getIntraFreqMeasQuantity()
    {
	return (IntraFreqMeasQuantity)mComponents[1];
    }
    
    public void setIntraFreqMeasQuantity(IntraFreqMeasQuantity intraFreqMeasQuantity)
    {
	mComponents[1] = intraFreqMeasQuantity;
    }
    
    public boolean hasIntraFreqMeasQuantity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntraFreqMeasQuantity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "intraFreqReportingQuantity"
    public IntraFreqReportingQuantity getIntraFreqReportingQuantity()
    {
	return (IntraFreqReportingQuantity)mComponents[2];
    }
    
    public void setIntraFreqReportingQuantity(IntraFreqReportingQuantity intraFreqReportingQuantity)
    {
	mComponents[2] = intraFreqReportingQuantity;
    }
    
    public boolean hasIntraFreqReportingQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIntraFreqReportingQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[3];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[3] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "reportCriteria"
    public IntraFreqReportCriteria getReportCriteria()
    {
	return (IntraFreqReportCriteria)mComponents[4];
    }
    
    public void setReportCriteria(IntraFreqReportCriteria reportCriteria)
    {
	mComponents[4] = reportCriteria;
    }
    
    public boolean hasReportCriteria()
    {
	return componentIsPresent(4);
    }
    
    public void deleteReportCriteria()
    {
	setComponentAbsent(4);
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
	    "IntraFrequencyMeasurement"
	),
	new QName (
	    "InformationElements",
	    "IntraFrequencyMeasurement"
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
				"IntraFreqCellInfoList"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellInfoList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoList"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqCellInfoList",
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
				"IntraFreqMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqMeasQuantity",
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
				"IntraFreqReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqReportingQuantity",
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportCriteria"
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
		    4,
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
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFrequencyMeasurement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFrequencyMeasurement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFrequencyMeasurement
