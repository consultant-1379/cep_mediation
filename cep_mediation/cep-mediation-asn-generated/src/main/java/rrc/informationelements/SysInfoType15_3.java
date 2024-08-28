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
 * Define the ASN1 Type SysInfoType15_3 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_3 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_3()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_3(GPS_TOW_1sec transmissionTOW, 
		    UE_Positioning_GPS_Almanac ue_positioning_GPS_Almanac, 
		    UE_Positioning_GPS_IonosphericModel ue_positioning_GPS_IonosphericModel, 
		    UE_Positioning_GPS_UTC_Model ue_positioning_GPS_UTC_Model, 
		    BitString satMask, BitString lsbTOW, Va40NCEs va40NCEs)
    {
	setTransmissionTOW(transmissionTOW);
	setUe_positioning_GPS_Almanac(ue_positioning_GPS_Almanac);
	setUe_positioning_GPS_IonosphericModel(ue_positioning_GPS_IonosphericModel);
	setUe_positioning_GPS_UTC_Model(ue_positioning_GPS_UTC_Model);
	setSatMask(satMask);
	setLsbTOW(lsbTOW);
	setVa40NCEs(va40NCEs);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_3(GPS_TOW_1sec transmissionTOW)
    {
	setTransmissionTOW(transmissionTOW);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GPS_TOW_1sec();
	mComponents[1] = new UE_Positioning_GPS_Almanac();
	mComponents[2] = new UE_Positioning_GPS_IonosphericModel();
	mComponents[3] = new UE_Positioning_GPS_UTC_Model();
	mComponents[4] = new BitString();
	mComponents[5] = new BitString();
	mComponents[6] = new Va40NCEs();
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
		return new GPS_TOW_1sec();
	    case 1:
		return new UE_Positioning_GPS_Almanac();
	    case 2:
		return new UE_Positioning_GPS_IonosphericModel();
	    case 3:
		return new UE_Positioning_GPS_UTC_Model();
	    case 4:
		return new BitString();
	    case 5:
		return new BitString();
	    case 6:
		return new Va40NCEs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmissionTOW"
    public GPS_TOW_1sec getTransmissionTOW()
    {
	return (GPS_TOW_1sec)mComponents[0];
    }
    
    public void setTransmissionTOW(GPS_TOW_1sec transmissionTOW)
    {
	mComponents[0] = transmissionTOW;
    }
    
    
    // Methods for field "ue_positioning_GPS_Almanac"
    public UE_Positioning_GPS_Almanac getUe_positioning_GPS_Almanac()
    {
	return (UE_Positioning_GPS_Almanac)mComponents[1];
    }
    
    public void setUe_positioning_GPS_Almanac(UE_Positioning_GPS_Almanac ue_positioning_GPS_Almanac)
    {
	mComponents[1] = ue_positioning_GPS_Almanac;
    }
    
    public boolean hasUe_positioning_GPS_Almanac()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GPS_Almanac()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ue_positioning_GPS_IonosphericModel"
    public UE_Positioning_GPS_IonosphericModel getUe_positioning_GPS_IonosphericModel()
    {
	return (UE_Positioning_GPS_IonosphericModel)mComponents[2];
    }
    
    public void setUe_positioning_GPS_IonosphericModel(UE_Positioning_GPS_IonosphericModel ue_positioning_GPS_IonosphericModel)
    {
	mComponents[2] = ue_positioning_GPS_IonosphericModel;
    }
    
    public boolean hasUe_positioning_GPS_IonosphericModel()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUe_positioning_GPS_IonosphericModel()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ue_positioning_GPS_UTC_Model"
    public UE_Positioning_GPS_UTC_Model getUe_positioning_GPS_UTC_Model()
    {
	return (UE_Positioning_GPS_UTC_Model)mComponents[3];
    }
    
    public void setUe_positioning_GPS_UTC_Model(UE_Positioning_GPS_UTC_Model ue_positioning_GPS_UTC_Model)
    {
	mComponents[3] = ue_positioning_GPS_UTC_Model;
    }
    
    public boolean hasUe_positioning_GPS_UTC_Model()
    {
	return componentIsPresent(3);
    }
    
    public void deleteUe_positioning_GPS_UTC_Model()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "satMask"
    public BitString getSatMask()
    {
	return (BitString)mComponents[4];
    }
    
    public void setSatMask(BitString satMask)
    {
	mComponents[4] = satMask;
    }
    
    public boolean hasSatMask()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSatMask()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "lsbTOW"
    public BitString getLsbTOW()
    {
	return (BitString)mComponents[5];
    }
    
    public void setLsbTOW(BitString lsbTOW)
    {
	mComponents[5] = lsbTOW;
    }
    
    public boolean hasLsbTOW()
    {
	return componentIsPresent(5);
    }
    
    public void deleteLsbTOW()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "va40NCEs"
    public Va40NCEs getVa40NCEs()
    {
	return (Va40NCEs)mComponents[6];
    }
    
    public void setVa40NCEs(Va40NCEs va40NCEs)
    {
	mComponents[6] = va40NCEs;
    }
    
    public boolean hasVa40NCEs()
    {
	return componentIsPresent(6);
    }
    
    public void deleteVa40NCEs()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Va40NCEs from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Va40NCEs extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Va40NCEs()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Va40NCEs(SysInfoType15_3_va40ext_IEs sysInfoType15_3_va40ext, 
			NonCriticalExtensions nonCriticalExtensions)
	{
	    setSysInfoType15_3_va40ext(sysInfoType15_3_va40ext);
	    setNonCriticalExtensions(nonCriticalExtensions);
	}
	
	/**
	 * Construct with required components.
	 */
	public Va40NCEs(SysInfoType15_3_va40ext_IEs sysInfoType15_3_va40ext)
	{
	    setSysInfoType15_3_va40ext(sysInfoType15_3_va40ext);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new SysInfoType15_3_va40ext_IEs();
	    mComponents[1] = new NonCriticalExtensions();
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
		    return new SysInfoType15_3_va40ext_IEs();
		case 1:
		    return new NonCriticalExtensions();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "sysInfoType15_3_va40ext"
	public SysInfoType15_3_va40ext_IEs getSysInfoType15_3_va40ext()
	{
	    return (SysInfoType15_3_va40ext_IEs)mComponents[0];
	}
	
	public void setSysInfoType15_3_va40ext(SysInfoType15_3_va40ext_IEs sysInfoType15_3_va40ext)
	{
	    mComponents[0] = sysInfoType15_3_va40ext;
	}
	
	
	// Methods for field "nonCriticalExtensions"
	public NonCriticalExtensions getNonCriticalExtensions()
	{
	    return (NonCriticalExtensions)mComponents[1];
	}
	
	public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
	{
	    mComponents[1] = nonCriticalExtensions;
	}
	
	public boolean hasNonCriticalExtensions()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteNonCriticalExtensions()
	{
	    setComponentAbsent(1);
	}
	
	
	
	/**
	 * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class NonCriticalExtensions extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public NonCriticalExtensions()
	    {
	    }
	    
	    public void initComponents()
	    {
		
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[0];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		return null;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "SysInfoType15_3$Va40NCEs$NonCriticalExtensions"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
		    }
		),
		0,
		null,
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for NonCriticalExtensions

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType15_3$Va40NCEs"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "SysInfoType15_3_va40ext_IEs"
				),
				new QName (
				    "InformationElements",
				    "SysInfoType15-3-va40ext-IEs"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_3_va40ext_IEs"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"SysInfoType15_3_va40ext_IEs"
				    )
				),
				0
			    )
			),
			"sysInfoType15-3-va40ext",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SysInfoType15_3$Va40NCEs$NonCriticalExtensions"
			    )
			),
			"nonCriticalExtensions",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Va40NCEs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Va40NCEs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Va40NCEs

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
	    "SysInfoType15_3"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-3"
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
		    "transmissionTOW",
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
				"UE_Positioning_GPS_Almanac"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-Almanac"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_Almanac"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-Almanac",
		    1,
		    3,
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
				"UE_Positioning_GPS_IonosphericModel"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-IonosphericModel"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_IonosphericModel"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-IonosphericModel",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GPS_UTC_Model"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GPS-UTC-Model"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_UTC_Model"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GPS_UTC_Model"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GPS-UTC-Model",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "satMask",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "lsbTOW",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_3$Va40NCEs"
			)
		    ),
		    "va40NCEs",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_3 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_3 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType15_3
