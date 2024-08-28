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
 * Define the ASN1 Type E_DCH_RL_InfoNewServingCell from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DCH_RL_InfoNewServingCell extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DCH_RL_InfoNewServingCell()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DCH_RL_InfoNewServingCell(PrimaryCPICH_Info primaryCPICH_Info, 
		    E_AGCH_Information e_AGCH_Information, 
		    ServingGrant servingGrant, 
		    E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset, 
		    E_DPDCH_Reference_E_TFCIList reference_E_TFCIs, 
		    INTEGER powerOffsetForSchedInfo, 
		    INTEGER threeIndexStepThreshold, 
		    INTEGER twoIndexStepThreshold, 
		    E_HICH_Information e_HICH_Information, 
		    E_RGCH_Info e_RGCH_Info)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setE_AGCH_Information(e_AGCH_Information);
	setServingGrant(servingGrant);
	setE_DPCCH_DPCCH_PowerOffset(e_DPCCH_DPCCH_PowerOffset);
	setReference_E_TFCIs(reference_E_TFCIs);
	setPowerOffsetForSchedInfo(powerOffsetForSchedInfo);
	setThreeIndexStepThreshold(threeIndexStepThreshold);
	setTwoIndexStepThreshold(twoIndexStepThreshold);
	setE_HICH_Information(e_HICH_Information);
	setE_RGCH_Info(e_RGCH_Info);
    }
    
    /**
     * Construct with components.
     */
    public E_DCH_RL_InfoNewServingCell(PrimaryCPICH_Info primaryCPICH_Info, 
		    E_AGCH_Information e_AGCH_Information, 
		    ServingGrant servingGrant, 
		    E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset, 
		    E_DPDCH_Reference_E_TFCIList reference_E_TFCIs, 
		    long powerOffsetForSchedInfo, 
		    long threeIndexStepThreshold, long twoIndexStepThreshold, 
		    E_HICH_Information e_HICH_Information, 
		    E_RGCH_Info e_RGCH_Info)
    {
	this(primaryCPICH_Info, e_AGCH_Information, servingGrant, 
	     e_DPCCH_DPCCH_PowerOffset, reference_E_TFCIs, 
	     new INTEGER(powerOffsetForSchedInfo), 
	     new INTEGER(threeIndexStepThreshold), 
	     new INTEGER(twoIndexStepThreshold), e_HICH_Information, 
	     e_RGCH_Info);
    }
    
    /**
     * Construct with required components.
     */
    public E_DCH_RL_InfoNewServingCell(PrimaryCPICH_Info primaryCPICH_Info, 
		    E_AGCH_Information e_AGCH_Information)
    {
	setPrimaryCPICH_Info(primaryCPICH_Info);
	setE_AGCH_Information(e_AGCH_Information);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrimaryCPICH_Info();
	mComponents[1] = new E_AGCH_Information();
	mComponents[2] = new ServingGrant();
	mComponents[3] = new E_DPCCH_DPCCH_PowerOffset();
	mComponents[4] = new E_DPDCH_Reference_E_TFCIList();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new E_HICH_Information();
	mComponents[9] = new E_RGCH_Info();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrimaryCPICH_Info();
	    case 1:
		return new E_AGCH_Information();
	    case 2:
		return new ServingGrant();
	    case 3:
		return new E_DPCCH_DPCCH_PowerOffset();
	    case 4:
		return new E_DPDCH_Reference_E_TFCIList();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new E_HICH_Information();
	    case 9:
		return new E_RGCH_Info();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryCPICH_Info"
    public PrimaryCPICH_Info getPrimaryCPICH_Info()
    {
	return (PrimaryCPICH_Info)mComponents[0];
    }
    
    public void setPrimaryCPICH_Info(PrimaryCPICH_Info primaryCPICH_Info)
    {
	mComponents[0] = primaryCPICH_Info;
    }
    
    
    // Methods for field "e_AGCH_Information"
    public E_AGCH_Information getE_AGCH_Information()
    {
	return (E_AGCH_Information)mComponents[1];
    }
    
    public void setE_AGCH_Information(E_AGCH_Information e_AGCH_Information)
    {
	mComponents[1] = e_AGCH_Information;
    }
    
    
    // Methods for field "servingGrant"
    public ServingGrant getServingGrant()
    {
	return (ServingGrant)mComponents[2];
    }
    
    public void setServingGrant(ServingGrant servingGrant)
    {
	mComponents[2] = servingGrant;
    }
    
    public boolean hasServingGrant()
    {
	return componentIsPresent(2);
    }
    
    public void deleteServingGrant()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type ServingGrant from ASN1 Module InformationElements.
     * @see Sequence
     */
    public static class ServingGrant extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public ServingGrant()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public ServingGrant(INTEGER value, 
			Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    setValue(value);
	    setPrimary_Secondary_GrantSelector(primary_Secondary_GrantSelector);
	}
	
	/**
	 * Construct with components.
	 */
	public ServingGrant(long value, 
			Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    this(new INTEGER(value), primary_Secondary_GrantSelector);
	}
	
	/**
	 * Construct with required components.
	 */
	public ServingGrant(Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    setPrimary_Secondary_GrantSelector(primary_Secondary_GrantSelector);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = Primary_Secondary_GrantSelector.primary;
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
		    return new INTEGER();
		case 1:
		    return Primary_Secondary_GrantSelector.primary;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "value"
	public long getValue()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setValue(long value)
	{
	    setValue(new INTEGER(value));
	}
	
	public void setValue(INTEGER value)
	{
	    mComponents[0] = value;
	}
	
	public boolean hasValue()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteValue()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "primary_Secondary_GrantSelector"
	public Primary_Secondary_GrantSelector getPrimary_Secondary_GrantSelector()
	{
	    return (Primary_Secondary_GrantSelector)mComponents[1];
	}
	
	public void setPrimary_Secondary_GrantSelector(Primary_Secondary_GrantSelector primary_Secondary_GrantSelector)
	{
	    mComponents[1] = primary_Secondary_GrantSelector;
	}
	
	
	
	/**
	 * Define the ASN1 Type Primary_Secondary_GrantSelector from ASN1 Module InformationElements.
	 * @see Enumerated
	 */
	public static final class Primary_Secondary_GrantSelector extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Primary_Secondary_GrantSelector()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Primary_Secondary_GrantSelector(long value)
	    {
		super(value);
	    }
	    
	    // Named list definitions.
	    public static final Primary_Secondary_GrantSelector primary =
		new Primary_Secondary_GrantSelector(0);
	    public static final Primary_Secondary_GrantSelector secondary =
		new Primary_Secondary_GrantSelector(1);
	    private final static Primary_Secondary_GrantSelector cNamedNumbers[] = {
		 primary, 
		 secondary
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
	    
	    public static Primary_Secondary_GrantSelector valueOf(long value)
	    {
		return (Primary_Secondary_GrantSelector)primary.lookupValue(value);
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
		    "E_DCH_RL_InfoNewServingCell$ServingGrant$Primary_Secondary_GrantSelector"
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
			    "primary",
			    0
			),
			new MemberListElement (
			    "secondary",
			    1
			)
		    }
		),
		0,
		primary
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Primary_Secondary_GrantSelector object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Primary_Secondary_GrantSelector

	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_DCH_RL_InfoNewServingCell$ServingGrant"
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
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(38),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(38)
				),
				null
			    )
			),
			"value",
			0,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"rrc.informationelements",
				"E_DCH_RL_InfoNewServingCell$ServingGrant$Primary_Secondary_GrantSelector"
			    )
			),
			"primary-Secondary-GrantSelector",
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
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
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
	 * Get the type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ServingGrant object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ServingGrant

    // Methods for field "e_DPCCH_DPCCH_PowerOffset"
    public E_DPCCH_DPCCH_PowerOffset getE_DPCCH_DPCCH_PowerOffset()
    {
	return (E_DPCCH_DPCCH_PowerOffset)mComponents[3];
    }
    
    public void setE_DPCCH_DPCCH_PowerOffset(E_DPCCH_DPCCH_PowerOffset e_DPCCH_DPCCH_PowerOffset)
    {
	mComponents[3] = e_DPCCH_DPCCH_PowerOffset;
    }
    
    public boolean hasE_DPCCH_DPCCH_PowerOffset()
    {
	return componentIsPresent(3);
    }
    
    public void deleteE_DPCCH_DPCCH_PowerOffset()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "reference_E_TFCIs"
    public E_DPDCH_Reference_E_TFCIList getReference_E_TFCIs()
    {
	return (E_DPDCH_Reference_E_TFCIList)mComponents[4];
    }
    
    public void setReference_E_TFCIs(E_DPDCH_Reference_E_TFCIList reference_E_TFCIs)
    {
	mComponents[4] = reference_E_TFCIs;
    }
    
    public boolean hasReference_E_TFCIs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteReference_E_TFCIs()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "powerOffsetForSchedInfo"
    public long getPowerOffsetForSchedInfo()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setPowerOffsetForSchedInfo(long powerOffsetForSchedInfo)
    {
	setPowerOffsetForSchedInfo(new INTEGER(powerOffsetForSchedInfo));
    }
    
    public void setPowerOffsetForSchedInfo(INTEGER powerOffsetForSchedInfo)
    {
	mComponents[5] = powerOffsetForSchedInfo;
    }
    
    public boolean hasPowerOffsetForSchedInfo()
    {
	return componentIsPresent(5);
    }
    
    public void deletePowerOffsetForSchedInfo()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "threeIndexStepThreshold"
    public long getThreeIndexStepThreshold()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setThreeIndexStepThreshold(long threeIndexStepThreshold)
    {
	setThreeIndexStepThreshold(new INTEGER(threeIndexStepThreshold));
    }
    
    public void setThreeIndexStepThreshold(INTEGER threeIndexStepThreshold)
    {
	mComponents[6] = threeIndexStepThreshold;
    }
    
    public boolean hasThreeIndexStepThreshold()
    {
	return componentIsPresent(6);
    }
    
    public void deleteThreeIndexStepThreshold()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "twoIndexStepThreshold"
    public long getTwoIndexStepThreshold()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setTwoIndexStepThreshold(long twoIndexStepThreshold)
    {
	setTwoIndexStepThreshold(new INTEGER(twoIndexStepThreshold));
    }
    
    public void setTwoIndexStepThreshold(INTEGER twoIndexStepThreshold)
    {
	mComponents[7] = twoIndexStepThreshold;
    }
    
    public boolean hasTwoIndexStepThreshold()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTwoIndexStepThreshold()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "e_HICH_Information"
    public E_HICH_Information getE_HICH_Information()
    {
	return (E_HICH_Information)mComponents[8];
    }
    
    public void setE_HICH_Information(E_HICH_Information e_HICH_Information)
    {
	mComponents[8] = e_HICH_Information;
    }
    
    public boolean hasE_HICH_Information()
    {
	return componentIsPresent(8);
    }
    
    public void deleteE_HICH_Information()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "e_RGCH_Info"
    public E_RGCH_Info getE_RGCH_Info()
    {
	return (E_RGCH_Info)mComponents[9];
    }
    
    public void setE_RGCH_Info(E_RGCH_Info e_RGCH_Info)
    {
	mComponents[9] = e_RGCH_Info;
    }
    
    public boolean hasE_RGCH_Info()
    {
	return componentIsPresent(9);
    }
    
    public void deleteE_RGCH_Info()
    {
	setComponentAbsent(9);
    }
    
    
    
    /**
     * Define the ASN1 Type E_RGCH_Info from ASN1 Module InformationElements.
     * @see Choice
     */
    public static class E_RGCH_Info extends Choice {
	
	/**
	 * The default constructor.
	 */
	public E_RGCH_Info()
	{
	}
	
	public static final  int  e_RGCH_Information_chosen = 1;
	public static final  int  releaseIndicator_chosen = 2;
	
	// Methods for field "e_RGCH_Information"
	public static E_RGCH_Info createE_RGCH_InfoWithE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
	{
	    E_RGCH_Info __object = new E_RGCH_Info();

	    __object.setE_RGCH_Information(e_RGCH_Information);
	    return __object;
	}
	
	public boolean hasE_RGCH_Information()
	{
	    return getChosenFlag() == e_RGCH_Information_chosen;
	}
	
	public void setE_RGCH_Information(E_RGCH_Information e_RGCH_Information)
	{
	    setChosenValue(e_RGCH_Information);
	    setChosenFlag(e_RGCH_Information_chosen);
	}
	
	
	// Methods for field "releaseIndicator"
	public static E_RGCH_Info createE_RGCH_InfoWithReleaseIndicator(Null releaseIndicator)
	{
	    E_RGCH_Info __object = new E_RGCH_Info();

	    __object.setReleaseIndicator(releaseIndicator);
	    return __object;
	}
	
	public boolean hasReleaseIndicator()
	{
	    return getChosenFlag() == releaseIndicator_chosen;
	}
	
	public void setReleaseIndicator(Null releaseIndicator)
	{
	    setChosenValue(releaseIndicator);
	    setChosenFlag(releaseIndicator_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case e_RGCH_Information_chosen:
		    return new E_RGCH_Information();
		case releaseIndicator_chosen:
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
		    (short)0x8009
		}
	    ),
	    new QName (
		"rrc.informationelements",
		"E_DCH_RL_InfoNewServingCell$E_RGCH_Info"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "rrc.informationelements",
				    "E_RGCH_Information"
				),
				new QName (
				    "InformationElements",
				    "E-RGCH-Information"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"rrc.informationelements",
					"E_RGCH_Information"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"rrc.informationelements",
					"E_RGCH_Information"
				    )
				),
				0
			    )
			),
			"e-RGCH-Information",
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
			"releaseIndicator",
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
	 * Get the type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' E_RGCH_Info object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for E_RGCH_Info

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
	    "E_DCH_RL_InfoNewServingCell"
	),
	new QName (
	    "InformationElements",
	    "E-DCH-RL-InfoNewServingCell"
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
				"PrimaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"PrimaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PrimaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "primaryCPICH-Info",
		    0,
		    2,
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
				"E_AGCH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-AGCH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_AGCH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-AGCH-Information",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_RL_InfoNewServingCell$ServingGrant"
			)
		    ),
		    "servingGrant",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPCCH_DPCCH_PowerOffset"
			    ),
			    new QName (
				"InformationElements",
				"E-DPCCH-DPCCH-PowerOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DPCCH_DPCCH_PowerOffset(0), 
				    new E_DPCCH_DPCCH_PowerOffset(8),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(8)
			    ),
			    null
			)
		    ),
		    "e-DPCCH-DPCCH-PowerOffset",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_Reference_E_TFCIList"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-Reference-E-TFCIList"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(8),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(8)
			    ),
			    new TypeInfoRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_Reference_E_TFCI"
				)
			    )
			)
		    ),
		    "reference-E-TFCIs",
		    4,
		    3,
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(6),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(6)
			    ),
			    null
			)
		    ),
		    "powerOffsetForSchedInfo",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(37),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(37)
			    ),
			    null
			)
		    ),
		    "threeIndexStepThreshold",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(37),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(37)
			    ),
			    null
			)
		    ),
		    "twoIndexStepThreshold",
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
				"E_HICH_Information"
			    ),
			    new QName (
				"InformationElements",
				"E-HICH-Information"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_HICH_Information"
				)
			    ),
			    0
			)
		    ),
		    "e-HICH-Information",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "rrc.informationelements",
			    "E_DCH_RL_InfoNewServingCell$E_RGCH_Info"
			)
		    ),
		    "e-RGCH-Info",
		    9,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoNewServingCell object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DCH_RL_InfoNewServingCell object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DCH_RL_InfoNewServingCell
