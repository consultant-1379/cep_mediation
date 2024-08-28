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
 * Define the ASN1 Type LogicalChannelList from ASN1 Module InformationElements.
 * @see Choice
 */

public class LogicalChannelList extends Choice {
    
    /**
     * The default constructor.
     */
    public LogicalChannelList()
    {
    }
    
    public static final  int  allSizes_chosen = 1;
    public static final  int  configured_chosen = 2;
    public static final  int  explicitList_chosen = 3;
    
    // Methods for field "allSizes"
    public static LogicalChannelList createLogicalChannelListWithAllSizes(Null allSizes)
    {
	LogicalChannelList __object = new LogicalChannelList();

	__object.setAllSizes(allSizes);
	return __object;
    }
    
    public boolean hasAllSizes()
    {
	return getChosenFlag() == allSizes_chosen;
    }
    
    public void setAllSizes(Null allSizes)
    {
	setChosenValue(allSizes);
	setChosenFlag(allSizes_chosen);
    }
    
    
    // Methods for field "configured"
    public static LogicalChannelList createLogicalChannelListWithConfigured(Null configured)
    {
	LogicalChannelList __object = new LogicalChannelList();

	__object.setConfigured(configured);
	return __object;
    }
    
    public boolean hasConfigured()
    {
	return getChosenFlag() == configured_chosen;
    }
    
    public void setConfigured(Null configured)
    {
	setChosenValue(configured);
	setChosenFlag(configured_chosen);
    }
    
    
    // Methods for field "explicitList"
    public static LogicalChannelList createLogicalChannelListWithExplicitList(ExplicitList explicitList)
    {
	LogicalChannelList __object = new LogicalChannelList();

	__object.setExplicitList(explicitList);
	return __object;
    }
    
    public boolean hasExplicitList()
    {
	return getChosenFlag() == explicitList_chosen;
    }
    
    public void setExplicitList(ExplicitList explicitList)
    {
	setChosenValue(explicitList);
	setChosenFlag(explicitList_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type ExplicitList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class ExplicitList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public ExplicitList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public ExplicitList(LogicalChannelByRB[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(LogicalChannelByRB element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(LogicalChannelByRB element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized LogicalChannelByRB get(int atIndex)
	{
	    return (LogicalChannelByRB)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(LogicalChannelByRB element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(LogicalChannelByRB element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new LogicalChannelByRB();
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
		"LogicalChannelList$ExplicitList"
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
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "LogicalChannelByRB"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ExplicitList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ExplicitList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ExplicitList

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case allSizes_chosen:
		return new Null();
	    case configured_chosen:
		return new Null();
	    case explicitList_chosen:
		return new ExplicitList();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "LogicalChannelList"
	),
	new QName (
	    "InformationElements",
	    "LogicalChannelList"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "allSizes",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"Null"
			    ),
			    new QName (
				"builtin",
				"NULL"
			    ),
			    12314,
			    null
			)
		    ),
		    "configured",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "LogicalChannelList$ExplicitList"
			)
		    ),
		    "explicitList",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LogicalChannelList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LogicalChannelList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LogicalChannelList
