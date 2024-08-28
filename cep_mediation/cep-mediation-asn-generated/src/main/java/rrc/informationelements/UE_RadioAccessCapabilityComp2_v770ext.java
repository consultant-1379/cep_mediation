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
 * Define the ASN1 Type UE_RadioAccessCapabilityComp2_v770ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_RadioAccessCapabilityComp2_v770ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_RadioAccessCapabilityComp2_v770ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_RadioAccessCapabilityComp2_v770ext(HSDSCH_physical_layer_category_ext hsdsch_physical_layer_category_ext, 
		    INTEGER edch_PhysicalLayerCategory_extension, 
		    HsscchlessHsdschOperation hsscchlessHsdschOperation, 
		    EnhancedFdpch enhancedFdpch, 
		    HsdschReception_CellFach hsdschReception_CellFach, 
		    HsdschReception_CellUraPch hsdschReception_CellUraPch, 
		    DiscontinuousDpcchTransmission discontinuousDpcchTransmission, 
		    SlotFormat4 slotFormat4, 
		    PDCP_Capability_v770ext pdcp_Capability)
    {
	setHsdsch_physical_layer_category_ext(hsdsch_physical_layer_category_ext);
	setEdch_PhysicalLayerCategory_extension(edch_PhysicalLayerCategory_extension);
	setHsscchlessHsdschOperation(hsscchlessHsdschOperation);
	setEnhancedFdpch(enhancedFdpch);
	setHsdschReception_CellFach(hsdschReception_CellFach);
	setHsdschReception_CellUraPch(hsdschReception_CellUraPch);
	setDiscontinuousDpcchTransmission(discontinuousDpcchTransmission);
	setSlotFormat4(slotFormat4);
	setPdcp_Capability(pdcp_Capability);
    }
    
    /**
     * Construct with components.
     */
    public UE_RadioAccessCapabilityComp2_v770ext(HSDSCH_physical_layer_category_ext hsdsch_physical_layer_category_ext, 
		    long edch_PhysicalLayerCategory_extension, 
		    HsscchlessHsdschOperation hsscchlessHsdschOperation, 
		    EnhancedFdpch enhancedFdpch, 
		    HsdschReception_CellFach hsdschReception_CellFach, 
		    HsdschReception_CellUraPch hsdschReception_CellUraPch, 
		    DiscontinuousDpcchTransmission discontinuousDpcchTransmission, 
		    SlotFormat4 slotFormat4, 
		    PDCP_Capability_v770ext pdcp_Capability)
    {
	this(hsdsch_physical_layer_category_ext, 
	     new INTEGER(edch_PhysicalLayerCategory_extension), 
	     hsscchlessHsdschOperation, enhancedFdpch, 
	     hsdschReception_CellFach, hsdschReception_CellUraPch, 
	     discontinuousDpcchTransmission, slotFormat4, pdcp_Capability);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category_ext();
	mComponents[1] = new INTEGER();
	mComponents[2] = HsscchlessHsdschOperation._true;
	mComponents[3] = EnhancedFdpch._true;
	mComponents[4] = HsdschReception_CellFach._true;
	mComponents[5] = HsdschReception_CellUraPch._true;
	mComponents[6] = DiscontinuousDpcchTransmission._true;
	mComponents[7] = SlotFormat4._true;
	mComponents[8] = new PDCP_Capability_v770ext();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HSDSCH_physical_layer_category_ext();
	    case 1:
		return new INTEGER();
	    case 2:
		return HsscchlessHsdschOperation._true;
	    case 3:
		return EnhancedFdpch._true;
	    case 4:
		return HsdschReception_CellFach._true;
	    case 5:
		return HsdschReception_CellUraPch._true;
	    case 6:
		return DiscontinuousDpcchTransmission._true;
	    case 7:
		return SlotFormat4._true;
	    case 8:
		return new PDCP_Capability_v770ext();
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
    
    
    // Methods for field "edch_PhysicalLayerCategory_extension"
    public long getEdch_PhysicalLayerCategory_extension()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setEdch_PhysicalLayerCategory_extension(long edch_PhysicalLayerCategory_extension)
    {
	setEdch_PhysicalLayerCategory_extension(new INTEGER(edch_PhysicalLayerCategory_extension));
    }
    
    public void setEdch_PhysicalLayerCategory_extension(INTEGER edch_PhysicalLayerCategory_extension)
    {
	mComponents[1] = edch_PhysicalLayerCategory_extension;
    }
    
    public boolean hasEdch_PhysicalLayerCategory_extension()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEdch_PhysicalLayerCategory_extension()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "hsscchlessHsdschOperation"
    public HsscchlessHsdschOperation getHsscchlessHsdschOperation()
    {
	return (HsscchlessHsdschOperation)mComponents[2];
    }
    
    public void setHsscchlessHsdschOperation(HsscchlessHsdschOperation hsscchlessHsdschOperation)
    {
	mComponents[2] = hsscchlessHsdschOperation;
    }
    
    public boolean hasHsscchlessHsdschOperation()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHsscchlessHsdschOperation()
    {
	setComponentAbsent(2);
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$HsscchlessHsdschOperation"
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
	return (EnhancedFdpch)mComponents[3];
    }
    
    public void setEnhancedFdpch(EnhancedFdpch enhancedFdpch)
    {
	mComponents[3] = enhancedFdpch;
    }
    
    public boolean hasEnhancedFdpch()
    {
	return componentIsPresent(3);
    }
    
    public void deleteEnhancedFdpch()
    {
	setComponentAbsent(3);
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$EnhancedFdpch"
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
	return (HsdschReception_CellFach)mComponents[4];
    }
    
    public void setHsdschReception_CellFach(HsdschReception_CellFach hsdschReception_CellFach)
    {
	mComponents[4] = hsdschReception_CellFach;
    }
    
    public boolean hasHsdschReception_CellFach()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHsdschReception_CellFach()
    {
	setComponentAbsent(4);
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$HsdschReception_CellFach"
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
	return (HsdschReception_CellUraPch)mComponents[5];
    }
    
    public void setHsdschReception_CellUraPch(HsdschReception_CellUraPch hsdschReception_CellUraPch)
    {
	mComponents[5] = hsdschReception_CellUraPch;
    }
    
    public boolean hasHsdschReception_CellUraPch()
    {
	return componentIsPresent(5);
    }
    
    public void deleteHsdschReception_CellUraPch()
    {
	setComponentAbsent(5);
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$HsdschReception_CellUraPch"
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

    // Methods for field "discontinuousDpcchTransmission"
    public DiscontinuousDpcchTransmission getDiscontinuousDpcchTransmission()
    {
	return (DiscontinuousDpcchTransmission)mComponents[6];
    }
    
    public void setDiscontinuousDpcchTransmission(DiscontinuousDpcchTransmission discontinuousDpcchTransmission)
    {
	mComponents[6] = discontinuousDpcchTransmission;
    }
    
    public boolean hasDiscontinuousDpcchTransmission()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDiscontinuousDpcchTransmission()
    {
	setComponentAbsent(6);
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$DiscontinuousDpcchTransmission"
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
	return (SlotFormat4)mComponents[7];
    }
    
    public void setSlotFormat4(SlotFormat4 slotFormat4)
    {
	mComponents[7] = slotFormat4;
    }
    
    public boolean hasSlotFormat4()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSlotFormat4()
    {
	setComponentAbsent(7);
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
		    (short)0x8007
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UE_RadioAccessCapabilityComp2_v770ext$SlotFormat4"
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

    // Methods for field "pdcp_Capability"
    public PDCP_Capability_v770ext getPdcp_Capability()
    {
	return (PDCP_Capability_v770ext)mComponents[8];
    }
    
    public void setPdcp_Capability(PDCP_Capability_v770ext pdcp_Capability)
    {
	mComponents[8] = pdcp_Capability;
    }
    
    public boolean hasPdcp_Capability()
    {
	return componentIsPresent(8);
    }
    
    public void deletePdcp_Capability()
    {
	setComponentAbsent(8);
    }
    
    
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
	    "UE_RadioAccessCapabilityComp2_v770ext"
	),
	new QName (
	    "InformationElements",
	    "UE-RadioAccessCapabilityComp2-v770ext"
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
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$HsscchlessHsdschOperation"
			)
		    ),
		    "hsscchlessHsdschOperation",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$EnhancedFdpch"
			)
		    ),
		    "enhancedFdpch",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$HsdschReception_CellFach"
			)
		    ),
		    "hsdschReception-CellFach",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$HsdschReception_CellUraPch"
			)
		    ),
		    "hsdschReception-CellUraPch",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$DiscontinuousDpcchTransmission"
			)
		    ),
		    "discontinuousDpcchTransmission",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UE_RadioAccessCapabilityComp2_v770ext$SlotFormat4"
			)
		    ),
		    "slotFormat4",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PDCP_Capability_v770ext"
			    ),
			    new QName (
				"InformationElements",
				"PDCP-Capability-v770ext"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_v770ext"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PDCP_Capability_v770ext"
				)
			    ),
			    0
			)
		    ),
		    "pdcp-Capability",
		    8,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2_v770ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_RadioAccessCapabilityComp2_v770ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_RadioAccessCapabilityComp2_v770ext
