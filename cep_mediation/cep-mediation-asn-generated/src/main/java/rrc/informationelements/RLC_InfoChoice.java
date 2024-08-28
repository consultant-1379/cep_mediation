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
 * Define the ASN1 Type RLC_InfoChoice from ASN1 Module InformationElements.
 * @see Choice
 */

public class RLC_InfoChoice extends Choice {
    
    /**
     * The default constructor.
     */
    public RLC_InfoChoice()
    {
    }
    
    public static final  int  rlc_Info_chosen = 1;
    public static final  int  same_as_RB_chosen = 2;
    
    // Methods for field "rlc_Info"
    public static RLC_InfoChoice createRLC_InfoChoiceWithRlc_Info(RLC_Info rlc_Info)
    {
	RLC_InfoChoice __object = new RLC_InfoChoice();

	__object.setRlc_Info(rlc_Info);
	return __object;
    }
    
    public boolean hasRlc_Info()
    {
	return getChosenFlag() == rlc_Info_chosen;
    }
    
    public void setRlc_Info(RLC_Info rlc_Info)
    {
	setChosenValue(rlc_Info);
	setChosenFlag(rlc_Info_chosen);
    }
    
    
    // Methods for field "same_as_RB"
    public static RLC_InfoChoice createRLC_InfoChoiceWithSame_as_RB(long same_as_RB)
    {
	return createRLC_InfoChoiceWithSame_as_RB(new RB_Identity(same_as_RB));
    }
    
    public static RLC_InfoChoice createRLC_InfoChoiceWithSame_as_RB(RB_Identity same_as_RB)
    {
	RLC_InfoChoice __object = new RLC_InfoChoice();

	__object.setSame_as_RB(same_as_RB);
	return __object;
    }
    
    public boolean hasSame_as_RB()
    {
	return getChosenFlag() == same_as_RB_chosen;
    }
    
    public void setSame_as_RB(long same_as_RB)
    {
	setSame_as_RB(new RB_Identity(same_as_RB));
    }
    
    public void setSame_as_RB(RB_Identity same_as_RB)
    {
	setChosenValue(same_as_RB);
	setChosenFlag(same_as_RB_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case rlc_Info_chosen:
		return new RLC_Info();
	    case same_as_RB_chosen:
		return new RB_Identity();
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
	    "RLC_InfoChoice"
	),
	new QName (
	    "InformationElements",
	    "RLC-InfoChoice"
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
				"rrc.informationelements",
				"RLC_Info"
			    ),
			    new QName (
				"InformationElements",
				"RLC-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "RLC_Info"
				)
			    ),
			    0
			)
		    ),
		    "rlc-Info",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"RB_Identity"
			    ),
			    new QName (
				"InformationElements",
				"RB-Identity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RB_Identity(1), 
				    new RB_Identity(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "same-as-RB",
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
     * Get the type descriptor (TypeInfo) of 'this' RLC_InfoChoice object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RLC_InfoChoice object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RLC_InfoChoice
