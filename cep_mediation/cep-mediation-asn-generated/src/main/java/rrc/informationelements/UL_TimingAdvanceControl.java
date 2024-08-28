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
 * Define the ASN1 Type UL_TimingAdvanceControl from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_TimingAdvanceControl extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_TimingAdvanceControl()
    {
    }
    
    public static final  int  disabled_chosen = 1;
    public static final  int  enabled_chosen = 2;
    
    // Methods for field "disabled"
    public static UL_TimingAdvanceControl createUL_TimingAdvanceControlWithDisabled(Null disabled)
    {
	UL_TimingAdvanceControl __object = new UL_TimingAdvanceControl();

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
    public static UL_TimingAdvanceControl createUL_TimingAdvanceControlWithEnabled(Enabled enabled)
    {
	UL_TimingAdvanceControl __object = new UL_TimingAdvanceControl();

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
	public Enabled(UL_TimingAdvance ul_TimingAdvance, 
			ActivationTime activationTime)
	{
	    setUl_TimingAdvance(ul_TimingAdvance);
	    setActivationTime(activationTime);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UL_TimingAdvance();
	    mComponents[1] = new ActivationTime();
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
		    return new UL_TimingAdvance();
		case 1:
		    return new ActivationTime();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul_TimingAdvance"
	public UL_TimingAdvance getUl_TimingAdvance()
	{
	    return (UL_TimingAdvance)mComponents[0];
	}
	
	public void setUl_TimingAdvance(UL_TimingAdvance ul_TimingAdvance)
	{
	    mComponents[0] = ul_TimingAdvance;
	}
	
	public boolean hasUl_TimingAdvance()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUl_TimingAdvance()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "activationTime"
	public ActivationTime getActivationTime()
	{
	    return (ActivationTime)mComponents[1];
	}
	
	public void setActivationTime(ActivationTime activationTime)
	{
	    mComponents[1] = activationTime;
	}
	
	public boolean hasActivationTime()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteActivationTime()
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
		"UL_TimingAdvanceControl$Enabled"
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
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvance"
				),
				new QName (
				    "InformationElements",
				    "UL-TimingAdvance"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new UL_TimingAdvance(0), 
					new UL_TimingAdvance(63),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(63)
				),
				null
			    )
			),
			"ul-TimingAdvance",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ActivationTime"
				),
				new QName (
				    "InformationElements",
				    "ActivationTime"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ActivationTime(0), 
					new ActivationTime(255),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(255)
				),
				null
			    )
			),
			"activationTime",
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
	    "UL_TimingAdvanceControl"
	),
	new QName (
	    "InformationElements",
	    "UL-TimingAdvanceControl"
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
			    "UL_TimingAdvanceControl$Enabled"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TimingAdvanceControl
