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
 * Define the ASN1 Type TransmissionRLC_Discard from ASN1 Module InformationElements.
 * @see Choice
 */

public class TransmissionRLC_Discard extends Choice {
    
    /**
     * The default constructor.
     */
    public TransmissionRLC_Discard()
    {
    }
    
    public static final  int  timerBasedExplicit_chosen = 1;
    public static final  int  timerBasedNoExplicit_chosen = 2;
    public static final  int  maxDAT_Retransmissions_chosen = 3;
    public static final  int  noDiscard_chosen = 4;
    
    // Methods for field "timerBasedExplicit"
    public static TransmissionRLC_Discard createTransmissionRLC_DiscardWithTimerBasedExplicit(ExplicitDiscard timerBasedExplicit)
    {
	TransmissionRLC_Discard __object = new TransmissionRLC_Discard();

	__object.setTimerBasedExplicit(timerBasedExplicit);
	return __object;
    }
    
    public boolean hasTimerBasedExplicit()
    {
	return getChosenFlag() == timerBasedExplicit_chosen;
    }
    
    public void setTimerBasedExplicit(ExplicitDiscard timerBasedExplicit)
    {
	setChosenValue(timerBasedExplicit);
	setChosenFlag(timerBasedExplicit_chosen);
    }
    
    
    // Methods for field "timerBasedNoExplicit"
    public static TransmissionRLC_Discard createTransmissionRLC_DiscardWithTimerBasedNoExplicit(NoExplicitDiscard timerBasedNoExplicit)
    {
	TransmissionRLC_Discard __object = new TransmissionRLC_Discard();

	__object.setTimerBasedNoExplicit(timerBasedNoExplicit);
	return __object;
    }
    
    public boolean hasTimerBasedNoExplicit()
    {
	return getChosenFlag() == timerBasedNoExplicit_chosen;
    }
    
    public void setTimerBasedNoExplicit(NoExplicitDiscard timerBasedNoExplicit)
    {
	setChosenValue(timerBasedNoExplicit);
	setChosenFlag(timerBasedNoExplicit_chosen);
    }
    
    
    // Methods for field "maxDAT_Retransmissions"
    public static TransmissionRLC_Discard createTransmissionRLC_DiscardWithMaxDAT_Retransmissions(MaxDAT_Retransmissions maxDAT_Retransmissions)
    {
	TransmissionRLC_Discard __object = new TransmissionRLC_Discard();

	__object.setMaxDAT_Retransmissions(maxDAT_Retransmissions);
	return __object;
    }
    
    public boolean hasMaxDAT_Retransmissions()
    {
	return getChosenFlag() == maxDAT_Retransmissions_chosen;
    }
    
    public void setMaxDAT_Retransmissions(MaxDAT_Retransmissions maxDAT_Retransmissions)
    {
	setChosenValue(maxDAT_Retransmissions);
	setChosenFlag(maxDAT_Retransmissions_chosen);
    }
    
    
    // Methods for field "noDiscard"
    public static TransmissionRLC_Discard createTransmissionRLC_DiscardWithNoDiscard(MaxDAT noDiscard)
    {
	TransmissionRLC_Discard __object = new TransmissionRLC_Discard();

	__object.setNoDiscard(noDiscard);
	return __object;
    }
    
    public boolean hasNoDiscard()
    {
	return getChosenFlag() == noDiscard_chosen;
    }
    
    public void setNoDiscard(MaxDAT noDiscard)
    {
	setChosenValue(noDiscard);
	setChosenFlag(noDiscard_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case timerBasedExplicit_chosen:
		return new ExplicitDiscard();
	    case timerBasedNoExplicit_chosen:
		return NoExplicitDiscard.dt10;
	    case maxDAT_Retransmissions_chosen:
		return new MaxDAT_Retransmissions();
	    case noDiscard_chosen:
		return MaxDAT.dat1;
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
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
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"ExplicitDiscard"
			    ),
			    new QName (
				"InformationElements",
				"ExplicitDiscard"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "ExplicitDiscard"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "ExplicitDiscard"
				)
			    ),
			    0
			)
		    ),
		    "timerBasedExplicit",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"NoExplicitDiscard"
			    ),
			    new QName (
				"InformationElements",
				"NoExplicitDiscard"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dt10",
					0
				    ),
				    new MemberListElement (
					"dt20",
					1
				    ),
				    new MemberListElement (
					"dt30",
					2
				    ),
				    new MemberListElement (
					"dt40",
					3
				    ),
				    new MemberListElement (
					"dt50",
					4
				    ),
				    new MemberListElement (
					"dt60",
					5
				    ),
				    new MemberListElement (
					"dt70",
					6
				    ),
				    new MemberListElement (
					"dt80",
					7
				    ),
				    new MemberListElement (
					"dt90",
					8
				    ),
				    new MemberListElement (
					"dt100",
					9
				    )
				}
			    ),
			    0,
			    NoExplicitDiscard.dt10
			)
		    ),
		    "timerBasedNoExplicit",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxDAT_Retransmissions"
			    ),
			    new QName (
				"InformationElements",
				"MaxDAT-Retransmissions"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "rrc.informationelements",
				    "MaxDAT_Retransmissions"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "rrc.informationelements",
				    "MaxDAT_Retransmissions"
				)
			    ),
			    0
			)
		    ),
		    "maxDAT-Retransmissions",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"rrc.informationelements",
				"MaxDAT"
			    ),
			    new QName (
				"InformationElements",
				"MaxDAT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dat1",
					0
				    ),
				    new MemberListElement (
					"dat2",
					1
				    ),
				    new MemberListElement (
					"dat3",
					2
				    ),
				    new MemberListElement (
					"dat4",
					3
				    ),
				    new MemberListElement (
					"dat5",
					4
				    ),
				    new MemberListElement (
					"dat6",
					5
				    ),
				    new MemberListElement (
					"dat7",
					6
				    ),
				    new MemberListElement (
					"dat8",
					7
				    ),
				    new MemberListElement (
					"dat9",
					8
				    ),
				    new MemberListElement (
					"dat10",
					9
				    ),
				    new MemberListElement (
					"dat15",
					10
				    ),
				    new MemberListElement (
					"dat20",
					11
				    ),
				    new MemberListElement (
					"dat25",
					12
				    ),
				    new MemberListElement (
					"dat30",
					13
				    ),
				    new MemberListElement (
					"dat35",
					14
				    ),
				    new MemberListElement (
					"dat40",
					15
				    )
				}
			    ),
			    0,
			    MaxDAT.dat1
			)
		    ),
		    "noDiscard",
		    3,
		    2
		)
	    }
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
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TransmissionRLC_Discard object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransmissionRLC_Discard object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransmissionRLC_Discard
