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
 * Define the ASN1 Type UE_InternalReportingQuantity_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_InternalReportingQuantity_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_InternalReportingQuantity_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_InternalReportingQuantity_r4(BOOLEAN ue_TransmittedPower, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setUe_TransmittedPower(ue_TransmittedPower);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with components.
     */
    public UE_InternalReportingQuantity_r4(boolean ue_TransmittedPower, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	this(new BOOLEAN(ue_TransmittedPower), modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new ModeSpecificInfo();
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
		return new BOOLEAN();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_TransmittedPower"
    public boolean getUe_TransmittedPower()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setUe_TransmittedPower(boolean ue_TransmittedPower)
    {
	setUe_TransmittedPower(new BOOLEAN(ue_TransmittedPower));
    }
    
    public void setUe_TransmittedPower(BOOLEAN ue_TransmittedPower)
    {
	mComponents[0] = ue_TransmittedPower;
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(BOOLEAN ue_RX_TX_TimeDifference)
	    {
		setUe_RX_TX_TimeDifference(ue_RX_TX_TimeDifference);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(boolean ue_RX_TX_TimeDifference)
	    {
		this(new BOOLEAN(ue_RX_TX_TimeDifference));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BOOLEAN();
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
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ue_RX_TX_TimeDifference"
	    public boolean getUe_RX_TX_TimeDifference()
	    {
		return ((BOOLEAN)mComponents[0]).booleanValue();
	    }
	    
	    public void setUe_RX_TX_TimeDifference(boolean ue_RX_TX_TimeDifference)
	    {
		setUe_RX_TX_TimeDifference(new BOOLEAN(ue_RX_TX_TimeDifference));
	    }
	    
	    public void setUe_RX_TX_TimeDifference(BOOLEAN ue_RX_TX_TimeDifference)
	    {
		mComponents[0] = ue_RX_TX_TimeDifference;
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
		    "UE_InternalReportingQuantity_r4$ModeSpecificInfo$Fdd"
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
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "ue-RX-TX-TimeDifference",
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
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(TddOption tddOption)
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
		    public Tdd384(BOOLEAN appliedTA)
		    {
			setAppliedTA(appliedTA);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public Tdd384(boolean appliedTA)
		    {
			this(new BOOLEAN(appliedTA));
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BOOLEAN();
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
				return new BOOLEAN();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "appliedTA"
		    public boolean getAppliedTA()
		    {
			return ((BOOLEAN)mComponents[0]).booleanValue();
		    }
		    
		    public void setAppliedTA(boolean appliedTA)
		    {
			setAppliedTA(new BOOLEAN(appliedTA));
		    }
		    
		    public void setAppliedTA(BOOLEAN appliedTA)
		    {
			mComponents[0] = appliedTA;
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
			    "UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption$Tdd384"
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
					new TypeInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
						}
					    ),
					    new QName (
						"com.oss.asn1",
						"BOOLEAN"
					    ),
					    new QName (
						"builtin",
						"BOOLEAN"
					    ),
					    12314,
					    null
					)
				    ),
				    "appliedTA",
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
		    public Tdd128(BOOLEAN t_ADVinfo)
		    {
			setT_ADVinfo(t_ADVinfo);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public Tdd128(boolean t_ADVinfo)
		    {
			this(new BOOLEAN(t_ADVinfo));
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BOOLEAN();
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
				return new BOOLEAN();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "t_ADVinfo"
		    public boolean getT_ADVinfo()
		    {
			return ((BOOLEAN)mComponents[0]).booleanValue();
		    }
		    
		    public void setT_ADVinfo(boolean t_ADVinfo)
		    {
			setT_ADVinfo(new BOOLEAN(t_ADVinfo));
		    }
		    
		    public void setT_ADVinfo(BOOLEAN t_ADVinfo)
		    {
			mComponents[0] = t_ADVinfo;
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
			    "UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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
					new TypeInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
						}
					    ),
					    new QName (
						"com.oss.asn1",
						"BOOLEAN"
					    ),
					    new QName (
						"builtin",
						"BOOLEAN"
					    ),
					    12314,
					    null
					)
				    ),
				    "t-ADVinfo",
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
			"UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption"
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
					"UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption$Tdd384"
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
					"UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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
		    "UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd"
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
				    "UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd$TddOption"
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
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
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
		"UE_InternalReportingQuantity_r4$ModeSpecificInfo"
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
				"UE_InternalReportingQuantity_r4$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_InternalReportingQuantity_r4$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "UE_InternalReportingQuantity_r4"
	),
	new QName (
	    "InformationElements",
	    "UE-InternalReportingQuantity-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "ue-TransmittedPower",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_InternalReportingQuantity_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_InternalReportingQuantity_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_InternalReportingQuantity_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_InternalReportingQuantity_r4
