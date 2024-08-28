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
 * Define the ASN1 Type MeasurementValidity from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MeasurementValidity extends Sequence {
    
    /**
     * The default constructor.
     */
    public MeasurementValidity()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MeasurementValidity(Ue_State ue_State)
    {
	setUe_State(ue_State);
    }
    
    public void initComponents()
    {
	mComponents[0] = Ue_State.cell_DCH;
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
		return Ue_State.cell_DCH;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_State"
    public Ue_State getUe_State()
    {
	return (Ue_State)mComponents[0];
    }
    
    public void setUe_State(Ue_State ue_State)
    {
	mComponents[0] = ue_State;
    }
    
    
    
    /**
     * Define the ASN1 Type Ue_State from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Ue_State extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Ue_State()
	{
	    super(cFirstNumber);
	}
	
	protected Ue_State(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Ue_State cell_DCH =
	    new Ue_State(0);
	public static final Ue_State all_But_Cell_DCH =
	    new Ue_State(1);
	public static final Ue_State all_States =
	    new Ue_State(2);
	private final static Ue_State cNamedNumbers[] = {
	     cell_DCH, 
	     all_But_Cell_DCH, 
	     all_States
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
	
	public static Ue_State valueOf(long value)
	{
	    return (Ue_State)cell_DCH.lookupValue(value);
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
		"MeasurementValidity$Ue_State"
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
			"cell-DCH",
			0
		    ),
		    new MemberListElement (
			"all-But-Cell-DCH",
			1
		    ),
		    new MemberListElement (
			"all-States",
			2
		    )
		}
	    ),
	    0,
	    cell_DCH
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Ue_State object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Ue_State object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Ue_State

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
	    "MeasurementValidity"
	),
	new QName (
	    "InformationElements",
	    "MeasurementValidity"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MeasurementValidity$Ue_State"
			)
		    ),
		    "ue-State",
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
     * Get the type descriptor (TypeInfo) of 'this' MeasurementValidity object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MeasurementValidity object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MeasurementValidity
