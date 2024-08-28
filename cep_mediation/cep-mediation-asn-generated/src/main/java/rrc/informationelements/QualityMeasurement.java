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
 * Define the ASN1 Type QualityMeasurement from ASN1 Module InformationElements.
 * @see Sequence
 */

public class QualityMeasurement extends Sequence {
    
    /**
     * The default constructor.
     */
    public QualityMeasurement()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public QualityMeasurement(QualityReportingQuantity qualityReportingQuantity, 
		    QualityReportCriteria reportCriteria)
    {
	setQualityReportingQuantity(qualityReportingQuantity);
	setReportCriteria(reportCriteria);
    }
    
    /**
     * Construct with required components.
     */
    public QualityMeasurement(QualityReportCriteria reportCriteria)
    {
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new QualityReportingQuantity();
	mComponents[1] = new QualityReportCriteria();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new QualityReportingQuantity();
	    case 1:
		return new QualityReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "qualityReportingQuantity"
    public QualityReportingQuantity getQualityReportingQuantity()
    {
	return (QualityReportingQuantity)mComponents[0];
    }
    
    public void setQualityReportingQuantity(QualityReportingQuantity qualityReportingQuantity)
    {
	mComponents[0] = qualityReportingQuantity;
    }
    
    public boolean hasQualityReportingQuantity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteQualityReportingQuantity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "reportCriteria"
    public QualityReportCriteria getReportCriteria()
    {
	return (QualityReportCriteria)mComponents[1];
    }
    
    public void setReportCriteria(QualityReportCriteria reportCriteria)
    {
	mComponents[1] = reportCriteria;
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
	    "QualityMeasurement"
	),
	new QName (
	    "InformationElements",
	    "QualityMeasurement"
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
				"QualityReportingQuantity"
			    ),
			    new QName (
				"InformationElements",
				"QualityReportingQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "QualityReportingQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "QualityReportingQuantity"
				)
			    ),
			    0
			)
		    ),
		    "qualityReportingQuantity",
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
				"QualityReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"QualityReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "QualityReportCriteria"
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
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' QualityMeasurement object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' QualityMeasurement object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for QualityMeasurement
