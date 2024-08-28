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
 * Define the ASN1 Type CellSelectReselectInfoSIB_11_12_HCS_ECN0 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellSelectReselectInfoSIB_11_12_HCS_ECN0 extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellSelectReselectInfoSIB_11_12_HCS_ECN0()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellSelectReselectInfoSIB_11_12_HCS_ECN0(Q_OffsetS_N q_Offset1S_N, 
		    Q_OffsetS_N q_Offset2S_N, 
		    MaxAllowedUL_TX_Power maxAllowedUL_TX_Power, 
		    HCS_NeighbouringCellInformation_ECN0 hcs_NeighbouringCellInformation_ECN0, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setQ_Offset1S_N(q_Offset1S_N);
	setQ_Offset2S_N(q_Offset2S_N);
	setMaxAllowedUL_TX_Power(maxAllowedUL_TX_Power);
	setHcs_NeighbouringCellInformation_ECN0(hcs_NeighbouringCellInformation_ECN0);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public CellSelectReselectInfoSIB_11_12_HCS_ECN0(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Q_OffsetS_N();
	mComponents[1] = new Q_OffsetS_N();
	mComponents[2] = new MaxAllowedUL_TX_Power();
	mComponents[3] = new HCS_NeighbouringCellInformation_ECN0();
	mComponents[4] = new ModeSpecificInfo();
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
		return new Q_OffsetS_N();
	    case 1:
		return new Q_OffsetS_N();
	    case 2:
		return new MaxAllowedUL_TX_Power();
	    case 3:
		return new HCS_NeighbouringCellInformation_ECN0();
	    case 4:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final Q_OffsetS_N q_Offset1S_N__default = 
	new Q_OffsetS_N(0);
    public static final Q_OffsetS_N q_Offset2S_N__default = 
	new Q_OffsetS_N(0);
    
    // Methods for field "q_Offset1S_N"
    public Q_OffsetS_N getQ_Offset1S_N()
    {
	if (hasQ_Offset1S_N())
	    return (Q_OffsetS_N)mComponents[0];
	else
	    return (Q_OffsetS_N)q_Offset1S_N__default.clone();
    }
    
    public void setQ_Offset1S_N(Q_OffsetS_N q_Offset1S_N)
    {
	mComponents[0] = q_Offset1S_N;
    }
    
    public void setQ_Offset1S_NToDefault()
    {
	setQ_Offset1S_N(q_Offset1S_N__default);
    }
    
    public boolean hasDefaultQ_Offset1S_N()
    {
	return true;
    }
    
    public boolean hasQ_Offset1S_N()
    {
	return componentIsPresent(0);
    }
    
    public void deleteQ_Offset1S_N()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "q_Offset2S_N"
    public Q_OffsetS_N getQ_Offset2S_N()
    {
	if (hasQ_Offset2S_N())
	    return (Q_OffsetS_N)mComponents[1];
	else
	    return (Q_OffsetS_N)q_Offset2S_N__default.clone();
    }
    
    public void setQ_Offset2S_N(Q_OffsetS_N q_Offset2S_N)
    {
	mComponents[1] = q_Offset2S_N;
    }
    
    public void setQ_Offset2S_NToDefault()
    {
	setQ_Offset2S_N(q_Offset2S_N__default);
    }
    
    public boolean hasDefaultQ_Offset2S_N()
    {
	return true;
    }
    
    public boolean hasQ_Offset2S_N()
    {
	return componentIsPresent(1);
    }
    
    public void deleteQ_Offset2S_N()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "maxAllowedUL_TX_Power"
    public MaxAllowedUL_TX_Power getMaxAllowedUL_TX_Power()
    {
	return (MaxAllowedUL_TX_Power)mComponents[2];
    }
    
    public void setMaxAllowedUL_TX_Power(MaxAllowedUL_TX_Power maxAllowedUL_TX_Power)
    {
	mComponents[2] = maxAllowedUL_TX_Power;
    }
    
    public boolean hasMaxAllowedUL_TX_Power()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMaxAllowedUL_TX_Power()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "hcs_NeighbouringCellInformation_ECN0"
    public HCS_NeighbouringCellInformation_ECN0 getHcs_NeighbouringCellInformation_ECN0()
    {
	return (HCS_NeighbouringCellInformation_ECN0)mComponents[3];
    }
    
    public void setHcs_NeighbouringCellInformation_ECN0(HCS_NeighbouringCellInformation_ECN0 hcs_NeighbouringCellInformation_ECN0)
    {
	mComponents[3] = hcs_NeighbouringCellInformation_ECN0;
    }
    
    public boolean hasHcs_NeighbouringCellInformation_ECN0()
    {
	return componentIsPresent(3);
    }
    
    public void deleteHcs_NeighbouringCellInformation_ECN0()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[4];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[4] = modeSpecificInfo;
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
	public static final  int  gsm_chosen = 3;
	
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
	    public Fdd(Q_QualMin q_QualMin, Q_RxlevMin q_RxlevMin)
	    {
		setQ_QualMin(q_QualMin);
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Q_QualMin();
		mComponents[1] = new Q_RxlevMin();
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
			return new Q_QualMin();
		    case 1:
			return new Q_RxlevMin();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "q_QualMin"
	    public Q_QualMin getQ_QualMin()
	    {
		return (Q_QualMin)mComponents[0];
	    }
	    
	    public void setQ_QualMin(Q_QualMin q_QualMin)
	    {
		mComponents[0] = q_QualMin;
	    }
	    
	    public boolean hasQ_QualMin()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteQ_QualMin()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "q_RxlevMin"
	    public Q_RxlevMin getQ_RxlevMin()
	    {
		return (Q_RxlevMin)mComponents[1];
	    }
	    
	    public void setQ_RxlevMin(Q_RxlevMin q_RxlevMin)
	    {
		mComponents[1] = q_RxlevMin;
	    }
	    
	    public boolean hasQ_RxlevMin()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteQ_RxlevMin()
	    {
		setComponentAbsent(1);
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
		    "CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Fdd"
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
					"Q_QualMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-QualMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_QualMin(-24), 
					    new Q_QualMin(0),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-24),
					new java.lang.Long(0)
				    ),
				    null
				)
			    ),
			    "q-QualMin",
			    0,
			    3,
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
					"Q_RxlevMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-RxlevMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_RxlevMin(-58), 
					    new Q_RxlevMin(-13),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-58),
					new java.lang.Long(-13)
				    ),
				    null
				)
			    ),
			    "q-RxlevMin",
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
	    public Tdd(Q_RxlevMin q_RxlevMin)
	    {
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Q_RxlevMin();
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
			return new Q_RxlevMin();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "q_RxlevMin"
	    public Q_RxlevMin getQ_RxlevMin()
	    {
		return (Q_RxlevMin)mComponents[0];
	    }
	    
	    public void setQ_RxlevMin(Q_RxlevMin q_RxlevMin)
	    {
		mComponents[0] = q_RxlevMin;
	    }
	    
	    public boolean hasQ_RxlevMin()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteQ_RxlevMin()
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
		    "CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Tdd"
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
					"Q_RxlevMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-RxlevMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_RxlevMin(-58), 
					    new Q_RxlevMin(-13),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-58),
					new java.lang.Long(-13)
				    ),
				    null
				)
			    ),
			    "q-RxlevMin",
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

	// Methods for field "gsm"
	public static ModeSpecificInfo createModeSpecificInfoWithGsm(Gsm gsm)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setGsm(gsm);
	    return __object;
	}
	
	public boolean hasGsm()
	{
	    return getChosenFlag() == gsm_chosen;
	}
	
	public void setGsm(Gsm gsm)
	{
	    setChosenValue(gsm);
	    setChosenFlag(gsm_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Gsm from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Gsm extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Gsm()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Gsm(Q_RxlevMin q_RxlevMin)
	    {
		setQ_RxlevMin(q_RxlevMin);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Q_RxlevMin();
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
			return new Q_RxlevMin();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "q_RxlevMin"
	    public Q_RxlevMin getQ_RxlevMin()
	    {
		return (Q_RxlevMin)mComponents[0];
	    }
	    
	    public void setQ_RxlevMin(Q_RxlevMin q_RxlevMin)
	    {
		mComponents[0] = q_RxlevMin;
	    }
	    
	    public boolean hasQ_RxlevMin()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteQ_RxlevMin()
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
		    "CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Gsm"
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
					"Q_RxlevMin"
				    ),
				    new QName (
					"InformationElements",
					"Q-RxlevMin"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Q_RxlevMin(-58), 
					    new Q_RxlevMin(-13),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-58),
					new java.lang.Long(-13)
				    ),
				    null
				)
			    ),
			    "q-RxlevMin",
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
	     * Get the type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Gsm

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
		case gsm_chosen:
		    return new Gsm();
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
		"CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo"
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
				"CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Fdd"
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
				"CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo$Gsm"
			    )
			),
			"gsm",
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
	    "CellSelectReselectInfoSIB_11_12_HCS_ECN0"
	),
	new QName (
	    "InformationElements",
	    "CellSelectReselectInfoSIB-11-12-HCS-ECN0"
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
				"Q_OffsetS_N"
			    ),
			    new QName (
				"InformationElements",
				"Q-OffsetS-N"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_OffsetS_N(-50), 
				    new Q_OffsetS_N(50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(50)
			    ),
			    null
			)
		    ),
		    "q-Offset1S-N",
		    0,
		    3,
		    q_Offset1S_N__default
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
				"Q_OffsetS_N"
			    ),
			    new QName (
				"InformationElements",
				"Q-OffsetS-N"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Q_OffsetS_N(-50), 
				    new Q_OffsetS_N(50),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(50)
			    ),
			    null
			)
		    ),
		    "q-Offset2S-N",
		    1,
		    3,
		    q_Offset2S_N__default
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
				"MaxAllowedUL_TX_Power"
			    ),
			    new QName (
				"InformationElements",
				"MaxAllowedUL-TX-Power"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxAllowedUL_TX_Power(-50), 
				    new MaxAllowedUL_TX_Power(33),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-50),
				new java.lang.Long(33)
			    ),
			    null
			)
		    ),
		    "maxAllowedUL-TX-Power",
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
				"HCS_NeighbouringCellInformation_ECN0"
			    ),
			    new QName (
				"InformationElements",
				"HCS-NeighbouringCellInformation-ECN0"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_NeighbouringCellInformation_ECN0"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HCS_NeighbouringCellInformation_ECN0"
				)
			    ),
			    0
			)
		    ),
		    "hcs-NeighbouringCellInformation-ECN0",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellSelectReselectInfoSIB_11_12_HCS_ECN0$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' CellSelectReselectInfoSIB_11_12_HCS_ECN0 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellSelectReselectInfoSIB_11_12_HCS_ECN0 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellSelectReselectInfoSIB_11_12_HCS_ECN0
