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
 * Define the ASN1 Type ReportingCellStatusOpt_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ReportingCellStatusOpt_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public ReportingCellStatusOpt_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ReportingCellStatusOpt_r10(ReportingCellStatus_r10 reportingCellStatus)
    {
	setReportingCellStatus(reportingCellStatus);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ReportingCellStatus_r10();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ReportingCellStatus_r10();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "reportingCellStatus"
    public ReportingCellStatus_r10 getReportingCellStatus()
    {
	return (ReportingCellStatus_r10)mComponents[0];
    }
    
    public void setReportingCellStatus(ReportingCellStatus_r10 reportingCellStatus)
    {
	mComponents[0] = reportingCellStatus;
    }
    
    public boolean hasReportingCellStatus()
    {
	return componentIsPresent(0);
    }
    
    public void deleteReportingCellStatus()
    {
	setComponentAbsent(0);
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
	    "ReportingCellStatusOpt_r10"
	),
	new QName (
	    "InformationElements",
	    "ReportingCellStatusOpt-r10"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReportingCellStatusOpt_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReportingCellStatusOpt_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReportingCellStatusOpt_r10
