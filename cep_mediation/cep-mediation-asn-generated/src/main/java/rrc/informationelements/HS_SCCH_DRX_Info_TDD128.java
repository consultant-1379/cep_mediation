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
 * Define the ASN1 Type HS_SCCH_DRX_Info_TDD128 from ASN1 Module InformationElements.
 * @see Sequence
 */

public class HS_SCCH_DRX_Info_TDD128 extends Sequence {
    
    /**
     * The default constructor.
     */
    public HS_SCCH_DRX_Info_TDD128()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HS_SCCH_DRX_Info_TDD128(ControlChannelDRXCycle_TDD128 hS_SCCH_DRX_Cycle, 
		    HS_SCCH_DRX_InactivityThreshold_TDD128 hS_SCCH_DRX_InactivityThreshold, 
		    INTEGER hS_SCCH_DRX_Offset)
    {
	setHS_SCCH_DRX_Cycle(hS_SCCH_DRX_Cycle);
	setHS_SCCH_DRX_InactivityThreshold(hS_SCCH_DRX_InactivityThreshold);
	setHS_SCCH_DRX_Offset(hS_SCCH_DRX_Offset);
    }
    
    /**
     * Construct with components.
     */
    public HS_SCCH_DRX_Info_TDD128(ControlChannelDRXCycle_TDD128 hS_SCCH_DRX_Cycle, 
		    HS_SCCH_DRX_InactivityThreshold_TDD128 hS_SCCH_DRX_InactivityThreshold, 
		    long hS_SCCH_DRX_Offset)
    {
	this(hS_SCCH_DRX_Cycle, hS_SCCH_DRX_InactivityThreshold, 
	     new INTEGER(hS_SCCH_DRX_Offset));
    }
    
    /**
     * Construct with required components.
     */
    public HS_SCCH_DRX_Info_TDD128(ControlChannelDRXCycle_TDD128 hS_SCCH_DRX_Cycle, 
		    long hS_SCCH_DRX_Offset)
    {
	setHS_SCCH_DRX_Cycle(hS_SCCH_DRX_Cycle);
	setHS_SCCH_DRX_Offset(hS_SCCH_DRX_Offset);
    }
    
    public void initComponents()
    {
	mComponents[0] = ControlChannelDRXCycle_TDD128.sub_frames_1;
	mComponents[1] = HS_SCCH_DRX_InactivityThreshold_TDD128.sub_frames_1;
	mComponents[2] = new INTEGER();
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
		return ControlChannelDRXCycle_TDD128.sub_frames_1;
	    case 1:
		return HS_SCCH_DRX_InactivityThreshold_TDD128.sub_frames_1;
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "hS_SCCH_DRX_Cycle"
    public ControlChannelDRXCycle_TDD128 getHS_SCCH_DRX_Cycle()
    {
	return (ControlChannelDRXCycle_TDD128)mComponents[0];
    }
    
    public void setHS_SCCH_DRX_Cycle(ControlChannelDRXCycle_TDD128 hS_SCCH_DRX_Cycle)
    {
	mComponents[0] = hS_SCCH_DRX_Cycle;
    }
    
    
    // Methods for field "hS_SCCH_DRX_InactivityThreshold"
    public HS_SCCH_DRX_InactivityThreshold_TDD128 getHS_SCCH_DRX_InactivityThreshold()
    {
	return (HS_SCCH_DRX_InactivityThreshold_TDD128)mComponents[1];
    }
    
    public void setHS_SCCH_DRX_InactivityThreshold(HS_SCCH_DRX_InactivityThreshold_TDD128 hS_SCCH_DRX_InactivityThreshold)
    {
	mComponents[1] = hS_SCCH_DRX_InactivityThreshold;
    }
    
    public boolean hasHS_SCCH_DRX_InactivityThreshold()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHS_SCCH_DRX_InactivityThreshold()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "hS_SCCH_DRX_Offset"
    public long getHS_SCCH_DRX_Offset()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setHS_SCCH_DRX_Offset(long hS_SCCH_DRX_Offset)
    {
	setHS_SCCH_DRX_Offset(new INTEGER(hS_SCCH_DRX_Offset));
    }
    
    public void setHS_SCCH_DRX_Offset(INTEGER hS_SCCH_DRX_Offset)
    {
	mComponents[2] = hS_SCCH_DRX_Offset;
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
	    "HS_SCCH_DRX_Info_TDD128"
	),
	new QName (
	    "InformationElements",
	    "HS-SCCH-DRX-Info-TDD128"
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
				"ControlChannelDRXCycle_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"ControlChannelDRXCycle-TDD128"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-2",
					1
				    ),
				    new MemberListElement (
					"sub-frames-4",
					2
				    ),
				    new MemberListElement (
					"sub-frames-8",
					3
				    ),
				    new MemberListElement (
					"sub-frames-16",
					4
				    ),
				    new MemberListElement (
					"sub-frames-32",
					5
				    ),
				    new MemberListElement (
					"sub-frames-64",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    ControlChannelDRXCycle_TDD128.sub_frames_1
			)
		    ),
		    "hS-SCCH-DRX-Cycle",
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
				"HS_SCCH_DRX_InactivityThreshold_TDD128"
			    ),
			    new QName (
				"InformationElements",
				"HS-SCCH-DRX-InactivityThreshold-TDD128"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-1",
					0
				    ),
				    new MemberListElement (
					"sub-frames-2",
					1
				    ),
				    new MemberListElement (
					"sub-frames-4",
					2
				    ),
				    new MemberListElement (
					"sub-frames-8",
					3
				    ),
				    new MemberListElement (
					"sub-frames-16",
					4
				    ),
				    new MemberListElement (
					"sub-frames-32",
					5
				    ),
				    new MemberListElement (
					"sub-frames-64",
					6
				    ),
				    new MemberListElement (
					"sub-frames-128",
					7
				    ),
				    new MemberListElement (
					"sub-frames-256",
					8
				    ),
				    new MemberListElement (
					"sub-frames-512",
					9
				    ),
				    new MemberListElement (
					"spare6",
					10
				    ),
				    new MemberListElement (
					"spare5",
					11
				    ),
				    new MemberListElement (
					"spare4",
					12
				    ),
				    new MemberListElement (
					"spare3",
					13
				    ),
				    new MemberListElement (
					"spare2",
					14
				    ),
				    new MemberListElement (
					"infinity",
					15
				    )
				}
			    ),
			    0,
			    HS_SCCH_DRX_InactivityThreshold_TDD128.sub_frames_1
			)
		    ),
		    "hS-SCCH-DRX-InactivityThreshold",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "hS-SCCH-DRX-Offset",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' HS_SCCH_DRX_Info_TDD128 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HS_SCCH_DRX_Info_TDD128 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HS_SCCH_DRX_Info_TDD128
