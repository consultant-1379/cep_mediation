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
 * Define the ASN1 Type HS_DSCH_SPS_NewOperation_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_DSCH_SPS_NewOperation_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_DSCH_SPS_NewOperation_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_DSCH_SPS_NewOperation_TDD128(HS_DSCH_TbsList_TDD128 hs_dsch_TbsList, 
		    HS_DSCH_RxPatternList_TDD128 hs_dsch_RxPatternList, 
		    HARQInfoForSPS hARQInfoForSPS, 
		    HS_SICH_List_TDD128 hs_sich_List, 
		    InitialSPSInfoForHSDSCH initialSPSInfoForHSDSCH)
    {
	setHs_dsch_TbsList(hs_dsch_TbsList);
	setHs_dsch_RxPatternList(hs_dsch_RxPatternList);
	setHARQInfoForSPS(hARQInfoForSPS);
	setHs_sich_List(hs_sich_List);
	setInitialSPSInfoForHSDSCH(initialSPSInfoForHSDSCH);
    }
    
    /**
     * Construct with required components.
     */
    public HS_DSCH_SPS_NewOperation_TDD128(HS_SICH_List_TDD128 hs_sich_List)
    {
	setHs_sich_List(hs_sich_List);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HS_DSCH_TbsList_TDD128();
	mComponents[1] = new HS_DSCH_RxPatternList_TDD128();
	mComponents[2] = new HARQInfoForSPS();
	mComponents[3] = new HS_SICH_List_TDD128();
	mComponents[4] = new InitialSPSInfoForHSDSCH();
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
		return new HS_DSCH_TbsList_TDD128();
	    case 1:
		return new HS_DSCH_RxPatternList_TDD128();
	    case 2:
		return new HARQInfoForSPS();
	    case 3:
		return new HS_SICH_List_TDD128();
	    case 4:
		return new InitialSPSInfoForHSDSCH();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_dsch_TbsList"
    public HS_DSCH_TbsList_TDD128 getHs_dsch_TbsList()
    {
	return (HS_DSCH_TbsList_TDD128)mComponents[0];
    }
    
    public void setHs_dsch_TbsList(HS_DSCH_TbsList_TDD128 hs_dsch_TbsList)
    {
	mComponents[0] = hs_dsch_TbsList;
    }
    
    public boolean hasHs_dsch_TbsList()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHs_dsch_TbsList()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hs_dsch_RxPatternList"
    public HS_DSCH_RxPatternList_TDD128 getHs_dsch_RxPatternList()
    {
	return (HS_DSCH_RxPatternList_TDD128)mComponents[1];
    }
    
    public void setHs_dsch_RxPatternList(HS_DSCH_RxPatternList_TDD128 hs_dsch_RxPatternList)
    {
	mComponents[1] = hs_dsch_RxPatternList;
    }
    
    public boolean hasHs_dsch_RxPatternList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHs_dsch_RxPatternList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "hARQInfoForSPS"
    public HARQInfoForSPS getHARQInfoForSPS()
    {
	return (HARQInfoForSPS)mComponents[2];
    }
    
    public void setHARQInfoForSPS(HARQInfoForSPS hARQInfoForSPS)
    {
	mComponents[2] = hARQInfoForSPS;
    }
    
    public boolean hasHARQInfoForSPS()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHARQInfoForSPS()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type HARQInfoForSPS from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class HARQInfoForSPS extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public HARQInfoForSPS()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public HARQInfoForSPS(INTEGER numberOfProcesses, 
			HARQMemorySize memorySize)
	{
	    setNumberOfProcesses(numberOfProcesses);
	    setMemorySize(memorySize);
	}
	
	/**
	 * Construct with components.
	 */
	public HARQInfoForSPS(long numberOfProcesses, 
			HARQMemorySize memorySize)
	{
	    this(new INTEGER(numberOfProcesses), memorySize);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = HARQMemorySize.hms800;
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
		    return new INTEGER();
		case 1:
		    return HARQMemorySize.hms800;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "numberOfProcesses"
	public long getNumberOfProcesses()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setNumberOfProcesses(long numberOfProcesses)
	{
	    setNumberOfProcesses(new INTEGER(numberOfProcesses));
	}
	
	public void setNumberOfProcesses(INTEGER numberOfProcesses)
	{
	    mComponents[0] = numberOfProcesses;
	}
	
	
	// Methods for field "memorySize"
	public HARQMemorySize getMemorySize()
	{
	    return (HARQMemorySize)mComponents[1];
	}
	
	public void setMemorySize(HARQMemorySize memorySize)
	{
	    mComponents[1] = memorySize;
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
		"HS_DSCH_SPS_NewOperation_TDD128$HARQInfoForSPS"
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
			"numberOfProcesses",
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
				    "HARQMemorySize"
				),
				new QName (
				    "InformationElements",
				    "HARQMemorySize"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "hms800",
					    0
					),
					new MemberListElement (
					    "hms1600",
					    1
					),
					new MemberListElement (
					    "hms2400",
					    2
					),
					new MemberListElement (
					    "hms3200",
					    3
					),
					new MemberListElement (
					    "hms4000",
					    4
					),
					new MemberListElement (
					    "hms4800",
					    5
					),
					new MemberListElement (
					    "hms5600",
					    6
					),
					new MemberListElement (
					    "hms6400",
					    7
					),
					new MemberListElement (
					    "hms7200",
					    8
					),
					new MemberListElement (
					    "hms8000",
					    9
					),
					new MemberListElement (
					    "hms8800",
					    10
					),
					new MemberListElement (
					    "hms9600",
					    11
					),
					new MemberListElement (
					    "hms10400",
					    12
					),
					new MemberListElement (
					    "hms11200",
					    13
					),
					new MemberListElement (
					    "hms12000",
					    14
					),
					new MemberListElement (
					    "hms12800",
					    15
					),
					new MemberListElement (
					    "hms13600",
					    16
					),
					new MemberListElement (
					    "hms14400",
					    17
					),
					new MemberListElement (
					    "hms15200",
					    18
					),
					new MemberListElement (
					    "hms16000",
					    19
					),
					new MemberListElement (
					    "hms17600",
					    20
					),
					new MemberListElement (
					    "hms19200",
					    21
					),
					new MemberListElement (
					    "hms20800",
					    22
					),
					new MemberListElement (
					    "hms22400",
					    23
					),
					new MemberListElement (
					    "hms24000",
					    24
					),
					new MemberListElement (
					    "hms25600",
					    25
					),
					new MemberListElement (
					    "hms27200",
					    26
					),
					new MemberListElement (
					    "hms28800",
					    27
					),
					new MemberListElement (
					    "hms30400",
					    28
					),
					new MemberListElement (
					    "hms32000",
					    29
					),
					new MemberListElement (
					    "hms36000",
					    30
					),
					new MemberListElement (
					    "hms40000",
					    31
					),
					new MemberListElement (
					    "hms44000",
					    32
					),
					new MemberListElement (
					    "hms48000",
					    33
					),
					new MemberListElement (
					    "hms52000",
					    34
					),
					new MemberListElement (
					    "hms56000",
					    35
					),
					new MemberListElement (
					    "hms60000",
					    36
					),
					new MemberListElement (
					    "hms64000",
					    37
					),
					new MemberListElement (
					    "hms68000",
					    38
					),
					new MemberListElement (
					    "hms72000",
					    39
					),
					new MemberListElement (
					    "hms76000",
					    40
					),
					new MemberListElement (
					    "hms80000",
					    41
					),
					new MemberListElement (
					    "hms88000",
					    42
					),
					new MemberListElement (
					    "hms96000",
					    43
					),
					new MemberListElement (
					    "hms104000",
					    44
					),
					new MemberListElement (
					    "hms112000",
					    45
					),
					new MemberListElement (
					    "hms120000",
					    46
					),
					new MemberListElement (
					    "hms128000",
					    47
					),
					new MemberListElement (
					    "hms136000",
					    48
					),
					new MemberListElement (
					    "hms144000",
					    49
					),
					new MemberListElement (
					    "hms152000",
					    50
					),
					new MemberListElement (
					    "hms160000",
					    51
					),
					new MemberListElement (
					    "hms176000",
					    52
					),
					new MemberListElement (
					    "hms192000",
					    53
					),
					new MemberListElement (
					    "hms208000",
					    54
					),
					new MemberListElement (
					    "hms224000",
					    55
					),
					new MemberListElement (
					    "hms240000",
					    56
					),
					new MemberListElement (
					    "hms256000",
					    57
					),
					new MemberListElement (
					    "hms272000",
					    58
					),
					new MemberListElement (
					    "hms288000",
					    59
					),
					new MemberListElement (
					    "hms304000",
					    60
					)
				    }
				),
				0,
				HARQMemorySize.hms800
			    )
			),
			"memorySize",
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
	 * Get the type descriptor (TypeInfo) of 'this' HARQInfoForSPS object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HARQInfoForSPS object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HARQInfoForSPS

    // Methods for field "hs_sich_List"
    public HS_SICH_List_TDD128 getHs_sich_List()
    {
	return (HS_SICH_List_TDD128)mComponents[3];
    }
    
    public void setHs_sich_List(HS_SICH_List_TDD128 hs_sich_List)
    {
	mComponents[3] = hs_sich_List;
    }
    
    
    // Methods for field "initialSPSInfoForHSDSCH"
    public InitialSPSInfoForHSDSCH getInitialSPSInfoForHSDSCH()
    {
	return (InitialSPSInfoForHSDSCH)mComponents[4];
    }
    
    public void setInitialSPSInfoForHSDSCH(InitialSPSInfoForHSDSCH initialSPSInfoForHSDSCH)
    {
	mComponents[4] = initialSPSInfoForHSDSCH;
    }
    
    public boolean hasInitialSPSInfoForHSDSCH()
    {
	return componentIsPresent(4);
    }
    
    public void deleteInitialSPSInfoForHSDSCH()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type InitialSPSInfoForHSDSCH from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class InitialSPSInfoForHSDSCH extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public InitialSPSInfoForHSDSCH()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public InitialSPSInfoForHSDSCH(BitString timeslotInfo, 
			HS_ChannelisationCodeSetInfo_LCR codeResourceInfo, 
			ActivationTime activationTime, INTEGER sfnNum, 
			INTEGER initialRxPatternIndex, 
			INTEGER initialTfsIndex, Modulation modulation, 
			INTEGER hs_sich_Index)
	{
	    setTimeslotInfo(timeslotInfo);
	    setCodeResourceInfo(codeResourceInfo);
	    setActivationTime(activationTime);
	    setSfnNum(sfnNum);
	    setInitialRxPatternIndex(initialRxPatternIndex);
	    setInitialTfsIndex(initialTfsIndex);
	    setModulation(modulation);
	    setHs_sich_Index(hs_sich_Index);
	}
	
	/**
	 * Construct with components.
	 */
	public InitialSPSInfoForHSDSCH(BitString timeslotInfo, 
			HS_ChannelisationCodeSetInfo_LCR codeResourceInfo, 
			ActivationTime activationTime, long sfnNum, 
			long initialRxPatternIndex, long initialTfsIndex, 
			Modulation modulation, long hs_sich_Index)
	{
	    this(timeslotInfo, codeResourceInfo, activationTime, 
		 new INTEGER(sfnNum), new INTEGER(initialRxPatternIndex), 
		 new INTEGER(initialTfsIndex), modulation, 
		 new INTEGER(hs_sich_Index));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new BitString();
	    mComponents[1] = new HS_ChannelisationCodeSetInfo_LCR();
	    mComponents[2] = new ActivationTime();
	    mComponents[3] = new INTEGER();
	    mComponents[4] = new INTEGER();
	    mComponents[5] = new INTEGER();
	    mComponents[6] = Modulation.modQPSK;
	    mComponents[7] = new INTEGER();
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
		    return new BitString();
		case 1:
		    return new HS_ChannelisationCodeSetInfo_LCR();
		case 2:
		    return new ActivationTime();
		case 3:
		    return new INTEGER();
		case 4:
		    return new INTEGER();
		case 5:
		    return new INTEGER();
		case 6:
		    return Modulation.modQPSK;
		case 7:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "timeslotInfo"
	public BitString getTimeslotInfo()
	{
	    return (BitString)mComponents[0];
	}
	
	public void setTimeslotInfo(BitString timeslotInfo)
	{
	    mComponents[0] = timeslotInfo;
	}
	
	
	// Methods for field "codeResourceInfo"
	public HS_ChannelisationCodeSetInfo_LCR getCodeResourceInfo()
	{
	    return (HS_ChannelisationCodeSetInfo_LCR)mComponents[1];
	}
	
	public void setCodeResourceInfo(HS_ChannelisationCodeSetInfo_LCR codeResourceInfo)
	{
	    mComponents[1] = codeResourceInfo;
	}
	
	
	// Methods for field "activationTime"
	public ActivationTime getActivationTime()
	{
	    return (ActivationTime)mComponents[2];
	}
	
	public void setActivationTime(ActivationTime activationTime)
	{
	    mComponents[2] = activationTime;
	}
	
	
	// Methods for field "sfnNum"
	public long getSfnNum()
	{
	    return ((INTEGER)mComponents[3]).longValue();
	}
	
	public void setSfnNum(long sfnNum)
	{
	    setSfnNum(new INTEGER(sfnNum));
	}
	
	public void setSfnNum(INTEGER sfnNum)
	{
	    mComponents[3] = sfnNum;
	}
	
	
	// Methods for field "initialRxPatternIndex"
	public long getInitialRxPatternIndex()
	{
	    return ((INTEGER)mComponents[4]).longValue();
	}
	
	public void setInitialRxPatternIndex(long initialRxPatternIndex)
	{
	    setInitialRxPatternIndex(new INTEGER(initialRxPatternIndex));
	}
	
	public void setInitialRxPatternIndex(INTEGER initialRxPatternIndex)
	{
	    mComponents[4] = initialRxPatternIndex;
	}
	
	
	// Methods for field "initialTfsIndex"
	public long getInitialTfsIndex()
	{
	    return ((INTEGER)mComponents[5]).longValue();
	}
	
	public void setInitialTfsIndex(long initialTfsIndex)
	{
	    setInitialTfsIndex(new INTEGER(initialTfsIndex));
	}
	
	public void setInitialTfsIndex(INTEGER initialTfsIndex)
	{
	    mComponents[5] = initialTfsIndex;
	}
	
	
	// Methods for field "modulation"
	public Modulation getModulation()
	{
	    return (Modulation)mComponents[6];
	}
	
	public void setModulation(Modulation modulation)
	{
	    mComponents[6] = modulation;
	}
	
	
	
	/**
	 * Define the ASN1 Type Modulation from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Modulation extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Modulation()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Modulation(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Modulation modQPSK =
		new Modulation(0);
	    public static final Modulation mod16QAM =
		new Modulation(1);
	    private final static Modulation cNamedNumbers[] = {
		 modQPSK, 
		 mod16QAM
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
	    
	    public static Modulation valueOf(long value)
	    {
		return (Modulation)modQPSK.lookupValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		new Tags (
		    new short[] {
			(short)0x8006
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "HS_DSCH_SPS_NewOperation_TDD128$InitialSPSInfoForHSDSCH$Modulation"
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
			    "modQPSK",
			    0
			),
			new MemberListElement (
			    "mod16QAM",
			    1
			)
		    }
		),
		0,
		modQPSK
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Modulation object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Modulation object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Modulation

	// Methods for field "hs_sich_Index"
	public long getHs_sich_Index()
	{
	    return ((INTEGER)mComponents[7]).longValue();
	}
	
	public void setHs_sich_Index(long hs_sich_Index)
	{
	    setHs_sich_Index(new INTEGER(hs_sich_Index));
	}
	
	public void setHs_sich_Index(INTEGER hs_sich_Index)
	{
	    mComponents[7] = hs_sich_Index;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HS_DSCH_SPS_NewOperation_TDD128$InitialSPSInfoForHSDSCH"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"timeslotInfo",
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
				    "HS_ChannelisationCodeSetInfo_LCR"
				),
				new QName (
				    "InformationElements",
				    "HS-ChannelisationCodeSetInfo-LCR"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"HS_ChannelisationCodeSetInfo_LCR"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"HS_ChannelisationCodeSetInfo_LCR"
				    )
				),
				0
			    )
			),
			"codeResourceInfo",
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
			"sfnNum",
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
			"initialRxPatternIndex",
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
			"initialTfsIndex",
			5,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HS_DSCH_SPS_NewOperation_TDD128$InitialSPSInfoForHSDSCH$Modulation"
			    )
			),
			"modulation",
			6,
			2,
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
			"hs-sich-Index",
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
	 * Get the type descriptor (TypeInfo) of 'this' InitialSPSInfoForHSDSCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InitialSPSInfoForHSDSCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InitialSPSInfoForHSDSCH

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
	    "HS_DSCH_SPS_NewOperation_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-SPS-NewOperation-TDD128"
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
				"HS_DSCH_TbsList_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-TbsList-TDD128"
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
				    "HS_DSCH_TbsList_TDD128$Sequence_"
				)
			    )
			)
		    ),
		    "hs-dsch-TbsList",
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
				"HS_DSCH_RxPatternList_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-DSCH-RxPatternList-TDD128"
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
				    "HS_DSCH_RxPatternList_TDD128$Sequence_"
				)
			    )
			)
		    ),
		    "hs-dsch-RxPatternList",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_SPS_NewOperation_TDD128$HARQInfoForSPS"
			)
		    ),
		    "hARQInfoForSPS",
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
				"HS_SICH_List_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-SICH-List-TDD128"
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
				    "HS_SICH_List_TDD128$Choice_"
				)
			    )
			)
		    ),
		    "hs-sich-List",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_SPS_NewOperation_TDD128$InitialSPSInfoForHSDSCH"
			)
		    ),
		    "initialSPSInfoForHSDSCH",
		    4,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_SPS_NewOperation_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_SPS_NewOperation_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_SPS_NewOperation_TDD128
