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
 * Define the ASN1 Type DL_DPCH_InfoPerRL_PostFDD from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_DPCH_InfoPerRL_PostFDD extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_DPCH_InfoPerRL_PostFDD()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_DPCH_InfoPerRL_PostFDD(PCPICH_UsageForChannelEst pCPICH_UsageForChannelEst, 
		    DL_ChannelisationCode dl_ChannelisationCode, 
		    TPC_CombinationIndex tpc_CombinationIndex)
    {
	setPCPICH_UsageForChannelEst(pCPICH_UsageForChannelEst);
	setDl_ChannelisationCode(dl_ChannelisationCode);
	setTpc_CombinationIndex(tpc_CombinationIndex);
    }
    
    public void initComponents()
    {
	mComponents[0] = PCPICH_UsageForChannelEst.mayBeUsed;
	mComponents[1] = new DL_ChannelisationCode();
	mComponents[2] = new TPC_CombinationIndex();
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
		return PCPICH_UsageForChannelEst.mayBeUsed;
	    case 1:
		return new DL_ChannelisationCode();
	    case 2:
		return new TPC_CombinationIndex();
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
    
    
    // Methods for field "dl_ChannelisationCode"
    public DL_ChannelisationCode getDl_ChannelisationCode()
    {
	return (DL_ChannelisationCode)mComponents[1];
    }
    
    public void setDl_ChannelisationCode(DL_ChannelisationCode dl_ChannelisationCode)
    {
	mComponents[1] = dl_ChannelisationCode;
    }
    
    
    // Methods for field "tpc_CombinationIndex"
    public TPC_CombinationIndex getTpc_CombinationIndex()
    {
	return (TPC_CombinationIndex)mComponents[2];
    }
    
    public void setTpc_CombinationIndex(TPC_CombinationIndex tpc_CombinationIndex)
    {
	mComponents[2] = tpc_CombinationIndex;
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
	    "DL_DPCH_InfoPerRL_PostFDD"
	),
	new QName (
	    "InformationElements",
	    "DL-DPCH-InfoPerRL-PostFDD"
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
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"DL_ChannelisationCode"
			    ),
			    new QName (
				"InformationElements",
				"DL-ChannelisationCode"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "DL_ChannelisationCode"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "DL_ChannelisationCode"
				)
			    ),
			    0
			)
		    ),
		    "dl-ChannelisationCode",
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
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_DPCH_InfoPerRL_PostFDD object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_DPCH_InfoPerRL_PostFDD object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_DPCH_InfoPerRL_PostFDD
