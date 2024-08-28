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
 * Define the ASN1 Type InterRATHandoverInfo_v6b0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class InterRATHandoverInfo_v6b0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public InterRATHandoverInfo_v6b0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public InterRATHandoverInfo_v6b0ext_IEs(SupportForSIB11bis supportForSIB11bis)
    {
	setSupportForSIB11bis(supportForSIB11bis);
    }
    
    public void initComponents()
    {
	mComponents[0] = SupportForSIB11bis._true;
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
		return SupportForSIB11bis._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "supportForSIB11bis"
    public SupportForSIB11bis getSupportForSIB11bis()
    {
	return (SupportForSIB11bis)mComponents[0];
    }
    
    public void setSupportForSIB11bis(SupportForSIB11bis supportForSIB11bis)
    {
	mComponents[0] = supportForSIB11bis;
    }
    
    public boolean hasSupportForSIB11bis()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupportForSIB11bis()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportForSIB11bis from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class SupportForSIB11bis extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportForSIB11bis()
	{
	    super(cFirstNumber);
	}
	
	protected SupportForSIB11bis(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportForSIB11bis _true =
	    new SupportForSIB11bis(0);
	private final static SupportForSIB11bis cNamedNumbers[] = {
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
	
	public static SupportForSIB11bis valueOf(long value)
	{
	    return (SupportForSIB11bis)_true.lookupValue(value);
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
		"InterRATHandoverInfo_v6b0ext_IEs$SupportForSIB11bis"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportForSIB11bis object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportForSIB11bis object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportForSIB11bis

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
	    "InterRATHandoverInfo_v6b0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "InterRATHandoverInfo-v6b0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "InterRATHandoverInfo_v6b0ext_IEs$SupportForSIB11bis"
			)
		    ),
		    "supportForSIB11bis",
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
     * Get the type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v6b0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' InterRATHandoverInfo_v6b0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for InterRATHandoverInfo_v6b0ext_IEs
