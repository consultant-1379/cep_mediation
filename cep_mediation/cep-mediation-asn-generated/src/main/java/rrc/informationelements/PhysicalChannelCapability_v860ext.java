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
 * Define the ASN1 Type PhysicalChannelCapability_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PhysicalChannelCapability_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapability_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapability_v860ext(FddPhysChCapability fddPhysChCapability, 
		    TddPhysChCapability_128 tddPhysChCapability_128)
    {
	setFddPhysChCapability(fddPhysChCapability);
	setTddPhysChCapability_128(tddPhysChCapability_128);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddPhysChCapability();
	mComponents[1] = new TddPhysChCapability_128();
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
		return new FddPhysChCapability();
	    case 1:
		return new TddPhysChCapability_128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fddPhysChCapability"
    public FddPhysChCapability getFddPhysChCapability()
    {
	return (FddPhysChCapability)mComponents[0];
    }
    
    public void setFddPhysChCapability(FddPhysChCapability fddPhysChCapability)
    {
	mComponents[0] = fddPhysChCapability;
    }
    
    public boolean hasFddPhysChCapability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFddPhysChCapability()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type FddPhysChCapability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class FddPhysChCapability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public FddPhysChCapability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public FddPhysChCapability(DL_PhysChCapabilityFDD_v860ext downlinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityFDD_v860ext();
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
		    return new DL_PhysChCapabilityFDD_v860ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityFDD_v860ext getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityFDD_v860ext)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityFDD_v860ext downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PhysicalChannelCapability_v860ext$FddPhysChCapability"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_PhysChCapabilityFDD_v860ext"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityFDD-v860ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityFDD_v860ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityFDD_v860ext"
				    )
				),
				0
			    )
			),
			"downlinkPhysChCapability",
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
	 * Get the type descriptor (TypeInfo) of 'this' FddPhysChCapability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' FddPhysChCapability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for FddPhysChCapability

    // Methods for field "tddPhysChCapability_128"
    public TddPhysChCapability_128 getTddPhysChCapability_128()
    {
	return (TddPhysChCapability_128)mComponents[1];
    }
    
    public void setTddPhysChCapability_128(TddPhysChCapability_128 tddPhysChCapability_128)
    {
	mComponents[1] = tddPhysChCapability_128;
    }
    
    public boolean hasTddPhysChCapability_128()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTddPhysChCapability_128()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type TddPhysChCapability_128 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class TddPhysChCapability_128 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public TddPhysChCapability_128()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public TddPhysChCapability_128(DL_PhysChCapabilityTDD_128_v860ext downlinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityTDD_128_v860ext();
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
		    return new DL_PhysChCapabilityTDD_128_v860ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityTDD_128_v860ext getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityTDD_128_v860ext)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityTDD_128_v860ext downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PhysicalChannelCapability_v860ext$TddPhysChCapability_128"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "DL_PhysChCapabilityTDD_128_v860ext"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityTDD-128-v860ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD_128_v860ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD_128_v860ext"
				    )
				),
				0
			    )
			),
			"downlinkPhysChCapability",
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
	 * Get the type descriptor (TypeInfo) of 'this' TddPhysChCapability_128 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TddPhysChCapability_128 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TddPhysChCapability_128

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
	    "PhysicalChannelCapability_v860ext"
	),
	new QName (
	    "InformationElements",
	    "PhysicalChannelCapability-v860ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_v860ext$FddPhysChCapability"
			)
		    ),
		    "fddPhysChCapability",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_v860ext$TddPhysChCapability_128"
			)
		    ),
		    "tddPhysChCapability-128",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapability_v860ext
