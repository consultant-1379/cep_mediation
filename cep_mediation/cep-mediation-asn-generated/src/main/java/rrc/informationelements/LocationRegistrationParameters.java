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
 * Define the ASN1 Type LocationRegistrationParameters from ASN1 Module InformationElements.
 * @see Choice
 */

public class LocationRegistrationParameters extends Choice {
    
    /**
     * The default constructor.
     */
    public LocationRegistrationParameters()
    {
    }
    
    public static final  int  noRestriction_chosen = 1;
    public static final  int  restriction_chosen = 2;
    
    // Methods for field "noRestriction"
    public static LocationRegistrationParameters createLocationRegistrationParametersWithNoRestriction(Null noRestriction)
    {
	LocationRegistrationParameters __object = new LocationRegistrationParameters();

	__object.setNoRestriction(noRestriction);
	return __object;
    }
    
    public boolean hasNoRestriction()
    {
	return getChosenFlag() == noRestriction_chosen;
    }
    
    public void setNoRestriction(Null noRestriction)
    {
	setChosenValue(noRestriction);
	setChosenFlag(noRestriction_chosen);
    }
    
    
    // Methods for field "restriction"
    public static LocationRegistrationParameters createLocationRegistrationParametersWithRestriction(LocationRegistrationAccessClassBarredList restriction)
    {
	LocationRegistrationParameters __object = new LocationRegistrationParameters();

	__object.setRestriction(restriction);
	return __object;
    }
    
    public boolean hasRestriction()
    {
	return getChosenFlag() == restriction_chosen;
    }
    
    public void setRestriction(LocationRegistrationAccessClassBarredList restriction)
    {
	setChosenValue(restriction);
	setChosenFlag(restriction_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noRestriction_chosen:
		return new Null();
	    case restriction_chosen:
		return new LocationRegistrationAccessClassBarredList();
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
	    "LocationRegistrationParameters"
	),
	new QName (
	    "InformationElements",
	    "LocationRegistrationParameters"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "noRestriction",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"LocationRegistrationAccessClassBarredList"
			    ),
			    new QName (
				"InformationElements",
				"LocationRegistrationAccessClassBarredList"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(15)
				)
			    ),
			    new Bounds (
				new java.lang.Long(15),
				new java.lang.Long(15)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "AccessClassBarred"
				)
			    )
			)
		    ),
		    "restriction",
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
     * Get the type descriptor (TypeInfo) of 'this' LocationRegistrationParameters object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LocationRegistrationParameters object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LocationRegistrationParameters
