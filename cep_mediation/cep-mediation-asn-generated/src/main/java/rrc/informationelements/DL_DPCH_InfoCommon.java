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
 * Define the ASN1 Type DL_DPCH_InfoCommon from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_DPCH_InfoCommon extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_DPCH_InfoCommon()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_DPCH_InfoCommon(CfnHandling cfnHandling, 
		    ModeSpecificInfo modeSpecificInfo)
    {
	setCfnHandling(cfnHandling);
	setModeSpecificInfo(modeSpecificInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CfnHandling();
	mComponents[1] = new ModeSpecificInfo();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CfnHandling();
	    case 1:
		return new ModeSpecificInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "cfnHandling"
    public CfnHandling getCfnHandling()
    {
	return (CfnHandling)mComponents[0];
    }
    
    public void setCfnHandling(CfnHandling cfnHandling)
    {
	mComponents[0] = cfnHandling;
    }
    
    
    
    /**
     * Define the ASN1 Type CfnHandling from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class CfnHandling extends Choice {
	
	/**
	 * The default constructor.
	 */
	public CfnHandling()
	{
	}
	
	public static final  int  maintain_chosen = 1;
	public static final  int  initialise_chosen = 2;
	
	// Methods for field "maintain"
	public static CfnHandling createCfnHandlingWithMaintain(Null maintain)
	{
	    CfnHandling __object = new CfnHandling();

	    __object.setMaintain(maintain);
	    return __object;
	}
	
	public boolean hasMaintain()
	{
	    return getChosenFlag() == maintain_chosen;
	}
	
	public void setMaintain(Null maintain)
	{
	    setChosenValue(maintain);
	    setChosenFlag(maintain_chosen);
	}
	
	
	// Methods for field "initialise"
	public static CfnHandling createCfnHandlingWithInitialise(Initialise initialise)
	{
	    CfnHandling __object = new CfnHandling();

	    __object.setInitialise(initialise);
	    return __object;
	}
	
	public boolean hasInitialise()
	{
	    return getChosenFlag() == initialise_chosen;
	}
	
	public void setInitialise(Initialise initialise)
	{
	    setChosenValue(initialise);
	    setChosenFlag(initialise_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Initialise from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Initialise extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Initialise()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Initialise(Cfntargetsfnframeoffset dummy)
	    {
		setDummy(dummy);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new Cfntargetsfnframeoffset();
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
			return new Cfntargetsfnframeoffset();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dummy"
	    public Cfntargetsfnframeoffset getDummy()
	    {
		return (Cfntargetsfnframeoffset)mComponents[0];
	    }
	    
	    public void setDummy(Cfntargetsfnframeoffset dummy)
	    {
		mComponents[0] = dummy;
	    }
	    
	    public boolean hasDummy()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDummy()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_DPCH_InfoCommon$CfnHandling$Initialise"
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
					"Cfntargetsfnframeoffset"
				    ),
				    new QName (
					"InformationElements",
					"Cfntargetsfnframeoffset"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new Cfntargetsfnframeoffset(0), 
					    new Cfntargetsfnframeoffset(255),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(255)
				    ),
				    null
				)
			    ),
			    "dummy",
			    0,
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
				new TagDecoderElement((short)0x8000, 0)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Initialise object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Initialise object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Initialise

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case maintain_chosen:
		    return new Null();
		case initialise_chosen:
		    return new Initialise();
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_DPCH_InfoCommon$CfnHandling"
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
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"maintain",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_DPCH_InfoCommon$CfnHandling$Initialise"
			    )
			),
			"initialise",
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
	 * Get the type descriptor (TypeInfo) of 'this' CfnHandling object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' CfnHandling object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for CfnHandling

    // Methods for field "modeSpecificInfo"
    public ModeSpecificInfo getModeSpecificInfo()
    {
	return (ModeSpecificInfo)mComponents[1];
    }
    
    public void setModeSpecificInfo(ModeSpecificInfo modeSpecificInfo)
    {
	mComponents[1] = modeSpecificInfo;
    }
    
    
    
    /**
     * Define the ASN1 Type ModeSpecificInfo from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class ModeSpecificInfo extends Choice {
	
	/**
	 * The default constructor.
	 */
	public ModeSpecificInfo()
	{
	}
	
	public static final  int  fdd_chosen = 1;
	public static final  int  tdd_chosen = 2;
	
	// Methods for field "fdd"
	public static ModeSpecificInfo createModeSpecificInfoWithFdd(Fdd fdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setFdd(fdd);
	    return __object;
	}
	
	public boolean hasFdd()
	{
	    return getChosenFlag() == fdd_chosen;
	}
	
	public void setFdd(Fdd fdd)
	{
	    setChosenValue(fdd);
	    setChosenFlag(fdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Fdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Fdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Fdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Fdd(DL_DPCH_PowerControlInfo dl_DPCH_PowerControlInfo, 
			    PowerOffsetPilot_pdpdch powerOffsetPilot_pdpdch, 
			    Dl_rate_matching_restriction dl_rate_matching_restriction, 
			    SF512_AndPilot spreadingFactorAndPilot, 
			    PositionFixedOrFlexible positionFixedOrFlexible, 
			    BOOLEAN tfci_Existence)
	    {
		setDl_DPCH_PowerControlInfo(dl_DPCH_PowerControlInfo);
		setPowerOffsetPilot_pdpdch(powerOffsetPilot_pdpdch);
		setDl_rate_matching_restriction(dl_rate_matching_restriction);
		setSpreadingFactorAndPilot(spreadingFactorAndPilot);
		setPositionFixedOrFlexible(positionFixedOrFlexible);
		setTfci_Existence(tfci_Existence);
	    }
	    
	    /**
	     * Construct with components.
	     */
	    public Fdd(DL_DPCH_PowerControlInfo dl_DPCH_PowerControlInfo, 
			    PowerOffsetPilot_pdpdch powerOffsetPilot_pdpdch, 
			    Dl_rate_matching_restriction dl_rate_matching_restriction, 
			    SF512_AndPilot spreadingFactorAndPilot, 
			    PositionFixedOrFlexible positionFixedOrFlexible, 
			    boolean tfci_Existence)
	    {
		this(dl_DPCH_PowerControlInfo, powerOffsetPilot_pdpdch, 
		     dl_rate_matching_restriction, spreadingFactorAndPilot, 
		     positionFixedOrFlexible, new BOOLEAN(tfci_Existence));
	    }
	    
	    /**
	     * Construct with required components.
	     */
	    public Fdd(PowerOffsetPilot_pdpdch powerOffsetPilot_pdpdch, 
			    SF512_AndPilot spreadingFactorAndPilot, 
			    PositionFixedOrFlexible positionFixedOrFlexible, 
			    boolean tfci_Existence)
	    {
		setPowerOffsetPilot_pdpdch(powerOffsetPilot_pdpdch);
		setSpreadingFactorAndPilot(spreadingFactorAndPilot);
		setPositionFixedOrFlexible(positionFixedOrFlexible);
		setTfci_Existence(tfci_Existence);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DL_DPCH_PowerControlInfo();
		mComponents[1] = new PowerOffsetPilot_pdpdch();
		mComponents[2] = new Dl_rate_matching_restriction();
		mComponents[3] = new SF512_AndPilot();
		mComponents[4] = PositionFixedOrFlexible.fixed;
		mComponents[5] = new BOOLEAN();
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
			return new DL_DPCH_PowerControlInfo();
		    case 1:
			return new PowerOffsetPilot_pdpdch();
		    case 2:
			return new Dl_rate_matching_restriction();
		    case 3:
			return new SF512_AndPilot();
		    case 4:
			return PositionFixedOrFlexible.fixed;
		    case 5:
			return new BOOLEAN();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_DPCH_PowerControlInfo"
	    public DL_DPCH_PowerControlInfo getDl_DPCH_PowerControlInfo()
	    {
		return (DL_DPCH_PowerControlInfo)mComponents[0];
	    }
	    
	    public void setDl_DPCH_PowerControlInfo(DL_DPCH_PowerControlInfo dl_DPCH_PowerControlInfo)
	    {
		mComponents[0] = dl_DPCH_PowerControlInfo;
	    }
	    
	    public boolean hasDl_DPCH_PowerControlInfo()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_DPCH_PowerControlInfo()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    // Methods for field "powerOffsetPilot_pdpdch"
	    public PowerOffsetPilot_pdpdch getPowerOffsetPilot_pdpdch()
	    {
		return (PowerOffsetPilot_pdpdch)mComponents[1];
	    }
	    
	    public void setPowerOffsetPilot_pdpdch(PowerOffsetPilot_pdpdch powerOffsetPilot_pdpdch)
	    {
		mComponents[1] = powerOffsetPilot_pdpdch;
	    }
	    
	    
	    // Methods for field "dl_rate_matching_restriction"
	    public Dl_rate_matching_restriction getDl_rate_matching_restriction()
	    {
		return (Dl_rate_matching_restriction)mComponents[2];
	    }
	    
	    public void setDl_rate_matching_restriction(Dl_rate_matching_restriction dl_rate_matching_restriction)
	    {
		mComponents[2] = dl_rate_matching_restriction;
	    }
	    
	    public boolean hasDl_rate_matching_restriction()
	    {
		return componentIsPresent(2);
	    }
	    
	    public void deleteDl_rate_matching_restriction()
	    {
		setComponentAbsent(2);
	    }
	    
	    
	    // Methods for field "spreadingFactorAndPilot"
	    public SF512_AndPilot getSpreadingFactorAndPilot()
	    {
		return (SF512_AndPilot)mComponents[3];
	    }
	    
	    public void setSpreadingFactorAndPilot(SF512_AndPilot spreadingFactorAndPilot)
	    {
		mComponents[3] = spreadingFactorAndPilot;
	    }
	    
	    
	    // Methods for field "positionFixedOrFlexible"
	    public PositionFixedOrFlexible getPositionFixedOrFlexible()
	    {
		return (PositionFixedOrFlexible)mComponents[4];
	    }
	    
	    public void setPositionFixedOrFlexible(PositionFixedOrFlexible positionFixedOrFlexible)
	    {
		mComponents[4] = positionFixedOrFlexible;
	    }
	    
	    
	    // Methods for field "tfci_Existence"
	    public boolean getTfci_Existence()
	    {
		return ((BOOLEAN)mComponents[5]).booleanValue();
	    }
	    
	    public void setTfci_Existence(boolean tfci_Existence)
	    {
		setTfci_Existence(new BOOLEAN(tfci_Existence));
	    }
	    
	    public void setTfci_Existence(BOOLEAN tfci_Existence)
	    {
		mComponents[5] = tfci_Existence;
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
		    "DL_DPCH_InfoCommon$ModeSpecificInfo$Fdd"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_PowerControlInfo"
				    ),
				    new QName (
					"InformationElements",
					"DL-DPCH-PowerControlInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_DPCH_PowerControlInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_DPCH_PowerControlInfo"
					)
				    ),
				    0
				)
			    ),
			    "dl-DPCH-PowerControlInfo",
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
					"PowerOffsetPilot_pdpdch"
				    ),
				    new QName (
					"InformationElements",
					"PowerOffsetPilot-pdpdch"
				    ),
				    12314,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new PowerOffsetPilot_pdpdch(0), 
					    new PowerOffsetPilot_pdpdch(24),
					    0
					)
				    ),
				    new Bounds (
					new java.lang.Long(0),
					new java.lang.Long(24)
				    ),
				    null
				)
			    ),
			    "powerOffsetPilot-pdpdch",
			    1,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8002
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"Dl_rate_matching_restriction"
				    ),
				    new QName (
					"InformationElements",
					"Dl-rate-matching-restriction"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "Dl_rate_matching_restriction"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "Dl_rate_matching_restriction"
					)
				    ),
				    0
				)
			    ),
			    "dl-rate-matching-restriction",
			    2,
			    3,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new ChoiceInfo (
				    new Tags (
					new short[] {
					    (short)0x8003
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"SF512_AndPilot"
				    ),
				    new QName (
					"InformationElements",
					"SF512-AndPilot"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "SF512_AndPilot"
					)
				    ),
				    0,
				    new TagDecoder (
					new TagDecoderElement[] {
					    new TagDecoderElement((short)0x8000, 0),
					    new TagDecoderElement((short)0x8001, 1),
					    new TagDecoderElement((short)0x8002, 2),
					    new TagDecoderElement((short)0x8003, 3),
					    new TagDecoderElement((short)0x8004, 4),
					    new TagDecoderElement((short)0x8005, 5),
					    new TagDecoderElement((short)0x8006, 6),
					    new TagDecoderElement((short)0x8007, 7)
					}
				    )
				)
			    ),
			    "spreadingFactorAndPilot",
			    3,
			    2,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new EnumeratedInfo (
				    new Tags (
					new short[] {
					    (short)0x8004
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"PositionFixedOrFlexible"
				    ),
				    new QName (
					"InformationElements",
					"PositionFixedOrFlexible"
				    ),
				    12314,
				    null,
				    new MemberList (
					new MemberListElement[] {
					    new MemberListElement (
						"fixed",
						0
					    ),
					    new MemberListElement (
						"flexible",
						1
					    )
					}
				    ),
				    0,
				    PositionFixedOrFlexible.fixed
				)
			    ),
			    "positionFixedOrFlexible",
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
			    "tfci-Existence",
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
				new TagDecoderElement((short)0x8000, 0),
				new TagDecoderElement((short)0x8001, 1)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8001, 1)
			    }
			),
			new TagDecoder (
			    new TagDecoderElement[] {
				new TagDecoderElement((short)0x8002, 2),
				new TagDecoderElement((short)0x8003, 3)
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
	     * Get the type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Fdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Fdd

	// Methods for field "tdd"
	public static ModeSpecificInfo createModeSpecificInfoWithTdd(Tdd tdd)
	{
	    ModeSpecificInfo __object = new ModeSpecificInfo();

	    __object.setTdd(tdd);
	    return __object;
	}
	
	public boolean hasTdd()
	{
	    return getChosenFlag() == tdd_chosen;
	}
	
	public void setTdd(Tdd tdd)
	{
	    setChosenValue(tdd);
	    setChosenFlag(tdd_chosen);
	}
	
	
	
	/**
	 * Define the ASN1 Type Tdd from ASN1 Module InformationElements.
	 * @see Sequence
	 */
	public static class Tdd extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Tdd()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Tdd(DL_DPCH_PowerControlInfo dl_DPCH_PowerControlInfo)
	    {
		setDl_DPCH_PowerControlInfo(dl_DPCH_PowerControlInfo);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new DL_DPCH_PowerControlInfo();
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
			return new DL_DPCH_PowerControlInfo();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "dl_DPCH_PowerControlInfo"
	    public DL_DPCH_PowerControlInfo getDl_DPCH_PowerControlInfo()
	    {
		return (DL_DPCH_PowerControlInfo)mComponents[0];
	    }
	    
	    public void setDl_DPCH_PowerControlInfo(DL_DPCH_PowerControlInfo dl_DPCH_PowerControlInfo)
	    {
		mComponents[0] = dl_DPCH_PowerControlInfo;
	    }
	    
	    public boolean hasDl_DPCH_PowerControlInfo()
	    {
		return componentIsPresent(0);
	    }
	    
	    public void deleteDl_DPCH_PowerControlInfo()
	    {
		setComponentAbsent(0);
	    }
	    
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final SequenceInfo c_typeinfo = new SequenceInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "rrc.informationelements",
		    "DL_DPCH_InfoCommon$ModeSpecificInfo$Tdd"
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
				new SequenceInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"rrc.informationelements",
					"DL_DPCH_PowerControlInfo"
				    ),
				    new QName (
					"InformationElements",
					"DL-DPCH-PowerControlInfo"
				    ),
				    12314,
				    null,
				    new FieldsRef (
					new QName (
					    "rrc.informationelements",
					    "DL_DPCH_PowerControlInfo"
					)
				    ),
				    0,
				    new TagDecodersRef (
					new QName (
					    "rrc.informationelements",
					    "DL_DPCH_PowerControlInfo"
					)
				    ),
				    0
				)
			    ),
			    "dl-DPCH-PowerControlInfo",
			    0,
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
				new TagDecoderElement((short)0x8000, 0)
			    }
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Tdd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Tdd

	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case fdd_chosen:
		    return new Fdd();
		case tdd_chosen:
		    return new Tdd();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"DL_DPCH_InfoCommon$ModeSpecificInfo"
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
				"DL_DPCH_InfoCommon$ModeSpecificInfo$Fdd"
			    )
			),
			"fdd",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"DL_DPCH_InfoCommon$ModeSpecificInfo$Tdd"
			    )
			),
			"tdd",
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
	 * Get the type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ModeSpecificInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ModeSpecificInfo

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
	    "DL_DPCH_InfoCommon"
	),
	new QName (
	    "InformationElements",
	    "DL-DPCH-InfoCommon"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_DPCH_InfoCommon$CfnHandling"
			)
		    ),
		    "cfnHandling",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "DL_DPCH_InfoCommon$ModeSpecificInfo"
			)
		    ),
		    "modeSpecificInfo",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_DPCH_InfoCommon object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_DPCH_InfoCommon object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_DPCH_InfoCommon
