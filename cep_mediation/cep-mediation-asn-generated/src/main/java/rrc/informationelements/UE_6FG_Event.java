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
 * Define the ASN1 Type UE_6FG_Event from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UE_6FG_Event extends Sequence {
    
    /**
     * The default constructor.
     */
    public UE_6FG_Event()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UE_6FG_Event(TimeToTrigger timeToTrigger, 
		    UE_RX_TX_TimeDifferenceThreshold ue_RX_TX_TimeDifferenceThreshold)
    {
	setTimeToTrigger(timeToTrigger);
	setUe_RX_TX_TimeDifferenceThreshold(ue_RX_TX_TimeDifferenceThreshold);
    }
    
    public void initComponents()
    {
	mComponents[0] = TimeToTrigger.ttt0;
	mComponents[1] = new UE_RX_TX_TimeDifferenceThreshold();
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
		return TimeToTrigger.ttt0;
	    case 1:
		return new UE_RX_TX_TimeDifferenceThreshold();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeToTrigger"
    public TimeToTrigger getTimeToTrigger()
    {
	return (TimeToTrigger)mComponents[0];
    }
    
    public void setTimeToTrigger(TimeToTrigger timeToTrigger)
    {
	mComponents[0] = timeToTrigger;
    }
    
    
    // Methods for field "ue_RX_TX_TimeDifferenceThreshold"
    public UE_RX_TX_TimeDifferenceThreshold getUe_RX_TX_TimeDifferenceThreshold()
    {
	return (UE_RX_TX_TimeDifferenceThreshold)mComponents[1];
    }
    
    public void setUe_RX_TX_TimeDifferenceThreshold(UE_RX_TX_TimeDifferenceThreshold ue_RX_TX_TimeDifferenceThreshold)
    {
	mComponents[1] = ue_RX_TX_TimeDifferenceThreshold;
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
	    "UE_6FG_Event"
	),
	new QName (
	    "InformationElements",
	    "UE-6FG-Event"
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
				"UE_RX_TX_TimeDifferenceThreshold"
			    ),
			    new QName (
				"InformationElements",
				"UE-RX-TX-TimeDifferenceThreshold"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new UE_RX_TX_TimeDifferenceThreshold(768), 
				    new UE_RX_TX_TimeDifferenceThreshold(1280),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(768),
				new java.lang.Long(1280)
			    ),
			    null
			)
		    ),
		    "ue-RX-TX-TimeDifferenceThreshold",
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
			new TagDecoderElement((short)0x8000, 0)
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
     * Get the type descriptor (TypeInfo) of 'this' UE_6FG_Event object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UE_6FG_Event object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UE_6FG_Event
