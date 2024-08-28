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
 * Define the ASN1 Type TransportFormatSet from ASN1 Module InformationElements.
 * @see Choice
 */

public class TransportFormatSet extends Choice {
    
    /**
     * The default constructor.
     */
    public TransportFormatSet()
    {
    }
    
    public static final  int  dedicatedTransChTFS_chosen = 1;
    public static final  int  commonTransChTFS_chosen = 2;
    
    // Methods for field "dedicatedTransChTFS"
    public static TransportFormatSet createTransportFormatSetWithDedicatedTransChTFS(DedicatedTransChTFS dedicatedTransChTFS)
    {
	TransportFormatSet __object = new TransportFormatSet();

	__object.setDedicatedTransChTFS(dedicatedTransChTFS);
	return __object;
    }
    
    public boolean hasDedicatedTransChTFS()
    {
	return getChosenFlag() == dedicatedTransChTFS_chosen;
    }
    
    public void setDedicatedTransChTFS(DedicatedTransChTFS dedicatedTransChTFS)
    {
	setChosenValue(dedicatedTransChTFS);
	setChosenFlag(dedicatedTransChTFS_chosen);
    }
    
    
    // Methods for field "commonTransChTFS"
    public static TransportFormatSet createTransportFormatSetWithCommonTransChTFS(CommonTransChTFS commonTransChTFS)
    {
	TransportFormatSet __object = new TransportFormatSet();

	__object.setCommonTransChTFS(commonTransChTFS);
	return __object;
    }
    
    public boolean hasCommonTransChTFS()
    {
	return getChosenFlag() == commonTransChTFS_chosen;
    }
    
    public void setCommonTransChTFS(CommonTransChTFS commonTransChTFS)
    {
	setChosenValue(commonTransChTFS);
	setChosenFlag(commonTransChTFS_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dedicatedTransChTFS_chosen:
		return new DedicatedTransChTFS();
	    case commonTransChTFS_chosen:
		return new CommonTransChTFS();
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
	    "TransportFormatSet"
	),
	new QName (
	    "InformationElements",
	    "TransportFormatSet"
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
				"DedicatedTransChTFS"
			    ),
			    new QName (
				"InformationElements",
				"DedicatedTransChTFS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DedicatedTransChTFS"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DedicatedTransChTFS"
				)
			    ),
			    0
			)
		    ),
		    "dedicatedTransChTFS",
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
				"CommonTransChTFS"
			    ),
			    new QName (
				"InformationElements",
				"CommonTransChTFS"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTransChTFS"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTransChTFS"
				)
			    ),
			    0
			)
		    ),
		    "commonTransChTFS",
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
     * Get the type descriptor (TypeInfo) of 'this' TransportFormatSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportFormatSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportFormatSet
