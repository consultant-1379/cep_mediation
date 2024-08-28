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
 * Define the ASN1 Type ExtGANSS_SIBTypeInfoSchedulingInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ExtGANSS_SIBTypeInfoSchedulingInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtGANSS_SIBTypeInfoSchedulingInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtGANSS_SIBTypeInfoSchedulingInfo(INTEGER ganssID, 
		    UE_Positioning_GANSS_SBAS_ID sbasID, 
		    GanssScheduling ganssScheduling)
    {
	setGanssID(ganssID);
	setSbasID(sbasID);
	setGanssScheduling(ganssScheduling);
    }
    
    /**
     * Construct with components.
     */
    public ExtGANSS_SIBTypeInfoSchedulingInfo(long ganssID, 
		    UE_Positioning_GANSS_SBAS_ID sbasID, 
		    GanssScheduling ganssScheduling)
    {
	this(new INTEGER(ganssID), sbasID, ganssScheduling);
    }
    
    /**
     * Construct with required components.
     */
    public ExtGANSS_SIBTypeInfoSchedulingInfo(GanssScheduling ganssScheduling)
    {
	setGanssScheduling(ganssScheduling);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = UE_Positioning_GANSS_SBAS_ID.waas;
	mComponents[2] = new GanssScheduling();
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
		return new INTEGER();
	    case 1:
		return UE_Positioning_GANSS_SBAS_ID.waas;
	    case 2:
		return new GanssScheduling();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssID"
    public long getGanssID()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setGanssID(long ganssID)
    {
	setGanssID(new INTEGER(ganssID));
    }
    
    public void setGanssID(INTEGER ganssID)
    {
	mComponents[0] = ganssID;
    }
    
    public boolean hasGanssID()
    {
	return componentIsPresent(0);
    }
    
    public void deleteGanssID()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "sbasID"
    public UE_Positioning_GANSS_SBAS_ID getSbasID()
    {
	return (UE_Positioning_GANSS_SBAS_ID)mComponents[1];
    }
    
    public void setSbasID(UE_Positioning_GANSS_SBAS_ID sbasID)
    {
	mComponents[1] = sbasID;
    }
    
    public boolean hasSbasID()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSbasID()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ganssScheduling"
    public GanssScheduling getGanssScheduling()
    {
	return (GanssScheduling)mComponents[2];
    }
    
    public void setGanssScheduling(GanssScheduling ganssScheduling)
    {
	mComponents[2] = ganssScheduling;
    }
    
    
    
    /**
     * Define the ASN1 Type GanssScheduling from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class GanssScheduling extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public GanssScheduling()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public GanssScheduling(ExtGANSS_SchedulingInfo[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(ExtGANSS_SchedulingInfo element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(ExtGANSS_SchedulingInfo element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized ExtGANSS_SchedulingInfo get(int atIndex)
	{
	    return (ExtGANSS_SchedulingInfo)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(ExtGANSS_SchedulingInfo element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(ExtGANSS_SchedulingInfo element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new ExtGANSS_SchedulingInfo();
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
		"ExtGANSS_SIBTypeInfoSchedulingInfo$GanssScheduling"
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
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "ExtGANSS_SchedulingInfo"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' GanssScheduling object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssScheduling object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssScheduling

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
	    "ExtGANSS_SIBTypeInfoSchedulingInfo"
	),
	new QName (
	    "InformationElements",
	    "ExtGANSS-SIBTypeInfoSchedulingInfo"
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
		    "ganssID",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"UE_Positioning_GANSS_SBAS_ID"
			    ),
			    new QName (
				"InformationElements",
				"UE-Positioning-GANSS-SBAS-ID"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"waas",
					0
				    ),
				    new MemberListElement (
					"egnos",
					1
				    ),
				    new MemberListElement (
					"msas",
					2
				    ),
				    new MemberListElement (
					"gagan",
					3
				    ),
				    new MemberListElement (
					"spare4",
					4
				    ),
				    new MemberListElement (
					"spare3",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    UE_Positioning_GANSS_SBAS_ID.waas
			)
		    ),
		    "sbasID",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ExtGANSS_SIBTypeInfoSchedulingInfo$GanssScheduling"
			)
		    ),
		    "ganssScheduling",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' ExtGANSS_SIBTypeInfoSchedulingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtGANSS_SIBTypeInfoSchedulingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtGANSS_SIBTypeInfoSchedulingInfo
