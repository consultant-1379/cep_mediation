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
 * Define the ASN1 Type RRCConnectionRequest_NonCriticalExts_va40_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_NonCriticalExts_va40_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_NonCriticalExts_va40_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_NonCriticalExts_va40_IEs(RRCConnectionRequest_va40ext_IEs rrcConnectionRequest_va40ext, 
		    NonCriticalExtensions nonCriticalExtensions)
    {
	setRrcConnectionRequest_va40ext(rrcConnectionRequest_va40ext);
	setNonCriticalExtensions(nonCriticalExtensions);
    }
    
    /**
     * Construct with required components.
     */
    public RRCConnectionRequest_NonCriticalExts_va40_IEs(RRCConnectionRequest_va40ext_IEs rrcConnectionRequest_va40ext)
    {
	setRrcConnectionRequest_va40ext(rrcConnectionRequest_va40ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RRCConnectionRequest_va40ext_IEs();
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
		return new RRCConnectionRequest_va40ext_IEs();
	    case 1:
		return new NonCriticalExtensions();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "rrcConnectionRequest_va40ext"
    public RRCConnectionRequest_va40ext_IEs getRrcConnectionRequest_va40ext()
    {
	return (RRCConnectionRequest_va40ext_IEs)mComponents[0];
    }
    
    public void setRrcConnectionRequest_va40ext(RRCConnectionRequest_va40ext_IEs rrcConnectionRequest_va40ext)
    {
	mComponents[0] = rrcConnectionRequest_va40ext;
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
		"RRCConnectionRequest_NonCriticalExts_va40_IEs$NonCriticalExtensions"
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
	    "RRCConnectionRequest_NonCriticalExts_va40_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-NonCriticalExts-va40-IEs"
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
				"rrc.pdu_definitions",
				"RRCConnectionRequest_va40ext_IEs"
			    ),
			    new QName (
				"PDU-definitions",
				"RRCConnectionRequest-va40ext-IEs"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest_va40ext_IEs"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.pdu_definitions",
				    "RRCConnectionRequest_va40ext_IEs"
				)
			    ),
			    0
			)
		    ),
		    "rrcConnectionRequest-va40ext",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_NonCriticalExts_va40_IEs$NonCriticalExtensions"
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_NonCriticalExts_va40_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_NonCriticalExts_va40_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_NonCriticalExts_va40_IEs
