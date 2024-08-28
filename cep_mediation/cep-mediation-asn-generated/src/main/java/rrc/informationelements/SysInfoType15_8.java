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
 * Define the ASN1 Type SysInfoType15_8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_8(UE_Positioning_CipherParameters ue_positioning_GANSS_DataCipheringInfo, 
		    UE_Positioning_GANSS_RealTimeIntegrity ue_positioning_GANSS_realTimeIntegrity, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setUe_positioning_GANSS_DataCipheringInfo(ue_positioning_GANSS_DataCipheringInfo);
	setUe_positioning_GANSS_realTimeIntegrity(ue_positioning_GANSS_realTimeIntegrity);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_CipherParameters();
	mComponents[1] = new UE_Positioning_GANSS_RealTimeIntegrity();
	mComponents[2] = new NonCriticalExtensions();
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
		return new UE_Positioning_CipherParameters();
	    case 1:
		return new UE_Positioning_GANSS_RealTimeIntegrity();
	    case 2:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GANSS_DataCipheringInfo"
    public UE_Positioning_CipherParameters getUe_positioning_GANSS_DataCipheringInfo()
    {
	return (UE_Positioning_CipherParameters)mComponents[0];
    }
    
    public void setUe_positioning_GANSS_DataCipheringInfo(UE_Positioning_CipherParameters ue_positioning_GANSS_DataCipheringInfo)
    {
	mComponents[0] = ue_positioning_GANSS_DataCipheringInfo;
    }
    
    public boolean hasUe_positioning_GANSS_DataCipheringInfo()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUe_positioning_GANSS_DataCipheringInfo()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "ue_positioning_GANSS_realTimeIntegrity"
    public UE_Positioning_GANSS_RealTimeIntegrity getUe_positioning_GANSS_realTimeIntegrity()
    {
	return (UE_Positioning_GANSS_RealTimeIntegrity)mComponents[1];
    }
    
    public void setUe_positioning_GANSS_realTimeIntegrity(UE_Positioning_GANSS_RealTimeIntegrity ue_positioning_GANSS_realTimeIntegrity)
    {
	mComponents[1] = ue_positioning_GANSS_realTimeIntegrity;
    }
    
    public boolean hasUe_positioning_GANSS_realTimeIntegrity()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUe_positioning_GANSS_realTimeIntegrity()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[2];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[2] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(2);
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType15_8$NonCriticalExtensions"
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
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "SysInfoType15_8"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-8"
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
				"UE_Positioning_CipherParameters"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-CipherParameters"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_CipherParameters"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-DataCipheringInfo",
		    0,
		    3,
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
				"UE_Positioning_GANSS_RealTimeIntegrity"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-RealTimeIntegrity"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_RealTimeIntegrity$Sequence_"
				)
			    )
			)
		    ),
		    "ue-positioning-GANSS-realTimeIntegrity",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_8$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
		    2,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_8 object.
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
    
} // End class definition for SysInfoType15_8
