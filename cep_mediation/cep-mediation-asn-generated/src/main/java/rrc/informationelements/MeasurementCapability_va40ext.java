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
 * Define the ASN1 Type MeasurementCapability_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementCapability_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementCapability_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementCapability_va40ext(InterFrequencyDetectedSetMeasurements interFrequencyDetectedSetMeasurements, 
		    CompressedModeMeasCapability_va40ext downlinkCompressedMode)
    {
	setInterFrequencyDetectedSetMeasurements(interFrequencyDetectedSetMeasurements);
	setDownlinkCompressedMode(downlinkCompressedMode);
    }
    
    /**
     * Construct with required components.
     */
    public MeasurementCapability_va40ext(CompressedModeMeasCapability_va40ext downlinkCompressedMode)
    {
	setDownlinkCompressedMode(downlinkCompressedMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = InterFrequencyDetectedSetMeasurements._true;
	mComponents[1] = new CompressedModeMeasCapability_va40ext();
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
		return InterFrequencyDetectedSetMeasurements._true;
	    case 1:
		return new CompressedModeMeasCapability_va40ext();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "interFrequencyDetectedSetMeasurements"
    public InterFrequencyDetectedSetMeasurements getInterFrequencyDetectedSetMeasurements()
    {
	return (InterFrequencyDetectedSetMeasurements)mComponents[0];
    }
    
    public void setInterFrequencyDetectedSetMeasurements(InterFrequencyDetectedSetMeasurements interFrequencyDetectedSetMeasurements)
    {
	mComponents[0] = interFrequencyDetectedSetMeasurements;
    }
    
    public boolean hasInterFrequencyDetectedSetMeasurements()
    {
	return componentIsPresent(0);
    }
    
    public void deleteInterFrequencyDetectedSetMeasurements()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type InterFrequencyDetectedSetMeasurements from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class InterFrequencyDetectedSetMeasurements extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private InterFrequencyDetectedSetMeasurements()
	{
	    super(cFirstNumber);
	}
	
	protected InterFrequencyDetectedSetMeasurements(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final InterFrequencyDetectedSetMeasurements _true =
	    new InterFrequencyDetectedSetMeasurements(0);
	private final static InterFrequencyDetectedSetMeasurements cNamedNumbers[] = {
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
	
	public static InterFrequencyDetectedSetMeasurements valueOf(long value)
	{
	    return (InterFrequencyDetectedSetMeasurements)_true.lookupValue(value);
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
		"MeasurementCapability_va40ext$InterFrequencyDetectedSetMeasurements"
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
	 * Get the type descriptor (TypeInfo) of 'this' InterFrequencyDetectedSetMeasurements object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' InterFrequencyDetectedSetMeasurements object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for InterFrequencyDetectedSetMeasurements

    // Methods for field "downlinkCompressedMode"
    public CompressedModeMeasCapability_va40ext getDownlinkCompressedMode()
    {
	return (CompressedModeMeasCapability_va40ext)mComponents[1];
    }
    
    public void setDownlinkCompressedMode(CompressedModeMeasCapability_va40ext downlinkCompressedMode)
    {
	mComponents[1] = downlinkCompressedMode;
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
	    "MeasurementCapability_va40ext"
	),
	new QName (
	    "InformationElements",
	    "MeasurementCapability-va40ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementCapability_va40ext$InterFrequencyDetectedSetMeasurements"
			)
		    ),
		    "interFrequencyDetectedSetMeasurements",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_va40ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "CompressedModeMeasCapability_va40ext"
				)
			    ),
			    0
			)
		    ),
		    "downlinkCompressedMode",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementCapability_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementCapability_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementCapability_va40ext
