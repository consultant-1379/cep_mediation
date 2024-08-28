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
 * Define the ASN1 Type PUSCH_PowerControlInfo_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PUSCH_PowerControlInfo_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PUSCH_PowerControlInfo_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PUSCH_PowerControlInfo_r4(UL_TargetSIR ul_TargetSIR, 
		    TddOption tddOption)
    {
	setUl_TargetSIR(ul_TargetSIR);
	setTddOption(tddOption);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_TargetSIR();
	mComponents[1] = new TddOption();
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
		return new UL_TargetSIR();
	    case 1:
		return new TddOption();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_TargetSIR"
    public UL_TargetSIR getUl_TargetSIR()
    {
	return (UL_TargetSIR)mComponents[0];
    }
    
    public void setUl_TargetSIR(UL_TargetSIR ul_TargetSIR)
    {
	mComponents[0] = ul_TargetSIR;
    }
    
    
    // Methods for field "tddOption"
    public TddOption getTddOption()
    {
	return (TddOption)mComponents[1];
    }
    
    public void setTddOption(TddOption tddOption)
    {
	mComponents[1] = tddOption;
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
	    public Tdd128(TPC_StepSizeTDD tpc_StepSize)
	    {
		setTpc_StepSize(tpc_StepSize);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new TPC_StepSizeTDD();
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
			return new TPC_StepSizeTDD();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tpc_StepSize"
	    public TPC_StepSizeTDD getTpc_StepSize()
	    {
		return (TPC_StepSizeTDD)mComponents[0];
	    }
	    
	    public void setTpc_StepSize(TPC_StepSizeTDD tpc_StepSize)
	    {
		mComponents[0] = tpc_StepSize;
	    }
	    
	    public boolean hasTpc_StepSize()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteTpc_StepSize()
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
		    "PUSCH_PowerControlInfo_r4$TddOption$Tdd128"
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
					"TPC_StepSizeTDD"
				    ),
				    new QName (
					"InformationElements",
					"TPC-StepSizeTDD"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new TPC_StepSizeTDD(1), 
					    new TPC_StepSizeTDD(3),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(3)
				    ),
				    null
				)
			    ),
			    "tpc-StepSize",
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PUSCH_PowerControlInfo_r4$TddOption"
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
				"PUSCH_PowerControlInfo_r4$TddOption$Tdd128"
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
	    "PUSCH_PowerControlInfo_r4"
	),
	new QName (
	    "InformationElements",
	    "PUSCH-PowerControlInfo-r4"
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
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PUSCH_PowerControlInfo_r4$TddOption"
			)
		    ),
		    "tddOption",
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
     * Get the type descriptor (TypeInfo) of 'this' PUSCH_PowerControlInfo_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PUSCH_PowerControlInfo_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PUSCH_PowerControlInfo_r4
