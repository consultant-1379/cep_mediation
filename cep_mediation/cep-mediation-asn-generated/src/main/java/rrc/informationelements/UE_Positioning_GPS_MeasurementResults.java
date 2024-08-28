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
 * Define the ASN1 Type UE_Positioning_GPS_MeasurementResults from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_MeasurementResults extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_MeasurementResults()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_MeasurementResults(ReferenceTime referenceTime, 
		    GPS_MeasurementParamList gps_MeasurementParamList)
    {
	setReferenceTime(referenceTime);
	setGps_MeasurementParamList(gps_MeasurementParamList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ReferenceTime();
	mComponents[1] = new GPS_MeasurementParamList();
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
		return new GPS_MeasurementParamList();
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
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case utran_GPSReferenceTimeResult_chosen:
		    return new UTRAN_GPSReferenceTimeResult();
		case gps_ReferenceTimeOnly_chosen:
		    return new GPS_TOW_1msec();
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
		"UE_Positioning_GPS_MeasurementResults$ReferenceTime"
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

    // Methods for field "gps_MeasurementParamList"
    public GPS_MeasurementParamList getGps_MeasurementParamList()
    {
	return (GPS_MeasurementParamList)mComponents[1];
    }
    
    public void setGps_MeasurementParamList(GPS_MeasurementParamList gps_MeasurementParamList)
    {
	mComponents[1] = gps_MeasurementParamList;
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
	    "UE_Positioning_GPS_MeasurementResults"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-MeasurementResults"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_Positioning_GPS_MeasurementResults$ReferenceTime"
			)
		    ),
		    "referenceTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GPS_MeasurementParamList"
			    ),
			    new QName (
				"InformationElements",
				"GPS-MeasurementParamList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "GPS_MeasurementParam"
				)
			    )
			)
		    ),
		    "gps-MeasurementParamList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_MeasurementResults object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_MeasurementResults object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_MeasurementResults
