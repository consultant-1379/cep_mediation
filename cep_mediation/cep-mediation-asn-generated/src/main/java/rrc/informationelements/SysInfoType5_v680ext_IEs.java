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
 * Define the ASN1 Type SysInfoType5_v680ext_IEs from ASN1 Module InformationElements.
 * @see Sequence
 */

public class SysInfoType5_v680ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public SysInfoType5_v680ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SysInfoType5_v680ext_IEs(Hsdpa_CellIndicator hsdpa_CellIndicator)
    {
	setHsdpa_CellIndicator(hsdpa_CellIndicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = Hsdpa_CellIndicator.hsdpa_CapableCell;
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
		return Hsdpa_CellIndicator.hsdpa_CapableCell;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hsdpa_CellIndicator"
    public Hsdpa_CellIndicator getHsdpa_CellIndicator()
    {
	return (Hsdpa_CellIndicator)mComponents[0];
    }
    
    public void setHsdpa_CellIndicator(Hsdpa_CellIndicator hsdpa_CellIndicator)
    {
	mComponents[0] = hsdpa_CellIndicator;
    }
    
    public boolean hasHsdpa_CellIndicator()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHsdpa_CellIndicator()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Hsdpa_CellIndicator from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Hsdpa_CellIndicator extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Hsdpa_CellIndicator()
	{
	    super(cFirstNumber);
	}
	
	protected Hsdpa_CellIndicator(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Hsdpa_CellIndicator hsdpa_CapableCell =
	    new Hsdpa_CellIndicator(0);
	private final static Hsdpa_CellIndicator cNamedNumbers[] = {
	     hsdpa_CapableCell
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
	
	public static Hsdpa_CellIndicator valueOf(long value)
	{
	    return (Hsdpa_CellIndicator)hsdpa_CapableCell.lookupValue(value);
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
		"SysInfoType5_v680ext_IEs$Hsdpa_CellIndicator"
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
			"hsdpa-CapableCell",
			0
		    )
		}
	    ),
	    0,
	    hsdpa_CapableCell
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Hsdpa_CellIndicator object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Hsdpa_CellIndicator object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Hsdpa_CellIndicator

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
	    "SysInfoType5_v680ext_IEs"
	),
	new QName (
	    "InformationElements",
	    "SysInfoType5-v680ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SysInfoType5_v680ext_IEs$Hsdpa_CellIndicator"
			)
		    ),
		    "hsdpa-CellIndicator",
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
     * Get the type descriptor (TypeInfo) of 'this' SysInfoType5_v680ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SysInfoType5_v680ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SysInfoType5_v680ext_IEs
