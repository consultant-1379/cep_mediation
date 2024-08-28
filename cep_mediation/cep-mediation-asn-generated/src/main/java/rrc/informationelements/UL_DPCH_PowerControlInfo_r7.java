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
 * Define the ASN1 Type UL_DPCH_PowerControlInfo_r7 from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_DPCH_PowerControlInfo_r7 extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_PowerControlInfo_r7()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static UL_DPCH_PowerControlInfo_r7 createUL_DPCH_PowerControlInfo_r7WithFdd(Fdd fdd)
    {
	UL_DPCH_PowerControlInfo_r7 __object = new UL_DPCH_PowerControlInfo_r7();

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
	public Fdd(DPCCH_PowerOffset dpcch_PowerOffset, 
			PC_Preamble pc_Preamble, SRB_delay sRB_delay, 
			PowerControlAlgorithm powerControlAlgorithm, 
			DeltaACK deltaACK, DeltaNACK deltaNACK, 
			ACK_NACK_repetitionFactor ack_NACK_repetition_factor, 
			HARQ_Preamble_Mode harq_Preamble_Mode)
	{
	    setDpcch_PowerOffset(dpcch_PowerOffset);
	    setPc_Preamble(pc_Preamble);
	    setSRB_delay(sRB_delay);
	    setPowerControlAlgorithm(powerControlAlgorithm);
	    setDeltaACK(deltaACK);
	    setDeltaNACK(deltaNACK);
	    setAck_NACK_repetition_factor(ack_NACK_repetition_factor);
	    setHarq_Preamble_Mode(harq_Preamble_Mode);
	}
	
	/**
	 * Construct with required components.
	 */
	public Fdd(DPCCH_PowerOffset dpcch_PowerOffset, 
			PC_Preamble pc_Preamble, SRB_delay sRB_delay, 
			PowerControlAlgorithm powerControlAlgorithm, 
			HARQ_Preamble_Mode harq_Preamble_Mode)
	{
	    setDpcch_PowerOffset(dpcch_PowerOffset);
	    setPc_Preamble(pc_Preamble);
	    setSRB_delay(sRB_delay);
	    setPowerControlAlgorithm(powerControlAlgorithm);
	    setHarq_Preamble_Mode(harq_Preamble_Mode);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DPCCH_PowerOffset();
	    mComponents[1] = new PC_Preamble();
	    mComponents[2] = new SRB_delay();
	    mComponents[3] = new PowerControlAlgorithm();
	    mComponents[4] = new DeltaACK();
	    mComponents[5] = new DeltaNACK();
	    mComponents[6] = new ACK_NACK_repetitionFactor();
	    mComponents[7] = new HARQ_Preamble_Mode();
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
		    return new DPCCH_PowerOffset();
		case 1:
		    return new PC_Preamble();
		case 2:
		    return new SRB_delay();
		case 3:
		    return new PowerControlAlgorithm();
		case 4:
		    return new DeltaACK();
		case 5:
		    return new DeltaNACK();
		case 6:
		    return new ACK_NACK_repetitionFactor();
		case 7:
		    return new HARQ_Preamble_Mode();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "dpcch_PowerOffset"
	public DPCCH_PowerOffset getDpcch_PowerOffset()
	{
	    return (DPCCH_PowerOffset)mComponents[0];
	}
	
	public void setDpcch_PowerOffset(DPCCH_PowerOffset dpcch_PowerOffset)
	{
	    mComponents[0] = dpcch_PowerOffset;
	}
	
	
	// Methods for field "pc_Preamble"
	public PC_Preamble getPc_Preamble()
	{
	    return (PC_Preamble)mComponents[1];
	}
	
	public void setPc_Preamble(PC_Preamble pc_Preamble)
	{
	    mComponents[1] = pc_Preamble;
	}
	
	
	// Methods for field "sRB_delay"
	public SRB_delay getSRB_delay()
	{
	    return (SRB_delay)mComponents[2];
	}
	
	public void setSRB_delay(SRB_delay sRB_delay)
	{
	    mComponents[2] = sRB_delay;
	}
	
	
	// Methods for field "powerControlAlgorithm"
	public PowerControlAlgorithm getPowerControlAlgorithm()
	{
	    return (PowerControlAlgorithm)mComponents[3];
	}
	
	public void setPowerControlAlgorithm(PowerControlAlgorithm powerControlAlgorithm)
	{
	    mComponents[3] = powerControlAlgorithm;
	}
	
	
	// Methods for field "deltaACK"
	public DeltaACK getDeltaACK()
	{
	    return (DeltaACK)mComponents[4];
	}
	
	public void setDeltaACK(DeltaACK deltaACK)
	{
	    mComponents[4] = deltaACK;
	}
	
	public boolean hasDeltaACK()
	{
	    return componentIsPresent(4);
	}
	
	public void deleteDeltaACK()
	{
	    setComponentAbsent(4);
	}
	
	
	// Methods for field "deltaNACK"
	public DeltaNACK getDeltaNACK()
	{
	    return (DeltaNACK)mComponents[5];
	}
	
	public void setDeltaNACK(DeltaNACK deltaNACK)
	{
	    mComponents[5] = deltaNACK;
	}
	
	public boolean hasDeltaNACK()
	{
	    return componentIsPresent(5);
	}
	
	public void deleteDeltaNACK()
	{
	    setComponentAbsent(5);
	}
	
	
	// Methods for field "ack_NACK_repetition_factor"
	public ACK_NACK_repetitionFactor getAck_NACK_repetition_factor()
	{
	    return (ACK_NACK_repetitionFactor)mComponents[6];
	}
	
	public void setAck_NACK_repetition_factor(ACK_NACK_repetitionFactor ack_NACK_repetition_factor)
	{
	    mComponents[6] = ack_NACK_repetition_factor;
	}
	
	public boolean hasAck_NACK_repetition_factor()
	{
	    return componentIsPresent(6);
	}
	
	public void deleteAck_NACK_repetition_factor()
	{
	    setComponentAbsent(6);
	}
	
	
	// Methods for field "harq_Preamble_Mode"
	public HARQ_Preamble_Mode getHarq_Preamble_Mode()
	{
	    return (HARQ_Preamble_Mode)mComponents[7];
	}
	
	public void setHarq_Preamble_Mode(HARQ_Preamble_Mode harq_Preamble_Mode)
	{
	    mComponents[7] = harq_Preamble_Mode;
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
		"UL_DPCH_PowerControlInfo_r7$Fdd"
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
				    "DPCCH_PowerOffset"
				),
				new QName (
				    "InformationElements",
				    "DPCCH-PowerOffset"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DPCCH_PowerOffset(-82), 
					new DPCCH_PowerOffset(-3),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(-82),
				    new java.lang.Long(-3)
				),
				null
			    )
			),
			"dpcch-PowerOffset",
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
				    "PC_Preamble"
				),
				new QName (
				    "InformationElements",
				    "PC-Preamble"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new PC_Preamble(0), 
					new PC_Preamble(7),
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
			"pc-Preamble",
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
				    "SRB_delay"
				),
				new QName (
				    "InformationElements",
				    "SRB-delay"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new SRB_delay(0), 
					new SRB_delay(7),
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
			"sRB-delay",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "PowerControlAlgorithm"
				),
				new QName (
				    "InformationElements",
				    "PowerControlAlgorithm"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"PowerControlAlgorithm"
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
			"powerControlAlgorithm",
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
				    "DeltaACK"
				),
				new QName (
				    "InformationElements",
				    "DeltaACK"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DeltaACK(0), 
					new DeltaACK(8),
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
			"deltaACK",
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
				    "DeltaNACK"
				),
				new QName (
				    "InformationElements",
				    "DeltaNACK"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new DeltaNACK(0), 
					new DeltaNACK(8),
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
			"deltaNACK",
			5,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8006
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "ACK_NACK_repetitionFactor"
				),
				new QName (
				    "InformationElements",
				    "ACK-NACK-repetitionFactor"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ACK_NACK_repetitionFactor(1), 
					new ACK_NACK_repetitionFactor(4),
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
			"ack-NACK-repetition-factor",
			6,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8007
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "HARQ_Preamble_Mode"
				),
				new QName (
				    "InformationElements",
				    "HARQ-Preamble-Mode"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new HARQ_Preamble_Mode(0), 
					new HARQ_Preamble_Mode(1),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(1)
				),
				null
			    )
			),
			"harq-Preamble-Mode",
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
    public static UL_DPCH_PowerControlInfo_r7 createUL_DPCH_PowerControlInfo_r7WithTdd(Tdd tdd)
    {
	UL_DPCH_PowerControlInfo_r7 __object = new UL_DPCH_PowerControlInfo_r7();

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
	public Tdd(UL_TargetSIR ul_TargetSIR, 
			Ul_OL_PC_Signalling ul_OL_PC_Signalling)
	{
	    setUl_TargetSIR(ul_TargetSIR);
	    setUl_OL_PC_Signalling(ul_OL_PC_Signalling);
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd(Ul_OL_PC_Signalling ul_OL_PC_Signalling)
	{
	    setUl_OL_PC_Signalling(ul_OL_PC_Signalling);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UL_TargetSIR();
	    mComponents[1] = new Ul_OL_PC_Signalling();
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
		    return new UL_TargetSIR();
		case 1:
		    return new Ul_OL_PC_Signalling();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ul_TargetSIR"
	public UL_TargetSIR getUl_TargetSIR()
	{
	    return (UL_TargetSIR)mComponents[0];
	}
	
	public void setUl_TargetSIR(UL_TargetSIR ul_TargetSIR)
	{
	    mComponents[0] = ul_TargetSIR;
	}
	
	public boolean hasUl_TargetSIR()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteUl_TargetSIR()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "ul_OL_PC_Signalling"
	public Ul_OL_PC_Signalling getUl_OL_PC_Signalling()
	{
	    return (Ul_OL_PC_Signalling)mComponents[1];
	}
	
	public void setUl_OL_PC_Signalling(Ul_OL_PC_Signalling ul_OL_PC_Signalling)
	{
	    mComponents[1] = ul_OL_PC_Signalling;
	}
	
	
	
	/**
	 * Define the ASN1 Type Ul_OL_PC_Signalling from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Ul_OL_PC_Signalling extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Ul_OL_PC_Signalling()
	    {
	    }
	    
	    public static final  int  broadcast_UL_OL_PC_info_chosen = 1;
	    public static final  int  individuallySignalled_chosen = 2;
	    
	    // Methods for field "broadcast_UL_OL_PC_info"
	    public static Ul_OL_PC_Signalling createUl_OL_PC_SignallingWithBroadcast_UL_OL_PC_info(Null broadcast_UL_OL_PC_info)
	    {
		Ul_OL_PC_Signalling __object = new Ul_OL_PC_Signalling();

		__object.setBroadcast_UL_OL_PC_info(broadcast_UL_OL_PC_info);
		return __object;
	    }
	    
	    public boolean hasBroadcast_UL_OL_PC_info()
	    {
		return getChosenFlag() == broadcast_UL_OL_PC_info_chosen;
	    }
	    
	    public void setBroadcast_UL_OL_PC_info(Null broadcast_UL_OL_PC_info)
	    {
		setChosenValue(broadcast_UL_OL_PC_info);
		setChosenFlag(broadcast_UL_OL_PC_info_chosen);
	    }
	    
	    
	    // Methods for field "individuallySignalled"
	    public static Ul_OL_PC_Signalling createUl_OL_PC_SignallingWithIndividuallySignalled(IndividuallySignalled individuallySignalled)
	    {
		Ul_OL_PC_Signalling __object = new Ul_OL_PC_Signalling();

		__object.setIndividuallySignalled(individuallySignalled);
		return __object;
	    }
	    
	    public boolean hasIndividuallySignalled()
	    {
		return getChosenFlag() == individuallySignalled_chosen;
	    }
	    
	    public void setIndividuallySignalled(IndividuallySignalled individuallySignalled)
	    {
		setChosenValue(individuallySignalled);
		setChosenFlag(individuallySignalled_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type IndividuallySignalled from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class IndividuallySignalled extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public IndividuallySignalled()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public IndividuallySignalled(TddOption tddOption, 
				PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		{
		    setTddOption(tddOption);
		    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new TddOption();
		    mComponents[1] = new PrimaryCCPCH_TX_Power();
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
			    return new TddOption();
			case 1:
			    return new PrimaryCCPCH_TX_Power();
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
			public Tdd384(IndividualTS_InterferenceList individualTS_InterferenceList, 
					ConstantValue dpch_ConstantValue)
			{
			    setIndividualTS_InterferenceList(individualTS_InterferenceList);
			    setDpch_ConstantValue(dpch_ConstantValue);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new IndividualTS_InterferenceList();
			    mComponents[1] = new ConstantValue();
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
				    return new IndividualTS_InterferenceList();
				case 1:
				    return new ConstantValue();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "individualTS_InterferenceList"
			public IndividualTS_InterferenceList getIndividualTS_InterferenceList()
			{
			    return (IndividualTS_InterferenceList)mComponents[0];
			}
			
			public void setIndividualTS_InterferenceList(IndividualTS_InterferenceList individualTS_InterferenceList)
			{
			    mComponents[0] = individualTS_InterferenceList;
			}
			
			
			// Methods for field "dpch_ConstantValue"
			public ConstantValue getDpch_ConstantValue()
			{
			    return (ConstantValue)mComponents[1];
			}
			
			public void setDpch_ConstantValue(ConstantValue dpch_ConstantValue)
			{
			    mComponents[1] = dpch_ConstantValue;
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
				"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd384"
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
						    "IndividualTS_InterferenceList"
						),
						new QName (
						    "InformationElements",
						    "IndividualTS-InterferenceList"
						),
						12314,
						new SizeConstraint (
						    new ValueRangeConstraint (
							new AbstractBounds(
							    new com.oss.asn1.INTEGER(1), 
							    new com.oss.asn1.INTEGER(14),
							    0
							)
						    )
						),
						new Bounds (
						    new java.lang.Long(1),
						    new java.lang.Long(14)
						),
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"IndividualTS_Interference"
						    )
						)
					    )
					),
					"individualTS-InterferenceList",
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
						    "ConstantValue"
						),
						new QName (
						    "InformationElements",
						    "ConstantValue"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new ConstantValue(-35), 
							new ConstantValue(-10),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(-35),
						    new java.lang.Long(-10)
						),
						null
					    )
					),
					"dpch-ConstantValue",
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
			public Tdd768(IndividualTS_InterferenceList individualTS_InterferenceList, 
					ConstantValue dpch_ConstantValue)
			{
			    setIndividualTS_InterferenceList(individualTS_InterferenceList);
			    setDpch_ConstantValue(dpch_ConstantValue);
			}
			
			public void initComponents()
			{
			    mComponents[0] = new IndividualTS_InterferenceList();
			    mComponents[1] = new ConstantValue();
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
				    return new IndividualTS_InterferenceList();
				case 1:
				    return new ConstantValue();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "individualTS_InterferenceList"
			public IndividualTS_InterferenceList getIndividualTS_InterferenceList()
			{
			    return (IndividualTS_InterferenceList)mComponents[0];
			}
			
			public void setIndividualTS_InterferenceList(IndividualTS_InterferenceList individualTS_InterferenceList)
			{
			    mComponents[0] = individualTS_InterferenceList;
			}
			
			
			// Methods for field "dpch_ConstantValue"
			public ConstantValue getDpch_ConstantValue()
			{
			    return (ConstantValue)mComponents[1];
			}
			
			public void setDpch_ConstantValue(ConstantValue dpch_ConstantValue)
			{
			    mComponents[1] = dpch_ConstantValue;
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
				"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd768"
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
						    "IndividualTS_InterferenceList"
						),
						new QName (
						    "InformationElements",
						    "IndividualTS-InterferenceList"
						),
						12314,
						new SizeConstraint (
						    new ValueRangeConstraint (
							new AbstractBounds(
							    new com.oss.asn1.INTEGER(1), 
							    new com.oss.asn1.INTEGER(14),
							    0
							)
						    )
						),
						new Bounds (
						    new java.lang.Long(1),
						    new java.lang.Long(14)
						),
						new TypeInfoRef (
						    new QName (
							"rrc.informationelements",
							"IndividualTS_Interference"
						    )
						)
					    )
					),
					"individualTS-InterferenceList",
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
						    "ConstantValue"
						),
						new QName (
						    "InformationElements",
						    "ConstantValue"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new ConstantValue(-35), 
							new ConstantValue(-10),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(-35),
						    new java.lang.Long(-10)
						),
						null
					    )
					),
					"dpch-ConstantValue",
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
			public Tdd128(BEACON_PL_Est beaconPLEst, 
					TPC_StepSizeTDD tpc_StepSize)
			{
			    setBeaconPLEst(beaconPLEst);
			    setTpc_StepSize(tpc_StepSize);
			}
			
			/**
			 * Construct with required components.
			 */
			public Tdd128(TPC_StepSizeTDD tpc_StepSize)
			{
			    setTpc_StepSize(tpc_StepSize);
			}
			
			public void initComponents()
			{
			    mComponents[0] = BEACON_PL_Est._true;
			    mComponents[1] = new TPC_StepSizeTDD();
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
				    return BEACON_PL_Est._true;
				case 1:
				    return new TPC_StepSizeTDD();
				default:
				    throw new InternalError("AbstractCollection.createInstance()");
			    }
			    
			}
			
			
			// Methods for field "beaconPLEst"
			public BEACON_PL_Est getBeaconPLEst()
			{
			    return (BEACON_PL_Est)mComponents[0];
			}
			
			public void setBeaconPLEst(BEACON_PL_Est beaconPLEst)
			{
			    mComponents[0] = beaconPLEst;
			}
			
			public boolean hasBeaconPLEst()
			{
			    return componentIsPresent(0);
			}
			
			public void deleteBeaconPLEst()
			{
			    setComponentAbsent(0);
			}
			
			
			// Methods for field "tpc_StepSize"
			public TPC_StepSizeTDD getTpc_StepSize()
			{
			    return (TPC_StepSizeTDD)mComponents[1];
			}
			
			public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
			{
			    mComponents[1] = tpc_StepSize;
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
				"rrc.informationelements",
				"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd128"
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
						    "BEACON_PL_Est"
						),
						new QName (
						    "InformationElements",
						    "BEACON-PL-Est"
						),
						12314,
						null,
						new MemberList (
						    new MemberListElement[] {
							new MemberListElement (
							    "true",
							    0
							)
						    }
						),
						0,
						BEACON_PL_Est._true
					    )
					),
					"beaconPLEst",
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
						    "TPC_StepSizeTDD"
						),
						new QName (
						    "InformationElements",
						    "TPC-StepSizeTDD"
						),
						12314,
						new ValueRangeConstraint (
						    new AbstractBounds(
							new TPC_StepSizeTDD(1), 
							new TPC_StepSizeTDD(3),
							0
						    )
						),
						new Bounds (
						    new java.lang.Long(1),
						    new java.lang.Long(3)
						),
						null
					    )
					),
					"tpc-StepSize",
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
				(short)0x8000
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption"
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
					    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd384"
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
					    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd768"
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
					    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption$Tdd128"
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

		// Methods for field "primaryCCPCH_TX_Power"
		public PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
		{
		    return (PrimaryCCPCH_TX_Power)mComponents[1];
		}
		
		public void setPrimaryCCPCH_TX_Power(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		{
		    mComponents[1] = primaryCCPCH_TX_Power;
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
			"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled"
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
					"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled$TddOption"
				    )
				),
				"tddOption",
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
					    "PrimaryCCPCH_TX_Power"
					),
					new QName (
					    "InformationElements",
					    "PrimaryCCPCH-TX-Power"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new PrimaryCCPCH_TX_Power(6), 
						new PrimaryCCPCH_TX_Power(43),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(6),
					    new java.lang.Long(43)
					),
					null
				    )
				),
				"primaryCCPCH-TX-Power",
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
		 * Get the type descriptor (TypeInfo) of 'this' IndividuallySignalled object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' IndividuallySignalled object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for IndividuallySignalled

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case broadcast_UL_OL_PC_info_chosen:
			return new Null();
		    case individuallySignalled_chosen:
			return new IndividuallySignalled();
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
		    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling"
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
			    "broadcast-UL-OL-PC-info",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled"
				)
			    ),
			    "individuallySignalled",
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
	     * Get the type descriptor (TypeInfo) of 'this' Ul_OL_PC_Signalling object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ul_OL_PC_Signalling object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ul_OL_PC_Signalling

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
		"UL_DPCH_PowerControlInfo_r7$Tdd"
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
				    "UL_TargetSIR"
				),
				new QName (
				    "InformationElements",
				    "UL-TargetSIR"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new UL_TargetSIR(0), 
					new UL_TargetSIR(62),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(62)
				),
				null
			    )
			),
			"ul-TargetSIR",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UL_DPCH_PowerControlInfo_r7$Tdd$Ul_OL_PC_Signalling"
			    )
			),
			"ul-OL-PC-Signalling",
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
	    "UL_DPCH_PowerControlInfo_r7"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-PowerControlInfo-r7"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_PowerControlInfo_r7$Fdd"
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
			    "UL_DPCH_PowerControlInfo_r7$Tdd"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfo_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfo_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_PowerControlInfo_r7
