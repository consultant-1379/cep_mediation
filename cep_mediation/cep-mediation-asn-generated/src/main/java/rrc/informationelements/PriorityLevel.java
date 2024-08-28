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
 * Define the ASN1 Type PriorityLevel from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PriorityLevel extends Sequence {
    
    /**
     * The default constructor.
     */
    public PriorityLevel()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PriorityLevel(INTEGER priority, 
		    RadioAccessTechnology radioAccessTechnology)
    {
	setPriority(priority);
	setRadioAccessTechnology(radioAccessTechnology);
    }
    
    /**
     * Construct with components.
     */
    public PriorityLevel(long priority, 
		    RadioAccessTechnology radioAccessTechnology)
    {
	this(new INTEGER(priority), radioAccessTechnology);
    }
    
    /**
     * Construct with required components.
     */
    public PriorityLevel(RadioAccessTechnology radioAccessTechnology)
    {
	setRadioAccessTechnology(radioAccessTechnology);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new RadioAccessTechnology();
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
		return new RadioAccessTechnology();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "priority"
    public long getPriority()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setPriority(long priority)
    {
	setPriority(new INTEGER(priority));
    }
    
    public void setPriority(INTEGER priority)
    {
	mComponents[0] = priority;
    }
    
    public boolean hasPriority()
    {
	return componentIsPresent(0);
    }
    
    public void deletePriority()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "radioAccessTechnology"
    public RadioAccessTechnology getRadioAccessTechnology()
    {
	return (RadioAccessTechnology)mComponents[1];
    }
    
    public void setRadioAccessTechnology(RadioAccessTechnology radioAccessTechnology)
    {
	mComponents[1] = radioAccessTechnology;
    }
    
    
    
    /**
     * Define the ASN1 Type RadioAccessTechnology from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class RadioAccessTechnology extends Choice {
	
	/**
	 * The default constructor.
	 */
	public RadioAccessTechnology()
	{
	}
	
	public static final  int  utraFDD_chosen = 1;
	public static final  int  utraTDD_chosen = 2;
	public static final  int  eutra_chosen = 3;
	public static final  int  gsm_chosen = 4;
	
	// Methods for field "utraFDD"
	public static RadioAccessTechnology createRadioAccessTechnologyWithUtraFDD(UtraFDD utraFDD)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setUtraFDD(utraFDD);
	    return __object;
	}
	
	public boolean hasUtraFDD()
	{
	    return getChosenFlag() == utraFDD_chosen;
	}
	
	public void setUtraFDD(UtraFDD utraFDD)
	{
	    setChosenValue(utraFDD);
	    setChosenFlag(utraFDD_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UtraFDD from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class UtraFDD extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public UtraFDD()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public UtraFDD(Sequence_[] elements)
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
		public Sequence_(UARFCN uarfcn)
		{
		    setUarfcn(uarfcn);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UARFCN();
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
			    return new UARFCN();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uarfcn"
		public UARFCN getUarfcn()
		{
		    return (UARFCN)mComponents[0];
		}
		
		public void setUarfcn(UARFCN uarfcn)
		{
		    mComponents[0] = uarfcn;
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
			"PriorityLevel$RadioAccessTechnology$UtraFDD$Sequence_"
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
					    "UARFCN"
					),
					new QName (
					    "InformationElements",
					    "UARFCN"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new UARFCN(0), 
						new UARFCN(16383),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(16383)
					),
					null
				    )
				),
				"uarfcn",
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
		    "PriorityLevel$RadioAccessTechnology$UtraFDD"
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
			"PriorityLevel$RadioAccessTechnology$UtraFDD$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UtraFDD object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UtraFDD object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UtraFDD

	// Methods for field "utraTDD"
	public static RadioAccessTechnology createRadioAccessTechnologyWithUtraTDD(UtraTDD utraTDD)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setUtraTDD(utraTDD);
	    return __object;
	}
	
	public boolean hasUtraTDD()
	{
	    return getChosenFlag() == utraTDD_chosen;
	}
	
	public void setUtraTDD(UtraTDD utraTDD)
	{
	    setChosenValue(utraTDD);
	    setChosenFlag(utraTDD_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type UtraTDD from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class UtraTDD extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public UtraTDD()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public UtraTDD(Sequence_[] elements)
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
		public Sequence_(UARFCN uarfcn)
		{
		    setUarfcn(uarfcn);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new UARFCN();
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
			    return new UARFCN();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "uarfcn"
		public UARFCN getUarfcn()
		{
		    return (UARFCN)mComponents[0];
		}
		
		public void setUarfcn(UARFCN uarfcn)
		{
		    mComponents[0] = uarfcn;
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
			"PriorityLevel$RadioAccessTechnology$UtraTDD$Sequence_"
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
					    "UARFCN"
					),
					new QName (
					    "InformationElements",
					    "UARFCN"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new UARFCN(0), 
						new UARFCN(16383),
						0
					    )
					),
					new Bounds (
					    new java.lang.Long(0),
					    new java.lang.Long(16383)
					),
					null
				    )
				),
				"uarfcn",
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
		    "PriorityLevel$RadioAccessTechnology$UtraTDD"
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
			"PriorityLevel$RadioAccessTechnology$UtraTDD$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' UtraTDD object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' UtraTDD object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for UtraTDD

	// Methods for field "eutra"
	public static RadioAccessTechnology createRadioAccessTechnologyWithEutra(Eutra eutra)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setEutra(eutra);
	    return __object;
	}
	
	public boolean hasEutra()
	{
	    return getChosenFlag() == eutra_chosen;
	}
	
	public void setEutra(Eutra eutra)
	{
	    setChosenValue(eutra);
	    setChosenFlag(eutra_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Eutra from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class Eutra extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public Eutra()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public Eutra(Sequence_[] elements)
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
		public Sequence_(EARFCN earfcn)
		{
		    setEarfcn(earfcn);
		}
		
		public void initComponents()
		{
		    mComponents[0] = new EARFCN();
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
			    return new EARFCN();
			default:
			    throw new InternalError("AbstractCollection.createInstance()");
		    }
		    
		}
		
		
		// Methods for field "earfcn"
		public EARFCN getEarfcn()
		{
		    return (EARFCN)mComponents[0];
		}
		
		public void setEarfcn(EARFCN earfcn)
		{
		    mComponents[0] = earfcn;
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
			"PriorityLevel$RadioAccessTechnology$Eutra$Sequence_"
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
					    "EARFCN"
					),
					new QName (
					    "InformationElements",
					    "EARFCN"
					),
					12314,
					new ValueRangeConstraint (
					    new AbstractBounds(
						new EARFCN(0), 
						new EARFCN(65535),
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
				"earfcn",
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
		    "PriorityLevel$RadioAccessTechnology$Eutra"
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
			"PriorityLevel$RadioAccessTechnology$Eutra$Sequence_"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Eutra object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Eutra object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Eutra

	// Methods for field "gsm"
	public static RadioAccessTechnology createRadioAccessTechnologyWithGsm(Gsm gsm)
	{
	    RadioAccessTechnology __object = new RadioAccessTechnology();

	    __object.setGsm(gsm);
	    return __object;
	}
	
	public boolean hasGsm()
	{
	    return getChosenFlag() == gsm_chosen;
	}
	
	public void setGsm(Gsm gsm)
	{
	    setChosenValue(gsm);
	    setChosenFlag(gsm_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Gsm from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Gsm extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Gsm()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Gsm(GSM_CellGroup gsm_CellGroup)
	    {
		setGsm_CellGroup(gsm_CellGroup);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new GSM_CellGroup();
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
			return new GSM_CellGroup();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "gsm_CellGroup"
	    public GSM_CellGroup getGsm_CellGroup()
	    {
		return (GSM_CellGroup)mComponents[0];
	    }
	    
	    public void setGsm_CellGroup(GSM_CellGroup gsm_CellGroup)
	    {
		mComponents[0] = gsm_CellGroup;
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8003
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "PriorityLevel$RadioAccessTechnology$Gsm"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"GSM_CellGroup"
				    ),
				    new QName (
					"InformationElements",
					"GSM-CellGroup"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "GSM_CellGroup"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "GSM_CellGroup"
					)
				    ),
				    0
				)
			    ),
			    "gsm-CellGroup",
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
	     * Get the type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Gsm object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Gsm

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case utraFDD_chosen:
		    return new UtraFDD();
		case utraTDD_chosen:
		    return new UtraTDD();
		case eutra_chosen:
		    return new Eutra();
		case gsm_chosen:
		    return new Gsm();
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
		"PriorityLevel$RadioAccessTechnology"
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
				"PriorityLevel$RadioAccessTechnology$UtraFDD"
			    )
			),
			"utraFDD",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"PriorityLevel$RadioAccessTechnology$UtraTDD"
			    )
			),
			"utraTDD",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"PriorityLevel$RadioAccessTechnology$Eutra"
			    )
			),
			"eutra",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"PriorityLevel$RadioAccessTechnology$Gsm"
			    )
			),
			"gsm",
			3,
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
		    new TagDecoderElement((short)0x8003, 3)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RadioAccessTechnology object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RadioAccessTechnology object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RadioAccessTechnology

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
	    "PriorityLevel"
	),
	new QName (
	    "InformationElements",
	    "PriorityLevel"
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
				    new com.oss.asn1.INTEGER(7),
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
		    "priority",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PriorityLevel$RadioAccessTechnology"
			)
		    ),
		    "radioAccessTechnology",
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
     * Get the type descriptor (TypeInfo) of 'this' PriorityLevel object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PriorityLevel object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PriorityLevel
