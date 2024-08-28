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
 * Define the ASN1 Type LoggingAbsoluteThreshold from ASN1 Module InformationElements.
 * @see Choice
 */

public class LoggingAbsoluteThreshold extends Choice {
    
    /**
     * The default constructor.
     */
    public LoggingAbsoluteThreshold()
    {
    }
    
    public static final  int  rscpforANR_chosen = 1;
    public static final  int  ec_N0forANR_chosen = 2;
    
    // Methods for field "rscpforANR"
    public static LoggingAbsoluteThreshold createLoggingAbsoluteThresholdWithRscpforANR(RSCPforANR rscpforANR)
    {
	LoggingAbsoluteThreshold __object = new LoggingAbsoluteThreshold();

	__object.setRscpforANR(rscpforANR);
	return __object;
    }
    
    public boolean hasRscpforANR()
    {
	return getChosenFlag() == rscpforANR_chosen;
    }
    
    public void setRscpforANR(RSCPforANR rscpforANR)
    {
	setChosenValue(rscpforANR);
	setChosenFlag(rscpforANR_chosen);
    }
    
    
    // Methods for field "ec_N0forANR"
    public static LoggingAbsoluteThreshold createLoggingAbsoluteThresholdWithEc_N0forANR(Ec_N0forANR ec_N0forANR)
    {
	LoggingAbsoluteThreshold __object = new LoggingAbsoluteThreshold();

	__object.setEc_N0forANR(ec_N0forANR);
	return __object;
    }
    
    public boolean hasEc_N0forANR()
    {
	return getChosenFlag() == ec_N0forANR_chosen;
    }
    
    public void setEc_N0forANR(Ec_N0forANR ec_N0forANR)
    {
	setChosenValue(ec_N0forANR);
	setChosenFlag(ec_N0forANR_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case rscpforANR_chosen:
		return new RSCPforANR();
	    case ec_N0forANR_chosen:
		return new Ec_N0forANR();
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
	    "LoggingAbsoluteThreshold"
	),
	new QName (
	    "InformationElements",
	    "LoggingAbsoluteThreshold"
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
				"RSCPforANR"
			    ),
			    new QName (
				"InformationElements",
				"RSCPforANR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RSCPforANR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RSCPforANR"
				)
			    ),
			    0
			)
		    ),
		    "rscpforANR",
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
				"Ec_N0forANR"
			    ),
			    new QName (
				"InformationElements",
				"Ec-N0forANR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Ec_N0forANR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Ec_N0forANR"
				)
			    ),
			    0
			)
		    ),
		    "ec-N0forANR",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggingAbsoluteThreshold object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggingAbsoluteThreshold object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggingAbsoluteThreshold
