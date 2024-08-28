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
 * Define the ASN1 Type TransportFormatSet_LCR from ASN1 Module InformationElements.
 * @see Choice
 */

public class TransportFormatSet_LCR extends Choice {
    
    /**
     * The default constructor.
     */
    public TransportFormatSet_LCR()
    {
    }
    
    public static final  int  dedicatedTransChTFS_chosen = 1;
    public static final  int  commonTransChTFS_LCR_chosen = 2;
    
    // Methods for field "dedicatedTransChTFS"
    public static TransportFormatSet_LCR createTransportFormatSet_LCRWithDedicatedTransChTFS(DedicatedTransChTFS dedicatedTransChTFS)
    {
	TransportFormatSet_LCR __object = new TransportFormatSet_LCR();

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
    
    
    // Methods for field "commonTransChTFS_LCR"
    public static TransportFormatSet_LCR createTransportFormatSet_LCRWithCommonTransChTFS_LCR(CommonTransChTFS_LCR commonTransChTFS_LCR)
    {
	TransportFormatSet_LCR __object = new TransportFormatSet_LCR();

	__object.setCommonTransChTFS_LCR(commonTransChTFS_LCR);
	return __object;
    }
    
    public boolean hasCommonTransChTFS_LCR()
    {
	return getChosenFlag() == commonTransChTFS_LCR_chosen;
    }
    
    public void setCommonTransChTFS_LCR(CommonTransChTFS_LCR commonTransChTFS_LCR)
    {
	setChosenValue(commonTransChTFS_LCR);
	setChosenFlag(commonTransChTFS_LCR_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dedicatedTransChTFS_chosen:
		return new DedicatedTransChTFS();
	    case commonTransChTFS_LCR_chosen:
		return new CommonTransChTFS_LCR();
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
	    "TransportFormatSet_LCR"
	),
	new QName (
	    "InformationElements",
	    "TransportFormatSet-LCR"
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
				"CommonTransChTFS_LCR"
			    ),
			    new QName (
				"InformationElements",
				"CommonTransChTFS-LCR"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTransChTFS_LCR"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTransChTFS_LCR"
				)
			    ),
			    0
			)
		    ),
		    "commonTransChTFS-LCR",
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
     * Get the type descriptor (TypeInfo) of 'this' TransportFormatSet_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransportFormatSet_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransportFormatSet_LCR
