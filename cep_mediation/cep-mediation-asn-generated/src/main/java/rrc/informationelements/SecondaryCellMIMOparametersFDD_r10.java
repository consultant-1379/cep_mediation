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
 * Define the ASN1 Type SecondaryCellMIMOparametersFDD_r10 from ASN1 Module InformationElements.
 * @see Choice
 */

public class SecondaryCellMIMOparametersFDD_r10 extends Choice {
    
    /**
     * The default constructor.
     */
    public SecondaryCellMIMOparametersFDD_r10()
    {
    }
    
    public static final  int  _continue_chosen = 1;
    public static final  int  newConfiguration_chosen = 2;
    
    // Methods for field "_continue"
    public static SecondaryCellMIMOparametersFDD_r10 createSecondaryCellMIMOparametersFDD_r10With_continue(Null _continue)
    {
	SecondaryCellMIMOparametersFDD_r10 __object = new SecondaryCellMIMOparametersFDD_r10();

	__object.set_continue(_continue);
	return __object;
    }
    
    public boolean has_continue()
    {
	return getChosenFlag() == _continue_chosen;
    }
    
    public void set_continue(Null _continue)
    {
	setChosenValue(_continue);
	setChosenFlag(_continue_chosen);
    }
    
    
    // Methods for field "newConfiguration"
    public static SecondaryCellMIMOparametersFDD_r10 createSecondaryCellMIMOparametersFDD_r10WithNewConfiguration(NewConfiguration newConfiguration)
    {
	SecondaryCellMIMOparametersFDD_r10 __object = new SecondaryCellMIMOparametersFDD_r10();

	__object.setNewConfiguration(newConfiguration);
	return __object;
    }
    
    public boolean hasNewConfiguration()
    {
	return getChosenFlag() == newConfiguration_chosen;
    }
    
