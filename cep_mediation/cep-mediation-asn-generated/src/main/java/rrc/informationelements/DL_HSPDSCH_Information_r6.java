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
 * Define the ASN1 Type DL_HSPDSCH_Information_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_HSPDSCH_Information_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_HSPDSCH_Information_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_HSPDSCH_Information_r6(HS_SCCH_Info_r6 hs_scch_Info, 
		    Measurement_Feedback_Info measurement_feedback_Info, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setHs_scch_Info(hs_scch_Info);
	setMeasurement_feedback_Info(measurement_feedback_Info);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public DL_HSPDSCH_Information_r6(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HS_SCCH_Info_r6();
	mComponents[1] = new Measurement_Feedback_Info();
	mComponents[2] = new ModeSpecificInfo();
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
		return new HS_SCCH_Info_r6();
	    case 1:
		return new Measurement_Feedback_Info();
	    case 2:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hs_scch_Info"
    public HS_SCCH_Info_r6 getHs_scch_Info()
    {
	return (HS_SCCH_Info_r6)mComponents[0];
    }
    
    public void setHs_scch_Info(HS_SCCH_Info_r6 hs_scch_Info)
    {
	mComponents[0] = hs_scch_Info;
    }
    
    public boolean hasHs_scch_Info()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHs_scch_Info()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "measurement_feedback_Info"
    public Measurement_Feedback_Info getMeasurement_feedback_Info()
    {
	return (Measurement_Feedback_Info)mComponents[1];
    }
    
    public void setMeasurement_feedback_Info(Measurement_Feedback_Info measurement_feedback_Info)
    {
	mComponents[1] = measurement_feedback_Info;
    }
    
    public boolean hasMeasurement_feedback_Info()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMeasurement_feedback_Info()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[2];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[2] = modeSpecificInfo;
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
	
	public static final  int  tdd_chosen = 1;
	public static final  int  fdd_chosen = 2;
	
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
	 * @see Choice
	 */
	public static class Tdd extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    public static final  int  tdd384_chosen = 1;
	    public static final  int  tdd128_chosen = 2;
	    
	    // Methods for field "tdd384"
	    public static Tdd createTddWithTdd384(Tdd384 tdd384)
	    {
		Tdd __object = new Tdd();

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
		public Tdd384(DL_HSPDSCH_TS_Configuration dl_HSPDSCH_TS_Configuration)
		{
		    setDl_HSPDSCH_TS_Configuration(dl_HSPDSCH_TS_Configuration);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new DL_HSPDSCH_TS_Configuration();
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
			    return new DL_HSPDSCH_TS_Configuration();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "dl_HSPDSCH_TS_Configuration"
		public DL_HSPDSCH_TS_Configuration getDl_HSPDSCH_TS_Configuration()
		{
		    return (DL_HSPDSCH_TS_Configuration)mComponents[0];
		}
		
		public void setDl_HSPDSCH_TS_Configuration(DL_HSPDSCH_TS_Configuration dl_HSPDSCH_TS_Configuration)
		{
		    mComponents[0] = dl_HSPDSCH_TS_Configuration;
		}
		
		public boolean hasDl_HSPDSCH_TS_Configuration()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteDl_HSPDSCH_TS_Configuration()
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
			"DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd$Tdd384"
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
				    new ContainerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "DL_HSPDSCH_TS_Configuration"
					),
					new QName (
					    "InformationElements",
					    "DL-HSPDSCH-TS-Configuration"
					),
					12314,
					new SizeConstraint (
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new com.oss.asn1.INTEGER(1), 
						    new com.oss.asn1.INTEGER(13),
						    0
						)
					    )
					),
					new Bounds (
					    new java.lang.Long(1),
					    new java.lang.Long(13)
					),
					new TypeInfoRef (
					    new QName (
						"rrc.informationelements",
						"DL_HSPDSCH_TS_Configuration$Sequence_"
					    )
					)
				    )
				),
				"dl-HSPDSCH-TS-Configuration",
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
	    public static Tdd createTddWithTdd128(Tdd128 tdd128)
	    {
		Tdd __object = new Tdd();

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
		public Tdd128(HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration_tdd128)
		{
		    setHs_PDSCH_Midamble_Configuration_tdd128(hs_PDSCH_Midamble_Configuration_tdd128);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new HS_PDSCH_Midamble_Configuration_TDD128();
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
			    return new HS_PDSCH_Midamble_Configuration_TDD128();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "hs_PDSCH_Midamble_Configuration_tdd128"
		public HS_PDSCH_Midamble_Configuration_TDD128 getHs_PDSCH_Midamble_Configuration_tdd128()
		{
		    return (HS_PDSCH_Midamble_Configuration_TDD128)mComponents[0];
		}
		
		public void setHs_PDSCH_Midamble_Configuration_tdd128(HS_PDSCH_Midamble_Configuration_TDD128 hs_PDSCH_Midamble_Configuration_tdd128)
		{
		    mComponents[0] = hs_PDSCH_Midamble_Configuration_tdd128;
		}
		
		public boolean hasHs_PDSCH_Midamble_Configuration_tdd128()
		{
		    return componentIsPresent(0);
		}
		
		public void deleteHs_PDSCH_Midamble_Configuration_tdd128()
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
			"DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd$Tdd128"
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
					    "HS_PDSCH_Midamble_Configuration_TDD128"
					),
					new QName (
					    "InformationElements",
					    "HS-PDSCH-Midamble-Configuration-TDD128"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"HS_PDSCH_Midamble_Configuration_TDD128"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"HS_PDSCH_Midamble_Configuration_TDD128"
					    )
					),
					0
				    )
				),
				"hs-PDSCH-Midamble-Configuration-tdd128",
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
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd"
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
				    "DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd$Tdd384"
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
				    "DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd$Tdd128"
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

	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Null fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Null fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case tdd_chosen:
		    return new Tdd();
		case fdd_chosen:
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_HSPDSCH_Information_r6$ModeSpecificInfo"
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
				"DL_HSPDSCH_Information_r6$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
			"fdd",
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
	    "DL_HSPDSCH_Information_r6"
	),
	new QName (
	    "InformationElements",
	    "DL-HSPDSCH-Information-r6"
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
				"HS_SCCH_Info_r6"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-Info-r6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "HS_SCCH_Info_r6"
				)
			    ),
			    0
			)
		    ),
		    "hs-scch-Info",
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
				"Measurement_Feedback_Info"
			    ),
			    new QName (
				"InformationElements",
				"Measurement-Feedback-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "Measurement_Feedback_Info"
				)
			    ),
			    0
			)
		    ),
		    "measurement-feedback-Info",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_HSPDSCH_Information_r6$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_HSPDSCH_Information_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_HSPDSCH_Information_r6
