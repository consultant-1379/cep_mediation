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
 * Define the ASN1 Type UL_AM_RLC_Mode from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UL_AM_RLC_Mode extends Sequence {
    
    /**
     * The default constructor.
     */
    public UL_AM_RLC_Mode()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UL_AM_RLC_Mode(TransmissionRLC_Discard transmissionRLC_Discard, 
		    TransmissionWindowSize transmissionWindowSize, 
		    TimerRST timerRST, MaxRST max_RST, 
		    PollingInfo pollingInfo)
    {
	setTransmissionRLC_Discard(transmissionRLC_Discard);
	setTransmissionWindowSize(transmissionWindowSize);
	setTimerRST(timerRST);
	setMax_RST(max_RST);
	setPollingInfo(pollingInfo);
    }
    
    /**
     * Construct with required components.
     */
    public UL_AM_RLC_Mode(TransmissionRLC_Discard transmissionRLC_Discard, 
		    TransmissionWindowSize transmissionWindowSize, 
		    TimerRST timerRST, MaxRST max_RST)
    {
	setTransmissionRLC_Discard(transmissionRLC_Discard);
	setTransmissionWindowSize(transmissionWindowSize);
	setTimerRST(timerRST);
	setMax_RST(max_RST);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TransmissionRLC_Discard();
	mComponents[1] = TransmissionWindowSize.tw1;
	mComponents[2] = TimerRST.tr50;
	mComponents[3] = MaxRST.rst1;
	mComponents[4] = new PollingInfo();
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
		return new TransmissionRLC_Discard();
	    case 1:
		return TransmissionWindowSize.tw1;
	    case 2:
		return TimerRST.tr50;
	    case 3:
		return MaxRST.rst1;
	    case 4:
		return new PollingInfo();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "transmissionRLC_Discard"
    public TransmissionRLC_Discard getTransmissionRLC_Discard()
    {
	return (TransmissionRLC_Discard)mComponents[0];
    }
    
    public void setTransmissionRLC_Discard(TransmissionRLC_Discard transmissionRLC_Discard)
    {
	mComponents[0] = transmissionRLC_Discard;
    }
    
    
    // Methods for field "transmissionWindowSize"
    public TransmissionWindowSize getTransmissionWindowSize()
    {
	return (TransmissionWindowSize)mComponents[1];
    }
    
    public void setTransmissionWindowSize(TransmissionWindowSize transmissionWindowSize)
    {
	mComponents[1] = transmissionWindowSize;
    }
    
    
    // Methods for field "timerRST"
    public TimerRST getTimerRST()
    {
	return (TimerRST)mComponents[2];
    }
    
    public void setTimerRST(TimerRST timerRST)
    {
	mComponents[2] = timerRST;
    }
    
    
    // Methods for field "max_RST"
    public MaxRST getMax_RST()
    {
	return (MaxRST)mComponents[3];
    }
    
    public void setMax_RST(MaxRST max_RST)
    {
	mComponents[3] = max_RST;
    }
    
    
    // Methods for field "pollingInfo"
    public PollingInfo getPollingInfo()
    {
	return (PollingInfo)mComponents[4];
    }
    
    public void setPollingInfo(PollingInfo pollingInfo)
    {
	mComponents[4] = pollingInfo;
    }
    
    public boolean hasPollingInfo()
    {
	return componentIsPresent(4);
    }
    
    public void deletePollingInfo()
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
	    "UL_AM_RLC_Mode"
	),
	new QName (
	    "InformationElements",
	    "UL-AM-RLC-Mode"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"TransmissionRLC_Discard"
			    ),
			    new QName (
				"InformationElements",
				"TransmissionRLC-Discard"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "TransmissionRLC_Discard"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "transmissionRLC-Discard",
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
				"TransmissionWindowSize"
			    ),
			    new QName (
				"InformationElements",
				"TransmissionWindowSize"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tw1",
					0
				    ),
				    new MemberListElement (
					"tw8",
					1
				    ),
				    new MemberListElement (
					"tw16",
					2
				    ),
				    new MemberListElement (
					"tw32",
					3
				    ),
				    new MemberListElement (
					"tw64",
					4
				    ),
				    new MemberListElement (
					"tw128",
					5
				    ),
				    new MemberListElement (
					"tw256",
					6
				    ),
				    new MemberListElement (
					"tw512",
					7
				    ),
				    new MemberListElement (
					"tw768",
					8
				    ),
				    new MemberListElement (
					"tw1024",
					9
				    ),
				    new MemberListElement (
					"tw1536",
					10
				    ),
				    new MemberListElement (
					"tw2047",
					11
				    ),
				    new MemberListElement (
					"tw2560",
					12
				    ),
				    new MemberListElement (
					"tw3072",
					13
				    ),
				    new MemberListElement (
					"tw3584",
					14
				    ),
				    new MemberListElement (
					"tw4095",
					15
				    )
				}
			    ),
			    0,
			    TransmissionWindowSize.tw1
			)
		    ),
		    "transmissionWindowSize",
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
				"TimerRST"
			    ),
			    new QName (
				"InformationElements",
				"TimerRST"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tr50",
					0
				    ),
				    new MemberListElement (
					"tr100",
					1
				    ),
				    new MemberListElement (
					"tr150",
					2
				    ),
				    new MemberListElement (
					"tr200",
					3
				    ),
				    new MemberListElement (
					"tr250",
					4
				    ),
				    new MemberListElement (
					"tr300",
					5
				    ),
				    new MemberListElement (
					"tr350",
					6
				    ),
				    new MemberListElement (
					"tr400",
					7
				    ),
				    new MemberListElement (
					"tr450",
					8
				    ),
				    new MemberListElement (
					"tr500",
					9
				    ),
				    new MemberListElement (
					"tr550",
					10
				    ),
				    new MemberListElement (
					"tr600",
					11
				    ),
				    new MemberListElement (
					"tr700",
					12
				    ),
				    new MemberListElement (
					"tr800",
					13
				    ),
				    new MemberListElement (
					"tr900",
					14
				    ),
				    new MemberListElement (
					"tr1000",
					15
				    )
				}
			    ),
			    0,
			    TimerRST.tr50
			)
		    ),
		    "timerRST",
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
				"MaxRST"
			    ),
			    new QName (
				"InformationElements",
				"MaxRST"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rst1",
					0
				    ),
				    new MemberListElement (
					"rst4",
					1
				    ),
				    new MemberListElement (
					"rst6",
					2
				    ),
				    new MemberListElement (
					"rst8",
					3
				    ),
				    new MemberListElement (
					"rst12",
					4
				    ),
				    new MemberListElement (
					"rst16",
					5
				    ),
				    new MemberListElement (
					"rst24",
					6
				    ),
				    new MemberListElement (
					"rst32",
					7
				    )
				}
			    ),
			    0,
			    MaxRST.rst1
			)
		    ),
		    "max-RST",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "PollingInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "PollingInfo"
				)
			    ),
			    0
			)
		    ),
		    "pollingInfo",
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
     * Get the type descriptor (TypeInfo) of 'this' UL_AM_RLC_Mode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UL_AM_RLC_Mode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UL_AM_RLC_Mode