    public void setNewConfiguration(NewConfiguration newConfiguration)
    {
	setChosenValue(newConfiguration);
	setChosenFlag(newConfiguration_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type NewConfiguration from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class NewConfiguration extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public NewConfiguration()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public NewConfiguration(MIMO_N_M_Ratio mimoN_M_Ratio, 
			MIMO_PilotConfiguration_r9 mimoPilotConfiguration, 
			PrecodingWeightSetRestriction precodingWeightSetRestriction)
	{
	    setMimoN_M_Ratio(mimoN_M_Ratio);
	    setMimoPilotConfiguration(mimoPilotConfiguration);
	    setPrecodingWeightSetRestriction(precodingWeightSetRestriction);
	}
	
	public void initComponents()
	{
	    mComponents[0] = MIMO_N_M_Ratio.mnm1_2;
	    mComponents[1] = new MIMO_PilotConfiguration_r9();
	    mComponents[2] = PrecodingWeightSetRestriction._true;
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
		    return MIMO_N_M_Ratio.mnm1_2;
		case 1:
		    return new MIMO_PilotConfiguration_r9();
		case 2:
		    return PrecodingWeightSetRestriction._true;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "mimoN_M_Ratio"
	public MIMO_N_M_Ratio getMimoN_M_Ratio()
	{
	    return (MIMO_N_M_Ratio)mComponents[0];
	}
	
	public void setMimoN_M_Ratio(MIMO_N_M_Ratio mimoN_M_Ratio)
	{
	    mComponents[0] = mimoN_M_Ratio;
	}
	
	public boolean hasMimoN_M_Ratio()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteMimoN_M_Ratio()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "mimoPilotConfiguration"
	public MIMO_PilotConfiguration_r9 getMimoPilotConfiguration()
	{
	    return (MIMO_PilotConfiguration_r9)mComponents[1];
	}
	
	public void setMimoPilotConfiguration(MIMO_PilotConfiguration_r9 mimoPilotConfiguration)
	{
	    mComponents[1] = mimoPilotConfiguration;
	}
	
	public boolean hasMimoPilotConfiguration()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteMimoPilotConfiguration()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "precodingWeightSetRestriction"
	public PrecodingWeightSetRestriction getPrecodingWeightSetRestriction()
	{
	    return (PrecodingWeightSetRestriction)mComponents[2];
	}
	
	public void setPrecodingWeightSetRestriction(PrecodingWeightSetRestriction precodingWeightSetRestriction)
	{
	    mComponents[2] = precodingWeightSetRestriction;
	}
	
	public boolean hasPrecodingWeightSetRestriction()
	{
	    return componentIsPresent(2);
	}
	
	public void deletePrecodingWeightSetRestriction()
	{
	    setComponentAbsent(2);
	}
	
	
	
	/**
	 * Define the ASN1 Type PrecodingWeightSetRestriction from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class PrecodingWeightSetRestriction extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private PrecodingWeightSetRestriction()
	    {
		super(cFirstNumber);
	    }
	    
	    protected PrecodingWeightSetRestriction(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final PrecodingWeightSetRestriction _true =
		new PrecodingWeightSetRestriction(0);
	    private final static PrecodingWeightSetRestriction cNamedNumbers[] = {
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
	    
	    public static PrecodingWeightSetRestriction valueOf(long value)
	    {
		return (PrecodingWeightSetRestriction)_true.lookupValue(value);
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
		    "SecondaryCellMIMOparametersFDD_r10$NewConfiguration$PrecodingWeightSetRestriction"
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
	     * Get the type descriptor (TypeInfo) of 'this' PrecodingWeightSetRestriction object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' PrecodingWeightSetRestriction object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for PrecodingWeightSetRestriction

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
		"SecondaryCellMIMOparametersFDD_r10$NewConfiguration"
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
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MIMO_N_M_Ratio"
				),
				new QName (
				    "InformationElements",
				    "MIMO-N-M-Ratio"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "mnm1-2",
					    0
					),
					new MemberListElement (
					    "mnm2-3",
					    1
					),
					new MemberListElement (
					    "mnm3-4",
					    2
					),
					new MemberListElement (
					    "mnm4-5",
					    3
					),
					new MemberListElement (
					    "mnm5-6",
					    4
					),
					new MemberListElement (
					    "mnm6-7",
					    5
					),
					new MemberListElement (
					    "mnm7-8",
					    6
					),
					new MemberListElement (
					    "mnm8-9",
					    7
					),
					new MemberListElement (
					    "mnm9-10",
					    8
					),
					new MemberListElement (
					    "mnm1-1",
					    9
					)
				    }
				),
				0,
				MIMO_N_M_Ratio.mnm1_2
			    )
			),
			"mimoN-M-Ratio",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "MIMO_PilotConfiguration_r9"
				),
				new QName (
				    "InformationElements",
				    "MIMO-PilotConfiguration-r9"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"MIMO_PilotConfiguration_r9"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"MIMO_PilotConfiguration_r9"
				    )
				),
				0
			    )
			),
			"mimoPilotConfiguration",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"SecondaryCellMIMOparametersFDD_r10$NewConfiguration$PrecodingWeightSetRestriction"
			    )
			),
			"precodingWeightSetRestriction",
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
	 * Get the type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' NewConfiguration object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for NewConfiguration

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case _continue_chosen:
		return new Null();
	    case newConfiguration_chosen:
		return new NewConfiguration();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "rrc.informationelements",
	    "SecondaryCellMIMOparametersFDD_r10"
	),
	new QName (
	    "InformationElements",
	    "SecondaryCellMIMOparametersFDD-r10"
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
		    "continue",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "SecondaryCellMIMOparametersFDD_r10$NewConfiguration"
			)
		    ),
		    "newConfiguration",
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
     * Get the type descriptor (TypeInfo) of 'this' SecondaryCellMIMOparametersFDD_r10 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecondaryCellMIMOparametersFDD_r10 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecondaryCellMIMOparametersFDD_r10
