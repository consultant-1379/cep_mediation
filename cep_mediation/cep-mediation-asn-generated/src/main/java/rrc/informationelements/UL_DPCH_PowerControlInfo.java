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
 * Define the ASN1 Type UL_DPCH_PowerControlInfo from ASN1 Module InformationElements.
 * @see Choice
 */

public class UL_DPCH_PowerControlInfo extends Choice {
    
    /**
     * The default constructor.
     */
    public UL_DPCH_PowerControlInfo()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static UL_DPCH_PowerControlInfo createUL_DPCH_PowerControlInfoWithFdd(Fdd fdd)
    {
	UL_DPCH_PowerControlInfo __object = new UL_DPCH_PowerControlInfo();

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
			PowerControlAlgorithm powerControlAlgorithm)
	{
	    setDpcch_PowerOffset(dpcch_PowerOffset);
	    setPc_Preamble(pc_Preamble);
	    setSRB_delay(sRB_delay);
	    setPowerControlAlgorithm(powerControlAlgorithm);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DPCCH_PowerOffset();
	    mComponents[1] = new PC_Preamble();
	    mComponents[2] = new SRB_delay();
	    mComponents[3] = new PowerControlAlgorithm();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[4];
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
		"UL_DPCH_PowerControlInfo$Fdd"
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
    public static UL_DPCH_PowerControlInfo createUL_DPCH_PowerControlInfoWithTdd(Tdd tdd)
    {
	UL_DPCH_PowerControlInfo __object = new UL_DPCH_PowerControlInfo();

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
	
	public boolean hasUl_OL_PC_Signalling()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteUl_OL_PC_Signalling()
	{
	    setComponentAbsent(1);
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
		public IndividuallySignalled(IndividualTS_InterferenceList individualTS_InterferenceList, 
				ConstantValueTdd dpch_ConstantValue, 
				PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		{
		    setIndividualTS_InterferenceList(individualTS_InterferenceList);
		    setDpch_ConstantValue(dpch_ConstantValue);
		    setPrimaryCCPCH_TX_Power(primaryCCPCH_TX_Power);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new IndividualTS_InterferenceList();
		    mComponents[1] = new ConstantValueTdd();
		    mComponents[2] = new PrimaryCCPCH_TX_Power();
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
			    return new IndividualTS_InterferenceList();
			case 1:
			    return new ConstantValueTdd();
			case 2:
			    return new PrimaryCCPCH_TX_Power();
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
		public ConstantValueTdd getDpch_ConstantValue()
		{
		    return (ConstantValueTdd)mComponents[1];
		}
		
		public void setDpch_ConstantValue(ConstantValueTdd dpch_ConstantValue)
		{
		    mComponents[1] = dpch_ConstantValue;
		}
		
		
		// Methods for field "primaryCCPCH_TX_Power"
		public PrimaryCCPCH_TX_Power getPrimaryCCPCH_TX_Power()
		{
		    return (PrimaryCCPCH_TX_Power)mComponents[2];
		}
		
		public void setPrimaryCCPCH_TX_Power(PrimaryCCPCH_TX_Power primaryCCPCH_TX_Power)
		{
		    mComponents[2] = primaryCCPCH_TX_Power;
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
			"UL_DPCH_PowerControlInfo$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled"
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
					    "ConstantValueTdd"
					),
					new QName (
					    "InformationElements",
					    "ConstantValueTdd"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new ConstantValueTdd(-35), 
						new ConstantValueTdd(10),
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
				"dpch-ConstantValue",
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
		    "UL_DPCH_PowerControlInfo$Tdd$Ul_OL_PC_Signalling"
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
				    "UL_DPCH_PowerControlInfo$Tdd$Ul_OL_PC_Signalling$IndividuallySignalled"
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
		"UL_DPCH_PowerControlInfo$Tdd"
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
				"UL_DPCH_PowerControlInfo$Tdd$Ul_OL_PC_Signalling"
			    )
			),
			"ul-OL-PC-Signalling",
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
	    "UL_DPCH_PowerControlInfo"
	),
	new QName (
	    "InformationElements",
	    "UL-DPCH-PowerControlInfo"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_DPCH_PowerControlInfo$Fdd"
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
			    "UL_DPCH_PowerControlInfo$Tdd"
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
     * Get the type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_DPCH_PowerControlInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_DPCH_PowerControlInfo
