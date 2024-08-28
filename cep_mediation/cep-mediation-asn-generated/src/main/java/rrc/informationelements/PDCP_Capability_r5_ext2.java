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
 * Define the ASN1 Type PDCP_Capability_r5_ext2 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PDCP_Capability_r5_ext2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PDCP_Capability_r5_ext2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PDCP_Capability_r5_ext2(LosslessDLRLC_PDUSizeChange losslessDLRLC_PDUSizeChange)
    {
	setLosslessDLRLC_PDUSizeChange(losslessDLRLC_PDUSizeChange);
    }
    
    public void initComponents()
    {
	mComponents[0] = LosslessDLRLC_PDUSizeChange._true;
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
		return LosslessDLRLC_PDUSizeChange._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "losslessDLRLC_PDUSizeChange"
    public LosslessDLRLC_PDUSizeChange getLosslessDLRLC_PDUSizeChange()
    {
	return (LosslessDLRLC_PDUSizeChange)mComponents[0];
    }
    
    public void setLosslessDLRLC_PDUSizeChange(LosslessDLRLC_PDUSizeChange losslessDLRLC_PDUSizeChange)
    {
	mComponents[0] = losslessDLRLC_PDUSizeChange;
    }
    
    public boolean hasLosslessDLRLC_PDUSizeChange()
    {
	return componentIsPresent(0);
    }
    
    public void deleteLosslessDLRLC_PDUSizeChange()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type LosslessDLRLC_PDUSizeChange from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class LosslessDLRLC_PDUSizeChange extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private LosslessDLRLC_PDUSizeChange()
	{
	    super(cFirstNumber);
	}
	
	protected LosslessDLRLC_PDUSizeChange(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final LosslessDLRLC_PDUSizeChange _true =
	    new LosslessDLRLC_PDUSizeChange(0);
	private final static LosslessDLRLC_PDUSizeChange cNamedNumbers[] = {
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
	
	public static LosslessDLRLC_PDUSizeChange valueOf(long value)
	{
	    return (LosslessDLRLC_PDUSizeChange)_true.lookupValue(value);
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
		"PDCP_Capability_r5_ext2$LosslessDLRLC_PDUSizeChange"
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
	 * Get the type descriptor (TypeInfo) of 'this' LosslessDLRLC_PDUSizeChange object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' LosslessDLRLC_PDUSizeChange object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for LosslessDLRLC_PDUSizeChange

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
	    "PDCP_Capability_r5_ext2"
	),
	new QName (
	    "InformationElements",
	    "PDCP-Capability-r5-ext2"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PDCP_Capability_r5_ext2$LosslessDLRLC_PDUSizeChange"
			)
		    ),
		    "losslessDLRLC-PDUSizeChange",
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
     * Get the type descriptor (TypeInfo) of 'this' PDCP_Capability_r5_ext2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDCP_Capability_r5_ext2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDCP_Capability_r5_ext2
