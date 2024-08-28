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
 * Define the ASN1 Type IndividualTimeslotInfo_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class IndividualTimeslotInfo_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualTimeslotInfo_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualTimeslotInfo_LCR_r4(TimeslotNumber_LCR_r4 timeslotNumber, 
		    BOOLEAN tfci_Existence, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    Modulation modulation, Ss_TPC_Symbols ss_TPC_Symbols, 
		    INTEGER additionalSS_TPC_Symbols)
    {
	setTimeslotNumber(timeslotNumber);
	setTfci_Existence(tfci_Existence);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	setModulation(modulation);
	setSs_TPC_Symbols(ss_TPC_Symbols);
	setAdditionalSS_TPC_Symbols(additionalSS_TPC_Symbols);
    }
    
    /**
     * Construct with components.
     */
    public IndividualTimeslotInfo_LCR_r4(TimeslotNumber_LCR_r4 timeslotNumber, 
		    boolean tfci_Existence, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    Modulation modulation, Ss_TPC_Symbols ss_TPC_Symbols, 
		    long additionalSS_TPC_Symbols)
    {
	this(timeslotNumber, new BOOLEAN(tfci_Existence), 
	     midambleShiftAndBurstType, modulation, ss_TPC_Symbols, 
	     new INTEGER(additionalSS_TPC_Symbols));
    }
    
    /**
     * Construct with required components.
     */
    public IndividualTimeslotInfo_LCR_r4(TimeslotNumber_LCR_r4 timeslotNumber, 
		    boolean tfci_Existence, 
		    MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType, 
		    Modulation modulation, Ss_TPC_Symbols ss_TPC_Symbols)
    {
	setTimeslotNumber(timeslotNumber);
	setTfci_Existence(tfci_Existence);
	setMidambleShiftAndBurstType(midambleShiftAndBurstType);
	setModulation(modulation);
	setSs_TPC_Symbols(ss_TPC_Symbols);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeslotNumber_LCR_r4();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new MidambleShiftAndBurstType_LCR_r4();
	mComponents[3] = Modulation.mod_QPSK;
	mComponents[4] = Ss_TPC_Symbols.zero;
	mComponents[5] = new INTEGER();
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
		return new TimeslotNumber_LCR_r4();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new MidambleShiftAndBurstType_LCR_r4();
	    case 3:
		return Modulation.mod_QPSK;
	    case 4:
		return Ss_TPC_Symbols.zero;
	    case 5:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeslotNumber"
    public TimeslotNumber_LCR_r4 getTimeslotNumber()
    {
	return (TimeslotNumber_LCR_r4)mComponents[0];
    }
    
    public void setTimeslotNumber(TimeslotNumber_LCR_r4 timeslotNumber)
    {
	mComponents[0] = timeslotNumber;
    }
    
    
    // Methods for field "tfci_Existence"
    public boolean getTfci_Existence()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setTfci_Existence(boolean tfci_Existence)
    {
	setTfci_Existence(new BOOLEAN(tfci_Existence));
    }
    
    public void setTfci_Existence(BOOLEAN tfci_Existence)
    {
	mComponents[1] = tfci_Existence;
    }
    
    
    // Methods for field "midambleShiftAndBurstType"
    public MidambleShiftAndBurstType_LCR_r4 getMidambleShiftAndBurstType()
    {
	return (MidambleShiftAndBurstType_LCR_r4)mComponents[2];
    }
    
    public void setMidambleShiftAndBurstType(MidambleShiftAndBurstType_LCR_r4 midambleShiftAndBurstType)
    {
	mComponents[2] = midambleShiftAndBurstType;
    }
    
    
    // Methods for field "modulation"
    public Modulation getModulation()
    {
	return (Modulation)mComponents[3];
    }
    
    public void setModulation(Modulation modulation)
    {
	mComponents[3] = modulation;
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
	public static final Modulation mod_QPSK =
	    new Modulation(0);
	public static final Modulation mod_8PSK =
	    new Modulation(1);
	private final static Modulation cNamedNumbers[] = {
	     mod_QPSK, 
	     mod_8PSK
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
	    return (Modulation)mod_QPSK.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IndividualTimeslotInfo_LCR_r4$Modulation"
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
			"mod-QPSK",
			0
		    ),
		    new MemberListElement (
			"mod-8PSK",
			1
		    )
		}
	    ),
	    0,
	    mod_QPSK
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

    // Methods for field "ss_TPC_Symbols"
    public Ss_TPC_Symbols getSs_TPC_Symbols()
    {
	return (Ss_TPC_Symbols)mComponents[4];
    }
    
    public void setSs_TPC_Symbols(Ss_TPC_Symbols ss_TPC_Symbols)
    {
	mComponents[4] = ss_TPC_Symbols;
    }
    
    
    
    /**
     * Define the ASN1 Type Ss_TPC_Symbols from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Ss_TPC_Symbols extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Ss_TPC_Symbols()
	{
	    super(cFirstNumber);
	}
	
	protected Ss_TPC_Symbols(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Ss_TPC_Symbols zero =
	    new Ss_TPC_Symbols(0);
	public static final Ss_TPC_Symbols one =
	    new Ss_TPC_Symbols(1);
	public static final Ss_TPC_Symbols sixteenOverSF =
	    new Ss_TPC_Symbols(2);
	private final static Ss_TPC_Symbols cNamedNumbers[] = {
	     zero, 
	     one, 
	     sixteenOverSF
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
	
	public static Ss_TPC_Symbols valueOf(long value)
	{
	    return (Ss_TPC_Symbols)zero.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IndividualTimeslotInfo_LCR_r4$Ss_TPC_Symbols"
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
			"zero",
			0
		    ),
		    new MemberListElement (
			"one",
			1
		    ),
		    new MemberListElement (
			"sixteenOverSF",
			2
		    )
		}
	    ),
	    0,
	    zero
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Ss_TPC_Symbols object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ss_TPC_Symbols object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ss_TPC_Symbols

    // Methods for field "additionalSS_TPC_Symbols"
    public long getAdditionalSS_TPC_Symbols()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setAdditionalSS_TPC_Symbols(long additionalSS_TPC_Symbols)
    {
	setAdditionalSS_TPC_Symbols(new INTEGER(additionalSS_TPC_Symbols));
    }
    
    public void setAdditionalSS_TPC_Symbols(INTEGER additionalSS_TPC_Symbols)
    {
	mComponents[5] = additionalSS_TPC_Symbols;
    }
    
    public boolean hasAdditionalSS_TPC_Symbols()
    {
	return componentIsPresent(5);
    }
    
    public void deleteAdditionalSS_TPC_Symbols()
    {
	setComponentAbsent(5);
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
	    "IndividualTimeslotInfo_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "IndividualTimeslotInfo-LCR-r4"
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
				"TimeslotNumber_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"TimeslotNumber-LCR-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TimeslotNumber_LCR_r4(0), 
				    new TimeslotNumber_LCR_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "timeslotNumber",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "tfci-Existence",
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
				"MidambleShiftAndBurstType_LCR_r4"
			    ),
			    new QName (
				"InformationElements",
				"MidambleShiftAndBurstType-LCR-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MidambleShiftAndBurstType_LCR_r4"
				)
			    ),
			    0
			)
		    ),
		    "midambleShiftAndBurstType",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IndividualTimeslotInfo_LCR_r4$Modulation"
			)
		    ),
		    "modulation",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "IndividualTimeslotInfo_LCR_r4$Ss_TPC_Symbols"
			)
		    ),
		    "ss-TPC-Symbols",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "additionalSS-TPC-Symbols",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IndividualTimeslotInfo_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualTimeslotInfo_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualTimeslotInfo_LCR_r4
