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
 * Define the ASN1 Type BCCH_FACH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class BCCH_FACH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public BCCH_FACH_MessageType()
    {
    }
    
    public static final  int  systemInformation_chosen = 1;
    public static final  int  systemInformationChangeIndication_chosen = 2;
    public static final  int  spare2_chosen = 3;
    public static final  int  spare1_chosen = 4;
    
    // Methods for field "systemInformation"
    public static BCCH_FACH_MessageType createBCCH_FACH_MessageTypeWithSystemInformation(rrc.pdu_definitions.SystemInformation_FACH systemInformation)
    {
	BCCH_FACH_MessageType __object = new BCCH_FACH_MessageType();

	__object.setSystemInformation(systemInformation);
	return __object;
    }
    
    public boolean hasSystemInformation()
    {
	return getChosenFlag() == systemInformation_chosen;
    }
    
    public void setSystemInformation(rrc.pdu_definitions.SystemInformation_FACH systemInformation)
    {
	setChosenValue(systemInformation);
	setChosenFlag(systemInformation_chosen);
    }
    
    
    // Methods for field "systemInformationChangeIndication"
    public static BCCH_FACH_MessageType createBCCH_FACH_MessageTypeWithSystemInformationChangeIndication(rrc.pdu_definitions.SystemInformationChangeIndication systemInformationChangeIndication)
    {
	BCCH_FACH_MessageType __object = new BCCH_FACH_MessageType();

	__object.setSystemInformationChangeIndication(systemInformationChangeIndication);
	return __object;
    }
    
    public boolean hasSystemInformationChangeIndication()
    {
	return getChosenFlag() == systemInformationChangeIndication_chosen;
    }
    
    public void setSystemInformationChangeIndication(rrc.pdu_definitions.SystemInformationChangeIndication systemInformationChangeIndication)
    {
	setChosenValue(systemInformationChangeIndication);
	setChosenFlag(systemInformationChangeIndication_chosen);
    }
    
    
    // Methods for field "spare2"
    public static BCCH_FACH_MessageType createBCCH_FACH_MessageTypeWithSpare2(Null spare2)
    {
	BCCH_FACH_MessageType __object = new BCCH_FACH_MessageType();

	__object.setSpare2(spare2);
	return __object;
    }
    
    public boolean hasSpare2()
    {
	return getChosenFlag() == spare2_chosen;
    }
    
    public void setSpare2(Null spare2)
    {
	setChosenValue(spare2);
	setChosenFlag(spare2_chosen);
    }
    
    
    // Methods for field "spare1"
    public static BCCH_FACH_MessageType createBCCH_FACH_MessageTypeWithSpare1(Null spare1)
    {
	BCCH_FACH_MessageType __object = new BCCH_FACH_MessageType();

	__object.setSpare1(spare1);
	return __object;
    }
    
    public boolean hasSpare1()
    {
	return getChosenFlag() == spare1_chosen;
    }
    
    public void setSpare1(Null spare1)
    {
	setChosenValue(spare1);
	setChosenFlag(spare1_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case systemInformation_chosen:
		return new rrc.pdu_definitions.SystemInformation_FACH();
	    case systemInformationChangeIndication_chosen:
		return new rrc.pdu_definitions.SystemInformationChangeIndication();
	    case spare2_chosen:
		return new Null();
	    case spare1_chosen:
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
	    "BCCH_FACH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "BCCH-FACH-MessageType"
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
				"SystemInformation_FACH"
			    ),
			    new QName (
				"PDU-definitions",
				"SystemInformation-FACH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformation_FACH"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformation_FACH"
				)
			    ),
			    0
			)
		    ),
		    "systemInformation",
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
				"SystemInformationChangeIndication"
			    ),
			    new QName (
				"PDU-definitions",
				"SystemInformationChangeIndication"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformationChangeIndication"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "SystemInformationChangeIndication"
				)
			    ),
			    0
			)
		    ),
		    "systemInformationChangeIndication",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "spare2",
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
		    "spare1",
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
     * Get the type descriptor (TypeInfo) of 'this' BCCH_FACH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BCCH_FACH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BCCH_FACH_MessageType
