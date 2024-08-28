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
 * Define the ASN1 Type AlgorithmSpecificInfo_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class AlgorithmSpecificInfo_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public AlgorithmSpecificInfo_r4()
    {
    }
    
    public static final  int  rfc2507_Info_chosen = 1;
    public static final  int  rfc3095_Info_chosen = 2;
    
    // Methods for field "rfc2507_Info"
    public static AlgorithmSpecificInfo_r4 createAlgorithmSpecificInfo_r4WithRfc2507_Info(RFC2507_Info rfc2507_Info)
    {
	AlgorithmSpecificInfo_r4 __object = new AlgorithmSpecificInfo_r4();

	__object.setRfc2507_Info(rfc2507_Info);
	return __object;
    }
    
    public boolean hasRfc2507_Info()
    {
	return getChosenFlag() == rfc2507_Info_chosen;
    }
    
    public void setRfc2507_Info(RFC2507_Info rfc2507_Info)
    {
	setChosenValue(rfc2507_Info);
	setChosenFlag(rfc2507_Info_chosen);
    }
    
    
    // Methods for field "rfc3095_Info"
    public static AlgorithmSpecificInfo_r4 createAlgorithmSpecificInfo_r4WithRfc3095_Info(RFC3095_Info_r4 rfc3095_Info)
    {
	AlgorithmSpecificInfo_r4 __object = new AlgorithmSpecificInfo_r4();

	__object.setRfc3095_Info(rfc3095_Info);
	return __object;
    }
    
    public boolean hasRfc3095_Info()
    {
	return getChosenFlag() == rfc3095_Info_chosen;
    }
    
    public void setRfc3095_Info(RFC3095_Info_r4 rfc3095_Info)
    {
	setChosenValue(rfc3095_Info);
	setChosenFlag(rfc3095_Info_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case rfc2507_Info_chosen:
		return new RFC2507_Info();
	    case rfc3095_Info_chosen:
		return new RFC3095_Info_r4();
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
	    "AlgorithmSpecificInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "AlgorithmSpecificInfo-r4"
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
				"RFC2507_Info"
			    ),
			    new QName (
				"InformationElements",
				"RFC2507-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RFC2507_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RFC2507_Info"
				)
			    ),
			    0
			)
		    ),
		    "rfc2507-Info",
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
				"RFC3095_Info_r4"
			    ),
			    new QName (
				"InformationElements",
				"RFC3095-Info-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RFC3095_Info_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RFC3095_Info_r4"
				)
			    ),
			    0
			)
		    ),
		    "rfc3095-Info",
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
     * Get the type descriptor (TypeInfo) of 'this' AlgorithmSpecificInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AlgorithmSpecificInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AlgorithmSpecificInfo_r4
