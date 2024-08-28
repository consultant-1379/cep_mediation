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
 * Define the ASN1 Type DGPS_CorrectionSatInfo_r9 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGPS_CorrectionSatInfo_r9 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGPS_CorrectionSatInfo_r9()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGPS_CorrectionSatInfo_r9(SatID satID, IODE iode, UDRE udre, 
		    PRC prc, RRC rrc, UDREGrowthRate udreGrowthRate, 
		    UDREValidityTime udreValidityTime)
    {
	setSatID(satID);
	setIode(iode);
	setUdre(udre);
	setPrc(prc);
	setRrc(rrc);
	setUdreGrowthRate(udreGrowthRate);
	setUdreValidityTime(udreValidityTime);
    }
    
    /**
     * Construct with required components.
     */
    public DGPS_CorrectionSatInfo_r9(SatID satID, IODE iode, UDRE udre, 
		    PRC prc, RRC rrc)
    {
	setSatID(satID);
	setIode(iode);
	setUdre(udre);
	setPrc(prc);
	setRrc(rrc);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SatID();
	mComponents[1] = new IODE();
	mComponents[2] = UDRE.lessThan1;
	mComponents[3] = new PRC();
	mComponents[4] = new RRC();
	mComponents[5] = UDREGrowthRate.growth_1_5;
	mComponents[6] = UDREValidityTime.val_20sec;
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
		return new SatID();
	    case 1:
		return new IODE();
	    case 2:
		return UDRE.lessThan1;
	    case 3:
		return new PRC();
	    case 4:
		return new RRC();
	    case 5:
		return UDREGrowthRate.growth_1_5;
	    case 6:
		return UDREValidityTime.val_20sec;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "satID"
    public SatID getSatID()
    {
	return (SatID)mComponents[0];
    }
    
    public void setSatID(SatID satID)
    {
	mComponents[0] = satID;
    }
    
    
    // Methods for field "iode"
    public IODE getIode()
    {
	return (IODE)mComponents[1];
    }
    
    public void setIode(IODE iode)
    {
	mComponents[1] = iode;
    }
    
    
    // Methods for field "udre"
    public UDRE getUdre()
    {
	return (UDRE)mComponents[2];
    }
    
    public void setUdre(UDRE udre)
    {
	mComponents[2] = udre;
    }
    
    
    // Methods for field "prc"
    public PRC getPrc()
    {
	return (PRC)mComponents[3];
    }
    
    public void setPrc(PRC prc)
    {
	mComponents[3] = prc;
    }
    
    
    // Methods for field "rrc"
    public RRC getRrc()
    {
	return (RRC)mComponents[4];
    }
    
    public void setRrc(RRC rrc)
    {
	mComponents[4] = rrc;
    }
    
    
    // Methods for field "udreGrowthRate"
    public UDREGrowthRate getUdreGrowthRate()
    {
	return (UDREGrowthRate)mComponents[5];
    }
    
    public void setUdreGrowthRate(UDREGrowthRate udreGrowthRate)
    {
	mComponents[5] = udreGrowthRate;
    }
    
    public boolean hasUdreGrowthRate()
    {
	return componentIsPresent(5);
    }
    
    public void deleteUdreGrowthRate()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "udreValidityTime"
    public UDREValidityTime getUdreValidityTime()
    {
	return (UDREValidityTime)mComponents[6];
    }
    
    public void setUdreValidityTime(UDREValidityTime udreValidityTime)
    {
	mComponents[6] = udreValidityTime;
    }
    
    public boolean hasUdreValidityTime()
    {
	return componentIsPresent(6);
    }
    
    public void deleteUdreValidityTime()
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
	    "DGPS_CorrectionSatInfo_r9"
	),
	new QName (
	    "InformationElements",
	    "DGPS-CorrectionSatInfo-r9"
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
				"SatID"
			    ),
			    new QName (
				"InformationElements",
				"SatID"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SatID(0), 
				    new SatID(63),
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
		    "satID",
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
				"IODE"
			    ),
			    new QName (
				"InformationElements",
				"IODE"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new IODE(0), 
				    new IODE(255),
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
		    "iode",
		    1,
		    2,
		    null
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
				"UDRE"
			    ),
			    new QName (
				"InformationElements",
				"UDRE"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"lessThan1",
					0
				    ),
				    new MemberListElement (
					"between1-and-4",
					1
				    ),
				    new MemberListElement (
					"between4-and-8",
					2
				    ),
				    new MemberListElement (
					"over8",
					3
				    )
				}
			    ),
			    0,
			    UDRE.lessThan1
			)
		    ),
		    "udre",
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
				"rrc.informationelements",
				"PRC"
			    ),
			    new QName (
				"InformationElements",
				"PRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new PRC(-2047), 
				    new PRC(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2047),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "prc",
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
				"rrc.informationelements",
				"RRC"
			    ),
			    new QName (
				"InformationElements",
				"RRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RRC(-127), 
				    new RRC(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-127),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "rrc",
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
				"UDREGrowthRate"
			    ),
			    new QName (
				"InformationElements",
				"UDREGrowthRate"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"growth-1-5",
					0
				    ),
				    new MemberListElement (
					"growth-2",
					1
				    ),
				    new MemberListElement (
					"growth-4",
					2
				    ),
				    new MemberListElement (
					"growth-6",
					3
				    ),
				    new MemberListElement (
					"growth-8",
					4
				    ),
				    new MemberListElement (
					"growth-10",
					5
				    ),
				    new MemberListElement (
					"growth-12",
					6
				    ),
				    new MemberListElement (
					"growth-16",
					7
				    )
				}
			    ),
			    0,
			    UDREGrowthRate.growth_1_5
			)
		    ),
		    "udreGrowthRate",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UDREValidityTime"
			    ),
			    new QName (
				"InformationElements",
				"UDREValidityTime"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"val-20sec",
					0
				    ),
				    new MemberListElement (
					"val-40sec",
					1
				    ),
				    new MemberListElement (
					"val-80sec",
					2
				    ),
				    new MemberListElement (
					"val-160sec",
					3
				    ),
				    new MemberListElement (
					"val-320sec",
					4
				    ),
				    new MemberListElement (
					"val-640sec",
					5
				    ),
				    new MemberListElement (
					"val-1280sec",
					6
				    ),
				    new MemberListElement (
					"val-2560sec",
					7
				    )
				}
			    ),
			    0,
			    UDREValidityTime.val_20sec
			)
		    ),
		    "udreValidityTime",
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
     * Get the type descriptor (TypeInfo) of 'this' DGPS_CorrectionSatInfo_r9 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGPS_CorrectionSatInfo_r9 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGPS_CorrectionSatInfo_r9
