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
 * Define the ASN1 Type PollingInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class PollingInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public PollingInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PollingInfo(TimerPollProhibit timerPollProhibit, 
		    TimerPoll timerPoll, Poll_PDU poll_PDU, Poll_SDU poll_SDU, 
		    BOOLEAN lastTransmissionPDU_Poll, 
		    BOOLEAN lastRetransmissionPDU_Poll, PollWindow pollWindow, 
		    TimerPollPeriodic timerPollPeriodic)
    {
	setTimerPollProhibit(timerPollProhibit);
	setTimerPoll(timerPoll);
	setPoll_PDU(poll_PDU);
	setPoll_SDU(poll_SDU);
	setLastTransmissionPDU_Poll(lastTransmissionPDU_Poll);
	setLastRetransmissionPDU_Poll(lastRetransmissionPDU_Poll);
	setPollWindow(pollWindow);
	setTimerPollPeriodic(timerPollPeriodic);
    }
    
    /**
     * Construct with components.
     */
    public PollingInfo(TimerPollProhibit timerPollProhibit, 
		    TimerPoll timerPoll, Poll_PDU poll_PDU, Poll_SDU poll_SDU, 
		    boolean lastTransmissionPDU_Poll, 
		    boolean lastRetransmissionPDU_Poll, PollWindow pollWindow, 
		    TimerPollPeriodic timerPollPeriodic)
    {
	this(timerPollProhibit, timerPoll, poll_PDU, poll_SDU, 
	     new BOOLEAN(lastTransmissionPDU_Poll), 
	     new BOOLEAN(lastRetransmissionPDU_Poll), pollWindow, 
	     timerPollPeriodic);
    }
    
    /**
     * Construct with required components.
     */
    public PollingInfo(boolean lastTransmissionPDU_Poll, 
		    boolean lastRetransmissionPDU_Poll)
    {
	setLastTransmissionPDU_Poll(lastTransmissionPDU_Poll);
	setLastRetransmissionPDU_Poll(lastRetransmissionPDU_Poll);
    }
    
    public void initComponents()
    {
	mComponents[0] = TimerPollProhibit.tpp10;
	mComponents[1] = TimerPoll.tp10;
	mComponents[2] = Poll_PDU.pdu1;
	mComponents[3] = Poll_SDU.sdu1;
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = PollWindow.pw50;
	mComponents[7] = TimerPollPeriodic.tper100;
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
		return TimerPollProhibit.tpp10;
	    case 1:
		return TimerPoll.tp10;
	    case 2:
		return Poll_PDU.pdu1;
	    case 3:
		return Poll_SDU.sdu1;
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return PollWindow.pw50;
	    case 7:
		return TimerPollPeriodic.tper100;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timerPollProhibit"
    public TimerPollProhibit getTimerPollProhibit()
    {
	return (TimerPollProhibit)mComponents[0];
    }
    
    public void setTimerPollProhibit(TimerPollProhibit timerPollProhibit)
    {
	mComponents[0] = timerPollProhibit;
    }
    
    public boolean hasTimerPollProhibit()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimerPollProhibit()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "timerPoll"
    public TimerPoll getTimerPoll()
    {
	return (TimerPoll)mComponents[1];
    }
    
    public void setTimerPoll(TimerPoll timerPoll)
    {
	mComponents[1] = timerPoll;
    }
    
    public boolean hasTimerPoll()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTimerPoll()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "poll_PDU"
    public Poll_PDU getPoll_PDU()
    {
	return (Poll_PDU)mComponents[2];
    }
    
    public void setPoll_PDU(Poll_PDU poll_PDU)
    {
	mComponents[2] = poll_PDU;
    }
    
    public boolean hasPoll_PDU()
    {
	return componentIsPresent(2);
    }
    
    public void deletePoll_PDU()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "poll_SDU"
    public Poll_SDU getPoll_SDU()
    {
	return (Poll_SDU)mComponents[3];
    }
    
    public void setPoll_SDU(Poll_SDU poll_SDU)
    {
	mComponents[3] = poll_SDU;
    }
    
    public boolean hasPoll_SDU()
    {
	return componentIsPresent(3);
    }
    
    public void deletePoll_SDU()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "lastTransmissionPDU_Poll"
    public boolean getLastTransmissionPDU_Poll()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setLastTransmissionPDU_Poll(boolean lastTransmissionPDU_Poll)
    {
	setLastTransmissionPDU_Poll(new BOOLEAN(lastTransmissionPDU_Poll));
    }
    
    public void setLastTransmissionPDU_Poll(BOOLEAN lastTransmissionPDU_Poll)
    {
	mComponents[4] = lastTransmissionPDU_Poll;
    }
    
    
    // Methods for field "lastRetransmissionPDU_Poll"
    public boolean getLastRetransmissionPDU_Poll()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setLastRetransmissionPDU_Poll(boolean lastRetransmissionPDU_Poll)
    {
	setLastRetransmissionPDU_Poll(new BOOLEAN(lastRetransmissionPDU_Poll));
    }
    
    public void setLastRetransmissionPDU_Poll(BOOLEAN lastRetransmissionPDU_Poll)
    {
	mComponents[5] = lastRetransmissionPDU_Poll;
    }
    
    
    // Methods for field "pollWindow"
    public PollWindow getPollWindow()
    {
	return (PollWindow)mComponents[6];
    }
    
    public void setPollWindow(PollWindow pollWindow)
    {
	mComponents[6] = pollWindow;
    }
    
    public boolean hasPollWindow()
    {
	return componentIsPresent(6);
    }
    
    public void deletePollWindow()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "timerPollPeriodic"
    public TimerPollPeriodic getTimerPollPeriodic()
    {
	return (TimerPollPeriodic)mComponents[7];
    }
    
    public void setTimerPollPeriodic(TimerPollPeriodic timerPollPeriodic)
    {
	mComponents[7] = timerPollPeriodic;
    }
    
    public boolean hasTimerPollPeriodic()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTimerPollPeriodic()
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
	    "PollingInfo"
	),
	new QName (
	    "InformationElements",
	    "PollingInfo"
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
				"TimerPollProhibit"
			    ),
			    new QName (
				"InformationElements",
				"TimerPollProhibit"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tpp10",
					0
				    ),
				    new MemberListElement (
					"tpp20",
					1
				    ),
				    new MemberListElement (
					"tpp30",
					2
				    ),
				    new MemberListElement (
					"tpp40",
					3
				    ),
				    new MemberListElement (
					"tpp50",
					4
				    ),
				    new MemberListElement (
					"tpp60",
					5
				    ),
				    new MemberListElement (
					"tpp70",
					6
				    ),
				    new MemberListElement (
					"tpp80",
					7
				    ),
				    new MemberListElement (
					"tpp90",
					8
				    ),
				    new MemberListElement (
					"tpp100",
					9
				    ),
				    new MemberListElement (
					"tpp110",
					10
				    ),
				    new MemberListElement (
					"tpp120",
					11
				    ),
				    new MemberListElement (
					"tpp130",
					12
				    ),
				    new MemberListElement (
					"tpp140",
					13
				    ),
				    new MemberListElement (
					"tpp150",
					14
				    ),
				    new MemberListElement (
					"tpp160",
					15
				    ),
				    new MemberListElement (
					"tpp170",
					16
				    ),
				    new MemberListElement (
					"tpp180",
					17
				    ),
				    new MemberListElement (
					"tpp190",
					18
				    ),
				    new MemberListElement (
					"tpp200",
					19
				    ),
				    new MemberListElement (
					"tpp210",
					20
				    ),
				    new MemberListElement (
					"tpp220",
					21
				    ),
				    new MemberListElement (
					"tpp230",
					22
				    ),
				    new MemberListElement (
					"tpp240",
					23
				    ),
				    new MemberListElement (
					"tpp250",
					24
				    ),
				    new MemberListElement (
					"tpp260",
					25
				    ),
				    new MemberListElement (
					"tpp270",
					26
				    ),
				    new MemberListElement (
					"tpp280",
					27
				    ),
				    new MemberListElement (
					"tpp290",
					28
				    ),
				    new MemberListElement (
					"tpp300",
					29
				    ),
				    new MemberListElement (
					"tpp310",
					30
				    ),
				    new MemberListElement (
					"tpp320",
					31
				    ),
				    new MemberListElement (
					"tpp330",
					32
				    ),
				    new MemberListElement (
					"tpp340",
					33
				    ),
				    new MemberListElement (
					"tpp350",
					34
				    ),
				    new MemberListElement (
					"tpp360",
					35
				    ),
				    new MemberListElement (
					"tpp370",
					36
				    ),
				    new MemberListElement (
					"tpp380",
					37
				    ),
				    new MemberListElement (
					"tpp390",
					38
				    ),
				    new MemberListElement (
					"tpp400",
					39
				    ),
				    new MemberListElement (
					"tpp410",
					40
				    ),
				    new MemberListElement (
					"tpp420",
					41
				    ),
				    new MemberListElement (
					"tpp430",
					42
				    ),
				    new MemberListElement (
					"tpp440",
					43
				    ),
				    new MemberListElement (
					"tpp450",
					44
				    ),
				    new MemberListElement (
					"tpp460",
					45
				    ),
				    new MemberListElement (
					"tpp470",
					46
				    ),
				    new MemberListElement (
					"tpp480",
					47
				    ),
				    new MemberListElement (
					"tpp490",
					48
				    ),
				    new MemberListElement (
					"tpp500",
					49
				    ),
				    new MemberListElement (
					"tpp510",
					50
				    ),
				    new MemberListElement (
					"tpp520",
					51
				    ),
				    new MemberListElement (
					"tpp530",
					52
				    ),
				    new MemberListElement (
					"tpp540",
					53
				    ),
				    new MemberListElement (
					"tpp550",
					54
				    ),
				    new MemberListElement (
					"tpp600",
					55
				    ),
				    new MemberListElement (
					"tpp650",
					56
				    ),
				    new MemberListElement (
					"tpp700",
					57
				    ),
				    new MemberListElement (
					"tpp750",
					58
				    ),
				    new MemberListElement (
					"tpp800",
					59
				    ),
				    new MemberListElement (
					"tpp850",
					60
				    ),
				    new MemberListElement (
					"tpp900",
					61
				    ),
				    new MemberListElement (
					"tpp950",
					62
				    ),
				    new MemberListElement (
					"tpp1000",
					63
				    )
				}
			    ),
			    0,
			    TimerPollProhibit.tpp10
			)
		    ),
		    "timerPollProhibit",
		    0,
		    3,
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
				"TimerPoll"
			    ),
			    new QName (
				"InformationElements",
				"TimerPoll"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tp10",
					0
				    ),
				    new MemberListElement (
					"tp20",
					1
				    ),
				    new MemberListElement (
					"tp30",
					2
				    ),
				    new MemberListElement (
					"tp40",
					3
				    ),
				    new MemberListElement (
					"tp50",
					4
				    ),
				    new MemberListElement (
					"tp60",
					5
				    ),
				    new MemberListElement (
					"tp70",
					6
				    ),
				    new MemberListElement (
					"tp80",
					7
				    ),
				    new MemberListElement (
					"tp90",
					8
				    ),
				    new MemberListElement (
					"tp100",
					9
				    ),
				    new MemberListElement (
					"tp110",
					10
				    ),
				    new MemberListElement (
					"tp120",
					11
				    ),
				    new MemberListElement (
					"tp130",
					12
				    ),
				    new MemberListElement (
					"tp140",
					13
				    ),
				    new MemberListElement (
					"tp150",
					14
				    ),
				    new MemberListElement (
					"tp160",
					15
				    ),
				    new MemberListElement (
					"tp170",
					16
				    ),
				    new MemberListElement (
					"tp180",
					17
				    ),
				    new MemberListElement (
					"tp190",
					18
				    ),
				    new MemberListElement (
					"tp200",
					19
				    ),
				    new MemberListElement (
					"tp210",
					20
				    ),
				    new MemberListElement (
					"tp220",
					21
				    ),
				    new MemberListElement (
					"tp230",
					22
				    ),
				    new MemberListElement (
					"tp240",
					23
				    ),
				    new MemberListElement (
					"tp250",
					24
				    ),
				    new MemberListElement (
					"tp260",
					25
				    ),
				    new MemberListElement (
					"tp270",
					26
				    ),
				    new MemberListElement (
					"tp280",
					27
				    ),
				    new MemberListElement (
					"tp290",
					28
				    ),
				    new MemberListElement (
					"tp300",
					29
				    ),
				    new MemberListElement (
					"tp310",
					30
				    ),
				    new MemberListElement (
					"tp320",
					31
				    ),
				    new MemberListElement (
					"tp330",
					32
				    ),
				    new MemberListElement (
					"tp340",
					33
				    ),
				    new MemberListElement (
					"tp350",
					34
				    ),
				    new MemberListElement (
					"tp360",
					35
				    ),
				    new MemberListElement (
					"tp370",
					36
				    ),
				    new MemberListElement (
					"tp380",
					37
				    ),
				    new MemberListElement (
					"tp390",
					38
				    ),
				    new MemberListElement (
					"tp400",
					39
				    ),
				    new MemberListElement (
					"tp410",
					40
				    ),
				    new MemberListElement (
					"tp420",
					41
				    ),
				    new MemberListElement (
					"tp430",
					42
				    ),
				    new MemberListElement (
					"tp440",
					43
				    ),
				    new MemberListElement (
					"tp450",
					44
				    ),
				    new MemberListElement (
					"tp460",
					45
				    ),
				    new MemberListElement (
					"tp470",
					46
				    ),
				    new MemberListElement (
					"tp480",
					47
				    ),
				    new MemberListElement (
					"tp490",
					48
				    ),
				    new MemberListElement (
					"tp500",
					49
				    ),
				    new MemberListElement (
					"tp510",
					50
				    ),
				    new MemberListElement (
					"tp520",
					51
				    ),
				    new MemberListElement (
					"tp530",
					52
				    ),
				    new MemberListElement (
					"tp540",
					53
				    ),
				    new MemberListElement (
					"tp550",
					54
				    ),
				    new MemberListElement (
					"tp600",
					55
				    ),
				    new MemberListElement (
					"tp650",
					56
				    ),
				    new MemberListElement (
					"tp700",
					57
				    ),
				    new MemberListElement (
					"tp750",
					58
				    ),
				    new MemberListElement (
					"tp800",
					59
				    ),
				    new MemberListElement (
					"tp850",
					60
				    ),
				    new MemberListElement (
					"tp900",
					61
				    ),
				    new MemberListElement (
					"tp950",
					62
				    ),
				    new MemberListElement (
					"tp1000",
					63
				    )
				}
			    ),
			    0,
			    TimerPoll.tp10
			)
		    ),
		    "timerPoll",
		    1,
		    3,
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
				"Poll_PDU"
			    ),
			    new QName (
				"InformationElements",
				"Poll-PDU"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pdu1",
					0
				    ),
				    new MemberListElement (
					"pdu2",
					1
				    ),
				    new MemberListElement (
					"pdu4",
					2
				    ),
				    new MemberListElement (
					"pdu8",
					3
				    ),
				    new MemberListElement (
					"pdu16",
					4
				    ),
				    new MemberListElement (
					"pdu32",
					5
				    ),
				    new MemberListElement (
					"pdu64",
					6
				    ),
				    new MemberListElement (
					"pdu128",
					7
				    )
				}
			    ),
			    0,
			    Poll_PDU.pdu1
			)
		    ),
		    "poll-PDU",
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
				"Poll_SDU"
			    ),
			    new QName (
				"InformationElements",
				"Poll-SDU"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sdu1",
					0
				    ),
				    new MemberListElement (
					"sdu4",
					1
				    ),
				    new MemberListElement (
					"sdu16",
					2
				    ),
				    new MemberListElement (
					"sdu64",
					3
				    )
				}
			    ),
			    0,
			    Poll_SDU.sdu1
			)
		    ),
		    "poll-SDU",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "lastTransmissionPDU-Poll",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "lastRetransmissionPDU-Poll",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"PollWindow"
			    ),
			    new QName (
				"InformationElements",
				"PollWindow"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"pw50",
					0
				    ),
				    new MemberListElement (
					"pw60",
					1
				    ),
				    new MemberListElement (
					"pw70",
					2
				    ),
				    new MemberListElement (
					"pw80",
					3
				    ),
				    new MemberListElement (
					"pw85",
					4
				    ),
				    new MemberListElement (
					"pw90",
					5
				    ),
				    new MemberListElement (
					"pw95",
					6
				    ),
				    new MemberListElement (
					"pw99",
					7
				    )
				}
			    ),
			    0,
			    PollWindow.pw50
			)
		    ),
		    "pollWindow",
		    6,
		    3,
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
				"TimerPollPeriodic"
			    ),
			    new QName (
				"InformationElements",
				"TimerPollPeriodic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tper100",
					0
				    ),
				    new MemberListElement (
					"tper200",
					1
				    ),
				    new MemberListElement (
					"tper300",
					2
				    ),
				    new MemberListElement (
					"tper400",
					3
				    ),
				    new MemberListElement (
					"tper500",
					4
				    ),
				    new MemberListElement (
					"tper750",
					5
				    ),
				    new MemberListElement (
					"tper1000",
					6
				    ),
				    new MemberListElement (
					"tper2000",
					7
				    )
				}
			    ),
			    0,
			    TimerPollPeriodic.tper100
			)
		    ),
		    "timerPollPeriodic",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
     * Get the type descriptor (TypeInfo) of 'this' PollingInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PollingInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PollingInfo
