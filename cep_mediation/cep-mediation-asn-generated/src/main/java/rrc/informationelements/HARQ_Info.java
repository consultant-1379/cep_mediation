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
 * Define the ASN1 Type HARQ_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HARQ_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public HARQ_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HARQ_Info(INTEGER numberOfProcesses, 
		    MemoryPartitioning memoryPartitioning)
    {
	setNumberOfProcesses(numberOfProcesses);
	setMemoryPartitioning(memoryPartitioning);
    }
    
    /**
     * Construct with components.
     */
    public HARQ_Info(long numberOfProcesses, 
		    MemoryPartitioning memoryPartitioning)
    {
	this(new INTEGER(numberOfProcesses), memoryPartitioning);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new MemoryPartitioning();
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
		return new MemoryPartitioning();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "numberOfProcesses"
    public long getNumberOfProcesses()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setNumberOfProcesses(long numberOfProcesses)
    {
	setNumberOfProcesses(new INTEGER(numberOfProcesses));
    }
    
    public void setNumberOfProcesses(INTEGER numberOfProcesses)
    {
	mComponents[0] = numberOfProcesses;
    }
    
    
    // Methods for field "memoryPartitioning"
    public MemoryPartitioning getMemoryPartitioning()
    {
	return (MemoryPartitioning)mComponents[1];
    }
    
    public void setMemoryPartitioning(MemoryPartitioning memoryPartitioning)
    {
	mComponents[1] = memoryPartitioning;
    }
    
    
    
    /**
     * Define the ASN1 Type MemoryPartitioning from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class MemoryPartitioning extends Choice {
	
	/**
	 * The default constructor.
	 */
	public MemoryPartitioning()
	{
	}
	
	public static final  int  implicit_chosen = 1;
	public static final  int  explicit_chosen = 2;
	
	// Methods for field "implicit"
	public static MemoryPartitioning createMemoryPartitioningWithImplicit(Null implicit)
	{
	    MemoryPartitioning __object = new MemoryPartitioning();

	    __object.setImplicit(implicit);
	    return __object;
	}
	
	public boolean hasImplicit()
	{
	    return getChosenFlag() == implicit_chosen;
	}
	
	public void setImplicit(Null implicit)
	{
	    setChosenValue(implicit);
	    setChosenFlag(implicit_chosen);
	}
	
	
	// Methods for field "explicit"
	public static MemoryPartitioning createMemoryPartitioningWithExplicit(Explicit explicit)
	{
	    MemoryPartitioning __object = new MemoryPartitioning();

	    __object.setExplicit(explicit);
	    return __object;
	}
	
	public boolean hasExplicit()
	{
	    return getChosenFlag() == explicit_chosen;
	}
	
	public void setExplicit(Explicit explicit)
	{
	    setChosenValue(explicit);
	    setChosenFlag(explicit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Explicit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Explicit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Explicit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Explicit(HARQMemorySize[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(HARQMemorySize element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(HARQMemorySize element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized HARQMemorySize get(int atIndex)
	    {
		return (HARQMemorySize)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(HARQMemorySize element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(HARQMemorySize element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return HARQMemorySize.hms800;
	    }
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final ContainerInfo c_typeinfo = new ContainerInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "HARQ_Info$MemoryPartitioning$Explicit"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
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
			"HARQMemorySize"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Explicit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Explicit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Explicit

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case implicit_chosen:
		    return new Null();
		case explicit_chosen:
		    return new Explicit();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"HARQ_Info$MemoryPartitioning"
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
			"implicit",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"HARQ_Info$MemoryPartitioning$Explicit"
			    )
			),
			"explicit",
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
	 * Get the type descriptor (TypeInfo) of 'this' MemoryPartitioning object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MemoryPartitioning object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MemoryPartitioning

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
	    "HARQ_Info"
	),
	new QName (
	    "InformationElements",
	    "HARQ-Info"
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "numberOfProcesses",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HARQ_Info$MemoryPartitioning"
			)
		    ),
		    "memoryPartitioning",
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
     * Get the type descriptor (TypeInfo) of 'this' HARQ_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HARQ_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HARQ_Info
