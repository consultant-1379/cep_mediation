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
 * Define the ASN1 Type UL_TimingAdvanceControl_r4 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_TimingAdvanceControl_r4 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_TimingAdvanceControl_r4()
    {
    }
    
    public static final  int  disabled_chosen = 1;
    public static final  int  enabled_chosen = 2;
    
    // Methods for field "disabled"
    public static UL_TimingAdvanceControl_r4 createUL_TimingAdvanceControl_r4WithDisabled(Null disabled)
    {
	UL_TimingAdvanceControl_r4 __object = new UL_TimingAdvanceControl_r4();

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
    public static UL_TimingAdvanceControl_r4 createUL_TimingAdvanceControl_r4WithEnabled(Enabled enabled)
    {
	UL_TimingAdvanceControl_r4 __object = new UL_TimingAdvanceControl_r4();

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
	public Enabled(TddOption tddOption)
	{
	    setTddOption(tddOption);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new TddOption();
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
		    return new TddOption();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "tddOption"
	public TddOption getTddOption()
	{
	    return (TddOption)mComponents[0];
	}
	
	public void setTddOption(TddOption tddOption)
	{
	    mComponents[0] = tddOption;
	}
	
	
	
	/**
	 * Define the ASN1 Type TddOption from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class TddOption extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public TddOption()
	    {
	    }
	    
	    public static final  int  tdd384_chosen = 1;
	    public static final  int  tdd128_chosen = 2;
	    
	    // Methods for field "tdd384"
	    public static TddOption createTddOptionWithTdd384(Tdd384 tdd384)
	    {
		TddOption __object = new TddOption();

		__object.setTdd384(tdd384);
		return __object;
	    }
	    
	    public boolean hasTdd384()
	    {
		return getChosenFlag() == tdd384_chosen;
	    }
	    
	    public void setTdd384(Tdd384 tdd384)
	    {
		setChosenValue(tdd384);
		setChosenFlag(tdd384_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd384 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd384 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd384()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd384(UL_TimingAdvance ul_TimingAdvance, 
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
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"UL_TimingAdvanceControl_r4$Enabled$TddOption$Tdd384"
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd384 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd384 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd384

	    // Methods for field "tdd128"
	    public static TddOption createTddOptionWithTdd128(Tdd128 tdd128)
	    {
		TddOption __object = new TddOption();

		__object.setTdd128(tdd128);
		return __object;
	    }
	    
	    public boolean hasTdd128()
	    {
		return getChosenFlag() == tdd128_chosen;
	    }
	    
	    public void setTdd128(Tdd128 tdd128)
	    {
		setChosenValue(tdd128);
		setChosenFlag(tdd128_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd128 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd128 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd128()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd128(UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
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
			"UL_TimingAdvanceControl_r4$Enabled$TddOption$Tdd128"
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
		 * Get the type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd128 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd128

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case tdd384_chosen:
			return new Tdd384();
		    case tdd128_chosen:
			return new Tdd128();
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
		    "UL_TimingAdvanceControl_r4$Enabled$TddOption"
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
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl_r4$Enabled$TddOption$Tdd384"
				)
			    ),
			    "tdd384",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TimingAdvanceControl_r4$Enabled$TddOption$Tdd128"
				)
			    ),
			    "tdd128",
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
	     * Get the type descriptor (TypeInfo) of 'this' TddOption object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' TddOption object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for TddOption

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
		"UL_TimingAdvanceControl_r4$Enabled"
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
			    new QName (
				"rrc.informationelements",
				"UL_TimingAdvanceControl_r4$Enabled$TddOption"
			    )
			),
			"tddOption",
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
	    "UL_TimingAdvanceControl_r4"
	),
	new QName (
	    "InformationElements",
	    "UL-TimingAdvanceControl-r4"
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
			    "UL_TimingAdvanceControl_r4$Enabled"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_TimingAdvanceControl_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_TimingAdvanceControl_r4
