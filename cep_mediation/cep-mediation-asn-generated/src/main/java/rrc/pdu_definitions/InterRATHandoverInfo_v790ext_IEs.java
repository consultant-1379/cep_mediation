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
 * Define the ASN1 Type InterRATHandoverInfo_v790ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_v790ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_v790ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_v790ext_IEs(SupportForEDPCCHPowerBoosting supportForEDPCCHPowerBoosting)
    {
	setSupportForEDPCCHPowerBoosting(supportForEDPCCHPowerBoosting);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportForEDPCCHPowerBoosting._true;
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
		return SupportForEDPCCHPowerBoosting._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportForEDPCCHPowerBoosting"
    public SupportForEDPCCHPowerBoosting getSupportForEDPCCHPowerBoosting()
    {
	return (SupportForEDPCCHPowerBoosting)mComponents[0];
    }
    
    public void setSupportForEDPCCHPowerBoosting(SupportForEDPCCHPowerBoosting supportForEDPCCHPowerBoosting)
    {
	mComponents[0] = supportForEDPCCHPowerBoosting;
    }
    
    public boolean hasSupportForEDPCCHPowerBoosting()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportForEDPCCHPowerBoosting()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForEDPCCHPowerBoosting from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportForEDPCCHPowerBoosting extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForEDPCCHPowerBoosting()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForEDPCCHPowerBoosting(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForEDPCCHPowerBoosting _true =
	    new SupportForEDPCCHPowerBoosting(0);
	private final static SupportForEDPCCHPowerBoosting cNamedNumbers[] = {
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
	
	public static SupportForEDPCCHPowerBoosting valueOf(long value)
	{
	    return (SupportForEDPCCHPowerBoosting)_true.lookupValue(value);
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
		"InterRATHandoverInfo_v790ext_IEs$SupportForEDPCCHPowerBoosting"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForEDPCCHPowerBoosting object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForEDPCCHPowerBoosting object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForEDPCCHPowerBoosting

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
	    "InterRATHandoverInfo_v790ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo-v790ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo_v790ext_IEs$SupportForEDPCCHPowerBoosting"
			)
		    ),
		    "supportForEDPCCHPowerBoosting",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v790ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v790ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_v790ext_IEs
