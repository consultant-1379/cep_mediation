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
 * Define the ASN1 Type SysInfoType19_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType19_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType19_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType19_v920ext(UTRA_PriorityInfoList_v920ext utra_PriorityInfoList_v920ext, 
		    EUTRA_FrequencyAndPriorityInfoList_v920ext eutra_FrequencyAndPriorityInfoList_v920ext)
    {
	setUtra_PriorityInfoList_v920ext(utra_PriorityInfoList_v920ext);
	setEutra_FrequencyAndPriorityInfoList_v920ext(eutra_FrequencyAndPriorityInfoList_v920ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTRA_PriorityInfoList_v920ext();
	mComponents[1] = new EUTRA_FrequencyAndPriorityInfoList_v920ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTRA_PriorityInfoList_v920ext();
	    case 1:
		return new EUTRA_FrequencyAndPriorityInfoList_v920ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utra_PriorityInfoList_v920ext"
    public UTRA_PriorityInfoList_v920ext getUtra_PriorityInfoList_v920ext()
    {
	return (UTRA_PriorityInfoList_v920ext)mComponents[0];
    }
    
    public void setUtra_PriorityInfoList_v920ext(UTRA_PriorityInfoList_v920ext utra_PriorityInfoList_v920ext)
    {
	mComponents[0] = utra_PriorityInfoList_v920ext;
    }
    
    
    // Methods for field "eutra_FrequencyAndPriorityInfoList_v920ext"
    public EUTRA_FrequencyAndPriorityInfoList_v920ext getEutra_FrequencyAndPriorityInfoList_v920ext()
    {
	return (EUTRA_FrequencyAndPriorityInfoList_v920ext)mComponents[1];
    }
    
    public void setEutra_FrequencyAndPriorityInfoList_v920ext(EUTRA_FrequencyAndPriorityInfoList_v920ext eutra_FrequencyAndPriorityInfoList_v920ext)
    {
	mComponents[1] = eutra_FrequencyAndPriorityInfoList_v920ext;
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
	    "SysInfoType19_v920ext"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType19-v920ext"
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
				"UTRA_PriorityInfoList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"UTRA-PriorityInfoList-v920ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTRA_PriorityInfoList_v920ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTRA_PriorityInfoList_v920ext"
				)
			    ),
			    0
			)
		    ),
		    "utra-PriorityInfoList-v920ext",
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
				"EUTRA_FrequencyAndPriorityInfoList_v920ext"
			    ),
			    new QName (
				"InformationElements",
				"EUTRA-FrequencyAndPriorityInfoList-v920ext"
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
				    "EUTRA_FrequencyAndPriorityInfo_v920ext"
				)
			    )
			)
		    ),
		    "eutra-FrequencyAndPriorityInfoList-v920ext",
		    1,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType19_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType19_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType19_v920ext
