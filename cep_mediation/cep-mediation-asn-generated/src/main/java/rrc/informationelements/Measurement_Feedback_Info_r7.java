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
 * Define the ASN1 Type Measurement_Feedback_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class Measurement_Feedback_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public Measurement_Feedback_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Measurement_Feedback_Info_r7(ModeSpecificInfo modeSpecificInfo)
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
	    public Fdd(MeasurementPowerOffset measurementPowerOffset, 
			    Feedback_cycle_r7 feedback_cycle, 
			    CQI_RepetitionFactor cqi_RepetitionFactor, 
			    DeltaCQI deltaCQI)
	    {
		setMeasurementPowerOffset(measurementPowerOffset);
		setFeedback_cycle(feedback_cycle);
		setCqi_RepetitionFactor(cqi_RepetitionFactor);
		setDeltaCQI(deltaCQI);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MeasurementPowerOffset();
		mComponents[1] = Feedback_cycle_r7.fc0;
		mComponents[2] = new CQI_RepetitionFactor();
		mComponents[3] = new DeltaCQI();
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
			return new MeasurementPowerOffset();
		    case 1:
			return Feedback_cycle_r7.fc0;
		    case 2:
			return new CQI_RepetitionFactor();
		    case 3:
			return new DeltaCQI();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "measurementPowerOffset"
	    public MeasurementPowerOffset getMeasurementPowerOffset()
	    {
		return (MeasurementPowerOffset)mComponents[0];
	    }
	    
	    public void setMeasurementPowerOffset(MeasurementPowerOffset measurementPowerOffset)
	    {
		mComponents[0] = measurementPowerOffset;
	    }
	    
	    
	    // Methods for field "feedback_cycle"
	    public Feedback_cycle_r7 getFeedback_cycle()
	    {
		return (Feedback_cycle_r7)mComponents[1];
	    }
	    
	    public void setFeedback_cycle(Feedback_cycle_r7 feedback_cycle)
	    {
		mComponents[1] = feedback_cycle;
	    }
	    
	    
	    // Methods for field "cqi_RepetitionFactor"
	    public CQI_RepetitionFactor getCqi_RepetitionFactor()
	    {
		return (CQI_RepetitionFactor)mComponents[2];
	    }
	    
	    public void setCqi_RepetitionFactor(CQI_RepetitionFactor cqi_RepetitionFactor)
	    {
		mComponents[2] = cqi_RepetitionFactor;
	    }
	    
	    
	    // Methods for field "deltaCQI"
	    public DeltaCQI getDeltaCQI()
	    {
		return (DeltaCQI)mComponents[3];
	    }
	    
	    public void setDeltaCQI(DeltaCQI deltaCQI)
	    {
		mComponents[3] = deltaCQI;
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
		    "Measurement_Feedback_Info_r7$ModeSpecificInfo$Fdd"
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
					"MeasurementPowerOffset"
				    ),
				    new QName (
					"InformationElements",
					"MeasurementPowerOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new MeasurementPowerOffset(-12), 
					    new MeasurementPowerOffset(26),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(-12),
					new java.lang.Long(26)
				    ),
				    null
				)
			    ),
			    "measurementPowerOffset",
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
					"Feedback_cycle_r7"
				    ),
				    new QName (
					"InformationElements",
					"Feedback-cycle-r7"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"fc0",
						0
					    ),
					    new MemberListElement (
						"fc2",
						1
					    ),
					    new MemberListElement (
						"fc4",
						2
					    ),
					    new MemberListElement (
						"fc8",
						3
					    ),
					    new MemberListElement (
						"fc10",
						4
					    ),
					    new MemberListElement (
						"fc20",
						5
					    ),
					    new MemberListElement (
						"fc40",
						6
					    ),
					    new MemberListElement (
						"fc80",
						7
					    ),
					    new MemberListElement (
						"fc160",
						8
					    ),
					    new MemberListElement (
						"fc16",
						9
					    ),
					    new MemberListElement (
						"fc32",
						10
					    ),
					    new MemberListElement (
						"fc64",
						11
					    ),
					    new MemberListElement (
						"spare4",
						12
					    ),
					    new MemberListElement (
						"spare3",
						13
					    ),
					    new MemberListElement (
						"spare2",
						14
					    ),
					    new MemberListElement (
						"spare1",
						15
					    )
					}
				    ),
				    0,
				    Feedback_cycle_r7.fc0
				)
			    ),
			    "feedback-cycle",
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
					"CQI_RepetitionFactor"
				    ),
				    new QName (
					"InformationElements",
					"CQI-RepetitionFactor"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CQI_RepetitionFactor(1), 
					    new CQI_RepetitionFactor(4),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(4)
				    ),
				    null
				)
			    ),
			    "cqi-RepetitionFactor",
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
					"DeltaCQI"
				    ),
				    new QName (
					"InformationElements",
					"DeltaCQI"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new DeltaCQI(0), 
					    new DeltaCQI(8),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(8)
				    ),
				    null
				)
			    ),
			    "deltaCQI",
			    3,
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
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Null tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Null tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Null();
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
		"Measurement_Feedback_Info_r7$ModeSpecificInfo"
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
				"Measurement_Feedback_Info_r7$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
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
	    "Measurement_Feedback_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "Measurement-Feedback-Info-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "Measurement_Feedback_Info_r7$ModeSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' Measurement_Feedback_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Measurement_Feedback_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Measurement_Feedback_Info_r7
