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


package rrc.class_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UL_SHCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class UL_SHCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_SHCCH_MessageType()
    {
    }
    
    public static final  int  puschCapacityRequest_chosen = 1;
    public static final  int  spare_chosen = 2;
    
    // Methods for field "puschCapacityRequest"
    public static UL_SHCCH_MessageType createUL_SHCCH_MessageTypeWithPuschCapacityRequest(rrc.pdu_definitions.PUSCHCapacityRequest puschCapacityRequest)
    {
	UL_SHCCH_MessageType __object = new UL_SHCCH_MessageType();

	__object.setPuschCapacityRequest(puschCapacityRequest);
	return __object;
    }
    
    public boolean hasPuschCapacityRequest()
    {
	return getChosenFlag() == puschCapacityRequest_chosen;
    }
    
    public void setPuschCapacityRequest(rrc.pdu_definitions.PUSCHCapacityRequest puschCapacityRequest)
    {
	setChosenValue(puschCapacityRequest);
	setChosenFlag(puschCapacityRequest_chosen);
    }
    
    
    // Methods for field "spare"
    public static UL_SHCCH_MessageType createUL_SHCCH_MessageTypeWithSpare(Null spare)
    {
	UL_SHCCH_MessageType __object = new UL_SHCCH_MessageType();

	__object.setSpare(spare);
	return __object;
    }
    
    public boolean hasSpare()
    {
	return getChosenFlag() == spare_chosen;
    }
    
    public void setSpare(Null spare)
    {
	setChosenValue(spare);
	setChosenFlag(spare_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case puschCapacityRequest_chosen:
		return new rrc.pdu_definitions.PUSCHCapacityRequest();
	    case spare_chosen:
		return new Null();
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
	    "rrc.class_definitions",
	    "UL_SHCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "UL-SHCCH-MessageType"
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
				"rrc.pdu_definitions",
				"PUSCHCapacityRequest"
			    ),
			    new QName (
				"PDU-definitions",
				"PUSCHCapacityRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PUSCHCapacityRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "PUSCHCapacityRequest"
				)
			    ),
			    0
			)
		    ),
		    "puschCapacityRequest",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "spare",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_SHCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_SHCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_SHCCH_MessageType
