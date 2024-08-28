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
 * Define the ASN1 Type UE_Positioning_GPS_NavModelAddDataReq from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_Positioning_GPS_NavModelAddDataReq extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GPS_NavModelAddDataReq()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_Positioning_GPS_NavModelAddDataReq(INTEGER gps_Week, 
		    INTEGER gps_Toe, INTEGER tToeLimit, 
		    SatDataList satDataList)
    {
	setGps_Week(gps_Week);
	setGps_Toe(gps_Toe);
	setTToeLimit(tToeLimit);
	setSatDataList(satDataList);
    }
    
    /**
     * Construct with components.
     */
    public UE_Positioning_GPS_NavModelAddDataReq(long gps_Week, long gps_Toe, 
		    long tToeLimit, SatDataList satDataList)
    {
	this(new INTEGER(gps_Week), new INTEGER(gps_Toe), 
	     new INTEGER(tToeLimit), satDataList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new SatDataList();
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
		return new SatDataList();
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
    
    
    // Methods for field "gps_Toe"
    public long getGps_Toe()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGps_Toe(long gps_Toe)
    {
	setGps_Toe(new INTEGER(gps_Toe));
    }
    
    public void setGps_Toe(INTEGER gps_Toe)
    {
	mComponents[1] = gps_Toe;
    }
    
    
    // Methods for field "tToeLimit"
    public long getTToeLimit()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTToeLimit(long tToeLimit)
    {
	setTToeLimit(new INTEGER(tToeLimit));
    }
    
    public void setTToeLimit(INTEGER tToeLimit)
    {
	mComponents[2] = tToeLimit;
    }
    
    
    // Methods for field "satDataList"
    public SatDataList getSatDataList()
    {
	return (SatDataList)mComponents[3];
    }
    
    public void setSatDataList(SatDataList satDataList)
    {
	mComponents[3] = satDataList;
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
	    "UE_Positioning_GPS_NavModelAddDataReq"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GPS-NavModelAddDataReq"
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
				    new com.oss.asn1.INTEGER(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "gps-Toe",
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
		    "tToeLimit",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SatDataList"
			    ),
			    new QName (
				"InformationElements",
				"SatDataList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "SatData"
				)
			    )
			)
		    ),
		    "satDataList",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_NavModelAddDataReq object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GPS_NavModelAddDataReq object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GPS_NavModelAddDataReq
