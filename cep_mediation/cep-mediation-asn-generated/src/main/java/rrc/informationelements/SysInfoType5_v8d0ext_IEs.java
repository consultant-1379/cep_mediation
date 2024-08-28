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
 * Define the ASN1 Type SysInfoType5_v8d0ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v8d0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v8d0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v8d0ext_IEs(CommonEDCHSystemInfoFDD commonEDCHSystemInfoFDD)
    {
	setCommonEDCHSystemInfoFDD(commonEDCHSystemInfoFDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CommonEDCHSystemInfoFDD();
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
		return new CommonEDCHSystemInfoFDD();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "commonEDCHSystemInfoFDD"
    public CommonEDCHSystemInfoFDD getCommonEDCHSystemInfoFDD()
    {
	return (CommonEDCHSystemInfoFDD)mComponents[0];
    }
    
    public void setCommonEDCHSystemInfoFDD(CommonEDCHSystemInfoFDD commonEDCHSystemInfoFDD)
    {
	mComponents[0] = commonEDCHSystemInfoFDD;
    }
    
    public boolean hasCommonEDCHSystemInfoFDD()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCommonEDCHSystemInfoFDD()
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
	    "SysInfoType5_v8d0ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v8d0ext-IEs"
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
				"CommonEDCHSystemInfoFDD"
			    ),
			    new QName (
				"InformationElements",
				"CommonEDCHSystemInfoFDD"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonEDCHSystemInfoFDD"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonEDCHSystemInfoFDD"
				)
			    ),
			    0
			)
		    ),
		    "commonEDCHSystemInfoFDD",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v8d0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v8d0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v8d0ext_IEs
