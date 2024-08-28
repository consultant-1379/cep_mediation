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
 * Define the ASN1 Type UTRA_PriorityInfoList from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UTRA_PriorityInfoList extends Sequence {
    
    /**
     * The default constructor.
     */
    public UTRA_PriorityInfoList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UTRA_PriorityInfoList(Utra_ServingCell utra_ServingCell, 
		    UTRAN_FDD_FrequencyList utran_FDD_FrequencyList, 
		    UTRAN_TDD_FrequencyList utran_TDD_FrequencyList)
    {
	setUtra_ServingCell(utra_ServingCell);
	setUtran_FDD_FrequencyList(utran_FDD_FrequencyList);
	setUtran_TDD_FrequencyList(utran_TDD_FrequencyList);
    }
    
    /**
     * Construct with required components.
     */
    public UTRA_PriorityInfoList(Utra_ServingCell utra_ServingCell)
    {
	setUtra_ServingCell(utra_ServingCell);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Utra_ServingCell();
	mComponents[1] = new UTRAN_FDD_FrequencyList();
	mComponents[2] = new UTRAN_TDD_FrequencyList();
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
		return new Utra_ServingCell();
	    case 1:
		return new UTRAN_FDD_FrequencyList();
	    case 2:
		return new UTRAN_TDD_FrequencyList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utra_ServingCell"
    public Utra_ServingCell getUtra_ServingCell()
    {
	return (Utra_ServingCell)mComponents[0];
    }
    
    public void setUtra_ServingCell(Utra_ServingCell utra_ServingCell)
    {
	mComponents[0] = utra_ServingCell;
    }
    
    
    
    /**
     * Define the ASN1 Type Utra_ServingCell from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Utra_ServingCell extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Utra_ServingCell()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Utra_ServingCell(INTEGER priority, INTEGER s_PrioritySearch1, 
			INTEGER s_PrioritySearch2, INTEGER threshServingLow)
	{
	    setPriority(priority);
	    setS_PrioritySearch1(s_PrioritySearch1);
	    setS_PrioritySearch2(s_PrioritySearch2);
	    setThreshServingLow(threshServingLow);
	}
	
	/**
	 * Construct with components.
	 */
	public Utra_ServingCell(long priority, long s_PrioritySearch1, 
			long s_PrioritySearch2, long threshServingLow)
	{
	    this(new INTEGER(priority), new INTEGER(s_PrioritySearch1), 
		 new INTEGER(s_PrioritySearch2), 
		 new INTEGER(threshServingLow));
	}
	
	/**
	 * Construct with required components.
	 */
	public Utra_ServingCell(long priority, long s_PrioritySearch1, 
			long threshServingLow)
	{
	    setPriority(priority);
	    setS_PrioritySearch1(s_PrioritySearch1);
	    setThreshServingLow(threshServingLow);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new INTEGER();
	    mComponents[3] = new INTEGER();
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
		    return new INTEGER();
		case 1:
		    return new INTEGER();
		case 2:
		    return new INTEGER();
		case 3:
		    return new INTEGER();
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
	
	
	// Methods for field "s_PrioritySearch1"
	public long getS_PrioritySearch1()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setS_PrioritySearch1(long s_PrioritySearch1)
	{
	    setS_PrioritySearch1(new INTEGER(s_PrioritySearch1));
	}
	
	public void setS_PrioritySearch1(INTEGER s_PrioritySearch1)
	{
	    mComponents[1] = s_PrioritySearch1;
	}
	
	
	// Methods for field "s_PrioritySearch2"
	public long getS_PrioritySearch2()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setS_PrioritySearch2(long s_PrioritySearch2)
	{
	    setS_PrioritySearch2(new INTEGER(s_PrioritySearch2));
	}
	
	public void setS_PrioritySearch2(INTEGER s_PrioritySearch2)
	{
	    mComponents[2] = s_PrioritySearch2;
	}
	
	public boolean hasS_PrioritySearch2()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteS_PrioritySearch2()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "threshServingLow"
	public long getThreshServingLow()
	{
	    return ((INTEGER)mComponents[3]).longValue();
	}
	
	public void setThreshServingLow(long threshServingLow)
	{
	    setThreshServingLow(new INTEGER(threshServingLow));
	}
	
	public void setThreshServingLow(INTEGER threshServingLow)
	{
	    mComponents[3] = threshServingLow;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UTRA_PriorityInfoList$Utra_ServingCell"
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
			"s-PrioritySearch1",
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
			"s-PrioritySearch2",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8003
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
			"threshServingLow",
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
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3)
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
	 * Get the type descriptor (TypeInfo) of 'this' Utra_ServingCell object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Utra_ServingCell object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Utra_ServingCell

    // Methods for field "utran_FDD_FrequencyList"
    public UTRAN_FDD_FrequencyList getUtran_FDD_FrequencyList()
    {
	return (UTRAN_FDD_FrequencyList)mComponents[1];
    }
    
    public void setUtran_FDD_FrequencyList(UTRAN_FDD_FrequencyList utran_FDD_FrequencyList)
    {
	mComponents[1] = utran_FDD_FrequencyList;
    }
    
    public boolean hasUtran_FDD_FrequencyList()
    {
	return componentIsPresent(1);
    }
    
    public void deleteUtran_FDD_FrequencyList()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "utran_TDD_FrequencyList"
    public UTRAN_TDD_FrequencyList getUtran_TDD_FrequencyList()
    {
	return (UTRAN_TDD_FrequencyList)mComponents[2];
    }
    
    public void setUtran_TDD_FrequencyList(UTRAN_TDD_FrequencyList utran_TDD_FrequencyList)
    {
	mComponents[2] = utran_TDD_FrequencyList;
    }
    
    public boolean hasUtran_TDD_FrequencyList()
    {
	return componentIsPresent(2);
    }
    
    public void deleteUtran_TDD_FrequencyList()
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
	    "UTRA_PriorityInfoList"
	),
	new QName (
	    "InformationElements",
	    "UTRA-PriorityInfoList"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UTRA_PriorityInfoList$Utra_ServingCell"
			)
		    ),
		    "utra-ServingCell",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UTRAN_FDD_FrequencyList"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-FDD-FrequencyList"
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
				    "UTRAN_FDD_Frequency"
				)
			    )
			)
		    ),
		    "utran-FDD-FrequencyList",
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
				"UTRAN_TDD_FrequencyList"
			    ),
			    new QName (
				"InformationElements",
				"UTRAN-TDD-FrequencyList"
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
				    "UTRAN_TDD_Frequency"
				)
			    )
			)
		    ),
		    "utran-TDD-FrequencyList",
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
     * Get the type descriptor (TypeInfo) of 'this' UTRA_PriorityInfoList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UTRA_PriorityInfoList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UTRA_PriorityInfoList
