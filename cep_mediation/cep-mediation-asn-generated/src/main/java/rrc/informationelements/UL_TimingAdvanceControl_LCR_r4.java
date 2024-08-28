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
 * Define the ASN1 Type UL_TimingAdvanceControl_LCR_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_TimingAdvanceControl_LCR_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_TimingAdvanceControl_LCR_r4()
    {
    }
    
    public static final  int  disabled_chosen = 1;
    public static final  int  enabled_chosen = 2;
    
    // Methods for field "disabled"
    public static UL_TimingAdvanceControl_LCR_r4 createUL_TimingAdvanceControl_LCR_r4WithDisabled(Null disabled)
    {
	UL_TimingAdvanceControl_LCR_r4 __object = new UL_TimingAdvanceControl_LCR_r4();

	__object.setDisabled(disabled);
	return __object;
    }
    
    public boolean hasDisabled()
    {
	return getChosenFlag() == disabled_chosen;
    }
    
    public void setDisabled(Null disabled)
    {
	setChosenValue(disabled);
	setChosenFlag(disabled_chosen);
    }
    
    
    // Methods for field "enabled"
    public static UL_TimingAdvanceControl_LCR_r4 createUL_TimingAdvanceControl_LCR_r4WithEnabled(Enabled enabled)
    {
	UL_TimingAdvanceControl_LCR_r4 __object = new UL_TimingAdvanceControl_LCR_r4();

	__object.setEnabled(enabled);
	return __object;
    }
    
    public boolean hasEnabled()
    {
	return getChosenFlag() == enabled_chosen;
    }
    
    public void setEnabled(Enabled enabled)
    {
	setChosenValue(enabled);
	setChosenFlag(enabled_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Enabled from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Enabled extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Enabled()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Enabled(UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
			SynchronisationParameters_r4 synchronisationParameters)
	{
	    setUl_SynchronisationParameters(ul_SynchronisationParameters);
	    setSynchronisationParameters(synchronisationParameters);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UL_SynchronisationParameters_r4();
	    mComponents[1] = new SynchronisationParameters_r4();
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
		    return new UL_SynchronisationParameters_r4();
		case 1:
		    return new SynchronisationParameters_r4();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul_SynchronisationParameters"
	public UL_SynchronisationParameters_r4 getUl_SynchronisationParameters()
	{
	    return (UL_SynchronisationParameters_r4)mComponents[0];
	}
	
	public void setUl_SynchronisationParameters(UL_SynchronisationParameters_r4 ul_SynchronisationParameters)
	{
	    mComponents[0] = ul_SynchronisationParameters;
	}
	
	public boolean hasUl_SynchronisationParameters()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUl_SynchronisationParameters()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "synchronisationParameters"
	public SynchronisationParameters_r4 getSynchronisationParameters()
	{
	    return (SynchronisationParameters_r4)mComponents[1];
	}
	
	public void setSynchronisationParameters(SynchronisationParameters_r4 synchronisationParameters)
	{
	    mComponents[1] = synchronisationParameters;
	}
	
	public boolean hasSynchronisationParameters()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteSynchronisationParameters()
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
		"UL_TimingAdvanceControl_LCR_r4$Enabled"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_SynchronisationParameters_r4"
				),
				new QName (
				    "InformationElements",
				    "UL-SynchronisationParameters-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_SynchronisationParameters_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_SynchronisationParameters_r4"
				    )
				),
				0
			    )
			),
			"ul-SynchronisationParameters",
			0,
			3,
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
				    "SynchronisationParameters_r4"
				),
				new QName (
				    "InformationElements",
				    "SynchronisationParameters-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SynchronisationParameters_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SynchronisationParameters_r4"
				    )
				),
				0
			    )
			),
			"synchronisationParameters",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
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
	 * Get the type descriptor (TypeInfo) of 'this' Enabled object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Enabled object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Enabled

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case disabled_chosen:
		return new Null();
	    case enabled_chosen:
		return new Enabled();
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
	    "UL_TimingAdvanceControl_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "UL-TimingAdvanceControl-LCR-r4"
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
		    "disabled",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_TimingAdvanceControl_LCR_r4$Enabled"
			)
		    ),
		    "enabled",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TimingAdvanceControl_LCR_r4
