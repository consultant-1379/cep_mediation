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
 * Define the ASN1 Type MU_MIMO_Info_TDD128 from ASN1 Module InformationElements.
 * @see Choice
 */

public class MU_MIMO_Info_TDD128 extends Choice {
    
    /**
     * The default constructor.
     */
    public MU_MIMO_Info_TDD128()
    {
    }
    
    public static final  int  _continue_chosen = 1;
    public static final  int  newConfiguration_chosen = 2;
    
    // Methods for field "_continue"
    public static MU_MIMO_Info_TDD128 createMU_MIMO_Info_TDD128With_continue(Null _continue)
    {
	MU_MIMO_Info_TDD128 __object = new MU_MIMO_Info_TDD128();

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
    
    
    // Methods for field "newConfiguration"
    public static MU_MIMO_Info_TDD128 createMU_MIMO_Info_TDD128WithNewConfiguration(NewConfiguration newConfiguration)
    {
	MU_MIMO_Info_TDD128 __object = new MU_MIMO_Info_TDD128();

	__object.setNewConfiguration(newConfiguration);
	return __object;
    }
    
    public boolean hasNewConfiguration()
    {
	return getChosenFlag() == newConfiguration_chosen;
    }
    
    public void setNewConfiguration(NewConfiguration newConfiguration)
    {
	setChosenValue(newConfiguration);
	setChosenFlag(newConfiguration_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type NewConfiguration from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class NewConfiguration extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NewConfiguration()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public NewConfiguration(MU_MIMO_Operation mu_MIMO_Operation, 
			StandaloneMidambleInfo_TDD128 standaloneMidambleInfo)
	{
	    setMu_MIMO_Operation(mu_MIMO_Operation);
	    setStandaloneMidambleInfo(standaloneMidambleInfo);
	}
	
	/**
	 * Construct with required components.
	 */
	public NewConfiguration(MU_MIMO_Operation mu_MIMO_Operation)
	{
	    setMu_MIMO_Operation(mu_MIMO_Operation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = MU_MIMO_Operation.uL;
	    mComponents[1] = new StandaloneMidambleInfo_TDD128();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return MU_MIMO_Operation.uL;
		case 1:
		    return new StandaloneMidambleInfo_TDD128();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mu_MIMO_Operation"
	public MU_MIMO_Operation getMu_MIMO_Operation()
	{
	    return (MU_MIMO_Operation)mComponents[0];
	}
	
	public void setMu_MIMO_Operation(MU_MIMO_Operation mu_MIMO_Operation)
	{
	    mComponents[0] = mu_MIMO_Operation;
	}
	
	
	// Methods for field "standaloneMidambleInfo"
	public StandaloneMidambleInfo_TDD128 getStandaloneMidambleInfo()
	{
	    return (StandaloneMidambleInfo_TDD128)mComponents[1];
	}
	
	public void setStandaloneMidambleInfo(StandaloneMidambleInfo_TDD128 standaloneMidambleInfo)
	{
	    mComponents[1] = standaloneMidambleInfo;
	}
	
	public boolean hasStandaloneMidambleInfo()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteStandaloneMidambleInfo()
	{
	    setComponentAbsent(1);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MU_MIMO_Info_TDD128$NewConfiguration"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MU_MIMO_Operation"
				),
				new QName (
				    "InformationElements",
				    "MU-MIMO-Operation"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "uL",
					    0
					),
					new MemberListElement (
					    "dL",
					    1
					),
					new MemberListElement (
					    "uLandDL",
					    2
					),
					new MemberListElement (
					    "spare",
					    3
					)
				    }
				),
				0,
				MU_MIMO_Operation.uL
			    )
			),
			"mu-MIMO-Operation",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "StandaloneMidambleInfo_TDD128"
				),
				new QName (
				    "InformationElements",
				    "StandaloneMidambleInfo-TDD128"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"StandaloneMidambleInfo_TDD128"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"StandaloneMidambleInfo_TDD128"
				    )
				),
				0
			    )
			),
			"standaloneMidambleInfo",
			1,
			3,
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
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewConfiguration

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case _continue_chosen:
		return new Null();
	    case newConfiguration_chosen:
		return new NewConfiguration();
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
	    "MU_MIMO_Info_TDD128"
	),
	new QName (
	    "InformationElements",
	    "MU-MIMO-Info-TDD128"
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
			new QName (
			    "rrc.informationelements",
			    "MU_MIMO_Info_TDD128$NewConfiguration"
			)
		    ),
		    "newConfiguration",
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
     * Get the type descriptor (TypeInfo) of 'this' MU_MIMO_Info_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MU_MIMO_Info_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MU_MIMO_Info_TDD128
