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
 * Define the ASN1 Type EUTRA_FrequencyList_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class EUTRA_FrequencyList_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public EUTRA_FrequencyList_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EUTRA_FrequencyList_r9(EUTRA_FrequencyRemoval eutraFrequencyRemoval, 
		    EUTRA_FrequencyInfoList eutraNewFrequencies, 
		    EUTRA_SIAcquisition eutraSIAcquisition)
    {
	setEutraFrequencyRemoval(eutraFrequencyRemoval);
	setEutraNewFrequencies(eutraNewFrequencies);
	setEutraSIAcquisition(eutraSIAcquisition);
    }
    
    /**
     * Construct with required components.
     */
    public EUTRA_FrequencyList_r9(EUTRA_FrequencyRemoval eutraFrequencyRemoval)
    {
	setEutraFrequencyRemoval(eutraFrequencyRemoval);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EUTRA_FrequencyRemoval();
	mComponents[1] = new EUTRA_FrequencyInfoList();
	mComponents[2] = new EUTRA_SIAcquisition();
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
		return new EUTRA_FrequencyRemoval();
	    case 1:
		return new EUTRA_FrequencyInfoList();
	    case 2:
		return new EUTRA_SIAcquisition();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eutraFrequencyRemoval"
    public EUTRA_FrequencyRemoval getEutraFrequencyRemoval()
    {
	return (EUTRA_FrequencyRemoval)mComponents[0];
    }
    
    public void setEutraFrequencyRemoval(EUTRA_FrequencyRemoval eutraFrequencyRemoval)
    {
	mComponents[0] = eutraFrequencyRemoval;
    }
    
    
    // Methods for field "eutraNewFrequencies"
    public EUTRA_FrequencyInfoList getEutraNewFrequencies()
    {
	return (EUTRA_FrequencyInfoList)mComponents[1];
    }
    
    public void setEutraNewFrequencies(EUTRA_FrequencyInfoList eutraNewFrequencies)
    {
	mComponents[1] = eutraNewFrequencies;
    }
    
    public boolean hasEutraNewFrequencies()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEutraNewFrequencies()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "eutraSIAcquisition"
    public EUTRA_SIAcquisition getEutraSIAcquisition()
    {
	return (EUTRA_SIAcquisition)mComponents[2];
    }
    
    public void setEutraSIAcquisition(EUTRA_SIAcquisition eutraSIAcquisition)
    {
	mComponents[2] = eutraSIAcquisition;
    }
    
    public boolean hasEutraSIAcquisition()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEutraSIAcquisition()
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
	    "EUTRA_FrequencyList_r9"
	),
	new QName (
	    "InformationElements",
	    "EUTRA-FrequencyList-r9"
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
				"EUTRA_FrequencyRemoval"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-FrequencyRemoval"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_FrequencyRemoval"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "eutraFrequencyRemoval",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EUTRA_FrequencyInfoList"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-FrequencyInfoList"
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
				    "EUTRA_FrequencyInfo"
				)
			    )
			)
		    ),
		    "eutraNewFrequencies",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"EUTRA_SIAcquisition"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-SIAcquisition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_SIAcquisition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "EUTRA_SIAcquisition"
				)
			    ),
			    0
			)
		    ),
		    "eutraSIAcquisition",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' EUTRA_FrequencyList_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EUTRA_FrequencyList_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EUTRA_FrequencyList_r9
