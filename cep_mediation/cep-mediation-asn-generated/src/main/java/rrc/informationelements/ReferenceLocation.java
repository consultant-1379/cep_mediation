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
 * Define the ASN1 Type ReferenceLocation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ReferenceLocation extends Sequence {
    
    /**
     * The default constructor.
     */
    public ReferenceLocation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ReferenceLocation(EllipsoidPointAltitudeEllipsoide ellipsoidPointAltitudeEllipsoide)
    {
	setEllipsoidPointAltitudeEllipsoide(ellipsoidPointAltitudeEllipsoide);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EllipsoidPointAltitudeEllipsoide();
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
		return new EllipsoidPointAltitudeEllipsoide();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ellipsoidPointAltitudeEllipsoide"
    public EllipsoidPointAltitudeEllipsoide getEllipsoidPointAltitudeEllipsoide()
    {
	return (EllipsoidPointAltitudeEllipsoide)mComponents[0];
    }
    
    public void setEllipsoidPointAltitudeEllipsoide(EllipsoidPointAltitudeEllipsoide ellipsoidPointAltitudeEllipsoide)
    {
	mComponents[0] = ellipsoidPointAltitudeEllipsoide;
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
	    "ReferenceLocation"
	),
	new QName (
	    "InformationElements",
	    "ReferenceLocation"
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
		    "ellipsoidPointAltitudeEllipsoide",
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
     * Get the type descriptor (TypeInfo) of 'this' ReferenceLocation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReferenceLocation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReferenceLocation
