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
 * Define the ASN1 Type InterRATMeasQuantity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRATMeasQuantity extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATMeasQuantity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATMeasQuantity(IntraFreqMeasQuantity measQuantityUTRAN_QualityEstimate, 
		    RatSpecificInfo ratSpecificInfo)
    {
	setMeasQuantityUTRAN_QualityEstimate(measQuantityUTRAN_QualityEstimate);
	setRatSpecificInfo(ratSpecificInfo);
    }
    
    /**
     * Construct with required components.
     */
    public InterRATMeasQuantity(RatSpecificInfo ratSpecificInfo)
    {
	setRatSpecificInfo(ratSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IntraFreqMeasQuantity();
	mComponents[1] = new RatSpecificInfo();
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
		return new IntraFreqMeasQuantity();
	    case 1:
		return new RatSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measQuantityUTRAN_QualityEstimate"
    public IntraFreqMeasQuantity getMeasQuantityUTRAN_QualityEstimate()
    {
	return (IntraFreqMeasQuantity)mComponents[0];
    }
    
    public void setMeasQuantityUTRAN_QualityEstimate(IntraFreqMeasQuantity measQuantityUTRAN_QualityEstimate)
    {
	mComponents[0] = measQuantityUTRAN_QualityEstimate;
    }
    
    public boolean hasMeasQuantityUTRAN_QualityEstimate()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMeasQuantityUTRAN_QualityEstimate()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ratSpecificInfo"
    public RatSpecificInfo getRatSpecificInfo()
    {
	return (RatSpecificInfo)mComponents[1];
    }
    
    public void setRatSpecificInfo(RatSpecificInfo ratSpecificInfo)
    {
	mComponents[1] = ratSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type RatSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class RatSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public RatSpecificInfo()
	{
	}
	
	public static final  int  gsm_chosen = 1;
	public static final  int  is_2000_chosen = 2;
	
	// Methods for field "gsm"
	public static RatSpecificInfo createRatSpecificInfoWithGsm(Gsm gsm)
	{
	    RatSpecificInfo __object = new RatSpecificInfo();

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
	    public Gsm(MeasurementQuantityGSM measurementQuantity, 
			    FilterCoefficient filterCoefficient, 
			    BSIC_VerificationRequired bsic_VerificationRequired)
	    {
		setMeasurementQuantity(measurementQuantity);
		setFilterCoefficient(filterCoefficient);
		setBsic_VerificationRequired(bsic_VerificationRequired);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Gsm(MeasurementQuantityGSM measurementQuantity, 
			    BSIC_VerificationRequired bsic_VerificationRequired)
	    {
		setMeasurementQuantity(measurementQuantity);
		setBsic_VerificationRequired(bsic_VerificationRequired);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = MeasurementQuantityGSM.gsm_CarrierRSSI;
		mComponents[1] = FilterCoefficient.fc0;
		mComponents[2] = BSIC_VerificationRequired.required;
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
			return MeasurementQuantityGSM.gsm_CarrierRSSI;
		    case 1:
			return FilterCoefficient.fc0;
		    case 2:
			return BSIC_VerificationRequired.required;
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    // Default Values
	    public static final FilterCoefficient filterCoefficient__default = 
		FilterCoefficient.fc0;
	    
	    // Methods for field "measurementQuantity"
	    public MeasurementQuantityGSM getMeasurementQuantity()
	    {
		return (MeasurementQuantityGSM)mComponents[0];
	    }
	    
	    public void setMeasurementQuantity(MeasurementQuantityGSM measurementQuantity)
	    {
		mComponents[0] = measurementQuantity;
	    }
	    
	    
	    // Methods for field "filterCoefficient"
	    public FilterCoefficient getFilterCoefficient()
	    {
		if (hasFilterCoefficient())
		    return (FilterCoefficient)mComponents[1];
		else
		    return (FilterCoefficient)filterCoefficient__default.clone();
	    }
	    
	    public void setFilterCoefficient(FilterCoefficient filterCoefficient)
	    {
		mComponents[1] = filterCoefficient;
	    }
	    
	    public void setFilterCoefficientToDefault()
	    {
		setFilterCoefficient(filterCoefficient__default);
	    }
	    
	    public boolean hasDefaultFilterCoefficient()
	    {
		return true;
	    }
	    
	    public boolean hasFilterCoefficient()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteFilterCoefficient()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    // Methods for field "bsic_VerificationRequired"
	    public BSIC_VerificationRequired getBsic_VerificationRequired()
	    {
		return (BSIC_VerificationRequired)mComponents[2];
	    }
	    
	    public void setBsic_VerificationRequired(BSIC_VerificationRequired bsic_VerificationRequired)
	    {
		mComponents[2] = bsic_VerificationRequired;
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
		    "InterRATMeasQuantity$RatSpecificInfo$Gsm"
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
					"MeasurementQuantityGSM"
				    ),
				    new QName (
					"InformationElements",
					"MeasurementQuantityGSM"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"gsm-CarrierRSSI",
						0
					    ),
					    new MemberListElement (
						"dummy",
						1
					    )
					}
				    ),
				    0,
				    MeasurementQuantityGSM.gsm_CarrierRSSI
				)
			    ),
			    "measurementQuantity",
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
					"FilterCoefficient"
				    ),
				    new QName (
					"InformationElements",
					"FilterCoefficient"
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
						"fc1",
						1
					    ),
					    new MemberListElement (
						"fc2",
						2
					    ),
					    new MemberListElement (
						"fc3",
						3
					    ),
					    new MemberListElement (
						"fc4",
						4
					    ),
					    new MemberListElement (
						"fc5",
						5
					    ),
					    new MemberListElement (
						"fc6",
						6
					    ),
					    new MemberListElement (
						"fc7",
						7
					    ),
					    new MemberListElement (
						"fc8",
						8
					    ),
					    new MemberListElement (
						"fc9",
						9
					    ),
					    new MemberListElement (
						"fc11",
						10
					    ),
					    new MemberListElement (
						"fc13",
						11
					    ),
					    new MemberListElement (
						"fc15",
						12
					    ),
					    new MemberListElement (
						"fc17",
						13
					    ),
					    new MemberListElement (
						"fc19",
						14
					    ),
					    new MemberListElement (
						"spare1",
						15
					    )
					}
				    ),
				    0,
				    FilterCoefficient.fc0
				)
			    ),
			    "filterCoefficient",
			    1,
			    3,
			    filterCoefficient__default
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"BSIC_VerificationRequired"
				    ),
				    new QName (
					"InformationElements",
					"BSIC-VerificationRequired"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"required",
						0
					    ),
					    new MemberListElement (
						"notRequired",
						1
					    )
					}
				    ),
				    0,
				    BSIC_VerificationRequired.required
				)
			    ),
			    "bsic-VerificationRequired",
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
	public static RatSpecificInfo createRatSpecificInfoWithIs_2000(Is_2000 is_2000)
	{
	    RatSpecificInfo __object = new RatSpecificInfo();

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
	    public Is_2000(INTEGER tadd_EcIo, INTEGER tcomp_EcIo, 
			    INTEGER softSlope, INTEGER addIntercept)
	    {
		setTadd_EcIo(tadd_EcIo);
		setTcomp_EcIo(tcomp_EcIo);
		setSoftSlope(softSlope);
		setAddIntercept(addIntercept);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Is_2000(long tadd_EcIo, long tcomp_EcIo, long softSlope, 
			    long addIntercept)
	    {
		this(new INTEGER(tadd_EcIo), new INTEGER(tcomp_EcIo), 
		     new INTEGER(softSlope), new INTEGER(addIntercept));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Is_2000(long tadd_EcIo, long tcomp_EcIo)
	    {
		setTadd_EcIo(tadd_EcIo);
		setTcomp_EcIo(tcomp_EcIo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
		mComponents[1] = new INTEGER();
		mComponents[2] = new INTEGER();
		mComponents[3] = new INTEGER();
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
			return new INTEGER();
		    case 1:
			return new INTEGER();
		    case 2:
			return new INTEGER();
		    case 3:
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tadd_EcIo"
	    public long getTadd_EcIo()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setTadd_EcIo(long tadd_EcIo)
	    {
		setTadd_EcIo(new INTEGER(tadd_EcIo));
	    }
	    
	    public void setTadd_EcIo(INTEGER tadd_EcIo)
	    {
		mComponents[0] = tadd_EcIo;
	    }
	    
	    
	    // Methods for field "tcomp_EcIo"
	    public long getTcomp_EcIo()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setTcomp_EcIo(long tcomp_EcIo)
	    {
		setTcomp_EcIo(new INTEGER(tcomp_EcIo));
	    }
	    
	    public void setTcomp_EcIo(INTEGER tcomp_EcIo)
	    {
		mComponents[1] = tcomp_EcIo;
	    }
	    
	    
	    // Methods for field "softSlope"
	    public long getSoftSlope()
	    {
		return ((INTEGER)mComponents[2]).longValue();
	    }
	    
	    public void setSoftSlope(long softSlope)
	    {
		setSoftSlope(new INTEGER(softSlope));
	    }
	    
	    public void setSoftSlope(INTEGER softSlope)
	    {
		mComponents[2] = softSlope;
	    }
	    
	    public boolean hasSoftSlope()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteSoftSlope()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "addIntercept"
	    public long getAddIntercept()
	    {
		return ((INTEGER)mComponents[3]).longValue();
	    }
	    
	    public void setAddIntercept(long addIntercept)
	    {
		setAddIntercept(new INTEGER(addIntercept));
	    }
	    
	    public void setAddIntercept(INTEGER addIntercept)
	    {
		mComponents[3] = addIntercept;
	    }
	    
	    public boolean hasAddIntercept()
	    {
		return componentIsPresent(3);
	    }
	    
	    public void deleteAddIntercept()
	    {
		setComponentAbsent(3);
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
		    "InterRATMeasQuantity$RatSpecificInfo$Is_2000"
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
					    new com.oss.asn1.INTEGER(63),
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
			    "tadd-EcIo",
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
					    new com.oss.asn1.INTEGER(15),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(15)
				    ),
				    null
				)
			    ),
			    "tcomp-EcIo",
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
					    new com.oss.asn1.INTEGER(63),
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
			    "softSlope",
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
					    new com.oss.asn1.INTEGER(63),
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
			    "addIntercept",
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

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case gsm_chosen:
		    return new Gsm();
		case is_2000_chosen:
		    return new Is_2000();
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
		"InterRATMeasQuantity$RatSpecificInfo"
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
				"InterRATMeasQuantity$RatSpecificInfo$Gsm"
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
				"InterRATMeasQuantity$RatSpecificInfo$Is_2000"
			    )
			),
			"is-2000",
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
	 * Get the type descriptor (TypeInfo) of 'this' RatSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RatSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RatSpecificInfo

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
	    "InterRATMeasQuantity"
	),
	new QName (
	    "InformationElements",
	    "InterRATMeasQuantity"
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
				"IntraFreqMeasQuantity"
			    ),
			    new QName (
				"InformationElements",
				"IntraFreqMeasQuantity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "IntraFreqMeasQuantity"
				)
			    ),
			    0
			)
		    ),
		    "measQuantityUTRAN-QualityEstimate",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRATMeasQuantity$RatSpecificInfo"
			)
		    ),
		    "ratSpecificInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATMeasQuantity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATMeasQuantity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATMeasQuantity
