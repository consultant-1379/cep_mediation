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
 * Define the ASN1 Type RRCConnectionRelease_r4_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRelease_r4_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRelease_r4_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRelease_r4_IEs(rrc.informationelements.N_308 n_308, 
		    rrc.informationelements.ReleaseCause releaseCause, 
		    rrc.informationelements.Rplmn_Information_r4 rplmn_information)
    {
	setN_308(n_308);
	setReleaseCause(releaseCause);
	setRplmn_information(rplmn_information);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionRelease_r4_IEs(rrc.informationelements.ReleaseCause releaseCause)
    {
	setReleaseCause(releaseCause);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.N_308();
	mComponents[1] = rrc.informationelements.ReleaseCause.normalEvent;
	mComponents[2] = new rrc.informationelements.Rplmn_Information_r4();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.N_308();
	    case 1:
		return rrc.informationelements.ReleaseCause.normalEvent;
	    case 2:
		return new rrc.informationelements.Rplmn_Information_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "n_308"
    public rrc.informationelements.N_308 getN_308()
    {
	return (rrc.informationelements.N_308)mComponents[0];
    }
    
    public void setN_308(rrc.informationelements.N_308 n_308)
    {
	mComponents[0] = n_308;
    }
    
    public boolean hasN_308()
    {
	return componentIsPresent(0);
    }
    
    public void deleteN_308()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "releaseCause"
    public rrc.informationelements.ReleaseCause getReleaseCause()
    {
	return (rrc.informationelements.ReleaseCause)mComponents[1];
    }
    
    public void setReleaseCause(rrc.informationelements.ReleaseCause releaseCause)
    {
	mComponents[1] = releaseCause;
    }
    
    
    // Methods for field "rplmn_information"
    public rrc.informationelements.Rplmn_Information_r4 getRplmn_information()
    {
	return (rrc.informationelements.Rplmn_Information_r4)mComponents[2];
    }
    
    public void setRplmn_information(rrc.informationelements.Rplmn_Information_r4 rplmn_information)
    {
	mComponents[2] = rplmn_information;
    }
    
    public boolean hasRplmn_information()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRplmn_information()
    {
	setComponentAbsent(2);
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
	    "RRCConnectionRelease_r4_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRelease-r4-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"N_308"
			    ),
			    new QName (
				"InformationElements",
				"N-308"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.N_308(1), 
				    new rrc.informationelements.N_308(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "n-308",
		    0,
		    3,
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
				"ReleaseCause"
			    ),
			    new QName (
				"InformationElements",
				"ReleaseCause"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"normalEvent",
					0
				    ),
				    new MemberListElement (
					"unspecified",
					1
				    ),
				    new MemberListElement (
					"pre-emptiveRelease",
					2
				    ),
				    new MemberListElement (
					"congestion",
					3
				    ),
				    new MemberListElement (
					"re-establishmentReject",
					4
				    ),
				    new MemberListElement (
					"directedsignallingconnectionre-establishment",
					5
				    ),
				    new MemberListElement (
					"userInactivity",
					6
				    ),
				    new MemberListElement (
					"spare",
					7
				    )
				}
			    ),
			    0,
			    rrc.informationelements.ReleaseCause.normalEvent
			)
		    ),
		    "releaseCause",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Rplmn_Information_r4"
			    ),
			    new QName (
				"InformationElements",
				"Rplmn-Information-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Rplmn_Information_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Rplmn_Information_r4"
				)
			    ),
			    0
			)
		    ),
		    "rplmn-information",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRelease_r4_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRelease_r4_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRelease_r4_IEs
