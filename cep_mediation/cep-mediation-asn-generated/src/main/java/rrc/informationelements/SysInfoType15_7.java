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
 * Define the ASN1 Type SysInfoType15_7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType15_7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType15_7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType15_7(UE_Positioning_GANSS_Data_Bit_Assistance ue_positioning_GANSS_DataBitAssistance, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setUe_positioning_GANSS_DataBitAssistance(ue_positioning_GANSS_DataBitAssistance);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType15_7(UE_Positioning_GANSS_Data_Bit_Assistance ue_positioning_GANSS_DataBitAssistance)
    {
	setUe_positioning_GANSS_DataBitAssistance(ue_positioning_GANSS_DataBitAssistance);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UE_Positioning_GANSS_Data_Bit_Assistance();
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
		return new UE_Positioning_GANSS_Data_Bit_Assistance();
	    case 1:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_positioning_GANSS_DataBitAssistance"
    public UE_Positioning_GANSS_Data_Bit_Assistance getUe_positioning_GANSS_DataBitAssistance()
    {
	return (UE_Positioning_GANSS_Data_Bit_Assistance)mComponents[0];
    }
    
    public void setUe_positioning_GANSS_DataBitAssistance(UE_Positioning_GANSS_Data_Bit_Assistance ue_positioning_GANSS_DataBitAssistance)
    {
	mComponents[0] = ue_positioning_GANSS_DataBitAssistance;
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
		"SysInfoType15_7$NonCriticalExtensions"
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
	    "SysInfoType15_7"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType15-7"
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
				"UE_Positioning_GANSS_Data_Bit_Assistance"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-Data-Bit-Assistance"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Data_Bit_Assistance"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "UE_Positioning_GANSS_Data_Bit_Assistance"
				)
			    ),
			    0
			)
		    ),
		    "ue-positioning-GANSS-DataBitAssistance",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType15_7$NonCriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType15_7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType15_7 object.
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
    
} // End class definition for SysInfoType15_7
