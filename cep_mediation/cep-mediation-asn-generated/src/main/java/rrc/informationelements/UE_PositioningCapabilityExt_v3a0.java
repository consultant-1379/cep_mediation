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
 * Define the ASN1 Type UE_PositioningCapabilityExt_v3a0 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_PositioningCapabilityExt_v3a0 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_PositioningCapabilityExt_v3a0()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_PositioningCapabilityExt_v3a0(Validity_CellPCH_UraPCH validity_CellPCH_UraPCH)
    {
	setValidity_CellPCH_UraPCH(validity_CellPCH_UraPCH);
    }
    
    public void initComponents()
    {
	mComponents[0] = Validity_CellPCH_UraPCH._true;
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
		return Validity_CellPCH_UraPCH._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "validity_CellPCH_UraPCH"
    public Validity_CellPCH_UraPCH getValidity_CellPCH_UraPCH()
    {
	return (Validity_CellPCH_UraPCH)mComponents[0];
    }
    
    public void setValidity_CellPCH_UraPCH(Validity_CellPCH_UraPCH validity_CellPCH_UraPCH)
    {
	mComponents[0] = validity_CellPCH_UraPCH;
    }
    
    
    
    /**
     * Define the ASN1 Type Validity_CellPCH_UraPCH from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Validity_CellPCH_UraPCH extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Validity_CellPCH_UraPCH()
	{
	    super(cFirstNumber);
	}
	
	protected Validity_CellPCH_UraPCH(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Validity_CellPCH_UraPCH _true =
	    new Validity_CellPCH_UraPCH(0);
	private final static Validity_CellPCH_UraPCH cNamedNumbers[] = {
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
	
	public static Validity_CellPCH_UraPCH valueOf(long value)
	{
	    return (Validity_CellPCH_UraPCH)_true.lookupValue(value);
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
		"UE_PositioningCapabilityExt_v3a0$Validity_CellPCH_UraPCH"
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
	 * Get the type descriptor (TypeInfo) of 'this' Validity_CellPCH_UraPCH object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Validity_CellPCH_UraPCH object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Validity_CellPCH_UraPCH

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
	    "UE_PositioningCapabilityExt_v3a0"
	),
	new QName (
	    "InformationElements",
	    "UE-PositioningCapabilityExt-v3a0"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_PositioningCapabilityExt_v3a0$Validity_CellPCH_UraPCH"
			)
		    ),
		    "validity-CellPCH-UraPCH",
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
     * Get the type descriptor (TypeInfo) of 'this' UE_PositioningCapabilityExt_v3a0 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_PositioningCapabilityExt_v3a0 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_PositioningCapabilityExt_v3a0
