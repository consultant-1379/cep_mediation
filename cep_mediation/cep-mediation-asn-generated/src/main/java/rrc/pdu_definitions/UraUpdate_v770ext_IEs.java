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
 * Define the ASN1 Type UraUpdate_v770ext_IEs from ASN1 Module PDU_definitions.
 * @see Sequence
 */

public class UraUpdate_v770ext_IEs extends Sequence {
    
    /**
     * The default constructor.
     */
    public UraUpdate_v770ext_IEs()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UraUpdate_v770ext_IEs(Support_hsdschReception_CellUraPch support_hsdschReception_CellUraPch, 
		    Support_hsdschReception_CellFach support_hsdschReception_CellFach)
    {
	setSupport_hsdschReception_CellUraPch(support_hsdschReception_CellUraPch);
	setSupport_hsdschReception_CellFach(support_hsdschReception_CellFach);
    }
    
    public void initComponents()
    {
	mComponents[0] = Support_hsdschReception_CellUraPch._true;
	mComponents[1] = Support_hsdschReception_CellFach._true;
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
		return Support_hsdschReception_CellUraPch._true;
	    case 1:
		return Support_hsdschReception_CellFach._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "support_hsdschReception_CellUraPch"
    public Support_hsdschReception_CellUraPch getSupport_hsdschReception_CellUraPch()
    {
	return (Support_hsdschReception_CellUraPch)mComponents[0];
    }
    
    public void setSupport_hsdschReception_CellUraPch(Support_hsdschReception_CellUraPch support_hsdschReception_CellUraPch)
    {
	mComponents[0] = support_hsdschReception_CellUraPch;
    }
    
    public boolean hasSupport_hsdschReception_CellUraPch()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSupport_hsdschReception_CellUraPch()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Support_hsdschReception_CellUraPch from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class Support_hsdschReception_CellUraPch extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Support_hsdschReception_CellUraPch()
	{
	    super(cFirstNumber);
	}
	
	protected Support_hsdschReception_CellUraPch(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Support_hsdschReception_CellUraPch _true =
	    new Support_hsdschReception_CellUraPch(0);
	private final static Support_hsdschReception_CellUraPch cNamedNumbers[] = {
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
	
	public static Support_hsdschReception_CellUraPch valueOf(long value)
	{
	    return (Support_hsdschReception_CellUraPch)_true.lookupValue(value);
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
		"UraUpdate_v770ext_IEs$Support_hsdschReception_CellUraPch"
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
	 * Get the type descriptor (TypeInfo) of 'this' Support_hsdschReception_CellUraPch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Support_hsdschReception_CellUraPch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Support_hsdschReception_CellUraPch

    // Methods for field "support_hsdschReception_CellFach"
    public Support_hsdschReception_CellFach getSupport_hsdschReception_CellFach()
    {
	return (Support_hsdschReception_CellFach)mComponents[1];
    }
    
    public void setSupport_hsdschReception_CellFach(Support_hsdschReception_CellFach support_hsdschReception_CellFach)
    {
	mComponents[1] = support_hsdschReception_CellFach;
    }
    
    public boolean hasSupport_hsdschReception_CellFach()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupport_hsdschReception_CellFach()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Support_hsdschReception_CellFach from ASN1 Module PDU_definitions.
     * @see Enumerated
     */
    public static final class Support_hsdschReception_CellFach extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Support_hsdschReception_CellFach()
	{
	    super(cFirstNumber);
	}
	
	protected Support_hsdschReception_CellFach(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Support_hsdschReception_CellFach _true =
	    new Support_hsdschReception_CellFach(0);
	private final static Support_hsdschReception_CellFach cNamedNumbers[] = {
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
	
	public static Support_hsdschReception_CellFach valueOf(long value)
	{
	    return (Support_hsdschReception_CellFach)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.pdu_definitions",
		"UraUpdate_v770ext_IEs$Support_hsdschReception_CellFach"
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
	 * Get the type descriptor (TypeInfo) of 'this' Support_hsdschReception_CellFach object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Support_hsdschReception_CellFach object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Support_hsdschReception_CellFach

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
	    "UraUpdate_v770ext_IEs"
	),
	new QName (
	    "PDU-definitions",
	    "UraUpdate-v770ext-IEs"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UraUpdate_v770ext_IEs$Support_hsdschReception_CellUraPch"
			)
		    ),
		    "support-hsdschReception-CellUraPch",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.pdu_definitions",
			    "UraUpdate_v770ext_IEs$Support_hsdschReception_CellFach"
			)
		    ),
		    "support-hsdschReception-CellFach",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' UraUpdate_v770ext_IEs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UraUpdate_v770ext_IEs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UraUpdate_v770ext_IEs
