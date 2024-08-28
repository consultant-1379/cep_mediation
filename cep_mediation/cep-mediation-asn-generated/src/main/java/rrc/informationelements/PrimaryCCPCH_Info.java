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
 * Define the ASN1 Type PrimaryCCPCH_Info from ASN1 Module InformationElements.
 * @see Choice
 */

public class PrimaryCCPCH_Info extends Choice {
    
    /**
     * The default constructor.
     */
    public PrimaryCCPCH_Info()
    {
    }
    
    public static final  int  fdd_chosen = 1;
    public static final  int  tdd_chosen = 2;
    
    // Methods for field "fdd"
    public static PrimaryCCPCH_Info createPrimaryCCPCH_InfoWithFdd(Fdd fdd)
    {
	PrimaryCCPCH_Info __object = new PrimaryCCPCH_Info();

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
	public Fdd(BOOLEAN tx_DiversityIndicator)
	{
	    setTx_DiversityIndicator(tx_DiversityIndicator);
	}
	
	/**
	 * Construct with components.
	 */
	public Fdd(boolean tx_DiversityIndicator)
	{
	    this(new BOOLEAN(tx_DiversityIndicator));
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
	
	
	// Methods for field "tx_DiversityIndicator"
	public boolean getTx_DiversityIndicator()
	{
	    return ((BOOLEAN)mComponents[0]).booleanValue();
	}
	
	public void setTx_DiversityIndicator(boolean tx_DiversityIndicator)
	{
	    setTx_DiversityIndicator(new BOOLEAN(tx_DiversityIndicator));
	}
	
	public void setTx_DiversityIndicator(BOOLEAN tx_DiversityIndicator)
	{
	    mComponents[0] = tx_DiversityIndicator;
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
		"PrimaryCCPCH_Info$Fdd"
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
			"tx-DiversityIndicator",
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
    public static PrimaryCCPCH_Info createPrimaryCCPCH_InfoWithTdd(Tdd tdd)
    {
	PrimaryCCPCH_Info __object = new PrimaryCCPCH_Info();

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
	public Tdd(SyncCase syncCase, CellParametersID cellParametersID, 
			BOOLEAN sctd_Indicator)
	{
	    setSyncCase(syncCase);
	    setCellParametersID(cellParametersID);
	    setSctd_Indicator(sctd_Indicator);
	}
	
	/**
	 * Construct with components.
	 */
	public Tdd(SyncCase syncCase, CellParametersID cellParametersID, 
			boolean sctd_Indicator)
	{
	    this(syncCase, cellParametersID, new BOOLEAN(sctd_Indicator));
	}
	
	/**
	 * Construct with required components.
	 */
	public Tdd(boolean sctd_Indicator)
	{
	    setSctd_Indicator(sctd_Indicator);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SyncCase();
	    mComponents[1] = new CellParametersID();
	    mComponents[2] = new BOOLEAN();
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
		    return new SyncCase();
		case 1:
		    return new CellParametersID();
		case 2:
		    return new BOOLEAN();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "syncCase"
	public SyncCase getSyncCase()
	{
	    return (SyncCase)mComponents[0];
	}
	
	public void setSyncCase(SyncCase syncCase)
	{
	    mComponents[0] = syncCase;
	}
	
	public boolean hasSyncCase()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteSyncCase()
	{
	    setComponentAbsent(0);
	}
	
	
	
	/**
	 * Define the ASN1 Type SyncCase from ASN1 Module InformationElements.
	 * @see Choice
	 */
	public static class SyncCase extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public SyncCase()
	    {
	    }
	    
	    public static final  int  syncCase1_chosen = 1;
	    public static final  int  syncCase2_chosen = 2;
	    
	    // Methods for field "syncCase1"
	    public static SyncCase createSyncCaseWithSyncCase1(SyncCase1 syncCase1)
	    {
		SyncCase __object = new SyncCase();

		__object.setSyncCase1(syncCase1);
		return __object;
	    }
	    
	    public boolean hasSyncCase1()
	    {
		return getChosenFlag() == syncCase1_chosen;
	    }
	    
	    public void setSyncCase1(SyncCase1 syncCase1)
	    {
		setChosenValue(syncCase1);
		setChosenFlag(syncCase1_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type SyncCase1 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class SyncCase1 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public SyncCase1()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public SyncCase1(TimeslotNumber timeslot)
		{
		    setTimeslot(timeslot);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new TimeslotNumber();
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
			    return new TimeslotNumber();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "timeslot"
		public TimeslotNumber getTimeslot()
		{
		    return (TimeslotNumber)mComponents[0];
		}
		
		public void setTimeslot(TimeslotNumber timeslot)
		{
		    mComponents[0] = timeslot;
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
			"PrimaryCCPCH_Info$Tdd$SyncCase$SyncCase1"
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
					    "TimeslotNumber"
					),
					new QName (
					    "InformationElements",
					    "TimeslotNumber"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new TimeslotNumber(0), 
						new TimeslotNumber(14),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(14)
					),
					null
				    )
				),
				"timeslot",
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
		 * Get the type descriptor (TypeInfo) of 'this' SyncCase1 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' SyncCase1 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for SyncCase1

	    // Methods for field "syncCase2"
	    public static SyncCase createSyncCaseWithSyncCase2(SyncCase2 syncCase2)
	    {
		SyncCase __object = new SyncCase();

		__object.setSyncCase2(syncCase2);
		return __object;
	    }
	    
	    public boolean hasSyncCase2()
	    {
		return getChosenFlag() == syncCase2_chosen;
	    }
	    
	    public void setSyncCase2(SyncCase2 syncCase2)
	    {
		setChosenValue(syncCase2);
		setChosenFlag(syncCase2_chosen);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type SyncCase2 from ASN1 Module InformationElements.
	     * @see Sequence
	     */
	    public static class SyncCase2 extends Sequence {
		
		/**
		 * The default constructor.
		 */
		public SyncCase2()
		{
		}
		
		/**
		 * Construct with AbstractData components.
		 */
		public SyncCase2(TimeslotSync2 timeslotSync2)
		{
		    setTimeslotSync2(timeslotSync2);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new TimeslotSync2();
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
			    return new TimeslotSync2();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "timeslotSync2"
		public TimeslotSync2 getTimeslotSync2()
		{
		    return (TimeslotSync2)mComponents[0];
		}
		
		public void setTimeslotSync2(TimeslotSync2 timeslotSync2)
		{
		    mComponents[0] = timeslotSync2;
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
			"PrimaryCCPCH_Info$Tdd$SyncCase$SyncCase2"
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
					    "TimeslotSync2"
					),
					new QName (
					    "InformationElements",
					    "TimeslotSync2"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new TimeslotSync2(0), 
						new TimeslotSync2(6),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(6)
					),
					null
				    )
				),
				"timeslotSync2",
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
		 * Get the type descriptor (TypeInfo) of 'this' SyncCase2 object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' SyncCase2 object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for SyncCase2

	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case syncCase1_chosen:
			return new SyncCase1();
		    case syncCase2_chosen:
			return new SyncCase2();
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
		    "PrimaryCCPCH_Info$Tdd$SyncCase"
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
				    "PrimaryCCPCH_Info$Tdd$SyncCase$SyncCase1"
				)
			    ),
			    "syncCase1",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCCPCH_Info$Tdd$SyncCase$SyncCase2"
				)
			    ),
			    "syncCase2",
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
	     * Get the type descriptor (TypeInfo) of 'this' SyncCase object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' SyncCase object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for SyncCase

	// Methods for field "cellParametersID"
	public CellParametersID getCellParametersID()
	{
	    return (CellParametersID)mComponents[1];
	}
	
	public void setCellParametersID(CellParametersID cellParametersID)
	{
	    mComponents[1] = cellParametersID;
	}
	
	public boolean hasCellParametersID()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteCellParametersID()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "sctd_Indicator"
	public boolean getSctd_Indicator()
	{
	    return ((BOOLEAN)mComponents[2]).booleanValue();
	}
	
	public void setSctd_Indicator(boolean sctd_Indicator)
	{
	    setSctd_Indicator(new BOOLEAN(sctd_Indicator));
	}
	
	public void setSctd_Indicator(BOOLEAN sctd_Indicator)
	{
	    mComponents[2] = sctd_Indicator;
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
		"PrimaryCCPCH_Info$Tdd"
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
				"PrimaryCCPCH_Info$Tdd$SyncCase"
			    )
			),
			"syncCase",
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
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
			"sctd-Indicator",
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
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "PrimaryCCPCH_Info"
	),
	new QName (
	    "InformationElements",
	    "PrimaryCCPCH-Info"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PrimaryCCPCH_Info$Fdd"
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
			    "PrimaryCCPCH_Info$Tdd"
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
     * Get the type descriptor (TypeInfo) of 'this' PrimaryCCPCH_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PrimaryCCPCH_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PrimaryCCPCH_Info
