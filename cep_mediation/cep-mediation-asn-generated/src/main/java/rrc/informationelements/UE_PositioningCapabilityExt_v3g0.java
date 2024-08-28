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
 * Define the ASN1 Type UE_PositioningCapabilityExt_v3g0 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_PositioningCapabilityExt_v3g0 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_PositioningCapabilityExt_v3g0()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_PositioningCapabilityExt_v3g0(Sfn_sfnType2Capability sfn_sfnType2Capability)
    {
	setSfn_sfnType2Capability(sfn_sfnType2Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = Sfn_sfnType2Capability._true;
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
		return Sfn_sfnType2Capability._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sfn_sfnType2Capability"
    public Sfn_sfnType2Capability getSfn_sfnType2Capability()
    {
	return (Sfn_sfnType2Capability)mComponents[0];
    }
    
    public void setSfn_sfnType2Capability(Sfn_sfnType2Capability sfn_sfnType2Capability)
    {
	mComponents[0] = sfn_sfnType2Capability;
    }
    
    
    
    /**
     * Define the ASN1 Type Sfn_sfnType2Capability from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Sfn_sfnType2Capability extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Sfn_sfnType2Capability()
	{
	    super(cFirstNumber);
	}
	
	protected Sfn_sfnType2Capability(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Sfn_sfnType2Capability _true =
	    new Sfn_sfnType2Capability(0);
	private final static Sfn_sfnType2Capability cNamedNumbers[] = {
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
	
	public static Sfn_sfnType2Capability valueOf(long value)
	{
	    return (Sfn_sfnType2Capability)_true.lookupValue(value);
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
		"rrc.informationelements",
		"UE_PositioningCapabilityExt_v3g0$Sfn_sfnType2Capability"
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
	 * Get the type descriptor (TypeInfo) of 'this' Sfn_sfnType2Capability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Sfn_sfnType2Capability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Sfn_sfnType2Capability

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
	    "UE_PositioningCapabilityExt_v3g0"
	),
	new QName (
	    "InformationElements",
	    "UE-PositioningCapabilityExt-v3g0"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_PositioningCapabilityExt_v3g0$Sfn_sfnType2Capability"
			)
		    ),
		    "sfn-sfnType2Capability",
		    0,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_PositioningCapabilityExt_v3g0 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_PositioningCapabilityExt_v3g0 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_PositioningCapabilityExt_v3g0
