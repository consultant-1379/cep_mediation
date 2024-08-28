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
 * Define the ASN1 Type GPS_MeasurementParam from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GPS_MeasurementParam extends Sequence {
    
    /**
     * The default constructor.
     */
    public GPS_MeasurementParam()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GPS_MeasurementParam(INTEGER satelliteID, INTEGER c_N0, 
		    INTEGER doppler, INTEGER wholeGPS_Chips, 
		    INTEGER fractionalGPS_Chips, 
		    MultipathIndicator multipathIndicator, 
		    INTEGER pseudorangeRMS_Error)
    {
	setSatelliteID(satelliteID);
	setC_N0(c_N0);
	setDoppler(doppler);
	setWholeGPS_Chips(wholeGPS_Chips);
	setFractionalGPS_Chips(fractionalGPS_Chips);
	setMultipathIndicator(multipathIndicator);
	setPseudorangeRMS_Error(pseudorangeRMS_Error);
    }
    
    /**
     * Construct with components.
     */
    public GPS_MeasurementParam(long satelliteID, long c_N0, long doppler, 
		    long wholeGPS_Chips, long fractionalGPS_Chips, 
		    MultipathIndicator multipathIndicator, 
		    long pseudorangeRMS_Error)
    {
	this(new INTEGER(satelliteID), new INTEGER(c_N0), 
	     new INTEGER(doppler), new INTEGER(wholeGPS_Chips), 
	     new INTEGER(fractionalGPS_Chips), multipathIndicator, 
	     new INTEGER(pseudorangeRMS_Error));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = MultipathIndicator.nm;
	mComponents[6] = new INTEGER();
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
		return MultipathIndicator.nm;
	    case 6:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satelliteID"
    public long getSatelliteID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setSatelliteID(long satelliteID)
    {
	setSatelliteID(new INTEGER(satelliteID));
    }
    
    public void setSatelliteID(INTEGER satelliteID)
    {
	mComponents[0] = satelliteID;
    }
    
    
    // Methods for field "c_N0"
    public long getC_N0()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setC_N0(long c_N0)
    {
	setC_N0(new INTEGER(c_N0));
    }
    
    public void setC_N0(INTEGER c_N0)
    {
	mComponents[1] = c_N0;
    }
    
    
    // Methods for field "doppler"
    public long getDoppler()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setDoppler(long doppler)
    {
	setDoppler(new INTEGER(doppler));
    }
    
    public void setDoppler(INTEGER doppler)
    {
	mComponents[2] = doppler;
    }
    
    
    // Methods for field "wholeGPS_Chips"
    public long getWholeGPS_Chips()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setWholeGPS_Chips(long wholeGPS_Chips)
    {
	setWholeGPS_Chips(new INTEGER(wholeGPS_Chips));
    }
    
    public void setWholeGPS_Chips(INTEGER wholeGPS_Chips)
    {
	mComponents[3] = wholeGPS_Chips;
    }
    
    
    // Methods for field "fractionalGPS_Chips"
    public long getFractionalGPS_Chips()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setFractionalGPS_Chips(long fractionalGPS_Chips)
    {
	setFractionalGPS_Chips(new INTEGER(fractionalGPS_Chips));
    }
    
    public void setFractionalGPS_Chips(INTEGER fractionalGPS_Chips)
    {
	mComponents[4] = fractionalGPS_Chips;
    }
    
    
    // Methods for field "multipathIndicator"
    public MultipathIndicator getMultipathIndicator()
    {
	return (MultipathIndicator)mComponents[5];
    }
    
    public void setMultipathIndicator(MultipathIndicator multipathIndicator)
    {
	mComponents[5] = multipathIndicator;
    }
    
    
    // Methods for field "pseudorangeRMS_Error"
    public long getPseudorangeRMS_Error()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setPseudorangeRMS_Error(long pseudorangeRMS_Error)
    {
	setPseudorangeRMS_Error(new INTEGER(pseudorangeRMS_Error));
    }
    
    public void setPseudorangeRMS_Error(INTEGER pseudorangeRMS_Error)
    {
	mComponents[6] = pseudorangeRMS_Error;
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
	    "GPS_MeasurementParam"
	),
	new QName (
	    "InformationElements",
	    "GPS-MeasurementParam"
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
		    "satelliteID",
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
		    "c-N0",
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
				    new com.oss.asn1.INTEGER(-32768), 
				    new com.oss.asn1.INTEGER(32768),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-32768),
				new java.lang.Long(32768)
			    ),
			    null
			)
		    ),
		    "doppler",
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
				    new com.oss.asn1.INTEGER(1022),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1022)
			    ),
			    null
			)
		    ),
		    "wholeGPS-Chips",
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
				    new com.oss.asn1.INTEGER(1023),
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
		    "fractionalGPS-Chips",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MultipathIndicator"
			    ),
			    new QName (
				"InformationElements",
				"MultipathIndicator"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nm",
					0
				    ),
				    new MemberListElement (
					"low",
					1
				    ),
				    new MemberListElement (
					"medium",
					2
				    ),
				    new MemberListElement (
					"high",
					3
				    )
				}
			    ),
			    0,
			    MultipathIndicator.nm
			)
		    ),
		    "multipathIndicator",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "pseudorangeRMS-Error",
		    6,
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
     * Get the type descriptor (TypeInfo) of 'this' GPS_MeasurementParam object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GPS_MeasurementParam object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GPS_MeasurementParam
