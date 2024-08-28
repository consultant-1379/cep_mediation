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
 * Define the ASN1 Type InterRAT_UE_RadioAccessCapability_v690ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class InterRAT_UE_RadioAccessCapability_v690ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRAT_UE_RadioAccessCapability_v690ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRAT_UE_RadioAccessCapability_v690ext(SupportOfInter_RAT_PS_Handover supportOfInter_RAT_PS_Handover, 
		    GSM_MS_RadioAccessCapability gsm_MS_RadioAccessCapability)
    {
	setSupportOfInter_RAT_PS_Handover(supportOfInter_RAT_PS_Handover);
	setGsm_MS_RadioAccessCapability(gsm_MS_RadioAccessCapability);
    }
    
    /**
     * Construct with required components.
     */
    public InterRAT_UE_RadioAccessCapability_v690ext(GSM_MS_RadioAccessCapability gsm_MS_RadioAccessCapability)
    {
	setGsm_MS_RadioAccessCapability(gsm_MS_RadioAccessCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfInter_RAT_PS_Handover.doesSupporInter_RAT_PS_Handover;
	mComponents[1] = new GSM_MS_RadioAccessCapability();
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
		return SupportOfInter_RAT_PS_Handover.doesSupporInter_RAT_PS_Handover;
	    case 1:
		return new GSM_MS_RadioAccessCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfInter_RAT_PS_Handover"
    public SupportOfInter_RAT_PS_Handover getSupportOfInter_RAT_PS_Handover()
    {
	return (SupportOfInter_RAT_PS_Handover)mComponents[0];
    }
    
    public void setSupportOfInter_RAT_PS_Handover(SupportOfInter_RAT_PS_Handover supportOfInter_RAT_PS_Handover)
    {
	mComponents[0] = supportOfInter_RAT_PS_Handover;
    }
    
    public boolean hasSupportOfInter_RAT_PS_Handover()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfInter_RAT_PS_Handover()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfInter_RAT_PS_Handover from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfInter_RAT_PS_Handover extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfInter_RAT_PS_Handover()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfInter_RAT_PS_Handover(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfInter_RAT_PS_Handover doesSupporInter_RAT_PS_Handover =
	    new SupportOfInter_RAT_PS_Handover(0);
	private final static SupportOfInter_RAT_PS_Handover cNamedNumbers[] = {
	     doesSupporInter_RAT_PS_Handover
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static SupportOfInter_RAT_PS_Handover valueOf(long value)
	{
	    return (SupportOfInter_RAT_PS_Handover)doesSupporInter_RAT_PS_Handover.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"InterRAT_UE_RadioAccessCapability_v690ext$SupportOfInter_RAT_PS_Handover"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"doesSupporInter-RAT-PS-Handover",
			0
		    )
		}
	    ),
	    0,
	    doesSupporInter_RAT_PS_Handover
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfInter_RAT_PS_Handover object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfInter_RAT_PS_Handover object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfInter_RAT_PS_Handover

    // Methods for field "gsm_MS_RadioAccessCapability"
    public GSM_MS_RadioAccessCapability getGsm_MS_RadioAccessCapability()
    {
	return (GSM_MS_RadioAccessCapability)mComponents[1];
    }
    
    public void setGsm_MS_RadioAccessCapability(GSM_MS_RadioAccessCapability gsm_MS_RadioAccessCapability)
    {
	mComponents[1] = gsm_MS_RadioAccessCapability;
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
	    "InterRAT_UE_RadioAccessCapability_v690ext"
	),
	new QName (
	    "InformationElements",
	    "InterRAT-UE-RadioAccessCapability-v690ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "InterRAT_UE_RadioAccessCapability_v690ext$SupportOfInter_RAT_PS_Handover"
			)
		    ),
		    "supportOfInter-RAT-PS-Handover",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"GSM_MS_RadioAccessCapability"
			    ),
			    new QName (
				"InformationElements",
				"GSM-MS-RadioAccessCapability"
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
			    )
			)
		    ),
		    "gsm-MS-RadioAccessCapability",
		    1,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapability_v690ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRAT_UE_RadioAccessCapability_v690ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRAT_UE_RadioAccessCapability_v690ext
