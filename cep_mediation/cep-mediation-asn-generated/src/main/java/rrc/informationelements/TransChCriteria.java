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
 * Define the ASN1 Type TransChCriteria from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TransChCriteria extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransChCriteria()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransChCriteria(UL_TrCH_Identity ul_transportChannelID, 
		    EventSpecificParameters eventSpecificParameters)
    {
	setUl_transportChannelID(ul_transportChannelID);
	setEventSpecificParameters(eventSpecificParameters);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UL_TrCH_Identity();
	mComponents[1] = new EventSpecificParameters();
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
		return new UL_TrCH_Identity();
	    case 1:
		return new EventSpecificParameters();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ul_transportChannelID"
    public UL_TrCH_Identity getUl_transportChannelID()
    {
	return (UL_TrCH_Identity)mComponents[0];
    }
    
    public void setUl_transportChannelID(UL_TrCH_Identity ul_transportChannelID)
    {
	mComponents[0] = ul_transportChannelID;
    }
    
    public boolean hasUl_transportChannelID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUl_transportChannelID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "eventSpecificParameters"
    public EventSpecificParameters getEventSpecificParameters()
    {
	return (EventSpecificParameters)mComponents[1];
    }
    
    public void setEventSpecificParameters(EventSpecificParameters eventSpecificParameters)
    {
	mComponents[1] = eventSpecificParameters;
    }
    
    public boolean hasEventSpecificParameters()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEventSpecificParameters()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type EventSpecificParameters from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class EventSpecificParameters extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public EventSpecificParameters()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public EventSpecificParameters(TrafficVolumeEventParam[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TrafficVolumeEventParam element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TrafficVolumeEventParam element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TrafficVolumeEventParam get(int atIndex)
	{
	    return (TrafficVolumeEventParam)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TrafficVolumeEventParam element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TrafficVolumeEventParam element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TrafficVolumeEventParam();
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
		"TransChCriteria$EventSpecificParameters"
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
		    "TrafficVolumeEventParam"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' EventSpecificParameters object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' EventSpecificParameters object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for EventSpecificParameters

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
	    "TransChCriteria"
	),
	new QName (
	    "InformationElements",
	    "TransChCriteria"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UL_TrCH_Identity"
			    ),
			    new QName (
				"InformationElements",
				"UL-TrCH-Identity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "UL_TrCH_Identity"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "ul-transportChannelID",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "TransChCriteria$EventSpecificParameters"
			)
		    ),
		    "eventSpecificParameters",
		    1,
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
     * Get the type descriptor (TypeInfo) of 'this' TransChCriteria object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransChCriteria object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransChCriteria
