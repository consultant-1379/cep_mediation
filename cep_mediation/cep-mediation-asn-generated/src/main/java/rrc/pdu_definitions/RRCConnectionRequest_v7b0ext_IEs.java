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
 * Define the ASN1 Type RRCConnectionRequest_v7b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionRequest_v7b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionRequest_v7b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionRequest_v7b0ext_IEs(SupportForE_FDPCH supportForE_FDPCH)
    {
	setSupportForE_FDPCH(supportForE_FDPCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportForE_FDPCH._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[1];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return SupportForE_FDPCH._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportForE_FDPCH"
    public SupportForE_FDPCH getSupportForE_FDPCH()
    {
	return (SupportForE_FDPCH)mComponents[0];
    }
    
    public void setSupportForE_FDPCH(SupportForE_FDPCH supportForE_FDPCH)
    {
	mComponents[0] = supportForE_FDPCH;
    }
    
    public boolean hasSupportForE_FDPCH()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportForE_FDPCH()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForE_FDPCH from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportForE_FDPCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForE_FDPCH()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForE_FDPCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForE_FDPCH _true =
	    new SupportForE_FDPCH(0);
	private final static SupportForE_FDPCH cNamedNumbers[] = {
	     _true
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static SupportForE_FDPCH valueOf(long value)
	{
	    return (SupportForE_FDPCH)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"RRCConnectionRequest_v7b0ext_IEs$SupportForE_FDPCH"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"true",
			0
		    )
		}
	    ),
	    0,
	    _true
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportForE_FDPCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForE_FDPCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForE_FDPCH

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
	    "RRCConnectionRequest_v7b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionRequest-v7b0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionRequest_v7b0ext_IEs$SupportForE_FDPCH"
			)
		    ),
		    "supportForE-FDPCH",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v7b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionRequest_v7b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionRequest_v7b0ext_IEs
