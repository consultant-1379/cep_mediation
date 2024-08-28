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
 * Define the ASN1 Type RLC_PDU_Size from ASN1 Module InformationElements.
 * @see OctetModeRLC_SizeInfoType1
 */

public class RLC_PDU_Size extends OctetModeRLC_SizeInfoType1 {
    
    /**
     * The default constructor.
     */
    public RLC_PDU_Size()
    {
    }
    
    // Methods for field "sizeType1"
    public static RLC_PDU_Size createRLC_PDU_SizeWithSizeType1(long sizeType1)
    {
	return createRLC_PDU_SizeWithSizeType1(new INTEGER(sizeType1));
    }
    
    public static RLC_PDU_Size createRLC_PDU_SizeWithSizeType1(INTEGER sizeType1)
    {
	RLC_PDU_Size __object = new RLC_PDU_Size();

	__object.setSizeType1(sizeType1);
	return __object;
    }
    
    public boolean hasSizeType1()
    {
	return getChosenFlag() == sizeType1_chosen;
    }
    
    public void setSizeType1(long sizeType1)
    {
	setSizeType1(new INTEGER(sizeType1));
    }
    
    public void setSizeType1(INTEGER sizeType1)
    {
	setChosenValue(sizeType1);
	setChosenFlag(sizeType1_chosen);
    }
    
    
    // Methods for field "sizeType2"
    public static RLC_PDU_Size createRLC_PDU_SizeWithSizeType2(OctetModeRLC_SizeInfoType1.SizeType2 sizeType2)
    {
	RLC_PDU_Size __object = new RLC_PDU_Size();

	__object.setSizeType2(sizeType2);
	return __object;
    }
    
    public boolean hasSizeType2()
    {
	return getChosenFlag() == sizeType2_chosen;
    }
    
    public void setSizeType2(OctetModeRLC_SizeInfoType1.SizeType2 sizeType2)
    {
	setChosenValue(sizeType2);
	setChosenFlag(sizeType2_chosen);
    }
    
    
    // Methods for field "sizeType3"
    public static RLC_PDU_Size createRLC_PDU_SizeWithSizeType3(OctetModeRLC_SizeInfoType1.SizeType3 sizeType3)
    {
	RLC_PDU_Size __object = new RLC_PDU_Size();

	__object.setSizeType3(sizeType3);
	return __object;
    }
    
    public boolean hasSizeType3()
    {
	return getChosenFlag() == sizeType3_chosen;
    }
    
    public void setSizeType3(OctetModeRLC_SizeInfoType1.SizeType3 sizeType3)
    {
	setChosenValue(sizeType3);
	setChosenFlag(sizeType3_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sizeType1_chosen:
		return new INTEGER();
	    case sizeType2_chosen:
		return new OctetModeRLC_SizeInfoType1.SizeType2();
	    case sizeType3_chosen:
		return new OctetModeRLC_SizeInfoType1.SizeType3();
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
	    "RLC_PDU_Size"
	),
	new QName (
	    "InformationElements",
	    "RLC-PDU-Size"
	),
	12314,
	null,
	new FieldsRef (
	    new QName (
		"rrc.informationelements",
		"OctetModeRLC_SizeInfoType1"
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
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RLC_PDU_Size object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_PDU_Size object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_PDU_Size
