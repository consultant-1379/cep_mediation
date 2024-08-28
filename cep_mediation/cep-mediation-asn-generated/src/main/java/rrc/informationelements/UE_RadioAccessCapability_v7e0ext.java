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
 * Define the ASN1 Type UE_RadioAccessCapability_v7e0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v7e0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v7e0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v7e0ext(SupportForTwoDRXSchemesInPCH supportForTwoDRXSchemesInPCH, 
		    SupportEDPDCHPowerInterpolation supportEDPDCHPowerInterpolation)
    {
	setSupportForTwoDRXSchemesInPCH(supportForTwoDRXSchemesInPCH);
	setSupportEDPDCHPowerInterpolation(supportEDPDCHPowerInterpolation);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportForTwoDRXSchemesInPCH._true;
	mComponents[1] = SupportEDPDCHPowerInterpolation._true;
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
		return SupportForTwoDRXSchemesInPCH._true;
	    case 1:
		return SupportEDPDCHPowerInterpolation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportForTwoDRXSchemesInPCH"
    public SupportForTwoDRXSchemesInPCH getSupportForTwoDRXSchemesInPCH()
    {
	return (SupportForTwoDRXSchemesInPCH)mComponents[0];
    }
    
    public void setSupportForTwoDRXSchemesInPCH(SupportForTwoDRXSchemesInPCH supportForTwoDRXSchemesInPCH)
    {
	mComponents[0] = supportForTwoDRXSchemesInPCH;
    }
    
    public boolean hasSupportForTwoDRXSchemesInPCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportForTwoDRXSchemesInPCH()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForTwoDRXSchemesInPCH from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportForTwoDRXSchemesInPCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForTwoDRXSchemesInPCH()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForTwoDRXSchemesInPCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForTwoDRXSchemesInPCH _true =
	    new SupportForTwoDRXSchemesInPCH(0);
	private final static SupportForTwoDRXSchemesInPCH cNamedNumbers[] = {
	     _true
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
	
	public static SupportForTwoDRXSchemesInPCH valueOf(long value)
	{
	    return (SupportForTwoDRXSchemesInPCH)_true.lookupValue(value);
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
		"UE_RadioAccessCapability_v7e0ext$SupportForTwoDRXSchemesInPCH"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportForTwoDRXSchemesInPCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForTwoDRXSchemesInPCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForTwoDRXSchemesInPCH

    // Methods for field "supportEDPDCHPowerInterpolation"
    public SupportEDPDCHPowerInterpolation getSupportEDPDCHPowerInterpolation()
    {
	return (SupportEDPDCHPowerInterpolation)mComponents[1];
    }
    
    public void setSupportEDPDCHPowerInterpolation(SupportEDPDCHPowerInterpolation supportEDPDCHPowerInterpolation)
    {
	mComponents[1] = supportEDPDCHPowerInterpolation;
    }
    
    public boolean hasSupportEDPDCHPowerInterpolation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportEDPDCHPowerInterpolation()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportEDPDCHPowerInterpolation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportEDPDCHPowerInterpolation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportEDPDCHPowerInterpolation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportEDPDCHPowerInterpolation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportEDPDCHPowerInterpolation _true =
	    new SupportEDPDCHPowerInterpolation(0);
	private final static SupportEDPDCHPowerInterpolation cNamedNumbers[] = {
	     _true
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
	
	public static SupportEDPDCHPowerInterpolation valueOf(long value)
	{
	    return (SupportEDPDCHPowerInterpolation)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapability_v7e0ext$SupportEDPDCHPowerInterpolation"
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
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportEDPDCHPowerInterpolation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportEDPDCHPowerInterpolation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportEDPDCHPowerInterpolation

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
	    "UE_RadioAccessCapability_v7e0ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v7e0ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v7e0ext$SupportForTwoDRXSchemesInPCH"
			)
		    ),
		    "supportForTwoDRXSchemesInPCH",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v7e0ext$SupportEDPDCHPowerInterpolation"
			)
		    ),
		    "supportEDPDCHPowerInterpolation",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v7e0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v7e0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v7e0ext
