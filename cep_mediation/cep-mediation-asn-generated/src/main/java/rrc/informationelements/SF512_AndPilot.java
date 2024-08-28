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
 * Define the ASN1 Type SF512_AndPilot from ASN1 Module InformationElements.
 * @see Choice
 */

public class SF512_AndPilot extends Choice {
    
    /**
     * The default constructor.
     */
    public SF512_AndPilot()
    {
    }
    
    public static final  int  sfd4_chosen = 1;
    public static final  int  sfd8_chosen = 2;
    public static final  int  sfd16_chosen = 3;
    public static final  int  sfd32_chosen = 4;
    public static final  int  sfd64_chosen = 5;
    public static final  int  sfd128_chosen = 6;
    public static final  int  sfd256_chosen = 7;
    public static final  int  sfd512_chosen = 8;
    
    // Methods for field "sfd4"
    public static SF512_AndPilot createSF512_AndPilotWithSfd4(Null sfd4)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd4(sfd4);
	return __object;
    }
    
    public boolean hasSfd4()
    {
	return getChosenFlag() == sfd4_chosen;
    }
    
    public void setSfd4(Null sfd4)
    {
	setChosenValue(sfd4);
	setChosenFlag(sfd4_chosen);
    }
    
    
    // Methods for field "sfd8"
    public static SF512_AndPilot createSF512_AndPilotWithSfd8(Null sfd8)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd8(sfd8);
	return __object;
    }
    
    public boolean hasSfd8()
    {
	return getChosenFlag() == sfd8_chosen;
    }
    
    public void setSfd8(Null sfd8)
    {
	setChosenValue(sfd8);
	setChosenFlag(sfd8_chosen);
    }
    
    
    // Methods for field "sfd16"
    public static SF512_AndPilot createSF512_AndPilotWithSfd16(Null sfd16)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd16(sfd16);
	return __object;
    }
    
    public boolean hasSfd16()
    {
	return getChosenFlag() == sfd16_chosen;
    }
    
    public void setSfd16(Null sfd16)
    {
	setChosenValue(sfd16);
	setChosenFlag(sfd16_chosen);
    }
    
    
    // Methods for field "sfd32"
    public static SF512_AndPilot createSF512_AndPilotWithSfd32(Null sfd32)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd32(sfd32);
	return __object;
    }
    
    public boolean hasSfd32()
    {
	return getChosenFlag() == sfd32_chosen;
    }
    
    public void setSfd32(Null sfd32)
    {
	setChosenValue(sfd32);
	setChosenFlag(sfd32_chosen);
    }
    
    
    // Methods for field "sfd64"
    public static SF512_AndPilot createSF512_AndPilotWithSfd64(Null sfd64)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd64(sfd64);
	return __object;
    }
    
    public boolean hasSfd64()
    {
	return getChosenFlag() == sfd64_chosen;
    }
    
    public void setSfd64(Null sfd64)
    {
	setChosenValue(sfd64);
	setChosenFlag(sfd64_chosen);
    }
    
    
    // Methods for field "sfd128"
    public static SF512_AndPilot createSF512_AndPilotWithSfd128(PilotBits128 sfd128)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd128(sfd128);
	return __object;
    }
    
    public boolean hasSfd128()
    {
	return getChosenFlag() == sfd128_chosen;
    }
    
    public void setSfd128(PilotBits128 sfd128)
    {
	setChosenValue(sfd128);
	setChosenFlag(sfd128_chosen);
    }
    
    
    // Methods for field "sfd256"
    public static SF512_AndPilot createSF512_AndPilotWithSfd256(PilotBits256 sfd256)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd256(sfd256);
	return __object;
    }
    
    public boolean hasSfd256()
    {
	return getChosenFlag() == sfd256_chosen;
    }
    
    public void setSfd256(PilotBits256 sfd256)
    {
	setChosenValue(sfd256);
	setChosenFlag(sfd256_chosen);
    }
    
    
    // Methods for field "sfd512"
    public static SF512_AndPilot createSF512_AndPilotWithSfd512(Null sfd512)
    {
	SF512_AndPilot __object = new SF512_AndPilot();

	__object.setSfd512(sfd512);
	return __object;
    }
    
    public boolean hasSfd512()
    {
	return getChosenFlag() == sfd512_chosen;
    }
    
    public void setSfd512(Null sfd512)
    {
	setChosenValue(sfd512);
	setChosenFlag(sfd512_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case sfd4_chosen:
		return new Null();
	    case sfd8_chosen:
		return new Null();
	    case sfd16_chosen:
		return new Null();
	    case sfd32_chosen:
		return new Null();
	    case sfd64_chosen:
		return new Null();
	    case sfd128_chosen:
		return PilotBits128.pb4;
	    case sfd256_chosen:
		return PilotBits256.pb2;
	    case sfd512_chosen:
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
	    "SF512_AndPilot"
	),
	new QName (
	    "InformationElements",
	    "SF512-AndPilot"
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
		    "sfd4",
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
		    "sfd8",
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
		    "sfd16",
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
		    "sfd32",
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
		    "sfd64",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PilotBits128"
			    ),
			    new QName (
				"InformationElements",
				"PilotBits128"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pb4",
					0
				    ),
				    new MemberListElement (
					"pb8",
					1
				    )
				}
			    ),
			    0,
			    PilotBits128.pb4
			)
		    ),
		    "sfd128",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PilotBits256"
			    ),
			    new QName (
				"InformationElements",
				"PilotBits256"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pb2",
					0
				    ),
				    new MemberListElement (
					"pb4",
					1
				    ),
				    new MemberListElement (
					"pb8",
					2
				    )
				}
			    ),
			    0,
			    PilotBits256.pb2
			)
		    ),
		    "sfd256",
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
		    "sfd512",
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
     * Get the type descriptor (TypeInfo) of 'this' SF512_AndPilot object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SF512_AndPilot object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SF512_AndPilot
