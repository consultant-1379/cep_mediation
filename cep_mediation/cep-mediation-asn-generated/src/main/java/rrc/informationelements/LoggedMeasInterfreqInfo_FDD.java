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
 * Define the ASN1 Type LoggedMeasInterfreqInfo_FDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasInterfreqInfo_FDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasInterfreqInfo_FDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasInterfreqInfo_FDD(FrequencyInfo frequencyInfo, 
		    LoggedMeasInterfreqNeighbourList loggedMeasInterfreqNeighbourList)
    {
	setFrequencyInfo(frequencyInfo);
	setLoggedMeasInterfreqNeighbourList(loggedMeasInterfreqNeighbourList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FrequencyInfo();
	mComponents[1] = new LoggedMeasInterfreqNeighbourList();
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
		return new FrequencyInfo();
	    case 1:
		return new LoggedMeasInterfreqNeighbourList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "frequencyInfo"
    public FrequencyInfo getFrequencyInfo()
    {
	return (FrequencyInfo)mComponents[0];
    }
    
    public void setFrequencyInfo(FrequencyInfo frequencyInfo)
    {
	mComponents[0] = frequencyInfo;
    }
    
    
    // Methods for field "loggedMeasInterfreqNeighbourList"
    public LoggedMeasInterfreqNeighbourList getLoggedMeasInterfreqNeighbourList()
    {
	return (LoggedMeasInterfreqNeighbourList)mComponents[1];
    }
    
    public void setLoggedMeasInterfreqNeighbourList(LoggedMeasInterfreqNeighbourList loggedMeasInterfreqNeighbourList)
    {
	mComponents[1] = loggedMeasInterfreqNeighbourList;
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedMeasInterfreqNeighbourList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class LoggedMeasInterfreqNeighbourList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public LoggedMeasInterfreqNeighbourList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public LoggedMeasInterfreqNeighbourList(LoggedMeasNeighbourInfo_FDD[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(LoggedMeasNeighbourInfo_FDD element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(LoggedMeasNeighbourInfo_FDD element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized LoggedMeasNeighbourInfo_FDD get(int atIndex)
	{
	    return (LoggedMeasNeighbourInfo_FDD)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(LoggedMeasNeighbourInfo_FDD element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(LoggedMeasNeighbourInfo_FDD element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new LoggedMeasNeighbourInfo_FDD();
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
		"LoggedMeasInterfreqInfo_FDD$LoggedMeasInterfreqNeighbourList"
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
		    "LoggedMeasNeighbourInfo_FDD"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LoggedMeasInterfreqNeighbourList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasInterfreqNeighbourList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedMeasInterfreqNeighbourList

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
	    "LoggedMeasInterfreqInfo_FDD"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasInterfreqInfo-FDD"
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
				"FrequencyInfo"
			    ),
			    new QName (
				"InformationElements",
				"FrequencyInfo"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "FrequencyInfo"
				)
			    ),
			    0
			)
		    ),
		    "frequencyInfo",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasInterfreqInfo_FDD$LoggedMeasInterfreqNeighbourList"
			)
		    ),
		    "loggedMeasInterfreqNeighbourList",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasInterfreqInfo_FDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasInterfreqInfo_FDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasInterfreqInfo_FDD
