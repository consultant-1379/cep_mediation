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
 * Define the ASN1 Type HeaderCompressionInfo_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HeaderCompressionInfo_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HeaderCompressionInfo_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HeaderCompressionInfo_r4(AlgorithmSpecificInfo_r4 algorithmSpecificInfo)
    {
	setAlgorithmSpecificInfo(algorithmSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AlgorithmSpecificInfo_r4();
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
		return new AlgorithmSpecificInfo_r4();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "algorithmSpecificInfo"
    public AlgorithmSpecificInfo_r4 getAlgorithmSpecificInfo()
    {
	return (AlgorithmSpecificInfo_r4)mComponents[0];
    }
    
    public void setAlgorithmSpecificInfo(AlgorithmSpecificInfo_r4 algorithmSpecificInfo)
    {
	mComponents[0] = algorithmSpecificInfo;
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
	    "HeaderCompressionInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "HeaderCompressionInfo-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AlgorithmSpecificInfo_r4"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "algorithmSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' HeaderCompressionInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HeaderCompressionInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HeaderCompressionInfo_r4
