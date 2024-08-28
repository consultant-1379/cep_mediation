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
 * Define the ASN1 Type MultiModeRAT_Capability_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MultiModeRAT_Capability_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MultiModeRAT_Capability_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MultiModeRAT_Capability_v770ext(SupportOfPSHandoverToGAN supportOfPSHandoverToGAN)
    {
	setSupportOfPSHandoverToGAN(supportOfPSHandoverToGAN);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportOfPSHandoverToGAN.doesSupportPSHandoverToGAN;
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
		return SupportOfPSHandoverToGAN.doesSupportPSHandoverToGAN;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportOfPSHandoverToGAN"
    public SupportOfPSHandoverToGAN getSupportOfPSHandoverToGAN()
    {
	return (SupportOfPSHandoverToGAN)mComponents[0];
    }
    
    public void setSupportOfPSHandoverToGAN(SupportOfPSHandoverToGAN supportOfPSHandoverToGAN)
    {
	mComponents[0] = supportOfPSHandoverToGAN;
    }
    
    public boolean hasSupportOfPSHandoverToGAN()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportOfPSHandoverToGAN()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfPSHandoverToGAN from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfPSHandoverToGAN extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfPSHandoverToGAN()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfPSHandoverToGAN(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfPSHandoverToGAN doesSupportPSHandoverToGAN =
	    new SupportOfPSHandoverToGAN(0);
	private final static SupportOfPSHandoverToGAN cNamedNumbers[] = {
	     doesSupportPSHandoverToGAN
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
	
	public static SupportOfPSHandoverToGAN valueOf(long value)
	{
	    return (SupportOfPSHandoverToGAN)doesSupportPSHandoverToGAN.lookupValue(value);
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
		"MultiModeRAT_Capability_v770ext$SupportOfPSHandoverToGAN"
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
			"doesSupportPSHandoverToGAN",
			0
		    )
		}
	    ),
	    0,
	    doesSupportPSHandoverToGAN
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfPSHandoverToGAN object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfPSHandoverToGAN object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfPSHandoverToGAN

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
	    "MultiModeRAT_Capability_v770ext"
	),
	new QName (
	    "InformationElements",
	    "MultiModeRAT-Capability-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MultiModeRAT_Capability_v770ext$SupportOfPSHandoverToGAN"
			)
		    ),
		    "supportOfPSHandoverToGAN",
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
     * Get the type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MultiModeRAT_Capability_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MultiModeRAT_Capability_v770ext
