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
 * Define the ASN1 Type VelocityEstimate from ASN1 Module InformationElements.
 * @see Choice
 */

public class VelocityEstimate extends Choice {
    
    /**
     * The default constructor.
     */
    public VelocityEstimate()
    {
    }
    
    public static final  int  horizontalVelocity_chosen = 1;
    public static final  int  horizontalWithVerticalVelocity_chosen = 2;
    public static final  int  horizontalVelocityWithUncertainty_chosen = 3;
    public static final  int  horizontalWithVerticalVelocityAndUncertainty_chosen = 4;
    
    // Methods for field "horizontalVelocity"
    public static VelocityEstimate createVelocityEstimateWithHorizontalVelocity(HorizontalVelocity horizontalVelocity)
    {
	VelocityEstimate __object = new VelocityEstimate();

	__object.setHorizontalVelocity(horizontalVelocity);
	return __object;
    }
    
    public boolean hasHorizontalVelocity()
    {
	return getChosenFlag() == horizontalVelocity_chosen;
    }
    
    public void setHorizontalVelocity(HorizontalVelocity horizontalVelocity)
    {
	setChosenValue(horizontalVelocity);
	setChosenFlag(horizontalVelocity_chosen);
    }
    
    
    // Methods for field "horizontalWithVerticalVelocity"
    public static VelocityEstimate createVelocityEstimateWithHorizontalWithVerticalVelocity(HorizontalWithVerticalVelocity horizontalWithVerticalVelocity)
    {
	VelocityEstimate __object = new VelocityEstimate();

	__object.setHorizontalWithVerticalVelocity(horizontalWithVerticalVelocity);
	return __object;
    }
    
    public boolean hasHorizontalWithVerticalVelocity()
    {
	return getChosenFlag() == horizontalWithVerticalVelocity_chosen;
    }
    
    public void setHorizontalWithVerticalVelocity(HorizontalWithVerticalVelocity horizontalWithVerticalVelocity)
    {
	setChosenValue(horizontalWithVerticalVelocity);
	setChosenFlag(horizontalWithVerticalVelocity_chosen);
    }
    
    
    // Methods for field "horizontalVelocityWithUncertainty"
    public static VelocityEstimate createVelocityEstimateWithHorizontalVelocityWithUncertainty(HorizontalVelocityWithUncertainty horizontalVelocityWithUncertainty)
    {
	VelocityEstimate __object = new VelocityEstimate();

	__object.setHorizontalVelocityWithUncertainty(horizontalVelocityWithUncertainty);
	return __object;
    }
    
    public boolean hasHorizontalVelocityWithUncertainty()
    {
	return getChosenFlag() == horizontalVelocityWithUncertainty_chosen;
    }
    
    public void setHorizontalVelocityWithUncertainty(HorizontalVelocityWithUncertainty horizontalVelocityWithUncertainty)
    {
	setChosenValue(horizontalVelocityWithUncertainty);
	setChosenFlag(horizontalVelocityWithUncertainty_chosen);
    }
    
    
    // Methods for field "horizontalWithVerticalVelocityAndUncertainty"
    public static VelocityEstimate createVelocityEstimateWithHorizontalWithVerticalVelocityAndUncertainty(HorizontalWithVerticalVelocityAndUncertainty horizontalWithVerticalVelocityAndUncertainty)
    {
	VelocityEstimate __object = new VelocityEstimate();

	__object.setHorizontalWithVerticalVelocityAndUncertainty(horizontalWithVerticalVelocityAndUncertainty);
	return __object;
    }
    
    public boolean hasHorizontalWithVerticalVelocityAndUncertainty()
    {
	return getChosenFlag() == horizontalWithVerticalVelocityAndUncertainty_chosen;
    }
    
    public void setHorizontalWithVerticalVelocityAndUncertainty(HorizontalWithVerticalVelocityAndUncertainty horizontalWithVerticalVelocityAndUncertainty)
    {
	setChosenValue(horizontalWithVerticalVelocityAndUncertainty);
	setChosenFlag(horizontalWithVerticalVelocityAndUncertainty_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case horizontalVelocity_chosen:
		return new HorizontalVelocity();
	    case horizontalWithVerticalVelocity_chosen:
		return new HorizontalWithVerticalVelocity();
	    case horizontalVelocityWithUncertainty_chosen:
		return new HorizontalVelocityWithUncertainty();
	    case horizontalWithVerticalVelocityAndUncertainty_chosen:
		return new HorizontalWithVerticalVelocityAndUncertainty();
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
	    "VelocityEstimate"
	),
	new QName (
	    "InformationElements",
	    "VelocityEstimate"
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
				"HorizontalVelocity"
			    ),
			    new QName (
				"InformationElements",
				"HorizontalVelocity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalVelocity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalVelocity"
				)
			    ),
			    0
			)
		    ),
		    "horizontalVelocity",
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
				"HorizontalWithVerticalVelocity"
			    ),
			    new QName (
				"InformationElements",
				"HorizontalWithVerticalVelocity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalWithVerticalVelocity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalWithVerticalVelocity"
				)
			    ),
			    0
			)
		    ),
		    "horizontalWithVerticalVelocity",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HorizontalVelocityWithUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"HorizontalVelocityWithUncertainty"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalVelocityWithUncertainty"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalVelocityWithUncertainty"
				)
			    ),
			    0
			)
		    ),
		    "horizontalVelocityWithUncertainty",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"HorizontalWithVerticalVelocityAndUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"HorizontalWithVerticalVelocityAndUncertainty"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalWithVerticalVelocityAndUncertainty"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HorizontalWithVerticalVelocityAndUncertainty"
				)
			    ),
			    0
			)
		    ),
		    "horizontalWithVerticalVelocityAndUncertainty",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VelocityEstimate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VelocityEstimate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VelocityEstimate
