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
 * Define the ASN1 Type SIB_TypeExt from ASN1 Module InformationElements.
 * @see Choice
 */

public class SIB_TypeExt extends Choice {
    
    /**
     * The default constructor.
     */
    public SIB_TypeExt()
    {
    }
    
    public static final  int  systemInfoType11bis_chosen = 1;
    public static final  int  systemInfoType15bis_chosen = 2;
    public static final  int  systemInfoType15_1bis_chosen = 3;
    public static final  int  systemInfoType15_2bis_chosen = 4;
    public static final  int  systemInfoType15_3bis_chosen = 5;
    public static final  int  systemInfoType15_6_chosen = 6;
    public static final  int  systemInfoType15_7_chosen = 7;
    public static final  int  systemInfoType15_8_chosen = 8;
    
    // Methods for field "systemInfoType11bis"
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType11bis(Null systemInfoType11bis)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

	__object.setSystemInfoType11bis(systemInfoType11bis);
	return __object;
    }
    
    public boolean hasSystemInfoType11bis()
    {
	return getChosenFlag() == systemInfoType11bis_chosen;
    }
    
    public void setSystemInfoType11bis(Null systemInfoType11bis)
    {
	setChosenValue(systemInfoType11bis);
	setChosenFlag(systemInfoType11bis_chosen);
    }
    
    
    // Methods for field "systemInfoType15bis"
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15bis(Null systemInfoType15bis)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

	__object.setSystemInfoType15bis(systemInfoType15bis);
	return __object;
    }
    
    public boolean hasSystemInfoType15bis()
    {
	return getChosenFlag() == systemInfoType15bis_chosen;
    }
    
    public void setSystemInfoType15bis(Null systemInfoType15bis)
    {
	setChosenValue(systemInfoType15bis);
	setChosenFlag(systemInfoType15bis_chosen);
    }
    
    
    // Methods for field "systemInfoType15_1bis"
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_1bis(Null systemInfoType15_1bis)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_2bis(Null systemInfoType15_2bis)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    
    
    // Methods for field "systemInfoType15_3bis"
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_3bis(Null systemInfoType15_3bis)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_6(Null systemInfoType15_6)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_7(Null systemInfoType15_7)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    public static SIB_TypeExt createSIB_TypeExtWithSystemInfoType15_8(Null systemInfoType15_8)
    {
	SIB_TypeExt __object = new SIB_TypeExt();

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
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case systemInfoType11bis_chosen:
		return new Null();
	    case systemInfoType15bis_chosen:
		return new Null();
	    case systemInfoType15_1bis_chosen:
		return new Null();
	    case systemInfoType15_2bis_chosen:
		return new Null();
	    case systemInfoType15_3bis_chosen:
		return new Null();
	    case systemInfoType15_6_chosen:
		return new Null();
	    case systemInfoType15_7_chosen:
		return new Null();
	    case systemInfoType15_8_chosen:
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
	    "SIB_TypeExt"
	),
	new QName (
	    "InformationElements",
	    "SIB-TypeExt"
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
		    "systemInfoType11bis",
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
		    "systemInfoType15bis",
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
		    "systemInfoType15-1bis",
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
		    "systemInfoType15-2bis",
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
		    "systemInfoType15-3bis",
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
		    "systemInfoType15-6",
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
		    "systemInfoType15-7",
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
		    "systemInfoType15-8",
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
     * Get the type descriptor (TypeInfo) of 'this' SIB_TypeExt object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SIB_TypeExt object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SIB_TypeExt
