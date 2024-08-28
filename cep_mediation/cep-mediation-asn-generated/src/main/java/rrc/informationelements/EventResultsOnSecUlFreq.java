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
 * Define the ASN1 Type EventResultsOnSecUlFreq from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EventResultsOnSecUlFreq extends Sequence {
    
    /**
     * The default constructor.
     */
    public EventResultsOnSecUlFreq()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EventResultsOnSecUlFreq(IntraFreqEventResultsOnSecUlFreq intraFreqEventResults)
    {
	setIntraFreqEventResults(intraFreqEventResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqEventResultsOnSecUlFreq();
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
		return new IntraFreqEventResultsOnSecUlFreq();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "intraFreqEventResults"
    public IntraFreqEventResultsOnSecUlFreq getIntraFreqEventResults()
    {
	return (IntraFreqEventResultsOnSecUlFreq)mComponents[0];
    }
    
    public void setIntraFreqEventResults(IntraFreqEventResultsOnSecUlFreq intraFreqEventResults)
    {
	mComponents[0] = intraFreqEventResults;
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
	    "EventResultsOnSecUlFreq"
	),
	new QName (
	    "InformationElements",
	    "EventResultsOnSecUlFreq"
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
				"IntraFreqEventResultsOnSecUlFreq"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqEventResultsOnSecUlFreq"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEventResultsOnSecUlFreq"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqEventResultsOnSecUlFreq"
				)
			    ),
			    0
			)
		    ),
		    "intraFreqEventResults",
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
     * Get the type descriptor (TypeInfo) of 'this' EventResultsOnSecUlFreq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventResultsOnSecUlFreq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventResultsOnSecUlFreq
