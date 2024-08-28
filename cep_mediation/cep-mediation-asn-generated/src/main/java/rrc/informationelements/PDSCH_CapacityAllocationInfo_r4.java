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
 * Define the ASN1 Type PDSCH_CapacityAllocationInfo_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDSCH_CapacityAllocationInfo_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDSCH_CapacityAllocationInfo_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDSCH_CapacityAllocationInfo_r4(AllocationPeriodInfo pdsch_AllocationPeriodInfo, 
		    Configuration configuration)
    {
	setPdsch_AllocationPeriodInfo(pdsch_AllocationPeriodInfo);
	setConfiguration(configuration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AllocationPeriodInfo();
	mComponents[1] = new Configuration();
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
		return new AllocationPeriodInfo();
	    case 1:
		return new Configuration();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pdsch_AllocationPeriodInfo"
    public AllocationPeriodInfo getPdsch_AllocationPeriodInfo()
    {
	return (AllocationPeriodInfo)mComponents[0];
    }
    
    public void setPdsch_AllocationPeriodInfo(AllocationPeriodInfo pdsch_AllocationPeriodInfo)
    {
	mComponents[0] = pdsch_AllocationPeriodInfo;
    }
    
    
    // Methods for field "configuration"
    public Configuration getConfiguration()
    {
	return (Configuration)mComponents[1];
    }
    
    public void setConfiguration(Configuration configuration)
    {
	mComponents[1] = configuration;
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
			    PDSCH_Identity pdsch_Identity)
	    {
		setTfcs_ID(tfcs_ID);
		setPdsch_Identity(pdsch_Identity);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Old_Configuration(PDSCH_Identity pdsch_Identity)
	    {
		setPdsch_Identity(pdsch_Identity);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TFCS_IdentityPlain();
		mComponents[1] = new PDSCH_Identity();
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
			return new PDSCH_Identity();
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
	    
	    
	    // Methods for field "pdsch_Identity"
	    public PDSCH_Identity getPdsch_Identity()
	    {
		return (PDSCH_Identity)mComponents[1];
	    }
	    
	    public void setPdsch_Identity(PDSCH_Identity pdsch_Identity)
	    {
		mComponents[1] = pdsch_Identity;
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
		    "PDSCH_CapacityAllocationInfo_r4$Configuration$Old_Configuration"
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
					"PDSCH_Identity"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-Identity"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PDSCH_Identity(1), 
					    new PDSCH_Identity(64),
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
			    "pdsch-Identity",
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
	    public New_Configuration(PDSCH_Info_r4 pdsch_Info, 
			    PDSCH_Identity pdsch_Identity, 
			    PDSCH_PowerControlInfo pdsch_PowerControlInfo)
	    {
		setPdsch_Info(pdsch_Info);
		setPdsch_Identity(pdsch_Identity);
		setPdsch_PowerControlInfo(pdsch_PowerControlInfo);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public New_Configuration(PDSCH_Info_r4 pdsch_Info)
	    {
		setPdsch_Info(pdsch_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PDSCH_Info_r4();
		mComponents[1] = new PDSCH_Identity();
		mComponents[2] = new PDSCH_PowerControlInfo();
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
			return new PDSCH_Info_r4();
		    case 1:
			return new PDSCH_Identity();
		    case 2:
			return new PDSCH_PowerControlInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "pdsch_Info"
	    public PDSCH_Info_r4 getPdsch_Info()
	    {
		return (PDSCH_Info_r4)mComponents[0];
	    }
	    
	    public void setPdsch_Info(PDSCH_Info_r4 pdsch_Info)
	    {
		mComponents[0] = pdsch_Info;
	    }
	    
	    
	    // Methods for field "pdsch_Identity"
	    public PDSCH_Identity getPdsch_Identity()
	    {
		return (PDSCH_Identity)mComponents[1];
	    }
	    
	    public void setPdsch_Identity(PDSCH_Identity pdsch_Identity)
	    {
		mComponents[1] = pdsch_Identity;
	    }
	    
	    public boolean hasPdsch_Identity()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deletePdsch_Identity()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "pdsch_PowerControlInfo"
	    public PDSCH_PowerControlInfo getPdsch_PowerControlInfo()
	    {
		return (PDSCH_PowerControlInfo)mComponents[2];
	    }
	    
	    public void setPdsch_PowerControlInfo(PDSCH_PowerControlInfo pdsch_PowerControlInfo)
	    {
		mComponents[2] = pdsch_PowerControlInfo;
	    }
	    
	    public boolean hasPdsch_PowerControlInfo()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePdsch_PowerControlInfo()
	    {
		setComponentAbsent(2);
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
		    "PDSCH_CapacityAllocationInfo_r4$Configuration$New_Configuration"
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
					"PDSCH_Info_r4"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-Info-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_Info_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_Info_r4"
					)
				    ),
				    0
				)
			    ),
			    "pdsch-Info",
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
					"PDSCH_Identity"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-Identity"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PDSCH_Identity(1), 
					    new PDSCH_Identity(64),
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
			    "pdsch-Identity",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PDSCH_PowerControlInfo"
				    ),
				    new QName (
					"InformationElements",
					"PDSCH-PowerControlInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_PowerControlInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "PDSCH_PowerControlInfo"
					)
				    ),
				    0
				)
			    ),
			    "pdsch-PowerControlInfo",
			    2,
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PDSCH_CapacityAllocationInfo_r4$Configuration"
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
				"PDSCH_CapacityAllocationInfo_r4$Configuration$Old_Configuration"
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
				"PDSCH_CapacityAllocationInfo_r4$Configuration$New_Configuration"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "PDSCH_CapacityAllocationInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "PDSCH-CapacityAllocationInfo-r4"
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
		    "pdsch-AllocationPeriodInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PDSCH_CapacityAllocationInfo_r4$Configuration"
			)
		    ),
		    "configuration",
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
     * Get the type descriptor (TypeInfo) of 'this' PDSCH_CapacityAllocationInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDSCH_CapacityAllocationInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDSCH_CapacityAllocationInfo_r4
