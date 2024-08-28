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
 * Define the ASN1 Type CellDCHMeasOccasionPattern_LCR from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellDCHMeasOccasionPattern_LCR extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellDCHMeasOccasionPattern_LCR()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellDCHMeasOccasionPattern_LCR(INTEGER patternIdentifier, 
		    StatusFlag statusFlag, BitString measurementPurpose, 
		    MeasurementOccasionPatternParameter measurementOccasionPatternParameter)
    {
	setPatternIdentifier(patternIdentifier);
	setStatusFlag(statusFlag);
	setMeasurementPurpose(measurementPurpose);
	setMeasurementOccasionPatternParameter(measurementOccasionPatternParameter);
    }
    
    /**
     * Construct with components.
     */
    public CellDCHMeasOccasionPattern_LCR(long patternIdentifier, 
		    StatusFlag statusFlag, BitString measurementPurpose, 
		    MeasurementOccasionPatternParameter measurementOccasionPatternParameter)
    {
	this(new INTEGER(patternIdentifier), statusFlag, 
	     measurementPurpose, measurementOccasionPatternParameter);
    }
    
    /**
     * Construct with required components.
     */
    public CellDCHMeasOccasionPattern_LCR(long patternIdentifier, 
		    StatusFlag statusFlag)
    {
	setPatternIdentifier(patternIdentifier);
	setStatusFlag(statusFlag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = StatusFlag.activate;
	mComponents[2] = new BitString();
	mComponents[3] = new MeasurementOccasionPatternParameter();
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
		return StatusFlag.activate;
	    case 2:
		return new BitString();
	    case 3:
		return new MeasurementOccasionPatternParameter();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "patternIdentifier"
    public long getPatternIdentifier()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setPatternIdentifier(long patternIdentifier)
    {
	setPatternIdentifier(new INTEGER(patternIdentifier));
    }
    
    public void setPatternIdentifier(INTEGER patternIdentifier)
    {
	mComponents[0] = patternIdentifier;
    }
    
    
    // Methods for field "statusFlag"
    public StatusFlag getStatusFlag()
    {
	return (StatusFlag)mComponents[1];
    }
    
    public void setStatusFlag(StatusFlag statusFlag)
    {
	mComponents[1] = statusFlag;
    }
    
    
    
    /**
     * Define the ASN1 Type StatusFlag from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class StatusFlag extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private StatusFlag()
	{
	    super(cFirstNumber);
	}
	
	protected StatusFlag(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final StatusFlag activate =
	    new StatusFlag(0);
	public static final StatusFlag deactivate =
	    new StatusFlag(1);
	private final static StatusFlag cNamedNumbers[] = {
	     activate, 
	     deactivate
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static StatusFlag valueOf(long value)
	{
	    return (StatusFlag)activate.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"CellDCHMeasOccasionPattern_LCR$StatusFlag"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"activate",
			0
		    ),
		    new MemberListElement (
			"deactivate",
			1
		    )
		}
	    ),
	    0,
	    activate
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' StatusFlag object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' StatusFlag object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for StatusFlag

    // Methods for field "measurementPurpose"
    public BitString getMeasurementPurpose()
    {
	return (BitString)mComponents[2];
    }
    
    public void setMeasurementPurpose(BitString measurementPurpose)
    {
	mComponents[2] = measurementPurpose;
    }
    
    public boolean hasMeasurementPurpose()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMeasurementPurpose()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "measurementOccasionPatternParameter"
    public MeasurementOccasionPatternParameter getMeasurementOccasionPatternParameter()
    {
	return (MeasurementOccasionPatternParameter)mComponents[3];
    }
    
    public void setMeasurementOccasionPatternParameter(MeasurementOccasionPatternParameter measurementOccasionPatternParameter)
    {
	mComponents[3] = measurementOccasionPatternParameter;
    }
    
    public boolean hasMeasurementOccasionPatternParameter()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMeasurementOccasionPatternParameter()
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
	    "CellDCHMeasOccasionPattern_LCR"
	),
	new QName (
	    "InformationElements",
	    "CellDCHMeasOccasionPattern-LCR"
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
				    new com.oss.asn1.INTEGER(4),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4)
			    ),
			    null
			)
		    ),
		    "patternIdentifier",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellDCHMeasOccasionPattern_LCR$StatusFlag"
			)
		    ),
		    "statusFlag",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new com.oss.asn1.INTEGER(5)
				)
			    ),
			    new Bounds (
				new java.lang.Long(5),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "measurementPurpose",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MeasurementOccasionPatternParameter"
			    ),
			    new QName (
				"InformationElements",
				"MeasurementOccasionPatternParameter"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementOccasionPatternParameter"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MeasurementOccasionPatternParameter"
				)
			    ),
			    0
			)
		    ),
		    "measurementOccasionPatternParameter",
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
     * Get the type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionPattern_LCR object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellDCHMeasOccasionPattern_LCR object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellDCHMeasOccasionPattern_LCR
