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
 * Define the ASN1 Type UE_Positioning_PositionEstimateInfo_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_PositionEstimateInfo_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_PositionEstimateInfo_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_PositionEstimateInfo_v770ext(ReferenceTimeOptions referenceTimeOptions, 
		    BitString positionData, VelocityEstimate velocityEstimate, 
		    UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty)
    {
	setReferenceTimeOptions(referenceTimeOptions);
	setPositionData(positionData);
	setVelocityEstimate(velocityEstimate);
	setUe_Positioning_GPS_ReferenceTimeUncertainty(ue_Positioning_GPS_ReferenceTimeUncertainty);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_PositionEstimateInfo_v770ext(ReferenceTimeOptions referenceTimeOptions, 
		    BitString positionData)
    {
	setReferenceTimeOptions(referenceTimeOptions);
	setPositionData(positionData);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ReferenceTimeOptions();
	mComponents[1] = new BitString();
	mComponents[2] = new VelocityEstimate();
	mComponents[3] = new UE_Positioning_GPS_ReferenceTimeUncertainty();
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
		return new ReferenceTimeOptions();
	    case 1:
		return new BitString();
	    case 2:
		return new VelocityEstimate();
	    case 3:
		return new UE_Positioning_GPS_ReferenceTimeUncertainty();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "referenceTimeOptions"
    public ReferenceTimeOptions getReferenceTimeOptions()
    {
	return (ReferenceTimeOptions)mComponents[0];
    }
    
    public void setReferenceTimeOptions(ReferenceTimeOptions referenceTimeOptions)
    {
	mComponents[0] = referenceTimeOptions;
    }
    
    
    
    /**
     * Define the ASN1 Type ReferenceTimeOptions from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ReferenceTimeOptions extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ReferenceTimeOptions()
	{
	}
	
	public static final  int  earlier_than_r7_chosen = 1;
	public static final  int  r7_chosen = 2;
	
	// Methods for field "earlier_than_r7"
	public static ReferenceTimeOptions createReferenceTimeOptionsWithEarlier_than_r7(Null earlier_than_r7)
	{
	    ReferenceTimeOptions __object = new ReferenceTimeOptions();

	    __object.setEarlier_than_r7(earlier_than_r7);
	    return __object;
	}
	
	public boolean hasEarlier_than_r7()
	{
	    return getChosenFlag() == earlier_than_r7_chosen;
	}
	
	public void setEarlier_than_r7(Null earlier_than_r7)
	{
	    setChosenValue(earlier_than_r7);
	    setChosenFlag(earlier_than_r7_chosen);
	}
	
	
	// Methods for field "r7"
	public static ReferenceTimeOptions createReferenceTimeOptionsWithR7(R7 r7)
	{
	    ReferenceTimeOptions __object = new ReferenceTimeOptions();

	    __object.setR7(r7);
	    return __object;
	}
	
	public boolean hasR7()
	{
	    return getChosenFlag() == r7_chosen;
	}
	
	public void setR7(R7 r7)
	{
	    setChosenValue(r7);
	    setChosenFlag(r7_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type R7 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class R7 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public R7()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public R7(ReferenceTime referenceTime, 
			    PositionEstimate positionEstimate)
	    {
		setReferenceTime(referenceTime);
		setPositionEstimate(positionEstimate);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new ReferenceTime();
		mComponents[1] = new PositionEstimate();
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
			return new ReferenceTime();
		    case 1:
			return new PositionEstimate();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "referenceTime"
	    public ReferenceTime getReferenceTime()
	    {
		return (ReferenceTime)mComponents[0];
	    }
	    
	    public void setReferenceTime(ReferenceTime referenceTime)
	    {
		mComponents[0] = referenceTime;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type ReferenceTime from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class ReferenceTime extends Choice {
		
		/**
		 * The default constructor.
		 */
		public ReferenceTime()
		{
		}
		
		public static final  int  utran_GANSSReferenceTimeResult_chosen = 1;
		public static final  int  ganssReferenceTimeOnly_chosen = 2;
		
		// Methods for field "utran_GANSSReferenceTimeResult"
		public static ReferenceTime createReferenceTimeWithUtran_GANSSReferenceTimeResult(UTRAN_GANSSReferenceTime utran_GANSSReferenceTimeResult)
		{
		    ReferenceTime __object = new ReferenceTime();

		    __object.setUtran_GANSSReferenceTimeResult(utran_GANSSReferenceTimeResult);
		    return __object;
		}
		
		public boolean hasUtran_GANSSReferenceTimeResult()
		{
		    return getChosenFlag() == utran_GANSSReferenceTimeResult_chosen;
		}
		
		public void setUtran_GANSSReferenceTimeResult(UTRAN_GANSSReferenceTime utran_GANSSReferenceTimeResult)
		{
		    setChosenValue(utran_GANSSReferenceTimeResult);
		    setChosenFlag(utran_GANSSReferenceTimeResult_chosen);
		}
		
		
		// Methods for field "ganssReferenceTimeOnly"
		public static ReferenceTime createReferenceTimeWithGanssReferenceTimeOnly(GANSSReferenceTimeOnly ganssReferenceTimeOnly)
		{
		    ReferenceTime __object = new ReferenceTime();

		    __object.setGanssReferenceTimeOnly(ganssReferenceTimeOnly);
		    return __object;
		}
		
		public boolean hasGanssReferenceTimeOnly()
		{
		    return getChosenFlag() == ganssReferenceTimeOnly_chosen;
		}
		
		public void setGanssReferenceTimeOnly(GANSSReferenceTimeOnly ganssReferenceTimeOnly)
		{
		    setChosenValue(ganssReferenceTimeOnly);
		    setChosenFlag(ganssReferenceTimeOnly_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case utran_GANSSReferenceTimeResult_chosen:
			    return new UTRAN_GANSSReferenceTime();
			case ganssReferenceTimeOnly_chosen:
			    return new GANSSReferenceTimeOnly();
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
			"UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions$R7$ReferenceTime"
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
					    "UTRAN_GANSSReferenceTime"
					),
					new QName (
					    "InformationElements",
					    "UTRAN-GANSSReferenceTime"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"UTRAN_GANSSReferenceTime"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"UTRAN_GANSSReferenceTime"
					    )
					),
					0
				    )
				),
				"utran-GANSSReferenceTimeResult",
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
					    "GANSSReferenceTimeOnly"
					),
					new QName (
					    "InformationElements",
					    "GANSSReferenceTimeOnly"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"GANSSReferenceTimeOnly"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"GANSSReferenceTimeOnly"
					    )
					),
					0
				    )
				),
				"ganssReferenceTimeOnly",
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
		 * Get the type descriptor (TypeInfo) of 'this' ReferenceTime object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' ReferenceTime object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for ReferenceTime

	    // Methods for field "positionEstimate"
	    public PositionEstimate getPositionEstimate()
	    {
		return (PositionEstimate)mComponents[1];
	    }
	    
	    public void setPositionEstimate(PositionEstimate positionEstimate)
	    {
		mComponents[1] = positionEstimate;
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
		    "UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions$R7"
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
				    "UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions$R7$ReferenceTime"
				)
			    ),
			    "referenceTime",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PositionEstimate"
				    ),
				    new QName (
					"InformationElements",
					"PositionEstimate"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "PositionEstimate"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2),
					    new TagDecoderElement((short)0x8003, 3),
					    new TagDecoderElement((short)0x8004, 4)
					}
				    )
				)
			    ),
			    "positionEstimate",
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
	     * Get the type descriptor (TypeInfo) of 'this' R7 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' R7 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for R7

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case earlier_than_r7_chosen:
		    return new Null();
		case r7_chosen:
		    return new R7();
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
		"UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions"
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
			"earlier-than-r7",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions$R7"
			    )
			),
			"r7",
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
	 * Get the type descriptor (TypeInfo) of 'this' ReferenceTimeOptions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ReferenceTimeOptions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ReferenceTimeOptions

    // Methods for field "positionData"
    public BitString getPositionData()
    {
	return (BitString)mComponents[1];
    }
    
    public void setPositionData(BitString positionData)
    {
	mComponents[1] = positionData;
    }
    
    
    // Methods for field "velocityEstimate"
    public VelocityEstimate getVelocityEstimate()
    {
	return (VelocityEstimate)mComponents[2];
    }
    
    public void setVelocityEstimate(VelocityEstimate velocityEstimate)
    {
	mComponents[2] = velocityEstimate;
    }
    
    public boolean hasVelocityEstimate()
    {
	return componentIsPresent(2);
    }
    
    public void deleteVelocityEstimate()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_Positioning_GPS_ReferenceTimeUncertainty"
    public UE_Positioning_GPS_ReferenceTimeUncertainty getUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return (UE_Positioning_GPS_ReferenceTimeUncertainty)mComponents[3];
    }
    
    public void setUe_Positioning_GPS_ReferenceTimeUncertainty(UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty)
    {
	mComponents[3] = ue_Positioning_GPS_ReferenceTimeUncertainty;
    }
    
    public boolean hasUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	setComponentAbsent(3);
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
	    "UE_Positioning_PositionEstimateInfo_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-PositionEstimateInfo-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_PositionEstimateInfo_v770ext$ReferenceTimeOptions"
			)
		    ),
		    "referenceTimeOptions",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(16)
				)
			    ),
			    new Bounds (
				new java.lang.Long(16),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "positionData",
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
				"VelocityEstimate"
			    ),
			    new QName (
				"InformationElements",
				"VelocityEstimate"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "VelocityEstimate"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "velocityEstimate",
		    2,
		    3,
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
				"UE_Positioning_GPS_ReferenceTimeUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTimeUncertainty"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(0), 
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(127),
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
		    "ue-Positioning-GPS-ReferenceTimeUncertainty",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_PositionEstimateInfo_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_PositionEstimateInfo_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_PositionEstimateInfo_v770ext
