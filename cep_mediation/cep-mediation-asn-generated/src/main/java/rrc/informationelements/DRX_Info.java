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
 * Define the ASN1 Type DRX_Info from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DRX_Info extends Sequence {
    
    /**
     * The default constructor.
     */
    public DRX_Info()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DRX_Info(UE_DRX_Cycle ue_drx_Cycle, 
		    UE_DRX_Cycle_InactivityThreshold ue_drx_Cycle_InactivityThreshold, 
		    UE_GrantMonitoring_InactivityThreshold ue_GrantMonitoring_InactivityThreshold, 
		    BOOLEAN ue_drx_GrantMonitoring)
    {
	setUe_drx_Cycle(ue_drx_Cycle);
	setUe_drx_Cycle_InactivityThreshold(ue_drx_Cycle_InactivityThreshold);
	setUe_GrantMonitoring_InactivityThreshold(ue_GrantMonitoring_InactivityThreshold);
	setUe_drx_GrantMonitoring(ue_drx_GrantMonitoring);
    }
    
    /**
     * Construct with components.
     */
    public DRX_Info(UE_DRX_Cycle ue_drx_Cycle, 
		    UE_DRX_Cycle_InactivityThreshold ue_drx_Cycle_InactivityThreshold, 
		    UE_GrantMonitoring_InactivityThreshold ue_GrantMonitoring_InactivityThreshold, 
		    boolean ue_drx_GrantMonitoring)
    {
	this(ue_drx_Cycle, ue_drx_Cycle_InactivityThreshold, 
	     ue_GrantMonitoring_InactivityThreshold, 
	     new BOOLEAN(ue_drx_GrantMonitoring));
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_DRX_Cycle.sub_frames_4;
	mComponents[1] = UE_DRX_Cycle_InactivityThreshold.sub_frames_0;
	mComponents[2] = UE_GrantMonitoring_InactivityThreshold.e_dch_tti_0;
	mComponents[3] = new BOOLEAN();
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
		return UE_DRX_Cycle.sub_frames_4;
	    case 1:
		return UE_DRX_Cycle_InactivityThreshold.sub_frames_0;
	    case 2:
		return UE_GrantMonitoring_InactivityThreshold.e_dch_tti_0;
	    case 3:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_drx_Cycle"
    public UE_DRX_Cycle getUe_drx_Cycle()
    {
	return (UE_DRX_Cycle)mComponents[0];
    }
    
    public void setUe_drx_Cycle(UE_DRX_Cycle ue_drx_Cycle)
    {
	mComponents[0] = ue_drx_Cycle;
    }
    
    
    // Methods for field "ue_drx_Cycle_InactivityThreshold"
    public UE_DRX_Cycle_InactivityThreshold getUe_drx_Cycle_InactivityThreshold()
    {
	return (UE_DRX_Cycle_InactivityThreshold)mComponents[1];
    }
    
    public void setUe_drx_Cycle_InactivityThreshold(UE_DRX_Cycle_InactivityThreshold ue_drx_Cycle_InactivityThreshold)
    {
	mComponents[1] = ue_drx_Cycle_InactivityThreshold;
    }
    
    
    // Methods for field "ue_GrantMonitoring_InactivityThreshold"
    public UE_GrantMonitoring_InactivityThreshold getUe_GrantMonitoring_InactivityThreshold()
    {
	return (UE_GrantMonitoring_InactivityThreshold)mComponents[2];
    }
    
    public void setUe_GrantMonitoring_InactivityThreshold(UE_GrantMonitoring_InactivityThreshold ue_GrantMonitoring_InactivityThreshold)
    {
	mComponents[2] = ue_GrantMonitoring_InactivityThreshold;
    }
    
    
    // Methods for field "ue_drx_GrantMonitoring"
    public boolean getUe_drx_GrantMonitoring()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setUe_drx_GrantMonitoring(boolean ue_drx_GrantMonitoring)
    {
	setUe_drx_GrantMonitoring(new BOOLEAN(ue_drx_GrantMonitoring));
    }
    
    public void setUe_drx_GrantMonitoring(BOOLEAN ue_drx_GrantMonitoring)
    {
	mComponents[3] = ue_drx_GrantMonitoring;
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
	    "DRX_Info"
	),
	new QName (
	    "InformationElements",
	    "DRX-Info"
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
				"UE_DRX_Cycle"
			    ),
			    new QName (
				"InformationElements",
				"UE-DRX-Cycle"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-4",
					0
				    ),
				    new MemberListElement (
					"sub-frames-5",
					1
				    ),
				    new MemberListElement (
					"sub-frames-8",
					2
				    ),
				    new MemberListElement (
					"sub-frames-10",
					3
				    ),
				    new MemberListElement (
					"sub-frames-16",
					4
				    ),
				    new MemberListElement (
					"sub-frames-20",
					5
				    ),
				    new MemberListElement (
					"spare2",
					6
				    ),
				    new MemberListElement (
					"spare1",
					7
				    )
				}
			    ),
			    0,
			    UE_DRX_Cycle.sub_frames_4
			)
		    ),
		    "ue-drx-Cycle",
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
				"UE_DRX_Cycle_InactivityThreshold"
			    ),
			    new QName (
				"InformationElements",
				"UE-DRX-Cycle-InactivityThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-0",
					0
				    ),
				    new MemberListElement (
					"sub-frames-1",
					1
				    ),
				    new MemberListElement (
					"sub-frames-2",
					2
				    ),
				    new MemberListElement (
					"sub-frames-4",
					3
				    ),
				    new MemberListElement (
					"sub-frames-8",
					4
				    ),
				    new MemberListElement (
					"sub-frames-16",
					5
				    ),
				    new MemberListElement (
					"sub-frames-32",
					6
				    ),
				    new MemberListElement (
					"sub-frames-64",
					7
				    ),
				    new MemberListElement (
					"sub-frames-128",
					8
				    ),
				    new MemberListElement (
					"sub-frames-256",
					9
				    ),
				    new MemberListElement (
					"sub-frames-512",
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
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UE_DRX_Cycle_InactivityThreshold.sub_frames_0
			)
		    ),
		    "ue-drx-Cycle-InactivityThreshold",
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
				"UE_GrantMonitoring_InactivityThreshold"
			    ),
			    new QName (
				"InformationElements",
				"UE-GrantMonitoring-InactivityThreshold"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"e-dch-tti-0",
					0
				    ),
				    new MemberListElement (
					"e-dch-tti-1",
					1
				    ),
				    new MemberListElement (
					"e-dch-tti-2",
					2
				    ),
				    new MemberListElement (
					"e-dch-tti-4",
					3
				    ),
				    new MemberListElement (
					"e-dch-tti-8",
					4
				    ),
				    new MemberListElement (
					"e-dch-tti-16",
					5
				    ),
				    new MemberListElement (
					"e-dch-tti-32",
					6
				    ),
				    new MemberListElement (
					"e-dch-tti-64",
					7
				    ),
				    new MemberListElement (
					"e-dch-tti-128",
					8
				    ),
				    new MemberListElement (
					"e-dch-tti-256",
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
					"spare1",
					15
				    )
				}
			    ),
			    0,
			    UE_GrantMonitoring_InactivityThreshold.e_dch_tti_0
			)
		    ),
		    "ue-GrantMonitoring-InactivityThreshold",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "ue-drx-GrantMonitoring",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' DRX_Info object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DRX_Info object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DRX_Info
