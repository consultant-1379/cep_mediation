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
 * Define the ASN1 Type ExplicitDiscard from ASN1 Module InformationElements.
 * @see Sequence
 */

public class ExplicitDiscard extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExplicitDiscard()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExplicitDiscard(TimerMRW timerMRW, TimerDiscard timerDiscard, 
		    MaxMRW maxMRW)
    {
	setTimerMRW(timerMRW);
	setTimerDiscard(timerDiscard);
	setMaxMRW(maxMRW);
    }
    
    public void initComponents()
    {
	mComponents[0] = TimerMRW.te50;
	mComponents[1] = TimerDiscard.td0_1;
	mComponents[2] = MaxMRW.mm1;
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
		return TimerMRW.te50;
	    case 1:
		return TimerDiscard.td0_1;
	    case 2:
		return MaxMRW.mm1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timerMRW"
    public TimerMRW getTimerMRW()
    {
	return (TimerMRW)mComponents[0];
    }
    
    public void setTimerMRW(TimerMRW timerMRW)
    {
	mComponents[0] = timerMRW;
    }
    
    
    // Methods for field "timerDiscard"
    public TimerDiscard getTimerDiscard()
    {
	return (TimerDiscard)mComponents[1];
    }
    
    public void setTimerDiscard(TimerDiscard timerDiscard)
    {
	mComponents[1] = timerDiscard;
    }
    
    
    // Methods for field "maxMRW"
    public MaxMRW getMaxMRW()
    {
	return (MaxMRW)mComponents[2];
    }
    
    public void setMaxMRW(MaxMRW maxMRW)
    {
	mComponents[2] = maxMRW;
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
	    "ExplicitDiscard"
	),
	new QName (
	    "InformationElements",
	    "ExplicitDiscard"
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
				"TimerMRW"
			    ),
			    new QName (
				"InformationElements",
				"TimerMRW"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"te50",
					0
				    ),
				    new MemberListElement (
					"te60",
					1
				    ),
				    new MemberListElement (
					"te70",
					2
				    ),
				    new MemberListElement (
					"te80",
					3
				    ),
				    new MemberListElement (
					"te90",
					4
				    ),
				    new MemberListElement (
					"te100",
					5
				    ),
				    new MemberListElement (
					"te120",
					6
				    ),
				    new MemberListElement (
					"te140",
					7
				    ),
				    new MemberListElement (
					"te160",
					8
				    ),
				    new MemberListElement (
					"te180",
					9
				    ),
				    new MemberListElement (
					"te200",
					10
				    ),
				    new MemberListElement (
					"te300",
					11
				    ),
				    new MemberListElement (
					"te400",
					12
				    ),
				    new MemberListElement (
					"te500",
					13
				    ),
				    new MemberListElement (
					"te700",
					14
				    ),
				    new MemberListElement (
					"te900",
					15
				    )
				}
			    ),
			    0,
			    TimerMRW.te50
			)
		    ),
		    "timerMRW",
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
				"TimerDiscard"
			    ),
			    new QName (
				"InformationElements",
				"TimerDiscard"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"td0-1",
					0
				    ),
				    new MemberListElement (
					"td0-25",
					1
				    ),
				    new MemberListElement (
					"td0-5",
					2
				    ),
				    new MemberListElement (
					"td0-75",
					3
				    ),
				    new MemberListElement (
					"td1",
					4
				    ),
				    new MemberListElement (
					"td1-25",
					5
				    ),
				    new MemberListElement (
					"td1-5",
					6
				    ),
				    new MemberListElement (
					"td1-75",
					7
				    ),
				    new MemberListElement (
					"td2",
					8
				    ),
				    new MemberListElement (
					"td2-5",
					9
				    ),
				    new MemberListElement (
					"td3",
					10
				    ),
				    new MemberListElement (
					"td3-5",
					11
				    ),
				    new MemberListElement (
					"td4",
					12
				    ),
				    new MemberListElement (
					"td4-5",
					13
				    ),
				    new MemberListElement (
					"td5",
					14
				    ),
				    new MemberListElement (
					"td7-5",
					15
				    )
				}
			    ),
			    0,
			    TimerDiscard.td0_1
			)
		    ),
		    "timerDiscard",
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
				"MaxMRW"
			    ),
			    new QName (
				"InformationElements",
				"MaxMRW"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mm1",
					0
				    ),
				    new MemberListElement (
					"mm4",
					1
				    ),
				    new MemberListElement (
					"mm6",
					2
				    ),
				    new MemberListElement (
					"mm8",
					3
				    ),
				    new MemberListElement (
					"mm12",
					4
				    ),
				    new MemberListElement (
					"mm16",
					5
				    ),
				    new MemberListElement (
					"mm24",
					6
				    ),
				    new MemberListElement (
					"mm32",
					7
				    )
				}
			    ),
			    0,
			    MaxMRW.mm1
			)
		    ),
		    "maxMRW",
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
     * Get the type descriptor (TypeInfo) of 'this' ExplicitDiscard object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExplicitDiscard object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExplicitDiscard
