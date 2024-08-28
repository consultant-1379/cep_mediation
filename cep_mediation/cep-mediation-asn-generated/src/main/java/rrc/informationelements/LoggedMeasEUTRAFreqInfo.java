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
 * Define the ASN1 Type LoggedMeasEUTRAFreqInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class LoggedMeasEUTRAFreqInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public LoggedMeasEUTRAFreqInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LoggedMeasEUTRAFreqInfo(EARFCN earfcn, 
		    LoggedMeasEUTRAFreqNeighbourInfoList loggedMeasEUTRAFreqNeighbourInfoList)
    {
	setEarfcn(earfcn);
	setLoggedMeasEUTRAFreqNeighbourInfoList(loggedMeasEUTRAFreqNeighbourInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new EARFCN();
	mComponents[1] = new LoggedMeasEUTRAFreqNeighbourInfoList();
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
		return new EARFCN();
	    case 1:
		return new LoggedMeasEUTRAFreqNeighbourInfoList();
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
    
    
    // Methods for field "loggedMeasEUTRAFreqNeighbourInfoList"
    public LoggedMeasEUTRAFreqNeighbourInfoList getLoggedMeasEUTRAFreqNeighbourInfoList()
    {
	return (LoggedMeasEUTRAFreqNeighbourInfoList)mComponents[1];
    }
    
    public void setLoggedMeasEUTRAFreqNeighbourInfoList(LoggedMeasEUTRAFreqNeighbourInfoList loggedMeasEUTRAFreqNeighbourInfoList)
    {
	mComponents[1] = loggedMeasEUTRAFreqNeighbourInfoList;
    }
    
    
    
    /**
     * Define the ASN1 Type LoggedMeasEUTRAFreqNeighbourInfoList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class LoggedMeasEUTRAFreqNeighbourInfoList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public LoggedMeasEUTRAFreqNeighbourInfoList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public LoggedMeasEUTRAFreqNeighbourInfoList(LoggedMeasEUTRAFreqNeighbourInfo[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(LoggedMeasEUTRAFreqNeighbourInfo element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(LoggedMeasEUTRAFreqNeighbourInfo element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized LoggedMeasEUTRAFreqNeighbourInfo get(int atIndex)
	{
	    return (LoggedMeasEUTRAFreqNeighbourInfo)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(LoggedMeasEUTRAFreqNeighbourInfo element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(LoggedMeasEUTRAFreqNeighbourInfo element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new LoggedMeasEUTRAFreqNeighbourInfo();
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
		"LoggedMeasEUTRAFreqInfo$LoggedMeasEUTRAFreqNeighbourInfoList"
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
		    "LoggedMeasEUTRAFreqNeighbourInfo"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' LoggedMeasEUTRAFreqNeighbourInfoList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasEUTRAFreqNeighbourInfoList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LoggedMeasEUTRAFreqNeighbourInfoList

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
	    "LoggedMeasEUTRAFreqInfo"
	),
	new QName (
	    "InformationElements",
	    "LoggedMeasEUTRAFreqInfo"
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
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LoggedMeasEUTRAFreqInfo$LoggedMeasEUTRAFreqNeighbourInfoList"
			)
		    ),
		    "loggedMeasEUTRAFreqNeighbourInfoList",
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
     * Get the type descriptor (TypeInfo) of 'this' LoggedMeasEUTRAFreqInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LoggedMeasEUTRAFreqInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LoggedMeasEUTRAFreqInfo
