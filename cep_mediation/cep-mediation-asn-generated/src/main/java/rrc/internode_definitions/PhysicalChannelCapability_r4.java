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


package rrc.internode_definitions;

import com.oss.asn1.*;
import com.oss.metadata.*;
import rrc.*;

/**
 * Define the ASN1 Type PhysicalChannelCapability_r4 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class PhysicalChannelCapability_r4 extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapability_r4()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapability_r4(FddPhysChCapability fddPhysChCapability, 
		    Tdd384_PhysChCapability tdd384_PhysChCapability, 
		    Tdd128_PhysChCapability tdd128_PhysChCapability)
    {
	setFddPhysChCapability(fddPhysChCapability);
	setTdd384_PhysChCapability(tdd384_PhysChCapability);
	setTdd128_PhysChCapability(tdd128_PhysChCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddPhysChCapability();
	mComponents[1] = new Tdd384_PhysChCapability();
	mComponents[2] = new Tdd128_PhysChCapability();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new FddPhysChCapability();
	    case 1:
		return new Tdd384_PhysChCapability();
	    case 2:
		return new Tdd128_PhysChCapability();
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
     * Define the ASN1 Type FddPhysChCapability from ASN1 Module Internode_definitions.
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
	public FddPhysChCapability(DL_PhysChCapabilityFDD_r4 downlinkPhysChCapability, 
			rrc.informationelements.UL_PhysChCapabilityFDD uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityFDD_r4();
	    mComponents[1] = new rrc.informationelements.UL_PhysChCapabilityFDD();
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
		    return new DL_PhysChCapabilityFDD_r4();
		case 1:
		    return new rrc.informationelements.UL_PhysChCapabilityFDD();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityFDD_r4 getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityFDD_r4)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityFDD_r4 downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public rrc.informationelements.UL_PhysChCapabilityFDD getUplinkPhysChCapability()
	{
	    return (rrc.informationelements.UL_PhysChCapabilityFDD)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(rrc.informationelements.UL_PhysChCapabilityFDD uplinkPhysChCapability)
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
		"rrc.internode_definitions",
		"PhysicalChannelCapability_r4$FddPhysChCapability"
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
				    "rrc.internode_definitions",
				    "DL_PhysChCapabilityFDD_r4"
				),
				new QName (
				    "Internode-definitions",
				    "DL-PhysChCapabilityFDD-r4"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.internode_definitions",
					"DL_PhysChCapabilityFDD_r4"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.internode_definitions",
					"DL_PhysChCapabilityFDD_r4"
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
				    "UL_PhysChCapabilityFDD"
				),
				new QName (
				    "InformationElements",
				    "UL-PhysChCapabilityFDD"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityFDD"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityFDD"
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

    // Methods for field "tdd384_PhysChCapability"
    public Tdd384_PhysChCapability getTdd384_PhysChCapability()
    {
	return (Tdd384_PhysChCapability)mComponents[1];
    }
    
    public void setTdd384_PhysChCapability(Tdd384_PhysChCapability tdd384_PhysChCapability)
    {
	mComponents[1] = tdd384_PhysChCapability;
    }
    
    public boolean hasTdd384_PhysChCapability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTdd384_PhysChCapability()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_PhysChCapability from ASN1 Module Internode_definitions.
     * @see Sequence
     */
    public static class Tdd384_PhysChCapability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_PhysChCapability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Tdd384_PhysChCapability(rrc.informationelements.DL_PhysChCapabilityTDD downlinkPhysChCapability, 
			rrc.informationelements.UL_PhysChCapabilityTDD uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.DL_PhysChCapabilityTDD();
	    mComponents[1] = new rrc.informationelements.UL_PhysChCapabilityTDD();
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
		    return new rrc.informationelements.DL_PhysChCapabilityTDD();
		case 1:
		    return new rrc.informationelements.UL_PhysChCapabilityTDD();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public rrc.informationelements.DL_PhysChCapabilityTDD getDownlinkPhysChCapability()
	{
	    return (rrc.informationelements.DL_PhysChCapabilityTDD)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(rrc.informationelements.DL_PhysChCapabilityTDD downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public rrc.informationelements.UL_PhysChCapabilityTDD getUplinkPhysChCapability()
	{
	    return (rrc.informationelements.UL_PhysChCapabilityTDD)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(rrc.informationelements.UL_PhysChCapabilityTDD uplinkPhysChCapability)
	{
	    mComponents[1] = uplinkPhysChCapability;
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
		"rrc.internode_definitions",
		"PhysicalChannelCapability_r4$Tdd384_PhysChCapability"
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
				    "DL_PhysChCapabilityTDD"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityTDD"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityTDD"
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
				    "UL_PhysChCapabilityTDD"
				),
				new QName (
				    "InformationElements",
				    "UL-PhysChCapabilityTDD"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityTDD"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityTDD"
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_PhysChCapability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_PhysChCapability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_PhysChCapability

    // Methods for field "tdd128_PhysChCapability"
    public Tdd128_PhysChCapability getTdd128_PhysChCapability()
    {
	return (Tdd128_PhysChCapability)mComponents[2];
    }
    
    public void setTdd128_PhysChCapability(Tdd128_PhysChCapability tdd128_PhysChCapability)
    {
	mComponents[2] = tdd128_PhysChCapability;
    }
    
    public boolean hasTdd128_PhysChCapability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTdd128_PhysChCapability()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_PhysChCapability from ASN1 Module Internode_definitions.
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
	public Tdd128_PhysChCapability(rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4 downlinkPhysChCapability, 
			rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4 uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4();
	    mComponents[1] = new rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4();
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
		    return new rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4();
		case 1:
		    return new rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4 getDownlinkPhysChCapability()
	{
	    return (rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(rrc.informationelements.DL_PhysChCapabilityTDD_LCR_r4 downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4 getUplinkPhysChCapability()
	{
	    return (rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(rrc.informationelements.UL_PhysChCapabilityTDD_LCR_r4 uplinkPhysChCapability)
	{
	    mComponents[1] = uplinkPhysChCapability;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"PhysicalChannelCapability_r4$Tdd128_PhysChCapability"
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
	    "rrc.internode_definitions",
	    "PhysicalChannelCapability_r4"
	),
	new QName (
	    "Internode-definitions",
	    "PhysicalChannelCapability-r4"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "PhysicalChannelCapability_r4$FddPhysChCapability"
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
			    "rrc.internode_definitions",
			    "PhysicalChannelCapability_r4$Tdd384_PhysChCapability"
			)
		    ),
		    "tdd384-PhysChCapability",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "PhysicalChannelCapability_r4$Tdd128_PhysChCapability"
			)
		    ),
		    "tdd128-PhysChCapability",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_r4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapability_r4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapability_r4
