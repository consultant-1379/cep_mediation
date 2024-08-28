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
 * Define the ASN1 Type PeriodicalWithReportingCellStatus_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PeriodicalWithReportingCellStatus_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PeriodicalWithReportingCellStatus_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PeriodicalWithReportingCellStatus_r10(PeriodicalReportingCriteria periodicalReportingCriteria, 
		    ReportingCellStatus_r10 reportingCellStatus)
    {
	setPeriodicalReportingCriteria(periodicalReportingCriteria);
	setReportingCellStatus(reportingCellStatus);
    }
    
    /**
     * Construct with required components.
     */
    public PeriodicalWithReportingCellStatus_r10(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	setPeriodicalReportingCriteria(periodicalReportingCriteria);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PeriodicalReportingCriteria();
	mComponents[1] = new ReportingCellStatus_r10();
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
		return new PeriodicalReportingCriteria();
	    case 1:
		return new ReportingCellStatus_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "periodicalReportingCriteria"
    public PeriodicalReportingCriteria getPeriodicalReportingCriteria()
    {
	return (PeriodicalReportingCriteria)mComponents[0];
    }
    
    public void setPeriodicalReportingCriteria(PeriodicalReportingCriteria periodicalReportingCriteria)
    {
	mComponents[0] = periodicalReportingCriteria;
    }
    
    
    // Methods for field "reportingCellStatus"
    public ReportingCellStatus_r10 getReportingCellStatus()
    {
	return (ReportingCellStatus_r10)mComponents[1];
    }
    
    public void setReportingCellStatus(ReportingCellStatus_r10 reportingCellStatus)
    {
	mComponents[1] = reportingCellStatus;
    }
    
    public boolean hasReportingCellStatus()
    {
	return componentIsPresent(1);
    }
    
    public void deleteReportingCellStatus()
    {
	setComponentAbsent(1);
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
	    "PeriodicalWithReportingCellStatus_r10"
	),
	new QName (
	    "InformationElements",
	    "PeriodicalWithReportingCellStatus-r10"
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
				"PeriodicalReportingCriteria"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicalReportingCriteria"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalReportingCriteria"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicalReportingCriteria"
				)
			    ),
			    0
			)
		    ),
		    "periodicalReportingCriteria",
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
				"ReportingCellStatus_r10"
			    ),
			    new QName (
				"InformationElements",
				"ReportingCellStatus-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ReportingCellStatus_r10"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9),
				    new TagDecoderElement((short)0x800a, 10),
				    new TagDecoderElement((short)0x800b, 11),
				    new TagDecoderElement((short)0x800c, 12),
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14)
				}
			    )
			)
		    ),
		    "reportingCellStatus",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PeriodicalWithReportingCellStatus_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PeriodicalWithReportingCellStatus_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PeriodicalWithReportingCellStatus_r10
