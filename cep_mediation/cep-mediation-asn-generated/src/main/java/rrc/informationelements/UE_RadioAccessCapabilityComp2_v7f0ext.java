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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp2_v7f0ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp2_v7f0ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp2_v7f0ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp2_v7f0ext(SupportofTxDivOnNonMIMOChannel supportofTxDivOnNonMIMOChannel)
    {
	setSupportofTxDivOnNonMIMOChannel(supportofTxDivOnNonMIMOChannel);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportofTxDivOnNonMIMOChannel._true;
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
		return SupportofTxDivOnNonMIMOChannel._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportofTxDivOnNonMIMOChannel"
    public SupportofTxDivOnNonMIMOChannel getSupportofTxDivOnNonMIMOChannel()
    {
	return (SupportofTxDivOnNonMIMOChannel)mComponents[0];
    }
    
    public void setSupportofTxDivOnNonMIMOChannel(SupportofTxDivOnNonMIMOChannel supportofTxDivOnNonMIMOChannel)
    {
	mComponents[0] = supportofTxDivOnNonMIMOChannel;
    }
    
    public boolean hasSupportofTxDivOnNonMIMOChannel()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportofTxDivOnNonMIMOChannel()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportofTxDivOnNonMIMOChannel from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportofTxDivOnNonMIMOChannel extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportofTxDivOnNonMIMOChannel()
	{
	    super(cFirstNumber);
	}
	
	protected SupportofTxDivOnNonMIMOChannel(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportofTxDivOnNonMIMOChannel _true =
	    new SupportofTxDivOnNonMIMOChannel(0);
	private final static SupportofTxDivOnNonMIMOChannel cNamedNumbers[] = {
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
	
	public static SupportofTxDivOnNonMIMOChannel valueOf(long value)
	{
	    return (SupportofTxDivOnNonMIMOChannel)_true.lookupValue(value);
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
		"UE_RadioAccessCapabilityComp2_v7f0ext$SupportofTxDivOnNonMIMOChannel"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportofTxDivOnNonMIMOChannel object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportofTxDivOnNonMIMOChannel object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportofTxDivOnNonMIMOChannel

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
	    "UE_RadioAccessCapabilityComp2_v7f0ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp2-v7f0ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v7f0ext$SupportofTxDivOnNonMIMOChannel"
			)
		    ),
		    "supportofTxDivOnNonMIMOChannel",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2_v7f0ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2_v7f0ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp2_v7f0ext
