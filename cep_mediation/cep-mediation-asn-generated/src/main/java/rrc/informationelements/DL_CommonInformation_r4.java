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
 * Define the ASN1 Type DL_CommonInformation_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CommonInformation_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CommonInformation_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CommonInformation_r4(DL_DPCH_InfoCommon_r4 dl_DPCH_InfoCommon, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setDl_DPCH_InfoCommon(dl_DPCH_InfoCommon);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public DL_CommonInformation_r4(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DL_DPCH_InfoCommon_r4();
	mComponents[1] = new ModeSpecificInfo();
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
		return new DL_DPCH_InfoCommon_r4();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_DPCH_InfoCommon"
    public DL_DPCH_InfoCommon_r4 getDl_DPCH_InfoCommon()
    {
	return (DL_DPCH_InfoCommon_r4)mComponents[0];
    }
    
    public void setDl_DPCH_InfoCommon(DL_DPCH_InfoCommon_r4 dl_DPCH_InfoCommon)
    {
	mComponents[0] = dl_DPCH_InfoCommon;
    }
    
    public boolean hasDl_DPCH_InfoCommon()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_DPCH_InfoCommon()
    {
	setComponentAbsent(0);
    }
    
    
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
			    DPCH_CompressedModeInfo dpch_CompressedModeInfo, 
			    TX_DiversityMode tx_DiversityMode, 
			    SSDT_Information_r4 dummy)
	    {
		setDefaultDPCH_OffsetValue(defaultDPCH_OffsetValue);
		setDpch_CompressedModeInfo(dpch_CompressedModeInfo);
		setTx_DiversityMode(tx_DiversityMode);
		setDummy(dummy);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DefaultDPCH_OffsetValueFDD();
		mComponents[1] = new DPCH_CompressedModeInfo();
		mComponents[2] = TX_DiversityMode.noDiversity;
		mComponents[3] = new SSDT_Information_r4();
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
			return new DefaultDPCH_OffsetValueFDD();
		    case 1:
			return new DPCH_CompressedModeInfo();
		    case 2:
			return TX_DiversityMode.noDiversity;
		    case 3:
			return new SSDT_Information_r4();
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
	    public DPCH_CompressedModeInfo getDpch_CompressedModeInfo()
	    {
		return (DPCH_CompressedModeInfo)mComponents[1];
	    }
	    
	    public void setDpch_CompressedModeInfo(DPCH_CompressedModeInfo dpch_CompressedModeInfo)
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
	    
	    
	    // Methods for field "dummy"
	    public SSDT_Information_r4 getDummy()
	    {
		return (SSDT_Information_r4)mComponents[3];
	    }
	    
	    public void setDummy(SSDT_Information_r4 dummy)
	    {
		mComponents[3] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteDummy()
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
		    "DL_CommonInformation_r4$ModeSpecificInfo$Fdd"
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
					"DPCH_CompressedModeInfo"
				    ),
				    new QName (
					"InformationElements",
					"DPCH-CompressedModeInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DPCH_CompressedModeInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DPCH_CompressedModeInfo"
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
					"SSDT_Information_r4"
				    ),
				    new QName (
					"InformationElements",
					"SSDT-Information-r4"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SSDT_Information_r4"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "SSDT_Information_r4"
					)
				    ),
				    0
				)
			    ),
			    "dummy",
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
		public static final  int  tdd128_chosen = 2;
		
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
				(short)0x8001
			    }
			),
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
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
			"DL_CommonInformation_r4$ModeSpecificInfo$Tdd$TddOption"
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
				    new QName (
					"rrc.informationelements",
					"DL_CommonInformation_r4$ModeSpecificInfo$Tdd$TddOption$Tdd128"
				    )
				),
				"tdd128",
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
		    "DL_CommonInformation_r4$ModeSpecificInfo$Tdd"
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
				    "DL_CommonInformation_r4$ModeSpecificInfo$Tdd$TddOption"
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
		"DL_CommonInformation_r4$ModeSpecificInfo"
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
				"DL_CommonInformation_r4$ModeSpecificInfo$Fdd"
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
				"DL_CommonInformation_r4$ModeSpecificInfo$Tdd"
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
	    "DL_CommonInformation_r4"
	),
	new QName (
	    "InformationElements",
	    "DL-CommonInformation-r4"
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
				"DL_DPCH_InfoCommon_r4"
			    ),
			    new QName (
				"InformationElements",
				"DL-DPCH-InfoCommon-r4"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoCommon_r4"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_DPCH_InfoCommon_r4"
				)
			    ),
			    0
			)
		    ),
		    "dl-DPCH-InfoCommon",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CommonInformation_r4$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_CommonInformation_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CommonInformation_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CommonInformation_r4
