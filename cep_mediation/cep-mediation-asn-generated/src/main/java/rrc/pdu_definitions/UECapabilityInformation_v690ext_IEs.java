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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type UECapabilityInformation_v690ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UECapabilityInformation_v690ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UECapabilityInformation_v690ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UECapabilityInformation_v690ext_IEs(UeCapabilityContainer ueCapabilityContainer)
    {
	setUeCapabilityContainer(ueCapabilityContainer);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UeCapabilityContainer();
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
		return new UeCapabilityContainer();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ueCapabilityContainer"
    public UeCapabilityContainer getUeCapabilityContainer()
    {
	return (UeCapabilityContainer)mComponents[0];
    }
    
    public void setUeCapabilityContainer(UeCapabilityContainer ueCapabilityContainer)
    {
	mComponents[0] = ueCapabilityContainer;
    }
    
    public boolean hasUeCapabilityContainer()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUeCapabilityContainer()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type UeCapabilityContainer from ASN1 Module PDU_definitions.
     * @see ContainingBitString
     */
    public static class UeCapabilityContainer extends ContainingBitString {
	
	/**
	 * The default constructor.
	 */
	public UeCapabilityContainer()
	{
	}
	
	/**
	 * Construct Bit String from a byte array.
	 * All bits considered significant.
	 * @param value the byte array to set this object to.
	 */
	public UeCapabilityContainer(byte[] value)
	{
	    super(value);
	}
	
	
	/**
	 * Construct Bit String from a byte array and significant bits.
	 * @param value the byte array to set this object to.
	 * @param sigBits the number of significant bits.
	 */
	public UeCapabilityContainer(byte[] value, int sigBits)
	{
	    super(value, sigBits);
	}
	
	/**
	 * Construct from a contained type value.
	 */
	public UeCapabilityContainer(rrc.informationelements.UE_CapabilityContainer_IEs decoded)
	{
	    super(decoded);
	}
	
	// Methods for getting and setting a contained value
	public rrc.informationelements.UE_CapabilityContainer_IEs getContainedValue()
	{
	    return (rrc.informationelements.UE_CapabilityContainer_IEs)getDecodedValue();
	}
	
	public void setContainedValue(rrc.informationelements.UE_CapabilityContainer_IEs value)
	{
	    setDecodedValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainingBitStringInfo c_typeinfo = new ContainingBitStringInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UECapabilityInformation_v690ext_IEs$UeCapabilityContainer"
	    ),
	    new QName (
		"builtin",
		"BIT STRING"
	    ),
	    12314,
	    null,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "UE_CapabilityContainer_IEs"
		)
	    ),
	    null
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' UeCapabilityContainer object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for UeCapabilityContainer

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
	    "rrc.pdu_definitions",
	    "UECapabilityInformation_v690ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UECapabilityInformation-v690ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UECapabilityInformation_v690ext_IEs$UeCapabilityContainer"
			)
		    ),
		    "ueCapabilityContainer",
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
     * Get the type descriptor (TypeInfo) of 'this' UECapabilityInformation_v690ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UECapabilityInformation_v690ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UECapabilityInformation_v690ext_IEs
