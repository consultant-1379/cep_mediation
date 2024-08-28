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
 * Define the ASN1 Type UE_Positioning_IPDL_Parameters_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_IPDL_Parameters_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_IPDL_Parameters_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_IPDL_Parameters_r4(ModeSpecificInfo modeSpecificInfo, 
		    BurstModeParameters burstModeParameters)
    {
	setModeSpecificInfo(modeSpecificInfo);
	setBurstModeParameters(burstModeParameters);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_IPDL_Parameters_r4(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
	mComponents[1] = new BurstModeParameters();
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
		return new ModeSpecificInfo();
	    case 1:
		return new BurstModeParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[0];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[0] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Fdd(IP_Spacing ip_Spacing, IP_Length ip_Length, 
			    INTEGER ip_Offset, INTEGER seed)
	    {
		setIp_Spacing(ip_Spacing);
		setIp_Length(ip_Length);
		setIp_Offset(ip_Offset);
		setSeed(seed);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(IP_Spacing ip_Spacing, IP_Length ip_Length, 
			    long ip_Offset, long seed)
	    {
		this(ip_Spacing, ip_Length, new INTEGER(ip_Offset), 
		     new INTEGER(seed));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = IP_Spacing.e5;
		mComponents[1] = IP_Length.ipl5;
		mComponents[2] = new INTEGER();
		mComponents[3] = new INTEGER();
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
			return IP_Spacing.e5;
		    case 1:
			return IP_Length.ipl5;
		    case 2:
			return new INTEGER();
		    case 3:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ip_Spacing"
	    public IP_Spacing getIp_Spacing()
	    {
		return (IP_Spacing)mComponents[0];
	    }
	    
	    public void setIp_Spacing(IP_Spacing ip_Spacing)
	    {
		mComponents[0] = ip_Spacing;
	    }
	    
	    
	    // Methods for field "ip_Length"
	    public IP_Length getIp_Length()
	    {
		return (IP_Length)mComponents[1];
	    }
	    
	    public void setIp_Length(IP_Length ip_Length)
	    {
		mComponents[1] = ip_Length;
	    }
	    
	    
	    // Methods for field "ip_Offset"
	    public long getIp_Offset()
	    {
		return ((INTEGER)mComponents[2]).longValue();
	    }
	    
	    public void setIp_Offset(long ip_Offset)
	    {
		setIp_Offset(new INTEGER(ip_Offset));
	    }
	    
	    public void setIp_Offset(INTEGER ip_Offset)
	    {
		mComponents[2] = ip_Offset;
	    }
	    
	    
	    // Methods for field "seed"
	    public long getSeed()
	    {
		return ((INTEGER)mComponents[3]).longValue();
	    }
	    
	    public void setSeed(long seed)
	    {
		setSeed(new INTEGER(seed));
	    }
	    
	    public void setSeed(INTEGER seed)
	    {
		mComponents[3] = seed;
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
		    "UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo$Fdd"
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
					"IP_Spacing"
				    ),
				    new QName (
					"InformationElements",
					"IP-Spacing"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"e5",
						0
					    ),
					    new MemberListElement (
						"e7",
						1
					    ),
					    new MemberListElement (
						"e10",
						2
					    ),
					    new MemberListElement (
						"e15",
						3
					    ),
					    new MemberListElement (
						"e20",
						4
					    ),
					    new MemberListElement (
						"e30",
						5
					    ),
					    new MemberListElement (
						"e40",
						6
					    ),
					    new MemberListElement (
						"e50",
						7
					    )
					}
				    ),
				    0,
				    IP_Spacing.e5
				)
			    ),
			    "ip-Spacing",
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
					"IP_Length"
				    ),
				    new QName (
					"InformationElements",
					"IP-Length"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"ipl5",
						0
					    ),
					    new MemberListElement (
						"ipl10",
						1
					    )
					}
				    ),
				    0,
				    IP_Length.ipl5
				)
			    ),
			    "ip-Length",
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
					    new com.oss.asn1.INTEGER(9),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(9)
				    ),
				    null
				)
			    ),
			    "ip-Offset",
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
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(63)
				    ),
				    null
				)
			    ),
			    "seed",
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd(IP_Spacing_TDD ip_Spacing_TDD, INTEGER ip_slot, 
			    INTEGER ip_Start, IP_PCCPCH_r4 ip_PCCPCG)
	    {
		setIp_Spacing_TDD(ip_Spacing_TDD);
		setIp_slot(ip_slot);
		setIp_Start(ip_Start);
		setIp_PCCPCG(ip_PCCPCG);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Tdd(IP_Spacing_TDD ip_Spacing_TDD, long ip_slot, 
			    long ip_Start, IP_PCCPCH_r4 ip_PCCPCG)
	    {
		this(ip_Spacing_TDD, new INTEGER(ip_slot), 
		     new INTEGER(ip_Start), ip_PCCPCG);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(IP_Spacing_TDD ip_Spacing_TDD, long ip_slot, 
			    long ip_Start)
	    {
		setIp_Spacing_TDD(ip_Spacing_TDD);
		setIp_slot(ip_slot);
		setIp_Start(ip_Start);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = IP_Spacing_TDD.e30;
		mComponents[1] = new INTEGER();
		mComponents[2] = new INTEGER();
		mComponents[3] = new IP_PCCPCH_r4();
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
			return IP_Spacing_TDD.e30;
		    case 1:
			return new INTEGER();
		    case 2:
			return new INTEGER();
		    case 3:
			return new IP_PCCPCH_r4();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ip_Spacing_TDD"
	    public IP_Spacing_TDD getIp_Spacing_TDD()
	    {
		return (IP_Spacing_TDD)mComponents[0];
	    }
	    
	    public void setIp_Spacing_TDD(IP_Spacing_TDD ip_Spacing_TDD)
	    {
		mComponents[0] = ip_Spacing_TDD;
	    }
	    
	    
	    // Methods for field "ip_slot"
	    public long getIp_slot()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setIp_slot(long ip_slot)
	    {
		setIp_slot(new INTEGER(ip_slot));
	    }
	    
	    public void setIp_slot(INTEGER ip_slot)
	    {
		mComponents[1] = ip_slot;
	    }
	    
	    
	    // Methods for field "ip_Start"
	    public long getIp_Start()
	    {
		return ((INTEGER)mComponents[2]).longValue();
	    }
	    
	    public void setIp_Start(long ip_Start)
	    {
		setIp_Start(new INTEGER(ip_Start));
	    }
	    
	    public void setIp_Start(INTEGER ip_Start)
	    {
		mComponents[2] = ip_Start;
	    }
	    
	    
	    // Methods for field "ip_PCCPCG"
	    public IP_PCCPCH_r4 getIp_PCCPCG()
	    {
		return (IP_PCCPCH_r4)mComponents[3];
	    }
	    
	    public void setIp_PCCPCG(IP_PCCPCH_r4 ip_PCCPCG)
	    {
		mComponents[3] = ip_PCCPCG;
	    }
	    
	    public boolean hasIp_PCCPCG()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteIp_PCCPCG()
	    {
		setComponentAbsent(3);
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
		    "UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo$Tdd"
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
					"IP_Spacing_TDD"
				    ),
				    new QName (
					"InformationElements",
					"IP-Spacing-TDD"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"e30",
						0
					    ),
					    new MemberListElement (
						"e40",
						1
					    ),
					    new MemberListElement (
						"e50",
						2
					    ),
					    new MemberListElement (
						"e70",
						3
					    ),
					    new MemberListElement (
						"e100",
						4
					    )
					}
				    ),
				    0,
				    IP_Spacing_TDD.e30
				)
			    ),
			    "ip-Spacing-TDD",
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
					    new com.oss.asn1.INTEGER(14),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(14)
				    ),
				    null
				)
			    ),
			    "ip-slot",
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
					    new com.oss.asn1.INTEGER(4095),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(4095)
				    ),
				    null
				)
			    ),
			    "ip-Start",
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IP_PCCPCH_r4"
				    ),
				    new QName (
					"InformationElements",
					"IP-PCCPCH-r4"
				    ),
				    12314,
				    null
				)
			    ),
			    "ip-PCCPCG",
			    3,
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
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo"
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
				"UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo$Fdd"
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
				"UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo$Tdd"
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

    // Methods for field "burstModeParameters"
    public BurstModeParameters getBurstModeParameters()
    {
	return (BurstModeParameters)mComponents[1];
    }
    
    public void setBurstModeParameters(BurstModeParameters burstModeParameters)
    {
	mComponents[1] = burstModeParameters;
    }
    
    public boolean hasBurstModeParameters()
    {
	return componentIsPresent(1);
    }
    
    public void deleteBurstModeParameters()
    {
	setComponentAbsent(1);
    }
    
    
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
	    "UE_Positioning_IPDL_Parameters_r4"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-IPDL-Parameters-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_IPDL_Parameters_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
				"BurstModeParameters"
			    ),
			    new QName (
				"InformationElements",
				"BurstModeParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "BurstModeParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "BurstModeParameters"
				)
			    ),
			    0
			)
		    ),
		    "burstModeParameters",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_IPDL_Parameters_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_IPDL_Parameters_r4
