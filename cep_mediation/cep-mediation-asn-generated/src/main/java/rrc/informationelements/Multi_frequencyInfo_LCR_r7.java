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
 * Define the ASN1 Type Multi_frequencyInfo_LCR_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Multi_frequencyInfo_LCR_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Multi_frequencyInfo_LCR_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Multi_frequencyInfo_LCR_r7(FrequencyInfoTDD secondFrequencyInfo, 
		    FrequencyInfoTDD fPachFrequencyInfo, 
		    UpPCHposition_LCR upPCHpositionInfo)
    {
	setSecondFrequencyInfo(secondFrequencyInfo);
	setFPachFrequencyInfo(fPachFrequencyInfo);
	setUpPCHpositionInfo(upPCHpositionInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FrequencyInfoTDD();
	mComponents[1] = new FrequencyInfoTDD();
	mComponents[2] = new UpPCHposition_LCR();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new FrequencyInfoTDD();
	    case 1:
		return new FrequencyInfoTDD();
	    case 2:
		return new UpPCHposition_LCR();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondFrequencyInfo"
    public FrequencyInfoTDD getSecondFrequencyInfo()
    {
	return (FrequencyInfoTDD)mComponents[0];
    }
    
    public void setSecondFrequencyInfo(FrequencyInfoTDD secondFrequencyInfo)
    {
	mComponents[0] = secondFrequencyInfo;
    }
    
    public boolean hasSecondFrequencyInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSecondFrequencyInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "fPachFrequencyInfo"
    public FrequencyInfoTDD getFPachFrequencyInfo()
    {
	return (FrequencyInfoTDD)mComponents[1];
    }
    
    public void setFPachFrequencyInfo(FrequencyInfoTDD fPachFrequencyInfo)
    {
	mComponents[1] = fPachFrequencyInfo;
    }
    
    public boolean hasFPachFrequencyInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFPachFrequencyInfo()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "upPCHpositionInfo"
    public UpPCHposition_LCR getUpPCHpositionInfo()
    {
	return (UpPCHposition_LCR)mComponents[2];
    }
    
    public void setUpPCHpositionInfo(UpPCHposition_LCR upPCHpositionInfo)
    {
	mComponents[2] = upPCHpositionInfo;
    }
    
    public boolean hasUpPCHpositionInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUpPCHpositionInfo()
    {
	setComponentAbsent(2);
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
	    "Multi_frequencyInfo_LCR_r7"
	),
	new QName (
	    "InformationElements",
	    "Multi-frequencyInfo-LCR-r7"
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
				"FrequencyInfoTDD"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfoTDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfoTDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfoTDD"
				)
			    ),
			    0
			)
		    ),
		    "secondFrequencyInfo",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FrequencyInfoTDD"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfoTDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfoTDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfoTDD"
				)
			    ),
			    0
			)
		    ),
		    "fPachFrequencyInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UpPCHposition_LCR"
			    ),
			    new QName (
				"InformationElements",
				"UpPCHposition-LCR"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UpPCHposition_LCR(0), 
				    new UpPCHposition_LCR(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "upPCHpositionInfo",
		    2,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Multi_frequencyInfo_LCR_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Multi_frequencyInfo_LCR_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Multi_frequencyInfo_LCR_r7
