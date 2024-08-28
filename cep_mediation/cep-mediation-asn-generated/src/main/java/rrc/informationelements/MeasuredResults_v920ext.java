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
 * Define the ASN1 Type MeasuredResults_v920ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasuredResults_v920ext extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasuredResults_v920ext()
    {
    }
    
    public static final  int  intraFreqMeasuredResultsList_chosen = 1;
    public static final  int  interFreqMeasuredResultsList_chosen = 2;
    
    // Methods for field "intraFreqMeasuredResultsList"
    public static MeasuredResults_v920ext createMeasuredResults_v920extWithIntraFreqMeasuredResultsList(IntraFreqMeasuredResultsList_v920ext intraFreqMeasuredResultsList)
    {
	MeasuredResults_v920ext __object = new MeasuredResults_v920ext();

	__object.setIntraFreqMeasuredResultsList(intraFreqMeasuredResultsList);
	return __object;
    }
    
    public boolean hasIntraFreqMeasuredResultsList()
    {
	return getChosenFlag() == intraFreqMeasuredResultsList_chosen;
    }
    
    public void setIntraFreqMeasuredResultsList(IntraFreqMeasuredResultsList_v920ext intraFreqMeasuredResultsList)
    {
	setChosenValue(intraFreqMeasuredResultsList);
	setChosenFlag(intraFreqMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "interFreqMeasuredResultsList"
    public static MeasuredResults_v920ext createMeasuredResults_v920extWithInterFreqMeasuredResultsList(InterFreqMeasuredResultsList_v920ext interFreqMeasuredResultsList)
    {
	MeasuredResults_v920ext __object = new MeasuredResults_v920ext();

	__object.setInterFreqMeasuredResultsList(interFreqMeasuredResultsList);
	return __object;
    }
    
    public boolean hasInterFreqMeasuredResultsList()
    {
	return getChosenFlag() == interFreqMeasuredResultsList_chosen;
    }
    
    public void setInterFreqMeasuredResultsList(InterFreqMeasuredResultsList_v920ext interFreqMeasuredResultsList)
    {
	setChosenValue(interFreqMeasuredResultsList);
	setChosenFlag(interFreqMeasuredResultsList_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFreqMeasuredResultsList_chosen:
		return new IntraFreqMeasuredResultsList_v920ext();
	    case interFreqMeasuredResultsList_chosen:
		return new InterFreqMeasuredResultsList_v920ext();
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
	    "MeasuredResults_v920ext"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResults-v920ext"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IntraFreqMeasuredResultsList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqMeasuredResultsList-v920ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "CellMeasuredResults_v920ext"
				)
			    )
			)
		    ),
		    "intraFreqMeasuredResultsList",
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
				"InterFreqMeasuredResultsList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"InterFreqMeasuredResultsList-v920ext"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "InterFreqMeasuredResults_v920ext"
				)
			    )
			)
		    ),
		    "interFreqMeasuredResultsList",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResults_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResults_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResults_v920ext
