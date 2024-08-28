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
 * Define the ASN1 Type NewInterRATCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class NewInterRATCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public NewInterRATCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NewInterRATCell(InterRATCellID interRATCellID, 
		    TechnologySpecificInfo technologySpecificInfo)
    {
	setInterRATCellID(interRATCellID);
	setTechnologySpecificInfo(technologySpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public NewInterRATCell(TechnologySpecificInfo technologySpecificInfo)
    {
	setTechnologySpecificInfo(technologySpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new InterRATCellID();
	mComponents[1] = new TechnologySpecificInfo();
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
		return new InterRATCellID();
	    case 1:
		return new TechnologySpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interRATCellID"
    public InterRATCellID getInterRATCellID()
    {
	return (InterRATCellID)mComponents[0];
    }
    
    public void setInterRATCellID(InterRATCellID interRATCellID)
    {
	mComponents[0] = interRATCellID;
    }
    
    public boolean hasInterRATCellID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterRATCellID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "technologySpecificInfo"
    public TechnologySpecificInfo getTechnologySpecificInfo()
    {
	return (TechnologySpecificInfo)mComponents[1];
    }
    
    public void setTechnologySpecificInfo(TechnologySpecificInfo technologySpecificInfo)
    {
	mComponents[1] = technologySpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type TechnologySpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class TechnologySpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public TechnologySpecificInfo()
	{
	}
	
	public static final  int  gsm_chosen = 1;
	public static final  int  is_2000_chosen = 2;
	public static final  int  absent_chosen = 3;
	public static final  int  spare1_chosen = 4;
	
	// Methods for field "gsm"
	public static TechnologySpecificInfo createTechnologySpecificInfoWithGsm(Gsm gsm)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

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
	    public Gsm(CellSelectReselectInfoSIB_11_12 cellSelectionReselectionInfo, 
			    InterRATCellIndividualOffset interRATCellIndividualOffset, 
			    BSIC bsic, Frequency_Band frequency_band, 
			    BCCH_ARFCN bcch_ARFCN, Null dummy)
	    {
		setCellSelectionReselectionInfo(cellSelectionReselectionInfo);
		setInterRATCellIndividualOffset(interRATCellIndividualOffset);
		setBsic(bsic);
		setFrequency_band(frequency_band);
		setBcch_ARFCN(bcch_ARFCN);
		setDummy(dummy);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Gsm(InterRATCellIndividualOffset interRATCellIndividualOffset, 
			    BSIC bsic, Frequency_Band frequency_band, 
			    BCCH_ARFCN bcch_ARFCN)
	    {
		setInterRATCellIndividualOffset(interRATCellIndividualOffset);
		setBsic(bsic);
		setFrequency_band(frequency_band);
		setBcch_ARFCN(bcch_ARFCN);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new CellSelectReselectInfoSIB_11_12();
		mComponents[1] = new InterRATCellIndividualOffset();
		mComponents[2] = new BSIC();
		mComponents[3] = Frequency_Band.dcs1800BandUsed;
		mComponents[4] = new BCCH_ARFCN();
		mComponents[5] = new Null();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[6];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new CellSelectReselectInfoSIB_11_12();
		    case 1:
			return new InterRATCellIndividualOffset();
		    case 2:
			return new BSIC();
		    case 3:
			return Frequency_Band.dcs1800BandUsed;
		    case 4:
			return new BCCH_ARFCN();
		    case 5:
			return new Null();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "cellSelectionReselectionInfo"
	    public CellSelectReselectInfoSIB_11_12 getCellSelectionReselectionInfo()
	    {
		return (CellSelectReselectInfoSIB_11_12)mComponents[0];
	    }
	    
	    public void setCellSelectionReselectionInfo(CellSelectReselectInfoSIB_11_12 cellSelectionReselectionInfo)
	    {
		mComponents[0] = cellSelectionReselectionInfo;
	    }
	    
	    public boolean hasCellSelectionReselectionInfo()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteCellSelectionReselectionInfo()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "interRATCellIndividualOffset"
	    public InterRATCellIndividualOffset getInterRATCellIndividualOffset()
	    {
		return (InterRATCellIndividualOffset)mComponents[1];
	    }
	    
	    public void setInterRATCellIndividualOffset(InterRATCellIndividualOffset interRATCellIndividualOffset)
	    {
		mComponents[1] = interRATCellIndividualOffset;
	    }
	    
	    
	    // Methods for field "bsic"
	    public BSIC getBsic()
	    {
		return (BSIC)mComponents[2];
	    }
	    
	    public void setBsic(BSIC bsic)
	    {
		mComponents[2] = bsic;
	    }
	    
	    
	    // Methods for field "frequency_band"
	    public Frequency_Band getFrequency_band()
	    {
		return (Frequency_Band)mComponents[3];
	    }
	    
	    public void setFrequency_band(Frequency_Band frequency_band)
	    {
		mComponents[3] = frequency_band;
	    }
	    
	    
	    // Methods for field "bcch_ARFCN"
	    public BCCH_ARFCN getBcch_ARFCN()
	    {
		return (BCCH_ARFCN)mComponents[4];
	    }
	    
	    public void setBcch_ARFCN(BCCH_ARFCN bcch_ARFCN)
	    {
		mComponents[4] = bcch_ARFCN;
	    }
	    
	    
	    // Methods for field "dummy"
	    public Null getDummy()
	    {
		return (Null)mComponents[5];
	    }
	    
	    public void setDummy(Null dummy)
	    {
		mComponents[5] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(5);
	    }
	    
	    public void deleteDummy()
	    {
		setComponentAbsent(5);
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
		    "NewInterRATCell$TechnologySpecificInfo$Gsm"
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
					"CellSelectReselectInfoSIB_11_12"
				    ),
				    new QName (
					"InformationElements",
					"CellSelectReselectInfoSIB-11-12"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CellSelectReselectInfoSIB_11_12"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CellSelectReselectInfoSIB_11_12"
					)
				    ),
				    0
				)
			    ),
			    "cellSelectionReselectionInfo",
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
					"InterRATCellIndividualOffset"
				    ),
				    new QName (
					"InformationElements",
					"InterRATCellIndividualOffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new InterRATCellIndividualOffset(-50), 
					    new InterRATCellIndividualOffset(50),
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
			    "interRATCellIndividualOffset",
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
					"BSIC"
				    ),
				    new QName (
					"InformationElements",
					"BSIC"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "BSIC"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "BSIC"
					)
				    ),
				    0
				)
			    ),
			    "bsic",
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Frequency_Band"
				    ),
				    new QName (
					"InformationElements",
					"Frequency-Band"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"dcs1800BandUsed",
						0
					    ),
					    new MemberListElement (
						"pcs1900BandUsed",
						1
					    )
					}
				    ),
				    0,
				    Frequency_Band.dcs1800BandUsed
				)
			    ),
			    "frequency-band",
			    3,
			    2,
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
					"rrc.informationelements",
					"BCCH_ARFCN"
				    ),
				    new QName (
					"InformationElements",
					"BCCH-ARFCN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new BCCH_ARFCN(0), 
					    new BCCH_ARFCN(1023),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(1023)
				    ),
				    null
				)
			    ),
			    "bcch-ARFCN",
			    4,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8005
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
			    "dummy",
			    5,
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
				new TagDecoderElement((short)0x8002, 2)
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
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8005, 5)
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

	// Methods for field "is_2000"
	public static TechnologySpecificInfo createTechnologySpecificInfoWithIs_2000(Is_2000 is_2000)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

	    __object.setIs_2000(is_2000);
	    return __object;
	}
	
	public boolean hasIs_2000()
	{
	    return getChosenFlag() == is_2000_chosen;
	}
	
	public void setIs_2000(Is_2000 is_2000)
	{
	    setChosenValue(is_2000);
	    setChosenFlag(is_2000_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Is_2000 from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Is_2000 extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Is_2000()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Is_2000(IS_2000SpecificMeasInfo is_2000SpecificMeasInfo)
	    {
		setIs_2000SpecificMeasInfo(is_2000SpecificMeasInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = IS_2000SpecificMeasInfo.frequency;
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
			return IS_2000SpecificMeasInfo.frequency;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "is_2000SpecificMeasInfo"
	    public IS_2000SpecificMeasInfo getIs_2000SpecificMeasInfo()
	    {
		return (IS_2000SpecificMeasInfo)mComponents[0];
	    }
	    
	    public void setIs_2000SpecificMeasInfo(IS_2000SpecificMeasInfo is_2000SpecificMeasInfo)
	    {
		mComponents[0] = is_2000SpecificMeasInfo;
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
		    "NewInterRATCell$TechnologySpecificInfo$Is_2000"
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
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"IS_2000SpecificMeasInfo"
				    ),
				    new QName (
					"InformationElements",
					"IS-2000SpecificMeasInfo"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"frequency",
						0
					    ),
					    new MemberListElement (
						"timeslot",
						1
					    ),
					    new MemberListElement (
						"colourcode",
						2
					    ),
					    new MemberListElement (
						"outputpower",
						3
					    ),
					    new MemberListElement (
						"pn-Offset",
						4
					    )
					}
				    ),
				    0,
				    IS_2000SpecificMeasInfo.frequency
				)
			    ),
			    "is-2000SpecificMeasInfo",
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
	     * Get the type descriptor (TypeInfo) of 'this' Is_2000 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Is_2000 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Is_2000

	// Methods for field "absent"
	public static TechnologySpecificInfo createTechnologySpecificInfoWithAbsent(Null absent)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

	    __object.setAbsent(absent);
	    return __object;
	}
	
	public boolean hasAbsent()
	{
	    return getChosenFlag() == absent_chosen;
	}
	
	public void setAbsent(Null absent)
	{
	    setChosenValue(absent);
	    setChosenFlag(absent_chosen);
	}
	
	
	// Methods for field "spare1"
	public static TechnologySpecificInfo createTechnologySpecificInfoWithSpare1(Null spare1)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

	    __object.setSpare1(spare1);
	    return __object;
	}
	
	public boolean hasSpare1()
	{
	    return getChosenFlag() == spare1_chosen;
	}
	
	public void setSpare1(Null spare1)
	{
	    setChosenValue(spare1);
	    setChosenFlag(spare1_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_chosen:
		    return new Gsm();
		case is_2000_chosen:
		    return new Is_2000();
		case absent_chosen:
		    return new Null();
		case spare1_chosen:
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
		"NewInterRATCell$TechnologySpecificInfo"
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
				"NewInterRATCell$TechnologySpecificInfo$Gsm"
			    )
			),
			"gsm",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"NewInterRATCell$TechnologySpecificInfo$Is_2000"
			    )
			),
			"is-2000",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
			"absent",
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
			"spare1",
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
	 * Get the type descriptor (TypeInfo) of 'this' TechnologySpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TechnologySpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TechnologySpecificInfo

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
	    "NewInterRATCell"
	),
	new QName (
	    "InformationElements",
	    "NewInterRATCell"
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
				"InterRATCellID"
			    ),
			    new QName (
				"InformationElements",
				"InterRATCellID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new InterRATCellID(0), 
				    new InterRATCellID(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "interRATCellID",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "NewInterRATCell$TechnologySpecificInfo"
			)
		    ),
		    "technologySpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' NewInterRATCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NewInterRATCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NewInterRATCell
