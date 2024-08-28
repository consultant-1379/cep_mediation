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
 * Define the ASN1 Type UE_Positioning_GPS_DGPS_Corrections_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_DGPS_Corrections_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_DGPS_Corrections_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_DGPS_Corrections_r9(GPS_TOW_1sec gps_TOW, 
		    DiffCorrectionStatus statusHealth, 
		    DGPS_CorrectionSatInfoList_r9 dgps_CorrectionSatInfoList)
    {
	setGps_TOW(gps_TOW);
	setStatusHealth(statusHealth);
	setDgps_CorrectionSatInfoList(dgps_CorrectionSatInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GPS_TOW_1sec();
	mComponents[1] = DiffCorrectionStatus.udre_1_0;
	mComponents[2] = new DGPS_CorrectionSatInfoList_r9();
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
		return new GPS_TOW_1sec();
	    case 1:
		return DiffCorrectionStatus.udre_1_0;
	    case 2:
		return new DGPS_CorrectionSatInfoList_r9();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gps_TOW"
    public GPS_TOW_1sec getGps_TOW()
    {
	return (GPS_TOW_1sec)mComponents[0];
    }
    
    public void setGps_TOW(GPS_TOW_1sec gps_TOW)
    {
	mComponents[0] = gps_TOW;
    }
    
    
    // Methods for field "statusHealth"
    public DiffCorrectionStatus getStatusHealth()
    {
	return (DiffCorrectionStatus)mComponents[1];
    }
    
    public void setStatusHealth(DiffCorrectionStatus statusHealth)
    {
	mComponents[1] = statusHealth;
    }
    
    
    // Methods for field "dgps_CorrectionSatInfoList"
    public DGPS_CorrectionSatInfoList_r9 getDgps_CorrectionSatInfoList()
    {
	return (DGPS_CorrectionSatInfoList_r9)mComponents[2];
    }
    
    public void setDgps_CorrectionSatInfoList(DGPS_CorrectionSatInfoList_r9 dgps_CorrectionSatInfoList)
    {
	mComponents[2] = dgps_CorrectionSatInfoList;
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
	    "UE_Positioning_GPS_DGPS_Corrections_r9"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-DGPS-Corrections-r9"
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
				"GPS_TOW_1sec"
			    ),
			    new QName (
				"InformationElements",
				"GPS-TOW-1sec"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new GPS_TOW_1sec(0), 
				    new GPS_TOW_1sec(604799),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(604799)
			    ),
			    null
			)
		    ),
		    "gps-TOW",
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
				"DiffCorrectionStatus"
			    ),
			    new QName (
				"InformationElements",
				"DiffCorrectionStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"udre-1-0",
					0
				    ),
				    new MemberListElement (
					"udre-0-75",
					1
				    ),
				    new MemberListElement (
					"udre-0-5",
					2
				    ),
				    new MemberListElement (
					"udre-0-3",
					3
				    ),
				    new MemberListElement (
					"udre-0-2",
					4
				    ),
				    new MemberListElement (
					"udre-0-1",
					5
				    ),
				    new MemberListElement (
					"noData",
					6
				    ),
				    new MemberListElement (
					"invalidData",
					7
				    )
				}
			    ),
			    0,
			    DiffCorrectionStatus.udre_1_0
			)
		    ),
		    "statusHealth",
		    1,
		    2,
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
				"DGPS_CorrectionSatInfoList_r9"
			    ),
			    new QName (
				"InformationElements",
				"DGPS-CorrectionSatInfoList-r9"
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
				    "DGPS_CorrectionSatInfo_r9"
				)
			    )
			)
		    ),
		    "dgps-CorrectionSatInfoList",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_DGPS_Corrections_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_DGPS_Corrections_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_DGPS_Corrections_r9
