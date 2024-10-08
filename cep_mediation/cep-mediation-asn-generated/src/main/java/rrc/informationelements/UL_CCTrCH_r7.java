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
 * Define the ASN1 Type UL_CCTrCH_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_CCTrCH_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_CCTrCH_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_CCTrCH_r7(TFCS_IdentityPlain tfcs_ID, UL_TargetSIR ul_TargetSIR, 
		    TimeInfo timeInfo, CommonTimeslotInfo commonTimeslotInfo, 
		    TddOption tddOption)
    {
	setTfcs_ID(tfcs_ID);
	setUl_TargetSIR(ul_TargetSIR);
	setTimeInfo(timeInfo);
	setCommonTimeslotInfo(commonTimeslotInfo);
	setTddOption(tddOption);
    }
    
    /**
     * Construct with required components.
     */
    public UL_CCTrCH_r7(UL_TargetSIR ul_TargetSIR, TimeInfo timeInfo, 
		    TddOption tddOption)
    {
	setUl_TargetSIR(ul_TargetSIR);
	setTimeInfo(timeInfo);
	setTddOption(tddOption);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new UL_TargetSIR();
	mComponents[2] = new TimeInfo();
	mComponents[3] = new CommonTimeslotInfo();
	mComponents[4] = new TddOption();
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
		return new TFCS_IdentityPlain();
	    case 1:
		return new UL_TargetSIR();
	    case 2:
		return new TimeInfo();
	    case 3:
		return new CommonTimeslotInfo();
	    case 4:
		return new TddOption();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final TFCS_IdentityPlain tfcs_ID__default = 
	new TFCS_IdentityPlain(1);
    
    // Methods for field "tfcs_ID"
    public TFCS_IdentityPlain getTfcs_ID()
    {
	if (hasTfcs_ID())
	    return (TFCS_IdentityPlain)mComponents[0];
	else
	    return (TFCS_IdentityPlain)tfcs_ID__default.clone();
    }
    
    public void setTfcs_ID(TFCS_IdentityPlain tfcs_ID)
    {
	mComponents[0] = tfcs_ID;
    }
    
    public void setTfcs_IDToDefault()
    {
	setTfcs_ID(tfcs_ID__default);
    }
    
    public boolean hasDefaultTfcs_ID()
    {
	return true;
    }
    
    public boolean hasTfcs_ID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTfcs_ID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ul_TargetSIR"
    public UL_TargetSIR getUl_TargetSIR()
    {
	return (UL_TargetSIR)mComponents[1];
    }
    
    public void setUl_TargetSIR(UL_TargetSIR ul_TargetSIR)
    {
	mComponents[1] = ul_TargetSIR;
    }
    
    
    // Methods for field "timeInfo"
    public TimeInfo getTimeInfo()
    {
	return (TimeInfo)mComponents[2];
    }
    
    public void setTimeInfo(TimeInfo timeInfo)
    {
	mComponents[2] = timeInfo;
    }
    
    
    // Methods for field "commonTimeslotInfo"
    public CommonTimeslotInfo getCommonTimeslotInfo()
    {
	return (CommonTimeslotInfo)mComponents[3];
    }
    
    public void setCommonTimeslotInfo(CommonTimeslotInfo commonTimeslotInfo)
    {
	mComponents[3] = commonTimeslotInfo;
    }
    
    public boolean hasCommonTimeslotInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCommonTimeslotInfo()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "tddOption"
    public TddOption getTddOption()
    {
	return (TddOption)mComponents[4];
    }
    
    public void setTddOption(TddOption tddOption)
    {
	mComponents[4] = tddOption;
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
	    public Tdd384(UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
	    {
		setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UplinkTimeslotsCodes();
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
			return new UplinkTimeslotsCodes();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_CCTrCH_TimeslotsCodes"
	    public UplinkTimeslotsCodes getUl_CCTrCH_TimeslotsCodes()
	    {
		return (UplinkTimeslotsCodes)mComponents[0];
	    }
	    
	    public void setUl_CCTrCH_TimeslotsCodes(UplinkTimeslotsCodes ul_CCTrCH_TimeslotsCodes)
	    {
		mComponents[0] = ul_CCTrCH_TimeslotsCodes;
	    }
	    
	    public boolean hasUl_CCTrCH_TimeslotsCodes()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUl_CCTrCH_TimeslotsCodes()
	    {
		setComponentAbsent(0);
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
		    "UL_CCTrCH_r7$TddOption$Tdd384"
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
					"UplinkTimeslotsCodes"
				    ),
				    new QName (
					"InformationElements",
					"UplinkTimeslotsCodes"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes"
					)
				    ),
				    0
				)
			    ),
			    "ul-CCTrCH-TimeslotsCodes",
			    0,
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
	    public Tdd768(UplinkTimeslotsCodes_VHCR ul_CCTrCH_TimeslotsCodes)
	    {
		setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UplinkTimeslotsCodes_VHCR();
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
			return new UplinkTimeslotsCodes_VHCR();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_CCTrCH_TimeslotsCodes"
	    public UplinkTimeslotsCodes_VHCR getUl_CCTrCH_TimeslotsCodes()
	    {
		return (UplinkTimeslotsCodes_VHCR)mComponents[0];
	    }
	    
	    public void setUl_CCTrCH_TimeslotsCodes(UplinkTimeslotsCodes_VHCR ul_CCTrCH_TimeslotsCodes)
	    {
		mComponents[0] = ul_CCTrCH_TimeslotsCodes;
	    }
	    
	    public boolean hasUl_CCTrCH_TimeslotsCodes()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUl_CCTrCH_TimeslotsCodes()
	    {
		setComponentAbsent(0);
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
		    "UL_CCTrCH_r7$TddOption$Tdd768"
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
					"UplinkTimeslotsCodes_VHCR"
				    ),
				    new QName (
					"InformationElements",
					"UplinkTimeslotsCodes-VHCR"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes_VHCR"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes_VHCR"
					)
				    ),
				    0
				)
			    ),
			    "ul-CCTrCH-TimeslotsCodes",
			    0,
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
	    public Tdd128(UplinkTimeslotsCodes_LCR_r7 ul_CCTrCH_TimeslotsCodes)
	    {
		setUl_CCTrCH_TimeslotsCodes(ul_CCTrCH_TimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new UplinkTimeslotsCodes_LCR_r7();
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
			return new UplinkTimeslotsCodes_LCR_r7();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "ul_CCTrCH_TimeslotsCodes"
	    public UplinkTimeslotsCodes_LCR_r7 getUl_CCTrCH_TimeslotsCodes()
	    {
		return (UplinkTimeslotsCodes_LCR_r7)mComponents[0];
	    }
	    
	    public void setUl_CCTrCH_TimeslotsCodes(UplinkTimeslotsCodes_LCR_r7 ul_CCTrCH_TimeslotsCodes)
	    {
		mComponents[0] = ul_CCTrCH_TimeslotsCodes;
	    }
	    
	    public boolean hasUl_CCTrCH_TimeslotsCodes()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteUl_CCTrCH_TimeslotsCodes()
	    {
		setComponentAbsent(0);
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
		    "UL_CCTrCH_r7$TddOption$Tdd128"
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
					"UplinkTimeslotsCodes_LCR_r7"
				    ),
				    new QName (
					"InformationElements",
					"UplinkTimeslotsCodes-LCR-r7"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes_LCR_r7"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "UplinkTimeslotsCodes_LCR_r7"
					)
				    ),
				    0
				)
			    ),
			    "ul-CCTrCH-TimeslotsCodes",
			    0,
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_CCTrCH_r7$TddOption"
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
				"UL_CCTrCH_r7$TddOption$Tdd384"
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
				"UL_CCTrCH_r7$TddOption$Tdd768"
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
				"UL_CCTrCH_r7$TddOption$Tdd128"
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
	    "rrc.informationelements",
	    "UL_CCTrCH_r7"
	),
	new QName (
	    "InformationElements",
	    "UL-CCTrCH-r7"
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
				"TFCS_IdentityPlain"
			    ),
			    new QName (
				"InformationElements",
				"TFCS-IdentityPlain"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TFCS_IdentityPlain(1), 
				    new TFCS_IdentityPlain(8),
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
		    "tfcs-ID",
		    0,
		    3,
		    tfcs_ID__default
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
				"TimeInfo"
			    ),
			    new QName (
				"InformationElements",
				"TimeInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TimeInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "TimeInfo"
				)
			    ),
			    0
			)
		    ),
		    "timeInfo",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"CommonTimeslotInfo"
			    ),
			    new QName (
				"InformationElements",
				"CommonTimeslotInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTimeslotInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CommonTimeslotInfo"
				)
			    ),
			    0
			)
		    ),
		    "commonTimeslotInfo",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_CCTrCH_r7$TddOption"
			)
		    ),
		    "tddOption",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' UL_CCTrCH_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_CCTrCH_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_CCTrCH_r7
