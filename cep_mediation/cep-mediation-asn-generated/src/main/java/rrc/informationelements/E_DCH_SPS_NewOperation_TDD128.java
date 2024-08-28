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
 * Define the ASN1 Type E_DCH_SPS_NewOperation_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_SPS_NewOperation_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_SPS_NewOperation_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_SPS_NewOperation_TDD128(E_HICH_Information_For_SPS_TDD128 e_hich_Info, 
		    E_DCH_TxPatternList_TDD128 e_dch_TxPattern, 
		    InitialSPSInfoForEDCH initialSPSInfoForEDCH)
    {
	setE_hich_Info(e_hich_Info);
	setE_dch_TxPattern(e_dch_TxPattern);
	setInitialSPSInfoForEDCH(initialSPSInfoForEDCH);
    }
    
    /**
     * Construct with required components.
     */
    public E_DCH_SPS_NewOperation_TDD128(E_HICH_Information_For_SPS_TDD128 e_hich_Info)
    {
	setE_hich_Info(e_hich_Info);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_HICH_Information_For_SPS_TDD128();
	mComponents[1] = new E_DCH_TxPatternList_TDD128();
	mComponents[2] = new InitialSPSInfoForEDCH();
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
		return new E_HICH_Information_For_SPS_TDD128();
	    case 1:
		return new E_DCH_TxPatternList_TDD128();
	    case 2:
		return new InitialSPSInfoForEDCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_hich_Info"
    public E_HICH_Information_For_SPS_TDD128 getE_hich_Info()
    {
	return (E_HICH_Information_For_SPS_TDD128)mComponents[0];
    }
    
    public void setE_hich_Info(E_HICH_Information_For_SPS_TDD128 e_hich_Info)
    {
	mComponents[0] = e_hich_Info;
    }
    
    
    // Methods for field "e_dch_TxPattern"
    public E_DCH_TxPatternList_TDD128 getE_dch_TxPattern()
    {
	return (E_DCH_TxPatternList_TDD128)mComponents[1];
    }
    
    public void setE_dch_TxPattern(E_DCH_TxPatternList_TDD128 e_dch_TxPattern)
    {
	mComponents[1] = e_dch_TxPattern;
    }
    
    public boolean hasE_dch_TxPattern()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_dch_TxPattern()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "initialSPSInfoForEDCH"
    public InitialSPSInfoForEDCH getInitialSPSInfoForEDCH()
    {
	return (InitialSPSInfoForEDCH)mComponents[2];
    }
    
    public void setInitialSPSInfoForEDCH(InitialSPSInfoForEDCH initialSPSInfoForEDCH)
    {
	mComponents[2] = initialSPSInfoForEDCH;
    }
    
    public boolean hasInitialSPSInfoForEDCH()
    {
	return componentIsPresent(2);
    }
    
    public void deleteInitialSPSInfoForEDCH()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type InitialSPSInfoForEDCH from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class InitialSPSInfoForEDCH extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public InitialSPSInfoForEDCH()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public InitialSPSInfoForEDCH(INTEGER n_E_UCCH, 
			UL_TS_ChannelisationCode codeResourceInfo, 
			BitString timeslotResourceRelatedInfo, 
			INTEGER powerResourceRelatedInfo, 
			ActivationTime activationTime, INTEGER subframeNum, 
			INTEGER initialTxPatternIndex)
	{
	    setN_E_UCCH(n_E_UCCH);
	    setCodeResourceInfo(codeResourceInfo);
	    setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
	    setPowerResourceRelatedInfo(powerResourceRelatedInfo);
	    setActivationTime(activationTime);
	    setSubframeNum(subframeNum);
	    setInitialTxPatternIndex(initialTxPatternIndex);
	}
	
	/**
	 * Construct with components.
	 */
	public InitialSPSInfoForEDCH(long n_E_UCCH, 
			UL_TS_ChannelisationCode codeResourceInfo, 
			BitString timeslotResourceRelatedInfo, 
			long powerResourceRelatedInfo, 
			ActivationTime activationTime, long subframeNum, 
			long initialTxPatternIndex)
	{
	    this(new INTEGER(n_E_UCCH), codeResourceInfo, 
		 timeslotResourceRelatedInfo, 
		 new INTEGER(powerResourceRelatedInfo), activationTime, 
		 new INTEGER(subframeNum), 
		 new INTEGER(initialTxPatternIndex));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = UL_TS_ChannelisationCode.cc1_1;
	    mComponents[2] = new BitString();
	    mComponents[3] = new INTEGER();
	    mComponents[4] = new ActivationTime();
	    mComponents[5] = new INTEGER();
	    mComponents[6] = new INTEGER();
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
		    return new INTEGER();
		case 1:
		    return UL_TS_ChannelisationCode.cc1_1;
		case 2:
		    return new BitString();
		case 3:
		    return new INTEGER();
		case 4:
		    return new ActivationTime();
		case 5:
		    return new INTEGER();
		case 6:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "n_E_UCCH"
	public long getN_E_UCCH()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setN_E_UCCH(long n_E_UCCH)
	{
	    setN_E_UCCH(new INTEGER(n_E_UCCH));
	}
	
	public void setN_E_UCCH(INTEGER n_E_UCCH)
	{
	    mComponents[0] = n_E_UCCH;
	}
	
	
	// Methods for field "codeResourceInfo"
	public UL_TS_ChannelisationCode getCodeResourceInfo()
	{
	    return (UL_TS_ChannelisationCode)mComponents[1];
	}
	
	public void setCodeResourceInfo(UL_TS_ChannelisationCode codeResourceInfo)
	{
	    mComponents[1] = codeResourceInfo;
	}
	
	
	// Methods for field "timeslotResourceRelatedInfo"
	public BitString getTimeslotResourceRelatedInfo()
	{
	    return (BitString)mComponents[2];
	}
	
	public void setTimeslotResourceRelatedInfo(BitString timeslotResourceRelatedInfo)
	{
	    mComponents[2] = timeslotResourceRelatedInfo;
	}
	
	
	// Methods for field "powerResourceRelatedInfo"
	public long getPowerResourceRelatedInfo()
	{
	    return ((INTEGER)mComponents[3]).longValue();
	}
	
	public void setPowerResourceRelatedInfo(long powerResourceRelatedInfo)
	{
	    setPowerResourceRelatedInfo(new INTEGER(powerResourceRelatedInfo));
	}
	
	public void setPowerResourceRelatedInfo(INTEGER powerResourceRelatedInfo)
	{
	    mComponents[3] = powerResourceRelatedInfo;
	}
	
	
	// Methods for field "activationTime"
	public ActivationTime getActivationTime()
	{
	    return (ActivationTime)mComponents[4];
	}
	
	public void setActivationTime(ActivationTime activationTime)
	{
	    mComponents[4] = activationTime;
	}
	
	
	// Methods for field "subframeNum"
	public long getSubframeNum()
	{
	    return ((INTEGER)mComponents[5]).longValue();
	}
	
	public void setSubframeNum(long subframeNum)
	{
	    setSubframeNum(new INTEGER(subframeNum));
	}
	
	public void setSubframeNum(INTEGER subframeNum)
	{
	    mComponents[5] = subframeNum;
	}
	
	
	// Methods for field "initialTxPatternIndex"
	public long getInitialTxPatternIndex()
	{
	    return ((INTEGER)mComponents[6]).longValue();
	}
	
	public void setInitialTxPatternIndex(long initialTxPatternIndex)
	{
	    setInitialTxPatternIndex(new INTEGER(initialTxPatternIndex));
	}
	
	public void setInitialTxPatternIndex(INTEGER initialTxPatternIndex)
	{
	    mComponents[6] = initialTxPatternIndex;
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
		"E_DCH_SPS_NewOperation_TDD128$InitialSPSInfoForEDCH"
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
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
			"n-E-UCCH",
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
				    "UL_TS_ChannelisationCode"
				),
				new QName (
				    "InformationElements",
				    "UL-TS-ChannelisationCode"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "cc1-1",
					    0
					),
					new MemberListElement (
					    "cc2-1",
					    1
					),
					new MemberListElement (
					    "cc2-2",
					    2
					),
					new MemberListElement (
					    "cc4-1",
					    3
					),
					new MemberListElement (
					    "cc4-2",
					    4
					),
					new MemberListElement (
					    "cc4-3",
					    5
					),
					new MemberListElement (
					    "cc4-4",
					    6
					),
					new MemberListElement (
					    "cc8-1",
					    7
					),
					new MemberListElement (
					    "cc8-2",
					    8
					),
					new MemberListElement (
					    "cc8-3",
					    9
					),
					new MemberListElement (
					    "cc8-4",
					    10
					),
					new MemberListElement (
					    "cc8-5",
					    11
					),
					new MemberListElement (
					    "cc8-6",
					    12
					),
					new MemberListElement (
					    "cc8-7",
					    13
					),
					new MemberListElement (
					    "cc8-8",
					    14
					),
					new MemberListElement (
					    "cc16-1",
					    15
					),
					new MemberListElement (
					    "cc16-2",
					    16
					),
					new MemberListElement (
					    "cc16-3",
					    17
					),
					new MemberListElement (
					    "cc16-4",
					    18
					),
					new MemberListElement (
					    "cc16-5",
					    19
					),
					new MemberListElement (
					    "cc16-6",
					    20
					),
					new MemberListElement (
					    "cc16-7",
					    21
					),
					new MemberListElement (
					    "cc16-8",
					    22
					),
					new MemberListElement (
					    "cc16-9",
					    23
					),
					new MemberListElement (
					    "cc16-10",
					    24
					),
					new MemberListElement (
					    "cc16-11",
					    25
					),
					new MemberListElement (
					    "cc16-12",
					    26
					),
					new MemberListElement (
					    "cc16-13",
					    27
					),
					new MemberListElement (
					    "cc16-14",
					    28
					),
					new MemberListElement (
					    "cc16-15",
					    29
					),
					new MemberListElement (
					    "cc16-16",
					    30
					)
				    }
				),
				0,
				UL_TS_ChannelisationCode.cc1_1
			    )
			),
			"codeResourceInfo",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(5)
				    )
				),
				new Bounds (
				    new java.lang.Long(5),
				    new java.lang.Long(5)
				),
				null
			    )
			),
			"timeslotResourceRelatedInfo",
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"powerResourceRelatedInfo",
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
				    "ActivationTime"
				),
				new QName (
				    "InformationElements",
				    "ActivationTime"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new ActivationTime(0), 
					new ActivationTime(255),
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
			"activationTime",
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(1),
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
			"subframeNum",
			5,
			2,
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(3),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(3)
				),
				null
			    )
			),
			"initialTxPatternIndex",
			6,
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
			    new TagDecoderElement((short)0x8004, 4)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8005, 5)
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
	 * Get the type descriptor (TypeInfo) of 'this' InitialSPSInfoForEDCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InitialSPSInfoForEDCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InitialSPSInfoForEDCH

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
	    "E_DCH_SPS_NewOperation_TDD128"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-SPS-NewOperation-TDD128"
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
				"E_HICH_Information_For_SPS_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information-For-SPS-TDD128"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_For_SPS_TDD128"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information_For_SPS_TDD128"
				)
			    ),
			    0
			)
		    ),
		    "e-hich-Info",
		    0,
		    2,
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
				"E_DCH_TxPatternList_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-TxPatternList-TDD128"
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
				    "E_DCH_TxPatternList_TDD128$Sequence_"
				)
			    )
			)
		    ),
		    "e-dch-TxPattern",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_SPS_NewOperation_TDD128$InitialSPSInfoForEDCH"
			)
		    ),
		    "initialSPSInfoForEDCH",
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
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_SPS_NewOperation_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_SPS_NewOperation_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_SPS_NewOperation_TDD128
