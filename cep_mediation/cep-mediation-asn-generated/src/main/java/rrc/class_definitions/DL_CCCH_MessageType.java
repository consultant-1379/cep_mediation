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
 * Define the ASN1 Type DL_CCCH_MessageType from ASN1 Module Class_definitions.
 * @see Choice
 */

public class DL_CCCH_MessageType extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_CCCH_MessageType()
    {
    }
    
    public static final  int  cellUpdateConfirm_chosen = 1;
    public static final  int  rrcConnectionReject_chosen = 2;
    public static final  int  rrcConnectionRelease_chosen = 3;
    public static final  int  rrcConnectionSetup_chosen = 4;
    public static final  int  uraUpdateConfirm_chosen = 5;
    public static final  int  etwsPrimaryNotificationWithSecurity_chosen = 6;
    public static final  int  spare2_chosen = 7;
    public static final  int  spare1_chosen = 8;
    
    // Methods for field "cellUpdateConfirm"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithCellUpdateConfirm(rrc.pdu_definitions.CellUpdateConfirm_CCCH cellUpdateConfirm)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setCellUpdateConfirm(cellUpdateConfirm);
	return __object;
    }
    
    public boolean hasCellUpdateConfirm()
    {
	return getChosenFlag() == cellUpdateConfirm_chosen;
    }
    
    public void setCellUpdateConfirm(rrc.pdu_definitions.CellUpdateConfirm_CCCH cellUpdateConfirm)
    {
	setChosenValue(cellUpdateConfirm);
	setChosenFlag(cellUpdateConfirm_chosen);
    }
    
    
    // Methods for field "rrcConnectionReject"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithRrcConnectionReject(rrc.pdu_definitions.RRCConnectionReject rrcConnectionReject)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setRrcConnectionReject(rrcConnectionReject);
	return __object;
    }
    
    public boolean hasRrcConnectionReject()
    {
	return getChosenFlag() == rrcConnectionReject_chosen;
    }
    
    public void setRrcConnectionReject(rrc.pdu_definitions.RRCConnectionReject rrcConnectionReject)
    {
	setChosenValue(rrcConnectionReject);
	setChosenFlag(rrcConnectionReject_chosen);
    }
    
    
    // Methods for field "rrcConnectionRelease"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithRrcConnectionRelease(rrc.pdu_definitions.RRCConnectionRelease_CCCH rrcConnectionRelease)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setRrcConnectionRelease(rrcConnectionRelease);
	return __object;
    }
    
    public boolean hasRrcConnectionRelease()
    {
	return getChosenFlag() == rrcConnectionRelease_chosen;
    }
    
    public void setRrcConnectionRelease(rrc.pdu_definitions.RRCConnectionRelease_CCCH rrcConnectionRelease)
    {
	setChosenValue(rrcConnectionRelease);
	setChosenFlag(rrcConnectionRelease_chosen);
    }
    
    
    // Methods for field "rrcConnectionSetup"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithRrcConnectionSetup(rrc.pdu_definitions.RRCConnectionSetup rrcConnectionSetup)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setRrcConnectionSetup(rrcConnectionSetup);
	return __object;
    }
    
    public boolean hasRrcConnectionSetup()
    {
	return getChosenFlag() == rrcConnectionSetup_chosen;
    }
    
    public void setRrcConnectionSetup(rrc.pdu_definitions.RRCConnectionSetup rrcConnectionSetup)
    {
	setChosenValue(rrcConnectionSetup);
	setChosenFlag(rrcConnectionSetup_chosen);
    }
    
    
    // Methods for field "uraUpdateConfirm"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithUraUpdateConfirm(rrc.pdu_definitions.URAUpdateConfirm_CCCH uraUpdateConfirm)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setUraUpdateConfirm(uraUpdateConfirm);
	return __object;
    }
    
    public boolean hasUraUpdateConfirm()
    {
	return getChosenFlag() == uraUpdateConfirm_chosen;
    }
    
    public void setUraUpdateConfirm(rrc.pdu_definitions.URAUpdateConfirm_CCCH uraUpdateConfirm)
    {
	setChosenValue(uraUpdateConfirm);
	setChosenFlag(uraUpdateConfirm_chosen);
    }
    
    
    // Methods for field "etwsPrimaryNotificationWithSecurity"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithEtwsPrimaryNotificationWithSecurity(rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity etwsPrimaryNotificationWithSecurity)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

	__object.setEtwsPrimaryNotificationWithSecurity(etwsPrimaryNotificationWithSecurity);
	return __object;
    }
    
    public boolean hasEtwsPrimaryNotificationWithSecurity()
    {
	return getChosenFlag() == etwsPrimaryNotificationWithSecurity_chosen;
    }
    
    public void setEtwsPrimaryNotificationWithSecurity(rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity etwsPrimaryNotificationWithSecurity)
    {
	setChosenValue(etwsPrimaryNotificationWithSecurity);
	setChosenFlag(etwsPrimaryNotificationWithSecurity_chosen);
    }
    
    
    // Methods for field "spare2"
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithSpare2(Null spare2)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

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
    public static DL_CCCH_MessageType createDL_CCCH_MessageTypeWithSpare1(Null spare1)
    {
	DL_CCCH_MessageType __object = new DL_CCCH_MessageType();

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
	    case cellUpdateConfirm_chosen:
		return new rrc.pdu_definitions.CellUpdateConfirm_CCCH();
	    case rrcConnectionReject_chosen:
		return new rrc.pdu_definitions.RRCConnectionReject();
	    case rrcConnectionRelease_chosen:
		return new rrc.pdu_definitions.RRCConnectionRelease_CCCH();
	    case rrcConnectionSetup_chosen:
		return new rrc.pdu_definitions.RRCConnectionSetup();
	    case uraUpdateConfirm_chosen:
		return new rrc.pdu_definitions.URAUpdateConfirm_CCCH();
	    case etwsPrimaryNotificationWithSecurity_chosen:
		return new rrc.pdu_definitions.ETWSPrimaryNotificationWithSecurity();
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
	    "DL_CCCH_MessageType"
	),
	new QName (
	    "Class-definitions",
	    "DL-CCCH-MessageType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"CellUpdateConfirm_CCCH"
			    ),
			    new QName (
				"PDU-definitions",
				"CellUpdateConfirm-CCCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "CellUpdateConfirm_CCCH"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "cellUpdateConfirm",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionReject"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionReject"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionReject"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rrcConnectionReject",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionRelease_CCCH"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionRelease-CCCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRelease_CCCH"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rrcConnectionRelease",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"RRCConnectionSetup"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionSetup"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionSetup"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "rrcConnectionSetup",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.pdu_definitions",
				"URAUpdateConfirm_CCCH"
			    ),
			    new QName (
				"PDU-definitions",
				"URAUpdateConfirm-CCCH"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "URAUpdateConfirm_CCCH"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "uraUpdateConfirm",
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
				"ETWSPrimaryNotificationWithSecurity"
			    ),
			    new QName (
				"PDU-definitions",
				"ETWSPrimaryNotificationWithSecurity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ETWSPrimaryNotificationWithSecurity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "ETWSPrimaryNotificationWithSecurity"
				)
			    ),
			    0
			)
		    ),
		    "etwsPrimaryNotificationWithSecurity",
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
		    "spare2",
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
		    "spare1",
		    7,
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
		new TagDecoderElement((short)0x8007, 7)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_CCCH_MessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CCCH_MessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CCCH_MessageType
