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
 * Define the ASN1 Type UE_AutonomousUpdateMode from ASN1 Module InformationElements.
 * @see Choice
 */

public class UE_AutonomousUpdateMode extends Choice {
    
    /**
     * The default constructor.
     */
    public UE_AutonomousUpdateMode()
    {
    }
    
    public static final  int  dummy_chosen = 1;
    public static final  int  onWithNoReporting_chosen = 2;
    public static final  int  dummy2_chosen = 3;
    
    // Methods for field "dummy"
    public static UE_AutonomousUpdateMode createUE_AutonomousUpdateModeWithDummy(Null dummy)
    {
	UE_AutonomousUpdateMode __object = new UE_AutonomousUpdateMode();

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
    
    
    // Methods for field "onWithNoReporting"
    public static UE_AutonomousUpdateMode createUE_AutonomousUpdateModeWithOnWithNoReporting(Null onWithNoReporting)
    {
	UE_AutonomousUpdateMode __object = new UE_AutonomousUpdateMode();

	__object.setOnWithNoReporting(onWithNoReporting);
	return __object;
    }
    
    public boolean hasOnWithNoReporting()
    {
	return getChosenFlag() == onWithNoReporting_chosen;
    }
    
    public void setOnWithNoReporting(Null onWithNoReporting)
    {
	setChosenValue(onWithNoReporting);
	setChosenFlag(onWithNoReporting_chosen);
    }
    
    
    // Methods for field "dummy2"
    public static UE_AutonomousUpdateMode createUE_AutonomousUpdateModeWithDummy2(RL_InformationLists dummy2)
    {
	UE_AutonomousUpdateMode __object = new UE_AutonomousUpdateMode();

	__object.setDummy2(dummy2);
	return __object;
    }
    
    public boolean hasDummy2()
    {
	return getChosenFlag() == dummy2_chosen;
    }
    
    public void setDummy2(RL_InformationLists dummy2)
    {
	setChosenValue(dummy2);
	setChosenFlag(dummy2_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case dummy_chosen:
		return new Null();
	    case onWithNoReporting_chosen:
		return new Null();
	    case dummy2_chosen:
		return new RL_InformationLists();
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
	    "UE_AutonomousUpdateMode"
	),
	new QName (
	    "InformationElements",
	    "UE-AutonomousUpdateMode"
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
		    "dummy",
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
		    "onWithNoReporting",
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
				"RL_InformationLists"
			    ),
			    new QName (
				"InformationElements",
				"RL-InformationLists"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RL_InformationLists"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RL_InformationLists"
				)
			    ),
			    0
			)
		    ),
		    "dummy2",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_AutonomousUpdateMode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_AutonomousUpdateMode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_AutonomousUpdateMode
