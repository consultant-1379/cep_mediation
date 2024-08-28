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
 * Define the ASN1 Type IntraFreqEventResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IntraFreqEventResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntraFreqEventResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntraFreqEventResults(EventIDIntraFreq eventID, 
		    CellMeasurementEventResults cellMeasurementEventResults)
    {
	setEventID(eventID);
	setCellMeasurementEventResults(cellMeasurementEventResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = EventIDIntraFreq.e1a;
	mComponents[1] = new CellMeasurementEventResults();
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
		return EventIDIntraFreq.e1a;
	    case 1:
		return new CellMeasurementEventResults();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eventID"
    public EventIDIntraFreq getEventID()
    {
	return (EventIDIntraFreq)mComponents[0];
    }
    
    public void setEventID(EventIDIntraFreq eventID)
    {
	mComponents[0] = eventID;
    }
    
    
    // Methods for field "cellMeasurementEventResults"
    public CellMeasurementEventResults getCellMeasurementEventResults()
    {
	return (CellMeasurementEventResults)mComponents[1];
    }
    
    public void setCellMeasurementEventResults(CellMeasurementEventResults cellMeasurementEventResults)
    {
	mComponents[1] = cellMeasurementEventResults;
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
	    "IntraFreqEventResults"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqEventResults"
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
				"EventIDIntraFreq"
			    ),
			    new QName (
				"InformationElements",
				"EventIDIntraFreq"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e1a",
					0
				    ),
				    new MemberListElement (
					"e1b",
					1
				    ),
				    new MemberListElement (
					"e1c",
					2
				    ),
				    new MemberListElement (
					"e1d",
					3
				    ),
				    new MemberListElement (
					"e1e",
					4
				    ),
				    new MemberListElement (
					"e1f",
					5
				    ),
				    new MemberListElement (
					"e1g",
					6
				    ),
				    new MemberListElement (
					"e1h",
					7
				    ),
				    new MemberListElement (
					"e1i",
					8
				    ),
				    new MemberListElement (
					"e1j",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    EventIDIntraFreq.e1a
			)
		    ),
		    "eventID",
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
				"CellMeasurementEventResults"
			    ),
			    new QName (
				"InformationElements",
				"CellMeasurementEventResults"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CellMeasurementEventResults"
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
		    "cellMeasurementEventResults",
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
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqEventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqEventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqEventResults
