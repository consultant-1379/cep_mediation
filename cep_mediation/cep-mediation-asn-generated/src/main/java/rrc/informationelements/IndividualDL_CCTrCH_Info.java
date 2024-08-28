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
 * Define the ASN1 Type IndividualDL_CCTrCH_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IndividualDL_CCTrCH_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualDL_CCTrCH_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualDL_CCTrCH_Info(TFCS_Identity dl_TFCS_Identity, 
		    Tfcs_SignallingMode tfcs_SignallingMode)
    {
	setDl_TFCS_Identity(dl_TFCS_Identity);
	setTfcs_SignallingMode(tfcs_SignallingMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_Identity();
	mComponents[1] = new Tfcs_SignallingMode();
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
		return new TFCS_Identity();
	    case 1:
		return new Tfcs_SignallingMode();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_TFCS_Identity"
    public TFCS_Identity getDl_TFCS_Identity()
    {
	return (TFCS_Identity)mComponents[0];
    }
    
    public void setDl_TFCS_Identity(TFCS_Identity dl_TFCS_Identity)
    {
	mComponents[0] = dl_TFCS_Identity;
    }
    
    
    // Methods for field "tfcs_SignallingMode"
    public Tfcs_SignallingMode getTfcs_SignallingMode()
    {
	return (Tfcs_SignallingMode)mComponents[1];
    }
    
    public void setTfcs_SignallingMode(Tfcs_SignallingMode tfcs_SignallingMode)
    {
	mComponents[1] = tfcs_SignallingMode;
    }
    
    
    
    /**
     * Define the ASN1 Type Tfcs_SignallingMode from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tfcs_SignallingMode extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tfcs_SignallingMode()
	{
	}
	
	public static final  int  explicit_config_chosen = 1;
	public static final  int  sameAsUL_chosen = 2;
	
	// Methods for field "explicit_config"
	public static Tfcs_SignallingMode createTfcs_SignallingModeWithExplicit_config(TFCS explicit_config)
	{
	    Tfcs_SignallingMode __object = new Tfcs_SignallingMode();

	    __object.setExplicit_config(explicit_config);
	    return __object;
	}
	
	public boolean hasExplicit_config()
	{
	    return getChosenFlag() == explicit_config_chosen;
	}
	
	public void setExplicit_config(TFCS explicit_config)
	{
	    setChosenValue(explicit_config);
	    setChosenFlag(explicit_config_chosen);
	}
	
	
	// Methods for field "sameAsUL"
	public static Tfcs_SignallingMode createTfcs_SignallingModeWithSameAsUL(TFCS_Identity sameAsUL)
	{
	    Tfcs_SignallingMode __object = new Tfcs_SignallingMode();

	    __object.setSameAsUL(sameAsUL);
	    return __object;
	}
	
	public boolean hasSameAsUL()
	{
	    return getChosenFlag() == sameAsUL_chosen;
	}
	
	public void setSameAsUL(TFCS_Identity sameAsUL)
	{
	    setChosenValue(sameAsUL);
	    setChosenFlag(sameAsUL_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case explicit_config_chosen:
		    return new TFCS();
		case sameAsUL_chosen:
		    return new TFCS_Identity();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IndividualDL_CCTrCH_Info$Tfcs_SignallingMode"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TFCS"
				),
				new QName (
				    "InformationElements",
				    "TFCS"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TFCS"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0),
					new TagDecoderElement((short)0x8001, 1)
				    }
				)
			    )
			),
			"explicit-config",
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
				    "TFCS_Identity"
				),
				new QName (
				    "InformationElements",
				    "TFCS-Identity"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_Identity"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_Identity"
				    )
				),
				0
			    )
			),
			"sameAsUL",
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
	 * Get the type descriptor (TypeInfo) of 'this' Tfcs_SignallingMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tfcs_SignallingMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tfcs_SignallingMode

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
	    "IndividualDL_CCTrCH_Info"
	),
	new QName (
	    "InformationElements",
	    "IndividualDL-CCTrCH-Info"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TFCS_Identity"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    ),
			    0
			)
		    ),
		    "dl-TFCS-Identity",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IndividualDL_CCTrCH_Info$Tfcs_SignallingMode"
			)
		    ),
		    "tfcs-SignallingMode",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' IndividualDL_CCTrCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualDL_CCTrCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualDL_CCTrCH_Info
