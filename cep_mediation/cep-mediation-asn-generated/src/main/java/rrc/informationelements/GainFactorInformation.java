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
 * Define the ASN1 Type GainFactorInformation from ASN1 Module InformationElements.
 * @see Choice
 */

public class GainFactorInformation extends Choice {
    
    /**
     * The default constructor.
     */
    public GainFactorInformation()
    {
    }
    
    public static final  int  signalledGainFactors_chosen = 1;
    public static final  int  computedGainFactors_chosen = 2;
    
    // Methods for field "signalledGainFactors"
    public static GainFactorInformation createGainFactorInformationWithSignalledGainFactors(SignalledGainFactors signalledGainFactors)
    {
	GainFactorInformation __object = new GainFactorInformation();

	__object.setSignalledGainFactors(signalledGainFactors);
	return __object;
    }
    
    public boolean hasSignalledGainFactors()
    {
	return getChosenFlag() == signalledGainFactors_chosen;
    }
    
    public void setSignalledGainFactors(SignalledGainFactors signalledGainFactors)
    {
	setChosenValue(signalledGainFactors);
	setChosenFlag(signalledGainFactors_chosen);
    }
    
    
    // Methods for field "computedGainFactors"
    public static GainFactorInformation createGainFactorInformationWithComputedGainFactors(long computedGainFactors)
    {
	return createGainFactorInformationWithComputedGainFactors(new ReferenceTFC_ID(computedGainFactors));
    }
    
    public static GainFactorInformation createGainFactorInformationWithComputedGainFactors(ReferenceTFC_ID computedGainFactors)
    {
	GainFactorInformation __object = new GainFactorInformation();

	__object.setComputedGainFactors(computedGainFactors);
	return __object;
    }
    
    public boolean hasComputedGainFactors()
    {
	return getChosenFlag() == computedGainFactors_chosen;
    }
    
    public void setComputedGainFactors(long computedGainFactors)
    {
	setComputedGainFactors(new ReferenceTFC_ID(computedGainFactors));
    }
    
    public void setComputedGainFactors(ReferenceTFC_ID computedGainFactors)
    {
	setChosenValue(computedGainFactors);
	setChosenFlag(computedGainFactors_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case signalledGainFactors_chosen:
		return new SignalledGainFactors();
	    case computedGainFactors_chosen:
		return new ReferenceTFC_ID();
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
	    "GainFactorInformation"
	),
	new QName (
	    "InformationElements",
	    "GainFactorInformation"
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
				"SignalledGainFactors"
			    ),
			    new QName (
				"InformationElements",
				"SignalledGainFactors"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SignalledGainFactors"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SignalledGainFactors"
				)
			    ),
			    0
			)
		    ),
		    "signalledGainFactors",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ReferenceTFC_ID"
			    ),
			    new QName (
				"InformationElements",
				"ReferenceTFC-ID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ReferenceTFC_ID(0), 
				    new ReferenceTFC_ID(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "computedGainFactors",
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
     * Get the type descriptor (TypeInfo) of 'this' GainFactorInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GainFactorInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GainFactorInformation
