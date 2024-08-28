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
 * Define the ASN1 Type PhysicalChannelCapability from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PhysicalChannelCapability extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapability(FddPhysChCapability fddPhysChCapability, 
		    TddPhysChCapability tddPhysChCapability)
    {
	setFddPhysChCapability(fddPhysChCapability);
	setTddPhysChCapability(tddPhysChCapability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new FddPhysChCapability();
	mComponents[1] = new TddPhysChCapability();
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
		return new TddPhysChCapability();
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
	public FddPhysChCapability(DL_PhysChCapabilityFDD downlinkPhysChCapability, 
			UL_PhysChCapabilityFDD uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityFDD();
	    mComponents[1] = new UL_PhysChCapabilityFDD();
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
		    return new DL_PhysChCapabilityFDD();
		case 1:
		    return new UL_PhysChCapabilityFDD();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityFDD getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityFDD)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityFDD downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public UL_PhysChCapabilityFDD getUplinkPhysChCapability()
	{
	    return (UL_PhysChCapabilityFDD)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(UL_PhysChCapabilityFDD uplinkPhysChCapability)
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
		"PhysicalChannelCapability$FddPhysChCapability"
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
				    "DL_PhysChCapabilityFDD"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityFDD"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityFDD"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityFDD"
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

    // Methods for field "tddPhysChCapability"
    public TddPhysChCapability getTddPhysChCapability()
    {
	return (TddPhysChCapability)mComponents[1];
    }
    
    public void setTddPhysChCapability(TddPhysChCapability tddPhysChCapability)
    {
	mComponents[1] = tddPhysChCapability;
    }
    
    public boolean hasTddPhysChCapability()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTddPhysChCapability()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type TddPhysChCapability from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class TddPhysChCapability extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public TddPhysChCapability()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public TddPhysChCapability(DL_PhysChCapabilityTDD downlinkPhysChCapability, 
			UL_PhysChCapabilityTDD uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityTDD();
	    mComponents[1] = new UL_PhysChCapabilityTDD();
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
		    return new DL_PhysChCapabilityTDD();
		case 1:
		    return new UL_PhysChCapabilityTDD();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityTDD getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityTDD)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityTDD downlinkPhysChCapability)
	{
	    mComponents[0] = downlinkPhysChCapability;
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public UL_PhysChCapabilityTDD getUplinkPhysChCapability()
	{
	    return (UL_PhysChCapabilityTDD)mComponents[1];
	}
	
	public void setUplinkPhysChCapability(UL_PhysChCapabilityTDD uplinkPhysChCapability)
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
		"rrc.informationelements",
		"PhysicalChannelCapability$TddPhysChCapability"
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
	 * Get the type descriptor (TypeInfo) of 'this' TddPhysChCapability object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TddPhysChCapability object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TddPhysChCapability

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
	    "PhysicalChannelCapability"
	),
	new QName (
	    "InformationElements",
	    "PhysicalChannelCapability"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapability$FddPhysChCapability"
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
			    "PhysicalChannelCapability$TddPhysChCapability"
			)
		    ),
		    "tddPhysChCapability",
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapability
