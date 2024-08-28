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
 * Define the ASN1 Type DL_PhysChCapabilityFDD_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityFDD_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityFDD_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityFDD_v770ext(HSDSCH_physical_layer_category_ext hsdsch_physical_layer_category_ext, 
		    HsscchlessHsdschOperation hsscchlessHsdschOperation, 
		    EnhancedFdpch enhancedFdpch, 
		    HsdschReception_CellFach hsdschReception_CellFach, 
		    HsdschReception_CellUraPch hsdschReception_CellUraPch)
    {
	setHsdsch_physical_layer_category_ext(hsdsch_physical_layer_category_ext);
	setHsscchlessHsdschOperation(hsscchlessHsdschOperation);
	setEnhancedFdpch(enhancedFdpch);
	setHsdschReception_CellFach(hsdschReception_CellFach);
	setHsdschReception_CellUraPch(hsdschReception_CellUraPch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category_ext();
	mComponents[1] = HsscchlessHsdschOperation._true;
	mComponents[2] = EnhancedFdpch._true;
	mComponents[3] = HsdschReception_CellFach._true;
	mComponents[4] = HsdschReception_CellUraPch._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HSDSCH_physical_layer_category_ext();
	    case 1:
		return HsscchlessHsdschOperation._true;
	    case 2:
		return EnhancedFdpch._true;
	    case 3:
		return HsdschReception_CellFach._true;
	    case 4:
		return HsdschReception_CellUraPch._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hsdsch_physical_layer_category_ext"
    public HSDSCH_physical_layer_category_ext getHsdsch_physical_layer_category_ext()
    {
	return (HSDSCH_physical_layer_category_ext)mComponents[0];
    }
    
    public void setHsdsch_physical_layer_category_ext(HSDSCH_physical_layer_category_ext hsdsch_physical_layer_category_ext)
    {
	mComponents[0] = hsdsch_physical_layer_category_ext;
    }
    
    public boolean hasHsdsch_physical_layer_category_ext()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHsdsch_physical_layer_category_ext()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "hsscchlessHsdschOperation"
    public HsscchlessHsdschOperation getHsscchlessHsdschOperation()
    {
	return (HsscchlessHsdschOperation)mComponents[1];
    }
    
    public void setHsscchlessHsdschOperation(HsscchlessHsdschOperation hsscchlessHsdschOperation)
    {
	mComponents[1] = hsscchlessHsdschOperation;
    }
    
    public boolean hasHsscchlessHsdschOperation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHsscchlessHsdschOperation()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type HsscchlessHsdschOperation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class HsscchlessHsdschOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private HsscchlessHsdschOperation()
	{
	    super(cFirstNumber);
	}
	
	protected HsscchlessHsdschOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final HsscchlessHsdschOperation _true =
	    new HsscchlessHsdschOperation(0);
	private final static HsscchlessHsdschOperation cNamedNumbers[] = {
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
	
	public static HsscchlessHsdschOperation valueOf(long value)
	{
	    return (HsscchlessHsdschOperation)_true.lookupValue(value);
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
		"DL_PhysChCapabilityFDD_v770ext$HsscchlessHsdschOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' HsscchlessHsdschOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HsscchlessHsdschOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HsscchlessHsdschOperation

    // Methods for field "enhancedFdpch"
    public EnhancedFdpch getEnhancedFdpch()
    {
	return (EnhancedFdpch)mComponents[2];
    }
    
    public void setEnhancedFdpch(EnhancedFdpch enhancedFdpch)
    {
	mComponents[2] = enhancedFdpch;
    }
    
    public boolean hasEnhancedFdpch()
    {
	return componentIsPresent(2);
    }
    
    public void deleteEnhancedFdpch()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type EnhancedFdpch from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class EnhancedFdpch extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private EnhancedFdpch()
	{
	    super(cFirstNumber);
	}
	
	protected EnhancedFdpch(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final EnhancedFdpch _true =
	    new EnhancedFdpch(0);
	private final static EnhancedFdpch cNamedNumbers[] = {
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
	
	public static EnhancedFdpch valueOf(long value)
	{
	    return (EnhancedFdpch)_true.lookupValue(value);
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
		"DL_PhysChCapabilityFDD_v770ext$EnhancedFdpch"
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
	 * Get the type descriptor (TypeInfo) of 'this' EnhancedFdpch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' EnhancedFdpch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for EnhancedFdpch

    // Methods for field "hsdschReception_CellFach"
    public HsdschReception_CellFach getHsdschReception_CellFach()
    {
	return (HsdschReception_CellFach)mComponents[3];
    }
    
    public void setHsdschReception_CellFach(HsdschReception_CellFach hsdschReception_CellFach)
    {
	mComponents[3] = hsdschReception_CellFach;
    }
    
    public boolean hasHsdschReception_CellFach()
    {
	return componentIsPresent(3);
    }
    
    public void deleteHsdschReception_CellFach()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type HsdschReception_CellFach from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class HsdschReception_CellFach extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private HsdschReception_CellFach()
	{
	    super(cFirstNumber);
	}
	
	protected HsdschReception_CellFach(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final HsdschReception_CellFach _true =
	    new HsdschReception_CellFach(0);
	private final static HsdschReception_CellFach cNamedNumbers[] = {
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
	
	public static HsdschReception_CellFach valueOf(long value)
	{
	    return (HsdschReception_CellFach)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_PhysChCapabilityFDD_v770ext$HsdschReception_CellFach"
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
	 * Get the type descriptor (TypeInfo) of 'this' HsdschReception_CellFach object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HsdschReception_CellFach object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HsdschReception_CellFach

    // Methods for field "hsdschReception_CellUraPch"
    public HsdschReception_CellUraPch getHsdschReception_CellUraPch()
    {
	return (HsdschReception_CellUraPch)mComponents[4];
    }
    
    public void setHsdschReception_CellUraPch(HsdschReception_CellUraPch hsdschReception_CellUraPch)
    {
	mComponents[4] = hsdschReception_CellUraPch;
    }
    
    public boolean hasHsdschReception_CellUraPch()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHsdschReception_CellUraPch()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type HsdschReception_CellUraPch from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class HsdschReception_CellUraPch extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private HsdschReception_CellUraPch()
	{
	    super(cFirstNumber);
	}
	
	protected HsdschReception_CellUraPch(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final HsdschReception_CellUraPch _true =
	    new HsdschReception_CellUraPch(0);
	private final static HsdschReception_CellUraPch cNamedNumbers[] = {
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
	
	public static HsdschReception_CellUraPch valueOf(long value)
	{
	    return (HsdschReception_CellUraPch)_true.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_PhysChCapabilityFDD_v770ext$HsdschReception_CellUraPch"
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
	 * Get the type descriptor (TypeInfo) of 'this' HsdschReception_CellUraPch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' HsdschReception_CellUraPch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for HsdschReception_CellUraPch

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
	    "DL_PhysChCapabilityFDD_v770ext"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityFDD-v770ext"
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
				"HSDSCH_physical_layer_category_ext"
			    ),
			    new QName (
				"InformationElements",
				"HSDSCH-physical-layer-category-ext"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HSDSCH_physical_layer_category_ext(1), 
				    new HSDSCH_physical_layer_category_ext(20),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(20)
			    ),
			    null
			)
		    ),
		    "hsdsch-physical-layer-category-ext",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v770ext$HsscchlessHsdschOperation"
			)
		    ),
		    "hsscchlessHsdschOperation",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v770ext$EnhancedFdpch"
			)
		    ),
		    "enhancedFdpch",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v770ext$HsdschReception_CellFach"
			)
		    ),
		    "hsdschReception-CellFach",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v770ext$HsdschReception_CellUraPch"
			)
		    ),
		    "hsdschReception-CellUraPch",
		    4,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityFDD_v770ext
