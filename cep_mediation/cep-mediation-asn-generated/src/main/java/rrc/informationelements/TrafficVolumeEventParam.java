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
 * Define the ASN1 Type TrafficVolumeEventParam from ASN1 Module InformationElements.
 * @see Sequence
 */

public class TrafficVolumeEventParam extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrafficVolumeEventParam()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrafficVolumeEventParam(TrafficVolumeEventType eventID, 
		    TrafficVolumeThreshold reportingThreshold, 
		    TimeToTrigger timeToTrigger, 
		    PendingTimeAfterTrigger pendingTimeAfterTrigger, 
		    TX_InterruptionAfterTrigger tx_InterruptionAfterTrigger)
    {
	setEventID(eventID);
	setReportingThreshold(reportingThreshold);
	setTimeToTrigger(timeToTrigger);
	setPendingTimeAfterTrigger(pendingTimeAfterTrigger);
	setTx_InterruptionAfterTrigger(tx_InterruptionAfterTrigger);
    }
    
    /**
     * Construct with required components.
     */
    public TrafficVolumeEventParam(TrafficVolumeEventType eventID, 
		    TrafficVolumeThreshold reportingThreshold)
    {
	setEventID(eventID);
	setReportingThreshold(reportingThreshold);
    }
    
    public void initComponents()
    {
	mComponents[0] = TrafficVolumeEventType.e4a;
	mComponents[1] = TrafficVolumeThreshold.th8;
	mComponents[2] = TimeToTrigger.ttt0;
	mComponents[3] = PendingTimeAfterTrigger.ptat0_25;
	mComponents[4] = TX_InterruptionAfterTrigger.txiat0_25;
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
		return TrafficVolumeEventType.e4a;
	    case 1:
		return TrafficVolumeThreshold.th8;
	    case 2:
		return TimeToTrigger.ttt0;
	    case 3:
		return PendingTimeAfterTrigger.ptat0_25;
	    case 4:
		return TX_InterruptionAfterTrigger.txiat0_25;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eventID"
    public TrafficVolumeEventType getEventID()
    {
	return (TrafficVolumeEventType)mComponents[0];
    }
    
    public void setEventID(TrafficVolumeEventType eventID)
    {
	mComponents[0] = eventID;
    }
    
    
    // Methods for field "reportingThreshold"
    public TrafficVolumeThreshold getReportingThreshold()
    {
	return (TrafficVolumeThreshold)mComponents[1];
    }
    
    public void setReportingThreshold(TrafficVolumeThreshold reportingThreshold)
    {
	mComponents[1] = reportingThreshold;
    }
    
    
    // Methods for field "timeToTrigger"
    public TimeToTrigger getTimeToTrigger()
    {
	return (TimeToTrigger)mComponents[2];
    }
    
    public void setTimeToTrigger(TimeToTrigger timeToTrigger)
    {
	mComponents[2] = timeToTrigger;
    }
    
    public boolean hasTimeToTrigger()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimeToTrigger()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "pendingTimeAfterTrigger"
    public PendingTimeAfterTrigger getPendingTimeAfterTrigger()
    {
	return (PendingTimeAfterTrigger)mComponents[3];
    }
    
    public void setPendingTimeAfterTrigger(PendingTimeAfterTrigger pendingTimeAfterTrigger)
    {
	mComponents[3] = pendingTimeAfterTrigger;
    }
    
    public boolean hasPendingTimeAfterTrigger()
    {
	return componentIsPresent(3);
    }
    
    public void deletePendingTimeAfterTrigger()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "tx_InterruptionAfterTrigger"
    public TX_InterruptionAfterTrigger getTx_InterruptionAfterTrigger()
    {
	return (TX_InterruptionAfterTrigger)mComponents[4];
    }
    
    public void setTx_InterruptionAfterTrigger(TX_InterruptionAfterTrigger tx_InterruptionAfterTrigger)
    {
	mComponents[4] = tx_InterruptionAfterTrigger;
    }
    
    public boolean hasTx_InterruptionAfterTrigger()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTx_InterruptionAfterTrigger()
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
	    "TrafficVolumeEventParam"
	),
	new QName (
	    "InformationElements",
	    "TrafficVolumeEventParam"
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
				"TrafficVolumeEventType"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeEventType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e4a",
					0
				    ),
				    new MemberListElement (
					"e4b",
					1
				    )
				}
			    ),
			    0,
			    TrafficVolumeEventType.e4a
			)
		    ),
		    "eventID",
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
				"TrafficVolumeThreshold"
			    ),
			    new QName (
				"InformationElements",
				"TrafficVolumeThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"th8",
					0
				    ),
				    new MemberListElement (
					"th16",
					1
				    ),
				    new MemberListElement (
					"th32",
					2
				    ),
				    new MemberListElement (
					"th64",
					3
				    ),
				    new MemberListElement (
					"th128",
					4
				    ),
				    new MemberListElement (
					"th256",
					5
				    ),
				    new MemberListElement (
					"th512",
					6
				    ),
				    new MemberListElement (
					"th1024",
					7
				    ),
				    new MemberListElement (
					"th2k",
					8
				    ),
				    new MemberListElement (
					"th3k",
					9
				    ),
				    new MemberListElement (
					"th4k",
					10
				    ),
				    new MemberListElement (
					"th6k",
					11
				    ),
				    new MemberListElement (
					"th8k",
					12
				    ),
				    new MemberListElement (
					"th12k",
					13
				    ),
				    new MemberListElement (
					"th16k",
					14
				    ),
				    new MemberListElement (
					"th24k",
					15
				    ),
				    new MemberListElement (
					"th32k",
					16
				    ),
				    new MemberListElement (
					"th48k",
					17
				    ),
				    new MemberListElement (
					"th64k",
					18
				    ),
				    new MemberListElement (
					"th96k",
					19
				    ),
				    new MemberListElement (
					"th128k",
					20
				    ),
				    new MemberListElement (
					"th192k",
					21
				    ),
				    new MemberListElement (
					"th256k",
					22
				    ),
				    new MemberListElement (
					"th384k",
					23
				    ),
				    new MemberListElement (
					"th512k",
					24
				    ),
				    new MemberListElement (
					"th768k",
					25
				    )
				}
			    ),
			    0,
			    TrafficVolumeThreshold.th8
			)
		    ),
		    "reportingThreshold",
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
				"TimeToTrigger"
			    ),
			    new QName (
				"InformationElements",
				"TimeToTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ttt0",
					0
				    ),
				    new MemberListElement (
					"ttt10",
					1
				    ),
				    new MemberListElement (
					"ttt20",
					2
				    ),
				    new MemberListElement (
					"ttt40",
					3
				    ),
				    new MemberListElement (
					"ttt60",
					4
				    ),
				    new MemberListElement (
					"ttt80",
					5
				    ),
				    new MemberListElement (
					"ttt100",
					6
				    ),
				    new MemberListElement (
					"ttt120",
					7
				    ),
				    new MemberListElement (
					"ttt160",
					8
				    ),
				    new MemberListElement (
					"ttt200",
					9
				    ),
				    new MemberListElement (
					"ttt240",
					10
				    ),
				    new MemberListElement (
					"tt320",
					11
				    ),
				    new MemberListElement (
					"ttt640",
					12
				    ),
				    new MemberListElement (
					"ttt1280",
					13
				    ),
				    new MemberListElement (
					"ttt2560",
					14
				    ),
				    new MemberListElement (
					"ttt5000",
					15
				    )
				}
			    ),
			    0,
			    TimeToTrigger.ttt0
			)
		    ),
		    "timeToTrigger",
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
				"PendingTimeAfterTrigger"
			    ),
			    new QName (
				"InformationElements",
				"PendingTimeAfterTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ptat0-25",
					0
				    ),
				    new MemberListElement (
					"ptat0-5",
					1
				    ),
				    new MemberListElement (
					"ptat1",
					2
				    ),
				    new MemberListElement (
					"ptat2",
					3
				    ),
				    new MemberListElement (
					"ptat4",
					4
				    ),
				    new MemberListElement (
					"ptat8",
					5
				    ),
				    new MemberListElement (
					"ptat16",
					6
				    )
				}
			    ),
			    0,
			    PendingTimeAfterTrigger.ptat0_25
			)
		    ),
		    "pendingTimeAfterTrigger",
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
				"TX_InterruptionAfterTrigger"
			    ),
			    new QName (
				"InformationElements",
				"TX-InterruptionAfterTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"txiat0-25",
					0
				    ),
				    new MemberListElement (
					"txiat0-5",
					1
				    ),
				    new MemberListElement (
					"txiat1",
					2
				    ),
				    new MemberListElement (
					"txiat2",
					3
				    ),
				    new MemberListElement (
					"txiat4",
					4
				    ),
				    new MemberListElement (
					"txiat8",
					5
				    ),
				    new MemberListElement (
					"txiat16",
					6
				    )
				}
			    ),
			    0,
			    TX_InterruptionAfterTrigger.txiat0_25
			)
		    ),
		    "tx-InterruptionAfterTrigger",
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
     * Get the type descriptor (TypeInfo) of 'this' TrafficVolumeEventParam object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrafficVolumeEventParam object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrafficVolumeEventParam
