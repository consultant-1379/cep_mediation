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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_128_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_128_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_128_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_128_v860ext(HSDSCH_physical_layer_category_extension hSDSCH_physical_layer_category_extension, 
		    MultiCarrier_HSDSCH_physical_layer_category_extension multiCarrier_physical_layer_category_extension, 
		    SupportOfSFModeForHSPDSCHDualStream supportOfSFModeForHSPDSCHDualStream)
    {
	setHSDSCH_physical_layer_category_extension(hSDSCH_physical_layer_category_extension);
	setMultiCarrier_physical_layer_category_extension(multiCarrier_physical_layer_category_extension);
	setSupportOfSFModeForHSPDSCHDualStream(supportOfSFModeForHSPDSCHDualStream);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category_extension();
	mComponents[1] = new MultiCarrier_HSDSCH_physical_layer_category_extension();
	mComponents[2] = SupportOfSFModeForHSPDSCHDualStream.sf1;
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
		return new HSDSCH_physical_layer_category_extension();
	    case 1:
		return new MultiCarrier_HSDSCH_physical_layer_category_extension();
	    case 2:
		return SupportOfSFModeForHSPDSCHDualStream.sf1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hSDSCH_physical_layer_category_extension"
    public HSDSCH_physical_layer_category_extension getHSDSCH_physical_layer_category_extension()
    {
	return (HSDSCH_physical_layer_category_extension)mComponents[0];
    }
    
    public void setHSDSCH_physical_layer_category_extension(HSDSCH_physical_layer_category_extension hSDSCH_physical_layer_category_extension)
    {
	mComponents[0] = hSDSCH_physical_layer_category_extension;
    }
    
    public boolean hasHSDSCH_physical_layer_category_extension()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHSDSCH_physical_layer_category_extension()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "multiCarrier_physical_layer_category_extension"
    public MultiCarrier_HSDSCH_physical_layer_category_extension getMultiCarrier_physical_layer_category_extension()
    {
	return (MultiCarrier_HSDSCH_physical_layer_category_extension)mComponents[1];
    }
    
    public void setMultiCarrier_physical_layer_category_extension(MultiCarrier_HSDSCH_physical_layer_category_extension multiCarrier_physical_layer_category_extension)
    {
	mComponents[1] = multiCarrier_physical_layer_category_extension;
    }
    
    public boolean hasMultiCarrier_physical_layer_category_extension()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMultiCarrier_physical_layer_category_extension()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "supportOfSFModeForHSPDSCHDualStream"
    public SupportOfSFModeForHSPDSCHDualStream getSupportOfSFModeForHSPDSCHDualStream()
    {
	return (SupportOfSFModeForHSPDSCHDualStream)mComponents[2];
    }
    
    public void setSupportOfSFModeForHSPDSCHDualStream(SupportOfSFModeForHSPDSCHDualStream supportOfSFModeForHSPDSCHDualStream)
    {
	mComponents[2] = supportOfSFModeForHSPDSCHDualStream;
    }
    
    public boolean hasSupportOfSFModeForHSPDSCHDualStream()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfSFModeForHSPDSCHDualStream()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfSFModeForHSPDSCHDualStream from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfSFModeForHSPDSCHDualStream extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfSFModeForHSPDSCHDualStream()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfSFModeForHSPDSCHDualStream(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfSFModeForHSPDSCHDualStream sf1 =
	    new SupportOfSFModeForHSPDSCHDualStream(0);
	public static final SupportOfSFModeForHSPDSCHDualStream sf1sf16 =
	    new SupportOfSFModeForHSPDSCHDualStream(1);
	private final static SupportOfSFModeForHSPDSCHDualStream cNamedNumbers[] = {
	     sf1, 
	     sf1sf16
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
	
	public static SupportOfSFModeForHSPDSCHDualStream valueOf(long value)
	{
	    return (SupportOfSFModeForHSPDSCHDualStream)sf1.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_PhysChCapabilityTDD_128_v860ext$SupportOfSFModeForHSPDSCHDualStream"
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
			"sf1",
			0
		    ),
		    new MemberListElement (
			"sf1sf16",
			1
		    )
		}
	    ),
	    0,
	    sf1
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfSFModeForHSPDSCHDualStream object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfSFModeForHSPDSCHDualStream object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfSFModeForHSPDSCHDualStream

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
	    "DL_PhysChCapabilityTDD_128_v860ext"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityTDD-128-v860ext"
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
				"rrc.informationelements",
				"HSDSCH_physical_layer_category_extension"
			    ),
			    new QName (
				"InformationElements",
				"HSDSCH-physical-layer-category-extension"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HSDSCH_physical_layer_category_extension(1), 
				    new HSDSCH_physical_layer_category_extension(64),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    ),
			    null
			)
		    ),
		    "hSDSCH-physical-layer-category-extension",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MultiCarrier_HSDSCH_physical_layer_category_extension"
			    ),
			    new QName (
				"InformationElements",
				"MultiCarrier-HSDSCH-physical-layer-category-extension"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MultiCarrier_HSDSCH_physical_layer_category_extension(1), 
				    new MultiCarrier_HSDSCH_physical_layer_category_extension(36),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(36)
			    ),
			    null
			)
		    ),
		    "multiCarrier-physical-layer-category-extension",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityTDD_128_v860ext$SupportOfSFModeForHSPDSCHDualStream"
			)
		    ),
		    "supportOfSFModeForHSPDSCHDualStream",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_128_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_128_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_128_v860ext
