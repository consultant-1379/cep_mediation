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
 * Define the ASN1 Type HS_SCCH_LessInfo_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_LessInfo_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_LessInfo_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_LessInfo_r7(Hs_scchLessOperation hs_scchLessOperation)
    {
	setHs_scchLessOperation(hs_scchLessOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Hs_scchLessOperation();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Hs_scchLessOperation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_scchLessOperation"
    public Hs_scchLessOperation getHs_scchLessOperation()
    {
	return (Hs_scchLessOperation)mComponents[0];
    }
    
    public void setHs_scchLessOperation(Hs_scchLessOperation hs_scchLessOperation)
    {
	mComponents[0] = hs_scchLessOperation;
    }
    
    
    
    /**
     * Define the ASN1 Type Hs_scchLessOperation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Hs_scchLessOperation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Hs_scchLessOperation()
	{
	}
	
	public static final  int  _continue_chosen = 1;
	public static final  int  newOperation_chosen = 2;
	
	// Methods for field "_continue"
	public static Hs_scchLessOperation createHs_scchLessOperationWith_continue(Null _continue)
	{
	    Hs_scchLessOperation __object = new Hs_scchLessOperation();

	    __object.set_continue(_continue);
	    return __object;
	}
	
	public boolean has_continue()
	{
	    return getChosenFlag() == _continue_chosen;
	}
	
	public void set_continue(Null _continue)
	{
	    setChosenValue(_continue);
	    setChosenFlag(_continue_chosen);
	}
	
	
	// Methods for field "newOperation"
	public static Hs_scchLessOperation createHs_scchLessOperationWithNewOperation(HS_SCCH_Less_NewOperation newOperation)
	{
	    Hs_scchLessOperation __object = new Hs_scchLessOperation();

	    __object.setNewOperation(newOperation);
	    return __object;
	}
	
	public boolean hasNewOperation()
	{
	    return getChosenFlag() == newOperation_chosen;
	}
	
	public void setNewOperation(HS_SCCH_Less_NewOperation newOperation)
	{
	    setChosenValue(newOperation);
	    setChosenFlag(newOperation_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case _continue_chosen:
		    return new Null();
		case newOperation_chosen:
		    return new HS_SCCH_Less_NewOperation();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SCCH_LessInfo_r7$Hs_scchLessOperation"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
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
			"continue",
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
				    "HS_SCCH_Less_NewOperation"
				),
				new QName (
				    "InformationElements",
				    "HS-SCCH-Less-NewOperation"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Less_NewOperation"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Less_NewOperation"
				    )
				),
				0
			    )
			),
			"newOperation",
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
	 * Get the type descriptor (TypeInfo) of 'this' Hs_scchLessOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Hs_scchLessOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Hs_scchLessOperation

    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "HS_SCCH_LessInfo_r7"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-LessInfo-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_LessInfo_r7$Hs_scchLessOperation"
			)
		    ),
		    "hs-scchLessOperation",
		    0,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_LessInfo_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_LessInfo_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_LessInfo_r7
