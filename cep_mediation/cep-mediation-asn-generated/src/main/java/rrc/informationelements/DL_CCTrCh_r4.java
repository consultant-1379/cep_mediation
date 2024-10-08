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
 * Define the ASN1 Type DL_CCTrCh_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_CCTrCh_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_CCTrCh_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_CCTrCh_r4(TFCS_IdentityPlain tfcs_ID, TimeInfo timeInfo, 
		    CommonTimeslotInfo commonTimeslotInfo, 
		    TddOption tddOption, UL_CCTrChTPCList ul_CCTrChTPCList)
    {
	setTfcs_ID(tfcs_ID);
	setTimeInfo(timeInfo);
	setCommonTimeslotInfo(commonTimeslotInfo);
	setTddOption(tddOption);
	setUl_CCTrChTPCList(ul_CCTrChTPCList);
    }
    
    /**
     * Construct with required components.
     */
    public DL_CCTrCh_r4(TimeInfo timeInfo, TddOption tddOption)
    {
	setTimeInfo(timeInfo);
	setTddOption(tddOption);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TFCS_IdentityPlain();
	mComponents[1] = new TimeInfo();
	mComponents[2] = new CommonTimeslotInfo();
	mComponents[3] = new TddOption();
	mComponents[4] = new UL_CCTrChTPCList();
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
		return new TimeInfo();
	    case 2:
		return new CommonTimeslotInfo();
	    case 3:
		return new TddOption();
	    case 4:
		return new UL_CCTrChTPCList();
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
    
    
    // Methods for field "timeInfo"
    public TimeInfo getTimeInfo()
    {
	return (TimeInfo)mComponents[1];
    }
    
    public void setTimeInfo(TimeInfo timeInfo)
    {
	mComponents[1] = timeInfo;
    }
    
    
    // Methods for field "commonTimeslotInfo"
    public CommonTimeslotInfo getCommonTimeslotInfo()
    {
	return (CommonTimeslotInfo)mComponents[2];
    }
    
    public void setCommonTimeslotInfo(CommonTimeslotInfo commonTimeslotInfo)
    {
	mComponents[2] = commonTimeslotInfo;
    }
    
    public boolean hasCommonTimeslotInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCommonTimeslotInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "tddOption"
    public TddOption getTddOption()
    {
	return (TddOption)mComponents[3];
    }
    
    public void setTddOption(TddOption tddOption)
    {
	mComponents[3] = tddOption;
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
	    public Tdd384(DownlinkTimeslotsCodes dl_CCTrCH_TimeslotsCodes)
	    {
		setDl_CCTrCH_TimeslotsCodes(dl_CCTrCH_TimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DownlinkTimeslotsCodes();
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
			return new DownlinkTimeslotsCodes();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_CCTrCH_TimeslotsCodes"
	    public DownlinkTimeslotsCodes getDl_CCTrCH_TimeslotsCodes()
	    {
		return (DownlinkTimeslotsCodes)mComponents[0];
	    }
	    
	    public void setDl_CCTrCH_TimeslotsCodes(DownlinkTimeslotsCodes dl_CCTrCH_TimeslotsCodes)
	    {
		mComponents[0] = dl_CCTrCH_TimeslotsCodes;
	    }
	    
	    public boolean hasDl_CCTrCH_TimeslotsCodes()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_CCTrCH_TimeslotsCodes()
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
		    "DL_CCTrCh_r4$TddOption$Tdd384"
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
			    "dl-CCTrCH-TimeslotsCodes",
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
	    public Tdd128(DownlinkTimeslotsCodes_LCR_r4 dl_CCTrCH_TimeslotsCodes)
	    {
		setDl_CCTrCH_TimeslotsCodes(dl_CCTrCH_TimeslotsCodes);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DownlinkTimeslotsCodes_LCR_r4();
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
			return new DownlinkTimeslotsCodes_LCR_r4();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_CCTrCH_TimeslotsCodes"
	    public DownlinkTimeslotsCodes_LCR_r4 getDl_CCTrCH_TimeslotsCodes()
	    {
		return (DownlinkTimeslotsCodes_LCR_r4)mComponents[0];
	    }
	    
	    public void setDl_CCTrCH_TimeslotsCodes(DownlinkTimeslotsCodes_LCR_r4 dl_CCTrCH_TimeslotsCodes)
	    {
		mComponents[0] = dl_CCTrCH_TimeslotsCodes;
	    }
	    
	    public boolean hasDl_CCTrCH_TimeslotsCodes()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_CCTrCH_TimeslotsCodes()
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
		    "DL_CCTrCh_r4$TddOption$Tdd128"
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
			    "dl-CCTrCH-TimeslotsCodes",
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_CCTrCh_r4$TddOption"
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
				"DL_CCTrCh_r4$TddOption$Tdd384"
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
				"DL_CCTrCh_r4$TddOption$Tdd128"
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

    // Methods for field "ul_CCTrChTPCList"
    public UL_CCTrChTPCList getUl_CCTrChTPCList()
    {
	return (UL_CCTrChTPCList)mComponents[4];
    }
    
    public void setUl_CCTrChTPCList(UL_CCTrChTPCList ul_CCTrChTPCList)
    {
	mComponents[4] = ul_CCTrChTPCList;
    }
    
    public boolean hasUl_CCTrChTPCList()
    {
	return componentIsPresent(4);
    }
    
    public void deleteUl_CCTrChTPCList()
    {
	setComponentAbsent(4);
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
	    "DL_CCTrCh_r4"
	),
	new QName (
	    "InformationElements",
	    "DL-CCTrCh-r4"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_CCTrCh_r4$TddOption"
			)
		    ),
		    "tddOption",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_CCTrChTPCList"
			    ),
			    new QName (
				"InformationElements",
				"UL-CCTrChTPCList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "TFCS_Identity"
				)
			    )
			)
		    ),
		    "ul-CCTrChTPCList",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_CCTrCh_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_CCTrCh_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_CCTrCh_r4
