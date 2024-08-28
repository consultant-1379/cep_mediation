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
 * Define the ASN1 Type UE_Positioning_GANSS_RealTimeIntegrity from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class UE_Positioning_GANSS_RealTimeIntegrity extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public UE_Positioning_GANSS_RealTimeIntegrity()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public UE_Positioning_GANSS_RealTimeIntegrity(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Sequence_ extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Sequence_()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Sequence_(INTEGER bad_ganss_satId, 
			BitString bad_ganss_signalId)
	{
	    setBad_ganss_satId(bad_ganss_satId);
	    setBad_ganss_signalId(bad_ganss_signalId);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(long bad_ganss_satId, BitString bad_ganss_signalId)
	{
	    this(new INTEGER(bad_ganss_satId), bad_ganss_signalId);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(long bad_ganss_satId)
	{
	    setBad_ganss_satId(bad_ganss_satId);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new BitString();
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
		    return new INTEGER();
		case 1:
		    return new BitString();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "bad_ganss_satId"
	public long getBad_ganss_satId()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setBad_ganss_satId(long bad_ganss_satId)
	{
	    setBad_ganss_satId(new INTEGER(bad_ganss_satId));
	}
	
	public void setBad_ganss_satId(INTEGER bad_ganss_satId)
	{
	    mComponents[0] = bad_ganss_satId;
	}
	
	
	// Methods for field "bad_ganss_signalId"
	public BitString getBad_ganss_signalId()
	{
	    return (BitString)mComponents[1];
	}
	
	public void setBad_ganss_signalId(BitString bad_ganss_signalId)
	{
	    mComponents[1] = bad_ganss_signalId;
	}
	
	public boolean hasBad_ganss_signalId()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteBad_ganss_signalId()
	{
	    setComponentAbsent(1);
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
		"UE_Positioning_GANSS_RealTimeIntegrity$Sequence_"
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
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(63),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(63)
				),
				null
			    )
			),
			"bad-ganss-satId",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "BitString"
				),
				new QName (
				    "builtin",
				    "BIT STRING"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(8)
				    )
				),
				new Bounds (
				    new java.lang.Long(8),
				    new java.lang.Long(8)
				),
				null
			    )
			),
			"bad-ganss-signalId",
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
			    new TagDecoderElement((short)0x8000, 0)
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
	 * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sequence_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Sequence_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Sequence_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Sequence_ get(int atIndex)
    {
	return (Sequence_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Sequence_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Sequence_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new Sequence_();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "UE_Positioning_GANSS_RealTimeIntegrity"
	),
	new QName (
	    "InformationElements",
	    "UE-Positioning-GANSS-RealTimeIntegrity"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(64),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(64)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"UE_Positioning_GANSS_RealTimeIntegrity$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_RealTimeIntegrity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_Positioning_GANSS_RealTimeIntegrity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_Positioning_GANSS_RealTimeIntegrity
