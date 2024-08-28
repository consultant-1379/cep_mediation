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
 * Define the ASN1 Type UE_Positioning_GANSS_ReferenceTime_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GANSS_ReferenceTime_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_ReferenceTime_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GANSS_ReferenceTime_r10(INTEGER ganssDay, 
		    INTEGER ganss_Day_Cycle_Number, INTEGER ganssTod, 
		    INTEGER ganssTodUncertainty, INTEGER ganssTimeId, 
		    Utran_ganssreferenceTime utran_ganssreferenceTime, 
		    Tutran_Ganss_DriftRate tutran_ganss_driftRate)
    {
	setGanssDay(ganssDay);
	setGanss_Day_Cycle_Number(ganss_Day_Cycle_Number);
	setGanssTod(ganssTod);
	setGanssTodUncertainty(ganssTodUncertainty);
	setGanssTimeId(ganssTimeId);
	setUtran_ganssreferenceTime(utran_ganssreferenceTime);
	setTutran_ganss_driftRate(tutran_ganss_driftRate);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GANSS_ReferenceTime_r10(long ganssDay, 
		    long ganss_Day_Cycle_Number, long ganssTod, 
		    long ganssTodUncertainty, long ganssTimeId, 
		    Utran_ganssreferenceTime utran_ganssreferenceTime, 
		    Tutran_Ganss_DriftRate tutran_ganss_driftRate)
    {
	this(new INTEGER(ganssDay), new INTEGER(ganss_Day_Cycle_Number), 
	     new INTEGER(ganssTod), new INTEGER(ganssTodUncertainty), 
	     new INTEGER(ganssTimeId), utran_ganssreferenceTime, 
	     tutran_ganss_driftRate);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GANSS_ReferenceTime_r10(long ganssTod)
    {
	setGanssTod(ganssTod);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new Utran_ganssreferenceTime();
	mComponents[6] = Tutran_Ganss_DriftRate.ugdr0;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new Utran_ganssreferenceTime();
	    case 6:
		return Tutran_Ganss_DriftRate.ugdr0;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssDay"
    public long getGanssDay()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssDay(long ganssDay)
    {
	setGanssDay(new INTEGER(ganssDay));
    }
    
    public void setGanssDay(INTEGER ganssDay)
    {
	mComponents[0] = ganssDay;
    }
    
    public boolean hasGanssDay()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssDay()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ganss_Day_Cycle_Number"
    public long getGanss_Day_Cycle_Number()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGanss_Day_Cycle_Number(long ganss_Day_Cycle_Number)
    {
	setGanss_Day_Cycle_Number(new INTEGER(ganss_Day_Cycle_Number));
    }
    
    public void setGanss_Day_Cycle_Number(INTEGER ganss_Day_Cycle_Number)
    {
	mComponents[1] = ganss_Day_Cycle_Number;
    }
    
    public boolean hasGanss_Day_Cycle_Number()
    {
	return componentIsPresent(1);
    }
    
    public void deleteGanss_Day_Cycle_Number()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ganssTod"
    public long getGanssTod()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setGanssTod(long ganssTod)
    {
	setGanssTod(new INTEGER(ganssTod));
    }
    
    public void setGanssTod(INTEGER ganssTod)
    {
	mComponents[2] = ganssTod;
    }
    
    
    // Methods for field "ganssTodUncertainty"
    public long getGanssTodUncertainty()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setGanssTodUncertainty(long ganssTodUncertainty)
    {
	setGanssTodUncertainty(new INTEGER(ganssTodUncertainty));
    }
    
    public void setGanssTodUncertainty(INTEGER ganssTodUncertainty)
    {
	mComponents[3] = ganssTodUncertainty;
    }
    
    public boolean hasGanssTodUncertainty()
    {
	return componentIsPresent(3);
    }
    
    public void deleteGanssTodUncertainty()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ganssTimeId"
    public long getGanssTimeId()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setGanssTimeId(long ganssTimeId)
    {
	setGanssTimeId(new INTEGER(ganssTimeId));
    }
    
    public void setGanssTimeId(INTEGER ganssTimeId)
    {
	mComponents[4] = ganssTimeId;
    }
    
    public boolean hasGanssTimeId()
    {
	return componentIsPresent(4);
    }
    
    public void deleteGanssTimeId()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "utran_ganssreferenceTime"
    public Utran_ganssreferenceTime getUtran_ganssreferenceTime()
    {
	return (Utran_ganssreferenceTime)mComponents[5];
    }
    
    public void setUtran_ganssreferenceTime(Utran_ganssreferenceTime utran_ganssreferenceTime)
    {
	mComponents[5] = utran_ganssreferenceTime;
    }
    
    public boolean hasUtran_ganssreferenceTime()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUtran_ganssreferenceTime()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type Utran_ganssreferenceTime from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Utran_ganssreferenceTime extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Utran_ganssreferenceTime()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Utran_ganssreferenceTime(INTEGER timingOfCellFrames, Mode mode, 
			INTEGER referenceSfn)
	{
	    setTimingOfCellFrames(timingOfCellFrames);
	    setMode(mode);
	    setReferenceSfn(referenceSfn);
	}
	
	/**
	 * Construct with components.
	 */
	public Utran_ganssreferenceTime(long timingOfCellFrames, Mode mode, 
			long referenceSfn)
	{
	    this(new INTEGER(timingOfCellFrames), mode, 
		 new INTEGER(referenceSfn));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new Mode();
	    mComponents[2] = new INTEGER();
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
		    return new INTEGER();
		case 1:
		    return new Mode();
		case 2:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "timingOfCellFrames"
	public long getTimingOfCellFrames()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setTimingOfCellFrames(long timingOfCellFrames)
	{
	    setTimingOfCellFrames(new INTEGER(timingOfCellFrames));
	}
	
	public void setTimingOfCellFrames(INTEGER timingOfCellFrames)
	{
	    mComponents[0] = timingOfCellFrames;
	}
	
	
	// Methods for field "mode"
	public Mode getMode()
	{
	    return (Mode)mComponents[1];
	}
	
	public void setMode(Mode mode)
	{
	    mComponents[1] = mode;
	}
	
	
	
	/**
	 * Define the ASN1 Type Mode from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class Mode extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Mode()
	    {
	    }
	    
	    public static final  int  fdd_chosen = 1;
	    public static final  int  tdd_chosen = 2;
	    
	    // Methods for field "fdd"
	    public static Mode createModeWithFdd(Fdd fdd)
	    {
		Mode __object = new Mode();

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
		public Fdd(PrimaryCPICH_Info primary_CPICH_Info)
		{
		    setPrimary_CPICH_Info(primary_CPICH_Info);
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
		
		
		// Methods for field "primary_CPICH_Info"
		public PrimaryCPICH_Info getPrimary_CPICH_Info()
		{
		    return (PrimaryCPICH_Info)mComponents[0];
		}
		
		public void setPrimary_CPICH_Info(PrimaryCPICH_Info primary_CPICH_Info)
		{
		    mComponents[0] = primary_CPICH_Info;
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
			"UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode$Fdd"
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
				"primary-CPICH-Info",
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
	    public static Mode createModeWithTdd(Tdd tdd)
	    {
		Mode __object = new Mode();

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
		public Tdd(CellParametersID cellParameters)
		{
		    setCellParameters(cellParameters);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new CellParametersID();
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
			    return new CellParametersID();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "cellParameters"
		public CellParametersID getCellParameters()
		{
		    return (CellParametersID)mComponents[0];
		}
		
		public void setCellParameters(CellParametersID cellParameters)
		{
		    mComponents[0] = cellParameters;
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
			"UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode$Tdd"
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
				"cellParameters",
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
		    "UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode"
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
				    "UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode$Fdd"
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
				    "UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode$Tdd"
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
	     * Get the type descriptor (TypeInfo) of 'this' Mode object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Mode object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Mode

	// Methods for field "referenceSfn"
	public long getReferenceSfn()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setReferenceSfn(long referenceSfn)
	{
	    setReferenceSfn(new INTEGER(referenceSfn));
	}
	
	public void setReferenceSfn(INTEGER referenceSfn)
	{
	    mComponents[2] = referenceSfn;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime"
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
					new com.oss.asn1.INTEGER(3999999),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(3999999)
				),
				null
			    )
			),
			"timingOfCellFrames",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime$Mode"
			    )
			),
			"mode",
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
			"referenceSfn",
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Utran_ganssreferenceTime object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Utran_ganssreferenceTime object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Utran_ganssreferenceTime

    // Methods for field "tutran_ganss_driftRate"
    public Tutran_Ganss_DriftRate getTutran_ganss_driftRate()
    {
	return (Tutran_Ganss_DriftRate)mComponents[6];
    }
    
    public void setTutran_ganss_driftRate(Tutran_Ganss_DriftRate tutran_ganss_driftRate)
    {
	mComponents[6] = tutran_ganss_driftRate;
    }
    
    public boolean hasTutran_ganss_driftRate()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTutran_ganss_driftRate()
    {
	setComponentAbsent(6);
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
	    "UE_Positioning_GANSS_ReferenceTime_r10"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-ReferenceTime-r10"
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
				    new com.oss.asn1.INTEGER(8191),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8191)
			    ),
			    null
			)
		    ),
		    "ganssDay",
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
				    new com.oss.asn1.INTEGER(7),
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
		    "ganss-Day-Cycle-Number",
		    1,
		    3,
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
				    new com.oss.asn1.INTEGER(86399),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(86399)
			    ),
			    null
			)
		    ),
		    "ganssTod",
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
				    new com.oss.asn1.INTEGER(127),
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
		    "ganssTodUncertainty",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(7),
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
		    "ganssTimeId",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GANSS_ReferenceTime_r10$Utran_ganssreferenceTime"
			)
		    ),
		    "utran-ganssreferenceTime",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"Tutran_Ganss_DriftRate"
			    ),
			    new QName (
				"InformationElements",
				"Tutran-Ganss-DriftRate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ugdr0",
					0
				    ),
				    new MemberListElement (
					"ugdr1",
					1
				    ),
				    new MemberListElement (
					"ugdr2",
					2
				    ),
				    new MemberListElement (
					"ugdr5",
					3
				    ),
				    new MemberListElement (
					"ugdr10",
					4
				    ),
				    new MemberListElement (
					"ugdr15",
					5
				    ),
				    new MemberListElement (
					"ugdr25",
					6
				    ),
				    new MemberListElement (
					"ugdr50",
					7
				    ),
				    new MemberListElement (
					"ugdr-1",
					8
				    ),
				    new MemberListElement (
					"ugdr-2",
					9
				    ),
				    new MemberListElement (
					"ugdr-5",
					10
				    ),
				    new MemberListElement (
					"ugdr-10",
					11
				    ),
				    new MemberListElement (
					"ugdr-15",
					12
				    ),
				    new MemberListElement (
					"ugdr-25",
					13
				    ),
				    new MemberListElement (
					"ugdr-50",
					14
				    ),
				    new MemberListElement (
					"spare",
					15
				    )
				}
			    ),
			    0,
			    Tutran_Ganss_DriftRate.ugdr0
			)
		    ),
		    "tutran-ganss-driftRate",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_ReferenceTime_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_ReferenceTime_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_ReferenceTime_r10
