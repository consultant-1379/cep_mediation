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
 * Define the ASN1 Type HS_SCCH_SystemInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_SystemInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_SystemInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_SystemInfo(SecondaryScramblingCode dl_ScramblingCode, 
		    HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
    {
	setDl_ScramblingCode(dl_ScramblingCode);
	setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
    }
    
    /**
     * Construct with required components.
     */
    public HS_SCCH_SystemInfo(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
    {
	setHS_SCCHChannelisationCodeInfo(hS_SCCHChannelisationCodeInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SecondaryScramblingCode();
	mComponents[1] = new HS_SCCHChannelisationCodeInfo();
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
		return new SecondaryScramblingCode();
	    case 1:
		return new HS_SCCHChannelisationCodeInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "dl_ScramblingCode"
    public SecondaryScramblingCode getDl_ScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[0];
    }
    
    public void setDl_ScramblingCode(SecondaryScramblingCode dl_ScramblingCode)
    {
	mComponents[0] = dl_ScramblingCode;
    }
    
    public boolean hasDl_ScramblingCode()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDl_ScramblingCode()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hS_SCCHChannelisationCodeInfo"
    public HS_SCCHChannelisationCodeInfo getHS_SCCHChannelisationCodeInfo()
    {
	return (HS_SCCHChannelisationCodeInfo)mComponents[1];
    }
    
    public void setHS_SCCHChannelisationCodeInfo(HS_SCCHChannelisationCodeInfo hS_SCCHChannelisationCodeInfo)
    {
	mComponents[1] = hS_SCCHChannelisationCodeInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type HS_SCCHChannelisationCodeInfo from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class HS_SCCHChannelisationCodeInfo extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public HS_SCCHChannelisationCodeInfo()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public HS_SCCHChannelisationCodeInfo(HS_SCCH_Codes[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(HS_SCCH_Codes element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(HS_SCCH_Codes element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized HS_SCCH_Codes get(int atIndex)
	{
	    return (HS_SCCH_Codes)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(HS_SCCH_Codes element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(HS_SCCH_Codes element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new HS_SCCH_Codes();
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
		"HS_SCCH_SystemInfo$HS_SCCHChannelisationCodeInfo"
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
		    "HS_SCCH_Codes"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HS_SCCHChannelisationCodeInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HS_SCCHChannelisationCodeInfo

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
	    "HS_SCCH_SystemInfo"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-SystemInfo"
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
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "dl-ScramblingCode",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "HS_SCCH_SystemInfo$HS_SCCHChannelisationCodeInfo"
			)
		    ),
		    "hS-SCCHChannelisationCodeInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_SystemInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_SystemInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_SystemInfo
