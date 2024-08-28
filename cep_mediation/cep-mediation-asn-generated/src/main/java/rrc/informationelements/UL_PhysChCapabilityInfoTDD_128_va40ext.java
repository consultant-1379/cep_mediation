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
 * Define the ASN1 Type UL_PhysChCapabilityInfoTDD_128_va40ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityInfoTDD_128_va40ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityInfoTDD_128_va40ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityInfoTDD_128_va40ext(INTEGER multiCarrier_EdchPhysicalLayerCategory_128, 
		    MaxNumberCarrierForMCHSUPA_TDD maxNumberCarrierForMCHSUPA_TDD)
    {
	setMultiCarrier_EdchPhysicalLayerCategory_128(multiCarrier_EdchPhysicalLayerCategory_128);
	setMaxNumberCarrierForMCHSUPA_TDD(maxNumberCarrierForMCHSUPA_TDD);
    }
    
    /**
     * Construct with components.
     */
    public UL_PhysChCapabilityInfoTDD_128_va40ext(long multiCarrier_EdchPhysicalLayerCategory_128, 
		    MaxNumberCarrierForMCHSUPA_TDD maxNumberCarrierForMCHSUPA_TDD)
    {
	this(new INTEGER(multiCarrier_EdchPhysicalLayerCategory_128), 
	     maxNumberCarrierForMCHSUPA_TDD);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = MaxNumberCarrierForMCHSUPA_TDD.nf_2;
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
		return new INTEGER();
	    case 1:
		return MaxNumberCarrierForMCHSUPA_TDD.nf_2;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "multiCarrier_EdchPhysicalLayerCategory_128"
    public long getMultiCarrier_EdchPhysicalLayerCategory_128()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMultiCarrier_EdchPhysicalLayerCategory_128(long multiCarrier_EdchPhysicalLayerCategory_128)
    {
	setMultiCarrier_EdchPhysicalLayerCategory_128(new INTEGER(multiCarrier_EdchPhysicalLayerCategory_128));
    }
    
    public void setMultiCarrier_EdchPhysicalLayerCategory_128(INTEGER multiCarrier_EdchPhysicalLayerCategory_128)
    {
	mComponents[0] = multiCarrier_EdchPhysicalLayerCategory_128;
    }
    
    public boolean hasMultiCarrier_EdchPhysicalLayerCategory_128()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMultiCarrier_EdchPhysicalLayerCategory_128()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "maxNumberCarrierForMCHSUPA_TDD"
    public MaxNumberCarrierForMCHSUPA_TDD getMaxNumberCarrierForMCHSUPA_TDD()
    {
	return (MaxNumberCarrierForMCHSUPA_TDD)mComponents[1];
    }
    
    public void setMaxNumberCarrierForMCHSUPA_TDD(MaxNumberCarrierForMCHSUPA_TDD maxNumberCarrierForMCHSUPA_TDD)
    {
	mComponents[1] = maxNumberCarrierForMCHSUPA_TDD;
    }
    
    public boolean hasMaxNumberCarrierForMCHSUPA_TDD()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMaxNumberCarrierForMCHSUPA_TDD()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type MaxNumberCarrierForMCHSUPA_TDD from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class MaxNumberCarrierForMCHSUPA_TDD extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private MaxNumberCarrierForMCHSUPA_TDD()
	{
	    super(cFirstNumber);
	}
	
	protected MaxNumberCarrierForMCHSUPA_TDD(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final MaxNumberCarrierForMCHSUPA_TDD nf_2 =
	    new MaxNumberCarrierForMCHSUPA_TDD(0);
	public static final MaxNumberCarrierForMCHSUPA_TDD nf_3 =
	    new MaxNumberCarrierForMCHSUPA_TDD(1);
	public static final MaxNumberCarrierForMCHSUPA_TDD nf_6 =
	    new MaxNumberCarrierForMCHSUPA_TDD(2);
	public static final MaxNumberCarrierForMCHSUPA_TDD spare =
	    new MaxNumberCarrierForMCHSUPA_TDD(3);
	private final static MaxNumberCarrierForMCHSUPA_TDD cNamedNumbers[] = {
	     nf_2, 
	     nf_3, 
	     nf_6, 
	     spare
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
	
	public static MaxNumberCarrierForMCHSUPA_TDD valueOf(long value)
	{
	    return (MaxNumberCarrierForMCHSUPA_TDD)nf_2.lookupValue(value);
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
		"rrc.informationelements",
		"UL_PhysChCapabilityInfoTDD_128_va40ext$MaxNumberCarrierForMCHSUPA_TDD"
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
			"nf-2",
			0
		    ),
		    new MemberListElement (
			"nf-3",
			1
		    ),
		    new MemberListElement (
			"nf-6",
			2
		    ),
		    new MemberListElement (
			"spare",
			3
		    )
		}
	    ),
	    0,
	    nf_2
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MaxNumberCarrierForMCHSUPA_TDD object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MaxNumberCarrierForMCHSUPA_TDD object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MaxNumberCarrierForMCHSUPA_TDD

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
	    "UL_PhysChCapabilityInfoTDD_128_va40ext"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityInfoTDD-128-va40ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "multiCarrier-EdchPhysicalLayerCategory-128",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_PhysChCapabilityInfoTDD_128_va40ext$MaxNumberCarrierForMCHSUPA_TDD"
			)
		    ),
		    "maxNumberCarrierForMCHSUPA-TDD",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityInfoTDD_128_va40ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityInfoTDD_128_va40ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityInfoTDD_128_va40ext
