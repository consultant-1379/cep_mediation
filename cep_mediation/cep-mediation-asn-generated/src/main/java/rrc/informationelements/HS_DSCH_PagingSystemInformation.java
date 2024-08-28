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
 * Define the ASN1 Type HS_DSCH_PagingSystemInformation from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_DSCH_PagingSystemInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_DSCH_PagingSystemInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_DSCH_PagingSystemInformation(SecondaryScramblingCode dlScramblingCode, 
		    Pich_ForHSDPASupportedPagingList pich_ForHSDPASupportedPagingList, 
		    INTEGER numberOfPcchTransmissions, 
		    TransportBlockSizeList transportBlockSizeList)
    {
	setDlScramblingCode(dlScramblingCode);
	setPich_ForHSDPASupportedPagingList(pich_ForHSDPASupportedPagingList);
	setNumberOfPcchTransmissions(numberOfPcchTransmissions);
	setTransportBlockSizeList(transportBlockSizeList);
    }
    
    /**
     * Construct with components.
     */
    public HS_DSCH_PagingSystemInformation(SecondaryScramblingCode dlScramblingCode, 
		    Pich_ForHSDPASupportedPagingList pich_ForHSDPASupportedPagingList, 
		    long numberOfPcchTransmissions, 
		    TransportBlockSizeList transportBlockSizeList)
    {
	this(dlScramblingCode, pich_ForHSDPASupportedPagingList, 
	     new INTEGER(numberOfPcchTransmissions), transportBlockSizeList);
    }
    
    /**
     * Construct with required components.
     */
    public HS_DSCH_PagingSystemInformation(Pich_ForHSDPASupportedPagingList pich_ForHSDPASupportedPagingList, 
		    long numberOfPcchTransmissions, 
		    TransportBlockSizeList transportBlockSizeList)
    {
	setPich_ForHSDPASupportedPagingList(pich_ForHSDPASupportedPagingList);
	setNumberOfPcchTransmissions(numberOfPcchTransmissions);
	setTransportBlockSizeList(transportBlockSizeList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new Pich_ForHSDPASupportedPagingList();
	mComponents[2] = new INTEGER();
	mComponents[3] = new TransportBlockSizeList();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SecondaryScramblingCode();
	    case 1:
		return new Pich_ForHSDPASupportedPagingList();
	    case 2:
		return new INTEGER();
	    case 3:
		return new TransportBlockSizeList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dlScramblingCode"
    public SecondaryScramblingCode getDlScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setDlScramblingCode(SecondaryScramblingCode dlScramblingCode)
    {
	mComponents[0] = dlScramblingCode;
    }
    
    public boolean hasDlScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDlScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "pich_ForHSDPASupportedPagingList"
    public Pich_ForHSDPASupportedPagingList getPich_ForHSDPASupportedPagingList()
    {
	return (Pich_ForHSDPASupportedPagingList)mComponents[1];
    }
    
    public void setPich_ForHSDPASupportedPagingList(Pich_ForHSDPASupportedPagingList pich_ForHSDPASupportedPagingList)
    {
	mComponents[1] = pich_ForHSDPASupportedPagingList;
    }
    
    
    
    /**
     * Define the ASN1 Type Pich_ForHSDPASupportedPagingList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Pich_ForHSDPASupportedPagingList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Pich_ForHSDPASupportedPagingList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Pich_ForHSDPASupportedPagingList(PICH_ForHSDPASupportedPaging[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PICH_ForHSDPASupportedPaging element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PICH_ForHSDPASupportedPaging element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PICH_ForHSDPASupportedPaging get(int atIndex)
	{
	    return (PICH_ForHSDPASupportedPaging)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PICH_ForHSDPASupportedPaging element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PICH_ForHSDPASupportedPaging element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PICH_ForHSDPASupportedPaging();
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
		"HS_DSCH_PagingSystemInformation$Pich_ForHSDPASupportedPagingList"
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
			new com.oss.asn1.INTEGER(16),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(16)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "PICH_ForHSDPASupportedPaging"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Pich_ForHSDPASupportedPagingList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Pich_ForHSDPASupportedPagingList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Pich_ForHSDPASupportedPagingList

    // Methods for field "numberOfPcchTransmissions"
    public long getNumberOfPcchTransmissions()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setNumberOfPcchTransmissions(long numberOfPcchTransmissions)
    {
	setNumberOfPcchTransmissions(new INTEGER(numberOfPcchTransmissions));
    }
    
    public void setNumberOfPcchTransmissions(INTEGER numberOfPcchTransmissions)
    {
	mComponents[2] = numberOfPcchTransmissions;
    }
    
    
    // Methods for field "transportBlockSizeList"
    public TransportBlockSizeList getTransportBlockSizeList()
    {
	return (TransportBlockSizeList)mComponents[3];
    }
    
    public void setTransportBlockSizeList(TransportBlockSizeList transportBlockSizeList)
    {
	mComponents[3] = transportBlockSizeList;
    }
    
    
    
    /**
     * Define the ASN1 Type TransportBlockSizeList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class TransportBlockSizeList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public TransportBlockSizeList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public TransportBlockSizeList(TransportBlockSizeIndex[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TransportBlockSizeIndex element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TransportBlockSizeIndex element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TransportBlockSizeIndex get(int atIndex)
	{
	    return (TransportBlockSizeIndex)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TransportBlockSizeIndex element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TransportBlockSizeIndex element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TransportBlockSizeIndex();
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
		"HS_DSCH_PagingSystemInformation$TransportBlockSizeList"
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
			new com.oss.asn1.INTEGER(2),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(2)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TransportBlockSizeIndex"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' TransportBlockSizeList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TransportBlockSizeList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TransportBlockSizeList

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
	    "HS_DSCH_PagingSystemInformation"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-PagingSystemInformation"
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
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "dlScramblingCode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_PagingSystemInformation$Pich_ForHSDPASupportedPagingList"
			)
		    ),
		    "pich-ForHSDPASupportedPagingList",
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
				    new com.oss.asn1.INTEGER(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "numberOfPcchTransmissions",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_PagingSystemInformation$TransportBlockSizeList"
			)
		    ),
		    "transportBlockSizeList",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_PagingSystemInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_PagingSystemInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_PagingSystemInformation
