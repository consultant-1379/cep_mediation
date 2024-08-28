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
 * Define the ASN1 Type DPCH_CompressedModeStatusInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DPCH_CompressedModeStatusInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DPCH_CompressedModeStatusInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DPCH_CompressedModeStatusInfo(TGPS_Reconfiguration_CFN tgps_Reconfiguration_CFN, 
		    Tgp_SequenceShortList tgp_SequenceShortList)
    {
	setTgps_Reconfiguration_CFN(tgps_Reconfiguration_CFN);
	setTgp_SequenceShortList(tgp_SequenceShortList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TGPS_Reconfiguration_CFN();
	mComponents[1] = new Tgp_SequenceShortList();
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
		return new TGPS_Reconfiguration_CFN();
	    case 1:
		return new Tgp_SequenceShortList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tgps_Reconfiguration_CFN"
    public TGPS_Reconfiguration_CFN getTgps_Reconfiguration_CFN()
    {
	return (TGPS_Reconfiguration_CFN)mComponents[0];
    }
    
    public void setTgps_Reconfiguration_CFN(TGPS_Reconfiguration_CFN tgps_Reconfiguration_CFN)
    {
	mComponents[0] = tgps_Reconfiguration_CFN;
    }
    
    
    // Methods for field "tgp_SequenceShortList"
    public Tgp_SequenceShortList getTgp_SequenceShortList()
    {
	return (Tgp_SequenceShortList)mComponents[1];
    }
    
    public void setTgp_SequenceShortList(Tgp_SequenceShortList tgp_SequenceShortList)
    {
	mComponents[1] = tgp_SequenceShortList;
    }
    
    
    
    /**
     * Define the ASN1 Type Tgp_SequenceShortList from ASN1 Module InformationElements.
     * @see SequenceOf
     */
    public static class Tgp_SequenceShortList extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Tgp_SequenceShortList()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tgp_SequenceShortList(TGP_SequenceShort[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TGP_SequenceShort element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TGP_SequenceShort element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TGP_SequenceShort get(int atIndex)
	{
	    return (TGP_SequenceShort)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TGP_SequenceShort element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TGP_SequenceShort element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TGP_SequenceShort();
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
		"DPCH_CompressedModeStatusInfo$Tgp_SequenceShortList"
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
			new com.oss.asn1.INTEGER(6),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(6)
	    ),
	    new TypeInfoRef (
		new QName (
		    "rrc.informationelements",
		    "TGP_SequenceShort"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tgp_SequenceShortList object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tgp_SequenceShortList object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tgp_SequenceShortList

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
	    "DPCH_CompressedModeStatusInfo"
	),
	new QName (
	    "InformationElements",
	    "DPCH-CompressedModeStatusInfo"
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
				"TGPS_Reconfiguration_CFN"
			    ),
			    new QName (
				"InformationElements",
				"TGPS-Reconfiguration-CFN"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TGPS_Reconfiguration_CFN(0), 
				    new TGPS_Reconfiguration_CFN(255),
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
		    "tgps-Reconfiguration-CFN",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DPCH_CompressedModeStatusInfo$Tgp_SequenceShortList"
			)
		    ),
		    "tgp-SequenceShortList",
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
     * Get the type descriptor (TypeInfo) of 'this' DPCH_CompressedModeStatusInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DPCH_CompressedModeStatusInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DPCH_CompressedModeStatusInfo
