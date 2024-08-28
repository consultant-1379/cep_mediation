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
 * Define the ASN1 Type CipheringModeCommand from ASN1 Module InformationElements.
 * @see Choice
 */

public class CipheringModeCommand extends Choice {
    
    /**
     * The default constructor.
     */
    public CipheringModeCommand()
    {
    }
    
    public static final  int  startRestart_chosen = 1;
    public static final  int  dummy_chosen = 2;
    
    // Methods for field "startRestart"
    public static CipheringModeCommand createCipheringModeCommandWithStartRestart(CipheringAlgorithm startRestart)
    {
	CipheringModeCommand __object = new CipheringModeCommand();

	__object.setStartRestart(startRestart);
	return __object;
    }
    
    public boolean hasStartRestart()
    {
	return getChosenFlag() == startRestart_chosen;
    }
    
    public void setStartRestart(CipheringAlgorithm startRestart)
    {
	setChosenValue(startRestart);
	setChosenFlag(startRestart_chosen);
    }
    
    
    // Methods for field "dummy"
    public static CipheringModeCommand createCipheringModeCommandWithDummy(Null dummy)
    {
	CipheringModeCommand __object = new CipheringModeCommand();

	__object.setDummy(dummy);
	return __object;
    }
    
    public boolean hasDummy()
    {
	return getChosenFlag() == dummy_chosen;
    }
    
    public void setDummy(Null dummy)
    {
	setChosenValue(dummy);
	setChosenFlag(dummy_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case startRestart_chosen:
		return CipheringAlgorithm.uea0;
	    case dummy_chosen:
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
	    "CipheringModeCommand"
	),
	new QName (
	    "InformationElements",
	    "CipheringModeCommand"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CipheringAlgorithm"
			    ),
			    new QName (
				"InformationElements",
				"CipheringAlgorithm"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"uea0",
					0
				    ),
				    new MemberListElement (
					"uea1",
					1
				    )
				}
			    ),
			    0,
			    CipheringAlgorithm.uea0
			)
		    ),
		    "startRestart",
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
		    "dummy",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CipheringModeCommand object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CipheringModeCommand object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CipheringModeCommand
