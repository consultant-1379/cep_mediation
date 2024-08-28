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


package rrc.pdu_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type MBMSAccessInformation from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class MBMSAccessInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMSAccessInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMSAccessInformation(rrc.informationelements.MBMS_ServiceAccessInfoList_r6 mbms_ServiceAccessInfoList, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setMbms_ServiceAccessInfoList(mbms_ServiceAccessInfoList);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public MBMSAccessInformation(rrc.informationelements.MBMS_ServiceAccessInfoList_r6 mbms_ServiceAccessInfoList)
    {
	setMbms_ServiceAccessInfoList(mbms_ServiceAccessInfoList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MBMS_ServiceAccessInfoList_r6();
	mComponents[1] = new NonCriticalExtensions();
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
		return new rrc.informationelements.MBMS_ServiceAccessInfoList_r6();
	    case 1:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_ServiceAccessInfoList"
    public rrc.informationelements.MBMS_ServiceAccessInfoList_r6 getMbms_ServiceAccessInfoList()
    {
	return (rrc.informationelements.MBMS_ServiceAccessInfoList_r6)mComponents[0];
    }
    
    public void setMbms_ServiceAccessInfoList(rrc.informationelements.MBMS_ServiceAccessInfoList_r6 mbms_ServiceAccessInfoList)
    {
	mComponents[0] = mbms_ServiceAccessInfoList;
    }
    
    
    // Methods for field "nonCriticalExtensions"
    public NonCriticalExtensions getNonCriticalExtensions()
    {
	return (NonCriticalExtensions)mComponents[1];
    }
    
    public void setNonCriticalExtensions(NonCriticalExtensions nonCriticalExtensions)
    {
	mComponents[1] = nonCriticalExtensions;
    }
    
    public boolean hasNonCriticalExtensions()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNonCriticalExtensions()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type NonCriticalExtensions from ASN1 Module PDU_definitions.
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"MBMSAccessInformation$NonCriticalExtensions"
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
	    "rrc.pdu_definitions",
	    "MBMSAccessInformation"
	),
	new QName (
	    "PDU-definitions",
	    "MBMSAccessInformation"
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
				"MBMS_ServiceAccessInfoList_r6"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-ServiceAccessInfoList-r6"
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
				    "MBMS_ServiceAccessInfo_r6"
				)
			    )
			)
		    ),
		    "mbms-ServiceAccessInfoList",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "MBMSAccessInformation$NonCriticalExtensions"
			)
		    ),
		    "nonCriticalExtensions",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMSAccessInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMSAccessInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMSAccessInformation
