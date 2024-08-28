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
 * Define the ASN1 Type PCCH_InformationList from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PCCH_InformationList extends Sequence {
    
    /**
     * The default constructor.
     */
    public PCCH_InformationList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PCCH_InformationList(Paging_associatedHspdschInfo paging_associatedHspdschInfo, 
		    INTEGER paging_sub_Channel_size, 
		    TransportBlockSizeList transportBlockSizeList)
    {
	setPaging_associatedHspdschInfo(paging_associatedHspdschInfo);
	setPaging_sub_Channel_size(paging_sub_Channel_size);
	setTransportBlockSizeList(transportBlockSizeList);
    }
    
    /**
     * Construct with components.
     */
    public PCCH_InformationList(Paging_associatedHspdschInfo paging_associatedHspdschInfo, 
		    long paging_sub_Channel_size, 
		    TransportBlockSizeList transportBlockSizeList)
    {
	this(paging_associatedHspdschInfo, 
	     new INTEGER(paging_sub_Channel_size), transportBlockSizeList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Paging_associatedHspdschInfo();
	mComponents[1] = new INTEGER();
	mComponents[2] = new TransportBlockSizeList();
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
		return new Paging_associatedHspdschInfo();
	    case 1:
		return new INTEGER();
	    case 2:
		return new TransportBlockSizeList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "paging_associatedHspdschInfo"
    public Paging_associatedHspdschInfo getPaging_associatedHspdschInfo()
    {
	return (Paging_associatedHspdschInfo)mComponents[0];
    }
    
    public void setPaging_associatedHspdschInfo(Paging_associatedHspdschInfo paging_associatedHspdschInfo)
    {
	mComponents[0] = paging_associatedHspdschInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type Paging_associatedHspdschInfo from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Paging_associatedHspdschInfo extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Paging_associatedHspdschInfo()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Paging_associatedHspdschInfo(Sequence_[] elements)
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
	    public Sequence_(HS_PDSCH_Midamble_Configuration_TDD128 hs_pdsch_MidambleConfiguration, 
			    BitString timeslotResourceRelatedInfo, 
			    CodeResourceInformation_TDD128 codeResourceInformation)
	    {
		setHs_pdsch_MidambleConfiguration(hs_pdsch_MidambleConfiguration);
		setTimeslotResourceRelatedInfo(timeslotResourceRelatedInfo);
		setCodeResourceInformation(codeResourceInformation);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new HS_PDSCH_Midamble_Configuration_TDD128();
		mComponents[1] = new BitString();
		mComponents[2] = new CodeResourceInformation_TDD128();
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
			return new HS_PDSCH_Midamble_Configuration_TDD128();
		    case 1:
			return new BitString();
		    case 2:
			return new CodeResourceInformation_TDD128();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hs_pdsch_MidambleConfiguration"
	    public HS_PDSCH_Midamble_Configuration_TDD128 getHs_pdsch_MidambleConfiguration()
	    {
		return (HS_PDSCH_Midamble_Configuration_TDD128)mComponents[0];
	    }
	    
	    public void setHs_pdsch_MidambleConfiguration(HS_PDSCH_Midamble_Configuration_TDD128 hs_pdsch_MidambleConfiguration)
	    {
		mComponents[0] = hs_pdsch_MidambleConfiguration;
	    }
	    
	    
	    // Methods for field "timeslotResourceRelatedInfo"
	    public BitString getTimeslotResourceRelatedInfo()
	    {
		return (BitString)mComponents[1];
	    }
	    
	    public void setTimeslotResourceRelatedInfo(BitString timeslotResourceRelatedInfo)
	    {
		mComponents[1] = timeslotResourceRelatedInfo;
	    }
	    
	    
	    // Methods for field "codeResourceInformation"
	    public CodeResourceInformation_TDD128 getCodeResourceInformation()
	    {
		return (CodeResourceInformation_TDD128)mComponents[2];
	    }
	    
	    public void setCodeResourceInformation(CodeResourceInformation_TDD128 codeResourceInformation)
	    {
		mComponents[2] = codeResourceInformation;
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
		    "PCCH_InformationList$Paging_associatedHspdschInfo$Sequence_"
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
					"HS_PDSCH_Midamble_Configuration_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"HS-PDSCH-Midamble-Configuration-TDD128"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "HS_PDSCH_Midamble_Configuration_TDD128"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "HS_PDSCH_Midamble_Configuration_TDD128"
					)
				    ),
				    0
				)
			    ),
			    "hs-pdsch-MidambleConfiguration",
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
					    new com.oss.asn1.INTEGER(6)
					)
				    ),
				    new Bounds (
					new java.lang.Long(6),
					new java.lang.Long(6)
				    ),
				    null
				)
			    ),
			    "timeslotResourceRelatedInfo",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"CodeResourceInformation_TDD128"
				    ),
				    new QName (
					"InformationElements",
					"CodeResourceInformation-TDD128"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "CodeResourceInformation_TDD128"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "CodeResourceInformation_TDD128"
					)
				    ),
				    0
				)
			    ),
			    "codeResourceInformation",
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PCCH_InformationList$Paging_associatedHspdschInfo"
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
		    "PCCH_InformationList$Paging_associatedHspdschInfo$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Paging_associatedHspdschInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Paging_associatedHspdschInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Paging_associatedHspdschInfo

    // Methods for field "paging_sub_Channel_size"
    public long getPaging_sub_Channel_size()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPaging_sub_Channel_size(long paging_sub_Channel_size)
    {
	setPaging_sub_Channel_size(new INTEGER(paging_sub_Channel_size));
    }
    
    public void setPaging_sub_Channel_size(INTEGER paging_sub_Channel_size)
    {
	mComponents[1] = paging_sub_Channel_size;
    }
    
    
    // Methods for field "transportBlockSizeList"
    public TransportBlockSizeList getTransportBlockSizeList()
    {
	return (TransportBlockSizeList)mComponents[2];
    }
    
    public void setTransportBlockSizeList(TransportBlockSizeList transportBlockSizeList)
    {
	mComponents[2] = transportBlockSizeList;
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PCCH_InformationList$TransportBlockSizeList"
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
	    "PCCH_InformationList"
	),
	new QName (
	    "InformationElements",
	    "PCCH-InformationList"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PCCH_InformationList$Paging_associatedHspdschInfo"
			)
		    ),
		    "paging-associatedHspdschInfo",
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
				    new com.oss.asn1.INTEGER(3),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(3)
			    ),
			    null
			)
		    ),
		    "paging-sub-Channel-size",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PCCH_InformationList$TransportBlockSizeList"
			)
		    ),
		    "transportBlockSizeList",
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
     * Get the type descriptor (TypeInfo) of 'this' PCCH_InformationList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PCCH_InformationList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PCCH_InformationList
