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
 * Define the ASN1 Type EUTRA_EventResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_EventResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_EventResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_EventResults(EventIDInterRAT eventID, 
		    Eutra_EventResultList eutra_EventResultsList)
    {
	setEventID(eventID);
	setEutra_EventResultsList(eutra_EventResultsList);
    }
    
    public void initComponents()
    {
	mComponents[0] = EventIDInterRAT.e3a;
	mComponents[1] = new Eutra_EventResultList();
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
		return EventIDInterRAT.e3a;
	    case 1:
		return new Eutra_EventResultList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eventID"
    public EventIDInterRAT getEventID()
    {
	return (EventIDInterRAT)mComponents[0];
    }
    
    public void setEventID(EventIDInterRAT eventID)
    {
	mComponents[0] = eventID;
    }
    
    
    // Methods for field "eutra_EventResultsList"
    public Eutra_EventResultList getEutra_EventResultsList()
    {
	return (Eutra_EventResultList)mComponents[1];
    }
    
    public void setEutra_EventResultsList(Eutra_EventResultList eutra_EventResultsList)
    {
	mComponents[1] = eutra_EventResultsList;
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
	    "EUTRA_EventResults"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-EventResults"
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
				"EventIDInterRAT"
			    ),
			    new QName (
				"InformationElements",
				"EventIDInterRAT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e3a",
					0
				    ),
				    new MemberListElement (
					"e3b",
					1
				    ),
				    new MemberListElement (
					"e3c",
					2
				    ),
				    new MemberListElement (
					"e3d",
					3
				    )
				}
			    ),
			    0,
			    EventIDInterRAT.e3a
			)
		    ),
		    "eventID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Eutra_EventResultList"
			    ),
			    new QName (
				"InformationElements",
				"Eutra-EventResultList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(4),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(4)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "Eutra_EventResult"
				)
			    )
			)
		    ),
		    "eutra-EventResultsList",
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_EventResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_EventResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_EventResults
