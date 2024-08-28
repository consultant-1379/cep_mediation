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
 * Define the ASN1 Type IntraFreqMeasQuantity_TDD_sib3List from ASN1 Module InformationElements.
 * @see SequenceOf
 */

public class IntraFreqMeasQuantity_TDD_sib3List extends SequenceOf {
    
    /**
     * The default constructor.
     */
    public IntraFreqMeasQuantity_TDD_sib3List()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public IntraFreqMeasQuantity_TDD_sib3List(Enumerated_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Enumerated_ from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Enumerated_ extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Enumerated_()
	{
	    super(cFirstNumber);
	}
	
	protected Enumerated_(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Enumerated_ primaryCCPCH_RSCP =
	    new Enumerated_(0);
	public static final Enumerated_ timeslotISCP =
	    new Enumerated_(1);
	private final static Enumerated_ cNamedNumbers[] = {
	     primaryCCPCH_RSCP, 
	     timeslotISCP
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
	
	public static Enumerated_ valueOf(long value)
	{
	    return (Enumerated_)primaryCCPCH_RSCP.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    0x000a
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"IntraFreqMeasQuantity_TDD_sib3List$Enumerated_"
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
			"primaryCCPCH-RSCP",
			0
		    ),
		    new MemberListElement (
			"timeslotISCP",
			1
		    )
		}
	    ),
	    0,
	    primaryCCPCH_RSCP
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Enumerated_ object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Enumerated_ object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Enumerated_

    /**
     * Add an Element to the SEQUENCE OF/SET OF.
     */
    public synchronized void add(Enumerated_ element)
    {
	super.addElement(element);
    }
    
    /**
     * Set an Element in the SEQUENCE OF/SET OF.
     */
    public synchronized void set(Enumerated_ element, int atIndex)
    {
	super.setElement(element, atIndex);
    }
    
    /**
     * Get an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized Enumerated_ get(int atIndex)
    {
	return (Enumerated_)super.getElement(atIndex);
    }
    
    /**
     * Insert an Element into the SEQUENCE OF/SET OF.
     */
    public synchronized void insert(Enumerated_ element, int atIndex)
    {
	super.insertElement(element, atIndex);
    }
    
    /**
     * Remove an Element from the SEQUENCE OF/SET OF.
     */
    public synchronized void remove(Enumerated_ element)
    {
	super.removeElement(element);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return Enumerated_.primaryCCPCH_RSCP;
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "rrc.informationelements",
	    "IntraFreqMeasQuantity_TDD_sib3List"
	),
	new QName (
	    "InformationElements",
	    "IntraFreqMeasQuantity-TDD-sib3List"
	),
	12314,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new com.oss.asn1.INTEGER(1), 
		    new com.oss.asn1.INTEGER(2),
		    0
		)
	    )
	),
	new Bounds (
	    new java.lang.Long(1),
	    new java.lang.Long(2)
	),
	new TypeInfoRef (
	    new QName (
		"rrc.informationelements",
		"IntraFreqMeasQuantity_TDD_sib3List$Enumerated_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity_TDD_sib3List object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntraFreqMeasQuantity_TDD_sib3List object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntraFreqMeasQuantity_TDD_sib3List
