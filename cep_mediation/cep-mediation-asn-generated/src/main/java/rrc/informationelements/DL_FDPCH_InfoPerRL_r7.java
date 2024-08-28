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
 * Define the ASN1 Type DL_FDPCH_InfoPerRL_r7 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_FDPCH_InfoPerRL_r7 extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_FDPCH_InfoPerRL_r7()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_FDPCH_InfoPerRL_r7(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
		    DPCH_FrameOffset fdpch_FrameOffset, 
		    FDPCH_SlotFormat fdpch_SlotFormat, 
		    SecondaryCPICH_Info secondaryCPICH_Info, 
		    SecondaryScramblingCode secondaryScramblingCode, 
		    INTEGER dl_ChannelisationCode, 
		    TPC_CombinationIndex tpc_CombinationIndex, 
		    STTDIndication sttdIndication)
    {
	setPCPICH_UsageForChannelEst(pCPICH_UsageForChannelEst);
	setFdpch_FrameOffset(fdpch_FrameOffset);
	setFdpch_SlotFormat(fdpch_SlotFormat);
	setSecondaryCPICH_Info(secondaryCPICH_Info);
	setSecondaryScramblingCode(secondaryScramblingCode);
	setDl_ChannelisationCode(dl_ChannelisationCode);
	setTpc_CombinationIndex(tpc_CombinationIndex);
	setSttdIndication(sttdIndication);
    }
    
    /**
     * Construct with components.
     */
    public DL_FDPCH_InfoPerRL_r7(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
		    DPCH_FrameOffset fdpch_FrameOffset, 
		    FDPCH_SlotFormat fdpch_SlotFormat, 
		    SecondaryCPICH_Info secondaryCPICH_Info, 
		    SecondaryScramblingCode secondaryScramblingCode, 
		    long dl_ChannelisationCode, 
		    TPC_CombinationIndex tpc_CombinationIndex, 
		    STTDIndication sttdIndication)
    {
	this(pCPICH_UsageForChannelEst, fdpch_FrameOffset, 
	     fdpch_SlotFormat, secondaryCPICH_Info, 
	     secondaryScramblingCode, new INTEGER(dl_ChannelisationCode), 
	     tpc_CombinationIndex, sttdIndication);
    }
    
    /**
     * Construct with required components.
     */
    public DL_FDPCH_InfoPerRL_r7(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
		    DPCH_FrameOffset fdpch_FrameOffset, 
		    long dl_ChannelisationCode, 
		    TPC_CombinationIndex tpc_CombinationIndex)
    {
	setPCPICH_UsageForChannelEst(pCPICH_UsageForChannelEst);
	setFdpch_FrameOffset(fdpch_FrameOffset);
	setDl_ChannelisationCode(dl_ChannelisationCode);
	setTpc_CombinationIndex(tpc_CombinationIndex);
    }
    
    public void initComponents()
    {
	mComponents[0] = PCPICH_UsageForChannelEst.mayBeUsed;
	mComponents[1] = new DPCH_FrameOffset();
	mComponents[2] = new FDPCH_SlotFormat();
	mComponents[3] = new SecondaryCPICH_Info();
	mComponents[4] = new SecondaryScramblingCode();
	mComponents[5] = new INTEGER();
	mComponents[6] = new TPC_CombinationIndex();
	mComponents[7] = STTDIndication._true;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return PCPICH_UsageForChannelEst.mayBeUsed;
	    case 1:
		return new DPCH_FrameOffset();
	    case 2:
		return new FDPCH_SlotFormat();
	    case 3:
		return new SecondaryCPICH_Info();
	    case 4:
		return new SecondaryScramblingCode();
	    case 5:
		return new INTEGER();
	    case 6:
		return new TPC_CombinationIndex();
	    case 7:
		return STTDIndication._true;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pCPICH_UsageForChannelEst"
    public PCPICH_UsageForChannelEst getPCPICH_UsageForChannelEst()
    {
	return (PCPICH_UsageForChannelEst)mComponents[0];
    }
    
    public void setPCPICH_UsageForChannelEst(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst)
    {
	mComponents[0] = pCPICH_UsageForChannelEst;
    }
    
    
    // Methods for field "fdpch_FrameOffset"
    public DPCH_FrameOffset getFdpch_FrameOffset()
    {
	return (DPCH_FrameOffset)mComponents[1];
    }
    
    public void setFdpch_FrameOffset(DPCH_FrameOffset fdpch_FrameOffset)
    {
	mComponents[1] = fdpch_FrameOffset;
    }
    
    
    // Methods for field "fdpch_SlotFormat"
    public FDPCH_SlotFormat getFdpch_SlotFormat()
    {
	return (FDPCH_SlotFormat)mComponents[2];
    }
    
    public void setFdpch_SlotFormat(FDPCH_SlotFormat fdpch_SlotFormat)
    {
	mComponents[2] = fdpch_SlotFormat;
    }
    
    public boolean hasFdpch_SlotFormat()
    {
	return componentIsPresent(2);
    }
    
    public void deleteFdpch_SlotFormat()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "secondaryCPICH_Info"
    public SecondaryCPICH_Info getSecondaryCPICH_Info()
    {
	return (SecondaryCPICH_Info)mComponents[3];
    }
    
    public void setSecondaryCPICH_Info(SecondaryCPICH_Info secondaryCPICH_Info)
    {
	mComponents[3] = secondaryCPICH_Info;
    }
    
    public boolean hasSecondaryCPICH_Info()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSecondaryCPICH_Info()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "secondaryScramblingCode"
    public SecondaryScramblingCode getSecondaryScramblingCode()
    {
	return (SecondaryScramblingCode)mComponents[4];
    }
    
    public void setSecondaryScramblingCode(SecondaryScramblingCode secondaryScramblingCode)
    {
	mComponents[4] = secondaryScramblingCode;
    }
    
    public boolean hasSecondaryScramblingCode()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSecondaryScramblingCode()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "dl_ChannelisationCode"
    public long getDl_ChannelisationCode()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setDl_ChannelisationCode(long dl_ChannelisationCode)
    {
	setDl_ChannelisationCode(new INTEGER(dl_ChannelisationCode));
    }
    
    public void setDl_ChannelisationCode(INTEGER dl_ChannelisationCode)
    {
	mComponents[5] = dl_ChannelisationCode;
    }
    
    
    // Methods for field "tpc_CombinationIndex"
    public TPC_CombinationIndex getTpc_CombinationIndex()
    {
	return (TPC_CombinationIndex)mComponents[6];
    }
    
    public void setTpc_CombinationIndex(TPC_CombinationIndex tpc_CombinationIndex)
    {
	mComponents[6] = tpc_CombinationIndex;
    }
    
    
    // Methods for field "sttdIndication"
    public STTDIndication getSttdIndication()
    {
	return (STTDIndication)mComponents[7];
    }
    
    public void setSttdIndication(STTDIndication sttdIndication)
    {
	mComponents[7] = sttdIndication;
    }
    
    public boolean hasSttdIndication()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSttdIndication()
    {
	setComponentAbsent(7);
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
	    "DL_FDPCH_InfoPerRL_r7"
	),
	new QName (
	    "InformationElements",
	    "DL-FDPCH-InfoPerRL-r7"
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
				"PCPICH_UsageForChannelEst"
			    ),
			    new QName (
				"InformationElements",
				"PCPICH-UsageForChannelEst"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mayBeUsed",
					0
				    ),
				    new MemberListElement (
					"shallNotBeUsed",
					1
				    )
				}
			    ),
			    0,
			    PCPICH_UsageForChannelEst.mayBeUsed
			)
		    ),
		    "pCPICH-UsageForChannelEst",
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
				"DPCH_FrameOffset"
			    ),
			    new QName (
				"InformationElements",
				"DPCH-FrameOffset"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DPCH_FrameOffset(0), 
				    new DPCH_FrameOffset(149),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(149)
			    ),
			    null
			)
		    ),
		    "fdpch-FrameOffset",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"FDPCH_SlotFormat"
			    ),
			    new QName (
				"InformationElements",
				"FDPCH-SlotFormat"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new FDPCH_SlotFormat(0), 
				    new FDPCH_SlotFormat(9),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(9)
			    ),
			    null
			)
		    ),
		    "fdpch-SlotFormat",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"SecondaryCPICH_Info"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryCPICH-Info"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCPICH_Info"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "SecondaryCPICH_Info"
				)
			    ),
			    0
			)
		    ),
		    "secondaryCPICH-Info",
		    3,
		    3,
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
				"SecondaryScramblingCode"
			    ),
			    new QName (
				"InformationElements",
				"SecondaryScramblingCode"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SecondaryScramblingCode(1), 
				    new SecondaryScramblingCode(15),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(15)
			    ),
			    null
			)
		    ),
		    "secondaryScramblingCode",
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
				    new com.oss.asn1.INTEGER(255),
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
		    "dl-ChannelisationCode",
		    5,
		    2,
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
				"rrc.informationelements",
				"TPC_CombinationIndex"
			    ),
			    new QName (
				"InformationElements",
				"TPC-CombinationIndex"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TPC_CombinationIndex(0), 
				    new TPC_CombinationIndex(5),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(5)
			    ),
			    null
			)
		    ),
		    "tpc-CombinationIndex",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"STTDIndication"
			    ),
			    new QName (
				"InformationElements",
				"STTDIndication"
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
			    STTDIndication._true
			)
		    ),
		    "sttdIndication",
		    7,
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
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_FDPCH_InfoPerRL_r7 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_FDPCH_InfoPerRL_r7 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_FDPCH_InfoPerRL_r7
