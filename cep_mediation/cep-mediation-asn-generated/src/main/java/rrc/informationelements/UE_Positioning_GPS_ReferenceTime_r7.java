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
 * Define the ASN1 Type UE_Positioning_GPS_ReferenceTime_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_ReferenceTime_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_ReferenceTime_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_ReferenceTime_r7(INTEGER gps_Week, 
		    GPS_TOW_1msec gps_tow_1msec, 
		    UTRAN_GPSReferenceTime utran_GPSReferenceTime, 
		    UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty, 
		    SFN_TOW_Uncertainty sfn_tow_Uncertainty, 
		    UTRAN_GPS_DriftRate utran_GPS_DriftRate, 
		    GPS_TOW_AssistList gps_TOW_AssistList)
    {
	setGps_Week(gps_Week);
	setGps_tow_1msec(gps_tow_1msec);
	setUtran_GPSReferenceTime(utran_GPSReferenceTime);
	setUe_Positioning_GPS_ReferenceTimeUncertainty(ue_Positioning_GPS_ReferenceTimeUncertainty);
	setSfn_tow_Uncertainty(sfn_tow_Uncertainty);
	setUtran_GPS_DriftRate(utran_GPS_DriftRate);
	setGps_TOW_AssistList(gps_TOW_AssistList);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GPS_ReferenceTime_r7(long gps_Week, 
		    GPS_TOW_1msec gps_tow_1msec, 
		    UTRAN_GPSReferenceTime utran_GPSReferenceTime, 
		    UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty, 
		    SFN_TOW_Uncertainty sfn_tow_Uncertainty, 
		    UTRAN_GPS_DriftRate utran_GPS_DriftRate, 
		    GPS_TOW_AssistList gps_TOW_AssistList)
    {
	this(new INTEGER(gps_Week), gps_tow_1msec, utran_GPSReferenceTime, 
	     ue_Positioning_GPS_ReferenceTimeUncertainty, 
	     sfn_tow_Uncertainty, utran_GPS_DriftRate, gps_TOW_AssistList);
    }
    
    /**
     * Construct with required components.
     */
    public UE_Positioning_GPS_ReferenceTime_r7(long gps_Week, 
		    GPS_TOW_1msec gps_tow_1msec)
    {
	setGps_Week(gps_Week);
	setGps_tow_1msec(gps_tow_1msec);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new GPS_TOW_1msec();
	mComponents[2] = new UTRAN_GPSReferenceTime();
	mComponents[3] = new UE_Positioning_GPS_ReferenceTimeUncertainty();
	mComponents[4] = SFN_TOW_Uncertainty.lessThan10;
	mComponents[5] = UTRAN_GPS_DriftRate.utran_GPSDrift0;
	mComponents[6] = new GPS_TOW_AssistList();
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
		return new GPS_TOW_1msec();
	    case 2:
		return new UTRAN_GPSReferenceTime();
	    case 3:
		return new UE_Positioning_GPS_ReferenceTimeUncertainty();
	    case 4:
		return SFN_TOW_Uncertainty.lessThan10;
	    case 5:
		return UTRAN_GPS_DriftRate.utran_GPSDrift0;
	    case 6:
		return new GPS_TOW_AssistList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gps_Week"
    public long getGps_Week()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGps_Week(long gps_Week)
    {
	setGps_Week(new INTEGER(gps_Week));
    }
    
    public void setGps_Week(INTEGER gps_Week)
    {
	mComponents[0] = gps_Week;
    }
    
    
    // Methods for field "gps_tow_1msec"
    public GPS_TOW_1msec getGps_tow_1msec()
    {
	return (GPS_TOW_1msec)mComponents[1];
    }
    
    public void setGps_tow_1msec(GPS_TOW_1msec gps_tow_1msec)
    {
	mComponents[1] = gps_tow_1msec;
    }
    
    
    // Methods for field "utran_GPSReferenceTime"
    public UTRAN_GPSReferenceTime getUtran_GPSReferenceTime()
    {
	return (UTRAN_GPSReferenceTime)mComponents[2];
    }
    
    public void setUtran_GPSReferenceTime(UTRAN_GPSReferenceTime utran_GPSReferenceTime)
    {
	mComponents[2] = utran_GPSReferenceTime;
    }
    
    public boolean hasUtran_GPSReferenceTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUtran_GPSReferenceTime()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_Positioning_GPS_ReferenceTimeUncertainty"
    public UE_Positioning_GPS_ReferenceTimeUncertainty getUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return (UE_Positioning_GPS_ReferenceTimeUncertainty)mComponents[3];
    }
    
    public void setUe_Positioning_GPS_ReferenceTimeUncertainty(UE_Positioning_GPS_ReferenceTimeUncertainty ue_Positioning_GPS_ReferenceTimeUncertainty)
    {
	mComponents[3] = ue_Positioning_GPS_ReferenceTimeUncertainty;
    }
    
    public boolean hasUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_Positioning_GPS_ReferenceTimeUncertainty()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "sfn_tow_Uncertainty"
    public SFN_TOW_Uncertainty getSfn_tow_Uncertainty()
    {
	return (SFN_TOW_Uncertainty)mComponents[4];
    }
    
    public void setSfn_tow_Uncertainty(SFN_TOW_Uncertainty sfn_tow_Uncertainty)
    {
	mComponents[4] = sfn_tow_Uncertainty;
    }
    
    public boolean hasSfn_tow_Uncertainty()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSfn_tow_Uncertainty()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "utran_GPS_DriftRate"
    public UTRAN_GPS_DriftRate getUtran_GPS_DriftRate()
    {
	return (UTRAN_GPS_DriftRate)mComponents[5];
    }
    
    public void setUtran_GPS_DriftRate(UTRAN_GPS_DriftRate utran_GPS_DriftRate)
    {
	mComponents[5] = utran_GPS_DriftRate;
    }
    
    public boolean hasUtran_GPS_DriftRate()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUtran_GPS_DriftRate()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "gps_TOW_AssistList"
    public GPS_TOW_AssistList getGps_TOW_AssistList()
    {
	return (GPS_TOW_AssistList)mComponents[6];
    }
    
    public void setGps_TOW_AssistList(GPS_TOW_AssistList gps_TOW_AssistList)
    {
	mComponents[6] = gps_TOW_AssistList;
    }
    
    public boolean hasGps_TOW_AssistList()
    {
	return componentIsPresent(6);
    }
    
    public void deleteGps_TOW_AssistList()
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
	    "UE_Positioning_GPS_ReferenceTime_r7"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-ReferenceTime-r7"
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
		    "gps-Week",
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
		    "gps-tow-1msec",
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
				"rrc.informationelements",
				"UE_Positioning_GPS_ReferenceTimeUncertainty"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-ReferenceTimeUncertainty"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(0), 
				    new UE_Positioning_GPS_ReferenceTimeUncertainty(127),
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
		    "ue-Positioning-GPS-ReferenceTimeUncertainty",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SFN_TOW_Uncertainty"
			    ),
			    new QName (
				"InformationElements",
				"SFN-TOW-Uncertainty"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"lessThan10",
					0
				    ),
				    new MemberListElement (
					"moreThan10",
					1
				    )
				}
			    ),
			    0,
			    SFN_TOW_Uncertainty.lessThan10
			)
		    ),
		    "sfn-tow-Uncertainty",
		    4,
		    3,
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
				"UTRAN_GPS_DriftRate"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-GPS-DriftRate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"utran-GPSDrift0",
					0
				    ),
				    new MemberListElement (
					"utran-GPSDrift1",
					1
				    ),
				    new MemberListElement (
					"utran-GPSDrift2",
					2
				    ),
				    new MemberListElement (
					"utran-GPSDrift5",
					3
				    ),
				    new MemberListElement (
					"utran-GPSDrift10",
					4
				    ),
				    new MemberListElement (
					"utran-GPSDrift15",
					5
				    ),
				    new MemberListElement (
					"utran-GPSDrift25",
					6
				    ),
				    new MemberListElement (
					"utran-GPSDrift50",
					7
				    ),
				    new MemberListElement (
					"utran-GPSDrift-1",
					8
				    ),
				    new MemberListElement (
					"utran-GPSDrift-2",
					9
				    ),
				    new MemberListElement (
					"utran-GPSDrift-5",
					10
				    ),
				    new MemberListElement (
					"utran-GPSDrift-10",
					11
				    ),
				    new MemberListElement (
					"utran-GPSDrift-15",
					12
				    ),
				    new MemberListElement (
					"utran-GPSDrift-25",
					13
				    ),
				    new MemberListElement (
					"utran-GPSDrift-50",
					14
				    )
				}
			    ),
			    0,
			    UTRAN_GPS_DriftRate.utran_GPSDrift0
			)
		    ),
		    "utran-GPS-DriftRate",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GPS_TOW_AssistList"
			    ),
			    new QName (
				"InformationElements",
				"GPS-TOW-AssistList"
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
				    "GPS_TOW_Assist"
				)
			    )
			)
		    ),
		    "gps-TOW-AssistList",
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_ReferenceTime_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_ReferenceTime_r7
