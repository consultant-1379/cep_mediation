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
 * Define the ASN1 Type DTX_E_DCH_TTI_10ms from ASN1 Module InformationElements.
 * @see Sequence
 */

public class DTX_E_DCH_TTI_10ms extends Sequence {
    
    /**
     * The default constructor.
     */
    public DTX_E_DCH_TTI_10ms()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DTX_E_DCH_TTI_10ms(UE_DTX_Cycle1_10ms ue_dtx_Cycle1_10ms, 
		    UE_DTX_Cycle2_10ms ue_dtx_Cycle2_10ms, 
		    MAC_DTX_Cycle_10ms mac_dtx_Cycle_10ms)
    {
	setUe_dtx_Cycle1_10ms(ue_dtx_Cycle1_10ms);
	setUe_dtx_Cycle2_10ms(ue_dtx_Cycle2_10ms);
	setMac_dtx_Cycle_10ms(mac_dtx_Cycle_10ms);
    }
    
    public void initComponents()
    {
	mComponents[0] = UE_DTX_Cycle1_10ms.sub_frames_1;
	mComponents[1] = UE_DTX_Cycle2_10ms.sub_frames_5;
	mComponents[2] = MAC_DTX_Cycle_10ms.sub_frames_5;
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
		return UE_DTX_Cycle1_10ms.sub_frames_1;
	    case 1:
		return UE_DTX_Cycle2_10ms.sub_frames_5;
	    case 2:
		return MAC_DTX_Cycle_10ms.sub_frames_5;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "ue_dtx_Cycle1_10ms"
    public UE_DTX_Cycle1_10ms getUe_dtx_Cycle1_10ms()
    {
	return (UE_DTX_Cycle1_10ms)mComponents[0];
    }
    
    public void setUe_dtx_Cycle1_10ms(UE_DTX_Cycle1_10ms ue_dtx_Cycle1_10ms)
    {
	mComponents[0] = ue_dtx_Cycle1_10ms;
    }
    
    
    // Methods for field "ue_dtx_Cycle2_10ms"
    public UE_DTX_Cycle2_10ms getUe_dtx_Cycle2_10ms()
    {
	return (UE_DTX_Cycle2_10ms)mComponents[1];
    }
    
    public void setUe_dtx_Cycle2_10ms(UE_DTX_Cycle2_10ms ue_dtx_Cycle2_10ms)
    {
	mComponents[1] = ue_dtx_Cycle2_10ms;
    }
    
    
    // Methods for field "mac_dtx_Cycle_10ms"
    public MAC_DTX_Cycle_10ms getMac_dtx_Cycle_10ms()
    {
	return (MAC_DTX_Cycle_10ms)mComponents[2];
    }
    
    public void setMac_dtx_Cycle_10ms(MAC_DTX_Cycle_10ms mac_dtx_Cycle_10ms)
    {
	mComponents[2] = mac_dtx_Cycle_10ms;
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
	    "DTX_E_DCH_TTI_10ms"
	),
	new QName (
	    "InformationElements",
	    "DTX-E-DCH-TTI-10ms"
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
				"UE_DTX_Cycle1_10ms"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-Cycle1-10ms"
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
					"sub-frames-5",
					1
				    ),
				    new MemberListElement (
					"sub-frames-10",
					2
				    ),
				    new MemberListElement (
					"sub-frames-20",
					3
				    )
				}
			    ),
			    0,
			    UE_DTX_Cycle1_10ms.sub_frames_1
			)
		    ),
		    "ue-dtx-Cycle1-10ms",
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
				"UE_DTX_Cycle2_10ms"
			    ),
			    new QName (
				"InformationElements",
				"UE-DTX-Cycle2-10ms"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-5",
					0
				    ),
				    new MemberListElement (
					"sub-frames-10",
					1
				    ),
				    new MemberListElement (
					"sub-frames-20",
					2
				    ),
				    new MemberListElement (
					"sub-frames-40",
					3
				    ),
				    new MemberListElement (
					"sub-frames-80",
					4
				    ),
				    new MemberListElement (
					"sub-frames-160",
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
			    UE_DTX_Cycle2_10ms.sub_frames_5
			)
		    ),
		    "ue-dtx-Cycle2-10ms",
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
				"MAC_DTX_Cycle_10ms"
			    ),
			    new QName (
				"InformationElements",
				"MAC-DTX-Cycle-10ms"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"sub-frames-5",
					0
				    ),
				    new MemberListElement (
					"sub-frames-10",
					1
				    ),
				    new MemberListElement (
					"sub-frames-20",
					2
				    ),
				    new MemberListElement (
					"spare1",
					3
				    )
				}
			    ),
			    0,
			    MAC_DTX_Cycle_10ms.sub_frames_5
			)
		    ),
		    "mac-dtx-Cycle-10ms",
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
     * Get the type descriptor (TypeInfo) of 'this' DTX_E_DCH_TTI_10ms object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DTX_E_DCH_TTI_10ms object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DTX_E_DCH_TTI_10ms
