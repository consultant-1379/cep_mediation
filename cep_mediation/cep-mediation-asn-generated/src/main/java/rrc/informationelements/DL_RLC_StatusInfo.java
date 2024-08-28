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
 * Define the ASN1 Type DL_RLC_StatusInfo from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DL_RLC_StatusInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public DL_RLC_StatusInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DL_RLC_StatusInfo(TimerStatusProhibit timerStatusProhibit, 
		    TimerEPC dummy, BOOLEAN missingPDU_Indicator, 
		    TimerStatusPeriodic timerStatusPeriodic)
    {
	setTimerStatusProhibit(timerStatusProhibit);
	setDummy(dummy);
	setMissingPDU_Indicator(missingPDU_Indicator);
	setTimerStatusPeriodic(timerStatusPeriodic);
    }
    
    /**
     * Construct with components.
     */
    public DL_RLC_StatusInfo(TimerStatusProhibit timerStatusProhibit, 
		    TimerEPC dummy, boolean missingPDU_Indicator, 
		    TimerStatusPeriodic timerStatusPeriodic)
    {
	this(timerStatusProhibit, dummy, new BOOLEAN(missingPDU_Indicator), 
	     timerStatusPeriodic);
    }
    
    /**
     * Construct with required components.
     */
    public DL_RLC_StatusInfo(boolean missingPDU_Indicator)
    {
	setMissingPDU_Indicator(missingPDU_Indicator);
    }
    
    public void initComponents()
    {
	mComponents[0] = TimerStatusProhibit.tsp10;
	mComponents[1] = TimerEPC.te50;
	mComponents[2] = new BOOLEAN();
	mComponents[3] = TimerStatusPeriodic.tsp100;
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
		return TimerStatusProhibit.tsp10;
	    case 1:
		return TimerEPC.te50;
	    case 2:
		return new BOOLEAN();
	    case 3:
		return TimerStatusPeriodic.tsp100;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timerStatusProhibit"
    public TimerStatusProhibit getTimerStatusProhibit()
    {
	return (TimerStatusProhibit)mComponents[0];
    }
    
    public void setTimerStatusProhibit(TimerStatusProhibit timerStatusProhibit)
    {
	mComponents[0] = timerStatusProhibit;
    }
    
    public boolean hasTimerStatusProhibit()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimerStatusProhibit()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dummy"
    public TimerEPC getDummy()
    {
	return (TimerEPC)mComponents[1];
    }
    
    public void setDummy(TimerEPC dummy)
    {
	mComponents[1] = dummy;
    }
    
    public boolean hasDummy()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDummy()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "missingPDU_Indicator"
    public boolean getMissingPDU_Indicator()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setMissingPDU_Indicator(boolean missingPDU_Indicator)
    {
	setMissingPDU_Indicator(new BOOLEAN(missingPDU_Indicator));
    }
    
    public void setMissingPDU_Indicator(BOOLEAN missingPDU_Indicator)
    {
	mComponents[2] = missingPDU_Indicator;
    }
    
    
    // Methods for field "timerStatusPeriodic"
    public TimerStatusPeriodic getTimerStatusPeriodic()
    {
	return (TimerStatusPeriodic)mComponents[3];
    }
    
    public void setTimerStatusPeriodic(TimerStatusPeriodic timerStatusPeriodic)
    {
	mComponents[3] = timerStatusPeriodic;
    }
    
    public boolean hasTimerStatusPeriodic()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTimerStatusPeriodic()
    {
	setComponentAbsent(3);
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
	    "DL_RLC_StatusInfo"
	),
	new QName (
	    "InformationElements",
	    "DL-RLC-StatusInfo"
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
				"TimerStatusProhibit"
			    ),
			    new QName (
				"InformationElements",
				"TimerStatusProhibit"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tsp10",
					0
				    ),
				    new MemberListElement (
					"tsp20",
					1
				    ),
				    new MemberListElement (
					"tsp30",
					2
				    ),
				    new MemberListElement (
					"tsp40",
					3
				    ),
				    new MemberListElement (
					"tsp50",
					4
				    ),
				    new MemberListElement (
					"tsp60",
					5
				    ),
				    new MemberListElement (
					"tsp70",
					6
				    ),
				    new MemberListElement (
					"tsp80",
					7
				    ),
				    new MemberListElement (
					"tsp90",
					8
				    ),
				    new MemberListElement (
					"tsp100",
					9
				    ),
				    new MemberListElement (
					"tsp110",
					10
				    ),
				    new MemberListElement (
					"tsp120",
					11
				    ),
				    new MemberListElement (
					"tsp130",
					12
				    ),
				    new MemberListElement (
					"tsp140",
					13
				    ),
				    new MemberListElement (
					"tsp150",
					14
				    ),
				    new MemberListElement (
					"tsp160",
					15
				    ),
				    new MemberListElement (
					"tsp170",
					16
				    ),
				    new MemberListElement (
					"tsp180",
					17
				    ),
				    new MemberListElement (
					"tsp190",
					18
				    ),
				    new MemberListElement (
					"tsp200",
					19
				    ),
				    new MemberListElement (
					"tsp210",
					20
				    ),
				    new MemberListElement (
					"tsp220",
					21
				    ),
				    new MemberListElement (
					"tsp230",
					22
				    ),
				    new MemberListElement (
					"tsp240",
					23
				    ),
				    new MemberListElement (
					"tsp250",
					24
				    ),
				    new MemberListElement (
					"tsp260",
					25
				    ),
				    new MemberListElement (
					"tsp270",
					26
				    ),
				    new MemberListElement (
					"tsp280",
					27
				    ),
				    new MemberListElement (
					"tsp290",
					28
				    ),
				    new MemberListElement (
					"tsp300",
					29
				    ),
				    new MemberListElement (
					"tsp310",
					30
				    ),
				    new MemberListElement (
					"tsp320",
					31
				    ),
				    new MemberListElement (
					"tsp330",
					32
				    ),
				    new MemberListElement (
					"tsp340",
					33
				    ),
				    new MemberListElement (
					"tsp350",
					34
				    ),
				    new MemberListElement (
					"tsp360",
					35
				    ),
				    new MemberListElement (
					"tsp370",
					36
				    ),
				    new MemberListElement (
					"tsp380",
					37
				    ),
				    new MemberListElement (
					"tsp390",
					38
				    ),
				    new MemberListElement (
					"tsp400",
					39
				    ),
				    new MemberListElement (
					"tsp410",
					40
				    ),
				    new MemberListElement (
					"tsp420",
					41
				    ),
				    new MemberListElement (
					"tsp430",
					42
				    ),
				    new MemberListElement (
					"tsp440",
					43
				    ),
				    new MemberListElement (
					"tsp450",
					44
				    ),
				    new MemberListElement (
					"tsp460",
					45
				    ),
				    new MemberListElement (
					"tsp470",
					46
				    ),
				    new MemberListElement (
					"tsp480",
					47
				    ),
				    new MemberListElement (
					"tsp490",
					48
				    ),
				    new MemberListElement (
					"tsp500",
					49
				    ),
				    new MemberListElement (
					"tsp510",
					50
				    ),
				    new MemberListElement (
					"tsp520",
					51
				    ),
				    new MemberListElement (
					"tsp530",
					52
				    ),
				    new MemberListElement (
					"tsp540",
					53
				    ),
				    new MemberListElement (
					"tsp550",
					54
				    ),
				    new MemberListElement (
					"tsp600",
					55
				    ),
				    new MemberListElement (
					"tsp650",
					56
				    ),
				    new MemberListElement (
					"tsp700",
					57
				    ),
				    new MemberListElement (
					"tsp750",
					58
				    ),
				    new MemberListElement (
					"tsp800",
					59
				    ),
				    new MemberListElement (
					"tsp850",
					60
				    ),
				    new MemberListElement (
					"tsp900",
					61
				    ),
				    new MemberListElement (
					"tsp950",
					62
				    ),
				    new MemberListElement (
					"tsp1000",
					63
				    )
				}
			    ),
			    0,
			    TimerStatusProhibit.tsp10
			)
		    ),
		    "timerStatusProhibit",
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
				"TimerEPC"
			    ),
			    new QName (
				"InformationElements",
				"TimerEPC"
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
			    TimerEPC.te50
			)
		    ),
		    "dummy",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "missingPDU-Indicator",
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
				"TimerStatusPeriodic"
			    ),
			    new QName (
				"InformationElements",
				"TimerStatusPeriodic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"tsp100",
					0
				    ),
				    new MemberListElement (
					"tsp200",
					1
				    ),
				    new MemberListElement (
					"tsp300",
					2
				    ),
				    new MemberListElement (
					"tsp400",
					3
				    ),
				    new MemberListElement (
					"tsp500",
					4
				    ),
				    new MemberListElement (
					"tsp750",
					5
				    ),
				    new MemberListElement (
					"tsp1000",
					6
				    ),
				    new MemberListElement (
					"tsp2000",
					7
				    )
				}
			    ),
			    0,
			    TimerStatusPeriodic.tsp100
			)
		    ),
		    "timerStatusPeriodic",
		    3,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DL_RLC_StatusInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DL_RLC_StatusInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DL_RLC_StatusInfo
