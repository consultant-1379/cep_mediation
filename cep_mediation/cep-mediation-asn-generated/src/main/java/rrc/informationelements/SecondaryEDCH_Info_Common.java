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
 * Define the ASN1 Type SecondaryEDCH_Info_Common from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryEDCH_Info_Common extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryEDCH_Info_Common()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryEDCH_Info_Common(FrequencyInfo frequencyInfo, 
		    ScramblingCodeType scramblingCodeType, 
		    UL_ScramblingCode scramblingCodeNumber, 
		    BitString ms2_SchedTransmGrantHARQAlloc, 
		    ServingGrant servingGrant, 
		    MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor, 
		    E_DCH_MinimumSet_E_TFCI e_DCH_minimumSet_E_TFCI, 
		    INTEGER dpcchPowerOffset_SecondaryULFrequency, 
		    PC_Preamble pc_Preamble)
    {
	setFrequencyInfo(frequencyInfo);
	setScramblingCodeType(scramblingCodeType);
	setScramblingCodeNumber(scramblingCodeNumber);
	setMs2_SchedTransmGrantHARQAlloc(ms2_SchedTransmGrantHARQAlloc);
	setServingGrant(servingGrant);
	setMinReduced_E_DPDCH_GainFactor(minReduced_E_DPDCH_GainFactor);
	setE_DCH_minimumSet_E_TFCI(e_DCH_minimumSet_E_TFCI);
	setDpcchPowerOffset_SecondaryULFrequency(dpcchPowerOffset_SecondaryULFrequency);
	setPc_Preamble(pc_Preamble);
    }
    
    /**
     * Construct with components.
     */
    public SecondaryEDCH_Info_Common(FrequencyInfo frequencyInfo, 
		    ScramblingCodeType scramblingCodeType, 
		    UL_ScramblingCode scramblingCodeNumber, 
		    BitString ms2_SchedTransmGrantHARQAlloc, 
		    ServingGrant servingGrant, 
		    MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor, 
		    E_DCH_MinimumSet_E_TFCI e_DCH_minimumSet_E_TFCI, 
		    long dpcchPowerOffset_SecondaryULFrequency, 
		    PC_Preamble pc_Preamble)
    {
	this(frequencyInfo, scramblingCodeType, scramblingCodeNumber, 
	     ms2_SchedTransmGrantHARQAlloc, servingGrant, 
	     minReduced_E_DPDCH_GainFactor, e_DCH_minimumSet_E_TFCI, 
	     new INTEGER(dpcchPowerOffset_SecondaryULFrequency), 
	     pc_Preamble);
    }
    
    /**
     * Construct with required components.
     */
    public SecondaryEDCH_Info_Common(FrequencyInfo frequencyInfo, 
		    ScramblingCodeType scramblingCodeType, 
		    UL_ScramblingCode scramblingCodeNumber, 
		    long dpcchPowerOffset_SecondaryULFrequency, 
		    PC_Preamble pc_Preamble)
    {
	setFrequencyInfo(frequencyInfo);
	setScramblingCodeType(scramblingCodeType);
	setScramblingCodeNumber(scramblingCodeNumber);
	setDpcchPowerOffset_SecondaryULFrequency(dpcchPowerOffset_SecondaryULFrequency);
	setPc_Preamble(pc_Preamble);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FrequencyInfo();
	mComponents[1] = ScramblingCodeType.shortSC;
	mComponents[2] = new UL_ScramblingCode();
	mComponents[3] = new BitString();
	mComponents[4] = new ServingGrant();
	mComponents[5] = MinReduced_E_DPDCH_GainFactor.m8_15;
	mComponents[6] = new E_DCH_MinimumSet_E_TFCI();
	mComponents[7] = new INTEGER();
	mComponents[8] = new PC_Preamble();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new FrequencyInfo();
	    case 1:
		return ScramblingCodeType.shortSC;
	    case 2:
		return new UL_ScramblingCode();
	    case 3:
		return new BitString();
	    case 4:
		return new ServingGrant();
	    case 5:
		return MinReduced_E_DPDCH_GainFactor.m8_15;
	    case 6:
		return new E_DCH_MinimumSet_E_TFCI();
	    case 7:
		return new INTEGER();
	    case 8:
		return new PC_Preamble();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "frequencyInfo"
    public FrequencyInfo getFrequencyInfo()
    {
	return (FrequencyInfo)mComponents[0];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[0] = frequencyInfo;
    }
    
    
    // Methods for field "scramblingCodeType"
    public ScramblingCodeType getScramblingCodeType()
    {
	return (ScramblingCodeType)mComponents[1];
    }
    
    public void setScramblingCodeType(ScramblingCodeType scramblingCodeType)
    {
	mComponents[1] = scramblingCodeType;
    }
    
    
    // Methods for field "scramblingCodeNumber"
    public UL_ScramblingCode getScramblingCodeNumber()
    {
	return (UL_ScramblingCode)mComponents[2];
    }
    
    public void setScramblingCodeNumber(UL_ScramblingCode scramblingCodeNumber)
    {
	mComponents[2] = scramblingCodeNumber;
    }
    
    
    // Methods for field "ms2_SchedTransmGrantHARQAlloc"
    public BitString getMs2_SchedTransmGrantHARQAlloc()
    {
	return (BitString)mComponents[3];
    }
    
    public void setMs2_SchedTransmGrantHARQAlloc(BitString ms2_SchedTransmGrantHARQAlloc)
    {
	mComponents[3] = ms2_SchedTransmGrantHARQAlloc;
    }
    
    public boolean hasMs2_SchedTransmGrantHARQAlloc()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMs2_SchedTransmGrantHARQAlloc()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "servingGrant"
    public ServingGrant getServingGrant()
    {
	return (ServingGrant)mComponents[4];
    }
    
    public void setServingGrant(ServingGrant servingGrant)
    {
	mComponents[4] = servingGrant;
    }
    
    public boolean hasServingGrant()
    {
	return componentIsPresent(4);
    }
    
    public void deleteServingGrant()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type ServingGrant from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class ServingGrant extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public ServingGrant()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public ServingGrant(Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    setPrimary_Secondary_GrantSelector(primary_Secondary_GrantSelector);
	}
	
	public void initComponents()
	{
	    mComponents[0] = Primary_Secondary_GrantSelector.primary;
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[1];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return Primary_Secondary_GrantSelector.primary;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "primary_Secondary_GrantSelector"
	public Primary_Secondary_GrantSelector getPrimary_Secondary_GrantSelector()
	{
	    return (Primary_Secondary_GrantSelector)mComponents[0];
	}
	
	public void setPrimary_Secondary_GrantSelector(Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    mComponents[0] = primary_Secondary_GrantSelector;
	}
	
	
	
	/**
	 * Define the ASN1 Type Primary_Secondary_GrantSelector from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Primary_Secondary_GrantSelector extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Primary_Secondary_GrantSelector()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Primary_Secondary_GrantSelector(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Primary_Secondary_GrantSelector primary =
		new Primary_Secondary_GrantSelector(0);
	    public static final Primary_Secondary_GrantSelector secondary =
		new Primary_Secondary_GrantSelector(1);
	    private final static Primary_Secondary_GrantSelector cNamedNumbers[] = {
		 primary, 
		 secondary
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
	    
	    public static Primary_Secondary_GrantSelector valueOf(long value)
	    {
		return (Primary_Secondary_GrantSelector)primary.lookupValue(value);
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
		new Tags (
		    new short[] {
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "SecondaryEDCH_Info_Common$ServingGrant$Primary_Secondary_GrantSelector"
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
			    "primary",
			    0
			),
			new MemberListElement (
			    "secondary",
			    1
			)
		    }
		),
		0,
		primary
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Primary_Secondary_GrantSelector

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
		"SecondaryEDCH_Info_Common$ServingGrant"
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
				"SecondaryEDCH_Info_Common$ServingGrant$Primary_Secondary_GrantSelector"
			    )
			),
			"primary-Secondary-GrantSelector",
			0,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ServingGrant

    // Methods for field "minReduced_E_DPDCH_GainFactor"
    public MinReduced_E_DPDCH_GainFactor getMinReduced_E_DPDCH_GainFactor()
    {
	return (MinReduced_E_DPDCH_GainFactor)mComponents[5];
    }
    
    public void setMinReduced_E_DPDCH_GainFactor(MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor)
    {
	mComponents[5] = minReduced_E_DPDCH_GainFactor;
    }
    
    public boolean hasMinReduced_E_DPDCH_GainFactor()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMinReduced_E_DPDCH_GainFactor()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "e_DCH_minimumSet_E_TFCI"
    public E_DCH_MinimumSet_E_TFCI getE_DCH_minimumSet_E_TFCI()
    {
	return (E_DCH_MinimumSet_E_TFCI)mComponents[6];
    }
    
    public void setE_DCH_minimumSet_E_TFCI(E_DCH_MinimumSet_E_TFCI e_DCH_minimumSet_E_TFCI)
    {
	mComponents[6] = e_DCH_minimumSet_E_TFCI;
    }
    
    public boolean hasE_DCH_minimumSet_E_TFCI()
    {
	return componentIsPresent(6);
    }
    
    public void deleteE_DCH_minimumSet_E_TFCI()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "dpcchPowerOffset_SecondaryULFrequency"
    public long getDpcchPowerOffset_SecondaryULFrequency()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setDpcchPowerOffset_SecondaryULFrequency(long dpcchPowerOffset_SecondaryULFrequency)
    {
	setDpcchPowerOffset_SecondaryULFrequency(new INTEGER(dpcchPowerOffset_SecondaryULFrequency));
    }
    
    public void setDpcchPowerOffset_SecondaryULFrequency(INTEGER dpcchPowerOffset_SecondaryULFrequency)
    {
	mComponents[7] = dpcchPowerOffset_SecondaryULFrequency;
    }
    
    
    // Methods for field "pc_Preamble"
    public PC_Preamble getPc_Preamble()
    {
	return (PC_Preamble)mComponents[8];
    }
    
    public void setPc_Preamble(PC_Preamble pc_Preamble)
    {
	mComponents[8] = pc_Preamble;
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
	    "SecondaryEDCH_Info_Common"
	),
	new QName (
	    "InformationElements",
	    "SecondaryEDCH-Info-Common"
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
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
				"ScramblingCodeType"
			    ),
			    new QName (
				"InformationElements",
				"ScramblingCodeType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"shortSC",
					0
				    ),
				    new MemberListElement (
					"longSC",
					1
				    )
				}
			    ),
			    0,
			    ScramblingCodeType.shortSC
			)
		    ),
		    "scramblingCodeType",
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
				"UL_ScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"UL-ScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UL_ScramblingCode(0), 
				    new UL_ScramblingCode(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "scramblingCodeNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ms2-SchedTransmGrantHARQAlloc",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryEDCH_Info_Common$ServingGrant"
			)
		    ),
		    "servingGrant",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MinReduced_E_DPDCH_GainFactor"
			    ),
			    new QName (
				"InformationElements",
				"MinReduced-E-DPDCH-GainFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"m8-15",
					0
				    ),
				    new MemberListElement (
					"m11-15",
					1
				    ),
				    new MemberListElement (
					"m15-15",
					2
				    ),
				    new MemberListElement (
					"m21-15",
					3
				    ),
				    new MemberListElement (
					"m30-15",
					4
				    ),
				    new MemberListElement (
					"m42-15",
					5
				    ),
				    new MemberListElement (
					"m60-15",
					6
				    ),
				    new MemberListElement (
					"m84-15",
					7
				    )
				}
			    ),
			    0,
			    MinReduced_E_DPDCH_GainFactor.m8_15
			)
		    ),
		    "minReduced-E-DPDCH-GainFactor",
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
				"E_DCH_MinimumSet_E_TFCI"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MinimumSet-E-TFCI"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MinimumSet_E_TFCI(0), 
				    new E_DCH_MinimumSet_E_TFCI(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "e-DCH-minimumSet-E-TFCI",
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
				    new com.oss.asn1.INTEGER(7),
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
		    "dpcchPowerOffset-SecondaryULFrequency",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    8,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SecondaryEDCH_Info_Common object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryEDCH_Info_Common object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryEDCH_Info_Common
