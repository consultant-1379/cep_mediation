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
 * Define the ASN1 Type UL_PhysChCapabilityTDD_768 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_PhysChCapabilityTDD_768 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_PhysChCapabilityTDD_768()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_PhysChCapabilityTDD_768(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerTimeslot maxPhysChPerTimeslot, 
		    MinimumSF_UL minimumSF, BOOLEAN supportOfPUSCH, 
		    Tdd384_edch tdd384_edch)
    {
	setMaxTS_PerFrame(maxTS_PerFrame);
	setMaxPhysChPerTimeslot(maxPhysChPerTimeslot);
	setMinimumSF(minimumSF);
	setSupportOfPUSCH(supportOfPUSCH);
	setTdd384_edch(tdd384_edch);
    }
    
    /**
     * Construct with components.
     */
    public UL_PhysChCapabilityTDD_768(MaxTS_PerFrame maxTS_PerFrame, 
		    MaxPhysChPerTimeslot maxPhysChPerTimeslot, 
		    MinimumSF_UL minimumSF, boolean supportOfPUSCH, 
		    Tdd384_edch tdd384_edch)
    {
	this(maxTS_PerFrame, maxPhysChPerTimeslot, minimumSF, 
	     new BOOLEAN(supportOfPUSCH), tdd384_edch);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MaxTS_PerFrame();
	mComponents[1] = MaxPhysChPerTimeslot.ts1;
	mComponents[2] = MinimumSF_UL.sf1;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new Tdd384_edch();
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
		return new MaxTS_PerFrame();
	    case 1:
		return MaxPhysChPerTimeslot.ts1;
	    case 2:
		return MinimumSF_UL.sf1;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new Tdd384_edch();
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
    
    
    // Methods for field "maxPhysChPerTimeslot"
    public MaxPhysChPerTimeslot getMaxPhysChPerTimeslot()
    {
	return (MaxPhysChPerTimeslot)mComponents[1];
    }
    
    public void setMaxPhysChPerTimeslot(MaxPhysChPerTimeslot maxPhysChPerTimeslot)
    {
	mComponents[1] = maxPhysChPerTimeslot;
    }
    
    
    // Methods for field "minimumSF"
    public MinimumSF_UL getMinimumSF()
    {
	return (MinimumSF_UL)mComponents[2];
    }
    
    public void setMinimumSF(MinimumSF_UL minimumSF)
    {
	mComponents[2] = minimumSF;
    }
    
    
    // Methods for field "supportOfPUSCH"
    public boolean getSupportOfPUSCH()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setSupportOfPUSCH(boolean supportOfPUSCH)
    {
	setSupportOfPUSCH(new BOOLEAN(supportOfPUSCH));
    }
    
    public void setSupportOfPUSCH(BOOLEAN supportOfPUSCH)
    {
	mComponents[3] = supportOfPUSCH;
    }
    
    
    // Methods for field "tdd384_edch"
    public Tdd384_edch getTdd384_edch()
    {
	return (Tdd384_edch)mComponents[4];
    }
    
    public void setTdd384_edch(Tdd384_edch tdd384_edch)
    {
	mComponents[4] = tdd384_edch;
    }
    
    
    
    /**
     * Define the ASN1 Type Tdd384_edch from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Tdd384_edch extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Tdd384_edch()
	{
	}
	
	public static final  int  supported_chosen = 1;
	public static final  int  unsupported_chosen = 2;
	
	// Methods for field "supported"
	public static Tdd384_edch createTdd384_edchWithSupported(Supported supported)
	{
	    Tdd384_edch __object = new Tdd384_edch();

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
	 * Define the ASN1 Type Supported from ASN1 Module InformationElements.
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
	    public Supported(INTEGER tdd_edch_PhysicalLayerCategory)
	    {
		setTdd_edch_PhysicalLayerCategory(tdd_edch_PhysicalLayerCategory);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Supported(long tdd_edch_PhysicalLayerCategory)
	    {
		this(new INTEGER(tdd_edch_PhysicalLayerCategory));
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new INTEGER();
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
			return new INTEGER();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "tdd_edch_PhysicalLayerCategory"
	    public long getTdd_edch_PhysicalLayerCategory()
	    {
		return ((INTEGER)mComponents[0]).longValue();
	    }
	    
	    public void setTdd_edch_PhysicalLayerCategory(long tdd_edch_PhysicalLayerCategory)
	    {
		setTdd_edch_PhysicalLayerCategory(new INTEGER(tdd_edch_PhysicalLayerCategory));
	    }
	    
	    public void setTdd_edch_PhysicalLayerCategory(INTEGER tdd_edch_PhysicalLayerCategory)
	    {
		mComponents[0] = tdd_edch_PhysicalLayerCategory;
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
		    "UL_PhysChCapabilityTDD_768$Tdd384_edch$Supported"
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
					    new com.oss.asn1.INTEGER(16),
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
			    "tdd-edch-PhysicalLayerCategory",
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
	public static Tdd384_edch createTdd384_edchWithUnsupported(Null unsupported)
	{
	    Tdd384_edch __object = new Tdd384_edch();

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
		    (short)0x8004
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"UL_PhysChCapabilityTDD_768$Tdd384_edch"
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
				"rrc.informationelements",
				"UL_PhysChCapabilityTDD_768$Tdd384_edch$Supported"
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
	 * Get the type descriptor (TypeInfo) of 'this' Tdd384_edch object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tdd384_edch object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tdd384_edch

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
	    "UL_PhysChCapabilityTDD_768"
	),
	new QName (
	    "InformationElements",
	    "UL-PhysChCapabilityTDD-768"
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
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxPhysChPerTimeslot"
			    ),
			    new QName (
				"InformationElements",
				"MaxPhysChPerTimeslot"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ts1",
					0
				    ),
				    new MemberListElement (
					"ts2",
					1
				    )
				}
			    ),
			    0,
			    MaxPhysChPerTimeslot.ts1
			)
		    ),
		    "maxPhysChPerTimeslot",
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
				"MinimumSF_UL"
			    ),
			    new QName (
				"InformationElements",
				"MinimumSF-UL"
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
					"sf2",
					1
				    ),
				    new MemberListElement (
					"sf4",
					2
				    ),
				    new MemberListElement (
					"sf8",
					3
				    ),
				    new MemberListElement (
					"dummy",
					4
				    )
				}
			    ),
			    0,
			    MinimumSF_UL.sf1
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
		    "supportOfPUSCH",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "UL_PhysChCapabilityTDD_768$Tdd384_edch"
			)
		    ),
		    "tdd384-edch",
		    4,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityTDD_768 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_PhysChCapabilityTDD_768 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_PhysChCapabilityTDD_768
