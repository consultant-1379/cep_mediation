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
 * Define the ASN1 Type MonitoredCellRACH_Result from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MonitoredCellRACH_Result extends Sequence {
    
    /**
     * The default constructor.
     */
    public MonitoredCellRACH_Result()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MonitoredCellRACH_Result(SFN_SFN_ObsTimeDifference sfn_SFN_ObsTimeDifference, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setSfn_SFN_ObsTimeDifference(sfn_SFN_ObsTimeDifference);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public MonitoredCellRACH_Result(ModeSpecificInfo modeSpecificInfo)
    {
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SFN_SFN_ObsTimeDifference();
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
		return new SFN_SFN_ObsTimeDifference();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn_SFN_ObsTimeDifference"
    public SFN_SFN_ObsTimeDifference getSfn_SFN_ObsTimeDifference()
    {
	return (SFN_SFN_ObsTimeDifference)mComponents[0];
    }
    
    public void setSfn_SFN_ObsTimeDifference(SFN_SFN_ObsTimeDifference sfn_SFN_ObsTimeDifference)
    {
	mComponents[0] = sfn_SFN_ObsTimeDifference;
    }
    
    public boolean hasSfn_SFN_ObsTimeDifference()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSfn_SFN_ObsTimeDifference()
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
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info, 
			    MeasurementQuantity measurementQuantity)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
		setMeasurementQuantity(measurementQuantity);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(PrimaryCPICH_Info primaryCPICH_Info)
	    {
		setPrimaryCPICH_Info(primaryCPICH_Info);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new PrimaryCPICH_Info();
		mComponents[1] = new MeasurementQuantity();
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
			return new PrimaryCPICH_Info();
		    case 1:
			return new MeasurementQuantity();
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
	    
	    
	    // Methods for field "measurementQuantity"
	    public MeasurementQuantity getMeasurementQuantity()
	    {
		return (MeasurementQuantity)mComponents[1];
	    }
	    
	    public void setMeasurementQuantity(MeasurementQuantity measurementQuantity)
	    {
		mComponents[1] = measurementQuantity;
	    }
	    
	    public boolean hasMeasurementQuantity()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteMeasurementQuantity()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type MeasurementQuantity from ASN1 Module InformationElements.
	     * @see Choice
	     */
	    public static class MeasurementQuantity extends Choice {
		
		/**
		 * The default constructor.
		 */
		public MeasurementQuantity()
		{
		}
		
		public static final  int  cpich_Ec_N0_chosen = 1;
		public static final  int  cpich_RSCP_chosen = 2;
		public static final  int  pathloss_chosen = 3;
		public static final  int  spare_chosen = 4;
		
		// Methods for field "cpich_Ec_N0"
		public static MeasurementQuantity createMeasurementQuantityWithCpich_Ec_N0(long cpich_Ec_N0)
		{
		    return createMeasurementQuantityWithCpich_Ec_N0(new CPICH_Ec_N0(cpich_Ec_N0));
		}
		
		public static MeasurementQuantity createMeasurementQuantityWithCpich_Ec_N0(CPICH_Ec_N0 cpich_Ec_N0)
		{
		    MeasurementQuantity __object = new MeasurementQuantity();

		    __object.setCpich_Ec_N0(cpich_Ec_N0);
		    return __object;
		}
		
		public boolean hasCpich_Ec_N0()
		{
		    return getChosenFlag() == cpich_Ec_N0_chosen;
		}
		
		public void setCpich_Ec_N0(long cpich_Ec_N0)
		{
		    setCpich_Ec_N0(new CPICH_Ec_N0(cpich_Ec_N0));
		}
		
		public void setCpich_Ec_N0(CPICH_Ec_N0 cpich_Ec_N0)
		{
		    setChosenValue(cpich_Ec_N0);
		    setChosenFlag(cpich_Ec_N0_chosen);
		}
		
		
		// Methods for field "cpich_RSCP"
		public static MeasurementQuantity createMeasurementQuantityWithCpich_RSCP(long cpich_RSCP)
		{
		    return createMeasurementQuantityWithCpich_RSCP(new CPICH_RSCP(cpich_RSCP));
		}
		
		public static MeasurementQuantity createMeasurementQuantityWithCpich_RSCP(CPICH_RSCP cpich_RSCP)
		{
		    MeasurementQuantity __object = new MeasurementQuantity();

		    __object.setCpich_RSCP(cpich_RSCP);
		    return __object;
		}
		
		public boolean hasCpich_RSCP()
		{
		    return getChosenFlag() == cpich_RSCP_chosen;
		}
		
		public void setCpich_RSCP(long cpich_RSCP)
		{
		    setCpich_RSCP(new CPICH_RSCP(cpich_RSCP));
		}
		
		public void setCpich_RSCP(CPICH_RSCP cpich_RSCP)
		{
		    setChosenValue(cpich_RSCP);
		    setChosenFlag(cpich_RSCP_chosen);
		}
		
		
		// Methods for field "pathloss"
		public static MeasurementQuantity createMeasurementQuantityWithPathloss(long pathloss)
		{
		    return createMeasurementQuantityWithPathloss(new Pathloss(pathloss));
		}
		
		public static MeasurementQuantity createMeasurementQuantityWithPathloss(Pathloss pathloss)
		{
		    MeasurementQuantity __object = new MeasurementQuantity();

		    __object.setPathloss(pathloss);
		    return __object;
		}
		
		public boolean hasPathloss()
		{
		    return getChosenFlag() == pathloss_chosen;
		}
		
		public void setPathloss(long pathloss)
		{
		    setPathloss(new Pathloss(pathloss));
		}
		
		public void setPathloss(Pathloss pathloss)
		{
		    setChosenValue(pathloss);
		    setChosenFlag(pathloss_chosen);
		}
		
		
		// Methods for field "spare"
		public static MeasurementQuantity createMeasurementQuantityWithSpare(Null spare)
		{
		    MeasurementQuantity __object = new MeasurementQuantity();

		    __object.setSpare(spare);
		    return __object;
		}
		
		public boolean hasSpare()
		{
		    return getChosenFlag() == spare_chosen;
		}
		
		public void setSpare(Null spare)
		{
		    setChosenValue(spare);
		    setChosenFlag(spare_chosen);
		}
		
		
		// Method to create a specific choice instance
		public AbstractData createInstance(int chosen)
		{
		    switch (chosen) {
			case cpich_Ec_N0_chosen:
			    return new CPICH_Ec_N0();
			case cpich_RSCP_chosen:
			    return new CPICH_RSCP();
			case pathloss_chosen:
			    return new Pathloss();
			case spare_chosen:
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
			    (short)0x8001
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"MonitoredCellRACH_Result$ModeSpecificInfo$Fdd$MeasurementQuantity"
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
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8000
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "CPICH_Ec_N0"
					),
					new QName (
					    "InformationElements",
					    "CPICH-Ec-N0"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new CPICH_Ec_N0(0), 
						new CPICH_Ec_N0(63),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(63)
					),
					null
				    )
				),
				"cpich-Ec-N0",
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
					    "CPICH_RSCP"
					),
					new QName (
					    "InformationElements",
					    "CPICH-RSCP"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new CPICH_RSCP(0), 
						new CPICH_RSCP(127),
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
				"cpich-RSCP",
				1,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new IntegerInfo (
					new Tags (
					    new short[] {
						(short)0x8002
					    }
					),
					new QName (
					    "rrc.informationelements",
					    "Pathloss"
					),
					new QName (
					    "InformationElements",
					    "Pathloss"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new Pathloss(46), 
						new Pathloss(173),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(46),
					    new java.lang.Long(173)
					),
					null
				    )
				),
				"pathloss",
				2,
				2
			    ),
			    new FieldInfo (
				new TypeInfoRef (
				    new TypeInfo (
					new Tags (
					    new short[] {
						(short)0x8003
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
				"spare",
				3,
				2
			    )
			}
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
		);
		
		/**
		 * Get the type descriptor (TypeInfo) of 'this' MeasurementQuantity object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' MeasurementQuantity object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for MeasurementQuantity

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
		    "MonitoredCellRACH_Result$ModeSpecificInfo$Fdd"
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
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "MonitoredCellRACH_Result$ModeSpecificInfo$Fdd$MeasurementQuantity"
				)
			    ),
			    "measurementQuantity",
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
	    public Tdd(CellParametersID cellParametersID, 
			    PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
	    {
		setCellParametersID(cellParametersID);
		setPrimaryCCPCH_RSCP(primaryCCPCH_RSCP);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellParametersID();
		mComponents[1] = new PrimaryCCPCH_RSCP();
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
			return new CellParametersID();
		    case 1:
			return new PrimaryCCPCH_RSCP();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellParametersID"
	    public CellParametersID getCellParametersID()
	    {
		return (CellParametersID)mComponents[0];
	    }
	    
	    public void setCellParametersID(CellParametersID cellParametersID)
	    {
		mComponents[0] = cellParametersID;
	    }
	    
	    
	    // Methods for field "primaryCCPCH_RSCP"
	    public PrimaryCCPCH_RSCP getPrimaryCCPCH_RSCP()
	    {
		return (PrimaryCCPCH_RSCP)mComponents[1];
	    }
	    
	    public void setPrimaryCCPCH_RSCP(PrimaryCCPCH_RSCP primaryCCPCH_RSCP)
	    {
		mComponents[1] = primaryCCPCH_RSCP;
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
		    "MonitoredCellRACH_Result$ModeSpecificInfo$Tdd"
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
					"CellParametersID"
				    ),
				    new QName (
					"InformationElements",
					"CellParametersID"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new CellParametersID(0), 
					    new CellParametersID(127),
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
			    "cellParametersID",
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
					"PrimaryCCPCH_RSCP"
				    ),
				    new QName (
					"InformationElements",
					"PrimaryCCPCH-RSCP"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PrimaryCCPCH_RSCP(0), 
					    new PrimaryCCPCH_RSCP(127),
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
			    "primaryCCPCH-RSCP",
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
		"MonitoredCellRACH_Result$ModeSpecificInfo"
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
				"MonitoredCellRACH_Result$ModeSpecificInfo$Fdd"
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
				"MonitoredCellRACH_Result$ModeSpecificInfo$Tdd"
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
	    "MonitoredCellRACH_Result"
	),
	new QName (
	    "InformationElements",
	    "MonitoredCellRACH-Result"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SFN_SFN_ObsTimeDifference"
			    ),
			    new QName (
				"InformationElements",
				"SFN-SFN-ObsTimeDifference"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SFN_SFN_ObsTimeDifference"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "sfn-SFN-ObsTimeDifference",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MonitoredCellRACH_Result$ModeSpecificInfo"
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
     * Get the type descriptor (TypeInfo) of 'this' MonitoredCellRACH_Result object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MonitoredCellRACH_Result object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MonitoredCellRACH_Result
