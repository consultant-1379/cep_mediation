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
 * Define the ASN1 Type IntraFrequencyMeasurement_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFrequencyMeasurement_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFrequencyMeasurement_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFrequencyMeasurement_r10(IntraFreqCellInfoList_r10 intraFreqCellInfoList, 
		    IntraFreqCellInfoListOnSecULFreq intraFreqCellInfoListOnSecULFreq, 
		    IntraFreqMeasQuantity intraFreqMeasQuantity, 
		    IntraFreqReportingQuantity intraFreqReportingQuantity, 
		    MeasurementValidity measurementValidity, 
		    IntraFreqReportCriteria_r9 reportCriteria)
    {
	setIntraFreqCellInfoList(intraFreqCellInfoList);
	setIntraFreqCellInfoListOnSecULFreq(intraFreqCellInfoListOnSecULFreq);
	setIntraFreqMeasQuantity(intraFreqMeasQuantity);
	setIntraFreqReportingQuantity(intraFreqReportingQuantity);
	setMeasurementValidity(measurementValidity);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqCellInfoList_r10();
	mComponents[1] = new IntraFreqCellInfoListOnSecULFreq();
	mComponents[2] = new IntraFreqMeasQuantity();
	mComponents[3] = new IntraFreqReportingQuantity();
	mComponents[4] = new MeasurementValidity();
	mComponents[5] = new IntraFreqReportCriteria_r9();
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
		return new IntraFreqCellInfoList_r10();
	    case 1:
		return new IntraFreqCellInfoListOnSecULFreq();
	    case 2:
		return new IntraFreqMeasQuantity();
	    case 3:
		return new IntraFreqReportingQuantity();
	    case 4:
		return new MeasurementValidity();
	    case 5:
		return new IntraFreqReportCriteria_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqCellInfoList"
    public IntraFreqCellInfoList_r10 getIntraFreqCellInfoList()
    {
	return (IntraFreqCellInfoList_r10)mComponents[0];
    }
    
    public void setIntraFreqCellInfoList(IntraFreqCellInfoList_r10 intraFreqCellInfoList)
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
    
    
    // Methods for field "intraFreqCellInfoListOnSecULFreq"
    public IntraFreqCellInfoListOnSecULFreq getIntraFreqCellInfoListOnSecULFreq()
    {
	return (IntraFreqCellInfoListOnSecULFreq)mComponents[1];
    }
    
    public void setIntraFreqCellInfoListOnSecULFreq(IntraFreqCellInfoListOnSecULFreq intraFreqCellInfoListOnSecULFreq)
    {
	mComponents[1] = intraFreqCellInfoListOnSecULFreq;
    }
    
    public boolean hasIntraFreqCellInfoListOnSecULFreq()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIntraFreqCellInfoListOnSecULFreq()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "intraFreqMeasQuantity"
    public IntraFreqMeasQuantity getIntraFreqMeasQuantity()
    {
	return (IntraFreqMeasQuantity)mComponents[2];
    }
    
    public void setIntraFreqMeasQuantity(IntraFreqMeasQuantity intraFreqMeasQuantity)
    {
	mComponents[2] = intraFreqMeasQuantity;
    }
    
    public boolean hasIntraFreqMeasQuantity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIntraFreqMeasQuantity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "intraFreqReportingQuantity"
    public IntraFreqReportingQuantity getIntraFreqReportingQuantity()
    {
	return (IntraFreqReportingQuantity)mComponents[3];
    }
    
    public void setIntraFreqReportingQuantity(IntraFreqReportingQuantity intraFreqReportingQuantity)
    {
	mComponents[3] = intraFreqReportingQuantity;
    }
    
    public boolean hasIntraFreqReportingQuantity()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIntraFreqReportingQuantity()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "measurementValidity"
    public MeasurementValidity getMeasurementValidity()
    {
	return (MeasurementValidity)mComponents[4];
    }
    
    public void setMeasurementValidity(MeasurementValidity measurementValidity)
    {
	mComponents[4] = measurementValidity;
    }
    
    public boolean hasMeasurementValidity()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMeasurementValidity()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "reportCriteria"
    public IntraFreqReportCriteria_r9 getReportCriteria()
    {
	return (IntraFreqReportCriteria_r9)mComponents[5];
    }
    
    public void setReportCriteria(IntraFreqReportCriteria_r9 reportCriteria)
    {
	mComponents[5] = reportCriteria;
    }
    
    public boolean hasReportCriteria()
    {
	return componentIsPresent(5);
    }
    
    public void deleteReportCriteria()
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
	    "rrc.informationelements",
	    "IntraFrequencyMeasurement_r10"
	),
	new QName (
	    "InformationElements",
	    "IntraFrequencyMeasurement-r10"
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
				"IntraFreqCellInfoList_r10"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellInfoList-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoList_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoList_r10"
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
				"IntraFreqCellInfoListOnSecULFreq"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqCellInfoListOnSecULFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoListOnSecULFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqCellInfoListOnSecULFreq"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqCellInfoListOnSecULFreq",
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqReportCriteria_r9"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqReportCriteria-r9"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqReportCriteria_r9"
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFrequencyMeasurement_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFrequencyMeasurement_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFrequencyMeasurement_r10
