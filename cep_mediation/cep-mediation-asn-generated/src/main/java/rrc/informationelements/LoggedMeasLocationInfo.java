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
 * Define the ASN1 Type LoggedMeasLocationInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class LoggedMeasLocationInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public LoggedMeasLocationInfo()
    {
    }
    
    public static final  int  ellipsoidPoint_chosen = 1;
    public static final  int  ellipsoidPointAltitude_chosen = 2;
    
    // Methods for field "ellipsoidPoint"
    public static LoggedMeasLocationInfo createLoggedMeasLocationInfoWithEllipsoidPoint(EllipsoidPoint ellipsoidPoint)
    {
	LoggedMeasLocationInfo __object = new LoggedMeasLocationInfo();

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
    
    
    // Methods for field "ellipsoidPointAltitude"
    public static LoggedMeasLocationInfo createLoggedMeasLocationInfoWithEllipsoidPointAltitude(EllipsoidPointAltitude ellipsoidPointAltitude)
    {
	LoggedMeasLocationInfo __object = new LoggedMeasLocationInfo();

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
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case ellipsoidPoint_chosen:
		return new EllipsoidPoint();
	    case ellipsoidPointAltitude_chosen:
		return new EllipsoidPointAltitude();
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
	    "LoggedMeasLocationInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasLocationInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasLocationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasLocationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasLocationInfo
