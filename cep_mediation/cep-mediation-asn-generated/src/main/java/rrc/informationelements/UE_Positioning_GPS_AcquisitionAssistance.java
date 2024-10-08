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
 * Define the ASN1 Type UE_Positioning_GPS_AcquisitionAssistance from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_AcquisitionAssistance extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_AcquisitionAssistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_AcquisitionAssistance(GPS_TOW_1msec gps_ReferenceTime, 
		    UTRAN_GPSReferenceTime utran_GPSReferenceTime, 
		    AcquisitionSatInfoList satelliteInformationList)
    {
	setGps_ReferenceTime(gps_ReferenceTime);
	setUtran_GPSReferenceTime(utran_GPSReferenceTime);
	setSatelliteInformationList(satelliteInformationList);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GPS_AcquisitionAssistance(GPS_TOW_1msec gps_ReferenceTime, 
		    AcquisitionSatInfoList satelliteInformationList)
    {
	setGps_ReferenceTime(gps_ReferenceTime);
	setSatelliteInformationList(satelliteInformationList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GPS_TOW_1msec();
	mComponents[1] = new UTRAN_GPSReferenceTime();
	mComponents[2] = new AcquisitionSatInfoList();
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
		return new GPS_TOW_1msec();
	    case 1:
		return new UTRAN_GPSReferenceTime();
	    case 2:
		return new AcquisitionSatInfoList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gps_ReferenceTime"
    public GPS_TOW_1msec getGps_ReferenceTime()
    {
	return (GPS_TOW_1msec)mComponents[0];
    }
    
    public void setGps_ReferenceTime(GPS_TOW_1msec gps_ReferenceTime)
    {
	mComponents[0] = gps_ReferenceTime;
    }
    
    
    // Methods for field "utran_GPSReferenceTime"
    public UTRAN_GPSReferenceTime getUtran_GPSReferenceTime()
    {
	return (UTRAN_GPSReferenceTime)mComponents[1];
    }
    
    public void setUtran_GPSReferenceTime(UTRAN_GPSReferenceTime utran_GPSReferenceTime)
    {
	mComponents[1] = utran_GPSReferenceTime;
    }
    
    public boolean hasUtran_GPSReferenceTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUtran_GPSReferenceTime()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "satelliteInformationList"
    public AcquisitionSatInfoList getSatelliteInformationList()
    {
	return (AcquisitionSatInfoList)mComponents[2];
    }
    
    public void setSatelliteInformationList(AcquisitionSatInfoList satelliteInformationList)
    {
	mComponents[2] = satelliteInformationList;
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
	    "UE_Positioning_GPS_AcquisitionAssistance"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-AcquisitionAssistance"
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
		    "gps-ReferenceTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UTRAN_GPSReferenceTime"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-GPSReferenceTime"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UTRAN_GPSReferenceTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UTRAN_GPSReferenceTime"
				)
			    ),
			    0
			)
		    ),
		    "utran-GPSReferenceTime",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AcquisitionSatInfoList"
			    ),
			    new QName (
				"InformationElements",
				"AcquisitionSatInfoList"
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
				    "AcquisitionSatInfo"
				)
			    )
			)
		    ),
		    "satelliteInformationList",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AcquisitionAssistance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_AcquisitionAssistance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_AcquisitionAssistance
