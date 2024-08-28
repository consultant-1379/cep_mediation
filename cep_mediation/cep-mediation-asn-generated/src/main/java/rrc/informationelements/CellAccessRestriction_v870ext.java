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
 * Define the ASN1 Type CellAccessRestriction_v870ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class CellAccessRestriction_v870ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public CellAccessRestriction_v870ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CellAccessRestriction_v870ext(CellReservedForCSG cellReservedForCSG)
    {
	setCellReservedForCSG(cellReservedForCSG);
    }
    
    public void initComponents()
    {
	mComponents[0] = CellReservedForCSG._true;
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
		return CellReservedForCSG._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cellReservedForCSG"
    public CellReservedForCSG getCellReservedForCSG()
    {
	return (CellReservedForCSG)mComponents[0];
    }
    
    public void setCellReservedForCSG(CellReservedForCSG cellReservedForCSG)
    {
	mComponents[0] = cellReservedForCSG;
    }
    
    public boolean hasCellReservedForCSG()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCellReservedForCSG()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type CellReservedForCSG from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class CellReservedForCSG extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private CellReservedForCSG()
	{
	    super(cFirstNumber);
	}
	
	protected CellReservedForCSG(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final CellReservedForCSG _true =
	    new CellReservedForCSG(0);
	private final static CellReservedForCSG cNamedNumbers[] = {
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
	
	public static CellReservedForCSG valueOf(long value)
	{
	    return (CellReservedForCSG)_true.lookupValue(value);
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
		"CellAccessRestriction_v870ext$CellReservedForCSG"
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
	 * Get the type descriptor (TypeInfo) of 'this' CellReservedForCSG object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CellReservedForCSG object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CellReservedForCSG

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
	    "CellAccessRestriction_v870ext"
	),
	new QName (
	    "InformationElements",
	    "CellAccessRestriction-v870ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "CellAccessRestriction_v870ext$CellReservedForCSG"
			)
		    ),
		    "cellReservedForCSG",
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
     * Get the type descriptor (TypeInfo) of 'this' CellAccessRestriction_v870ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CellAccessRestriction_v870ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CellAccessRestriction_v870ext
