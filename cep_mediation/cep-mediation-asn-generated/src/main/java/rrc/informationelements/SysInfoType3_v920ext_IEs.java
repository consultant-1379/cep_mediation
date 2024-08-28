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
 * Define the ASN1 Type SysInfoType3_v920ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType3_v920ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType3_v920ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType3_v920ext_IEs(ImsEmergencySupportIndicator imsEmergencySupportIndicator)
    {
	setImsEmergencySupportIndicator(imsEmergencySupportIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = ImsEmergencySupportIndicator.supported;
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
		return ImsEmergencySupportIndicator.supported;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "imsEmergencySupportIndicator"
    public ImsEmergencySupportIndicator getImsEmergencySupportIndicator()
    {
	return (ImsEmergencySupportIndicator)mComponents[0];
    }
    
    public void setImsEmergencySupportIndicator(ImsEmergencySupportIndicator imsEmergencySupportIndicator)
    {
	mComponents[0] = imsEmergencySupportIndicator;
    }
    
    public boolean hasImsEmergencySupportIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteImsEmergencySupportIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type ImsEmergencySupportIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class ImsEmergencySupportIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ImsEmergencySupportIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected ImsEmergencySupportIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final ImsEmergencySupportIndicator supported =
	    new ImsEmergencySupportIndicator(0);
	private final static ImsEmergencySupportIndicator cNamedNumbers[] = {
	     supported
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
	
	public static ImsEmergencySupportIndicator valueOf(long value)
	{
	    return (ImsEmergencySupportIndicator)supported.lookupValue(value);
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
		"SysInfoType3_v920ext_IEs$ImsEmergencySupportIndicator"
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
			"supported",
			0
		    )
		}
	    ),
	    0,
	    supported
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ImsEmergencySupportIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ImsEmergencySupportIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ImsEmergencySupportIndicator

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
	    "SysInfoType3_v920ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType3-v920ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType3_v920ext_IEs$ImsEmergencySupportIndicator"
			)
		    ),
		    "imsEmergencySupportIndicator",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType3_v920ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType3_v920ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType3_v920ext_IEs
