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
 * Define the ASN1 Type MAC_ehs_AddReconfReordQ from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MAC_ehs_AddReconfReordQ extends Sequence {
    
    /**
     * The default constructor.
     */
    public MAC_ehs_AddReconfReordQ()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MAC_ehs_AddReconfReordQ(MAC_ehs_QueueId mac_ehs_QueueId, 
		    T1_ReleaseTimer reorderingReleaseTimer, 
		    Treset_ResetTimer reorderingResetTimer, 
		    MAC_hs_WindowSize mac_ehsWindowSize)
    {
	setMac_ehs_QueueId(mac_ehs_QueueId);
	setReorderingReleaseTimer(reorderingReleaseTimer);
	setReorderingResetTimer(reorderingResetTimer);
	setMac_ehsWindowSize(mac_ehsWindowSize);
    }
    
    /**
     * Construct with required components.
     */
    public MAC_ehs_AddReconfReordQ(MAC_ehs_QueueId mac_ehs_QueueId, 
		    T1_ReleaseTimer reorderingReleaseTimer, 
		    MAC_hs_WindowSize mac_ehsWindowSize)
    {
	setMac_ehs_QueueId(mac_ehs_QueueId);
	setReorderingReleaseTimer(reorderingReleaseTimer);
	setMac_ehsWindowSize(mac_ehsWindowSize);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MAC_ehs_QueueId();
	mComponents[1] = T1_ReleaseTimer.rt10;
	mComponents[2] = Treset_ResetTimer.rt1;
	mComponents[3] = MAC_hs_WindowSize.mws4;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MAC_ehs_QueueId();
	    case 1:
		return T1_ReleaseTimer.rt10;
	    case 2:
		return Treset_ResetTimer.rt1;
	    case 3:
		return MAC_hs_WindowSize.mws4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "mac_ehs_QueueId"
    public MAC_ehs_QueueId getMac_ehs_QueueId()
    {
	return (MAC_ehs_QueueId)mComponents[0];
    }
    
    public void setMac_ehs_QueueId(MAC_ehs_QueueId mac_ehs_QueueId)
    {
	mComponents[0] = mac_ehs_QueueId;
    }
    
    
    // Methods for field "reorderingReleaseTimer"
    public T1_ReleaseTimer getReorderingReleaseTimer()
    {
	return (T1_ReleaseTimer)mComponents[1];
    }
    
    public void setReorderingReleaseTimer(T1_ReleaseTimer reorderingReleaseTimer)
    {
	mComponents[1] = reorderingReleaseTimer;
    }
    
    
    // Methods for field "reorderingResetTimer"
    public Treset_ResetTimer getReorderingResetTimer()
    {
	return (Treset_ResetTimer)mComponents[2];
    }
    
    public void setReorderingResetTimer(Treset_ResetTimer reorderingResetTimer)
    {
	mComponents[2] = reorderingResetTimer;
    }
    
    public boolean hasReorderingResetTimer()
    {
	return componentIsPresent(2);
    }
    
    public void deleteReorderingResetTimer()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mac_ehsWindowSize"
    public MAC_hs_WindowSize getMac_ehsWindowSize()
    {
	return (MAC_hs_WindowSize)mComponents[3];
    }
    
    public void setMac_ehsWindowSize(MAC_hs_WindowSize mac_ehsWindowSize)
    {
	mComponents[3] = mac_ehsWindowSize;
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
	    "MAC_ehs_AddReconfReordQ"
	),
	new QName (
	    "InformationElements",
	    "MAC-ehs-AddReconfReordQ"
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
				"MAC_ehs_QueueId"
			    ),
			    new QName (
				"InformationElements",
				"MAC-ehs-QueueId"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MAC_ehs_QueueId(0), 
				    new MAC_ehs_QueueId(7),
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
		    "mac-ehs-QueueId",
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
				"Treset_ResetTimer"
			    ),
			    new QName (
				"InformationElements",
				"Treset-ResetTimer"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rt1",
					0
				    ),
				    new MemberListElement (
					"rt2",
					1
				    ),
				    new MemberListElement (
					"rt3",
					2
				    ),
				    new MemberListElement (
					"rt4",
					3
				    )
				}
			    ),
			    0,
			    Treset_ResetTimer.rt1
			)
		    ),
		    "reorderingResetTimer",
		    2,
		    3,
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
		    "mac-ehsWindowSize",
		    3,
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
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MAC_ehs_AddReconfReordQ object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MAC_ehs_AddReconfReordQ object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MAC_ehs_AddReconfReordQ
