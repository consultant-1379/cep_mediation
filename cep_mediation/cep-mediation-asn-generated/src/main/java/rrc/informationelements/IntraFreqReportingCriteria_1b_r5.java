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
 * Define the ASN1 Type IntraFreqReportingCriteria_1b_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqReportingCriteria_1b_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqReportingCriteria_1b_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqReportingCriteria_1b_r5(PeriodicReportingInfo_1b periodicReportingInfo_1b)
    {
	setPeriodicReportingInfo_1b(periodicReportingInfo_1b);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PeriodicReportingInfo_1b();
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
		return new PeriodicReportingInfo_1b();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "periodicReportingInfo_1b"
    public PeriodicReportingInfo_1b getPeriodicReportingInfo_1b()
    {
	return (PeriodicReportingInfo_1b)mComponents[0];
    }
    
    public void setPeriodicReportingInfo_1b(PeriodicReportingInfo_1b periodicReportingInfo_1b)
    {
	mComponents[0] = periodicReportingInfo_1b;
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
	    "IntraFreqReportingCriteria_1b_r5"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqReportingCriteria-1b-r5"
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
				"PeriodicReportingInfo_1b"
			    ),
			    new QName (
				"InformationElements",
				"PeriodicReportingInfo-1b"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicReportingInfo_1b"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PeriodicReportingInfo_1b"
				)
			    ),
			    0
			)
		    ),
		    "periodicReportingInfo-1b",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqReportingCriteria_1b_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqReportingCriteria_1b_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqReportingCriteria_1b_r5
