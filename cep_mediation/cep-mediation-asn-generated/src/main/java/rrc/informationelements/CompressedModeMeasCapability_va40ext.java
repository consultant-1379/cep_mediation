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
 * Define the ASN1 Type CompressedModeMeasCapability_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CompressedModeMeasCapability_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CompressedModeMeasCapability_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CompressedModeMeasCapability_va40ext(EnhancedInterFrequencyMeasurements enhancedInterFrequencyMeasurements, 
		    FreqSpecificCompressedMode freqSpecificCompressedMode)
    {
	setEnhancedInterFrequencyMeasurements(enhancedInterFrequencyMeasurements);
	setFreqSpecificCompressedMode(freqSpecificCompressedMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = EnhancedInterFrequencyMeasurements._true;
	mComponents[1] = FreqSpecificCompressedMode._true;
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
		return EnhancedInterFrequencyMeasurements._true;
	    case 1:
		return FreqSpecificCompressedMode._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "enhancedInterFrequencyMeasurements"
    public EnhancedInterFrequencyMeasurements getEnhancedInterFrequencyMeasurements()
    {
	return (EnhancedInterFrequencyMeasurements)mComponents[0];
    }
    
    public void setEnhancedInterFrequencyMeasurements(EnhancedInterFrequencyMeasurements enhancedInterFrequencyMeasurements)
    {
	mComponents[0] = enhancedInterFrequencyMeasurements;
    }
    
    public boolean hasEnhancedInterFrequencyMeasurements()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEnhancedInterFrequencyMeasurements()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type EnhancedInterFrequencyMeasurements from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class EnhancedInterFrequencyMeasurements extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private EnhancedInterFrequencyMeasurements()
	{
	    super(cFirstNumber);
	}
	
	protected EnhancedInterFrequencyMeasurements(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final EnhancedInterFrequencyMeasurements _true =
	    new EnhancedInterFrequencyMeasurements(0);
	private final static EnhancedInterFrequencyMeasurements cNamedNumbers[] = {
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
	
	public static EnhancedInterFrequencyMeasurements valueOf(long value)
	{
	    return (EnhancedInterFrequencyMeasurements)_true.lookupValue(value);
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
		"CompressedModeMeasCapability_va40ext$EnhancedInterFrequencyMeasurements"
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
	 * Get the type descriptor (TypeInfo) of 'this' EnhancedInterFrequencyMeasurements object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' EnhancedInterFrequencyMeasurements object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for EnhancedInterFrequencyMeasurements

    // Methods for field "freqSpecificCompressedMode"
    public FreqSpecificCompressedMode getFreqSpecificCompressedMode()
    {
	return (FreqSpecificCompressedMode)mComponents[1];
    }
    
    public void setFreqSpecificCompressedMode(FreqSpecificCompressedMode freqSpecificCompressedMode)
    {
	mComponents[1] = freqSpecificCompressedMode;
    }
    
    public boolean hasFreqSpecificCompressedMode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFreqSpecificCompressedMode()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type FreqSpecificCompressedMode from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class FreqSpecificCompressedMode extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private FreqSpecificCompressedMode()
	{
	    super(cFirstNumber);
	}
	
	protected FreqSpecificCompressedMode(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final FreqSpecificCompressedMode _true =
	    new FreqSpecificCompressedMode(0);
	private final static FreqSpecificCompressedMode cNamedNumbers[] = {
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
	
	public static FreqSpecificCompressedMode valueOf(long value)
	{
	    return (FreqSpecificCompressedMode)_true.lookupValue(value);
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
		"CompressedModeMeasCapability_va40ext$FreqSpecificCompressedMode"
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
	 * Get the type descriptor (TypeInfo) of 'this' FreqSpecificCompressedMode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FreqSpecificCompressedMode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FreqSpecificCompressedMode

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
	    "CompressedModeMeasCapability_va40ext"
	),
	new QName (
	    "InformationElements",
	    "CompressedModeMeasCapability-va40ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CompressedModeMeasCapability_va40ext$EnhancedInterFrequencyMeasurements"
			)
		    ),
		    "enhancedInterFrequencyMeasurements",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CompressedModeMeasCapability_va40ext$FreqSpecificCompressedMode"
			)
		    ),
		    "freqSpecificCompressedMode",
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
     * Get the type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CompressedModeMeasCapability_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CompressedModeMeasCapability_va40ext
