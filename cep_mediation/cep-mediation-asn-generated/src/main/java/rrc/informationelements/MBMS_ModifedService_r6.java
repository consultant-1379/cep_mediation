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
 * Define the ASN1 Type MBMS_ModifedService_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_ModifedService_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_ModifedService_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_ModifedService_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_RequiredUEAction_Mod mbms_RequiredUEAction, 
		    Mbms_PreferredFrequency mbms_PreferredFrequency, 
		    Dummy dummy, BOOLEAN continueMCCHReading)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setMbms_RequiredUEAction(mbms_RequiredUEAction);
	setMbms_PreferredFrequency(mbms_PreferredFrequency);
	setDummy(dummy);
	setContinueMCCHReading(continueMCCHReading);
    }
    
    /**
     * Construct with components.
     */
    public MBMS_ModifedService_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_RequiredUEAction_Mod mbms_RequiredUEAction, 
		    Mbms_PreferredFrequency mbms_PreferredFrequency, 
		    Dummy dummy, boolean continueMCCHReading)
    {
	this(mbms_TransmissionIdentity, mbms_RequiredUEAction, 
	     mbms_PreferredFrequency, dummy, 
	     new BOOLEAN(continueMCCHReading));
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_ModifedService_r6(MBMS_TransmissionIdentity mbms_TransmissionIdentity, 
		    MBMS_RequiredUEAction_Mod mbms_RequiredUEAction, 
		    boolean continueMCCHReading)
    {
	setMbms_TransmissionIdentity(mbms_TransmissionIdentity);
	setMbms_RequiredUEAction(mbms_RequiredUEAction);
	setContinueMCCHReading(continueMCCHReading);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_TransmissionIdentity();
	mComponents[1] = MBMS_RequiredUEAction_Mod.none;
	mComponents[2] = new Mbms_PreferredFrequency();
	mComponents[3] = Dummy._true;
	mComponents[4] = new BOOLEAN();
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
		return new MBMS_TransmissionIdentity();
	    case 1:
		return MBMS_RequiredUEAction_Mod.none;
	    case 2:
		return new Mbms_PreferredFrequency();
	    case 3:
		return Dummy._true;
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mbms_TransmissionIdentity"
    public MBMS_TransmissionIdentity getMbms_TransmissionIdentity()
    {
	return (MBMS_TransmissionIdentity)mComponents[0];
    }
    
    public void setMbms_TransmissionIdentity(MBMS_TransmissionIdentity mbms_TransmissionIdentity)
    {
	mComponents[0] = mbms_TransmissionIdentity;
    }
    
    
    // Methods for field "mbms_RequiredUEAction"
    public MBMS_RequiredUEAction_Mod getMbms_RequiredUEAction()
    {
	return (MBMS_RequiredUEAction_Mod)mComponents[1];
    }
    
    public void setMbms_RequiredUEAction(MBMS_RequiredUEAction_Mod mbms_RequiredUEAction)
    {
	mComponents[1] = mbms_RequiredUEAction;
    }
    
    
    // Methods for field "mbms_PreferredFrequency"
    public Mbms_PreferredFrequency getMbms_PreferredFrequency()
    {
	return (Mbms_PreferredFrequency)mComponents[2];
    }
    
    public void setMbms_PreferredFrequency(Mbms_PreferredFrequency mbms_PreferredFrequency)
    {
	mComponents[2] = mbms_PreferredFrequency;
    }
    
    public boolean hasMbms_PreferredFrequency()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMbms_PreferredFrequency()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Mbms_PreferredFrequency from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class Mbms_PreferredFrequency extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Mbms_PreferredFrequency()
	{
	}
	
	public static final  int  mcch_chosen = 1;
	public static final  int  dcch_chosen = 2;
	
	// Methods for field "mcch"
	public static Mbms_PreferredFrequency createMbms_PreferredFrequencyWithMcch(long mcch)
	{
	    return createMbms_PreferredFrequencyWithMcch(new MBMS_PFLIndex(mcch));
	}
	
	public static Mbms_PreferredFrequency createMbms_PreferredFrequencyWithMcch(MBMS_PFLIndex mcch)
	{
	    Mbms_PreferredFrequency __object = new Mbms_PreferredFrequency();

	    __object.setMcch(mcch);
	    return __object;
	}
	
	public boolean hasMcch()
	{
	    return getChosenFlag() == mcch_chosen;
	}
	
	public void setMcch(long mcch)
	{
	    setMcch(new MBMS_PFLIndex(mcch));
	}
	
	public void setMcch(MBMS_PFLIndex mcch)
	{
	    setChosenValue(mcch);
	    setChosenFlag(mcch_chosen);
	}
	
	
	// Methods for field "dcch"
	public static Mbms_PreferredFrequency createMbms_PreferredFrequencyWithDcch(MBMS_PFLInfo dcch)
	{
	    Mbms_PreferredFrequency __object = new Mbms_PreferredFrequency();

	    __object.setDcch(dcch);
	    return __object;
	}
	
	public boolean hasDcch()
	{
	    return getChosenFlag() == dcch_chosen;
	}
	
	public void setDcch(MBMS_PFLInfo dcch)
	{
	    setChosenValue(dcch);
	    setChosenFlag(dcch_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case mcch_chosen:
		    return new MBMS_PFLIndex();
		case dcch_chosen:
		    return new MBMS_PFLInfo();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"MBMS_ModifedService_r6$Mbms_PreferredFrequency"
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
				    "MBMS_PFLIndex"
				),
				new QName (
				    "InformationElements",
				    "MBMS-PFLIndex"
				),
				12314,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new MBMS_PFLIndex(1), 
					new MBMS_PFLIndex(4),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(1),
				    new java.lang.Long(4)
				),
				null
			    )
			),
			"mcch",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MBMS_PFLInfo"
				),
				new QName (
				    "InformationElements",
				    "MBMS-PFLInfo"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_PFLInfo"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MBMS_PFLInfo"
				    )
				),
				0
			    )
			),
			"dcch",
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
	 * Get the type descriptor (TypeInfo) of 'this' Mbms_PreferredFrequency object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Mbms_PreferredFrequency object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Mbms_PreferredFrequency

    // Methods for field "dummy"
    public Dummy getDummy()
    {
	return (Dummy)mComponents[3];
    }
    
    public void setDummy(Dummy dummy)
    {
	mComponents[3] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Dummy from ASN1 Module InformationElements.
     * @see Enumerated
     */
    public static final class Dummy extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Dummy()
	{
	    super(cFirstNumber);
	}
	
	protected Dummy(long value)
	{
	    super(value);
	}
	
	// Named list definitions.
	public static final Dummy _true =
	    new Dummy(0);
	private final static Dummy cNamedNumbers[] = {
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
	
	public static Dummy valueOf(long value)
	{
	    return (Dummy)_true.lookupValue(value);
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
		"MBMS_ModifedService_r6$Dummy"
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
	 * Get the type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Dummy object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Dummy

    // Methods for field "continueMCCHReading"
    public boolean getContinueMCCHReading()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setContinueMCCHReading(boolean continueMCCHReading)
    {
	setContinueMCCHReading(new BOOLEAN(continueMCCHReading));
    }
    
    public void setContinueMCCHReading(BOOLEAN continueMCCHReading)
    {
	mComponents[4] = continueMCCHReading;
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
	    "MBMS_ModifedService_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-ModifedService-r6"
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
				"MBMS_TransmissionIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TransmissionIdentity"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MBMS_TransmissionIdentity"
				)
			    ),
			    0
			)
		    ),
		    "mbms-TransmissionIdentity",
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
				"MBMS_RequiredUEAction_Mod"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-RequiredUEAction-Mod"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"acquireCountingInfo",
					1
				    ),
				    new MemberListElement (
					"acquireCountingInfoPTM-RBsUnmodified",
					2
				    ),
				    new MemberListElement (
					"acquirePTM-RBInfo",
					3
				    ),
				    new MemberListElement (
					"requestPTPRB",
					4
				    ),
				    new MemberListElement (
					"releasePTM-RB",
					5
				    )
				}
			    ),
			    0,
			    MBMS_RequiredUEAction_Mod.none
			)
		    ),
		    "mbms-RequiredUEAction",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_ModifedService_r6$Mbms_PreferredFrequency"
			)
		    ),
		    "mbms-PreferredFrequency",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "MBMS_ModifedService_r6$Dummy"
			)
		    ),
		    "dummy",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "continueMCCHReading",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_ModifedService_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_ModifedService_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_ModifedService_r6
