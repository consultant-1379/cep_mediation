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
 * Define the ASN1 Type MultiModeRAT_Capability_v680ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiModeRAT_Capability_v680ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiModeRAT_Capability_v680ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiModeRAT_Capability_v680ext(SupportOfHandoverToGAN supportOfHandoverToGAN)
    {
	setSupportOfHandoverToGAN(supportOfHandoverToGAN);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfHandoverToGAN.doesSupportHandoverToGAN;
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
		return SupportOfHandoverToGAN.doesSupportHandoverToGAN;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfHandoverToGAN"
    public SupportOfHandoverToGAN getSupportOfHandoverToGAN()
    {
	return (SupportOfHandoverToGAN)mComponents[0];
    }
    
    public void setSupportOfHandoverToGAN(SupportOfHandoverToGAN supportOfHandoverToGAN)
    {
	mComponents[0] = supportOfHandoverToGAN;
    }
    
    public boolean hasSupportOfHandoverToGAN()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfHandoverToGAN()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfHandoverToGAN from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfHandoverToGAN extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfHandoverToGAN()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfHandoverToGAN(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfHandoverToGAN doesSupportHandoverToGAN =
	    new SupportOfHandoverToGAN(0);
	private final static SupportOfHandoverToGAN cNamedNumbers[] = {
	     doesSupportHandoverToGAN
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
	
	public static SupportOfHandoverToGAN valueOf(long value)
	{
	    return (SupportOfHandoverToGAN)doesSupportHandoverToGAN.lookupValue(value);
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
		"MultiModeRAT_Capability_v680ext$SupportOfHandoverToGAN"
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
			"doesSupportHandoverToGAN",
			0
		    )
		}
	    ),
	    0,
	    doesSupportHandoverToGAN
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfHandoverToGAN object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfHandoverToGAN object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfHandoverToGAN

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
	    "MultiModeRAT_Capability_v680ext"
	),
	new QName (
	    "InformationElements",
	    "MultiModeRAT-Capability-v680ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v680ext$SupportOfHandoverToGAN"
			)
		    ),
		    "supportOfHandoverToGAN",
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
     * Get the type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v680ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v680ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiModeRAT_Capability_v680ext
