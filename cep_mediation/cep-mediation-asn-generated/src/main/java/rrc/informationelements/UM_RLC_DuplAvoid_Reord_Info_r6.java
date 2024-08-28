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
 * Define the ASN1 Type UM_RLC_DuplAvoid_Reord_Info_r6 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class UM_RLC_DuplAvoid_Reord_Info_r6 extends Sequence {
    
    /**
     * The default constructor.
     */
    public UM_RLC_DuplAvoid_Reord_Info_r6()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UM_RLC_DuplAvoid_Reord_Info_r6(TimerDAR_r6 timer_DAR, 
		    WindowSizeDAR_r6 widowSize_DAR)
    {
	setTimer_DAR(timer_DAR);
	setWidowSize_DAR(widowSize_DAR);
    }
    
    public void initComponents()
    {
	mComponents[0] = TimerDAR_r6.ms40;
	mComponents[1] = WindowSizeDAR_r6.ws4;
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
		return TimerDAR_r6.ms40;
	    case 1:
		return WindowSizeDAR_r6.ws4;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timer_DAR"
    public TimerDAR_r6 getTimer_DAR()
    {
	return (TimerDAR_r6)mComponents[0];
    }
    
    public void setTimer_DAR(TimerDAR_r6 timer_DAR)
    {
	mComponents[0] = timer_DAR;
    }
    
    
    // Methods for field "widowSize_DAR"
    public WindowSizeDAR_r6 getWidowSize_DAR()
    {
	return (WindowSizeDAR_r6)mComponents[1];
    }
    
    public void setWidowSize_DAR(WindowSizeDAR_r6 widowSize_DAR)
    {
	mComponents[1] = widowSize_DAR;
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
	    "UM_RLC_DuplAvoid_Reord_Info_r6"
	),
	new QName (
	    "InformationElements",
	    "UM-RLC-DuplAvoid-Reord-Info-r6"
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
				"TimerDAR_r6"
			    ),
			    new QName (
				"InformationElements",
				"TimerDAR-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ms40",
					0
				    ),
				    new MemberListElement (
					"ms80",
					1
				    ),
				    new MemberListElement (
					"ms120",
					2
				    ),
				    new MemberListElement (
					"ms160",
					3
				    ),
				    new MemberListElement (
					"ms240",
					4
				    ),
				    new MemberListElement (
					"ms320",
					5
				    ),
				    new MemberListElement (
					"ms480",
					6
				    ),
				    new MemberListElement (
					"ms640",
					7
				    ),
				    new MemberListElement (
					"ms960",
					8
				    ),
				    new MemberListElement (
					"ms1280",
					9
				    ),
				    new MemberListElement (
					"ms1920",
					10
				    ),
				    new MemberListElement (
					"ms2560",
					11
				    ),
				    new MemberListElement (
					"ms3840",
					12
				    ),
				    new MemberListElement (
					"ms5120",
					13
				    )
				}
			    ),
			    0,
			    TimerDAR_r6.ms40
			)
		    ),
		    "timer-DAR",
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
				"WindowSizeDAR_r6"
			    ),
			    new QName (
				"InformationElements",
				"WindowSizeDAR-r6"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ws4",
					0
				    ),
				    new MemberListElement (
					"ws8",
					1
				    ),
				    new MemberListElement (
					"ws16",
					2
				    ),
				    new MemberListElement (
					"ws32",
					3
				    ),
				    new MemberListElement (
					"ws40",
					4
				    ),
				    new MemberListElement (
					"ws48",
					5
				    ),
				    new MemberListElement (
					"ws56",
					6
				    ),
				    new MemberListElement (
					"ws64",
					7
				    )
				}
			    ),
			    0,
			    WindowSizeDAR_r6.ws4
			)
		    ),
		    "widowSize-DAR",
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
     * Get the type descriptor (TypeInfo) of 'this' UM_RLC_DuplAvoid_Reord_Info_r6 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UM_RLC_DuplAvoid_Reord_Info_r6 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UM_RLC_DuplAvoid_Reord_Info_r6
