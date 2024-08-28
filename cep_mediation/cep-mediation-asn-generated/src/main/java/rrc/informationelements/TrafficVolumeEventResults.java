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
 * Define the ASN1 Type TrafficVolumeEventResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeEventResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeEventResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeEventResults(UL_TrCH_Identity ul_transportChannelCausingEvent, 
		    TrafficVolumeEventType trafficVolumeEventIdentity)
    {
	setUl_transportChannelCausingEvent(ul_transportChannelCausingEvent);
	setTrafficVolumeEventIdentity(trafficVolumeEventIdentity);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_TrCH_Identity();
	mComponents[1] = TrafficVolumeEventType.e4a;
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
		return new UL_TrCH_Identity();
	    case 1:
		return TrafficVolumeEventType.e4a;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_transportChannelCausingEvent"
    public UL_TrCH_Identity getUl_transportChannelCausingEvent()
    {
	return (UL_TrCH_Identity)mComponents[0];
    }
    
    public void setUl_transportChannelCausingEvent(UL_TrCH_Identity ul_transportChannelCausingEvent)
    {
	mComponents[0] = ul_transportChannelCausingEvent;
    }
    
    
    // Methods for field "trafficVolumeEventIdentity"
    public TrafficVolumeEventType getTrafficVolumeEventIdentity()
    {
	return (TrafficVolumeEventType)mComponents[1];
    }
    
    public void setTrafficVolumeEventIdentity(TrafficVolumeEventType trafficVolumeEventIdentity)
    {
	mComponents[1] = trafficVolumeEventIdentity;
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
	    "TrafficVolumeEventResults"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeEventResults"
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
				"UL_TrCH_Identity"
			    ),
			    new QName (
				"InformationElements",
				"UL-TrCH-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TrCH_Identity"
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
		    "ul-transportChannelCausingEvent",
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
				"TrafficVolumeEventType"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeEventType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e4a",
					0
				    ),
				    new MemberListElement (
					"e4b",
					1
				    )
				}
			    ),
			    0,
			    TrafficVolumeEventType.e4a
			)
		    ),
		    "trafficVolumeEventIdentity",
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
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeEventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeEventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeEventResults
