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
 * Define the ASN1 Type ReportingInfoForCellDCH from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ReportingInfoForCellDCH extends Sequence {
    
    /**
     * The default constructor.
     */
    public ReportingInfoForCellDCH()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ReportingInfoForCellDCH(IntraFreqReportingQuantity intraFreqReportingQuantity, 
		    MeasurementReportingMode measurementReportingMode, 
		    CellDCH_ReportCriteria reportCriteria)
    {
	setIntraFreqReportingQuantity(intraFreqReportingQuantity);
	setMeasurementReportingMode(measurementReportingMode);
	setReportCriteria(reportCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqReportingQuantity();
	mComponents[1] = new MeasurementReportingMode();
	mComponents[2] = new CellDCH_ReportCriteria();
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
		return new IntraFreqReportingQuantity();
	    case 1:
		return new MeasurementReportingMode();
	    case 2:
		return new CellDCH_ReportCriteria();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqReportingQuantity"
    public IntraFreqReportingQuantity getIntraFreqReportingQuantity()
    {
	return (IntraFreqReportingQuantity)mComponents[0];
    }
    
    public void setIntraFreqReportingQuantity(IntraFreqReportingQuantity intraFreqReportingQuantity)
    {
	mComponents[0] = intraFreqReportingQuantity;
    }
    
    
    // Methods for field "measurementReportingMode"
    public MeasurementReportingMode getMeasurementReportingMode()
    {
	return (MeasurementReportingMode)mComponents[1];
    }
    
    public void setMeasurementReportingMode(MeasurementReportingMode measurementReportingMode)
    {
	mComponents[1] = measurementReportingMode;
    }
    
    
    // Methods for field "reportCriteria"
    public CellDCH_ReportCriteria getReportCriteria()
    {
	return (CellDCH_ReportCriteria)mComponents[2];
    }
    
    public void setReportCriteria(CellDCH_ReportCriteria reportCriteria)
    {
	mComponents[2] = reportCriteria;
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
	    "ReportingInfoForCellDCH"
	),
	new QName (
	    "InformationElements",
	    "ReportingInfoForCellDCH"
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
		    0,
		    2,
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
		    1,
		    2,
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
				"CellDCH_ReportCriteria"
			    ),
			    new QName (
				"InformationElements",
				"CellDCH-ReportCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellDCH_ReportCriteria"
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
		    "reportCriteria",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportingInfoForCellDCH object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportingInfoForCellDCH object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportingInfoForCellDCH
