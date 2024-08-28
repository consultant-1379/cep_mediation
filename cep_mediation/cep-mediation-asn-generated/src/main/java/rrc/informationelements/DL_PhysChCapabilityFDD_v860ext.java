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
 * Define the ASN1 Type DL_PhysChCapabilityFDD_v860ext from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityFDD_v860ext extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityFDD_v860ext()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityFDD_v860ext(HSDSCH_physical_layer_category_ext2 hsdsch_physical_layer_category_ext2, 
		    SupportOfTargetCellPreConfig supportOfTargetCellPreConfig, 
		    SupportOfHsdschDrxOperation supportOfHsdschDrxOperation)
    {
	setHsdsch_physical_layer_category_ext2(hsdsch_physical_layer_category_ext2);
	setSupportOfTargetCellPreConfig(supportOfTargetCellPreConfig);
	setSupportOfHsdschDrxOperation(supportOfHsdschDrxOperation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HSDSCH_physical_layer_category_ext2();
	mComponents[1] = SupportOfTargetCellPreConfig._true;
	mComponents[2] = SupportOfHsdschDrxOperation._true;
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
		return new HSDSCH_physical_layer_category_ext2();
	    case 1:
		return SupportOfTargetCellPreConfig._true;
	    case 2:
		return SupportOfHsdschDrxOperation._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hsdsch_physical_layer_category_ext2"
    public HSDSCH_physical_layer_category_ext2 getHsdsch_physical_layer_category_ext2()
    {
	return (HSDSCH_physical_layer_category_ext2)mComponents[0];
    }
    
    public void setHsdsch_physical_layer_category_ext2(HSDSCH_physical_layer_category_ext2 hsdsch_physical_layer_category_ext2)
    {
	mComponents[0] = hsdsch_physical_layer_category_ext2;
    }
    
    public boolean hasHsdsch_physical_layer_category_ext2()
    {
	return componentIsPresent(0);
    }
    
    public void deleteHsdsch_physical_layer_category_ext2()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "supportOfTargetCellPreConfig"
    public SupportOfTargetCellPreConfig getSupportOfTargetCellPreConfig()
    {
	return (SupportOfTargetCellPreConfig)mComponents[1];
    }
    
    public void setSupportOfTargetCellPreConfig(SupportOfTargetCellPreConfig supportOfTargetCellPreConfig)
    {
	mComponents[1] = supportOfTargetCellPreConfig;
    }
    
    public boolean hasSupportOfTargetCellPreConfig()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSupportOfTargetCellPreConfig()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfTargetCellPreConfig from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfTargetCellPreConfig extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfTargetCellPreConfig()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfTargetCellPreConfig(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfTargetCellPreConfig _true =
	    new SupportOfTargetCellPreConfig(0);
	private final static SupportOfTargetCellPreConfig cNamedNumbers[] = {
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
	
	public static SupportOfTargetCellPreConfig valueOf(long value)
	{
	    return (SupportOfTargetCellPreConfig)_true.lookupValue(value);
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
		"DL_PhysChCapabilityFDD_v860ext$SupportOfTargetCellPreConfig"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfTargetCellPreConfig object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfTargetCellPreConfig object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfTargetCellPreConfig

    // Methods for field "supportOfHsdschDrxOperation"
    public SupportOfHsdschDrxOperation getSupportOfHsdschDrxOperation()
    {
	return (SupportOfHsdschDrxOperation)mComponents[2];
    }
    
    public void setSupportOfHsdschDrxOperation(SupportOfHsdschDrxOperation supportOfHsdschDrxOperation)
    {
	mComponents[2] = supportOfHsdschDrxOperation;
    }
    
    public boolean hasSupportOfHsdschDrxOperation()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSupportOfHsdschDrxOperation()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type SupportOfHsdschDrxOperation from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class SupportOfHsdschDrxOperation extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SupportOfHsdschDrxOperation()
	{
	    super(cFirstNumber);
	}
	
	protected SupportOfHsdschDrxOperation(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final SupportOfHsdschDrxOperation _true =
	    new SupportOfHsdschDrxOperation(0);
	private final static SupportOfHsdschDrxOperation cNamedNumbers[] = {
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
	
	public static SupportOfHsdschDrxOperation valueOf(long value)
	{
	    return (SupportOfHsdschDrxOperation)_true.lookupValue(value);
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
		"DL_PhysChCapabilityFDD_v860ext$SupportOfHsdschDrxOperation"
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
	 * Get the type descriptor (TypeInfo) of 'this' SupportOfHsdschDrxOperation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' SupportOfHsdschDrxOperation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for SupportOfHsdschDrxOperation

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
	    "DL_PhysChCapabilityFDD_v860ext"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityFDD-v860ext"
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
				"HSDSCH_physical_layer_category_ext2"
			    ),
			    new QName (
				"InformationElements",
				"HSDSCH-physical-layer-category-ext2"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new HSDSCH_physical_layer_category_ext2(21), 
				    new HSDSCH_physical_layer_category_ext2(24),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(21),
				new java.lang.Long(24)
			    ),
			    null
			)
		    ),
		    "hsdsch-physical-layer-category-ext2",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v860ext$SupportOfTargetCellPreConfig"
			)
		    ),
		    "supportOfTargetCellPreConfig",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityFDD_v860ext$SupportOfHsdschDrxOperation"
			)
		    ),
		    "supportOfHsdschDrxOperation",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_v860ext object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_v860ext object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityFDD_v860ext
