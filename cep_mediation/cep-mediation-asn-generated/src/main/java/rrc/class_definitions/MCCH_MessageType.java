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
 * Define the ASN1 Type MCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class MCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public MCCH_MessageType()
    {
    }
    
    public static final  int  mbmsAccessInformation_chosen = 1;
    public static final  int  mbmsCommonPTMRBInformation_chosen = 2;
    public static final  int  mbmsCurrentCellPTMRBInformation_chosen = 3;
    public static final  int  mbmsGeneralInformation_chosen = 4;
    public static final  int  mbmsModifiedServicesInformation_chosen = 5;
    public static final  int  mbmsNeighbouringCellPTMRBInformation_chosen = 6;
    public static final  int  mbmsUnmodifiedServicesInformation_chosen = 7;
    public static final  int  spare9_chosen = 8;
    public static final  int  spare8_chosen = 9;
    public static final  int  spare7_chosen = 10;
    public static final  int  spare6_chosen = 11;
    public static final  int  spare5_chosen = 12;
    public static final  int  spare4_chosen = 13;
    public static final  int  spare3_chosen = 14;
    public static final  int  spare2_chosen = 15;
    public static final  int  spare1_chosen = 16;
    
    // Methods for field "mbmsAccessInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsAccessInformation(rrc.pdu_definitions.MBMSAccessInformation mbmsAccessInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsAccessInformation(mbmsAccessInformation);
	return __object;
    }
    
    public boolean hasMbmsAccessInformation()
    {
	return getChosenFlag() == mbmsAccessInformation_chosen;
    }
    
    public void setMbmsAccessInformation(rrc.pdu_definitions.MBMSAccessInformation mbmsAccessInformation)
    {
	setChosenValue(mbmsAccessInformation);
	setChosenFlag(mbmsAccessInformation_chosen);
    }
    
    
    // Methods for field "mbmsCommonPTMRBInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsCommonPTMRBInformation(rrc.pdu_definitions.MBMSCommonPTMRBInformation mbmsCommonPTMRBInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsCommonPTMRBInformation(mbmsCommonPTMRBInformation);
	return __object;
    }
    
    public boolean hasMbmsCommonPTMRBInformation()
    {
	return getChosenFlag() == mbmsCommonPTMRBInformation_chosen;
    }
    
    public void setMbmsCommonPTMRBInformation(rrc.pdu_definitions.MBMSCommonPTMRBInformation mbmsCommonPTMRBInformation)
    {
	setChosenValue(mbmsCommonPTMRBInformation);
	setChosenFlag(mbmsCommonPTMRBInformation_chosen);
    }
    
    
    // Methods for field "mbmsCurrentCellPTMRBInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsCurrentCellPTMRBInformation(rrc.pdu_definitions.MBMSCurrentCellPTMRBInformation mbmsCurrentCellPTMRBInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsCurrentCellPTMRBInformation(mbmsCurrentCellPTMRBInformation);
	return __object;
    }
    
    public boolean hasMbmsCurrentCellPTMRBInformation()
    {
	return getChosenFlag() == mbmsCurrentCellPTMRBInformation_chosen;
    }
    
    public void setMbmsCurrentCellPTMRBInformation(rrc.pdu_definitions.MBMSCurrentCellPTMRBInformation mbmsCurrentCellPTMRBInformation)
    {
	setChosenValue(mbmsCurrentCellPTMRBInformation);
	setChosenFlag(mbmsCurrentCellPTMRBInformation_chosen);
    }
    
    
    // Methods for field "mbmsGeneralInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsGeneralInformation(rrc.pdu_definitions.MBMSGeneralInformation mbmsGeneralInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsGeneralInformation(mbmsGeneralInformation);
	return __object;
    }
    
    public boolean hasMbmsGeneralInformation()
    {
	return getChosenFlag() == mbmsGeneralInformation_chosen;
    }
    
    public void setMbmsGeneralInformation(rrc.pdu_definitions.MBMSGeneralInformation mbmsGeneralInformation)
    {
	setChosenValue(mbmsGeneralInformation);
	setChosenFlag(mbmsGeneralInformation_chosen);
    }
    
    
    // Methods for field "mbmsModifiedServicesInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsModifiedServicesInformation(rrc.pdu_definitions.MBMSModifiedServicesInformation mbmsModifiedServicesInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsModifiedServicesInformation(mbmsModifiedServicesInformation);
	return __object;
    }
    
    public boolean hasMbmsModifiedServicesInformation()
    {
	return getChosenFlag() == mbmsModifiedServicesInformation_chosen;
    }
    
    public void setMbmsModifiedServicesInformation(rrc.pdu_definitions.MBMSModifiedServicesInformation mbmsModifiedServicesInformation)
    {
	setChosenValue(mbmsModifiedServicesInformation);
	setChosenFlag(mbmsModifiedServicesInformation_chosen);
    }
    
    
    // Methods for field "mbmsNeighbouringCellPTMRBInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsNeighbouringCellPTMRBInformation(rrc.pdu_definitions.MBMSNeighbouringCellPTMRBInformation mbmsNeighbouringCellPTMRBInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsNeighbouringCellPTMRBInformation(mbmsNeighbouringCellPTMRBInformation);
	return __object;
    }
    
    public boolean hasMbmsNeighbouringCellPTMRBInformation()
    {
	return getChosenFlag() == mbmsNeighbouringCellPTMRBInformation_chosen;
    }
    
    public void setMbmsNeighbouringCellPTMRBInformation(rrc.pdu_definitions.MBMSNeighbouringCellPTMRBInformation mbmsNeighbouringCellPTMRBInformation)
    {
	setChosenValue(mbmsNeighbouringCellPTMRBInformation);
	setChosenFlag(mbmsNeighbouringCellPTMRBInformation_chosen);
    }
    
    
    // Methods for field "mbmsUnmodifiedServicesInformation"
    public static MCCH_MessageType createMCCH_MessageTypeWithMbmsUnmodifiedServicesInformation(rrc.pdu_definitions.MBMSUnmodifiedServicesInformation mbmsUnmodifiedServicesInformation)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

	__object.setMbmsUnmodifiedServicesInformation(mbmsUnmodifiedServicesInformation);
	return __object;
    }
    
    public boolean hasMbmsUnmodifiedServicesInformation()
    {
	return getChosenFlag() == mbmsUnmodifiedServicesInformation_chosen;
    }
    
    public void setMbmsUnmodifiedServicesInformation(rrc.pdu_definitions.MBMSUnmodifiedServicesInformation mbmsUnmodifiedServicesInformation)
    {
	setChosenValue(mbmsUnmodifiedServicesInformation);
	setChosenFlag(mbmsUnmodifiedServicesInformation_chosen);
    }
    
    
    // Methods for field "spare9"
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare9(Null spare9)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare8(Null spare8)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare7(Null spare7)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare6(Null spare6)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare5(Null spare5)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare4(Null spare4)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare3(Null spare3)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare2(Null spare2)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
    public static MCCH_MessageType createMCCH_MessageTypeWithSpare1(Null spare1)
    {
	MCCH_MessageType __object = new MCCH_MessageType();

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
	    case mbmsAccessInformation_chosen:
		return new rrc.pdu_definitions.MBMSAccessInformation();
	    case mbmsCommonPTMRBInformation_chosen:
		return new rrc.pdu_definitions.MBMSCommonPTMRBInformation();
	    case mbmsCurrentCellPTMRBInformation_chosen:
		return new rrc.pdu_definitions.MBMSCurrentCellPTMRBInformation();
	    case mbmsGeneralInformation_chosen:
		return new rrc.pdu_definitions.MBMSGeneralInformation();
	    case mbmsModifiedServicesInformation_chosen:
		return new rrc.pdu_definitions.MBMSModifiedServicesInformation();
	    case mbmsNeighbouringCellPTMRBInformation_chosen:
		return new rrc.pdu_definitions.MBMSNeighbouringCellPTMRBInformation();
	    case mbmsUnmodifiedServicesInformation_chosen:
		return new rrc.pdu_definitions.MBMSUnmodifiedServicesInformation();
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
	    "MCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "MCCH-MessageType"
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
				"MBMSAccessInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSAccessInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSAccessInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSAccessInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsAccessInformation",
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
				"MBMSCommonPTMRBInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSCommonPTMRBInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSCommonPTMRBInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSCommonPTMRBInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsCommonPTMRBInformation",
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
				"MBMSCurrentCellPTMRBInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSCurrentCellPTMRBInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSCurrentCellPTMRBInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSCurrentCellPTMRBInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsCurrentCellPTMRBInformation",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MBMSGeneralInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSGeneralInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSGeneralInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSGeneralInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsGeneralInformation",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MBMSModifiedServicesInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSModifiedServicesInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModifiedServicesInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSModifiedServicesInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsModifiedServicesInformation",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MBMSNeighbouringCellPTMRBInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSNeighbouringCellPTMRBInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSNeighbouringCellPTMRBInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSNeighbouringCellPTMRBInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsNeighbouringCellPTMRBInformation",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"MBMSUnmodifiedServicesInformation"
			    ),
			    new QName (
				"PDU-definitions",
				"MBMSUnmodifiedServicesInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSUnmodifiedServicesInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "MBMSUnmodifiedServicesInformation"
				)
			    ),
			    0
			)
		    ),
		    "mbmsUnmodifiedServicesInformation",
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
     * Get the type descriptor (TypeInfo) of 'this' MCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MCCH_MessageType
