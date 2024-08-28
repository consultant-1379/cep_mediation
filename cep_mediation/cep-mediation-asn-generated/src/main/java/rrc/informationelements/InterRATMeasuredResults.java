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
 * Define the ASN1 Type InterRATMeasuredResults from ASN1 Module InformationElements.
 * @see Choice
 */

public class InterRATMeasuredResults extends Choice {
    
    /**
     * The default constructor.
     */
    public InterRATMeasuredResults()
    {
    }
    
    public static final  int  gsm_chosen = 1;
    public static final  int  spare_chosen = 2;
    
    // Methods for field "gsm"
    public static InterRATMeasuredResults createInterRATMeasuredResultsWithGsm(GSM_MeasuredResultsList gsm)
    {
	InterRATMeasuredResults __object = new InterRATMeasuredResults();

	__object.setGsm(gsm);
	return __object;
    }
    
    public boolean hasGsm()
    {
	return getChosenFlag() == gsm_chosen;
    }
    
    public void setGsm(GSM_MeasuredResultsList gsm)
    {
	setChosenValue(gsm);
	setChosenFlag(gsm_chosen);
    }
    
    
    // Methods for field "spare"
    public static InterRATMeasuredResults createInterRATMeasuredResultsWithSpare(Null spare)
    {
	InterRATMeasuredResults __object = new InterRATMeasuredResults();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsm_chosen:
		return new GSM_MeasuredResultsList();
	    case spare_chosen:
		return new Null();
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
	    "InterRATMeasuredResults"
	),
	new QName (
	    "InformationElements",
	    "InterRATMeasuredResults"
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
				"GSM_MeasuredResultsList"
			    ),
			    new QName (
				"InformationElements",
				"GSM-MeasuredResultsList"
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
				    "GSM_MeasuredResults"
				)
			    )
			)
		    ),
		    "gsm",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "spare",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATMeasuredResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATMeasuredResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATMeasuredResults
