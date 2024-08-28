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
 * Define the ASN1 Type UL_MulticarrierEDCHInfo_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_MulticarrierEDCHInfo_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_MulticarrierEDCHInfo_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_MulticarrierEDCHInfo_TDD128(Configuration_info configuration_info)
    {
	setConfiguration_info(configuration_info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Configuration_info();
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
		return new Configuration_info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "configuration_info"
    public Configuration_info getConfiguration_info()
    {
	return (Configuration_info)mComponents[0];
    }
    
    public void setConfiguration_info(Configuration_info configuration_info)
    {
	mComponents[0] = configuration_info;
    }
    
    
    
    /**
     * Define the ASN1 Type Configuration_info from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Configuration_info extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Configuration_info()
	{
	}
	
	public static final  int  _continue_chosen = 1;
	public static final  int  newConfiguration_chosen = 2;
	
	// Methods for field "_continue"
	public static Configuration_info createConfiguration_infoWith_continue(Null _continue)
	{
	    Configuration_info __object = new Configuration_info();

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
	public static Configuration_info createConfiguration_infoWithNewConfiguration(UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 newConfiguration)
	{
	    Configuration_info __object = new Configuration_info();

	    __object.setNewConfiguration(newConfiguration);
	    return __object;
	}
	
	public boolean hasNewConfiguration()
	{
	    return getChosenFlag() == newConfiguration_chosen;
	}
	
	public void setNewConfiguration(UL_MulticarrierEDCH_NewConfigurationInfo_TDD128 newConfiguration)
	{
	    setChosenValue(newConfiguration);
	    setChosenFlag(newConfiguration_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case _continue_chosen:
		    return new Null();
		case newConfiguration_chosen:
		    return new UL_MulticarrierEDCH_NewConfigurationInfo_TDD128();
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
		"UL_MulticarrierEDCHInfo_TDD128$Configuration_info"
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
				    "UL_MulticarrierEDCH_NewConfigurationInfo_TDD128"
				),
				new QName (
				    "InformationElements",
				    "UL-MulticarrierEDCH-NewConfigurationInfo-TDD128"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_MulticarrierEDCH_NewConfigurationInfo_TDD128"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_MulticarrierEDCH_NewConfigurationInfo_TDD128"
				    )
				),
				0
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
	 * Get the type descriptor (TypeInfo) of 'this' Configuration_info object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Configuration_info object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Configuration_info

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
	    "UL_MulticarrierEDCHInfo_TDD128"
	),
	new QName (
	    "InformationElements",
	    "UL-MulticarrierEDCHInfo-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_MulticarrierEDCHInfo_TDD128$Configuration_info"
			)
		    ),
		    "configuration-info",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCHInfo_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_MulticarrierEDCHInfo_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_MulticarrierEDCHInfo_TDD128
