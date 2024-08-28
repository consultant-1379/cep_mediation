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
 * Define the ASN1 Type E_DCH_SPS_Information_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_SPS_Information_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_SPS_Information_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_SPS_Information_TDD128(E_dch_SPS_Operation e_dch_SPS_Operation)
    {
	setE_dch_SPS_Operation(e_dch_SPS_Operation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_dch_SPS_Operation();
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
		return new E_dch_SPS_Operation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_dch_SPS_Operation"
    public E_dch_SPS_Operation getE_dch_SPS_Operation()
    {
	return (E_dch_SPS_Operation)mComponents[0];
    }
    
    public void setE_dch_SPS_Operation(E_dch_SPS_Operation e_dch_SPS_Operation)
    {
	mComponents[0] = e_dch_SPS_Operation;
    }
    
    
    
    /**
     * Define the ASN1 Type E_dch_SPS_Operation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class E_dch_SPS_Operation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public E_dch_SPS_Operation()
	{
	}
	
	public static final  int  _continue_chosen = 1;
	public static final  int  newOperation_chosen = 2;
	
	// Methods for field "_continue"
	public static E_dch_SPS_Operation createE_dch_SPS_OperationWith_continue(Null _continue)
	{
	    E_dch_SPS_Operation __object = new E_dch_SPS_Operation();

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
	public static E_dch_SPS_Operation createE_dch_SPS_OperationWithNewOperation(E_DCH_SPS_NewOperation_TDD128 newOperation)
	{
	    E_dch_SPS_Operation __object = new E_dch_SPS_Operation();

	    __object.setNewOperation(newOperation);
	    return __object;
	}
	
	public boolean hasNewOperation()
	{
	    return getChosenFlag() == newOperation_chosen;
	}
	
	public void setNewOperation(E_DCH_SPS_NewOperation_TDD128 newOperation)
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
		    return new E_DCH_SPS_NewOperation_TDD128();
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
		"E_DCH_SPS_Information_TDD128$E_dch_SPS_Operation"
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
				    "E_DCH_SPS_NewOperation_TDD128"
				),
				new QName (
				    "InformationElements",
				    "E-DCH-SPS-NewOperation-TDD128"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"E_DCH_SPS_NewOperation_TDD128"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"E_DCH_SPS_NewOperation_TDD128"
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
	 * Get the type descriptor (TypeInfo) of 'this' E_dch_SPS_Operation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_dch_SPS_Operation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_dch_SPS_Operation

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
	    "E_DCH_SPS_Information_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-SPS-Information-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_SPS_Information_TDD128$E_dch_SPS_Operation"
			)
		    ),
		    "e-dch-SPS-Operation",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_SPS_Information_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_SPS_Information_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_SPS_Information_TDD128
