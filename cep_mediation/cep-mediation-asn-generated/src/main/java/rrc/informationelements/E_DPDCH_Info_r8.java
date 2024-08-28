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
 * Define the ASN1 Type E_DPDCH_Info_r8 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class E_DPDCH_Info_r8 extends Sequence {
    
    /**
     * The default constructor.
     */
    public E_DPDCH_Info_r8()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public E_DPDCH_Info_r8(E_TFCI_TableIndex e_TFCI_TableIndex, 
		    E_DCH_MinimumSet_E_TFCI e_DCH_MinimumSet_E_TFCI, 
		    E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs, 
		    MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor, 
		    E_DPDCH_MaxChannelisationCodes maxChannelisationCodes, 
		    E_DPDCH_PL_NonMax pl_NonMax, 
		    E_DPDCH_SchedulingInfoConfiguration schedulingInfoConfiguration, 
		    INTEGER threeIndexStepThreshold, 
		    INTEGER twoIndexStepThreshold)
    {
	setE_TFCI_TableIndex(e_TFCI_TableIndex);
	setE_DCH_MinimumSet_E_TFCI(e_DCH_MinimumSet_E_TFCI);
	setReference_E_TFCIs(reference_E_TFCIs);
	setMinReduced_E_DPDCH_GainFactor(minReduced_E_DPDCH_GainFactor);
	setMaxChannelisationCodes(maxChannelisationCodes);
	setPl_NonMax(pl_NonMax);
	setSchedulingInfoConfiguration(schedulingInfoConfiguration);
	setThreeIndexStepThreshold(threeIndexStepThreshold);
	setTwoIndexStepThreshold(twoIndexStepThreshold);
    }
    
    /**
     * Construct with components.
     */
    public E_DPDCH_Info_r8(E_TFCI_TableIndex e_TFCI_TableIndex, 
		    E_DCH_MinimumSet_E_TFCI e_DCH_MinimumSet_E_TFCI, 
		    E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs, 
		    MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor, 
		    E_DPDCH_MaxChannelisationCodes maxChannelisationCodes, 
		    E_DPDCH_PL_NonMax pl_NonMax, 
		    E_DPDCH_SchedulingInfoConfiguration schedulingInfoConfiguration, 
		    long threeIndexStepThreshold, long twoIndexStepThreshold)
    {
	this(e_TFCI_TableIndex, e_DCH_MinimumSet_E_TFCI, reference_E_TFCIs, 
	     minReduced_E_DPDCH_GainFactor, maxChannelisationCodes, 
	     pl_NonMax, schedulingInfoConfiguration, 
	     new INTEGER(threeIndexStepThreshold), 
	     new INTEGER(twoIndexStepThreshold));
    }
    
    /**
     * Construct with required components.
     */
    public E_DPDCH_Info_r8(E_TFCI_TableIndex e_TFCI_TableIndex, 
		    E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs, 
		    E_DPDCH_MaxChannelisationCodes maxChannelisationCodes, 
		    E_DPDCH_PL_NonMax pl_NonMax, 
		    E_DPDCH_SchedulingInfoConfiguration schedulingInfoConfiguration)
    {
	setE_TFCI_TableIndex(e_TFCI_TableIndex);
	setReference_E_TFCIs(reference_E_TFCIs);
	setMaxChannelisationCodes(maxChannelisationCodes);
	setPl_NonMax(pl_NonMax);
	setSchedulingInfoConfiguration(schedulingInfoConfiguration);
    }
    
    public void initComponents()
    {
	mComponents[0] = new E_TFCI_TableIndex();
	mComponents[1] = new E_DCH_MinimumSet_E_TFCI();
	mComponents[2] = new E_DPDCH_Reference_E_TFCIList_r7();
	mComponents[3] = MinReduced_E_DPDCH_GainFactor.m8_15;
	mComponents[4] = E_DPDCH_MaxChannelisationCodes.sf256;
	mComponents[5] = new E_DPDCH_PL_NonMax();
	mComponents[6] = new E_DPDCH_SchedulingInfoConfiguration();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new E_TFCI_TableIndex();
	    case 1:
		return new E_DCH_MinimumSet_E_TFCI();
	    case 2:
		return new E_DPDCH_Reference_E_TFCIList_r7();
	    case 3:
		return MinReduced_E_DPDCH_GainFactor.m8_15;
	    case 4:
		return E_DPDCH_MaxChannelisationCodes.sf256;
	    case 5:
		return new E_DPDCH_PL_NonMax();
	    case 6:
		return new E_DPDCH_SchedulingInfoConfiguration();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "e_TFCI_TableIndex"
    public E_TFCI_TableIndex getE_TFCI_TableIndex()
    {
	return (E_TFCI_TableIndex)mComponents[0];
    }
    
    public void setE_TFCI_TableIndex(E_TFCI_TableIndex e_TFCI_TableIndex)
    {
	mComponents[0] = e_TFCI_TableIndex;
    }
    
    
    // Methods for field "e_DCH_MinimumSet_E_TFCI"
    public E_DCH_MinimumSet_E_TFCI getE_DCH_MinimumSet_E_TFCI()
    {
	return (E_DCH_MinimumSet_E_TFCI)mComponents[1];
    }
    
    public void setE_DCH_MinimumSet_E_TFCI(E_DCH_MinimumSet_E_TFCI e_DCH_MinimumSet_E_TFCI)
    {
	mComponents[1] = e_DCH_MinimumSet_E_TFCI;
    }
    
    public boolean hasE_DCH_MinimumSet_E_TFCI()
    {
	return componentIsPresent(1);
    }
    
    public void deleteE_DCH_MinimumSet_E_TFCI()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "reference_E_TFCIs"
    public E_DPDCH_Reference_E_TFCIList_r7 getReference_E_TFCIs()
    {
	return (E_DPDCH_Reference_E_TFCIList_r7)mComponents[2];
    }
    
    public void setReference_E_TFCIs(E_DPDCH_Reference_E_TFCIList_r7 reference_E_TFCIs)
    {
	mComponents[2] = reference_E_TFCIs;
    }
    
    
    // Methods for field "minReduced_E_DPDCH_GainFactor"
    public MinReduced_E_DPDCH_GainFactor getMinReduced_E_DPDCH_GainFactor()
    {
	return (MinReduced_E_DPDCH_GainFactor)mComponents[3];
    }
    
    public void setMinReduced_E_DPDCH_GainFactor(MinReduced_E_DPDCH_GainFactor minReduced_E_DPDCH_GainFactor)
    {
	mComponents[3] = minReduced_E_DPDCH_GainFactor;
    }
    
    public boolean hasMinReduced_E_DPDCH_GainFactor()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMinReduced_E_DPDCH_GainFactor()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "maxChannelisationCodes"
    public E_DPDCH_MaxChannelisationCodes getMaxChannelisationCodes()
    {
	return (E_DPDCH_MaxChannelisationCodes)mComponents[4];
    }
    
    public void setMaxChannelisationCodes(E_DPDCH_MaxChannelisationCodes maxChannelisationCodes)
    {
	mComponents[4] = maxChannelisationCodes;
    }
    
    
    // Methods for field "pl_NonMax"
    public E_DPDCH_PL_NonMax getPl_NonMax()
    {
	return (E_DPDCH_PL_NonMax)mComponents[5];
    }
    
    public void setPl_NonMax(E_DPDCH_PL_NonMax pl_NonMax)
    {
	mComponents[5] = pl_NonMax;
    }
    
    
    // Methods for field "schedulingInfoConfiguration"
    public E_DPDCH_SchedulingInfoConfiguration getSchedulingInfoConfiguration()
    {
	return (E_DPDCH_SchedulingInfoConfiguration)mComponents[6];
    }
    
    public void setSchedulingInfoConfiguration(E_DPDCH_SchedulingInfoConfiguration schedulingInfoConfiguration)
    {
	mComponents[6] = schedulingInfoConfiguration;
    }
    
    
    // Methods for field "threeIndexStepThreshold"
    public long getThreeIndexStepThreshold()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setThreeIndexStepThreshold(long threeIndexStepThreshold)
    {
	setThreeIndexStepThreshold(new INTEGER(threeIndexStepThreshold));
    }
    
    public void setThreeIndexStepThreshold(INTEGER threeIndexStepThreshold)
    {
	mComponents[7] = threeIndexStepThreshold;
    }
    
    public boolean hasThreeIndexStepThreshold()
    {
	return componentIsPresent(7);
    }
    
    public void deleteThreeIndexStepThreshold()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "twoIndexStepThreshold"
    public long getTwoIndexStepThreshold()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setTwoIndexStepThreshold(long twoIndexStepThreshold)
    {
	setTwoIndexStepThreshold(new INTEGER(twoIndexStepThreshold));
    }
    
    public void setTwoIndexStepThreshold(INTEGER twoIndexStepThreshold)
    {
	mComponents[8] = twoIndexStepThreshold;
    }
    
    public boolean hasTwoIndexStepThreshold()
    {
	return componentIsPresent(8);
    }
    
    public void deleteTwoIndexStepThreshold()
    {
	setComponentAbsent(8);
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
	    "E_DPDCH_Info_r8"
	),
	new QName (
	    "InformationElements",
	    "E-DPDCH-Info-r8"
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
				"E_TFCI_TableIndex"
			    ),
			    new QName (
				"InformationElements",
				"E-TFCI-TableIndex"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_TFCI_TableIndex(0), 
				    new E_TFCI_TableIndex(1),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1)
			    ),
			    null
			)
		    ),
		    "e-TFCI-TableIndex",
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
				"E_DCH_MinimumSet_E_TFCI"
			    ),
			    new QName (
				"InformationElements",
				"E-DCH-MinimumSet-E-TFCI"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DCH_MinimumSet_E_TFCI(0), 
				    new E_DCH_MinimumSet_E_TFCI(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "e-DCH-MinimumSet-E-TFCI",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_Reference_E_TFCIList_r7"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-Reference-E-TFCIList-r7"
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
				    "E_DPDCH_Reference_E_TFCI_r7"
				)
			    )
			)
		    ),
		    "reference-E-TFCIs",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MinReduced_E_DPDCH_GainFactor"
			    ),
			    new QName (
				"InformationElements",
				"MinReduced-E-DPDCH-GainFactor"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"m8-15",
					0
				    ),
				    new MemberListElement (
					"m11-15",
					1
				    ),
				    new MemberListElement (
					"m15-15",
					2
				    ),
				    new MemberListElement (
					"m21-15",
					3
				    ),
				    new MemberListElement (
					"m30-15",
					4
				    ),
				    new MemberListElement (
					"m42-15",
					5
				    ),
				    new MemberListElement (
					"m60-15",
					6
				    ),
				    new MemberListElement (
					"m84-15",
					7
				    )
				}
			    ),
			    0,
			    MinReduced_E_DPDCH_GainFactor.m8_15
			)
		    ),
		    "minReduced-E-DPDCH-GainFactor",
		    3,
		    3,
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
				"E_DPDCH_MaxChannelisationCodes"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-MaxChannelisationCodes"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sf256",
					0
				    ),
				    new MemberListElement (
					"sf128",
					1
				    ),
				    new MemberListElement (
					"sf64",
					2
				    ),
				    new MemberListElement (
					"sf32",
					3
				    ),
				    new MemberListElement (
					"sf16",
					4
				    ),
				    new MemberListElement (
					"sf8",
					5
				    ),
				    new MemberListElement (
					"sf4",
					6
				    ),
				    new MemberListElement (
					"sf4x2",
					7
				    ),
				    new MemberListElement (
					"sf2x2",
					8
				    ),
				    new MemberListElement (
					"sf4x2-and-sf2x2",
					9
				    )
				}
			    ),
			    0,
			    E_DPDCH_MaxChannelisationCodes.sf256
			)
		    ),
		    "maxChannelisationCodes",
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
				"E_DPDCH_PL_NonMax"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-PL-NonMax"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new E_DPDCH_PL_NonMax(11), 
				    new E_DPDCH_PL_NonMax(25),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(11),
				new java.lang.Long(25)
			    ),
			    null
			)
		    ),
		    "pl-NonMax",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"E_DPDCH_SchedulingInfoConfiguration"
			    ),
			    new QName (
				"InformationElements",
				"E-DPDCH-SchedulingInfoConfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_SchedulingInfoConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "E_DPDCH_SchedulingInfoConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "schedulingInfoConfiguration",
		    6,
		    2,
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
		    "threeIndexStepThreshold",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    8,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' E_DPDCH_Info_r8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' E_DPDCH_Info_r8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for E_DPDCH_Info_r8
