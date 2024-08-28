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
 * Define the ASN1 Type EventResults_v860ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class EventResults_v860ext extends Choice {
    
    /**
     * The default constructor.
     */
    public EventResults_v860ext()
    {
    }
    
    public static final  int  ue_positioning_MeasurementEventResults_chosen = 1;
    
    // Methods for field "ue_positioning_MeasurementEventResults"
    public static EventResults_v860ext createEventResults_v860extWithUe_positioning_MeasurementEventResults(UE_Positioning_MeasurementEventResults_v860ext ue_positioning_MeasurementEventResults)
    {
	EventResults_v860ext __object = new EventResults_v860ext();

	__object.setUe_positioning_MeasurementEventResults(ue_positioning_MeasurementEventResults);
	return __object;
    }
    
    public boolean hasUe_positioning_MeasurementEventResults()
    {
	return getChosenFlag() == ue_positioning_MeasurementEventResults_chosen;
    }
    
    public void setUe_positioning_MeasurementEventResults(UE_Positioning_MeasurementEventResults_v860ext ue_positioning_MeasurementEventResults)
    {
	setChosenValue(ue_positioning_MeasurementEventResults);
	setChosenFlag(ue_positioning_MeasurementEventResults_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ue_positioning_MeasurementEventResults_chosen:
		return new UE_Positioning_MeasurementEventResults_v860ext();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "EventResults_v860ext"
	),
	new QName (
	    "InformationElements",
	    "EventResults-v860ext"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_MeasurementEventResults_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MeasurementEventResults-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasurementEventResults_v860ext"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0)
				}
			    )
			)
		    ),
		    "ue-positioning-MeasurementEventResults",
		    0,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventResults_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventResults_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventResults_v860ext
