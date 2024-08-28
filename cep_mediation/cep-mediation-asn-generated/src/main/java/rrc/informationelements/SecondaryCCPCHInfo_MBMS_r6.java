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
 * Define the ASN1 Type SecondaryCCPCHInfo_MBMS_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SecondaryCCPCHInfo_MBMS_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecondaryCCPCHInfo_MBMS_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecondaryCCPCHInfo_MBMS_r6(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ModeSpecificInfo();
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
		return new ModeSpecificInfo();
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
	public static final  int  tdd384_chosen = 2;
	public static final  int  tdd128_chosen = 3;
	
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
	    public Fdd(SecondaryScramblingCode secondaryScramblingCode, 
			    BOOLEAN sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber, 
			    TimingOffset timingOffset)
	    {
		setSecondaryScramblingCode(secondaryScramblingCode);
		setSttd_Indicator(sttd_Indicator);
		setSf_AndCodeNumber(sf_AndCodeNumber);
		setTimingOffset(timingOffset);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(SecondaryScramblingCode secondaryScramblingCode, 
			    boolean sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber, 
			    TimingOffset timingOffset)
	    {
		this(secondaryScramblingCode, new BOOLEAN(sttd_Indicator), 
		     sf_AndCodeNumber, timingOffset);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(boolean sttd_Indicator, 
			    SF256_AndCodeNumber sf_AndCodeNumber)
	    {
		setSttd_Indicator(sttd_Indicator);
		setSf_AndCodeNumber(sf_AndCodeNumber);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new SecondaryScramblingCode();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new SF256_AndCodeNumber();
		mComponents[3] = new TimingOffset();
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
			return new SecondaryScramblingCode();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new SF256_AndCodeNumber();
		    case 3:
			return new TimingOffset();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final TimingOffset timingOffset__default = 
		new TimingOffset(0);
	    
	    // Methods for field "secondaryScramblingCode"
	    public SecondaryScramblingCode getSecondaryScramblingCode()
	    {
		return (SecondaryScramblingCode)mComponents[0];
	    }
	    
	    public void setSecondaryScramblingCode(SecondaryScramblingCode secondaryScramblingCode)
	    {
		mComponents[0] = secondaryScramblingCode;
	    }
	    
	    public boolean hasSecondaryScramblingCode()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteSecondaryScramblingCode()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "sttd_Indicator"
	    public boolean getSttd_Indicator()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setSttd_Indicator(boolean sttd_Indicator)
	    {
		setSttd_Indicator(new BOOLEAN(sttd_Indicator));
	    }
	    
	    public void setSttd_Indicator(BOOLEAN sttd_Indicator)
	    {
		mComponents[1] = sttd_Indicator;
	    }
	    
	    
	    // Methods for field "sf_AndCodeNumber"
	    public SF256_AndCodeNumber getSf_AndCodeNumber()
	    {
		return (SF256_AndCodeNumber)mComponents[2];
	    }
	    
	    public void setSf_AndCodeNumber(SF256_AndCodeNumber sf_AndCodeNumber)
	    {
		mComponents[2] = sf_AndCodeNumber;
	    }
	    
	    
	    // Methods for field "timingOffset"
	    public TimingOffset getTimingOffset()
	    {
		if (hasTimingOffset())
		    return (TimingOffset)mComponents[3];
		else
		    return (TimingOffset)timingOffset__default.clone();
	    }
	    
	    public void setTimingOffset(TimingOffset timingOffset)
	    {
		mComponents[3] = timingOffset;
	    }
	    
	    public void setTimingOffsetToDefault()
	    {
		setTimingOffset(timingOffset__default);
	    }
	    
	    public boolean hasDefaultTimingOffset()
	    {
		return true;
	    }
	    
	    public boolean hasTimingOffset()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteTimingOffset()
	    {
		setComponentAbsent(3);
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
		    "SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Fdd"
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
					"SecondaryScramblingCode"
				    ),
				    new QName (
					"InformationElements",
					"SecondaryScramblingCode"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new SecondaryScramblingCode(1), 
					    new SecondaryScramblingCode(15),
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
			    "secondaryScramblingCode",
			    0,
			    3,
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
			    "sttd-Indicator",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SF256_AndCodeNumber"
				    ),
				    new QName (
					"InformationElements",
					"SF256-AndCodeNumber"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SF256_AndCodeNumber"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2),
					    new TagDecoderElement((short)0x8003, 3),
					    new TagDecoderElement((short)0x8004, 4),
					    new TagDecoderElement((short)0x8005, 5),
					    new TagDecoderElement((short)0x8006, 6)
					}
				    )
				)
			    ),
			    "sf-AndCodeNumber",
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
					"TimingOffset"
				    ),
				    new QName (
					"InformationElements",
					"TimingOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TimingOffset(0), 
					    new TimingOffset(149),
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
			    "timingOffset",
			    3,
			    3,
			    timingOffset__default
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

	// Methods for field "tdd384"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd384(Tdd384 tdd384)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd384(CommonTimeslotInfoMBMS commonTimeslotInfoMBMS, 
			    DownlinkTimeslotsCodes downlinkTimeslotsCodes)
	    {
		setCommonTimeslotInfoMBMS(commonTimeslotInfoMBMS);
		setDownlinkTimeslotsCodes(downlinkTimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CommonTimeslotInfoMBMS();
		mComponents[1] = new DownlinkTimeslotsCodes();
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
			return new CommonTimeslotInfoMBMS();
		    case 1:
			return new DownlinkTimeslotsCodes();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "commonTimeslotInfoMBMS"
	    public CommonTimeslotInfoMBMS getCommonTimeslotInfoMBMS()
	    {
		return (CommonTimeslotInfoMBMS)mComponents[0];
	    }
	    
	    public void setCommonTimeslotInfoMBMS(CommonTimeslotInfoMBMS commonTimeslotInfoMBMS)
	    {
		mComponents[0] = commonTimeslotInfoMBMS;
	    }
	    
	    
	    // Methods for field "downlinkTimeslotsCodes"
	    public DownlinkTimeslotsCodes getDownlinkTimeslotsCodes()
	    {
		return (DownlinkTimeslotsCodes)mComponents[1];
	    }
	    
	    public void setDownlinkTimeslotsCodes(DownlinkTimeslotsCodes downlinkTimeslotsCodes)
	    {
		mComponents[1] = downlinkTimeslotsCodes;
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
		    "SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Tdd384"
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
					"CommonTimeslotInfoMBMS"
				    ),
				    new QName (
					"InformationElements",
					"CommonTimeslotInfoMBMS"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoMBMS"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoMBMS"
					)
				    ),
				    0
				)
			    ),
			    "commonTimeslotInfoMBMS",
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
					"DownlinkTimeslotsCodes"
				    ),
				    new QName (
					"InformationElements",
					"DownlinkTimeslotsCodes"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DownlinkTimeslotsCodes"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DownlinkTimeslotsCodes"
					)
				    ),
				    0
				)
			    ),
			    "downlinkTimeslotsCodes",
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

	// Methods for field "tdd128"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd128(Tdd128 tdd128)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

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
	    public Tdd128(CommonTimeslotInfoMBMS commonTimeslotInfoMBMS, 
			    DownlinkTimeslotsCodes_LCR_r4 downlinkTimeslotsCodes)
	    {
		setCommonTimeslotInfoMBMS(commonTimeslotInfoMBMS);
		setDownlinkTimeslotsCodes(downlinkTimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CommonTimeslotInfoMBMS();
		mComponents[1] = new DownlinkTimeslotsCodes_LCR_r4();
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
			return new CommonTimeslotInfoMBMS();
		    case 1:
			return new DownlinkTimeslotsCodes_LCR_r4();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "commonTimeslotInfoMBMS"
	    public CommonTimeslotInfoMBMS getCommonTimeslotInfoMBMS()
	    {
		return (CommonTimeslotInfoMBMS)mComponents[0];
	    }
	    
	    public void setCommonTimeslotInfoMBMS(CommonTimeslotInfoMBMS commonTimeslotInfoMBMS)
	    {
		mComponents[0] = commonTimeslotInfoMBMS;
	    }
	    
	    
	    // Methods for field "downlinkTimeslotsCodes"
	    public DownlinkTimeslotsCodes_LCR_r4 getDownlinkTimeslotsCodes()
	    {
		return (DownlinkTimeslotsCodes_LCR_r4)mComponents[1];
	    }
	    
	    public void setDownlinkTimeslotsCodes(DownlinkTimeslotsCodes_LCR_r4 downlinkTimeslotsCodes)
	    {
		mComponents[1] = downlinkTimeslotsCodes;
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
		    "SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Tdd128"
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
					"CommonTimeslotInfoMBMS"
				    ),
				    new QName (
					"InformationElements",
					"CommonTimeslotInfoMBMS"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoMBMS"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CommonTimeslotInfoMBMS"
					)
				    ),
				    0
				)
			    ),
			    "commonTimeslotInfoMBMS",
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
					"DownlinkTimeslotsCodes_LCR_r4"
				    ),
				    new QName (
					"InformationElements",
					"DownlinkTimeslotsCodes-LCR-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DownlinkTimeslotsCodes_LCR_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DownlinkTimeslotsCodes_LCR_r4"
					)
				    ),
				    0
				)
			    ),
			    "downlinkTimeslotsCodes",
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
		case fdd_chosen:
		    return new Fdd();
		case tdd384_chosen:
		    return new Tdd384();
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
		"SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo"
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
				"SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Fdd"
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
				"SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Tdd384"
			    )
			),
			"tdd384",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo$Tdd128"
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
	    "SecondaryCCPCHInfo_MBMS_r6"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCCPCHInfo-MBMS-r6"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryCCPCHInfo_MBMS_r6$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCCPCHInfo_MBMS_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCCPCHInfo_MBMS_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCCPCHInfo_MBMS_r6
