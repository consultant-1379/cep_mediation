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
 * Define the ASN1 Type MeasuredResults_v590ext from ASN1 Module InformationElements.
 * @see Choice
 */

public class MeasuredResults_v590ext extends Choice {
    
    /**
     * The default constructor.
     */
    public MeasuredResults_v590ext()
    {
    }
    
    public static final  int  intraFrequencyMeasuredResultsList_chosen = 1;
    public static final  int  interFrequencyMeasuredResultsList_chosen = 2;
    
    // Methods for field "intraFrequencyMeasuredResultsList"
    public static MeasuredResults_v590ext createMeasuredResults_v590extWithIntraFrequencyMeasuredResultsList(IntraFrequencyMeasuredResultsList_v590ext intraFrequencyMeasuredResultsList)
    {
	MeasuredResults_v590ext __object = new MeasuredResults_v590ext();

	__object.setIntraFrequencyMeasuredResultsList(intraFrequencyMeasuredResultsList);
	return __object;
    }
    
    public boolean hasIntraFrequencyMeasuredResultsList()
    {
	return getChosenFlag() == intraFrequencyMeasuredResultsList_chosen;
    }
    
    public void setIntraFrequencyMeasuredResultsList(IntraFrequencyMeasuredResultsList_v590ext intraFrequencyMeasuredResultsList)
    {
	setChosenValue(intraFrequencyMeasuredResultsList);
	setChosenFlag(intraFrequencyMeasuredResultsList_chosen);
    }
    
    
    // Methods for field "interFrequencyMeasuredResultsList"
    public static MeasuredResults_v590ext createMeasuredResults_v590extWithInterFrequencyMeasuredResultsList(InterFrequencyMeasuredResultsList_v590ext interFrequencyMeasuredResultsList)
    {
	MeasuredResults_v590ext __object = new MeasuredResults_v590ext();

	__object.setInterFrequencyMeasuredResultsList(interFrequencyMeasuredResultsList);
	return __object;
    }
    
    public boolean hasInterFrequencyMeasuredResultsList()
    {
	return getChosenFlag() == interFrequencyMeasuredResultsList_chosen;
    }
    
    public void setInterFrequencyMeasuredResultsList(InterFrequencyMeasuredResultsList_v590ext interFrequencyMeasuredResultsList)
    {
	setChosenValue(interFrequencyMeasuredResultsList);
	setChosenFlag(interFrequencyMeasuredResultsList_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case intraFrequencyMeasuredResultsList_chosen:
		return new IntraFrequencyMeasuredResultsList_v590ext();
	    case interFrequencyMeasuredResultsList_chosen:
		return new InterFrequencyMeasuredResultsList_v590ext();
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
	    "MeasuredResults_v590ext"
	),
	new QName (
	    "InformationElements",
	    "MeasuredResults-v590ext"
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
				"IntraFrequencyMeasuredResultsList_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"IntraFrequencyMeasuredResultsList-v590ext"
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
				    "DeltaRSCPPerCell"
				)
			    )
			)
		    ),
		    "intraFrequencyMeasuredResultsList",
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
				"InterFrequencyMeasuredResultsList_v590ext"
			    ),
			    new QName (
				"InformationElements",
				"InterFrequencyMeasuredResultsList-v590ext"
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
				    "DeltaRSCPPerCell"
				)
			    )
			)
		    ),
		    "interFrequencyMeasuredResultsList",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasuredResults_v590ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasuredResults_v590ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasuredResults_v590ext
