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
 * Define the ASN1 Type SFN_SFN_ObsTimeDifference from ASN1 Module InformationElements.
 * @see Choice
 */

public class SFN_SFN_ObsTimeDifference extends Choice {
    
    /**
     * The default constructor.
     */
    public SFN_SFN_ObsTimeDifference()
    {
    }
    
    public static final  int  type1_chosen = 1;
    public static final  int  type2_chosen = 2;
    
    // Methods for field "type1"
    public static SFN_SFN_ObsTimeDifference createSFN_SFN_ObsTimeDifferenceWithType1(long type1)
    {
	return createSFN_SFN_ObsTimeDifferenceWithType1(new SFN_SFN_ObsTimeDifference1(type1));
    }
    
    public static SFN_SFN_ObsTimeDifference createSFN_SFN_ObsTimeDifferenceWithType1(SFN_SFN_ObsTimeDifference1 type1)
    {
	SFN_SFN_ObsTimeDifference __object = new SFN_SFN_ObsTimeDifference();

	__object.setType1(type1);
	return __object;
    }
    
    public boolean hasType1()
    {
	return getChosenFlag() == type1_chosen;
    }
    
    public void setType1(long type1)
    {
	setType1(new SFN_SFN_ObsTimeDifference1(type1));
    }
    
    public void setType1(SFN_SFN_ObsTimeDifference1 type1)
    {
	setChosenValue(type1);
	setChosenFlag(type1_chosen);
    }
    
    
    // Methods for field "type2"
    public static SFN_SFN_ObsTimeDifference createSFN_SFN_ObsTimeDifferenceWithType2(long type2)
    {
	return createSFN_SFN_ObsTimeDifferenceWithType2(new SFN_SFN_ObsTimeDifference2(type2));
    }
    
    public static SFN_SFN_ObsTimeDifference createSFN_SFN_ObsTimeDifferenceWithType2(SFN_SFN_ObsTimeDifference2 type2)
    {
	SFN_SFN_ObsTimeDifference __object = new SFN_SFN_ObsTimeDifference();

	__object.setType2(type2);
	return __object;
    }
    
    public boolean hasType2()
    {
	return getChosenFlag() == type2_chosen;
    }
    
    public void setType2(long type2)
    {
	setType2(new SFN_SFN_ObsTimeDifference2(type2));
    }
    
    public void setType2(SFN_SFN_ObsTimeDifference2 type2)
    {
	setChosenValue(type2);
	setChosenFlag(type2_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case type1_chosen:
		return new SFN_SFN_ObsTimeDifference1();
	    case type2_chosen:
		return new SFN_SFN_ObsTimeDifference2();
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
	    "SFN_SFN_ObsTimeDifference"
	),
	new QName (
	    "InformationElements",
	    "SFN-SFN-ObsTimeDifference"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SFN_SFN_ObsTimeDifference1"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-ObsTimeDifference1"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SFN_SFN_ObsTimeDifference1(0), 
				    new SFN_SFN_ObsTimeDifference1(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "type1",
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
				"SFN_SFN_ObsTimeDifference2"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-ObsTimeDifference2"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SFN_SFN_ObsTimeDifference2(0), 
				    new SFN_SFN_ObsTimeDifference2(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "type2",
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
     * Get the type descriptor (TypeInfo) of 'this' SFN_SFN_ObsTimeDifference object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SFN_SFN_ObsTimeDifference object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SFN_SFN_ObsTimeDifference
