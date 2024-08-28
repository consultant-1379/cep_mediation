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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type InitialDirectTransfer_v590ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InitialDirectTransfer_v590ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public InitialDirectTransfer_v590ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InitialDirectTransfer_v590ext(rrc.informationelements.EstablishmentCause establishmentCause)
    {
	setEstablishmentCause(establishmentCause);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.EstablishmentCause.originatingConversationalCall;
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
		return rrc.informationelements.EstablishmentCause.originatingConversationalCall;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "establishmentCause"
    public rrc.informationelements.EstablishmentCause getEstablishmentCause()
    {
	return (rrc.informationelements.EstablishmentCause)mComponents[0];
    }
    
    public void setEstablishmentCause(rrc.informationelements.EstablishmentCause establishmentCause)
    {
	mComponents[0] = establishmentCause;
    }
    
    public boolean hasEstablishmentCause()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEstablishmentCause()
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
	    "rrc.pdu_definitions",
	    "InitialDirectTransfer_v590ext"
	),
	new QName (
	    "PDU-definitions",
	    "InitialDirectTransfer-v590ext"
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
				"EstablishmentCause"
			    ),
			    new QName (
				"InformationElements",
				"EstablishmentCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"originatingConversationalCall",
					0
				    ),
				    new MemberListElement (
					"originatingStreamingCall",
					1
				    ),
				    new MemberListElement (
					"originatingInteractiveCall",
					2
				    ),
				    new MemberListElement (
					"originatingBackgroundCall",
					3
				    ),
				    new MemberListElement (
					"originatingSubscribedTrafficCall",
					4
				    ),
				    new MemberListElement (
					"terminatingConversationalCall",
					5
				    ),
				    new MemberListElement (
					"terminatingStreamingCall",
					6
				    ),
				    new MemberListElement (
					"terminatingInteractiveCall",
					7
				    ),
				    new MemberListElement (
					"terminatingBackgroundCall",
					8
				    ),
				    new MemberListElement (
					"emergencyCall",
					9
				    ),
				    new MemberListElement (
					"interRAT-CellReselection",
					10
				    ),
				    new MemberListElement (
					"interRAT-CellChangeOrder",
					11
				    ),
				    new MemberListElement (
					"registration",
					12
				    ),
				    new MemberListElement (
					"detach",
					13
				    ),
				    new MemberListElement (
					"originatingHighPrioritySignalling",
					14
				    ),
				    new MemberListElement (
					"originatingLowPrioritySignalling",
					15
				    ),
				    new MemberListElement (
					"callRe-establishment",
					16
				    ),
				    new MemberListElement (
					"terminatingHighPrioritySignalling",
					17
				    ),
				    new MemberListElement (
					"terminatingLowPrioritySignalling",
					18
				    ),
				    new MemberListElement (
					"terminatingCauseUnknown",
					19
				    ),
				    new MemberListElement (
					"mbms-Reception",
					20
				    ),
				    new MemberListElement (
					"mbms-PTP-RB-Request",
					21
				    ),
				    new MemberListElement (
					"delayTolerantAccess",
					22
				    ),
				    new MemberListElement (
					"spare9",
					23
				    ),
				    new MemberListElement (
					"spare8",
					24
				    ),
				    new MemberListElement (
					"spare7",
					25
				    ),
				    new MemberListElement (
					"spare6",
					26
				    ),
				    new MemberListElement (
					"spare5",
					27
				    ),
				    new MemberListElement (
					"spare4",
					28
				    ),
				    new MemberListElement (
					"spare3",
					29
				    ),
				    new MemberListElement (
					"spare2",
					30
				    ),
				    new MemberListElement (
					"spare1",
					31
				    )
				}
			    ),
			    0,
			    rrc.informationelements.EstablishmentCause.originatingConversationalCall
			)
		    ),
		    "establishmentCause",
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
     * Get the type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InitialDirectTransfer_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InitialDirectTransfer_v590ext
