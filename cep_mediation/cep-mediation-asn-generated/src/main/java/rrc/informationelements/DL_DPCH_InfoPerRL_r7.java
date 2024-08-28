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
 * Define the ASN1 Type DL_DPCH_InfoPerRL_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class DL_DPCH_InfoPerRL_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public DL_DPCH_InfoPerRL_r7()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static DL_DPCH_InfoPerRL_r7 createDL_DPCH_InfoPerRL_r7WithFdd(Fdd fdd)
    {
	DL_DPCH_InfoPerRL_r7 __object = new DL_DPCH_InfoPerRL_r7();

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
	public Fdd(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
			DPCH_FrameOffset dpch_FrameOffset, 
			SecondaryCPICH_Info secondaryCPICH_Info, 
			DL_ChannelisationCodeList dl_ChannelisationCodeList, 
			TPC_CombinationIndex tpc_CombinationIndex, 
			PowerOffsetTPC_pdpdch powerOffsetTPC_pdpdch, 
			ClosedLoopTimingAdjMode closedLoopTimingAdjMode)
	{
	    setPCPICH_UsageForChannelEst(pCPICH_UsageForChannelEst);
	    setDpch_FrameOffset(dpch_FrameOffset);
	    setSecondaryCPICH_Info(secondaryCPICH_Info);
	    setDl_ChannelisationCodeList(dl_ChannelisationCodeList);
	    setTpc_CombinationIndex(tpc_CombinationIndex);
	    setPowerOffsetTPC_pdpdch(powerOffsetTPC_pdpdch);
	    setClosedLoopTimingAdjMode(closedLoopTimingAdjMode);
	}
	
	/**
	 * Construct with required components.
	 */
	public Fdd(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
			DPCH_FrameOffset dpch_FrameOffset, 
			DL_ChannelisationCodeList dl_ChannelisationCodeList, 
			TPC_CombinationIndex tpc_CombinationIndex)
	{
	    setPCPICH_UsageForChannelEst(pCPICH_UsageForChannelEst);
	    setDpch_FrameOffset(dpch_FrameOffset);
	    setDl_ChannelisationCodeList(dl_ChannelisationCodeList);
	    setTpc_CombinationIndex(tpc_CombinationIndex);
	}
	
	public void initComponents()
	{
	    mComponents[0] = PCPICH_UsageForChannelEst.mayBeUsed;
	    mComponents[1] = new DPCH_FrameOffset();
	    mComponents[2] = new SecondaryCPICH_Info();
	    mComponents[3] = new DL_ChannelisationCodeList();
	    mComponents[4] = new TPC_CombinationIndex();
	    mComponents[5] = new PowerOffsetTPC_pdpdch();
	    mComponents[6] = ClosedLoopTimingAdjMode.slot1;
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[7];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return PCPICH_UsageForChannelEst.mayBeUsed;
		case 1:
		    return new DPCH_FrameOffset();
		case 2:
		    return new SecondaryCPICH_Info();
		case 3:
		    return new DL_ChannelisationCodeList();
		case 4:
		    return new TPC_CombinationIndex();
		case 5:
		    return new PowerOffsetTPC_pdpdch();
		case 6:
		    return ClosedLoopTimingAdjMode.slot1;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "pCPICH_UsageForChannelEst"
	public PCPICH_UsageForChannelEst getPCPICH_UsageForChannelEst()
	{
	    return (PCPICH_UsageForChannelEst)mComponents[0];
	}
	
	public void setPCPICH_UsageForChannelEst(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst)
	{
	    mComponents[0] = pCPICH_UsageForChannelEst;
	}
	
	
	// Methods for field "dpch_FrameOffset"
	public DPCH_FrameOffset getDpch_FrameOffset()
	{
	    return (DPCH_FrameOffset)mComponents[1];
	}
	
	public void setDpch_FrameOffset(DPCH_FrameOffset dpch_FrameOffset)
	{
	    mComponents[1] = dpch_FrameOffset;
	}
	
	
	// Methods for field "secondaryCPICH_Info"
	public SecondaryCPICH_Info getSecondaryCPICH_Info()
	{
	    return (SecondaryCPICH_Info)mComponents[2];
	}
	
	public void setSecondaryCPICH_Info(SecondaryCPICH_Info secondaryCPICH_Info)
	{
	    mComponents[2] = secondaryCPICH_Info;
	}
	
	public boolean hasSecondaryCPICH_Info()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteSecondaryCPICH_Info()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "dl_ChannelisationCodeList"
	public DL_ChannelisationCodeList getDl_ChannelisationCodeList()
	{
	    return (DL_ChannelisationCodeList)mComponents[3];
	}
	
	public void setDl_ChannelisationCodeList(DL_ChannelisationCodeList dl_ChannelisationCodeList)
	{
	    mComponents[3] = dl_ChannelisationCodeList;
	}
	
	
	// Methods for field "tpc_CombinationIndex"
	public TPC_CombinationIndex getTpc_CombinationIndex()
	{
	    return (TPC_CombinationIndex)mComponents[4];
	}
	
	public void setTpc_CombinationIndex(TPC_CombinationIndex tpc_CombinationIndex)
	{
	    mComponents[4] = tpc_CombinationIndex;
	}
	
	
	// Methods for field "powerOffsetTPC_pdpdch"
	public PowerOffsetTPC_pdpdch getPowerOffsetTPC_pdpdch()
	{
	    return (PowerOffsetTPC_pdpdch)mComponents[5];
	}
	
	public void setPowerOffsetTPC_pdpdch(PowerOffsetTPC_pdpdch powerOffsetTPC_pdpdch)
	{
	    mComponents[5] = powerOffsetTPC_pdpdch;
	}
	
	public boolean hasPowerOffsetTPC_pdpdch()
	{
	    return componentIsPresent(5);
	}
	
	public void deletePowerOffsetTPC_pdpdch()
	{
	    setComponentAbsent(5);
	}
	
	
	// Methods for field "closedLoopTimingAdjMode"
	public ClosedLoopTimingAdjMode getClosedLoopTimingAdjMode()
	{
	    return (ClosedLoopTimingAdjMode)mComponents[6];
	}
	
	public void setClosedLoopTimingAdjMode(ClosedLoopTimingAdjMode closedLoopTimingAdjMode)
	{
	    mComponents[6] = closedLoopTimingAdjMode;
	}
	
	public boolean hasClosedLoopTimingAdjMode()
	{
	    return componentIsPresent(6);
	}
	
	public void deleteClosedLoopTimingAdjMode()
	{
	    setComponentAbsent(6);
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
		"DL_DPCH_InfoPerRL_r7$Fdd"
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
				    "PCPICH_UsageForChannelEst"
				),
				new QName (
				    "InformationElements",
				    "PCPICH-UsageForChannelEst"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "mayBeUsed",
					    0
					),
					new MemberListElement (
					    "shallNotBeUsed",
					    1
					)
				    }
				),
				0,
				PCPICH_UsageForChannelEst.mayBeUsed
			    )
			),
			"pCPICH-UsageForChannelEst",
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
				    "DPCH_FrameOffset"
				),
				new QName (
				    "InformationElements",
				    "DPCH-FrameOffset"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DPCH_FrameOffset(0), 
					new DPCH_FrameOffset(149),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(149)
				),
				null
			    )
			),
			"dpch-FrameOffset",
			1,
			2,
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
				    "SecondaryCPICH_Info"
				),
				new QName (
				    "InformationElements",
				    "SecondaryCPICH-Info"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryCPICH_Info"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SecondaryCPICH_Info"
				    )
				),
				0
			    )
			),
			"secondaryCPICH-Info",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_ChannelisationCodeList"
				),
				new QName (
				    "InformationElements",
				    "DL-ChannelisationCodeList"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DL_ChannelisationCode"
				    )
				)
			    )
			),
			"dl-ChannelisationCodeList",
			3,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8004
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "TPC_CombinationIndex"
				),
				new QName (
				    "InformationElements",
				    "TPC-CombinationIndex"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new TPC_CombinationIndex(0), 
					new TPC_CombinationIndex(5),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(5)
				),
				null
			    )
			),
			"tpc-CombinationIndex",
			4,
			2,
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
				    "PowerOffsetTPC_pdpdch"
				),
				new QName (
				    "InformationElements",
				    "PowerOffsetTPC-pdpdch"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new PowerOffsetTPC_pdpdch(0), 
					new PowerOffsetTPC_pdpdch(24),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(24)
				),
				null
			    )
			),
			"powerOffsetTPC-pdpdch",
			5,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8006
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ClosedLoopTimingAdjMode"
				),
				new QName (
				    "InformationElements",
				    "ClosedLoopTimingAdjMode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "slot1",
					    0
					),
					new MemberListElement (
					    "slot2",
					    1
					)
				    }
				),
				0,
				ClosedLoopTimingAdjMode.slot1
			    )
			),
			"closedLoopTimingAdjMode",
			6,
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
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8005, 5),
			    new TagDecoderElement((short)0x8006, 6)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8006, 6)
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
    public static DL_DPCH_InfoPerRL_r7 createDL_DPCH_InfoPerRL_r7WithTdd(Tdd tdd)
    {
	DL_DPCH_InfoPerRL_r7 __object = new DL_DPCH_InfoPerRL_r7();

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
	public Tdd(DL_CCTrChList_r7 dl_CCTrChListToEstablish, 
			DL_CCTrChListToRemove dl_CCTrChListToRemove)
	{
	    setDl_CCTrChListToEstablish(dl_CCTrChListToEstablish);
	    setDl_CCTrChListToRemove(dl_CCTrChListToRemove);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_CCTrChList_r7();
	    mComponents[1] = new DL_CCTrChListToRemove();
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
		    return new DL_CCTrChList_r7();
		case 1:
		    return new DL_CCTrChListToRemove();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "dl_CCTrChListToEstablish"
	public DL_CCTrChList_r7 getDl_CCTrChListToEstablish()
	{
	    return (DL_CCTrChList_r7)mComponents[0];
	}
	
	public void setDl_CCTrChListToEstablish(DL_CCTrChList_r7 dl_CCTrChListToEstablish)
	{
	    mComponents[0] = dl_CCTrChListToEstablish;
	}
	
	public boolean hasDl_CCTrChListToEstablish()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteDl_CCTrChListToEstablish()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "dl_CCTrChListToRemove"
	public DL_CCTrChListToRemove getDl_CCTrChListToRemove()
	{
	    return (DL_CCTrChListToRemove)mComponents[1];
	}
	
	public void setDl_CCTrChListToRemove(DL_CCTrChListToRemove dl_CCTrChListToRemove)
	{
	    mComponents[1] = dl_CCTrChListToRemove;
	}
	
	public boolean hasDl_CCTrChListToRemove()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteDl_CCTrChListToRemove()
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
		"DL_DPCH_InfoPerRL_r7$Tdd"
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
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_CCTrChList_r7"
				),
				new QName (
				    "InformationElements",
				    "DL-CCTrChList-r7"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DL_CCTrCh_r7"
				    )
				)
			    )
			),
			"dl-CCTrChListToEstablish",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_CCTrChListToRemove"
				),
				new QName (
				    "InformationElements",
				    "DL-CCTrChListToRemove"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(8),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(8)
				),
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"TFCS_IdentityPlain"
				    )
				)
			    )
			),
			"dl-CCTrChListToRemove",
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "DL_DPCH_InfoPerRL_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-DPCH-InfoPerRL-r7"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_DPCH_InfoPerRL_r7$Fdd"
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
			    "DL_DPCH_InfoPerRL_r7$Tdd"
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
     * Get the type descriptor (TypeInfo) of 'this' DL_DPCH_InfoPerRL_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_DPCH_InfoPerRL_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_DPCH_InfoPerRL_r7
