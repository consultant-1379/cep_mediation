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
 * Define the ASN1 Type UL_CCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class UL_CCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_CCCH_MessageType()
    {
    }
    
    public static final  int  cellUpdate_chosen = 1;
    public static final  int  rrcConnectionRequest_chosen = 2;
    public static final  int  uraUpdate_chosen = 3;
    public static final  int  spare_chosen = 4;
    
    // Methods for field "cellUpdate"
    public static UL_CCCH_MessageType createUL_CCCH_MessageTypeWithCellUpdate(rrc.pdu_definitions.CellUpdate cellUpdate)
    {
	UL_CCCH_MessageType __object = new UL_CCCH_MessageType();

	__object.setCellUpdate(cellUpdate);
	return __object;
    }
    
    public boolean hasCellUpdate()
    {
	return getChosenFlag() == cellUpdate_chosen;
    }
    
    public void setCellUpdate(rrc.pdu_definitions.CellUpdate cellUpdate)
    {
	setChosenValue(cellUpdate);
	setChosenFlag(cellUpdate_chosen);
    }
    
    
    // Methods for field "rrcConnectionRequest"
    public static UL_CCCH_MessageType createUL_CCCH_MessageTypeWithRrcConnectionRequest(rrc.pdu_definitions.RRCConnectionRequest rrcConnectionRequest)
    {
	UL_CCCH_MessageType __object = new UL_CCCH_MessageType();

	__object.setRrcConnectionRequest(rrcConnectionRequest);
	return __object;
    }
    
    public boolean hasRrcConnectionRequest()
    {
	return getChosenFlag() == rrcConnectionRequest_chosen;
    }
    
    public void setRrcConnectionRequest(rrc.pdu_definitions.RRCConnectionRequest rrcConnectionRequest)
    {
	setChosenValue(rrcConnectionRequest);
	setChosenFlag(rrcConnectionRequest_chosen);
    }
    
    
    // Methods for field "uraUpdate"
    public static UL_CCCH_MessageType createUL_CCCH_MessageTypeWithUraUpdate(rrc.pdu_definitions.URAUpdate uraUpdate)
    {
	UL_CCCH_MessageType __object = new UL_CCCH_MessageType();

	__object.setUraUpdate(uraUpdate);
	return __object;
    }
    
    public boolean hasUraUpdate()
    {
	return getChosenFlag() == uraUpdate_chosen;
    }
    
    public void setUraUpdate(rrc.pdu_definitions.URAUpdate uraUpdate)
    {
	setChosenValue(uraUpdate);
	setChosenFlag(uraUpdate_chosen);
    }
    
    
    // Methods for field "spare"
    public static UL_CCCH_MessageType createUL_CCCH_MessageTypeWithSpare(Null spare)
    {
	UL_CCCH_MessageType __object = new UL_CCCH_MessageType();

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
	    case cellUpdate_chosen:
		return new rrc.pdu_definitions.CellUpdate();
	    case rrcConnectionRequest_chosen:
		return new rrc.pdu_definitions.RRCConnectionRequest();
	    case uraUpdate_chosen:
		return new rrc.pdu_definitions.URAUpdate();
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
	    "UL_CCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "UL-CCCH-MessageType"
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
				"CellUpdate"
			    ),
			    new QName (
				"PDU-definitions",
				"CellUpdate"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdate"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdate"
				)
			    ),
			    0
			)
		    ),
		    "cellUpdate",
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
				"rrc.pdu_definitions",
				"RRCConnectionRequest"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionRequest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest"
				)
			    ),
			    0
			)
		    ),
		    "rrcConnectionRequest",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"URAUpdate"
			    ),
			    new QName (
				"PDU-definitions",
				"URAUpdate"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdate"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdate"
				)
			    ),
			    0
			)
		    ),
		    "uraUpdate",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_CCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_CCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_CCCH_MessageType
