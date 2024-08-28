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
 * Define the ASN1 Type SIB_TypeExt2 from ASN1 Module InformationElements.
 * @see Choice
 */

public class SIB_TypeExt2 extends Choice {
    
    /**
     * The default constructor.
     */
    public SIB_TypeExt2()
    {
    }
    
    public static final  int  systemInfoType19_chosen = 1;
    public static final  int  systemInfoType15_2ter_chosen = 2;
    public static final  int  systemInfoType20_chosen = 3;
    public static final  int  spare5_chosen = 4;
    public static final  int  spare4_chosen = 5;
    public static final  int  spare3_chosen = 6;
    public static final  int  spare2_chosen = 7;
    public static final  int  spare1_chosen = 8;
    
    // Methods for field "systemInfoType19"
    public static SIB_TypeExt2 createSIB_TypeExt2WithSystemInfoType19(Null systemInfoType19)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

	__object.setSystemInfoType19(systemInfoType19);
	return __object;
    }
    
    public boolean hasSystemInfoType19()
    {
	return getChosenFlag() == systemInfoType19_chosen;
    }
    
    public void setSystemInfoType19(Null systemInfoType19)
    {
	setChosenValue(systemInfoType19);
	setChosenFlag(systemInfoType19_chosen);
    }
    
    
    // Methods for field "systemInfoType15_2ter"
    public static SIB_TypeExt2 createSIB_TypeExt2WithSystemInfoType15_2ter(Null systemInfoType15_2ter)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

	__object.setSystemInfoType15_2ter(systemInfoType15_2ter);
	return __object;
    }
    
    public boolean hasSystemInfoType15_2ter()
    {
	return getChosenFlag() == systemInfoType15_2ter_chosen;
    }
    
    public void setSystemInfoType15_2ter(Null systemInfoType15_2ter)
    {
	setChosenValue(systemInfoType15_2ter);
	setChosenFlag(systemInfoType15_2ter_chosen);
    }
    
    
    // Methods for field "systemInfoType20"
    public static SIB_TypeExt2 createSIB_TypeExt2WithSystemInfoType20(Null systemInfoType20)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

	__object.setSystemInfoType20(systemInfoType20);
	return __object;
    }
    
    public boolean hasSystemInfoType20()
    {
	return getChosenFlag() == systemInfoType20_chosen;
    }
    
    public void setSystemInfoType20(Null systemInfoType20)
    {
	setChosenValue(systemInfoType20);
	setChosenFlag(systemInfoType20_chosen);
    }
    
    
    // Methods for field "spare5"
    public static SIB_TypeExt2 createSIB_TypeExt2WithSpare5(Null spare5)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

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
    public static SIB_TypeExt2 createSIB_TypeExt2WithSpare4(Null spare4)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

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
    public static SIB_TypeExt2 createSIB_TypeExt2WithSpare3(Null spare3)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

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
    public static SIB_TypeExt2 createSIB_TypeExt2WithSpare2(Null spare2)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

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
    public static SIB_TypeExt2 createSIB_TypeExt2WithSpare1(Null spare1)
    {
	SIB_TypeExt2 __object = new SIB_TypeExt2();

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
	    case systemInfoType19_chosen:
		return new Null();
	    case systemInfoType15_2ter_chosen:
		return new Null();
	    case systemInfoType20_chosen:
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
	    "rrc.informationelements",
	    "SIB_TypeExt2"
	),
	new QName (
	    "InformationElements",
	    "SIB-TypeExt2"
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
		    "systemInfoType19",
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
		    "systemInfoType15-2ter",
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
		    "systemInfoType20",
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
		    "spare5",
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
		    "spare4",
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
		    "spare3",
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
     * Get the type descriptor (TypeInfo) of 'this' SIB_TypeExt2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIB_TypeExt2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIB_TypeExt2
