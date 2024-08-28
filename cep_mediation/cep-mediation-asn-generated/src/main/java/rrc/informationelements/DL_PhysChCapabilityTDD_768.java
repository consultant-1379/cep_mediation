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
 * Define the ASN1 Type DL_PhysChCapabilityTDD_768 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_PhysChCapabilityTDD_768 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_PhysChCapabilityTDD_768()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_PhysChCapabilityTDD_768(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerFrame_768 maxPhysChPerFrame, 
		    MinimumSF_DL_768 minimumSF, BOOLEAN supportOfPDSCH, 
		    Tdd768_hspdsch tdd768_hspdsch, 
		    MaxPhysChPerTS_768 maxPhysChPerTS)
    {
	setMaxTS_PerFrame(maxTS_PerFrame);
	setMaxPhysChPerFrame(maxPhysChPerFrame);
	setMinimumSF(minimumSF);
	setSupportOfPDSCH(supportOfPDSCH);
	setTdd768_hspdsch(tdd768_hspdsch);
	setMaxPhysChPerTS(maxPhysChPerTS);
    }
    
    /**
     * Construct with components.
     */
    public DL_PhysChCapabilityTDD_768(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerFrame_768 maxPhysChPerFrame, 
		    MinimumSF_DL_768 minimumSF, boolean supportOfPDSCH, 
		    Tdd768_hspdsch tdd768_hspdsch, 
		    MaxPhysChPerTS_768 maxPhysChPerTS)
    {
	this(maxTS_PerFrame, maxPhysChPerFrame, minimumSF, 
	     new BOOLEAN(supportOfPDSCH), tdd768_hspdsch, maxPhysChPerTS);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxTS_PerFrame();
	mComponents[1] = new MaxPhysChPerFrame_768();
	mComponents[2] = MinimumSF_DL_768.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new Tdd768_hspdsch();
	mComponents[5] = new MaxPhysChPerTS_768();
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
		return new MaxTS_PerFrame();
	    case 1:
		return new MaxPhysChPerFrame_768();
	    case 2:
		return MinimumSF_DL_768.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new Tdd768_hspdsch();
	    case 5:
		return new MaxPhysChPerTS_768();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxTS_PerFrame"
    public MaxTS_PerFrame getMaxTS_PerFrame()
    {
	return (MaxTS_PerFrame)mComponents[0];
    }
    
    public void setMaxTS_PerFrame(MaxTS_PerFrame maxTS_PerFrame)
    {
	mComponents[0] = maxTS_PerFrame;
    }
    
    
    // Methods for field "maxPhysChPerFrame"
    public MaxPhysChPerFrame_768 getMaxPhysChPerFrame()
    {
	return (MaxPhysChPerFrame_768)mComponents[1];
    }
    
    public void setMaxPhysChPerFrame(MaxPhysChPerFrame_768 maxPhysChPerFrame)
    {
	mComponents[1] = maxPhysChPerFrame;
    }
    
    
    // Methods for field "minimumSF"
    public MinimumSF_DL_768 getMinimumSF()
    {
	return (MinimumSF_DL_768)mComponents[2];
    }
    
    public void setMinimumSF(MinimumSF_DL_768 minimumSF)
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
    
    
    // Methods for field "tdd768_hspdsch"
    public Tdd768_hspdsch getTdd768_hspdsch()
    {
	return (Tdd768_hspdsch)mComponents[4];
    }
    
    public void setTdd768_hspdsch(Tdd768_hspdsch tdd768_hspdsch)
    {
	mComponents[4] = tdd768_hspdsch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd768_hspdsch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd768_hspdsch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd768_hspdsch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd768_hspdsch createTdd768_hspdschWithSupported(long supported)
	{
	    return createTdd768_hspdschWithSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public static Tdd768_hspdsch createTdd768_hspdschWithSupported(HSDSCH_physical_layer_category supported)
	{
	    Tdd768_hspdsch __object = new Tdd768_hspdsch();

	    __object.setSupported(supported);
	    return __object;
	}
	
	public boolean hasSupported()
	{
	    return getChosenFlag() == supported_chosen;
	}
	
	public void setSupported(long supported)
	{
	    setSupported(new HSDSCH_physical_layer_category(supported));
	}
	
	public void setSupported(HSDSCH_physical_layer_category supported)
	{
	    setChosenValue(supported);
	    setChosenFlag(supported_chosen);
	}
	
	
	// Methods for field "unsupported"
	public static Tdd768_hspdsch createTdd768_hspdschWithUnsupported(Null unsupported)
	{
	    Tdd768_hspdsch __object = new Tdd768_hspdsch();

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
		    return new HSDSCH_physical_layer_category();
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_PhysChCapabilityTDD_768$Tdd768_hspdsch"
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
					new HSDSCH_physical_layer_category(1), 
					new HSDSCH_physical_layer_category(64),
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd768_hspdsch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd768_hspdsch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd768_hspdsch

    // Methods for field "maxPhysChPerTS"
    public MaxPhysChPerTS_768 getMaxPhysChPerTS()
    {
	return (MaxPhysChPerTS_768)mComponents[5];
    }
    
    public void setMaxPhysChPerTS(MaxPhysChPerTS_768 maxPhysChPerTS)
    {
	mComponents[5] = maxPhysChPerTS;
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
	    "DL_PhysChCapabilityTDD_768"
	),
	new QName (
	    "InformationElements",
	    "DL-PhysChCapabilityTDD-768"
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
				    new MaxTS_PerFrame(1), 
				    new MaxTS_PerFrame(14),
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
				"MaxPhysChPerFrame_768"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerFrame-768"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerFrame_768(1), 
				    new MaxPhysChPerFrame_768(448),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(448)
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
				"MinimumSF_DL_768"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSF-DL-768"
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
					"sf32",
					1
				    )
				}
			    ),
			    0,
			    MinimumSF_DL_768.sf1
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
			new QName (
			    "rrc.informationelements",
			    "DL_PhysChCapabilityTDD_768$Tdd768_hspdsch"
			)
		    ),
		    "tdd768-hspdsch",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxPhysChPerTS_768"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTS-768"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MaxPhysChPerTS_768(1), 
				    new MaxPhysChPerTS_768(32),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    null
			)
		    ),
		    "maxPhysChPerTS",
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
     * Get the type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_768 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_PhysChCapabilityTDD_768 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_PhysChCapabilityTDD_768
