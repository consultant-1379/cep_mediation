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
 * Define the ASN1 Type CompressedModeMeasCapability_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapability_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapability_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapability_v860ext(AdjacentFrequencyMeasurements adjacentFrequencyMeasurements)
    {
	setAdjacentFrequencyMeasurements(adjacentFrequencyMeasurements);
    }
    
    public void initComponents()
    {
	mComponents[0] = AdjacentFrequencyMeasurements._true;
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
		return AdjacentFrequencyMeasurements._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "adjacentFrequencyMeasurements"
    public AdjacentFrequencyMeasurements getAdjacentFrequencyMeasurements()
    {
	return (AdjacentFrequencyMeasurements)mComponents[0];
    }
    
    public void setAdjacentFrequencyMeasurements(AdjacentFrequencyMeasurements adjacentFrequencyMeasurements)
    {
	mComponents[0] = adjacentFrequencyMeasurements;
    }
    
    public boolean hasAdjacentFrequencyMeasurements()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAdjacentFrequencyMeasurements()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type AdjacentFrequencyMeasurements from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class AdjacentFrequencyMeasurements extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private AdjacentFrequencyMeasurements()
	{
	    super(cFirstNumber);
	}
	
	protected AdjacentFrequencyMeasurements(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final AdjacentFrequencyMeasurements _true =
	    new AdjacentFrequencyMeasurements(0);
	private final static AdjacentFrequencyMeasurements cNamedNumbers[] = {
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
	
	public static AdjacentFrequencyMeasurements valueOf(long value)
	{
	    return (AdjacentFrequencyMeasurements)_true.lookupValue(value);
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
		"CompressedModeMeasCapability_v860ext$AdjacentFrequencyMeasurements"
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
	 * Get the type descriptor (TypeInfo) of 'this' AdjacentFrequencyMeasurements object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AdjacentFrequencyMeasurements object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AdjacentFrequencyMeasurements

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
	    "CompressedModeMeasCapability_v860ext"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapability-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CompressedModeMeasCapability_v860ext$AdjacentFrequencyMeasurements"
			)
		    ),
		    "adjacentFrequencyMeasurements",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapability_v860ext
