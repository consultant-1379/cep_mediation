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
 * Define the ASN1 Type MaxDAT_Retransmissions from ASN1 Module InformationElements.
 * @see Sequence
 */

public class MaxDAT_Retransmissions extends Sequence {
    
    /**
     * The default constructor.
     */
    public MaxDAT_Retransmissions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MaxDAT_Retransmissions(MaxDAT maxDAT, TimerMRW timerMRW, 
		    MaxMRW maxMRW)
    {
	setMaxDAT(maxDAT);
	setTimerMRW(timerMRW);
	setMaxMRW(maxMRW);
    }
    
    public void initComponents()
    {
	mComponents[0] = MaxDAT.dat1;
	mComponents[1] = TimerMRW.te50;
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
		return MaxDAT.dat1;
	    case 1:
		return TimerMRW.te50;
	    case 2:
		return MaxMRW.mm1;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "maxDAT"
    public MaxDAT getMaxDAT()
    {
	return (MaxDAT)mComponents[0];
    }
    
    public void setMaxDAT(MaxDAT maxDAT)
    {
	mComponents[0] = maxDAT;
    }
    
    
    // Methods for field "timerMRW"
    public TimerMRW getTimerMRW()
    {
	return (TimerMRW)mComponents[1];
    }
    
    public void setTimerMRW(TimerMRW timerMRW)
    {
	mComponents[1] = timerMRW;
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
	    "MaxDAT_Retransmissions"
	),
	new QName (
	    "InformationElements",
	    "MaxDAT-Retransmissions"
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
		    "maxDAT",
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
     * Get the type descriptor (TypeInfo) of 'this' MaxDAT_Retransmissions object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MaxDAT_Retransmissions object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MaxDAT_Retransmissions
