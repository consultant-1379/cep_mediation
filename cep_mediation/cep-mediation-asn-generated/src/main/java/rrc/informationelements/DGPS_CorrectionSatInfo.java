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
 * Define the ASN1 Type DGPS_CorrectionSatInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DGPS_CorrectionSatInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DGPS_CorrectionSatInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DGPS_CorrectionSatInfo(SatID satID, IODE iode, UDRE udre, PRC prc, 
		    RRC rrc, DeltaPRC dummy1, DeltaRRC dummy2, 
		    DeltaPRC dummy3, DeltaRRC dummy4)
    {
	setSatID(satID);
	setIode(iode);
	setUdre(udre);
	setPrc(prc);
	setRrc(rrc);
	setDummy1(dummy1);
	setDummy2(dummy2);
	setDummy3(dummy3);
	setDummy4(dummy4);
    }
    
    /**
     * Construct with required components.
     */
    public DGPS_CorrectionSatInfo(SatID satID, IODE iode, UDRE udre, PRC prc, 
		    RRC rrc, DeltaPRC dummy1, DeltaRRC dummy2)
    {
	setSatID(satID);
	setIode(iode);
	setUdre(udre);
	setPrc(prc);
	setRrc(rrc);
	setDummy1(dummy1);
	setDummy2(dummy2);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SatID();
	mComponents[1] = new IODE();
	mComponents[2] = UDRE.lessThan1;
	mComponents[3] = new PRC();
	mComponents[4] = new RRC();
	mComponents[5] = new DeltaPRC();
	mComponents[6] = new DeltaRRC();
	mComponents[7] = new DeltaPRC();
	mComponents[8] = new DeltaRRC();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
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
		return new DeltaPRC();
	    case 6:
		return new DeltaRRC();
	    case 7:
		return new DeltaPRC();
	    case 8:
		return new DeltaRRC();
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
    
    
    // Methods for field "dummy1"
    public DeltaPRC getDummy1()
    {
	return (DeltaPRC)mComponents[5];
    }
    
    public void setDummy1(DeltaPRC dummy1)
    {
	mComponents[5] = dummy1;
    }
    
    
    // Methods for field "dummy2"
    public DeltaRRC getDummy2()
    {
	return (DeltaRRC)mComponents[6];
    }
    
    public void setDummy2(DeltaRRC dummy2)
    {
	mComponents[6] = dummy2;
    }
    
    
    // Methods for field "dummy3"
    public DeltaPRC getDummy3()
    {
	return (DeltaPRC)mComponents[7];
    }
    
    public void setDummy3(DeltaPRC dummy3)
    {
	mComponents[7] = dummy3;
    }
    
    public boolean hasDummy3()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDummy3()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "dummy4"
    public DeltaRRC getDummy4()
    {
	return (DeltaRRC)mComponents[8];
    }
    
    public void setDummy4(DeltaRRC dummy4)
    {
	mComponents[8] = dummy4;
    }
    
    public boolean hasDummy4()
    {
	return componentIsPresent(8);
    }
    
    public void deleteDummy4()
    {
	setComponentAbsent(8);
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
	    "DGPS_CorrectionSatInfo"
	),
	new QName (
	    "InformationElements",
	    "DGPS-CorrectionSatInfo"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaPRC"
			    ),
			    new QName (
				"InformationElements",
				"DeltaPRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaPRC(-127), 
				    new DeltaPRC(127),
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
		    "dummy1",
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
				"rrc.informationelements",
				"DeltaRRC"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaRRC(-7), 
				    new DeltaRRC(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "dummy2",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaPRC"
			    ),
			    new QName (
				"InformationElements",
				"DeltaPRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaPRC(-127), 
				    new DeltaPRC(127),
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
		    "dummy3",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DeltaRRC"
			    ),
			    new QName (
				"InformationElements",
				"DeltaRRC"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaRRC(-7), 
				    new DeltaRRC(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "dummy4",
		    8,
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
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DGPS_CorrectionSatInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DGPS_CorrectionSatInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DGPS_CorrectionSatInfo
