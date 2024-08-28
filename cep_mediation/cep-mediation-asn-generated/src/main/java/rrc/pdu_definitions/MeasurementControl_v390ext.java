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
 * Define the ASN1 Type MeasurementControl_v390ext from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MeasurementControl_v390ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementControl_v390ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementControl_v390ext(rrc.informationelements.UE_Positioning_Measurement_v390ext ue_Positioning_Measurement_v390ext)
    {
	setUe_Positioning_Measurement_v390ext(ue_Positioning_Measurement_v390ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.UE_Positioning_Measurement_v390ext();
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
		return new rrc.informationelements.UE_Positioning_Measurement_v390ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_Positioning_Measurement_v390ext"
    public rrc.informationelements.UE_Positioning_Measurement_v390ext getUe_Positioning_Measurement_v390ext()
    {
	return (rrc.informationelements.UE_Positioning_Measurement_v390ext)mComponents[0];
    }
    
    public void setUe_Positioning_Measurement_v390ext(rrc.informationelements.UE_Positioning_Measurement_v390ext ue_Positioning_Measurement_v390ext)
    {
	mComponents[0] = ue_Positioning_Measurement_v390ext;
    }
    
    public boolean hasUe_Positioning_Measurement_v390ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_Positioning_Measurement_v390ext()
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
	    "MeasurementControl_v390ext"
	),
	new QName (
	    "PDU-definitions",
	    "MeasurementControl-v390ext"
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
				"UE_Positioning_Measurement_v390ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Measurement-v390ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement_v390ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Measurement_v390ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-Positioning-Measurement-v390ext",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementControl_v390ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementControl_v390ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementControl_v390ext
