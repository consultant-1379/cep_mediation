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
 * Define the ASN1 Type SysInfoType14 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType14 extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType14()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType14(IndividualTS_InterferenceList individualTS_InterferenceList, 
		    ExpirationTimeFactor expirationTimeFactor, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setIndividualTS_InterferenceList(individualTS_InterferenceList);
	setExpirationTimeFactor(expirationTimeFactor);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public SysInfoType14(IndividualTS_InterferenceList individualTS_InterferenceList)
    {
	setIndividualTS_InterferenceList(individualTS_InterferenceList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new IndividualTS_InterferenceList();
	mComponents[1] = new ExpirationTimeFactor();
	mComponents[2] = new NonCriticalExtensions();
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
		return new IndividualTS_InterferenceList();
	    case 1:
		return new ExpirationTimeFactor();
	    case 2:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "individualTS_InterferenceList"
    public IndividualTS_InterferenceList getIndividualTS_InterferenceList()
    {
	return (IndividualTS_InterferenceList)mComponents[0];
    }
    
    public void setIndividualTS_InterferenceList(IndividualTS_InterferenceList individualTS_InterferenceList)
    {
	mComponents[0] = individualTS_InterferenceList;
    }
    
    
    // Methods for field "expirationTimeFactor"
    public ExpirationTimeFactor getExpirationTimeFactor()
    {
	return (ExpirationTimeFactor)mComponents[1];
    }
    
    public void setExpirationTimeFactor(ExpirationTimeFactor expirationTimeFactor)
    {
	mComponents[1] = expirationTimeFactor;
    }
    
    public boolean hasExpirationTimeFactor()
    {
	return componentIsPresent(1);
    }
    
    public void deleteExpirationTimeFactor()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[2];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[2] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class NonCriticalExtensions extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NonCriticalExtensions()
	{
	}
	
	public void initComponents()
	{
	    
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[0];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    return null;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"SysInfoType14$NonCriticalExtensions"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		}
	    ),
	    0,
	    null,
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NonCriticalExtensions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NonCriticalExtensions

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
	    "SysInfoType14"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType14"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"IndividualTS_InterferenceList"
			    ),
			    new QName (
				"InformationElements",
				"IndividualTS-InterferenceList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(14),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "IndividualTS_Interference"
				)
			    )
			)
		    ),
		    "individualTS-InterferenceList",
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
				"rrc.informationelements",
				"ExpirationTimeFactor"
			    ),
			    new QName (
				"InformationElements",
				"ExpirationTimeFactor"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ExpirationTimeFactor(1), 
				    new ExpirationTimeFactor(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "expirationTimeFactor",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType14$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType14 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType14 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for SysInfoType14
