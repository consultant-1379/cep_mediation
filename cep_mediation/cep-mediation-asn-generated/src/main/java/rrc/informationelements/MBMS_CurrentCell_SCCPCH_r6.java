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
 * Define the ASN1 Type MBMS_CurrentCell_SCCPCH_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MBMS_CurrentCell_SCCPCH_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MBMS_CurrentCell_SCCPCH_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MBMS_CurrentCell_SCCPCH_r6(MBMS_SCCPCHIdentity sccpchIdentity, 
		    MBMS_CommonPhyChIdentity secondaryCCPCH_Info, 
		    MBMS_SoftComb_TimingOffset softComb_TimingOffset, 
		    MBMS_CommonCCTrChIdentity transpCh_InfoCommonForAllTrCh, 
		    MBMS_TrCHInformation_CurrList transpCHInformation)
    {
	setSccpchIdentity(sccpchIdentity);
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setSoftComb_TimingOffset(softComb_TimingOffset);
	setTranspCh_InfoCommonForAllTrCh(transpCh_InfoCommonForAllTrCh);
	setTranspCHInformation(transpCHInformation);
    }
    
    /**
     * Construct with required components.
     */
    public MBMS_CurrentCell_SCCPCH_r6(MBMS_CommonPhyChIdentity secondaryCCPCH_Info, 
		    MBMS_TrCHInformation_CurrList transpCHInformation)
    {
	setSecondaryCCPCH_Info(secondaryCCPCH_Info);
	setTranspCHInformation(transpCHInformation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MBMS_SCCPCHIdentity();
	mComponents[1] = new MBMS_CommonPhyChIdentity();
	mComponents[2] = MBMS_SoftComb_TimingOffset.ms0;
	mComponents[3] = new MBMS_CommonCCTrChIdentity();
	mComponents[4] = new MBMS_TrCHInformation_CurrList();
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
		return new MBMS_SCCPCHIdentity();
	    case 1:
		return new MBMS_CommonPhyChIdentity();
	    case 2:
		return MBMS_SoftComb_TimingOffset.ms0;
	    case 3:
		return new MBMS_CommonCCTrChIdentity();
	    case 4:
		return new MBMS_TrCHInformation_CurrList();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "sccpchIdentity"
    public MBMS_SCCPCHIdentity getSccpchIdentity()
    {
	return (MBMS_SCCPCHIdentity)mComponents[0];
    }
    
    public void setSccpchIdentity(MBMS_SCCPCHIdentity sccpchIdentity)
    {
	mComponents[0] = sccpchIdentity;
    }
    
    public boolean hasSccpchIdentity()
    {
	return componentIsPresent(0);
    }
    
    public void deleteSccpchIdentity()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "secondaryCCPCH_Info"
    public MBMS_CommonPhyChIdentity getSecondaryCCPCH_Info()
    {
	return (MBMS_CommonPhyChIdentity)mComponents[1];
    }
    
    public void setSecondaryCCPCH_Info(MBMS_CommonPhyChIdentity secondaryCCPCH_Info)
    {
	mComponents[1] = secondaryCCPCH_Info;
    }
    
    
    // Methods for field "softComb_TimingOffset"
    public MBMS_SoftComb_TimingOffset getSoftComb_TimingOffset()
    {
	return (MBMS_SoftComb_TimingOffset)mComponents[2];
    }
    
    public void setSoftComb_TimingOffset(MBMS_SoftComb_TimingOffset softComb_TimingOffset)
    {
	mComponents[2] = softComb_TimingOffset;
    }
    
    public boolean hasSoftComb_TimingOffset()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSoftComb_TimingOffset()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "transpCh_InfoCommonForAllTrCh"
    public MBMS_CommonCCTrChIdentity getTranspCh_InfoCommonForAllTrCh()
    {
	return (MBMS_CommonCCTrChIdentity)mComponents[3];
    }
    
    public void setTranspCh_InfoCommonForAllTrCh(MBMS_CommonCCTrChIdentity transpCh_InfoCommonForAllTrCh)
    {
	mComponents[3] = transpCh_InfoCommonForAllTrCh;
    }
    
    public boolean hasTranspCh_InfoCommonForAllTrCh()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTranspCh_InfoCommonForAllTrCh()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "transpCHInformation"
    public MBMS_TrCHInformation_CurrList getTranspCHInformation()
    {
	return (MBMS_TrCHInformation_CurrList)mComponents[4];
    }
    
    public void setTranspCHInformation(MBMS_TrCHInformation_CurrList transpCHInformation)
    {
	mComponents[4] = transpCHInformation;
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
	    "MBMS_CurrentCell_SCCPCH_r6"
	),
	new QName (
	    "InformationElements",
	    "MBMS-CurrentCell-SCCPCH-r6"
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
				"MBMS_SCCPCHIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SCCPCHIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_SCCPCHIdentity(1), 
				    new MBMS_SCCPCHIdentity(16),
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
		    "sccpchIdentity",
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
				"MBMS_CommonPhyChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonPhyChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonPhyChIdentity(1), 
				    new MBMS_CommonPhyChIdentity(32),
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
		    "secondaryCCPCH-Info",
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
				"MBMS_SoftComb_TimingOffset"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-SoftComb-TimingOffset"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms0",
					0
				    ),
				    new MemberListElement (
					"ms10",
					1
				    ),
				    new MemberListElement (
					"ms20",
					2
				    ),
				    new MemberListElement (
					"ms40",
					3
				    )
				}
			    ),
			    0,
			    MBMS_SoftComb_TimingOffset.ms0
			)
		    ),
		    "softComb-TimingOffset",
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
				"MBMS_CommonCCTrChIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-CommonCCTrChIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MBMS_CommonCCTrChIdentity(1), 
				    new MBMS_CommonCCTrChIdentity(32),
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
		    "transpCh-InfoCommonForAllTrCh",
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
				"MBMS_TrCHInformation_CurrList"
			    ),
			    new QName (
				"InformationElements",
				"MBMS-TrCHInformation-CurrList"
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
				    "MBMS_TrCHInformation_Curr"
				)
			    )
			)
		    ),
		    "transpCHInformation",
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
     * Get the type descriptor (TypeInfo) of 'this' MBMS_CurrentCell_SCCPCH_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MBMS_CurrentCell_SCCPCH_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MBMS_CurrentCell_SCCPCH_r6
