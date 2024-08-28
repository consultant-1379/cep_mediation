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
 * Define the ASN1 Type RRCConnectionRequest_v4b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_v4b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_v4b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_v4b0ext_IEs(rrc.informationelements.AccessStratumReleaseIndicator accessStratumReleaseIndicator)
    {
	setAccessStratumReleaseIndicator(accessStratumReleaseIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.AccessStratumReleaseIndicator.rel_4;
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
		return rrc.informationelements.AccessStratumReleaseIndicator.rel_4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accessStratumReleaseIndicator"
    public rrc.informationelements.AccessStratumReleaseIndicator getAccessStratumReleaseIndicator()
    {
	return (rrc.informationelements.AccessStratumReleaseIndicator)mComponents[0];
    }
    
    public void setAccessStratumReleaseIndicator(rrc.informationelements.AccessStratumReleaseIndicator accessStratumReleaseIndicator)
    {
	mComponents[0] = accessStratumReleaseIndicator;
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
	    "RRCConnectionRequest_v4b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-v4b0ext-IEs"
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
				"AccessStratumReleaseIndicator"
			    ),
			    new QName (
				"InformationElements",
				"AccessStratumReleaseIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rel-4",
					0
				    ),
				    new MemberListElement (
					"rel-5",
					1
				    ),
				    new MemberListElement (
					"rel-6",
					2
				    ),
				    new MemberListElement (
					"rel-7",
					3
				    ),
				    new MemberListElement (
					"rel-8",
					4
				    ),
				    new MemberListElement (
					"rel-9",
					5
				    ),
				    new MemberListElement (
					"rel-10",
					6
				    ),
				    new MemberListElement (
					"spare9",
					7
				    ),
				    new MemberListElement (
					"spare8",
					8
				    ),
				    new MemberListElement (
					"spare7",
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
			    rrc.informationelements.AccessStratumReleaseIndicator.rel_4
			)
		    ),
		    "accessStratumReleaseIndicator",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v4b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v4b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_v4b0ext_IEs
