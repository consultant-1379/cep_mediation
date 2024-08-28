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
 * Define the ASN1 Type PositionEstimate from ASN1 Module InformationElements.
 * @see Choice
 */

public class PositionEstimate extends Choice {
    
    /**
     * The default constructor.
     */
    public PositionEstimate()
    {
    }
    
    public static final  int  ellipsoidPoint_chosen = 1;
    public static final  int  ellipsoidPointUncertCircle_chosen = 2;
    public static final  int  ellipsoidPointUncertEllipse_chosen = 3;
    public static final  int  ellipsoidPointAltitude_chosen = 4;
    public static final  int  ellipsoidPointAltitudeEllipse_chosen = 5;
    
    // Methods for field "ellipsoidPoint"
    public static PositionEstimate createPositionEstimateWithEllipsoidPoint(EllipsoidPoint ellipsoidPoint)
    {
	PositionEstimate __object = new PositionEstimate();

	__object.setEllipsoidPoint(ellipsoidPoint);
	return __object;
    }
    
    public boolean hasEllipsoidPoint()
    {
	return getChosenFlag() == ellipsoidPoint_chosen;
    }
    
    public void setEllipsoidPoint(EllipsoidPoint ellipsoidPoint)
    {
	setChosenValue(ellipsoidPoint);
	setChosenFlag(ellipsoidPoint_chosen);
    }
    
    
    // Methods for field "ellipsoidPointUncertCircle"
    public static PositionEstimate createPositionEstimateWithEllipsoidPointUncertCircle(EllipsoidPointUncertCircle ellipsoidPointUncertCircle)
    {
	PositionEstimate __object = new PositionEstimate();

	__object.setEllipsoidPointUncertCircle(ellipsoidPointUncertCircle);
	return __object;
    }
    
    public boolean hasEllipsoidPointUncertCircle()
    {
	return getChosenFlag() == ellipsoidPointUncertCircle_chosen;
    }
    
    public void setEllipsoidPointUncertCircle(EllipsoidPointUncertCircle ellipsoidPointUncertCircle)
    {
	setChosenValue(ellipsoidPointUncertCircle);
	setChosenFlag(ellipsoidPointUncertCircle_chosen);
    }
    
    
    // Methods for field "ellipsoidPointUncertEllipse"
    public static PositionEstimate createPositionEstimateWithEllipsoidPointUncertEllipse(EllipsoidPointUncertEllipse ellipsoidPointUncertEllipse)
    {
	PositionEstimate __object = new PositionEstimate();

	__object.setEllipsoidPointUncertEllipse(ellipsoidPointUncertEllipse);
	return __object;
    }
    
    public boolean hasEllipsoidPointUncertEllipse()
    {
	return getChosenFlag() == ellipsoidPointUncertEllipse_chosen;
    }
    
    public void setEllipsoidPointUncertEllipse(EllipsoidPointUncertEllipse ellipsoidPointUncertEllipse)
    {
	setChosenValue(ellipsoidPointUncertEllipse);
	setChosenFlag(ellipsoidPointUncertEllipse_chosen);
    }
    
    
    // Methods for field "ellipsoidPointAltitude"
    public static PositionEstimate createPositionEstimateWithEllipsoidPointAltitude(EllipsoidPointAltitude ellipsoidPointAltitude)
    {
	PositionEstimate __object = new PositionEstimate();

	__object.setEllipsoidPointAltitude(ellipsoidPointAltitude);
	return __object;
    }
    
    public boolean hasEllipsoidPointAltitude()
    {
	return getChosenFlag() == ellipsoidPointAltitude_chosen;
    }
    
    public void setEllipsoidPointAltitude(EllipsoidPointAltitude ellipsoidPointAltitude)
    {
	setChosenValue(ellipsoidPointAltitude);
	setChosenFlag(ellipsoidPointAltitude_chosen);
    }
    
    
    // Methods for field "ellipsoidPointAltitudeEllipse"
    public static PositionEstimate createPositionEstimateWithEllipsoidPointAltitudeEllipse(EllipsoidPointAltitudeEllipsoide ellipsoidPointAltitudeEllipse)
    {
	PositionEstimate __object = new PositionEstimate();

	__object.setEllipsoidPointAltitudeEllipse(ellipsoidPointAltitudeEllipse);
	return __object;
    }
    
    public boolean hasEllipsoidPointAltitudeEllipse()
    {
	return getChosenFlag() == ellipsoidPointAltitudeEllipse_chosen;
    }
    
    public void setEllipsoidPointAltitudeEllipse(EllipsoidPointAltitudeEllipsoide ellipsoidPointAltitudeEllipse)
    {
	setChosenValue(ellipsoidPointAltitudeEllipse);
	setChosenFlag(ellipsoidPointAltitudeEllipse_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ellipsoidPoint_chosen:
		return new EllipsoidPoint();
	    case ellipsoidPointUncertCircle_chosen:
		return new EllipsoidPointUncertCircle();
	    case ellipsoidPointUncertEllipse_chosen:
		return new EllipsoidPointUncertEllipse();
	    case ellipsoidPointAltitude_chosen:
		return new EllipsoidPointAltitude();
	    case ellipsoidPointAltitudeEllipse_chosen:
		return new EllipsoidPointAltitudeEllipsoide();
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
	    "PositionEstimate"
	),
	new QName (
	    "InformationElements",
	    "PositionEstimate"
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
				"EllipsoidPoint"
			    ),
			    new QName (
				"InformationElements",
				"EllipsoidPoint"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPoint"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPoint"
				)
			    ),
			    0
			)
		    ),
		    "ellipsoidPoint",
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
				"EllipsoidPointUncertCircle"
			    ),
			    new QName (
				"InformationElements",
				"EllipsoidPointUncertCircle"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointUncertCircle"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointUncertCircle"
				)
			    ),
			    0
			)
		    ),
		    "ellipsoidPointUncertCircle",
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
				"EllipsoidPointUncertEllipse"
			    ),
			    new QName (
				"InformationElements",
				"EllipsoidPointUncertEllipse"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointUncertEllipse"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointUncertEllipse"
				)
			    ),
			    0
			)
		    ),
		    "ellipsoidPointUncertEllipse",
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
				"EllipsoidPointAltitude"
			    ),
			    new QName (
				"InformationElements",
				"EllipsoidPointAltitude"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointAltitude"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointAltitude"
				)
			    ),
			    0
			)
		    ),
		    "ellipsoidPointAltitude",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EllipsoidPointAltitudeEllipsoide"
			    ),
			    new QName (
				"InformationElements",
				"EllipsoidPointAltitudeEllipsoide"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointAltitudeEllipsoide"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EllipsoidPointAltitudeEllipsoide"
				)
			    ),
			    0
			)
		    ),
		    "ellipsoidPointAltitudeEllipse",
		    4,
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
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PositionEstimate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositionEstimate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositionEstimate
