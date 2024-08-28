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
 * Define the ASN1 Type PenaltyTime_ECN0 from ASN1 Module InformationElements.
 * @see Choice
 */

public class PenaltyTime_ECN0 extends Choice {
    
    /**
     * The default constructor.
     */
    public PenaltyTime_ECN0()
    {
    }
    
    public static final  int  notUsed_chosen = 1;
    public static final  int  pt10_chosen = 2;
    public static final  int  pt20_chosen = 3;
    public static final  int  pt30_chosen = 4;
    public static final  int  pt40_chosen = 5;
    public static final  int  pt50_chosen = 6;
    public static final  int  pt60_chosen = 7;
    
    // Methods for field "notUsed"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithNotUsed(Null notUsed)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setNotUsed(notUsed);
	return __object;
    }
    
    public boolean hasNotUsed()
    {
	return getChosenFlag() == notUsed_chosen;
    }
    
    public void setNotUsed(Null notUsed)
    {
	setChosenValue(notUsed);
	setChosenFlag(notUsed_chosen);
    }
    
    
    // Methods for field "pt10"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt10(TemporaryOffsetList pt10)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt10(pt10);
	return __object;
    }
    
    public boolean hasPt10()
    {
	return getChosenFlag() == pt10_chosen;
    }
    
    public void setPt10(TemporaryOffsetList pt10)
    {
	setChosenValue(pt10);
	setChosenFlag(pt10_chosen);
    }
    
    
    // Methods for field "pt20"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt20(TemporaryOffsetList pt20)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt20(pt20);
	return __object;
    }
    
    public boolean hasPt20()
    {
	return getChosenFlag() == pt20_chosen;
    }
    
    public void setPt20(TemporaryOffsetList pt20)
    {
	setChosenValue(pt20);
	setChosenFlag(pt20_chosen);
    }
    
    
    // Methods for field "pt30"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt30(TemporaryOffsetList pt30)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt30(pt30);
	return __object;
    }
    
    public boolean hasPt30()
    {
	return getChosenFlag() == pt30_chosen;
    }
    
    public void setPt30(TemporaryOffsetList pt30)
    {
	setChosenValue(pt30);
	setChosenFlag(pt30_chosen);
    }
    
    
    // Methods for field "pt40"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt40(TemporaryOffsetList pt40)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt40(pt40);
	return __object;
    }
    
    public boolean hasPt40()
    {
	return getChosenFlag() == pt40_chosen;
    }
    
    public void setPt40(TemporaryOffsetList pt40)
    {
	setChosenValue(pt40);
	setChosenFlag(pt40_chosen);
    }
    
    
    // Methods for field "pt50"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt50(TemporaryOffsetList pt50)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt50(pt50);
	return __object;
    }
    
    public boolean hasPt50()
    {
	return getChosenFlag() == pt50_chosen;
    }
    
    public void setPt50(TemporaryOffsetList pt50)
    {
	setChosenValue(pt50);
	setChosenFlag(pt50_chosen);
    }
    
    
    // Methods for field "pt60"
    public static PenaltyTime_ECN0 createPenaltyTime_ECN0WithPt60(TemporaryOffsetList pt60)
    {
	PenaltyTime_ECN0 __object = new PenaltyTime_ECN0();

	__object.setPt60(pt60);
	return __object;
    }
    
    public boolean hasPt60()
    {
	return getChosenFlag() == pt60_chosen;
    }
    
    public void setPt60(TemporaryOffsetList pt60)
    {
	setChosenValue(pt60);
	setChosenFlag(pt60_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case notUsed_chosen:
		return new Null();
	    case pt10_chosen:
		return new TemporaryOffsetList();
	    case pt20_chosen:
		return new TemporaryOffsetList();
	    case pt30_chosen:
		return new TemporaryOffsetList();
	    case pt40_chosen:
		return new TemporaryOffsetList();
	    case pt50_chosen:
		return new TemporaryOffsetList();
	    case pt60_chosen:
		return new TemporaryOffsetList();
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
	    "PenaltyTime_ECN0"
	),
	new QName (
	    "InformationElements",
	    "PenaltyTime-ECN0"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "notUsed",
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
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt10",
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
				"rrc.informationelements",
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt20",
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
				"rrc.informationelements",
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt30",
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
				"rrc.informationelements",
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt40",
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
				"rrc.informationelements",
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt50",
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
				"rrc.informationelements",
				"TemporaryOffsetList"
			    ),
			    new QName (
				"InformationElements",
				"TemporaryOffsetList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TemporaryOffsetList"
				)
			    ),
			    0
			)
		    ),
		    "pt60",
		    6,
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
		new TagDecoderElement((short)0x8006, 6)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PenaltyTime_ECN0 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PenaltyTime_ECN0 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PenaltyTime_ECN0
