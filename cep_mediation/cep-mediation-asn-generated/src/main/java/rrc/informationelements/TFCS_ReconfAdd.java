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
 * Define the ASN1 Type TFCS_ReconfAdd from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TFCS_ReconfAdd extends Sequence {
    
    /**
     * The default constructor.
     */
    public TFCS_ReconfAdd()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TFCS_ReconfAdd(CtfcSize ctfcSize)
    {
	setCtfcSize(ctfcSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CtfcSize();
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
		return new CtfcSize();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ctfcSize"
    public CtfcSize getCtfcSize()
    {
	return (CtfcSize)mComponents[0];
    }
    
    public void setCtfcSize(CtfcSize ctfcSize)
    {
	mComponents[0] = ctfcSize;
    }
    
    
    
    /**
     * Define the ASN1 Type CtfcSize from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CtfcSize extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CtfcSize()
	{
	}
	
	public static final  int  ctfc2Bit_chosen = 1;
	public static final  int  ctfc4Bit_chosen = 2;
	public static final  int  ctfc6Bit_chosen = 3;
	public static final  int  ctfc8Bit_chosen = 4;
	public static final  int  ctfc12Bit_chosen = 5;
	public static final  int  ctfc16Bit_chosen = 6;
	public static final  int  ctfc24Bit_chosen = 7;
	
	// Methods for field "ctfc2Bit"
	public static CtfcSize createCtfcSizeWithCtfc2Bit(Ctfc2Bit ctfc2Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc2Bit(ctfc2Bit);
	    return __object;
	}
	
	public boolean hasCtfc2Bit()
	{
	    return getChosenFlag() == ctfc2Bit_chosen;
	}
	
	public void setCtfc2Bit(Ctfc2Bit ctfc2Bit)
	{
	    setChosenValue(ctfc2Bit);
	    setChosenFlag(ctfc2Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc2Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc2Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc2Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc2Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc2, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc2(ctfc2);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc2, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc2), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc2)
		{
		    setCtfc2(ctfc2);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc2"
		public long getCtfc2()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc2(long ctfc2)
		{
		    setCtfc2(new INTEGER(ctfc2));
		}
		
		public void setCtfc2(INTEGER ctfc2)
		{
		    mComponents[0] = ctfc2;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc2Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(3),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(3)
					),
					null
				    )
				),
				"ctfc2",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8000
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc2Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc2Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc2Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc2Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc2Bit

	// Methods for field "ctfc4Bit"
	public static CtfcSize createCtfcSizeWithCtfc4Bit(Ctfc4Bit ctfc4Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc4Bit(ctfc4Bit);
	    return __object;
	}
	
	public boolean hasCtfc4Bit()
	{
	    return getChosenFlag() == ctfc4Bit_chosen;
	}
	
	public void setCtfc4Bit(Ctfc4Bit ctfc4Bit)
	{
	    setChosenValue(ctfc4Bit);
	    setChosenFlag(ctfc4Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc4Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc4Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc4Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc4Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc4, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc4(ctfc4);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc4, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc4), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc4)
		{
		    setCtfc4(ctfc4);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc4"
		public long getCtfc4()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc4(long ctfc4)
		{
		    setCtfc4(new INTEGER(ctfc4));
		}
		
		public void setCtfc4(INTEGER ctfc4)
		{
		    mComponents[0] = ctfc4;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc4Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(15),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(15)
					),
					null
				    )
				),
				"ctfc4",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc4Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc4Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc4Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc4Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc4Bit

	// Methods for field "ctfc6Bit"
	public static CtfcSize createCtfcSizeWithCtfc6Bit(Ctfc6Bit ctfc6Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc6Bit(ctfc6Bit);
	    return __object;
	}
	
	public boolean hasCtfc6Bit()
	{
	    return getChosenFlag() == ctfc6Bit_chosen;
	}
	
	public void setCtfc6Bit(Ctfc6Bit ctfc6Bit)
	{
	    setChosenValue(ctfc6Bit);
	    setChosenFlag(ctfc6Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc6Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc6Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc6Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc6Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc6, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc6(ctfc6);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc6, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc6), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc6)
		{
		    setCtfc6(ctfc6);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc6"
		public long getCtfc6()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc6(long ctfc6)
		{
		    setCtfc6(new INTEGER(ctfc6));
		}
		
		public void setCtfc6(INTEGER ctfc6)
		{
		    mComponents[0] = ctfc6;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc6Bit$Sequence_"
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
				"ctfc6",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8002
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc6Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc6Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc6Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc6Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc6Bit

	// Methods for field "ctfc8Bit"
	public static CtfcSize createCtfcSizeWithCtfc8Bit(Ctfc8Bit ctfc8Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc8Bit(ctfc8Bit);
	    return __object;
	}
	
	public boolean hasCtfc8Bit()
	{
	    return getChosenFlag() == ctfc8Bit_chosen;
	}
	
	public void setCtfc8Bit(Ctfc8Bit ctfc8Bit)
	{
	    setChosenValue(ctfc8Bit);
	    setChosenFlag(ctfc8Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc8Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc8Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc8Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc8Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc8, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc8(ctfc8);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc8, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc8), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc8)
		{
		    setCtfc8(ctfc8);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc8"
		public long getCtfc8()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc8(long ctfc8)
		{
		    setCtfc8(new INTEGER(ctfc8));
		}
		
		public void setCtfc8(INTEGER ctfc8)
		{
		    mComponents[0] = ctfc8;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc8Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(255),
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
				"ctfc8",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8003
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc8Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc8Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc8Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc8Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc8Bit

	// Methods for field "ctfc12Bit"
	public static CtfcSize createCtfcSizeWithCtfc12Bit(Ctfc12Bit ctfc12Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc12Bit(ctfc12Bit);
	    return __object;
	}
	
	public boolean hasCtfc12Bit()
	{
	    return getChosenFlag() == ctfc12Bit_chosen;
	}
	
	public void setCtfc12Bit(Ctfc12Bit ctfc12Bit)
	{
	    setChosenValue(ctfc12Bit);
	    setChosenFlag(ctfc12Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc12Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc12Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc12Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc12Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc12, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc12(ctfc12);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc12, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc12), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc12)
		{
		    setCtfc12(ctfc12);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc12"
		public long getCtfc12()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc12(long ctfc12)
		{
		    setCtfc12(new INTEGER(ctfc12));
		}
		
		public void setCtfc12(INTEGER ctfc12)
		{
		    mComponents[0] = ctfc12;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc12Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(4095),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(4095)
					),
					null
				    )
				),
				"ctfc12",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8004
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc12Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc12Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc12Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc12Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc12Bit

	// Methods for field "ctfc16Bit"
	public static CtfcSize createCtfcSizeWithCtfc16Bit(Ctfc16Bit ctfc16Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc16Bit(ctfc16Bit);
	    return __object;
	}
	
	public boolean hasCtfc16Bit()
	{
	    return getChosenFlag() == ctfc16Bit_chosen;
	}
	
	public void setCtfc16Bit(Ctfc16Bit ctfc16Bit)
	{
	    setChosenValue(ctfc16Bit);
	    setChosenFlag(ctfc16Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc16Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc16Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc16Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc16Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc16, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc16(ctfc16);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc16, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc16), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc16)
		{
		    setCtfc16(ctfc16);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc16"
		public long getCtfc16()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc16(long ctfc16)
		{
		    setCtfc16(new INTEGER(ctfc16));
		}
		
		public void setCtfc16(INTEGER ctfc16)
		{
		    mComponents[0] = ctfc16;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc16Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(65535),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(65535)
					),
					null
				    )
				),
				"ctfc16",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8005
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc16Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc16Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc16Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc16Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc16Bit

	// Methods for field "ctfc24Bit"
	public static CtfcSize createCtfcSizeWithCtfc24Bit(Ctfc24Bit ctfc24Bit)
	{
	    CtfcSize __object = new CtfcSize();

	    __object.setCtfc24Bit(ctfc24Bit);
	    return __object;
	}
	
	public boolean hasCtfc24Bit()
	{
	    return getChosenFlag() == ctfc24Bit_chosen;
	}
	
	public void setCtfc24Bit(Ctfc24Bit ctfc24Bit)
	{
	    setChosenValue(ctfc24Bit);
	    setChosenFlag(ctfc24Bit_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Ctfc24Bit from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Ctfc24Bit extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Ctfc24Bit()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Ctfc24Bit(Sequence_[] elements)
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
		public Sequence_(INTEGER ctfc24, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    setCtfc24(ctfc24);
		    setPowerOffsetInformation(powerOffsetInformation);
		}
		
		/**
		 * Construct with components.
		 */
		public Sequence_(long ctfc24, 
				PowerOffsetInformation powerOffsetInformation)
		{
		    this(new INTEGER(ctfc24), powerOffsetInformation);
		}
		
		/**
		 * Construct with required components.
		 */
		public Sequence_(long ctfc24)
		{
		    setCtfc24(ctfc24);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new INTEGER();
		    mComponents[1] = new PowerOffsetInformation();
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
			    return new PowerOffsetInformation();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "ctfc24"
		public long getCtfc24()
		{
		    return ((INTEGER)mComponents[0]).longValue();
		}
		
		public void setCtfc24(long ctfc24)
		{
		    setCtfc24(new INTEGER(ctfc24));
		}
		
		public void setCtfc24(INTEGER ctfc24)
		{
		    mComponents[0] = ctfc24;
		}
		
		
		// Methods for field "powerOffsetInformation"
		public PowerOffsetInformation getPowerOffsetInformation()
		{
		    return (PowerOffsetInformation)mComponents[1];
		}
		
		public void setPowerOffsetInformation(PowerOffsetInformation powerOffsetInformation)
		{
		    mComponents[1] = powerOffsetInformation;
		}
		
		public boolean hasPowerOffsetInformation()
		{
		    return componentIsPresent(1);
		}
		
		public void deletePowerOffsetInformation()
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
			"TFCS_ReconfAdd$CtfcSize$Ctfc24Bit$Sequence_"
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
						new com.oss.asn1.INTEGER(16777215),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(16777215)
					),
					null
				    )
				),
				"ctfc24",
				0,
				2,
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
					    "PowerOffsetInformation"
					),
					new QName (
					    "InformationElements",
					    "PowerOffsetInformation"
					),
					12314,
					null,
					new FieldsRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0,
					new TagDecodersRef (
					    new QName (
						"rrc.informationelements",
						"PowerOffsetInformation"
					    )
					),
					0
				    )
				),
				"powerOffsetInformation",
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
			(short)0x8006
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "TFCS_ReconfAdd$CtfcSize$Ctfc24Bit"
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
			    new com.oss.asn1.INTEGER(1024),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(1),
		    new java.lang.Long(1024)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"TFCS_ReconfAdd$CtfcSize$Ctfc24Bit$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Ctfc24Bit object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Ctfc24Bit object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Ctfc24Bit

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case ctfc2Bit_chosen:
		    return new Ctfc2Bit();
		case ctfc4Bit_chosen:
		    return new Ctfc4Bit();
		case ctfc6Bit_chosen:
		    return new Ctfc6Bit();
		case ctfc8Bit_chosen:
		    return new Ctfc8Bit();
		case ctfc12Bit_chosen:
		    return new Ctfc12Bit();
		case ctfc16Bit_chosen:
		    return new Ctfc16Bit();
		case ctfc24Bit_chosen:
		    return new Ctfc24Bit();
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
		"TFCS_ReconfAdd$CtfcSize"
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
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc2Bit"
			    )
			),
			"ctfc2Bit",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc4Bit"
			    )
			),
			"ctfc4Bit",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc6Bit"
			    )
			),
			"ctfc6Bit",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc8Bit"
			    )
			),
			"ctfc8Bit",
			3,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc12Bit"
			    )
			),
			"ctfc12Bit",
			4,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc16Bit"
			    )
			),
			"ctfc16Bit",
			5,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"TFCS_ReconfAdd$CtfcSize$Ctfc24Bit"
			    )
			),
			"ctfc24Bit",
			6,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2),
		    new TagDecoderElement((short)0x8003, 3),
		    new TagDecoderElement((short)0x8004, 4),
		    new TagDecoderElement((short)0x8005, 5),
		    new TagDecoderElement((short)0x8006, 6)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' CtfcSize object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CtfcSize object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CtfcSize

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
	    "TFCS_ReconfAdd"
	),
	new QName (
	    "InformationElements",
	    "TFCS-ReconfAdd"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TFCS_ReconfAdd$CtfcSize"
			)
		    ),
		    "ctfcSize",
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
     * Get the type descriptor (TypeInfo) of 'this' TFCS_ReconfAdd object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TFCS_ReconfAdd object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TFCS_ReconfAdd
