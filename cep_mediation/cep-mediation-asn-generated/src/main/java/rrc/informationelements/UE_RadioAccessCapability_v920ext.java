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
 * Define the ASN1 Type UE_RadioAccessCapability_v920ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapability_v920ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapability_v920ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapability_v920ext(SupportOfenhancedTS0 supportOfenhancedTS0)
    {
	setSupportOfenhancedTS0(supportOfenhancedTS0);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfenhancedTS0._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportOfenhancedTS0._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfenhancedTS0"
    public SupportOfenhancedTS0 getSupportOfenhancedTS0()
    {
	return (SupportOfenhancedTS0)mComponents[0];
    }
    
    public void setSupportOfenhancedTS0(SupportOfenhancedTS0 supportOfenhancedTS0)
    {
	mComponents[0] = supportOfenhancedTS0;
    }
    
    public boolean hasSupportOfenhancedTS0()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfenhancedTS0()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfenhancedTS0 from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfenhancedTS0 extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfenhancedTS0()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfenhancedTS0(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfenhancedTS0 _true =
	    new SupportOfenhancedTS0(0);
	private final static SupportOfenhancedTS0 cNamedNumbers[] = {
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
	
	public static SupportOfenhancedTS0 valueOf(long value)
	{
	    return (SupportOfenhancedTS0)_true.lookupValue(value);
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
		"UE_RadioAccessCapability_v920ext$SupportOfenhancedTS0"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfenhancedTS0 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfenhancedTS0 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfenhancedTS0

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
	    "UE_RadioAccessCapability_v920ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapability-v920ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapability_v920ext$SupportOfenhancedTS0"
			)
		    ),
		    "supportOfenhancedTS0",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v920ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapability_v920ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapability_v920ext
