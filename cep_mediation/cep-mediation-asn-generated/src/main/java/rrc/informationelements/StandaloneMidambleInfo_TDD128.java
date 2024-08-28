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
 * Define the ASN1 Type StandaloneMidambleInfo_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class StandaloneMidambleInfo_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public StandaloneMidambleInfo_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public StandaloneMidambleInfo_TDD128(INTEGER midambleConfiguration, 
		    INTEGER midambleShift, BitString timeSlotInformation, 
		    ActivationTime activationTime, INTEGER subframeNum, 
		    RepetitionPeriod repetitionPeriod, INTEGER referenceBeta)
    {
	setMidambleConfiguration(midambleConfiguration);
	setMidambleShift(midambleShift);
	setTimeSlotInformation(timeSlotInformation);
	setActivationTime(activationTime);
	setSubframeNum(subframeNum);
	setRepetitionPeriod(repetitionPeriod);
	setReferenceBeta(referenceBeta);
    }
    
    /**
     * Construct with components.
     */
    public StandaloneMidambleInfo_TDD128(long midambleConfiguration, 
		    long midambleShift, BitString timeSlotInformation, 
		    ActivationTime activationTime, long subframeNum, 
		    RepetitionPeriod repetitionPeriod, long referenceBeta)
    {
	this(new INTEGER(midambleConfiguration), new INTEGER(midambleShift), 
	     timeSlotInformation, activationTime, new INTEGER(subframeNum), 
	     repetitionPeriod, new INTEGER(referenceBeta));
    }
    
    /**
     * Construct with required components.
     */
    public StandaloneMidambleInfo_TDD128(long midambleConfiguration, 
		    long midambleShift, BitString timeSlotInformation, 
		    ActivationTime activationTime, long subframeNum, 
		    RepetitionPeriod repetitionPeriod)
    {
	setMidambleConfiguration(midambleConfiguration);
	setMidambleShift(midambleShift);
	setTimeSlotInformation(timeSlotInformation);
	setActivationTime(activationTime);
	setSubframeNum(subframeNum);
	setRepetitionPeriod(repetitionPeriod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new BitString();
	mComponents[3] = new ActivationTime();
	mComponents[4] = new INTEGER();
	mComponents[5] = RepetitionPeriod.v1;
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
		return new INTEGER();
	    case 2:
		return new BitString();
	    case 3:
		return new ActivationTime();
	    case 4:
		return new INTEGER();
	    case 5:
		return RepetitionPeriod.v1;
	    case 6:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "midambleConfiguration"
    public long getMidambleConfiguration()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMidambleConfiguration(long midambleConfiguration)
    {
	setMidambleConfiguration(new INTEGER(midambleConfiguration));
    }
    
    public void setMidambleConfiguration(INTEGER midambleConfiguration)
    {
	mComponents[0] = midambleConfiguration;
    }
    
    
    // Methods for field "midambleShift"
    public long getMidambleShift()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMidambleShift(long midambleShift)
    {
	setMidambleShift(new INTEGER(midambleShift));
    }
    
    public void setMidambleShift(INTEGER midambleShift)
    {
	mComponents[1] = midambleShift;
    }
    
    
    // Methods for field "timeSlotInformation"
    public BitString getTimeSlotInformation()
    {
	return (BitString)mComponents[2];
    }
    
    public void setTimeSlotInformation(BitString timeSlotInformation)
    {
	mComponents[2] = timeSlotInformation;
    }
    
    
    // Methods for field "activationTime"
    public ActivationTime getActivationTime()
    {
	return (ActivationTime)mComponents[3];
    }
    
    public void setActivationTime(ActivationTime activationTime)
    {
	mComponents[3] = activationTime;
    }
    
    
    // Methods for field "subframeNum"
    public long getSubframeNum()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setSubframeNum(long subframeNum)
    {
	setSubframeNum(new INTEGER(subframeNum));
    }
    
    public void setSubframeNum(INTEGER subframeNum)
    {
	mComponents[4] = subframeNum;
    }
    
    
    // Methods for field "repetitionPeriod"
    public RepetitionPeriod getRepetitionPeriod()
    {
	return (RepetitionPeriod)mComponents[5];
    }
    
    public void setRepetitionPeriod(RepetitionPeriod repetitionPeriod)
    {
	mComponents[5] = repetitionPeriod;
    }
    
    
    
    /**
     * Define the ASN1 Type RepetitionPeriod from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class RepetitionPeriod extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private RepetitionPeriod()
	{
	    super(cFirstNumber);
	}
	
	protected RepetitionPeriod(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final RepetitionPeriod v1 =
	    new RepetitionPeriod(0);
	public static final RepetitionPeriod v2 =
	    new RepetitionPeriod(1);
	public static final RepetitionPeriod v4 =
	    new RepetitionPeriod(2);
	public static final RepetitionPeriod v8 =
	    new RepetitionPeriod(3);
	public static final RepetitionPeriod v16 =
	    new RepetitionPeriod(4);
	public static final RepetitionPeriod v32 =
	    new RepetitionPeriod(5);
	public static final RepetitionPeriod v64 =
	    new RepetitionPeriod(6);
	public static final RepetitionPeriod spare =
	    new RepetitionPeriod(7);
	private final static RepetitionPeriod cNamedNumbers[] = {
	     v1, 
	     v2, 
	     v4, 
	     v8, 
	     v16, 
	     v32, 
	     v64, 
	     spare
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
	
	public static RepetitionPeriod valueOf(long value)
	{
	    return (RepetitionPeriod)v1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"StandaloneMidambleInfo_TDD128$RepetitionPeriod"
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
			"v1",
			0
		    ),
		    new MemberListElement (
			"v2",
			1
		    ),
		    new MemberListElement (
			"v4",
			2
		    ),
		    new MemberListElement (
			"v8",
			3
		    ),
		    new MemberListElement (
			"v16",
			4
		    ),
		    new MemberListElement (
			"v32",
			5
		    ),
		    new MemberListElement (
			"v64",
			6
		    ),
		    new MemberListElement (
			"spare",
			7
		    )
		}
	    ),
	    0,
	    v1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RepetitionPeriod object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RepetitionPeriod object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RepetitionPeriod

    // Methods for field "referenceBeta"
    public long getReferenceBeta()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setReferenceBeta(long referenceBeta)
    {
	setReferenceBeta(new INTEGER(referenceBeta));
    }
    
    public void setReferenceBeta(INTEGER referenceBeta)
    {
	mComponents[6] = referenceBeta;
    }
    
    public boolean hasReferenceBeta()
    {
	return componentIsPresent(6);
    }
    
    public void deleteReferenceBeta()
    {
	setComponentAbsent(6);
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
	    "StandaloneMidambleInfo_TDD128"
	),
	new QName (
	    "InformationElements",
	    "StandaloneMidambleInfo-TDD128"
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
		    "midambleConfiguration",
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
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "midambleShift",
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
		    "timeSlotInformation",
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
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "StandaloneMidambleInfo_TDD128$RepetitionPeriod"
			)
		    ),
		    "repetitionPeriod",
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
				    new com.oss.asn1.INTEGER(-15), 
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-15),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "referenceBeta",
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
     * Get the type descriptor (TypeInfo) of 'this' StandaloneMidambleInfo_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' StandaloneMidambleInfo_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for StandaloneMidambleInfo_TDD128
