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
 * Define the ASN1 Type DL_CommonInformationPredef from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CommonInformationPredef extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CommonInformationPredef()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CommonInformationPredef(DL_DPCH_InfoCommonPredef dl_DPCH_InfoCommon)
    {
	setDl_DPCH_InfoCommon(dl_DPCH_InfoCommon);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DL_DPCH_InfoCommonPredef();
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
		return new DL_DPCH_InfoCommonPredef();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_DPCH_InfoCommon"
    public DL_DPCH_InfoCommonPredef getDl_DPCH_InfoCommon()
    {
	return (DL_DPCH_InfoCommonPredef)mComponents[0];
    }
    
    public void setDl_DPCH_InfoCommon(DL_DPCH_InfoCommonPredef dl_DPCH_InfoCommon)
    {
	mComponents[0] = dl_DPCH_InfoCommon;
    }
    
    public boolean hasDl_DPCH_InfoCommon()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_DPCH_InfoCommon()
    {
	setComponentAbsent(0);
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
	    "DL_CommonInformationPredef"
	),
	new QName (
	    "InformationElements",
	    "DL-CommonInformationPredef"
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
				"DL_DPCH_InfoCommonPredef"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-InfoCommonPredef"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoCommonPredef"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoCommonPredef"
				)
			    ),
			    0
			)
		    ),
		    "dl-DPCH-InfoCommon",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_CommonInformationPredef object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CommonInformationPredef object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CommonInformationPredef
