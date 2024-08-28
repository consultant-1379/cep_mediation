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
 * Define the ASN1 Type MBMS_L1CombiningSchedule_1024 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_L1CombiningSchedule_1024 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_L1CombiningSchedule_1024()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_L1CombiningSchedule_1024(INTEGER cycleOffset, 
		    Mtch_L1CombiningPeriodList mtch_L1CombiningPeriodList)
    {
	setCycleOffset(cycleOffset);
	setMtch_L1CombiningPeriodList(mtch_L1CombiningPeriodList);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_L1CombiningSchedule_1024(long cycleOffset, 
		    Mtch_L1CombiningPeriodList mtch_L1CombiningPeriodList)
    {
	this(new INTEGER(cycleOffset), mtch_L1CombiningPeriodList);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_L1CombiningSchedule_1024(Mtch_L1CombiningPeriodList mtch_L1CombiningPeriodList)
    {
	setMtch_L1CombiningPeriodList(mtch_L1CombiningPeriodList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new Mtch_L1CombiningPeriodList();
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
		return new Mtch_L1CombiningPeriodList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cycleOffset"
    public long getCycleOffset()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setCycleOffset(long cycleOffset)
    {
	setCycleOffset(new INTEGER(cycleOffset));
    }
    
    public void setCycleOffset(INTEGER cycleOffset)
    {
	mComponents[0] = cycleOffset;
    }
    
    public boolean hasCycleOffset()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCycleOffset()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "mtch_L1CombiningPeriodList"
    public Mtch_L1CombiningPeriodList getMtch_L1CombiningPeriodList()
    {
	return (Mtch_L1CombiningPeriodList)mComponents[1];
    }
    
    public void setMtch_L1CombiningPeriodList(Mtch_L1CombiningPeriodList mtch_L1CombiningPeriodList)
    {
	mComponents[1] = mtch_L1CombiningPeriodList;
    }
    
    
    
    /**
     * Define the ASN1 Type Mtch_L1CombiningPeriodList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Mtch_L1CombiningPeriodList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Mtch_L1CombiningPeriodList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Mtch_L1CombiningPeriodList(Sequence_[] elements)
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
	    public Sequence_(INTEGER periodStart, INTEGER periodDuration)
	    {
		setPeriodStart(periodStart);
		setPeriodDuration(periodDuration);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Sequence_(long periodStart, long periodDuration)
	    {
		this(new INTEGER(periodStart), new INTEGER(periodDuration));
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
	    
	    
	    // Methods for field "periodStart"
	    public long getPeriodStart()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setPeriodStart(long periodStart)
	    {
		setPeriodStart(new INTEGER(periodStart));
	    }
	    
	    public void setPeriodStart(INTEGER periodStart)
	    {
		mComponents[0] = periodStart;
	    }
	    
	    
	    // Methods for field "periodDuration"
	    public long getPeriodDuration()
	    {
		return ((INTEGER)mComponents[1]).longValue();
	    }
	    
	    public void setPeriodDuration(long periodDuration)
	    {
		setPeriodDuration(new INTEGER(periodDuration));
	    }
	    
	    public void setPeriodDuration(INTEGER periodDuration)
	    {
		mComponents[1] = periodDuration;
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
		    "MBMS_L1CombiningSchedule_1024$Mtch_L1CombiningPeriodList$Sequence_"
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
			    "periodStart",
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
					    new com.oss.asn1.INTEGER(256),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(1),
					new java.lang.Long(256)
				    ),
				    null
				)
			    ),
			    "periodDuration",
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
		"MBMS_L1CombiningSchedule_1024$Mtch_L1CombiningPeriodList"
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
			new com.oss.asn1.INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "MBMS_L1CombiningSchedule_1024$Mtch_L1CombiningPeriodList$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Mtch_L1CombiningPeriodList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mtch_L1CombiningPeriodList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mtch_L1CombiningPeriodList

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
	    "MBMS_L1CombiningSchedule_1024"
	),
	new QName (
	    "InformationElements",
	    "MBMS-L1CombiningSchedule-1024"
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
		    "cycleOffset",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_L1CombiningSchedule_1024$Mtch_L1CombiningPeriodList"
			)
		    ),
		    "mtch-L1CombiningPeriodList",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_L1CombiningSchedule_1024 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_L1CombiningSchedule_1024 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_L1CombiningSchedule_1024
