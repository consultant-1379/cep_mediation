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
 * Define the ASN1 Type ReferenceTimeDifferenceToCell from ASN1 Module InformationElements.
 * @see Choice
 */

public class ReferenceTimeDifferenceToCell extends Choice {
    
    /**
     * The default constructor.
     */
    public ReferenceTimeDifferenceToCell()
    {
    }
    
    public static final  int  accuracy40_chosen = 1;
    public static final  int  accuracy256_chosen = 2;
    public static final  int  accuracy2560_chosen = 3;
    
    // Methods for field "accuracy40"
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy40(long accuracy40)
    {
	return createReferenceTimeDifferenceToCellWithAccuracy40(new INTEGER(accuracy40));
    }
    
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy40(INTEGER accuracy40)
    {
	ReferenceTimeDifferenceToCell __object = new ReferenceTimeDifferenceToCell();

	__object.setAccuracy40(accuracy40);
	return __object;
    }
    
    public boolean hasAccuracy40()
    {
	return getChosenFlag() == accuracy40_chosen;
    }
    
    public void setAccuracy40(long accuracy40)
    {
	setAccuracy40(new INTEGER(accuracy40));
    }
    
    public void setAccuracy40(INTEGER accuracy40)
    {
	setChosenValue(accuracy40);
	setChosenFlag(accuracy40_chosen);
    }
    
    
    // Methods for field "accuracy256"
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy256(long accuracy256)
    {
	return createReferenceTimeDifferenceToCellWithAccuracy256(new INTEGER(accuracy256));
    }
    
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy256(INTEGER accuracy256)
    {
	ReferenceTimeDifferenceToCell __object = new ReferenceTimeDifferenceToCell();

	__object.setAccuracy256(accuracy256);
	return __object;
    }
    
    public boolean hasAccuracy256()
    {
	return getChosenFlag() == accuracy256_chosen;
    }
    
    public void setAccuracy256(long accuracy256)
    {
	setAccuracy256(new INTEGER(accuracy256));
    }
    
    public void setAccuracy256(INTEGER accuracy256)
    {
	setChosenValue(accuracy256);
	setChosenFlag(accuracy256_chosen);
    }
    
    
    // Methods for field "accuracy2560"
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy2560(long accuracy2560)
    {
	return createReferenceTimeDifferenceToCellWithAccuracy2560(new INTEGER(accuracy2560));
    }
    
    public static ReferenceTimeDifferenceToCell createReferenceTimeDifferenceToCellWithAccuracy2560(INTEGER accuracy2560)
    {
	ReferenceTimeDifferenceToCell __object = new ReferenceTimeDifferenceToCell();

	__object.setAccuracy2560(accuracy2560);
	return __object;
    }
    
    public boolean hasAccuracy2560()
    {
	return getChosenFlag() == accuracy2560_chosen;
    }
    
    public void setAccuracy2560(long accuracy2560)
    {
	setAccuracy2560(new INTEGER(accuracy2560));
    }
    
    public void setAccuracy2560(INTEGER accuracy2560)
    {
	setChosenValue(accuracy2560);
	setChosenFlag(accuracy2560_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case accuracy40_chosen:
		return new INTEGER();
	    case accuracy256_chosen:
		return new INTEGER();
	    case accuracy2560_chosen:
		return new INTEGER();
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
	    "ReferenceTimeDifferenceToCell"
	),
	new QName (
	    "InformationElements",
	    "ReferenceTimeDifferenceToCell"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(960),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(960)
			    ),
			    null
			)
		    ),
		    "accuracy40",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(150),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(150)
			    ),
			    null
			)
		    ),
		    "accuracy256",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "accuracy2560",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ReferenceTimeDifferenceToCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReferenceTimeDifferenceToCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReferenceTimeDifferenceToCell
