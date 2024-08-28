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
 * Define the ASN1 Type MeasurementReportingMode from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementReportingMode extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementReportingMode()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementReportingMode(TransferMode measurementReportTransferMode, 
		    PeriodicalOrEventTrigger periodicalOrEventTrigger)
    {
	setMeasurementReportTransferMode(measurementReportTransferMode);
	setPeriodicalOrEventTrigger(periodicalOrEventTrigger);
    }
    
    public void initComponents()
    {
	mComponents[0] = TransferMode.acknowledgedModeRLC;
	mComponents[1] = PeriodicalOrEventTrigger.periodical;
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
		return TransferMode.acknowledgedModeRLC;
	    case 1:
		return PeriodicalOrEventTrigger.periodical;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurementReportTransferMode"
    public TransferMode getMeasurementReportTransferMode()
    {
	return (TransferMode)mComponents[0];
    }
    
    public void setMeasurementReportTransferMode(TransferMode measurementReportTransferMode)
    {
	mComponents[0] = measurementReportTransferMode;
    }
    
    
    // Methods for field "periodicalOrEventTrigger"
    public PeriodicalOrEventTrigger getPeriodicalOrEventTrigger()
    {
	return (PeriodicalOrEventTrigger)mComponents[1];
    }
    
    public void setPeriodicalOrEventTrigger(PeriodicalOrEventTrigger periodicalOrEventTrigger)
    {
	mComponents[1] = periodicalOrEventTrigger;
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
	    "MeasurementReportingMode"
	),
	new QName (
	    "InformationElements",
	    "MeasurementReportingMode"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransferMode"
			    ),
			    new QName (
				"InformationElements",
				"TransferMode"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"acknowledgedModeRLC",
					0
				    ),
				    new MemberListElement (
					"unacknowledgedModeRLC",
					1
				    )
				}
			    ),
			    0,
			    TransferMode.acknowledgedModeRLC
			)
		    ),
		    "measurementReportTransferMode",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PeriodicalOrEventTrigger"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicalOrEventTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"periodical",
					0
				    ),
				    new MemberListElement (
					"eventTrigger",
					1
				    )
				}
			    ),
			    0,
			    PeriodicalOrEventTrigger.periodical
			)
		    ),
		    "periodicalOrEventTrigger",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementReportingMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementReportingMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementReportingMode
