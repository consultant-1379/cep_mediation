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
 * Define the ASN1 Type GANSSMeasurementSignalList_v860ext from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class GANSSMeasurementSignalList_v860ext extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public GANSSMeasurementSignalList_v860ext()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public GANSSMeasurementSignalList_v860ext(Sequence_[] elements)
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
	public Sequence_(INTEGER ganssCodePhaseAmbiguityExt, 
			GANSSMeasurementParameters_v860ext ganssMeasurementParameters)
	{
	    setGanssCodePhaseAmbiguityExt(ganssCodePhaseAmbiguityExt);
	    setGanssMeasurementParameters(ganssMeasurementParameters);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(long ganssCodePhaseAmbiguityExt, 
			GANSSMeasurementParameters_v860ext ganssMeasurementParameters)
	{
	    this(new INTEGER(ganssCodePhaseAmbiguityExt), 
		 ganssMeasurementParameters);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(GANSSMeasurementParameters_v860ext ganssMeasurementParameters)
	{
	    setGanssMeasurementParameters(ganssMeasurementParameters);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new GANSSMeasurementParameters_v860ext();
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
		    return new GANSSMeasurementParameters_v860ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ganssCodePhaseAmbiguityExt"
	public long getGanssCodePhaseAmbiguityExt()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setGanssCodePhaseAmbiguityExt(long ganssCodePhaseAmbiguityExt)
	{
	    setGanssCodePhaseAmbiguityExt(new INTEGER(ganssCodePhaseAmbiguityExt));
	}
	
	public void setGanssCodePhaseAmbiguityExt(INTEGER ganssCodePhaseAmbiguityExt)
	{
	    mComponents[0] = ganssCodePhaseAmbiguityExt;
	}
	
	public boolean hasGanssCodePhaseAmbiguityExt()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteGanssCodePhaseAmbiguityExt()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "ganssMeasurementParameters"
	public GANSSMeasurementParameters_v860ext getGanssMeasurementParameters()
	{
	    return (GANSSMeasurementParameters_v860ext)mComponents[1];
	}
	
	public void setGanssMeasurementParameters(GANSSMeasurementParameters_v860ext ganssMeasurementParameters)
	{
	    mComponents[1] = ganssMeasurementParameters;
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
		"GANSSMeasurementSignalList_v860ext$Sequence_"
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
					new com.oss.asn1.INTEGER(32), 
					new com.oss.asn1.INTEGER(127),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(32),
				    new java.lang.Long(127)
				),
				null
			    )
			),
			"ganssCodePhaseAmbiguityExt",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GANSSMeasurementParameters_v860ext"
				),
				new QName (
				    "InformationElements",
				    "GANSSMeasurementParameters-v860ext"
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
					"GANSSMeasurementParameters_v860ext$Sequence_"
				    )
				)
			    )
			),
			"ganssMeasurementParameters",
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
	    "GANSSMeasurementSignalList_v860ext"
	),
	new QName (
	    "InformationElements",
	    "GANSSMeasurementSignalList-v860ext"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(8),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(8)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"GANSSMeasurementSignalList_v860ext$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSMeasurementSignalList_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSMeasurementSignalList_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSMeasurementSignalList_v860ext
