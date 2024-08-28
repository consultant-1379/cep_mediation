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
 * Define the ASN1 Type MIMO_PilotConfiguration from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MIMO_PilotConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public MIMO_PilotConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MIMO_PilotConfiguration(SecondCPICH_Pattern secondCPICH_Pattern)
    {
	setSecondCPICH_Pattern(secondCPICH_Pattern);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondCPICH_Pattern();
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
		return new SecondCPICH_Pattern();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "secondCPICH_Pattern"
    public SecondCPICH_Pattern getSecondCPICH_Pattern()
    {
	return (SecondCPICH_Pattern)mComponents[0];
    }
    
    public void setSecondCPICH_Pattern(SecondCPICH_Pattern secondCPICH_Pattern)
    {
	mComponents[0] = secondCPICH_Pattern;
    }
    
    
    
    /**
     * Define the ASN1 Type SecondCPICH_Pattern from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class SecondCPICH_Pattern extends Choice {
	
	/**
	 * The default constructor.
	 */
	public SecondCPICH_Pattern()
	{
	}
	
	public static final  int  normalPattern_chosen = 1;
	public static final  int  diversityPattern_chosen = 2;
	
	// Methods for field "normalPattern"
	public static SecondCPICH_Pattern createSecondCPICH_PatternWithNormalPattern(Null normalPattern)
	{
	    SecondCPICH_Pattern __object = new SecondCPICH_Pattern();

	    __object.setNormalPattern(normalPattern);
	    return __object;
	}
	
	public boolean hasNormalPattern()
	{
	    return getChosenFlag() == normalPattern_chosen;
	}
	
	public void setNormalPattern(Null normalPattern)
	{
	    setChosenValue(normalPattern);
	    setChosenFlag(normalPattern_chosen);
	}
	
	
	// Methods for field "diversityPattern"
	public static SecondCPICH_Pattern createSecondCPICH_PatternWithDiversityPattern(DiversityPattern diversityPattern)
	{
	    SecondCPICH_Pattern __object = new SecondCPICH_Pattern();

	    __object.setDiversityPattern(diversityPattern);
	    return __object;
	}
	
	public boolean hasDiversityPattern()
	{
	    return getChosenFlag() == diversityPattern_chosen;
	}
	
	public void setDiversityPattern(DiversityPattern diversityPattern)
	{
	    setChosenValue(diversityPattern);
	    setChosenFlag(diversityPattern_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type DiversityPattern from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class DiversityPattern extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public DiversityPattern()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public DiversityPattern(ChannelisationCode256 channelisationCode)
	    {
		setChannelisationCode(channelisationCode);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new ChannelisationCode256();
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
			return new ChannelisationCode256();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "channelisationCode"
	    public ChannelisationCode256 getChannelisationCode()
	    {
		return (ChannelisationCode256)mComponents[0];
	    }
	    
	    public void setChannelisationCode(ChannelisationCode256 channelisationCode)
	    {
		mComponents[0] = channelisationCode;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "MIMO_PilotConfiguration$SecondCPICH_Pattern$DiversityPattern"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		12314,
		null,
		new Fields (
		    new SequenceFieldInfo[] {
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"ChannelisationCode256"
				    ),
				    new QName (
					"InformationElements",
					"ChannelisationCode256"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new ChannelisationCode256(0), 
					    new ChannelisationCode256(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "channelisationCode",
			    0,
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
				new TagDecoderElement((short)0x8000, 0)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' DiversityPattern object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' DiversityPattern object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for DiversityPattern

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case normalPattern_chosen:
		    return new Null();
		case diversityPattern_chosen:
		    return new DiversityPattern();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MIMO_PilotConfiguration$SecondCPICH_Pattern"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"normalPattern",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"MIMO_PilotConfiguration$SecondCPICH_Pattern$DiversityPattern"
			    )
			),
			"diversityPattern",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SecondCPICH_Pattern object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SecondCPICH_Pattern object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SecondCPICH_Pattern

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
	    "MIMO_PilotConfiguration"
	),
	new QName (
	    "InformationElements",
	    "MIMO-PilotConfiguration"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MIMO_PilotConfiguration$SecondCPICH_Pattern"
			)
		    ),
		    "secondCPICH-Pattern",
		    0,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MIMO_PilotConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MIMO_PilotConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MIMO_PilotConfiguration
