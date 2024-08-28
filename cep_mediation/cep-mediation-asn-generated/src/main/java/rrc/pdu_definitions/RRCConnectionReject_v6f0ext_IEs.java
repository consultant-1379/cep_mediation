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
 * Define the ASN1 Type RRCConnectionReject_v6f0ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class RRCConnectionReject_v6f0ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public RRCConnectionReject_v6f0ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RRCConnectionReject_v6f0ext_IEs(CountingCompletion countingCompletion)
    {
	setCountingCompletion(countingCompletion);
    }
    
    public void initComponents()
    {
	mComponents[0] = CountingCompletion._true;
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
		return CountingCompletion._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "countingCompletion"
    public CountingCompletion getCountingCompletion()
    {
	return (CountingCompletion)mComponents[0];
    }
    
    public void setCountingCompletion(CountingCompletion countingCompletion)
    {
	mComponents[0] = countingCompletion;
    }
    
    public boolean hasCountingCompletion()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCountingCompletion()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type CountingCompletion from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class CountingCompletion extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CountingCompletion()
	{
	    super(cFirstNumber);
	}
	
	protected CountingCompletion(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CountingCompletion _true =
	    new CountingCompletion(0);
	private final static CountingCompletion cNamedNumbers[] = {
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
	
	public static CountingCompletion valueOf(long value)
	{
	    return (CountingCompletion)_true.lookupValue(value);
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
		"RRCConnectionReject_v6f0ext_IEs$CountingCompletion"
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
	 * Get the type descriptor (TypeInfo) of 'this' CountingCompletion object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CountingCompletion object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CountingCompletion

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
	    "RRCConnectionReject_v6f0ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "RRCConnectionReject-v6f0ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "RRCConnectionReject_v6f0ext_IEs$CountingCompletion"
			)
		    ),
		    "countingCompletion",
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
     * Get the type descriptor (TypeInfo) of 'this' RRCConnectionReject_v6f0ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RRCConnectionReject_v6f0ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RRCConnectionReject_v6f0ext_IEs
