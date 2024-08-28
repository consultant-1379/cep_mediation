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
 * Define the ASN1 Type UE_Positioning_MeasuredResults_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_MeasuredResults_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_MeasuredResults_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_MeasuredResults_v860ext(UE_Positioning_Error_v860ext ue_positioning_Error, 
		    UE_Positioning_GANSS_MeasuredResults_v860ext ue_positioning_Ganss_MeasurementResults)
    {
	setUe_positioning_Error(ue_positioning_Error);
	setUe_positioning_Ganss_MeasurementResults(ue_positioning_Ganss_MeasurementResults);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_Error_v860ext();
	mComponents[1] = new UE_Positioning_GANSS_MeasuredResults_v860ext();
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
		return new UE_Positioning_Error_v860ext();
	    case 1:
		return new UE_Positioning_GANSS_MeasuredResults_v860ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_Error"
    public UE_Positioning_Error_v860ext getUe_positioning_Error()
    {
	return (UE_Positioning_Error_v860ext)mComponents[0];
    }
    
    public void setUe_positioning_Error(UE_Positioning_Error_v860ext ue_positioning_Error)
    {
	mComponents[0] = ue_positioning_Error;
    }
    
    public boolean hasUe_positioning_Error()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_Error()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_Ganss_MeasurementResults"
    public UE_Positioning_GANSS_MeasuredResults_v860ext getUe_positioning_Ganss_MeasurementResults()
    {
	return (UE_Positioning_GANSS_MeasuredResults_v860ext)mComponents[1];
    }
    
    public void setUe_positioning_Ganss_MeasurementResults(UE_Positioning_GANSS_MeasuredResults_v860ext ue_positioning_Ganss_MeasurementResults)
    {
	mComponents[1] = ue_positioning_Ganss_MeasurementResults;
    }
    
    public boolean hasUe_positioning_Ganss_MeasurementResults()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_Ganss_MeasurementResults()
    {
	setComponentAbsent(1);
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
	    "UE_Positioning_MeasuredResults_v860ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-MeasuredResults-v860ext"
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
				"UE_Positioning_Error_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-Error-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Error_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_Error_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Error",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_MeasuredResults_v860ext"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-MeasuredResults-v860ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_MeasuredResults_v860ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_MeasuredResults_v860ext"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-Ganss-MeasurementResults",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_MeasuredResults_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_MeasuredResults_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_MeasuredResults_v860ext
