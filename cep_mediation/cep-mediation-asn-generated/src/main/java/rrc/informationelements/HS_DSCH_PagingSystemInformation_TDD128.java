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
 * Define the ASN1 Type HS_DSCH_PagingSystemInformation_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_DSCH_PagingSystemInformation_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_DSCH_PagingSystemInformation_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_DSCH_PagingSystemInformation_TDD128(Pich_ForHsdschList pich_ForHsdschList, 
		    INTEGER dtch_DCCH_reception_window_size, 
		    PCCH_InformationList pcch_InformationList)
    {
	setPich_ForHsdschList(pich_ForHsdschList);
	setDtch_DCCH_reception_window_size(dtch_DCCH_reception_window_size);
	setPcch_InformationList(pcch_InformationList);
    }
    
    /**
     * Construct with components.
     */
    public HS_DSCH_PagingSystemInformation_TDD128(Pich_ForHsdschList pich_ForHsdschList, 
		    long dtch_DCCH_reception_window_size, 
		    PCCH_InformationList pcch_InformationList)
    {
	this(pich_ForHsdschList, 
	     new INTEGER(dtch_DCCH_reception_window_size), 
	     pcch_InformationList);
    }
    
    /**
     * Construct with required components.
     */
    public HS_DSCH_PagingSystemInformation_TDD128(Pich_ForHsdschList pich_ForHsdschList, 
		    long dtch_DCCH_reception_window_size)
    {
	setPich_ForHsdschList(pich_ForHsdschList);
	setDtch_DCCH_reception_window_size(dtch_DCCH_reception_window_size);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Pich_ForHsdschList();
	mComponents[1] = new INTEGER();
	mComponents[2] = new PCCH_InformationList();
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
		return new Pich_ForHsdschList();
	    case 1:
		return new INTEGER();
	    case 2:
		return new PCCH_InformationList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pich_ForHsdschList"
    public Pich_ForHsdschList getPich_ForHsdschList()
    {
	return (Pich_ForHsdschList)mComponents[0];
    }
    
    public void setPich_ForHsdschList(Pich_ForHsdschList pich_ForHsdschList)
    {
	mComponents[0] = pich_ForHsdschList;
    }
    
    
    
    /**
     * Define the ASN1 Type Pich_ForHsdschList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Pich_ForHsdschList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Pich_ForHsdschList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Pich_ForHsdschList(PICH_ForHSDPASupportedPaging_TDD128[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PICH_ForHSDPASupportedPaging_TDD128 element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PICH_ForHSDPASupportedPaging_TDD128 element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PICH_ForHSDPASupportedPaging_TDD128 get(int atIndex)
	{
	    return (PICH_ForHSDPASupportedPaging_TDD128)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PICH_ForHSDPASupportedPaging_TDD128 element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PICH_ForHSDPASupportedPaging_TDD128 element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PICH_ForHSDPASupportedPaging_TDD128();
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
		"HS_DSCH_PagingSystemInformation_TDD128$Pich_ForHsdschList"
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
		    "PICH_ForHSDPASupportedPaging_TDD128"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Pich_ForHsdschList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Pich_ForHsdschList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Pich_ForHsdschList

    // Methods for field "dtch_DCCH_reception_window_size"
    public long getDtch_DCCH_reception_window_size()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDtch_DCCH_reception_window_size(long dtch_DCCH_reception_window_size)
    {
	setDtch_DCCH_reception_window_size(new INTEGER(dtch_DCCH_reception_window_size));
    }
    
    public void setDtch_DCCH_reception_window_size(INTEGER dtch_DCCH_reception_window_size)
    {
	mComponents[1] = dtch_DCCH_reception_window_size;
    }
    
    
    // Methods for field "pcch_InformationList"
    public PCCH_InformationList getPcch_InformationList()
    {
	return (PCCH_InformationList)mComponents[2];
    }
    
    public void setPcch_InformationList(PCCH_InformationList pcch_InformationList)
    {
	mComponents[2] = pcch_InformationList;
    }
    
    public boolean hasPcch_InformationList()
    {
	return componentIsPresent(2);
    }
    
    public void deletePcch_InformationList()
    {
	setComponentAbsent(2);
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
	    "HS_DSCH_PagingSystemInformation_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-DSCH-PagingSystemInformation-TDD128"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_DSCH_PagingSystemInformation_TDD128$Pich_ForHsdschList"
			)
		    ),
		    "pich-ForHsdschList",
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
				    new com.oss.asn1.INTEGER(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "dtch-DCCH-reception-window-size",
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
				"PCCH_InformationList"
			    ),
			    new QName (
				"InformationElements",
				"PCCH-InformationList"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PCCH_InformationList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PCCH_InformationList"
				)
			    ),
			    0
			)
		    ),
		    "pcch-InformationList",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' HS_DSCH_PagingSystemInformation_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_DSCH_PagingSystemInformation_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_DSCH_PagingSystemInformation_TDD128
