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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type RF_Capability_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class RF_Capability_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public RF_Capability_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RF_Capability_r4(FddRF_Capability fddRF_Capability, 
		    Tdd384_RF_Capability tdd384_RF_Capability, 
		    Tdd128_RF_Capability tdd128_RF_Capability)
    {
	setFddRF_Capability(fddRF_Capability);
	setTdd384_RF_Capability(tdd384_RF_Capability);
	setTdd128_RF_Capability(tdd128_RF_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddRF_Capability();
	mComponents[1] = new Tdd384_RF_Capability();
	mComponents[2] = new Tdd128_RF_Capability();
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
		return new FddRF_Capability();
	    case 1:
		return new Tdd384_RF_Capability();
	    case 2:
		return new Tdd128_RF_Capability();
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
     * Define the ASN1 Type FddRF_Capability from ASN1 Module Internode_definitions.
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
	public FddRF_Capability(rrc.informationelements.UE_PowerClassExt ue_PowerClass, 
			rrc.informationelements.TxRxFrequencySeparation txRxFrequencySeparation)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setTxRxFrequencySeparation(txRxFrequencySeparation);
	}
	
	public void initComponents()
	{
	    mComponents[0] = rrc.informationelements.UE_PowerClassExt.class1;
	    mComponents[1] = rrc.informationelements.TxRxFrequencySeparation.default_TxRx_separation;
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
		    return rrc.informationelements.UE_PowerClassExt.class1;
		case 1:
		    return rrc.informationelements.TxRxFrequencySeparation.default_TxRx_separation;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public rrc.informationelements.UE_PowerClassExt getUe_PowerClass()
	{
	    return (rrc.informationelements.UE_PowerClassExt)mComponents[0];
	}
	
	public void setUe_PowerClass(rrc.informationelements.UE_PowerClassExt ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "txRxFrequencySeparation"
	public rrc.informationelements.TxRxFrequencySeparation getTxRxFrequencySeparation()
	{
	    return (rrc.informationelements.TxRxFrequencySeparation)mComponents[1];
	}
	
	public void setTxRxFrequencySeparation(rrc.informationelements.TxRxFrequencySeparation txRxFrequencySeparation)
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
		"rrc.internode_definitions",
		"RF_Capability_r4$FddRF_Capability"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UE_PowerClassExt"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClassExt"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "class1",
					    0
					),
					new MemberListElement (
					    "class2",
					    1
					),
					new MemberListElement (
					    "class3",
					    2
					),
					new MemberListElement (
					    "class4",
					    3
					),
					new MemberListElement (
					    "spare4",
					    4
					),
					new MemberListElement (
					    "spare3",
					    5
					),
					new MemberListElement (
					    "spare2",
					    6
					),
					new MemberListElement (
					    "spare1",
					    7
					)
				    }
				),
				0,
				rrc.informationelements.UE_PowerClassExt.class1
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
				rrc.informationelements.TxRxFrequencySeparation.default_TxRx_separation
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

    // Methods for field "tdd384_RF_Capability"
    public Tdd384_RF_Capability getTdd384_RF_Capability()
    {
	return (Tdd384_RF_Capability)mComponents[1];
    }
    
    public void setTdd384_RF_Capability(Tdd384_RF_Capability tdd384_RF_Capability)
    {
	mComponents[1] = tdd384_RF_Capability;
    }
    
    public boolean hasTdd384_RF_Capability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd384_RF_Capability()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_RF_Capability from ASN1 Module Internode_definitions.
     * @see Sequence
     */
    public static class Tdd384_RF_Capability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_RF_Capability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd384_RF_Capability(rrc.informationelements.UE_PowerClassExt ue_PowerClass, 
			rrc.informationelements.RadioFrequencyBandTDDList radioFrequencyBandTDDList, 
			rrc.informationelements.ChipRateCapability chipRateCapability)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setRadioFrequencyBandTDDList(radioFrequencyBandTDDList);
	    setChipRateCapability(chipRateCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = rrc.informationelements.UE_PowerClassExt.class1;
	    mComponents[1] = rrc.informationelements.RadioFrequencyBandTDDList.a;
	    mComponents[2] = rrc.informationelements.ChipRateCapability.mcps3_84;
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
		    return rrc.informationelements.UE_PowerClassExt.class1;
		case 1:
		    return rrc.informationelements.RadioFrequencyBandTDDList.a;
		case 2:
		    return rrc.informationelements.ChipRateCapability.mcps3_84;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public rrc.informationelements.UE_PowerClassExt getUe_PowerClass()
	{
	    return (rrc.informationelements.UE_PowerClassExt)mComponents[0];
	}
	
	public void setUe_PowerClass(rrc.informationelements.UE_PowerClassExt ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "radioFrequencyBandTDDList"
	public rrc.informationelements.RadioFrequencyBandTDDList getRadioFrequencyBandTDDList()
	{
	    return (rrc.informationelements.RadioFrequencyBandTDDList)mComponents[1];
	}
	
	public void setRadioFrequencyBandTDDList(rrc.informationelements.RadioFrequencyBandTDDList radioFrequencyBandTDDList)
	{
	    mComponents[1] = radioFrequencyBandTDDList;
	}
	
	
	// Methods for field "chipRateCapability"
	public rrc.informationelements.ChipRateCapability getChipRateCapability()
	{
	    return (rrc.informationelements.ChipRateCapability)mComponents[2];
	}
	
	public void setChipRateCapability(rrc.informationelements.ChipRateCapability chipRateCapability)
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
		"rrc.internode_definitions",
		"RF_Capability_r4$Tdd384_RF_Capability"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UE_PowerClassExt"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClassExt"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "class1",
					    0
					),
					new MemberListElement (
					    "class2",
					    1
					),
					new MemberListElement (
					    "class3",
					    2
					),
					new MemberListElement (
					    "class4",
					    3
					),
					new MemberListElement (
					    "spare4",
					    4
					),
					new MemberListElement (
					    "spare3",
					    5
					),
					new MemberListElement (
					    "spare2",
					    6
					),
					new MemberListElement (
					    "spare1",
					    7
					)
				    }
				),
				0,
				rrc.informationelements.UE_PowerClassExt.class1
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
				rrc.informationelements.RadioFrequencyBandTDDList.a
			    )
			),
			"radioFrequencyBandTDDList",
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
				rrc.informationelements.ChipRateCapability.mcps3_84
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_RF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_RF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_RF_Capability

    // Methods for field "tdd128_RF_Capability"
    public Tdd128_RF_Capability getTdd128_RF_Capability()
    {
	return (Tdd128_RF_Capability)mComponents[2];
    }
    
    public void setTdd128_RF_Capability(Tdd128_RF_Capability tdd128_RF_Capability)
    {
	mComponents[2] = tdd128_RF_Capability;
    }
    
    public boolean hasTdd128_RF_Capability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd128_RF_Capability()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_RF_Capability from ASN1 Module Internode_definitions.
     * @see Sequence
     */
    public static class Tdd128_RF_Capability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_RF_Capability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd128_RF_Capability(rrc.informationelements.UE_PowerClassExt ue_PowerClass, 
			rrc.informationelements.RadioFrequencyBandTDDList radioFrequencyBandTDDList, 
			rrc.informationelements.ChipRateCapability chipRateCapability)
	{
	    setUe_PowerClass(ue_PowerClass);
	    setRadioFrequencyBandTDDList(radioFrequencyBandTDDList);
	    setChipRateCapability(chipRateCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = rrc.informationelements.UE_PowerClassExt.class1;
	    mComponents[1] = rrc.informationelements.RadioFrequencyBandTDDList.a;
	    mComponents[2] = rrc.informationelements.ChipRateCapability.mcps3_84;
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
		    return rrc.informationelements.UE_PowerClassExt.class1;
		case 1:
		    return rrc.informationelements.RadioFrequencyBandTDDList.a;
		case 2:
		    return rrc.informationelements.ChipRateCapability.mcps3_84;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ue_PowerClass"
	public rrc.informationelements.UE_PowerClassExt getUe_PowerClass()
	{
	    return (rrc.informationelements.UE_PowerClassExt)mComponents[0];
	}
	
	public void setUe_PowerClass(rrc.informationelements.UE_PowerClassExt ue_PowerClass)
	{
	    mComponents[0] = ue_PowerClass;
	}
	
	
	// Methods for field "radioFrequencyBandTDDList"
	public rrc.informationelements.RadioFrequencyBandTDDList getRadioFrequencyBandTDDList()
	{
	    return (rrc.informationelements.RadioFrequencyBandTDDList)mComponents[1];
	}
	
	public void setRadioFrequencyBandTDDList(rrc.informationelements.RadioFrequencyBandTDDList radioFrequencyBandTDDList)
	{
	    mComponents[1] = radioFrequencyBandTDDList;
	}
	
	
	// Methods for field "chipRateCapability"
	public rrc.informationelements.ChipRateCapability getChipRateCapability()
	{
	    return (rrc.informationelements.ChipRateCapability)mComponents[2];
	}
	
	public void setChipRateCapability(rrc.informationelements.ChipRateCapability chipRateCapability)
	{
	    mComponents[2] = chipRateCapability;
	}
	
	
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
		"rrc.internode_definitions",
		"RF_Capability_r4$Tdd128_RF_Capability"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UE_PowerClassExt"
				),
				new QName (
				    "InformationElements",
				    "UE-PowerClassExt"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "class1",
					    0
					),
					new MemberListElement (
					    "class2",
					    1
					),
					new MemberListElement (
					    "class3",
					    2
					),
					new MemberListElement (
					    "class4",
					    3
					),
					new MemberListElement (
					    "spare4",
					    4
					),
					new MemberListElement (
					    "spare3",
					    5
					),
					new MemberListElement (
					    "spare2",
					    6
					),
					new MemberListElement (
					    "spare1",
					    7
					)
				    }
				),
				0,
				rrc.informationelements.UE_PowerClassExt.class1
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
				rrc.informationelements.RadioFrequencyBandTDDList.a
			    )
			),
			"radioFrequencyBandTDDList",
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
				rrc.informationelements.ChipRateCapability.mcps3_84
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_RF_Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_RF_Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_RF_Capability

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
	    "rrc.internode_definitions",
	    "RF_Capability_r4"
	),
	new QName (
	    "Internode-definitions",
	    "RF-Capability-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "RF_Capability_r4$FddRF_Capability"
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
			    "rrc.internode_definitions",
			    "RF_Capability_r4$Tdd384_RF_Capability"
			)
		    ),
		    "tdd384-RF-Capability",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "RF_Capability_r4$Tdd128_RF_Capability"
			)
		    ),
		    "tdd128-RF-Capability",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' RF_Capability_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RF_Capability_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RF_Capability_r4
