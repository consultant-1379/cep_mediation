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
 * Define the ASN1 Type MeasuredResults_v770ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasuredResults_v770ext extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasuredResults_v770ext()
    {
    }
    
    public static final  int  ueInternalMeasuredResults_chosen = 1;
    public static final  int  ue_positioning_MeasuredResults_chosen = 2;
    
    // Methods for field "ueInternalMeasuredResults"
    public static MeasuredResults_v770ext createMeasuredResults_v770extWithUeInternalMeasuredResults(UE_InternalMeasuredResults_v770ext ueInternalMeasuredResults)
    {
	MeasuredResults_v770ext __object = new MeasuredResults_v770ext();

	__object.setUeInternalMeasuredResults(ueInternalMeasuredResults);
	return __object;
    }
    
    public boolean hasUeInternalMeasuredResults()
    {
	return getChosenFlag() == ueInternalMeasuredResults_chosen;
    }
    
    public void setUeInternalMeasuredResults(UE_InternalMeasuredResults_v770ext ueInternalMeasuredResults)
    {
	setChosenValue(ueInternalMeasuredResults);
	setChosenFlag(ueInternalMeasuredResults_chosen);
    }
    
    
    // Methods for field "ue_positioning_MeasuredResults"
    public static MeasuredResults_v770ext createMeasuredResults_v770extWithUe_positioning_MeasuredResults(UE_Positioning_MeasuredResults_v770ext ue_positioning_MeasuredResults)
    {
	MeasuredResults_v770ext __object = new MeasuredResults_v770ext();

	__object.setUe_positioning_MeasuredResults(ue_positioning_MeasuredResults);
	return __object;
    }
    
    public boolean hasUe_positioning_MeasuredResults()
    {
	return getChosenFlag() == ue_positioning_MeasuredResults_chosen;
    }
    
    public void setUe_positioning_MeasuredResults(UE_Positioning_MeasuredResults_v770ext ue_positioning_MeasuredResults)
    {
	setChosenValue(ue_positioning_MeasuredResults);
	setChosenFlag(ue_positioning_MeasuredResults_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ueInternalMeasuredResults_chosen:
		return new UE_InternalMeasuredResults_v770ext();
	    case ue_positioning_MeasuredResults_chosen:
		return new UE_Positioning_MeasuredResults_v770ext();
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
	    "MeasuredResults_v770ext"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResults-v770ext"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_InternalMeasuredResults_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-InternalMeasuredResults-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasuredResults_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_InternalMeasuredResults_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ueInternalMeasuredResults",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_MeasuredResults_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-MeasuredResults-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasuredResults_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_MeasuredResults_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-MeasuredResults",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResults_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResults_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResults_v770ext
