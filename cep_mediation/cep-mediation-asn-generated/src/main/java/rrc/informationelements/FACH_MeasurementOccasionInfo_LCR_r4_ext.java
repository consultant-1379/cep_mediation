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
 * Define the ASN1 Type FACH_MeasurementOccasionInfo_LCR_r4_ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class FACH_MeasurementOccasionInfo_LCR_r4_ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public FACH_MeasurementOccasionInfo_LCR_r4_ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FACH_MeasurementOccasionInfo_LCR_r4_ext(BOOLEAN inter_freq_TDD128_meas_ind)
    {
	setInter_freq_TDD128_meas_ind(inter_freq_TDD128_meas_ind);
    }
    
    /**
     * Construct with components.
     */
    public FACH_MeasurementOccasionInfo_LCR_r4_ext(boolean inter_freq_TDD128_meas_ind)
    {
	this(new BOOLEAN(inter_freq_TDD128_meas_ind));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
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
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "inter_freq_TDD128_meas_ind"
    public boolean getInter_freq_TDD128_meas_ind()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setInter_freq_TDD128_meas_ind(boolean inter_freq_TDD128_meas_ind)
    {
	setInter_freq_TDD128_meas_ind(new BOOLEAN(inter_freq_TDD128_meas_ind));
    }
    
    public void setInter_freq_TDD128_meas_ind(BOOLEAN inter_freq_TDD128_meas_ind)
    {
	mComponents[0] = inter_freq_TDD128_meas_ind;
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
	    "FACH_MeasurementOccasionInfo_LCR_r4_ext"
	),
	new QName (
	    "InformationElements",
	    "FACH-MeasurementOccasionInfo-LCR-r4-ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "inter-freq-TDD128-meas-ind",
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
     * Get the type descriptor (TypeInfo) of 'this' FACH_MeasurementOccasionInfo_LCR_r4_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FACH_MeasurementOccasionInfo_LCR_r4_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FACH_MeasurementOccasionInfo_LCR_r4_ext
