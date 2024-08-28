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
 * Define the ASN1 Type PUSCH_CapacityAllocationInfo_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PUSCH_CapacityAllocationInfo_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCH_CapacityAllocationInfo_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCH_CapacityAllocationInfo_r7(Pusch_Allocation pusch_Allocation)
    {
	setPusch_Allocation(pusch_Allocation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Pusch_Allocation();
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
		return new Pusch_Allocation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pusch_Allocation"
    public Pusch_Allocation getPusch_Allocation()
    {
	return (Pusch_Allocation)mComponents[0];
    }
    
    public void setPusch_Allocation(Pusch_Allocation pusch_Allocation)
    {
	mComponents[0] = pusch_Allocation;
    }
    
    
    
    /**
     * Define the ASN1 Type Pusch_Allocation from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Pusch_Allocation extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Pusch_Allocation()
	{
	}
	
	public static final  int  pusch_AllocationPending_chosen = 1;
	public static final  int  pusch_AllocationAssignment_chosen = 2;
	
	// Methods for field "pusch_AllocationPending"
	public static Pusch_Allocation createPusch_AllocationWithPusch_AllocationPending(Null pusch_AllocationPending)
	{
	    Pusch_Allocation __object = new Pusch_Allocation();

	    __object.setPusch_AllocationPending(pusch_AllocationPending);
	    return __object;
	}
	
	public boolean hasPusch_AllocationPending()
	{
	    return getChosenFlag() == pusch_AllocationPending_chosen;
	}
	
	public void setPusch_AllocationPending(Null pusch_AllocationPending)
	{
	    setChosenValue(pusch_AllocationPending);
	    setChosenFlag(pusch_AllocationPending_chosen);
	}
	
	
	// Methods for field "pusch_AllocationAssignment"
	public static Pusch_Allocation createPusch_AllocationWithPusch_AllocationAssignment(Pusch_AllocationAssignment pusch_AllocationAssignment)
	{
	    Pusch_Allocation __object = new Pusch_Allocation();

	    __object.setPusch_AllocationAssignment(pusch_AllocationAssignment);
	    return __object;
	}
	
	public boolean hasPusch_AllocationAssignment()
	{
	    return getChosenFlag() == pusch_AllocationAssignment_chosen;
	}
	
	public void setPusch_AllocationAssignment(Pusch_AllocationAssignment pusch_AllocationAssignment)
	{
	    setChosenValue(pusch_AllocationAssignment);
	    setChosenFlag(pusch_AllocationAssignment_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Pusch_AllocationAssignment from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Pusch_AllocationAssignment extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Pusch_AllocationAssignment()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Pusch_AllocationAssignment(AllocationPeriodInfo pusch_AllocationPeriodInfo, 
			    PUSCH_PowerControlInfo_r7 pusch_PowerControlInfo, 
			    Configuration configuration)
	    {
		setPusch_AllocationPeriodInfo(pusch_AllocationPeriodInfo);
		setPusch_PowerControlInfo(pusch_PowerControlInfo);
		setConfiguration(configuration);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Pusch_AllocationAssignment(AllocationPeriodInfo pusch_AllocationPeriodInfo, 
			    Configuration configuration)
	    {
		setPusch_AllocationPeriodInfo(pusch_AllocationPeriodInfo);
		setConfiguration(configuration);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new AllocationPeriodInfo();
		mComponents[1] = new PUSCH_PowerControlInfo_r7();
		mComponents[2] = new Configuration();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[3];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new AllocationPeriodInfo();
		    case 1:
			return new PUSCH_PowerControlInfo_r7();
		    case 2:
			return new Configuration();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pusch_AllocationPeriodInfo"
	    public AllocationPeriodInfo getPusch_AllocationPeriodInfo()
	    {
		return (AllocationPeriodInfo)mComponents[0];
	    }
	    
	    public void setPusch_AllocationPeriodInfo(AllocationPeriodInfo pusch_AllocationPeriodInfo)
	    {
		mComponents[0] = pusch_AllocationPeriodInfo;
	    }
	    
	    
	    // Methods for field "pusch_PowerControlInfo"
	    public PUSCH_PowerControlInfo_r7 getPusch_PowerControlInfo()
	    {
		return (PUSCH_PowerControlInfo_r7)mComponents[1];
	    }
	    
	    public void setPusch_PowerControlInfo(PUSCH_PowerControlInfo_r7 pusch_PowerControlInfo)
	    {
		mComponents[1] = pusch_PowerControlInfo;
	    }
	    
	    public boolean hasPusch_PowerControlInfo()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePusch_PowerControlInfo()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "configuration"
	    public Configuration getConfiguration()
	    {
		return (Configuration)mComponents[2];
	    }
	    
	    public void setConfiguration(Configuration configuration)
	    {
		mComponents[2] = configuration;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Configuration from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class Configuration extends Choice {
		
		/**
		 * The default constructor.
		 */
		public Configuration()
		{
		}
		
		public static final  int  old_Configuration_chosen = 1;
		public static final  int  new_Configuration_chosen = 2;
		
		// Methods for field "old_Configuration"
		public static Configuration createConfigurationWithOld_Configuration(Old_Configuration old_Configuration)
		{
		    Configuration __object = new Configuration();

		    __object.setOld_Configuration(old_Configuration);
		    return __object;
		}
		
		public boolean hasOld_Configuration()
		{
		    return getChosenFlag() == old_Configuration_chosen;
		}
		
		public void setOld_Configuration(Old_Configuration old_Configuration)
		{
		    setChosenValue(old_Configuration);
		    setChosenFlag(old_Configuration_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type Old_Configuration from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class Old_Configuration extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public Old_Configuration()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public Old_Configuration(TFCS_IdentityPlain tfcs_ID, 
				    PUSCH_Identity pusch_Identity)
		    {
			setTfcs_ID(tfcs_ID);
			setPusch_Identity(pusch_Identity);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public Old_Configuration(PUSCH_Identity pusch_Identity)
		    {
			setPusch_Identity(pusch_Identity);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new TFCS_IdentityPlain();
			mComponents[1] = new PUSCH_Identity();
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
				return new TFCS_IdentityPlain();
			    case 1:
				return new PUSCH_Identity();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    // Default Values
		    public static final TFCS_IdentityPlain tfcs_ID__default = 
			new TFCS_IdentityPlain(1);
		    
		    // Methods for field "tfcs_ID"
		    public TFCS_IdentityPlain getTfcs_ID()
		    {
			if (hasTfcs_ID())
			    return (TFCS_IdentityPlain)mComponents[0];
			else
			    return (TFCS_IdentityPlain)tfcs_ID__default.clone();
		    }
		    
		    public void setTfcs_ID(TFCS_IdentityPlain tfcs_ID)
		    {
			mComponents[0] = tfcs_ID;
		    }
		    
		    public void setTfcs_IDToDefault()
		    {
			setTfcs_ID(tfcs_ID__default);
		    }
		    
		    public boolean hasDefaultTfcs_ID()
		    {
			return true;
		    }
		    
		    public boolean hasTfcs_ID()
		    {
			return componentIsPresent(0);
		    }
		    
		    public void deleteTfcs_ID()
		    {
			setComponentAbsent(0);
		    }
		    
		    
		    // Methods for field "pusch_Identity"
		    public PUSCH_Identity getPusch_Identity()
		    {
			return (PUSCH_Identity)mComponents[1];
		    }
		    
		    public void setPusch_Identity(PUSCH_Identity pusch_Identity)
		    {
			mComponents[1] = pusch_Identity;
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
			    "PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration$Old_Configuration"
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
						"TFCS_IdentityPlain"
					    ),
					    new QName (
						"InformationElements",
						"TFCS-IdentityPlain"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new TFCS_IdentityPlain(1), 
						    new TFCS_IdentityPlain(8),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(8)
					    ),
					    null
					)
				    ),
				    "tfcs-ID",
				    0,
				    3,
				    tfcs_ID__default
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
						"PUSCH_Identity"
					    ),
					    new QName (
						"InformationElements",
						"PUSCH-Identity"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new PUSCH_Identity(1), 
						    new PUSCH_Identity(64),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(64)
					    ),
					    null
					)
				    ),
				    "pusch-Identity",
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
		     * Get the type descriptor (TypeInfo) of 'this' Old_Configuration object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' Old_Configuration object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for Old_Configuration

		// Methods for field "new_Configuration"
		public static Configuration createConfigurationWithNew_Configuration(New_Configuration new_Configuration)
		{
		    Configuration __object = new Configuration();

		    __object.setNew_Configuration(new_Configuration);
		    return __object;
		}
		
		public boolean hasNew_Configuration()
		{
		    return getChosenFlag() == new_Configuration_chosen;
		}
		
		public void setNew_Configuration(New_Configuration new_Configuration)
		{
		    setChosenValue(new_Configuration);
		    setChosenFlag(new_Configuration_chosen);
		}
		
		
		
		/**
		 * Define the ASN1 Type New_Configuration from ASN1 Module InformationElements.
		 * @see Sequence
		 */
		public static class New_Configuration extends Sequence {
		    
		    /**
		     * The default constructor.
		     */
		    public New_Configuration()
		    {
		    }
		    
		    /**
		     * Construct with AbstractData components.
		     */
		    public New_Configuration(PUSCH_Info_VHCR pusch_Info, 
				    PUSCH_Identity pusch_Identity)
		    {
			setPusch_Info(pusch_Info);
			setPusch_Identity(pusch_Identity);
		    }
		    
		    /**
		     * Construct with required components.
		     */
		    public New_Configuration(PUSCH_Info_VHCR pusch_Info)
		    {
			setPusch_Info(pusch_Info);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new PUSCH_Info_VHCR();
			mComponents[1] = new PUSCH_Identity();
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
				return new PUSCH_Info_VHCR();
			    case 1:
				return new PUSCH_Identity();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "pusch_Info"
		    public PUSCH_Info_VHCR getPusch_Info()
		    {
			return (PUSCH_Info_VHCR)mComponents[0];
		    }
		    
		    public void setPusch_Info(PUSCH_Info_VHCR pusch_Info)
		    {
			mComponents[0] = pusch_Info;
		    }
		    
		    
		    // Methods for field "pusch_Identity"
		    public PUSCH_Identity getPusch_Identity()
		    {
			return (PUSCH_Identity)mComponents[1];
		    }
		    
		    public void setPusch_Identity(PUSCH_Identity pusch_Identity)
		    {
			mComponents[1] = pusch_Identity;
		    }
		    
		    public boolean hasPusch_Identity()
		    {
			return componentIsPresent(1);
		    }
		    
		    public void deletePusch_Identity()
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
			    "PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration$New_Configuration"
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
						"PUSCH_Info_VHCR"
					    ),
					    new QName (
						"InformationElements",
						"PUSCH-Info-VHCR"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "PUSCH_Info_VHCR"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "PUSCH_Info_VHCR"
						)
					    ),
					    0
					)
				    ),
				    "pusch-Info",
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
						"PUSCH_Identity"
					    ),
					    new QName (
						"InformationElements",
						"PUSCH-Identity"
					    ),
					    12314,
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new PUSCH_Identity(1), 
						    new PUSCH_Identity(64),
						    0
						)
					    ),
					    new Bounds (
						new java.lang.Long(1),
						new java.lang.Long(64)
					    ),
					    null
					)
				    ),
				    "pusch-Identity",
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
		     * Get the type descriptor (TypeInfo) of 'this' New_Configuration object.
		     */
		    public TypeInfo getTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		    /**
		     * Get the static type descriptor (TypeInfo) of 'this' New_Configuration object.
		     */
		    public static TypeInfo getStaticTypeInfo()
		    {
			return c_typeinfo;
		    }
		    
		} // End class definition for New_Configuration

		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case old_Configuration_chosen:
			    return new Old_Configuration();
			case new_Configuration_chosen:
			    return new New_Configuration();
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
			    (short)0x8002
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration"
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
					"PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration$Old_Configuration"
				    )
				),
				"old-Configuration",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration$New_Configuration"
				    )
				),
				"new-Configuration",
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
		 * Get the type descriptor (TypeInfo) of 'this' Configuration object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Configuration object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Configuration

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
		    "PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment"
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
					"AllocationPeriodInfo"
				    ),
				    new QName (
					"InformationElements",
					"AllocationPeriodInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "AllocationPeriodInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "AllocationPeriodInfo"
					)
				    ),
				    0
				)
			    ),
			    "pusch-AllocationPeriodInfo",
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
					"PUSCH_PowerControlInfo_r7"
				    ),
				    new QName (
					"InformationElements",
					"PUSCH-PowerControlInfo-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PUSCH_PowerControlInfo_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PUSCH_PowerControlInfo_r7"
					)
				    ),
				    0
				)
			    ),
			    "pusch-PowerControlInfo",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment$Configuration"
				)
			    ),
			    "configuration",
			    2,
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
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Pusch_AllocationAssignment object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Pusch_AllocationAssignment object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Pusch_AllocationAssignment

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case pusch_AllocationPending_chosen:
		    return new Null();
		case pusch_AllocationAssignment_chosen:
		    return new Pusch_AllocationAssignment();
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
		"PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation"
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
			"pusch-AllocationPending",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation$Pusch_AllocationAssignment"
			    )
			),
			"pusch-AllocationAssignment",
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
	 * Get the type descriptor (TypeInfo) of 'this' Pusch_Allocation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Pusch_Allocation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Pusch_Allocation

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
	    "PUSCH_CapacityAllocationInfo_r7"
	),
	new QName (
	    "InformationElements",
	    "PUSCH-CapacityAllocationInfo-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PUSCH_CapacityAllocationInfo_r7$Pusch_Allocation"
			)
		    ),
		    "pusch-Allocation",
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCH_CapacityAllocationInfo_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCH_CapacityAllocationInfo_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCH_CapacityAllocationInfo_r7
