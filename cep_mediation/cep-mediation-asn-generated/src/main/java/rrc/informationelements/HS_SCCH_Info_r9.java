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
 * Define the ASN1 Type HS_SCCH_Info_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_Info_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_Info_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_Info_r9(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
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
	    public Fdd(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo, 
			    SecondaryScramblingCode dl_ScramblingCode)
	    {
		setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
		setDl_ScramblingCode(dl_ScramblingCode);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
	    {
		setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_SCCHChannelisationCodeInfo();
		mComponents[1] = new SecondaryScramblingCode();
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
			return new HS_SCCHChannelisationCodeInfo();
		    case 1:
			return new SecondaryScramblingCode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hS_SCCHChannelisationCodeInfo"
	    public HS_SCCHChannelisationCodeInfo getHS_SCCHChannelisationCodeInfo()
	    {
		return (HS_SCCHChannelisationCodeInfo)mComponents[0];
	    }
	    
	    public void setHS_SCCHChannelisationCodeInfo(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
	    {
		mComponents[0] = hS_SCCHChannelisationCodeInfo;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type HS_SCCHChannelisationCodeInfo from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class HS_SCCHChannelisationCodeInfo extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public HS_SCCHChannelisationCodeInfo()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public HS_SCCHChannelisationCodeInfo(HS_SCCH_Codes[] elements)
		{
		    super(elements);
		}
		
		/**
		 * Add an Element to the SEQUENCE OF/SET OF.
		 */
		public synchronized void add(HS_SCCH_Codes element)
		{
		    super.addElement(element);
		}
		
		/**
		 * Set an Element in the SEQUENCE OF/SET OF.
		 */
		public synchronized void set(HS_SCCH_Codes element, int atIndex)
		{
		    super.setElement(element, atIndex);
		}
		
		/**
		 * Get an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized HS_SCCH_Codes get(int atIndex)
		{
		    return (HS_SCCH_Codes)super.getElement(atIndex);
		}
		
		/**
		 * Insert an Element into the SEQUENCE OF/SET OF.
		 */
		public synchronized void insert(HS_SCCH_Codes element, int atIndex)
		{
		    super.insertElement(element, atIndex);
		}
		
		/**
		 * Remove an Element from the SEQUENCE OF/SET OF.
		 */
		public synchronized void remove(HS_SCCH_Codes element)
		{
		    super.removeElement(element);
		}
		
		/**
		 * Create an instance of  SEQUENCE OF/SET OF.
		 */
		public AbstractData createInstance()
		{
		    return (AbstractData)new HS_SCCH_Codes();
		}
		
		/**
		 * Initialize the type descriptor.
		 */
		private static final ContainerInfo c_typeinfo = new ContainerInfo (
		    new Tags (
			new short[] {
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"HS_SCCH_Info_r9$ModeSpecificInfo$Fdd$HS_SCCHChannelisationCodeInfo"
		    ),
		    new QName (
			"builtin",
			"SEQUENCE OF"
		    ),
		    12314,
		    new SizeConstraint (
			new ValueRangeConstraint (
			    new AbstractBounds(
				new com.oss.asn1.INTEGER(1), 
				new com.oss.asn1.INTEGER(4),
				0
			    )
			)
		    ),
		    new Bounds (
			new java.lang.Long(1),
			new java.lang.Long(4)
		    ),
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Codes"
			)
		    )
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for HS_SCCHChannelisationCodeInfo

	    // Methods for field "dl_ScramblingCode"
	    public SecondaryScramblingCode getDl_ScramblingCode()
	    {
		return (SecondaryScramblingCode)mComponents[1];
	    }
	    
	    public void setDl_ScramblingCode(SecondaryScramblingCode dl_ScramblingCode)
	    {
		mComponents[1] = dl_ScramblingCode;
	    }
	    
	    public boolean hasDl_ScramblingCode()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDl_ScramblingCode()
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
		    "HS_SCCH_Info_r9$ModeSpecificInfo$Fdd"
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
				    "HS_SCCH_Info_r9$ModeSpecificInfo$Fdd$HS_SCCHChannelisationCodeInfo"
				)
			    ),
			    "hS-SCCHChannelisationCodeInfo",
			    0,
			    2,
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
					"SecondaryScramblingCode"
				    ),
				    new QName (
					"InformationElements",
					"SecondaryScramblingCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new SecondaryScramblingCode(1), 
					    new SecondaryScramblingCode(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "dl-ScramblingCode",
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
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd384_chosen = 1;
	    public static final  int  tdd768_chosen = 2;
	    public static final  int  tdd128_chosen = 3;
	    
	    // Methods for field "tdd384"
	    public static Tdd createTddWithTdd384(Tdd384 tdd384)
	    {
		Tdd __object = new Tdd();

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
		public Tdd384(INTEGER nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl_Info, 
				DHS_Sync dhs_sync, Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setHs_SICH_PowerControl_Info(hs_SICH_PowerControl_Info);
		    setDhs_sync(dhs_sync);
		    setBler_target(bler_target);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd384(long nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl_Info, 
				DHS_Sync dhs_sync, Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    this(new INTEGER(nack_ack_power_offset), 
			 hs_SICH_PowerControl_Info, dhs_sync, bler_target, 
			 hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd384(long nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl_Info, 
				Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setHs_SICH_PowerControl_Info(hs_SICH_PowerControl_Info);
		    setBler_target(bler_target);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new HS_SICH_Power_Control_Info_TDD384();
		    mComponents[2] = new DHS_Sync();
		    mComponents[3] = new Bler_Target();
		    mComponents[4] = new HS_SCCH_SetConfiguration();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[5];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new INTEGER();
			case 1:
			    return new HS_SICH_Power_Control_Info_TDD384();
			case 2:
			    return new DHS_Sync();
			case 3:
			    return new Bler_Target();
			case 4:
			    return new HS_SCCH_SetConfiguration();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "nack_ack_power_offset"
		public long getNack_ack_power_offset()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setNack_ack_power_offset(long nack_ack_power_offset)
		{
		    setNack_ack_power_offset(new INTEGER(nack_ack_power_offset));
		}
		
		public void setNack_ack_power_offset(INTEGER nack_ack_power_offset)
		{
		    mComponents[0] = nack_ack_power_offset;
		}
		
		
		// Methods for field "hs_SICH_PowerControl_Info"
		public HS_SICH_Power_Control_Info_TDD384 getHs_SICH_PowerControl_Info()
		{
		    return (HS_SICH_Power_Control_Info_TDD384)mComponents[1];
		}
		
		public void setHs_SICH_PowerControl_Info(HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl_Info)
		{
		    mComponents[1] = hs_SICH_PowerControl_Info;
		}
		
		
		// Methods for field "dhs_sync"
		public DHS_Sync getDhs_sync()
		{
		    return (DHS_Sync)mComponents[2];
		}
		
		public void setDhs_sync(DHS_Sync dhs_sync)
		{
		    mComponents[2] = dhs_sync;
		}
		
		public boolean hasDhs_sync()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteDhs_sync()
		{
		    setComponentAbsent(2);
		}
		
		
		// Methods for field "bler_target"
		public Bler_Target getBler_target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setBler_target(Bler_Target bler_target)
		{
		    mComponents[3] = bler_target;
		}
		
		
		// Methods for field "hS_SCCH_SetConfiguration"
		public HS_SCCH_SetConfiguration getHS_SCCH_SetConfiguration()
		{
		    return (HS_SCCH_SetConfiguration)mComponents[4];
		}
		
		public void setHS_SCCH_SetConfiguration(HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    mComponents[4] = hS_SCCH_SetConfiguration;
		}
		
		
		
		/**
		 * Define the ASN1 Type HS_SCCH_SetConfiguration from ASN1 Module InformationElements.
		 * @see SequenceOf
		 */
		public static class HS_SCCH_SetConfiguration extends SequenceOf {
		    
		    /**
		     * The default constructor.
		     */
		    public HS_SCCH_SetConfiguration()
		    {
		    }
		    
		    /**
		     * Construct from an array of components.
		     */
		    public HS_SCCH_SetConfiguration(HS_SCCH_TDD384_r6[] elements)
		    {
			super(elements);
		    }
		    
		    /**
		     * Add an Element to the SEQUENCE OF/SET OF.
		     */
		    public synchronized void add(HS_SCCH_TDD384_r6 element)
		    {
			super.addElement(element);
		    }
		    
		    /**
		     * Set an Element in the SEQUENCE OF/SET OF.
		     */
		    public synchronized void set(HS_SCCH_TDD384_r6 element, int atIndex)
		    {
			super.setElement(element, atIndex);
		    }
		    
		    /**
		     * Get an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized HS_SCCH_TDD384_r6 get(int atIndex)
		    {
			return (HS_SCCH_TDD384_r6)super.getElement(atIndex);
		    }
		    
		    /**
		     * Insert an Element into the SEQUENCE OF/SET OF.
		     */
		    public synchronized void insert(HS_SCCH_TDD384_r6 element, int atIndex)
		    {
			super.insertElement(element, atIndex);
		    }
		    
		    /**
		     * Remove an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized void remove(HS_SCCH_TDD384_r6 element)
		    {
			super.removeElement(element);
		    }
		    
		    /**
		     * Create an instance of  SEQUENCE OF/SET OF.
		     */
		    public AbstractData createInstance()
		    {
			return (AbstractData)new HS_SCCH_TDD384_r6();
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final ContainerInfo c_typeinfo = new ContainerInfo (
			new Tags (
			    new short[] {
				(short)0x8004
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd384$HS_SCCH_SetConfiguration"
			),
			new QName (
			    "builtin",
			    "SEQUENCE OF"
			),
			12314,
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    )
			),
			new Bounds (
			    new java.lang.Long(1),
			    new java.lang.Long(4)
			),
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_SCCH_TDD384_r6"
			    )
			)
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for HS_SCCH_SetConfiguration

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
			"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd384"
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
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(-7), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-7),
					    new java.lang.Long(8)
					),
					null
				    )
				),
				"nack-ack-power-offset",
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
					    "HS_SICH_Power_Control_Info_TDD384"
					),
					new QName (
					    "InformationElements",
					    "HS-SICH-Power-Control-Info-TDD384"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_SICH_Power_Control_Info_TDD384"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_SICH_Power_Control_Info_TDD384"
					    )
					),
					0
				    )
				),
				"hs-SICH-PowerControl-Info",
				1,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8002
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "DHS_Sync"
					),
					new QName (
					    "InformationElements",
					    "DHS-Sync"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new DHS_Sync(-20), 
						new DHS_Sync(10),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-20),
					    new java.lang.Long(10)
					),
					null
				    )
				),
				"dhs-sync",
				2,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"bler-target",
				3,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd384$HS_SCCH_SetConfiguration"
				    )
				),
				"hS-SCCH-SetConfiguration",
				4,
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
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8003, 3)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8004, 4)
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

	    // Methods for field "tdd768"
	    public static Tdd createTddWithTdd768(Tdd768 tdd768)
	    {
		Tdd __object = new Tdd();

		__object.setTdd768(tdd768);
		return __object;
	    }
	    
	    public boolean hasTdd768()
	    {
		return getChosenFlag() == tdd768_chosen;
	    }
	    
	    public void setTdd768(Tdd768 tdd768)
	    {
		setChosenValue(tdd768);
		setChosenFlag(tdd768_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tdd768 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class Tdd768 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public Tdd768()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public Tdd768(INTEGER nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl_Info, 
				DHS_Sync dhs_sync, Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setHs_SICH_PowerControl_Info(hs_SICH_PowerControl_Info);
		    setDhs_sync(dhs_sync);
		    setBler_target(bler_target);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd768(long nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl_Info, 
				DHS_Sync dhs_sync, Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    this(new INTEGER(nack_ack_power_offset), 
			 hs_SICH_PowerControl_Info, dhs_sync, bler_target, 
			 hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd768(long nack_ack_power_offset, 
				HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl_Info, 
				Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setHs_SICH_PowerControl_Info(hs_SICH_PowerControl_Info);
		    setBler_target(bler_target);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new HS_SICH_Power_Control_Info_TDD768();
		    mComponents[2] = new DHS_Sync();
		    mComponents[3] = new Bler_Target();
		    mComponents[4] = new HS_SCCH_SetConfiguration();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[5];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new INTEGER();
			case 1:
			    return new HS_SICH_Power_Control_Info_TDD768();
			case 2:
			    return new DHS_Sync();
			case 3:
			    return new Bler_Target();
			case 4:
			    return new HS_SCCH_SetConfiguration();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "nack_ack_power_offset"
		public long getNack_ack_power_offset()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setNack_ack_power_offset(long nack_ack_power_offset)
		{
		    setNack_ack_power_offset(new INTEGER(nack_ack_power_offset));
		}
		
		public void setNack_ack_power_offset(INTEGER nack_ack_power_offset)
		{
		    mComponents[0] = nack_ack_power_offset;
		}
		
		
		// Methods for field "hs_SICH_PowerControl_Info"
		public HS_SICH_Power_Control_Info_TDD768 getHs_SICH_PowerControl_Info()
		{
		    return (HS_SICH_Power_Control_Info_TDD768)mComponents[1];
		}
		
		public void setHs_SICH_PowerControl_Info(HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl_Info)
		{
		    mComponents[1] = hs_SICH_PowerControl_Info;
		}
		
		
		// Methods for field "dhs_sync"
		public DHS_Sync getDhs_sync()
		{
		    return (DHS_Sync)mComponents[2];
		}
		
		public void setDhs_sync(DHS_Sync dhs_sync)
		{
		    mComponents[2] = dhs_sync;
		}
		
		public boolean hasDhs_sync()
		{
		    return componentIsPresent(2);
		}
		
		public void deleteDhs_sync()
		{
		    setComponentAbsent(2);
		}
		
		
		// Methods for field "bler_target"
		public Bler_Target getBler_target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setBler_target(Bler_Target bler_target)
		{
		    mComponents[3] = bler_target;
		}
		
		
		// Methods for field "hS_SCCH_SetConfiguration"
		public HS_SCCH_SetConfiguration getHS_SCCH_SetConfiguration()
		{
		    return (HS_SCCH_SetConfiguration)mComponents[4];
		}
		
		public void setHS_SCCH_SetConfiguration(HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    mComponents[4] = hS_SCCH_SetConfiguration;
		}
		
		
		
		/**
		 * Define the ASN1 Type HS_SCCH_SetConfiguration from ASN1 Module InformationElements.
		 * @see SequenceOf
		 */
		public static class HS_SCCH_SetConfiguration extends SequenceOf {
		    
		    /**
		     * The default constructor.
		     */
		    public HS_SCCH_SetConfiguration()
		    {
		    }
		    
		    /**
		     * Construct from an array of components.
		     */
		    public HS_SCCH_SetConfiguration(HS_SCCH_TDD768[] elements)
		    {
			super(elements);
		    }
		    
		    /**
		     * Add an Element to the SEQUENCE OF/SET OF.
		     */
		    public synchronized void add(HS_SCCH_TDD768 element)
		    {
			super.addElement(element);
		    }
		    
		    /**
		     * Set an Element in the SEQUENCE OF/SET OF.
		     */
		    public synchronized void set(HS_SCCH_TDD768 element, int atIndex)
		    {
			super.setElement(element, atIndex);
		    }
		    
		    /**
		     * Get an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized HS_SCCH_TDD768 get(int atIndex)
		    {
			return (HS_SCCH_TDD768)super.getElement(atIndex);
		    }
		    
		    /**
		     * Insert an Element into the SEQUENCE OF/SET OF.
		     */
		    public synchronized void insert(HS_SCCH_TDD768 element, int atIndex)
		    {
			super.insertElement(element, atIndex);
		    }
		    
		    /**
		     * Remove an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized void remove(HS_SCCH_TDD768 element)
		    {
			super.removeElement(element);
		    }
		    
		    /**
		     * Create an instance of  SEQUENCE OF/SET OF.
		     */
		    public AbstractData createInstance()
		    {
			return (AbstractData)new HS_SCCH_TDD768();
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final ContainerInfo c_typeinfo = new ContainerInfo (
			new Tags (
			    new short[] {
				(short)0x8004
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd768$HS_SCCH_SetConfiguration"
			),
			new QName (
			    "builtin",
			    "SEQUENCE OF"
			),
			12314,
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    )
			),
			new Bounds (
			    new java.lang.Long(1),
			    new java.lang.Long(4)
			),
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_SCCH_TDD768"
			    )
			)
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for HS_SCCH_SetConfiguration

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
			"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd768"
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
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(-7), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-7),
					    new java.lang.Long(8)
					),
					null
				    )
				),
				"nack-ack-power-offset",
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
					    "HS_SICH_Power_Control_Info_TDD768"
					),
					new QName (
					    "InformationElements",
					    "HS-SICH-Power-Control-Info-TDD768"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_SICH_Power_Control_Info_TDD768"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_SICH_Power_Control_Info_TDD768"
					    )
					),
					0
				    )
				),
				"hs-SICH-PowerControl-Info",
				1,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8002
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "DHS_Sync"
					),
					new QName (
					    "InformationElements",
					    "DHS-Sync"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new DHS_Sync(-20), 
						new DHS_Sync(10),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-20),
					    new java.lang.Long(10)
					),
					null
				    )
				),
				"dhs-sync",
				2,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"bler-target",
				3,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd768$HS_SCCH_SetConfiguration"
				    )
				),
				"hS-SCCH-SetConfiguration",
				4,
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
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8003, 3)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8004, 4)
				}
			    )
			}
		    ),
		    0
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' Tdd768 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tdd768 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tdd768

	    // Methods for field "tdd128"
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

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
		public Tdd128(INTEGER nack_ack_power_offset, 
				INTEGER power_level_HSSICH, 
				Tpc_step_size tpc_step_size, 
				Bler_Target bler_target, 
				HS_SCCH_tpc_step_size hS_SCCH_tpc_step_size, 
				PowerControlGAP powerControlGAP, 
				BOOLEAN pathlossCompensationSwitch, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setPower_level_HSSICH(power_level_HSSICH);
		    setTpc_step_size(tpc_step_size);
		    setBler_target(bler_target);
		    setHS_SCCH_tpc_step_size(hS_SCCH_tpc_step_size);
		    setPowerControlGAP(powerControlGAP);
		    setPathlossCompensationSwitch(pathlossCompensationSwitch);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with components.
		 */
		public Tdd128(long nack_ack_power_offset, 
				long power_level_HSSICH, 
				Tpc_step_size tpc_step_size, 
				Bler_Target bler_target, 
				HS_SCCH_tpc_step_size hS_SCCH_tpc_step_size, 
				PowerControlGAP powerControlGAP, 
				boolean pathlossCompensationSwitch, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    this(new INTEGER(nack_ack_power_offset), 
			 new INTEGER(power_level_HSSICH), tpc_step_size, 
			 bler_target, hS_SCCH_tpc_step_size, 
			 powerControlGAP, 
			 new BOOLEAN(pathlossCompensationSwitch), 
			 hS_SCCH_SetConfiguration);
		}
		
		/**
		 * Construct with required components.
		 */
		public Tdd128(long nack_ack_power_offset, 
				long power_level_HSSICH, 
				Tpc_step_size tpc_step_size, 
				Bler_Target bler_target, 
				HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    setNack_ack_power_offset(nack_ack_power_offset);
		    setPower_level_HSSICH(power_level_HSSICH);
		    setTpc_step_size(tpc_step_size);
		    setBler_target(bler_target);
		    setHS_SCCH_SetConfiguration(hS_SCCH_SetConfiguration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new INTEGER();
		    mComponents[2] = Tpc_step_size.s1;
		    mComponents[3] = new Bler_Target();
		    mComponents[4] = HS_SCCH_tpc_step_size.s1;
		    mComponents[5] = new PowerControlGAP();
		    mComponents[6] = new BOOLEAN();
		    mComponents[7] = new HS_SCCH_SetConfiguration();
		}
		
		// Instance initializer
		{
		    mComponents = new AbstractData[8];
		}
		
		// Method to create a specific component instance
		public AbstractData createInstance(int index)
		{
		    switch (index) {
			case 0:
			    return new INTEGER();
			case 1:
			    return new INTEGER();
			case 2:
			    return Tpc_step_size.s1;
			case 3:
			    return new Bler_Target();
			case 4:
			    return HS_SCCH_tpc_step_size.s1;
			case 5:
			    return new PowerControlGAP();
			case 6:
			    return new BOOLEAN();
			case 7:
			    return new HS_SCCH_SetConfiguration();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "nack_ack_power_offset"
		public long getNack_ack_power_offset()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setNack_ack_power_offset(long nack_ack_power_offset)
		{
		    setNack_ack_power_offset(new INTEGER(nack_ack_power_offset));
		}
		
		public void setNack_ack_power_offset(INTEGER nack_ack_power_offset)
		{
		    mComponents[0] = nack_ack_power_offset;
		}
		
		
		// Methods for field "power_level_HSSICH"
		public long getPower_level_HSSICH()
		{
		    return ((INTEGER)mComponents[1]).longValue();
		}
		
		public void setPower_level_HSSICH(long power_level_HSSICH)
		{
		    setPower_level_HSSICH(new INTEGER(power_level_HSSICH));
		}
		
		public void setPower_level_HSSICH(INTEGER power_level_HSSICH)
		{
		    mComponents[1] = power_level_HSSICH;
		}
		
		
		// Methods for field "tpc_step_size"
		public Tpc_step_size getTpc_step_size()
		{
		    return (Tpc_step_size)mComponents[2];
		}
		
		public void setTpc_step_size(Tpc_step_size tpc_step_size)
		{
		    mComponents[2] = tpc_step_size;
		}
		
		
		
		/**
		 * Define the ASN1 Type Tpc_step_size from ASN1 Module InformationElements.
		 * @see Enumerated
		 */
		public static final class Tpc_step_size extends Enumerated {
		    
		    /**
		     * The default constructor.
		     */
		    private Tpc_step_size()
		    {
			super(cFirstNumber);
		    }
		    
		    protected Tpc_step_size(long value)
		    {
			super(value);
		    }
		    
		    // Named list definitions.
		    public static final Tpc_step_size s1 =
			new Tpc_step_size(0);
		    public static final Tpc_step_size s2 =
			new Tpc_step_size(1);
		    public static final Tpc_step_size s3 =
			new Tpc_step_size(2);
		    public static final Tpc_step_size spare1 =
			new Tpc_step_size(3);
		    private final static Tpc_step_size cNamedNumbers[] = {
			 s1, 
			 s2, 
			 s3, 
			 spare1
		    };
		    protected final static long cFirstNumber = 0;
		    protected final static boolean cLinearNumbers = false;
		    
		    public Enumerated[] getNamedNumbers()
		    {
			return cNamedNumbers;
		    }
		    
		    public boolean hasLinearNumbers()
		    {
			return cLinearNumbers;
		    }
		    
		    public long getFirstNumber()
		    {
			return cFirstNumber;
		    }
		    
		    public static Tpc_step_size valueOf(long value)
		    {
			return (Tpc_step_size)s1.lookupValue(value);
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			new Tags (
			    new short[] {
				(short)0x8002
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$Tpc_step_size"
			),
			new QName (
			    "builtin",
			    "ENUMERATED"
			),
			12314,
			null,
			new MemberList (
			    new MemberListElement[] {
				new MemberListElement (
				    "s1",
				    0
				),
				new MemberListElement (
				    "s2",
				    1
				),
				new MemberListElement (
				    "s3",
				    2
				),
				new MemberListElement (
				    "spare1",
				    3
				)
			    }
			),
			0,
			s1
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' Tpc_step_size object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Tpc_step_size object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Tpc_step_size

		// Methods for field "bler_target"
		public Bler_Target getBler_target()
		{
		    return (Bler_Target)mComponents[3];
		}
		
		public void setBler_target(Bler_Target bler_target)
		{
		    mComponents[3] = bler_target;
		}
		
		
		// Methods for field "hS_SCCH_tpc_step_size"
		public HS_SCCH_tpc_step_size getHS_SCCH_tpc_step_size()
		{
		    return (HS_SCCH_tpc_step_size)mComponents[4];
		}
		
		public void setHS_SCCH_tpc_step_size(HS_SCCH_tpc_step_size hS_SCCH_tpc_step_size)
		{
		    mComponents[4] = hS_SCCH_tpc_step_size;
		}
		
		public boolean hasHS_SCCH_tpc_step_size()
		{
		    return componentIsPresent(4);
		}
		
		public void deleteHS_SCCH_tpc_step_size()
		{
		    setComponentAbsent(4);
		}
		
		
		
		/**
		 * Define the ASN1 Type HS_SCCH_tpc_step_size from ASN1 Module InformationElements.
		 * @see Enumerated
		 */
		public static final class HS_SCCH_tpc_step_size extends Enumerated {
		    
		    /**
		     * The default constructor.
		     */
		    private HS_SCCH_tpc_step_size()
		    {
			super(cFirstNumber);
		    }
		    
		    protected HS_SCCH_tpc_step_size(long value)
		    {
			super(value);
		    }
		    
		    // Named list definitions.
		    public static final HS_SCCH_tpc_step_size s1 =
			new HS_SCCH_tpc_step_size(0);
		    public static final HS_SCCH_tpc_step_size s2 =
			new HS_SCCH_tpc_step_size(1);
		    public static final HS_SCCH_tpc_step_size s3 =
			new HS_SCCH_tpc_step_size(2);
		    public static final HS_SCCH_tpc_step_size spare1 =
			new HS_SCCH_tpc_step_size(3);
		    private final static HS_SCCH_tpc_step_size cNamedNumbers[] = {
			 s1, 
			 s2, 
			 s3, 
			 spare1
		    };
		    protected final static long cFirstNumber = 0;
		    protected final static boolean cLinearNumbers = false;
		    
		    public Enumerated[] getNamedNumbers()
		    {
			return cNamedNumbers;
		    }
		    
		    public boolean hasLinearNumbers()
		    {
			return cLinearNumbers;
		    }
		    
		    public long getFirstNumber()
		    {
			return cFirstNumber;
		    }
		    
		    public static HS_SCCH_tpc_step_size valueOf(long value)
		    {
			return (HS_SCCH_tpc_step_size)s1.lookupValue(value);
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
			new Tags (
			    new short[] {
				(short)0x8004
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$HS_SCCH_tpc_step_size"
			),
			new QName (
			    "builtin",
			    "ENUMERATED"
			),
			12314,
			null,
			new MemberList (
			    new MemberListElement[] {
				new MemberListElement (
				    "s1",
				    0
				),
				new MemberListElement (
				    "s2",
				    1
				),
				new MemberListElement (
				    "s3",
				    2
				),
				new MemberListElement (
				    "spare1",
				    3
				)
			    }
			),
			0,
			s1
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_tpc_step_size object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_tpc_step_size object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for HS_SCCH_tpc_step_size

		// Methods for field "powerControlGAP"
		public PowerControlGAP getPowerControlGAP()
		{
		    return (PowerControlGAP)mComponents[5];
		}
		
		public void setPowerControlGAP(PowerControlGAP powerControlGAP)
		{
		    mComponents[5] = powerControlGAP;
		}
		
		public boolean hasPowerControlGAP()
		{
		    return componentIsPresent(5);
		}
		
		public void deletePowerControlGAP()
		{
		    setComponentAbsent(5);
		}
		
		
		// Methods for field "pathlossCompensationSwitch"
		public boolean getPathlossCompensationSwitch()
		{
		    return ((BOOLEAN)mComponents[6]).booleanValue();
		}
		
		public void setPathlossCompensationSwitch(boolean pathlossCompensationSwitch)
		{
		    setPathlossCompensationSwitch(new BOOLEAN(pathlossCompensationSwitch));
		}
		
		public void setPathlossCompensationSwitch(BOOLEAN pathlossCompensationSwitch)
		{
		    mComponents[6] = pathlossCompensationSwitch;
		}
		
		public boolean hasPathlossCompensationSwitch()
		{
		    return componentIsPresent(6);
		}
		
		public void deletePathlossCompensationSwitch()
		{
		    setComponentAbsent(6);
		}
		
		
		// Methods for field "hS_SCCH_SetConfiguration"
		public HS_SCCH_SetConfiguration getHS_SCCH_SetConfiguration()
		{
		    return (HS_SCCH_SetConfiguration)mComponents[7];
		}
		
		public void setHS_SCCH_SetConfiguration(HS_SCCH_SetConfiguration hS_SCCH_SetConfiguration)
		{
		    mComponents[7] = hS_SCCH_SetConfiguration;
		}
		
		
		
		/**
		 * Define the ASN1 Type HS_SCCH_SetConfiguration from ASN1 Module InformationElements.
		 * @see SequenceOf
		 */
		public static class HS_SCCH_SetConfiguration extends SequenceOf {
		    
		    /**
		     * The default constructor.
		     */
		    public HS_SCCH_SetConfiguration()
		    {
		    }
		    
		    /**
		     * Construct from an array of components.
		     */
		    public HS_SCCH_SetConfiguration(HS_SCCH_TDD128_r6[] elements)
		    {
			super(elements);
		    }
		    
		    /**
		     * Add an Element to the SEQUENCE OF/SET OF.
		     */
		    public synchronized void add(HS_SCCH_TDD128_r6 element)
		    {
			super.addElement(element);
		    }
		    
		    /**
		     * Set an Element in the SEQUENCE OF/SET OF.
		     */
		    public synchronized void set(HS_SCCH_TDD128_r6 element, int atIndex)
		    {
			super.setElement(element, atIndex);
		    }
		    
		    /**
		     * Get an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized HS_SCCH_TDD128_r6 get(int atIndex)
		    {
			return (HS_SCCH_TDD128_r6)super.getElement(atIndex);
		    }
		    
		    /**
		     * Insert an Element into the SEQUENCE OF/SET OF.
		     */
		    public synchronized void insert(HS_SCCH_TDD128_r6 element, int atIndex)
		    {
			super.insertElement(element, atIndex);
		    }
		    
		    /**
		     * Remove an Element from the SEQUENCE OF/SET OF.
		     */
		    public synchronized void remove(HS_SCCH_TDD128_r6 element)
		    {
			super.removeElement(element);
		    }
		    
		    /**
		     * Create an instance of  SEQUENCE OF/SET OF.
		     */
		    public AbstractData createInstance()
		    {
			return (AbstractData)new HS_SCCH_TDD128_r6();
		    }
		    
		    /**
		     * Initialize the type descriptor.
		     */
		    private static final ContainerInfo c_typeinfo = new ContainerInfo (
			new Tags (
			    new short[] {
				(short)0x8007
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$HS_SCCH_SetConfiguration"
			),
			new QName (
			    "builtin",
			    "SEQUENCE OF"
			),
			12314,
			new SizeConstraint (
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    )
			),
			new Bounds (
			    new java.lang.Long(1),
			    new java.lang.Long(4)
			),
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_SCCH_TDD128_r6"
			    )
			)
		    );
		    
		    /**
		     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_SetConfiguration object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for HS_SCCH_SetConfiguration

		/**
		 * Initialize the type descriptor.
		 */
		private static final SequenceInfo c_typeinfo = new SequenceInfo (
		    new Tags (
			new short[] {
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128"
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
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(-7), 
						new com.oss.asn1.INTEGER(8),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-7),
					    new java.lang.Long(8)
					),
					null
				    )
				),
				"nack-ack-power-offset",
				0,
				2,
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
					    "com.oss.asn1",
					    "INTEGER"
					),
					new QName (
					    "builtin",
					    "INTEGER"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new com.oss.asn1.INTEGER(-120), 
						new com.oss.asn1.INTEGER(-58),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-120),
					    new java.lang.Long(-58)
					),
					null
				    )
				),
				"power-level-HSSICH",
				1,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$Tpc_step_size"
				    )
				),
				"tpc-step-size",
				2,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8003
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Bler_Target"
					),
					new QName (
					    "InformationElements",
					    "Bler-Target"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Bler_Target(-63), 
						new Bler_Target(0),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(-63),
					    new java.lang.Long(0)
					),
					null
				    )
				),
				"bler-target",
				3,
				2,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$HS_SCCH_tpc_step_size"
				    )
				),
				"hS-SCCH-tpc-step-size",
				4,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8005
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "PowerControlGAP"
					),
					new QName (
					    "InformationElements",
					    "PowerControlGAP"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new PowerControlGAP(0), 
						new PowerControlGAP(255),
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
				"powerControlGAP",
				5,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8006
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
				"pathlossCompensationSwitch",
				6,
				3,
				null
			    ),
			    new SequenceFieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128$HS_SCCH_SetConfiguration"
				    )
				),
				"hS-SCCH-SetConfiguration",
				7,
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
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8002, 2)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8003, 3)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    ),
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8007, 7)
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
		    case tdd768_chosen:
			return new Tdd768();
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd"
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
				    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd384"
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
				    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd768"
				)
			    ),
			    "tdd768",
			    1,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r9$ModeSpecificInfo$Tdd$Tdd128"
				)
			    ),
			    "tdd128",
			    2,
			    2
			)
		    }
		),
		0,
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_SCCH_Info_r9$ModeSpecificInfo"
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
				"HS_SCCH_Info_r9$ModeSpecificInfo$Fdd"
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
				"HS_SCCH_Info_r9$ModeSpecificInfo$Tdd"
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
	    "HS_SCCH_Info_r9"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-Info-r9"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_Info_r9$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_Info_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_Info_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_Info_r9
