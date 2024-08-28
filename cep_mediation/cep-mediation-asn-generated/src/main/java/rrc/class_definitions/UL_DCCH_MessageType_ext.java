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
 * Define the ASN1 Type UL_DCCH_MessageType_ext from ASN1 Module Class_definitions.
 * @see Choice
 */

public class UL_DCCH_MessageType_ext extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DCCH_MessageType_ext()
    {
    }
    
    public static final  int  ueInformationResponse_chosen = 1;
    public static final  int  spare15_chosen = 2;
    public static final  int  spare14_chosen = 3;
    public static final  int  spare13_chosen = 4;
    public static final  int  spare12_chosen = 5;
    public static final  int  spare11_chosen = 6;
    public static final  int  spare10_chosen = 7;
    public static final  int  spare9_chosen = 8;
    public static final  int  spare8_chosen = 9;
    public static final  int  spare7_chosen = 10;
    public static final  int  spare6_chosen = 11;
    public static final  int  spare5_chosen = 12;
    public static final  int  spare4_chosen = 13;
    public static final  int  spare3_chosen = 14;
    public static final  int  spare2_chosen = 15;
    public static final  int  spare1_chosen = 16;
    
    // Methods for field "ueInformationResponse"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithUeInformationResponse(rrc.pdu_definitions.UEInformationResponse ueInformationResponse)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setUeInformationResponse(ueInformationResponse);
	return __object;
    }
    
    public boolean hasUeInformationResponse()
    {
	return getChosenFlag() == ueInformationResponse_chosen;
    }
    
    public void setUeInformationResponse(rrc.pdu_definitions.UEInformationResponse ueInformationResponse)
    {
	setChosenValue(ueInformationResponse);
	setChosenFlag(ueInformationResponse_chosen);
    }
    
    
    // Methods for field "spare15"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare15(Null spare15)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare15(spare15);
	return __object;
    }
    
    public boolean hasSpare15()
    {
	return getChosenFlag() == spare15_chosen;
    }
    
    public void setSpare15(Null spare15)
    {
	setChosenValue(spare15);
	setChosenFlag(spare15_chosen);
    }
    
    
    // Methods for field "spare14"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare14(Null spare14)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare14(spare14);
	return __object;
    }
    
    public boolean hasSpare14()
    {
	return getChosenFlag() == spare14_chosen;
    }
    
    public void setSpare14(Null spare14)
    {
	setChosenValue(spare14);
	setChosenFlag(spare14_chosen);
    }
    
    
    // Methods for field "spare13"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare13(Null spare13)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare13(spare13);
	return __object;
    }
    
    public boolean hasSpare13()
    {
	return getChosenFlag() == spare13_chosen;
    }
    
    public void setSpare13(Null spare13)
    {
	setChosenValue(spare13);
	setChosenFlag(spare13_chosen);
    }
    
    
    // Methods for field "spare12"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare12(Null spare12)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare12(spare12);
	return __object;
    }
    
    public boolean hasSpare12()
    {
	return getChosenFlag() == spare12_chosen;
    }
    
    public void setSpare12(Null spare12)
    {
	setChosenValue(spare12);
	setChosenFlag(spare12_chosen);
    }
    
    
    // Methods for field "spare11"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare11(Null spare11)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare11(spare11);
	return __object;
    }
    
    public boolean hasSpare11()
    {
	return getChosenFlag() == spare11_chosen;
    }
    
    public void setSpare11(Null spare11)
    {
	setChosenValue(spare11);
	setChosenFlag(spare11_chosen);
    }
    
    
    // Methods for field "spare10"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare10(Null spare10)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare10(spare10);
	return __object;
    }
    
    public boolean hasSpare10()
    {
	return getChosenFlag() == spare10_chosen;
    }
    
    public void setSpare10(Null spare10)
    {
	setChosenValue(spare10);
	setChosenFlag(spare10_chosen);
    }
    
    
    // Methods for field "spare9"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare9(Null spare9)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare9(spare9);
	return __object;
    }
    
    public boolean hasSpare9()
    {
	return getChosenFlag() == spare9_chosen;
    }
    
    public void setSpare9(Null spare9)
    {
	setChosenValue(spare9);
	setChosenFlag(spare9_chosen);
    }
    
    
    // Methods for field "spare8"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare8(Null spare8)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare8(spare8);
	return __object;
    }
    
    public boolean hasSpare8()
    {
	return getChosenFlag() == spare8_chosen;
    }
    
    public void setSpare8(Null spare8)
    {
	setChosenValue(spare8);
	setChosenFlag(spare8_chosen);
    }
    
    
    // Methods for field "spare7"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare7(Null spare7)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare7(spare7);
	return __object;
    }
    
    public boolean hasSpare7()
    {
	return getChosenFlag() == spare7_chosen;
    }
    
    public void setSpare7(Null spare7)
    {
	setChosenValue(spare7);
	setChosenFlag(spare7_chosen);
    }
    
    
    // Methods for field "spare6"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare6(Null spare6)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare6(spare6);
	return __object;
    }
    
    public boolean hasSpare6()
    {
	return getChosenFlag() == spare6_chosen;
    }
    
    public void setSpare6(Null spare6)
    {
	setChosenValue(spare6);
	setChosenFlag(spare6_chosen);
    }
    
    
    // Methods for field "spare5"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare5(Null spare5)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare5(spare5);
	return __object;
    }
    
    public boolean hasSpare5()
    {
	return getChosenFlag() == spare5_chosen;
    }
    
    public void setSpare5(Null spare5)
    {
	setChosenValue(spare5);
	setChosenFlag(spare5_chosen);
    }
    
    
    // Methods for field "spare4"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare4(Null spare4)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare4(spare4);
	return __object;
    }
    
    public boolean hasSpare4()
    {
	return getChosenFlag() == spare4_chosen;
    }
    
    public void setSpare4(Null spare4)
    {
	setChosenValue(spare4);
	setChosenFlag(spare4_chosen);
    }
    
    
    // Methods for field "spare3"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare3(Null spare3)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

	__object.setSpare3(spare3);
	return __object;
    }
    
    public boolean hasSpare3()
    {
	return getChosenFlag() == spare3_chosen;
    }
    
    public void setSpare3(Null spare3)
    {
	setChosenValue(spare3);
	setChosenFlag(spare3_chosen);
    }
    
    
    // Methods for field "spare2"
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare2(Null spare2)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

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
    public static UL_DCCH_MessageType_ext createUL_DCCH_MessageType_extWithSpare1(Null spare1)
    {
	UL_DCCH_MessageType_ext __object = new UL_DCCH_MessageType_ext();

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
	    case ueInformationResponse_chosen:
		return new rrc.pdu_definitions.UEInformationResponse();
	    case spare15_chosen:
		return new Null();
	    case spare14_chosen:
		return new Null();
	    case spare13_chosen:
		return new Null();
	    case spare12_chosen:
		return new Null();
	    case spare11_chosen:
		return new Null();
	    case spare10_chosen:
		return new Null();
	    case spare9_chosen:
		return new Null();
	    case spare8_chosen:
		return new Null();
	    case spare7_chosen:
		return new Null();
	    case spare6_chosen:
		return new Null();
	    case spare5_chosen:
		return new Null();
	    case spare4_chosen:
		return new Null();
	    case spare3_chosen:
		return new Null();
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
	    "UL_DCCH_MessageType_ext"
	),
	new QName (
	    "Class-definitions",
	    "UL-DCCH-MessageType-ext"
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
				"UEInformationResponse"
			    ),
			    new QName (
				"PDU-definitions",
				"UEInformationResponse"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UEInformationResponse"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UEInformationResponse"
				)
			    ),
			    0
			)
		    ),
		    "ueInformationResponse",
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
		    "spare15",
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
		    "spare14",
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
		    "spare13",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "spare12",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "spare11",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "spare10",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "spare9",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "spare8",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "spare7",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "spare6",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "spare5",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "spare4",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "spare3",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    15,
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
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8),
		new TagDecoderElement((short)0x8009, 9),
		new TagDecoderElement((short)0x800a, 10),
		new TagDecoderElement((short)0x800b, 11),
		new TagDecoderElement((short)0x800c, 12),
		new TagDecoderElement((short)0x800d, 13),
		new TagDecoderElement((short)0x800e, 14),
		new TagDecoderElement((short)0x800f, 15)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_DCCH_MessageType_ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DCCH_MessageType_ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DCCH_MessageType_ext
