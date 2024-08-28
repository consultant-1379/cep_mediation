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
 * Define the ASN1 Type DL_PhysChCapabilityFDD_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class DL_PhysChCapabilityFDD_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityFDD_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityFDD_r5(INTEGER maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    BOOLEAN supportForSF_512, BOOLEAN dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2, 
		    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3, 
		    Fdd_hspdsch fdd_hspdsch)
    {
	setMaxNoDPCH_PDSCH_Codes(maxNoDPCH_PDSCH_Codes);
	setMaxNoPhysChBitsReceived(maxNoPhysChBitsReceived);
	setSupportForSF_512(supportForSF_512);
	setDummy(dummy);
	setDummy2(dummy2);
	setDummy3(dummy3);
	setFdd_hspdsch(fdd_hspdsch);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityFDD_r5(long maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    boolean supportForSF_512, boolean dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2, 
		    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3, 
		    Fdd_hspdsch fdd_hspdsch)
    {
	this(new INTEGER(maxNoDPCH_PDSCH_Codes), maxNoPhysChBitsReceived, 
	     new BOOLEAN(supportForSF_512), new BOOLEAN(dummy), dummy2, 
	     dummy3, fdd_hspdsch);
    }
    
    /**
     * Construct with required components.
     */
    public DL_PhysChCapabilityFDD_r5(long maxNoDPCH_PDSCH_Codes, 
		    rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived, 
		    boolean supportForSF_512, boolean dummy, 
		    rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2, 
		    Fdd_hspdsch fdd_hspdsch)
    {
	setMaxNoDPCH_PDSCH_Codes(maxNoDPCH_PDSCH_Codes);
	setMaxNoPhysChBitsReceived(maxNoPhysChBitsReceived);
	setSupportForSF_512(supportForSF_512);
	setDummy(dummy);
	setDummy2(dummy2);
	setFdd_hspdsch(fdd_hspdsch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = rrc.informationelements.MaxNoPhysChBitsReceived.dummy;
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception();
	mComponents[5] = rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true;
	mComponents[6] = new Fdd_hspdsch();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return rrc.informationelements.MaxNoPhysChBitsReceived.dummy;
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception();
	    case 5:
		return rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true;
	    case 6:
		return new Fdd_hspdsch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxNoDPCH_PDSCH_Codes"
    public long getMaxNoDPCH_PDSCH_Codes()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMaxNoDPCH_PDSCH_Codes(long maxNoDPCH_PDSCH_Codes)
    {
	setMaxNoDPCH_PDSCH_Codes(new INTEGER(maxNoDPCH_PDSCH_Codes));
    }
    
    public void setMaxNoDPCH_PDSCH_Codes(INTEGER maxNoDPCH_PDSCH_Codes)
    {
	mComponents[0] = maxNoDPCH_PDSCH_Codes;
    }
    
    
    // Methods for field "maxNoPhysChBitsReceived"
    public rrc.informationelements.MaxNoPhysChBitsReceived getMaxNoPhysChBitsReceived()
    {
	return (rrc.informationelements.MaxNoPhysChBitsReceived)mComponents[1];
    }
    
    public void setMaxNoPhysChBitsReceived(rrc.informationelements.MaxNoPhysChBitsReceived maxNoPhysChBitsReceived)
    {
	mComponents[1] = maxNoPhysChBitsReceived;
    }
    
    
    // Methods for field "supportForSF_512"
    public boolean getSupportForSF_512()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setSupportForSF_512(boolean supportForSF_512)
    {
	setSupportForSF_512(new BOOLEAN(supportForSF_512));
    }
    
    public void setSupportForSF_512(BOOLEAN supportForSF_512)
    {
	mComponents[2] = supportForSF_512;
    }
    
    
    // Methods for field "dummy"
    public boolean getDummy()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setDummy(boolean dummy)
    {
	setDummy(new BOOLEAN(dummy));
    }
    
    public void setDummy(BOOLEAN dummy)
    {
	mComponents[3] = dummy;
    }
    
    
    // Methods for field "dummy2"
    public rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception getDummy2()
    {
	return (rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception)mComponents[4];
    }
    
    public void setDummy2(rrc.informationelements.SimultaneousSCCPCH_DPCH_Reception dummy2)
    {
	mComponents[4] = dummy2;
    }
    
    
    // Methods for field "dummy3"
    public rrc.informationelements.SupportOfDedicatedPilotsForChEstimation getDummy3()
    {
	return (rrc.informationelements.SupportOfDedicatedPilotsForChEstimation)mComponents[5];
    }
    
    public void setDummy3(rrc.informationelements.SupportOfDedicatedPilotsForChEstimation dummy3)
    {
	mComponents[5] = dummy3;
    }
    
    public boolean hasDummy3()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDummy3()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "fdd_hspdsch"
    public Fdd_hspdsch getFdd_hspdsch()
    {
	return (Fdd_hspdsch)mComponents[6];
    }
    
    public void setFdd_hspdsch(Fdd_hspdsch fdd_hspdsch)
    {
	mComponents[6] = fdd_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Fdd_hspdsch from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Fdd_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Fdd_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Fdd_hspdsch createFdd_hspdschWithSupported(Supported supported)
	{
	    Fdd_hspdsch __object = new Fdd_hspdsch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(Supported supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Supported from ASN1 Module Internode_definitions.
	 * @see Sequence
	 */
	public static class Supported extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Supported()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Supported(rrc.informationelements.HSDSCH_physical_layer_category hsdsch_physical_layer_category, 
			    BOOLEAN dummy, BOOLEAN dummy2)
	    {
		setHsdsch_physical_layer_category(hsdsch_physical_layer_category);
		setDummy(dummy);
		setDummy2(dummy2);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Supported(rrc.informationelements.HSDSCH_physical_layer_category hsdsch_physical_layer_category, 
			    boolean dummy, boolean dummy2)
	    {
		this(hsdsch_physical_layer_category, new BOOLEAN(dummy), 
		     new BOOLEAN(dummy2));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new rrc.informationelements.HSDSCH_physical_layer_category();
		mComponents[1] = new BOOLEAN();
		mComponents[2] = new BOOLEAN();
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
			return new rrc.informationelements.HSDSCH_physical_layer_category();
		    case 1:
			return new BOOLEAN();
		    case 2:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "hsdsch_physical_layer_category"
	    public rrc.informationelements.HSDSCH_physical_layer_category getHsdsch_physical_layer_category()
	    {
		return (rrc.informationelements.HSDSCH_physical_layer_category)mComponents[0];
	    }
	    
	    public void setHsdsch_physical_layer_category(rrc.informationelements.HSDSCH_physical_layer_category hsdsch_physical_layer_category)
	    {
		mComponents[0] = hsdsch_physical_layer_category;
	    }
	    
	    
	    // Methods for field "dummy"
	    public boolean getDummy()
	    {
		return ((BOOLEAN)mComponents[1]).booleanValue();
	    }
	    
	    public void setDummy(boolean dummy)
	    {
		setDummy(new BOOLEAN(dummy));
	    }
	    
	    public void setDummy(BOOLEAN dummy)
	    {
		mComponents[1] = dummy;
	    }
	    
	    
	    // Methods for field "dummy2"
	    public boolean getDummy2()
	    {
		return ((BOOLEAN)mComponents[2]).booleanValue();
	    }
	    
	    public void setDummy2(boolean dummy2)
	    {
		setDummy2(new BOOLEAN(dummy2));
	    }
	    
	    public void setDummy2(BOOLEAN dummy2)
	    {
		mComponents[2] = dummy2;
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
		    "DL_PhysChCapabilityFDD_r5$Fdd_hspdsch$Supported"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"HSDSCH_physical_layer_category"
				    ),
				    new QName (
					"InformationElements",
					"HSDSCH-physical-layer-category"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new rrc.informationelements.HSDSCH_physical_layer_category(1), 
					    new rrc.informationelements.HSDSCH_physical_layer_category(64),
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
			    "hsdsch-physical-layer-category",
			    0,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "dummy",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new TypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"BOOLEAN"
				    ),
				    new QName (
					"builtin",
					"BOOLEAN"
				    ),
				    12314,
				    null
				)
			    ),
			    "dummy2",
			    2,
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
	     * Get the type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Supported object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Supported

	// Methods for field "unsupported"
	public static Fdd_hspdsch createFdd_hspdschWithUnsupported(Null unsupported)
	{
	    Fdd_hspdsch __object = new Fdd_hspdsch();

	    __object.setUnsupported(unsupported);
	    return __object;
	}
	
	public boolean hasUnsupported()
	{
	    return getChosenFlag() == unsupported_chosen;
	}
	
	public void setUnsupported(Null unsupported)
	{
	    setChosenValue(unsupported);
	    setChosenFlag(unsupported_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case supported_chosen:
		    return new Supported();
		case unsupported_chosen:
		    return new Null();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"DL_PhysChCapabilityFDD_r5$Fdd_hspdsch"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.internode_definitions",
				"DL_PhysChCapabilityFDD_r5$Fdd_hspdsch$Supported"
			    )
			),
			"supported",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"unsupported",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Fdd_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Fdd_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Fdd_hspdsch

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
	    "DL_PhysChCapabilityFDD_r5"
	),
	new QName (
	    "Internode-definitions",
	    "DL-PhysChCapabilityFDD-r5"
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
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "maxNoDPCH-PDSCH-Codes",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxNoPhysChBitsReceived"
			    ),
			    new QName (
				"InformationElements",
				"MaxNoPhysChBitsReceived"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dummy",
					0
				    ),
				    new MemberListElement (
					"b1200",
					1
				    ),
				    new MemberListElement (
					"b2400",
					2
				    ),
				    new MemberListElement (
					"b3600",
					3
				    ),
				    new MemberListElement (
					"b4800",
					4
				    ),
				    new MemberListElement (
					"b7200",
					5
				    ),
				    new MemberListElement (
					"b9600",
					6
				    ),
				    new MemberListElement (
					"b14400",
					7
				    ),
				    new MemberListElement (
					"b19200",
					8
				    ),
				    new MemberListElement (
					"b28800",
					9
				    ),
				    new MemberListElement (
					"b38400",
					10
				    ),
				    new MemberListElement (
					"b48000",
					11
				    ),
				    new MemberListElement (
					"b57600",
					12
				    ),
				    new MemberListElement (
					"b67200",
					13
				    ),
				    new MemberListElement (
					"b76800",
					14
				    )
				}
			    ),
			    0,
			    rrc.informationelements.MaxNoPhysChBitsReceived.dummy
			)
		    ),
		    "maxNoPhysChBitsReceived",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "supportForSF-512",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "dummy",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SimultaneousSCCPCH_DPCH_Reception"
			    ),
			    new QName (
				"InformationElements",
				"SimultaneousSCCPCH-DPCH-Reception"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SimultaneousSCCPCH_DPCH_Reception"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "dummy2",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SupportOfDedicatedPilotsForChEstimation"
			    ),
			    new QName (
				"InformationElements",
				"SupportOfDedicatedPilotsForChEstimation"
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
			    rrc.informationelements.SupportOfDedicatedPilotsForChEstimation._true
			)
		    ),
		    "dummy3",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "DL_PhysChCapabilityFDD_r5$Fdd_hspdsch"
			)
		    ),
		    "fdd-hspdsch",
		    6,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityFDD_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityFDD_r5
