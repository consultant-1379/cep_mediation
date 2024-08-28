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
 * Define the ASN1 Type GSM_CellGroup from ASN1 Module InformationElements.
 * @see Sequence
 */

public class GSM_CellGroup extends Sequence {
    
    /**
     * The default constructor.
     */
    public GSM_CellGroup()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GSM_CellGroup(BCCH_ARFCN startingARFCN, 
		    BandIndicator bandIndicator, 
		    FollowingARFCNs followingARFCNs)
    {
	setStartingARFCN(startingARFCN);
	setBandIndicator(bandIndicator);
	setFollowingARFCNs(followingARFCNs);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BCCH_ARFCN();
	mComponents[1] = BandIndicator.dcs1800;
	mComponents[2] = new FollowingARFCNs();
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
		return new BCCH_ARFCN();
	    case 1:
		return BandIndicator.dcs1800;
	    case 2:
		return new FollowingARFCNs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "startingARFCN"
    public BCCH_ARFCN getStartingARFCN()
    {
	return (BCCH_ARFCN)mComponents[0];
    }
    
    public void setStartingARFCN(BCCH_ARFCN startingARFCN)
    {
	mComponents[0] = startingARFCN;
    }
    
    
    // Methods for field "bandIndicator"
    public BandIndicator getBandIndicator()
    {
	return (BandIndicator)mComponents[1];
    }
    
    public void setBandIndicator(BandIndicator bandIndicator)
    {
	mComponents[1] = bandIndicator;
    }
    
    
    
    /**
     * Define the ASN1 Type BandIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class BandIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private BandIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected BandIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final BandIndicator dcs1800 =
	    new BandIndicator(0);
	public static final BandIndicator pcs1900 =
	    new BandIndicator(1);
	private final static BandIndicator cNamedNumbers[] = {
	     dcs1800, 
	     pcs1900
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
	
	public static BandIndicator valueOf(long value)
	{
	    return (BandIndicator)dcs1800.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"GSM_CellGroup$BandIndicator"
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
			"dcs1800",
			0
		    ),
		    new MemberListElement (
			"pcs1900",
			1
		    )
		}
	    ),
	    0,
	    dcs1800
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' BandIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' BandIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for BandIndicator

    // Methods for field "followingARFCNs"
    public FollowingARFCNs getFollowingARFCNs()
    {
	return (FollowingARFCNs)mComponents[2];
    }
    
    public void setFollowingARFCNs(FollowingARFCNs followingARFCNs)
    {
	mComponents[2] = followingARFCNs;
    }
    
    
    
    /**
     * Define the ASN1 Type FollowingARFCNs from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class FollowingARFCNs extends Choice {
	
	/**
	 * The default constructor.
	 */
	public FollowingARFCNs()
	{
	}
	
	public static final  int  explicitListOfARFCNs_chosen = 1;
	public static final  int  equallySpacedARFCNs_chosen = 2;
	public static final  int  variableBitMapOfARFCNs_chosen = 3;
	public static final  int  continuousRangeOfARFCNs_chosen = 4;
	
	// Methods for field "explicitListOfARFCNs"
	public static FollowingARFCNs createFollowingARFCNsWithExplicitListOfARFCNs(ExplicitListOfARFCNs explicitListOfARFCNs)
	{
	    FollowingARFCNs __object = new FollowingARFCNs();

	    __object.setExplicitListOfARFCNs(explicitListOfARFCNs);
	    return __object;
	}
	
	public boolean hasExplicitListOfARFCNs()
	{
	    return getChosenFlag() == explicitListOfARFCNs_chosen;
	}
	
	public void setExplicitListOfARFCNs(ExplicitListOfARFCNs explicitListOfARFCNs)
	{
	    setChosenValue(explicitListOfARFCNs);
	    setChosenFlag(explicitListOfARFCNs_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type ExplicitListOfARFCNs from ASN1 Module InformationElements.
	 * @see SequenceOf
	 */
	public static class ExplicitListOfARFCNs extends SequenceOf {
	    
	    /**
	     * The default constructor.
	     */
	    public ExplicitListOfARFCNs()
	    {
	    }
	    
	    /**
	     * Construct from an array of components.
	     */
	    public ExplicitListOfARFCNs(BCCH_ARFCN[] elements)
	    {
		super(elements);
	    }
	    
	    /**
	     * Add an Element to the SEQUENCE OF/SET OF.
	     */
	    public synchronized void add(BCCH_ARFCN element)
	    {
		super.addElement(element);
	    }
	    
	    /**
	     * Set an Element in the SEQUENCE OF/SET OF.
	     */
	    public synchronized void set(BCCH_ARFCN element, int atIndex)
	    {
		super.setElement(element, atIndex);
	    }
	    
	    /**
	     * Get an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized BCCH_ARFCN get(int atIndex)
	    {
		return (BCCH_ARFCN)super.getElement(atIndex);
	    }
	    
	    /**
	     * Insert an Element into the SEQUENCE OF/SET OF.
	     */
	    public synchronized void insert(BCCH_ARFCN element, int atIndex)
	    {
		super.insertElement(element, atIndex);
	    }
	    
	    /**
	     * Remove an Element from the SEQUENCE OF/SET OF.
	     */
	    public synchronized void remove(BCCH_ARFCN element)
	    {
		super.removeElement(element);
	    }
	    
	    /**
	     * Create an instance of  SEQUENCE OF/SET OF.
	     */
	    public AbstractData createInstance()
	    {
		return (AbstractData)new BCCH_ARFCN();
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
		    "GSM_CellGroup$FollowingARFCNs$ExplicitListOfARFCNs"
		),
		new QName (
		    "builtin",
		    "SEQUENCE OF"
		),
		12314,
		new SizeConstraint (
		    new ValueRangeConstraint (
			new AbstractBounds(
			    new com.oss.asn1.INTEGER(0), 
			    new com.oss.asn1.INTEGER(31),
			    0
			)
		    )
		),
		new Bounds (
		    new java.lang.Long(0),
		    new java.lang.Long(31)
		),
		new TypeInfoRef (
		    new QName (
			"rrc.informationelements",
			"BCCH_ARFCN"
		    )
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' ExplicitListOfARFCNs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' ExplicitListOfARFCNs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for ExplicitListOfARFCNs

	// Methods for field "equallySpacedARFCNs"
	public static FollowingARFCNs createFollowingARFCNsWithEquallySpacedARFCNs(EquallySpacedARFCNs equallySpacedARFCNs)
	{
	    FollowingARFCNs __object = new FollowingARFCNs();

	    __object.setEquallySpacedARFCNs(equallySpacedARFCNs);
	    return __object;
	}
	
	public boolean hasEquallySpacedARFCNs()
	{
	    return getChosenFlag() == equallySpacedARFCNs_chosen;
	}
	
	public void setEquallySpacedARFCNs(EquallySpacedARFCNs equallySpacedARFCNs)
	{
	    setChosenValue(equallySpacedARFCNs);
	    setChosenFlag(equallySpacedARFCNs_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type EquallySpacedARFCNs from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class EquallySpacedARFCNs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public EquallySpacedARFCNs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public EquallySpacedARFCNs(INTEGER arfcn_Spacing, 
			    INTEGER numberOfFollowingARFCNs)
	    {
		setArfcn_Spacing(arfcn_Spacing);
		setNumberOfFollowingARFCNs(numberOfFollowingARFCNs);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public EquallySpacedARFCNs(long arfcn_Spacing, 
			    long numberOfFollowingARFCNs)
	    {
		this(new INTEGER(arfcn_Spacing), 
		     new INTEGER(numberOfFollowingARFCNs));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
		mComponents[1] = new INTEGER();
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
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "arfcn_Spacing"
	    public long getArfcn_Spacing()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setArfcn_Spacing(long arfcn_Spacing)
	    {
		setArfcn_Spacing(new INTEGER(arfcn_Spacing));
	    }
	    
	    public void setArfcn_Spacing(INTEGER arfcn_Spacing)
	    {
		mComponents[0] = arfcn_Spacing;
	    }
	    
	    
	    // Methods for field "numberOfFollowingARFCNs"
	    public long getNumberOfFollowingARFCNs()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setNumberOfFollowingARFCNs(long numberOfFollowingARFCNs)
	    {
		setNumberOfFollowingARFCNs(new INTEGER(numberOfFollowingARFCNs));
	    }
	    
	    public void setNumberOfFollowingARFCNs(INTEGER numberOfFollowingARFCNs)
	    {
		mComponents[1] = numberOfFollowingARFCNs;
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
		    "GSM_CellGroup$FollowingARFCNs$EquallySpacedARFCNs"
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
			    "arfcn-Spacing",
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
			    "numberOfFollowingARFCNs",
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
	     * Get the type descriptor (TypeInfo) of 'this' EquallySpacedARFCNs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' EquallySpacedARFCNs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for EquallySpacedARFCNs

	// Methods for field "variableBitMapOfARFCNs"
	public static FollowingARFCNs createFollowingARFCNsWithVariableBitMapOfARFCNs(OctetString variableBitMapOfARFCNs)
	{
	    FollowingARFCNs __object = new FollowingARFCNs();

	    __object.setVariableBitMapOfARFCNs(variableBitMapOfARFCNs);
	    return __object;
	}
	
	public boolean hasVariableBitMapOfARFCNs()
	{
	    return getChosenFlag() == variableBitMapOfARFCNs_chosen;
	}
	
	public void setVariableBitMapOfARFCNs(OctetString variableBitMapOfARFCNs)
	{
	    setChosenValue(variableBitMapOfARFCNs);
	    setChosenFlag(variableBitMapOfARFCNs_chosen);
	}
	
	
	// Methods for field "continuousRangeOfARFCNs"
	public static FollowingARFCNs createFollowingARFCNsWithContinuousRangeOfARFCNs(ContinuousRangeOfARFCNs continuousRangeOfARFCNs)
	{
	    FollowingARFCNs __object = new FollowingARFCNs();

	    __object.setContinuousRangeOfARFCNs(continuousRangeOfARFCNs);
	    return __object;
	}
	
	public boolean hasContinuousRangeOfARFCNs()
	{
	    return getChosenFlag() == continuousRangeOfARFCNs_chosen;
	}
	
	public void setContinuousRangeOfARFCNs(ContinuousRangeOfARFCNs continuousRangeOfARFCNs)
	{
	    setChosenValue(continuousRangeOfARFCNs);
	    setChosenFlag(continuousRangeOfARFCNs_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type ContinuousRangeOfARFCNs from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class ContinuousRangeOfARFCNs extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public ContinuousRangeOfARFCNs()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public ContinuousRangeOfARFCNs(BCCH_ARFCN endingARFCN)
	    {
		setEndingARFCN(endingARFCN);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new BCCH_ARFCN();
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
			return new BCCH_ARFCN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "endingARFCN"
	    public BCCH_ARFCN getEndingARFCN()
	    {
		return (BCCH_ARFCN)mComponents[0];
	    }
	    
	    public void setEndingARFCN(BCCH_ARFCN endingARFCN)
	    {
		mComponents[0] = endingARFCN;
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
		    "GSM_CellGroup$FollowingARFCNs$ContinuousRangeOfARFCNs"
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
					"BCCH_ARFCN"
				    ),
				    new QName (
					"InformationElements",
					"BCCH-ARFCN"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new BCCH_ARFCN(0), 
					    new BCCH_ARFCN(1023),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(1023)
				    ),
				    null
				)
			    ),
			    "endingARFCN",
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
	     * Get the type descriptor (TypeInfo) of 'this' ContinuousRangeOfARFCNs object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' ContinuousRangeOfARFCNs object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for ContinuousRangeOfARFCNs

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case explicitListOfARFCNs_chosen:
		    return new ExplicitListOfARFCNs();
		case equallySpacedARFCNs_chosen:
		    return new EquallySpacedARFCNs();
		case variableBitMapOfARFCNs_chosen:
		    return new OctetString();
		case continuousRangeOfARFCNs_chosen:
		    return new ContinuousRangeOfARFCNs();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"GSM_CellGroup$FollowingARFCNs"
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
				"GSM_CellGroup$FollowingARFCNs$ExplicitListOfARFCNs"
			    )
			),
			"explicitListOfARFCNs",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"GSM_CellGroup$FollowingARFCNs$EquallySpacedARFCNs"
			    )
			),
			"equallySpacedARFCNs",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "OctetString"
				),
				new QName (
				    "builtin",
				    "OCTET STRING"
				),
				12314,
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(16),
					    0
					)
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(16)
				)
			    )
			),
			"variableBitMapOfARFCNs",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"GSM_CellGroup$FollowingARFCNs$ContinuousRangeOfARFCNs"
			    )
			),
			"continuousRangeOfARFCNs",
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
	 * Get the type descriptor (TypeInfo) of 'this' FollowingARFCNs object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FollowingARFCNs object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FollowingARFCNs

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
	    "GSM_CellGroup"
	),
	new QName (
	    "InformationElements",
	    "GSM-CellGroup"
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
				"BCCH_ARFCN"
			    ),
			    new QName (
				"InformationElements",
				"BCCH-ARFCN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new BCCH_ARFCN(0), 
				    new BCCH_ARFCN(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "startingARFCN",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GSM_CellGroup$BandIndicator"
			)
		    ),
		    "bandIndicator",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "GSM_CellGroup$FollowingARFCNs"
			)
		    ),
		    "followingARFCNs",
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
     * Get the type descriptor (TypeInfo) of 'this' GSM_CellGroup object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GSM_CellGroup object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GSM_CellGroup
