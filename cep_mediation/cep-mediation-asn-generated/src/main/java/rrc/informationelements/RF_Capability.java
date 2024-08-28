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
 * Define the ASN1 Type RF_Capability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class RF_Capability extends Sequence {
    
    /**
     * The default constructor.
     */
    public RF_Capability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RF_Capability(FddRF_Capability fddRF_Capability, 
		    TddRF_Capability tddRF_Capability)
    {
	setFddRF_Capability(fddRF_Capability);
	setTddRF_Capability(tddRF_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddRF_Capability();
	mComponents[1] = new TddRF_Capability();
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
		return new FddRF_Capability();
	    case 1:
		return new TddRF_Capability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fddRF_Capability"
    public FddRF_Capability getFddRF_Capability()
    {
	return (FddRF_Capability)mComponents[0];
    }
    
    public void setFddRF_Capability(FddRF_Capability fddRF_Capability)
    {
	mComponents[0] = fddRF_Capability;
    }
    
    public boolean hasFddRF_Capability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFddRF_Capability()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type FddRF_Capability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FddRF_Capability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FddRF_Capability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FddRF_Capability(UE_PowerClass ue_PowerClass, 
			TxRxFrequencySeparation txRxFrequencySeparation)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setTxRxFrequencySeparation(txRxFrequencySeparation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UE_PowerClass();
	    mComponents[1] = TxRxFrequencySeparation.default_TxRx_separation;
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
		    return new UE_PowerClass();
		case 1:
		    return TxRxFrequencySeparation.default_TxRx_separation;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public UE_PowerClass getUe_PowerClass()
	{
	    return (UE_PowerClass)mComponents[0];
	}
	
	public void setUe_PowerClass(UE_PowerClass ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "txRxFrequencySeparation"
	public TxRxFrequencySeparation getTxRxFrequencySeparation()
	{
	    return (TxRxFrequencySeparation)mComponents[1];
	}
	
	public void setTxRxFrequencySeparation(TxRxFrequencySeparation txRxFrequencySeparation)
	{
	    mComponents[1] = txRxFrequencySeparation;
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
		"RF_Capability$FddRF_Capability"
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
				    "UE_PowerClass"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClass"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new UE_PowerClass(1), 
					new UE_PowerClass(4),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(4)
				),
				null
			    )
			),
			"ue-PowerClass",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TxRxFrequencySeparation"
				),
				new QName (
				    "InformationElements",
				    "TxRxFrequencySeparation"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "default-TxRx-separation",
					    0
					),
					new MemberListElement (
					    "spare2",
					    1
					),
					new MemberListElement (
					    "spare1",
					    2
					)
				    }
				),
				0,
				TxRxFrequencySeparation.default_TxRx_separation
			    )
			),
			"txRxFrequencySeparation",
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
	 * Get the type descriptor (TypeInfo) of 'this' FddRF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FddRF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FddRF_Capability

    // Methods for field "tddRF_Capability"
    public TddRF_Capability getTddRF_Capability()
    {
	return (TddRF_Capability)mComponents[1];
    }
    
    public void setTddRF_Capability(TddRF_Capability tddRF_Capability)
    {
	mComponents[1] = tddRF_Capability;
    }
    
    public boolean hasTddRF_Capability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTddRF_Capability()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type TddRF_Capability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class TddRF_Capability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public TddRF_Capability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public TddRF_Capability(UE_PowerClass ue_PowerClass, 
			RadioFrequencyBandTDDList radioFrequencyTDDBandList, 
			ChipRateCapability chipRateCapability)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setRadioFrequencyTDDBandList(radioFrequencyTDDBandList);
	    setChipRateCapability(chipRateCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UE_PowerClass();
	    mComponents[1] = RadioFrequencyBandTDDList.a;
	    mComponents[2] = ChipRateCapability.mcps3_84;
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
		    return new UE_PowerClass();
		case 1:
		    return RadioFrequencyBandTDDList.a;
		case 2:
		    return ChipRateCapability.mcps3_84;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public UE_PowerClass getUe_PowerClass()
	{
	    return (UE_PowerClass)mComponents[0];
	}
	
	public void setUe_PowerClass(UE_PowerClass ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "radioFrequencyTDDBandList"
	public RadioFrequencyBandTDDList getRadioFrequencyTDDBandList()
	{
	    return (RadioFrequencyBandTDDList)mComponents[1];
	}
	
	public void setRadioFrequencyTDDBandList(RadioFrequencyBandTDDList radioFrequencyTDDBandList)
	{
	    mComponents[1] = radioFrequencyTDDBandList;
	}
	
	
	// Methods for field "chipRateCapability"
	public ChipRateCapability getChipRateCapability()
	{
	    return (ChipRateCapability)mComponents[2];
	}
	
	public void setChipRateCapability(ChipRateCapability chipRateCapability)
	{
	    mComponents[2] = chipRateCapability;
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
		"RF_Capability$TddRF_Capability"
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
				    "UE_PowerClass"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClass"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new UE_PowerClass(1), 
					new UE_PowerClass(4),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(4)
				),
				null
			    )
			),
			"ue-PowerClass",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "RadioFrequencyBandTDDList"
				),
				new QName (
				    "InformationElements",
				    "RadioFrequencyBandTDDList"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "a",
					    0
					),
					new MemberListElement (
					    "b",
					    1
					),
					new MemberListElement (
					    "c",
					    2
					),
					new MemberListElement (
					    "ab",
					    3
					),
					new MemberListElement (
					    "ac",
					    4
					),
					new MemberListElement (
					    "bc",
					    5
					),
					new MemberListElement (
					    "abc",
					    6
					),
					new MemberListElement (
					    "spare",
					    7
					)
				    }
				),
				0,
				RadioFrequencyBandTDDList.a
			    )
			),
			"radioFrequencyTDDBandList",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ChipRateCapability"
				),
				new QName (
				    "InformationElements",
				    "ChipRateCapability"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "mcps3-84",
					    0
					),
					new MemberListElement (
					    "mcps1-28",
					    1
					)
				    }
				),
				0,
				ChipRateCapability.mcps3_84
			    )
			),
			"chipRateCapability",
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
			    new TagDecoderElement((short)0x8001, 1)
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
	 * Get the type descriptor (TypeInfo) of 'this' TddRF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TddRF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TddRF_Capability

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
	    "RF_Capability"
	),
	new QName (
	    "InformationElements",
	    "RF-Capability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_Capability$FddRF_Capability"
			)
		    ),
		    "fddRF-Capability",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "RF_Capability$TddRF_Capability"
			)
		    ),
		    "tddRF-Capability",
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
     * Get the type descriptor (TypeInfo) of 'this' RF_Capability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RF_Capability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RF_Capability
