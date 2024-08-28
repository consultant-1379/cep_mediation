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
 * Define the ASN1 Type SIB_TypeExtGANSS from ASN1 Module InformationElements.
 * @see Choice
 */

public class SIB_TypeExtGANSS extends Choice {
    
    /**
     * The default constructor.
     */
    public SIB_TypeExtGANSS()
    {
    }
    
    public static final  int  systemInfoType15_1bis_chosen = 1;
    public static final  int  systemInfoType15_2bis_chosen = 2;
    public static final  int  systemInfoType15_2ter_chosen = 3;
    public static final  int  systemInfoType15_3bis_chosen = 4;
    public static final  int  systemInfoType15_6_chosen = 5;
    public static final  int  systemInfoType15_7_chosen = 6;
    public static final  int  systemInfoType15_8_chosen = 7;
    public static final  int  spare9_chosen = 8;
    public static final  int  spare8_chosen = 9;
    public static final  int  spare7_chosen = 10;
    public static final  int  spare6_chosen = 11;
    public static final  int  spare5_chosen = 12;
    public static final  int  spare4_chosen = 13;
    public static final  int  spare3_chosen = 14;
    public static final  int  spare2_chosen = 15;
    public static final  int  spare1_chosen = 16;
    
    // Methods for field "systemInfoType15_1bis"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_1bis(Null systemInfoType15_1bis)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_1bis(systemInfoType15_1bis);
	return __object;
    }
    
    public boolean hasSystemInfoType15_1bis()
    {
	return getChosenFlag() == systemInfoType15_1bis_chosen;
    }
    
    public void setSystemInfoType15_1bis(Null systemInfoType15_1bis)
    {
	setChosenValue(systemInfoType15_1bis);
	setChosenFlag(systemInfoType15_1bis_chosen);
    }
    
    
    // Methods for field "systemInfoType15_2bis"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_2bis(Null systemInfoType15_2bis)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_2bis(systemInfoType15_2bis);
	return __object;
    }
    
    public boolean hasSystemInfoType15_2bis()
    {
	return getChosenFlag() == systemInfoType15_2bis_chosen;
    }
    
    public void setSystemInfoType15_2bis(Null systemInfoType15_2bis)
    {
	setChosenValue(systemInfoType15_2bis);
	setChosenFlag(systemInfoType15_2bis_chosen);
    }
    
    
    // Methods for field "systemInfoType15_2ter"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_2ter(Null systemInfoType15_2ter)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    
    
    // Methods for field "systemInfoType15_3bis"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_3bis(Null systemInfoType15_3bis)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_3bis(systemInfoType15_3bis);
	return __object;
    }
    
    public boolean hasSystemInfoType15_3bis()
    {
	return getChosenFlag() == systemInfoType15_3bis_chosen;
    }
    
    public void setSystemInfoType15_3bis(Null systemInfoType15_3bis)
    {
	setChosenValue(systemInfoType15_3bis);
	setChosenFlag(systemInfoType15_3bis_chosen);
    }
    
    
    // Methods for field "systemInfoType15_6"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_6(Null systemInfoType15_6)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_6(systemInfoType15_6);
	return __object;
    }
    
    public boolean hasSystemInfoType15_6()
    {
	return getChosenFlag() == systemInfoType15_6_chosen;
    }
    
    public void setSystemInfoType15_6(Null systemInfoType15_6)
    {
	setChosenValue(systemInfoType15_6);
	setChosenFlag(systemInfoType15_6_chosen);
    }
    
    
    // Methods for field "systemInfoType15_7"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_7(Null systemInfoType15_7)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_7(systemInfoType15_7);
	return __object;
    }
    
    public boolean hasSystemInfoType15_7()
    {
	return getChosenFlag() == systemInfoType15_7_chosen;
    }
    
    public void setSystemInfoType15_7(Null systemInfoType15_7)
    {
	setChosenValue(systemInfoType15_7);
	setChosenFlag(systemInfoType15_7_chosen);
    }
    
    
    // Methods for field "systemInfoType15_8"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSystemInfoType15_8(Null systemInfoType15_8)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

	__object.setSystemInfoType15_8(systemInfoType15_8);
	return __object;
    }
    
    public boolean hasSystemInfoType15_8()
    {
	return getChosenFlag() == systemInfoType15_8_chosen;
    }
    
    public void setSystemInfoType15_8(Null systemInfoType15_8)
    {
	setChosenValue(systemInfoType15_8);
	setChosenFlag(systemInfoType15_8_chosen);
    }
    
    
    // Methods for field "spare9"
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare9(Null spare9)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare8(Null spare8)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare7(Null spare7)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare6(Null spare6)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare5(Null spare5)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare4(Null spare4)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare3(Null spare3)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare2(Null spare2)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
    public static SIB_TypeExtGANSS createSIB_TypeExtGANSSWithSpare1(Null spare1)
    {
	SIB_TypeExtGANSS __object = new SIB_TypeExtGANSS();

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
	    case systemInfoType15_1bis_chosen:
		return new Null();
	    case systemInfoType15_2bis_chosen:
		return new Null();
	    case systemInfoType15_2ter_chosen:
		return new Null();
	    case systemInfoType15_3bis_chosen:
		return new Null();
	    case systemInfoType15_6_chosen:
		return new Null();
	    case systemInfoType15_7_chosen:
		return new Null();
	    case systemInfoType15_8_chosen:
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
	    "rrc.informationelements",
	    "SIB_TypeExtGANSS"
	),
	new QName (
	    "InformationElements",
	    "SIB-TypeExtGANSS"
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
		    "systemInfoType15-1bis",
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
		    "systemInfoType15-2bis",
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
		    "systemInfoType15-2ter",
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
		    "systemInfoType15-3bis",
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
		    "systemInfoType15-6",
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
		    "systemInfoType15-7",
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
		    "systemInfoType15-8",
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
     * Get the type descriptor (TypeInfo) of 'this' SIB_TypeExtGANSS object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIB_TypeExtGANSS object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIB_TypeExtGANSS
