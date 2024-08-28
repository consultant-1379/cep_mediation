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
 * Define the ASN1 Type GANSSMeasurementSignalList from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class GANSSMeasurementSignalList extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public GANSSMeasurementSignalList()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public GANSSMeasurementSignalList(Sequence_[] elements)
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
	public Sequence_(GANSS_Signal_Id ganssSignalId, 
			INTEGER ganssCodePhaseAmbiguity, 
			GANSSMeasurementParameters ganssMeasurementParameters)
	{
	    setGanssSignalId(ganssSignalId);
	    setGanssCodePhaseAmbiguity(ganssCodePhaseAmbiguity);
	    setGanssMeasurementParameters(ganssMeasurementParameters);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(GANSS_Signal_Id ganssSignalId, 
			long ganssCodePhaseAmbiguity, 
			GANSSMeasurementParameters ganssMeasurementParameters)
	{
	    this(ganssSignalId, new INTEGER(ganssCodePhaseAmbiguity), 
		 ganssMeasurementParameters);
	}
	
	/**
	 * Construct with required components.
	 */
	public Sequence_(GANSSMeasurementParameters ganssMeasurementParameters)
	{
	    setGanssMeasurementParameters(ganssMeasurementParameters);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new GANSS_Signal_Id();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new GANSSMeasurementParameters();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[3];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new GANSS_Signal_Id();
		case 1:
		    return new INTEGER();
		case 2:
		    return new GANSSMeasurementParameters();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "ganssSignalId"
	public GANSS_Signal_Id getGanssSignalId()
	{
	    return (GANSS_Signal_Id)mComponents[0];
	}
	
	public void setGanssSignalId(GANSS_Signal_Id ganssSignalId)
	{
	    mComponents[0] = ganssSignalId;
	}
	
	public boolean hasGanssSignalId()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteGanssSignalId()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "ganssCodePhaseAmbiguity"
	public long getGanssCodePhaseAmbiguity()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setGanssCodePhaseAmbiguity(long ganssCodePhaseAmbiguity)
	{
	    setGanssCodePhaseAmbiguity(new INTEGER(ganssCodePhaseAmbiguity));
	}
	
	public void setGanssCodePhaseAmbiguity(INTEGER ganssCodePhaseAmbiguity)
	{
	    mComponents[1] = ganssCodePhaseAmbiguity;
	}
	
	public boolean hasGanssCodePhaseAmbiguity()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteGanssCodePhaseAmbiguity()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "ganssMeasurementParameters"
	public GANSSMeasurementParameters getGanssMeasurementParameters()
	{
	    return (GANSSMeasurementParameters)mComponents[2];
	}
	
	public void setGanssMeasurementParameters(GANSSMeasurementParameters ganssMeasurementParameters)
	{
	    mComponents[2] = ganssMeasurementParameters;
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
		"GANSSMeasurementSignalList$Sequence_"
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
				    "GANSS_Signal_Id"
				),
				new QName (
				    "InformationElements",
				    "GANSS-Signal-Id"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new GANSS_Signal_Id(0), 
					new GANSS_Signal_Id(7),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(7)
				),
				null
			    )
			),
			"ganssSignalId",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
					new com.oss.asn1.INTEGER(31),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(31)
				),
				null
			    )
			),
			"ganssCodePhaseAmbiguity",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new ContainerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "GANSSMeasurementParameters"
				),
				new QName (
				    "InformationElements",
				    "GANSSMeasurementParameters"
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
					"GANSSMeasurementParameters$Sequence_"
				    )
				)
			    )
			),
			"ganssMeasurementParameters",
			2,
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
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2)
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
	    "GANSSMeasurementSignalList"
	),
	new QName (
	    "InformationElements",
	    "GANSSMeasurementSignalList"
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
		"GANSSMeasurementSignalList$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GANSSMeasurementSignalList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GANSSMeasurementSignalList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GANSSMeasurementSignalList
