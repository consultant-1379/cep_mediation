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
 * Define the ASN1 Type ETWSPrimaryNotificationWithSecurity from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class ETWSPrimaryNotificationWithSecurity extends Sequence {
    
    /**
     * The default constructor.
     */
    public ETWSPrimaryNotificationWithSecurity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ETWSPrimaryNotificationWithSecurity(rrc.informationelements.ETWS_Information etws_Information, 
		    rrc.informationelements.ETWS_WarningSecurityInfo etws_WarningSecurityInfo, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setEtws_Information(etws_Information);
	setEtws_WarningSecurityInfo(etws_WarningSecurityInfo);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public ETWSPrimaryNotificationWithSecurity(rrc.informationelements.ETWS_Information etws_Information)
    {
	setEtws_Information(etws_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.ETWS_Information();
	mComponents[1] = new rrc.informationelements.ETWS_WarningSecurityInfo();
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
		return new rrc.informationelements.ETWS_Information();
	    case 1:
		return new rrc.informationelements.ETWS_WarningSecurityInfo();
	    case 2:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "etws_Information"
    public rrc.informationelements.ETWS_Information getEtws_Information()
    {
	return (rrc.informationelements.ETWS_Information)mComponents[0];
    }
    
    public void setEtws_Information(rrc.informationelements.ETWS_Information etws_Information)
    {
	mComponents[0] = etws_Information;
    }
    
    
    // Methods for field "etws_WarningSecurityInfo"
    public rrc.informationelements.ETWS_WarningSecurityInfo getEtws_WarningSecurityInfo()
    {
	return (rrc.informationelements.ETWS_WarningSecurityInfo)mComponents[1];
    }
    
    public void setEtws_WarningSecurityInfo(rrc.informationelements.ETWS_WarningSecurityInfo etws_WarningSecurityInfo)
    {
	mComponents[1] = etws_WarningSecurityInfo;
    }
    
    public boolean hasEtws_WarningSecurityInfo()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEtws_WarningSecurityInfo()
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"ETWSPrimaryNotificationWithSecurity$NonCriticalExtensions"
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
	    "ETWSPrimaryNotificationWithSecurity"
	),
	new QName (
	    "PDU-definitions",
	    "ETWSPrimaryNotificationWithSecurity"
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
				"ETWS_Information"
			    ),
			    new QName (
				"InformationElements",
				"ETWS-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ETWS_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ETWS_Information"
				)
			    ),
			    0
			)
		    ),
		    "etws-Information",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ETWS_WarningSecurityInfo"
			    ),
			    new QName (
				"InformationElements",
				"ETWS-WarningSecurityInfo"
			    ),
			    12314,
			    null,
			    null
			)
		    ),
		    "etws-WarningSecurityInfo",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "ETWSPrimaryNotificationWithSecurity$NonCriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' ETWSPrimaryNotificationWithSecurity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ETWSPrimaryNotificationWithSecurity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ETWSPrimaryNotificationWithSecurity
