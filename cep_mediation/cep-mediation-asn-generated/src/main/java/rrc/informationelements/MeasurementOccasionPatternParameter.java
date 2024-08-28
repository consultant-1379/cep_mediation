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
 * Define the ASN1 Type MeasurementOccasionPatternParameter from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementOccasionPatternParameter extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementOccasionPatternParameter()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementOccasionPatternParameter(INTEGER measurement_Occasion_Coeff, 
		    INTEGER measurement_Occasion_Offset, 
		    INTEGER measurement_Occasion_Length, 
		    BitString timeslotBitmap)
    {
	setMeasurement_Occasion_Coeff(measurement_Occasion_Coeff);
	setMeasurement_Occasion_Offset(measurement_Occasion_Offset);
	setMeasurement_Occasion_Length(measurement_Occasion_Length);
	setTimeslotBitmap(timeslotBitmap);
    }
    
    /**
     * Construct with components.
     */
    public MeasurementOccasionPatternParameter(long measurement_Occasion_Coeff, 
		    long measurement_Occasion_Offset, 
		    long measurement_Occasion_Length, 
		    BitString timeslotBitmap)
    {
	this(new INTEGER(measurement_Occasion_Coeff), 
	     new INTEGER(measurement_Occasion_Offset), 
	     new INTEGER(measurement_Occasion_Length), timeslotBitmap);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementOccasionPatternParameter(long measurement_Occasion_Coeff, 
		    long measurement_Occasion_Offset, 
		    long measurement_Occasion_Length)
    {
	setMeasurement_Occasion_Coeff(measurement_Occasion_Coeff);
	setMeasurement_Occasion_Offset(measurement_Occasion_Offset);
	setMeasurement_Occasion_Length(measurement_Occasion_Length);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new BitString();
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
		return new BitString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "measurement_Occasion_Coeff"
    public long getMeasurement_Occasion_Coeff()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMeasurement_Occasion_Coeff(long measurement_Occasion_Coeff)
    {
	setMeasurement_Occasion_Coeff(new INTEGER(measurement_Occasion_Coeff));
    }
    
    public void setMeasurement_Occasion_Coeff(INTEGER measurement_Occasion_Coeff)
    {
	mComponents[0] = measurement_Occasion_Coeff;
    }
    
    
    // Methods for field "measurement_Occasion_Offset"
    public long getMeasurement_Occasion_Offset()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMeasurement_Occasion_Offset(long measurement_Occasion_Offset)
    {
	setMeasurement_Occasion_Offset(new INTEGER(measurement_Occasion_Offset));
    }
    
    public void setMeasurement_Occasion_Offset(INTEGER measurement_Occasion_Offset)
    {
	mComponents[1] = measurement_Occasion_Offset;
    }
    
    
    // Methods for field "measurement_Occasion_Length"
    public long getMeasurement_Occasion_Length()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setMeasurement_Occasion_Length(long measurement_Occasion_Length)
    {
	setMeasurement_Occasion_Length(new INTEGER(measurement_Occasion_Length));
    }
    
    public void setMeasurement_Occasion_Length(INTEGER measurement_Occasion_Length)
    {
	mComponents[2] = measurement_Occasion_Length;
    }
    
    
    // Methods for field "timeslotBitmap"
    public BitString getTimeslotBitmap()
    {
	return (BitString)mComponents[3];
    }
    
    public void setTimeslotBitmap(BitString timeslotBitmap)
    {
	mComponents[3] = timeslotBitmap;
    }
    
    public boolean hasTimeslotBitmap()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTimeslotBitmap()
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
	    "MeasurementOccasionPatternParameter"
	),
	new QName (
	    "InformationElements",
	    "MeasurementOccasionPatternParameter"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "measurement-Occasion-Coeff",
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
				    new com.oss.asn1.INTEGER(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "measurement-Occasion-Offset",
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(512),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(512)
			    ),
			    null
			)
		    ),
		    "measurement-Occasion-Length",
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
				    new com.oss.asn1.INTEGER(7)
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "timeslotBitmap",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementOccasionPatternParameter object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementOccasionPatternParameter object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementOccasionPatternParameter
