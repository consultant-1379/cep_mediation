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
 * Define the ASN1 Type CCTrCH_PowerControlInfo_r5 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CCTrCH_PowerControlInfo_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CCTrCH_PowerControlInfo_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CCTrCH_PowerControlInfo_r5(TFCS_Identity tfcs_Identity, 
		    UL_DPCH_PowerControlInfo_r5 ul_DPCH_PowerControlInfo)
    {
	setTfcs_Identity(tfcs_Identity);
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CCTrCH_PowerControlInfo_r5(UL_DPCH_PowerControlInfo_r5 ul_DPCH_PowerControlInfo)
    {
	setUl_DPCH_PowerControlInfo(ul_DPCH_PowerControlInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_Identity();
	mComponents[1] = new UL_DPCH_PowerControlInfo_r5();
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
		return new TFCS_Identity();
	    case 1:
		return new UL_DPCH_PowerControlInfo_r5();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tfcs_Identity"
    public TFCS_Identity getTfcs_Identity()
    {
	return (TFCS_Identity)mComponents[0];
    }
    
    public void setTfcs_Identity(TFCS_Identity tfcs_Identity)
    {
	mComponents[0] = tfcs_Identity;
    }
    
    public boolean hasTfcs_Identity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTfcs_Identity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ul_DPCH_PowerControlInfo"
    public UL_DPCH_PowerControlInfo_r5 getUl_DPCH_PowerControlInfo()
    {
	return (UL_DPCH_PowerControlInfo_r5)mComponents[1];
    }
    
    public void setUl_DPCH_PowerControlInfo(UL_DPCH_PowerControlInfo_r5 ul_DPCH_PowerControlInfo)
    {
	mComponents[1] = ul_DPCH_PowerControlInfo;
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
	    "CCTrCH_PowerControlInfo_r5"
	),
	new QName (
	    "InformationElements",
	    "CCTrCH-PowerControlInfo-r5"
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
				"TFCS_Identity"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0
			)
		    ),
		    "tfcs-Identity",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_DPCH_PowerControlInfo_r5"
			    ),
			    new QName (
				"InformationElements",
				"UL-DPCH-PowerControlInfo-r5"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfo_r5"
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
		    "ul-DPCH-PowerControlInfo",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' CCTrCH_PowerControlInfo_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CCTrCH_PowerControlInfo_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CCTrCH_PowerControlInfo_r5
