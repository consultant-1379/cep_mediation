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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_r5(rrc.informationelements.MaxTS_PerFrame maxTS_PerFrame, 
		    rrc.informationelements.MaxPhysChPerFrame maxPhysChPerFrame, 
		    rrc.informationelements.MinimumSF_DL minimumSF, 
		    BOOLEAN supportOfPDSCH, 
		    rrc.informationelements.MaxPhysChPerTS maxPhysChPerTS, 
		    Tdd384_hspdsch tdd384_hspdsch)
    {
	setMaxTS_PerFrame(maxTS_PerFrame);
	setMaxPhysChPerFrame(maxPhysChPerFrame);
	setMinimumSF(minimumSF);
	setSupportOfPDSCH(supportOfPDSCH);
	setMaxPhysChPerTS(maxPhysChPerTS);
	setTdd384_hspdsch(tdd384_hspdsch);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityTDD_r5(rrc.informationelements.MaxTS_PerFrame maxTS_PerFrame, 
		    rrc.informationelements.MaxPhysChPerFrame maxPhysChPerFrame, 
		    rrc.informationelements.MinimumSF_DL minimumSF, 
		    boolean supportOfPDSCH, 
		    rrc.informationelements.MaxPhysChPerTS maxPhysChPerTS, 
		    Tdd384_hspdsch tdd384_hspdsch)
    {
	this(maxTS_PerFrame, maxPhysChPerFrame, minimumSF, 
	     new BOOLEAN(supportOfPDSCH), maxPhysChPerTS, tdd384_hspdsch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MaxTS_PerFrame();
	mComponents[1] = new rrc.informationelements.MaxPhysChPerFrame();
	mComponents[2] = rrc.informationelements.MinimumSF_DL.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new rrc.informationelements.MaxPhysChPerTS();
	mComponents[5] = new Tdd384_hspdsch();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new rrc.informationelements.MaxTS_PerFrame();
	    case 1:
		return new rrc.informationelements.MaxPhysChPerFrame();
	    case 2:
		return rrc.informationelements.MinimumSF_DL.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new rrc.informationelements.MaxPhysChPerTS();
	    case 5:
		return new Tdd384_hspdsch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTS_PerFrame"
    public rrc.informationelements.MaxTS_PerFrame getMaxTS_PerFrame()
    {
	return (rrc.informationelements.MaxTS_PerFrame)mComponents[0];
    }
    
    public void setMaxTS_PerFrame(rrc.informationelements.MaxTS_PerFrame maxTS_PerFrame)
    {
	mComponents[0] = maxTS_PerFrame;
    }
    
    
    // Methods for field "maxPhysChPerFrame"
    public rrc.informationelements.MaxPhysChPerFrame getMaxPhysChPerFrame()
    {
	return (rrc.informationelements.MaxPhysChPerFrame)mComponents[1];
    }
    
    public void setMaxPhysChPerFrame(rrc.informationelements.MaxPhysChPerFrame maxPhysChPerFrame)
    {
	mComponents[1] = maxPhysChPerFrame;
    }
    
    
    // Methods for field "minimumSF"
    public rrc.informationelements.MinimumSF_DL getMinimumSF()
    {
	return (rrc.informationelements.MinimumSF_DL)mComponents[2];
    }
    
    public void setMinimumSF(rrc.informationelements.MinimumSF_DL minimumSF)
    {
	mComponents[2] = minimumSF;
    }
    
    
    // Methods for field "supportOfPDSCH"
    public boolean getSupportOfPDSCH()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setSupportOfPDSCH(boolean supportOfPDSCH)
    {
	setSupportOfPDSCH(new BOOLEAN(supportOfPDSCH));
    }
    
    public void setSupportOfPDSCH(BOOLEAN supportOfPDSCH)
    {
	mComponents[3] = supportOfPDSCH;
    }
    
    
    // Methods for field "maxPhysChPerTS"
    public rrc.informationelements.MaxPhysChPerTS getMaxPhysChPerTS()
    {
	return (rrc.informationelements.MaxPhysChPerTS)mComponents[4];
    }
    
    public void setMaxPhysChPerTS(rrc.informationelements.MaxPhysChPerTS maxPhysChPerTS)
    {
	mComponents[4] = maxPhysChPerTS;
    }
    
    
    // Methods for field "tdd384_hspdsch"
    public Tdd384_hspdsch getTdd384_hspdsch()
    {
	return (Tdd384_hspdsch)mComponents[5];
    }
    
    public void setTdd384_hspdsch(Tdd384_hspdsch tdd384_hspdsch)
    {
	mComponents[5] = tdd384_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_hspdsch from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Tdd384_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd384_hspdsch createTdd384_hspdschWithSupported(long supported)
	{
	    return createTdd384_hspdschWithSupported(new rrc.informationelements.HSDSCH_physical_layer_category(supported));
	}
	
	public static Tdd384_hspdsch createTdd384_hspdschWithSupported(rrc.informationelements.HSDSCH_physical_layer_category supported)
	{
	    Tdd384_hspdsch __object = new Tdd384_hspdsch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(long supported)
	{
	    setSupported(new rrc.informationelements.HSDSCH_physical_layer_category(supported));
	}
	
	public void setSupported(rrc.informationelements.HSDSCH_physical_layer_category supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Methods for field "unsupported"
	public static Tdd384_hspdsch createTdd384_hspdschWithUnsupported(Null unsupported)
	{
	    Tdd384_hspdsch __object = new Tdd384_hspdsch();

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
		    return new rrc.informationelements.HSDSCH_physical_layer_category();
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"DL_PhysChCapabilityTDD_r5$Tdd384_hspdsch"
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_hspdsch

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
	    "DL_PhysChCapabilityTDD_r5"
	),
	new QName (
	    "Internode-definitions",
	    "DL-PhysChCapabilityTDD-r5"
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
				"MaxTS_PerFrame"
			    ),
			    new QName (
				"InformationElements",
				"MaxTS-PerFrame"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxTS_PerFrame(1), 
				    new rrc.informationelements.MaxTS_PerFrame(14),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(14)
			    ),
			    null
			)
		    ),
		    "maxTS-PerFrame",
		    0,
		    2,
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
				"MaxPhysChPerFrame"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerFrame"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxPhysChPerFrame(1), 
				    new rrc.informationelements.MaxPhysChPerFrame(224),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(224)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerFrame",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MinimumSF_DL"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSF-DL"
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
					"sf16",
					1
				    )
				}
			    ),
			    0,
			    rrc.informationelements.MinimumSF_DL.sf1
			)
		    ),
		    "minimumSF",
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
		    "supportOfPDSCH",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxPhysChPerTS"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTS"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxPhysChPerTS(1), 
				    new rrc.informationelements.MaxPhysChPerTS(16),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(16)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerTS",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "DL_PhysChCapabilityTDD_r5$Tdd384_hspdsch"
			)
		    ),
		    "tdd384-hspdsch",
		    5,
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
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_r5
