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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UplinkPhysicalChannelControl_r7_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UplinkPhysicalChannelControl_r7_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkPhysicalChannelControl_r7_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkPhysicalChannelControl_r7_IEs(rrc.informationelements.CCTrCH_PowerControlInfo_r7 ccTrCH_PowerControlInfo, 
		    rrc.informationelements.SpecialBurstScheduling specialBurstScheduling, 
		    TddOption tddOption)
    {
	setCcTrCH_PowerControlInfo(ccTrCH_PowerControlInfo);
	setSpecialBurstScheduling(specialBurstScheduling);
	setTddOption(tddOption);
    }
    
    /**
     * Construct with required components.
     */
    public UplinkPhysicalChannelControl_r7_IEs(TddOption tddOption)
    {
	setTddOption(tddOption);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.CCTrCH_PowerControlInfo_r7();
	mComponents[1] = new rrc.informationelements.SpecialBurstScheduling();
	mComponents[2] = new TddOption();
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
		return new rrc.informationelements.CCTrCH_PowerControlInfo_r7();
	    case 1:
		return new rrc.informationelements.SpecialBurstScheduling();
	    case 2:
		return new TddOption();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ccTrCH_PowerControlInfo"
    public rrc.informationelements.CCTrCH_PowerControlInfo_r7 getCcTrCH_PowerControlInfo()
    {
	return (rrc.informationelements.CCTrCH_PowerControlInfo_r7)mComponents[0];
    }
    
    public void setCcTrCH_PowerControlInfo(rrc.informationelements.CCTrCH_PowerControlInfo_r7 ccTrCH_PowerControlInfo)
    {
	mComponents[0] = ccTrCH_PowerControlInfo;
    }
    
    public boolean hasCcTrCH_PowerControlInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCcTrCH_PowerControlInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "specialBurstScheduling"
    public rrc.informationelements.SpecialBurstScheduling getSpecialBurstScheduling()
    {
	return (rrc.informationelements.SpecialBurstScheduling)mComponents[1];
    }
    
    public void setSpecialBurstScheduling(rrc.informationelements.SpecialBurstScheduling specialBurstScheduling)
    {
	mComponents[1] = specialBurstScheduling;
    }
    
    public boolean hasSpecialBurstScheduling()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSpecialBurstScheduling()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tddOption"
    public TddOption getTddOption()
    {
	return (TddOption)mComponents[2];
    }
    
    public void setTddOption(TddOption tddOption)
    {
	mComponents[2] = tddOption;
    }
    
    
    
    /**
     * Define the ASN1 Type TddOption from ASN1 Module PDU_definitions.
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
	public static final  int  tdd768_chosen = 2;
	public static final  int  tdd128_chosen = 3;
	
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
	 * Define the ASN1 Type Tdd384 from ASN1 Module PDU_definitions.
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
	    public Tdd384(rrc.informationelements.UL_TimingAdvanceControl_r4 timingAdvance, 
			    rrc.informationelements.Alpha alpha, 
			    rrc.informationelements.ConstantValueTdd prach_ConstantValue, 
			    rrc.informationelements.ConstantValueTdd pusch_ConstantValue, 
			    rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD, 
			    rrc.informationelements.HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl)
	    {
		setTimingAdvance(timingAdvance);
		setAlpha(alpha);
		setPrach_ConstantValue(prach_ConstantValue);
		setPusch_ConstantValue(pusch_ConstantValue);
		setOpenLoopPowerControl_IPDL_TDD(openLoopPowerControl_IPDL_TDD);
		setHs_SICH_PowerControl(hs_SICH_PowerControl);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.UL_TimingAdvanceControl_r4();
		mComponents[1] = new rrc.informationelements.Alpha();
		mComponents[2] = new rrc.informationelements.ConstantValueTdd();
		mComponents[3] = new rrc.informationelements.ConstantValueTdd();
		mComponents[4] = new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
		mComponents[5] = new rrc.informationelements.HS_SICH_Power_Control_Info_TDD384();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[6];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.UL_TimingAdvanceControl_r4();
		    case 1:
			return new rrc.informationelements.Alpha();
		    case 2:
			return new rrc.informationelements.ConstantValueTdd();
		    case 3:
			return new rrc.informationelements.ConstantValueTdd();
		    case 4:
			return new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
		    case 5:
			return new rrc.informationelements.HS_SICH_Power_Control_Info_TDD384();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timingAdvance"
	    public rrc.informationelements.UL_TimingAdvanceControl_r4 getTimingAdvance()
	    {
		return (rrc.informationelements.UL_TimingAdvanceControl_r4)mComponents[0];
	    }
	    
	    public void setTimingAdvance(rrc.informationelements.UL_TimingAdvanceControl_r4 timingAdvance)
	    {
		mComponents[0] = timingAdvance;
	    }
	    
	    public boolean hasTimingAdvance()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteTimingAdvance()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "alpha"
	    public rrc.informationelements.Alpha getAlpha()
	    {
		return (rrc.informationelements.Alpha)mComponents[1];
	    }
	    
	    public void setAlpha(rrc.informationelements.Alpha alpha)
	    {
		mComponents[1] = alpha;
	    }
	    
	    public boolean hasAlpha()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteAlpha()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "prach_ConstantValue"
	    public rrc.informationelements.ConstantValueTdd getPrach_ConstantValue()
	    {
		return (rrc.informationelements.ConstantValueTdd)mComponents[2];
	    }
	    
	    public void setPrach_ConstantValue(rrc.informationelements.ConstantValueTdd prach_ConstantValue)
	    {
		mComponents[2] = prach_ConstantValue;
	    }
	    
	    public boolean hasPrach_ConstantValue()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePrach_ConstantValue()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "pusch_ConstantValue"
	    public rrc.informationelements.ConstantValueTdd getPusch_ConstantValue()
	    {
		return (rrc.informationelements.ConstantValueTdd)mComponents[3];
	    }
	    
	    public void setPusch_ConstantValue(rrc.informationelements.ConstantValueTdd pusch_ConstantValue)
	    {
		mComponents[3] = pusch_ConstantValue;
	    }
	    
	    public boolean hasPusch_ConstantValue()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deletePusch_ConstantValue()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "openLoopPowerControl_IPDL_TDD"
	    public rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 getOpenLoopPowerControl_IPDL_TDD()
	    {
		return (rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4)mComponents[4];
	    }
	    
	    public void setOpenLoopPowerControl_IPDL_TDD(rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD)
	    {
		mComponents[4] = openLoopPowerControl_IPDL_TDD;
	    }
	    
	    public boolean hasOpenLoopPowerControl_IPDL_TDD()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteOpenLoopPowerControl_IPDL_TDD()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "hs_SICH_PowerControl"
	    public rrc.informationelements.HS_SICH_Power_Control_Info_TDD384 getHs_SICH_PowerControl()
	    {
		return (rrc.informationelements.HS_SICH_Power_Control_Info_TDD384)mComponents[5];
	    }
	    
	    public void setHs_SICH_PowerControl(rrc.informationelements.HS_SICH_Power_Control_Info_TDD384 hs_SICH_PowerControl)
	    {
		mComponents[5] = hs_SICH_PowerControl;
	    }
	    
	    public boolean hasHs_SICH_PowerControl()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteHs_SICH_PowerControl()
	    {
		setComponentAbsent(5);
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
		    "rrc.pdu_definitions",
		    "UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd384"
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
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
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
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_TimingAdvanceControl_r4"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1)
					}
				    )
				)
			    ),
			    "timingAdvance",
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
					"Alpha"
				    ),
				    new QName (
					"InformationElements",
					"Alpha"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.Alpha(0), 
					    new rrc.informationelements.Alpha(8),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "alpha",
			    1,
			    3,
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
					"ConstantValueTdd"
				    ),
				    new QName (
					"InformationElements",
					"ConstantValueTdd"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.ConstantValueTdd(-35), 
					    new rrc.informationelements.ConstantValueTdd(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "prach-ConstantValue",
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
					"ConstantValueTdd"
				    ),
				    new QName (
					"InformationElements",
					"ConstantValueTdd"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.ConstantValueTdd(-35), 
					    new rrc.informationelements.ConstantValueTdd(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "pusch-ConstantValue",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"OpenLoopPowerControl_IPDL_TDD_r4"
				    ),
				    new QName (
					"InformationElements",
					"OpenLoopPowerControl-IPDL-TDD-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_IPDL_TDD_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_IPDL_TDD_r4"
					)
				    ),
				    0
				)
			    ),
			    "openLoopPowerControl-IPDL-TDD",
			    4,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
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
			    "hs-SICH-PowerControl",
			    5,
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
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5)
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
	public static TddOption createTddOptionWithTdd768(Tdd768 tdd768)
	{
	    TddOption __object = new TddOption();

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
	 * Define the ASN1 Type Tdd768 from ASN1 Module PDU_definitions.
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
	    public Tdd768(rrc.informationelements.UL_TimingAdvanceControl_r7 timingAdvance, 
			    rrc.informationelements.Alpha alpha, 
			    rrc.informationelements.ConstantValueTdd prach_ConstantValue, 
			    rrc.informationelements.ConstantValueTdd pusch_ConstantValue, 
			    rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD, 
			    rrc.informationelements.HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl)
	    {
		setTimingAdvance(timingAdvance);
		setAlpha(alpha);
		setPrach_ConstantValue(prach_ConstantValue);
		setPusch_ConstantValue(pusch_ConstantValue);
		setOpenLoopPowerControl_IPDL_TDD(openLoopPowerControl_IPDL_TDD);
		setHs_SICH_PowerControl(hs_SICH_PowerControl);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.UL_TimingAdvanceControl_r7();
		mComponents[1] = new rrc.informationelements.Alpha();
		mComponents[2] = new rrc.informationelements.ConstantValueTdd();
		mComponents[3] = new rrc.informationelements.ConstantValueTdd();
		mComponents[4] = new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
		mComponents[5] = new rrc.informationelements.HS_SICH_Power_Control_Info_TDD768();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[6];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new rrc.informationelements.UL_TimingAdvanceControl_r7();
		    case 1:
			return new rrc.informationelements.Alpha();
		    case 2:
			return new rrc.informationelements.ConstantValueTdd();
		    case 3:
			return new rrc.informationelements.ConstantValueTdd();
		    case 4:
			return new rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4();
		    case 5:
			return new rrc.informationelements.HS_SICH_Power_Control_Info_TDD768();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "timingAdvance"
	    public rrc.informationelements.UL_TimingAdvanceControl_r7 getTimingAdvance()
	    {
		return (rrc.informationelements.UL_TimingAdvanceControl_r7)mComponents[0];
	    }
	    
	    public void setTimingAdvance(rrc.informationelements.UL_TimingAdvanceControl_r7 timingAdvance)
	    {
		mComponents[0] = timingAdvance;
	    }
	    
	    public boolean hasTimingAdvance()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteTimingAdvance()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "alpha"
	    public rrc.informationelements.Alpha getAlpha()
	    {
		return (rrc.informationelements.Alpha)mComponents[1];
	    }
	    
	    public void setAlpha(rrc.informationelements.Alpha alpha)
	    {
		mComponents[1] = alpha;
	    }
	    
	    public boolean hasAlpha()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteAlpha()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "prach_ConstantValue"
	    public rrc.informationelements.ConstantValueTdd getPrach_ConstantValue()
	    {
		return (rrc.informationelements.ConstantValueTdd)mComponents[2];
	    }
	    
	    public void setPrach_ConstantValue(rrc.informationelements.ConstantValueTdd prach_ConstantValue)
	    {
		mComponents[2] = prach_ConstantValue;
	    }
	    
	    public boolean hasPrach_ConstantValue()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deletePrach_ConstantValue()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "pusch_ConstantValue"
	    public rrc.informationelements.ConstantValueTdd getPusch_ConstantValue()
	    {
		return (rrc.informationelements.ConstantValueTdd)mComponents[3];
	    }
	    
	    public void setPusch_ConstantValue(rrc.informationelements.ConstantValueTdd pusch_ConstantValue)
	    {
		mComponents[3] = pusch_ConstantValue;
	    }
	    
	    public boolean hasPusch_ConstantValue()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deletePusch_ConstantValue()
	    {
		setComponentAbsent(3);
	    }
	    
	    
	    // Methods for field "openLoopPowerControl_IPDL_TDD"
	    public rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 getOpenLoopPowerControl_IPDL_TDD()
	    {
		return (rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4)mComponents[4];
	    }
	    
	    public void setOpenLoopPowerControl_IPDL_TDD(rrc.informationelements.OpenLoopPowerControl_IPDL_TDD_r4 openLoopPowerControl_IPDL_TDD)
	    {
		mComponents[4] = openLoopPowerControl_IPDL_TDD;
	    }
	    
	    public boolean hasOpenLoopPowerControl_IPDL_TDD()
	    {
		return componentIsPresent(4);
	    }
	    
	    public void deleteOpenLoopPowerControl_IPDL_TDD()
	    {
		setComponentAbsent(4);
	    }
	    
	    
	    // Methods for field "hs_SICH_PowerControl"
	    public rrc.informationelements.HS_SICH_Power_Control_Info_TDD768 getHs_SICH_PowerControl()
	    {
		return (rrc.informationelements.HS_SICH_Power_Control_Info_TDD768)mComponents[5];
	    }
	    
	    public void setHs_SICH_PowerControl(rrc.informationelements.HS_SICH_Power_Control_Info_TDD768 hs_SICH_PowerControl)
	    {
		mComponents[5] = hs_SICH_PowerControl;
	    }
	    
	    public boolean hasHs_SICH_PowerControl()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteHs_SICH_PowerControl()
	    {
		setComponentAbsent(5);
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
		    "rrc.pdu_definitions",
		    "UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd768"
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
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"UL_TimingAdvanceControl_r7"
				    ),
				    new QName (
					"InformationElements",
					"UL-TimingAdvanceControl-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UL_TimingAdvanceControl_r7"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1)
					}
				    )
				)
			    ),
			    "timingAdvance",
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
					"Alpha"
				    ),
				    new QName (
					"InformationElements",
					"Alpha"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.Alpha(0), 
					    new rrc.informationelements.Alpha(8),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "alpha",
			    1,
			    3,
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
					"ConstantValueTdd"
				    ),
				    new QName (
					"InformationElements",
					"ConstantValueTdd"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.ConstantValueTdd(-35), 
					    new rrc.informationelements.ConstantValueTdd(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "prach-ConstantValue",
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
					"ConstantValueTdd"
				    ),
				    new QName (
					"InformationElements",
					"ConstantValueTdd"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.ConstantValueTdd(-35), 
					    new rrc.informationelements.ConstantValueTdd(10),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-35),
					new java.lang.Long(10)
				    ),
				    null
				)
			    ),
			    "pusch-ConstantValue",
			    3,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"OpenLoopPowerControl_IPDL_TDD_r4"
				    ),
				    new QName (
					"InformationElements",
					"OpenLoopPowerControl-IPDL-TDD-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_IPDL_TDD_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "OpenLoopPowerControl_IPDL_TDD_r4"
					)
				    ),
				    0
				)
			    ),
			    "openLoopPowerControl-IPDL-TDD",
			    4,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
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
			    "hs-SICH-PowerControl",
			    5,
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
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8003, 3),
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8004, 4),
				new TagDecoderElement((short)0x8005, 5)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5)
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
	 * Define the ASN1 Type Tdd128 from ASN1 Module PDU_definitions.
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
	    public Tdd128(rrc.informationelements.UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
			    INTEGER desired_HS_SICH_PowerLevel, 
			    Tpc_Step_Size tpc_Step_Size)
	    {
		setUl_SynchronisationParameters(ul_SynchronisationParameters);
		setDesired_HS_SICH_PowerLevel(desired_HS_SICH_PowerLevel);
		setTpc_Step_Size(tpc_Step_Size);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd128(rrc.informationelements.UL_SynchronisationParameters_r4 ul_SynchronisationParameters, 
			    long desired_HS_SICH_PowerLevel, 
			    Tpc_Step_Size tpc_Step_Size)
	    {
		this(ul_SynchronisationParameters, 
		     new INTEGER(desired_HS_SICH_PowerLevel), tpc_Step_Size);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.UL_SynchronisationParameters_r4();
		mComponents[1] = new INTEGER();
		mComponents[2] = Tpc_Step_Size.s1;
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
			return new rrc.informationelements.UL_SynchronisationParameters_r4();
		    case 1:
			return new INTEGER();
		    case 2:
			return Tpc_Step_Size.s1;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_SynchronisationParameters"
	    public rrc.informationelements.UL_SynchronisationParameters_r4 getUl_SynchronisationParameters()
	    {
		return (rrc.informationelements.UL_SynchronisationParameters_r4)mComponents[0];
	    }
	    
	    public void setUl_SynchronisationParameters(rrc.informationelements.UL_SynchronisationParameters_r4 ul_SynchronisationParameters)
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
	    
	    
	    // Methods for field "desired_HS_SICH_PowerLevel"
	    public long getDesired_HS_SICH_PowerLevel()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setDesired_HS_SICH_PowerLevel(long desired_HS_SICH_PowerLevel)
	    {
		setDesired_HS_SICH_PowerLevel(new INTEGER(desired_HS_SICH_PowerLevel));
	    }
	    
	    public void setDesired_HS_SICH_PowerLevel(INTEGER desired_HS_SICH_PowerLevel)
	    {
		mComponents[1] = desired_HS_SICH_PowerLevel;
	    }
	    
	    public boolean hasDesired_HS_SICH_PowerLevel()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDesired_HS_SICH_PowerLevel()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "tpc_Step_Size"
	    public Tpc_Step_Size getTpc_Step_Size()
	    {
		return (Tpc_Step_Size)mComponents[2];
	    }
	    
	    public void setTpc_Step_Size(Tpc_Step_Size tpc_Step_Size)
	    {
		mComponents[2] = tpc_Step_Size;
	    }
	    
	    public boolean hasTpc_Step_Size()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteTpc_Step_Size()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type Tpc_Step_Size from ASN1 Module PDU_definitions.
	     * @see Enumerated
	     */
	    public static final class Tpc_Step_Size extends Enumerated {
		
		/**
		 * The default constructor.
		 */
		private Tpc_Step_Size()
		{
		    super(cFirstNumber);
		}
		
		protected Tpc_Step_Size(long value)
		{
		    super(value);
		}
		
		// Named list definitions.
		public static final Tpc_Step_Size s1 =
		    new Tpc_Step_Size(0);
		public static final Tpc_Step_Size s2 =
		    new Tpc_Step_Size(1);
		public static final Tpc_Step_Size s3 =
		    new Tpc_Step_Size(2);
		public static final Tpc_Step_Size spare1 =
		    new Tpc_Step_Size(3);
		private final static Tpc_Step_Size cNamedNumbers[] = {
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
		
		public static Tpc_Step_Size valueOf(long value)
		{
		    return (Tpc_Step_Size)s1.lookupValue(value);
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
			"rrc.pdu_definitions",
			"UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd128$Tpc_Step_Size"
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
		 * Get the type descriptor (TypeInfo) of 'this' Tpc_Step_Size object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' Tpc_Step_Size object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for Tpc_Step_Size

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
		    "rrc.pdu_definitions",
		    "UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd128"
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
			    "desired-HS-SICH-PowerLevel",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.pdu_definitions",
				    "UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd128$Tpc_Step_Size"
				)
			    ),
			    "tpc-Step-Size",
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UplinkPhysicalChannelControl_r7_IEs$TddOption"
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
				"rrc.pdu_definitions",
				"UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd384"
			    )
			),
			"tdd384",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd768"
			    )
			),
			"tdd768",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.pdu_definitions",
				"UplinkPhysicalChannelControl_r7_IEs$TddOption$Tdd128"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.pdu_definitions",
	    "UplinkPhysicalChannelControl_r7_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UplinkPhysicalChannelControl-r7-IEs"
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
				"CCTrCH_PowerControlInfo_r7"
			    ),
			    new QName (
				"InformationElements",
				"CCTrCH-PowerControlInfo-r7"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CCTrCH_PowerControlInfo_r7"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CCTrCH_PowerControlInfo_r7"
				)
			    ),
			    0
			)
		    ),
		    "ccTrCH-PowerControlInfo",
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
				"SpecialBurstScheduling"
			    ),
			    new QName (
				"InformationElements",
				"SpecialBurstScheduling"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.SpecialBurstScheduling(0), 
				    new rrc.informationelements.SpecialBurstScheduling(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "specialBurstScheduling",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UplinkPhysicalChannelControl_r7_IEs$TddOption"
			)
		    ),
		    "tddOption",
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
     * Get the type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_r7_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkPhysicalChannelControl_r7_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkPhysicalChannelControl_r7_IEs
