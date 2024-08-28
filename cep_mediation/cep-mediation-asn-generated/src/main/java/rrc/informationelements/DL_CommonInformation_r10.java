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
 * Define the ASN1 Type DL_CommonInformation_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CommonInformation_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CommonInformation_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CommonInformation_r10(Dl_dpchInfoCommon dl_dpchInfoCommon, 
		    ModeSpecificInfo modeSpecificInfo, 
		    Mac_hsResetIndicator mac_hsResetIndicator, 
		    PostVerificationPeriod postVerificationPeriod)
    {
	setDl_dpchInfoCommon(dl_dpchInfoCommon);
	setModeSpecificInfo(modeSpecificInfo);
	setMac_hsResetIndicator(mac_hsResetIndicator);
	setPostVerificationPeriod(postVerificationPeriod);
    }
    
    /**
     * Construct with required components.
     */
    public DL_CommonInformation_r10(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Dl_dpchInfoCommon();
	mComponents[1] = new ModeSpecificInfo();
	mComponents[2] = Mac_hsResetIndicator._true;
	mComponents[3] = PostVerificationPeriod._true;
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
		return new Dl_dpchInfoCommon();
	    case 1:
		return new ModeSpecificInfo();
	    case 2:
		return Mac_hsResetIndicator._true;
	    case 3:
		return PostVerificationPeriod._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_dpchInfoCommon"
    public Dl_dpchInfoCommon getDl_dpchInfoCommon()
    {
	return (Dl_dpchInfoCommon)mComponents[0];
    }
    
    public void setDl_dpchInfoCommon(Dl_dpchInfoCommon dl_dpchInfoCommon)
    {
	mComponents[0] = dl_dpchInfoCommon;
    }
    
    public boolean hasDl_dpchInfoCommon()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_dpchInfoCommon()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Dl_dpchInfoCommon from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Dl_dpchInfoCommon extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Dl_dpchInfoCommon()
	{
	}
	
	public static final  int  dl_DPCH_InfoCommon_chosen = 1;
	public static final  int  dl_FDPCH_InfoCommon_chosen = 2;
	
	// Methods for field "dl_DPCH_InfoCommon"
	public static Dl_dpchInfoCommon createDl_dpchInfoCommonWithDl_DPCH_InfoCommon(DL_DPCH_InfoCommon_r6 dl_DPCH_InfoCommon)
	{
	    Dl_dpchInfoCommon __object = new Dl_dpchInfoCommon();

	    __object.setDl_DPCH_InfoCommon(dl_DPCH_InfoCommon);
	    return __object;
	}
	
	public boolean hasDl_DPCH_InfoCommon()
	{
	    return getChosenFlag() == dl_DPCH_InfoCommon_chosen;
	}
	
	public void setDl_DPCH_InfoCommon(DL_DPCH_InfoCommon_r6 dl_DPCH_InfoCommon)
	{
	    setChosenValue(dl_DPCH_InfoCommon);
	    setChosenFlag(dl_DPCH_InfoCommon_chosen);
	}
	
	
	// Methods for field "dl_FDPCH_InfoCommon"
	public static Dl_dpchInfoCommon createDl_dpchInfoCommonWithDl_FDPCH_InfoCommon(DL_FDPCH_InfoCommon_r6 dl_FDPCH_InfoCommon)
	{
	    Dl_dpchInfoCommon __object = new Dl_dpchInfoCommon();

	    __object.setDl_FDPCH_InfoCommon(dl_FDPCH_InfoCommon);
	    return __object;
	}
	
	public boolean hasDl_FDPCH_InfoCommon()
	{
	    return getChosenFlag() == dl_FDPCH_InfoCommon_chosen;
	}
	
	public void setDl_FDPCH_InfoCommon(DL_FDPCH_InfoCommon_r6 dl_FDPCH_InfoCommon)
	{
	    setChosenValue(dl_FDPCH_InfoCommon);
	    setChosenFlag(dl_FDPCH_InfoCommon_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case dl_DPCH_InfoCommon_chosen:
		    return new DL_DPCH_InfoCommon_r6();
		case dl_FDPCH_InfoCommon_chosen:
		    return new DL_FDPCH_InfoCommon_r6();
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
		"DL_CommonInformation_r10$Dl_dpchInfoCommon"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoCommon_r6"
				),
				new QName (
				    "InformationElements",
				    "DL-DPCH-InfoCommon-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_InfoCommon_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_InfoCommon_r6"
				    )
				),
				0
			    )
			),
			"dl-DPCH-InfoCommon",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_FDPCH_InfoCommon_r6"
				),
				new QName (
				    "InformationElements",
				    "DL-FDPCH-InfoCommon-r6"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoCommon_r6"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_FDPCH_InfoCommon_r6"
				    )
				),
				0
			    )
			),
			"dl-FDPCH-InfoCommon",
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
	 * Get the type descriptor (TypeInfo) of 'this' Dl_dpchInfoCommon object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dl_dpchInfoCommon object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dl_dpchInfoCommon

    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
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
	    public Fdd(DefaultDPCH_OffsetValueFDD defaultDPCH_OffsetValue, 
			    DPCH_CompressedModeInfo_r10 dpch_CompressedModeInfo, 
			    TX_DiversityMode tx_DiversityMode)
	    {
		setDefaultDPCH_OffsetValue(defaultDPCH_OffsetValue);
		setDpch_CompressedModeInfo(dpch_CompressedModeInfo);
		setTx_DiversityMode(tx_DiversityMode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DefaultDPCH_OffsetValueFDD();
		mComponents[1] = new DPCH_CompressedModeInfo_r10();
		mComponents[2] = TX_DiversityMode.noDiversity;
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
			return new DefaultDPCH_OffsetValueFDD();
		    case 1:
			return new DPCH_CompressedModeInfo_r10();
		    case 2:
			return TX_DiversityMode.noDiversity;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "defaultDPCH_OffsetValue"
	    public DefaultDPCH_OffsetValueFDD getDefaultDPCH_OffsetValue()
	    {
		return (DefaultDPCH_OffsetValueFDD)mComponents[0];
	    }
	    
	    public void setDefaultDPCH_OffsetValue(DefaultDPCH_OffsetValueFDD defaultDPCH_OffsetValue)
	    {
		mComponents[0] = defaultDPCH_OffsetValue;
	    }
	    
	    public boolean hasDefaultDPCH_OffsetValue()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDefaultDPCH_OffsetValue()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "dpch_CompressedModeInfo"
	    public DPCH_CompressedModeInfo_r10 getDpch_CompressedModeInfo()
	    {
		return (DPCH_CompressedModeInfo_r10)mComponents[1];
	    }
	    
	    public void setDpch_CompressedModeInfo(DPCH_CompressedModeInfo_r10 dpch_CompressedModeInfo)
	    {
		mComponents[1] = dpch_CompressedModeInfo;
	    }
	    
	    public boolean hasDpch_CompressedModeInfo()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDpch_CompressedModeInfo()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "tx_DiversityMode"
	    public TX_DiversityMode getTx_DiversityMode()
	    {
		return (TX_DiversityMode)mComponents[2];
	    }
	    
	    public void setTx_DiversityMode(TX_DiversityMode tx_DiversityMode)
	    {
		mComponents[2] = tx_DiversityMode;
	    }
	    
	    public boolean hasTx_DiversityMode()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteTx_DiversityMode()
	    {
		setComponentAbsent(2);
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
		    "DL_CommonInformation_r10$ModeSpecificInfo$Fdd"
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
					"DefaultDPCH_OffsetValueFDD"
				    ),
				    new QName (
					"InformationElements",
					"DefaultDPCH-OffsetValueFDD"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new DefaultDPCH_OffsetValueFDD(0), 
					    new DefaultDPCH_OffsetValueFDD(599),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(599)
				    ),
				    null
				)
			    ),
			    "defaultDPCH-OffsetValue",
			    0,
			    3,
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
					"DPCH_CompressedModeInfo_r10"
				    ),
				    new QName (
					"InformationElements",
					"DPCH-CompressedModeInfo-r10"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DPCH_CompressedModeInfo_r10"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DPCH_CompressedModeInfo_r10"
					)
				    ),
				    0
				)
			    ),
			    "dpch-CompressedModeInfo",
			    1,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"TX_DiversityMode"
				    ),
				    new QName (
					"InformationElements",
					"TX-DiversityMode"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"noDiversity",
						0
					    ),
					    new MemberListElement (
						"sttd",
						1
					    ),
					    new MemberListElement (
						"closedLoopMode1",
						2
					    ),
					    new MemberListElement (
						"dummy",
						3
					    )
					}
				    ),
				    0,
				    TX_DiversityMode.noDiversity
				)
			    ),
			    "tx-DiversityMode",
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
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1),
				new TagDecoderElement((short)0x8002, 2)
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
	    public Tdd(TddOption tddOption, 
			    DefaultDPCH_OffsetValueTDD defaultDPCH_OffsetValue)
	    {
		setTddOption(tddOption);
		setDefaultDPCH_OffsetValue(defaultDPCH_OffsetValue);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Tdd(TddOption tddOption)
	    {
		setTddOption(tddOption);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TddOption();
		mComponents[1] = new DefaultDPCH_OffsetValueTDD();
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
			return new DefaultDPCH_OffsetValueTDD();
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
		public static TddOption createTddOptionWithTdd384(Null tdd384)
		{
		    TddOption __object = new TddOption();

		    __object.setTdd384(tdd384);
		    return __object;
		}
		
		public boolean hasTdd384()
		{
		    return getChosenFlag() == tdd384_chosen;
		}
		
		public void setTdd384(Null tdd384)
		{
		    setChosenValue(tdd384);
		    setChosenFlag(tdd384_chosen);
		}
		
		
		// Methods for field "tdd768"
		public static TddOption createTddOptionWithTdd768(Null tdd768)
		{
		    TddOption __object = new TddOption();

		    __object.setTdd768(tdd768);
		    return __object;
		}
		
		public boolean hasTdd768()
		{
		    return getChosenFlag() == tdd768_chosen;
		}
		
		public void setTdd768(Null tdd768)
		{
		    setChosenValue(tdd768);
		    setChosenFlag(tdd768_chosen);
		}
		
		
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
		    public Tdd128(BOOLEAN tstd_Indicator)
		    {
			setTstd_Indicator(tstd_Indicator);
		    }
		    
		    /**
		     * Construct with components.
		     */
		    public Tdd128(boolean tstd_Indicator)
		    {
			this(new BOOLEAN(tstd_Indicator));
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new BOOLEAN();
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
				return new BOOLEAN();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "tstd_Indicator"
		    public boolean getTstd_Indicator()
		    {
			return ((BOOLEAN)mComponents[0]).booleanValue();
		    }
		    
		    public void setTstd_Indicator(boolean tstd_Indicator)
		    {
			setTstd_Indicator(new BOOLEAN(tstd_Indicator));
		    }
		    
		    public void setTstd_Indicator(BOOLEAN tstd_Indicator)
		    {
			mComponents[0] = tstd_Indicator;
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
			    "DL_CommonInformation_r10$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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
					new TypeInfo (
					    new Tags (
						new short[] {
						    (short)0x8000
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
				    "tstd-Indicator",
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
			    return new Null();
			case tdd768_chosen:
			    return new Null();
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
			"DL_CommonInformation_r10$ModeSpecificInfo$Tdd$TddOption"
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
				"tdd384",
				0,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8001
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
				"tdd768",
				1,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new QName (
					"rrc.informationelements",
					"DL_CommonInformation_r10$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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

	    // Methods for field "defaultDPCH_OffsetValue"
	    public DefaultDPCH_OffsetValueTDD getDefaultDPCH_OffsetValue()
	    {
		return (DefaultDPCH_OffsetValueTDD)mComponents[1];
	    }
	    
	    public void setDefaultDPCH_OffsetValue(DefaultDPCH_OffsetValueTDD defaultDPCH_OffsetValue)
	    {
		mComponents[1] = defaultDPCH_OffsetValue;
	    }
	    
	    public boolean hasDefaultDPCH_OffsetValue()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteDefaultDPCH_OffsetValue()
	    {
		setComponentAbsent(1);
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
		    "DL_CommonInformation_r10$ModeSpecificInfo$Tdd"
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
				    "DL_CommonInformation_r10$ModeSpecificInfo$Tdd$TddOption"
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
					"DefaultDPCH_OffsetValueTDD"
				    ),
				    new QName (
					"InformationElements",
					"DefaultDPCH-OffsetValueTDD"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new DefaultDPCH_OffsetValueTDD(0), 
					    new DefaultDPCH_OffsetValueTDD(7),
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
			    "defaultDPCH-OffsetValue",
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_CommonInformation_r10$ModeSpecificInfo"
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
				"DL_CommonInformation_r10$ModeSpecificInfo$Fdd"
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
				"DL_CommonInformation_r10$ModeSpecificInfo$Tdd"
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

    // Methods for field "mac_hsResetIndicator"
    public Mac_hsResetIndicator getMac_hsResetIndicator()
    {
	return (Mac_hsResetIndicator)mComponents[2];
    }
    
    public void setMac_hsResetIndicator(Mac_hsResetIndicator mac_hsResetIndicator)
    {
	mComponents[2] = mac_hsResetIndicator;
    }
    
    public boolean hasMac_hsResetIndicator()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMac_hsResetIndicator()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Mac_hsResetIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Mac_hsResetIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Mac_hsResetIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Mac_hsResetIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Mac_hsResetIndicator _true =
	    new Mac_hsResetIndicator(0);
	private final static Mac_hsResetIndicator cNamedNumbers[] = {
	     _true
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
	
	public static Mac_hsResetIndicator valueOf(long value)
	{
	    return (Mac_hsResetIndicator)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_CommonInformation_r10$Mac_hsResetIndicator"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mac_hsResetIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mac_hsResetIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mac_hsResetIndicator

    // Methods for field "postVerificationPeriod"
    public PostVerificationPeriod getPostVerificationPeriod()
    {
	return (PostVerificationPeriod)mComponents[3];
    }
    
    public void setPostVerificationPeriod(PostVerificationPeriod postVerificationPeriod)
    {
	mComponents[3] = postVerificationPeriod;
    }
    
    public boolean hasPostVerificationPeriod()
    {
	return componentIsPresent(3);
    }
    
    public void deletePostVerificationPeriod()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type PostVerificationPeriod from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class PostVerificationPeriod extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private PostVerificationPeriod()
	{
	    super(cFirstNumber);
	}
	
	protected PostVerificationPeriod(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final PostVerificationPeriod _true =
	    new PostVerificationPeriod(0);
	private final static PostVerificationPeriod cNamedNumbers[] = {
	     _true
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
	
	public static PostVerificationPeriod valueOf(long value)
	{
	    return (PostVerificationPeriod)_true.lookupValue(value);
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
		"DL_CommonInformation_r10$PostVerificationPeriod"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' PostVerificationPeriod object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PostVerificationPeriod object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PostVerificationPeriod

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
	    "DL_CommonInformation_r10"
	),
	new QName (
	    "InformationElements",
	    "DL-CommonInformation-r10"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r10$Dl_dpchInfoCommon"
			)
		    ),
		    "dl-dpchInfoCommon",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r10$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r10$Mac_hsResetIndicator"
			)
		    ),
		    "mac-hsResetIndicator",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r10$PostVerificationPeriod"
			)
		    ),
		    "postVerificationPeriod",
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_CommonInformation_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CommonInformation_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CommonInformation_r10
