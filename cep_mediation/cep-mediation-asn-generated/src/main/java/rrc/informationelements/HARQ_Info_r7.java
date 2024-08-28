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
 * Define the ASN1 Type HARQ_Info_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HARQ_Info_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HARQ_Info_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HARQ_Info_r7(NumberOfProcesses numberOfProcesses, 
		    MemoryPartitioning memoryPartitioning)
    {
	setNumberOfProcesses(numberOfProcesses);
	setMemoryPartitioning(memoryPartitioning);
    }
    
    public void initComponents()
    {
	mComponents[0] = NumberOfProcesses.n1;
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
		return NumberOfProcesses.n1;
	    case 1:
		return new MemoryPartitioning();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "numberOfProcesses"
    public NumberOfProcesses getNumberOfProcesses()
    {
	return (NumberOfProcesses)mComponents[0];
    }
    
    public void setNumberOfProcesses(NumberOfProcesses numberOfProcesses)
    {
	mComponents[0] = numberOfProcesses;
    }
    
    
    
    /**
     * Define the ASN1 Type NumberOfProcesses from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class NumberOfProcesses extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private NumberOfProcesses()
	{
	    super(cFirstNumber);
	}
	
	protected NumberOfProcesses(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final NumberOfProcesses n1 =
	    new NumberOfProcesses(0);
	public static final NumberOfProcesses n2 =
	    new NumberOfProcesses(1);
	public static final NumberOfProcesses n3 =
	    new NumberOfProcesses(2);
	public static final NumberOfProcesses n4 =
	    new NumberOfProcesses(3);
	public static final NumberOfProcesses n5 =
	    new NumberOfProcesses(4);
	public static final NumberOfProcesses n6 =
	    new NumberOfProcesses(5);
	public static final NumberOfProcesses n7 =
	    new NumberOfProcesses(6);
	public static final NumberOfProcesses n8 =
	    new NumberOfProcesses(7);
	public static final NumberOfProcesses n12 =
	    new NumberOfProcesses(8);
	public static final NumberOfProcesses n14 =
	    new NumberOfProcesses(9);
	public static final NumberOfProcesses n16 =
	    new NumberOfProcesses(10);
	private final static NumberOfProcesses cNamedNumbers[] = {
	     n1, 
	     n2, 
	     n3, 
	     n4, 
	     n5, 
	     n6, 
	     n7, 
	     n8, 
	     n12, 
	     n14, 
	     n16
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
	
	public static NumberOfProcesses valueOf(long value)
	{
	    return (NumberOfProcesses)n1.lookupValue(value);
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
		"HARQ_Info_r7$NumberOfProcesses"
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
			"n1",
			0
		    ),
		    new MemberListElement (
			"n2",
			1
		    ),
		    new MemberListElement (
			"n3",
			2
		    ),
		    new MemberListElement (
			"n4",
			3
		    ),
		    new MemberListElement (
			"n5",
			4
		    ),
		    new MemberListElement (
			"n6",
			5
		    ),
		    new MemberListElement (
			"n7",
			6
		    ),
		    new MemberListElement (
			"n8",
			7
		    ),
		    new MemberListElement (
			"n12",
			8
		    ),
		    new MemberListElement (
			"n14",
			9
		    ),
		    new MemberListElement (
			"n16",
			10
		    )
		}
	    ),
	    0,
	    n1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NumberOfProcesses object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NumberOfProcesses object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NumberOfProcesses

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
	 * @see Sequence
	 */
	public static class Explicit extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Explicit()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Explicit(MemorySize memorySize, 
			    AdditionalMemorySizesForMIMO additionalMemorySizesForMIMO)
	    {
		setMemorySize(memorySize);
		setAdditionalMemorySizesForMIMO(additionalMemorySizesForMIMO);
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Explicit(MemorySize memorySize)
	    {
		setMemorySize(memorySize);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new MemorySize();
		mComponents[1] = new AdditionalMemorySizesForMIMO();
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
			return new MemorySize();
		    case 1:
			return new AdditionalMemorySizesForMIMO();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "memorySize"
	    public MemorySize getMemorySize()
	    {
		return (MemorySize)mComponents[0];
	    }
	    
	    public void setMemorySize(MemorySize memorySize)
	    {
		mComponents[0] = memorySize;
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type MemorySize from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class MemorySize extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public MemorySize()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public MemorySize(HARQMemorySize[] elements)
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
			    (short)0x8000
			}
		    ),
		    new QName (
			"rrc.informationelements",
			"HARQ_Info_r7$MemoryPartitioning$Explicit$MemorySize"
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
		 * Get the type descriptor (TypeInfo) of 'this' MemorySize object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' MemorySize object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for MemorySize

	    // Methods for field "additionalMemorySizesForMIMO"
	    public AdditionalMemorySizesForMIMO getAdditionalMemorySizesForMIMO()
	    {
		return (AdditionalMemorySizesForMIMO)mComponents[1];
	    }
	    
	    public void setAdditionalMemorySizesForMIMO(AdditionalMemorySizesForMIMO additionalMemorySizesForMIMO)
	    {
		mComponents[1] = additionalMemorySizesForMIMO;
	    }
	    
	    public boolean hasAdditionalMemorySizesForMIMO()
	    {
		return componentIsPresent(1);
	    }
	    
	    public void deleteAdditionalMemorySizesForMIMO()
	    {
		setComponentAbsent(1);
	    }
	    
	    
	    
	    /**
	     * Define the ASN1 Type AdditionalMemorySizesForMIMO from ASN1 Module InformationElements.
	     * @see SequenceOf
	     */
	    public static class AdditionalMemorySizesForMIMO extends SequenceOf {
		
		/**
		 * The default constructor.
		 */
		public AdditionalMemorySizesForMIMO()
		{
		}
		
		/**
		 * Construct from an array of components.
		 */
		public AdditionalMemorySizesForMIMO(HARQMemorySize[] elements)
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
			"HARQ_Info_r7$MemoryPartitioning$Explicit$AdditionalMemorySizesForMIMO"
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
		 * Get the type descriptor (TypeInfo) of 'this' AdditionalMemorySizesForMIMO object.
		 */
		public TypeInfo getTypeInfo()
		{
		    return c_typeinfo;
		}
		
		/**
		 * Get the static type descriptor (TypeInfo) of 'this' AdditionalMemorySizesForMIMO object.
		 */
		public static TypeInfo getStaticTypeInfo()
		{
		    return c_typeinfo;
		}
		
	    } // End class definition for AdditionalMemorySizesForMIMO

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
		    "HARQ_Info_r7$MemoryPartitioning$Explicit"
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
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7$MemoryPartitioning$Explicit$MemorySize"
				)
			    ),
			    "memorySize",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "HARQ_Info_r7$MemoryPartitioning$Explicit$AdditionalMemorySizesForMIMO"
				)
			    ),
			    "additionalMemorySizesForMIMO",
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
		"HARQ_Info_r7$MemoryPartitioning"
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
				"HARQ_Info_r7$MemoryPartitioning$Explicit"
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
	    "HARQ_Info_r7"
	),
	new QName (
	    "InformationElements",
	    "HARQ-Info-r7"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HARQ_Info_r7$NumberOfProcesses"
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
			    "HARQ_Info_r7$MemoryPartitioning"
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
     * Get the type descriptor (TypeInfo) of 'this' HARQ_Info_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HARQ_Info_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HARQ_Info_r7
