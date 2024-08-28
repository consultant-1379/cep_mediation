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
 * Define the ASN1 Type PhysicalChannelCapability_LCR_r4 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PhysicalChannelCapability_LCR_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapability_LCR_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapability_LCR_r4(Tdd128_PhysChCapability tdd128_PhysChCapability)
    {
	setTdd128_PhysChCapability(tdd128_PhysChCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Tdd128_PhysChCapability();
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
		return new Tdd128_PhysChCapability();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tdd128_PhysChCapability"
    public Tdd128_PhysChCapability getTdd128_PhysChCapability()
    {
	return (Tdd128_PhysChCapability)mComponents[0];
    }
    
    public void setTdd128_PhysChCapability(Tdd128_PhysChCapability tdd128_PhysChCapability)
    {
	mComponents[0] = tdd128_PhysChCapability;
    }
    
    public boolean hasTdd128_PhysChCapability()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTdd128_PhysChCapability()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_PhysChCapability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class Tdd128_PhysChCapability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_PhysChCapability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd128_PhysChCapability(DL_PhysChCapabilityTDD_LCR_r4 downlinkPhysChCapability, 
			UL_PhysChCapabilityTDD_LCR_r4 uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityTDD_LCR_r4();
	    mComponents[1] = new UL_PhysChCapabilityTDD_LCR_r4();
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
		    return new DL_PhysChCapabilityTDD_LCR_r4();
		case 1:
		    return new UL_PhysChCapabilityTDD_LCR_r4();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityTDD_LCR_r4 getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityTDD_LCR_r4)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityTDD_LCR_r4 downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public UL_PhysChCapabilityTDD_LCR_r4 getUplinkPhysChCapability()
	{
	    return (UL_PhysChCapabilityTDD_LCR_r4)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(UL_PhysChCapabilityTDD_LCR_r4 uplinkPhysChCapability)
	{
	    mComponents[1] = uplinkPhysChCapability;
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
		"PhysicalChannelCapability_LCR_r4$Tdd128_PhysChCapability"
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
				    "DL_PhysChCapabilityTDD_LCR_r4"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityTDD-LCR-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD_LCR_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD_LCR_r4"
				    )
				),
				0
			    )
			),
			"downlinkPhysChCapability",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "UL_PhysChCapabilityTDD_LCR_r4"
				),
				new QName (
				    "InformationElements",
				    "UL-PhysChCapabilityTDD-LCR-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityTDD_LCR_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityTDD_LCR_r4"
				    )
				),
				0
			    )
			),
			"uplinkPhysChCapability",
			1,
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_PhysChCapability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_PhysChCapability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_PhysChCapability

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
	    "PhysicalChannelCapability_LCR_r4"
	),
	new QName (
	    "InformationElements",
	    "PhysicalChannelCapability-LCR-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability_LCR_r4$Tdd128_PhysChCapability"
			)
		    ),
		    "tdd128-PhysChCapability",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_LCR_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_LCR_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapability_LCR_r4
