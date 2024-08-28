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
 * Define the ASN1 Type MeasurementControl_v3a0ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_v3a0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_v3a0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_v3a0ext(rrc.informationelements.SFN_Offset_Validity sfn_Offset_Validity)
    {
	setSfn_Offset_Validity(sfn_Offset_Validity);
    }
    
    public void initComponents()
    {
	mComponents[0] = rrc.informationelements.SFN_Offset_Validity._false;
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
		return rrc.informationelements.SFN_Offset_Validity._false;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn_Offset_Validity"
    public rrc.informationelements.SFN_Offset_Validity getSfn_Offset_Validity()
    {
	return (rrc.informationelements.SFN_Offset_Validity)mComponents[0];
    }
    
    public void setSfn_Offset_Validity(rrc.informationelements.SFN_Offset_Validity sfn_Offset_Validity)
    {
	mComponents[0] = sfn_Offset_Validity;
    }
    
    public boolean hasSfn_Offset_Validity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSfn_Offset_Validity()
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
	    "MeasurementControl_v3a0ext"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-v3a0ext"
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
				"SFN_Offset_Validity"
			    ),
			    new QName (
				"InformationElements",
				"SFN-Offset-Validity"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"false",
					0
				    )
				}
			    ),
			    0,
			    rrc.informationelements.SFN_Offset_Validity._false
			)
		    ),
		    "sfn-Offset-Validity",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_v3a0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_v3a0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_v3a0ext
