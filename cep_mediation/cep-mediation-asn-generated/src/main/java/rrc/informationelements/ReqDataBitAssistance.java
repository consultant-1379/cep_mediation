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
 * Define the ASN1 Type ReqDataBitAssistance from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ReqDataBitAssistance extends Sequence {
    
    /**
     * The default constructor.
     */
    public ReqDataBitAssistance()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ReqDataBitAssistance(DGANSS_Sig_Id_Req ganssSignalID, 
		    INTEGER ganssDataBitInterval, 
		    GanssSatelliteInfo ganssSatelliteInfo)
    {
	setGanssSignalID(ganssSignalID);
	setGanssDataBitInterval(ganssDataBitInterval);
	setGanssSatelliteInfo(ganssSatelliteInfo);
    }
    
    /**
     * Construct with components.
     */
    public ReqDataBitAssistance(DGANSS_Sig_Id_Req ganssSignalID, 
		    long ganssDataBitInterval, 
		    GanssSatelliteInfo ganssSatelliteInfo)
    {
	this(ganssSignalID, new INTEGER(ganssDataBitInterval), 
	     ganssSatelliteInfo);
    }
    
    /**
     * Construct with required components.
     */
    public ReqDataBitAssistance(DGANSS_Sig_Id_Req ganssSignalID, 
		    long ganssDataBitInterval)
    {
	setGanssSignalID(ganssSignalID);
	setGanssDataBitInterval(ganssDataBitInterval);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DGANSS_Sig_Id_Req();
	mComponents[1] = new INTEGER();
	mComponents[2] = new GanssSatelliteInfo();
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
		return new DGANSS_Sig_Id_Req();
	    case 1:
		return new INTEGER();
	    case 2:
		return new GanssSatelliteInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ganssSignalID"
    public DGANSS_Sig_Id_Req getGanssSignalID()
    {
	return (DGANSS_Sig_Id_Req)mComponents[0];
    }
    
    public void setGanssSignalID(DGANSS_Sig_Id_Req ganssSignalID)
    {
	mComponents[0] = ganssSignalID;
    }
    
    
    // Methods for field "ganssDataBitInterval"
    public long getGanssDataBitInterval()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setGanssDataBitInterval(long ganssDataBitInterval)
    {
	setGanssDataBitInterval(new INTEGER(ganssDataBitInterval));
    }
    
    public void setGanssDataBitInterval(INTEGER ganssDataBitInterval)
    {
	mComponents[1] = ganssDataBitInterval;
    }
    
    
    // Methods for field "ganssSatelliteInfo"
    public GanssSatelliteInfo getGanssSatelliteInfo()
    {
	return (GanssSatelliteInfo)mComponents[2];
    }
    
    public void setGanssSatelliteInfo(GanssSatelliteInfo ganssSatelliteInfo)
    {
	mComponents[2] = ganssSatelliteInfo;
    }
    
    public boolean hasGanssSatelliteInfo()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGanssSatelliteInfo()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type GanssSatelliteInfo from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class GanssSatelliteInfo extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public GanssSatelliteInfo()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public GanssSatelliteInfo(INTEGER[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(INTEGER element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(INTEGER element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized INTEGER get(int atIndex)
	{
	    return (INTEGER)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(INTEGER element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(INTEGER element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new INTEGER();
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
		"ReqDataBitAssistance$GanssSatelliteInfo"
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
			new com.oss.asn1.INTEGER(64),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(64)
	    ),
	    new TypeInfoRef (
		new IntegerInfo (
		    new Tags (
			new short[] {
			    0x0002
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
			    new com.oss.asn1.INTEGER(63),
			    0
			)
		    ),
		    new Bounds (
			new java.lang.Long(0),
			new java.lang.Long(63)
		    ),
		    null
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' GanssSatelliteInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GanssSatelliteInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GanssSatelliteInfo

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
	    "ReqDataBitAssistance"
	),
	new QName (
	    "InformationElements",
	    "ReqDataBitAssistance"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DGANSS_Sig_Id_Req"
			    ),
			    new QName (
				"InformationElements",
				"DGANSS-Sig-Id-Req"
			    ),
			    12314,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(8)
				)
			    ),
			    new Bounds (
				new java.lang.Long(8),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "ganssSignalID",
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
				    new com.oss.asn1.INTEGER(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "ganssDataBitInterval",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "ReqDataBitAssistance$GanssSatelliteInfo"
			)
		    ),
		    "ganssSatelliteInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' ReqDataBitAssistance object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ReqDataBitAssistance object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ReqDataBitAssistance
