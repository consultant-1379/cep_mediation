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
 * Define the ASN1 Type PreDefTransChConfiguration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PreDefTransChConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public PreDefTransChConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PreDefTransChConfiguration(UL_CommonTransChInfo ul_CommonTransChInfo, 
		    UL_AddReconfTransChInfoList ul_AddReconfTrChInfoList, 
		    DL_CommonTransChInfo dl_CommonTransChInfo, 
		    DL_AddReconfTransChInfoList dl_TrChInfoList)
    {
	setUl_CommonTransChInfo(ul_CommonTransChInfo);
	setUl_AddReconfTrChInfoList(ul_AddReconfTrChInfoList);
	setDl_CommonTransChInfo(dl_CommonTransChInfo);
	setDl_TrChInfoList(dl_TrChInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_CommonTransChInfo();
	mComponents[1] = new UL_AddReconfTransChInfoList();
	mComponents[2] = new DL_CommonTransChInfo();
	mComponents[3] = new DL_AddReconfTransChInfoList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UL_CommonTransChInfo();
	    case 1:
		return new UL_AddReconfTransChInfoList();
	    case 2:
		return new DL_CommonTransChInfo();
	    case 3:
		return new DL_AddReconfTransChInfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_CommonTransChInfo"
    public UL_CommonTransChInfo getUl_CommonTransChInfo()
    {
	return (UL_CommonTransChInfo)mComponents[0];
    }
    
    public void setUl_CommonTransChInfo(UL_CommonTransChInfo ul_CommonTransChInfo)
    {
	mComponents[0] = ul_CommonTransChInfo;
    }
    
    
    // Methods for field "ul_AddReconfTrChInfoList"
    public UL_AddReconfTransChInfoList getUl_AddReconfTrChInfoList()
    {
	return (UL_AddReconfTransChInfoList)mComponents[1];
    }
    
    public void setUl_AddReconfTrChInfoList(UL_AddReconfTransChInfoList ul_AddReconfTrChInfoList)
    {
	mComponents[1] = ul_AddReconfTrChInfoList;
    }
    
    
    // Methods for field "dl_CommonTransChInfo"
    public DL_CommonTransChInfo getDl_CommonTransChInfo()
    {
	return (DL_CommonTransChInfo)mComponents[2];
    }
    
    public void setDl_CommonTransChInfo(DL_CommonTransChInfo dl_CommonTransChInfo)
    {
	mComponents[2] = dl_CommonTransChInfo;
    }
    
    
    // Methods for field "dl_TrChInfoList"
    public DL_AddReconfTransChInfoList getDl_TrChInfoList()
    {
	return (DL_AddReconfTransChInfoList)mComponents[3];
    }
    
    public void setDl_TrChInfoList(DL_AddReconfTransChInfoList dl_TrChInfoList)
    {
	mComponents[3] = dl_TrChInfoList;
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
	    "PreDefTransChConfiguration"
	),
	new QName (
	    "InformationElements",
	    "PreDefTransChConfiguration"
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
				"UL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"UL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "ul-CommonTransChInfo",
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
				"UL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"UL-AddReconfTransChInfoList"
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
				    "UL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "ul-AddReconfTrChInfoList",
		    1,
		    2,
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
				"DL_CommonTransChInfo"
			    ),
			    new QName (
				"InformationElements",
				"DL-CommonTransChInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_CommonTransChInfo"
				)
			    ),
			    0
			)
		    ),
		    "dl-CommonTransChInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_AddReconfTransChInfoList"
			    ),
			    new QName (
				"InformationElements",
				"DL-AddReconfTransChInfoList"
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
				    "DL_AddReconfTransChInformation"
				)
			    )
			)
		    ),
		    "dl-TrChInfoList",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PreDefTransChConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PreDefTransChConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PreDefTransChConfiguration
