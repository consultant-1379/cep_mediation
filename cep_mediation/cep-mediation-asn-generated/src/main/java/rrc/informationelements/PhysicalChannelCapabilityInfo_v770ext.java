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
 * Define the ASN1 Type PhysicalChannelCapabilityInfo_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PhysicalChannelCapabilityInfo_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public PhysicalChannelCapabilityInfo_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PhysicalChannelCapabilityInfo_v770ext(TddPhysChCapability_768 tddPhysChCapability_768, 
		    TddPhysChCapability_128 tddPhysChCapability_128)
    {
	setTddPhysChCapability_768(tddPhysChCapability_768);
	setTddPhysChCapability_128(tddPhysChCapability_128);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TddPhysChCapability_768();
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
		return new TddPhysChCapability_768();
	    case 1:
		return new TddPhysChCapability_128();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tddPhysChCapability_768"
    public TddPhysChCapability_768 getTddPhysChCapability_768()
    {
	return (TddPhysChCapability_768)mComponents[0];
    }
    
    public void setTddPhysChCapability_768(TddPhysChCapability_768 tddPhysChCapability_768)
    {
	mComponents[0] = tddPhysChCapability_768;
    }
    
    public boolean hasTddPhysChCapability_768()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTddPhysChCapability_768()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type TddPhysChCapability_768 from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class TddPhysChCapability_768 extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public TddPhysChCapability_768()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public TddPhysChCapability_768(DL_PhysChCapabilityInfoTDD_768 downlinkPhysChCapability, 
			UL_PhysChCapabilityTDD uplinkPhysChCapability)
	{
	    setDownlinkPhysChCapability(downlinkPhysChCapability);
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new DL_PhysChCapabilityInfoTDD_768();
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
		    return new DL_PhysChCapabilityInfoTDD_768();
		case 1:
		    return new UL_PhysChCapabilityTDD();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "downlinkPhysChCapability"
	public DL_PhysChCapabilityInfoTDD_768 getDownlinkPhysChCapability()
	{
	    return (DL_PhysChCapabilityInfoTDD_768)mComponents[0];
	}
	
	public void setDownlinkPhysChCapability(DL_PhysChCapabilityInfoTDD_768 downlinkPhysChCapability)
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"PhysicalChannelCapabilityInfo_v770ext$TddPhysChCapability_768"
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
				    "DL_PhysChCapabilityInfoTDD_768"
				),
				new QName (
				    "InformationElements",
				    "DL-PhysChCapabilityInfoTDD-768"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityInfoTDD_768"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"DL_PhysChCapabilityInfoTDD_768"
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
	 * Get the type descriptor (TypeInfo) of 'this' TddPhysChCapability_768 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TddPhysChCapability_768 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TddPhysChCapability_768

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
	public TddPhysChCapability_128(UL_PhysChCapabilityInfoTDD_128_v770ext uplinkPhysChCapability)
	{
	    setUplinkPhysChCapability(uplinkPhysChCapability);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new UL_PhysChCapabilityInfoTDD_128_v770ext();
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
		    return new UL_PhysChCapabilityInfoTDD_128_v770ext();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "uplinkPhysChCapability"
	public UL_PhysChCapabilityInfoTDD_128_v770ext getUplinkPhysChCapability()
	{
	    return (UL_PhysChCapabilityInfoTDD_128_v770ext)mComponents[0];
	}
	
	public void setUplinkPhysChCapability(UL_PhysChCapabilityInfoTDD_128_v770ext uplinkPhysChCapability)
	{
	    mComponents[0] = uplinkPhysChCapability;
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
		"PhysicalChannelCapabilityInfo_v770ext$TddPhysChCapability_128"
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
				    "UL_PhysChCapabilityInfoTDD_128_v770ext"
				),
				new QName (
				    "InformationElements",
				    "UL-PhysChCapabilityInfoTDD-128-v770ext"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityInfoTDD_128_v770ext"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"UL_PhysChCapabilityInfoTDD_128_v770ext"
				    )
				),
				0
			    )
			),
			"uplinkPhysChCapability",
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
	    "PhysicalChannelCapabilityInfo_v770ext"
	),
	new QName (
	    "InformationElements",
	    "PhysicalChannelCapabilityInfo-v770ext"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapabilityInfo_v770ext$TddPhysChCapability_768"
			)
		    ),
		    "tddPhysChCapability-768",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "PhysicalChannelCapabilityInfo_v770ext$TddPhysChCapability_128"
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
     * Get the type descriptor (TypeInfo) of 'this' PhysicalChannelCapabilityInfo_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhysicalChannelCapabilityInfo_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhysicalChannelCapabilityInfo_v770ext
