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
 * Define the ASN1 Type MAC_hs_AddReconfQueue from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MAC_hs_AddReconfQueue extends Sequence {
    
    /**
     * The default constructor.
     */
    public MAC_hs_AddReconfQueue()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MAC_hs_AddReconfQueue(INTEGER mac_hsQueueId, 
		    MAC_d_FlowIdentity mac_dFlowId, 
		    T1_ReleaseTimer reorderingReleaseTimer, 
		    MAC_hs_WindowSize mac_hsWindowSize, 
		    MAC_d_PDU_SizeInfo_List mac_d_PDU_SizeInfo_List)
    {
	setMac_hsQueueId(mac_hsQueueId);
	setMac_dFlowId(mac_dFlowId);
	setReorderingReleaseTimer(reorderingReleaseTimer);
	setMac_hsWindowSize(mac_hsWindowSize);
	setMac_d_PDU_SizeInfo_List(mac_d_PDU_SizeInfo_List);
    }
    
    /**
     * Construct with components.
     */
    public MAC_hs_AddReconfQueue(long mac_hsQueueId, 
		    MAC_d_FlowIdentity mac_dFlowId, 
		    T1_ReleaseTimer reorderingReleaseTimer, 
		    MAC_hs_WindowSize mac_hsWindowSize, 
		    MAC_d_PDU_SizeInfo_List mac_d_PDU_SizeInfo_List)
    {
	this(new INTEGER(mac_hsQueueId), mac_dFlowId, 
	     reorderingReleaseTimer, mac_hsWindowSize, 
	     mac_d_PDU_SizeInfo_List);
    }
    
    /**
     * Construct with required components.
     */
    public MAC_hs_AddReconfQueue(long mac_hsQueueId, 
		    MAC_d_FlowIdentity mac_dFlowId, 
		    T1_ReleaseTimer reorderingReleaseTimer, 
		    MAC_hs_WindowSize mac_hsWindowSize)
    {
	setMac_hsQueueId(mac_hsQueueId);
	setMac_dFlowId(mac_dFlowId);
	setReorderingReleaseTimer(reorderingReleaseTimer);
	setMac_hsWindowSize(mac_hsWindowSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new MAC_d_FlowIdentity();
	mComponents[2] = T1_ReleaseTimer.rt10;
	mComponents[3] = MAC_hs_WindowSize.mws4;
	mComponents[4] = new MAC_d_PDU_SizeInfo_List();
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
		return new INTEGER();
	    case 1:
		return new MAC_d_FlowIdentity();
	    case 2:
		return T1_ReleaseTimer.rt10;
	    case 3:
		return MAC_hs_WindowSize.mws4;
	    case 4:
		return new MAC_d_PDU_SizeInfo_List();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_hsQueueId"
    public long getMac_hsQueueId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setMac_hsQueueId(long mac_hsQueueId)
    {
	setMac_hsQueueId(new INTEGER(mac_hsQueueId));
    }
    
    public void setMac_hsQueueId(INTEGER mac_hsQueueId)
    {
	mComponents[0] = mac_hsQueueId;
    }
    
    
    // Methods for field "mac_dFlowId"
    public MAC_d_FlowIdentity getMac_dFlowId()
    {
	return (MAC_d_FlowIdentity)mComponents[1];
    }
    
    public void setMac_dFlowId(MAC_d_FlowIdentity mac_dFlowId)
    {
	mComponents[1] = mac_dFlowId;
    }
    
    
    // Methods for field "reorderingReleaseTimer"
    public T1_ReleaseTimer getReorderingReleaseTimer()
    {
	return (T1_ReleaseTimer)mComponents[2];
    }
    
    public void setReorderingReleaseTimer(T1_ReleaseTimer reorderingReleaseTimer)
    {
	mComponents[2] = reorderingReleaseTimer;
    }
    
    
    // Methods for field "mac_hsWindowSize"
    public MAC_hs_WindowSize getMac_hsWindowSize()
    {
	return (MAC_hs_WindowSize)mComponents[3];
    }
    
    public void setMac_hsWindowSize(MAC_hs_WindowSize mac_hsWindowSize)
    {
	mComponents[3] = mac_hsWindowSize;
    }
    
    
    // Methods for field "mac_d_PDU_SizeInfo_List"
    public MAC_d_PDU_SizeInfo_List getMac_d_PDU_SizeInfo_List()
    {
	return (MAC_d_PDU_SizeInfo_List)mComponents[4];
    }
    
    public void setMac_d_PDU_SizeInfo_List(MAC_d_PDU_SizeInfo_List mac_d_PDU_SizeInfo_List)
    {
	mComponents[4] = mac_d_PDU_SizeInfo_List;
    }
    
    public boolean hasMac_d_PDU_SizeInfo_List()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMac_d_PDU_SizeInfo_List()
    {
	setComponentAbsent(4);
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
	    "MAC_hs_AddReconfQueue"
	),
	new QName (
	    "InformationElements",
	    "MAC-hs-AddReconfQueue"
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
				    new com.oss.asn1.INTEGER(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "mac-hsQueueId",
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
				"MAC_d_FlowIdentity"
			    ),
			    new QName (
				"InformationElements",
				"MAC-d-FlowIdentity"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MAC_d_FlowIdentity(0), 
				    new MAC_d_FlowIdentity(7),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(7)
			    ),
			    null
			)
		    ),
		    "mac-dFlowId",
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
				"T1_ReleaseTimer"
			    ),
			    new QName (
				"InformationElements",
				"T1-ReleaseTimer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rt10",
					0
				    ),
				    new MemberListElement (
					"rt20",
					1
				    ),
				    new MemberListElement (
					"rt30",
					2
				    ),
				    new MemberListElement (
					"rt40",
					3
				    ),
				    new MemberListElement (
					"rt50",
					4
				    ),
				    new MemberListElement (
					"rt60",
					5
				    ),
				    new MemberListElement (
					"rt70",
					6
				    ),
				    new MemberListElement (
					"rt80",
					7
				    ),
				    new MemberListElement (
					"rt90",
					8
				    ),
				    new MemberListElement (
					"rt100",
					9
				    ),
				    new MemberListElement (
					"rt120",
					10
				    ),
				    new MemberListElement (
					"rt140",
					11
				    ),
				    new MemberListElement (
					"rt160",
					12
				    ),
				    new MemberListElement (
					"rt200",
					13
				    ),
				    new MemberListElement (
					"rt300",
					14
				    ),
				    new MemberListElement (
					"rt400",
					15
				    )
				}
			    ),
			    0,
			    T1_ReleaseTimer.rt10
			)
		    ),
		    "reorderingReleaseTimer",
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
				"MAC_hs_WindowSize"
			    ),
			    new QName (
				"InformationElements",
				"MAC-hs-WindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mws4",
					0
				    ),
				    new MemberListElement (
					"mws6",
					1
				    ),
				    new MemberListElement (
					"mws8",
					2
				    ),
				    new MemberListElement (
					"mws12",
					3
				    ),
				    new MemberListElement (
					"mws16",
					4
				    ),
				    new MemberListElement (
					"mws24",
					5
				    ),
				    new MemberListElement (
					"mws32",
					6
				    )
				}
			    ),
			    0,
			    MAC_hs_WindowSize.mws4
			)
		    ),
		    "mac-hsWindowSize",
		    3,
		    2,
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
				"MAC_d_PDU_SizeInfo_List"
			    ),
			    new QName (
				"InformationElements",
				"MAC-d-PDU-SizeInfo-List"
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
				    "MAC_d_PDUsizeInfo"
				)
			    )
			)
		    ),
		    "mac-d-PDU-SizeInfo-List",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' MAC_hs_AddReconfQueue object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_hs_AddReconfQueue object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_hs_AddReconfQueue
