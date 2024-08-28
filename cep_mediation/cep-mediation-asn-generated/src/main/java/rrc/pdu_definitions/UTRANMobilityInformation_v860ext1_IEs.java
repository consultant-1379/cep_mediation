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
 * Define the ASN1 Type UTRANMobilityInformation_v860ext1_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UTRANMobilityInformation_v860ext1_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRANMobilityInformation_v860ext1_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRANMobilityInformation_v860ext1_IEs(rrc.informationelements.UE_ConnTimersAndConstants_v860ext ue_ConnTimersAndConstants)
    {
	setUe_ConnTimersAndConstants(ue_ConnTimersAndConstants);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_ConnTimersAndConstants_v860ext();
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
		return new rrc.informationelements.UE_ConnTimersAndConstants_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_ConnTimersAndConstants"
    public rrc.informationelements.UE_ConnTimersAndConstants_v860ext getUe_ConnTimersAndConstants()
    {
	return (rrc.informationelements.UE_ConnTimersAndConstants_v860ext)mComponents[0];
    }
    
    public void setUe_ConnTimersAndConstants(rrc.informationelements.UE_ConnTimersAndConstants_v860ext ue_ConnTimersAndConstants)
    {
	mComponents[0] = ue_ConnTimersAndConstants;
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
	    "UTRANMobilityInformation_v860ext1_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UTRANMobilityInformation-v860ext1-IEs"
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
				"UE_ConnTimersAndConstants_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-ConnTimersAndConstants-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_ConnTimersAndConstants_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-ConnTimersAndConstants",
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
     * Get the type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_v860ext1_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRANMobilityInformation_v860ext1_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRANMobilityInformation_v860ext1_IEs
