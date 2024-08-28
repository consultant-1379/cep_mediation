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
 * Define the ASN1 Type Common_E_RNTI_Info from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class Common_E_RNTI_Info extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public Common_E_RNTI_Info()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public Common_E_RNTI_Info(Sequence_[] elements)
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
	public Sequence_(E_RNTI starting_E_RNTI, INTEGER number_of_group, 
			INTEGER number_of_ENRTI_per_group)
	{
	    setStarting_E_RNTI(starting_E_RNTI);
	    setNumber_of_group(number_of_group);
	    setNumber_of_ENRTI_per_group(number_of_ENRTI_per_group);
	}
	
	/**
	 * Construct with components.
	 */
	public Sequence_(E_RNTI starting_E_RNTI, long number_of_group, 
			long number_of_ENRTI_per_group)
	{
	    this(starting_E_RNTI, new INTEGER(number_of_group), 
		 new INTEGER(number_of_ENRTI_per_group));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new E_RNTI();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new INTEGER();
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
		    return new E_RNTI();
		case 1:
		    return new INTEGER();
		case 2:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "starting_E_RNTI"
	public E_RNTI getStarting_E_RNTI()
	{
	    return (E_RNTI)mComponents[0];
	}
	
	public void setStarting_E_RNTI(E_RNTI starting_E_RNTI)
	{
	    mComponents[0] = starting_E_RNTI;
	}
	
	
	// Methods for field "number_of_group"
	public long getNumber_of_group()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setNumber_of_group(long number_of_group)
	{
	    setNumber_of_group(new INTEGER(number_of_group));
	}
	
	public void setNumber_of_group(INTEGER number_of_group)
	{
	    mComponents[1] = number_of_group;
	}
	
	
	// Methods for field "number_of_ENRTI_per_group"
	public long getNumber_of_ENRTI_per_group()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setNumber_of_ENRTI_per_group(long number_of_ENRTI_per_group)
	{
	    setNumber_of_ENRTI_per_group(new INTEGER(number_of_ENRTI_per_group));
	}
	
	public void setNumber_of_ENRTI_per_group(INTEGER number_of_ENRTI_per_group)
	{
	    mComponents[2] = number_of_ENRTI_per_group;
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
		"Common_E_RNTI_Info$Sequence_"
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
			    new BitStringInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "E_RNTI"
				),
				new QName (
				    "InformationElements",
				    "E-RNTI"
				),
				12314,
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(16)
				    )
				),
				new Bounds (
				    new java.lang.Long(16),
				    new java.lang.Long(16)
				),
				null
			    )
			),
			"starting-E-RNTI",
			0,
			2,
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(32),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(32)
				),
				null
			    )
			),
			"number-of-group",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(2),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(2)
				),
				null
			    )
			),
			"number-of-ENRTI-per-group",
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
			    new TagDecoderElement((short)0x8000, 0)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
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
	    "Common_E_RNTI_Info"
	),
	new QName (
	    "InformationElements",
	    "Common-E-RNTI-Info"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(256),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(256)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"Common_E_RNTI_Info$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Common_E_RNTI_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Common_E_RNTI_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Common_E_RNTI_Info
