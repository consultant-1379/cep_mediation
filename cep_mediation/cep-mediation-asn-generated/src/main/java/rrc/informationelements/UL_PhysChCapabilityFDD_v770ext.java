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
 * Define the ASN1 Type UL_PhysChCapabilityFDD_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityFDD_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityFDD_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityFDD_v770ext(INTEGER edch_PhysicalLayerCategory_extension, 
		    DiscontinuousDpcchTransmission discontinuousDpcchTransmission, 
		    SlotFormat4 slotFormat4)
    {
	setEdch_PhysicalLayerCategory_extension(edch_PhysicalLayerCategory_extension);
	setDiscontinuousDpcchTransmission(discontinuousDpcchTransmission);
	setSlotFormat4(slotFormat4);
    }
    
    /**
     * Construct with components.
     */
    public UL_PhysChCapabilityFDD_v770ext(long edch_PhysicalLayerCategory_extension, 
		    DiscontinuousDpcchTransmission discontinuousDpcchTransmission, 
		    SlotFormat4 slotFormat4)
    {
	this(new INTEGER(edch_PhysicalLayerCategory_extension), 
	     discontinuousDpcchTransmission, slotFormat4);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = DiscontinuousDpcchTransmission._true;
	mComponents[2] = SlotFormat4._true;
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
		return new INTEGER();
	    case 1:
		return DiscontinuousDpcchTransmission._true;
	    case 2:
		return SlotFormat4._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "edch_PhysicalLayerCategory_extension"
    public long getEdch_PhysicalLayerCategory_extension()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setEdch_PhysicalLayerCategory_extension(long edch_PhysicalLayerCategory_extension)
    {
	setEdch_PhysicalLayerCategory_extension(new INTEGER(edch_PhysicalLayerCategory_extension));
    }
    
    public void setEdch_PhysicalLayerCategory_extension(INTEGER edch_PhysicalLayerCategory_extension)
    {
	mComponents[0] = edch_PhysicalLayerCategory_extension;
    }
    
    public boolean hasEdch_PhysicalLayerCategory_extension()
    {
	return componentIsPresent(0);
    }
    
    public void deleteEdch_PhysicalLayerCategory_extension()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "discontinuousDpcchTransmission"
    public DiscontinuousDpcchTransmission getDiscontinuousDpcchTransmission()
    {
	return (DiscontinuousDpcchTransmission)mComponents[1];
    }
    
    public void setDiscontinuousDpcchTransmission(DiscontinuousDpcchTransmission discontinuousDpcchTransmission)
    {
	mComponents[1] = discontinuousDpcchTransmission;
    }
    
    public boolean hasDiscontinuousDpcchTransmission()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDiscontinuousDpcchTransmission()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type DiscontinuousDpcchTransmission from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class DiscontinuousDpcchTransmission extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DiscontinuousDpcchTransmission()
	{
	    super(cFirstNumber);
	}
	
	protected DiscontinuousDpcchTransmission(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final DiscontinuousDpcchTransmission _true =
	    new DiscontinuousDpcchTransmission(0);
	private final static DiscontinuousDpcchTransmission cNamedNumbers[] = {
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
	
	public static DiscontinuousDpcchTransmission valueOf(long value)
	{
	    return (DiscontinuousDpcchTransmission)_true.lookupValue(value);
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
		"UL_PhysChCapabilityFDD_v770ext$DiscontinuousDpcchTransmission"
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
	 * Get the type descriptor (TypeInfo) of 'this' DiscontinuousDpcchTransmission object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DiscontinuousDpcchTransmission object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DiscontinuousDpcchTransmission

    // Methods for field "slotFormat4"
    public SlotFormat4 getSlotFormat4()
    {
	return (SlotFormat4)mComponents[2];
    }
    
    public void setSlotFormat4(SlotFormat4 slotFormat4)
    {
	mComponents[2] = slotFormat4;
    }
    
    public boolean hasSlotFormat4()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSlotFormat4()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SlotFormat4 from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SlotFormat4 extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SlotFormat4()
	{
	    super(cFirstNumber);
	}
	
	protected SlotFormat4(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SlotFormat4 _true =
	    new SlotFormat4(0);
	private final static SlotFormat4 cNamedNumbers[] = {
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
	
	public static SlotFormat4 valueOf(long value)
	{
	    return (SlotFormat4)_true.lookupValue(value);
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
		"UL_PhysChCapabilityFDD_v770ext$SlotFormat4"
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
	 * Get the type descriptor (TypeInfo) of 'this' SlotFormat4 object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SlotFormat4 object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SlotFormat4

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
	    "UL_PhysChCapabilityFDD_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityFDD-v770ext"
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
			    new SingleValueConstraint (
				new com.oss.asn1.INTEGER(7)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "edch-PhysicalLayerCategory-extension",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_PhysChCapabilityFDD_v770ext$DiscontinuousDpcchTransmission"
			)
		    ),
		    "discontinuousDpcchTransmission",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_PhysChCapabilityFDD_v770ext$SlotFormat4"
			)
		    ),
		    "slotFormat4",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityFDD_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityFDD_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityFDD_v770ext
