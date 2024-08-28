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
 * Define the ASN1 Type AcquisitionSatInfo_r10 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class AcquisitionSatInfo_r10 extends Sequence {
    
    /**
     * The default constructor.
     */
    public AcquisitionSatInfo_r10()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AcquisitionSatInfo_r10(SatID satID, INTEGER doppler0thOrder, 
		    ExtraDopplerInfo extraDopplerInfo, INTEGER codePhase, 
		    INTEGER integerCodePhase, INTEGER gps_BitNumber, 
		    CodePhaseSearchWindow codePhaseSearchWindow, 
		    AzimuthAndElevation_r10 azimuthAndElevation)
    {
	setSatID(satID);
	setDoppler0thOrder(doppler0thOrder);
	setExtraDopplerInfo(extraDopplerInfo);
	setCodePhase(codePhase);
	setIntegerCodePhase(integerCodePhase);
	setGps_BitNumber(gps_BitNumber);
	setCodePhaseSearchWindow(codePhaseSearchWindow);
	setAzimuthAndElevation(azimuthAndElevation);
    }
    
    /**
     * Construct with components.
     */
    public AcquisitionSatInfo_r10(SatID satID, long doppler0thOrder, 
		    ExtraDopplerInfo extraDopplerInfo, long codePhase, 
		    long integerCodePhase, long gps_BitNumber, 
		    CodePhaseSearchWindow codePhaseSearchWindow, 
		    AzimuthAndElevation_r10 azimuthAndElevation)
    {
	this(satID, new INTEGER(doppler0thOrder), extraDopplerInfo, 
	     new INTEGER(codePhase), new INTEGER(integerCodePhase), 
	     new INTEGER(gps_BitNumber), codePhaseSearchWindow, 
	     azimuthAndElevation);
    }
    
    /**
     * Construct with required components.
     */
    public AcquisitionSatInfo_r10(SatID satID, long doppler0thOrder, 
		    long codePhase, long integerCodePhase, long gps_BitNumber, 
		    CodePhaseSearchWindow codePhaseSearchWindow)
    {
	setSatID(satID);
	setDoppler0thOrder(doppler0thOrder);
	setCodePhase(codePhase);
	setIntegerCodePhase(integerCodePhase);
	setGps_BitNumber(gps_BitNumber);
	setCodePhaseSearchWindow(codePhaseSearchWindow);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SatID();
	mComponents[1] = new INTEGER();
	mComponents[2] = new ExtraDopplerInfo();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = CodePhaseSearchWindow.w1023;
	mComponents[7] = new AzimuthAndElevation_r10();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SatID();
	    case 1:
		return new INTEGER();
	    case 2:
		return new ExtraDopplerInfo();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return CodePhaseSearchWindow.w1023;
	    case 7:
		return new AzimuthAndElevation_r10();
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
    
    
    // Methods for field "doppler0thOrder"
    public long getDoppler0thOrder()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDoppler0thOrder(long doppler0thOrder)
    {
	setDoppler0thOrder(new INTEGER(doppler0thOrder));
    }
    
    public void setDoppler0thOrder(INTEGER doppler0thOrder)
    {
	mComponents[1] = doppler0thOrder;
    }
    
    
    // Methods for field "extraDopplerInfo"
    public ExtraDopplerInfo getExtraDopplerInfo()
    {
	return (ExtraDopplerInfo)mComponents[2];
    }
    
    public void setExtraDopplerInfo(ExtraDopplerInfo extraDopplerInfo)
    {
	mComponents[2] = extraDopplerInfo;
    }
    
    public boolean hasExtraDopplerInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteExtraDopplerInfo()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "codePhase"
    public long getCodePhase()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setCodePhase(long codePhase)
    {
	setCodePhase(new INTEGER(codePhase));
    }
    
    public void setCodePhase(INTEGER codePhase)
    {
	mComponents[3] = codePhase;
    }
    
    
    // Methods for field "integerCodePhase"
    public long getIntegerCodePhase()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setIntegerCodePhase(long integerCodePhase)
    {
	setIntegerCodePhase(new INTEGER(integerCodePhase));
    }
    
    public void setIntegerCodePhase(INTEGER integerCodePhase)
    {
	mComponents[4] = integerCodePhase;
    }
    
    
    // Methods for field "gps_BitNumber"
    public long getGps_BitNumber()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setGps_BitNumber(long gps_BitNumber)
    {
	setGps_BitNumber(new INTEGER(gps_BitNumber));
    }
    
    public void setGps_BitNumber(INTEGER gps_BitNumber)
    {
	mComponents[5] = gps_BitNumber;
    }
    
    
    // Methods for field "codePhaseSearchWindow"
    public CodePhaseSearchWindow getCodePhaseSearchWindow()
    {
	return (CodePhaseSearchWindow)mComponents[6];
    }
    
    public void setCodePhaseSearchWindow(CodePhaseSearchWindow codePhaseSearchWindow)
    {
	mComponents[6] = codePhaseSearchWindow;
    }
    
    
    // Methods for field "azimuthAndElevation"
    public AzimuthAndElevation_r10 getAzimuthAndElevation()
    {
	return (AzimuthAndElevation_r10)mComponents[7];
    }
    
    public void setAzimuthAndElevation(AzimuthAndElevation_r10 azimuthAndElevation)
    {
	mComponents[7] = azimuthAndElevation;
    }
    
    public boolean hasAzimuthAndElevation()
    {
	return componentIsPresent(7);
    }
    
    public void deleteAzimuthAndElevation()
    {
	setComponentAbsent(7);
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
	    "AcquisitionSatInfo_r10"
	),
	new QName (
	    "InformationElements",
	    "AcquisitionSatInfo-r10"
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
				    new com.oss.asn1.INTEGER(-2048), 
				    new com.oss.asn1.INTEGER(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2048),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "doppler0thOrder",
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
				"ExtraDopplerInfo"
			    ),
			    new QName (
				"InformationElements",
				"ExtraDopplerInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExtraDopplerInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ExtraDopplerInfo"
				)
			    ),
			    0
			)
		    ),
		    "extraDopplerInfo",
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
		    "codePhase",
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
				    new com.oss.asn1.INTEGER(19),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(19)
			    ),
			    null
			)
		    ),
		    "integerCodePhase",
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
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "gps-BitNumber",
		    5,
		    2,
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
				"CodePhaseSearchWindow"
			    ),
			    new QName (
				"InformationElements",
				"CodePhaseSearchWindow"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"w1023",
					0
				    ),
				    new MemberListElement (
					"w1",
					1
				    ),
				    new MemberListElement (
					"w2",
					2
				    ),
				    new MemberListElement (
					"w3",
					3
				    ),
				    new MemberListElement (
					"w4",
					4
				    ),
				    new MemberListElement (
					"w6",
					5
				    ),
				    new MemberListElement (
					"w8",
					6
				    ),
				    new MemberListElement (
					"w12",
					7
				    ),
				    new MemberListElement (
					"w16",
					8
				    ),
				    new MemberListElement (
					"w24",
					9
				    ),
				    new MemberListElement (
					"w32",
					10
				    ),
				    new MemberListElement (
					"w48",
					11
				    ),
				    new MemberListElement (
					"w64",
					12
				    ),
				    new MemberListElement (
					"w96",
					13
				    ),
				    new MemberListElement (
					"w128",
					14
				    ),
				    new MemberListElement (
					"w192",
					15
				    )
				}
			    ),
			    0,
			    CodePhaseSearchWindow.w1023
			)
		    ),
		    "codePhaseSearchWindow",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"AzimuthAndElevation_r10"
			    ),
			    new QName (
				"InformationElements",
				"AzimuthAndElevation-r10"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "AzimuthAndElevation_r10"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "AzimuthAndElevation_r10"
				)
			    ),
			    0
			)
		    ),
		    "azimuthAndElevation",
		    7,
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
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AcquisitionSatInfo_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AcquisitionSatInfo_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AcquisitionSatInfo_r10
