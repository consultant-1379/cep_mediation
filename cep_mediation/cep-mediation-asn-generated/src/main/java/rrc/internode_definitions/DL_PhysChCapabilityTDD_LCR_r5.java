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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_LCR_r5 from ASN1 Module Internode_definitions.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_LCR_r5 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_LCR_r5()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_LCR_r5(rrc.informationelements.MaxTS_PerSubFrame_r4 maxTS_PerSubFrame, 
		    rrc.informationelements.MaxPhysChPerSubFrame_r4 maxPhysChPerFrame, 
		    rrc.informationelements.MinimumSF_DL minimumSF, 
		    BOOLEAN supportOfPDSCH, 
		    rrc.informationelements.MaxPhysChPerTS maxPhysChPerTS, 
		    BOOLEAN supportOf8PSK, Tdd128_hspdsch tdd128_hspdsch)
    {
	setMaxTS_PerSubFrame(maxTS_PerSubFrame);
	setMaxPhysChPerFrame(maxPhysChPerFrame);
	setMinimumSF(minimumSF);
	setSupportOfPDSCH(supportOfPDSCH);
	setMaxPhysChPerTS(maxPhysChPerTS);
	setSupportOf8PSK(supportOf8PSK);
	setTdd128_hspdsch(tdd128_hspdsch);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityTDD_LCR_r5(rrc.informationelements.MaxTS_PerSubFrame_r4 maxTS_PerSubFrame, 
		    rrc.informationelements.MaxPhysChPerSubFrame_r4 maxPhysChPerFrame, 
		    rrc.informationelements.MinimumSF_DL minimumSF, 
		    boolean supportOfPDSCH, 
		    rrc.informationelements.MaxPhysChPerTS maxPhysChPerTS, 
		    boolean supportOf8PSK, Tdd128_hspdsch tdd128_hspdsch)
    {
	this(maxTS_PerSubFrame, maxPhysChPerFrame, minimumSF, 
	     new BOOLEAN(supportOfPDSCH), maxPhysChPerTS, 
	     new BOOLEAN(supportOf8PSK), tdd128_hspdsch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new rrc.informationelements.MaxTS_PerSubFrame_r4();
	mComponents[1] = new rrc.informationelements.MaxPhysChPerSubFrame_r4();
	mComponents[2] = rrc.informationelements.MinimumSF_DL.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new rrc.informationelements.MaxPhysChPerTS();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new Tdd128_hspdsch();
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
		return new rrc.informationelements.MaxTS_PerSubFrame_r4();
	    case 1:
		return new rrc.informationelements.MaxPhysChPerSubFrame_r4();
	    case 2:
		return rrc.informationelements.MinimumSF_DL.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new rrc.informationelements.MaxPhysChPerTS();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new Tdd128_hspdsch();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTS_PerSubFrame"
    public rrc.informationelements.MaxTS_PerSubFrame_r4 getMaxTS_PerSubFrame()
    {
	return (rrc.informationelements.MaxTS_PerSubFrame_r4)mComponents[0];
    }
    
    public void setMaxTS_PerSubFrame(rrc.informationelements.MaxTS_PerSubFrame_r4 maxTS_PerSubFrame)
    {
	mComponents[0] = maxTS_PerSubFrame;
    }
    
    
    // Methods for field "maxPhysChPerFrame"
    public rrc.informationelements.MaxPhysChPerSubFrame_r4 getMaxPhysChPerFrame()
    {
	return (rrc.informationelements.MaxPhysChPerSubFrame_r4)mComponents[1];
    }
    
    public void setMaxPhysChPerFrame(rrc.informationelements.MaxPhysChPerSubFrame_r4 maxPhysChPerFrame)
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
    
    
    // Methods for field "supportOf8PSK"
    public boolean getSupportOf8PSK()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setSupportOf8PSK(boolean supportOf8PSK)
    {
	setSupportOf8PSK(new BOOLEAN(supportOf8PSK));
    }
    
    public void setSupportOf8PSK(BOOLEAN supportOf8PSK)
    {
	mComponents[5] = supportOf8PSK;
    }
    
    
    // Methods for field "tdd128_hspdsch"
    public Tdd128_hspdsch getTdd128_hspdsch()
    {
	return (Tdd128_hspdsch)mComponents[6];
    }
    
    public void setTdd128_hspdsch(Tdd128_hspdsch tdd128_hspdsch)
    {
	mComponents[6] = tdd128_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd128_hspdsch from ASN1 Module Internode_definitions.
     * @see Choice
     */
    public static class Tdd128_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd128_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd128_hspdsch createTdd128_hspdschWithSupported(long supported)
	{
	    return createTdd128_hspdschWithSupported(new rrc.informationelements.HSDSCH_physical_layer_category(supported));
	}
	
	public static Tdd128_hspdsch createTdd128_hspdschWithSupported(rrc.informationelements.HSDSCH_physical_layer_category supported)
	{
	    Tdd128_hspdsch __object = new Tdd128_hspdsch();

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
	public static Tdd128_hspdsch createTdd128_hspdschWithUnsupported(Null unsupported)
	{
	    Tdd128_hspdsch __object = new Tdd128_hspdsch();

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
		    (short)0x8006
		}
	    ),
	    new QName (
		"rrc.internode_definitions",
		"DL_PhysChCapabilityTDD_LCR_r5$Tdd128_hspdsch"
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd128_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd128_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd128_hspdsch

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
	    "DL_PhysChCapabilityTDD_LCR_r5"
	),
	new QName (
	    "Internode-definitions",
	    "DL-PhysChCapabilityTDD-LCR-r5"
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
				"MaxTS_PerSubFrame_r4"
			    ),
			    new QName (
				"InformationElements",
				"MaxTS-PerSubFrame-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxTS_PerSubFrame_r4(1), 
				    new rrc.informationelements.MaxTS_PerSubFrame_r4(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "maxTS-PerSubFrame",
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
				"MaxPhysChPerSubFrame_r4"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerSubFrame-r4"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new rrc.informationelements.MaxPhysChPerSubFrame_r4(1), 
				    new rrc.informationelements.MaxPhysChPerSubFrame_r4(96),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(96)
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "supportOf8PSK",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.internode_definitions",
			    "DL_PhysChCapabilityTDD_LCR_r5$Tdd128_hspdsch"
			)
		    ),
		    "tdd128-hspdsch",
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
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_LCR_r5 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_LCR_r5 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_LCR_r5
