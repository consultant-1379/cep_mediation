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
 * Define the ASN1 Type UE_Positioning_PositionEstimateInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_PositionEstimateInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_PositionEstimateInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_PositionEstimateInfo(ReferenceTime referenceTime, 
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
	
	public static final  int  utran_GPSReferenceTimeResult_chosen = 1;
	public static final  int  gps_ReferenceTimeOnly_chosen = 2;
	public static final  int  cell_Timing_chosen = 3;
	
	// Methods for field "utran_GPSReferenceTimeResult"
	public static ReferenceTime createReferenceTimeWithUtran_GPSReferenceTimeResult(UTRAN_GPSReferenceTimeResult utran_GPSReferenceTimeResult)
	{
	    ReferenceTime __object = new ReferenceTime();

	    __object.setUtran_GPSReferenceTimeResult(utran_GPSReferenceTimeResult);
	    return __object;
	}
	
	public boolean hasUtran_GPSReferenceTimeResult()
	{
	    return getChosenFlag() == utran_GPSReferenceTimeResult_chosen;
	}
	
	public void setUtran_GPSReferenceTimeResult(UTRAN_GPSReferenceTimeResult utran_GPSReferenceTimeResult)
	{
	    setChosenValue(utran_GPSReferenceTimeResult);
	    setChosenFlag(utran_GPSReferenceTimeResult_chosen);
	}
	
	
	// Methods for field "gps_ReferenceTimeOnly"
	public static ReferenceTime createReferenceTimeWithGps_ReferenceTimeOnly(long gps_ReferenceTimeOnly)
	{
	    return createReferenceTimeWithGps_ReferenceTimeOnly(new GPS_TOW_1msec(gps_ReferenceTimeOnly));
	}
	
	public static ReferenceTime createReferenceTimeWithGps_ReferenceTimeOnly(GPS_TOW_1msec gps_ReferenceTimeOnly)
	{
	    ReferenceTime __object = new ReferenceTime();

	    __object.setGps_ReferenceTimeOnly(gps_ReferenceTimeOnly);
	    return __object;
	}
	
	public boolean hasGps_ReferenceTimeOnly()
	{
	    return getChosenFlag() == gps_ReferenceTimeOnly_chosen;
	}
	
	public void setGps_ReferenceTimeOnly(long gps_ReferenceTimeOnly)
	{
	    setGps_ReferenceTimeOnly(new GPS_TOW_1msec(gps_ReferenceTimeOnly));
	}
	
	public void setGps_ReferenceTimeOnly(GPS_TOW_1msec gps_ReferenceTimeOnly)
	{
	    setChosenValue(gps_ReferenceTimeOnly);
	    setChosenFlag(gps_ReferenceTimeOnly_chosen);
	}
	
	
	// Methods for field "cell_Timing"
	public static ReferenceTime createReferenceTimeWithCell_Timing(Cell_Timing cell_Timing)
	{
	    ReferenceTime __object = new ReferenceTime();

	    __object.setCell_Timing(cell_Timing);
	    return __object;
	}
	
	public boolean hasCell_Timing()
	{
	    return getChosenFlag() == cell_Timing_chosen;
	}
	
	public void setCell_Timing(Cell_Timing cell_Timing)
	{
	    setChosenValue(cell_Timing);
	    setChosenFlag(cell_Timing_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Cell_Timing from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Cell_Timing extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Cell_Timing()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Cell_Timing(INTEGER sfn, ModeSpecificInfo modeSpecificInfo)
	    {
		setSfn(sfn);
		setModeSpecificInfo(modeSpecificInfo);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Cell_Timing(long sfn, ModeSpecificInfo modeSpecificInfo)
	    {
		this(new INTEGER(sfn), modeSpecificInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
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
			return new INTEGER();
		    case 1:
			return new ModeSpecificInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "sfn"
	    public long getSfn()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setSfn(long sfn)
	    {
		setSfn(new INTEGER(sfn));
	    }
	    
	    public void setSfn(INTEGER sfn)
	    {
		mComponents[0] = sfn;
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
		    public Fdd(PrimaryCPICH_Info primaryCPICH_Info)
		    {
			setPrimaryCPICH_Info(primaryCPICH_Info);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new PrimaryCPICH_Info();
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
				return new PrimaryCPICH_Info();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "primaryCPICH_Info"
		    public PrimaryCPICH_Info getPrimaryCPICH_Info()
		    {
			return (PrimaryCPICH_Info)mComponents[0];
		    }
		    
		    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
		    {
			mComponents[0] = primaryCPICH_Info;
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
			    "UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo$Fdd"
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
						"PrimaryCPICH_Info"
					    ),
					    new QName (
						"InformationElements",
						"PrimaryCPICH-Info"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "PrimaryCPICH_Info"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "PrimaryCPICH_Info"
						)
					    ),
					    0
					)
				    ),
				    "primaryCPICH-Info",
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
		    public Tdd(CellAndChannelIdentity cellAndChannelIdentity)
		    {
			setCellAndChannelIdentity(cellAndChannelIdentity);
		    }
		    
		    public void initComponents()
		    {
			mComponents[0] = new CellAndChannelIdentity();
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
				return new CellAndChannelIdentity();
			    default:
				throw new InternalError("AbstractCollection.createInstance()");
			}
			
		    }
		    
		    
		    // Methods for field "cellAndChannelIdentity"
		    public CellAndChannelIdentity getCellAndChannelIdentity()
		    {
			return (CellAndChannelIdentity)mComponents[0];
		    }
		    
		    public void setCellAndChannelIdentity(CellAndChannelIdentity cellAndChannelIdentity)
		    {
			mComponents[0] = cellAndChannelIdentity;
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
			    "UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo$Tdd"
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
						"CellAndChannelIdentity"
					    ),
					    new QName (
						"InformationElements",
						"CellAndChannelIdentity"
					    ),
					    12314,
					    null,
					    new FieldsRef (
						new QName (
						    "rrc.informationelements",
						    "CellAndChannelIdentity"
						)
					    ),
					    0,
					    new TagDecodersRef (
						new QName (
						    "rrc.informationelements",
						    "CellAndChannelIdentity"
						)
					    ),
					    0
					)
				    ),
				    "cellAndChannelIdentity",
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
			"UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo"
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
					"UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo$Fdd"
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
					"UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo$Tdd"
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
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing"
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
					"com.oss.asn1",
					"INTEGER"
				    ),
				    new QName (
					"builtin",
					"INTEGER"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(4095),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(4095)
				    ),
				    null
				)
			    ),
			    "sfn",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing$ModeSpecificInfo"
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
	     * Get the type descriptor (TypeInfo) of 'this' Cell_Timing object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Cell_Timing object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Cell_Timing

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case utran_GPSReferenceTimeResult_chosen:
		    return new UTRAN_GPSReferenceTimeResult();
		case gps_ReferenceTimeOnly_chosen:
		    return new GPS_TOW_1msec();
		case cell_Timing_chosen:
		    return new Cell_Timing();
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
		"UE_Positioning_PositionEstimateInfo$ReferenceTime"
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
				    "UTRAN_GPSReferenceTimeResult"
				),
				new QName (
				    "InformationElements",
				    "UTRAN-GPSReferenceTimeResult"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UTRAN_GPSReferenceTimeResult"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UTRAN_GPSReferenceTimeResult"
				    )
				),
				0
			    )
			),
			"utran-GPSReferenceTimeResult",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GPS_TOW_1msec"
				),
				new QName (
				    "InformationElements",
				    "GPS-TOW-1msec"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new GPS_TOW_1msec(0), 
					new GPS_TOW_1msec(604799999),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(604799999)
				),
				null
			    )
			),
			"gps-ReferenceTimeOnly",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_PositionEstimateInfo$ReferenceTime$Cell_Timing"
			    )
			),
			"cell-Timing",
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "UE_Positioning_PositionEstimateInfo"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-PositionEstimateInfo"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_PositionEstimateInfo$ReferenceTime"
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_PositionEstimateInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_PositionEstimateInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_PositionEstimateInfo
