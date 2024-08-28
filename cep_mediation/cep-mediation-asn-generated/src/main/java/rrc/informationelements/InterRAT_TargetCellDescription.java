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
 * Define the ASN1 Type InterRAT_TargetCellDescription from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRAT_TargetCellDescription extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRAT_TargetCellDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRAT_TargetCellDescription(TechnologySpecificInfo technologySpecificInfo)
    {
	setTechnologySpecificInfo(technologySpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TechnologySpecificInfo();
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
		return new TechnologySpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "technologySpecificInfo"
    public TechnologySpecificInfo getTechnologySpecificInfo()
    {
	return (TechnologySpecificInfo)mComponents[0];
    }
    
    public void setTechnologySpecificInfo(TechnologySpecificInfo technologySpecificInfo)
    {
	mComponents[0] = technologySpecificInfo;
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
	public static final  int  spare2_chosen = 3;
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
	    public Gsm(BSIC bsic, Frequency_Band frequency_band, 
			    BCCH_ARFCN bcch_ARFCN, NC_Mode ncMode)
	    {
		setBsic(bsic);
		setFrequency_band(frequency_band);
		setBcch_ARFCN(bcch_ARFCN);
		setNcMode(ncMode);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Gsm(BSIC bsic, Frequency_Band frequency_band, 
			    BCCH_ARFCN bcch_ARFCN)
	    {
		setBsic(bsic);
		setFrequency_band(frequency_band);
		setBcch_ARFCN(bcch_ARFCN);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BSIC();
		mComponents[1] = Frequency_Band.dcs1800BandUsed;
		mComponents[2] = new BCCH_ARFCN();
		mComponents[3] = new NC_Mode();
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
			return new BSIC();
		    case 1:
			return Frequency_Band.dcs1800BandUsed;
		    case 2:
			return new BCCH_ARFCN();
		    case 3:
			return new NC_Mode();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "bsic"
	    public BSIC getBsic()
	    {
		return (BSIC)mComponents[0];
	    }
	    
	    public void setBsic(BSIC bsic)
	    {
		mComponents[0] = bsic;
	    }
	    
	    
	    // Methods for field "frequency_band"
	    public Frequency_Band getFrequency_band()
	    {
		return (Frequency_Band)mComponents[1];
	    }
	    
	    public void setFrequency_band(Frequency_Band frequency_band)
	    {
		mComponents[1] = frequency_band;
	    }
	    
	    
	    // Methods for field "bcch_ARFCN"
	    public BCCH_ARFCN getBcch_ARFCN()
	    {
		return (BCCH_ARFCN)mComponents[2];
	    }
	    
	    public void setBcch_ARFCN(BCCH_ARFCN bcch_ARFCN)
	    {
		mComponents[2] = bcch_ARFCN;
	    }
	    
	    
	    // Methods for field "ncMode"
	    public NC_Mode getNcMode()
	    {
		return (NC_Mode)mComponents[3];
	    }
	    
	    public void setNcMode(NC_Mode ncMode)
	    {
		mComponents[3] = ncMode;
	    }
	    
	    public boolean hasNcMode()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteNcMode()
	    {
		setComponentAbsent(3);
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
		    "InterRAT_TargetCellDescription$TechnologySpecificInfo$Gsm"
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
			    2,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new BitStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"NC_Mode"
				    ),
				    new QName (
					"InformationElements",
					"NC-Mode"
				    ),
				    12314,
				    new SizeConstraint (
					new SingleValueConstraint (
					    new com.oss.asn1.INTEGER(3)
					)
				    ),
				    new Bounds (
					new java.lang.Long(3),
					new java.lang.Long(3)
				    ),
				    null
				)
			    ),
			    "ncMode",
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
	public static TechnologySpecificInfo createTechnologySpecificInfoWithIs_2000(Null is_2000)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

	    __object.setIs_2000(is_2000);
	    return __object;
	}
	
	public boolean hasIs_2000()
	{
	    return getChosenFlag() == is_2000_chosen;
	}
	
	public void setIs_2000(Null is_2000)
	{
	    setChosenValue(is_2000);
	    setChosenFlag(is_2000_chosen);
	}
	
	
	// Methods for field "spare2"
	public static TechnologySpecificInfo createTechnologySpecificInfoWithSpare2(Null spare2)
	{
	    TechnologySpecificInfo __object = new TechnologySpecificInfo();

	    __object.setSpare2(spare2);
	    return __object;
	}
	
	public boolean hasSpare2()
	{
	    return getChosenFlag() == spare2_chosen;
	}
	
	public void setSpare2(Null spare2)
	{
	    setChosenValue(spare2);
	    setChosenFlag(spare2_chosen);
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
		    return new Null();
		case spare2_chosen:
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"InterRAT_TargetCellDescription$TechnologySpecificInfo"
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
				"InterRAT_TargetCellDescription$TechnologySpecificInfo$Gsm"
			    )
			),
			"gsm",
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
			"spare2",
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
	    "InterRAT_TargetCellDescription"
	),
	new QName (
	    "InformationElements",
	    "InterRAT-TargetCellDescription"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRAT_TargetCellDescription$TechnologySpecificInfo"
			)
		    ),
		    "technologySpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_TargetCellDescription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_TargetCellDescription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_TargetCellDescription
